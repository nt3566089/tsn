package com.oneslogi.ht.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.TPackingBCB;
// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dto.WHtLoadingDto;
import com.oneslogi.base.dbflute.dtomapper.MDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WHtLoadingDtoMapper;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionNoDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionInsertLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionUpdateLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogMergeEnd;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;
import com.oneslogi.wms.core.WCC;

/**
 * 積込検品(No)画面Resourceクラスです。
 *
 */
@Path("/handy/ShippingLoadingInspectionNo")
@HandyErrorReturnPath(returnURL = "ShippingLoadingInspectionNo/display")
public class ShippingLoadingInspectionNoResource extends HandyResourceBase {

	private static final String NOT_SET_DELIVERY_COURSE_CD = "NOTSET";
	// [ONEsLOGI Cloud/WMS 2.1.0開発 バグ #527]対応 2016/12/22 mod nayzaw Start
	private static final String NOT_SET_DELIVERY_COURSE_NAME = "指定無し";
	// [ONEsLOGI Cloud/WMS 2.1.0開発 バグ #527]対応 2016/12/22 mod nayzaw End

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLoadingInspectionSelectLogic selectLogic;
	@Inject
	private ShippingLoadingInspectionUpdateLogic updateLogic;
	@Inject
	private ShippingLoadingInspectionCheckLogic checkLogic;
	@Inject
	private ShippingLoadingInspectionInsertLogic insertLogic;
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

	/**
	 * パラピッキング(出庫作業No入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("ShippingLoadingInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void load() throws Exception {
		//自画面初期化
		load(this, util, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, ShippingLoadingInspectionSelectLogic selectLogic) throws Exception {

		//機能単位セッションを処理化
		ShippingLoadingInspectionResource.createSession(resource, util, selectLogic);

		//自画面表示
		display(resource, util,selectLogic);
	}

	/**
	 * 積込検品(No)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util,selectLogic);
	}
	public static void display(HandyResourceBase resource, HandyCommonUtil util,ShippingLoadingInspectionSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");

		MDeliveryCourseDto mDeliveryCourseDto = dto.getmDeliveryCourseDto();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");


		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW Strat

		// 画面初期設定
		resource.initScreen("ShippingLoadingInspectionNoHT");
		// オプションボタン１設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("ShippingLoadingInspectionList/load?backUrl=ShippingLoadingInspectionNo/display")
				.itemCd("option1")
				.build());
		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder()
		        .url("ShippingLoadingInspectionDeliveryCourseSelect/load?backUrl=ShippingLoadingInspectionNo/display")
				.itemCd("option2")
			    .build());

		//キャンセル確認画面へ遷移
		resource.setReturnButton(ButtonInfo.builder().url("ShippingLoadingInspectionCancel/load").itemCd("return").build());

		// [#1993] F3をENTと同じ動作に変更 2017.07.03 kawana Start

		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ShippingLoadingInspectionNo/input").itemCd("send").build());

		// [#1993] F3をENTと同じ動作に変更 2017.07.03 kawana End

		//フッタボタン（非表示）設定
		resource.setHideButton(ButtonInfo.builder().url("ShippingLoadingInspectionNo/input").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		//出庫作業No入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingLoadingInspectionNo.jsp", ses);

		// [#6551][v3.1] 致命的エラー発生対応(不要なif文を削除) 2019.06.28 kawana Delete

			if(!CU.isNullOrEmpty(mDeliveryCourseDto.getDeliveryCourseCd())){
				if(!mDeliveryCourseDto.getDeliveryCourseCd().equals(NOT_SET_DELIVERY_COURSE_CD)){
					MCenter mCenter = new MCenter();
					mCenter.setCenterId(loginInfo.getCenterId());

					MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
					mDeliveryCourse.setDeliveryCourseCd(mDeliveryCourseDto.getDeliveryCourseCd());

					MDeliveryCourse retMDeliveryCourse = selectLogic.getMDeliveryCourse(mCenter, mDeliveryCourse);

					MDeliveryCourseDtoMapper dtoMapper = new MDeliveryCourseDtoMapper();

					dto.setmDeliveryCourseDto(dtoMapper.mappingToDto(retMDeliveryCourse));

				}
				else{
					mDeliveryCourseDto.setDeliveryCourseNm(NOT_SET_DELIVERY_COURSE_NAME);

					dto.setmDeliveryCourseDto(mDeliveryCourseDto);
				}

				ses.setAttribute("ShippingLoadingInspectionDto", dto);

			// [#6551][v3.1] 致命的エラー発生対応(不要なif文を削除) 2019.06.28 kawana Delete
		}
		else{
			MDeliveryCourseDto notSetMDeliveryCourseDto = new MDeliveryCourseDto();
			notSetMDeliveryCourseDto.setDeliveryCourseCd(NOT_SET_DELIVERY_COURSE_CD);
			notSetMDeliveryCourseDto.setDeliveryCourseNm(NOT_SET_DELIVERY_COURSE_NAME);

			dto.setmDeliveryCourseDto(notSetMDeliveryCourseDto);
		}
	}

	/**
	 * 貨物追跡Noまたは出荷梱包Noを入力しENT時にコールされるメッソドです
	 * 入力チェックを行い梱包ヘッダテーブルの積込フラグを更新
	 * @param bean 積込検品検品(No)画面用Dto
	 * @throws Exception
	 */
	@GET
	@Path("/input")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogMergeEnd("ShippingLoadingInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void input(@BeanParam ShippingLoadingInspectionNoDto bean) throws Exception{

		boolean deliveryCourseFlg = false;

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto)ses.getAttribute("ShippingLoadingInspectionDto");
		WHtLoadingDto wHtLoadingDto = dto.getwHtLoadingDto();

