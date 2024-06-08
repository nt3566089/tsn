package com.oneslogi.ht.wms.resources;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MUserClientDto;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyClientDto;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.logic.LoginLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsConst;

/**
 * ハンディ用共通リソースクラス
 * @author hi.watanabe.mp
 *
 */
@Path("/handy")
public class HandyCommonResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
	@Inject
	private MUserLoginBhv mUserLoginBhv;
	@Inject
	private LoginLogic loginLogic;
	// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End

	/**
	 * 荷主選択画面を表示します
	 * @throws Exception
	 */
	@GET
	@Path("/selectClientCd")
	public void selectClientCd(@QueryParam("returnURI") String returnURI, @QueryParam("sendURI") String sendURI) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");
		List<MUserClientDto> userClientList = util.getClientCd(loginInfo.getUserCd(), loginInfo.getCenterCd());
		HandyClientDto clientDto = new HandyClientDto();
		clientDto.setReturnURL(returnURI);
		clientDto.setSendURL(sendURI);
		clientDto.setUserClientDto(userClientList);
		ses.setAttribute("clientDto", clientDto);

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana Start

		// 画面初期設定
		initScreen("ClientSelectHT");

		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url(returnURI).itemCd("return").build());

		// [#3085] HT国際化対応(画面マスタ連携) 2017.11.22 kawana End

		// 荷主選択画面に遷移
		util.setTransURL(HT_URI_BASE + "/common/HandyClientSelect.jsp", ses);
	}

	/**
	 * 選択結果を返却します。
	 * @param selIndex 荷主一覧の選択されたIndex
	 * @throws Exception
	 */
	@GET
	@Path("/returnClientData")
	public void returnClientData(@QueryParam("selIndex") String selIndex) throws Exception {
		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();
		HandyClientDto clientDto = (HandyClientDto) ses.getAttribute("clientDto");
		List<MUserClientDto> retList = clientDto.getUserClientDto();
		MUserClientDto tmpDto = retList.get(Integer.parseInt(selIndex));
		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add Start
		MUserLogin mUserLogin = loginLogic.getMUserLogin(loginInfo);
		mUserLogin.setClientId(tmpDto.getClientId());
		mUserLoginBhv.update(mUserLogin);
		// [画面とHTのログイン時に使用するセンタ・荷主が異なる] 件の対応 2016.10.18 nayzaw Add End

		// セッションの荷主情報を変更
		loginInfo.setClientCd(tmpDto.getMClient().getClientCd());
		ses.setAttribute("loginInfo", loginInfo);
		// [#3085][#2898] HT国際化対応 2017.12.15 kawana Start
		getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME, tmpDto.getMClient().getClientId().toString());
		getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_CD_KEY_NAME, tmpDto.getMClient().getClientCd());
		getUserData().put(WmsConst.ONESLOGI_WMS_CLIENT_NM_KEY_NAME, tmpDto.getMClient().getClientNm());

		// 画面初期設定
		initScreen("LoginClientHT");

		//[Ver3.0][#3998]項目名変更に伴い修正 2018.06.07 kawana Start
		// オプション１ボタン設定
		setOptionButton1(ButtonInfo.builder().url("selectClientCd?returnURI=loginClientInfo").itemCd("clientCd").build());
		//[Ver3.0][#3998]項目名変更に伴い修正 2018.06.07 kawana End
		// 戻るボタン設定
		setReturnButton(ButtonInfo.builder().url("").itemCd("return").build());
		// 送信ボタン設定
		setSendButton(ButtonInfo.builder().url("getMenuPage").itemCd("advance").build());

		// [#3085][#2898] HT国際化対応 2017.12.15 kawana End

		// ログイン荷主確認画面に遷移
		util.setTransURL(HT_URI_BASE + "/common/HandyLoginClient.jsp", ses);
	}

}
