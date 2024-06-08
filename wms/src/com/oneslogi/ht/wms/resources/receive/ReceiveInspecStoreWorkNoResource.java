package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreWorkNoDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspecStoreCheckLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;

/**
 * 検品格納(伝票ＮＯ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspecStoreWorkNo")
@HandyErrorReturnPath(returnURL = "ReceiveInspecStoreWorkNo/display")
public class ReceiveInspecStoreWorkNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspecStoreCheckLogic checkLogic;

	/**
	 * 入荷検品格納(伝票ＮＯ入力)画面初期化を行います。
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
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		tReceivePlanBDto.setPlanLocationCd("");
		tReceivePlanBDto.getTReceivePlanH().setReceiveSlipNo("");
		tReceivePlanBDto.getTReceivePlanH().setReceivePlanHId(null);
		dto.setTReceivePlanBDto(tReceivePlanBDto);
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入荷検品格納(伝票ＮＯ入力)画面表示を行います。
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

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");



		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi Start
		// 画面初期設定
		resource.initScreen("ReceiveInspecStoreWorkNoHT");
		// 非表示ボタン設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspecStoreWorkNo/send").build());
		//戻る設定
		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreLabel/display").itemCd("return").build());
		} else {
			//入庫No管理対象外場合
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspecStoreLabel/back").itemCd("return").build());
		}
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspecStoreWorkNo/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.02 wangqi End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspecStoreWorkNo.jsp", ses);

	}

	/**
	 * 確認時にコールされるメソッドです。<br>
	 * 入力チェックを行い、JAN入力画面に遷移します。
	 * @param bean 伝票No入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	@WorkLogStart("ReceiveInspecStoreHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam ReceiveInspecStoreWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspecStoreDto dto = (ReceiveInspecStoreDto) ses.getAttribute("ReceiveInspecStoreDto");

		dto.getTReceivePlanBDto().getTReceivePlanH().setReceiveSlipNo(bean.htWorkNo);

		// [#575] ValidateチェックのHT国際化 2017.02.08 sja Start
		//入力チェック
//		String valMsg = util.inputCheck(ses, bean);
//		if (valMsg != null && valMsg.trim().length() > 0) {
//			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
//			return;
//		}
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.02.08 sja End

		// ==== 入力した伝票Noが入荷予定データに存在するかチェックを行う ====
		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());
		tReceivePlanH.setReceiveSlipNo(bean.htWorkNo);

		// 伝票No存在チェック
		tReceivePlanH = checkLogic.checkReceiveSlipNo(tReceivePlanH, "0");
		if (tReceivePlanH == null) {
			return;
		}

		//エラーの場合
		if (tReceivePlanH.isReceiveStatus$99()) {
			// エラーの伝票Noです
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_ERROR_SLIP_NO);
			return;
		}


		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.htWorkNo);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
		ses.setAttribute("ReceiveInspecStoreDto", dto);

		//通信制御データ作成
		String reopenKey = dto.getLabelKbn();
		reopenKey = reopenKey + "," + bean.htWorkNo;
		util.setHtComCtl(ses, "ReceiveInspecStore", reopenKey);

		//入荷検品格納(JAN)画面を表示
		ReceiveInspecStoreJanResource.load(this, util);
	}
}