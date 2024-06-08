package com.oneslogi.wms.resources.shipping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.dto.customize.SqlShippingInstListDto;
import com.oneslogi.base.dbflute.dtomapper.TShippingInstHDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlShippingInstListDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingInstList;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingInstListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.shipping.DeliveryCourseShippingUpdateLogic;
import com.oneslogi.wms.logic.shipping.PieceShippingInspectCancelLogic;
import com.oneslogi.wms.logic.shipping.ShipStatusCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingDateUpdateLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstErrorCheckLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstListSelectLogic;
import com.oneslogi.wms.logic.shipping.ShippingPlanDeleteLogic;
import com.oneslogi.wms.logic.shipping.ShippingWorkRefUpdateLogic;
import com.oneslogi.wms.logic.shipping.UpdateControlNoLogic;
import com.oneslogi.wms.logic.shipping.WorkOrderLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

@Path("/shipping/shippingInstList")
public class ShippingInstListResource extends AbstractWmsResource {

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
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出荷状態チェック異常
		 */
		protected static final int SHIPPING_STATUS_CHECK_ERROR = 3;
		/**
		 * 日付一括変更異常
		 */
		protected static final int DATE_UPDATE_ERROR = 4;
		/**
		 * 配送コース一括変更異常
		 */
		protected static final int DELIVERY_COURSE_UDPATE_ERROR = 5;
		/**
		 * コントロールNo.更新異常
		 */
		protected static final int CONTROLNO_UPDATE_ERROR = 6;
		/**
		 * 出庫指示異常
		 */
		protected static final int SHIPPING_INST_ERROR = 7;
		/**
		 * 出庫指示解除異常
		 */
		protected static final int SHIPPING_INST_CANCEL_ERROR = 8;
		/**
		 * エラーチェック異常
		 */
		protected static final int ERROR_CHECK_ERROR = 9;
		/**
		 * 日付異常
		 */
		protected static final int DATE_ERROR = 10;
		// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
		/**
		 * 出庫指示ステータス更新異常
		 */
		protected static final int UPDATE_STATUS_ERROR = 11;
		/**
		 * ジョブ登録異常
		 */
		protected static final int JOB_QUE_ENTRY_ERROR = 12;
		// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShippingInstListSelectLogic selectLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ShippingDateUpdateLogic shippingDateUpdateLogic;
	@Inject
	private DeliveryCourseShippingUpdateLogic deliveryCourseShippingUpdateLogic;
	@Inject
	private ShippingPlanDeleteLogic deleteLogic;
	@Inject
	private ShippingInstErrorCheckLogic shippingInstErrorCheckLogic;
	@Inject
	private ShipStatusCheckLogic shipStatusCheckLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private UpdateControlNoLogic updateControlNoLogic;
	@Inject
	private WorkOrderLogic workOrderLogic;
	@Inject
	private ShippingWorkRefUpdateLogic shippingWorkRefUpdateLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	// [C-CWMS-0019] 出荷検品解除機能を追加 2015.03.23 kyo Start
	@Inject
	private PieceShippingInspectCancelLogic pieceShippingInspectCancelLogic;
	// [C-CWMS-0019] 出荷検品解除機能を追加 2015.03.23 kyo End
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe Start
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End

	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化(shipStatusUpdateLogic, jobQueEntryInitializerLogicを削除) 2018.07.24 kawana Delete

	// [SK2-028][ON推-品向-431] エラーチェックを関数に抜き出しで使用しなくなった変数を削除 2014.12.11 kawana

