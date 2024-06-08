package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipSgwCB;
import com.oneslogi.base.dbflute.dto.MCarrierSlipSgwDto;
import com.oneslogi.base.dbflute.dtomapper.MCarrierSlipSgwDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipSgwBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.master.CarrierSlipSgwMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.CarrierSlipSgwMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 佐川送り状マスタ画面のリソースクラス。
 */
@Path("/master/carrierSlipSgwMaster")
public class CarrierSlipSgwMasterResource extends AbstractWmsResource {

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
		protected static final int CARRIER_SLIP_SGW_MASTER_GET_FAILED = 2;
		/**
		 * 佐川送り状マスタ登録異常
		 */
		protected static final int CARRIER_SLIP_SGW_MASTER_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int CARRIER_SLIP_SGW_MASTER_UPDATE_FAILED = 4;
		/**
		 * データ種別重複異常
		 */
		protected static final int CARRIER_SLIP_SGW_TGATYPE_DUPLICATE = 5;
		// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
		/**
		 * 郵便番号で存在しない異常
		 */
		protected static final int ZIP_CODE_NOT_FOUND_ERROR = 7;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierSlipSgwMasterSelectLogic carrierSlipSgwMasterSelectLogic;
//		2016.03.11 Zhang 一覧編集 ※4  Start
//	@Inject
//	private CarrierSlipSgwMasterInsertLogic carrierSlipSgwMasterInsertLogic;
//	@Inject
//	private CarrierSlipSgwMasterUpdateLogic carrierSlipSgwMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
//	@Inject
//	private CarrierSlipSgwLogic carrierSlipSgwLogic;
//		2016.03.11 Zhang 一覧編集 ※4  End
	@Inject
	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;
	// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
//	@Inject
//	private ZipLogic zipLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public CarrierSlipSgwMasterDto init() {
		return new CarrierSlipSgwMasterDto();
	}

