package com.oneslogi.wms.resources.shipping;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oneslogi.base.dbflute.dto.TShippingInstBDto;
import com.oneslogi.base.dbflute.dto.TShippingInstHDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstBDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ProductShippingListDto;
import com.oneslogi.wms.dto.shipping.ProductShippingListDto.SearchFooterData;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.shipping.DeliveryCourseShippingUpdateLogic;
import com.oneslogi.wms.logic.shipping.ProductShippingListSelectLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingDateUpdateLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.logic.shipping.ZipUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
@Path("/shipping/productShippingList")
public class ProductShippingListResource extends AbstractWmsResource {

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
		 * 商品別出荷一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_ERROR = 3;
		/**
		 * 日付一括変更異常
		 */
		protected static final int DATE_UPDATE_ERROR = 4;
		/**
		 * 配送コース一括変更異常
		 */
		protected static final int DELIVERY_COURSE_UDPATE_ERROR = 5;
		/**
		 * 郵便番号一括変異常
		 */
		protected static final int ZIP_UDPATE_ERROR = 6;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UDPATE_ERROR = 7;
		/**
		 * 日付異常
		 */
		protected static final int DATE_ERROR = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProductShippingListSelectLogic selectLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ShippingDateUpdateLogic shippingDateUpdateLogic;
	@Inject
	private DeliveryCourseShippingUpdateLogic deliveryCourseShippingUpdateLogic;
	@Inject
	private ZipUpdateLogic zipUpdateLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private ZipLogic zipLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;

