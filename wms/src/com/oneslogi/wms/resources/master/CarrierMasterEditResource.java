package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dtomapper.MBoxDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCarrierDtoMapper;
import com.oneslogi.base.dbflute.exentity.MBox;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierBox;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCommonCarrier;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsConst;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CarrierMasterEditDto;
import com.oneslogi.wms.logic.common.CarrierLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.CommonCarrierLogic;
import com.oneslogi.wms.logic.master.CarrierMasterInsertLogic;
import com.oneslogi.wms.logic.master.CarrierMasterSelectLogic;
import com.oneslogi.wms.logic.master.CarrierMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 運送業者マスタメンテナンス(編集)のリソースクラス。
 */
@Path("/master/carrierMasterEdit")
public class CarrierMasterEditResource extends AbstractWmsResource {

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
		 * 運送業者CD重複
		 */
		protected static final int CARRIER_CODE_DUPLICATE_ERROR = 2;
		/**
		 * 運送業者マスタメンテナンス(編集)データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int CARRIER_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CARRIER_MASTER_UPDATE_FAILED = 5;
		/**
		 * 運送業者マスタで未存在異常
		 */
		protected static final int COMMON_CARRIER_NOT_FOUND_ERROR = 6;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK_ERROR = 7;
		/**
		 * 荷材マスタ未存在異常
		 */
		protected static final int BOX_NOT_FOUND_ERROR = 8;


	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CarrierMasterSelectLogic selectLogic;
	@Inject
	private CarrierMasterUpdateLogic updateLogic;
	@Inject
	private CarrierLogic carrierLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CarrierMasterInsertLogic insertLogic;
	@Inject
	private CommonCarrierLogic commoncarrierLogic;

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
		CARRIER_CODE_DUPLICATE_ERROR,
		NOT_FOUND_DATA,
		CARRIER_MASTER_INSERT_FAILED,
		CARRIER_MASTER_UPDATE_FAILED,
		COMMON_CARRIER_NOT_FOUND,
		INPUT_CHECK_ERROR,
		BOX_NOT_FOUND
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CarrierMasterEditDto 運送業者マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CarrierMasterEditDto initNew() {
		CarrierMasterEditDto carrierMasterEditDto = new CarrierMasterEditDto();

		MBox mBox = new MBox();
		MCenter mcenetr = new MCenter();
		mcenetr.setCenterId(Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));
		mcenetr = centerLogic.getPkEntity(mcenetr);
		mBox.setMCenter(mcenetr);
		MCarrier mCarrier = new MCarrier();
		mCarrier.setCarrierId(0l);

		// [Ver3.0][#4748] 画面初期表示アベンド対応 2018.06.21 shimizu Start
		List<MBox> listBox = selectLogic.selectWihtCarrierboxList(mBox,mCarrier);
		// ===== ０件チェック =====
		if (listBox.size() == 0) {
			return carrierMasterEditDto;
		}
		// [Ver3.0][#4748] 画面初期表示アベンド対応 2018.06.21 shimizu End

		MBoxDtoMapper boxMapper = new MBoxDtoMapper();
		carrierMasterEditDto.data.body = boxMapper.mappingToDtoList(listBox);