//	/**
//	 * <h2>佐川送り状マスタ一括取込。</h2>
//	 * <pre>
//	 * アップロードデータ取得し、画面用DTOの作成。
//	 * </pre>
//	 * @param input アップロードデータ
//	 * @return CarrierSlipSgwMasterDto 佐川送り状マスタ一括取込画面用DTO
//	 */
//	@POST
//	@Path("/fileUpload")
//	public CarrierSlipSgwMasterDto fileUpload(MultipartFormDataInput input) throws Exception {
//
//		// 画面用DTO作成
//		CarrierSlipSgwMasterDto carrierSlipSgwMasterDto = new CarrierSlipSgwMasterDto();
//
//		int rows = 0;
//
//		// アップロードデータ取得処理
//		InputDto param = getUploadParams(input);
//		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);
//
//		FileToDto conv = new FileToDto();
//
//		// アップロードデータ取込処理
//		for (String file : files) {
//			conv.open(file);
//			conv.setData(carrierSlipSgwMasterDto, param);
//			rows += conv.getUploadRows();
//		}
//
//		// 完了メッセージの設定
//		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));
//
//		return carrierSlipSgwMasterDto;
//	}

	/**
	 * <h2>佐川送り状マスタデータ取得。</h2>
	 * <pre>
	 * 佐川送り状マスタデータの一括取得処理
	 * </pre>
	 * @param carrierSlipSgwMasterDto 佐川送り状マスタ一括取込画面用DTO
	 * @return CarrierSlipSgwMasterDto 佐川送り状マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public CarrierSlipSgwMasterDto getMasterData(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {

		// データが存在しない場合
		if (carrierSlipSgwMasterDto.data.carrierSlipSgwList.size() == 0) {
			return carrierSlipSgwMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MCarrierSlipSgwDtoMapper mCarrierSlipSgwoDtoMapper = new MCarrierSlipSgwDtoMapper();
		MCarrierSlipSgw searchCondition = mCarrierSlipSgwoDtoMapper.mappingToEntity(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch);

		//センタID取得
		String centerCd = searchCondition.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 一覧項目
		List<MCarrierSlipSgw> mCarrierSlipSgwList = mCarrierSlipSgwoDtoMapper.mappingToEntityList(carrierSlipSgwMasterDto.data.carrierSlipSgwList);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MCarrierSlipSgw> carrierSlipSgwCdMap = new HashMap<String, MCarrierSlipSgw>();

		// 一覧件数分ループ(Map作成)
		for (MCarrierSlipSgw carrierSlipSgw : mCarrierSlipSgwList) {
			//チェック用配列に格納
			if (!CU.isNullOrEmpty(carrierSlipSgw.getTagType()) && !carrierSlipSgwCdMap.containsKey(carrierSlipSgw.getTagType())) {
				carrierSlipSgwCdMap.put(carrierSlipSgw.getTagType(), null);
			}
		}

		// 初期値設定
		List<MCarrierSlipSgw> mCarrierSlipSgwDbList = null;

		// ゾーンマスタ一括取得
		if (carrierSlipSgwCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			//検索条件設定
			MCarrierSlipSgwCB cbMCarrierSlipSgw = mCarrierSlipSgwBhv.newConditionBean();
			cbMCarrierSlipSgw.setupSelect_MCenter();
			cbMCarrierSlipSgw.query().setTagType_InScope(carrierSlipSgwCdMap.keySet());

			//佐川送り状マスタ取得
			mCarrierSlipSgwDbList = mCarrierSlipSgwBhv.selectList(cbMCarrierSlipSgw);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得した佐川送り状データをMap化
		carrierSlipSgwCdMap.clear();
		if (mCarrierSlipSgwDbList != null) {
			for (MCarrierSlipSgw mCarrierSlipSgw : mCarrierSlipSgwDbList) {
				carrierSlipSgwCdMap.put(mCarrierSlipSgw.getTagType() + "\t" + mCarrierSlipSgw.getCenterId(), mCarrierSlipSgw);
			}
		}

		for (MCarrierSlipSgw mCarrierSlipSgw : mCarrierSlipSgwList) {

			// データ種別とセンタIDをつなげkeyとする
			String key = mCarrierSlipSgw.getTagType() + "\t" + mCenter.getCenterId();
			mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
			// CarrierSlipSgwCd一致確認
			if (carrierSlipSgwCdMap.containsKey(key)) {
				// 一致するデータがある場合
				mCarrierSlipSgw.setCarrierSlipSgwId(carrierSlipSgwCdMap.get(key).getCarrierSlipSgwId());
				mCarrierSlipSgw.setVersionNo(carrierSlipSgwCdMap.get(key).getVersionNo());
				mCarrierSlipSgw.setControlNo(carrierSlipSgwCdMap.get(key).getControlNo());
				mCarrierSlipSgw.setAddDt(carrierSlipSgwCdMap.get(key).getAddDt());
				mCarrierSlipSgw.setAddUser(carrierSlipSgwCdMap.get(key).getAddUser());
				mCarrierSlipSgw.setAddProcess(carrierSlipSgwCdMap.get(key).getAddProcess());
				mCarrierSlipSgw.setUpdDt(carrierSlipSgwCdMap.get(key).getUpdDt());
				mCarrierSlipSgw.setUpdUser(carrierSlipSgwCdMap.get(key).getUpdUser());
				mCarrierSlipSgw.setUpdProcess(carrierSlipSgwCdMap.get(key).getUpdProcess());
			} else {
				// 一致するデータがない場合
				mCarrierSlipSgw.setCarrierSlipSgwId(null);
				mCarrierSlipSgw.setDelFlg("0");
			}
		}

		carrierSlipSgwMasterDto.data.carrierSlipSgwList = mCarrierSlipSgwoDtoMapper.mappingToDtoList(mCarrierSlipSgwList);
		return carrierSlipSgwMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・佐川送り状マスタDTOをキーに佐川送り状マスタデータ取り出し
	 * </pre>
	 * @param carrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
	 * @return CarrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CarrierSlipSgwMasterDto search(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) throws IOException {
		CarrierSlipSgwMasterDto carrierSlipSgwDto = new CarrierSlipSgwMasterDto();

		// Entity変換
		MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper();
		MCarrierSlipSgw carrierSlipSgw = mapper.mappingToEntity(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch);

		//センタID取得
		String centerCd = carrierSlipSgw.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		carrierSlipSgw.setCenterId(mCenter.getCenterId());

		// 検索
		List<MCarrierSlipSgw> page = carrierSlipSgwMasterSelectLogic.select(carrierSlipSgw, carrierSlipSgwMasterDto.paging, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MCarrierSlipSgwDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		carrierSlipSgwDto.data.carrierSlipSgwList = list;
//		2016.02.18 Pan ページング ※3 Start
		carrierSlipSgwDto.paging = carrierSlipSgwMasterDto.paging;
//		2016.02.18 Pan ページング ※3 End

		return carrierSlipSgwDto;
	}

//2016.03.08 Zhang 一覧編集 ※4 Start
//	/**
//	 * <h2>入力チェック。</h2>
//	 * <pre>
//	 * 登録データのチェックを行う。
//	 *
//	 * データチェックはsetupInputCheck(List)の結果で判定。
//	 * </pre>
//	 * @param carrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
//	 * @return StatusDto 処理結果DTO
//	 */
//	@POST
//	@Path("/inputCheck")
//	public StatusDto inputCheck(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {
//		this.setupInputCheck(carrierSlipSgwMasterDto);
//
//		if (getErrorManager().size() > 0) {
//			// 処理中止
//			return null;
//		}
//		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
//		return null;
//	}

