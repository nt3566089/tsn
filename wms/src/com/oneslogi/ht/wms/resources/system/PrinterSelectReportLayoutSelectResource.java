package com.oneslogi.ht.wms.resources.system;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.PReportLayoutDtoMapper;
import com.oneslogi.base.dbflute.exentity.PReportLayout;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.master.ReportLayoutLogic;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.dto.system.PrinterSelectReportLayoutSelectDto;
import com.oneslogi.ht.wms.logic.system.PrinterSelectSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;

/**
 * 帳票レイアウト選択画面Resourceクラス
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectReportLayoutSelect")
@HandyErrorReturnPath(returnURL = "PrinterSelectReportLayoutSelect/display")
public class PrinterSelectReportLayoutSelectResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReportLayoutLogic reportLayoutLogic;
	@Inject
	private PrinterSelectSelectLogic selectLogic;


	/**
	 * 帳票レイアウト選択画面初期化処理
	 * @param backUrl
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception{
		load(this, util, backUrl, reportLayoutLogic);
	}

	/**
	 * 帳票レイアウト選択画面初期化処理
	 *
	 * @param resource    呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @param backUrl     戻る先
	 * @param logic       自動印刷データ登録ロジッククラス
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl, ReportLayoutLogic logic) throws Exception{

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		//List<PReportLayout> list = logic.getAutoPrintTargetLayoutList();

		// 使用可能なレイアウトを取得する。
		List<PReportLayout> list = logic.selectByVariableAttributes(
				resource.getReportLayoutAttribute1()
				, resource.isReportLayoutAttribute1Changed()
				, resource.getReportLayoutAttribute2()
				, resource.isReportLayoutAttribute2Changed()
				, resource.getReportLayoutAttribute3()
				, resource.isReportLayoutAttribute3Changed()
				, resource.getReportLayoutAttribute4()
				, resource.isReportLayoutAttribute4Changed()
				, resource.getReportLayoutAttribute5()
				, resource.isReportLayoutAttribute5Changed()
				, ReportLayoutLogic.AutoPrintTargetOnly.YES
				, ReportLayoutLogic.ExcludeReportLayoutData.YES);

		if(list.size() < 1){
			ErrorManager errorManager = resource.getErrorManager();
			errorManager.add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}

		dto.setBackUrl(backUrl);
		PReportLayoutDtoMapper pReportLayoutDtoMapper = new PReportLayoutDtoMapper();
		dto.setLstPReportLayoutDto(pReportLayoutDtoMapper.mappingToDtoList(list));

		display(resource,util);
	}

	/**
	 * 帳票レイアウト選択画面表示処理
	 *
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);

	}

	/**
	 * 帳票レイアウト選択画面表示処理
	 *
	 * @param resource    呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ses.removeAttribute("GTIN14_SYMBOL");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start
		//画面を設定
		resource.initScreen("PrinterSelectReportLayoutSelectHT");

		// 非表示のボタン設定
		resource.setHideButton(ButtonInfo.builder().url("PrinterSelectReportLayoutSelect/select").build());

		// 戻るボタン設定
		resource.setReturnButton(ButtonInfo.builder().url("PrinterSelectReportLayout/display").itemCd("return").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Enf

		util.setTransURL(HT_URI_BASE + "/wms/system/PrinterSelectReportLayoutSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、帳票レイアウト画面に遷移します。
	 * @param bean 帳票レイアウト選択画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/select")
	public void select(@BeanParam PrinterSelectReportLayoutSelectDto bean)throws Exception{

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		if(bean.getReportLayoutId()!=null){
			dto.getpUserAutoPrintSettingDto().setReportLayoutId(bean.getReportLayoutId());

			PReportLayout pReportLayout = new PReportLayout();
			pReportLayout.setReportLayoutId(bean.getReportLayoutId());

			pReportLayout = selectLogic.selectPReportLayout(pReportLayout);

			if(pReportLayout != null){
				dto.getpUserAutoPrintSettingDto().setReportLayoutNm(pReportLayout.getReportLayoutNm());
			}
		}
		ses.setAttribute("PrinterSelectDto", dto);

		PrinterSelectReportLayoutResource.display(this, util);
	}




}
