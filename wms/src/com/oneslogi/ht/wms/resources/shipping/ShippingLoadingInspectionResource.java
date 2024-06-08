package com.oneslogi.ht.wms.resources.shipping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtLoadingDto;
import com.oneslogi.base.dbflute.dtomapper.WHtLoadingDtoMapper;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.WHtLoading;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.shipping.ShippingLoadingInspectionDto;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLoadingInspectionSelectLogic;
import com.oneslogi.ht.wms.logic.shipping.ShippingLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

/**
 * 積込検品再開Resourceクラスです。
 *
 */
@Path("/handy/ShippingLoadingInspection")
@HandyErrorReturnPath(returnURL = "ShippingLoadingInspection/reopenProcess")
public class ShippingLoadingInspectionResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ShippingLoadingInspectionSelectLogic selectLogic;


	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String traceOrPackingNo) throws Exception {

		ShippingLoadingInspectionResource.createSession(this, util, selectLogic);

		ShippingLoadingInspectionNoResource.load(this,util,selectLogic);
	}


	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, ShippingLoadingInspectionSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//積込検品情報の初期化
		ShippingLoadingInspectionDto dto = new ShippingLoadingInspectionDto();

		WHtLoadingDto wHtLoadingDto = dto.getwHtLoadingDto();

		wHtLoadingDto.setCenterId(loginInfo.getCenterId());

		wHtLoadingDto.setClientId(loginInfo.getClientId());

		wHtLoadingDto.setMacAddress(util.getMacAddress(ses));

		wHtLoadingDto.setUpdUser(loginInfo.getUserCd());

		ses.setAttribute("ShippingLoadingInspectionDto", dto);
	}
	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * <pre>
	 * </pre>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ShippingLogic shippingLogic) throws Exception{

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto) ses.getAttribute("ShippingLoadingInspectionDto");
		WHtLoadingDto wHtLoadingDto = dto.getwHtLoadingDto();

		WHtLoadingDtoMapper wHtLoadingDtoMapper = new WHtLoadingDtoMapper();
		WHtLoading wHtLoading = wHtLoadingDtoMapper.mappingToEntity(wHtLoadingDto);

		// 積込ワークデータをクリア
		shippingLogic.clearWHtLoading(wHtLoading);

		util.clearHtComCtl(ses);

		ses.removeAttribute("ShippingLoadingInspectionDto");
	}

	/**
	 * 入力したデータが出荷梱包テーブルの
	 * 貨物追跡No又は出荷梱包Noに存在するかチェック処理
	 *
	 * @param resource
	 * @param util
	 * @param checkLogic
	 * @return true:存在  false:不在
	 */
	public static boolean checkExistCarrierTraceNumOrShippingPackingNo(HandyResourceBase resource,HandyCommonUtil util,
			ShippingLoadingInspectionCheckLogic checkLogic){

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ShippingLoadingInspectionDto dto = (ShippingLoadingInspectionDto)ses.getAttribute("ShippingLoadingInspectionDto");
		WHtLoadingDto wHtLoadingDto = dto.getwHtLoadingDto();

		WHtLoadingDtoMapper wHtLoadingDtoMapper = new WHtLoadingDtoMapper();
		WHtLoading wHtLoading = wHtLoadingDtoMapper.mappingToEntity(wHtLoadingDto);

		TPackingH tPackingH = checkLogic.checkExistCarrierTraceNum(wHtLoading,dto.getTraceOrPackingNo());
		if(tPackingH != null){
			if(tPackingH.isLoadingFlg$1()){
				resource.getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_CARRIER_TRACE_NUM_LOAD_COMPLETE);
				return false;
			}
			dto.getwHtLoadingDto().setCarrierTraceNum(tPackingH.getCarrierTraceNum());
			dto.setFinishDeliveryCourseNm(tPackingH.getTAllocInstH().getMDeliveryCourse().getDeliveryCourseNm());
			//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 Start
			//存在する場合、出庫作業Noチェックを行う
			if (!checkLogic.checkPickingWorkNo(tPackingH)) {
				return false;
			}
			//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 End
		}else{
			tPackingH = checkLogic.checkExistShippingPackingNo(wHtLoading, dto.getTraceOrPackingNo());
			if(tPackingH != null){
				if(tPackingH.isLoadingFlg$1()){
					resource.getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_SHIPPING_PACKING_NO_LOAD_COMPLETE);
					return false;
				}
				dto.getwHtLoadingDto().setShippingPackingNo(tPackingH.getShippingPackingNo());
				dto.setFinishDeliveryCourseNm(tPackingH.getTAllocInstH().getMDeliveryCourse().getDeliveryCourseNm());
				//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 Start
				//存在する場合、出荷梱包Noチェックを行う
				if (!checkLogic.checkShippingPackingNo(tPackingH)) {
					return false;
				}
				//#2212 出荷停止フラグによる作業停止機能の追加 By K.CHO 2017/08/24 End
			}
			else{
				resource.getErrorManager().add(new ErrorStatus(),WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
				return false;
			}
		}
		return true;
	}


}
