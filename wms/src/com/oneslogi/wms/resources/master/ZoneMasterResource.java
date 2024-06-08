package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.cbean.MZoneCB;
import com.oneslogi.base.dbflute.dto.MZoneDto;
import com.oneslogi.base.dbflute.dtomapper.MZoneDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ZoneMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.WarehouseLogic;
import com.oneslogi.wms.logic.common.ZoneLogic;
import com.oneslogi.wms.logic.master.ZoneMasterInsertLogic;
import com.oneslogi.wms.logic.master.ZoneMasterSelectLogic;
import com.oneslogi.wms.logic.master.ZoneMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ゾーンマスタ画面のリソースクラス。
 */
@Path("/master/zoneMaster")
public class ZoneMasterResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int ZONE_MASTER_GET_FAILED = 2;
		/**
		 * ゾーンマスタ登録異常
		 */
		protected static final int ZONE_MASTER_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int ZONE_MASTER_UPDATE_FAILED = 4;
		/**
		 * ゾーンコードで重複異常
		 */
		protected static final int ZONE_CODE_DUPLICATE = 5;
		/**
		 *ロケーションマスタに登録済
		 */
		protected static final int LOCATION_EXIST = 6;
		// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI Start
		/**
		 *倉庫存在しない
		 */
		protected static final int WAREHOUSE_NOT_FOUND_ERROR = 7;
		// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ZoneMasterSelectLogic ZoneMasterSelectLogic;
	@Inject
	private ZoneMasterInsertLogic ZoneMasterInsertLogic;
	@Inject
	private ZoneMasterUpdateLogic ZoneMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private WarehouseLogic warehouseLogic;
	@Inject
	private ZoneLogic zoneLogic;
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * 登録または更新データ組立の結果
	 */

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ZoneMasterDto ゾーンマスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public ZoneMasterDto init() {
		return new ZoneMasterDto();
	}

	/**
	 * <h2>ゾーンマスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return ZoneMasterDto ゾーンマスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ZoneMasterDto fileUpload(MultipartFormDataInput input) throws Exception {

		// 画面用DTO作成
		ZoneMasterDto ZoneMasterDto = new ZoneMasterDto();

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(ZoneMasterDto, param);
			rows += conv.getUploadRows();
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return ZoneMasterDto;
	}

	/**
	 * <h2>ゾーンマスタデータ取得</h2>
	 * <pre>
	 * ゾーンマスタデータの一括取得処理
	 * </pre>
	 * @param ZoneMasterDto ゾーンマスタ一括取込画面用DTO
	 * @return ZoneMasterDto ゾーンマスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public ZoneMasterDto getMasterData(ZoneMasterDto ZoneMasterDto) {

		// データが存在しない場合
		if (ZoneMasterDto.data.zoneList.size() == 0) {
			return ZoneMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MZoneDtoMapper mZoneoDtoMapper = new MZoneDtoMapper();
		MZone searchCondition = mZoneoDtoMapper.mappingToEntity(ZoneMasterDto.data.zoneMasterSearch);

		// 一覧項目
		List<MZone> mZoneList = mZoneoDtoMapper.mappingToEntityList(ZoneMasterDto.data.zoneList);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MZone> zoneCdMap = new HashMap<String, MZone>();

		// 一覧件数分ループ(Map作成)
		for (MZone zone : mZoneList) {
			//チェック用配列に格納
			if (!CU.isNullOrEmpty(zone.getZoneCd()) && !zoneCdMap.containsKey(zone.getZoneCd())) {
				zoneCdMap.put(zone.getZoneCd(), null);
			}
		}

		// 初期値設定
		List<MZone> mZoneDbList = null;

		// ゾーンマスタ一括取得
		if (zoneCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			//検索条件設定
			MZoneCB cbMZone = mZoneBhv.newConditionBean();
			cbMZone.setupSelect_MWarehouse();
			// 荷主センタ変更対応 2017.04.21 sja Start
			cbMZone.setupSelect_MWarehouse().withMCenter();
			// 荷主センタ変更対応 2017.04.21 sja End
			cbMZone.query().setZoneCd_InScope(zoneCdMap.keySet()); // ゾーンCDが一緒
			cbMZone.query().queryMWarehouse().queryMCenter().setCenterCd_Equal(searchCondition.getMWarehouse().getMCenter().getCenterCd()); // センタIDが一緒

			//ゾーンマスタ取得
			mZoneDbList = mZoneBhv.selectList(cbMZone);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得したゾーンデータをMap化
		zoneCdMap.clear();
		if (mZoneDbList != null) {
			for (MZone mZone : mZoneDbList) {
				zoneCdMap.put(mZone.getZoneCd() + "\t" + mZone.getMWarehouse().getWarehouseCd(), mZone);
			}
		}

		for (MZone mZone : mZoneList) {

			// 荷主センタ変更対応 2017.04.21 sja Start
			mZone.getMWarehouse().chaseMCenter().setCenterCd(searchCondition.getMWarehouse().getMCenter().getCenterCd());
			// 荷主センタ変更対応 2017.04.21 sja End

			// ゾーンCDと倉庫CDをつなげkeyとする
			String key = mZone.getZoneCd() + "\t" + mZone.getMWarehouse().getWarehouseCd();

			// ZoneCd一致確認
			if (zoneCdMap.containsKey(key)) {
				// 一致するデータがある場合
				mZone.setZoneId(zoneCdMap.get(key).getZoneId());
				// [EC-CT1-152] 更新処理の場合共通項目をセットする 2015.03.30 koyama Start
				mZone.setVersionNo(zoneCdMap.get(key).getVersionNo());
				mZone.setControlNo(zoneCdMap.get(key).getControlNo());
				mZone.setAddDt(zoneCdMap.get(key).getAddDt());
				mZone.setAddUser(zoneCdMap.get(key).getAddUser());
				mZone.setAddProcess(zoneCdMap.get(key).getAddProcess());
				mZone.setUpdDt(zoneCdMap.get(key).getUpdDt());
				mZone.setUpdUser(zoneCdMap.get(key).getUpdUser());
				mZone.setUpdProcess(zoneCdMap.get(key).getUpdProcess());
				// [EC-CT1-152] 更新処理の場合共通項目をセットする 2015.03.30 koyama End
			} else {
				// 一致するデータがない場合
				mZone.setZoneId(null);
				mZone.setDelFlg("0");
			}
		}

		ZoneMasterDto.data.zoneList = mZoneoDtoMapper.mappingToDtoList(mZoneList);
		return ZoneMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・ゾーンマスタDTOをキーにゾーンマスタデータ取り出し
	 * </pre>
	 * @param zoneMasterDto ゾーンマスタ画面用DTO
	 * @return ZoneMasterDto ゾーンマスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ZoneMasterDto search(ZoneMasterDto zoneMasterDto) throws IOException {
		ZoneMasterDto zoneDto = new ZoneMasterDto();

		// Entity変換
		MZoneDtoMapper mapper = new MZoneDtoMapper();
		MZone zone = mapper.mappingToEntity(zoneMasterDto.data.zoneMasterSearch);

		//センタID取得
		String centerCd = zone.getMWarehouse().getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		zone.getMWarehouse().setCenterId(mCenter.getCenterId());

		//倉庫ID取得
		String warehouseCd = zone.getMWarehouse().getWarehouseCd();
		if (warehouseCd!=null){
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(warehouseCd);
			mWarehouse.setCenterId(mCenter.getCenterId());
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			// [SK2-071] 入力倉庫存在しない場合の検索処理を直す。 2014.12.18 KI Start
			if(mWarehouse != null){
				zone.setWarehouseId(mWarehouse.getWarehouseId());
			}else{
				this.getErrorManager().add(new ErrorStatus(errRetSts(StatusCode.ZONE_MASTER_GET_FAILED).getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
			// [SK2-071] 入力倉庫存在しない場合の検索処理を直す。 2014.12.18 KI End

		}

		// 検索
		List<MZone> page = ZoneMasterSelectLogic.select(zone, errRetSts(StatusCode.ZONE_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MZoneDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		zoneDto.data.zoneList = list;

		return zoneDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・センタCD存在チェックエラー用メッセージ
	 * ・ゾーンCD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 * </pre>
	 * @param zoneMasterDto ゾーンマスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ZoneMasterDto zoneMasterDto) {
	this. setupInputCheck(zoneMasterDto);

	if (getErrorManager().size() > 0) {
		// 処理中止
		return null;
	}
	// ゾーンCD重複の確認メッセージを設定
	getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
	return null;
	}

	/**
	 * <h2>ゾーンマスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにゾーンマスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param zoneMasterDto ゾーンマスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ZoneMasterDto zoneMasterDto) {
		// Entity変換
		MZoneDtoMapper mapper = new MZoneDtoMapper();
		List<MZone> zoneList = mapper.mappingToEntityList(zoneMasterDto.data.zoneList);

		// 荷主センタ変更対応 2017.04.21 sja Start
//		MZoneDtoMapper mapperhead = new MZoneDtoMapper();
//		MZone zonehead = mapperhead.mappingToEntity(zoneMasterDto.data.zoneMasterSearch);
		// 荷主センタ変更対応 2017.04.21 sja End

		this.setupInputCheck(zoneMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		List<MZone> insertList = new ArrayList<>();

		List<MZone> updatetList = new ArrayList<>();

		for (MZone mZone : zoneList) {

			//センタID取得
			MCenter mCenter = new MCenter();
			// 荷主センタ変更対応 2017.04.21 sja Start
//			mCenter.setCenterCd(zonehead.getMWarehouse().getMCenter().getCenterCd());
			mCenter.setCenterCd(mZone.getMWarehouse().getMCenter().getCenterCd());
			// 荷主センタ変更対応 2017.04.21 sja End
			mCenter = centerLogic.getUkEntity(mCenter);
			// 倉庫ID取得
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(mZone.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());;
			mWarehouse = warehouseLogic.getUkEntity(mWarehouse);
			// 倉庫ID設定
			mZone.setWarehouseId(mWarehouse.getWarehouseId());

			if (mZone.getZoneId() == null) {
				// 登録
				insertList.add(mZone);
//				ZoneMasterInsertLogic.insert(mZone, errRetSts(StatusCode.ZONE_MASTER_INSERT_FAILED));
			} else {
				// 修正
				updatetList.add(mZone);
//				ZoneMasterUpdateLogic.update(mZone, errRetSts(StatusCode.ZONE_MASTER_UPDATE_FAILED));
			}
		}

		if (!insertList.isEmpty()){
			ZoneMasterInsertLogic.batchInsert(insertList,errRetSts(StatusCode.ZONE_MASTER_INSERT_FAILED));
		}

		if (!updatetList.isEmpty()){
			ZoneMasterUpdateLogic.batchUpdate(updatetList,errRetSts(StatusCode.ZONE_MASTER_INSERT_FAILED));
		}

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		//[ON推-品向-145]「正常に更新されました。」に修正 2014.11.26 衛 Start
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-145]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・センタCD存在チェック
	 * ・ゾーンCD重複チェック
	 * </pre>
	 * @param mZoneList ゾーンマスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(ZoneMasterDto zoneMasterDto) {
		// 登録されていないセンタがあるか
		MZoneDtoMapper mapper = new MZoneDtoMapper();
		List<MZone> mZoneList = mapper.mappingToEntityList(zoneMasterDto.data.zoneList);

		// 荷主センタ変更対応 2017.04.21 sja Start
//		MZoneDtoMapper mapperhead = new MZoneDtoMapper();
//		MZone zonehead = mapperhead.mappingToEntity(zoneMasterDto.data.zoneMasterSearch);
		// 荷主センタ変更対応 2017.04.21 sja End

		int rowIndex = -1;

		// チェック処理
		for (MZone mZone : mZoneList) {
			rowIndex++;
			//センタID取得
			MCenter mCenter = new MCenter();
			// 荷主センタ変更対応 2017.04.21 sja Start
//			mCenter.setCenterCd(zonehead.getMWarehouse().getMCenter().getCenterCd());
			mCenter.setCenterCd(mZone.getMWarehouse().getMCenter().getCenterCd());
			// 荷主センタ変更対応 2017.04.21 sja End
			mCenter = centerLogic.getUkEntity(mCenter);
			// 倉庫ID取得
			MWarehouse mWarehouse = new MWarehouse();
			mWarehouse.setWarehouseCd(mZone.getMWarehouse().getWarehouseCd());
			mWarehouse.setCenterId(mCenter.getCenterId());;

			mWarehouse = warehouseLogic.getUkEntity(mWarehouse,errRetSts(errRetSts(StatusCode.WAREHOUSE_NOT_FOUND_ERROR),StatusCode.WAREHOUSE_NOT_FOUND_ERROR, rowIndex));
			// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI Start
			if (mWarehouse == null) {
		    	return null;
			}
			// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI End
			// 倉庫ID設定
			mZone.setWarehouseId(mWarehouse.getWarehouseId());
			// ゾーンCD重複チェック
			if (mZone.getZoneId() == null) {
				// 登録の場合
				 zoneLogic.checkZoneCdInsert(mZone, errRetSts(errRetSts(StatusCode.ZONE_CODE_DUPLICATE),StatusCode.ZONE_CODE_DUPLICATE, rowIndex));
			} else {
				//[検査-217]「ゾーンCD重複チェックしなくて正常に更新されました。」に修正 2014.12.03 衛 Start
				// 修正の場合
				 //zoneLogic.checkZoneCdUpdate(mZone, errRetSts(errRetSts(StatusCode.ZONE_CODE_DUPLICATE),StatusCode.ZONE_CODE_DUPLICATE, rowIndex));
				//[検査-217]「ゾーンCD重複チェックしなくて正常に更新されました。」に修正 2014.12.03 衛 End
				 //ロケーションマスタに登録済チェック
				 if (mZone.getDelFlg().equals("1")) {
					 zoneLogic.checkLocationExist(mZone, errRetSts(errRetSts(StatusCode.ZONE_CODE_DUPLICATE),StatusCode.ZONE_CODE_DUPLICATE, rowIndex));
				 }

			}

		}

		// 結果の設定
		return null;

	}
}