	/**
	 * <h2>初期処理(通常)</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return ProductShippingListDto 商品別出荷一覧画面用DTO
	 */
	@GET
	@Path("/initUsually")
	public ProductShippingListDto initUsually() {
		return new ProductShippingListDto();
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * ・商品別出荷一覧DTOをキーに商品別出荷一覧データ取り出し
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return ProductShippingListDto 商品別出荷一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public ProductShippingListDto search(ProductShippingListDto productShippingListDto) {
		ProductShippingListDto resultProductShippingListDto = new ProductShippingListDto();

		// Entity変換
		TShippingInstHDtoMapper headerMapper1 = new TShippingInstHDtoMapper();
		TShippingInstH tShippingInstH = headerMapper1.mappingToEntity(productShippingListDto.data.search);

		// 商品別出荷一覧取得用
		List<TShippingInstB> page = selectLogic.select(tShippingInstH, productShippingListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultProductShippingListDto;
		}

		// Dto変換処理
		TShippingInstBDtoMapper mapper = new TShippingInstBDtoMapper();
		List<TShippingInstBDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultProductShippingListDto.paging = productShippingListDto.paging;

		resultProductShippingListDto.data.list = list;
//		for (TShippingInstBDto selectBody : list) {
//			resultProductShippingListDto.data.list.add(ProductShippingListDto.chaseTShippingInstBDto(selectBody));
//		}

		return resultProductShippingListDto;
	}

	/**
	 * <h2>日付一括変更処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、日付一括変更処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/dateUpdate")
	public StatusDto dateUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.19 matsumoto Start
		if (checkWorkShipDtWithSystemDt(productShippingListDto)) {
			// 作業日/出荷日 < システム管理日付の場合
			this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.DATE_BEFORE_CANNOT_CHANGE_ERROR);
			return null;
		}
		// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.19 matsumoto End

		//作業日/出荷日
		String workShippingDtFlg = productShippingListDto.data.shippingInstFooter.workShippingDtFlg;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		int countTShippingInstH = 0;
        String ShippingSlipNoTemp = "";
		for (TShippingInstBDto list : productShippingListDto.data.list) {
			if (!ShippingSlipNoTemp.equals(list.getTShippingInstH().getShippingSlipNo()) ) {
				countTShippingInstH = countTShippingInstH + 1;
				ShippingSlipNoTemp = list.getTShippingInstH().getShippingSlipNo();
			} else {
				continue;
			}
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setControlNo(list.getTShippingInstH().getControlNo());
			entityTShippingInstH.setClientId(list.getTShippingInstH().getClientId());
			entityTShippingInstH.setCenterId(list.getTShippingInstH().getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getTShippingInstH().getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getTShippingInstH().getUpdDt());//更新日時
			listTShippingInstH.add(entityTShippingInstH);
			//countTShippingInstH = countTShippingInstH + 1;
		}
		//出荷状態チェック
		shipStatusCheckLogic.dateUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}
		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UDPATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		//エンティティの編集
		TShippingInstH tShippingInstH = new TShippingInstH();//出荷指示ヘッダ
		if ("0".equals(workShippingDtFlg)) {//作業日
			tShippingInstH.setWorkDt(productShippingListDto.data.shippingInstFooter.workShippingDt);
			tShippingInstH.setShippingWorkDtFlg(0);
		}
		if ("1".equals(workShippingDtFlg)) {//出荷日
			tShippingInstH.setShippingDt(productShippingListDto.data.shippingInstFooter.workShippingDt);
			tShippingInstH.setShippingWorkDtFlg(1);
		}
		tShippingInstH.setControlNo(controlNo);

		//日付一括変更処理
		shippingDateUpdateLogic.update(tShippingInstH);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UDPATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	/**
	 * <h2>配送コース一括変更処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、配送コース一括変更処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/deliveryCourseUpdate")
	public StatusDto deliveryCourseUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		centerCondition.setCenterCd(productShippingListDto.data.search.getMCenter().getCenterCd());
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		//配送コースCD
		String deliveryCourseCd = productShippingListDto.data.shippingInstFooter.deliveryCourseCd;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		int countTShippingInstH = 0;
		String ShippingSlipNoTemp = "";
		for (TShippingInstBDto list : productShippingListDto.data.list) {
			if (!ShippingSlipNoTemp.equals(list.getTShippingInstH().getShippingSlipNo()) ) {
				countTShippingInstH = countTShippingInstH + 1;
				ShippingSlipNoTemp = list.getTShippingInstH().getShippingSlipNo();
			} else {
				continue;
			}
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setControlNo(list.getTShippingInstH().getControlNo());
			entityTShippingInstH.setClientId(list.getTShippingInstH().getClientId());
			entityTShippingInstH.setCenterId(list.getTShippingInstH().getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getTShippingInstH().getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getTShippingInstH().getUpdDt());//更新日時
			listTShippingInstH.add(entityTShippingInstH);
			//countTShippingInstH = countTShippingInstH + 1;
		}

		//出荷状態チェック
		shipStatusCheckLogic.deliveryCouseUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		MDeliveryCourse mDeliveryCourseEntity = new MDeliveryCourse();
		mDeliveryCourseEntity.setCenterId(centerId);
		mDeliveryCourseEntity.setDeliveryCourseCd(deliveryCourseCd);
		MDeliveryCourse mDeliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourseEntity);
		if (mDeliveryCourse == null) {
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			this.getErrorManager().add(errRetSts(errRetSts(StatusCode.DELIVERY_COURSE_UDPATE_ERROR), StatusCode.DELIVERY_COURSE_UDPATE_ERROR), WmsMessageConst.DELIVERY_COURSE_CD_NOT_FOUND_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UDPATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		//エンティティの編集
		TShippingInstH tShippingInstH = new TShippingInstH();//出荷指示ヘッダ
		tShippingInstH.setDeliveryCourseCd(productShippingListDto.data.shippingInstFooter.deliveryCourseCd);
		tShippingInstH.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
		tShippingInstH.setControlNo(controlNo);

		//配送コース付一括変更処理
		deliveryCourseShippingUpdateLogic.update(tShippingInstH);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UDPATE_ERROR));

		//出荷状態チェック
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	/**
	 * <h2>郵便番号一括変更処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、郵便番号一括変更処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/zipUpdate")
	public StatusDto zipUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		//郵便番号
		String zipCd = productShippingListDto.data.shippingInstFooter.zipCd;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		int countTShippingInstH = 0;
		String ShippingSlipNoTemp = "";
		for (TShippingInstBDto list : productShippingListDto.data.list) {
			if (!ShippingSlipNoTemp.equals(list.getTShippingInstH().getShippingSlipNo()) ) {
				countTShippingInstH = countTShippingInstH + 1;
				ShippingSlipNoTemp = list.getTShippingInstH().getShippingSlipNo();
			} else {
				continue;
			}
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setControlNo(list.getTShippingInstH().getControlNo());
			entityTShippingInstH.setClientId(list.getTShippingInstH().getClientId());
			entityTShippingInstH.setCenterId(list.getTShippingInstH().getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getTShippingInstH().getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getTShippingInstH().getUpdDt());//更新日時
			listTShippingInstH.add(entityTShippingInstH);
			//countTShippingInstH = countTShippingInstH + 1;
		}
		//出荷状態チェック
		shipStatusCheckLogic.postCodeUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		MZip mZipEntity = new MZip();
		mZipEntity.setZipCd(zipCd);
		boolean result = zipLogic.checkZipCd(mZipEntity);
		if (result) {
			this.getErrorManager().add(errRetSts(errRetSts(StatusCode.ZIP_UDPATE_ERROR), StatusCode.ZIP_UDPATE_ERROR), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UDPATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		//エンティティの編集
		TShippingInstH tShippingInstH = new TShippingInstH();//出荷指示ヘッダ
		tShippingInstH.setDelivZipCd(zipCd);

		tShippingInstH.setControlNo(controlNo);

		//郵便番号一括変更処理
		zipUpdateLogic.update(tShippingInstH);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UDPATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	/**
	 * <h2>チェック処理(日付一括変更)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、日付一括変更処理クラスを呼出し、完了メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDateUpdate")
	public StatusDto checkDateUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		for (TShippingInstBDto list : productShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setControlNo(list.getTShippingInstH().getControlNo());
			entityTShippingInstH.setClientId(list.getTShippingInstH().getClientId());
			entityTShippingInstH.setCenterId(list.getTShippingInstH().getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getTShippingInstH().getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		shipStatusCheckLogic.dateUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {

			String workShippingDt = productShippingListDto.data.shippingInstFooter.workShippingDt;
			String workShippingDtFlg = productShippingListDto.data.shippingInstFooter.workShippingDtFlg;

			for (TShippingInstBDto list : productShippingListDto.data.list) {
				if ("0".equals(workShippingDtFlg)) {
					if (workShippingDt.compareTo(list.getTShippingInstH().getShippingDt()) > 0) {
						this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.WORK_DATE_CANNOT_CHANGE_BEFORE_SHIO_DATE_ERROR);
						return null;
					}
				} else if ("1".equals(workShippingDtFlg)) {
					if (workShippingDt.compareTo(list.getTShippingInstH().getWorkDt()) < 0) {
						this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR);
						return null;
					}

					// [新WMS-110-034] 出荷日<=納品予定日、出荷日<=納品指定日のチェックを追加 2015.07.29 kawana Start
					String delivPlanDt = list.getTShippingInstH().getDelivPlanDt();
					if (!CU.isNullOrEmpty(delivPlanDt)) {
						// 出荷日>納品予定日の場合
						if (workShippingDt.compareTo(delivPlanDt) > 0) {
							this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_PLAN_DATE_ERROR);
							return null;
						}
					}

					String delivDt = list.getTShippingInstH().getDelivDt();
					if (!CU.isNullOrEmpty(delivDt)) {
						// 出荷日>納品指定日の場合
						if (workShippingDt.compareTo(delivDt) > 0) {
							this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_DATE_ERROR);
							return null;
						}
					}
					// [新WMS-110-034] 出荷日<=納品予定日、出荷日<=納品指定日のチェックを追加 2015.07.29 kawana End
				}
			}
			// [品質検査対応][Ver3.1][#5656] 日付一括変更処理内で行っていた入力チェックを追加 2018.11.19 matsumoto Start
			if (checkWorkShipDtWithSystemDt(productShippingListDto)) {
				// 作業日/出荷日 < システム管理日付の場合
				this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.DATE_BEFORE_CANNOT_CHANGE_ERROR);
				return null;
			}
			// [品質検査対応][Ver3.1][#5656] 日付一括変更処理内で行っていた入力チェックを追加 2018.11.19 matsumoto End

			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;

	}

	/**
	 * <h2>チェック処理(配送コース一括変更)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDeliveryCourseUpdate")
	public StatusDto checkDeliveryCourseUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (TShippingInstBDto list : productShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setControlNo(list.getTShippingInstH().getControlNo());
			entityTShippingInstH.setClientId(list.getTShippingInstH().getClientId());
			entityTShippingInstH.setCenterId(list.getTShippingInstH().getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getTShippingInstH().getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}
		shipStatusCheckLogic.deliveryCouseUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;

	}

	/**
	 * <h2>チェック処理(郵便番号一括変更)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkZipUpdate")
	public StatusDto checkZipUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (TShippingInstBDto list : productShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setControlNo(list.getTShippingInstH().getControlNo());
			entityTShippingInstH.setClientId(list.getTShippingInstH().getClientId());
			entityTShippingInstH.setCenterId(list.getTShippingInstH().getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getTShippingInstH().getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}
		shipStatusCheckLogic.postCodeUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;

	}

	/**
	 * <h2>チェック処理(指示修正)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、指示修正処理クラスを呼出し、完了メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkOrderUpdate")
	public StatusDto checkOrderUpdate(ProductShippingListDto productShippingListDto) throws Exception {

		productShippingListDto = decodeString(productShippingListDto);

		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (TShippingInstBDto list : productShippingListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getTShippingInstH().getShippingStatus());
			entityTShippingInstH.setInputType(list.getTShippingInstH().getInputType());
			listTShippingInstH.add(entityTShippingInstH);
		}
		shipStatusCheckLogic.orderUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}
		//		} else {
		//			// 確認表示
		//			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		//		}
		return null;

	}

	/**
	 * Base64で受け取ったリクエストデータを本来のDtoに変換する。
	 * ※JS側で20項目以上の連想配列が、6層以上存在すると、IE11でメモリクラッシュする為、送信データをコンバートし対応
	 */
	private ProductShippingListDto decodeString(ProductShippingListDto dto) throws Exception {

		if (dto.data.searchBase64 == null && dto.data.listBase64 == null && dto.data.shippingInstFooterBase64 == null) {
			return dto;
		}

		ProductShippingListDto retDto = new ProductShippingListDto();
		ObjectMapper mapper = new ObjectMapper();

		if (dto.data.searchBase64 != null) {
			String search = new String(Base64.decodeBase64(dto.data.searchBase64), StandardCharsets.UTF_8);
			retDto.data.search = mapper.readValue(search, TShippingInstHDto.class);
			dto.data.searchBase64 = null;
		}

		if (dto.data.listBase64 != null) {
			String list = new String(Base64.decodeBase64(dto.data.listBase64), StandardCharsets.UTF_8);
			retDto.data.list = mapper.readValue(list, mapper.getTypeFactory().constructCollectionType(List.class, TShippingInstBDto.class));
			dto.data.listBase64 = null;
		}

		if (dto.data.shippingInstFooterBase64 != null) {
			String shippingInstFooter = new String(Base64.decodeBase64(dto.data.shippingInstFooterBase64), StandardCharsets.UTF_8);
			retDto.data.shippingInstFooter = mapper.readValue(shippingInstFooter, SearchFooterData.class);
			dto.data.shippingInstFooterBase64 = null;
		}

		return retDto;
	}


	// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.21 matsumoto Start
	/**
	 * <h2>チェック処理(日付一括変更)</h2>
	 * <pre>
	 * 入力された作業日/出荷日とシステム管理日付のチェックを行う
	 * 作業日/出荷日 ＜ システム管理日付の場合、trueを返す
	 * </pre>
	 * @param productShippingListDto 商品別出荷一覧画面用DTO
	 * @return boolean
	 */
	private boolean checkWorkShipDtWithSystemDt(ProductShippingListDto productShippingListDto) {

		boolean hasError = false;
		// 入力された作業日/出荷日
		String workShippingDt = productShippingListDto.data.shippingInstFooter.workShippingDt;

		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setCenterId(productShippingListDto.data.list.get(0).getTShippingInstH().getCenterId());
		mClientCenter.setClientId(productShippingListDto.data.list.get(0).getTShippingInstH().getClientId());
		// システム管理日付の取得
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// 作業日/出荷日 < システム管理日付のチェック
		if (workShippingDt.compareTo(mClientCenter.getSystemDt()) < 0) {
			hasError = true;
		}

		return hasError;
	}
	// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.21 matsumoto End

}
// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End