		// 商品マスタ登録画面用DTOを作成
		return carrierMasterEditDto;

	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・運送業者マスタメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @return CarrierMasterEditDto 運送業者マスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public CarrierMasterEditDto initUpdate(@QueryParam("carrierId") Long carrierId) {
		MCarrier mCarrier = new MCarrier();
		mCarrier.setCarrierId(carrierId);
		List<MCarrier> mCarrieList = selectLogic.selectById(mCarrier, errRetSts(StatusCode.NOT_FOUND_DATA));

//		if (mCarrieList.size() > 0) {
			// センタ取得
			Long centerId = mCarrieList.get(0).getCenterId();
			MCenter mCenter = new MCenter();
			mCenter.setCenterId(centerId);
			mCenter = centerLogic.getPkEntity(mCenter);
			// センタ設定
			mCarrieList.get(0).setMCenter(mCenter);
//		}

		//エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		MCarrierDtoMapper productMapper = new MCarrierDtoMapper();

		// 運送業者マスタ更新画面用DTOデータセット
		CarrierMasterEditDto carrierMasterEditDto = new CarrierMasterEditDto();
		carrierMasterEditDto.data.head = productMapper.mappingToDto(mCarrieList.get(0));


		MBox mBox = new MBox();
		mBox.setMCenter(mCenter);

		// [Ver3.0][#4748] 不要な引数（エラーステータス）を除去 2018.06.21 shimizu Start
		List<MBox> listBox = selectLogic.selectWihtCarrierboxList(mBox,mCarrier);
		// [Ver3.0][#4748] 不要な引数（エラーステータス）を除去 2018.06.21 shimizu End
		//運送業者マスタメンテナンスbug修正 2017/02/21 Start
		if(listBox == null){
			listBox = new ArrayList<MBox>();
		}
		//運送業者マスタメンテナンスbug修正 2017/02/21 End
		MBoxDtoMapper boxMapper = new MBoxDtoMapper();
		carrierMasterEditDto.data.body = boxMapper.mappingToDtoList(listBox);

		MClientCenter clientCenter = new MClientCenter();
		clientCenter.setClientId(Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CLIENT_ID_KEY_NAME)));
		clientCenter.setCenterId(Long.valueOf(getUserData().get(WmsConst.ONESLOGI_WMS_CENTER_ID_KEY_NAME)));

		return carrierMasterEditDto;
	}

	/**
	 * <h2>入力チェック（新規と更新）。</h2>
	 * <pre>
	 * ・新規登録データのチェックを行う`
	 * ・エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param CarrierMasterEditDto 運送業者マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CarrierMasterEditDto carrierMasterEditDto) {
		// Entity変換
		MCarrierDtoMapper headMapper = new MCarrierDtoMapper();
		MCarrier mCarrier = headMapper.mappingToEntity(carrierMasterEditDto.data.head);

		// 運送業者取得
		MCommonCarrier mCommonCarrier = mCarrier.getMCommonCarrier();
		ResultSetupData resultStatus = setupInputCheck(mCarrier, mCommonCarrier, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		switch (resultStatus) {
		case ERROR:
			break;
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		default:
			break;
		}

		return null;
	}

	/**
	 * <h2>運送業者マスタ登録。</h2>
	 * <pre>
	 * ・エラーがない場合は、データベースに運送業者マスタとセンタ取引先マスタを登録し、完了メッセージを設定する。
	 * </pre>
	 * @param carrierMasterEditDto 運送業者マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CarrierMasterEditDto carrierMasterEditDto) {
		// Entity変換
		MCarrierDtoMapper headMapper = new MCarrierDtoMapper();
		MCarrier mCarrier = headMapper.mappingToEntity(carrierMasterEditDto.data.head);

		// 共通運送業者取得
		MCommonCarrier mCommonCarrier = mCarrier.getMCommonCarrier();

		MBoxDtoMapper bodyMapper = new MBoxDtoMapper();
		List<MBox> mBoxList = bodyMapper.mappingToEntityList(carrierMasterEditDto.data.body);

		setupInputCheck( mCarrier,mCommonCarrier, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// センタ取得
		MCenter mCenter = mCarrier.getMCenter();
		mCenter = centerLogic.getUkEntity(mCenter);
		// センタID設定
		mCarrier.setCenterId(mCenter.getCenterId());

		if(mCommonCarrier != null){
			mCommonCarrier=commoncarrierLogic.getUkEntity(mCommonCarrier);
			if(mCommonCarrier != null){
				//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				mCommonCarrier.setBolOutputTargetFlg(mCarrier.getMCommonCarrier().getBolOutputTargetFlg());
				//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
				// 運送業者ID設定
				mCarrier.setCommonCarrierId(mCommonCarrier.getCommonCarrierId());
				//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				mCarrier.setMCommonCarrier(mCommonCarrier);
				//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
			}else{
				mCarrier.setCommonCarrierId(null);
			}

		}else{
			mCarrier.setCommonCarrierId(null);
		}

		insertLogic.insert(mCarrier, mBoxList, errRetSts(StatusCode.CARRIER_MASTER_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>運送業者スマスタ更新。</h2>
	 * <pre>
	 * ・登録または更新チェックを行う
	 * ・エラーがない場合は、データベースに運送業者スマスタとセンタ運送業者マスタを更新し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param CarrierMasterEditDto 運送業者マスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(CarrierMasterEditDto carrierMasterEditDto) {

		// Entity変換
		MCarrierDtoMapper headMapper = new MCarrierDtoMapper();
		MCarrier mCarrier = headMapper.mappingToEntity(carrierMasterEditDto.data.head);

		// 運送業者取得
		MCommonCarrier mCommonCarrier = mCarrier.getMCommonCarrier();

		MBoxDtoMapper carrierMapper = new MBoxDtoMapper();
		List<MBox> bodyList = carrierMapper.mappingToEntityList(carrierMasterEditDto.data.body);

		List<MCarrierBox> mCarrierBoxList = new ArrayList<MCarrierBox>();

		for (MBox MBox : bodyList) {
			mCarrierBoxList.addAll(MBox.getMCarrierBoxList());
		}

		List<MBox> mBoxList = new ArrayList<MBox>();
		for (MCarrierBox mCarrierBox : mCarrierBoxList) {
			mBoxList.add(mCarrierBox.getMBox());
		}

		ResultSetupData resultStatus = setupInputCheck( mCarrier,mCommonCarrier, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// 結果判定
		if (resultStatus == ResultSetupData.COMMON_CARRIER_NOT_FOUND) {
			getInfoManager().add(infoRetSts(StatusCode.COMMON_CARRIER_NOT_FOUND_ERROR), WmsMessageConst.COMMON_CARRIER_CODE_NOT_FOUND_IN_COMMON_CARRIER_MASTER_ERROR);
			return null;
		}else if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}

		// センタ取得
		MCenter mCenter = mCarrier.getMCenter();
		mCenter = centerLogic.getUkEntity(mCenter);
		// センタID設定
		mCarrier.setCenterId(mCenter.getCenterId());
		if(mCommonCarrier != null){
			mCommonCarrier = commoncarrierLogic.getUkEntity(mCommonCarrier);
			if(mCommonCarrier != null){
				//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				mCommonCarrier.setBolOutputTargetFlg(mCarrier.getMCommonCarrier().getBolOutputTargetFlg());
				mCarrier.setMCommonCarrier(mCommonCarrier);
				//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
				// 運送業者ID設定
				mCarrier.setCommonCarrierId(mCommonCarrier.getCommonCarrierId());
			}else{
				mCarrier.setCommonCarrierId(null);
			}
		}else{
			// 運送業者ID設定
			mCarrier.setCommonCarrierId(null);
		}
		// 修正
		updateLogic.update(mCarrier, bodyList, errRetSts(StatusCode.CARRIER_MASTER_UPDATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 * <pre>
	 * ・運送業者CD重複チェックを行う
	 * ・共通運送業者CD存在チェック
	 * ・荷材マスタ存在チェック
	 * ・エラーがない場合は、データベースに運送業者マスタとセンタ運送業者マスタリストを更新し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param mCarrier 運送業者マスタ
	 * @param mcommoncarrier 共通運送業者マスタ
	 * @param mBoxList 荷材マスタリスト
	 * @return ResultSetupData 処理結果DTO
	 */
	public ResultSetupData setupInputCheck(MCarrier mCarrier, MCommonCarrier mCommonCarrier, ErrorStatus errSts) {
		// 登録されていないセンタがあるか
		boolean isCarrierCd = false;
		boolean isNullCommonCarrier = false;
		// センタ取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mCarrier.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		mCarrier.setCenterId(mCenter.getCenterId());

		//運送業者CDで重複チェック
		if (mCarrier.getCarrierId()== null) {
			// 登録の場合
			isCarrierCd = carrierLogic.checkCarrierCdInsert(mCarrier, errRetSts(StatusCode.CARRIER_CODE_DUPLICATE_ERROR));
		} else {
			// 修正の場合
			isCarrierCd = carrierLogic.checkCarrierCdUpdate(mCarrier, errRetSts(StatusCode.CARRIER_CODE_DUPLICATE_ERROR));

			// [#5705][v3.1] 配送コースに存在する運送業者を削除不可に変更 2018.12.06 kawana Start
			if (mCarrier.isDelFlg$1()) {
				// 削除

				// 配送コース存在チェック
				carrierLogic.checkDeliveryCourseExist(mCarrier, errSts);
			}
			// [#5705][v3.1] 配送コースに存在する運送業者を削除不可に変更 2018.12.06 kawana End
		}

		// 共通運送業者存在チェック
		if(mCommonCarrier != null){
			if(mCommonCarrier.getCarrierCd() != null){
				mCommonCarrier = commoncarrierLogic.getUkEntity(mCommonCarrier, errRetSts(StatusCode.COMMON_CARRIER_NOT_FOUND_ERROR));
				if (mCommonCarrier == null) {
					isNullCommonCarrier = true;
				}
			}
		}

		// 結果の設定
		ResultSetupData resultStatus = null;
		if (isCarrierCd) {
			resultStatus = ResultSetupData.CARRIER_CODE_DUPLICATE_ERROR;
		} else if (isNullCommonCarrier) {
			resultStatus = ResultSetupData.COMMON_CARRIER_NOT_FOUND;
		} else if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		return resultStatus;
	}
}
