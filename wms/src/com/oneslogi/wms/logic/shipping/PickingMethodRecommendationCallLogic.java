package com.oneslogi.wms.logic.shipping;

import java.io.File;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;

import javax.inject.Inject;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;

import org.dbflute.cbean.scoping.SubQuery;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.internal.BasicAuthentication;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataOutput;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.TPackingBCB;
import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdCartCB;
import com.oneslogi.base.dbflute.cbean.TPicMthdRcmdDataCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingBBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdCartBhv;
import com.oneslogi.base.dbflute.exbhv.TPicMthdRcmdDataBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmd;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdCart;
import com.oneslogi.base.dbflute.exentity.TPicMthdRcmdData;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.exception.BaseException;
import com.oneslogi.base.exception.CommonException;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.shipping.pmrapi.PmrApiCartDto;
import com.oneslogi.wms.dto.shipping.pmrapi.PmrApiErrorDto;
import com.oneslogi.wms.dto.shipping.pmrapi.PmrApiPickingTypeDto;
import com.oneslogi.wms.dto.shipping.pmrapi.PmrApiResponseDto;
import com.oneslogi.wms.dto.shipping.pmrapi.PmrApiSendParameterDto;
import com.oneslogi.wms.logic.common.CsvFileLogic;

/**
 * ピッキング提案呼出ロジッククラス
 */
public class PickingMethodRecommendationCallLogic extends AbstractWmsLogic {

	// ===== 定数 =====

	/** ピッキング提案サービスメッセージクラス */
	private static ResourceBundle messageBundle;
	/** ピッキング提案API URL */
	private static final String API_URL;
	/** ピッキング提案API 応答タイムアウト */
	private static final Integer READ_TIMEOUT;
	/** ピッキング提案API 接続タイムアウト */
	private static final Integer CONNECT_TIMEOUT;
	/** ピッキング提案API プロキシURL */
	private static final String PROXY_URL;
	/** ピッキング提案API プロキシポート */
	private static final Integer PROXY_PORT;
	/** ピッキング提案API プロキシユーザ */
	private static final String PROXY_USER;
	/** ピッキング提案API プロキシパスワード */
	private static final String PROXY_PASS;
	/** ピッキング提案API 送信ファイル文字コード */
	public static final String SEND_FILE_CHARACTER_SET;

	// ===== 使用テーブル =====

	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private TPickingHBhv tPickingHBhv;
	@Inject
	private TPackingBBhv tPackingBBhv;
	@Inject
	private TPicMthdRcmdBhv tPicMthdRcmdBhv;
	@Inject
	private TPicMthdRcmdDataBhv tPicMthdRcmdDataBhv;
	@Inject
	private TPicMthdRcmdCartBhv tPicMthdRcmdCartBhv;

	// ===== 使用ロジック =====

	@Inject
	private CsvFileLogic csvFileLogic;
	@Inject
	private MessageLogic messageLogic;

	// ===== enum定義 =====

	/** ログ書込 */
	private enum OutputLog {
		/** ログ書込有 */
		TRUE,
		/** ログ書込無 */
		FALSE,
	}

	/** ログ出力区分 */
	private enum OutputLogCls {
		/** ログ */
		LOG,
		/** ログセクション */
		SECTION,
	}

	/** 対象区分 */
	private enum TargetCls {
		/** ピース */
		PIECE,
		/** ケース */
		CASE
	}

	// ===== 内部変数 =====

	/** ログの書込み有無 */
	private OutputLog outputLog = OutputLog.FALSE;

	/** ログの書込み種別 */
	private OutputLogCls outputLogCls = OutputLogCls.LOG;

	static {

		// ===== 接続設定の読込 =====

		ResourceBundle apiSettingBundle = null;
		try {
			apiSettingBundle = ResourceBundle.getBundle("apiPmr");
		} catch (Exception e) {
			// ファイル未存在(API未使用)の場合もあるのでエラー時は何もしない
			apiSettingBundle = null;
		}

		if (apiSettingBundle != null) {
			API_URL = apiSettingBundle.getString("apiUrl");
			READ_TIMEOUT = getIntValue(apiSettingBundle.getString("readTimeout"));
			CONNECT_TIMEOUT = getIntValue(apiSettingBundle.getString("connectTimeout"));
			PROXY_URL = apiSettingBundle.getString("proxyUrl");
			PROXY_PORT = getIntValue(apiSettingBundle.getString("proxyPort"));
			PROXY_USER = apiSettingBundle.getString("proxyUser");
			PROXY_PASS = apiSettingBundle.getString("proxyPassword");
			SEND_FILE_CHARACTER_SET = apiSettingBundle.getString("sendFileCharacterSet");
		} else {
			API_URL = null;
			READ_TIMEOUT = null;
			CONNECT_TIMEOUT = null;
			PROXY_URL = null;
			PROXY_PORT = null;
			PROXY_USER = null;
			PROXY_PASS = null;
			SEND_FILE_CHARACTER_SET = "UTF-8";
		}

		// ===== メッセージクラスの作成 =====

		try {
			messageBundle = ResourceBundle.getBundle("apiPmrMessage");
		} catch (Exception e) {
			// ファイル未存在(API未使用)の場合もあるのでエラー時は何もしない
			messageBundle = null;
		}
	}

