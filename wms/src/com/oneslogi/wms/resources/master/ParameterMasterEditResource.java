package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientCenterDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MBox;
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
import com.oneslogi.wms.dto.common.ClientCenterDto;
import com.oneslogi.wms.dto.master.CenterMasterEditDto;
import com.oneslogi.wms.logic.common.BoxGrpLogic;
import com.oneslogi.wms.logic.common.BoxLogic;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.master.CenterMasterInsertLogic;
import com.oneslogi.wms.logic.master.ClientMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;
/**
 * パラメータマスタメンテナンス(編集)画面のリソースクラス。
 */
@Path("/master/parameterMasterEdit")
public class ParameterMasterEditResource extends AbstractWmsResource {

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
		 * センタマスタデータ取得異常
		 */
		protected static final int CENTER_MASTER_EDIT_SELECT_FAILED = 4;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK_ERROR = 8;
		/**
		 * センタCDで重複エラー
		 */
		protected static final int CENTER_CODE_DUPLICATE_ERROR = 2;
		/**
		 * 荷主マスタ存在異常
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 3;
		/**
		 * 登録異常
		 */
		protected static final int CENTER_MASTER_EDIT_INSERT_FAILED = 5;
		/**
		 * 配送コースマスタ存在異常
		 */
		protected static final int DELIVERYCOURSE_NOT_FOUND_ERROR = 7;
		/**
		 * 荷姿マスタ存在異常(ケース荷姿)
		 */
		protected static final int CASE_SHAPE_NOT_FOUND_ERROR = 9;
		/**
		 * 荷姿マスタ存在異常(ボール荷姿)
		 */
		protected static final int BOWL_SHAPE_NOT_FOUND_ERROR = 10;
		/**
		 * 荷姿マスタ存在異常(ピース荷姿)
		 */
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

