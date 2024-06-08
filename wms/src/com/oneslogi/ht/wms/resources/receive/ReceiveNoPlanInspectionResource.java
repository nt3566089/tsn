package com.oneslogi.ht.wms.resources.receive;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.WHtReceiveNoPlanInspDto;
import com.oneslogi.base.dbflute.dtomapper.MParamDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.TReceivePlanHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.WHtReceiveNoPlanInspDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.WHtReceiveNoPlanInsp;
import com.oneslogi.base.exception.ErrorManager;
import com.oneslogi.base.util.CU;
import com.oneslogi.ht.base.cdi.annotation.HandyErrorReturnPath;
import com.oneslogi.ht.base.resources.HandyResourceBase;
import com.oneslogi.ht.wms.dto.HandyLoginUserInfo;
import com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionCheckLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionDeleteLogic;
import com.oneslogi.ht.wms.logic.receive.ReceiveNoPlanInspectionSelectLogic;
import com.oneslogi.ht.wms.util.HandyCommonUtil;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;

/**
 * 予定無し入荷再開Resourceクラスです。
 *
 */
@Path("/handy/ReceiveNoPlanInspection")
@HandyErrorReturnPath(returnURL = "ReceiveNoPlanInspection/reopenProcess")
public class ReceiveNoPlanInspectionResource extends HandyResourceBase {

	@Inject
	private HandyCommonUtil util;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private UserLogic userLogic;
	@Inject
	private ReceiveNoPlanInspectionSelectLogic selectLogic;
	@Inject
	private ReceiveNoPlanInspectionCheckLogic checkLogic;
	@Inject
	private ReceiveNoPlanInspectionDeleteLogic deleteLogic;

	/**
	 * 再開時にコールされるメソッドです。<br>
	 * 入力チェックを行い、予定無し入荷(JAN入力)画面に遷移します。
	 * @param reopenKey JAN入力画面情報を保持DTO
	 * @throws Exception
	 */
	@GET
	@Path("/reopenProcess")
	public void reopenProcess(@QueryParam("inputText") String reopenKey) throws Exception {

		HttpServletRequest req = getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		BUser bUser = new BUser();
		bUser.setUserCd(loginInfo.getUserCd());
		bUser = userLogic.getUkEntity(bUser);

		//機能単位セッションを処理化
		ReceiveNoPlanInspectionResource.createSession(this, util, centerLogic, clientLogic, warehouseLogic, selectLogic);

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		String labelKbn = reopenKey.split(",")[0];
		String htWorkNo = reopenKey.split(",")[1];
		// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA Start
//		String clientReceiveNo = reopenKey.split(",")[2];
//		String deposit = reopenKey.split(",")[3];
//		String processType = reopenKey.split(",")[4];
//		String stockType = reopenKey.split(",")[5];
//		String supplier = reopenKey.split(",")[6];

        // 予定無し入荷ワーク
		WHtReceiveNoPlanInsp wHtReceiveNoPlanInspection = new WHtReceiveNoPlanInsp();
		wHtReceiveNoPlanInspection.setHtWorkNo(htWorkNo);
		wHtReceiveNoPlanInspection.setMacAddress(dto.getMacAddress());

		wHtReceiveNoPlanInspection = checkLogic.checkWHtReceiveNoPlanInsp(wHtReceiveNoPlanInspection);
		if (wHtReceiveNoPlanInspection == null) {
			//存在しない場合はラベル選択画面に遷移
			ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

			//機能単位セッションを再構造
			ReceiveNoPlanInspectionResource.removeSession(this, util, deleteLogic);

			this.sendErrorScreen(util.getMessage(this.getErrorManager()), "", "ReceiveNoPlanInspectionLabel/load");
			this.getErrorManager().clear();

			return;
		}

		String clientReceiveNo = wHtReceiveNoPlanInspection.getClientReceiveNo();
		String deposit = wHtReceiveNoPlanInspection.chaseMCustomerByDepositId().getCustomerCd();
		String processType = wHtReceiveNoPlanInspection.chaseMProcessType().getProcessTypeCd();
		String stockType = wHtReceiveNoPlanInspection.chaseMStockType().getStockTypeCd();
		String supplier = wHtReceiveNoPlanInspection.chaseMCustomerBySupplierId().getCustomerCd();
		// [ON推-品向-1016] 再開処理を修正 2015.11.16 By SJA End

		//伝票No.の初期化
		wHtReceiveNoPlanInspecDto.setHtWorkNo(htWorkNo);
		//ラベル区分の初期化
		dto.setLabelKbn(labelKbn);
		//顧客入荷指示No.の初期化
		wHtReceiveNoPlanInspecDto.setClientReceiveNo(clientReceiveNo);

		//預託の初期化
		dto.setDeposit(deposit);
		//預託区分名称取得
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

		//処理区分の初期化
		dto.setProcessType(processType);
		//処理区分名称取得
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

		//在庫区分の初期化
		dto.setStockType(stockType);
		//在庫区分名称取得
		MStockType mStockType = new MStockType();
		mStockType.setStockTypeCd(dto.getStockType());
		MStockType retMStockType = selectLogic.getStockTypeNm(bUser, mStockType);
		if (retMStockType!=null){
			wHtReceiveNoPlanInspecDto.setStockTypeId(retMStockType.getStockTypeId());
			wHtReceiveNoPlanInspecDto.setStockTypeNm(retMStockType.getVDict().getDictNm());
		}

		//仕入先の初期化
		dto.setSupplier(supplier);
		//預託区分名称取得
		MCustomer mCustomerSupplier = new MCustomer();
		mCustomerSupplier.setCustomerCd(dto.getSupplier());
		mCustomerSupplier.setClientId(wHtReceiveNoPlanInspecDto.getClientId());

		mCustomerSupplier = customerLogic.getUkEntity(mCustomerSupplier);
		wHtReceiveNoPlanInspecDto.setSupplierNm("");
		if (mCustomerSupplier != null) {
			if(mCustomerSupplier.isVendorFlg$1()){
				wHtReceiveNoPlanInspecDto.setSupplierId(mCustomerSupplier.getCustomerId());
				wHtReceiveNoPlanInspecDto.setSupplierCd(mCustomerSupplier.getCustomerCd());
				wHtReceiveNoPlanInspecDto.setSupplierNm(mCustomerSupplier.getCustomerNm());
			}
		}
		dto.setWHtReceiveNoPlanInspDto(wHtReceiveNoPlanInspecDto);

		if (!CU.isNullOrEmpty(htWorkNo)) {
			TReceivePlanH tReceivePlanH = new TReceivePlanH();
			tReceivePlanH.setClientId(wHtReceiveNoPlanInspecDto.getClientId());
			tReceivePlanH.setCenterId(wHtReceiveNoPlanInspecDto.getCenterId());
			tReceivePlanH.setReceiveSlipNo(htWorkNo);

			// 伝票No存在チェック
			tReceivePlanH = checkLogic.checkReceiveSlipNo(tReceivePlanH);
			if (tReceivePlanH == null) {
				//存在しない場合はラベル選択画面に遷移
				ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

				//機能単位セッションを再構造
				ReceiveNoPlanInspectionResource.removeSession(this, util, deleteLogic);

				ErrorManager errorManager = this.getErrorManager();
				this.sendErrorScreen(util.getMessage(errorManager), "", "ReceiveNoPlanInspectionLabel/load");
				errorManager.clear();

				return;
			}
			TReceivePlanHDtoMapper tReceivePlanHDtoMapper = new TReceivePlanHDtoMapper();
			dto.setTReceivePlanHDto(tReceivePlanHDtoMapper.mappingToDto(tReceivePlanH));
		}

		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);

