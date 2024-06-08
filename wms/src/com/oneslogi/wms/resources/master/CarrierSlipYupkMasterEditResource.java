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

import com.oneslogi.base.dbflute.cbean.MCarrierSlipYupkCB;
import com.oneslogi.base.dbflute.dto.MCarrierSlipYupkDto;
import com.oneslogi.base.dbflute.dtomapper.MCarrierSlipYupkDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCarrierSlipYupkBhv;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CarrierSlipYupkMasterDto;
import com.oneslogi.wms.logic.common.CarrierSlipYupkLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYupkMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYupkMasterSelectLogic;
import com.oneslogi.wms.logic.master.CarrierSlipYupkMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ゆうパック送り状マスタ(編集)画面のリソースクラス。
 */
@Path("/master/carrierSlipYupkMasterEdit")
public class CarrierSlipYupkMasterEditResource extends AbstractWmsResource {

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
		 * ゆうパック送り状マスタ(編集)登録異常
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
	private CarrierSlipYupkMasterSelectLogic carrierSlipYupkMasterSelectLogic;
	@Inject
	private CarrierSlipYupkMasterInsertLogic carrierSlipYupkMasterInsertLogic;
	@Inject
	private CarrierSlipYupkMasterUpdateLogic carrierSlipYupkMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CarrierSlipYupkLogic carrierSlipYupkLogic;
	@Inject
	private MCarrierSlipYupkBhv mCarrierSlipYupkBhv;
	// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
	@Inject
	private ZipLogic zipLogic;
	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierSlipYupkMasterDto ゆうパック送り状マスタ(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CarrierSlipYupkMasterDto initNew() {
		MCarrierSlipYupkDto mDto = new MCarrierSlipYupkDto();
		CarrierSlipYupkMasterDto dto = new CarrierSlipYupkMasterDto();
		dto.data.carrierSlipYupkList.add(mDto);
		return dto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return MStopListDto 郵便番号マスタメンテナンス(編集)画面用DTO
	 * @param carrierSlipYupkId  郵便番号CD
	 */
	@GET
	@Path("/initUpdate")
	public CarrierSlipYupkMasterDto initUpdate(@QueryParam("carrierSlipYupkId") long carrierSlipYupkId) {

		CarrierSlipYupkMasterDto carrierMasterEditDto = new CarrierSlipYupkMasterDto();

		MCarrierSlipYupk carrierSlipYupk = carrierSlipYupkMasterSelectLogic.selectById(carrierSlipYupkId, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_GET_FAILED));

		if (getErrorManager().size() > 0) {
			// エラーあり
			return carrierMasterEditDto;
		}

		// ===== 画面用DTO作成 =====
		MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper();
		MCarrierSlipYupkDto carrierDto = mapper.mappingToDto(carrierSlipYupk);

		List<MCarrierSlipYupkDto> carrierSlipYupkList = new ArrayList<MCarrierSlipYupkDto>();
		carrierSlipYupkList.add(carrierDto);
		carrierMasterEditDto.data.carrierSlipYupkList = carrierSlipYupkList;

		return carrierMasterEditDto;
	}

	/**
	 * <h2>ゆうパック送り状マスタデータ取得。</h2>
	 * <pre>
	 * ゆうパック送り状マスタデータの一括取得処理
	 * </pre>
	 * @param carrierSlipYupkMasterDto ゆうパック送り状マスタ一括取込画面用DTO
	 * @return CarrierSlipYupkMasterDto ゆうパック送り状マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public CarrierSlipYupkMasterDto getMasterData(CarrierSlipYupkMasterDto carrierSlipYupkMasterDto) {

		// データが存在しない場合
		if (carrierSlipYupkMasterDto.data.carrierSlipYupkList.size() == 0) {
			return carrierSlipYupkMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MCarrierSlipYupkDtoMapper mCarrierSlipYupkoDtoMapper = new MCarrierSlipYupkDtoMapper();
		MCarrierSlipYupk searchCondition = mCarrierSlipYupkoDtoMapper.mappingToEntity(carrierSlipYupkMasterDto.data.carrierSlipYupkMasterSearch);

		//センタCD取得
		String centerCd = searchCondition.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		// 一覧項目
		List<MCarrierSlipYupk> mCarrierSlipYupkList = mCarrierSlipYupkoDtoMapper.mappingToEntityList(carrierSlipYupkMasterDto.data.carrierSlipYupkList);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MCarrierSlipYupk> carrierSlipYupkCdMap = new HashMap<String, MCarrierSlipYupk>();

		// 一覧件数分ループ(Map作成)
		for (MCarrierSlipYupk carrierSlipYupk : mCarrierSlipYupkList) {
			//チェック用配列に格納
			if (!CU.isNullOrEmpty(carrierSlipYupk.getTagType()) && !carrierSlipYupkCdMap.containsKey(carrierSlipYupk.getTagType())) {
				carrierSlipYupkCdMap.put(carrierSlipYupk.getTagType(), null);
			}
		}

		// 初期値設定
		List<MCarrierSlipYupk> mCarrierSlipYupkDbList = null;

		// ゆうパック送り状マスタ一括取得
		if (carrierSlipYupkCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			//検索条件設定
			MCarrierSlipYupkCB cbMCarrierSlipYupk = mCarrierSlipYupkBhv.newConditionBean();
			cbMCarrierSlipYupk.setupSelect_MCenter();
			cbMCarrierSlipYupk.query().setTagType_InScope(carrierSlipYupkCdMap.keySet());

			//ゆうパック送り状マスタ取得
			mCarrierSlipYupkDbList = mCarrierSlipYupkBhv.selectList(cbMCarrierSlipYupk);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得したゆうパック送り状データをMap化
		carrierSlipYupkCdMap.clear();
		if (mCarrierSlipYupkDbList != null) {
			for (MCarrierSlipYupk mCarrierSlipYupk : mCarrierSlipYupkDbList) {
				carrierSlipYupkCdMap.put(mCarrierSlipYupk.getTagType() + "\t" + mCarrierSlipYupk.getCenterId(), mCarrierSlipYupk);
			}
		}

		for (MCarrierSlipYupk mCarrierSlipYupk : mCarrierSlipYupkList) {

			// データ種別とセンタIDをつなげkeyとする
			String key = mCarrierSlipYupk.getTagType() + "\t" + mCenter.getCenterId();
			mCarrierSlipYupk.setCenterId(mCenter.getCenterId());
			// CarrierSlipYupkCd一致確認
			if (carrierSlipYupkCdMap.containsKey(key)) {
				// 一致するデータがある場合
				mCarrierSlipYupk.setCarrierSlipYupkId(carrierSlipYupkCdMap.get(key).getCarrierSlipYupkId());
				mCarrierSlipYupk.setVersionNo(carrierSlipYupkCdMap.get(key).getVersionNo());
				mCarrierSlipYupk.setControlNo(carrierSlipYupkCdMap.get(key).getControlNo());
				mCarrierSlipYupk.setAddDt(carrierSlipYupkCdMap.get(key).getAddDt());
				mCarrierSlipYupk.setAddUser(carrierSlipYupkCdMap.get(key).getAddUser());
				mCarrierSlipYupk.setAddProcess(carrierSlipYupkCdMap.get(key).getAddProcess());
				mCarrierSlipYupk.setUpdDt(carrierSlipYupkCdMap.get(key).getUpdDt());
				mCarrierSlipYupk.setUpdUser(carrierSlipYupkCdMap.get(key).getUpdUser());
				mCarrierSlipYupk.setUpdProcess(carrierSlipYupkCdMap.get(key).getUpdProcess());
			} else {
				// 一致するデータがない場合
				mCarrierSlipYupk.setCarrierSlipYupkId(null);
				mCarrierSlipYupk.setDelFlg("0");
			}
		}

		carrierSlipYupkMasterDto.data.carrierSlipYupkList = mCarrierSlipYupkoDtoMapper.mappingToDtoList(mCarrierSlipYupkList);
		return carrierSlipYupkMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・ゆうパック送り状マスタDTOをキーにゆうパック送り状マスタデータ取り出し
	 * </pre>
	 * @param carrierSlipYupkMasterDto ゆうパック送り状マスタ画面用DTO
	 * @return carrierSlipYupkMasterDto ゆうパック送り状マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CarrierSlipYupkMasterDto search(CarrierSlipYupkMasterDto carrierSlipYupkMasterDto) throws IOException {
		CarrierSlipYupkMasterDto carrierSlipYupkDto = new CarrierSlipYupkMasterDto();

		// Entity変換
		MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper();
		MCarrierSlipYupk carrierSlipYupk = mapper.mappingToEntity(carrierSlipYupkMasterDto.data.carrierSlipYupkMasterSearch);

		//センタID取得
		String centerCd = carrierSlipYupk.getMCenter().getCenterCd();
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		carrierSlipYupk.setCenterId(mCenter.getCenterId());

		// 検索
		List<MCarrierSlipYupk> page = carrierSlipYupkMasterSelectLogic.select(carrierSlipYupk, carrierSlipYupkMasterDto.paging, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MCarrierSlipYupkDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		carrierSlipYupkDto.data.carrierSlipYupkList = list;
		carrierSlipYupkDto.paging = carrierSlipYupkMasterDto.paging;
		return carrierSlipYupkDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 * </pre>
	 * @param carrierSlipYupkMasterDto ゆうパック送り状マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CarrierSlipYupkMasterDto carrierSlipYupkMasterDto) {
		this.setupInputCheck(carrierSlipYupkMasterDto);

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>ゆうパック送り状マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにゆうパック送り状マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param carrierSlipYupkMasterDto ゆうパック送り状マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CarrierSlipYupkMasterDto carrierSlipYupkMasterDto) {
		// Entity変換
//		MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper();
//		List<MCarrierSlipYupk> carrierSlipYupkList = mapper.mappingToEntityList(carrierSlipYupkMasterDto.data.carrierSlipYupkList);

		MCarrierSlipYupkDtoMapper mapperhead = new MCarrierSlipYupkDtoMapper();
		MCarrierSlipYupk mCarrierSlipYupk = mapperhead.mappingToEntity(carrierSlipYupkMasterDto.data.carrierSlipYupkMasterSearch);

		this.setupInputCheck(carrierSlipYupkMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mCarrierSlipYupk.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

//		for (MCarrierSlipYupk mCarrierSlipYupk : carrierSlipYupkList) {
			if (mCarrierSlipYupk.getCarrierSlipYupkId() == null) {
				mCarrierSlipYupk.setCenterId(mCenter.getCenterId());
				// 登録
				carrierSlipYupkMasterInsertLogic.insert(mCarrierSlipYupk, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_INSERT_FAILED));
			} else {
				// 修正・削除
				carrierSlipYupkMasterUpdateLogic.update(mCarrierSlipYupk, errRetSts(StatusCode.CARRIER_SLIP_YMT_MASTER_UPDATE_FAILED));
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
	 * @param mCarrierSlipYupkList ゆうパック送り状マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(CarrierSlipYupkMasterDto carrierSlipYupkMasterDto) {
		// 登録されていないセンタがあるか
//		MCarrierSlipYupkDtoMapper mapper = new MCarrierSlipYupkDtoMapper();
//		List<MCarrierSlipYupk> mCarrierSlipYupkList = mapper.mappingToEntityList(carrierSlipYupkMasterDto.data.carrierSlipYupkList);

		MCarrierSlipYupkDtoMapper mapperhead = new MCarrierSlipYupkDtoMapper();
		MCarrierSlipYupk mCarrierSlipYupk = mapperhead.mappingToEntity(carrierSlipYupkMasterDto.data.carrierSlipYupkMasterSearch);

		int rowIndex = -1;

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(carrierSlipYupkMasterDto.data.carrierSlipYupkMasterSearch.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// チェック処理
//		for (MCarrierSlipYupk mCarrierSlipYupk : mCarrierSlipYupkList) {
		rowIndex++;

		// 登録の場合
		if (mCarrierSlipYupk.getCarrierSlipYupkId() == null) {
			mCarrierSlipYupk.getMCenter().getCenterCd();
			mCarrierSlipYupk.setCenterId(mCenter.getCenterId());
		}

		// 登録の場合
		if (mCarrierSlipYupk.getCarrierSlipYupkId() == null) {
			// センタIDとデータ種別重複チェック
			carrierSlipYupkLogic.checkCenterIdInsert(mCarrierSlipYupk,
					errRetSts(errRetSts(StatusCode.CARRIER_SLIP_YMT_TGATYPE_DUPLICATE), StatusCode.CARRIER_SLIP_YMT_TGATYPE_DUPLICATE, rowIndex));

			//郵便番号マスタ存在チェック
			if(mCarrierSlipYupk.getSlipClientZipCd() != null && !mCarrierSlipYupk.getSlipClientZipCd().equals("")){
				MZip zip = new MZip();
				zip.setZipCd(mCarrierSlipYupk.getSlipClientZipCd());
				boolean isError = zipLogic.checkZipCd(zip, null);
				if (isError) {
					getErrorManager().add(new ErrorStatus(StatusCode.ZIP_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
				}
			}
		} else {
			// 「未削除」場合
			if (!mCarrierSlipYupk.getDelFlg().equals("1")) {

				//郵便番号マスタ存在チェック
				if(mCarrierSlipYupk.getSlipClientZipCd() != null && !mCarrierSlipYupk.getSlipClientZipCd().equals("")){
					MZip zip = new MZip();
					zip.setZipCd(mCarrierSlipYupk.getSlipClientZipCd());
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
