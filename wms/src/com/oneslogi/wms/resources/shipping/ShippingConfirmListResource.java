package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstBCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingConfirmListDto;
import com.oneslogi.base.dbflute.dtomapper.TPickingHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlShippingConfirmListDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstBBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstB;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingConfirmList;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingConfirmListDto;
import com.oneslogi.wms.logic.shipping.ShipCompleteLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingConfirmListSelectLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷確定一覧画面のリソースクラス。
 */
@Path("/shipping/shippingConfirmList")
public class ShippingConfirmListResource extends AbstractWmsResource {

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 出荷確定一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_CHECK_ERROR = 3;
		/**
		 * 強制確定時チェック異常
		 */
		protected static final int CHECK_COMPULSORY_ERROR = 4;
		/**
		 * 出荷確定時チェック異常
		 */
		protected static final int CHECK_COMFIRM_ERROR = 5;
		/**
		 * 出荷確定解除時チェック異常
		 */
		protected static final int CHECK_COMFIRM_CANCEL_ERROR = 6;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROL_UPDATE_ERROR = 7;
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
		/**
		 *一部欠品異常
		 */
		protected static final int INSPECTED_CANNOT_START_SOME_STOCKOUT_ERROR = 8;
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingConfirmListSelectLogic selectLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	@Inject
	private ShipCompleteLogic shipCompleteLogic;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;
	//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
	@Inject
	private TShippingInstBBhv tShippingInstBBhv;
	//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End

	/**
	 * <h2>初期処理</h2>
	 * @return ShippingConfirmListDto 出荷確定一覧画面用DTO
	 */
	@GET
	@Path("/initial")
	public ShippingConfirmListDto initial() {
		return new ShippingConfirmListDto();
	}

	/**
	 * <h2>出荷確定一覧データ取得</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 画面で入力されたCDを元にIDを取得し、出荷確定一覧データ取得
	 * </pre>
	 * @param shippingConfirmListDto 出荷確定一覧画面用DTO
	 * @return ShippingConfirmListDto 出荷確定一覧画面用DTO
	 */
	@GET
	@Path("/confirmSearch")
	public ShippingConfirmListDto confirmSearch(ShippingConfirmListDto shippingConfirmListDto) {
		return searchByOutsideSql(shippingConfirmListDto);
	}

