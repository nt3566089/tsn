package com.oneslogi.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.TSerialNoCB;
import com.oneslogi.base.dbflute.exbhv.TSerialNoBhv;
import com.oneslogi.base.dbflute.exentity.TSerialNo;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 出庫指示一覧データ取得ロジッククラス
 */
public class SerialNoListLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TSerialNoBhv tSerialNoBhv;

	/**
	 * <h2>シリアルNo.管理を取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースからシリアルNo.管理を取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mCenter 荷主マスタ：荷主ID
	 * @param mClient センタマスタ：センタID
	 * @param mProduct 商品マスタ：商品ID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TSerialNo>  最終ロット管理リスト
	 */
	public PagingResultBean<TSerialNo> select(TSerialNo header, PagingData paging, ErrorStatus errSts) {
		// ===== シリアルNo.管理データ取得  =====
		TSerialNoCB cb = tSerialNoBhv.newMyConditionBean();
		// ===== シリアルNo.一覧データ取得 =====
		PagingResultBean<TSerialNo> result = null;

		//センタマスタ
		cb.setupSelect_MCenter();
		//荷主マスタ
		cb.setupSelect_MClient();
		//商品マスタ
		cb.setupSelect_MProduct();
		// 検索条件の設定
		//センタCDの設定
		cb.query().queryMCenter().setCenterCd_Equal(header.chaseMCenter().getCenterCd());
		//荷主CDの設定
		cb.query().queryMClient().setClientCd_Equal(header.chaseMClient().getClientCd());
		//商品CDの設定
		cb.query().queryMProduct().setProductCd_Equal(header.chaseMProduct().getProductCd());
		//シリアルNo.(From)
		cb.query().setSerialNo_GreaterEqual(header.getSerialNoFrom());

		// [#1974] シリアルNo.(TO)の後ろに「~」埋して検索する 2017.06.26 kawana Start

		if (!CU.isNullOrEmpty(header.getSerialNoTo())) {
			// 後方「~」埋め (FromとToともに「A」と入力したらA001～A999を検索対象とするため)
			String serialTo = StringUtils.rightPad(header.getSerialNoTo(), 30, '~');
			//シリアルNo.(To)
			cb.query().setSerialNo_LessEqual(serialTo);
		}

		// [#1974] シリアルNo.(TO)の後ろに「~」埋して検索する 2017.06.26 kawana End

		//仕入先CD
		cb.query().setSupplierCd_PrefixSearch(header.getSupplierCd());
		//WMS入荷伝票No.
		cb.query().setReceiveSlipNo_PrefixSearch(header.getReceiveSlipNo());
		//入荷日(From)
		cb.query().setReceiveDt_GreaterEqual(header.getReceiveDtFrom());
		//入荷日(To)
		cb.query().setReceiveDt_LessEqual(header.getReceiveDtTo());
		//納品先CD
		cb.query().setSupplyCustomerCd_PrefixSearch(header.getSupplyCustomerCd());
		//出庫作業No.
		cb.query().setPickingWorkNo_LikeSearch(header.getPickingWorkNo(), new LikeSearchOption().likeSuffix());
		//出荷日(From)
		cb.query().setShippingDt_GreaterEqual(header.getShippingDtFrom());
		//出荷日(To)
		cb.query().setShippingDt_LessEqual(header.getShippingDtTo());

		//ソート順の設定
		cb.query().queryMCenter().addOrderBy_CenterCd_Asc(); //センタCD
		cb.query().queryMClient().addOrderBy_ClientCd_Asc(); //荷主CD
		cb.query().queryMProduct().addOrderBy_ProductCd_Asc(); //商品CD
		cb.query().addOrderBy_ShippingDt_Asc(); //出荷日
		cb.query().addOrderBy_ReceiveDt_Asc(); //入荷日
		cb.query().addOrderBy_SerialNo_Asc(); //シリアルNo

		// ===== シリアルNo.管理検索実行 =====
		result = selectPage(tSerialNoBhv, cb, paging);
		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	/**
	 * <h2>シリアルNo.管理テーブル物理削除処理。</h2>
	 * <pre>
	 *
	 * 下記テーブルのデータを削除する。
	 * </pre>
	 * @param tSerialNo シリアルNo.管理
	 * @param errSts エラー時に登録するエラーステータス
	 * @return
	 * @return
	 */
	public void delete(List<TSerialNo> tSerialNoList, ErrorStatus errSts) {
		// =====  シリアルNo.管理削除実行 =====
		tSerialNoBhv.batchDelete(tSerialNoList);
	}

	/**
	 * <h2>シリアルNo.管理テーブルの更新処理更新する。</h2>
	 * <pre>
	 * シリアルNo.管理テーブルの更新処理更新する。
	 * </pre>
	 * @param tSerialNo シリアルNo.管理
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<TSerialNo> tSerialNoList, ErrorStatus errSts) {
		// ===== シリアルNo.管理更新実行 =====
		tSerialNoBhv.batchUpdate(tSerialNoList);
	}
}
