package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MCenterCustomerCB;
import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配送コースマスタメンテナンス取得ロジッククラス
 */
public class DeliveryCourseMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;
	/**
	 * <h2>配送コースマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに配送コースマスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 配送コースマスタ：センタID・配送コースCD・配送コース名称・運送業者ID・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MDeliveryCourse> 配送コースマスタリスト
	 */
	public PagingResultBean<MDeliveryCourse> selectByConditions(MDeliveryCourse header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MDeliveryCourse> result = null;

		//==== 一覧データ取得 =====

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		cb.setupSelect_MCarrier();
		//荷主センタ変更対応 201７.02.07 sja Start
		cb.setupSelect_MCenter();
		//荷主センタ変更対応 201７.02.07 sja End
		// [横並-006] 削除フラグを追加 2014.11.26 taoys Start
		//削除フラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
		// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
		cb.setupSelect_BClassDtlByPaymentTerm();
		cb.setupSelect_BClassDtlByPaymentTerm().withVDict(getCultureId());
		// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
		cb.setupSelect_BClassDtlByTrackingNumberingUnit().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		cb.setupSelect_MCenterClassDtlByTagType(getCenterClassCondition()).withVDict(getCultureId());
		cb.setupSelect_MCenterClassDtlByTagTypeAfter(getCenterClassCondition()).withVDict(getCultureId());
		cb.setupSelect_MCenterClassDtlByTagDataType(getCenterClassCondition()).withVDict(getCultureId());
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
		// [横並-006] 削除フラグを追加 2014.11.26 taoys End
		//センタIDの設定
		cb.query().setCenterId_Equal(header.getCenterId());
		//配送コースCDの設定
		cb.query().setDeliveryCourseCd_PrefixSearch(header.getDeliveryCourseCd());
		//配送コース名称の設定
		cb.query().setDeliveryCourseNm_LikeSearch(header.getDeliveryCourseNm(), new LikeSearchOption().likeContain());
		//運送業者IDの設定
		cb.query().setCarrierId_Equal(header.getCarrierId());
		//削除フラグの設定
		cb.query().setDelFlg_Equal(header.getDelFlg());


		//ソート順の設定
		cb.query().addOrderBy_DeliveryCourseCd_Asc();

		//==== 配送コースマスタ検索実行 =====
		result= selectPage(mDeliveryCourseBhv,cb,paging);

		//削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	/**
	 * <h2>配送コースマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースからセンタ取引先マスタデータを取得する。
	 * 対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 配送コースマスタ：配送コースID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MDeliveryCourse> 配送コースマスタリスト
	 */
	public List<MDeliveryCourse> selectById(MDeliveryCourse header, ErrorStatus errSts) {

		List<MDeliveryCourse> result = null;
		//===== 編集データ取得 =====

		//削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		cb.setupSelect_MCarrier();

        //配送コースIDの設定
        cb.query().setDeliveryCourseId_Equal(header.getDeliveryCourseId());

        //センタIDの設定
        cb.query().setCenterId_Equal(header.getCenterId());

        //==== 配送コースマスタ検索実行 =====
        result = mDeliveryCourseBhv.selectList(cb);

        mDeliveryCourseBhv.loadMCenterCustomerList(result, new ConditionBeanSetupper<MCenterCustomerCB>() {
			public void setup(MCenterCustomerCB mCenterCustomerCB) {

				mCenterCustomerCB.setupSelect_MCustomer();
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

}