	/**
	 * 外だしＳＱＬのサンプルです。
	 * ＳＱＬ操作に関わる記述以外はサンプルとして開発基準を満たしておりません。
	 * ご注意ください。
	 */
	private ShippingConfirmListDto searchByOutsideSql(ShippingConfirmListDto shippingConfirmListDto) {

		ShippingConfirmListDto resultShippingConfirmListDto = new ShippingConfirmListDto();

		// Entity変換
		TPickingHDtoMapper headerMapper = new TPickingHDtoMapper();
		final TPickingH header = headerMapper.mappingToEntity(shippingConfirmListDto.data.search);

		// 出荷確定一覧取得用
		List<SqlShippingConfirmList> page = selectLogic.select(header, shippingConfirmListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultShippingConfirmListDto;
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
		// 区分値マスタより取得
		BClassDtlCB cb = bClassDtlBhv.newConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("PICKING_STATUS");
		classCdList.add("SHIPPING_STOP_FLG");
		classCdList.add("FORCE_FIXED_FLG");
		classCdList.add("INVOICE_CREATE_FLG");
		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> bClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, String>> bClassMap = new HashMap<String, Map<String, String>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, String> dtlMap = null;
		for (BClassDtl bClassDtl : bClassList) {
			if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
			} else {
				if (classCd.length() > 0) {
					bClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, String>();
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl.getVDict().getDictNm());
				classCd = bClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			bClassMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		for (SqlShippingConfirmList sql : page) {
			if (bClassMap.containsKey("PICKING_STATUS")) {
				if (bClassMap.get("PICKING_STATUS").containsKey(sql.getPickingStatus())) {
					sql.setPickingStatusNm(bClassMap.get("PICKING_STATUS").get(sql.getPickingStatus()));
				}
			}
			if (bClassMap.containsKey("SHIPPING_STOP_FLG")) {
				if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(sql.getShippingStopFlg())) {
					sql.setShippingStopFlgNm(bClassMap.get("SHIPPING_STOP_FLG").get(sql.getShippingStopFlg()));
				}
				if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(sql.getStopFlg())) {
					sql.setStopFlgNm(bClassMap.get("SHIPPING_STOP_FLG").get(sql.getStopFlg()));
				}
			}
			if (bClassMap.containsKey("FORCE_FIXED_FLG")) {
				if (bClassMap.get("FORCE_FIXED_FLG").containsKey(sql.getForceFixedFlg())) {
					sql.setForceFixedFlgNm(bClassMap.get("FORCE_FIXED_FLG").get(sql.getForceFixedFlg()));
				}
			}
			if (bClassMap.containsKey("INVOICE_CREATE_FLG")) {
				if (bClassMap.get("INVOICE_CREATE_FLG").containsKey(sql.getInvoiceCreateFlg())) {
					sql.setInvoiceCreateFlgNm(bClassMap.get("INVOICE_CREATE_FLG").get(sql.getInvoiceCreateFlg()));
				}
			}
		}
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start

		// Dto変換処理
		SqlShippingConfirmListDtoMapper mapper = new SqlShippingConfirmListDtoMapper();
		List<SqlShippingConfirmListDto> list = mapper.mappingToDtoList(page);

		//検索結果
		resultShippingConfirmListDto.paging = shippingConfirmListDto.paging;
		resultShippingConfirmListDto.data.list = list;

		return resultShippingConfirmListDto;
	}

