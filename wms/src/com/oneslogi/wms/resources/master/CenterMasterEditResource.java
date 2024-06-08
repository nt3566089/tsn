package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.BCultureCB;
import com.oneslogi.base.dbflute.cbean.BTimeZoneCB;
import com.oneslogi.base.dbflute.dto.MClientCenterDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientCenterDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.BCultureBhv;
import com.oneslogi.base.dbflute.exbhv.BTimeZoneBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.BCulture;
import com.oneslogi.base.dbflute.exentity.BTimeZone;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterMasterEditDto;
import com.oneslogi.wms.logic.common.BoxGrpLogic;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.UserCenterLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.master.CenterMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterMasterMaintenanceSelectLogic;
import com.oneslogi.wms.logic.master.CenterMasterUpdateLogic;
import com.oneslogi.wms.logic.master.ClientMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタマスタメンテナンス(編集)のリソースクラス
 */
@Path("/master/centerMasterEdit")
public class CenterMasterEditResource extends AbstractWmsResource {

	// ===== 定数定義 =====

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
		 * センタCDで重複エラー
		 */
		protected static final int CENTER_CODE_DUPLICATE_ERROR = 2;
		/**
		 * 荷主マスタ存在異常
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 3;
		/**
		 * センタマスタデータ取得異常
		 */
		protected static final int CENTER_MASTER_EDIT_SELECT_FAILED = 4;
		/**
		 * 登録異常
		 */
		protected static final int CENTER_MASTER_EDIT_INSERT_FAILED = 5;
		/**
		 * 更新異常
		 */
		protected static final int CENTER_MASTER_EDIT_UPDATE_FAILED = 6;
		/**
		 * 配送コースマスタ存在異常
		 */
		protected static final int DELIVERYCOURSE_NOT_FOUND_ERROR = 7;
		/**
		 * 配送コースマスタ存在異常
		 */
		protected static final int INPUT_CHECK_ERROR = 8;

		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
		/**
		 * 荷姿マスタ存在異常
		 */
		protected static final int CASE_SHAPE_NOT_FOUND_ERROR = 9;
		protected static final int BOWL_SHAPE_NOT_FOUND_ERROR = 10;
		protected static final int PIECE_SHAPE_NOT_FOUND_ERROR = 11;
		/**
		 * 倉庫マスタ存在異常
		 */
		protected static final int WAREHOUSE_NOT_FOUND_ERROR = 12;
		/**
		 * ゾーンマスタ存在異常
		 */
		protected static final int ZONE_NOT_FOUND_ERROR = 13;
		/**
		 * 梱包荷材グループマスタ存在異常
		 */
		protected static final int BOX_GRP_NOT_FOUND_ERROR = 14;
		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
		// [#1815] ログインユーザが使用できるセンタかのチェックを追加 2017.05.23 kawana Start
		/**
		 * センタ権限エラー
		 */
		protected static final int CENTER_PERMISSION_ERROR = 15;
		// [#1815] ログインユーザが使用できるセンタかのチェックを追加 2017.05.23 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterMasterMaintenanceSelectLogic centerMasterMaintenanceSelectLogic;
	@Inject
	private CenterMasterInsertLogic centerMasterInsertLogic;
	@Inject
	private CenterMasterUpdateLogic centerMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private BoxGrpLogic boxGrpLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ZoneLogic zoneLogic;
//	@Inject
//	private ShapeLogic shapeLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private ClientMasterSelectLogic clientMasterSelectLogic;
	@Inject
	private CenterClassLogic centerClassLogic;
	// [#1815] ログインユーザが使用できるセンタかのチェックを追加 2017.05.23 kawana Start
	@Inject
	private UserCenterLogic userCenterLogic;
	// [#1815] ログインユーザが使用できるセンタかのチェックを追加 2017.05.23 kawana End

	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu Start
	@Inject
	private BCultureBhv bCultureBhv;
	@Inject
	private BTimeZoneBhv bTimeZoneBhv;
	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu End

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
		CENTER_NOT_FOUND,
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CenterMasterEditDto initNew() {

		// 画面用DTO作成
		CenterMasterEditDto centerMasterEditDto = new CenterMasterEditDto();

		List<MClientCenter> mClientCenterlist = new ArrayList<MClientCenter>();
//		List<MCenter> mCenterList = new ArrayList<MCenter>();
		MCenter mCenter = new MCenter();
		mCenter.setMClientCenterList(mClientCenterlist);
//		mCenterList.add(mCenter);

		MCenterDtoMapper mapper = new MCenterDtoMapper();
		MClientCenterDtoMapper clientCenterMapper = new MClientCenterDtoMapper();
//		List<MCenterDto> mCenterDtoList = mapper.mappingToDtoList(mCenterList);
		List<MClientCenterDto> mCenterDtoList = clientCenterMapper.mappingToDtoList(mClientCenterlist);
		centerMasterEditDto.data.body = mCenterDtoList;
		centerMasterEditDto.data.head = mapper.mappingToDto(mCenter);

		return centerMasterEditDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタマスタIDをキーにセンデータ取り出し
	 * ・センタマスタのデータを画面用DTOに設定
	 * </pre>
	 * @param  mcenterId センタマスタID
	 * @return centerMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public CenterMasterEditDto initUpdate(@QueryParam("mcenterId") Long mcenterId) {

		// [#1815] ログインユーザが使用できるセンタかのチェックを追加 2017.05.23 kawana Start
		// センタ使用権限チェック
		userCenterLogic.checkPermission(mcenterId, errRetSts(StatusCode.CENTER_PERMISSION_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}
		// [#1815] ログインユーザが使用できるセンタかのチェックを追加 2017.05.23 kawana End

		// エンティティ編集
		CenterMasterEditDto centerMasterEditDto = new CenterMasterEditDto();
		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MClientCenterDtoMapper clientCentermapper = new MClientCenterDtoMapper();
		MCenter mCenter = new MCenter();
		mCenter.setCenterId(mcenterId);

		// 荷主センタマスタ(編集)検索データ取得
		List<MClientCenter> result = clientMasterSelectLogic.selectByCenterId(mCenter, centerMasterEditDto.paging, errRetSts(StatusCode.CENTER_MASTER_EDIT_SELECT_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 荷主センタマスタがない場合、センタマスタメンテナンスから、ヘッダ部データを選択する
		if (result.size() == 0) {
			List<MCenter> resultCenter = centerMasterMaintenanceSelectLogic.selectById(mCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_SELECT_FAILED));
			MCenterDtoMapper mapper = new MCenterDtoMapper();
			centerMasterEditDto.data.head = mapper.mappingToDto(resultCenter.get(0));
			return centerMasterEditDto;
		}

//		for (MClientCenter mClientCenter : result.get(0).getMClientCenterList()) {
		for (MClientCenter mClientCenter : result) {
			if (mClientCenter.getMParamAsOne() == null) {
				mClientCenter.setMParamAsOne(new MParam());
			}
			if (mClientCenter.getMParamAsOne().getMDeliveryCourse() == null) {
				mClientCenter.getMParamAsOne().setMDeliveryCourse(new MDeliveryCourse());
			}

			// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
			if (mClientCenter.getMParamAsOne().getMZone() == null) {
				mClientCenter.getMParamAsOne().setMZone(new MZone());
			}
			if (mClientCenter.getMParamAsOne().getMZone().getMWarehouse()==null){
				mClientCenter.getMParamAsOne().getMZone().setMWarehouse(new MWarehouse());
			}
			if (mClientCenter.getMParamAsOne().getMBoxGrp() == null) {
				mClientCenter.getMParamAsOne().setMBoxGrp(new MBoxGrp());
			}
			// [Ver3.0] unit of measure対応 2017.12.27 NING Del

			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
			MParam param = mClientCenter.getMParamAsOne();

			// 引当ソートキーの設定
			String sortkeyStr = param.getAllocSortKey();
			if (!CU.isNullOrEmpty(sortkeyStr)) {
				Map<String, String> allocSortMap = centerClassLogic.getClassMapByCd("ALLOC_SORT_KEY");
				String[] sortkeys = sortkeyStr.split(",");
				for (int i = 0; i < sortkeys.length; i++) {
					String sortkey = sortkeys[i];
					switch (i) {
					case 0:
						param.setAllocSortKey1(sortkey);
						param.setAllocSortKey1Nm(allocSortMap.get(sortkey));
						break;
					case 1:
						param.setAllocSortKey2(sortkey);
						param.setAllocSortKey2Nm(allocSortMap.get(sortkey));
						break;
					case 2:
						param.setAllocSortKey3(sortkey);
						param.setAllocSortKey3Nm(allocSortMap.get(sortkey));
						break;
					case 3:
						param.setAllocSortKey4(sortkey);
						param.setAllocSortKey4Nm(allocSortMap.get(sortkey));
						break;
					case 4:
						param.setAllocSortKey5(sortkey);
						param.setAllocSortKey5Nm(allocSortMap.get(sortkey));
						break;
					case 5:
						param.setAllocSortKey6(sortkey);
						param.setAllocSortKey6Nm(allocSortMap.get(sortkey));
						break;
					case 6:
						param.setAllocSortKey7(sortkey);
						param.setAllocSortKey7Nm(allocSortMap.get(sortkey));
						break;
					case 7:
						param.setAllocSortKey8(sortkey);
						param.setAllocSortKey8Nm(allocSortMap.get(sortkey));
						break;
					}
				}
			}
			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
		}

		// [ON推-品向-1078] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/11 ichikawa Start
		// 区分値マスタより取得

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		BClassDtlCB cb = bClassDtlBhv.newConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		//cb.query().queryBClass().setClassId_Equal(getCenterClassCondition());
		List<String> classCdList = new ArrayList<String>();
		//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
		classCdList.add("PACKING_SLIP_AUTO_OUTPUT_FLG");
		//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
		//  キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
		classCdList.add("CES_INTEGRATION_FLG");
		//  キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
		classCdList.add("STORE_NO_FLG");
		classCdList.add("MERGE_CLS");
		classCdList.add("OVER_STORE_NUM_FLG");
		classCdList.add("PAST_STORE_DT_FLG");
		// [ON推-品向-1167] 出荷時HT使用フラグを追加 2016.07.04 kawana Start
		classCdList.add("USE_HT_SHIP_FLG");
		// [ON推-品向-1167] 出荷時HT使用フラグを追加 2016.07.04 kawana End
		classCdList.add("STORE_DT_FLG");
		classCdList.add("MULTI_PIC_CLS");
		// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
		classCdList.add("CASE_PIC_FLG");
		// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End
		classCdList.add("REPLENISH_UNIT_CLS");
		// [ON推-品向-1167] 緊急補充ロケ割付方法が表示されない問題を修正 2016.07.06 kawana Start
		classCdList.add("REPLENISH_ALLOC_CLS");
		// [ON推-品向-1167] 緊急補充ロケ割付方法が表示されない問題を修正 2016.07.06 kawana End
		classCdList.add("PACKING_CAL_CLS");
		classCdList.add("PACKING_PROCESS_CLS");
		classCdList.add("PRODUCT_PART_PACKING");
		// [Ver3.0] unit of measure対応 2017.11.23 NING Start
		classCdList.add("DECIMAL_PRODUCT_PACKING");
		// [Ver3.0] unit of measure対応 2017.11.23 NING End
		classCdList.add("DEL_FLG");
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
		classCdList.add("PRODUCT_LABEL_OUT_UNIT");
		classCdList.add("RESULT_AFTER_PRODUCT_LABEL");
		// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
		classCdList.add("RESULT_AFTER_PRODUCT_TARGET");
		// [#1755]入庫ラベル最新化 2017.07.24 sampei End
		classCdList.add("PRODUCT_LABEL_JAN_BARCODE");
		classCdList.add("PRODUCT_LABEL_PROD_BARCODE");
		classCdList.add("BOX_SELECT_SKIP");
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
		//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add Start
		classCdList.add("AFTER_TAG_OUT_FLG");
		classCdList.add("TAG_DELIVERY_OUT_FLG");
		classCdList.add("HT_CHAR_READ_FLG");
		//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add End
		// [#2613][Ver2.2.1] センタマスタメンテナンス(編集) - 項目「SD検品ラベル出力フラグ」のCD/名称を追加 2017.09.21 honma Add Start
		classCdList.add("INSPECTION_LABEL_OUT_FLG");
		// [#2613][Ver2.2.1] センタマスタメンテナンス(編集) - 項目「SD検品ラベル出力フラグ」のCD/名称を追加 2017.09.21 honma Add End
		// [Ver3.1][#5137]パラメータマスタに新規追加した項目を追加 2018.09.27 matsumoto Add Start
		classCdList.add("TOTAL_PIC_FLG");
		classCdList.add("SGL_ROW_PIC_FLG");
		classCdList.add("PIC_MTHD_RCMD_FLG");
		classCdList.add("PIC_MTHD_RCMD_BREAK_KEY");
		classCdList.add("PIC_MTHD_RCMD_LIST_OUT");
		classCdList.add("SOUND_PLAY_FLG");
		classCdList.add("AFTER_DELIV_SLIP_OUT_FLG");
		classCdList.add("AFTER_DELIV_SLIP_OUT_TGT");
		classCdList.add("SGL_ROW_INSP_AFTER_OUT_CLS");
		classCdList.add("AUTO_SHIP_INST_FLG");
		classCdList.add("STOCK_OUT_AUTO_INST_FLG");
		classCdList.add("AUTO_EMG_SET_FLG");
		classCdList.add("AUTO_EMG_SET_TGT");
		classCdList.add("STOCK_OUT_ALLOC_CLS");
		classCdList.add("STOCK_OUT_INST_CXL_FLG");
		classCdList.add("STOCK_OUT_INST_SPLIT_FLG");
		// [Ver3.1][#5137]パラメータマスタに新規追加した項目を追加 2018.09.27 matsumoto Add End

		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> classList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, BClassDtl>> centerClassMap = new HashMap<String, Map<String, BClassDtl>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, BClassDtl> dtlMap = null;
		for (BClassDtl bClassDtl : classList) {
			if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl);
			} else {
				if (classCd.length() > 0) {
					centerClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, BClassDtl>();
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl);
				classCd = bClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			centerClassMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		for (MClientCenter MClientCenter : result) {

			//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
			if (centerClassMap.containsKey("PACKING_SLIP_AUTO_OUTPUT_FLG")) {
				// 納品明細書自動発行フラグ
				if (centerClassMap.get("PACKING_SLIP_AUTO_OUTPUT_FLG").containsKey(MClientCenter.getMParamAsOne().getPackingSlipAutoOutputFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPackingSlipAutoOutputFlg(centerClassMap.get("PACKING_SLIP_AUTO_OUTPUT_FLG").get(MClientCenter.getMParamAsOne().getPackingSlipAutoOutputFlg()));
				}
			}
			//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
			//  キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
			if (centerClassMap.containsKey("CES_INTEGRATION_FLG")) {
				// CES連携フラグ
				if (centerClassMap.get("CES_INTEGRATION_FLG").containsKey(MClientCenter.getMParamAsOne().getCesIntegrationFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByCesIntegrationFlg(centerClassMap.get("CES_INTEGRATION_FLG").get(MClientCenter.getMParamAsOne().getCesIntegrationFlg()));
				}
			}
			//  キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
			if (centerClassMap.containsKey("STORE_NO_FLG")) {
				// 入庫No.管理フラグ
				if (centerClassMap.get("STORE_NO_FLG").containsKey(MClientCenter.getMParamAsOne().getStoreNoFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStoreNoFlg(centerClassMap.get("STORE_NO_FLG").get(MClientCenter.getMParamAsOne().getStoreNoFlg()));
				}
			}
			if (centerClassMap.containsKey("MERGE_CLS")) {
				// 入庫No.マージ区分
				if (centerClassMap.get("MERGE_CLS").containsKey(MClientCenter.getMParamAsOne().getMergeCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByMergeCls(centerClassMap.get("MERGE_CLS").get(MClientCenter.getMParamAsOne().getMergeCls()));
				}
			}
			if (centerClassMap.containsKey("OVER_STORE_NUM_FLG")) {
				// 過入荷可フラグ
				if (centerClassMap.get("OVER_STORE_NUM_FLG").containsKey(MClientCenter.getMParamAsOne().getOverStoreNumFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByOverStoreNumFlg(centerClassMap.get("OVER_STORE_NUM_FLG").get(MClientCenter.getMParamAsOne().getOverStoreNumFlg()));
				}
			}
			if (centerClassMap.containsKey("PAST_STORE_DT_FLG")) {
				// 過去日入力可フラグ
				if (centerClassMap.get("PAST_STORE_DT_FLG").containsKey(MClientCenter.getMParamAsOne().getPastStoreDtFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPastStoreDtFlg(centerClassMap.get("PAST_STORE_DT_FLG").get(MClientCenter.getMParamAsOne().getPastStoreDtFlg()));
				}
			}
			// [ON推-品向-1167] 出荷時HT使用フラグを追加 2016.07.04 kawana Start
			if (centerClassMap.containsKey("USE_HT_SHIP_FLG")) {
				// 出荷時HT使用フラグ
				if (centerClassMap.get("USE_HT_SHIP_FLG").containsKey(MClientCenter.getMParamAsOne().getUseHtShipFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByUseHtShipFlg(centerClassMap.get("USE_HT_SHIP_FLG").get(MClientCenter.getMParamAsOne().getUseHtShipFlg()));
				}
			}
			// [ON推-品向-1167] 出荷時HT使用フラグを追加 2016.07.04 kawana End
			if (centerClassMap.containsKey("STORE_DT_FLG")) {
				// 入庫日管理フラグ
				if (centerClassMap.get("STORE_DT_FLG").containsKey(MClientCenter.getMParamAsOne().getStoreDtFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStoreDtFlg(centerClassMap.get("STORE_DT_FLG").get(MClientCenter.getMParamAsOne().getStoreDtFlg()));
				}
			}
			if (centerClassMap.containsKey("MULTI_PIC_CLS")) {
				// マルチピック計算区分
				if (centerClassMap.get("MULTI_PIC_CLS").containsKey(MClientCenter.getMParamAsOne().getMultiPicCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByMultiPicCls(centerClassMap.get("MULTI_PIC_CLS").get(MClientCenter.getMParamAsOne().getMultiPicCls()));
				}
			}
			// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
			if (centerClassMap.containsKey("CASE_PIC_FLG")) {
				// ケースピックフラグ
				if (centerClassMap.get("CASE_PIC_FLG").containsKey(MClientCenter.getMParamAsOne().getCasePicFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByCasePicFlg(centerClassMap.get("CASE_PIC_FLG").get(MClientCenter.getMParamAsOne().getCasePicFlg()));
				}
			}
			// [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End
			//[ON推-品質問題点指摘票(新ｿﾘV2-056)] 修正対応 2016.08.15 chou Mod Start
			if (centerClassMap.containsKey("REPLENISH_UNIT_CLS")) {
				// 定期補充単位
				if (centerClassMap.get("REPLENISH_UNIT_CLS").containsKey(MClientCenter.getMParamAsOne().getRgReplenishUnitCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByRgReplenishUnitCls(centerClassMap.get("REPLENISH_UNIT_CLS").get(MClientCenter.getMParamAsOne().getRgReplenishUnitCls()));
				}
				// 緊急補充単位
				if (centerClassMap.get("REPLENISH_UNIT_CLS").containsKey(MClientCenter.getMParamAsOne().getEmReplenishUnitCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByEmReplenishUnitCls(centerClassMap.get("REPLENISH_UNIT_CLS").get(MClientCenter.getMParamAsOne().getEmReplenishUnitCls()));
				}
			}
			//[ON推-品質問題点指摘票(新ｿﾘV2-056)] 修正対応 2016.08.15 chou Mod End
			// [ON推-品向-1167] 緊急補充ロケ割付方法が表示されない問題を修正 2016.07.06 kawana Start
			if (centerClassMap.containsKey("REPLENISH_ALLOC_CLS")) {
				// 緊急補充ロケ割付方法
				if (centerClassMap.get("REPLENISH_ALLOC_CLS").containsKey(MClientCenter.getMParamAsOne().getEmReplenishAllocCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByEmReplenishAllocCls(centerClassMap.get("REPLENISH_ALLOC_CLS").get(MClientCenter.getMParamAsOne().getEmReplenishAllocCls()));
				}
			}
			// [ON推-品向-1167] 緊急補充ロケ割付方法が表示されない問題を修正 2016.07.06 kawana End
			if (centerClassMap.containsKey("PACKING_CAL_CLS")) {
				// 梱包計算処理区分
				if (centerClassMap.get("PACKING_CAL_CLS").containsKey(MClientCenter.getMParamAsOne().getPackingCalCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPackingCalCls(centerClassMap.get("PACKING_CAL_CLS").get(MClientCenter.getMParamAsOne().getPackingCalCls()));
				}
			}
			if (centerClassMap.containsKey("PACKING_PROCESS_CLS")) {
				// 詰込区分
				if (centerClassMap.get("PACKING_PROCESS_CLS").containsKey(MClientCenter.getMParamAsOne().getPackingProcessCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPackingProcessCls(centerClassMap.get("PACKING_PROCESS_CLS").get(MClientCenter.getMParamAsOne().getPackingProcessCls()));
				}
			}
			if (centerClassMap.containsKey("PRODUCT_PART_PACKING")) {
				// 商品毎別梱包
				if (centerClassMap.get("PRODUCT_PART_PACKING").containsKey(MClientCenter.getMParamAsOne().getProductPartPacking())) {
					MClientCenter.getMParamAsOne().setBClassDtlByProductPartPacking(centerClassMap.get("PRODUCT_PART_PACKING").get(MClientCenter.getMParamAsOne().getProductPartPacking()));
				}
			}
			// [Ver3.0] unit of measure対応 2017.11.23 NING Start
			if (centerClassMap.containsKey("DECIMAL_PRODUCT_PACKING")) {
				// 小数管理商品梱包単位
				if (centerClassMap.get("DECIMAL_PRODUCT_PACKING").containsKey(MClientCenter.getMParamAsOne().getDecimalProductPacking())) {
					MClientCenter.getMParamAsOne().setBClassDtlByDecimalProductPacking(centerClassMap.get("DECIMAL_PRODUCT_PACKING").get(MClientCenter.getMParamAsOne().getDecimalProductPacking()));
				}
			}
			// [Ver3.0] unit of measure対応 2017.11.23 NING End
			if (centerClassMap.containsKey("DEL_FLG")) {
				// 削除
				if (centerClassMap.get("DEL_FLG").containsKey(MClientCenter.getMParamAsOne().getDelFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByDelFlg(centerClassMap.get("DEL_FLG").get(MClientCenter.getMParamAsOne().getDelFlg()));
				}
			}

			//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
			if (centerClassMap.containsKey("PRODUCT_LABEL_OUT_UNIT")) {
				// 商品ラベル出力単位CD
				if (centerClassMap.get("PRODUCT_LABEL_OUT_UNIT").containsKey(MClientCenter.getMParamAsOne().getProductLabelOutUnit())) {
					MClientCenter.getMParamAsOne().setBClassDtlByProductLabelOutUnit(centerClassMap.get("PRODUCT_LABEL_OUT_UNIT").get(MClientCenter.getMParamAsOne().getProductLabelOutUnit()));
				}
			}
			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			if (centerClassMap.containsKey("RESULT_AFTER_PRODUCT_LABEL")) {
				// 実績入力後入庫/商品ラベル出力フラグCD
				if (centerClassMap.get("RESULT_AFTER_PRODUCT_LABEL").containsKey(MClientCenter.getMParamAsOne().getResultAfterProductLabel())) {
					MClientCenter.getMParamAsOne().setBClassDtlByResultAfterProductLabel(centerClassMap.get("RESULT_AFTER_PRODUCT_LABEL").get(MClientCenter.getMParamAsOne().getResultAfterProductLabel()));
				}
			}
			if (centerClassMap.containsKey("RESULT_AFTER_PRODUCT_TARGET")) {
				// 実績入力後入庫/商品ラベル出力対象CD
				if (centerClassMap.get("RESULT_AFTER_PRODUCT_TARGET").containsKey(MClientCenter.getMParamAsOne().getResultAfterProductTarget())) {
					MClientCenter.getMParamAsOne().setBClassDtlByResultAfterProductTarget(centerClassMap.get("RESULT_AFTER_PRODUCT_TARGET").get(MClientCenter.getMParamAsOne().getResultAfterProductTarget()));
				}
			}
			// [#1755]入庫ラベル最新化 2017.07.24 sampei End
			if (centerClassMap.containsKey("PRODUCT_LABEL_JAN_BARCODE")) {
				// 商品ラベルJANCDバーコード種別CD
				if (centerClassMap.get("PRODUCT_LABEL_JAN_BARCODE").containsKey(MClientCenter.getMParamAsOne().getProductLabelJanBarcode())) {
					MClientCenter.getMParamAsOne().setBClassDtlByProductLabelJanBarcode(centerClassMap.get("PRODUCT_LABEL_JAN_BARCODE").get(MClientCenter.getMParamAsOne().getProductLabelJanBarcode()));
				}
			}
			if (centerClassMap.containsKey("PRODUCT_LABEL_PROD_BARCODE")) {
				// 商品ラベル商品CDバーコード種別CD
				if (centerClassMap.get("PRODUCT_LABEL_PROD_BARCODE").containsKey(MClientCenter.getMParamAsOne().getProductLabelProdBarcode())) {
					MClientCenter.getMParamAsOne().setBClassDtlByProductLabelProdBarcode(centerClassMap.get("PRODUCT_LABEL_PROD_BARCODE").get(MClientCenter.getMParamAsOne().getProductLabelProdBarcode()));
				}
			}
			if (centerClassMap.containsKey("BOX_SELECT_SKIP")) {
				// 荷材選択スキップCD
				if (centerClassMap.get("BOX_SELECT_SKIP").containsKey(MClientCenter.getMParamAsOne().getBoxSelectSkip())) {
					MClientCenter.getMParamAsOne().setBClassDtlByBoxSelectSkip(centerClassMap.get("BOX_SELECT_SKIP").get(MClientCenter.getMParamAsOne().getBoxSelectSkip()));
				}
			}
			//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
			//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add Start
			if (centerClassMap.containsKey("AFTER_TAG_OUT_FLG")) {
				// 検品後荷札出力フラグ
				if (centerClassMap.get("AFTER_TAG_OUT_FLG").containsKey(MClientCenter.getMParamAsOne().getAfterTagOutFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAfterTagOutFlg(centerClassMap.get("AFTER_TAG_OUT_FLG").get(MClientCenter.getMParamAsOne().getAfterTagOutFlg()));
				}
			}
			if (centerClassMap.containsKey("TAG_DELIVERY_OUT_FLG")) {
				// 荷札納品書在中出力フラグ
				if (centerClassMap.get("TAG_DELIVERY_OUT_FLG").containsKey(MClientCenter.getMParamAsOne().getTagDeliveryOutFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByTagDeliveryOutFlg(centerClassMap.get("TAG_DELIVERY_OUT_FLG").get(MClientCenter.getMParamAsOne().getTagDeliveryOutFlg()));
				}
			}
			if (centerClassMap.containsKey("HT_CHAR_READ_FLG")) {
				// HT文字認識使用フラグ
				if (centerClassMap.get("HT_CHAR_READ_FLG").containsKey(MClientCenter.getMParamAsOne().getHtCharReadFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByHtCharReadFlg(centerClassMap.get("HT_CHAR_READ_FLG").get(MClientCenter.getMParamAsOne().getHtCharReadFlg()));
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End
				}
			}
			//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add End
			// [#2613][Ver2.2.1] センタマスタメンテナンス(編集) - 項目「SD検品ラベル出力フラグ」のCD/名称を追加 2017.09.21 honma Add Start
			if (centerClassMap.containsKey("INSPECTION_LABEL_OUT_FLG")) {
				// SD検品ラベル出力フラグ
				if (centerClassMap.get("INSPECTION_LABEL_OUT_FLG").containsKey(MClientCenter.getMParamAsOne().getInspectionLabelOutFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByInspectionLabelOutFlg(centerClassMap.get("INSPECTION_LABEL_OUT_FLG").get(MClientCenter.getMParamAsOne().getInspectionLabelOutFlg()));
				}
			}
			// [#2613][Ver2.2.1] センタマスタメンテナンス(編集) - 項目「SD検品ラベル出力フラグ」のCD/名称を追加 2017.09.21 honma Add End
			// [Ver3.1][#5137]パラメータマスタに新規追加した項目を追加 2018.09.27 matsumoto Add Start
			if (centerClassMap.containsKey("TOTAL_PIC_FLG")) {
				// トータルピックフラグ
				if (centerClassMap.get("TOTAL_PIC_FLG").containsKey(MClientCenter.getMParamAsOne().getTotalPicFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByTotalPicFlg(centerClassMap.get("TOTAL_PIC_FLG").get(MClientCenter.getMParamAsOne().getTotalPicFlg()));
				}
			}
			if (centerClassMap.containsKey("SGL_ROW_PIC_FLG")) {
				// 単行ピックフラグ
				if (centerClassMap.get("SGL_ROW_PIC_FLG").containsKey(MClientCenter.getMParamAsOne().getSglRowPicFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlBySglRowPicFlg(centerClassMap.get("SGL_ROW_PIC_FLG").get(MClientCenter.getMParamAsOne().getSglRowPicFlg()));
				}
			}
			if (centerClassMap.containsKey("PIC_MTHD_RCMD_FLG")) {
				// 最適ピック提案フラグ
				if (centerClassMap.get("PIC_MTHD_RCMD_FLG").containsKey(MClientCenter.getMParamAsOne().getPicMthdRcmdFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPicMthdRcmdFlg(centerClassMap.get("PIC_MTHD_RCMD_FLG").get(MClientCenter.getMParamAsOne().getPicMthdRcmdFlg()));
				}
			}
			if (centerClassMap.containsKey("PIC_MTHD_RCMD_BREAK_KEY")) {
				// 最適ピック提案ブレイクキー
				if (centerClassMap.get("PIC_MTHD_RCMD_BREAK_KEY").containsKey(MClientCenter.getMParamAsOne().getPicMthdRcmdBreakKey())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPicMthdRcmdBreakKey(centerClassMap.get("PIC_MTHD_RCMD_BREAK_KEY").get(MClientCenter.getMParamAsOne().getPicMthdRcmdBreakKey()));
				}
			}
			if (centerClassMap.containsKey("PIC_MTHD_RCMD_LIST_OUT")) {
				// マルチピック摘み取りリスト出力フラグ
				if (centerClassMap.get("PIC_MTHD_RCMD_LIST_OUT").containsKey(MClientCenter.getMParamAsOne().getPicMthdRcmdMltPlOut())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPicMthdRcmdMltPlOut(centerClassMap.get("PIC_MTHD_RCMD_LIST_OUT").get(MClientCenter.getMParamAsOne().getPicMthdRcmdMltPlOut()));
				}
			}
			if (centerClassMap.containsKey("PIC_MTHD_RCMD_LIST_OUT")) {
				// 単行ピック種蒔きリスト出力フラグ
				if (centerClassMap.get("PIC_MTHD_RCMD_LIST_OUT").containsKey(MClientCenter.getMParamAsOne().getPicMthdRcmdSplSlOut())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPicMthdRcmdSplSlOut(centerClassMap.get("PIC_MTHD_RCMD_LIST_OUT").get(MClientCenter.getMParamAsOne().getPicMthdRcmdSplSlOut()));
				}
			}
			if (centerClassMap.containsKey("SOUND_PLAY_FLG")) {
				// エラー音再生フラグ
				if (centerClassMap.get("SOUND_PLAY_FLG").containsKey(MClientCenter.getMParamAsOne().getErrorSoundPlayFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByErrorSoundPlayFlg(centerClassMap.get("SOUND_PLAY_FLG").get(MClientCenter.getMParamAsOne().getErrorSoundPlayFlg()));
				}
			}
			if (centerClassMap.containsKey("SOUND_PLAY_FLG")) {
				// 警告音再生フラグ
				if (centerClassMap.get("SOUND_PLAY_FLG").containsKey(MClientCenter.getMParamAsOne().getWarnSoundPlayFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByWarnSoundPlayFlg(centerClassMap.get("SOUND_PLAY_FLG").get(MClientCenter.getMParamAsOne().getWarnSoundPlayFlg()));
				}
			}
			if (centerClassMap.containsKey("SOUND_PLAY_FLG")) {
				// 検品音再生フラグ
				if (centerClassMap.get("SOUND_PLAY_FLG").containsKey(MClientCenter.getMParamAsOne().getInspSoundPlayFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByInspSoundPlayFlg(centerClassMap.get("SOUND_PLAY_FLG").get(MClientCenter.getMParamAsOne().getInspSoundPlayFlg()));
				}
			}
			if (centerClassMap.containsKey("SOUND_PLAY_FLG")) {
				// 検品完了音再生フラグ
				if (centerClassMap.get("SOUND_PLAY_FLG").containsKey(MClientCenter.getMParamAsOne().getInspCompSoundPlayFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByInspCompSoundPlayFlg(centerClassMap.get("SOUND_PLAY_FLG").get(MClientCenter.getMParamAsOne().getInspCompSoundPlayFlg()));
				}
			}
			if (centerClassMap.containsKey("AFTER_TAG_OUT_FLG")) {
				// 検品後納品明細出力フラグ
				if (centerClassMap.get("AFTER_TAG_OUT_FLG").containsKey(MClientCenter.getMParamAsOne().getAfterDelivSlipOutFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAfterDelivSlipOutFlg(centerClassMap.get("AFTER_TAG_OUT_FLG").get(MClientCenter.getMParamAsOne().getAfterDelivSlipOutFlg()));
				}
			}
			if (centerClassMap.containsKey("AFTER_DELIV_SLIP_OUT_TGT")) {
				// 検品後納品明細出力対象
				if (centerClassMap.get("AFTER_DELIV_SLIP_OUT_TGT").containsKey(MClientCenter.getMParamAsOne().getAfterDelivSlipOutTgt())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAfterDelivSlipOutTgt(centerClassMap.get("AFTER_DELIV_SLIP_OUT_TGT").get(MClientCenter.getMParamAsOne().getAfterDelivSlipOutTgt()));
				}
			}
			if (centerClassMap.containsKey("SGL_ROW_INSP_AFTER_OUT_CLS")) {
				// 単行出荷検品荷札/納品明細出力区分
				if (centerClassMap.get("SGL_ROW_INSP_AFTER_OUT_CLS").containsKey(MClientCenter.getMParamAsOne().getSglRowInspAfterOutCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlBySglRowInspAfterOutCls(centerClassMap.get("SGL_ROW_INSP_AFTER_OUT_CLS").get(MClientCenter.getMParamAsOne().getSglRowInspAfterOutCls()));
				}
			}
			if (centerClassMap.containsKey("AUTO_SHIP_INST_FLG")) {
				// 自動出庫指示フラグ
				if (centerClassMap.get("AUTO_SHIP_INST_FLG").containsKey(MClientCenter.getMParamAsOne().getAutoShipInstFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAutoShipInstFlg(centerClassMap.get("AUTO_SHIP_INST_FLG").get(MClientCenter.getMParamAsOne().getAutoShipInstFlg()));
				}
			}
			if (centerClassMap.containsKey("STOCK_OUT_AUTO_INST_FLG")) {
				// 欠品時自動出庫指示フラグ
				if (centerClassMap.get("STOCK_OUT_AUTO_INST_FLG").containsKey(MClientCenter.getMParamAsOne().getStockOutAutoInstFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStockOutAutoInstFlg(centerClassMap.get("STOCK_OUT_AUTO_INST_FLG").get(MClientCenter.getMParamAsOne().getStockOutAutoInstFlg()));
				}
			}
			if (centerClassMap.containsKey("AUTO_EMG_SET_FLG")) {
				// 自動緊急フラグ設定フラグ
				if (centerClassMap.get("AUTO_EMG_SET_FLG").containsKey(MClientCenter.getMParamAsOne().getAutoEmgSetFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAutoEmgSetFlg(centerClassMap.get("AUTO_EMG_SET_FLG").get(MClientCenter.getMParamAsOne().getAutoEmgSetFlg()));
				}
			}
			if (centerClassMap.containsKey("AUTO_EMG_SET_TGT")) {
				// 自動緊急フラグ判断対象
				if (centerClassMap.get("AUTO_EMG_SET_TGT").containsKey(MClientCenter.getMParamAsOne().getAutoEmgSetTgt())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAutoEmgSetTgt(centerClassMap.get("AUTO_EMG_SET_TGT").get(MClientCenter.getMParamAsOne().getAutoEmgSetTgt()));
				}
			}
			if (centerClassMap.containsKey("STOCK_OUT_ALLOC_CLS")) {
				// 欠品時引当区分
				if (centerClassMap.get("STOCK_OUT_ALLOC_CLS").containsKey(MClientCenter.getMParamAsOne().getStockOutAllocCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStockOutAllocCls(centerClassMap.get("STOCK_OUT_ALLOC_CLS").get(MClientCenter.getMParamAsOne().getStockOutAllocCls()));
				}
			}
			if (centerClassMap.containsKey("STOCK_OUT_INST_CXL_FLG")) {
				// 欠品時出庫指示取消フラグ
				if (centerClassMap.get("STOCK_OUT_INST_CXL_FLG").containsKey(MClientCenter.getMParamAsOne().getStockOutInstCxlFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStockOutInstCxlFlg(centerClassMap.get("STOCK_OUT_INST_CXL_FLG").get(MClientCenter.getMParamAsOne().getStockOutInstCxlFlg()));
				}
			}
			if (centerClassMap.containsKey("STOCK_OUT_INST_SPLIT_FLG")) {
				// 欠品時出荷指示分離フラグ
				if (centerClassMap.get("STOCK_OUT_INST_SPLIT_FLG").containsKey(MClientCenter.getMParamAsOne().getStockOutInstSplitFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStockOutInstSplitFlg(centerClassMap.get("STOCK_OUT_INST_SPLIT_FLG").get(MClientCenter.getMParamAsOne().getStockOutInstSplitFlg()));
				}
			}
		}
		// [Ver3.1][#5137]パラメータマスタに新規追加した項目を追加 2018.09.27 matsumoto Add End
		// [ON推-品向-1078] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/11 ichikawa End

		// Dto変換処理
		centerMasterEditDto.data.head = centerMapper.mappingToDto(result.get(0).getMCenter());
		centerMasterEditDto.data.body = clientCentermapper.mappingToDtoList(result);
//		centerMasterEditDto.data.head = mapper.mappingToDto(result.get(0));
//		centerMasterEditDto.data.body = mapper.mappingToDtoList(result);
		return centerMasterEditDto;

	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param centerMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterMasterEditDto centerMasterEditDto) {

		// Entity変換
		MCenterDtoMapper mapper = new MCenterDtoMapper();
		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.head);
		MClientCenterDtoMapper bodyMapper = new MClientCenterDtoMapper();
//		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body.get(0).getMClientCenterList());
		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body);

		// 入力チェック処理
		ResultSetupData resultStatus = check(mCenter, mClientCenterList, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		switch (resultStatus) {
		case ERROR:
			break;
		case CENTER_NOT_FOUND:
			// センタCD重複場合の確認メッセージを設定
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA Start
			//getInfoManager().add(infoRetSts(StatusCode.CENTER_CODE_DUPLICATE_ERROR), WmsMessageConst.CENTER_CODE_DUPLICATE_ERROR);
			getInfoManager().add(infoRetSts(StatusCode.CENTER_CODE_DUPLICATE_ERROR), WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
			// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.19 SJA End
			break;
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		}

		return null;
	}

	/**
	 * <h2>センタマスタ登録。</h2>
	 * <pre>
	 * 登録データのチェックを行う
	 * エラーがない場合は、データベースにセンタマスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 * @return CenterMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 */
	@POST
	@Path("/register")
//	public StatusDto register(CenterMasterEditDto centerMasterEditDto) {
	public CenterMasterEditDto register(CenterMasterEditDto centerMasterEditDto) {

		// Entity変換
		MCenterDtoMapper mapper = new MCenterDtoMapper();
		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.head);

		if(centerMasterEditDto.data.head.getCultureCd() != null) {
			BCultureCB bCultureCB = bCultureBhv.newMyConditionBean();
			bCultureCB.query().setCultureCd_Equal(centerMasterEditDto.data.head.getCultureCd());
			BCulture bCulture = bCultureBhv.selectEntity(bCultureCB);
			mCenter.setCultureId(bCulture.getCultureId());
		} else {
			mCenter.setCultureId(null);
		}

		if(centerMasterEditDto.data.head.getTimeZoneCd() != null) {
			BTimeZoneCB bTimeZoneCB = bTimeZoneBhv.newMyConditionBean();
			bTimeZoneCB.query().setTimeZoneCd_Equal(centerMasterEditDto.data.head.getTimeZoneCd());
			BTimeZone bTimeZone = bTimeZoneBhv.selectEntity(bTimeZoneCB);
			mCenter.setTimeZoneId(bTimeZone.getTimeZoneId());
		} else {
			mCenter.setTimeZoneId(null);
		}

		MClientCenterDtoMapper bodyMapper = new MClientCenterDtoMapper();
//		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body.get(0).getMClientCenterList());
		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body);
		ResultSetupData resultStatus = check(mCenter, mClientCenterList, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		// センタマスタ登録
		centerMasterInsertLogic.insert(mCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		// パラメータマスタリスト
		List<MParam> mParamList = new ArrayList<MParam>();
		for (MClientCenter mClientCenter : mClientCenterList) {
			MParam mParam = mClientCenter.getMParamAsOne();
			mParamList.add(mParam);
		}
		//センタマスタ明細データ登録
		centerMasterInsertLogic.insertDtl(mCenter, mClientCenterList, mParamList, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);

		centerMasterEditDto.data.head = mapper.mappingToDto(mCenter);

		return centerMasterEditDto;
	}

	/**
	 * <h2>センタマスタ更新。</h2>
	 * <pre>
	 * 更新データのチェックを行う。
	 * エラーがない場合は、データベースにセンタマスタを更新し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 * @return CenterMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 */
	@POST
	@Path("/update")
//	public StatusDto update(CenterMasterEditDto centerMasterEditDto) {
	public CenterMasterEditDto update(CenterMasterEditDto centerMasterEditDto) {

		// Entity変換
		MCenterDtoMapper mapper = new MCenterDtoMapper();
		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.head);

		// [Ver3.0][#3267] カルチャ、タイムゾーンのID取得・設定 2018.01.04 shimizu Start
		if(centerMasterEditDto.data.head.getCultureCd() != null) {
			BCultureCB bCultureCB = bCultureBhv.newMyConditionBean();
			bCultureCB.query().setCultureCd_Equal(centerMasterEditDto.data.head.getCultureCd());
			BCulture bCulture = bCultureBhv.selectEntity(bCultureCB);
			mCenter.setCultureId(bCulture.getCultureId());
		} else {
			mCenter.setCultureId(null);
		}

		if(centerMasterEditDto.data.head.getTimeZoneCd() != null) {
			BTimeZoneCB bTimeZoneCB = bTimeZoneBhv.newMyConditionBean();
			bTimeZoneCB.query().setTimeZoneCd_Equal(centerMasterEditDto.data.head.getTimeZoneCd());
			BTimeZone bTimeZone = bTimeZoneBhv.selectEntity(bTimeZoneCB);
			mCenter.setTimeZoneId(bTimeZone.getTimeZoneId());
		} else {
			mCenter.setTimeZoneId(null);
		}
		// [Ver3.0][#3267] カルチャ、タイムゾーンのID取得・設定 2018.01.04 shimizu End

		MClientCenterDtoMapper bodyMapper = new MClientCenterDtoMapper();
//		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body.get(0).getMClientCenterList());
		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body);

		ResultSetupData resultStatus = check(mCenter, mClientCenterList, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		// センタマスタ更新
		centerMasterUpdateLogic.update(mCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_UPDATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// パラメータマスタリスト
		List<MParam> mParamList = new ArrayList<MParam>();
		for (MClientCenter mClientCenter : mClientCenterList) {
			MParam mParam = mClientCenter.getMParamAsOne();
			mParamList.add(mParam);
		}

		//センタマスタ明細データ登録
		centerMasterInsertLogic.insertDtl(mCenter, mClientCenterList, mParamList, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

	    // [横並-048] チェック順変更 2014.11.20 taoys Start
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
	    // [横並-048] チェック順変更 2014.11.20 taoys End
//		return null;
		centerMasterEditDto.data.head = mapper.mappingToDto(mCenter);
		return centerMasterEditDto;
	}

	/**
	 * <h2>チェック処理。</h2>
	 *  新規登録データのチェックを行う。
	 *・センタコードで重複エラー用メッセージ
	 *・荷主マスタ存在チェックエラー用メッセージ
	 * @param mCenter センタマスタ
	 * @param mClientCenterList 荷主マスタリスト
	 * @param errSts ErrorStatus
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupData check(MCenter mCenter, List<MClientCenter> mClientCenterList, ErrorStatus errSts) {

		boolean isNullCenter = false;

		// センタCD重複チェック
		if (mCenter.getCenterId() == null) {

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);
			mCenter = centerLogic.getUkEntity(mCenter);
			if (mCenter != null) {
				isNullCenter = true;
			}

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		int row = -1;

		// 荷主マスタ存在チェック
		for (MClientCenter mClientCenter : mClientCenterList) {

			row++;

			MClient mClient = new MClient();
			mClient.setClientCd(mClientCenter.getMClient().getClientCd());
			mClient = clientLogic.getUkEntity(mClient, errRetSts(errSts, StatusCode.CLIENT_NOT_FOUND_ERROR, row));
			if (mClient != null) {
				mClientCenter.setClientId(mClient.getClientId());
			}
			MParam mParam = mClientCenter.getMParamAsOne();
			if (mParam != null) {
				if ((mParam.getTKeepingDays() != null) && (mParam.getHKeepingDays() != null)) {
					if (mParam.getTKeepingDays() >= mParam.getHKeepingDays()) {
						getErrorManager().add(new ErrorStatus(errSts, StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED, row), WmsMessageConst.T_KEEPING_DAYS_CANNOT_CHANGE_H_KEEPING_DAYS_ERROR);
						break;
					}
				}

				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
				// 引当ソートキーの設定
				String sortkey1 = mParam.getAllocSortKey1();
				String sortkey2 = mParam.getAllocSortKey2();
				String sortkey3 = mParam.getAllocSortKey3();
				String sortkey4 = mParam.getAllocSortKey4();
				String sortkey5 = mParam.getAllocSortKey5();
				String sortkey6 = mParam.getAllocSortKey6();
				String sortkey7 = mParam.getAllocSortKey7();
				String sortkey8 = mParam.getAllocSortKey8();
				String allocSortKey = CU.join(",", sortkey1, sortkey2, sortkey3, sortkey4, sortkey5, sortkey6, sortkey7, sortkey8);

				if (!CU.isNullOrEmpty(allocSortKey)) {
					mParam.setAllocSortKey(allocSortKey);
				} else {
					mParam.setAllocSortKey(null);
				}
				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End

				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
				// [Ver3.0] unit of measure対応 2017.12.27 NING Del
				// 緊急補充倉庫
				// 緊急補充ゾーン
				if (mCenter != null){
						if(mParam.getMZone() != null){
						if (mParam.getMZone().getZoneCd() != null ){
							if (mParam.getMZone().getMWarehouse() != null){
								if (mParam.getMZone().getMWarehouse().getWarehouseCd() != null){
									MWarehouse mWarehouse = new MWarehouse();
									mWarehouse.setCenterId(mCenter.getCenterId());
									mWarehouse.setWarehouseCd(mParam.getMZone().getMWarehouse().getWarehouseCd());
									mWarehouse = warehouseLogic.getUkEntity(mWarehouse, errRetSts(errSts, StatusCode.WAREHOUSE_NOT_FOUND_ERROR, row));
									if (mWarehouse != null){
										MZone mZone = new MZone();
										mZone.setWarehouseId(mWarehouse.getWarehouseId());
										mZone.setZoneCd(mParam.getMZone().getZoneCd());
										mZone = zoneLogic.getUkEntity(mZone, errRetSts(errSts, StatusCode.ZONE_NOT_FOUND_ERROR, row));
										if (mZone != null){
											mParam.setEmReplenishZoneId(mZone.getZoneId());
										}else{
											mParam.setEmReplenishZoneId(null);
										}
									}else{
										mParam.setEmReplenishZoneId(null);
									}
								}else{
									mParam.setEmReplenishZoneId(null);
								}
							}else{
								mParam.setEmReplenishZoneId(null);
							}
						}else{
							mParam.setEmReplenishZoneId(null);
						}
					}else{
						mParam.setEmReplenishZoneId(null);
					}
				}else{
					mParam.setEmReplenishZoneId(null);
				}
				// 梱包荷材グループID
				if (mCenter != null){
					if(mParam.getMBoxGrp() != null){
						if (mParam.getMBoxGrp().getBoxGrpCd()!=null){
							MBoxGrp mBoxGrp = new MBoxGrp();
							mBoxGrp.setBoxGrpCd(mParam.getMBoxGrp().getBoxGrpCd());
							mBoxGrp.setCenterId(mCenter.getCenterId());
							mBoxGrp = boxGrpLogic.getUkEntity(mBoxGrp, errRetSts(errSts, StatusCode.BOX_GRP_NOT_FOUND_ERROR, row));
							if (mBoxGrp != null) {
								mParam.setPackingBoxGroupId(mBoxGrp.getBoxGrpId());
							}else{
								mParam.setPackingBoxGroupId(null);
							}
						}else{
							mParam.setPackingBoxGroupId(null);
						}
					}else{
						mParam.setPackingBoxGroupId(null);
					}
				}else{
					mParam.setPackingBoxGroupId(null);
				}

				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
			}

			// 配送コースマスタ存在チェック(更新時)
			if (mCenter != null) {
				if (mCenter.getCenterId() != null) {

					if (mParam != null && mParam.getMDeliveryCourse() != null) {
						String deliveryCourseCd = mParam.getMDeliveryCourse().getDeliveryCourseCd();
						if (!CU.isNullOrEmpty(deliveryCourseCd)) {
							MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
							mDeliveryCourse.setDeliveryCourseCd(mParam.getMDeliveryCourse().getDeliveryCourseCd());
							mDeliveryCourse.setCenterId(mCenter.getCenterId());
							mDeliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourse, errRetSts(errSts, StatusCode.DELIVERYCOURSE_NOT_FOUND_ERROR, row));
							if (mDeliveryCourse != null) {
								mParam.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
							}
						} else {
							mParam.setDeliveryCourseId(null);
						}
					}

				}
			}
		}

		// 結果の設定
		ResultSetupData resultStatus;
		if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else if (isNullCenter) {
			resultStatus = ResultSetupData.CENTER_NOT_FOUND;
		}
		else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		return resultStatus;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタマスタIDをキーにセンデータ取り出し
	 * ・センタマスタのデータを画面用DTOに設定
	 * </pre>
	 * @param  centerMasterEditDto センタマスタメンテナンス(編集)画面DTO
	 * @return CenterMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/searchPagging")
	public CenterMasterEditDto searchPagging(CenterMasterEditDto centerMasterEditDto) {

		// エンティティ編集
//		CenterMasterEditDto centerMasterEditDto = new CenterMasterEditDto();
		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MClientCenterDtoMapper clientCentermapper = new MClientCenterDtoMapper();
		MCenter mCenter = new MCenter();
		mCenter.setCenterId(centerMasterEditDto.data.head.getCenterId());

		// センタマスタメンテナンス(編集)検索データ取得
//		List<MCenter> result = centerMasterMaintenanceSelectLogic.selectById(mCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_SELECT_FAILED));
		List<MClientCenter> result = clientMasterSelectLogic.selectByCenterId(mCenter, centerMasterEditDto.paging, errRetSts(StatusCode.CENTER_MASTER_EDIT_SELECT_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//for (MClientCenter mClientCenter : result.get(0).getMClientCenterList()) {
		for (MClientCenter mClientCenter : result) {
			if (mClientCenter.getMParamAsOne() == null) {
				mClientCenter.setMParamAsOne(new MParam());
			}
			if (mClientCenter.getMParamAsOne().getMDeliveryCourse() == null) {
				mClientCenter.getMParamAsOne().setMDeliveryCourse(new MDeliveryCourse());
			}

			// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
			if (mClientCenter.getMParamAsOne().getMZone() == null) {
				mClientCenter.getMParamAsOne().setMZone(new MZone());
			}
			if (mClientCenter.getMParamAsOne().getMZone().getMWarehouse()==null){
				mClientCenter.getMParamAsOne().getMZone().setMWarehouse(new MWarehouse());
			}
			if (mClientCenter.getMParamAsOne().getMBoxGrp() == null) {
				mClientCenter.getMParamAsOne().setMBoxGrp(new MBoxGrp());
			}
			// [Ver3.0] unit of measure対応 2017.12.27 NING Del
			// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
			MParam param = mClientCenter.getMParamAsOne();

			// 引当ソートキーの設定
			String sortkeyStr = param.getAllocSortKey();
			if (!CU.isNullOrEmpty(sortkeyStr)) {
				Map<String, String> allocSortMap = centerClassLogic.getClassMapByCd("ALLOC_SORT_KEY");
				String[] sortkeys = sortkeyStr.split(",");
				for (int i = 0; i < sortkeys.length; i++) {
					String sortkey = sortkeys[i];
					switch (i) {
					case 0:
						param.setAllocSortKey1(sortkey);
						param.setAllocSortKey1Nm(allocSortMap.get(sortkey));
						break;
					case 1:
						param.setAllocSortKey2(sortkey);
						param.setAllocSortKey2Nm(allocSortMap.get(sortkey));
						break;
					case 2:
						param.setAllocSortKey3(sortkey);
						param.setAllocSortKey3Nm(allocSortMap.get(sortkey));
						break;
					case 3:
						param.setAllocSortKey4(sortkey);
						param.setAllocSortKey4Nm(allocSortMap.get(sortkey));
						break;
					case 4:
						param.setAllocSortKey5(sortkey);
						param.setAllocSortKey5Nm(allocSortMap.get(sortkey));
						break;
					case 5:
						param.setAllocSortKey6(sortkey);
						param.setAllocSortKey6Nm(allocSortMap.get(sortkey));
						break;
					case 6:
						param.setAllocSortKey7(sortkey);
						param.setAllocSortKey7Nm(allocSortMap.get(sortkey));
						break;
					case 7:
						param.setAllocSortKey8(sortkey);
						param.setAllocSortKey8Nm(allocSortMap.get(sortkey));
						break;
					}
				}
			}
			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
		}

		// [ON推-品向-1091] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/12 ichikawa Start
		// 区分値マスタより取得
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
		BClassDtlCB cb = bClassDtlBhv.newConditionBean();
		cb.specify().columnClassDtlCd();
		cb.specify().columnDictId();
		cb.setupSelect_BClass();
		cb.specify().specifyBClass().columnClassCd();
		cb.setupSelect_VDict(getCultureId());
		cb.specify().specifyVDict().columnDictNm();
		//cb.query().queryBClass().setClassId_Equal(getCenterClassCondition());
		List<String> classCdList = new ArrayList<String>();
		classCdList.add("STORE_NO_FLG");
		classCdList.add("MERGE_CLS");
		classCdList.add("OVER_STORE_NUM_FLG");
		classCdList.add("PAST_STORE_DT_FLG");
		classCdList.add("STORE_DT_FLG");
		classCdList.add("MULTI_PIC_CLS");
		classCdList.add("REPLENISH_UNIT_CLS");
		classCdList.add("EM_REPLENISH_ALLOC_CLS");
		classCdList.add("PACKING_CAL_CLS");
		classCdList.add("PACKING_PROCESS_CLS");
		classCdList.add("PRODUCT_PART_PACKING");
		classCdList.add("DEL_FLG");
		//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add Start
		classCdList.add("AFTER_TAG_OUT_FLG");
		classCdList.add("TAG_DELIVERY_OUT_FLG");
		classCdList.add("HT_CHAR_READ_FLG");
		//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add End

		cb.query().queryBClass().setClassCd_InScope(classCdList);
		cb.query().queryBClass().addOrderBy_ClassCd_Asc();
		cb.query().addOrderBy_ClassDtlCd_Asc();
		List<BClassDtl> centerClassList = bClassDtlBhv.selectList(cb);
		Map<String, Map<String, BClassDtl>> centerClassMap = new HashMap<String, Map<String, BClassDtl>>();

		// センタ区分値をMapに変換
		String classCd = "";
		Map<String, BClassDtl> dtlMap = null;
		for ( BClassDtl bClassDtl : centerClassList) {
			if (classCd.equals(bClassDtl.getBClass().getClassCd())) {
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl);
			} else {
				if (classCd.length() > 0) {
					centerClassMap.put(classCd, dtlMap);
				}
				dtlMap = new HashMap<String, BClassDtl>();
				dtlMap.put(bClassDtl.getClassDtlCd(), bClassDtl);
				classCd = bClassDtl.getBClass().getClassCd();
			}
		}
		if (classCd.length() > 0) {
			centerClassMap.put(classCd, dtlMap);
		}

		// 区分値マスタの名称の設定
		for (MClientCenter MClientCenter : result) {

			if (centerClassMap.containsKey("STORE_NO_FLG")) {
				// 入庫No.管理フラグ
				if (centerClassMap.get("STORE_NO_FLG").containsKey(MClientCenter.getMParamAsOne().getStoreNoFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStoreNoFlg(centerClassMap.get("STORE_NO_FLG").get(MClientCenter.getMParamAsOne().getStoreNoFlg()));
				}
			}
			if (centerClassMap.containsKey("MERGE_CLS")) {
				// 入庫No.マージ区分
				if (centerClassMap.get("MERGE_CLS").containsKey(MClientCenter.getMParamAsOne().getMergeCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByMergeCls(centerClassMap.get("MERGE_CLS").get(MClientCenter.getMParamAsOne().getMergeCls()));
				}
			}
			if (centerClassMap.containsKey("OVER_STORE_NUM_FLG")) {
				// 過入荷可フラグ
				if (centerClassMap.get("OVER_STORE_NUM_FLG").containsKey(MClientCenter.getMParamAsOne().getOverStoreNumFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByOverStoreNumFlg(centerClassMap.get("OVER_STORE_NUM_FLG").get(MClientCenter.getMParamAsOne().getOverStoreNumFlg()));
				}
			}
			if (centerClassMap.containsKey("PAST_STORE_DT_FLG")) {
				// 過去日入力可フラグ
				if (centerClassMap.get("PAST_STORE_DT_FLG").containsKey(MClientCenter.getMParamAsOne().getPastStoreDtFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPastStoreDtFlg(centerClassMap.get("PAST_STORE_DT_FLG").get(MClientCenter.getMParamAsOne().getPastStoreDtFlg()));
				}
			}
			if (centerClassMap.containsKey("STORE_DT_FLG")) {
				// 入庫日管理フラグ
				if (centerClassMap.get("STORE_DT_FLG").containsKey(MClientCenter.getMParamAsOne().getStoreDtFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByStoreDtFlg(centerClassMap.get("STORE_DT_FLG").get(MClientCenter.getMParamAsOne().getStoreDtFlg()));
				}
			}
			if (centerClassMap.containsKey("MULTI_PIC_CLS")) {
				// マルチピック計算区分
				if (centerClassMap.get("MULTI_PIC_CLS").containsKey(MClientCenter.getMParamAsOne().getMultiPicCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByMultiPicCls(centerClassMap.get("MULTI_PIC_CLS").get(MClientCenter.getMParamAsOne().getMultiPicCls()));
				}
			}
			if (centerClassMap.containsKey("REPLENISH_UNIT_CLS")) {
				// 定期補充単位
				if (centerClassMap.get("REPLENISH_UNIT_CLS").containsKey(MClientCenter.getMParamAsOne().getMultiPicCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByRgReplenishUnitCls(centerClassMap.get("REPLENISH_UNIT_CLS").get(MClientCenter.getMParamAsOne().getMultiPicCls()));
				}
				// 緊急補充単位
				if (centerClassMap.get("REPLENISH_UNIT_CLS").containsKey(MClientCenter.getMParamAsOne().getMultiPicCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByEmReplenishUnitCls(centerClassMap.get("REPLENISH_UNIT_CLS").get(MClientCenter.getMParamAsOne().getMultiPicCls()));
				}
			}
			if (centerClassMap.containsKey("EM_REPLENISH_ALLOC_CLS")) {
				// 緊急補充ロケ割付方法
				if (centerClassMap.get("EM_REPLENISH_ALLOC_CLS").containsKey(MClientCenter.getMParamAsOne().getEmReplenishAllocCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPackingCalCls(centerClassMap.get("PACKING_CAL_CLS").get(MClientCenter.getMParamAsOne().getEmReplenishAllocCls()));
				}
			}
			if (centerClassMap.containsKey("PACKING_CAL_CLS")) {
				// 梱包計算処理区分
				if (centerClassMap.get("PACKING_CAL_CLS").containsKey(MClientCenter.getMParamAsOne().getPackingCalCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPackingCalCls(centerClassMap.get("PACKING_CAL_CLS").get(MClientCenter.getMParamAsOne().getPackingCalCls()));
				}
			}
			if (centerClassMap.containsKey("PACKING_PROCESS_CLS")) {
				// 詰込区分
				if (centerClassMap.get("PACKING_PROCESS_CLS").containsKey(MClientCenter.getMParamAsOne().getPackingProcessCls())) {
					MClientCenter.getMParamAsOne().setBClassDtlByPackingProcessCls(centerClassMap.get("PACKING_PROCESS_CLS").get(MClientCenter.getMParamAsOne().getPackingProcessCls()));
				}
			}
			if (centerClassMap.containsKey("PRODUCT_PART_PACKING")) {
				// 商品毎別梱包
				if (centerClassMap.get("PRODUCT_PART_PACKING").containsKey(MClientCenter.getMParamAsOne().getProductPartPacking())) {
					MClientCenter.getMParamAsOne().setBClassDtlByProductPartPacking(centerClassMap.get("PRODUCT_PART_PACKING").get(MClientCenter.getMParamAsOne().getProductPartPacking()));
				}
			}
			if (centerClassMap.containsKey("DEL_FLG")) {
				// 削除
				if (centerClassMap.get("DEL_FLG").containsKey(MClientCenter.getMParamAsOne().getDelFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByDelFlg(centerClassMap.get("DEL_FLG").get(MClientCenter.getMParamAsOne().getDelFlg()));
				}
			}
			//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add Start
			if (centerClassMap.containsKey("AFTER_TAG_OUT_FLG")) {
				// 検品後荷札出力フラグ
				if (centerClassMap.get("AFTER_TAG_OUT_FLG").containsKey(MClientCenter.getMParamAsOne().getAfterTagOutFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByAfterTagOutFlg(centerClassMap.get("AFTER_TAG_OUT_FLG").get(MClientCenter.getMParamAsOne().getAfterTagOutFlg()));
				}
			}
			if (centerClassMap.containsKey("TAG_DELIVERY_OUT_FLG")) {
				// 荷札納品書在中出力フラグ
				if (centerClassMap.get("TAG_DELIVERY_OUT_FLG").containsKey(MClientCenter.getMParamAsOne().getTagDeliveryOutFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByTagDeliveryOutFlg(centerClassMap.get("TAG_DELIVERY_OUT_FLG").get(MClientCenter.getMParamAsOne().getTagDeliveryOutFlg()));
				}
			}
			if (centerClassMap.containsKey("HT_CHAR_READ_FLG")) {
				// HT文字認識使用フラグ
				if (centerClassMap.get("HT_CHAR_READ_FLG").containsKey(MClientCenter.getMParamAsOne().getHtCharReadFlg())) {
					MClientCenter.getMParamAsOne().setBClassDtlByHtCharReadFlg(centerClassMap.get("HT_CHAR_READ_FLG").get(MClientCenter.getMParamAsOne().getHtCharReadFlg()));
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe End

				}
			}
			//[ON推-ON推受入_問題点指摘票(ON推-UT210-013) 修正対応 2016.08.05 chou Add End
		}
		// [ON推-品向-1091] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/12 ichikawa End

		// Dto変換処理
		centerMasterEditDto.data.head = centerMapper.mappingToDto(result.get(0).getMCenter());
		centerMasterEditDto.data.body = clientCentermapper.mappingToDtoList(result);
		return centerMasterEditDto;

	}
}