package com.oneslogi.ht.wms.resources.inventory;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.TInventoryHCB;
import com.oneslogi.base.dbflute.dto.WHtInventoryInputProdDto;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.CommonUtil;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto;
import com.oneslogi.ht.wms.dto.inventory.InventoryInputProductKbnDto;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductDepositSelectLogic;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductLogic;
import com.oneslogi.ht.wms.logic.inventory.InventoryInputProductStockTypeSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 商品棚卸入力(預託・在庫区分入力)画面Resourceクラスです。
 *
 */
@Path("/handy/InventoryInputProductKbn")
@HandyErrorReturnPath(returnURL = "InventoryInputProductKbn/display")
public class InventoryInputProductKbnResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private InventoryInputProductLogic inventoryLogic;
	@Inject
	private InventoryInputProductDepositSelectLogic depositSelect;
	@Inject
	private InventoryInputProductStockTypeSelectLogic stockTypeSelect;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	/**
	 * 商品棚卸入力(預託・在庫区分入力)画面初期化を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/load")
	public void load() throws Exception {
		//自画面初期化
		load(this, util, centerLogic, clientLogic, warehouseLogic, customerLogic, stockTypeLogic, userLogic, inventoryLogic);
	}
	public static void load(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, CustomerLogic customerLogic, StockTypeLogic stockTypeLogic
			, UserLogic userLogic, InventoryInputProductLogic inventoryLogic) throws Exception {

		//機能単位セッションを処理化
		InventoryInputProductResource.createSession(resource, util, centerLogic, clientLogic, warehouseLogic);

		//自画面表示
		display(resource, util, customerLogic, stockTypeLogic, userLogic, inventoryLogic);
	}

	/**
	 * 商品棚卸入力(預託・在庫区分入力)画面表示を行います。
	 * @throws Exception
	 */
	@GET
	@Path("/display")
	public void display() throws Exception {
		display(this, util, customerLogic, stockTypeLogic, userLogic, inventoryLogic );
	}
	public static void display(HandyResourceBase resource, HandyCommonUtil util, CustomerLogic customerLogic, StockTypeLogic stockTypeLogic, UserLogic userLogic, InventoryInputProductLogic inventoryLogic) throws Exception {
		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.29 ライ MOD Start
		//フッタボタン（非表示）設定
		resource.initScreen("InventoryInputProductKbnHT");
		resource.setHideButton(
				ButtonInfo.builder().url("InventoryInputProductKbn/send").build());
		//フッタボタン（左上）設定
		resource.setOptionButton1(
				ButtonInfo.builder().url("InventoryInputProductKbn/deposit")
				.itemCd("option1").keyType(KEY_TYPE_NUM1).build());
	    //フッタボタン（右上）設定
		resource.setOptionButton2(
				ButtonInfo.builder().url("InventoryInputProductKbn/stockType")
				.itemCd("option2").keyType(KEY_TYPE_NUM2).build());

		//フッタボタン（左）設定
		resource.setReturnButton(
				ButtonInfo.builder().url("InventoryInputProductCancel/load").itemCd("return").build());
		//フッタボタン（右）設定
		resource.setSendButton(
				ButtonInfo.builder().url("InventoryInputProductKbn/send").itemCd("send").build());
		// [#2854] HT国際化対応(画面マスタ連携) 2017.10.29 ライ MOD END
		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		//預託区分名称取得
		if(!"".equals(dto.getDeposit())){
			MCustomer mCustomer = new MCustomer();
			mCustomer.setCustomerCd(dto.getDeposit());
			mCustomer.setClientId(dto.data.wHtInventoryInputProdDto.getClientId());

			mCustomer = customerLogic.getUkEntity(mCustomer);
			wHtInventoryInputProdDto.setConsignmentClsNm("");
			if (mCustomer != null) {
				if(mCustomer.isDepositFlg$1()){
					wHtInventoryInputProdDto.setConsignmentClsNm(mCustomer.getCustomerNm());
				}
			}
		}else{
			wHtInventoryInputProdDto.setConsignmentClsNm("");
		}

		//在庫区分名称取得
		if(!"".equals(dto.getStockType())){
			MStockType mStockType = new MStockType();
			mStockType.setStockTypeCd(dto.getStockType());
			MStockType retMStockType = inventoryLogic.getStockTypeNm(bUser, mStockType);
			if (retMStockType!=null){
				wHtInventoryInputProdDto.setStkClsNm(retMStockType.getVDict().getDictNm());
			}
		}else{
			wHtInventoryInputProdDto.setStkClsNm("");
		}

		//預託・在庫区分入力画面へ遷移
		util.setTransURL(HT_URI_BASE + "/wms/inventory/InventoryInputProductKbn.jsp", ses);
	}

	/**
	 * 送信時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(ロケ入力)画面に遷移します。
	 * @param bean 商品棚卸入力(預託・在庫区分入力)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/send")
	public void send(@BeanParam InventoryInputProductKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");
		WHtInventoryInputProdDto wHtInventoryInputProdDto = dto.getwHtInventoryInputProdDto();

		//2015/04/27 KAI UPDATE START テキストボックス廃止に伴い入力チェック方法変更
		/*
		dto.setDeposit(bean.getDeposit());
		dto.setStockType(bean.getStockType());

		//入力チェック
		String valMsg = util.inputCheck(ses, bean);
		if (valMsg != null && valMsg.trim().length() > 0) {
			//入力エラー
			sendErrorScreen(valMsg, "", getClass().getAnnotation(HandyErrorReturnPath.class).returnURL());
			return;
		}
		*/

		//棚卸データ存在チェック
		//システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setClientId(wHtInventoryInputProdDto.getClientId());
		mClientCenter.setCenterId(wHtInventoryInputProdDto.getCenterId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		String sysDt = CommonUtil.dateToString(CommonUtil.stringToDate(mClientCenter.getSystemDt()));

		//棚卸ヘッダ取得処理
		TInventoryHCB tInventoryHCB = tInventoryHBhv.newMyConditionBean();

		tInventoryHCB.query().setInventoryDt_Equal(sysDt);
		tInventoryHCB.query().setClientId_Equal(wHtInventoryInputProdDto.getClientId());
		tInventoryHCB.query().setCenterId_Equal(wHtInventoryInputProdDto.getCenterId());

		List<TInventoryH> lstTInventoryH = tInventoryHBhv.selectList(tInventoryHCB);
		if (lstTInventoryH.size()==0){
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_NO_STOCK_COUNT);
			return;
		}


		//預託選択チェック
		if (CU.isNullOrEmpty(dto.getDeposit())) {
			dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
			ses.setAttribute("InventoryInputProductDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DEPOSIT_NOT_SELECT_ERROR);
			return;
		}
		//在庫区分選択チェック
		if (CU.isNullOrEmpty(dto.getStockType())) {
			dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
			ses.setAttribute("InventoryInputProductDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STOCK_TYPE_NOT_SELECT_ERROR);
			return;
		}
		//2015/04/27 KAI UPDATE END

		//預託区分存在チェック
		MCustomer mCustomer = new MCustomer();
		//2015/04/27 KAI UPDATE START テキストボックス廃止に伴い選択した預託で検索
		//mCustomer.setCustomerCd(bean.getDeposit());
		mCustomer.setCustomerCd(dto.getDeposit());
		//2015/04/27 KAI UPDATE END
		mCustomer.setClientId(dto.data.wHtInventoryInputProdDto.getClientId());

		mCustomer = customerLogic.getUkEntity(mCustomer, new ErrorStatus());
		if (mCustomer == null) {
			wHtInventoryInputProdDto.setConsignmentClsNm("");
			wHtInventoryInputProdDto.setConsignmentClsId(null);
			dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
			ses.setAttribute("InventoryInputProductDto", dto);
			return;
		}
		wHtInventoryInputProdDto.setConsignmentClsNm(mCustomer.getCustomerNm());
		wHtInventoryInputProdDto.setConsignmentClsId(mCustomer.getCustomerId());

		if(!mCustomer.isDepositFlg$1()){
			wHtInventoryInputProdDto.setConsignmentClsNm("");
			wHtInventoryInputProdDto.setConsignmentClsId(null);
			dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
			ses.setAttribute("InventoryInputProductDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.DEPOSIT_STOCK_CLASS_NOT_FOUND_ERROR);
			return;
		}

		//在庫区分存在チェック
		MStockType mStockType = new MStockType();
		//2015/04/27 KAI UPDATE START テキストボックス廃止に伴い選択した預託で検索
		//mStockType.setStockTypeCd(bean.getStockType());
		mStockType.setStockTypeCd(dto.getStockType());
		//2015/04/27 KAI UPDATE END
		MStockType retMStockType = inventoryLogic.getStockTypeNm(bUser, mStockType);
		if (retMStockType  == null){
			wHtInventoryInputProdDto.setStockTypeId(null);
			wHtInventoryInputProdDto.setStkClsNm("");
			dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);
			ses.setAttribute("InventoryInputProductDto", dto);
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_STOCK_TYPE_FLAG_NOT_FOUND_ERROR);
			return;
		}
		wHtInventoryInputProdDto.setStockTypeId(retMStockType.getStockTypeId());
		wHtInventoryInputProdDto.setStkClsNm(retMStockType.getVDict().getDictNm());
		dto.setwHtInventoryInputProdDto(wHtInventoryInputProdDto);

		//通信制御データ作成
		util.setHtComCtl(ses, "InventoryInputProduct", dto.getDeposit() + "|" + dto.getStockType());

		ses.setAttribute("InventoryInputProductDto", dto);

		//ロケ入力画面を表示
		InventoryInputProductLocResource.load(this, util);

	}
	/**
	 * 預託区分押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(預託選択入力)画面に遷移します。
	 * @param bean 商品棚卸入力(預託・在庫区分入力)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/deposit")
	public void deposit(@BeanParam InventoryInputProductKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		//2015/04/27 KAI DELETE START 入力テキストボックス廃止に伴い削除
		//dto.setDeposit(bean.getDeposit());
		//dto.setStockType(bean.getStockType());
		//2015/04/27 KAI DELETE END

		ses.setAttribute("InventoryInputProductDto", dto);

		//預託入力画面を表示
		InventoryInputProductDepositSelectResource.load(this, util, "InventoryInputProductKbn/display", depositSelect);

	}

	/**
	 * 在庫区分押す時にコールされるメソッドです。<br>
	 * 入力チェックを行い、商品棚卸入力(在庫選択入力)画面に遷移します。
	 * @param bean 商品棚卸入力(預託・在庫区分入力)画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/stockType")
	public void stockType(@BeanParam InventoryInputProductKbnDto bean) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		InventoryInputProductDto dto = (InventoryInputProductDto) ses.getAttribute("InventoryInputProductDto");

		//2015/04/27 KAI DELETE START 入力テキストボックス廃止に伴い削除
		//dto.setDeposit(bean.getDeposit());
		//dto.setStockType(bean.getStockType());
		//2015/04/27 KAI DELETE END

		ses.setAttribute("InventoryInputProductDto", dto);

		//在庫入力画面を表示
		InventoryInputProductStockTypeSelectResource.load(this, util, "InventoryInputProductKbn/display", userLogic, stockTypeSelect);

	}

}