//	/**
//	 * <h2>佐川送り状マスタ登録。</h2>
//	 * <pre>
//	 * データの登録・更新処理。
//	 * エラーがない場合は、データベースに佐川送り状マスタデータを登録し、完了メッセージを設定する。
//	 *
//	 * データチェックはsetupInputCheck(List)の結果で判定。
//	 *
//	 * 登録データに次の値を設定する。
//	 * ・センタID
//	 * </pre>
//	 * @param carrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
//	 * @return StatusDto 処理結果DTO
//	 */
//	@POST
//	@Path("/register")
//	public StatusDto register(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {
//		// Entity変換
//		MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper();
//		List<MCarrierSlipSgw> carrierSlipSgwList = mapper.mappingToEntityList(carrierSlipSgwMasterDto.data.carrierSlipSgwList);
//
//		MCarrierSlipSgwDtoMapper mapperhead = new MCarrierSlipSgwDtoMapper();
//		MCarrierSlipSgw carrierSlipSgwhead = mapperhead.mappingToEntity(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch);
//
//		this.setupInputCheck(carrierSlipSgwMasterDto);
//		// 結果判定
//		if (0 < getErrorManager().size()) {
//			return null;
//		}
//
//		//センタID取得
//		MCenter mCenter = new MCenter();
//		mCenter.setCenterCd(carrierSlipSgwhead.getMCenter().getCenterCd());
//		mCenter = centerLogic.getUkEntity(mCenter);
//
//		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
//		List<MCarrierSlipSgw> insertList = new ArrayList<>();
//
//		List<MCarrierSlipSgw> updateList = new ArrayList<>();
//
//		for (MCarrierSlipSgw mCarrierSlipSgw : carrierSlipSgwList) {
//			if (mCarrierSlipSgw.getCarrierSlipSgwId() == null) {
//				mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
//				insertList.add(mCarrierSlipSgw);
//				// 登録
//				//				carrierSlipSgwMasterInsertLogic.insert(mCarrierSlipSgw, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_INSERT_FAILED));
//			} else {
//				updateList.add(mCarrierSlipSgw);
//				// 修正・削除
//				//				carrierSlipSgwMasterUpdateLogic.update(mCarrierSlipSgw, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_UPDATE_FAILED));
//			}
//		}
//
//		if (!insertList.isEmpty()) {
//			// 登録
//			carrierSlipSgwMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_INSERT_FAILED));
//		}
//
//		if (!updateList.isEmpty()) {
//			// 修正・削除
//			carrierSlipSgwMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_INSERT_FAILED));
//		}
//		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
//		// 結果判定
//		if (0 < getErrorManager().size()) {
//			return null;
//		}
//		// 完了メッセージの設定
//		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
//		return null;
//	}

