package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.receive.ReceiveStatusUpdateLogic;

/**
 * 予定無し入荷(終了)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionCancel")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionCancel/display")
public class ReceiveNoPlanInspectionCancelResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private ReceiveNoPlanInspectionDeleteLogic deleteLogic;
	// [#1790] HT予定無し入荷で「戻る」で終了した時もステータスを入荷済にする 2017.03.18 kawana Start
	@Inject
	private ReceiveStatusUpdateLogic statusUpdateLogic;
	// [#1790] HT予定無し入荷で「戻る」で終了した時もステータスを入荷済にする 2017.03.18 kawana End

	/**
	 * 予定無し入荷(終了)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util);
	}

	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
		//自画面表示
		display(resource, util);
	}

	/**
	 * 予定無し入荷(終了)画面表示を行います。
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
		resource.initScreen("ReceiveNoPlanInspectionCancelHT", VIEW_TEMPLATE_CANCEL);
		resource.setHeaderColor("Yellow") ;

		///戻る設定
		resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionJan/display").itemCd("no").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionCancel/send").itemCd("yes").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionCancel.jsp", ses);

	}

	/**
	 * はい時にコールされるメソッドです。<br>
	 * ラベル選択画面またはメニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		// [#1790] HT予定無し入荷で「戻る」で終了した時もステータスを入荷済にする 2017.03.18 kawana Start

		// 入荷予定ヘッダID取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanHDto());

		Long receivePlanHId = tReceivePlanH.getReceivePlanHId();

		if (receivePlanHId != null) {

			// 入荷ステータス更新(入荷済)
			statusUpdateLogic.recceivedUpdateOnlyHeader(tReceivePlanH.getReceivePlanHId(), new ErrorStatus());
		}

		// [#1790] HT予定無し入荷で「戻る」で終了した時もステータスを入荷済にする 2017.03.18 kawana End

		//機能単位セッションをクリア
		ReceiveNoPlanInspectionResource.removeSession(this, util, deleteLogic);

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			//ラベル選択画面を表示
			ReceiveNoPlanInspectionLabelResource.display(this, util);
		} else {
			// 入庫No管理対象外場合
			// 入庫ラベル使用
			dto.setLabelKbn("1");
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			//予定無し入荷(区分)画面に遷移する
			ReceiveNoPlanInspectionKbnResource.load(this, util, customerLogic, stockTypeLogic, userLogic, selectLogic);
		}
	}

}
