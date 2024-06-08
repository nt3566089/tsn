package com.oneslogi.wms.logic.assist;

import javax.inject.Inject;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MDeliveryCourseCB;
import com.oneslogi.base.dbflute.exbhv.MDeliveryCourseBhv;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 配送コースマスタデータ取得ロジッククラス
 */
public class DeliveryCourseListSelectLogic extends AbstractWmsLogic {

	//===== 使用テーブル =====
	@Inject
	private MDeliveryCourseBhv mDeliveryCourseBhv;

	/**
	 * <h2>配送コースマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから配送コースマスタデータを取得する。
	 * 検索対象が見つからない場合、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 配送コースマスタ：配送コースCD・配送コース名称・センタID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MDeliveryCourse> 配送コースマスタリスト
	 */
	public PagingResultBean<MDeliveryCourse> select(MDeliveryCourse header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MDeliveryCourse> result = null;

		//===== 配送コースデータ取得 =====

		//検索条件の設定
		MDeliveryCourseCB cb = mDeliveryCourseBhv.newMyConditionBean();
		cb.setupSelect_MCarrier();
		//荷主センタ変更対応 201７.02.08 sja Start
		cb.setupSelect_MCenter();
		//荷主センタ変更対応 201７.02.08 sja End
		//センタIDの設定
		cb.query().setCenterId_Equal(header.getCenterId());

		//配送コースCDの設定
		cb.query().setDeliveryCourseCd_PrefixSearch(header.getDeliveryCourseCd());

		//配送コース名称の設定
		cb.query().setDeliveryCourseNm_LikeSearch(header.getDeliveryCourseNm(), new LikeSearchOption().likeContain());

		//ソート順の設定
		cb.query().addOrderBy_DeliveryCourseCd_Asc();

		//===== 配送コースマスタ検索実行 =====
		result = selectPage(mDeliveryCourseBhv, cb, paging);

		//===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}

		return result;
	}
}