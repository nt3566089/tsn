package com.oneslogi.wms.resources.shipping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.WReplenishInstInputDto;
import com.oneslogi.base.dbflute.dtomapper.WReplenishInstInputDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrflexibilityinstruct;
import com.oneslogi.base.dbflute.exentity.WReplenishInstInput;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.NumberingLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.dto.shipping.ReplenishInstBulkInputDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.shipping.ReplenishInstBulkInputCheckStatusLogic;
import com.oneslogi.wms.logic.shipping.ReplenishInstBulkInputRegisterLogic;
import com.oneslogi.wms.logic.shipping.ReplenishInstBulkInputSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 融通指示一括登録のリソースクラス。
 */
@Path("/shipping/ReplenishInstBulkInput")
public class ReplenishInstBulkInputResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * エラーのみ表示 表示
	 */
	protected static final String ERROR_ONLY_0 = "0";
	/**
	 * エラーのみ表示 非表示
	 */
	protected static final String ERROR_ONLY_1 = "1";
	
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
		 * 拠点マスタ取得異常
		 */
		protected static final int CENTER_NOT_FOUND_ERROR = 2;
		/**
		 * 荷主マスタ取得異常
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 3;
		/**
		 * 融通指示データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 4;
		/**
		 * サーバへ送信できないファイルが含まれています
		 */
		protected static final int ACCEPT_FILE_TYPES = 5;
		/**
		 * チェック処理異常
		 */
		protected static final int CHECK_ERROR = 6;
		/**
		 * 登録処理異常
		 */
		protected static final int REGISTER_ERROR = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;

	@Inject
	private NumberingLogic numberingLogic;
	@Inject
	private ReplenishInstBulkInputSelectLogic selectLogic;
	@Inject
	private ReplenishInstBulkInputRegisterLogic registerLogic;
	@Inject
	private ReplenishInstBulkInputCheckStatusLogic checkStatusLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ReplenishInstBulkInputDto 融通指示一括登録画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ReplenishInstBulkInputDto initNew() {

		ReplenishInstBulkInputDto dto = new ReplenishInstBulkInputDto();
		return dto;
	}
	
	/**
	 * <h2>融通指示一括登録取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @param clientCd 荷主CD
	 * @param centerCd センタCD
	 * @return ShippingPlanBulkInputDto 融通指示一括登録画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ReplenishInstBulkInputDto fileUpload(MultipartFormDataInput input
			, @QueryParam("clientCd") String clientCd
			, @QueryParam("centerCd") String centerCd
			, @QueryParam("chkErrorShow") String chkErrorShow
			, @QueryParam("errorProcessMet") String errorProcessMet) throws Exception {

		// 画面用DTO作成
		ReplenishInstBulkInputDto replenishInstBulkInputDto = new ReplenishInstBulkInputDto();
		// 変数初期化
		// 取込行数
		int rows = 0;

		// 行NO.
		int lineNo = 0;
		// 融通指示一括取込ワーク登録リスト
		List<WReplenishInstInput> insertList = new ArrayList<WReplenishInstInput>();
		// 融通指示一括取込ワーク更新リスト
		List<WReplenishInstInput> updateList = new ArrayList<WReplenishInstInput>();

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		
		// 該当データなし
		if (mCenter == null) {
			// 拠点マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
		
		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		
		// 該当データなし
		if (mClient == null) {
			// 荷主マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// ファイル取込
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		//アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(replenishInstBulkInputDto, param);
			rows = conv.getUploadRows();
		}
		
		// 受信CD採番
		String receiveCd = numberingLogic.getNumbering(WmsNumberingConst.RECEIVE_CD);
		replenishInstBulkInputDto.data.receiveCd = receiveCd;

		for (WReplenishInstInputDto wReplenishInstInputDto : replenishInstBulkInputDto.data.bodyList) {
			lineNo+=1;
			WReplenishInstInput wReplenishInstInput = new WReplenishInstInput();
			
			// 受信CD
			wReplenishInstInput.setReceiveCd(receiveCd);
			// 拠点CD
			wReplenishInstInput.setCenterCd(centerCd);
			// 荷主CD
			wReplenishInstInput.setClientCd(clientCd);
			// 指示No.
			wReplenishInstInput.setFlexlnsNo(wReplenishInstInputDto.getFlexlnsNo());
			// 発送予定日
			wReplenishInstInput.setSchDate(wReplenishInstInputDto.getSchDate());
			// 発送元CD
			wReplenishInstInput.setSupplierCd(wReplenishInstInputDto.getSupplierCd());
			// 受入予定日
			wReplenishInstInput.setRcvDate(wReplenishInstInputDto.getRcvDate());
			// 発送先CD
			wReplenishInstInput.setShipCd(wReplenishInstInputDto.getShipCd());
			// 銘柄CD
			wReplenishInstInput.setItemCd(wReplenishInstInputDto.getItemCd());
			// 製造年月日
			wReplenishInstInput.setManufactureDate(wReplenishInstInputDto.getManufactureDate());
			// デザイン区分
			wReplenishInstInput.setDesignCd(wReplenishInstInputDto.getDesignCd());
			// 数量（個数）
			wReplenishInstInput.setQty(wReplenishInstInputDto.getQty());
			// 画面更新者
			wReplenishInstInput.setFlexUpdUserCd(wReplenishInstInputDto.getFlexUpdUserCd());
			// 行NO.
			wReplenishInstInput.setLineNo(Long.valueOf(lineNo));
			// 処理済フラグ
			wReplenishInstInput.setWorkFlg(CDef.WorkFlg.$0.code());
			// エラーフラグ
			wReplenishInstInput.setErrorFlg(CDef.ErrorFlg.$0.code());
			
			insertList.add(wReplenishInstInput);
		}
		
		if (insertList.size() == 0) {
			getErrorManager().add(errRetSts(StatusCode.ACCEPT_FILE_TYPES), WmsMessageConst.ACCEPT_FILE_TYPES);
			return null;
		}

		// データ登録
		registerLogic.batchInsertWReplenishInstInput(insertList);

		// エラーチェック
		checkStatusLogic.checkError(receiveCd, mCenter, mClient, updateList, errRetSts(StatusCode.CHECK_ERROR));

		ReplenishInstBulkInputSelectLogic.SelectCls cls = ReplenishInstBulkInputSelectLogic.SelectCls.ALL;
		List<WReplenishInstInput> list = selectLogic.selectAndConvertWReplenishInstInputList(receiveCd, centerCd, clientCd, cls);
		
		WReplenishInstInputDtoMapper mapper = new WReplenishInstInputDtoMapper();
		replenishInstBulkInputDto.data.bodyList = mapper.mappingToDtoList(list);
		replenishInstBulkInputDto.data.dataCount = list.size();
		
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return replenishInstBulkInputDto;

	}
	
	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面表示用データを検索する
	 * </pre>
	 * @param replenishInstBulkInputDto 融通指示一括登録画面用DTO
	 * @param errSts エラーステータス
	 * @return ReplenishInstBulkInputDto 融通指示一括登録画面用DTO
	 */
	@GET
	@Path("/search")
	public ReplenishInstBulkInputDto search(ReplenishInstBulkInputDto replenishInstBulkInputDto, ErrorStatus errSts) {

		// ENTITY変換
		WReplenishInstInputDtoMapper wReplenishInstInputDtoMapper = new WReplenishInstInputDtoMapper();
		WReplenishInstInput wReplenishInstInput = wReplenishInstInputDtoMapper.mappingToEntity(replenishInstBulkInputDto.data.head);

		String receiveCd = CU.nullOrEmptyToZero(replenishInstBulkInputDto.data.receiveCd);
		String centerCd = wReplenishInstInput.getCenterCd();
		String clientCd = wReplenishInstInput.getClientCd();
		
		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		
		// 該当データなし
		if (mCenter == null) {
			// 拠点マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		
		// 該当データなし
		if (mClient == null) {
			// 荷主マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		ReplenishInstBulkInputSelectLogic.SelectCls cls = ReplenishInstBulkInputSelectLogic.SelectCls.ALL;
		if (ERROR_ONLY_1.equals(CU.nullToStr(wReplenishInstInput.getChkErrorShow()))) {
			cls = ReplenishInstBulkInputSelectLogic.SelectCls.ERROR_ONLY;
		}

		// 検索実行
		List<WReplenishInstInput> bodyList =
				selectLogic.selectAndConvertWReplenishInstInputList(receiveCd, centerCd, clientCd, replenishInstBulkInputDto.paging, cls);

		// 画面DTOに設定
		replenishInstBulkInputDto.data.bodyList = wReplenishInstInputDtoMapper.mappingToDtoList(bodyList);

		replenishInstBulkInputDto.data.dataCount = selectLogic.getWReplenishInstInputCount(receiveCd, centerCd, clientCd);

		return replenishInstBulkInputDto;
	}
	
	/**
	 * <h2>エラーデータの存在チェック.</h2>
	 * <pre>
	 * エラーとなっているデータを検索し存在する場合はエラーを登録する。
	 * </pre>
	 * @param replenishInstBulkInputDto 融通指示一括登録画面用DTO
	 * @return ReplenishInstBulkInputDto 融通指示一括登録画面用DTO
	 */
	@GET
	@Path("/checkExistError")
	public ReplenishInstBulkInputDto checkExistError(ReplenishInstBulkInputDto replenishInstBulkInputDto) {

		// ENTITY変換
		WReplenishInstInputDtoMapper wReplenishInstInputDtoMapper = new WReplenishInstInputDtoMapper();
		WReplenishInstInput wReplenishInstInput = wReplenishInstInputDtoMapper.mappingToEntity(replenishInstBulkInputDto.data.head);
		
		// 受信CD
		String receiveCd = CU.nullOrEmptyToZero(replenishInstBulkInputDto.data.receiveCd);
		String centerCd = wReplenishInstInput.getCenterCd();
		String clientCd = wReplenishInstInput.getClientCd();

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		
		// 該当データなし
		if (mCenter == null) {
			// 拠点マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		
		// 該当データなし
		if (mClient == null) {
			// 荷主マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		
		ReplenishInstBulkInputSelectLogic.SelectCls cls = ReplenishInstBulkInputSelectLogic.SelectCls.ERROR_ONLY;
		List<WReplenishInstInput> list = selectLogic.selectAndConvertWReplenishInstInputList(receiveCd, centerCd, clientCd, cls);
		
		replenishInstBulkInputDto.data.errorCount = list.size();
		
		return replenishInstBulkInputDto;
	}
	
	/**
	 * <h2>融通指示一括登録。</h2>
	 * <pre>
	 * 一括取込データの組み立てを行う
	 * エラーがない場合は、データベースに融通指示一括データを登録し、完了メッセージを設定する
	 * </pre>
	 * @param replenishInstBulkInputDto 融通指示一括登録画面用DTO
	 * @param errSts エラーステータス
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ReplenishInstBulkInputDto replenishInstBulkInputDto, ErrorStatus errSts) {

		// ENTITY変換
		WReplenishInstInputDtoMapper wReplenishInstInputDtoMapper = new WReplenishInstInputDtoMapper();
		WReplenishInstInput wReplenishInstInput = wReplenishInstInputDtoMapper.mappingToEntity(replenishInstBulkInputDto.data.head);
		
		// 受信CD
		String receiveCd = CU.nullOrEmptyToZero(replenishInstBulkInputDto.data.receiveCd);
		String centerCd = wReplenishInstInput.getCenterCd();
		String clientCd = wReplenishInstInput.getClientCd();

		// 変数初期化
		// 融通行No.
		BigDecimal flexibitylineNo = WCC.ZERO;
		// ワーク融通輸送情報ID
		Long flexibleTransportInfoId = -1L;
		// 融通指示一括登録情報登録リスト
		List<TTrflexibilityinstruct> registerList = new ArrayList<TTrflexibilityinstruct>();
		// 融通指示一括取込ワーク処理済リスト
		List<WReplenishInstInput> processedList = new ArrayList<WReplenishInstInput>();
		
		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		
		// 該当データなし
		if (mCenter == null) {
			// 拠点マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}
	
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		
		// 該当データなし
		if (mClient == null) {
			// 荷主マスタに存在しません。
			getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}
		
		ReplenishInstBulkInputSelectLogic.SelectCls cls = ReplenishInstBulkInputSelectLogic.SelectCls.NO_ERROR_ONLY;
		List<WReplenishInstInput> list = selectLogic.selectAndConvertWReplenishInstInputList(receiveCd, centerCd, clientCd, cls);
		
		registerLogic.register(list, receiveCd, mCenter, mClient, registerList, processedList, flexibitylineNo, flexibleTransportInfoId,  errRetSts(StatusCode.REGISTER_ERROR));
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージ
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}
}
