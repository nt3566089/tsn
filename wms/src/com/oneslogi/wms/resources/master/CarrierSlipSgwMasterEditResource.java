package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MCarrierSlipSgwDto;
import com.oneslogi.base.dbflute.dtomapper.MCarrierSlipSgwDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CarrierSlipSgwMasterDto;
import com.oneslogi.wms.logic.common.CarrierSlipSgwLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ZipLogic;
import com.oneslogi.wms.logic.master.CarrierSlipSgwMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierSlipSgwMasterSelectLogic;
import com.oneslogi.wms.logic.master.CarrierSlipSgwMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 佐川送り状マスタ(編集)画面のリソースクラス。
 */
@Path("/master/carrierSlipSgwMasterEdit")
public class CarrierSlipSgwMasterEditResource extends AbstractWmsResource {

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
		 * 佐川送り状マスタ(編集)登録異常
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
		/**
		 * 辞書未存在異常
		 */
		protected static final int DICT_NOT_FOUND_ERROR = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierSlipSgwMasterSelectLogic carrierSlipSgwMasterSelectLogic;
	@Inject
	private CarrierSlipSgwMasterInsertLogic carrierSlipSgwMasterInsertLogic;
	@Inject
	private CarrierSlipSgwMasterUpdateLogic carrierSlipSgwMasterUpdateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CarrierSlipSgwLogic carrierSlipSgwLogic;
//	2016.03.11 Zhang 一覧編集 ※4  Start
//	@Inject
//	private MCarrierSlipSgwBhv mCarrierSlipSgwBhv;
//	2016.03.11 Zhang 一覧編集 ※4  End

	// [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
	@Inject
	private ZipLogic zipLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierSlipSgwMasterDto 佐川送り状マスタ(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CarrierSlipSgwMasterDto initNew() {
		MCarrierSlipSgwDto mDto = new MCarrierSlipSgwDto();
		CarrierSlipSgwMasterDto dto = new CarrierSlipSgwMasterDto();
		dto.data.carrierSlipSgwList.add(mDto);
		return dto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @param carrierSlipSgwId  郵便番号CD
	 * @return MStopListDto 郵便番号マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public CarrierSlipSgwMasterDto initUpdate(@QueryParam("carrierSlipSgwId") long carrierSlipSgwId) {

		CarrierSlipSgwMasterDto carrierMasterEditDto = new CarrierSlipSgwMasterDto();

		MCarrierSlipSgw carrierSlipSgw = carrierSlipSgwMasterSelectLogic.selectById(carrierSlipSgwId, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_GET_FAILED));

		if (getErrorManager().size() > 0) {
			// エラーあり
			return carrierMasterEditDto;
		}

		// ===== 画面用DTO作成 =====
		MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper();
		MCarrierSlipSgwDto carrierDto = mapper.mappingToDto(carrierSlipSgw);

		List<MCarrierSlipSgwDto> carrierSlipSgwList = new ArrayList<MCarrierSlipSgwDto>();
		carrierSlipSgwList.add(carrierDto);
		carrierMasterEditDto.data.carrierSlipSgwList = carrierSlipSgwList;

		return carrierMasterEditDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 * </pre>
	 * @param carrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {
		this.setupInputCheck(carrierSlipSgwMasterDto);

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>佐川送り状マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに佐川送り状マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param carrierSlipSgwMasterDto 佐川送り状マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {
		// Entity変換
//		MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper();
//		List<MCarrierSlipSgw> carrierSlipSgwList = mapper.mappingToEntityList(carrierSlipSgwMasterDto.data.carrierSlipSgwList);

		MCarrierSlipSgwDtoMapper mapperhead = new MCarrierSlipSgwDtoMapper();
		MCarrierSlipSgw mCarrierSlipSgw = mapperhead.mappingToEntity(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch);

		this.setupInputCheck(carrierSlipSgwMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mCarrierSlipSgw.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

//		for (MCarrierSlipSgw mCarrierSlipSgw : carrierSlipSgwList) {
			if (mCarrierSlipSgw.getCarrierSlipSgwId() == null) {
				mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
				// 登録
				carrierSlipSgwMasterInsertLogic.insert(mCarrierSlipSgw, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_INSERT_FAILED));
			} else {
				// 修正・削除
				carrierSlipSgwMasterUpdateLogic.update(mCarrierSlipSgw, errRetSts(StatusCode.CARRIER_SLIP_SGW_MASTER_UPDATE_FAILED));
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
	 * @param mCarrierSlipSgwList 佐川送り状マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(CarrierSlipSgwMasterDto carrierSlipSgwMasterDto) {
		// 登録されていないセンタがあるか
//		MCarrierSlipSgwDtoMapper mapper = new MCarrierSlipSgwDtoMapper();
//		List<MCarrierSlipSgw> mCarrierSlipSgwList = mapper.mappingToEntityList(carrierSlipSgwMasterDto.data.carrierSlipSgwList);

		MCarrierSlipSgwDtoMapper mapperhead = new MCarrierSlipSgwDtoMapper();
		MCarrierSlipSgw mCarrierSlipSgw = mapperhead.mappingToEntity(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch);

		int rowIndex = -1;

		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(carrierSlipSgwMasterDto.data.carrierSlipSgwMasterSearch.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		// チェック処理
//		for (MCarrierSlipSgw mCarrierSlipSgw : mCarrierSlipSgwList) {
		rowIndex++;

		// 登録の場合
		if (mCarrierSlipSgw.getCarrierSlipSgwId() == null) {
			mCarrierSlipSgw.getMCenter().getCenterCd();
			mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
		}

		// 登録の場合
		if (mCarrierSlipSgw.getCarrierSlipSgwId() == null) {
			// センタIDとデータ種別重複チェック
			carrierSlipSgwLogic.checkCenterIdInsert(mCarrierSlipSgw,
					errRetSts(errRetSts(StatusCode.CARRIER_SLIP_SGW_TGATYPE_DUPLICATE), StatusCode.CARRIER_SLIP_SGW_TGATYPE_DUPLICATE, rowIndex));
			//郵便番号マスタ存在チェック
			if(mCarrierSlipSgw.getSlipClientZipCd() != null && !mCarrierSlipSgw.getSlipClientZipCd().equals("")){
				MZip zip = new MZip();
				zip.setZipCd(mCarrierSlipSgw.getSlipClientZipCd());
				boolean isError = zipLogic.checkZipCd(zip, null);
				if (isError) {
					getErrorManager().add(new ErrorStatus(StatusCode.ZIP_CODE_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.ZIP_CODE_NOT_FOUND_ERROR);
				}
			}
		} else {
			// 「未削除」場合
			if (!mCarrierSlipSgw.getDelFlg().equals("1")) {
				//郵便番号マスタ存在チェック
				if(mCarrierSlipSgw.getSlipClientZipCd() != null && !mCarrierSlipSgw.getSlipClientZipCd().equals("")){
					MZip zip = new MZip();
					zip.setZipCd(mCarrierSlipSgw.getSlipClientZipCd());
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
