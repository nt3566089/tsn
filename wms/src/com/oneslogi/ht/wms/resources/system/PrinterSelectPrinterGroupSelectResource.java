
package com.oneslogi.ht.wms.resources.system;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.PPrinterGroupDtoMapper;
import com.oneslogi.base.dbflute.exentity.PPrinterGroup;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.system.PrinterSelectDto;
import com.oneslogi.ht.wms.dto.system.PrinterSelectPrinterGroupSelectDto;
import com.oneslogi.ht.wms.logic.system.PrinterSelectSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.print.logic.AutoPrintLogic;

/**
 * プリンタグループ選択画面Resourceクラス
 * @author za.nay.km
 *
 */
@Path("/handy/PrinterSelectPrinterGroupSelect")
@HandyErrorReturnPath(returnURL = "PrinterSelectPrinterGroupSelect/display")
public class PrinterSelectPrinterGroupSelectResource extends HandyResourceBase {
	@Inject
	private HandyCommonUtil util;
	@Inject
	private AutoPrintLogic autoPrintLogic;
	@Inject
	private PrinterSelectSelectLogic selectLogic;

	/**
	 * プリンタグループ選択画面初期化処理
	 * @param backUrl
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load(@QueryParam("backUrl") String backUrl) throws Exception{
		load(this, util, backUrl, autoPrintLogic);

	}

	/**
	 * プリンタグループ選択画面初期化処理
	 * @param resource     呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @param backUrl     戻る先
	 * @param logic       自動印刷データ登録ロジッククラス
	 * @throws Exception
	 */
	public static void load(HandyResourceBase resource, HandyCommonUtil util,String backUrl, AutoPrintLogic logic) throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		List<PPrinterGroup> list = logic.getPrinterGroupList();

		if(list.size() < 1){
			ErrorManager errorManager = resource.getErrorManager();
			errorManager.add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			resource.sendErrorScreen(util.getMessage(errorManager), "", backUrl);
			errorManager.clear();
			return;
		}
		dto.setBackUrl(backUrl);
		PPrinterGroupDtoMapper pPrinterGroupDtoMapper = new PPrinterGroupDtoMapper();
		dto.setLstPPrinterGroupDto(pPrinterGroupDtoMapper.mappingToDtoList(list));

		display(resource,util);

	}
	/**
	 * プリンタグループ選択画面表示処理
	 *
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception{
		display(this, util);

	}

	/**
	 * プリンタグループ選択画面表示処理
	 *
	 * @param resource    呼び出すResourceクラス
	 * @param util        ハンディ向けモジュールで使用する共通関数群
	 * @throws Exception
	 */
	public static void display(HandyResourceBase resource, HandyCommonUtil util) throws Exception{
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH Start
		//画面を設定
		resource.initScreen("PrinterSelectPrinterGroupSelectHT");

		// 非表示のボタン設定
		resource.setHideButton(ButtonInfo.builder().url("PrinterSelectPrinterGroupSelect/select").build());

		// 戻るボタン設定
		resource.setReturnButton(ButtonInfo.builder().url("PrinterSelectPrinterGroup/display").itemCd("return").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 RYH End
		util.setTransURL(HT_URI_BASE + "/wms/system/PrinterSelectPrinterGroupSelect.jsp", ses);
	}

	/**
	 * 選択時にコールされるメソッドです。<br>
	 * 入力チェックを行い、プリンタグループ画面に遷移します。
	 * @param bean プリンタグループ選択画面情報を保持DTO
	 * @throws Exception
	 */

	@GET
	@Path("/select")
	public void select(@BeanParam PrinterSelectPrinterGroupSelectDto bean)throws Exception{

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		PrinterSelectDto dto = (PrinterSelectDto) ses.getAttribute("PrinterSelectDto");

		if(bean.getPrinterGroupId()!=null){
			dto.getpUserAutoPrintSettingDto().setPrinterGroupId(bean.getPrinterGroupId());

			PPrinterGroup pPrinterGroup = new PPrinterGroup();
			pPrinterGroup.setPrinterGroupId(bean.getPrinterGroupId());

			pPrinterGroup = selectLogic.selectPPrinterGroup(pPrinterGroup);

			if(pPrinterGroup != null){
				dto.getpUserAutoPrintSettingDto().setPrinterGroupNm(pPrinterGroup.getPrinterGroupNm());
			}
		}
		ses.setAttribute("PrinterSelectDto", dto);

		PrinterSelectPrinterGroupResource.display(this, util);

	}


}
