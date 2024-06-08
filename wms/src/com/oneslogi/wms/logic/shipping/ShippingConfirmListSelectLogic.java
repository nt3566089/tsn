package com.oneslogi.wms.logic.shipping;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingConfirmListPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingConfirmList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;

/**
 * 出荷確定一覧データ取得ロジッククラス
 */
public class ShippingConfirmListSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;

	// ===== 使用ロジック =====
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>出庫データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出SQLを利用し、データベースから出荷確定一覧のデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param header 出荷指示ヘッダ：荷主CD、センタCD・未確定のみ表示・出荷日(From)・出荷日(To)・出庫作業No.・納品先CD・運送業者CD・配送コースCD・欠品フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<SqlShippingConfirmList> 出荷確定一覧データリスト
	 */
	public PagingResultBean<SqlShippingConfirmList> select(TPickingH header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<SqlShippingConfirmList> result = null;

		// =====  出荷確定一覧データ取得 =====

		// 外出しSQLの定義
		String path = TPickingHBhv.PATH_selectSqlShippingConfirmList;

		// 検索条件の設定
		SqlShippingConfirmListPmb pmb = setCondition(header);

		if(pmb == null){
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		// 検索実行
		Class<SqlShippingConfirmList> entityType = SqlShippingConfirmList.class;
		result = selectPage(tPickingHBhv, path, pmb, entityType, paging);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return result;
		}

		return result;
	}

	/**
	 * 検索条件の設定
	 * @param header 出庫ヘッダ：荷主CD、センタCD・未確定のみ表示・出荷日(From)・出荷日(To)・出庫作業No.・納品先CD・運送業者CD・配送コースCD・欠品フラグ
	 * @return SqlShippingConfirmListPmb 入荷予定データのリスト
	 */
	private SqlShippingConfirmListPmb setCondition(TPickingH header) {
		SqlShippingConfirmListPmb pmb = new SqlShippingConfirmListPmb();
		// 荷主IDを取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getMClient().getClientCd());
		clientCondition = clientLogic.getUkEntity(clientCondition);
		if (clientCondition == null) {
			return null;
		}
		long clientId = clientLogic.getUkEntity(clientCondition).getClientId();

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(header.getMCenter().getCenterCd());
		centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);
		if (centerCondition == null) {
			return null;
		}
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		// 検索条件の設定
//		pmb.setCultureId(getCultureId());
//		pmb.setCenterClassCondition(getCenterClassCondition());
		pmb.setClientId(clientId); //出庫ヘッダ.荷主ID
		pmb.setCenterId(centerId); //出庫ヘッダ.センタID
		pmb.setFlg(header.getNoConfirmFlg()); //出庫ヘッダ.未確定のみ表示
		pmb.setShippingDtFrom(header.getTAllocInstH().getShippingDtFrom()); //引当指示ヘッダ.出荷日(From)
		pmb.setShippingDtTo(header.getTAllocInstH().getShippingDtTo()); // 引当指示ヘッダ.出荷日(To)
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana Start
		pmb.setPickingWorkNo_SuffixSearch(header.getPickingWorkNo()); //出庫ヘッダ.出庫作業No.
		// [C-CWMS-0022] 出庫作業No.の条件を後方一致に変更 2015.03.25 kawana End
		pmb.setSupplyCustomerCd_PrefixSearch(header.getTAllocInstH().getSupplyCustomerCd()); //引当指示ヘッダ.納品先CD
		pmb.setCarrierCd(header.getTAllocInstH().getMDeliveryCourse().getMCarrier().getCarrierCd()); //運送業者マスタ.運送業者CD
		pmb.setDeliveryCourseCd_PrefixSearch(header.getTAllocInstH().getMDeliveryCourse().getDeliveryCourseCd());
		// [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana Start
		pmb.setStockOutFlg(header.getNoStockOutFlg());
		// [ON推-品向-606] 検索条件に欠品フラグを追加 2015.04.17 kawana End
		// [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana Start
		pmb.setShippingStatus(header.getPickingStatus());
		// [#4681][v2.2] 検索条件に出荷ステータスを追加 2018.06.04 kawana End
		return pmb;
	}

}
