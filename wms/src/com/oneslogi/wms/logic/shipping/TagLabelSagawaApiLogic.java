package com.oneslogi.wms.logic.shipping;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import javax.inject.Inject;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.exbhv.TPackingHBhv;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.print.logic.PdfFileSaveLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.TagLabelDto;
import com.oneslogi.wms.dto.report.TagLabelSgwDto;
import com.oneslogi.wms.util.WCU;
import com.oneslogi.wms.xml.CheckFileRequest;
import com.oneslogi.wms.xml.CheckFileResponse;
import com.oneslogi.wms.xml.CustomerAuth;
import com.oneslogi.wms.xml.ErrorShippingNumberDetail;
import com.oneslogi.wms.xml.ItemList;
import com.oneslogi.wms.xml.NouhinshoData;
import com.oneslogi.wms.xml.PrintDataDetail;
import com.oneslogi.wms.xml.PrintDataList;
import com.oneslogi.wms.xml.PrintRequestIdList;
import com.oneslogi.wms.xml.ResultCodeList;
import com.oneslogi.wms.xml.RetryPrintRequest;
import com.oneslogi.wms.xml.RetryPrintResponse;
import com.oneslogi.wms.xml.ShippingNumberList;
import com.oneslogi.wms.xml.ShippingRequest;
import com.oneslogi.wms.xml.ShippingResponse;
import com.oneslogi.wms.xml.UkewatashiDetail;
import com.oneslogi.wms.xml.UkewatashiRequest;
import com.oneslogi.wms.xml.UkewatashiResponse;

/**
 * 佐川荷札作成APIロジック
 */
public class TagLabelSagawaApiLogic extends AbstractWmsLogic {

	// ===== 変数 =====
	private static final ResourceBundle messageBundle = ResourceBundle.getBundle("SagawaApiMessage");

	private static final Integer READ_TIMEOUT;
	private static final Integer CONNECT_TIMEOUT;
	private static final Set<String> RETRY_ERR_CD_SET;
	private static final int RETRY_INTERVAL;
	private static final int RETRY_MAX_COUNT;
	private static final String PROXY_URL;
	private static final String PROXY_PORT;
	private static final String PROXY_USER;
	private static final String PROXY_PASS;

	private static final String URL_METHOD_SEND_DATA = "/shipping";
	private static final String URL_METHOD_SEND_RETRY = "/retryprint";
	private static final String URL_METHOD_SEND_DELIVERY = "/ukewatashi";
	private static final String URL_METHOD_REQUEST_DL_URL = "/checkfile";

	private enum Api {
		SEND_DATA,
		SEND_RETRY,
		SEND_DELIVERY,
		REQUEST_DL_URL
	};

	private static Map<Api, JAXBContext> JAXB_CONTEXT_SEND_MAP;
	private static Map<Api, JAXBContext> JAXB_CONTEXT_RESPONSE_MAP;

	// ===== 使用テーブル =====
	@Inject
	private TPackingHBhv tPackingHBhv;
	@Inject
	private TPackingRBhv tPackingRBhv;

	// ===== 使用ロジック =====
	@Inject
	private PdfFileSaveLogic pdfFileSaveLogic;
	// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
	@Inject
	private MessageLogic messageLogic;
	// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End

