package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MCommonCarrierBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.logic.common.CarrierBoxLogic;

/**
 * 運送業者マスタメンテナンス更新ロジッククラス
 */
public class CarrierMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierBhv mCarrierBhv;
	//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	@Inject
	private MCommonCarrierBhv mCommonCarrierBhv;
	//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
	@Inject
	private MCarrierBoxBhv mCarrierBoxBhv;
	@Inject
	private CarrierBoxLogic carrierBoxLogic;
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

	/**
	 * <h2>運送業者マスタデータを更新する。</h2>
	 * <pre>
	 *
	 * 運送業者マスタのデータを更新する。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MCarrier mCarrier ,ErrorStatus errSts) {

		// ===== 運送業者マスタ更新実行 =====
		mCarrierBhv.update(mCarrier);
	}

	/**
	 * <h2>運送業者マスタリストデータを一括更新する。</h2>
	 * <pre>
	 *
	 * 運送業者マスタのデータを一括更新する。
	 * </pre>
	 * @param mCarrierList 運送業者マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MCarrier> mCarrierList ,ErrorStatus errSts) {

		// ===== 運送業者マスタ更新実行 =====
		mCarrierBhv.batchUpdate(mCarrierList);
	}

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
	/**
	 * <h2>運送業者マスタを更新する。</h2>
	 * <pre>
	 * 運送業者スマスタを更新し、センタ取引先マスタのデータを一括削除、登録、更新する。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：全項目
	 * @param mCarrierBox 運送業者荷材マスタリスト：全項目
	 * @param errSts エラー時に登録するエラーステータス
	 */
	public void update(MCarrier mCarrier, List<MBox> mBox, ErrorStatus errSts) {

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// ===== 運送業者マスタ更新実行 =====
		mCarrierBhv.update(mCarrier);
		//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
		if (mCarrier.getCommonCarrierId() != null) {
			mCommonCarrierBhv.update(mCarrier.getMCommonCarrier());
		}
		//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
		for (MBox mBox1 : mBox){

			MCarrierBox mCarrierBox = mBox1.getMCarrierBoxList().get(0);
			mCarrierBox.setCarrierId(mCarrier.getCarrierId());
			mCarrierBox.setBoxId(mBox1.getBoxId());
			mCarrierBox = carrierBoxLogic.getUkEntity(mCarrierBox);
			if (mCarrierBox == null){
				// ===== 商品荷姿マスタ登録実行 =====
				mCarrierBox = mBox1.getMCarrierBoxList().get(0);
				mCarrierBox.setCarrierId(mCarrier.getCarrierId());
				mCarrierBox.setBoxId(mBox1.getBoxId());
				mCarrierBoxBhv.insert(mCarrierBox);
			}else{
				// ===== 商品荷姿マスタ更新実行 =====
				mCarrierBox = mBox1.getMCarrierBoxList().get(0);
				mCarrierBox.setCarrierId(mCarrier.getCarrierId());
				mCarrierBox.setBoxId(mBox1.getBoxId());
				mCarrierBoxBhv.update(mCarrierBox);
			}

		}
		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(true);
	}
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

}