	private static Integer getIntValue(String s) {
		if (CU.isNullOrEmpty(s)) {
			return null;
		} else {
			return Integer.valueOf(s);
		}
	}

	/**
	 * <h2>最適ピッキング提案APIの呼出.</h2>
	 * <pre>
	 * 最適ピッキング提案サービス(API)を呼出し、
	 * 未出荷かつピッキングリスト未発行の出荷データの
	 * 最適なピッキング方法を取得する。
	 *
	 * 現在のピッキング提案データを削除し、
	 * 取得したピッキング方法で上書きする。
	 * </pre>
	 * @param centerId センタID
	 * @param clientId 荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void call(long centerId, long clientId, ErrorStatus errSts) {

		// パラメータマスタ検索
		MClientCenter clientCenter = selectClientCenterWithParam(centerId, clientId);
		MParam param = clientCenter.getMParamAsOne();

		if (!param.isPicMthdRcmdFlg$1()) {
			// ピッキング提案未使用

			return;
		}

		if (CU.isNullOrEmpty(API_URL)) {
			// URL未設定

			getErrorManager().add(errSts, WmsMessageConst.PMR_API_REQUEST_URL_NOT_FOUND_ERROR);
			return;
		}

		// ===== 対象データの検索 =====

		List<TPackingB> packingBList = selectTargetList(centerId, clientId, clientCenter.getSystemDt(), param);
		// ピッキング提案リスト
		List<PmrApiPickingTypeDto> pickingTypeList;

		if (!packingBList.isEmpty()) {
			// ピッキング提案の対象データあり

			// ===== ピッキング提案 =====

			// 運用ログを出力
			startLog(packingBList, clientCenter);

			// ===== WebAPI呼出 =====

			PmrApiResponseDto resultDto = null;
			File sendFile = null;
			try {

				// 送信ファイル作成
				List<List<String>> fileData = convertFileData(packingBList, param);
				sendFile = csvFileLogic.writeTempFile(fileData, SEND_FILE_CHARACTER_SET);

				// 送信パラメータ作成
				PmrApiSendParameterDto parameterDto = createParameterDto(param);

				// 送信データ作成
				MultipartFormDataOutput output = new MultipartFormDataOutput();
				output.addFormData("dataFile", sendFile, MediaType.APPLICATION_OCTET_STREAM_TYPE);
				output.addFormData("parameter", parameterDto, MediaType.APPLICATION_JSON_TYPE);

				// WebAPI呼出
				Invocation.Builder requestBuilder = buildResteasyRequest(param);
				resultDto = requestBuilder.post(Entity.entity(output, MediaType.MULTIPART_FORM_DATA), PmrApiResponseDto.class);

			} catch (Exception e) {

				getErrorManager().add(errSts, WmsMessageConst.PMR_API_SYSTEM_CANNOT_CONNECT_ERROR);
				e.printStackTrace();
				addErrorLog();
				return;
			} finally {
				// ファイルを消す(失敗しても)

				if (sendFile != null) {
					sendFile.delete();
				}
			}

			// ===== 結果の判定 =====

			if (resultDto.getStatusCode().intValue() != 0) {
				// エラー

				String statusMessage = CU.nullToStr(messageBundle.getString("S" + resultDto.getStatusCode()));
				String errDetail = getErrorDetailMessage(resultDto.getErrorList());
				getErrorManager().add(errSts, WmsMessageConst.PMR_API_SYSTEM_RESPONSE_ERROR, statusMessage, resultDto.getReferenceNo(), errDetail);
				addErrorLog();
				return;
			}

			pickingTypeList = resultDto.getPickingTypeList();
		} else {
			// ピッキング提案の対象データなし

			pickingTypeList = new ArrayList<PmrApiPickingTypeDto>();
		}

		// ===== 結果のDB登録 =====

		// ピッキング提案テーブル削除
		deletePmrTable(centerId, clientId);

		// ケースピック分を検索して追加
		packingBList.addAll(selectCaseTargetList(centerId, clientId, clientCenter.getSystemDt(), param));

		if (packingBList.isEmpty()) {
			// ピース分のケース分も対象データなし
			return;
		}

		// 検索データと紐付けのためにマップ作成
		Map<Long, TPickingH> pickingHMap = new HashMap<Long, TPickingH>();
		// ケースピッキングの出庫ヘッダIDセットを作成
		Set<String> casePickingHIdSet = new TreeSet<String>();
		// ケースピッキングの梱包ヘッダIDセットを作成
		Set<Long> casePackingHIdSet = new HashSet<Long>();

		for (TPackingB packingB : packingBList) {

			long pickingHId = packingB.getTPackingH().getPickingHId();
			TPickingH pickingH = packingB.getTPackingH().getTPickingH();
			pickingH.setEmergencyFlg(packingB.getEmergencyFlg());
			pickingHMap.put(pickingHId, pickingH);

			if (packingB.getTPackingH().isMixedFlg$0()) {
				// ケース梱包

				casePickingHIdSet.add(String.valueOf(pickingHId));
				casePackingHIdSet.add(packingB.getPackingHId());
			}
		}

		if (!casePickingHIdSet.isEmpty()) {
			// ケース梱包分あり

			// ピッキング提案にケース梱包を追加
			PmrApiPickingTypeDto casePickingTypeDto = new PmrApiPickingTypeDto();
			casePickingTypeDto.setType(6);
			casePickingTypeDto.setSlipNo(new ArrayList<String>(casePickingHIdSet));
			casePickingTypeDto.setPackingNum(casePackingHIdSet.size());
			pickingTypeList.add(casePickingTypeDto);
		}

		ArrayList<TPicMthdRcmdData> insertDataList = new ArrayList<TPicMthdRcmdData>();
		ArrayList<TPicMthdRcmdCart> insertCartList = new ArrayList<TPicMthdRcmdCart>();

		int maxBatchNo = 0;

		for (PmrApiPickingTypeDto pickingType : pickingTypeList) {

			// バッチNo.が未設定 (ケースピッキング)にバッチNo.設定
			Integer batchNo = pickingType.getBatchNo();
			if (batchNo == null) {

				maxBatchNo++;
				batchNo = maxBatchNo;
			} else if (maxBatchNo < batchNo) {

				maxBatchNo = batchNo;
			}

			// ===== ピッキング提案 作成 =====

			TPicMthdRcmd picMthdRcmd = new TPicMthdRcmd();

			picMthdRcmd.setCenterId(centerId);
			picMthdRcmd.setClientId(clientId);
			picMthdRcmd.setPickingBatchNo(String.valueOf(batchNo));
			picMthdRcmd.setRcmdPickingCls(String.valueOf(pickingType.getType()));
			picMthdRcmd.setPackingNum(Long.valueOf(pickingType.getPackingNum()));
			picMthdRcmd.setWorkVolume(pickingType.getWorkVolume());

			// 配送コースCD(名称) 、運送業者CD(名称)、緊急フラグの設定
			// 配送コース、運送業者が複数ある場合は「最小-最大]の形式で設定

			MinMaxCdSetter deliveryCourseMinMax = new MinMaxCdSetter();
			MinMaxCdSetter carrierMinMax = new MinMaxCdSetter();
			String emergencyFlg = "0";

			List<String> pickingHIdList = pickingType.getSlipNo();

			for (String pickingHIdStr : pickingHIdList) {

				long pickingHId = Long.valueOf(pickingHIdStr);
				TPickingH pickingH = pickingHMap.get(pickingHId);

				String deliveryCourseCd = pickingH.getTAllocInstH().getMDeliveryCourse().getDeliveryCourseCd();
				String deliveryCourseNm = pickingH.getTAllocInstH().getMDeliveryCourse().getDeliveryCourseNm();

				deliveryCourseMinMax.set(deliveryCourseCd, deliveryCourseNm);

				String carrierCd = pickingH.getTAllocInstH().getMDeliveryCourse().getMCarrier().getCarrierCd();
				String carrierNm = pickingH.getTAllocInstH().getMDeliveryCourse().getMCarrier().getCarrierNm();

				carrierMinMax.set(carrierCd, carrierNm);

				if (pickingH.getEmergencyFlg().equals("1")) {
					emergencyFlg = "1";
				}
			}

			picMthdRcmd.setDeliveryCourseCd(deliveryCourseMinMax.getMinMaxCd());
			picMthdRcmd.setDeliveryCourseNm(deliveryCourseMinMax.getMinMaxNm());
			picMthdRcmd.setCarrierCd(carrierMinMax.getMinMaxCd());
			picMthdRcmd.setCarrierNm(carrierMinMax.getMinMaxNm());
			picMthdRcmd.setEmergencyFlg(emergencyFlg);

			// ピッキング提案をDBに登録
			tPicMthdRcmdBhv.insert(picMthdRcmd);

			// ===== ピッキング提案データ作成 =====

			for (String pickingHIdStr : pickingHIdList) {

				TPicMthdRcmdData data = new TPicMthdRcmdData();
				data.setPickingHId(Long.valueOf(pickingHIdStr));
				data.setPicMthdRcmdId(picMthdRcmd.getPicMthdRcmdId());

				insertDataList.add(data);
			}

			// ===== ピッキング提案カート作成 =====

			List<PmrApiCartDto> cartList = pickingType.getCartList();

			if (cartList != null) {

				for (PmrApiCartDto cartDto : cartList) {

					int cartNo = cartDto.getCartNo();
					List<String> packingHIdList = cartDto.getPackingNo();

					for (String packingHId : packingHIdList) {

						TPicMthdRcmdCart cart = new TPicMthdRcmdCart();
						cart.setPackingHId(Long.valueOf(packingHId));
						cart.setCartNo(Long.valueOf(cartNo));
						cart.setPicMthdRcmdId(picMthdRcmd.getPicMthdRcmdId());

						insertCartList.add(cart);
					}
				}
			}
		}

		// ピッキング提案データをDBに一括登録
		if (!insertDataList.isEmpty()) {
			tPicMthdRcmdDataBhv.batchInsert(insertDataList);
		}

		// ピッキング提案カートをDBに一括登録
		if (!insertCartList.isEmpty()) {
			tPicMthdRcmdCartBhv.batchInsert(insertCartList);
		}
	}

	/**
	 * 荷主センタマスタ、パラメータマスタの検索
	 */
	private MClientCenter selectClientCenterWithParam(long centerId, long clientId) {

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();
		cb.setupSelect_MParamAsOne().withBClassDtlByPicMthdRcmdBreakKey().withVDict(getCultureId());
		cb.query().setClientId_Equal(clientId);
		cb.query().setCenterId_Equal(centerId);

		return mClientCenterBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * ピッキング提案テーブル削除
	 */
	private void deletePmrTable(long centerId, long clientId) {

		// 排他用にテーブルロック
		{
			TPicMthdRcmdCB cb = tPicMthdRcmdBhv.newMyConditionBean();
			cb.lockForUpdate();
			cb.query().setCenterId_Equal(centerId);
			cb.query().setClientId_Equal(clientId);
			tPicMthdRcmdBhv.selectList(cb);
		}

		// ピッキング提案台車テーブル削除
		{
			TPicMthdRcmdCartCB cb = tPicMthdRcmdCartBhv.newMyConditionBean();
			cb.query().queryTPicMthdRcmd().setCenterId_Equal(centerId);
			cb.query().queryTPicMthdRcmd().setClientId_Equal(clientId);
			tPicMthdRcmdCartBhv.queryDelete(cb);
		}

		// ピッキング提案データテーブル削除
		{
			TPicMthdRcmdDataCB cb = tPicMthdRcmdDataBhv.newMyConditionBean();
			cb.query().queryTPicMthdRcmd().setCenterId_Equal(centerId);
			cb.query().queryTPicMthdRcmd().setClientId_Equal(clientId);
			tPicMthdRcmdDataBhv.queryDelete(cb);
		}

		// ピッキング提案テーブル削除
		{
			TPicMthdRcmdCB cb = tPicMthdRcmdBhv.newMyConditionBean();
			cb.query().setCenterId_Equal(centerId);
			cb.query().setClientId_Equal(clientId);
			tPicMthdRcmdBhv.queryDelete(cb);
		}
	}

	/**
	 * 対象データ検索
	 */
	private List<TPackingB> selectTargetList(long centerId, long clientId, String systemDt, MParam param) {

		TPackingBCB cb = newSelectTargetConditionBean(centerId, clientId, systemDt, param, TargetCls.PIECE);

		return tPackingBBhv.selectList(cb);
	}

	/**
	 * 対象データ検索(ケースピッキング)
	 */
	private List<TPackingB> selectCaseTargetList(long centerId, long clientId, String systemDt, MParam param) {

		TPackingBCB cb = newSelectTargetConditionBean(centerId, clientId, systemDt, param, TargetCls.CASE);

		return tPackingBBhv.selectList(cb);
	}

	/**
	 * 対象データ検索の検索条件を作成
	 */
	private TPackingBCB newSelectTargetConditionBean(long centerId, long clientId, String systemDt, MParam param, TargetCls targetCls) {
		TPackingBCB cb = tPackingBBhv.newMyConditionBean();

		// 結合

		cb.setupSelect_TPackingH().withTPickingH().withTAllocInstH().withMDeliveryCourse().withMCarrier();
		cb.setupSelect_TPickingB().withTStock();
		cb.setupSelect_TPackingH().withTPickingH();
		cb.specify().specifyTPackingH().specifyTAllocInstH().derivedTShippingInstHList().max(new SubQuery<TShippingInstHCB>() {

			@Override
			public void query(TShippingInstHCB sihCb) {
				sihCb.specify().columnEmergencyFlg();
			}
		}, TPackingB.ALIAS_emergencyFlg);

		// 検索条件

		cb.query().queryTPackingH().setCenterId_Equal(centerId);
		cb.query().queryTPackingH().setClientId_Equal(clientId);
		switch (targetCls) {
		case PIECE:
			cb.query().queryTPackingH().setMixedFlg_Equal_$1();
			cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setPl1OutFlg_Equal_$0();
			cb.query().queryTPackingH().queryTPickingH().notExistsTPackingHList(new SubQuery<TPackingHCB>() {
				// 同じ出庫ヘッダのバラ分に出庫指示済以外のステータスがある場合は、バラ分の対象から外す
				@Override
				public void query(TPackingHCB packingHCb) {
					packingHCb.query().setMixedFlg_Equal_$1();
					packingHCb.query().setPackingStatus_NotEqual_$25();
				}
			});
			break;
		case CASE:
			cb.query().queryTPackingH().setMixedFlg_Equal_$0();
			cb.query().queryTPackingH().queryTPickingH().queryTPickingRAsOne().setCaseOutFlg_Equal_$0();
			cb.query().queryTPackingH().queryTPickingH().notExistsTPackingHList(new SubQuery<TPackingHCB>() {
				// 同じ出庫ヘッダのケース分に出庫指示済以外のステータスがある場合は、ケース分の対象から外す
				@Override
				public void query(TPackingHCB packingHCb) {
					packingHCb.query().setMixedFlg_Equal_$0();
					packingHCb.query().setPackingStatus_NotEqual_$25();
				}
			});
			break;
		}
		cb.query().queryTPackingH().queryTPickingH().queryTAllocInstH().setWorkDt_Equal(systemDt);

		// ソート順

		CDef.PicMthdRcmdBreakKey breakKey = param.getPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey();
		if (breakKey != null) {
			switch (breakKey) {
			case $1:
				// 配送コース
				cb.query().queryTPackingH().queryTPickingH().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
				break;
			case $2:
				// 運送業者
				cb.query().queryTPackingH().queryTPickingH().queryTAllocInstH().queryMDeliveryCourse().queryMCarrier().addOrderBy_CarrierCd_Asc();
				break;
			}
		}
		cb.query().queryTPackingH().addOrderBy_PickingHId_Asc();
		cb.query().addOrderBy_PackingHId_Asc();
		cb.query().queryTPickingB().queryTStock().addOrderBy_LocationId_Asc();
		return cb;
	}

	/**
	 * ピッキング提案用のファイルデータに変換
	 */
	private List<List<String>> convertFileData(List<TPackingB> packingBList, MParam param) {

		List<List<String>> fileData = new ArrayList<List<String>>();

		for (TPackingB packingB : packingBList) {

			List<String> rowData = new ArrayList<String>();

			String breakKey = "";
			CDef.PicMthdRcmdBreakKey breakKeySetting = param.getPicMthdRcmdBreakKeyAsPicMthdRcmdBreakKey();
			if (breakKeySetting != null) {
				switch (breakKeySetting) {
				case $1:
					// 配送コース
					breakKey = String.valueOf(packingB.getTPackingH().getTPickingH().getTAllocInstH().getDeliveryCourseId());
					break;
				case $2:
					// 運送業者
					breakKey = String.valueOf(packingB.getTPackingH().getTPickingH().getTAllocInstH().getMDeliveryCourse().getCarrierId());
					break;
				}
			}
			// 1列目 : ブレイクキー (配送コースIDまたは運送業者ID)
			rowData.add(breakKey);
			// 2列目 : 伝票番号 (出庫ヘッダID)
			rowData.add(String.valueOf(packingB.getTPackingH().getPickingHId()));
			// 3列目 : 緊急フラグ
			rowData.add(packingB.getEmergencyFlg());
			// 4列目 : 単行ピックフラグ
			rowData.add(packingB.getTPackingH().getTPickingH().getSglRowPicFlg());
			// 5列目 : 梱包番号 (梱包ヘッダID)
			rowData.add(String.valueOf(packingB.getPackingHId()));
			// 6列目 : ロケーション番号 (ロケーションID + 商品ID)
			rowData.add(convertFileDataLocation(packingB));
			// 7列目 : 商品番号 (商品ID)
			rowData.add(String.valueOf(packingB.getTPickingB().getTStock().getProductId()));
			// 8列目 : 梱包数
			rowData.add(String.valueOf(packingB.getPackingNum()));

			fileData.add(rowData);
		}

		return fileData;
	}

	/**
	 * <h2>ピッキング提案用のファイルデータ-ロケーション番号の文字列作成.</h2>
	 * <pre>
	 * 「ロケーションID-商品ID」文字列を作成。
	 * 1ロケーションに複数の商品が存在する場合、マテハン機器が導入されている棚を1ロケーションとしている場合が多い。
	 * そのため、ロケーションID + 商品ID をロケーション番号として
	 * ロケーションが同じでも商品が異なる場合は、トータルピックでまとめてピックしないようにする。
	 * </pre>
	 */
	private String convertFileDataLocation(TPackingB packingB) {
		return new StringBuilder()
				.append(String.valueOf(packingB.getTPickingB().getTStock().getLocationId()))
				.append("-")
				.append(String.valueOf(packingB.getTPickingB().getTStock().getProductId()))
				.toString();
	}

	/**
	 * 送信パラメータの作成
	 */
	private PmrApiSendParameterDto createParameterDto(MParam param) {

		PmrApiSendParameterDto parameterDto = new PmrApiSendParameterDto();
		parameterDto.setTotalFlg(Integer.valueOf(param.getTotalPicFlg()));
		parameterDto.setMultiFlg(Integer.valueOf(param.getMultiPicCls()));
		parameterDto.setSingleRowFlg(Integer.valueOf(param.getSglRowPicFlg()));
		if (param.isSglRowPicFlg$1()) {
			parameterDto.setSingleRowMaxNum(param.getSglRowPicMaxInstNum().intValue());
		}
		long cartBacketNum = CU.nullToZero(param.getBacketColNum()) * CU.nullToZero(param.getBacketRowNum());
		parameterDto.setCartBacketNum((int) cartBacketNum);
		return parameterDto;
	}

	/**
	 * 通信リクエスト作成
	 */
	private Invocation.Builder buildResteasyRequest(MParam param) throws NoSuchAlgorithmException, KeyManagementException {

		ResteasyClientBuilder cb = (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();

//		if (CONNECT_TIMEOUT != null) {
//			// 接続タイムアウト
//			cb.establishConnectionTimeout(CONNECT_TIMEOUT, TimeUnit.MILLISECONDS);
//		}
//
//		if (READ_TIMEOUT != null) {
//			// 応答タイムアウト
//			cb.socketTimeout(READ_TIMEOUT, TimeUnit.MILLISECONDS);
//		}

		if (!CU.isNullOrEmpty(PROXY_URL)) {
			// プロキシ設定

			if (PROXY_PORT == null) {
				cb.defaultProxy(PROXY_URL);
			} else {
				cb.defaultProxy(PROXY_URL, PROXY_PORT);
			}

			if (!CU.isNullOrEmpty(PROXY_USER)) {
				BasicAuthentication auth = new BasicAuthentication(PROXY_USER, PROXY_PASS);
				cb.register(auth);
			}
		}

		if (isSSL(API_URL)) {
			// SSL認証なしを設定

			SSLContext sslContext = SSLContext.getInstance("TLS");
			sslContext.init(null, new NonAuthentication[] { new NonAuthentication() }, null);
			cb.sslContext(sslContext);
		}

		ResteasyClient client = cb.build();

		Invocation.Builder builder = client.target(API_URL).request();

		String apiKey = param.getPicMthdRcmdApiKey();

		if (!CU.isNullOrEmpty(apiKey)) {
			// APIキー設定
			builder.header("x-api-key", apiKey);
		}

		return builder;
	}

	private boolean isSSL(String url) {

		return url.toLowerCase().contains("https");
	}

	/**
	 * <h2>ログ開始.</h2>
	 * <pre>
	 * 運用ログの開始処理
	 * ログ出力を開始する
	 * </pre>
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param pickingBatchNo 出庫指示バッチNo.
	 * @param dataCount
	 * @param processNo
	 */
	public void startLog() {

		outputLog = OutputLog.TRUE;
		outputLogCls = OutputLogCls.LOG;
	}

	/**
	 * <h2>ログセクション開始.</h2>
	 * <pre>
	 * 運用ログセクションの開始処理
	 * ログセクションを開始する
	 * </pre>
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param pickingBatchNo 出庫指示バッチNo.
	 * @param dataCount
	 * @param processNo
	 */
	public void startLogSection() {

		outputLog = OutputLog.TRUE;
		outputLogCls = OutputLogCls.SECTION;
	}

	/**
	 * ログ開始
	 */
	private void startLog(List<TPackingB> packingBList, MClientCenter clientCenter) {

		if (outputLog != OutputLog.TRUE) {
			return;
		}

		String centerCd = clientCenter.getMCenter().getCenterCd();
		String clientCd = clientCenter.getMClient().getClientCd();

		switch (outputLogCls) {
		case LOG:
			// ログの開始

			// プログラムCD設定
			getDatabaseLogger().setPgmCd(WmsMessageConst.PICKING_METHOD_RECOMMENDATION_PROGRAM_NAME);
			// 属性１設定(センターCD)
			getDatabaseLogger().setAttribute1(centerCd);
			// 属性２設定(荷主CD)
			getDatabaseLogger().setAttribute2(clientCd);
			// ログ開始
			getDatabaseLogger().startLog();
			break;
		case SECTION:
			// セクションの開始

			getDatabaseLogger().startLogDtl(WmsMessageConst.PICKING_METHOD_RECOMMENDATION_PROGRAM_NAME);
			break;
		}

		// 納品先件数計算
		Set<Long> pickingHIdSet = new HashSet<Long>();
		for (TPackingB packingB : packingBList) {
			pickingHIdSet.add(packingB.getTPackingH().getPickingHId());
		}

		// ログ追加（情報）
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.PICKING_METHOD_RECOMMENDATION_PARAMETER_INFORMATION,
				centerCd,
				clientCd,
				getDateString(clientCenter.getSystemDt()),
				String.valueOf(pickingHIdSet.size()),
				nullToHyphen(clientCenter.getMParamAsOne().chaseBClassDtlByPicMthdRcmdBreakKey().chaseVDict().getDictNm()));
	}

	/**
	 * <h2>ログ終了(正常)</h2>
	 * <pre>
	 * 運用ログの終了処理
	 * 運用ログを終了する
	 * </pre>
	 */
	public void endSuccessLog() {

		if (outputLog != OutputLog.TRUE) {
			return;
		}

		switch (outputLogCls) {
		case LOG:
			// ログ終了
			getDatabaseLogger().endSuccessLog();
			break;
		case SECTION:
			// セクション終了
			getDatabaseLogger().endLogDtl();
			break;
		}

		outputLog = OutputLog.FALSE;
	}

	/**
	 * <h2>エラーログを追加</h2>
	 * <pre>
	 * エラー管理クラスに登録されているエラーをログに出力する
	 * </pre>
	 */
	private void addErrorLog() {

		if (outputLog != OutputLog.TRUE) {
			return;
		}

		Map<Integer, BaseException> errorMap = getErrorManager().get();
		for (BaseException exp : errorMap.values()) {
			if (exp instanceof CommonException) {
				String messageCd = ((CommonException) exp).getMessageCd();
				List<String> replaceValue = ((CommonException) exp).getReplaceValue();

				if (replaceValue == null) {
					getDatabaseLogger().addErrorLogDtl(messageCd);
				} else {
					// [#6807][OSS]致命的エラー発生 2019.11.08 kawana Start
					getDatabaseLogger().addErrorLogDtl(messageCd, (String[]) replaceValue.toArray(new String[replaceValue.size()]));
					// [#6807][OSS]致命的エラー発生 2019.11.08 kawana End
				}
			}
		}
	}

	/**
	 * エラー明細の取得
	 */
	private String getErrorDetailMessage(List<PmrApiErrorDto> errorList) {

		if (errorList == null) {
			return "";
		}

		List<String> messageList = new ArrayList<String>();

		for (PmrApiErrorDto errorDto : errorList) {

			Integer errorCode = errorDto.getErrorCode();
			if (errorCode == null) {
				continue;
			}

			String errorCodeStr = errorCode.toString();
			String errMessage = CU.nullToStr(messageBundle.getString("E" + errorCodeStr));

			String pickingHId = errorDto.getSlipNo();
			String message;
			if (!CU.isNullOrEmpty(pickingHId)) {
				// 出庫作業No.を取得

				String pickingWorkNo = tPickingHBhv.selectByPKValueWithDeletedCheck(Long.valueOf(pickingHId)).getPickingWorkNo();

				message = messageLogic.getMessageNm(WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_PICKING_WORK_NO, errorCodeStr, errMessage, pickingWorkNo);
			} else {

				message = messageLogic.getMessageNm(WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL, errorCodeStr, errMessage);
			}
			messageList.add(message);
		}

		return CU.join("[/]", messageList);
	}

	/**
	 * <h2>出庫指示解除処理.</h2>
	 * <pre>
	 * 対象データがピッキング提案データに含まれる場合、
	 * ピッキング提案データを全削除する。
	 * </pre>
	 * @param shippingInstH 出庫指示ヘッダ : コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void shipInstructeDelete(TShippingInstH shippingInstH, ErrorStatus errSts) {

		final long controlNo = shippingInstH.getControlNo();

		// ピッキング提案データに含まれるか確認

		TPicMthdRcmdDataCB cb = tPicMthdRcmdDataBhv.newMyConditionBean();
		cb.setupSelect_TPickingH();
		cb.query().queryTPickingH().queryTAllocInstH().existsTShippingInstHList(new SubQuery<TShippingInstHCB>() {
			@Override
			public void query(TShippingInstHCB tsihCb) {
				tsihCb.query().setControlNo_Equal(controlNo);
			}
		});
		cb.fetchFirst(1);

		TPicMthdRcmdData data = tPicMthdRcmdDataBhv.selectEntity(cb);

		if (data == null) {
			// ピッキング提案データ未存在
			return;
		}

		// ピッキング提案テーブル削除
		deletePmrTable(data.getTPickingH().getCenterId(), data.getTPickingH().getClientId());
	}

	/**
	 * <h2>梱包削除処理.</h2>
	 * <pre>
	 * 対象データがピッキング提案データに含まれる場合、
	 * ピッキング提案データを全削除する。
	 * </pre>
	 * @param shippingInstH 出庫指示ヘッダ : コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void packingDelete(long packingHId) {

		// ピッキング提案データに含まれるか確認

		TPicMthdRcmdCartCB cb = tPicMthdRcmdCartBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.query().setPackingHId_Equal(packingHId);
		cb.fetchFirst(1);

		TPicMthdRcmdCart data = tPicMthdRcmdCartBhv.selectEntity(cb);

		if (data == null) {
			// ピッキング提案データ未存在
			return;
		}

		// ピッキング提案テーブル削除
		deletePmrTable(data.getTPackingH().getCenterId(), data.getTPackingH().getClientId());
	}

	private static class NonAuthentication implements X509TrustManager {
		@Override
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		@Override
		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}

		@Override
		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}
	}

	/**
	 * <h2>StringのYYYY/MM/DD形式に変換する。</h2>
	 * <pre>
	 * 日付のYYYYMMDD⇒YYYY/MM/DD形式に変換する。
	 * </pre>
	 * @param value 文字列
	 * @return String 文字列
	 */
	private String getDateString(String value) {

		if (value == null || value.length() < 8) {
			return "";
		}
		// 年
		String year = value.substring(0, 4);
		// 月
		String month = value.substring(4, 6);
		// 日
		String day = value.substring(6, 8);
		// YYYY/MM/DD形式
		String dateString = year + "/" + month + "/" + day;

		return dateString;
	}

	private String nullToHyphen(String value) {

		if (CU.isNullOrEmpty(value)) {
			return "-";
		}

		return value;
	}

	/**
	 * MIN-MAX設定クラス
	 * (最適ピッキング提案.配送コース、運送業者設定用)
	 */
	private static class MinMaxCdSetter {

		String minCd = null;
		String maxCd = null;
		String minNm = null;
		String maxNm = null;

		public void set(String cd, String nm) {

			if (minCd == null) {
				minCd = cd;
				minNm = nm;
			} else {

				if (0 < minCd.compareTo(cd)) {
					// minCdより小さい

					minCd = cd;
					minNm = nm;
				}
			}

			if (maxCd == null) {
				maxCd = cd;
				maxNm = nm;
			} else {

				if (0 < cd.compareTo(maxCd)) {
					// maxCdより大きい

					maxCd = cd;
					maxNm = nm;
				}
			}
		}

		public String getMinMaxCd() {

			if (minCd.equals(maxCd)) {
				// 同じ配送コース
				return minCd;
			}

			return new StringBuilder()
					.append(minCd)
					.append("-")
					.append(maxCd).toString();
		}

		public String getMinMaxNm() {

			if (minCd.equals(maxCd)) {
				// 同じ配送コース
				return minNm;
			}

			return new StringBuilder()
					.append(minNm)
					.append(" - ")
					.append(maxNm).toString();
		}
	}
}
