package com.oneslogi.wms.resources.assist;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.wms.dto.assist.DeliveryCourseSearchSDDto;
import com.oneslogi.wms.logic.assist.DeliveryCourseListSelectLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * SD用配送コースマスタ検索画面のリソースクラス。
 */
@Path("/assist/deliveryCourseSearchSD")
public class DeliveryCourseSearchSDResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 配送コースマスタデータ取得異常
		 */
		protected static final int DELIVERY_COURSE_GET_FAILED = 2;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;

	@Inject
	private DeliveryCourseListSelectLogic deliveryCourseListSelectLogic;

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return DeliveryCourseSearchSDDto SD用配送コースマスタ検索画面ヘッダ情報
	 */

	@GET
	@Path("/initNew")
	public DeliveryCourseSearchSDDto initNew(){

		return new DeliveryCourseSearchSDDto();
	}

	/**
	 * <h2>検索</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @param deliveryCourseSearchSDDto SD用配送コースマスタ検索画面用DTO
	 * @return DeliveryCourseSearchSDDto SD用配送コースマスタ検索画面用DTO
	 */

	@GET
	@Path("/search")
	public DeliveryCourseSearchSDDto search(DeliveryCourseSearchSDDto deliveryCourseSearchSDDto){

		// CenterIdを取得
		MCenter mCenter = new MCenter();

		mCenter.setCenterCd(deliveryCourseSearchSDDto.data.head.getMCenter().getCenterCd());

		Long centerId = centerLogic.getUkEntityWithDeletedCheck(mCenter).getCenterId();

		MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper();

		MDeliveryCourse header = mapper.mappingToEntity(deliveryCourseSearchSDDto.data.head);

		header.setCenterId(centerId);

		// 配送コース検索データ取得.検索データ取得メソッドを呼出し
		PagingResultBean<MDeliveryCourse> page = deliveryCourseListSelectLogic.select(header,
			deliveryCourseSearchSDDto.paging, errRetSts(StatusCode.DELIVERY_COURSE_GET_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		// SD用配送コースマスタ検索画面用DTOデータセット
		// Dto変換処理
		deliveryCourseSearchSDDto.data.list = mapper.mappingToDtoList(page);

		return deliveryCourseSearchSDDto;
	}

}