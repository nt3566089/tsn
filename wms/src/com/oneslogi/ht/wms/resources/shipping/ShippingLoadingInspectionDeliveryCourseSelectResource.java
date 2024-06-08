package com.oneslogi.ht.wms.resources.shipping;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dtomapper.MDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDeliveryCourseSelectDto;
import com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 配送コース選択画面Resourceクラスです。
 */
@Path("/handy/ShippingLoadingInspectionDeliveryCourseSelect")
@HandyErrorReturnPath(returnURL = "ShippingLoadingInspectionDeliveryCourseSelect/display")
public class ShippingLoadingInspectionDeliveryCourseSelectResource extends HandyResourceBase {

	private static final String NOT_SET_DELIVERY_COURSE_CD = "NOTSET";
	// [ONEsLOGI Cloud/WMS 2.1.0開発 バグ #527]対応 2016/12/22 mod nayzaw Start
	private static final String NOT_SET_DELIVERY_COURSE_NAME = "指定無し";
	// [ONEsLOGI Cloud/WMS 2.1.0開発 バグ #527]対応 2016/12/22 mod nayzaw End

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLoadingInspectionSelectLogic selectLogic;

	/**
	 * 積込検品(完了確認)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception{
		//自画面初期化
		load(this,util,backUrl,selectLogic);
	}

	public static void load(HandyResourceBase resource,HandyCommonUtil util,String backUrl,ShippingLoadingInspectionSelectLogic selectLogic) throws Exception{

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");

		MDeliveryCourseDtoMapper mDeliveryCourseDtoMapper = new MDeliveryCourseDtoMapper();

		MCenter mCenter = new MCenter();
		mCenter.setCenterId(dto.getwHtLoadingDto().getCenterId());

		List<MDeliveryCourse> lstMDeliveryCourse = selectLogic.selectDeliveryCourseList(mCenter);

		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
		mDeliveryCourse.setDeliveryCourseCd(NOT_SET_DELIVERY_COURSE_CD);
		mDeliveryCourse.setDeliveryCourseNm(NOT_SET_DELIVERY_COURSE_NAME);

		lstMDeliveryCourse.add(0, mDeliveryCourse);

		ErrorManager errorManager = resource.getErrorManager();
		if (errorManager.size() > 0) {
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setBackUrl(backUrl);
		dto.setLstMDeliveryCourseDto(mDeliveryCourseDtoMapper.mappingToDtoList(lstMDeliveryCourse));
		ses.setAttribute("ShippingLoadingInspectionDto", dto);

		display(resource,util);

	}

	/**
	 * 配送コース選択画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util);
	}
	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();


		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW Strat

		// 画面初期設定
        resource.initScreen("ShippingLoadingInspectionDeliveryCourseSelectHT");
        //フッタボタン（非表示）設定
        resource.setHideButton(ButtonInfo.builder().url("ShippingLoadingInspectionDeliveryCourseSelect/send").build());
	    //フッタボタン（左）設定、
        resource.setReturnButton(ButtonInfo.builder().url("ShippingLoadingInspectionNo/display").itemCd("return").build());
        // [#2854] HT国際化対応(画面マスタ連携) 2017.10.25 LSW End

		util.setTransURL(HT_URI_BASE + "/wms/shipping/ShippingLoadingInspectionDeliveryCourseSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、積込検品(No)画面に遷移します。
	 * @param bean 積込検品配送コース選択画面情報を保持するDto
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam ShippingLoadingInspectionDeliveryCourseSelectDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");

		MDeliveryCourseDto mDeliveryCourseDto = dto.getmDeliveryCourseDto();

		mDeliveryCourseDto.setDeliveryCourseCd(bean.getDeliveryCourse());

		dto.setmDeliveryCourseDto(mDeliveryCourseDto);

		ses.setAttribute("ShippingLoadingInspectionDto", dto);

		//積込検品(No)画面表示
		ShippingLoadingInspectionNoResource.display(this, util, selectLogic);

	}

}
