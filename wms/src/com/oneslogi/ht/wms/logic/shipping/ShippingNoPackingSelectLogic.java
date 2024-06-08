package com.oneslogi.ht.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.WHtShippingCB;
import com.oneslogi.base.dbflute.exbhv.WHtShippingBhv;
import com.oneslogi.base.dbflute.exentity.WHtShipping;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.shipping.ShippingCommonLogic;

/**
 * バラ出荷検品（梱包計算なし）取得ロジッククラス
 */
public class ShippingNoPackingSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 出荷検品ワーク     */
	@Inject
	private WHtShippingBhv wHtShippingBhv;

	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

	// ===== 使用ロジック =====

	@Inject
	private ShippingCommonLogic commonLogic;

	// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

	/**
	 * <h2>個口を取得する。</h2>
	 * <pre>
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行って
	 * 出庫作業No.の場合、引数を条件に出荷検品ワークテーブルからデータを取得し、個口番号＋１を設定する。
	 * 出荷梱包No.の場合、個口番号に２を設定する。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：MACアドレス・荷主ID・センタID・個口番号
	 */
	public void selectPiece(WHtShipping wHtShipping) {

		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.11 NayZaw Start
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End

			//出庫作業No.で検品する場合
			//出荷検品ワークテーブルの取得
			WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
			//wHtShippingCB.query().setSpgInspectionFlg_Equal(wHtShipping.getSpgInspectionFlg());
			wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
			wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
			wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());

			List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

			//wHtShipping.setPieceDenoRecode(0l);
			wHtShipping.setPieceNo(0l);
			for (WHtShipping entity : lstWHtShipping) {
				if (entity.getPieceNo().compareTo(wHtShipping.getPieceNo()) > 0) {
					wHtShipping.setPieceNo(entity.getPieceNo());
				}
			}
			wHtShipping.setPieceNo(wHtShipping.getPieceNo() + 1);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// 出荷梱包No.で検品する場合、PieceNo=2に設定する(jspでPieceNo-1と設定している為2を設定)
			wHtShipping.setPieceNo(2l);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// [C-CWMS-0051] 出荷梱包No.で検品する場合の為処理追加 2015.12.11 NayZaw End
	}

	/**
	 * <h2>出庫検品残数を抽出する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルのデータを取得し、
	 * 出庫検品残数を計算後、設定する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID・商品ID
	 */
	public void selectSpgQtyRemain(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setProductId_Equal(wHtShipping.getProductId());
		wHtShippingCB.query().setBoxId_IsNull();

		WHtShipping entity = wHtShippingBhv.selectEntity(wHtShippingCB);

		if (entity != null) {
			wHtShipping.setSpgQtyRemain(WCC.subtract(entity.getInstNum(), entity.getSpgQtyOns()));
		}
	}

	/**
	 * <h2>検品未完件数を抽出する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルから残数ありのデータ件数を取得する
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return int 検品未完件数
	 */
	public int selectSpgQtyRemainCount(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setSpgQtyRemain_GreaterThan(WCC.ZERO);

		return wHtShippingBhv.selectCount(wHtShippingCB);
	}

	/**
	 * <h2>検品済件数を抽出する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルから検品済数あり、荷材ID未設定のデータ件数を取得する
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return int 検品済件数
	 */
	public int selectSpgQtyOnsCount(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setBoxId_IsNull();
		wHtShippingCB.query().setSpgQtyOns_GreaterThan(WCC.ZERO);

		return wHtShippingBhv.selectCount(wHtShippingCB);
	}

	/**
	 * <h2>出荷検品ワークデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルから検品済数ありのデータを取得する
	 *
	 * 検索対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID
	 * @return List<WHtShipping> 出荷検品ワークリスト
	 */
	public List<WHtShipping> selectList(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.setupSelect_MProduct();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());

		wHtShippingCB.query().addOrderBy_PieceNo_Asc();
		wHtShippingCB.query().addOrderBy_ProductCd_Asc();
		wHtShippingCB.query().setSpgQtyOns_GreaterThan(WCC.ZERO);

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		if (lstWHtShipping.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstWHtShipping;
		}

		return lstWHtShipping;
	}

	/**
	 * <h2>箱データを抽出する。</h2>
	 * <pre>
	 * 引数を条件に出荷検品ワークテーブルから検品済数あり、荷材CD未設定のデータを取得する。
	 * 検品の残数を計算し、残数がある場合は取得したデータの指示数に検品済数を設定する。
	 * 検品残数に0を設定し、荷検品ワークデータを更新する。
	 * 残数がある場合、指示数と検品残数に残数を設定し、出荷検品ワークテーブルに新規登録する。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】を行って
	 * 出庫作業No.の場合、個口番号に個口番号＋１を設定する。
	 * 出荷梱包No.の場合、個口番号に２を設定する。
	 *
	 * 出荷検品ワークテーブルから荷材CD未設定のデータ件数を再取得し、
	 * データなしの場合、true(検品完了)を返す。
	 * データありの場合false(検品未完了)を返す。
	 *
	 * 【出荷共通ロジック.出庫作業No.か出荷梱包No.かチェック】
	 * ・{@link ShippingLogic#checkPickingWorkNoOrPackingNo(WHtShipping) 出庫作業No.か出荷梱包No.かチェックメソッド}を呼び出す。
	 *
	 * </pre>
	 * @param wHtShipping 出荷検品ワーク：出庫作業No.・MACアドレス・荷主ID・センタID・荷材ID・荷材CD・荷材名称・個口番号
	 * @return boolean true:検品完了;false:検品未完了
	 */
	public boolean selectAllBox(WHtShipping wHtShipping) {
		//出荷検品ワークテーブルのデータ取得
		WHtShippingCB wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setBoxCd_IsNullOrEmpty();
		wHtShippingCB.query().setSpgQtyOns_GreaterThan(WCC.ZERO);

		List<WHtShipping> lstWHtShipping = wHtShippingBhv.selectList(wHtShippingCB);

		for (WHtShipping entity : lstWHtShipping) {
			BigDecimal spgQtyRemain = WCC.subtract(entity.getInstNum(), entity.getSpgQtyOns());

			entity.setBoxId(wHtShipping.getBoxId());
			entity.setBoxCd(wHtShipping.getBoxCd());
			entity.setBoxNm(wHtShipping.getBoxNm());
			entity.setPieceNo(wHtShipping.getPieceNo());
			entity.setSpgQtyRemain(WCC.ZERO);
			if (WCC.isPositive(spgQtyRemain)) {
				entity.setInstNum(entity.getSpgQtyOns());
			}

			wHtShippingBhv.update(entity);

			if (WCC.isPositive(spgQtyRemain)) {
				//検品未完了の場合
				entity.setBoxId(null);
				entity.setBoxCd(null);
				entity.setBoxNm(null);
				entity.setPieceNo(0l);
				entity.setInstNum(spgQtyRemain);
				entity.setSpgQtyOns(WCC.ZERO);
				entity.setSpgQtyRemain(spgQtyRemain);

				wHtShippingBhv.insert(entity);
			}
		}

		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja Start
		//wHtShipping.setPieceNo(wHtShipping.getPieceNo()+1);
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start

		final long centerId = wHtShipping.getCenterId();
		final String targetNo = wHtShipping.getPickingWorkNo();

		if (commonLogic.isPickingWorkNo(centerId, targetNo)) {
			// 出庫作業No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			wHtShipping.setPieceNo(wHtShipping.getPieceNo() + 1);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		} else if (commonLogic.isShippingPackingNo(centerId, targetNo)) {
			// 出荷梱包No.

			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
			// 出荷梱包No.で検品する場合、PieceNo=2に設定する(jspでPieceNo-1と設定している為2を設定)
			wHtShipping.setPieceNo(2l);
			// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana Start
		}
		// [#1789] 対象No.の出庫作業No./出荷梱包No.の判定を共通化 2017.05.18 kawana End
		// Ver２．１向けエンハンス C-CWMS-0055 2016.06.13 sja End

		wHtShipping.setBoxId(null);
		wHtShipping.setBoxCd("");
		wHtShipping.setBoxNm("");

		//箱登録チェック
		wHtShippingCB = wHtShippingBhv.newMyConditionBean();
		wHtShippingCB.query().setCenterId_Equal(wHtShipping.getCenterId());
		wHtShippingCB.query().setClientId_Equal(wHtShipping.getClientId());
		wHtShippingCB.query().setPickingWorkNo_Equal(wHtShipping.getPickingWorkNo());
		wHtShippingCB.query().setMacAddress_Equal(wHtShipping.getMacAddress());
		wHtShippingCB.query().setBoxCd_IsNullOrEmpty();

		if (wHtShippingBhv.selectCount(wHtShippingCB) > 0) {
			//検品未完了
			return false;
		}

		//検品完了
		return true;
	}
}