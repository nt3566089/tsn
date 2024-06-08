////////////////////////////////////////////////////////////////////////////////
// Date:
//     Wed Nov 18 13:27:58 CST 2015
// changed by:coverage tool (Language:Java, Version :08-02)
////////////////////////////////////////////////////////////////////////////////
package com.oneslogi.wms.logic.master;
import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MBoxGrpCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
// MAULA Code

/**
 * 荷材グループマスタメンテナンス取得ロジッククラス
 */
public class BoxGroupMasterSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MBoxGrpBhv mboxgrpBhv;
	/**
	 * <h2>荷材グループマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷材グループマスタメンテナンス情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mBoxGrp 荷材グループマスタ：削除フラグ・センタID・荷材グループCD・荷材グループ名称
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MBoxGrp> 荷材グループマスタリスト
	 */
	public PagingResultBean<MBoxGrp> select(MBoxGrp mBoxGrp, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MBoxGrp> result = null;
		//==== 荷材グループメンテナンスデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);
		// 検索条件の設定
		MBoxGrpCB cb = mboxgrpBhv.newMyConditionBean();
		cb.setupSelect_MBox();
		cb.setupSelect_MBox().withMCenter();
		//荷主センタ変更対応 201７.01.23 sja Start
		cb.setupSelect_MCenter();
		//荷主センタ変更対応 201７.01.23 sja End
		//削除フラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
		// センタIDの設定
		cb.query().setCenterId_Equal(mBoxGrp.getCenterId());
		// 荷材グループCDの設定
		cb.query().setBoxGrpCd_PrefixSearch(mBoxGrp.getBoxGrpCd());
		// 荷材グループ名称の設定
		cb.query().setBoxGrpNm_LikeSearch(mBoxGrp.getBoxGrpNm(), new LikeSearchOption().likeContain());
		cb.query().setDelFlg_Equal(mBoxGrp.getDelFlg());

		// ソート順の設定
		cb.query().queryMBox().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().addOrderBy_BoxGrpCd_Asc();

		// ===== 荷材グループメンテナンスマスタ検索実行 =====
		result = selectPage(mboxgrpBhv, cb, paging);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}else{
			return result;
		}
  	}
}