	/**
	 * <h2>初期処理</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * </pre>
	 * @return ShippingInstListDto 出庫指示一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public ShippingInstListDto init() {
		// [C-NIS-0007] 日付のデフォルト制御追加 2015.07.03 hayashi Start
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		ShippingInstListDto result = new ShippingInstListDto();
		// 日付From
		result.data.dtFromDefFlg = getPropertyIntValue(WmsPropertyConst.SHIPPING_INST_LIST_DT_FROM_DEF_FLG);
		// 日付To
		result.data.dtToDefFlg = getPropertyIntValue(WmsPropertyConst.SHIPPING_INST_LIST_DT_TO_DEF_FLG);
		return result;
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End
		// [C-NIS-0007] 日付のデフォルト制御追加 2015.07.03 hayashi End
	}

	/**
	 * <h2>出庫指示一覧データ検索処理</h2>
	 * <pre>
	 * 画面で入力された検索条件を元に出庫指示一覧データを取得する。
	 * </pre>
	 * @param shippingInstListDto  出庫指示一覧画面用DTO
	 * @return ShippingInstListDto 出庫指示一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public ShippingInstListDto search(ShippingInstListDto shippingInstListDto) {
		return searchByOutsideSql(shippingInstListDto);
	}

	/**
	 * <h2>出庫指示一覧データ取得</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * 画面で入力されたCDを元にIDを取得し、出庫指示一覧データ取得
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return ShippingInstListDto 処理結果DTO
	 */
	protected ShippingInstListDto searchByOutsideSql(ShippingInstListDto shippingInstListDto) {

		ShippingInstListDto resultShippingInstListDto = new ShippingInstListDto();

		// Entity変換
		TShippingInstHDtoMapper headerMapper = new TShippingInstHDtoMapper();
		final TShippingInstH header = headerMapper.mappingToEntity(shippingInstListDto.data.search);

		// 出庫指示一覧取得用
		PagingResultBean<SqlShippingInstList> page = selectLogic.select(header, shippingInstListDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return resultShippingInstListDto;
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
		classCdList.add("SHIPPING_STATUS");
		classCdList.add("DELIV_TZ");
		classCdList.add("SHIPPING_STOP_FLG");
		classCdList.add("FORCE_FIXED_FLG");
		classCdList.add("LIST_OUT_FLG");
		classCdList.add("INVOICE_CREATE_FLG");
		//米国出荷ドキュメント追加対応 2018.01.01 PYM Start
		classCdList.add("BOL_OUT_FLG");
		//米国出荷ドキュメント追加対応 2018.01.01 PYM End
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
		for (SqlShippingInstList sqlShippingInstList : page) {
			if (bClassMap.containsKey("SHIPPING_STATUS")) {
				if (bClassMap.get("SHIPPING_STATUS").containsKey(sqlShippingInstList.getShippingStatus())) {
					sqlShippingInstList.setShippingStatusNm(bClassMap.get("SHIPPING_STATUS").get(sqlShippingInstList.getShippingStatus()));
				}
			}
			if (bClassMap.containsKey("DELIV_TZ")) {
				if (bClassMap.get("DELIV_TZ").containsKey(sqlShippingInstList.getDelivTz())) {
					sqlShippingInstList.setDelivTzNm(bClassMap.get("DELIV_TZ").get(sqlShippingInstList.getDelivTz()));
				}
			}
			if (bClassMap.containsKey("SHIPPING_STOP_FLG")) {
				if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(sqlShippingInstList.getShippingStopCs())) {
					sqlShippingInstList.setShippingStopCsNm(bClassMap.get("SHIPPING_STOP_FLG").get(sqlShippingInstList.getShippingStopCs()));
				}
				if (bClassMap.get("SHIPPING_STOP_FLG").containsKey(sqlShippingInstList.getShippingStopPd())) {
					sqlShippingInstList.setShippingStopPdNm(bClassMap.get("SHIPPING_STOP_FLG").get(sqlShippingInstList.getShippingStopPd()));
				}
			}
			if (bClassMap.containsKey("FORCE_FIXED_FLG")) {
				if (bClassMap.get("FORCE_FIXED_FLG").containsKey(sqlShippingInstList.getForceFixedFlg())) {
					sqlShippingInstList.setForceFixedFlgNm(bClassMap.get("FORCE_FIXED_FLG").get(sqlShippingInstList.getForceFixedFlg()));
				}
			}
			if (bClassMap.containsKey("LIST_OUT_FLG")) {
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getOplOutFlg())) {
					sqlShippingInstList.setOplOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getOplOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getMltOutFlg())) {
					sqlShippingInstList.setMltOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getMltOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getTplOutFlg())) {
					sqlShippingInstList.setTplOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getTplOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getPlOutFlg())) {
					sqlShippingInstList.setPlOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getPlOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getSlOutFlg())) {
					sqlShippingInstList.setSlOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getSlOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getPackingOutFlg())) {
					sqlShippingInstList.setPackingOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getPackingOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getStwOutFlg())) {
					sqlShippingInstList.setStwOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getStwOutFlg()));
				}
				// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add Start
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getInspectionOutFlg())) {
					sqlShippingInstList.setInspectionOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getInspectionOutFlg()));
				}
				// [#2234][Ver2.2.0] SDピッキング - 後続ラベル出力 2017.08.15 honma Add End

				// [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Start
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getSplOutFlg())) {
					sqlShippingInstList.setSplOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getSplOutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getPl1OutFlg())) {
					sqlShippingInstList.setPl1OutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getPl1OutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getPl2OutFlg())) {
					sqlShippingInstList.setPl2OutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getPl2OutFlg()));
				}
				if (bClassMap.get("LIST_OUT_FLG").containsKey(sqlShippingInstList.getCaseOutFlg())) {
					sqlShippingInstList.setCaseOutNm(bClassMap.get("LIST_OUT_FLG").get(sqlShippingInstList.getCaseOutFlg()));
				}
				// [#5134][Ver3.1] 出庫指示一覧画面表示項目追加 2018.09.03 miyabe Add Rnd

			}
			if (bClassMap.containsKey("INVOICE_CREATE_FLG")) {
				if (bClassMap.get("INVOICE_CREATE_FLG").containsKey(sqlShippingInstList.getInvoiceCreateFlg())) {
					sqlShippingInstList.setInvoiceCreateNm(bClassMap.get("INVOICE_CREATE_FLG").get(sqlShippingInstList.getInvoiceCreateFlg()));
				}
			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.11 miyabe End

			}
			//米国出荷ドキュメント追加対応 2018.01.01 PYM Start
			if (bClassMap.containsKey("BOL_OUT_FLG")) {
				if (bClassMap.get("BOL_OUT_FLG").containsKey(sqlShippingInstList.getBolOutFlg())) {
					sqlShippingInstList.setBolOutNm(bClassMap.get("BOL_OUT_FLG").get(sqlShippingInstList.getBolOutFlg()));
				}
			}
			//米国出荷ドキュメント追加対応 2018.01.01 PYM End
		}

		// Dto変換処理
		SqlShippingInstListDtoMapper mapper = new SqlShippingInstListDtoMapper();
		List<SqlShippingInstListDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultShippingInstListDto.paging = shippingInstListDto.paging;

		resultShippingInstListDto.data.list = list;

		return resultShippingInstListDto;
	}

	/**
	 * <h2>チェック処理(出荷指示キャンセル時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkIndicatorCancel")
	public StatusDto checkIndicatorCancel(ShippingInstListDto shippingInstListDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.shipOrderDelete(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

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
	 * <h2>出荷指示キャンセル処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷指示キャンセル処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicatorCancel")
	public ShippingInstListDto indicatorCancel(ShippingInstListDto shippingInstListDto) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.shipOrderDelete(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// 出荷指示キャンセル処理
		deleteLogic.Cancel(controlNo);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}

		controlNo = null;
		//コントロールNo.更新
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

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
	 * <h2>チェック処理(エラーデータ削除時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkErrorDelete")
	public StatusDto checkErrorDelete(ShippingInstListDto shippingInstListDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.errorDelete(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

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
	 * <h2>エラーデータ削除処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、エラーデータ削除処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return ShippingInstListDto 処理結果DTO
	 */
	@POST
	@Path("/errorDelete")
	public ShippingInstListDto errorDelete(ShippingInstListDto shippingInstListDto) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}
		//出荷状態チェック
		shipStatusCheckLogic.errorDelete(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// 出荷指示データ削除処理
		deleteLogic.delete(controlNo);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;

		// [ON推-品向-843] コントロールNo.がクリアされない問題を修正 2015.07.03 kawana Start
		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);
		// [ON推-品向-843] コントロールNo.がクリアされない問題を修正 2015.07.03 kawana End

		//コントロールNo.更新
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// [ON推-品向-843] コントロールNo.がクリアされない問題を修正 2015.07.03 kawana Start
		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
		// [ON推-品向-843] コントロールNo.がクリアされない問題を修正 2015.07.03 kawana End

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	// [Ver3.1][#5125]欠品クリア処理を追加 2018.08.20 matsumoto Start
	/**
	 * <h2>チェック処理(欠品クリア時)</h2>
	 * <pre>
	 * 出荷状態チェック及び欠品フラグチェックを行う。
	 *
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkClearShortage")
	public StatusDto checkClearShortage(ShippingInstListDto shippingInstListDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setStockOutFlg(list.getStockOutFlg());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態及び欠品フラグチェック
		shipStatusCheckLogic.clearShortage(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

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
	// [Ver3.1][#5125]欠品クリア処理を追加 2018.08.20 matsumoto End

	// [Ver3.1][#5125]欠品クリア処理を追加 2018.08.20 matsumoto Start
	/**
	 * <h2>欠品クリア処理</h2>
	 * <pre>
	 * 未出荷の出荷指示に対して欠品フラグ、欠品数をnullに更新する。
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return ShippingInstListDto 処理結果DTO
	 */
	@POST
	@Path("/clearShortage")
	public ShippingInstListDto clearShortage(ShippingInstListDto shippingInstListDto) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setStockOutFlg(list.getStockOutFlg());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		// 出荷状態及び欠品フラグチェック
		shipStatusCheckLogic.clearShortage(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.NOT_FOUND_DATA), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// 欠品クリアを実行
		workOrderLogic.clearShortage(controlNo);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;
		//コントロールNo.更新
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;

	}
	// [Ver3.1][#5125]欠品クリア処理を追加 2018.08.20 matsumoto End

	/**
	 * <h2>チェック処理(エラーチェック時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkErrorCheck")
	public StatusDto checkErrorCheck(ShippingInstListDto shippingInstListDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.errorCheck(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

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
	 * <h2>エラーチェック処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷ステータス更新処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return ShippingInstListDto 処理結果DTO
	 */
	@POST
	@Path("/errorCheck")
	public ShippingInstListDto errorCheck(ShippingInstListDto shippingInstListDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出しで使用しなくなった変数の削除 2014.12.11 kawana

		int countTShippingInstH = 0;
		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.errorCheck(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出し 2014.12.11 kawana Start

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		// データのエラーチェック
		// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw Start
		Boolean errorData = shippingInstErrorCheckLogic.check(controlNo, null, errRetSts(StatusCode.ERROR_CHECK_ERROR));

		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出し 2014.12.11 kawana End

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		// 出荷エラーチェックメッソド変更 2016.03.09 nayzaw End
		controlNo = null;
		int updateCount = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}
		if(updateCount != listTShippingInstH.size()){
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出し 2014.12.11 kawana Start
		// エラーチェックの結果判定
		if (errorData == null) {
			// 処理終了
			return null;
		}

		if (errorData.booleanValue()) {

			// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana Start
			// エラーありの警告メッセージ設定
			getWarnManager().add(warnRetSts(StatusCode.ERROR_CHECK_ERROR), WmsMessageConst.PROCESS_COMPLETE_ERROR_INCLUDED_INFORMATION);
			// [SK2-007] 「エラーデータがあります」の警告メッセージの設定をリソースクラスに変更 2014.12.09 kawana End

		} else {
			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		}

		return null;
		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出し 2014.12.11 kawana End
	}

	/**
	 * <h2>チェック処理(日付一括変更)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDateUpdate")
	public StatusDto checkDateUpdate(ShippingInstListDto shippingInstListDto) {
		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}
		shipStatusCheckLogic.dateUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.NOT_FOUND_DATA));
		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {

			String workShippingDt = shippingInstListDto.data.shippingInstFooter.dateBatch;
			String workShippingDtFlg = shippingInstListDto.data.shippingInstFooter.workShippingDtFlg;

			for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
				if ("0".equals(workShippingDtFlg)) {
					if (workShippingDt.compareTo(list.getShippingDt()) > 0) {
						this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.WORK_DATE_CANNOT_CHANGE_BEFORE_SHIO_DATE_ERROR);
						return null;
					}
				} else if ("1".equals(workShippingDtFlg)) {
					if (workShippingDt.compareTo(list.getWorkDt()) < 0) {
						this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_BEFORE_WORK_DATE_ERROR);
						return null;
					}

					// [新WMS-110-034] 出荷日<=納品予定日、出荷日<=納品指定日のチェックを追加 2015.07.29 kawana Start
					String delivPlanDt = list.getDelivPlanDt();
					if (!CU.isNullOrEmpty(delivPlanDt)) {
						// 出荷日>納品予定日の場合
						if (workShippingDt.compareTo(delivPlanDt) > 0) {
							this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_PLAN_DATE_ERROR);
							return null;
						}
					}

					String delivDt = list.getDelivDt();
					if (!CU.isNullOrEmpty(delivDt)) {
						// 出荷日>納品指定日の場合
						if (workShippingDt.compareTo(delivDt) > 0) {
							this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.SHIP_DATE_CANNOT_CHANGE_AFTER_DELIV_DATE_ERROR);
							return null;
						}
					}
					// [新WMS-110-034] 出荷日<=納品予定日、出荷日<=納品指定日のチェックを追加 2015.07.29 kawana End
				}
			}

			// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.21 matsumoto Start
			if (checkWorkShipDtWithSystemDt(shippingInstListDto)) {
				// 作業日/出荷日 < システム管理日付の場合
				this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.DATE_BEFORE_CANNOT_CHANGE_ERROR);
				return null;
			}
			// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.21 matsumoto End

			// 確認表示
			getInfoManager().add(this.infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.PROCESS_EXECUTE_CONFIRMATION);
		}
		return null;

	}

	/**
	 * <h2>日付一括変更処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、日付一括変更処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/dateUpdate")
	public StatusDto dateUpdate(ShippingInstListDto shippingInstListDto) {

		// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.21 matsumoto Start
		if (checkWorkShipDtWithSystemDt(shippingInstListDto)) {
			// 作業日/出荷日 < システム管理日付の場合
			this.getErrorManager().add(errRetSts(StatusCode.DATE_ERROR), WmsMessageConst.DATE_BEFORE_CANNOT_CHANGE_ERROR);
			return null;
		}
		// [品質検査対応][Ver3.1][#5656] 作業日/出荷日 < システム管理日付の入力チェックを追加 2018.11.21 matsumoto End

		//作業日/出荷日
		String takingShippingFlgBatch = shippingInstListDto.data.shippingInstFooter.workShippingDtFlg;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;

		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());//出庫作業№
			entityTShippingInstH.setControlNo(list.getControlNo());
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.dateUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//エンティティの編集
		TShippingInstH tShippingInstH = new TShippingInstH();//出荷指示ヘッダ
		if ("0".equals(takingShippingFlgBatch)) {//作業日
			tShippingInstH.setWorkDt(shippingInstListDto.data.shippingInstFooter.dateBatch);
			tShippingInstH.setShippingWorkDtFlg(0);
		}
		if ("1".equals(takingShippingFlgBatch)) {//出荷日
			tShippingInstH.setShippingDt(shippingInstListDto.data.shippingInstFooter.dateBatch);
			tShippingInstH.setShippingWorkDtFlg(1);
		}
		tShippingInstH.setControlNo(controlNo);

		//日付一括変更処理
		shippingDateUpdateLogic.update(tShippingInstH);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}
		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	/**
	 * <h2>チェック処理(配送コース一括変更)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDeliveryCourseUpdate")
	public StatusDto checkDeliveryCourseUpdate(ShippingInstListDto shippingInstListDto) {
		//出荷状態チェック
		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}
		shipStatusCheckLogic.deliveryCouseUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.NOT_FOUND_DATA));
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
	 * <h2>配送コース一括変更処理</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、配送コース一括変更処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/deliveryCourseUpdate")
	public StatusDto deliveryCourseUpdate(ShippingInstListDto shippingInstListDto) {

		// センタIDの取得
		MCenter centerCondition = new MCenter();
		//荷主センタ変更対応 201７.02.27 sja Start
		//centerCondition.setCenterCd(shippingInstListDto.data.search.getMCenter().getCenterCd());
		centerCondition.setCenterCd(shippingInstListDto.data.list.get(0).getCenterCd());
		//荷主センタ変更対応 201７.02.27 sja End
		long centerId = centerLogic.getUkEntityWithDeletedCheck(centerCondition).getCenterId();

		//配送コースCD
		String deliveryCourseCd = shippingInstListDto.data.shippingInstFooter.deliveryCourseCdBatch;

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstListDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());//出庫作業№
			entityTShippingInstH.setControlNo(list.getControlNo());
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.deliveryCouseUpdate(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		MDeliveryCourse mDeliveryCourseEntity = new MDeliveryCourse();
		mDeliveryCourseEntity.setCenterId(centerId);
		mDeliveryCourseEntity.setDeliveryCourseCd(deliveryCourseCd);
		MDeliveryCourse mDeliveryCourse = deliveryCourseLogic.getUkEntity(mDeliveryCourseEntity);
		if (mDeliveryCourse == null) {
			// [#169] メッセージの重複を削除 2016.12.05 kawana Start
			getErrorManager().add(new ErrorStatus(StatusCode.DELIVERY_COURSE_UDPATE_ERROR), WmsMessageConst.DELIVERY_COURSE_CD_NOT_FOUND_ERROR);
			// [#169] メッセージの重複を削除 2016.12.05 kawana End
			return null;
		}

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//エンティティの編集
		TShippingInstH tShippingInstH = new TShippingInstH();//出荷指示ヘッダ
		tShippingInstH.setDeliveryCourseCd(shippingInstListDto.data.shippingInstFooter.deliveryCourseCdBatch);
		tShippingInstH.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());
		tShippingInstH.setControlNo(controlNo);

		//配送コース付一括変更処理
		deliveryCourseShippingUpdateLogic.update(tShippingInstH);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}

		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	/**
	 * <h2>チェック処理(出庫指示)</h2>
	 * <pre>
	 * 以下のチェックを行う
	 * ・チェック処理(出庫指示時)
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkIndicator")
	public StatusDto checkIndicator(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.workOrder(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

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
	 * <h2>出庫指示</h2>
	 * <pre>
	 * チェック処理(出庫指示時)チェックを行う
	 * エラーがない場合は、出庫指示処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicator")
	public StatusDto indicator(ShippingInstListDto shippingInstDto) {

		// レスポンス対策 2016.02.24 kawana Start
		// DBデータのキャッシュを有効に設定
		this.setDataCache(true);
		// レスポンス対策 2016.02.24 kawana End

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			entityTShippingInstH.setClientId(list.getClientId());//荷主ID
			entityTShippingInstH.setCenterId(list.getCenterId());//センタID
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());//WMS出荷伝票No.
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());//出荷ステータス
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.workOrder(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		TShippingInstH controlNoTShippingInstH = new TShippingInstH();
		controlNoTShippingInstH.setControlNo(controlNo);

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		// 結果判定
		if (getErrorManager().size() > 0) {

			// 処理終了
			return null;
		}

//		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出し 2014.12.11 kawana Start
//		// [ON推-品向-423] 出庫指示の前にエラーチェックを実行 2014.12.09 KI Start
//
//		// データのエラーチェック
//		Boolean errorData = checkData(shippingInstDto);
//
//		// 結果判定
//		if (getErrorManager().size() > 0 || errorData == null) {
//
//			// 処理終了
//			return null;
//		}
//
//		if (errorData.booleanValue()) {
//
//			// エラーデータの場合は警告メッセージを登録
//			getWarnManager().add(warnRetSts(StatusCode.ERROR_CHECK_ERROR), WmsMessageConst.ERROR_DATA_FOUND_ERROR);
//
//			//コントロールNo.のクリア処理
//			for (TShippingInstH list : listTShippingInstH) {
//				list.setControlNo(controlNo);
//			}
//
//			controlNo = null;
//			updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
//
//			// 処理終了
//			return null;
//		}
//		// [ON推-品向-423] 出庫指示の前にエラーチェックを実行 2014.12.09 KI End
//		// [SK2-028][ON推-品向-431] エラーチェック処理を抜き出し 2014.12.11 kawana End

		// レスポンス対策 2016.02.24 kawana Start
		controlNoTShippingInstH.setCenterId(listTShippingInstH.get(0).getCenterId());
		controlNoTShippingInstH.setClientId(listTShippingInstH.get(0).getClientId());
		// レスポンス対策 2016.02.24 kawana End

		//出庫指示処理
		workOrderLogic.shipInstructe(controlNoTShippingInstH, errRetSts(StatusCode.SHIPPING_INST_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}

		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start

	/**
	 * <h2>出庫指示(バッチ処理)</h2>
	 * <pre>
	 * チェック処理(出庫指示時)チェックを行う
	 * エラーがない場合は、出庫指示バッチを登録し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicatorBatch")
	public StatusDto indicatorBatch(ShippingInstListDto shippingInstDto) {

		// ===== コントロールNo.を採番 =====

		long controlNo = numberingCenterLogic.getControlNo();

		// ===== コントロールNo.設定 =====

		int dataCount = 0;
		List<TShippingInstH> shippingInstHList = new ArrayList<TShippingInstH>();
		for (SqlShippingInstListDto dto : shippingInstDto.data.list) {
			TShippingInstH entity = new TShippingInstH();
			entity.setShippingInstHId(dto.getShippingInstHId());
			entity.setUpdDt(dto.getUpdDtH());
			entity.setCenterId(dto.getCenterId());
			entity.setClientId(dto.getClientId());
			entity.setControlNo(controlNo);
			shippingInstHList.add(entity);
			dataCount = dataCount + ((int) CU.nullToZero(dto.getNum()).longValue());
		}

		int updateCnt = updateControlNoLogic.update(shippingInstHList, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}
		if (updateCnt != dataCount) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		// ===== 出荷ステータスチェック =====

		shipStatusCheckLogic.workOrder(shippingInstHList.get(0), dataCount, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [#5120][v3.1] 出庫指示バッチ登録処理を共通化(共通化した処理を削除) 2018.07.24 kawana Delete

		// ===== バッチ登録 =====

		SqlShippingInstListDto dto = shippingInstDto.data.list.get(0);
		MCenter center = new MCenter();
		center.setCenterId(dto.getCenterId());
		center.setCenterCd(dto.getCenterCd());
		MClient client = new MClient();
		client.setClientId(dto.getClientId());
		client.setClientCd(dto.getClientCd());

		// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana Start
		String jobQueNo = workOrderLogic.shipInstructeJobEntry(center, client, controlNo, dataCount, errRetSts(StatusCode.JOB_QUE_ENTRY_ERROR));
		// [#5120][v3.1] 出庫指示バッチ登録処理を共通化 2018.07.24 kawana End
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 完了メッセージ設定 =====
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.SHIPPING_INST_BATCH_REGISTER_INFORMATION, jobQueNo);
		return null;
	}

	// [#5120][v3.1] 出庫指示バッチ登録処理を共通化(jobEntryメソッド削除) 2018.07.24 kawana Delete

	// [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End

	/**
	 * <h2>チェック処理(出庫指示解除時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkIndicatingLift")
	public String checkIndicatingLift(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		boolean blnFlg = false;
		String strConfirmFlg = null;

		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.workOrderCancel(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			strConfirmFlg = "1";
		}

		//複数伝票が存在チェック
		blnFlg = selectLogic.workOrderCancelCheck(listTShippingInstH, null, null, null);

		// 結果判定
		if (blnFlg) {
			// 確認表示
			strConfirmFlg = "2";
		}

		return strConfirmFlg;
	}

	/**
	 * <h2>出庫指示解除</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出庫指示解除処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/indicatorLift")
	public StatusDto indicatorLift(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		long countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setClientId(list.getClientId());//荷主ID
			entityTShippingInstH.setCenterId(list.getCenterId());//センタID
			// [横並-109] WMS出荷伝票No.は出庫作業No.へ変更 2014.11.26 楊寧 Start
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());//出庫作業No.
			// [横並-109] WMS出荷伝票No.は出庫作業No.へ変更 2014.11.26 楊寧 End
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			// [横並-109] カウント数の取得処理を削除 2014.11.27 楊寧
			listTShippingInstH.add(entityTShippingInstH);
		}

		// [横並-109] カウント数の取得処理を追加 2014.11.27 楊寧 Start
		Set<String> set = new HashSet<String>();
		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			if (!set.contains(list.getPickingWorkNo())) {
				set.add(list.getPickingWorkNo());
				// [ON推-品向-321]出庫指示解除する時、致命的にエラーを解消するため、下記のCU.nullToZero()関数使用を変更 2014.11.28 許 Start
				countTShippingInstH += CU.nullToZero(list.getPickingWorkNoCnt());
				// [ON推-品向-321]出庫指示解除する時、致命的にエラーを解消するため、下記のCU.nullToZero()関数使用を変更 2014.11.28 許 End
			}
		}
		// [横並-109] カウント数の取得処理を追加 2014.11.27 楊寧 End

		//出荷状態チェック
		shipStatusCheckLogic.workOrderCancel(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		TShippingInstH controlNoTShippingInstH = new TShippingInstH();
		controlNoTShippingInstH.setControlNo(controlNo);

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//出庫指示解除処理
		workOrderLogic.shipCancel(controlNoTShippingInstH, errRetSts(StatusCode.SHIPPING_INST_CANCEL_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 (問題のソースを削除) 2017.05.26 kawana

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}

		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 2017.05.26 kawana Start

		if (getWarnManager().size() == 0) {
			// 警告ありの場合は警告メッセージのみ表示

			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 2017.05.26 kawana End

		return null;

	}

	/**
	 * <h2>チェック処理(出庫作業メッセージ登録)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkShippingWorkRefUpdate")
	public StatusDto checkShippingWorkRefUpdate(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.remarkMessage(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

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
	 * <h2>出庫作業メッセージ登録</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出庫作業メッセージ登録処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/shippingWorkRefUpdate")
	public StatusDto shippingWorkRefUpdate(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		int countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana Start
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			// [ON推-品向-507] コントロールNo.更新の条件で使用するヘッダIDを追加 2015.01.08 kawana End
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());//出庫作業№
			entityTShippingInstH.setClientId(list.getClientId());//荷主ID
			entityTShippingInstH.setCenterId(list.getCenterId());//センタID
			entityTShippingInstH.setShippingSlipNo(list.getShippingSlipNo());//WMS出荷伝票No.
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			countTShippingInstH = countTShippingInstH + Integer.parseInt(list.getNum() + "");
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.remarkMessage(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		TShippingInstH controlNoTShippingInstH = new TShippingInstH();
		controlNoTShippingInstH.setControlNo(controlNo);
		controlNoTShippingInstH.setPickingWorkMessage(shippingInstDto.data.message);

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//出庫作業メッセージ登録処理
		shippingWorkRefUpdateLogic.update(controlNoTShippingInstH);

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}

		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;

	}

	// errorCheck() 処理からコントロールNoを使用してチェック処理を呼び出してる為checkData()メッソドを外す 2016.3.10 nayzaw

	// [C-CWMS-0019] 出荷検品解除機能を追加 2015.03.23 kyo Start
	/**
	 * <h2>チェック処理(出荷検品解除時)</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkpieceShippingInspectCancel")
	public String checkpieceShippingInspectCancel(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;
		boolean blnFlg = false;
		String strConfirmFlg = null;

		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());
			entityTShippingInstH.setClientId(list.getClientId());
			entityTShippingInstH.setCenterId(list.getCenterId());
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());
			listTShippingInstH.add(entityTShippingInstH);
		}

		//出荷状態チェック
		shipStatusCheckLogic.pieceShippingInspectCancel(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		} else {
			// 確認表示
			strConfirmFlg = "1";
		}
		//複数伝票が存在チェック
		blnFlg = selectLogic.workOrderCancelCheck(listTShippingInstH, null, null, null);

		// 結果判定
		if (blnFlg) {
			// 確認表示
			strConfirmFlg = "2";
		}

		return strConfirmFlg;
	}

	/**
	 * <h2>出荷検品解除</h2>
	 * <pre>
	 * 出荷状態チェックを行う
	 * エラーがない場合は、出荷検品解除処理クラスを呼出し、完了メッセージを設定する
	 * </pre>
	 * @param shippingInstDto 出庫指示一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/pieceShippingInspectCancel")
	public StatusDto pieceShippingInspectCancel(ShippingInstListDto shippingInstDto) {

		List<TShippingInstH> listTShippingInstH = new ArrayList<TShippingInstH>();
		TShippingInstH entityTShippingInstH = null;

		//出荷指示ヘッダ.行数
		long countTShippingInstH = 0;
		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			entityTShippingInstH = new TShippingInstH();
			entityTShippingInstH.setShippingInstHId(list.getShippingInstHId());
			entityTShippingInstH.setClientId(list.getClientId());//荷主ID
			entityTShippingInstH.setCenterId(list.getCenterId());//センタID
			entityTShippingInstH.setPickingWorkNo(list.getPickingWorkNo());//出庫作業No.
			entityTShippingInstH.setShippingStatus(list.getShippingStatus());//出荷ステータス
			entityTShippingInstH.setUpdDt(list.getUpdDtH());//更新日時
			listTShippingInstH.add(entityTShippingInstH);
		}

		Set<String> set = new HashSet<String>();
		for (SqlShippingInstListDto list : shippingInstDto.data.list) {
			if (!set.contains(list.getPickingWorkNo())) {
				set.add(list.getPickingWorkNo());
				countTShippingInstH += CU.nullToZero(list.getPickingWorkNoCnt());
			}
		}

		//出荷状態チェック(出荷検品解除)
		shipStatusCheckLogic.pieceShippingInspectCancel(listTShippingInstH, null, null, null, errRetSts(StatusCode.SHIPPING_STATUS_CHECK_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();
		TShippingInstH controlNoTShippingInstH = new TShippingInstH();
		controlNoTShippingInstH.setControlNo(controlNo);

		//コントロールNo.更新
		int updateCnt = updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		if (updateCnt != countTShippingInstH) {
			getErrorManager().add(new ErrorStatus(StatusCode.CONTROLNO_UPDATE_ERROR), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}

		//出荷検品解除処理
		pieceShippingInspectCancelLogic.pieceShippingInspectCancel(controlNoTShippingInstH, errRetSts(StatusCode.SHIPPING_INST_CANCEL_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 (問題のソースを削除) 2017.05.26 kawana

		//コントロールNo.のクリア処理
		for (TShippingInstH list : listTShippingInstH) {
			list.setControlNo(controlNo);
		}

		controlNo = null;
		updateControlNoLogic.update(listTShippingInstH, controlNo, errRetSts(StatusCode.CONTROLNO_UPDATE_ERROR));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理終了
			return null;
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 2017.05.26 kawana Start

		if (getWarnManager().size() == 0) {
			// 警告ありの場合は警告メッセージのみ表示

			// 完了メッセージの設定
			getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		}

		// [#1850] 出庫指示解除で警告が発生すると以降そのデータが操作できなくなる問題を修正 2017.05.26 kawana End

		return null;

	}
	// [C-CWMS-0019] 出荷検品解除機能を追加 2015.03.23 kyo End


	// [品質検査対応][Ver3.1][#5656] 日付一括変更処理内で行っていた入力チェックを追加 2018.11.21 matsumoto Start
	/**
	 * <h2>チェック処理(日付一括変更)</h2>
	 * <pre>
	 * 入力された作業日/出荷日とシステム管理日付のチェックを行う
	 * 作業日/出荷日 ＜ システム管理日付の場合、trueを返す
	 * </pre>
	 * @param shippingInstListDto 出庫指示一覧画面用DTO
	 * @return boolean
	 */
	private boolean checkWorkShipDtWithSystemDt(ShippingInstListDto shippingInstListDto) {

		boolean hasError = false;
		// 入力された作業日/出荷日
		String workShippingDt = shippingInstListDto.data.shippingInstFooter.dateBatch;

		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setCenterId(shippingInstListDto.data.list.get(0).getCenterId());
		mClientCenter.setClientId(shippingInstListDto.data.list.get(0).getClientId());
		// システム管理日付の取得
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// 作業日/出荷日 < システム管理日付のチェック
		if (workShippingDt.compareTo(mClientCenter.getSystemDt()) < 0) {
			hasError = true;
		}

		return hasError;
	}
	// [品質検査対応][Ver3.1][#5656] 日付一括変更処理内で行っていた入力チェックを追加 2018.11.21 matsumoto End
}
