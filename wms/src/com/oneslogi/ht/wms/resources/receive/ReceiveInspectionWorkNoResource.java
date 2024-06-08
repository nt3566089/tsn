package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.TReceivePlanBDto;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveInspectionWorkNoDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.base.cdi.annotation.WorkLogStart;

/**
 * 入荷検品(伝票ＮＯ・仮ロケ入力)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveInspectionWorkNo")
@HandyErrorReturnPath(returnURL = "ReceiveInspectionWorkNo/display")
public class ReceiveInspectionWorkNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private ReceiveInspectionCheckLogic checkLogic;
	@Inject
	private ReceiveInspectionSelectLogic selectLogic;

	/**
	 * 入荷検品(伝票ＮＯ・仮ロケ入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA Start */
//		load(this, util);
		load(this, util,selectLogic);
		/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA End */
	}

	/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA Start */
//	public static void load(HandyResourceBase resource, HandyCommonUtil util) throws Exception {
	public static void load(HandyResourceBase resource, HandyCommonUtil util,
			ReceiveInspectionSelectLogic selectLogic) throws Exception {
	/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA End */

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");
		TReceivePlanBDto tReceivePlanBDto = dto.getTReceivePlanBDto();

		/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA Start */
//		tReceivePlanBDto.setPlanLocationCd("");
		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		// ==== 仮ロケのデフォルト設定を行う ====
		MLocation mLocation = new MLocation();
		mLocation.setCenterId(loginInfo.getCenterId());

		mLocation = selectLogic.getPlanLocation(mLocation);
		if (mLocation == null) {
			tReceivePlanBDto.setPlanLocationCd("");
		} else {
			tReceivePlanBDto.setPlanLocationCd(mLocation.getLocationCd());
		}
		/* [次期エンハンス] 仮ロケのデフォルト設定を追加 2015.08.31 By SJA End */

		tReceivePlanBDto.getTReceivePlanH().setReceiveSlipNo("");
		tReceivePlanBDto.getTReceivePlanH().setReceivePlanHId(null);
		dto.setTReceivePlanBDto(tReceivePlanBDto);
		ses.setAttribute("ReceiveInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * 入荷検品(伝票ＮＯ・仮ロケ入力)画面表示を行います。
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

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 Start

		// 画面初期設定
		resource.initScreen("ReceiveInspectionWorkNoHT");

		// 非表示ボタン設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveInspectionWorkNo/send").build());
		//戻る設定
		MParam mParam = new MParam();
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionLabel/display").itemCd("return").build());
		} else {
			//入庫No管理対象外場合
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveInspectionLabel/back").itemCd("return").build());
		}

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveInspectionWorkNo/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.30 潘 End

		//キャンセル確認画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveInspectionWorkNo.jsp", ses);

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
	@WorkLogStart("ReceiveInspectionHT")
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	public void send(@BeanParam ReceiveInspectionWorkNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveInspectionDto dto = (ReceiveInspectionDto) ses.getAttribute("ReceiveInspectionDto");

		dto.getTReceivePlanBDto().getTReceivePlanH().setReceiveSlipNo(bean.htWorkNo);
		dto.getTReceivePlanBDto().setPlanLocationCd(bean.rcvLocCd);

		// [#575] ValidateチェックのHT国際化 2017.01.17 kawana Start
		// 入力チェック
		if (bean.isValidateErr()) {
			return;
		}
		// [#575] ValidateチェックのHT国際化 2017.01.17 kawana End

		// ==== 入力した伝票Noが入荷予定データに存在するかチェックを行う ====
		// 入荷予定ヘッダ情報の取得
		TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
		TReceivePlanH tReceivePlanH = tReceivePlanHDtoMapper.mappingToEntity(dto.getTReceivePlanBDto().getTReceivePlanH());
		tReceivePlanH.setReceiveSlipNo(bean.htWorkNo);

		// 伝票No存在チェック
		//[HT1.5-CT1-036] 再開時の削除チェックで使い回したいためメッセージフラグを追加 2015/06/25 KAI UPDATE START
		//tReceivePlanH = checkLogic.checkReceiveSlipNo(tReceivePlanH);
		tReceivePlanH = checkLogic.checkReceiveSlipNo(tReceivePlanH, "0");
		//[HT1.5-CT1-036] 再開時の削除チェックで使い回したいためメッセージフラグを追加 2015/06/25 KAI UPDATE START
		if (tReceivePlanH == null) {
			return;
		}

		// [HT1.5-CT1-005] 検品済でも追加の入荷ができるよう修正 2015/06/05 yokosuka [S]
		// ==== 入力した伝票Noのステータスが全て検品済かチェックを行う ====
		//if (tReceivePlanH.isReceiveStatus$03()) {
		//	// すべての検品作業が完了しました
		//	getErrorManager().add(new ErrorStatus(), WmsMessageConst.INSPECT_COMPLETE_ALL_INFORMATION);
		//	return;
		//}
		// [HT1.5-CT1-005] 検品済でも追加の入荷ができるよう修正 2015/06/05 yokosuka [E]

		//[HT1.5-CT1-004] ステータスがエラーのチェックを追加 2015/06/25 KAI ADD START
		//エラーの場合
		if (tReceivePlanH.isReceiveStatus$99()) {
			// エラーの伝票Noです
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_ERROR_SLIP_NO);
			return;
		}
		//[HT1.5-CT1-004] ステータスがエラー、取消のチェックを追加 2015/06/25 KAI ADD END

		// ==== 入力した仮ロケがロケーションマスタに存在するかチェックを行う ====
		MLocation mLocation = new MLocation();
		mLocation.setCenterId(tReceivePlanH.getCenterId());
		mLocation.setLocationCd(bean.rcvLocCd);

		mLocation = selectLogic.getMLocation(mLocation);
		if (mLocation == null) {
			// ロケーションマスタに存在しません
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.LOCATION_NOT_FOUND_ERROR);
			return;
		}

		// ==== 入力した仮ロケのロケーション種別のチェックを行う ====
		if (!mLocation.isLocationType$01()) {
			// すべての検品作業が完了しました
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_LOC_NOT_NORMAL);
			return;
		}
		dto.getTReceivePlanBDto().setPlanLocationId(mLocation.getLocationId());
		dto.getTReceivePlanBDto().setPlanWarehouseId(mLocation.getMZone().getWarehouseId());

		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		setWorkLogTraceItem(bean.htWorkNo);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

		ses.setAttribute("ReceiveInspectionDto", dto);

		//通信制御データ作成
		String reopenKey = dto.getLabelKbn();
		reopenKey = reopenKey + "," + bean.htWorkNo;
		reopenKey = reopenKey + "," + bean.rcvLocCd;
		reopenKey = reopenKey + "," + String.valueOf(mLocation.getLocationId());
		util.setHtComCtl(ses, "ReceiveInspection", reopenKey);

		//入荷検品(JAN)画面を表示
		ReceiveInspectionJanResource.load(this, util);
	}
}