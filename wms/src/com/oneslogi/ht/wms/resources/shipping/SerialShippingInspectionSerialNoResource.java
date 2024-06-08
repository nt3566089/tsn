package com.oneslogi.ht.wms.resources.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtSerialShippingInspDto;
import com.oneslogi.base.dbflute.dtomapper.WHtSerialShippingInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.WHtSerialShippingInsp;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionSerialNoDto;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto;
import com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionSerialNoDto;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.shipping.SerialShippingInspectionInsertLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;

//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登出(ｼﾘｱﾙ)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialShippingInspectionSerialNo")
@HandyErrorReturnPath(returnURL = "SerialShippingInspectionSerialNo/display")
public class SerialShippingInspectionSerialNoResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialShippingInspectionInsertLogic insertLogic;
	@Inject
	private SerialShippingInspectionCheckLogic checkLogic;

	/**
	 * シリアル登出(ｼﾘｱﾙ)画面初期化を行います。
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

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		WHtSerialShippingInspDtoMapper wHtSerialShippingInspDtoMapper = new WHtSerialShippingInspDtoMapper();
		WHtSerialShippingInsp wHtSerialShippingInsp = wHtSerialShippingInspDtoMapper.mappingToEntity(wHtSerialShippingInspDto);

		dto.setStartSerialNo("");

		dto.setwHtSerialShippingInspDto(wHtSerialShippingInspDtoMapper.mappingToDto(wHtSerialShippingInsp));
		ses.setAttribute("SerialShippingInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * シリアル登出(ｼﾘｱﾙ)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng Start
		//画面ヘッダ設定
		resource.initScreen("SerialShippingInspectionSerialNoHT");


		// 非表示ボタンを設定
		resource.setHideButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/send").build());
		// オプションボタン１を設定
		resource.setOptionButton1(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/range").itemCd("option1").build());
		// オプションボタン２を設定
		resource.setOptionButton2(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/complete").itemCd("option2").build());
		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/back").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("SerialShippingInspectionSerialNo/send").itemCd("send").build());

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.26 yanjiafeng End

		//シリアル入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/shipping/SerialShippingInspectionSerialNo.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * ｼﾘｱﾙｸﾘｱ確認画面画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back(@BeanParam SerialReceiveInspectionSerialNoDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtDto = dto.getwHtSerialShippingInspDto();
		wHtDto.setSerialNo(bean.getSerialNo());

		ses.setAttribute("SerialShippingInspectionDto", dto);

		//ｼﾘｱﾙｸﾘｱ確認画面を表示
		SerialShippingInspectionSerialNoCancelResource.load(this, util);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登出(ｼﾘｱﾙ)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SerialShippingInspectionSerialNoDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtDto = dto.getwHtSerialShippingInspDto();

		wHtDto.setSerialNo(bean.getSerialNo());

		// ===== 入力チェック =====

		if (bean.isValidateErr()) {
			return;
		}

		// ===== 登録済チェック =====

		List<String> serialNoList = new ArrayList<String>();
		serialNoList.add(bean.getSerialNo());

		checkLogic.checkAlreadyRegistered(wHtDto.getCenterId(), wHtDto.getClientId(), wHtDto.getPickingWorkNo(), wHtDto.getProductId(), serialNoList);
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== シリアルNo.をワーク登録 =====

		WHtSerialShippingInsp entity = new WHtSerialShippingInsp();
		entity.setMacAddress(wHtDto.getMacAddress());
		entity.setClientId(wHtDto.getClientId());
		entity.setCenterId(wHtDto.getCenterId());
		entity.setPickingWorkNo(wHtDto.getPickingWorkNo());
		entity.setCustomerId(wHtDto.getCustomerId());
		entity.setJanCd(wHtDto.getJanCd());
		entity.setProductCd(wHtDto.getProductCd());
		entity.setProductNm(wHtDto.getProductNm());
		entity.setSerialNo(bean.getSerialNo());

		int insertCount = insertLogic.insertWHtSerialShippingInspec(entity);

		// ===== 出庫数超過チェック =====

		checkLogic.checkOrverQuantity(wHtDto.getCenterId(), wHtDto.getClientId(), wHtDto.getPickingWorkNo(), wHtDto.getProductId(), wHtDto.getProductCd(), wHtDto.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// ===== 画面遷移 =====

		dto.setInspQty(dto.getInspQty() + insertCount);
		// [#1839] 読込んだ後シリアルテキストボックスのデータを消えないように修正 2017.6.5 nayzaw
		ses.setAttribute("SerialShippingInspectionDto", dto);

		SerialShippingInspectionSerialNoResource.display(this, util);
	}

	/**
	 * 完了時にコールされるメソッドです。<br>
	 * 伝票No単位の完了確認画面に遷移します。
	 * @param bean JAN入力入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete() throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		WHtSerialShippingInspDto wHtSerialShippingInspDto = dto.getwHtSerialShippingInspDto();

		wHtSerialShippingInspDto.setJanCd("");
		wHtSerialShippingInspDto.setProductCd("");
		wHtSerialShippingInspDto.setProductNm("");
		// [#1851] シリアルNoクリア 2017.5.31 nayzaw start
		wHtSerialShippingInspDto.setSerialNo("");
		// [#1851] シリアルNoクリア 2017.5.31 nayzaw end
		dto.setwHtSerialShippingInspDto(wHtSerialShippingInspDto);
		dto.setmProduct(null);

		ses.setAttribute("SerialShippingInspectionDto", dto);
		SerialShippingInspectionJanCdResource.load(this, util);
	}

	/**
	 * 範囲時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登出(範囲)画面に遷移します。
	 * @param bean JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/range")
	public void range(@BeanParam SerialShippingInspectionSerialNoDto bean) throws Exception {

		// ===== 入力チェック =====

		if (bean.isValidateErr()) {
			return;
		}

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialShippingInspectionDto dto = (SerialShippingInspectionDto) ses.getAttribute("SerialShippingInspectionDto");
		dto.setStartSerialNo(bean.getSerialNo());
		ses.setAttribute("SerialShippingInspectionDto", dto);

		SerialShippingInspectionRangeResource.load(this, util);
	}

}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End