//	/**
//	 * <h2>チェック処理。</h2>
//	 * <pre>
//	 * データのチェックを行う。
//	 * </pre>
//	 * @param mCarrierSlipSgwList 佐川送り状マスタ画面List
//	 * @return ResultSetupData 結果
//	 */
//	private StatusDto setupInputCheck(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {
//		// 登録されていないセンタがあるか
//		MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper();
//		List<MCarrierSlipSgw> mCarrierSlipSgwList = mapper.mappingToEntityList(carrierSlipSgwMasterDto.data.carrierSlipSgwList);
//
//		MCarrierSlipSgwDtoMapper mapperhead = new MCarrierSlipSgwDtoMapper();
//		MCarrierSlipSgw carrierSlipSgwhead = mapperhead.mappingToEntity(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch);
//
//		int rowIndex = -1;
//
//		//センタID取得
//		MCenter mCenter = new MCenter();
//		mCenter.setCenterCd(carrierSlipSgwhead.getMCenter().getCenterCd());
//		mCenter = centerLogic.getUkEntity(mCenter);
//
//		// チェック処理
//		for (MCarrierSlipSgw mCarrierSlipSgw : mCarrierSlipSgwList) {
//			rowIndex++;
//
//			// 登録の場合
//			if (mCarrierSlipSgw.getCarrierSlipSgwId() == null) {
//				carrierSlipSgwhead.getMCenter().getCenterCd();
//				mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
//			}
//
//			// 登録の場合
//			if (mCarrierSlipSgw.getCarrierSlipSgwId() == null) {
//				// センタIDとデータ種別重複チェック
//				carrierSlipSgwLogic.checkCenterIdInsert(mCarrierSlipSgw,
//						errRetSts(errRetSts(StatusCode.CARRIER_SLIP_SGW_TGATYPE_DUPLICATE), StatusCode.CARRIER_SLIP_SGW_TGATYPE_DUPLICATE, rowIndex));
//
//				// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
//
//				//郵便番号マスタ存在チェック
//				if (mCarrierSlipSgw.getSlipClientZipCd() != null && !mCarrierSlipSgw.getSlipClientZipCd().equals("")) {
//					MZip zip = new MZip();
//					zip.setZipCd(mCarrierSlipSgw.getSlipClientZipCd());
//					boolean isError = zipLogic.checkZipCd(zip, null);
//					if (isError) {
//						getErrorManager().add(new ErrorStatus(StatusCode.ZIP_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
//					}
//				}
//			} else {
//				// 「未削除」場合
//				if (!mCarrierSlipSgw.getDelFlg().equals("1")) {
//					// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
//
//					//郵便番号マスタ存在チェック
//					if (mCarrierSlipSgw.getSlipClientZipCd() != null && !mCarrierSlipSgw.getSlipClientZipCd().equals("")) {
//						MZip zip = new MZip();
//						zip.setZipCd(mCarrierSlipSgw.getSlipClientZipCd());
//						boolean isError = zipLogic.checkZipCd(zip, null);
//						if (isError) {
//							getErrorManager().add(new ErrorStatus(StatusCode.ZIP_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
//						}
//					}
//				}
//			}
//		}
//
//		// 結果の設定
//		return null;
//
//	}
//2016.03.08 Zhang 一覧編集 ※4 End
}
