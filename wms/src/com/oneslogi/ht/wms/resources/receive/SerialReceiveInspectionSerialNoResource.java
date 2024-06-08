package com.oneslogi.ht.wms.resources.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.WHtSerialReceiveInsp;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionSerialNoDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionInsertLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登入(ｼﾘｱﾙ)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionSerialNo")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionSerialNo/display")
public class SerialReceiveInspectionSerialNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialReceiveInspectionInsertLogic insertLogic;
	@Inject
	private SerialReceiveInspectionCheckLogic checkLogic;

	/**
	 * シリアル登入(伝票No)画面初期化を行います。
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
	 * シリアル登入(伝票No)画面表示を行います。
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

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		ses.setAttribute("SerialReceiveInspectionDto", dto);
		//画面ヘッダ設定
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH Start
        //画面を設定
		resource.initScreen("SerialReceiveInspectionSerialNoHT");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SerialReceiveInspectionSerialNo/send").build());

		// オプション１ボタンの設定
		resource.setOptionButton1(ButtonInfo.builder().url("SerialReceiveInspectionSerialNo/range").itemCd("option1").build());

		// オプション2ボタンの設定
		resource.setOptionButton2(ButtonInfo.builder().url("SerialReceiveInspectionSerialNo/complete").itemCd("option2").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionSerialNo/back").itemCd("return").build());
		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionSerialNo/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//シリアル登入(ｿｰｽCD)入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionSerialNo.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back(@BeanParam SerialReceiveInspectionSerialNoDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setSerialNo(bean.getSerialNo());

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionSerialNoCancelResource.load(this, util);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登入(ｿｰｽCD)画面に遷移します。
	 * @param bean シリアル登入(伝票No)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SerialReceiveInspectionSerialNoDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setSerialNo(bean.getSerialNo());

		// ===== 入力チェック =====

		if (bean.isValidateErr()) {
			return;
		}

		// ===== 登録済チェック =====

		List<String> serialNoList = new ArrayList<String>();
		serialNoList.add(bean.getSerialNo());

		checkLogic.checkAlreadyRegistered(dto.getCenterId(), dto.getClientId(), dto.getReceiveSlipNo(), dto.getProductId(), serialNoList);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== ワーク登録 =====

		WHtSerialReceiveInsp wHtSerialReceiveInsp = new WHtSerialReceiveInsp();
		wHtSerialReceiveInsp.setMacAddress(dto.getMacAddress());
		wHtSerialReceiveInsp.setClientId(dto.getClientId());
		wHtSerialReceiveInsp.setCenterId(dto.getCenterId());
		wHtSerialReceiveInsp.setReceiveSlipNo(dto.getReceiveSlipNo());
		wHtSerialReceiveInsp.setJanCd(dto.getJanProdCd());
		wHtSerialReceiveInsp.setProductCd(dto.getProductCd());
		wHtSerialReceiveInsp.setProductNm(dto.getProductNm());
		wHtSerialReceiveInsp.setSerialNo(bean.getSerialNo());

		int insertCount = insertLogic.insertWHtSerialReceiveInspec(wHtSerialReceiveInsp, dto.getSupplierCd());

		// ===== 入荷数超過チェック =====

		checkLogic.checkOrverQuantity(dto.getCenterId(), dto.getClientId(), dto.getReceiveSlipNo(), dto.getProductId(), dto.getProductCd(), dto.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 画面遷移 =====

		dto.setUnitNum(dto.getUnitNum() + insertCount);
		// [#1839] 読込んだ後シリアルテキストボックスのデータを消えないように修正 2017.6.2 nayzaw

		ses.setAttribute("SerialReceiveInspectionDto", dto);
		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionSerialNoResource.load(this, util);
	}

	/**
	 * 完了時にコールされるメソッドです。<br>
	 * シリアル登入(ｿｰｽCD)の画面に遷移します。
	 * @param bean シリアル登入(ｿｰｽCD)入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setJanProdCd("");
		dto.setProductCd("");
		dto.setProductNm("");
		dto.setUnitNum(0);
		//[#1857] 入力したシリアルNoのクリア 2017.5.31 nayzaw start
		dto.setSerialNo("");
		//[#1857] 入力したシリアルNoのクリア 2017.5.31 nayzaw end
		ses.setAttribute("SerialReceiveInspectionDto", dto);
		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionJanCdResource.display(this, util);
	}

	/**
	 * 前時にコールされるメソッドです。<br>
	 * 前情報を表示します。
	 * @throws Exception
	 */
	@GET
	@Path("/range")
	public void range(@BeanParam SerialReceiveInspectionSerialNoDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");
		dto.setSerialNo(bean.getSerialNo());

		// ===== 入力チェック =====

		if (bean.isValidateErr()) {
			return;
		}
		dto.setStartSerialNo(bean.getSerialNo());
		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionRangeResource.load(this, util);
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
