package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionLotDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;

/**
 * 予定無し入荷(詳細)ロット入力画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionLot")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionLot/display")
public class ReceiveNoPlanInspectionLotResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private LotLimitCheckLogic lotLimitCheckLogic;

	/**
	 * ロット入力画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		wHtReceiveNoPlanInspecDto.setLot("");
		wHtReceiveNoPlanInspecDto.setLimitDt("");

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * ロット入力画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionLotHT");
		// 非表示ボタンを設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLot/send").build());

		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionQty/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLot/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionLot.jsp", ses);

	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、以下画面に遷移可能です
	 *     汎用No入力画面
	 *     検品確認入力画面
	 * @param bean 画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionLotDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		wHtReceiveNoPlanInspecDto.setLot(bean.getLot());

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.02.09 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			//入力エラー
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.09 sja End

		// ロットの入力チェックを行う
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto.getMProduct());
		mProduct.setProductCd(wHtReceiveNoPlanInspecDto.getProductCd());

		MClient mClient = new MClient();
		mClient.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

		TLot tLot = new TLot();
		tLot.setLot(bean.getLot());

		if (!lotLimitCheckLogic.check(mClient, mProduct, tLot, WCC.ONE, new ErrorStatus())) {
			return;
		}

		// 画面で選択した内容に応じて遷移先画面を変更する
		if (dto.getLabelKbn().equals("1")) {
			// 入庫No.管理フラグが'0：管理しない'、入庫ラベル使用を選択した場合
			// ロケ入力画面へ遷移する
			ReceiveNoPlanInspectionLocResource.load(this, util);
		} else {
			// 汎用ラベルNO入力確認画面へ遷移する
			ReceiveNoPlanInspectionLabelInputResource.load(this, util);
		}

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
	}

}