		/**
		 * 荷主CDが重複しています
		 */
		protected static final int CLIENT_CODE_DUPLICATE_ERROR = 15;
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
		/**
		 * 荷材マスタ存在異常
		 */
		protected static final int BOX_NOT_FOUND_ERROR = 16;
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start
		/**
		 * 荷姿マスタ存在異常(緊急補充ゾーン補充荷姿)
		 */
		protected static final int EM_REPLENISH_SHAPE_NOT_FOUND_ERROR = 17;
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End
	}

	@Inject
	private ClientMasterSelectLogic clientMasterSelectLogic;
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private BoxGrpLogic boxGrpLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	@Inject
	private CenterMasterInsertLogic centerMasterInsertLogic;

	@Inject
	private MClientCenterBhv mClientCenterBhv;
	//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
	@Inject
	private BoxLogic boxLogic;
	//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End

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
	 *
	 * @param centerId センタID
	 *
	 * @return ClientCenterDto パラメータマスタメンテナンス(編集)画面のリソースクラス
	 */
	@GET
	@Path("/initNew")
	public ClientCenterDto initNew(@QueryParam("centerId") Long centerId) {
		ClientCenterDto mDto = new ClientCenterDto();

		MClientCenter mClientCenter = new MClientCenter();
		// [#1472] jsスクリプトエラー発生 2017.03.30 kawana Start
		// 画面で使用している関連マスタを生成
		chaseMClientCenter(mClientCenter);
		// [#1472] jsスクリプトエラー発生 2017.03.30 kawana End

		MCenter mCenter = new MCenter();
		mCenter.setCenterId(centerId);
		mClientCenter.setMCenter(mCenter);

		MClientCenterDtoMapper clientCentermapper = new MClientCenterDtoMapper();
		mDto.data.mClientCenter = clientCentermapper.mappingToDto(mClientCenter);
		return mDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ClientCenterDto パラメータマスタメンテナンス(編集)画面のリソースクラス
	 * @param clientCenterId  荷主センタID
	 */
	@GET
	@Path("/initUpdate")
	public ClientCenterDto initUpdate(@QueryParam("clientCenterId") Long clientCenterId) {

		// エンティティ編集
		ClientCenterDto clientCenterDto = new ClientCenterDto();
		MClientCenterDtoMapper clientCentermapper = new MClientCenterDtoMapper();

		// センタマスタメンテナンス(編集)検索データ取得
		MClientCenter mClientCenter = clientMasterSelectLogic.selectByClientCenterId(clientCenterId, errRetSts(StatusCode.CENTER_MASTER_EDIT_SELECT_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		// [#1472] jsスクリプトエラー発生 2017.03.30 kawana Start
		// 画面で使用している関連マスタを生成
		chaseMClientCenter(mClientCenter);
		// [#1472] jsスクリプトエラー発生 2017.03.30 kawana End
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.14 miyabe Start
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

		// Dto変換処理
		clientCenterDto.data.mClientCenter = clientCentermapper.mappingToDto(mClientCenter);
		return clientCenterDto;
	}

	// [#1472] jsスクリプトエラー発生 2017.03.30 kawana Start

	/**
	 * パラメータマスタメンテナンス(編集)画面用データ作成
	 * @param mClientCenter
	 */
	private void chaseMClientCenter(MClientCenter mClientCenter) {

		if (mClientCenter.getMParamAsOne() == null) {
			mClientCenter.setMParamAsOne(new MParam());
		}
		if (mClientCenter.getMParamAsOne().getMDeliveryCourse() == null) {
			mClientCenter.getMParamAsOne().setMDeliveryCourse(new MDeliveryCourse());
		}
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
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
		if(mClientCenter.getMParamAsOne().getMBox()==null){
			mClientCenter.getMParamAsOne().setMBox(new MBox());
		}
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
	}

	// [#1472] jsスクリプトエラー発生 2017.03.30 kawana End

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
//		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.head);
		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.body.get(0).getMCenter());
		MClientCenterDtoMapper bodyMapper = new MClientCenterDtoMapper();
		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body);

		// 入力チェック処理
		ResultSetupData resultStatus = check(mCenter, mClientCenterList, errRetSts(StatusCode.INPUT_CHECK_ERROR), centerMasterEditDto.mode);

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
	 * <h2>チェック処理。</h2>
	 *  新規登録データのチェックを行う。
	 *・センタコードで重複エラー用メッセージ
	 *・荷主マスタ存在チェックエラー用メッセージ
	 * @param mCenter センタマスタ
	 * @param mClientCenterList 荷主マスタリスト
	 * @param errSts ErrorStatus
	 * @return ResultSetupData 結果
	 */
	protected ResultSetupData check(MCenter mCenter, List<MClientCenter> mClientCenterList, ErrorStatus errSts, String mode) {

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

			// [ON推-品向-1123] 新規登録の判定を変更 2016.04.18 kawana Start
			if (mClientCenter.getClientCenterId() == null) {
				// [ON推-品向-1123] 新規登録の判定を変更 2016.04.18 kawana End
				// 新規場合、荷主CD重複チェックを行う

				// 荷主CD重複チェック
				if (checkDuplicateClientCenterId(mClientCenter.getCenterId(), mClientCenter.getMClient().getClientCd())) {
					getErrorManager().add(new ErrorStatus(errSts, StatusCode.CLIENT_CODE_DUPLICATE_ERROR, row), WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
					break;
				}
			}

			MClient mClient = new MClient();
			mClient.setClientCd(mClientCenter.getMClient().getClientCd());
			mClient = clientLogic.getUkEntity(mClient, errRetSts(errSts, StatusCode.CLIENT_NOT_FOUND_ERROR, row));
			if (mClient != null) {
				mClientCenter.setClientId(mClient.getClientId());
			}
			MParam mParam = mClientCenter.getMParamAsOne();
			if (mParam != null) {

				// [#1530] トランザクション保持期間 < 履歴保持期間のチェックを削除 2017.04.19 kawana

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

				// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start

				// [Ver3.0] unit of measure対応 2017.12.27 NING Del

				// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End

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

			   //Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
			   // デフォルト荷材
				if(mParam.getMBox() != null){
					if (mParam.getMBox().getBoxCd()!=null){
						MBox mBbox = new MBox();
						mBbox.setBoxCd(mParam.getMBox().getBoxCd());
						mBbox.setCenterId(mCenter.getCenterId());
						mBbox = boxLogic.getUkEntity(mBbox, errRetSts(errSts, StatusCode.BOX_NOT_FOUND_ERROR, row));
						if (mBbox != null) {
							mParam.setDefaultBoxId(mBbox.getBoxId());
						}else{
							mParam.setDefaultBoxId(null);
						}
					}else{
						mParam.setDefaultBoxId(null);
					}
				}else{
					mParam.setDefaultBoxId(null);
				}
			   //Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End
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
	 * <h2>センタマスタ登録。</h2>
	 * <pre>
	 * 登録データのチェックを行う
	 * エラーがない場合は、データベースにセンタマスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerMasterEditDto センタマスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CenterMasterEditDto centerMasterEditDto) {

		// Entity変換
		MCenterDtoMapper mapper = new MCenterDtoMapper();
//		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.head);
		MCenter mCenter = mapper.mappingToEntity(centerMasterEditDto.data.body.get(0).getMCenter());
		MClientCenterDtoMapper bodyMapper = new MClientCenterDtoMapper();
//		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body.get(0).getMClientCenterList());
		List<MClientCenter> mClientCenterList = bodyMapper.mappingToEntityList(centerMasterEditDto.data.body);
		ResultSetupData resultStatus = check(mCenter, mClientCenterList, errRetSts(StatusCode.INPUT_CHECK_ERROR), centerMasterEditDto.data.head.getMode());

		// 結果判定
		if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		// センタマスタ登録
//		centerMasterInsertLogic.insert(mCenter, errRetSts(StatusCode.CENTER_MASTER_EDIT_INSERT_FAILED));

		// 結果判定
//		if (0 < getErrorManager().size()) {
//			return null;
//		}
		// パラメータマスタリスト
		List<MParam> mParamList = new ArrayList<MParam>();
		for (MClientCenter mClientCenter : mClientCenterList) {
			MParam mParam = mClientCenter.getMParamAsOne();
			mParam.setDelFlg(mClientCenter.getDelFlg());
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
		return null;
	}


	/**
	 * <h2>荷主マスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * 荷主センタマスタ情報を取得する。
	 * 以下のチェックを行う。
	 * ・取得データが0件チェック
	 *
	 * 戻り値には次のテーブル結果が設定される。
	 *
	 * 【データ取得テーブル】
	 * ・荷主センタマスタ
	 *
	 * </pre>
	 * @param centerId センタID
	 * @param clientCd 荷主ID
	 *
	 * @return boolean チェック結果：True：荷主CDが重複 False:荷主CDが重複ない
	 */
	public boolean checkDuplicateClientCenterId(Long centerId, String clientCd) {

		ListResultBean<MClientCenter> result = null;
		// ===== 荷主マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();

		cb.setupSelect_MClient();

		// 荷主CD
		cb.query().queryMClient().setClientCd_Equal(clientCd);

		// センタID
		cb.query().setCenterId_Equal(centerId);

		// [#2449]削除フラグ=0の条件を削除 2017/09/06 sampei

		// ==== 荷主マスタ検索実行 =====
		result = mClientCenterBhv.selectList(cb);

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
		  return false;
		}
		return true;
	}

}
