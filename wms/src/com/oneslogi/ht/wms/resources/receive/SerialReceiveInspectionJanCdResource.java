package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto;
import com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionJanCdDto;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.SerialReceiveInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.UserLogic;

// [Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu Start
/**
 * シリアル登入(ｿｰｽCD)画面Resourceクラスです。
 *
 */
@Path("/handy/SerialReceiveInspectionJanCd")
@HandyErrorReturnPath(returnURL = "SerialReceiveInspectionJanCd/display")
public class SerialReceiveInspectionJanCdResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private SerialReceiveInspectionSelectLogic serialReceiveInspectionSelectLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private SerialReceiveInspectionCheckLogic checkLogic;

	/**
	 * シリアル登入(ｿｰｽCD)画面初期化を行います。
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

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//自画面表示
		display(resource, util);
	}

	/**
	 * シリアル登入(ｿｰｽCD)画面表示を行います。
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

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH Start
        //画面を設定
		resource.initScreen("SerialReceiveInspectionJanCdHT");

		// 非表示ボタンの設定
		resource.setHideButton(ButtonInfo.builder().url("SerialReceiveInspectionJanCd/send").build());

		//フッタボタン（左）設定
		resource.setReturnButton(ButtonInfo.builder().url("SerialReceiveInspectionJanCd/back").itemCd("return").build());

		//送信設定
		resource.setSendButton(ButtonInfo.builder().url("SerialReceiveInspectionJanCd/send").itemCd("send").build());

		// オプションボタン２設定
		resource.setOptionButton2(ButtonInfo.builder().url("SerialReceiveInspectionJanCd/complete").itemCd("option2").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 RYH End
		//シリアル登入(ｿｰｽCD)入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/SerialReceiveInspectionJanCd.jsp", ses);
	}

	/**
	 * 戻る時にコールされるメソッドです。<br>
	 * メニュー画面に遷移します。
	 * @throws Exception
	 */
	@GET
	@Path("/back")
	public void back() throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//機能単位セッションをクリア
		//		SerialReceiveInspectionResource.removeSession(this);

		//シリアル登入(ｿｰｽCD)入力画面を表示
		SerialReceiveInspectionCancelResource.load(this, util);

	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、シリアル登入(ｿｰｽCD)画面に遷移します。
	 * @param bean シリアル登入(ｿｰｽCD)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam SerialReceiveInspectionJanCdDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		dto.setJanProdCd(bean.getProductCd());

		if (bean.isValidateErr()) {
			return;
		}

		// ==== 入力したJAN/商品コードが入荷予定データに存在するかチェックを行う ====
		MProduct mProduct = new MProduct();
		mProduct.setJanCd(dto.getJanProdCd());

		//ログイン情報の取得
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		//カルチャID情報の取得
		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// 商品マスタ登録チェック
		MProduct product = checkLogic.checkJanCd(dto.getClientId(), mProduct);
		if (product == null) {
			return;
		}
		dto.setProductId(product.getProductId());

		// 入荷商品チェック
		checkLogic.checkReceiveProduct(dto.getCenterId(), dto.getClientId(), dto.getProductId(), dto.getReceiveSlipNo());
		if (0 < getErrorManager().size()) {
			return;
		}

		dto.setJanProdCd(product.getJanCd());
		dto.setProductCd(product.getProductCd());
		dto.setProductNm(product.getProductNm());

		// 入荷数超過チェック
		checkLogic.checkOrverQuantity(dto.getCenterId(), dto.getClientId(), dto.getReceiveSlipNo(), dto.getProductId(), dto.getProductCd(), dto.getMacAddress());
		if (0 < getErrorManager().size()) {
			return;
		}

		// 商品のシリアル登録数を設定
		int count = serialReceiveInspectionSelectLogic.selectWHtSerialReceiveInspectionProductCount(dto);
		dto.setUnitNum(count);

		ses.setAttribute("SerialReceiveInspectionDto", dto);

		//入荷登録(数量)画面を表示
		SerialReceiveInspectionSerialNoResource.load(this, util);
	}

	/**
	 * 完了時にコールされるメソッドです。<br>
	 * 伝票No単位の完了確認画面に遷移します。
	 * @param bean シリアル登入(ｿｰｽCD)入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/complete")
	public void complete(@BeanParam SerialReceiveInspectionJanCdDto bean) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		SerialReceiveInspectionDto dto = (SerialReceiveInspectionDto) ses.getAttribute("SerialReceiveInspectionDto");

		// 全体のシリアル登録数を設定
		int count = serialReceiveInspectionSelectLogic.selectWHtSerialReceiveInspectionCount(dto);
		dto.setUnitNum(count);

		ses.setAttribute("SerialReceiveInspectionDto", dto);
		SerialReceiveInspectionSendResource.load(this, util);
	}
}
//[Ver3.0][#3752] シリアル系の検品という言葉を無くす 2018.03.02 shimizu End