		WHtLoadingDtoMapper wHtLoadingDtoMapper = new WHtLoadingDtoMapper();
		WHtLoading wHtLoading = wHtLoadingDtoMapper.mappingToEntity(wHtLoadingDto);

		// [#575] ValidateチェックのHT国際化 2017.02.15 sja Start
        // 入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.15 sja End

		dto.setTraceOrPackingNo(bean.getTraceOrPackingNo());

		// [#4256] 基盤のエラーチェック内容と同じエラーチェックを削除 2018.04.20 fujiwara Del

		if(!ShippingLoadingInspectionResource.checkExistCarrierTraceNumOrShippingPackingNo(this, util, checkLogic)){
			return;
		}

		if(dto.getwHtLoadingDto().getCarrierTraceNum() != null){
			wHtLoading.setCarrierTraceNum(dto.getwHtLoadingDto().getCarrierTraceNum());
		}else if (dto.getwHtLoadingDto().getShippingPackingNo() != null){
			wHtLoading.setShippingPackingNo(dto.getwHtLoadingDto().getShippingPackingNo());
		}

		// 配送コース情報チェック
		if(dto.getmDeliveryCourseDto() != null){
			if(dto.getmDeliveryCourseDto().getDeliveryCourseCd().equals(NOT_SET_DELIVERY_COURSE_CD)){
				// 配送コース設定しない場合
				deliveryCourseFlg = true;
			}else{
				// 配送コース設定した場合、出荷指示時の設定した配送コースと異なってるかチェック
				MDeliveryCourseDtoMapper mDeliveryCourseDtoMapper = new MDeliveryCourseDtoMapper();
				MDeliveryCourse mDeliveryCourse = mDeliveryCourseDtoMapper.mappingToEntity(dto.getmDeliveryCourseDto());
				deliveryCourseFlg = checkLogic.checkDeliveryCourse(wHtLoading, mDeliveryCourse);
				// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #524]対応 2016.12.21 nayzaw Add Start
				if(!deliveryCourseFlg){
					// 設定した配送コースと異なる場合、エラー
					this.getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DELIVERY_COURSE_CD_DIFF_ERROR);
				}
				// [ONEsLOGI Cloud/WMS 2.1.0開発 品質検査 バグ #524]対応 2016.12.21 nayzaw Add End
			}
		}

		if(!deliveryCourseFlg){
			// エラー画面表示
			return;
		}

		// 同じ出荷日・配送コースで出荷指示ステータスが出庫指示済以降のすべてのデータ梱包ヘッダ．積込フラグが'1'となっているデータ存在チェック

		boolean sameDataCompleteFlg = checkLogic.checkSameDeliveryDataComplete(wHtLoading);
		// [#3697] UOM対応 2018/02/12 PYM Del
		//積込ワーク登録
		if(!dto.getmDeliveryCourseDto().getDeliveryCourseCd().equals(NOT_SET_DELIVERY_COURSE_CD)){
			wHtLoading.setDeliveryCourseId(dto.getmDeliveryCourseDto().getDeliveryCourseId());
		}
		//通信制御データ作成
		util.setHtComCtl(ses, "ShippingLoadingInspection", dto.getTraceOrPackingNo());

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		// [#3697] UOM対応 2018/02/12 PYM Start
		TPackingHCB tPackingHCB = tPackingHBhv.newMyConditionBean();
		tPackingHCB.query().setCenterId_Equal(wHtLoading.getCenterId());
		tPackingHCB.query().setClientId_Equal(wHtLoading.getClientId());
		tPackingHCB.query().setCarrierTraceNum_Equal(wHtLoading.getCarrierTraceNum());
		tPackingHCB.query().setShippingPackingNo_Equal(wHtLoading.getShippingPackingNo());
		tPackingHCB.query().setLoadingFlg_Equal_$0();
		tPackingHCB.query().addOrderBy_PackingHId_Asc();
		tPackingHCB.fetchFirst(1);
		TPackingH entity = tPackingHBhv.selectEntity(tPackingHCB) ;

		// 総数量
		BigDecimal packingNumSumUsedByLog = WCC.ZERO;
		if(entity != null){
			// ===== 梱包数取得 =====
			TPackingBCB cbB = tPackingBBhv.newMyConditionBean();
			// ===== 検索条件 =====
			// 梱包ヘッダID
			cbB.query().setPackingHId_Equal(entity.getPackingHId());
			// ===== 検索実行 =====
			List<TPackingB> tPackingBList = tPackingBBhv.selectList(cbB);
			for (TPackingB packingB : tPackingBList) {
				packingNumSumUsedByLog = WCC.add(packingNumSumUsedByLog, packingB.getPackingNum());
			}
		}
		// 総数量
		setWorkLogQty(packingNumSumUsedByLog);
		// [#3697] UOM対応2018/02/12 PYM End
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		insertLogic.insertWHtLoading(wHtLoading);

		updateLogic.updateTPackingH(wHtLoading);

		// [2.1.0-CT-050] dtoの追跡No/梱包Noをnullに設定しているソースを外す 2016/11/16 nayzaw
		wHtLoading.setCarrierTraceNum(null);
		wHtLoading.setShippingPackingNo(null);
		wHtLoading.setDeliveryCourseId(null);
		wHtLoading.setPackingHId(null);

		dto.setwHtLoadingDto(wHtLoadingDtoMapper.mappingToDto(wHtLoading));

		if(sameDataCompleteFlg){

			ses.setAttribute("ShippingLoadingInspectionDto", dto);
			ShippingLoadingInspectionConfirmResource.load(this, util);
			return;
		}

		ses.setAttribute("ShippingLoadingInspectionDto", dto);

		ShippingLoadingInspectionNoResource.display(this, util, selectLogic);

	}



}
