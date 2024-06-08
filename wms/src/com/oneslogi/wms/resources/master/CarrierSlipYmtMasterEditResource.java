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
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYmtCB;
import com.oneslogi.base.dbflute.dto.MCarrierSlipYmtDto;
import com.oneslogi.base.dbflute.dtomapper.MCarrierSlipYmtDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYmtBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CarrierSlipYmtMasterDto;
import com.oneslogi.wms.logic.common.CarrierSlipYmtLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYmtMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYmtMasterSelectLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYmtMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ヤマト送り状マスタ(編集)画面のリソースクラス。
 */
@Path("/master/carrierSlipYmtMasterEdit")
public class CarrierSlipYmtMasterEditResource extends AbstractWmsResource {

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
		protected static final int CARRIER_SLIP_YMT_MASTER_GET_FAILED = 2;
		/**
		 * ヤマト送り状マスタ(編集)登録異常
		 */
		protected static final int CARRIER_SLIP_YMT_MASTER_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int CARRIER_SLIP_YMT_MASTER_UPDATE_FAILED = 4;
		/**
		 * データ種別重複異常
		 */
		protected static final int CARRIER_SLIP_YMT_TGATYPE_DUPLICATE = 5;
		// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
		/**
		 * 郵便番号で存在しない異常
		 */
		protected static final int ZIP_CODE_NOT_FOUND_ERROR = 7;
		/**
		 * 辞書未存在異常
		 */
		protected static final int DICT_NOT_FOUND_ERROR = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierSlipYmtMasterSelectLogic carrierSlipYmtMasterSelectLogic;
	@Inject
	private CarrierSlipYmtMasterInsertLogic carrierSlipYmtMasterInsertLogic;
	@Inject
	private CarrierSlipYmtMasterUpdateLogic carrierSlipYmtMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CarrierSlipYmtLogic carrierSlipYmtLogic;
	@Inject
	private MCarrierSlipYmtBhv mCarrierSlipYmtBhv;
	// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
	@Inject
	private ZipLogic zipLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierSlipYmtMasterDto ヤマト送り状マスタ(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CarrierSlipYmtMasterDto initNew() {
		MCarrierSlipYmtDto mDto = new MCarrierSlipYmtDto();
		CarrierSlipYmtMasterDto dto = new CarrierSlipYmtMasterDto();
		dto.data.carrierSlipYmtList.add(mDto);
		return dto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 *
	 * @param carrierSlipYmtId  郵便番号CD
	 * @return MStopListDto 郵便番号マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public CarrierSlipYmtMasterDto initUpdate(@QueryParam("carrierSlipYmtId") long carrierSlipYmtId) {

		CarrierSlipYmtMasterDto carrierMasterEditDto = new CarrierSlipYmtMasterDto();

		MCarrierSlipYmt carrierSlipYmt = carrierSlipYmtMasterSelectLogic.selectById(carrierSlipYmtId, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_GET_FAILED));

		if (getErrorManager().size() > 0) {
			// エラーあり
			return carrierMasterEditDto;
		}

		// ===== 画面用DTO作成 =====
		MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper();
		MCarrierSlipYmtDto carrierDto = mapper.mappingToDto(carrierSlipYmt);

		List<MCarrierSlipYmtDto> carrierSlipYmtList = new ArrayList<MCarrierSlipYmtDto>();
		carrierSlipYmtList.add(carrierDto);
		carrierMasterEditDto.data.carrierSlipYmtList = carrierSlipYmtList;

		return carrierMasterEditDto;
	}

	/**
	 * <h2>ヤマト送り状マスタデータ取得。</h2>
	 * <pre>
	 * ヤマト送り状マスタデータの一括取得処理
	 * </pre>
	 * @param carrierSlipYmtMasterDto ヤマト送り状マスタ一括取込画面用DTO
	 * @return CarrierSlipYmtMasterDto ヤマト送り状マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public CarrierSlipYmtMasterDto getMasterData(CarrierSlipYmtMasterDto carrierSlipYmtMasterDto) {

		// データが存在しない場合
		if (carrierSlipYmtMasterDto.data.carrierSlipYmtList.size() == 0) {
			return carrierSlipYmtMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MCarrierSlipYmtDtoMapper mCarrierSlipYmtoDtoMapper = new MCarrierSlipYmtDtoMapper();
		MCarrierSlipYmt searchCondition = mCarrierSlipYmtoDtoMapper.mappingToEntity(carrierSlipYmtMasterDto.data.carrierSlipYmtMasterSearch);

		//センタCD取得
		String centerCd = searchCondition.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 一覧項目
		List<MCarrierSlipYmt> mCarrierSlipYmtList = mCarrierSlipYmtoDtoMapper.mappingToEntityList(carrierSlipYmtMasterDto.data.carrierSlipYmtList);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MCarrierSlipYmt> carrierSlipYmtCdMap = new HashMap<String, MCarrierSlipYmt>();

		// 一覧件数分ループ(Map作成)
		for (MCarrierSlipYmt carrierSlipYmt : mCarrierSlipYmtList) {
			//チェック用配列に格納
			if (!CU.isNullOrEmpty(carrierSlipYmt.getTagType()) && !carrierSlipYmtCdMap.containsKey(carrierSlipYmt.getTagType())) {
				carrierSlipYmtCdMap.put(carrierSlipYmt.getTagType(), null);
			}
		}

		// 初期値設定
		List<MCarrierSlipYmt> mCarrierSlipYmtDbList = null;

		// ヤマト送り状マスタ一括取得
		if (carrierSlipYmtCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			//検索条件設定
			MCarrierSlipYmtCB cbMCarrierSlipYmt = mCarrierSlipYmtBhv.newConditionBean();
			cbMCarrierSlipYmt.setupSelect_MCenter();
			cbMCarrierSlipYmt.query().setTagType_InScope(carrierSlipYmtCdMap.keySet());

			//ヤマト送り状マスタ取得
			mCarrierSlipYmtDbList = mCarrierSlipYmtBhv.selectList(cbMCarrierSlipYmt);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得したヤマト送り状データをMap化
		carrierSlipYmtCdMap.clear();
		if (mCarrierSlipYmtDbList != null) {
			for (MCarrierSlipYmt mCarrierSlipYmt : mCarrierSlipYmtDbList) {
				carrierSlipYmtCdMap.put(mCarrierSlipYmt.getTagType() + "\t" + mCarrierSlipYmt.getCenterId(), mCarrierSlipYmt);
			}
		}

		for (MCarrierSlipYmt mCarrierSlipYmt : mCarrierSlipYmtList) {

			// データ種別とセンタIDをつなげkeyとする
			String key = mCarrierSlipYmt.getTagType() + "\t" + mCenter.getCenterId();
			mCarrierSlipYmt.setCenterId(mCenter.getCenterId());
			// CarrierSlipYmtCd一致確認
			if (carrierSlipYmtCdMap.containsKey(key)) {
				// 一致するデータがある場合
				mCarrierSlipYmt.setCarrierSlipYmtId(carrierSlipYmtCdMap.get(key).getCarrierSlipYmtId());
				mCarrierSlipYmt.setVersionNo(carrierSlipYmtCdMap.get(key).getVersionNo());
				mCarrierSlipYmt.setControlNo(carrierSlipYmtCdMap.get(key).getControlNo());
				mCarrierSlipYmt.setAddDt(carrierSlipYmtCdMap.get(key).getAddDt());
				mCarrierSlipYmt.setAddUser(carrierSlipYmtCdMap.get(key).getAddUser());
				mCarrierSlipYmt.setAddProcess(carrierSlipYmtCdMap.get(key).getAddProcess());
				mCarrierSlipYmt.setUpdDt(carrierSlipYmtCdMap.get(key).getUpdDt());
				mCarrierSlipYmt.setUpdUser(carrierSlipYmtCdMap.get(key).getUpdUser());
				mCarrierSlipYmt.setUpdProcess(carrierSlipYmtCdMap.get(key).getUpdProcess());
			} else {
				// 一致するデータがない場合
				mCarrierSlipYmt.setCarrierSlipYmtId(null);
				mCarrierSlipYmt.setDelFlg("0");
			}
		}

		carrierSlipYmtMasterDto.data.carrierSlipYmtList = mCarrierSlipYmtoDtoMapper.mappingToDtoList(mCarrierSlipYmtList);
		return carrierSlipYmtMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・ヤマト送り状マスタDTOをキーにヤマト送り状マスタデータ取り出し
	 * </pre>
	 * @param carrierSlipYmtMasterDto ヤマト送り状マスタ画面用DTO
	 * @return CarrierSlipYmtMasterDto ヤマト送り状マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CarrierSlipYmtMasterDto search(CarrierSlipYmtMasterDto carrierSlipYmtMasterDto) throws IOException {
		CarrierSlipYmtMasterDto carrierSlipYmtDto = new CarrierSlipYmtMasterDto();

		// Entity変換
		MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper();
		MCarrierSlipYmt carrierSlipYmt = mapper.mappingToEntity(carrierSlipYmtMasterDto.data.carrierSlipYmtMasterSearch);

		//センタID取得
		String centerCd = carrierSlipYmt.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		carrierSlipYmt.setCenterId(mCenter.getCenterId());

		// 検索
		List<MCarrierSlipYmt> page = carrierSlipYmtMasterSelectLogic.select(carrierSlipYmt, carrierSlipYmtMasterDto.paging, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MCarrierSlipYmtDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		carrierSlipYmtDto.data.carrierSlipYmtList = list;
		carrierSlipYmtDto.paging = carrierSlipYmtMasterDto.paging;
		return carrierSlipYmtDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 * </pre>
	 * @param carrierSlipYmtMasterDto ヤマト送り状マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CarrierSlipYmtMasterDto carrierSlipYmtMasterDto) {
		this.setupInputCheck(carrierSlipYmtMasterDto);

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>ヤマト送り状マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにヤマト送り状マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param carrierSlipYmtMasterDto ヤマト送り状マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CarrierSlipYmtMasterDto carrierSlipYmtMasterDto) {
		// Entity変換
//		MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper();
//		List<MCarrierSlipYmt> carrierSlipYmtList = mapper.mappingToEntityList(carrierSlipYmtMasterDto.data.carrierSlipYmtList);

		MCarrierSlipYmtDtoMapper mapperhead = new MCarrierSlipYmtDtoMapper();
		MCarrierSlipYmt mCarrierSlipYmt = mapperhead.mappingToEntity(carrierSlipYmtMasterDto.data.carrierSlipYmtMasterSearch);

		this.setupInputCheck(carrierSlipYmtMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mCarrierSlipYmt.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

//		for (MCarrierSlipYmt mCarrierSlipYmt : carrierSlipYmtList) {
			if (mCarrierSlipYmt.getCarrierSlipYmtId() == null) {
				mCarrierSlipYmt.setCenterId(mCenter.getCenterId());
				// 登録
				carrierSlipYmtMasterInsertLogic.insert(mCarrierSlipYmt, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_INSERT_FAILED));
			} else {
				// 修正・削除
				carrierSlipYmtMasterUpdateLogic.update(mCarrierSlipYmt, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_UPDATE_FAILED));
			}
//		}

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * </pre>
	 * @param mCarrierSlipYmtList ヤマト送り状マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(CarrierSlipYmtMasterDto carrierSlipYmtMasterDto) {
		// 登録されていないセンタがあるか
//		MCarrierSlipYmtDtoMapper mapper = new MCarrierSlipYmtDtoMapper();
//		List<MCarrierSlipYmt> mCarrierSlipYmtList = mapper.mappingToEntityList(carrierSlipYmtMasterDto.data.carrierSlipYmtList);

		MCarrierSlipYmtDtoMapper mapperhead = new MCarrierSlipYmtDtoMapper();
		MCarrierSlipYmt mCarrierSlipYmt = mapperhead.mappingToEntity(carrierSlipYmtMasterDto.data.carrierSlipYmtMasterSearch);

		int rowIndex = -1;

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(carrierSlipYmtMasterDto.data.carrierSlipYmtMasterSearch.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// チェック処理
//		for (MCarrierSlipYmt mCarrierSlipYmt : mCarrierSlipYmtList) {
		rowIndex++;

		// 登録の場合
		if (mCarrierSlipYmt.getCarrierSlipYmtId() == null) {
			mCarrierSlipYmt.getMCenter().getCenterCd();
			mCarrierSlipYmt.setCenterId(mCenter.getCenterId());
		}

		// 登録の場合
		if (mCarrierSlipYmt.getCarrierSlipYmtId() == null) {
			// センタIDとデータ種別重複チェック
			carrierSlipYmtLogic.checkCenterIdInsert(mCarrierSlipYmt,
					errRetSts(errRetSts(StatusCode.CARRIER_SLIP_YMT_TGATYPE_DUPLICATE), StatusCode.CARRIER_SLIP_YMT_TGATYPE_DUPLICATE, rowIndex));

			//郵便番号マスタ存在チェック
			if(mCarrierSlipYmt.getSlipClientZipCd() != null && !mCarrierSlipYmt.getSlipClientZipCd().equals("")){
				MZip zip = new MZip();
				zip.setZipCd(mCarrierSlipYmt.getSlipClientZipCd());
				boolean isError = zipLogic.checkZipCd(zip, null);
				if (isError) {
					getErrorManager().add(new ErrorStatus(StatusCode.ZIP_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
				}
			}
		} else {
			// 「未削除」場合
			if (!mCarrierSlipYmt.getDelFlg().equals("1")) {

				//郵便番号マスタ存在チェック
				if(mCarrierSlipYmt.getSlipClientZipCd() != null && !mCarrierSlipYmt.getSlipClientZipCd().equals("")){
					MZip zip = new MZip();
					zip.setZipCd(mCarrierSlipYmt.getSlipClientZipCd());
					boolean isError = zipLogic.checkZipCd(zip, null);
					if (isError) {
						getErrorManager().add(new ErrorStatus(StatusCode.ZIP_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
					}
				}
			}
		}
//		}

		// 結果の設定
		return null;

	}
}
