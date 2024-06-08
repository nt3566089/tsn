package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MDeliveryCourseDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterCustomerDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MDeliveryCourseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCarrier;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipSgw;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYmt;
import com.oneslogi.base.dbflute.exentity.MCarrierSlipYupk;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCustomer;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MDeliveryCourse;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.DeliveryCourseMasterEditDto;
import com.oneslogi.wms.logic.common.CarrierLogic;
import com.oneslogi.wms.logic.common.CarrierSlipSgwLogic;
import com.oneslogi.wms.logic.common.CarrierSlipYmtLogic;
import com.oneslogi.wms.logic.common.CarrierSlipYupkLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.CustomerLogic;
import com.oneslogi.wms.logic.common.DeliveryCourseLogic;
import com.oneslogi.wms.logic.common.TransactionDataCheckLogic;
import com.oneslogi.wms.logic.master.DeliveryCourseMasterInsertLogic;
import com.oneslogi.wms.logic.master.DeliveryCourseMasterSelectLogic;
import com.oneslogi.wms.logic.master.DeliveryCourseMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 配送コースマスタメンテナンス(編集)のリソースクラス。
 */
@Path("/master/deliveryCourseMasterEdit")
public class DeliveryCourseMasterEditResource extends AbstractWmsResource {

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
		 * 配送コースCD重複
		 */
		protected static final int DELIVERY_COURSE_CODE_DUPLICATE = 2;
		/**
		 * 配送コースマスタメンテナンス(編集)データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int DELIVERY_COURSE_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int DELIVERY_COURSE_MASTER_UPDATE_FAILED = 5;
		/**
		 * 運送業者マスタで未存在異常
		 */
		protected static final int MCARRIER_NOT_FOUND_ERROR = 6;
		/**
		 * 取引先マスタで未存在異常
		 */
		protected static final int CUSTOMER_NOT_FOUND_ERROR = 7;
		/**
		 * センタ取引先マスタで存在異常
		 */
		protected static final int CENTERCUSTOMER_DELIVERY_ERROR = 8;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK_ERROR = 9;
		// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
		/**
		 * トランザクションデータ存在エラー
		 */
		protected static final int TRAN_DATA_FOUND_ERROR = 10;
		// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private DeliveryCourseMasterSelectLogic selectLogic;
	@Inject
	private DeliveryCourseMasterInsertLogic insertLogic;
	@Inject
	private DeliveryCourseMasterUpdateLogic updateLogic;
	@Inject
	private CarrierLogic carrierLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private CustomerLogic customerLogic;
	@Inject
	private DeliveryCourseLogic deliveryCourseLogic;
	// [#4626] CenterCustomerLogicを使用ロジックから削除 fujiwara 2018.05.23 Del
    // [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
	@Inject
	private CarrierSlipYmtLogic carrierSlipYmtLogic;
	@Inject
	private CarrierSlipSgwLogic carrierSlipSgwLogic;
	@Inject
	private CarrierSlipYupkLogic carrierSlipYupkLogic;
    // [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]
	// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
	@Inject
	private TransactionDataCheckLogic transactionDataCheckLogic;
	// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		ERROR,
		DELIVERY_COURSE_DUPLICATE_ERR,
		CARRIER_NOT_FOUND,
		CUSTOMER_NOT_FOUND,
		CENTERCUSTOMER_DELIVERY_ERR
	}

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return DeliveryCourseMasterEditDto 配送コースマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initNew")
	public DeliveryCourseMasterEditDto initNew() {
		DeliveryCourseMasterEditDto deliveryCourseMasterEditDto = new DeliveryCourseMasterEditDto();

		List<MCenterCustomer> mCenterCustomerlist = new ArrayList<MCenterCustomer>();
		List<MDeliveryCourse> mDeliveryCourseList = new ArrayList<MDeliveryCourse>();
		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
		mDeliveryCourse.setMCenterCustomerList(mCenterCustomerlist);
		mDeliveryCourseList.add(mDeliveryCourse);

		MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper();
		List<MDeliveryCourseDto> mDeliveryCourseDtoList = mapper.mappingToDtoList(mDeliveryCourseList);

		deliveryCourseMasterEditDto.data.body = mDeliveryCourseDtoList;
		return deliveryCourseMasterEditDto;
	}

	/**
	 * <h2>初期処理（訂正）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・配送コースマスタメンテナンス(編集)のデータを画面用DTOに設定
	 * </pre>
	 * @return DeliveryCourseMasterEditDto 配送コースマスタメンテナンス(編集)画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public DeliveryCourseMasterEditDto initUpdate(@QueryParam("deliveryCourseId") Long deliveryCourseId) {
		MDeliveryCourse mDeliveryCourse = new MDeliveryCourse();
		mDeliveryCourse.setDeliveryCourseId(deliveryCourseId);
		List<MDeliveryCourse> mDeliveryCourseList = selectLogic.selectById(mDeliveryCourse, errRetSts(StatusCode.NOT_FOUND_DATA));

		if (mDeliveryCourseList.size() > 0) {
			// センタ取得
			Long centerId = mDeliveryCourseList.get(0).getCenterId();
			MCenter mCenter = new MCenter();
			mCenter.setCenterId(centerId);
			mCenter = centerLogic.getPkEntity(mCenter);
			// センタ設定
			mDeliveryCourseList.get(0).setMCenter(mCenter);
		}

		//エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}
		DeliveryCourseMasterEditDto deliveryCourseMasterEditDto = new DeliveryCourseMasterEditDto();

		// JSON通信のためにDTO変換
		MDeliveryCourseDtoMapper mapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourseDto mDeliveryCourseDto = mapper.mappingToDto(mDeliveryCourseList.get(0));
		List<MDeliveryCourseDto> mDeliveryCourseDtoList = mapper.mappingToDtoList(mDeliveryCourseList);

	    // [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
		// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
		//送り状定義IDを取得
		if( mDeliveryCourseDto.getMCarrier().getCarrierCd() != null ){
			if( mDeliveryCourseDto.getMCarrier().getCarrierCd().equals("YMT")){
		// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
	    // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYmt mCarrierSlipYmt = new MCarrierSlipYmt();
				mCarrierSlipYmt.setCarrierSlipYmtId(mDeliveryCourseDto.getCarrierSlipYmtId());
				mCarrierSlipYmt = carrierSlipYmtLogic.getPkEntity(mCarrierSlipYmt);
				if( mCarrierSlipYmt != null ){
					// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
					mDeliveryCourseDto.setSlipTagType(mCarrierSlipYmt.getTagType());
					// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				}
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			}else if( mDeliveryCourseDto.getMCarrier().getCarrierCd().equals("SGW") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipSgw mCarrierSlipSgw = new MCarrierSlipSgw();
				mCarrierSlipSgw.setCarrierSlipSgwId(mDeliveryCourseDto.getCarrierSlipSgwId());
				mCarrierSlipSgw = carrierSlipSgwLogic.getPkEntity(mCarrierSlipSgw);
				if( mCarrierSlipSgw != null){
					// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
					mDeliveryCourseDto.setSlipTagType(mCarrierSlipSgw.getTagType());
					// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				}
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			}else if( mDeliveryCourseDto.getMCarrier().getCarrierCd().equals("JP") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYupk mCarrierSlipYupk = new MCarrierSlipYupk();
				mCarrierSlipYupk.setCarrierSlipYupkId(mDeliveryCourseDto.getCarrierSlipYupkId());
				mCarrierSlipYupk = carrierSlipYupkLogic.getPkEntity(mCarrierSlipYupk);
				if( mCarrierSlipYupk != null){
					// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
					mDeliveryCourseDto.setSlipTagType(mCarrierSlipYupk.getTagType());
					// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				}
			}
		}
		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]

		// ===== 画面用DTO ヘッダの作成 =====
		deliveryCourseMasterEditDto.data.head = mDeliveryCourseDto;

		// ===== 画面用DTO ボディの作成 =====
		deliveryCourseMasterEditDto.data.body = mDeliveryCourseDtoList;

		return deliveryCourseMasterEditDto;
	}

	/**
	 * <h2>入力チェック（新規と更新）。</h2>
	 * <pre>
	 * ・新規登録データのチェックを行う
	 * ・エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param deliveryCourseMasterEditDto 配送コースマスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(DeliveryCourseMasterEditDto deliveryCourseMasterEditDto) {
		// Entity変換
		MDeliveryCourseDtoMapper headMapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourse mDeliveryCourse = headMapper.mappingToEntity(deliveryCourseMasterEditDto.data.head);

		// 運送業者取得
		MCarrier mCarrier = mDeliveryCourse.getMCarrier();

		MCenterCustomerDtoMapper bodyMapper = new MCenterCustomerDtoMapper();
		List<MCenterCustomer> mCenterCustomerList = bodyMapper.mappingToEntityList(deliveryCourseMasterEditDto.data.body.get(0).getMCenterCustomerList());

		List<MCustomer> mCustomerList = new ArrayList<MCustomer>();

		for (MCenterCustomer mCenterCustomer : mCenterCustomerList) {
			mCustomerList.add(mCenterCustomer.getMCustomer());
		}

		ResultSetupData resultStatus = setupInputCheck(mDeliveryCourse, mCarrier, mCustomerList, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		switch (resultStatus) {
		case ERROR:
			break;
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
		case CARRIER_NOT_FOUND:
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
			break;
	    // [検査-095] エラーが表示を修正 2014.11.27 taoys End
		case CENTERCUSTOMER_DELIVERY_ERR:
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CUSTOMER_CD_REGISTER_CONFIRMATION);
			break;
		default:
			break;
		}

		return null;
	}

	/**
	 * <h2>配送コースマスタ登録。</h2>
	 * <pre>
	 * ・エラーがない場合は、データベースに配送コースマスタとセンタ取引先マスタを登録し、完了メッセージを設定する。
	 * </pre>
	 * @param deliveryCourseMasterEditDto 配送コースマスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(DeliveryCourseMasterEditDto deliveryCourseMasterEditDto) {
		// Entity変換
		MDeliveryCourseDtoMapper headMapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourse mDeliveryCourse = headMapper.mappingToEntity(deliveryCourseMasterEditDto.data.head);

		// 運送業者取得
		MCarrier mCarrier = mDeliveryCourse.getMCarrier();

		MCenterCustomerDtoMapper bodyMapper = new MCenterCustomerDtoMapper();
		List<MCenterCustomer> mCenterCustomerList = bodyMapper.mappingToEntityList(deliveryCourseMasterEditDto.data.body.get(0).getMCenterCustomerList());

		List<MCustomer> mCustomerList = new ArrayList<MCustomer>();
		MCustomer mCustomer = new MCustomer();
		for (MCenterCustomer mCenterCustomer : mCenterCustomerList) {
			mCustomerList.add(mCenterCustomer.getMCustomer());
		}
		ResultSetupData resultStatus = setupInputCheck(mDeliveryCourse, mCarrier, mCustomerList, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// 結果判定
		// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
		if (resultStatus == ResultSetupData.CARRIER_NOT_FOUND) {
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
			return null;
		}else if (resultStatus == ResultSetupData.CENTERCUSTOMER_DELIVERY_ERR) {
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CUSTOMER_CD_REGISTER_CONFIRMATION);
			return null;
		}else if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}
		// [検査-095] エラーが表示を修正 2014.11.27 taoys End

		// センタ取得
		MCenter mCenter = mDeliveryCourse.getMCenter();
		mCenter = centerLogic.getUkEntity(mCenter);
		// センタID設定
		mDeliveryCourse.setCenterId(mCenter.getCenterId());

		mCarrier.setCenterId(mCenter.getCenterId());

		mCarrier = carrierLogic.getUkEntity(mCarrier);
		// 運送業者ID設定
		mDeliveryCourse.setCarrierId(mCarrier.getCarrierId());

		for (MCenterCustomer mCenterCustomer : mCenterCustomerList) {

			// センタID設定
			mCenterCustomer.setCenterId(mCenter.getCenterId());

			// 取引先取得
			mCustomer = mCenterCustomer.getMCustomer();
			mCustomer = customerLogic.getUkEntity(mCustomer);
			// 取引先ID設定
			mCenterCustomer.setCustomerId(mCustomer.getCustomerId());

			mCenterCustomer.setDelFlg_$0();
		}

		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
		//送り状定義IDを取得
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
		if( deliveryCourseMasterEditDto.data.head.getSlipTagType() != null ){
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			if( mDeliveryCourse.chaseMCarrier().getCarrierCd().equals("YMT") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYmt mCarrierSlipYmt = new MCarrierSlipYmt();
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
				mCarrierSlipYmt.setCenterId(mCenter.getCenterId());
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
				mCarrierSlipYmt.setTagType(deliveryCourseMasterEditDto.data.head.getSlipTagType());
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				mCarrierSlipYmt = carrierSlipYmtLogic.getUkEntity(mCarrierSlipYmt);
				mDeliveryCourse.setCarrierSlipYmtId(mCarrierSlipYmt.getCarrierSlipYmtId());
				mDeliveryCourse.setCarrierSlipSgwId(null);
				mDeliveryCourse.setCarrierSlipYupkId(null);
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			}else if( mDeliveryCourse.chaseMCarrier().getCarrierCd().equals("SGW") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
		    // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipSgw mCarrierSlipSgw = new MCarrierSlipSgw();
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
				mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
				mCarrierSlipSgw.setTagType(deliveryCourseMasterEditDto.data.head.getSlipTagType());
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				mCarrierSlipSgw = carrierSlipSgwLogic.getUkEntity(mCarrierSlipSgw);
				mDeliveryCourse.setCarrierSlipYmtId(null);
				mDeliveryCourse.setCarrierSlipSgwId(mCarrierSlipSgw.getCarrierSlipSgwId());
				mDeliveryCourse.setCarrierSlipYupkId(null);
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			//}else if( mDeliveryCourse.getTagDataType().equals("4") || mDeliveryCourse.getTagDataType().equals("5") ){
			}else if( mDeliveryCourse.chaseMCarrier().getCarrierCd().equals("JP") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYupk mCarrierSlipYupk = new MCarrierSlipYupk();
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
				mCarrierSlipYupk.setCenterId(mCenter.getCenterId());
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
				mCarrierSlipYupk.setTagType(deliveryCourseMasterEditDto.data.head.getSlipTagType());
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				mCarrierSlipYupk = carrierSlipYupkLogic.getUkEntity(mCarrierSlipYupk);
				mDeliveryCourse.setCarrierSlipYmtId(null);
				mDeliveryCourse.setCarrierSlipSgwId(null);
				mDeliveryCourse.setCarrierSlipYupkId(mCarrierSlipYupk.getCarrierSlipYupkId());
			}
		}
		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]

		insertLogic.insert(mDeliveryCourse, mCenterCustomerList, errRetSts(StatusCode.DELIVERY_COURSE_MASTER_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>配送コースマスタ更新。</h2>
	 * <pre>
	 * ・登録または更新チェックを行う
	 * ・エラーがない場合は、データベースに配送コースマスタとセンタ取引先マスタを更新し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param deliveryCourseMasterEditDto 配送コースマスタメンテナンス(編集)画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(DeliveryCourseMasterEditDto deliveryCourseMasterEditDto) {

		// Entity変換
		MDeliveryCourseDtoMapper headMapper = new MDeliveryCourseDtoMapper();
		MDeliveryCourse mDeliveryCourse = headMapper.mappingToEntity(deliveryCourseMasterEditDto.data.head);

		// 運送業者取得
		MCarrier mCarrier = mDeliveryCourse.getMCarrier();

		List<MDeliveryCourse> bodyList = headMapper.mappingToEntityList(deliveryCourseMasterEditDto.data.body);

		List<MCenterCustomer> mCenterCustomerList = new ArrayList<MCenterCustomer>();

		List<MCenterCustomer> mcList = new ArrayList<MCenterCustomer>();

		for (MDeliveryCourse MDeliveryCourse : bodyList) {
			mCenterCustomerList.addAll(MDeliveryCourse.getMCenterCustomerList());
		}

		List<MCustomer> mCustomerList = new ArrayList<MCustomer>();
		MCustomer mCustomer = new MCustomer();
		for (MCenterCustomer mCenterCustomer : mCenterCustomerList) {
			mCustomerList.add(mCenterCustomer.getMCustomer());
		}

		ResultSetupData resultStatus = setupInputCheck(mDeliveryCourse, mCarrier, mCustomerList, errRetSts(StatusCode.INPUT_CHECK_ERROR));

		// 結果判定
		// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
		if (resultStatus == ResultSetupData.CARRIER_NOT_FOUND) {
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
			return null;
		}else if (resultStatus == ResultSetupData.ERROR) {
			return null;
		}
		// [検査-095] エラーが表示を修正 2014.11.27 taoys End

		// センタ取得
		MCenter mCenter = mDeliveryCourse.getMCenter();
		mCenter = centerLogic.getUkEntity(mCenter);
		// センタID設定
		mDeliveryCourse.setCenterId(mCenter.getCenterId());

		mCarrier = carrierLogic.getUkEntity(mCarrier);
		// 運送業者ID設定
		mDeliveryCourse.setCarrierId(mCarrier.getCarrierId());

		for (MCenterCustomer mCenterCustomer : bodyList.get(0).getMCenterCustomerList()) {

			// センタID設定
			mCenterCustomer.setCenterId(mCenter.getCenterId());

			// 取引先取得
			mCustomer = mCenterCustomer.getMCustomer();
			mCustomer = customerLogic.getUkEntity(mCustomer);
			// 取引先ID設定
			mCenterCustomer.setCustomerId(mCustomer.getCustomerId());

			mCenterCustomer.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());

			if(mDeliveryCourse != null && mDeliveryCourse.getDeliveryCourseId() != null){

				mCenterCustomer.setDeliveryCourseId(mDeliveryCourse.getDeliveryCourseId());

			}
			mcList.add(mCenterCustomer);
		}

		//送り状定義IDを取得
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
	    if( deliveryCourseMasterEditDto.data.head.getSlipTagType() != null ){
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			if( mDeliveryCourse.chaseMCarrier().getCarrierCd().equals("YMT") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
		    // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYmt mCarrierSlipYmt = new MCarrierSlipYmt();
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
				mCarrierSlipYmt.setCenterId(mCenter.getCenterId());
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
				mCarrierSlipYmt.setTagType(deliveryCourseMasterEditDto.data.head.getSlipTagType());
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				mCarrierSlipYmt = carrierSlipYmtLogic.getUkEntity(mCarrierSlipYmt);
				mDeliveryCourse.setCarrierSlipYmtId(mCarrierSlipYmt.getCarrierSlipYmtId());
				mDeliveryCourse.setCarrierSlipSgwId(null);
				mDeliveryCourse.setCarrierSlipYupkId(null);
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			}else if( mDeliveryCourse.chaseMCarrier().getCarrierCd().equals("SGW") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipSgw mCarrierSlipSgw = new MCarrierSlipSgw();
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
				mCarrierSlipSgw.setCenterId(mCenter.getCenterId());
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
				mCarrierSlipSgw.setTagType(deliveryCourseMasterEditDto.data.head.getSlipTagType());
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				mCarrierSlipSgw = carrierSlipSgwLogic.getUkEntity(mCarrierSlipSgw);
				mDeliveryCourse.setCarrierSlipYmtId(null);
				mDeliveryCourse.setCarrierSlipSgwId(mCarrierSlipSgw.getCarrierSlipSgwId());
				mDeliveryCourse.setCarrierSlipYupkId(null);
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
			}else if( mDeliveryCourse.chaseMCarrier().getCarrierCd().equals("JP") ){
			// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				MCarrierSlipYupk mCarrierSlipYupk = new MCarrierSlipYupk();
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana Start
				mCarrierSlipYupk.setCenterId(mCenter.getCenterId());
				// [EC-CT1-128] ユニークキーにセンタIDを追加 2015.03.19 kawana End
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
				mCarrierSlipYupk.setTagType(deliveryCourseMasterEditDto.data.head.getSlipTagType());
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				mCarrierSlipYupk = carrierSlipYupkLogic.getUkEntity(mCarrierSlipYupk);
				mDeliveryCourse.setCarrierSlipYmtId(null);
				mDeliveryCourse.setCarrierSlipSgwId(null);
				mDeliveryCourse.setCarrierSlipYupkId(mCarrierSlipYupk.getCarrierSlipYupkId());
			}
		}else{
			mDeliveryCourse.setCarrierSlipYmtId(null);
			mDeliveryCourse.setCarrierSlipSgwId(null);
			mDeliveryCourse.setCarrierSlipYupkId(null);
		}

		// 修正
		updateLogic.update(mDeliveryCourse, mcList, errRetSts(StatusCode.DELIVERY_COURSE_MASTER_UPDATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
	    // [横並-048] チェック順変更 2014.11.20 taoys Start
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
	    // [横並-048] チェック順変更 2014.11.20 taoys End
		return null;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 * <pre>
	 * ・配送コースCD重複チェックを行う
	 * ・運送事業者存在チェック
	 * ・センタ取引先マスタ存在チェック
	 * ・エラーがない場合は、データベースに配送コースマスタとセンタ取引先マスタリストを更新し、完了メッセージを設定する
	 *
	 * </pre>
	 * @param mDeliveryCourse 配送コースマスタ
	 * @param mcarrier 運送業者マスタ
	 * @param mCustomerList 取引先マスタリスト
	 * @return ResultSetupData 処理結果DTO
	 */
	public ResultSetupData setupInputCheck(MDeliveryCourse mDeliveryCourse, MCarrier mcarrier, List<MCustomer> mCustomerList, ErrorStatus errSts) {
		// 登録されていないセンタがあるか
		boolean isDeliveryCourseCd = false;
		boolean isNullCarrier = false;
		// センタ取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(mDeliveryCourse.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);

		mDeliveryCourse.setCenterId(mCenter.getCenterId());
		// [ON推-品向-265] センタを追加 2014.11.26 taoys Start
		mcarrier.setCenterId(mCenter.getCenterId());
		// [ON推-品向-265] センタを追加 2014.11.26 taoys End
		// 配送コースCDで重複チェック
		if (mDeliveryCourse.getDeliveryCourseId() == null) {
			// 登録の場合
			isDeliveryCourseCd = deliveryCourseLogic.checkDeliveryCourseCdInsert(mDeliveryCourse, errRetSts(StatusCode.DELIVERY_COURSE_CODE_DUPLICATE));
		} else {
			// 修正の場合
			isDeliveryCourseCd = deliveryCourseLogic.checkDeliveryCourseCdUpdate(mDeliveryCourse, errRetSts(StatusCode.DELIVERY_COURSE_CODE_DUPLICATE));

			// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana Start
			// トランザクション存在チェック
			if (transactionDataCheckLogic.existTran(mDeliveryCourse)) {
				// トランザクションデータ存在
				getErrorManager().add(errRetSts(StatusCode.TRAN_DATA_FOUND_ERROR), WmsMessageConst.TRANSACTION_DATA_FOUND_ERROR);
			}
			// [#5705][v3.1] 出荷データが存在する場合は削除不可に変更 2018.12.06 kawana End
		}

		// 運送業者存在チェック
		mcarrier = carrierLogic.getUkEntity(mcarrier, errRetSts(StatusCode.MCARRIER_NOT_FOUND_ERROR));
		if (mcarrier == null) {
			isNullCarrier = true;
		}

		MCustomer customer = new MCustomer();
		int rowIndex = -1;

		// 取引先マスタ存在チェック
		for (MCustomer mCustomer : mCustomerList) {
			rowIndex++;

			customer = customerLogic.getUkEntity(mCustomer, errRetSts(StatusCode.CUSTOMER_NOT_FOUND_ERROR));
			if (customer == null) {
				getErrorManager().add(new ErrorStatus(errSts, StatusCode.CUSTOMER_NOT_FOUND_ERROR, rowIndex), WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
				break;

				// [#4626] センタ取引先マスタ存在チェック処理削除 fujiwara 2018.05.23 Del
			}
		}

		// 結果の設定
		ResultSetupData resultStatus;
		if (isDeliveryCourseCd) {
			resultStatus = ResultSetupData.DELIVERY_COURSE_DUPLICATE_ERR;
		} else if (isNullCarrier) {
			resultStatus = ResultSetupData.CARRIER_NOT_FOUND;
		} else if (0 < getErrorManager().size()) {
			resultStatus = ResultSetupData.ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		switch (resultStatus) {
		case ERROR:
			break;
		case DELIVERY_COURSE_DUPLICATE_ERR:
			// 配送コースCD重複の確認メッセージを設定
			break;
		case CARRIER_NOT_FOUND:
			// 運送業者存在の確認メッセージを設定
			// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
			getInfoManager().add(infoRetSts(StatusCode.MCARRIER_NOT_FOUND_ERROR), WmsMessageConst.CARRIER_CODE_NOT_FOUND_IN_CARRIER_MASTER_ERROR);
		    // [検査-095] エラーが表示を修正 2014.11.27 taoys End
			break;
		case CUSTOMER_NOT_FOUND:
			// 取引先マスタ存在の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.DELIVERY_COURSE_CODE_DUPLICATE), WmsMessageConst.CUSTOMER_NOT_FOUND_ERROR);
			break;
		default:
			break;
		}

		return resultStatus;
	}
}
