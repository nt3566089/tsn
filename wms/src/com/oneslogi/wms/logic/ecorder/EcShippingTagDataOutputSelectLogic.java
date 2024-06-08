package com.oneslogi.wms.logic.ecorder;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TEcOrderRCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exbhv.TEcOrderRBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EC送り状データ取得ロジッククラス
 */
public class EcShippingTagDataOutputSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;
	@Inject
	private TEcOrderRBhv tEcOrderRBhv;
	@Inject
	private MImportTypeBhv importTypeBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// ===== 使用ロジック =====

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(CenterClassLogicを削除) 2018.07.23 kawana Delete

	/**
	 * <h2>EC受注データを取得する。</h2>
	 * <pre>
	 * 引数の値を条件にデータベースからEC受注データを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 * データが存在する場合、欠品フラグ名称と送り状用送付先住所情報を取得して戻り値に設定する。
	 * </pre>
	 * @param ecOrderH EC受注ヘッダ：センタID・荷主ID・日付区分・日付(From)・日付(To)・受注番号・取込種別ID・欠品フラグ
	 * @param ecOrderR EC受注帳票：送り状データ作成フラグ
	 * @param shippingInstH 出荷指示ヘッダ：出荷ステータス・配送コースCD
	 * @param carrier 運送業者マスタ：送り状データ種別
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TEcOrderH> EC受注ヘッダリスト
	 */
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
//	public List<TEcOrderH> select(TEcOrderH ecOrderH, TEcOrderR ecOrderR, TShippingInstH shippingInstH, MCarrier carrier, ErrorStatus errSts) {
	public List<TEcOrderH> select(TEcOrderH ecOrderH, TEcOrderR ecOrderR, TShippingInstH shippingInstH, MDeliveryCourse deliveryCourse, ErrorStatus errSts) {
	// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End

		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
		// テーブル結合
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_MImportType();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByPriorityFlg().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByGiftFlg().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByImportFlg().withVDict(getCultureId());
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TEcOrderRAsOne().withBClassDtlByInvoiceCreateFlg().withVDict(getCultureId());
		cb.setupSelect_TShippingInstH().withBClassDtlByShippingStatus().withVDict(getCultureId());
		cb.setupSelect_TShippingInstH().withBClassDtlByDelivTz().withVDict(getCultureId());
		// [品質検査対応][Ver3.1][#5585]欠品フラグ名称取得漏れ修正 2018.11.07 matsumoto Start
		cb.setupSelect_TShippingInstH().withBClassDtlByStockOutFlg().withVDict(getCultureId());
		// [品質検査対応][Ver3.1][#5585]欠品フラグ名称取得漏れ修正 2018.11.07 matsumoto End
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse();
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
		cb.setupSelect_TShippingInstH().withMDeliveryCourse().withMCenterClassDtlByTagDataType(getCenterClassCondition()).withVDict(getCultureId());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(MAXでの欠品フラグ取得を削除) 2018.07.23 kawana Delete
		cb.specify().specifyTShippingInstH().derivedTShippingInstBList().max(new SubQuery<TShippingInstBCB>() {
			@Override
			public void query(TShippingInstBCB maxCb) {
				maxCb.specify().specifyMProduct().columnShippingStopFlg();
			}
		}, TEcOrderH.ALIAS_productShippingStopFlg);
		cb.specify().specifyMImportType().derivedMImportTypeBList().max(new SubQuery<MImportTypeBCB>() {

			@Override
			public void query(MImportTypeBCB maxCb) {
				maxCb.specify().specifyMEdiColumn().specifyMEdi().columnEdiNm();

			}
		}, TEcOrderH.ALIAS_allocNgFlg);
		// 検索条件
		cb.query().setCenterId_Equal(ecOrderH.getCenterId());
		cb.query().setClientId_Equal(ecOrderH.getClientId());

		// 日付条件
		String dtCls = ecOrderH.getDtCls();
		String dtFrom = ecOrderH.getDtFrom();
		String dtTo = ecOrderH.getDtTo();
		if (!CU.isNullOrEmpty(dtCls)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			switch (CDef.DtCls.codeOf(ecOrderH.getDtCls())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			case $0: // 取込日
				cb.query().setImportDt_GreaterEqual(dtFrom);
				cb.query().setImportDt_LessEqual(dtTo);
				break;
			case $1: // 出荷日
				cb.query().queryTShippingInstH().setShippingDt_GreaterEqual(dtFrom);
				cb.query().queryTShippingInstH().setShippingDt_LessEqual(dtTo);
				break;
			case $2: // 作業日
				cb.query().queryTShippingInstH().setWorkDt_GreaterEqual(dtFrom);
				cb.query().queryTShippingInstH().setWorkDt_LessEqual(dtTo);
				break;
			}
		}

		cb.query().setOrderNo_PrefixSearch(ecOrderH.getOrderNo());
		cb.query().queryTShippingInstH().setShippingStatus_Equal(shippingInstH.getShippingStatus());
		cb.query().queryMImportType().setImportTypeId_Equal(ecOrderH.getImportTypeId());
		cb.query().queryTShippingInstH().setDeliveryCourseCd_PrefixSearch(shippingInstH.getDeliveryCourseCd());
		cb.query().queryTEcOrderRAsOne().setInvoiceCreateFlg_Equal(ecOrderR.getInvoiceCreateFlg());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  Start
		cb.query().queryTShippingInstH().queryMDeliveryCourse().setTagDataType_Equal(deliveryCourse.getTagDataType());
		// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/29  End
		// ON推-UT210N-006 送り状データ種別が設定されているデータのみ表示すべき。 BY SJA 2016/09/12  Start
		cb.query().queryTShippingInstH().queryMDeliveryCourse().setTagDataType_IsNotNull();
		// ON推-UT210N-006 送り状データ種別が設定されているデータのみ表示すべき。 BY SJA 2016/09/12  End
		// 送り状定義が設定されているデータのみ検索
		cb.orScopeQuery(new OrQuery<TEcOrderHCB>() {
			@Override
			public void query(TEcOrderHCB orCb) {
				orCb.query().queryTShippingInstH().queryMDeliveryCourse().setCarrierSlipYmtId_IsNotNull();
				orCb.query().queryTShippingInstH().queryMDeliveryCourse().setCarrierSlipSgwId_IsNotNull();
				orCb.query().queryTShippingInstH().queryMDeliveryCourse().setCarrierSlipYupkId_IsNotNull();
			}
		});
		// 出庫指示済以降のステータスのみ検索
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		List<CDef.ShippingStatus> inStatusList = new ArrayList<CDef.ShippingStatus>();
		inStatusList.add(CDef.ShippingStatus.$25);
		inStatusList.add(CDef.ShippingStatus.$30);
		inStatusList.add(CDef.ShippingStatus.$35);
		inStatusList.add(CDef.ShippingStatus.$40);
		inStatusList.add(CDef.ShippingStatus.$45);
		inStatusList.add(CDef.ShippingStatus.$50);
		inStatusList.add(CDef.ShippingStatus.$55);
		cb.query().queryTShippingInstH().setShippingStatus_InScope_AsShippingStatus(inStatusList);
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
		// 欠品フラグ
		cb.query().queryTShippingInstH().setStockOutFlg_Equal(shippingInstH.getStockOutFlg());
		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

		// ソート条件
		cb.addOrderBy_PK_Asc();

		List<TEcOrderH> resultList = tEcOrderHBhv.selectList(cb);

		if (resultList.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultList;
		}

		List<MImportType> mImportTypeList = tEcOrderHBhv.pulloutMImportType(resultList);
		importTypeBhv.loadMImportTypeBList(mImportTypeList, new ConditionBeanSetupper<MImportTypeBCB>() {

			@Override
			public void setup(MImportTypeBCB subCb) {
				subCb.setupSelect_MEdiColumn().withMEdi();
				subCb.fetchFirst(1);
			}
		});

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(欠品フラグ名称の設定を削除) 2018.07.23 kawana Delete

		for (TEcOrderH h : resultList) {

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(欠品フラグ名称の設定を削除) 2018.07.23 kawana Delete

			// [C-CWMS-0024] EC送り状データ出力画面用の「住所変更」機能を追加 kyo 2015.04.07 Start
			String invoiceAdressAll = new StringBuilder().append(CU.nullToStr(h.getInvoiceDelivAddress1()))
										.append(CU.nullToStr(h.getInvoiceDelivAddress2())).append(CU.nullToStr(h.getInvoiceDelivAddress3())).toString();
			if(invoiceAdressAll.length() > 0) {
				h.setDelivAddress1(h.getInvoiceDelivAddress1());
				h.setDelivAddress2(h.getInvoiceDelivAddress2());
				h.setDelivAddress3(h.getInvoiceDelivAddress3());
			}
			// [C-CWMS-0024] EC送り状データ出力画面用の「住所変更」機能を追加 kyo 2015.04.07 End
		}

		return resultList;
	}

	/**
	 * <h2>EC受注帳票を更新する。</h2>
	 * <pre>
	 * 引数で受け取ったデータをEC受注帳票に更新する。
	 * </pre>
	 * @param updateData EC受注帳票(更新用)：全項目
	 * @param searchData EC受注帳票(検索用)：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void ecOrderRUpdate(TEcOrderR updateData, TEcOrderR searchData, ErrorStatus errSts) {

		// ===== EC受注帳票更新 =====
		// 更新条件作成
		TEcOrderRCB cb = tEcOrderRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(searchData.getControlNo());
		// ===== EC受注帳票の更新 =====
		tEcOrderRBhv.queryUpdate(updateData, cb);
	}

	/**
	 * <h2>EC受注帳票、EC受注ヘッダと出荷指示ヘッダを更新する。</h2>
	 * <pre>
	 * EC受注帳票の更新を行う。
	 * 出荷指示ヘッダのコントロールNoを更新する。
	 * EC受注ヘッダのコントロールNoを更新する。
	 * </pre>
	 * @param tEcOrderHList EC受注ヘッダリスト：受注番号・取込日・EC受注ヘッダID・バージョンNo.、
	 *                          出荷指示ヘッダ：出荷ステータス・出荷指示ヘッダID・バージョンNo.
	 * @param tEcOrderR EC受注帳票(更新用)：全項目
	 * @param clientId 荷主ID
 	 * @param centerId センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return long 出荷指示ヘッダの更新件数とEC受注ヘッダの更新件数合計
	 */
	public long updateControlNo(List<TEcOrderH> tEcOrderHList, TEcOrderR tEcOrderR, long clientId, long centerId ,ErrorStatus errSts) {
		long ctlNo = 0;
		List<TShippingInstH> shippingInstList = new ArrayList<TShippingInstH>();
		// [C-CWMS-0024] 住所変更機能の追加ため、処理を追加 2015.04.08 kyo Start
		List<TEcOrderH> ecOrderHList = new ArrayList<TEcOrderH>();
		// [C-CWMS-0024] 住所変更機能の追加ため、処理を追加 2015.04.08 kyo End
		// EC受注ヘッダリストのデータ件数分繰返
		for (final TEcOrderH body : tEcOrderHList) {
			// ===== EC受注帳票データ更新 =====

			// 更新条件作成
			TEcOrderRCB cb = tEcOrderRBhv.newMyConditionBean();
			cb.setupSelect_TEcOrderH();

			//検索条件
			cb.query().queryTEcOrderH().setClientId_Equal(clientId);
			cb.query().queryTEcOrderH().setCenterId_Equal(centerId);
			cb.query().queryTEcOrderH().setOrderNo_Equal(body.getOrderNo());
			cb.query().queryTEcOrderH().setImportDt_Equal(body.getImportDt());
			cb.query().queryTEcOrderH().queryTShippingInstH().setShippingStatus_Equal(body.chaseTShippingInstH().getShippingStatus());
			// ===== EC受注帳票の更新 =====
			tEcOrderRBhv.queryUpdate(tEcOrderR, cb);

			// 更新したデータを取得
			TEcOrderRCB returnCb = tEcOrderRBhv.newMyConditionBean();
			returnCb.setupSelect_TEcOrderH();
			returnCb.query().queryTEcOrderH().setClientId_Equal(clientId);
			returnCb.query().queryTEcOrderH().setCenterId_Equal(centerId);
			returnCb.query().queryTEcOrderH().setOrderNo_Equal(body.getOrderNo());
			returnCb.query().queryTEcOrderH().setImportDt_Equal(body.getImportDt());
			returnCb.query().queryTEcOrderH().queryTShippingInstH().setShippingStatus_Equal(body.chaseTShippingInstH().getShippingStatus());
			List<TEcOrderR> list = tEcOrderRBhv.selectList(returnCb);

			if (list.size() > 0) {
				ctlNo = list.get(0).getControlNo();
			}
			// EC受注ヘッダにコントロールNo設定
			body.setControlNo(ctlNo);
			// 出荷指示ヘッダにコントロールNo設定
			// [C-CWMS-0024] 住所変更機能の追加ため、修正 2015.04.08 kyo Start
			TShippingInstH instH = new TShippingInstH();
			instH.setShippingInstHId(body.chaseTShippingInstH().getShippingInstHId());
			instH.setVersionNo(body.chaseTShippingInstH().getVersionNo());
			if (!CU.isNullOrEmpty(body.chaseTShippingInstH().getShippingStatus())) {
				// [C-CWMS-0024] 住所変更機能の追加ため、修正 2015.04.08 kyo End
				instH.setControlNo(ctlNo);
				shippingInstList.add(instH);
			}
			// [C-CWMS-0024] 住所変更機能の追加ため、処理を追加 2015.04.08 kyo Start
			TEcOrderH ecOrderH = new TEcOrderH();
			ecOrderH.setEcOrderHId(body.getEcOrderHId());
			ecOrderH.setVersionNo(body.getVersionNo());
			ecOrderH.setControlNo(ctlNo);
			ecOrderHList.add(ecOrderH);
			// [C-CWMS-0024] 住所変更機能の追加ため、処理を追加 2015.04.08 kyo End
		}
		// 出荷指示ヘッダにコントロールNoを更新
		int[] instUpdateCount = tShippingInstHBhv.batchUpdate(shippingInstList);
		// [C-CWMS-0024] 住所変更機能の追加ため、修正 2015.04.08 kyo Start
		// EC受注ヘッダにコントロールNoを更新
		int[] orderUpdateCount = tEcOrderHBhv.batchUpdate(ecOrderHList);
		// [C-CWMS-0024] 住所変更機能の追加ため、修正 2015.04.08 kyo End
		int updateCount = orderUpdateCount.length + instUpdateCount.length;
		return updateCount;
	}

	/**
	 * <h2>コントロールNoをクリアする。</h2>
	 * <pre>
	 * EC受注ヘッダと出荷指示ヘッダのコントロールNoをクリアする。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return int 出荷指示ヘッダの更新件数とEC受注ヘッダの更新件数合計
	 */
	public int clearControlNo(long controlNo, ErrorStatus errSts) {

		// 出荷指示ヘッダのクリア
		TShippingInstHCB instCb = tShippingInstHBhv.newMyConditionBean();
		instCb.query().setControlNo_Equal(controlNo);
		TShippingInstH instSet = new TShippingInstH();
		instSet.setControlNo(null);

		int instUpdateCount = tShippingInstHBhv.queryUpdate(instSet, instCb);

		// EC受注ヘッダのクリア
		TEcOrderHCB orderCb = tEcOrderHBhv.newMyConditionBean();
		orderCb.query().setControlNo_Equal(controlNo);
		TEcOrderH orderSet = new TEcOrderH();
		orderSet.setControlNo(null);
		int orderUpdateCount = tEcOrderHBhv.queryUpdate(orderSet, orderCb);

		int updateCount = instUpdateCount + orderUpdateCount;

		return updateCount;
	}

}
