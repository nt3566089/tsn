package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MBoxCB;
import com.oneslogi.base.dbflute.cbean.MCarrierBoxCB;
import com.oneslogi.base.dbflute.cbean.MCarrierCB;
import com.oneslogi.base.dbflute.exbhv.MBoxBhv;
import com.oneslogi.base.dbflute.exbhv.MCarrierBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 運送業者マスタメンテナンス取得ロジッククラス
 */
public class CarrierMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCarrierBhv mCarrierBhv;
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
	@Inject
	private MBoxBhv mBoxBhv;
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

	/**
	 * <h2>運送業者マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに運送業者マスタ情報を取得する。
	 * 件数をチェックし、
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 *  </pre>
	 * @param  mCarrier 運送業者マスタ：センタID・運送業者CD・運送業者名称・削除フラグ
	 * @param paging ページングデータ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List< MCarrier> 運送業者マスタリスト
	 */
	public PagingResultBean< MCarrier> select(MCarrier mCarrier, PagingData paging, ErrorStatus errSts) {

		// ===== 運送業者マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCarrierCB cb = mCarrierBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_MCommonCarrier();
		// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
		cb.setupSelect_MCommonCarrier().withBClassDtlByBolOutputTargetFlg().withVDict(getCultureId());
		// 米国出荷ドキュメント追加対応 2018.01.07 PYM End
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		// センタIDの設定
		cb.query().setCenterId_Equal( mCarrier.getCenterId());
		// 運送業者CDの設定
		cb.query().setCarrierCd_PrefixSearch( mCarrier.getCarrierCd());
		// 運送業者名称の設定
		cb.query().setCarrierNm_LikeSearch( mCarrier.getCarrierNm(), new LikeSearchOption().likeContain());
		// 削除フラグの設定
		cb.query().setDelFlg_Equal(mCarrier.getDelFlg());

		// ソート順の設定
		cb.query().addOrderBy_CarrierCd_Asc();

		// [#361] ページング処理追加 2016.12.13 kawana Start
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ===== 運送業者マスタ検索実行 =====
		PagingResultBean<MCarrier> result =  selectPage(mCarrierBhv, cb, paging);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End
		// [#361] ページング処理追加 2016.12.13 kawana End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
	/**
	 * <h2>運送業者マスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからセンタ共通運送業者マスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 運送業者マスタ：運送業者ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MCarrier>運送業者マスタリスト
	 */
	public List<MCarrier> selectById(MCarrier header, ErrorStatus errSts) {

		List<MCarrier> result = null;
		//===== 編集データ取得 =====

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MCarrierCB cb = mCarrierBhv.newMyConditionBean();
		cb.setupSelect_MCommonCarrier();
		//荷主センタ変更対応 201７.01.18 sja Start
		cb.setupSelect_MCenter();
		//荷主センタ変更対応 201７.01.18 sja End

        //運送業者IDの設定
        cb.query().setCarrierId_Equal(header.getCarrierId());

        //センタIDの設定
        cb.query().setCenterId_Equal(header.getCenterId());

        //==== 運送業者マスタ検索実行 =====
        result = mCarrierBhv.selectList(cb);

        mCarrierBhv.loadMCarrierBoxList(result,new ConditionBeanSetupper<MCarrierBoxCB>() {
			public void setup(MCarrierBoxCB mCarrierBoxCB) {
				mCarrierBoxCB.setupSelect_MBox();
			}
		});
		//削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	// [Ver3.0][#4748] 不要な引数（エラーステータス）を除去 2018.06.21 shimizu Start
	/**
	 * <h2>運送業者マスタと運送業者荷材マスタデータ取得。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから運送業者マスタ運送業者荷材マスタデータを取得する。
	 *
	 * 戻り値には次のテーブルが結合された結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・運送業者マスタ
	 * ・運送業者荷材マスタ
	 * ・辞書マスタビュー
	 *
	 * 【パラメータの使用項目】
	 *  (荷材マスタ)
	 *  ・荷材CD
	 *  ・削除フラグ
	 *  (辞書マスタビュー)
	 *  ・辞書名
	 *  (運送業者マスタ)
	 *  ・運送業者CD
	 * </pre>
	 * @param mBox 検索条件（荷材マスタ）
	 * @param mCarrier 検索条件（センタ運送業者マスタ）
	 * @return List<MBox> 荷材マスタデータのリスト
	 */
	public List<MBox> selectWihtCarrierboxList(final MBox mBox,final MCarrier mCarrier) {
	// [Ver3.0][#4748] 不要な引数（エラーステータス）を除去 2018.06.21 shimizu End

		List<MBox> result = null;
		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== 荷材マスタデータ取得 =====
		// 検索条件の設定
		MBoxCB cb = mBoxBhv.newMyConditionBean();
		// センタCDの設定
		cb.query().setCenterId_Equal(mBox.getMCenter().getCenterId());
		cb.query().setDelFlg_Equal_$0();
		// ソート順の設定
		cb.query().addOrderBy_BoxCd_Asc();

		// ===== 荷材マスタ検索実行 =====
		result = mBoxBhv.selectList(cb);
		mBoxBhv.loadMCarrierBoxList(result, new ConditionBeanSetupper<MCarrierBoxCB>() {
			@Override
			public void setup(MCarrierBoxCB mCarrierBoxCB) {
				mCarrierBoxCB.setupSelect_MBox();
				mCarrierBoxCB.query().setCarrierId_Equal(mCarrier.getCarrierId());
			}
		});
		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// [Ver3.0][#4748] ０件チェックをResouceクラスへ移動 2018.06.21 shimizu Del

		return result;
	}
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
}