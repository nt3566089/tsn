package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.MProductDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreLotDto;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.logic.common.LotLimitCheckLogic;

/**
 * 検品格納(詳細)ロット入力画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreLot")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreLot/display")
public class ReceiveInspecStoreLotResource extends HandyResourceBase {

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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		dto.setLimitDt("");
		dto.getTReceivePlanBDto().setPlanLimitDt("");
		ses.setAttribute("ReceiveInspecStoreDto", dto);

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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreLotHT");
		// 非表示ボタンを設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspecStoreLot/send").build());
		//戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreQty/display").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreLot/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreLot.jsp", ses);

	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、以下画面に遷移可能です
	 *     汎用No入力画面
	 *     ロケ入力画面
	 * @param bean 画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveInspecStoreLotDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		dto.getTReceivePlanBDto().setPlanLot(bean.getLot());

		ses.setAttribute("ReceiveInspecStoreDto", dto);

		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
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
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End

		// ロットの入力チェックを行う
		MProductDtoMapper mProductDtoMapper = new MProductDtoMapper();
		MProduct mProduct = mProductDtoMapper.mappingToEntity(tReceivePlanBDto.getMProduct());
		mProduct.setProductCd(tReceivePlanBDto.getMProduct().getProductCd());

		MClient mClient = new MClient();
		mClient.setClientId(tReceivePlanBDto.getTReceivePlanH().getClientId());

		TLot tLot = new TLot();
		tLot.setLot(bean.getLot());

		if (!lotLimitCheckLogic.check(mClient, mProduct, tLot, WCC.ONE, new ErrorStatus())) {
			return;
		}

		// 画面で選択した内容に応じて遷移先画面を変更する
		if (dto.getLabelKbn().equals("1")) {
			// 入庫No.管理フラグが'0：管理しない'、入庫ラベル使用を選択した場合
			// ロケ入力画面を表示
			ReceiveInspecStoreLocationResource.load(this, util);
		} else {
			// 汎用ラベルNO入力確認画面へ遷移する
			ReceiveInspecStoreLabelInputResource.load(this, util);
		}

		dto.setTReceivePlanBDto(tReceivePlanBDto);
		ses.setAttribute("ReceiveInspecStoreDto", dto);
	}

}