	static {

		// ===== PROXY設定の読込 =====
		ResourceBundle apiSettingBundle = null;
		try {
			apiSettingBundle = ResourceBundle.getBundle("SagawaApi");
		} catch (Exception e) {
			// ファイル未存在の場合もあるのでエラー時は何もしない
			apiSettingBundle = null;
		}

		String retryErrCd;
		if (apiSettingBundle != null) {
			READ_TIMEOUT = getIntValue(apiSettingBundle.getString("READ_TIMEOUT"));
			CONNECT_TIMEOUT = getIntValue(apiSettingBundle.getString("CONNECT_TIMEOUT"));
			retryErrCd = apiSettingBundle.getString("RETRY_ERR_CD");
			RETRY_INTERVAL = getIntValue(apiSettingBundle.getString("RETRY_INTERVAL"), 200);
			RETRY_MAX_COUNT = getIntValue(apiSettingBundle.getString("RETRY_MAX_COUNT"), 5);
			PROXY_URL = apiSettingBundle.getString("PROXY_URL");
			PROXY_PORT = apiSettingBundle.getString("PROXY_PORT");
			PROXY_USER = apiSettingBundle.getString("PROXY_USER");
			PROXY_PASS = apiSettingBundle.getString("PROXY_PASSWORD");
		} else {
			READ_TIMEOUT = null;
			CONNECT_TIMEOUT = null;
			retryErrCd = null;
			RETRY_INTERVAL = 200;
			RETRY_MAX_COUNT = 5;
			PROXY_URL = null;
			PROXY_PORT = null;
			PROXY_USER = null;
			PROXY_PASS = null;
		}

		String[] retryErrCdList;
		if (CU.isNullOrEmpty(retryErrCd)) {
			retryErrCdList = new String[0];
		} else {
			retryErrCdList = retryErrCd.split(",");
		}

		RETRY_ERR_CD_SET = new HashSet<String>(Arrays.asList(retryErrCdList));

		// ===== JAXB Context 生成 =====
		// 速度改善のためあらかじめ作成しておく
		JAXB_CONTEXT_SEND_MAP = new HashMap<TagLabelSagawaApiLogic.Api, JAXBContext>();
		JAXB_CONTEXT_RESPONSE_MAP = new HashMap<TagLabelSagawaApiLogic.Api, JAXBContext>();

		try {
			JAXB_CONTEXT_SEND_MAP.put(Api.SEND_DATA, JAXBContext.newInstance(ShippingRequest.class));
			JAXB_CONTEXT_SEND_MAP.put(Api.SEND_RETRY, JAXBContext.newInstance(RetryPrintRequest.class));
			JAXB_CONTEXT_SEND_MAP.put(Api.SEND_DELIVERY, JAXBContext.newInstance(UkewatashiRequest.class));
			JAXB_CONTEXT_SEND_MAP.put(Api.REQUEST_DL_URL, JAXBContext.newInstance(CheckFileRequest.class));

			JAXB_CONTEXT_RESPONSE_MAP.put(Api.SEND_DATA, JAXBContext.newInstance(ShippingResponse.class));
			JAXB_CONTEXT_RESPONSE_MAP.put(Api.SEND_RETRY, JAXBContext.newInstance(RetryPrintResponse.class));
			JAXB_CONTEXT_RESPONSE_MAP.put(Api.SEND_DELIVERY, JAXBContext.newInstance(UkewatashiResponse.class));
			JAXB_CONTEXT_RESPONSE_MAP.put(Api.REQUEST_DL_URL, JAXBContext.newInstance(CheckFileResponse.class));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private static Integer getIntValue(String s) {
		if (CU.isNullOrEmpty(s)) {
			return null;
		} else {
			return Integer.valueOf(s);
		}
	}

	private static int getIntValue(String s, int i) {
		if (CU.isNullOrEmpty(s)) {
			return i;
		} else {
			return Integer.valueOf(s);
		}
	}

	/**
	 * <h2>佐川API荷札PDF作成.</h2>
	 * <pre>
	 * 以下の手順で佐川送り状マスタのWebAPIリクエストURLに
	 * 荷札の作成依頼をし、作成されたPDFをダウンロードする。
	 *
	 * 1.荷札データ送信 (佐川API)
	 * 2.梱包ヘッダの貨物追跡Noの更新 (佐川APIで受信した問合せ番号を使用)
	 * 3.荷札(PDF)のダウンロードURLを取得 (佐川API)
	 * 4.荷札(PDF)をダウンロードし一時フォルダに保存
	 * 5.保存した荷札(PDF)を返却
	 *
	 * PDFはWebAPIリクエストAPI、カスタマーID、WebAPI送り状コード単位に作成される。
	 * </pre>
	 * @param dataList 荷札データ
	 * @param errSts エラー時に設定するステータス
	 *
	 * @return List<File> ダウンロードした荷札(PDF)のリスト
	 */
	public List<File> createTagPdf(List<TagLabelDto> dataList, ErrorStatus errSts) {

		// ===== 出庫作業No.毎にデータをまとめる =====

		Collection<TagLabelSgwDto> sgwDataList;
		{
			Map<String, TagLabelSgwDto> dataMap = new LinkedHashMap<String, TagLabelSgwDto>();

			for (TagLabelDto data : dataList) {

				// [#457] 変数の使い回し(出庫作業No.)を修正 2016.12.16 kawana Start
				// 利用者側管理番号
				String userManageNumber = data.getPickingWorkNo();
				if (data.getMixedFlg().equals("0")) {
					// 単品(ケース) は 管理番号の末尾に「C」を付加
					userManageNumber = new StringBuilder().append(userManageNumber).append("C").toString();
				}

				TagLabelSgwDto mainData;
				if (dataMap.containsKey(userManageNumber)) {
					mainData = dataMap.get(userManageNumber);
				} else {
					mainData = (TagLabelSgwDto) data;
					// 利用者側管理番号を設定
					mainData.setUserManageNumber(userManageNumber);
					dataMap.put(userManageNumber, mainData);
				}
				// [#457] 変数の使い回し(出庫作業No.)を修正 2016.12.16 kawana End

				// 出力対象の梱包番号(個口分子)を追加
				mainData.addOutPackingIndex(data.getPackingIndex());
			}

			sgwDataList = dataMap.values();
		}

		// 戻り値 (荷札PDFリスト)
		List<File> pdfFileList = new ArrayList<File>();

		// ===== 個口用ダウンロードURLより荷札取得 =====

		List<File> pdfFileListUseDbUrl = downloadPdfUseDbUrl(sgwDataList);
		pdfFileList.addAll(pdfFileListUseDbUrl);

		// ===== ログインID毎にデータをまとめる =====

		Map<WebApiKey, List<TagLabelSgwDto>> dataMap = new LinkedHashMap<WebApiKey, List<TagLabelSgwDto>>();

		for (TagLabelSgwDto dto : sgwDataList) {

			if (dto.isDownloaded()) {
				// ダウンロード済
				continue;
			}

			// [#470] 荷札出力で致命的エラー(URL設定チェックを移動) 2016.12.15 kawana Start
			String webApiUrl = dto.getWebApiRequestUrl();
			if (CU.isNullOrEmpty(webApiUrl)) {
				// エラー
				getErrorManager().add(errSts, WmsMessageConst.WEB_API_REQUEST_URL_NOT_FOUND_ERROR);
				return null;
			}

			String loginId = dto.getCustomerId();
			if (CU.isNullOrEmpty(loginId)) {
				// エラー
				getErrorManager().add(errSts, WmsMessageConst.WEB_API_CUSTOMER_ID_NOT_FOUND_ERROR);
				return null;
			}

			WebApiKey key = new WebApiKey(webApiUrl, loginId);
			// [#470] 荷札出力で致命的エラー(URL設定チェックを移動) 2016.12.15 kawana End

			if (dataMap.containsKey(key)) {
				dataMap.get(key).add(dto);
			} else {
				List<TagLabelSgwDto> list = new ArrayList<TagLabelSgwDto>();
				list.add(dto);
				dataMap.put(key, list);
			}
		}

		// ===== ログインID毎に処理 =====

		for (List<TagLabelSgwDto> list : dataMap.values()) {
			String webApiUrl = list.get(0).getWebApiRequestUrl();
			String loginId = list.get(0).getCustomerId();
			String loginPassword = list.get(0).getLoginPassword();

			// [#470] 荷札出力で致命的エラー(URL設定チェックを移動) ここから削除 2016.12.15 kawana

			// ユーザ情報作成
			CustomerAuth auth = new CustomerAuth();
			auth.setCustomerId(loginId);
			auth.setLoginPassword(loginPassword);

			RequestIdInfo requestInfo = new RequestIdInfo();

			// ===== 再発行 =====
			{
				RequestIdInfo info = sendRetry(webApiUrl, auth, list, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}
				if (info != null) {
					requestInfo.addAllInfo(info);
				}
			}

			// ===== データ送信 =====
			{
				RequestIdInfo info = sendPdfData(webApiUrl, auth, list, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}
				if (info != null) {
					requestInfo.addAllInfo(info);
				}
			}

			// ===== PDFダウンロードURL取得 =====

			DownloadUrlInfo downloadUrlInfo = requestDownloadUrl(webApiUrl, auth, requestInfo.getRequestIdSet(), errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== PDFダウンロード =====

			// ダウンロードURLの作成
			List<String> pdfUrlList = createPdfUrlList(list, requestInfo, downloadUrlInfo);

			for (String url : pdfUrlList) {
				File pdfFile = downloadPdf(url, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}

				pdfFileList.add(pdfFile);
			}
		}

		return pdfFileList;
	}

	/**
	 * <h2>佐川API荷物受渡書PDF作成.</h2>
	 * <pre>
	 * 以下の手順で佐川送り状マスタのWebAPIリクエストURLに
	 * 荷物受渡書の作成依頼をし、作成されたPDFをダウンロードする。
	 *
	 * 1.荷物受渡書データ送信 (佐川API)
	 * 2.荷物受渡書(PDF)のダウンロードURLを取得 (佐川API)
	 * 3.荷物受渡書(PDF)をダウンロードし一時フォルダに保存
	 * 4.保存した荷札(PDF)を返却
	 *
	 * PDFはWebAPIリクエストAPI、カスタマーID、WebAPI送り状コード単位に作成される。
	 * </pre>
	 * @param dataList 荷札データ
	 * @param errSts エラー時に設定するステータス
	 *
	 * @return List<File> ダウンロードした荷札(PDF)のリスト
	 */
	public List<File> createDeliveryPdf(List<TagLabelDto> dataList, ErrorStatus errSts) {

		// ===== ログインID毎にデータをまとめる =====

		Map<WebApiKey, List<TagLabelSgwDto>> dataMap = new LinkedHashMap<WebApiKey, List<TagLabelSgwDto>>();

		for (TagLabelDto data : dataList) {
			TagLabelSgwDto dto = (TagLabelSgwDto) data;

			// [#470] 荷札出力で致命的エラー(URL設定チェックを移動) 2016.12.15 kawana Start
			String webApiUrl = dto.getWebApiRequestUrl();
			if (CU.isNullOrEmpty(webApiUrl)) {
				// エラー
				getErrorManager().add(errSts, WmsMessageConst.WEB_API_REQUEST_URL_NOT_FOUND_ERROR);
				return null;
			}

			String loginId = dto.getCustomerId();
			if (CU.isNullOrEmpty(loginId)) {
				// エラー
				getErrorManager().add(errSts, WmsMessageConst.WEB_API_CUSTOMER_ID_NOT_FOUND_ERROR);
				return null;
			}

			WebApiKey key = new WebApiKey(webApiUrl, loginId);
			// [#470] 荷札出力で致命的エラー(URL設定チェックを移動) 2016.12.15 kawana End

			if (dataMap.containsKey(key)) {
				dataMap.get(key).add(dto);
			} else {
				List<TagLabelSgwDto> list = new ArrayList<TagLabelSgwDto>();
				list.add(dto);
				dataMap.put(key, list);
			}
		}

		// ===== ログインID毎に処理 =====

		List<File> pdfFileList = new ArrayList<File>();

		for (List<TagLabelSgwDto> list : dataMap.values()) {
			String webApiUrl = list.get(0).getWebApiRequestUrl();
			String loginId = list.get(0).getCustomerId();
			String loginPassword = list.get(0).getLoginPassword();

			// [#470] 荷札出力で致命的エラー(URL設定チェックを移動) ここから削除 2016.12.15 kawana

			// ユーザ情報作成
			CustomerAuth auth = new CustomerAuth();
			auth.setCustomerId(loginId);
			auth.setLoginPassword(loginPassword);

			// ===== データ送信 =====
			Set<String> requestIdSet = sendDeliveryData(webApiUrl, auth, list, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== PDFダウンロードURL取得 =====
			DownloadUrlInfo downloadUrlInfo = requestDownloadUrl(webApiUrl, auth, requestIdSet, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			// ===== PDFダウンロード =====
			for (String url : downloadUrlInfo.getDownloadUrlList()) {
				File pdfFile = downloadPdf(url, errSts);
				if (0 < getErrorManager().size()) {
					return null;
				}

				pdfFileList.add(pdfFile);
			}
		}

		return pdfFileList;
	}

	/**
	 * <h2>個口用PDFファイルの取得(DB仕様)</h2>
	 * <pre>
	 * DBに登録されている個口用ダウンロードURLを使用して、
	 * PDFファイルを取得する。
	 * </pre>
	 */
	private List<File> downloadPdfUseDbUrl(Collection<TagLabelSgwDto> sgwDataList) {

		// 戻り値 (荷札PDFファイルリスト)
		List<File> pdfFileList = new ArrayList<File>();

		for (TagLabelSgwDto dto : sgwDataList) {

			// 追跡番号
			String shippingNumber = dto.getCarrierTraceNum();

			if (CU.isNullOrEmpty(shippingNumber)) {
				// 追跡番号なし
				continue;
			}

			// 印刷対象の個口
			Set<Integer> outIndexSet = dto.getOutPackingIndexSet();

			if (dto.getPackingNum().intValue() <= outIndexSet.size()) {
				// 全て印刷 (個口単位の印刷でない)
				continue;
			}

			// ===== 追跡番号を条件に梱包帳票を検索 =====

			TPackingRCB cb = tPackingRBhv.newMyConditionBean();
			cb.checkInvalidQuery();
			cb.query().queryTPackingH().setCarrierTraceNum_Equal(shippingNumber);
			cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();

			List<TPackingR> packingRList = tPackingRBhv.selectList(cb);

			// ===== ダウンロードURLからPDFファイルをダウンロード =====

			List<File> prePdfList = new ArrayList<File>();

			int index = 0;
			boolean isAllDl = true;
			for (TPackingR packingR : packingRList) {

				index++;

				if (!outIndexSet.contains(index)) {
					// 今回のダウンロード対象以外

					continue;
				}

				String pdfUrl = packingR.getTagDlUrl();
				if (CU.isNullOrEmpty(pdfUrl)) {
					// ダウンロードURLなし

					isAllDl = false;
					break;
				}

				// PDFダウンロード ※エラーとならないようにエラーステータスにnullを指定
				File pdfFile = downloadPdf(pdfUrl, null);
				if (pdfFile == null) {
					// ダウンロード失敗

					isAllDl = false;
					break;
				}

				// ダウンロード成功
				prePdfList.add(pdfFile);
				packingR.setTagDlUrl(null);
				tPackingRBhv.update(packingR);
			}

			if (isAllDl) {
				// 出庫作業No単位に全てOKだった場合のみPDFを追加

				pdfFileList.addAll(prePdfList);
				dto.setDownloaded(true);
			}
		}

		return pdfFileList;
	}

	/**
	 * 発行データ送信
	 */
	private RequestIdInfo sendPdfData(String webApiUrl, CustomerAuth auth, List<TagLabelSgwDto> dataList, ErrorStatus errSts) {

		// 送り状コード単位のXMLデータ作成
		List<ShippingRequest> sendDataList = sendPdfDataCreateXml(auth, dataList, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 後で追跡番号を設定するために利用者側管理番号をキーにdtoマップを作成
		Map<String, TagLabelSgwDto> dtoMap = new HashMap<String, TagLabelSgwDto>();
		for (TagLabelSgwDto dto : dataList) {

			// [#457] 変数の使い回し(出庫作業No.)を修正 2016.12.16 kawana Start
			dtoMap.put(dto.getUserManageNumber(), dto);
			// [#457] 変数の使い回し(出庫作業No.)を修正 2016.12.16 kawana End
		}

		RequestIdInfo info = new RequestIdInfo();

		for (ShippingRequest sendData : sendDataList) {

			// 送信実行 (XML受信)
			ShippingResponse responseData = (ShippingResponse) postWithRetry(url(webApiUrl, URL_METHOD_SEND_DATA), sendData, Api.SEND_DATA, errSts,
					WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_DATA_ERROR);
			if (0 < getErrorManager().size()) {
				return null;
			}

			PrintDataList pdl = responseData.getPrintDataList();
			if (pdl == null) {
				continue;
			}

			List<PrintDataDetail> pddList = pdl.getPrintDataDetail();
			if (pddList == null) {
				continue;
			}

			// 戻り値 設定
			String requestId = responseData.getPrintRequestId();

			for (PrintDataDetail pdd : pddList) {

				String userManageNumber = pdd.getUserManageNumber();

				// ===== 梱包ヘッダの追跡番号を設定 =====
				ShippingNumberList snl = pdd.getShippingNumberList();
				List<String> snList = snl.getShippingNumber();
				// ※※※ 1件目の番号を追跡番号として使用
				String shippingNumber = snList.get(0);
				updateCarrierTraceNo(userManageNumber, shippingNumber);

				// インプットdtoにも追跡番号を設定
				dtoMap.get(userManageNumber).setCarrierTraceNum(shippingNumber);

				// 戻り値 設定
				info.addRequestId(requestId, shippingNumber);
			}
		}

		return info;
	}

	/**
	 * 発行データ送信XML作成
	 * 送り状コード単位にXMLが作成される
	 */
	private List<ShippingRequest> sendPdfDataCreateXml(CustomerAuth auth, List<TagLabelSgwDto> dataList, ErrorStatus errSts) {

		// 発行データXMLクラスのマップ(キー：送り状コード)
		Map<String, ShippingRequest> requestMap = new HashMap<String, ShippingRequest>();

		// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana Start
		Set<String> errDataSet = new HashSet<String>();
		// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana End

		for (TagLabelSgwDto data : dataList) {

			if (!CU.isNullOrEmpty(data.getCarrierTraceNum())) {
				// 再発行済
				continue;
			}

			// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana Start

			String pickingWorkNo = data.getPickingWorkNo();
			if (errDataSet.contains(pickingWorkNo)) {
				// エラーデータ(エラーチェック済)
				// ※ ケース分とピース分で2重チェックするとエラーも2倍になるため
				// ※ 1回エラーチェックした出庫作業No.はチェックしない
				continue;
			}

			// データチェック
			if (sendPdfDataCreateXmlIsErrData(data, errSts)) {
				// データ不正

				errDataSet.add(pickingWorkNo);
				continue;
			}

			// 送り状コード
			String okuriCode = data.getApiOkuriCode();

			// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana End

			PrintDataList pdl;
			if (requestMap.containsKey(okuriCode)) {

				pdl = requestMap.get(okuriCode).getPrintDataList();
			} else {

				ShippingRequest sr = new ShippingRequest();
				sr.setCustomerAuth(auth); // ユーザ認証
				sr.setPrintOutFlg(1); // 送り状発行依頼フラグ
				sr.setOkuriCode(okuriCode); // 送り状コード
				sr.setOutputLevel("000"); // 出力レベル
				sr.setBackLayerFlg(0); // 下敷画像表示フラグ
				pdl = new PrintDataList();
				sr.setPrintDataList(pdl);

				requestMap.put(okuriCode, sr);
			}

			PrintDataDetail pdd = new PrintDataDetail();

			// [#457] 変数の使い回し(出庫作業No.)を修正 2016.12.16 kawana Start
			pdd.setUserManageNumber(data.getUserManageNumber()); // 利用者側管理番号 ※必須
			// [#457] 変数の使い回し(出庫作業No.)を修正 2016.12.16 kawana End
			pdd.setHaisoKosu(data.getPackingNum()); // 配送個数 ※必須
			pdd.setKokyakuCode(data.getSlipCustomerCd()); // 顧客コード ※必須

			String[] splitDelivAddr = joinAndFullStrAndSplitLen(25, data.getDelivAddress1(), data.getDelivAddress2(), data.getDelivAddress3());
			if (0 < splitDelivAddr.length) {
				pdd.setOtodokeAdd1(splitDelivAddr[0]); // 届先住所1 ※必須
			}
			if (1 < splitDelivAddr.length) {
				pdd.setOtodokeAdd2(splitDelivAddr[1]); // 届先住所2
			}
			if (2 < splitDelivAddr.length) {
				pdd.setOtodokeAdd3(splitDelivAddr[2]); // 届先住所3
			}

			String[] splitDelivNm = fullStrAndSplitLen(25, data.getDelivCustomerNm());
			if (0 < splitDelivNm.length) {
				pdd.setOtodokeNm1(splitDelivNm[0]); // 届先氏名1 ※必須
			}
			if (1 < splitDelivNm.length) {
				pdd.setOtodokeNm2(splitDelivNm[1]); // 届先氏名2
			}

			pdd.setOtodokeYubin(data.getDelivZipCd()); // 届先郵便番号 ※必須
			pdd.setOtodokeTel(data.getDelivTelNo()); // 届先電話番号 ※必須
			pdd.setOtodokeMailAddress(null);// 届先メールアドレス
			pdd.setIraiPrintFlg(0); // 依頼主指定フラグ ※必須

			String[] splitSlipClientAddress = joinAndFullStrAndSplitLen(25, data.getSlipClientAddress1(), data.getSlipClientAddress2());
			if (0 < splitSlipClientAddress.length) {
				pdd.setIraiAdd1(splitSlipClientAddress[0]); // 依頼主住所1 ※必須
			}
			if (1 < splitSlipClientAddress.length) {
				pdd.setIraiAdd2(splitSlipClientAddress[1]); // 依頼先住所2
			}
			if (2 < splitSlipClientAddress.length) {
				pdd.setIraiAdd3(splitSlipClientAddress[2]); // 依頼先住所3
			}
			pdd.setIraiNm1(fullStrAndSplitLen(25, data.getSlipClientNm1())[0]); // 依頼主氏名1 ※必須
			pdd.setIraiNm2(fullStrAndSplitLen(25, data.getSlipClientNm2())[0]); // 依頼主氏名2
			pdd.setIraiYubin(data.getSlipClientZipCd()); // 依頼主郵便番号 ※必須
			pdd.setIraiTel(data.getSlipClientTelNo()); // 依頼主電話番号 ※必須
			pdd.setIraiMailAddress(null); // 依頼主メールアドレス
			pdd.setShippingDate(data.getShippingDt()); // 発送日
			pdd.setKiji1(fullStrAndSplitLen(32, data.getSlipItemNm1())[0]); // 記事1 (品名等に使用)
			pdd.setKiji2(fullStrAndSplitLen(32, data.getSlipItemNm2())[0]); // 記事2 (品名等に使用)
			pdd.setKiji3(fullStrAndSplitLen(32, data.getSlipItemNm3())[0]); // 記事3 (品名等に使用)
			pdd.setKiji4(fullStrAndSplitLen(32, data.getSlipItemNm4())[0]); // 記事4 (品名等に使用)
			pdd.setKiji5(fullStrAndSplitLen(32, data.getSlipItemNm5())[0]); // 記事4 (品名等に使用)
			pdd.setKiji6(null); // 記事6 (品名等に使用)
			pdd.setBinsyuCode(data.getApiBinsyuCode()); // 便種コード ※必須
			if (data.getIsFirst().equals("1")) {
				// 1箱目

				// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana Start
				String daibikiFlg = data.getApiDaibikiFlg();
				pdd.setDaibikiFlg(daibikiFlg); // 代金引換フラグ ※必須
				if (daibikiFlg.equals("1")) {

					pdd.setDaibikiType(data.getApiDaibikiType()); // 代引支払方法区分
					pdd.setDaibikiKingaku(data.getCod().toString()); // 代引金額 ※代引の場合、必須
					pdd.setDaibikiTax(data.getCodTax().toString()); // 代引消費税 ※代引の場合、必須
				} else {

					pdd.setDaibikiType(null);
					pdd.setDaibikiKingaku(null);
					pdd.setDaibikiTax(null);
				}
				// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana End
			} else {
				pdd.setDaibikiFlg("0");
				pdd.setDaibikiType(null);
				pdd.setDaibikiKingaku(null);
				pdd.setDaibikiTax(null);
			}
			pdd.setShiteiDate(data.getDelivDt()); // 配達指定日
			pdd.setShiteiTimeCode(data.getDelivTz()); // 配達時間コード
			pdd.setWeight1(data.getApiWeightCd1()); // 重量1
			pdd.setWeight2(data.getApiWeightCd2()); // 重量2
			pdd.setCareSeal1(data.getSealType1()); // シール1
			pdd.setCareSeal2(data.getSealType2()); // シール2
			pdd.setCareSeal3(data.getSealType3()); // シール3
			pdd.setHokenKingaku(null); // 保険金額
			pdd.setEidomeFlg(data.getApiEidomeFlg()); // 営止めフラグ
			if (CU.nullToStr(pdd.getEidomeFlg()).equals("1")) {
				pdd.setDepotCode(data.getArrivalStoreCd()); // 営業所コード
			}

			// 必須タグを追加
			NouhinshoData nd = new NouhinshoData();
			nd.setItemList(new ItemList());
			pdd.setNouhinshoData(nd);

			pdl.addPrintDataDetail(pdd);
		}

		return new ArrayList<ShippingRequest>(requestMap.values());
	}

	// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana Start
	/**
	 * 発行データ送信XML作成前データチェック
	 */
	private boolean sendPdfDataCreateXmlIsErrData(TagLabelSgwDto data, ErrorStatus errSts) {

		boolean isErr = false;
		String pickingWorkNo = data.getPickingWorkNo();

		// 送り状コード
		if (CU.isNullOrEmpty(data.getApiOkuriCode())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_OKURI_CODE_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 顧客コード
		if (CU.isNullOrEmpty(data.getSlipCustomerCd())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_SLIP_CUSTOMER_CD_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 届先住所
		if (CU.isNullOrEmpty(data.getDelivAddress1()) && CU.isNullOrEmpty(data.getDelivAddress2()) && CU.isNullOrEmpty(data.getDelivAddress3())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_DELIV_ADDRESS_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 届先名称
		if (CU.isNullOrEmpty(data.getDelivCustomerNm())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_DELIV_CUSTOMER_NM_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 届先郵便番号
		if (CU.isNullOrEmpty(data.getDelivZipCd())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_DELIV_ZIP_CD_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 届先電話番号
		if (CU.isNullOrEmpty(data.getDelivTelNo())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_DELIV_TEL_NO_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 便種コード
		if (CU.isNullOrEmpty(data.getApiBinsyuCode())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_BINSYU_CODE_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		}

		// 代引フラグ
		if (CU.isNullOrEmpty(data.getApiDaibikiFlg())) {

			getErrorManager().add(errSts, WmsMessageConst.WEB_API_DAIBIKI_FLG_NOT_FOUND_ERROR, pickingWorkNo);
			isErr = true;
		} else {

			if (data.getIsFirst().equals("1") && data.getApiDaibikiFlg().equals("1")) {

				if (CU.nullToZero(data.getCod()).longValue() < 1) {
					// 代引金額
					getErrorManager().add(errSts, WmsMessageConst.WEB_API_COD_NOT_FOUND_ERROR, pickingWorkNo);
					isErr = true;
				}
			}
		}

		return isErr;
	}

	// [#457] 佐川荷札発行の必須エラーチェック追加 2016.12.16 kawana End

	/**
	 * 梱包ヘッダに追跡番号の設定
	 * @param pickingWorkNo 出庫作業No
	 * @param shippingNumber 追跡番号
	 */
	private void updateCarrierTraceNo(String pickingWorkNo, String shippingNumber) {

		boolean isCase = false;
		if (pickingWorkNo.endsWith("C")) {
			isCase = true;
			pickingWorkNo = pickingWorkNo.substring(0, pickingWorkNo.length() - 1);
		}

		TPackingH updateEntity = new TPackingH();
		updateEntity.setCarrierTraceNum(shippingNumber);

		TPackingHCB cb = tPackingHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(getCenterClassCondition());
		// 出庫作業No単位
		cb.query().queryTPickingH().setPickingWorkNo_Equal(pickingWorkNo);
		if (isCase) {
			cb.query().setMixedFlg_Equal_$0();
		} else {
			cb.query().setMixedFlg_Equal_$1();
		}

		tPackingHBhv.queryUpdate(updateEntity, cb);
	}

	private String[] joinAndFullStrAndSplitLen(int splitLength, String... strs) {

		String joinStr = CU.join("", strs);

		return fullStrAndSplitLen(splitLength, joinStr);
	}

	private String[] fullStrAndSplitLen(int splitLength, String str) {

		if (CU.isNullOrEmpty(str)) {
			return new String[] { str };
		}

		return WCU.splitLen(CU.getFullString(str), splitLength);
	}

	private String getErrMessage(ErrCd errCd) {

		// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start

		final String cd = CU.nullToStr(errCd.getResultCode());
		final String errMessage = CU.nullToStr(messageBundle.getString(cd));
		final String userManageNumber = errCd.getUserManageNumber();
		final String shippingNumber = errCd.getShippingNumber();

		String message;
		if (!CU.isNullOrEmpty(userManageNumber)) {

			message = messageLogic.getMessageNm(WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_PICKING_WORK_NO, cd, errMessage, userManageNumber);
		} else if (!CU.isNullOrEmpty(shippingNumber)) {

			message = messageLogic.getMessageNm(WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL_WITH_CARRIER_TRACE_NUM, cd, errMessage, shippingNumber);
		} else {

			message = messageLogic.getMessageNm(WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_ERROR_DETAIL, cd, errMessage);
		}

		return message;

		// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
	}

	private RequestIdInfo sendRetry(String webApiUrl, CustomerAuth auth, List<TagLabelSgwDto> dataList, ErrorStatus errSts) {

		// XML作成
		RetryPrintRequest sendXml = sendRetryCreateXml(auth, dataList, errSts);
		if (sendXml == null) {
			return null;
		}

		// 送信実行 (XML受信)
		RetryPrintResponse responseData = (RetryPrintResponse) post(url(webApiUrl, URL_METHOD_SEND_RETRY), sendXml, Api.SEND_RETRY, errSts);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 結果の解析
		String resCd = responseData.getResultCode();
		if (resCd.startsWith("E")) {
			// 異常

			// エラーの問合番号を抜いて再送信
			responseData.getErrorShippingNumberList().getErrorShippingNumberDetail();
			for (ErrorShippingNumberDetail esn : responseData.getErrorShippingNumberList().getErrorShippingNumberDetail()) {
				String shippingNumber = esn.getShippingNumber();
				for (TagLabelSgwDto data : dataList) {
					if (CU.nullToStr(data.getCarrierTraceNum()).equals(shippingNumber)) {
						data.setCarrierTraceNum(null);
					}
				}
			}

			// 再実行
			sendXml = sendRetryCreateXml(auth, dataList, errSts);
			if (sendXml == null) {
				return null;
			}

			// 送信実行 (XML受信)
			responseData = (RetryPrintResponse) post(url(webApiUrl, URL_METHOD_SEND_RETRY), sendXml, Api.SEND_RETRY, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			// エラー解析
			sendRetryCheckResErr(responseData, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}
		}

		// ===== 戻り値を設定 =====

		RequestIdInfo info = new RequestIdInfo();

		String requestId = responseData.getPrintRequestId();
		List<String> shippingNumberList = sendXml.getShippingNumberList().getShippingNumber();
		for (String shippingNumber : shippingNumberList) {
			info.addRequestId(requestId, shippingNumber);
		}

		return info;
	}

	private RetryPrintRequest sendRetryCreateXml(CustomerAuth auth, List<TagLabelSgwDto> dataList, ErrorStatus errSts) {

		RetryPrintRequest rpr = new RetryPrintRequest();
		rpr.setCustomerAuth(auth); // ユーザ認証
		rpr.setBackLayerFlg(0); // 下敷画像表示フラグ
		ShippingNumberList snl = new ShippingNumberList();
		rpr.setShippingNumberList(snl); // 問合番号リスト

		Set<String> traceNumSet = new LinkedHashSet<String>();
		for (TagLabelSgwDto data : dataList) {

			String traceNum = data.getCarrierTraceNum();

			if (CU.isNullOrEmpty(traceNum)) {
				// 追跡番号が未発行のため再発行対象外
				continue;
			}

			if (traceNumSet.contains(traceNum)) {
				// 既に追加済
				continue;
			}
			traceNumSet.add(traceNum);

			// 問合番号
			snl.addShippingNumber(traceNum);
		}

		if (snl.isEmpty()) {
			return null;
		} else {
			return rpr;
		}
	}

	private void sendRetryCheckResErr(RetryPrintResponse responseData, ErrorStatus errSts) {
		List<String> errMessageList = new ArrayList<String>();
		String resCd = responseData.getResultCode();
		if (resCd.startsWith("E")) {
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
			// エラーリストに追加
			errMessageList.add(getErrMessage(ErrCd.newErrCd(resCd)));
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
		}

		for (ErrorShippingNumberDetail esn : responseData.getErrorShippingNumberList().getErrorShippingNumberDetail()) {
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
			String shippingNumber = esn.getShippingNumber();
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
			ResultCodeList resCdList = esn.getResultCodeList();
			if (resCdList != null) {
				for (String cd : resCdList.getResultCode()) {
					if (cd != null && cd.startsWith("E")) {
						// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
						// エラーリストに追加
						errMessageList.add(getErrMessage(ErrCd.newErrCdWithShippingNumber(cd, shippingNumber)));
						// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
					}
				}
			}
		}

		if (0 < errMessageList.size()) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_RETRY_ERROR, CU.join("[/]", errMessageList));
		}
	}

	/**
	 * PDFダウンロードURL取得
	 */
	private DownloadUrlInfo requestDownloadUrl(String webApiUrl, CustomerAuth auth, Set<String> requestIdList, ErrorStatus errSts) {

		// 送信XML作成
		CheckFileRequest sendData = requestDownloadUrlCreateXml(auth, requestIdList);

		// 送信実行 (XML受信)
		CheckFileResponse responseData = (CheckFileResponse) postWithRetry(url(webApiUrl, URL_METHOD_REQUEST_DL_URL), sendData, Api.REQUEST_DL_URL, errSts,
				WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_GET_DOWNLOAD_URL_ERROR);
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 戻り値 設定 =====

		DownloadUrlInfo info = new DownloadUrlInfo();

		PrintDataList pdl = responseData.getPrintDataList();
		if (pdl == null) {
			return info;
		}
		List<PrintDataDetail> pddList = pdl.getPrintDataDetail();
		if (pddList == null) {
			return info;
		}

		for (PrintDataDetail pdd : pddList) {
			info.putDownloadUrl(pdd.getPrintRequestId(), pdd.getUrl());
		}

		return info;
	}

	private CheckFileRequest requestDownloadUrlCreateXml(CustomerAuth auth, Set<String> requestIdList) {

		PrintRequestIdList idListTag = new PrintRequestIdList();
		idListTag.addPrintRequestIdList(new ArrayList<String>(requestIdList));

		CheckFileRequest cfr = new CheckFileRequest();
		cfr.setCustomerAuth(auth);
		cfr.setPrintRequestIdList(idListTag);

		return cfr;
	}

	private List<String> createPdfUrlList(List<TagLabelSgwDto> list, RequestIdInfo requestInfo, DownloadUrlInfo downloadUrlInfo) {

		// 分割するデータの切り分け
		Set<String> devideShippingNumberSet = new HashSet<String>();
		for (TagLabelSgwDto dto : list) {
			if (dto.getOutPackingIndexSet().size() < dto.getPackingNum().longValue()) {
				devideShippingNumberSet.add(dto.getCarrierTraceNum());
			}
		}

		// データ順にダウンロードURLを作成
		List<String> pdfUrlList = new ArrayList<String>();
		Set<String> addedIdSet = new HashSet<String>();
		for (TagLabelSgwDto dto : list) {

			// 問合せ番号
			String shippingNumber = dto.getCarrierTraceNum();

			// 要求ID
			String requestId = requestInfo.getRequestId(shippingNumber);

			if (addedIdSet.contains(requestId)) {
				// URL追加済

				// DBのURLをクリア
				clearDLUrl(shippingNumber);
				continue;
			}

			// 要求IDに含まれる追跡番号
			List<String> shippingNumberList = requestInfo.getShippingNumberList(requestId);

			// 追跡番号のいずれかが分割対象かをチェック
			boolean doDevide = false;
			for (String sn : shippingNumberList) {
				if (devideShippingNumberSet.contains(sn)) {
					doDevide = true;
					break;
				}
			}

			// ダウンロードURL
			String url = downloadUrlInfo.getDownloadUrl(requestId);

			if (doDevide) {
				// 分割する

				// 1個口用URLに変換 (もしくはDBにURL登録)
				List<String> urlList = getDevideUrlOrUpdate(url, shippingNumber, dto.getOutPackingIndexSet());
				pdfUrlList.addAll(urlList);
			} else {
				// 分割しない

				pdfUrlList.add(url);
				addedIdSet.add(requestId);
				// DBのURLをクリア
				clearDLUrl(shippingNumber);
			}
		}

		return pdfUrlList;
	}

	private List<String> getDevideUrlOrUpdate(String url, String shippingNumber, Set<Integer> outIndexSet) {

		// ===== 追跡番号を条件に梱包帳票を検索 =====

		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCarrierTraceNum_Equal(shippingNumber);
		cb.query().queryTPackingH().addOrderBy_ShippingPackingNo_Asc();

		List<TPackingR> packingRList = tPackingRBhv.selectList(cb);

		// ===== ダウンロードURLを戻り値に設定もしくはDB登録 =====

		List<String> pdfUrlList = new ArrayList<String>();

		int index = 0;
		for (TPackingR r : packingRList) {

			index++;

			String onesUrl = convertOnesOnlyUrl(url, shippingNumber, index);

			if (outIndexSet.contains(index)) {
				// 今回のダウンロード対象

				pdfUrlList.add(onesUrl);
				r.setTagDlUrl(null);
			} else {
				// 今回は対象外 (DBに登録しておく)

				r.setTagDlUrl(onesUrl);
			}

			tPackingRBhv.update(r);
		}

		return pdfUrlList;
	}

	private void clearDLUrl(String shippingNumber) {

		TPackingR updateEntity = new TPackingR();
		updateEntity.setTagDlUrl(null);

		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().queryTPackingH().setCarrierTraceNum_Equal(shippingNumber);

		tPackingRBhv.queryUpdate(updateEntity, cb);
	}

	/**
	 * 受渡書データ送信
	 */
	private Set<String> sendDeliveryData(String webApiUrl, CustomerAuth auth, List<TagLabelSgwDto> dataList, ErrorStatus errSts) {

		// 出荷日単位のデータ
		List<UkewatashiRequest> sendDataList = sendDeliveryDataCreateXml(auth, dataList);

		Set<String> printRequestIdSet = new LinkedHashSet<String>();
		for (UkewatashiRequest sendData : sendDataList) {

			// 送信実行 (XML受信)
			UkewatashiResponse responseData = (UkewatashiResponse) postWithRetry(url(webApiUrl, URL_METHOD_SEND_DELIVERY), sendData, Api.SEND_DELIVERY, errSts,
					WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_EXECUTE_SEND_DELIVERY_DATA_ERROR);
			if (0 < getErrorManager().size()) {
				return null;
			}

			printRequestIdSet.add(responseData.getUkewatashiDetail().getPrintRequestId());
		}

		return printRequestIdSet;
	}

	/**
	 * 荷物受渡書発行API送信XML作成
	 * 出荷日単位にXMLが作成される
	 */
	private List<UkewatashiRequest> sendDeliveryDataCreateXml(CustomerAuth auth, List<TagLabelSgwDto> dataList) {

		// 出荷日毎のマップ(キー：出荷日)
		Map<DeliveryKey, UkewatashiRequest> requestMap = new LinkedHashMap<DeliveryKey, UkewatashiRequest>();

		Set<String> pickingWorkNoSet = new HashSet<String>();

		for (TagLabelSgwDto data : dataList) {

			if (pickingWorkNoSet.contains(data.getPickingWorkNo())) {
				continue;
			} else {
				pickingWorkNoSet.add(data.getPickingWorkNo());
			}

			// 顧客番号
			String slipCustomerCd = CU.nullToStr(data.getSlipCustomerCd());
			// 出荷日
			String shippingDt = CU.nullToStr(data.getShippingDt());

			DeliveryKey key = new DeliveryKey(slipCustomerCd, shippingDt);

			UkewatashiDetail ud;
			if (requestMap.containsKey(key)) {
				// 作成済

				ud = requestMap.get(key).getUkewatashiDetail();
			} else {
				// 新規作成
				UkewatashiRequest ur = new UkewatashiRequest();
				ur.setCustomerAuth(auth);
				ud = new UkewatashiDetail();
				ud.setKokyakuCode(data.getSlipCustomerCd());
				ud.setShukkaDate(shukkaDate(shippingDt));
				ud.setTotalKosu(0);
				ur.setUkewatashiDetail(ud);

				requestMap.put(key, ur);
			}

			ud.setTotalKosu(ud.getTotalKosu() + nullToZero(data.getPackingNum()));
		}

		return new ArrayList<UkewatashiRequest>(requestMap.values());
	}

	private Object postWithRetry(String url, Object sendData, Api api, ErrorStatus errSts, String messageCd) {

		List<ErrCd> errCdList = null;
		for (int i = 0; i <= RETRY_MAX_COUNT; i++) {

			// 送信実行 (XML受信)
			Object responseData = post(url, sendData, api, errSts);
			if (0 < getErrorManager().size()) {
				return null;
			}

			errCdList = getResponseErrCd(responseData);
			if (0 < errCdList.size()) {
				// 異常応答

				if (isRetryErr(errCdList)) {
					// リトライ対象のエラー
					if (i < RETRY_MAX_COUNT) {
						sleep();
					}
					continue;
				} else {
					addResponseErrMessage(errCdList, messageCd, errSts);
					return null;
				}
			} else {
				// 正常応答
				return responseData;
			}
		}

		// リトライ数オーバー
		addResponseErrMessage(errCdList, messageCd, errSts);
		return null;
	}

	private void sleep() {
		try {
			Thread.sleep(RETRY_INTERVAL);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private List<ErrCd> getResponseErrCd(Object responseData) {

		String resCd;
		PrintDataList pdl;
		if (responseData instanceof CheckFileResponse) {
			resCd = ((CheckFileResponse) responseData).getResultCode();
			pdl = ((CheckFileResponse) responseData).getPrintDataList();
		} else if (responseData instanceof ShippingResponse) {
			resCd = ((ShippingResponse) responseData).getResultCode();
			pdl = ((ShippingResponse) responseData).getPrintDataList();
		} else if (responseData instanceof UkewatashiResponse) {
			return getResponseErrCd((UkewatashiResponse) responseData);
		} else {
			getErrorManager().throwException(new IllegalArgumentException("response class is illegal."));
			return null;
		}

		List<ErrCd> errCdList = new ArrayList<ErrCd>();

		if (resCd.startsWith("E")) {
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
			// エラーCDリストに追加
			errCdList.add(ErrCd.newErrCd(resCd));
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
		}

		if (pdl != null) {
			List<PrintDataDetail> pddList = pdl.getPrintDataDetail();
			if (pddList != null) {
				for (PrintDataDetail pdd : pddList) {
					// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
					String manageNumber = pdd.getUserManageNumber();
					// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
					String resCdDtl = pdd.getResultCode();
					if (resCdDtl != null && resCdDtl.startsWith("E")) {
						// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.24 kawana Start
						// エラーCDリストに追加
						errCdList.add(ErrCd.newErrCdWithUserManageNumber(resCdDtl, manageNumber));
						// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.24 kawana End
					}

					ResultCodeList resCdList = pdd.getResultCodeList();
					if (resCdList != null) {
						for (String cd : resCdList.getResultCode()) {
							if (cd != null && cd.startsWith("E")) {
								// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
								// エラーCDリストに追加
								errCdList.add(ErrCd.newErrCdWithUserManageNumber(cd, manageNumber));
								// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
							}
						}
					}
				}
			}
		}

		return errCdList;
	}

	private List<ErrCd> getResponseErrCd(UkewatashiResponse responseData) {

		String resCd = responseData.getResultCode();

		List<ErrCd> errCdList = new ArrayList<ErrCd>();

		if (resCd.startsWith("E")) {
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
			// エラーCDリストに追加
			errCdList.add(ErrCd.newErrCd(resCd));
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
		}

		ResultCodeList resCdList = responseData.getUkewatashiDetail().getResultCodeList();
		for (String cd : resCdList.getResultCode()) {
			if (cd != null && cd.startsWith("E")) {
				// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
				// エラーCDリストに追加
				errCdList.add(ErrCd.newErrCd(cd));
				// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
			}
		}

		return errCdList;
	}

	private void addResponseErrMessage(List<ErrCd> errCdList, String messageCd, ErrorStatus errSts) {

		List<String> errMessageList = new ArrayList<String>();
		for (ErrCd errCd : errCdList) {
			// エラーリストに追加
			errMessageList.add(getErrMessage(errCd));
		}

		getErrorManager().add(errSts, messageCd, CU.join("[/]", errMessageList));
	}

	private boolean isRetryErr(List<ErrCd> errCdList) {

		for (ErrCd errCd : errCdList) {
			// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start
			// エラーリストに追加
			if (RETRY_ERR_CD_SET.contains(errCd.resultCode)) {
				// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
				return true;
			}
		}

		return false;
	}

	/**
	 * POST通信の実行
	 *
	 * @param requestUrl 接続URL
	 * @param postData 送信データ(XMLオブジェクト)
	 * @param api API種別
	 * @param errSts エラー時に設定するステータス
	 * @return 受信データ(XMLオブジェクト)
	 */
	private Object post(String requestUrl, Object postData, Api api, ErrorStatus errSts) {

		Object responseObj = null;

		// サーバへ接続する
		HttpURLConnection connection = null;
		BufferedReader br = null;

		boolean doSetProxyAuth = false;

		try {

			URL url = new URL(requestUrl);

			if (!CU.isNullOrEmpty(PROXY_URL) && !CU.isNullOrEmpty(PROXY_PORT)) {
				// PROXY有

				if (!CU.isNullOrEmpty(PROXY_USER) && !CU.isNullOrEmpty(PROXY_PASS)) {
					// PROXY認証有

					doSetProxyAuth = true;
					Authenticator.setDefault(new Authenticator() {
						@Override
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(PROXY_USER, PROXY_PASS.toCharArray());
						}
					});
				}

				connection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_URL, 8080)));
			} else {
				// PROXY無

				connection = (HttpURLConnection) url.openConnection();
			}

			if (READ_TIMEOUT != null) {
				connection.setReadTimeout(READ_TIMEOUT);
			}

			if (CONNECT_TIMEOUT != null) {
				connection.setConnectTimeout(CONNECT_TIMEOUT);
			}

			SSLSocketFactory sslSocketFactory = null;
			if (isSSL(requestUrl)) {
				// SSL通信

				// 信頼性チェックなし
				SSLContext sslContext = SSLContext.getInstance("TLS");
				sslContext.init(null, new NonAuthentication[] { new NonAuthentication() }, null);
				sslSocketFactory = sslContext.getSocketFactory();
				((HttpsURLConnection) connection).setSSLSocketFactory(sslSocketFactory);
			}

			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setUseCaches(false);
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/xml");

			// XMLデータを送信
			Marshaller marshaller = JAXB_CONTEXT_SEND_MAP.get(api).createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);

			marshaller.marshal(postData, connection.getOutputStream());

			connection.connect();

			// レスポンスを受信する
			int resCode = connection.getResponseCode();

			// 接続が確立したとき
			if (resCode == HttpURLConnection.HTTP_OK) {

				// 受信データをXMLに変換して返す
				Unmarshaller unmarshaller = JAXB_CONTEXT_RESPONSE_MAP.get(api).createUnmarshaller();
				responseObj = unmarshaller.unmarshal(connection.getInputStream());
			} else {
				// 接続が確立できなかったとき

				// エラー登録
				getErrorManager().add(errSts, WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_CONNECT_RESPONSE_CODE_ERROR, String.valueOf(resCode));
				return null;
			}
		} catch (IOException | NoSuchAlgorithmException | KeyManagementException e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_CONNECT_ERROR);
			e.printStackTrace();
			return null;
		} catch (JAXBException e) {
			getErrorManager().throwException(e);
		} finally {

			if (doSetProxyAuth) {

				Authenticator.setDefault(null);
			}

			try {
				if (br != null) {
					br.close();
				}
			} catch (Exception e) {
				// 閉じるときのエラーは何もしない
			}
			try {
				if (connection != null) {
					connection.disconnect();
				}
			} catch (Exception e) {
				// 閉じるときのエラーは何もしない
			}
		}

		return responseObj;
	}

	/**
	 * PDFのダウンロード
	 * @return wmsサーバのダウンロードurl
	 */
	private File downloadPdf(String requestUrl, ErrorStatus errSts) {

		File pdfFile = null;

		// サーバへ接続する
		HttpURLConnection connection = null;
		BufferedInputStream in = null;
		FileOutputStream fos = null;

		boolean doSetProxyAuth = false;

		try {

			URL url = new URL(requestUrl);

			if (!CU.isNullOrEmpty(PROXY_URL) && !CU.isNullOrEmpty(PROXY_PORT)) {
				// PROXY有

				if (!CU.isNullOrEmpty(PROXY_USER) && !CU.isNullOrEmpty(PROXY_PASS)) {
					// PROXY認証有

					doSetProxyAuth = true;
					Authenticator.setDefault(new Authenticator() {
						@Override
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(PROXY_USER, PROXY_PASS.toCharArray());
						}
					});
				}

				connection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(PROXY_URL, 8080)));
			} else {
				// PROXY無

				connection = (HttpURLConnection) url.openConnection();
			}

			if (READ_TIMEOUT != null) {
				connection.setReadTimeout(READ_TIMEOUT);
			}

			if (CONNECT_TIMEOUT != null) {
				connection.setConnectTimeout(CONNECT_TIMEOUT);
			}

			SSLSocketFactory sslSocketFactory = null;
			if (isSSL(requestUrl)) {
				// SSL通信

				// 信頼性チェックなし
				SSLContext sslContext = SSLContext.getInstance("TLS");
				sslContext.init(null, new NonAuthentication[] { new NonAuthentication() }, null);
				sslSocketFactory = sslContext.getSocketFactory();
				((HttpsURLConnection) connection).setSSLSocketFactory(sslSocketFactory);
			}

			connection.setUseCaches(false);
			connection.setAllowUserInteraction(false);
			connection.setInstanceFollowRedirects(true);
			connection.setRequestMethod("GET");
			connection.connect();

			// レスポンスを受信する
			int resCode = connection.getResponseCode();

			// 接続が確立したとき
			if (resCode == HttpURLConnection.HTTP_OK) {

				pdfFile = pdfFileSaveLogic.save(connection.getInputStream());

			} else {
				// 接続が確立できなかったとき

				// エラー登録
				getErrorManager().add(errSts, WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_CONNECT_RESPONSE_CODE_ERROR, String.valueOf(resCode));
				return null;
			}
		} catch (IOException | NoSuchAlgorithmException | KeyManagementException e) {
			// エラー登録
			getErrorManager().add(errSts, WmsMessageConst.SAGAWA_API_SYSTEM_CANNOT_CONNECT_ERROR);
			e.printStackTrace();
			return null;
		} finally {

			if (doSetProxyAuth) {

				Authenticator.setDefault(null);
			}

			try {
				if (in != null) {
					in.close();
				}
			} catch (Exception e) {
				// 閉じるときのエラーは何もしない
			}
			try {
				if (fos != null) {
					fos.flush();
					fos.close();
				}
			} catch (Exception e) {
				// 閉じるときのエラーは何もしない
			}
			try {
				if (connection != null) {
					connection.disconnect();
				}
			} catch (Exception e) {
				// 閉じるときのエラーは何もしない
			}
		}

		// レスポンスを返す
		return pdfFile;
	}

	private String url(String webApiUrl, String methodUrl) {

		if (webApiUrl.endsWith("/") && methodUrl.startsWith("/")) {
			methodUrl = methodUrl.substring(1);
		} else if (!webApiUrl.endsWith("/") && !methodUrl.startsWith("/")) {
			methodUrl = new StringBuilder().append("/").append(methodUrl).toString();
		}

		return CU.join("", webApiUrl, methodUrl);
	}

	private String convertOnesOnlyUrl(String url, String carrierTraceNum, int index) {

		StringBuilder sb = new StringBuilder();
		sb.append(url).append("_").append(carrierTraceNum).append("_");

		String indexStr = String.valueOf(index);
		int addZeroCount = 3 - indexStr.length();
		for (int i = 0; i < addZeroCount; i++) {
			// 3桁まで0埋め
			sb.append("0");
		}
		sb.append(indexStr);

		return sb.toString();
	}

	// [#457] 佐川荷札発行の必須エラーチェック追加(不要になったメソッドを削除) 2016.12.16 kawana

	private int nullToZero(Integer i) {
		if (i == null) {
			return 0;
		}

		return i;
	}

	private boolean isSSL(String url) {

		return url.toLowerCase().contains("https");
	}

	private String shukkaDate(String s) {
		if (CU.isNullOrEmpty(s)) {
			return s;
		}

		if (s.length() != 8) {
			return s;
		}

		return s.substring(4);
	}

	/**
	 * 送信データをAPIのURL、ログインIDごとにまとめるためのキークラス
	 */
	private static class WebApiKey {
		private String url;
		private String loginId;

		public WebApiKey(String url, String loginId) {

			if (!url.endsWith("/")) {
				url = new StringBuilder(url).append("/").toString();
			}

			this.url = url.toLowerCase();
			this.loginId = loginId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((loginId == null) ? 0 : loginId.hashCode());
			result = prime * result + ((url == null) ? 0 : url.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			WebApiKey other = (WebApiKey) obj;
			if (loginId == null) {
				if (other.loginId != null)
					return false;
			} else if (!loginId.equals(other.loginId))
				return false;
			if (url == null) {
				if (other.url != null)
					return false;
			} else if (!url.equals(other.url))
				return false;
			return true;
		}
	}

	private static class DeliveryKey {
		private String slipCustomerCd;
		private String shippingDt;

		public DeliveryKey(String slipCustomerCd, String shippingDt) {

			this.slipCustomerCd = slipCustomerCd;
			this.shippingDt = shippingDt;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((shippingDt == null) ? 0 : shippingDt.hashCode());
			result = prime * result + ((slipCustomerCd == null) ? 0 : slipCustomerCd.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			DeliveryKey other = (DeliveryKey) obj;
			if (shippingDt == null) {
				if (other.shippingDt != null)
					return false;
			} else if (!shippingDt.equals(other.shippingDt))
				return false;
			if (slipCustomerCd == null) {
				if (other.slipCustomerCd != null)
					return false;
			} else if (!slipCustomerCd.equals(other.slipCustomerCd))
				return false;
			return true;
		}

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
	 * 要求ID情報管理クラス
	 */
	private static class RequestIdInfo {
		private Set<String> requestIdSet = new LinkedHashSet<String>();
		private Map<String, String> requestIdMap = new HashMap<String, String>();
		private Map<String, List<String>> shippingNumberListMap = new HashMap<String, List<String>>();

		// ===== セッタ =====

		public void addRequestId(String requestId, String shippingNumber) {
			this.requestIdSet.add(requestId);
			putRequestId(shippingNumber, requestId);
			putShippingNumber(requestId, shippingNumber);
		}

		public void addAllInfo(RequestIdInfo info) {
			requestIdSet.addAll(info.getRequestIdSet());
			requestIdMap.putAll(info.getRequestIdMap());
			// putAll時にrequestIdが既にあることは運用上ありえないので考慮しない
			shippingNumberListMap.putAll(info.getShippingNumberListMap());
		}

		private void putRequestId(String shippingNumber, String requestId) {
			this.requestIdMap.put(shippingNumber, requestId);
		}

		private void putShippingNumber(String requestId, String shippingNumber) {
			if (!this.shippingNumberListMap.containsKey(requestId)) {
				List<String> snList = new ArrayList<String>();
				this.shippingNumberListMap.put(requestId, snList);
			}

			this.shippingNumberListMap.get(requestId).add(shippingNumber);
		}

		// ===== ゲッタ =====

		public Set<String> getRequestIdSet() {
			return requestIdSet;
		}

		public String getRequestId(String shippingNumber) {
			return requestIdMap.get(shippingNumber);
		}

		public Map<String, String> getRequestIdMap() {
			return requestIdMap;
		}

		public List<String> getShippingNumberList(String requestId) {
			return shippingNumberListMap.get(requestId);
		}

		public Map<String, List<String>> getShippingNumberListMap() {
			return shippingNumberListMap;
		}
	}

	/**
	 * ダウンロードURL情報管理クラス
	 */
	private static class DownloadUrlInfo {
		private Map<String, String> downloadUrlMap = new LinkedHashMap<String, String>();

		public void putDownloadUrl(String requestId, String url) {
			this.downloadUrlMap.put(requestId, url);
		}

		public String getDownloadUrl(String requestId) {
			return downloadUrlMap.get(requestId);
		}

		public Collection<String> getDownloadUrlList() {
			return downloadUrlMap.values();
		}
	}

	// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana Start

	private static class ErrCd {

		private String resultCode;
		private String userManageNumber;
		private String shippingNumber;

		/** コンストラクタの使用禁止 */
		private ErrCd() {
		}

		public static ErrCd newErrCd(String resultCode) {
			ErrCd instance = new ErrCd();
			instance.resultCode = resultCode;

			return instance;
		}

		public static ErrCd newErrCdWithUserManageNumber(String resultCode, String userManageNamber) {
			ErrCd instance = new ErrCd();
			instance.resultCode = resultCode;
			instance.userManageNumber = userManageNamber;

			return instance;
		}

		public static ErrCd newErrCdWithShippingNumber(String resultCode, String shippingNumber) {
			ErrCd instance = new ErrCd();
			instance.resultCode = resultCode;
			instance.shippingNumber = shippingNumber;

			return instance;
		}

		public String getResultCode() {
			return resultCode;
		}

		public String getUserManageNumber() {
			return userManageNumber;
		}

		public String getShippingNumber() {
			return shippingNumber;
		}
	}

	// [#4614] エラー時にエラー対象の管理番号を表示 2018.05.17 kawana End
}
