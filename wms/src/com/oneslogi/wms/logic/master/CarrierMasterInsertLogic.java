package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MCommonCarrierBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 運送業者マスタメンテナンス登録ロジッククラス
 */
public class CarrierMasterInsertLogic extends AbstractWmsLogic {

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
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
	/**
	 * <h2>運送業者マスタを登録する。</h2>
	 * <pre>
	 *
	 * 運送業者マスタのデータを登録する。
	 *  </pre>
	 * @param mCarrier 運送業者マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCarrier mCarrier, ErrorStatus errSts) {

		// ===== 運送業者マスタ登録実行 =====
		mCarrierBhv.insert(mCarrier);
	}

	/**
	 * <h2>運送業者マスタを一括登録する。</h2>
	 * <pre>
	 *
	 * 運送業者マスタのデータを一括登録する。
	 *  </pre>
	 * @param mCarrierList 運送業者マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MCarrier> mCarrierList, ErrorStatus errSts) {

		// ===== 運送業者マスタ登録実行 =====
		mCarrierBhv.batchInsert(mCarrierList);
	}

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
	/**
	 * <h2>運送業者マスタを登録する。</h2>
	 * <pre>
	 * 運送業者マスタとセンタ運送業者荷材マスタのデータを登録する。
	 * </pre>
	 * @param mCarrier 運送業者マスタ：全項目
	 * @param mCarrierBox 送業者荷材マスタリスト：全項目
	 * @param errSts エラー時に登録するエラーステータス
	 */
	public void insert(MCarrier mCarrier, List<MBox> mBoxList, ErrorStatus errSts) {

		//運送業者マスタに存在チェック
		//検索条件の設定
		MCarrier result = null;
		MCarrierCB cb = mCarrierBhv.newMyConditionBean();

		//センタIDの設定
		cb.query().setCenterId_Equal(mCarrier.getCenterId());
		//商品CDの設定
		cb.query().setCarrierCd_Equal(mCarrier.getCarrierCd());

		result = mCarrierBhv.selectEntity(cb);

		if (result == null) {
			//存在なかった場合
			// ===== 商品マスタ登録実行 =====
			mCarrierBhv.insert(mCarrier);
			//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
			if (mCarrier.getCommonCarrierId() != null) {
				mCommonCarrierBhv.update(mCarrier.getMCommonCarrier());
			}
			//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
		} else {
			//存在した場合
				this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				return;
		}

		for (MBox mBox : mBoxList){
			MCarrierBox mCarrierBox = mBox.getMCarrierBoxList().get(0);
			mCarrierBox.setCarrierId(mCarrier.getCarrierId());
			mCarrierBox.setBoxId(mBox.getBoxId());

			// ===== 商品荷姿マスタ登録実行 =====
			mCarrierBoxBhv.insert(mCarrierBox);
		}

	}
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
}