	/**
	 * <h2>チェック処理(出荷確定時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingConfirmDto 出荷確定一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkConfirm")
	public StatusDto checkConfirm(ShippingConfirmListDto shippingConfirmDto) {
		//出荷状態チェック
		List<TPickingH> listTPickingH = new ArrayList<TPickingH>();
		TPickingH entityTPickingH = null;

		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			entityTPickingH = new TPickingH();
			entityTPickingH.setPickingStatus(list.getPickingStatus());
			listTPickingH.add(entityTPickingH);
		}
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
				for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
					TShippingInstBCB tsib = tShippingInstBBhv.newMyConditionBean();
					tsib.setupSelect_TShippingInstH();
					tsib.setupSelect_TAllocInstB();
					//商品マスタ
					tsib.setupSelect_MProduct();
					//取引先マスタ(納品先)
					tsib.setupSelect_MCustomer();
					//荷主マスタ
					tsib.setupSelect_TShippingInstH().withMClient();
					//センタマスタ
					tsib.setupSelect_TShippingInstH().withMCenter();
					tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(list.getPickingWorkNo());
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
					//荷主ID（Client_ID）
					tsib.query().queryTShippingInstH().setClientId_Equal(list.getClientId());
					tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setClientId_Equal(list.getClientId());
					//センタID（Center_ID）
					tsib.query().queryTShippingInstH().setCenterId_Equal(list.getCenterId());
					tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setCenterId_Equal(list.getCenterId());
					// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
					ListResultBean<TShippingInstB> tsb = tShippingInstBBhv.selectList(tsib);
					if(tsb != null){
						for (TShippingInstB tib : tsb) {
							if(tib.getMProduct().getShippingStopFlg().equals("1")){
								// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
								if (WCC.isPositive(tib.getStockOutNum())) {
								// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
									if (WCC.isPositive(tib.getTAllocInstB().getAllocNum())){
										this.getErrorManager().add(this.errRetSts(StatusCode.INSPECTED_CANNOT_START_SOME_STOCKOUT_ERROR), WmsMessageConst.INSPECT_CANNOT_START_SOME_STOCK_OUT_SHIPPING_STOP_DATA_ERROR);
										return null;
									}
								}
							}
							//if(tib.getMCustomer().getShippingStopFlg().equals("1")){
							//	this.getErrorManager().add(this.errRetSts(StatusCode.INSPECTED_CANNOT_START_SOME_STOCKOUT_ERROR), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
							//	return null;
							//}
						}
					}
				}
				//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End
		shipStatusCheckLogic.shipComplete(null, null, listTPickingH, null, errRetSts(StatusCode.SHIPPING_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;
	}

	/**
	 * <h2>出荷確定処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷確定処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingConfirmDto 出荷確定一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/confirm")
	public ShippingConfirmListDto confirm(ShippingConfirmListDto shippingConfirmDto) {

		List<TPickingH> listTPickingH = new ArrayList<TPickingH>();
		TPickingH entityTPickingH = null;

		//出庫ヘッダ.行数
		int countTPickingH = 0;

		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			entityTPickingH = new TPickingH();
			entityTPickingH.setClientId(list.getClientId());
			entityTPickingH.setCenterId(list.getCenterId());
			entityTPickingH.setUpdDt(list.getUpdDt());
			entityTPickingH.setPickingWorkNo(list.getPickingWorkNo());
			entityTPickingH.setPickingStatus(list.getPickingStatus());
			entityTPickingH.setConfirmCancelFlg("00");
			countTPickingH = countTPickingH + Integer.parseInt(list.getPicking() + "");
			listTPickingH.add(entityTPickingH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.shipComplete(null, null, listTPickingH, null, errRetSts(StatusCode.SHIPPING_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 出荷指示ヘッダを軸とした排他制御処理
		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			TShippingInstH entity = tShippingInstHBhv.newMyEntity();
		    TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		    cb.query().setAllocInstHId_Equal(list.getAllocInstHId());
		    cb.query().setUpdDt_LessEqual(list.getShippingHUpdDt());
		    if (tShippingInstHBhv.queryUpdate(entity, cb) != list.getShippingHCount()) {
			    getErrorManager().add(new ErrorStatus(StatusCode.CONTROL_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
		    }
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.updateTPickingH(listTPickingH, controlNo, errRetSts(StatusCode.CONTROL_UPDATE_ERROR));

		if (updateCnt != countTPickingH) {
		    getErrorManager().add(new ErrorStatus(StatusCode.CONTROL_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//出荷確定処理
		entityTPickingH = new TPickingH();
		entityTPickingH.setControlNo(controlNo);
		shipCompleteLogic.ShipComplete(entityTPickingH, errRetSts(StatusCode.CHECK_COMFIRM_ERROR));

		//コントロールNo.のクリア処理
		for (TPickingH list : listTPickingH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;

		//コントロールNo.更新
		updateControlNoLogic.updateTPickingH(listTPickingH, controlNo, errRetSts(StatusCode.CONTROL_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>チェック処理(出荷確定解除時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingConfirmDto 出荷確定一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkConfirmCancel")
	public StatusDto checkConfirmCancel(ShippingConfirmListDto shippingConfirmDto) {
		//出荷状態チェック
		List<TPickingH> listTPickingH = new ArrayList<TPickingH>();
		TPickingH entityTPickingH = null;

		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			entityTPickingH = new TPickingH();
			entityTPickingH.setPickingStatus(list.getPickingStatus());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			entityTPickingH.setPickingWorkNo(list.getPickingWorkNo());
			entityTPickingH.setPickingHId(list.getPickingHId());
			entityTPickingH.setCenterTransitFlg(list.getCenterTransitFlg());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End
			listTPickingH.add(entityTPickingH);
		}

		shipStatusCheckLogic.shipCompleteCancel(null, null, listTPickingH, null, errRetSts(StatusCode.SHIPPING_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;
	}

	/**
	 * <h2>出荷確定解除処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷確定解除処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingConfirmDto 出荷確定一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/confirmCancel")
	public ShippingConfirmListDto confirmCancel(ShippingConfirmListDto shippingConfirmDto) {

		List<TPickingH> listTPickingH = new ArrayList<TPickingH>();
		TPickingH entityTPickingH = null;

		//出庫ヘッダ.行数
		int countTPickingH = 0;

		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			entityTPickingH = new TPickingH();
			entityTPickingH.setClientId(list.getClientId());
			entityTPickingH.setCenterId(list.getCenterId());
			entityTPickingH.setUpdDt(list.getUpdDt());
			entityTPickingH.setPickingWorkNo(list.getPickingWorkNo());
			entityTPickingH.setPickingStatus(list.getPickingStatus());
			entityTPickingH.setConfirmCancelFlg("20");
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start
			entityTPickingH.setPickingHId(list.getPickingHId());
			entityTPickingH.setCenterTransitFlg(list.getCenterTransitFlg());
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

			countTPickingH = countTPickingH + Integer.parseInt(list.getPicking() + "");
			listTPickingH.add(entityTPickingH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.shipCompleteCancel(null, null, listTPickingH, null, errRetSts(StatusCode.SHIPPING_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 出荷指示ヘッダを軸とした排他制御処理
		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			TShippingInstH entity = tShippingInstHBhv.newMyEntity();
		    TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		    cb.query().setAllocInstHId_Equal(list.getAllocInstHId());
		    cb.query().setUpdDt_LessEqual(list.getShippingHUpdDt());
		    if (tShippingInstHBhv.queryUpdate(entity, cb) != list.getShippingHCount()) {
			    getErrorManager().add(new ErrorStatus(StatusCode.CONTROL_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
		    }
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.updateTPickingH(listTPickingH, controlNo, errRetSts(StatusCode.CONTROL_UPDATE_ERROR));

		if (updateCnt != countTPickingH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROL_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//出荷確定解除処理
		entityTPickingH = new TPickingH();
		entityTPickingH.setControlNo(controlNo);
		shipCompleteLogic.ShipCompleteCancel(entityTPickingH, errRetSts(StatusCode.CHECK_COMFIRM_CANCEL_ERROR));

		//コントロールNo.のクリア処理
		for (TPickingH list : listTPickingH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;

		//コントロールNo.更新
		updateControlNoLogic.updateTPickingH(listTPickingH, controlNo, errRetSts(StatusCode.CONTROL_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>チェック処理(強制確定時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingConfirmDto 出荷確定一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkCompulsory")
	public StatusDto checkCompulsory(ShippingConfirmListDto shippingConfirmDto) {
		//出荷状態チェック
		List<TPickingH> listTPickingH = new ArrayList<TPickingH>();
		TPickingH entityTPickingH = null;

		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			entityTPickingH = new TPickingH();
			entityTPickingH.setPickingStatus(list.getPickingStatus());
			listTPickingH.add(entityTPickingH);
		}
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI Start
		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			TShippingInstBCB tsib = tShippingInstBBhv.newMyConditionBean();
			tsib.setupSelect_TShippingInstH();
			tsib.setupSelect_TAllocInstB();
			//商品マスタ
			tsib.setupSelect_MProduct();
			//取引先マスタ(納品先)
			tsib.setupSelect_MCustomer();
			//荷主マスタ
			tsib.setupSelect_TShippingInstH().withMClient();
			//センタマスタ
			tsib.setupSelect_TShippingInstH().withMCenter();
			tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setPickingWorkNo_Equal(list.getPickingWorkNo());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
			//荷主ID（Client_ID）
			tsib.query().queryTShippingInstH().setClientId_Equal(list.getClientId());
			tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setClientId_Equal(list.getClientId());
			//センタID（Center_ID）
			tsib.query().queryTShippingInstH().setCenterId_Equal(list.getCenterId());
			tsib.query().queryTShippingInstH().queryTAllocInstH().queryTPickingH().setCenterId_Equal(list.getCenterId());
			// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End
			ListResultBean<TShippingInstB> tsb = tShippingInstBBhv.selectList(tsib);
			if(tsb != null){
				for (TShippingInstB tib : tsb) {
					if(tib.getMProduct().getShippingStopFlg().equals("1")){
						// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana Start
						if (WCC.isPositive(tib.getStockOutNum())) {
						// [#5144][v3.1] 欠品フラグを出庫指示ヘッダに移動 2018.07.23 kawana End
							if (WCC.isPositive(tib.getTAllocInstB().getAllocNum())){
								this.getErrorManager().add(this.errRetSts(StatusCode.INSPECTED_CANNOT_START_SOME_STOCKOUT_ERROR), WmsMessageConst.INSPECT_CANNOT_START_SOME_STOCK_OUT_SHIPPING_STOP_DATA_ERROR);
								return null;
							}
						}
					}
					//if(tib.getMCustomer().getShippingStopFlg().equals("1")){
					//	this.getErrorManager().add(this.errRetSts(StatusCode.INSPECTED_CANNOT_START_SOME_STOCKOUT_ERROR), WmsMessageConst.FOUND_STOPPED_SHIP_TO_ERROR);
					//	return null;
					//}
				}
			}
		}
		//[ON推-品向-477] 一部欠品の場合、出荷検品・出荷確定・強制確定をNGとする。 2014.12.24 KI End


		shipStatusCheckLogic.forcedShipComplete(null, null, listTPickingH, null, errRetSts(StatusCode.SHIPPING_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;
	}

	/**
	 * <h2>強制確定処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、強制確定処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingConfirmDto 出荷確定一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/compulsory")
	public ShippingConfirmListDto compulsory(ShippingConfirmListDto shippingConfirmDto) {

		List<TPickingH> listTPickingH = new ArrayList<TPickingH>();
		TPickingH entityTPickingH = null;

		//出庫ヘッダ.行数
		int countTPickingH = 0;

		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			entityTPickingH = new TPickingH();
			entityTPickingH.setClientId(list.getClientId());
			entityTPickingH.setCenterId(list.getCenterId());
			entityTPickingH.setUpdDt(list.getUpdDt());
			entityTPickingH.setPickingWorkNo(list.getPickingWorkNo());
			entityTPickingH.setPickingStatus(list.getPickingStatus());
			countTPickingH = countTPickingH + Integer.parseInt(list.getPicking() + "");
			listTPickingH.add(entityTPickingH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.forcedShipComplete(null, null, listTPickingH, null, errRetSts(StatusCode.SHIPPING_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 出荷指示ヘッダを軸とした排他制御処理
		for (SqlShippingConfirmListDto list : shippingConfirmDto.data.list) {
			TShippingInstH entity = tShippingInstHBhv.newMyEntity();
			TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
			cb.query().setAllocInstHId_Equal(list.getAllocInstHId());
			cb.query().setUpdDt_LessEqual(list.getShippingHUpdDt());
			if (tShippingInstHBhv.queryUpdate(entity, cb) != list.getShippingHCount()) {
				getErrorManager().add(new ErrorStatus(StatusCode.CONTROL_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
				return null;
			}
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.updateTPickingH(listTPickingH, controlNo, errRetSts(StatusCode.CONTROL_UPDATE_ERROR));

		if (updateCnt != countTPickingH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROL_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//強制確定処理
		entityTPickingH = new TPickingH();
		entityTPickingH.setControlNo(controlNo);
		shipCompleteLogic.ForcedShipComplete(entityTPickingH, errRetSts(StatusCode.CHECK_COMPULSORY_ERROR));

		//コントロールNo.のクリア処理
		for (TPickingH listTp : listTPickingH) {
			listTp.setControlNo(controlNo);
		}
		controlNo = null;

		//コントロールNo.更新
		updateControlNoLogic.updateTPickingH(listTPickingH, controlNo, errRetSts(StatusCode.CONTROL_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