		//Jan入力画面を表示
		ReceiveNoPlanInspectionJanResource.display(this, util);
	}

	/**
	 * <h2>機能単位セッションを処理化</h2>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param centerLogic    センタマスタに対するロジック
	 * @param clientLogic    荷主マスタに対するロジック
	 * @param warehouseLogic 倉庫マスタに対するロジック
	 * @throws Exception
	 */
	public static void createSession(HandyResourceBase resource, HandyCommonUtil util, CenterLogic centerLogic,
			ClientLogic clientLogic, WarehouseLogic warehouseLogic, ReceiveNoPlanInspectionSelectLogic selectLogic) throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		HandyLoginUserInfo loginInfo = (HandyLoginUserInfo) ses.getAttribute("loginInfo");

		//予定無し入荷情報の初期化
		ReceiveNoPlanInspectionDto dto = new ReceiveNoPlanInspectionDto();
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		//センタ情報の初期化
		wHtReceiveNoPlanInspecDto.setCenterId(loginInfo.getCenterId());

		////荷主情報の取得
		wHtReceiveNoPlanInspecDto.setClientId(loginInfo.getClientId());

		//MACアドレスの初期化
		dto.setMacAddress(util.getMacAddress(ses));
		//パラメータマスタ情報の取得
		MParam mParam = selectLogic.getMParam(loginInfo.getClientId(), loginInfo.getCenterId());
		if (mParam != null) {
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [S]
			// パラメータマスタ
			MParamDtoMapper mPatamDtoMapper = new MParamDtoMapper();
			dto.setMParamDto(mPatamDtoMapper.mappingToDto(mParam));
			// [ON推-UT210-014] パラメータマスタ情報はマスタDtoのみの設定に変更 yokosuka 2016.07.13 [E]
		}
		ses.setAttribute("ReceiveNoPlanInspectionDto", dto);
	}

	/**
	 * <h2>機能単位セッションをクリア</h2>
	 * @param resource       呼び出すResourceクラス
	 * @param util           ハンディ向けモジュールで使用する共通関数群
	 * @param deleteLogic    予定無し入荷ワーク削除ロジック
	 * @throws Exception
	 */
	public static void removeSession(HandyResourceBase resource, HandyCommonUtil util, ReceiveNoPlanInspectionDeleteLogic deleteLogic)
			throws Exception {

		HttpServletRequest req = resource.getHttpServletRequest();
		HttpSession ses = req.getSession();

		ReceiveNoPlanInspectionDto dto = (ReceiveNoPlanInspectionDto) ses.getAttribute("ReceiveNoPlanInspectionDto");
		WHtReceiveNoPlanInspDto wHtReceiveNoPlanInspecDto = dto.getwHtReceiveNoPlanInspDto();

		WHtReceiveNoPlanInspDtoMapper wHtReceiveNoPlanInspecDtoMapper = new WHtReceiveNoPlanInspDtoMapper();
		WHtReceiveNoPlanInsp wHtReceiveNoPlanInspec = wHtReceiveNoPlanInspecDtoMapper.mappingToEntity(wHtReceiveNoPlanInspecDto);

		//予定無し入荷ワークテーブルをクリア
		deleteLogic.clearWHtReceiveNoPlanInsption(wHtReceiveNoPlanInspec);

		//通信制御データをクリア
		util.clearHtComCtl(ses);

		// [ON推-品向-1004] 継続であっても、別入荷予定ヘッダを作成しを修正 2015.11.12 By SJA Start
		//ses.removeAttribute("ReceiveNoPlanInspection");
		ses.removeAttribute("ReceiveNoPlanInspectionDto");
		// [ON推-品向-1004] 継続であっても、別入荷予定ヘッダを作成しを修正 2015.11.12 By SJA End
	}

}
