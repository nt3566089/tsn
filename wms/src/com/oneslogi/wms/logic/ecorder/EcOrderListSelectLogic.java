package com.oneslogi.wms.logic.ecorder;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.TEcOrderHCB;
import com.oneslogi.base.dbflute.cbean.TPickingBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.exbhv.TEcOrderHBhv;
import com.oneslogi.base.dbflute.exentity.BMessage;
import com.oneslogi.base.dbflute.exentity.TEcOrderH;
import com.oneslogi.base.dbflute.exentity.TEcOrderR;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * EC受注データ取得ロジッククラス
 */
public class EcOrderListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TEcOrderHBhv tEcOrderHBhv;

	// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動に伴い楽天RMS受注のテーブル結合を削除 2015.05.18 kawana

	// ===== 使用ロジック =====

	// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(CenterClassLogicを削除) 2018.07.23 kawana Delete

	@Inject
	private MessageLogic messageLogic;

	/**
	 * <h2>EC受注データを取得する。</h2>
	 * <pre>
	 * 引数の値を条件にデータベースからEC受注データを取得する。
	 * 検索対象が見つからない場合、０件エラーをエラー管理クラスに設定する。
	 * データ存在する場合、欠品フラグ名称を取得して戻り値に設定する。
	 * </pre>
	 * @param ecOrderH EC受注ヘッダ：センタID・荷主ID・日付区分・日付(From)・日付(To)・取込種別ID・優先フラグ・ギフトフラグ・コメントフラグ・受注番号
	 *                               のし・コメント１・コメント２・名寄せID・名寄せフラグ・欠品フラグ・キャンセル表示
	 * @param ecOrderR EC受注帳票：納品書出力フラグ・送り状データ作成フラグ
	 * @param shippingInstH 出荷指示ヘッダ：出荷ステータス・配送コースCD・エラーフラグ・出庫作業No
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TEcOrderH> EC受注ヘッダリスト
	 */
	public List<TEcOrderH> select(TEcOrderH ecOrderH, TEcOrderR ecOrderR, TShippingInstH shippingInstH, ErrorStatus errSts) {

		TEcOrderHCB cb = tEcOrderHBhv.newMyConditionBean();
		// ===== テーブル結合 =====
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_MImportType();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByPriorityFlg().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByGiftFlg().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByDelivMatchFlg().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByErrorFlg().withVDict(getCultureId());
		cb.setupSelect_BClassDtlByImportFlg().withVDict(getCultureId());
		cb.setupSelect_TEcOrderRAsOne();
		cb.setupSelect_TEcOrderRAsOne().withBClassDtlByStatementOutFlg().withVDict(getCultureId());
		cb.setupSelect_TEcOrderRAsOne().withBClassDtlByInvoiceCreateFlg().withVDict(getCultureId());
		cb.setupSelect_MImportType();
		cb.setupSelect_TShippingInstH().withBClassDtlByShippingStatus().withVDict(getCultureId());
		cb.setupSelect_TShippingInstH().withBClassDtlByErrorFlg().withVDict(getCultureId());
		cb.setupSelect_TShippingInstH().withBClassDtlByDelivTz().withVDict(getCultureId());
		// [品質検査対応][Ver3.1][#5577] 欠品フラグ名称を取得する 2018.11.07 matsumoto Start
		cb.setupSelect_TShippingInstH().withBClassDtlByStockOutFlg().withVDict(getCultureId());
		// [品質検査対応][Ver3.1][#5577] 欠品フラグ名称を取得する 2018.11.07 matsumoto End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		cb.setupSelect_TShippingInstH().withTAllocInstH().withTPickingH();
		cb.setupSelect_TShippingInstH().withMDeliveryCourse();
		cb.setupSelect_TShippingInstH().withMCustomerBySupplyCustomerId();
		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(MAXでの欠品フラグ取得を削除) 2018.07.23 kawana Delete
		cb.specify().specifyTShippingInstH().derivedTShippingInstBList().max(new SubQuery<TShippingInstBCB>() {
			@Override
			public void query(TShippingInstBCB maxCb) {
				maxCb.specify().specifyMProduct().columnShippingStopFlg();
			}
		}, TEcOrderH.ALIAS_productShippingStopFlg);
		cb.specify().specifyTShippingInstH().specifyTAllocInstH().specifyTPickingH().derivedTPickingBList().max(new SubQuery<TPickingBCB>() {

			@Override
			public void query(TPickingBCB maxCb) {
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				maxCb.specify().specifyTStock().specifyMLocation().columnAllocNgFlg();
				// レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			}
		}, TEcOrderH.ALIAS_allocNgFlg);

		// ===== 検索条件 =====
		cb.query().setCenterId_Equal(ecOrderH.getCenterId());
		cb.query().setClientId_Equal(ecOrderH.getClientId());

		// 日付条件
		String dtCls = ecOrderH.getDtCls();
		String dtFrom = ecOrderH.getDtFrom();
		String dtTo = ecOrderH.getDtTo();
		if (!CU.isNullOrEmpty(dtCls)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			switch (CDef.DtCls.codeOf(ecOrderH.getDtCls())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe ENd
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

		cb.query().queryTShippingInstH().setShippingStatus_Equal(shippingInstH.getShippingStatus());
		cb.query().queryMImportType().setImportTypeId_Equal(ecOrderH.getImportTypeId());
		cb.query().queryTShippingInstH().setDeliveryCourseCd_PrefixSearch(shippingInstH.getDeliveryCourseCd());
		cb.query().queryTEcOrderRAsOne().setStatementOutFlg_Equal(ecOrderR.getStatementOutFlg());
		cb.query().queryTEcOrderRAsOne().setInvoiceCreateFlg_Equal(ecOrderR.getInvoiceCreateFlg());
		cb.query().queryTShippingInstH().setErrorFlg_Equal(shippingInstH.getErrorFlg());
		cb.query().setPriorityFlg_Equal(ecOrderH.getPriorityFlg());
		cb.query().setGiftFlg_Equal(ecOrderH.getGiftFlg());
		// キャンセルデータ表示
		if (!CU.isNullOrEmpty(ecOrderH.getCancelDisplay())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.CancelDataDisplay cancelDisplay = CDef.CancelDataDisplay.codeOf(ecOrderH.getCancelDisplay());
			if (cancelDisplay == CDef.CancelDataDisplay.$0) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				cb.query().queryTShippingInstH().setShippingStatus_NotEqual_$90();
			}
		}
		// [C-CWMS-0045] 検索条件にコメント有無を追加 2015.08.03 kawana Start
		String commentFlgStr = ecOrderH.getCommentFlg();
		if (!CU.isNullOrEmpty(commentFlgStr)) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.CommentFlg commentFlg = CDef.CommentFlg.codeOf(commentFlgStr);
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			switch (commentFlg) {
			case $0:
				// コメント無
				cb.query().setComment1_IsNull();
				break;
			case $1:
				// コメント有
				cb.query().setComment1_IsNotNull();
				break;
			}
		}
		// [C-CWMS-0045] 検索条件にコメント有無を追加 2015.08.03 kawana End
		cb.query().setOrderNo_PrefixSearch(ecOrderH.getOrderNo());
		cb.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingWorkNo_LikeSearch(shippingInstH.getPickingWorkNo(), new LikeSearchOption().likeSuffix());
		cb.query().setNoshi_LikeSearch(ecOrderH.getNoshi(), new LikeSearchOption().likeContain());
		cb.query().setComment1_LikeSearch(ecOrderH.getComment1(), new LikeSearchOption().likeContain());
		cb.query().setComment2_LikeSearch(ecOrderH.getComment2(), new LikeSearchOption().likeContain());
		// 名寄せID
		if (!CU.isNullOrEmpty(ecOrderH.getMergeId())) {

			// 名寄せIDが受注番号と違う
			cb.columnQuery(new SpecifyQuery<TEcOrderHCB>() {
				@Override
				public void specify(TEcOrderHCB cqCb) {
					cqCb.specify().columnMergeId();
				}
			}).notEqual(new SpecifyQuery<TEcOrderHCB>() {
				@Override
				public void specify(TEcOrderHCB cqCb) {
					cqCb.specify().columnOrderNo();
				}
			});

			cb.query().setMergeId_PrefixSearch(ecOrderH.getMergeId());
		}

		// 名寄せ有無
		if (!CU.isNullOrEmpty(ecOrderH.getMergeFlg())) {
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			CDef.MergeFlg mergeFlg = CDef.MergeFlg.codeOf(ecOrderH.getMergeFlg());
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
			if (mergeFlg == CDef.MergeFlg.$0) {
				// 名寄せ無

				// 名寄せIDが受注番号と一致
				cb.columnQuery(new SpecifyQuery<TEcOrderHCB>() {
					@Override
					public void specify(TEcOrderHCB cqCb) {
						cqCb.specify().columnMergeId();
					}
				}).equal(new SpecifyQuery<TEcOrderHCB>() {
					@Override
					public void specify(TEcOrderHCB cqCb) {
						cqCb.specify().columnOrderNo();
					}
				});
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
			} else if (mergeFlg == CDef.MergeFlg.$1) {
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// 名寄せ有

				// 名寄せIDが受注番号と不一致
				cb.columnQuery(new SpecifyQuery<TEcOrderHCB>() {
					@Override
					public void specify(TEcOrderHCB cqCb) {
						cqCb.specify().columnMergeId();
					}
				}).notEqual(new SpecifyQuery<TEcOrderHCB>() {
					@Override
					public void specify(TEcOrderHCB cqCb) {
						cqCb.specify().columnOrderNo();
					}
				});
			}
		}

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
		// 欠品フラグ
		cb.query().queryTShippingInstH().setStockOutFlg_Equal(shippingInstH.getStockOutFlg());
		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End

		// ===== ソート条件 =====
		cb.addOrderBy_PK_Asc();

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		List<TEcOrderH> resultList = selectList(tEcOrderHBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		if (resultList.size() == 0) {
			// 0件
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return resultList;
		}

		// [C-CWMS-0026] WMSで使用する項目をEC受注テーブルに移動に伴い楽天RMS受注のテーブル結合を削除 2015.05.18 kawana

		// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(欠品フラグ名称の設定を削除) 2018.07.23 kawana Delete

		for (TEcOrderH h : resultList) {

			// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動(欠品フラグ名称の設定を削除) 2018.07.23 kawana Delete

			// メッセージの設定
			String messageCd = h.chaseTShippingInstH().getErrorMessageCd();
			if (!CU.isNullOrEmpty(messageCd)) {
				// メッセージCDの設定
				BMessage message = new BMessage();
				message.setMessageCd(messageCd);
				message = messageLogic.getUkEntity(message);
				if (message != null) {
					h.chaseTShippingInstH().setHeadMessageNm(message.getMessageNm());
				}
			}

			// 名寄せID(梱包ID)が受注番号と一致した場合は空設定
			String orderNo = h.getOrderNo();
			String mergeId = h.getMergeId();
			// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana Start
			if (CU.equals(orderNo, mergeId)) {
				h.setMergeIdForDisplay("");
			} else {
				h.setMergeIdForDisplay(mergeId);
			}
			// [新WMS-110-060] キャンセル、削除時に名寄せIDが空になってしまう問題を修正 2015.08.06 kawana End

			// [C-CWMS-0026] 使用項目をEC受注ヘッダに移動したため名寄せステータスの設定を削除 2015.05.15 kawana
		}

		return resultList;
	}
}
