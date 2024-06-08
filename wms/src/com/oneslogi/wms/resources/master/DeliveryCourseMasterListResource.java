package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dtomapper.MDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.wms.dto.master.DeliveryCourseMasterListDto;
import com.oneslogi.wms.logic.common.CarrierLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.DeliveryCourseMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 配送コースマスタメンテナンス(一覧)のリソースクラス。
 */
@Path("/master/deliveryCourseMasterList")
public class DeliveryCourseMasterListResource extends AbstractWmsResource {

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
		 * 配送コースマスタメンテナンス(一覧)データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DeliveryCourseMasterSelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CarrierLogic carrierLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・配送コースマスタメンテナンス(一覧)画面用DTOの作成
	 * </pre>
	 * @return deliveryCourseMasterListDto 配送コースマスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public DeliveryCourseMasterListDto init() {

		// 画面用DTO作成
		DeliveryCourseMasterListDto deliveryCourseMasterListDto = new DeliveryCourseMasterListDto();

		return deliveryCourseMasterListDto;
	}

	/**
	 * <h2>配送コースマスタメンテナンス(一覧)データ取得。</h2>
	 * <pre>
	 * ・データベースに配送コースマスタメンテナンス(一覧)データを取得する
	 * </pre>
	 * @param deliveryCourseMasterListDto 配送コースマスタメンテナンス(一覧)画面用DTO
	 * @return deliveryCourseMasterListDto 配送コースマスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/search")
	public DeliveryCourseMasterListDto search(DeliveryCourseMasterListDto deliveryCourseMasterListDto) {

		// Entity変換
		MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourse mDeliveryCourse = mapper.mappingToEntity(deliveryCourseMasterListDto.data.head);

		MCenter mCenter = mDeliveryCourse.getMCenter();
		mCenter = centerLogic.getUkEntity(mCenter);
		mDeliveryCourse.setCenterId(mCenter.getCenterId());

		MCarrier mCarrier = mDeliveryCourse.getMCarrier();
		mCarrier.setCenterId(mCenter.getCenterId());

		mCarrier.setCarrierCd(deliveryCourseMasterListDto.data.head.getMCarrier().getCarrierCd());
		mCarrier = carrierLogic.getUkEntity(mCarrier);
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		if(mCarrier != null){
			if(mCarrier.getCarrierId() != null){
				mDeliveryCourse.setCarrierId(mCarrier.getCarrierId());
			}
		}

		// 配送コースマスタ取得用
		PagingResultBean<MDeliveryCourse> page = selectLogic.selectByConditions(mDeliveryCourse, deliveryCourseMasterListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Dto変換処理
		List<MDeliveryCourseDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		deliveryCourseMasterListDto.data.body = list;

		return deliveryCourseMasterListDto;
	}

}
