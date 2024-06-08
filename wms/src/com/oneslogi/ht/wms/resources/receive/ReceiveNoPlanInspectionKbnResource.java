package com.oneslogi.ht.wms.resources.receive;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionKbnDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;

/**
 * 予定無し入荷(区分)画面Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspectionKbn")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspectionKbn/display")
public class ReceiveNoPlanInspectionKbnResource extends HandyResourceBase {

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

	/**
	 * 予定無し入荷(区分)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, customerLogic, stockTypeLogic,  userLogic, selectLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CustomerLogic customerLogic
			, StockTypeLogic stockTypeLogic, UserLogic userLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		dto.setDeposit("");
		dto.setProcessType("");
		dto.setStockType("");

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// ==== 預託のデフォルト設定を行う ====
		MClient mClient = new MClient();
		mClient.setClientId(dto.getwHtReceiveNoPlanInspDto().getClientId());

		List<MCustomer> lstMCustomer = selectLogic.selectDepositList(mClient);
		if (lstMCustomer.size() == 1) {
			dto.setDeposit(lstMCustomer.get(0).getCustomerCd());
		}

		// ==== 在庫区分のデフォルト設定を行う ====
		List<MStockType> lstMStockType = selectLogic.selectStockList(bUser);
		if (lstMStockType.size() == 1) {
			dto.setStockType(lstMStockType.get(0).getStockTypeCd());
		}

		// ==== 処理区分のデフォルト設定を行う ====
		List<MProcessType> lstMProcessType = selectLogic.selectProcessList(bUser);
		if (lstMProcessType.size() == 1) {
			dto.setProcessType(lstMProcessType.get(0).getProcessTypeCd());
		}

		for (int i = 0; i < lstMProcessType.size(); i++) {
			MProcessType temp = lstMProcessType.get(i);
			if ("1".equals(temp.getDefaultFlg())) {
				dto.setProcessType(temp.getProcessTypeCd());
				if (temp.getStockTypeId() != null) {
					MStockType mStockType = new MStockType();
					mStockType.setStockTypeId(temp.getStockTypeId());
					mStockType = stockTypeLogic.getPkEntityWithDeletedCheck(mStockType);

					dto.setStockType(mStockType.getStockTypeCd());
				}
			}
		}

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//自画面表示
		display(resource, util, customerLogic, userLogic, selectLogic);
	}

	/**
	 * 予定無し入荷(区分)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util, customerLogic, userLogic, selectLogic);
	}
	public static void display(HandyResourceBase resource, HandyCommonUtil util, CustomerLogic customerLogic, UserLogic userLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW Strat

		// 画面初期設定
		resource.initScreen("ReceiveNoPlanInspectionKbnHT");
		//非表示の設定
		resource.setHideButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionKbn/send").build());
		//フッタボタン（左）設定
		resource.setOptionButton1(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionKbn/processType")
				.itemCd("option1")
				.keyType(KEY_TYPE_NUM2)
				.build());
		//フッタボタン（右）設定
		resource.setOptionButton2(ButtonInfo.builder()
				.url("ReceiveNoPlanInspectionKbn/stockType")
				.itemCd("option2")
				.keyType( KEY_TYPE_NUM3)
				.build());

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		//フッタボタン（左）設定
		//戻る設定
		MParam mParam = new MParam();
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
		mParam.setStoreNoFlg(dto.getMParamDto().getStoreNoFlg());
		// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		if (mParam.isStoreNoFlg$1()) {
			//入庫No管理対象場合
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLabel/display").itemCd("return").build());
		} else {
			//入庫No管理対象外場合
			resource.setReturnButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionLabel/back").itemCd("return").build());
		}
		//フッタボタン（右）設定
		resource.setSendButton(ButtonInfo.builder().url("ReceiveNoPlanInspectionKbn/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.11.01 LSW End

		//預託区分名称取得
		if(!CU.isNullOrEmpty(dto.getDeposit())){
			MCustomer mCustomer = new MCustomer();
			mCustomer.setCustomerCd(dto.getDeposit());
			mCustomer.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

			mCustomer = customerLogic.getUkEntity(mCustomer);
			wHtReceiveNoPlanInspecDto.setDepositNm("");
			if (mCustomer != null) {
				if(mCustomer.isDepositFlg$1()){
					wHtReceiveNoPlanInspecDto.setDepositId(mCustomer.getCustomerId());
					wHtReceiveNoPlanInspecDto.setDepositNm(mCustomer.getCustomerNm());
				}
			}
		}else{
			wHtReceiveNoPlanInspecDto.setDepositId(null);
			wHtReceiveNoPlanInspecDto.setDepositNm("");
		}

		//処理区分名称取得
		if(!CU.isNullOrEmpty(dto.getProcessType())){
			MProcessType mProcessType = new MProcessType();
			mProcessType.setProcessTypeCd(dto.getProcessType());
			MProcessType retMProcessType = selectLogic.getProcessTypeNm(bUser, mProcessType);
			wHtReceiveNoPlanInspecDto.setProcessTypeNm("");
			if (retMProcessType != null) {
				if(retMProcessType.isReceiveFlg$1()){
					wHtReceiveNoPlanInspecDto.setProcessTypeId(retMProcessType.getProcessTypeId());
					wHtReceiveNoPlanInspecDto.setProcessTypeNm(retMProcessType.getVDict().getDictNm());
				}
			}
		} else {
			wHtReceiveNoPlanInspecDto.setProcessTypeId(null);
			wHtReceiveNoPlanInspecDto.setProcessTypeNm("");
		}

		//在庫区分名称取得
		if(!CU.isNullOrEmpty(dto.getStockType())){
			MStockType mStockType = new MStockType();
			mStockType.setStockTypeCd(dto.getStockType());
			MStockType retMStockType = selectLogic.getStockTypeNm(bUser, mStockType);
			if (retMStockType!=null){
				wHtReceiveNoPlanInspecDto.setStockTypeId(retMStockType.getStockTypeId());
				wHtReceiveNoPlanInspecDto.setStockTypeNm(retMStockType.getVDict().getDictNm());
			}
		}else{
			wHtReceiveNoPlanInspecDto.setStockTypeId(null);
			wHtReceiveNoPlanInspecDto.setStockTypeNm("");
		}

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//預託・在庫区分入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/receive/ReceiveNoPlanInspectionKbn.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(ロケ入力)画面に遷移します。
	 * @param bean 商品棚卸入力(預託・在庫区分入力)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam ReceiveNoPlanInspectionKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		//預託選択チェック
		if (CU.isNullOrEmpty(dto.getDeposit())) {
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DEPOSIT_NOT_SELECT_ERROR);
			return;
		}
		//処理区分選択チェック
		if (CU.isNullOrEmpty(dto.getProcessType())) {
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_PROCESS_TYPE_NOT_SELECT_ERROR);
			return;
		}
		//在庫区分選択チェック
		if (CU.isNullOrEmpty(dto.getStockType())) {
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STOCK_TYPE_NOT_SELECT_ERROR);
			return;
		}

		//預託区分存在チェック
		MCustomer mCustomer = new MCustomer();
		mCustomer.setCustomerCd(dto.getDeposit());
		mCustomer.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

		mCustomer = customerLogic.getUkEntity(mCustomer, new ErrorStatus());
		if (mCustomer == null) {
			wHtReceiveNoPlanInspecDto.setDepositNm("");
			wHtReceiveNoPlanInspecDto.setDepositId(null);
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			return;
		}
		wHtReceiveNoPlanInspecDto.setDepositNm(mCustomer.getCustomerNm());
		wHtReceiveNoPlanInspecDto.setDepositId(mCustomer.getCustomerId());

		if(!mCustomer.isDepositFlg$1()){
			wHtReceiveNoPlanInspecDto.setDepositNm("");
			wHtReceiveNoPlanInspecDto.setDepositId(null);
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			return;
		}

		//処理区分存在チェック
		MProcessType mProcessType = new MProcessType();
		mProcessType.setProcessTypeCd(dto.getProcessType());
		MProcessType retMProcessType = selectLogic.getProcessTypeNm(bUser, mProcessType);
		if (retMProcessType  == null){
			wHtReceiveNoPlanInspecDto.setProcessTypeId(null);
			wHtReceiveNoPlanInspecDto.setProcessTypeNm("");
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.PROCESS_TYPE_CD_NOT_FOUND_ERROR);
			return;
		}
		wHtReceiveNoPlanInspecDto.setProcessTypeId(retMProcessType.getProcessTypeId());
		wHtReceiveNoPlanInspecDto.setProcessTypeNm(retMProcessType.getVDict().getDictNm());

		if(!retMProcessType.isReceiveFlg$1()){
			wHtReceiveNoPlanInspecDto.setProcessTypeId(null);
			wHtReceiveNoPlanInspecDto.setProcessTypeNm("");
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.PROCESS_TYPE_CD_NOT_FOUND_ERROR);
			return;
		}

		//在庫区分存在チェック
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(dto.getStockType());
		MStockType retMStockType = selectLogic.getStockTypeNm(bUser, mStockType);
		if (retMStockType  == null){
			wHtReceiveNoPlanInspecDto.setStockTypeId(null);
			wHtReceiveNoPlanInspecDto.setStockTypeNm("");
			dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STOCK_TYPE_FLAG_NOT_FOUND_ERROR);
			return;
		}
		wHtReceiveNoPlanInspecDto.setStockTypeId(retMStockType.getStockTypeId());
		wHtReceiveNoPlanInspecDto.setStockTypeNm(retMStockType.getVDict().getDictNm());

		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//予定無し入荷(仕入先)画面を表示
		ReceiveNoPlanInspectionSupplierResource.load(this, util, customerLogic, userLogic, selectLogic);

	}

	/**
	 * 預託区分押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、預託選択入力画面に遷移します。
	 * @param bean 予定無し入荷(区分)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/deposit")
	public void deposit(@BeanParam ReceiveNoPlanInspectionKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//預託入力画面を表示
		ReceiveNoPlanInspectionDepositSelectResource.load(this, util, "ReceiveNoPlanInspectionKbn/display", selectLogic);

	}

	/**
	 * 処理区分押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、処理区分選択入力画面に遷移します。
	 * @param bean 予定無し入荷(区分)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/processType")
	public void processType(@BeanParam ReceiveNoPlanInspectionKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//在庫入力画面を表示
		ReceiveNoPlanInspectionProcessTypeSelectResource.load(this, util, "ReceiveNoPlanInspectionKbn/display", userLogic, selectLogic);

	}

	/**
	 * 在庫区分押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、在庫選択入力画面に遷移します。
	 * @param bean 予定無し入荷(区分)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/stockType")
	public void stockType(@BeanParam ReceiveNoPlanInspectionKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//在庫入力画面を表示
		ReceiveNoPlanInspectionStockTypeSelectResource.load(this, util, "ReceiveNoPlanInspectionKbn/display", userLogic, selectLogic);

	}
}
