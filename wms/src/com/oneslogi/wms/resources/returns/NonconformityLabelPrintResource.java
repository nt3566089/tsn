package com.oneslogi.wms.resources.returns;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.TTrbaditemcaseDto;
import com.oneslogi.base.dbflute.dtomapper.TTrbaditemcaseDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.TTrbaditemcase;
import com.oneslogi.base.dto.PrintParamDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.print.logic.PrintLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.report.NonconformityLabelDto;
import com.oneslogi.wms.dto.returns.NonconformityLabelPrintDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ReportLogic;
import com.oneslogi.wms.logic.returns.NonconformityLabelPrintSelectLogic;
import com.oneslogi.wms.logic.returns.NonconformityLabelPrintUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

import net.arnx.jsonic.JSON;

/**
 * 不適品ラベル出力画面のリソースクラス。
 */
@Path("/returns/nonconformityLabelPrint")
public class NonconformityLabelPrintResource extends AbstractWmsResource {

	private static final String REPORT_CD = "NonconformityLabel";

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
		protected static final int SEARCH_DATA_ERROR = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private NonconformityLabelPrintSelectLogic selectLogic;
	@Inject
	private NonconformityLabelPrintUpdateLogic updateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;
	@Inject
	private ReportLogic reportLogic;
	@Inject
	private PrintLogic printLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return NonconformityLabelPrintDto 不適品ラベル出力用DTO
	 */
	@GET
	@Path("/init")
	public NonconformityLabelPrintDto init() {
		NonconformityLabelPrintDto receiveNonconformityLabelPrintDto = new NonconformityLabelPrintDto();

		// 発行帳票を指定
		receiveNonconformityLabelPrintDto.data.printData.printBasicData.reportId = reportLogic.getReportId(REPORT_CD);

		return receiveNonconformityLabelPrintDto;
	}

	/**
	 * <h2>検索。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * ・不適品ラベル出力用DTOをキーに不適品ラベル一覧データ取り出し
	 * </pre>
	 * @param nonconformityLabelPrintDto 不適品ラベル出力用DTO
	 * @return NonconformityLabelPrintDto 不適品ラベル出力用DTO
	 */
	@GET
	@Path("/search")
	public NonconformityLabelPrintDto search(NonconformityLabelPrintDto nonconformityLabelPrintDto) {
		// Entity変換
		TTrbaditemcaseDtoMapper searchMapper = new TTrbaditemcaseDtoMapper();
		final TTrbaditemcase search = searchMapper.mappingToEntity(nonconformityLabelPrintDto.data.search);

		// 不適品ラベル情報一覧データ取得
		PagingResultBean<TTrbaditemcase> page = selectLogic.select(search, nonconformityLabelPrintDto.paging,
				errRetSts(StatusCode.SEARCH_DATA_ERROR));
		if (getErrorManager().size() > 0) {
			//処理中止
			return null;
		}

		// Dto変換処理
		TTrbaditemcaseDtoMapper mapper = new TTrbaditemcaseDtoMapper();
		List<TTrbaditemcaseDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		NonconformityLabelPrintDto resultNonconformityLabelPrintDto = new NonconformityLabelPrintDto();
		resultNonconformityLabelPrintDto.paging = nonconformityLabelPrintDto.paging;
		resultNonconformityLabelPrintDto.data.list = list;

		return resultNonconformityLabelPrintDto;
	}

	/**
	 * <h2>不適品ラベル発行チェック。</h2>
	 * <pre>
	 * ・不適品ラベルデータを取得
	 * ・以下のチェックを行う
	 * ・ データの存在チェック
	 *
	 * ・戻り値を下記のように設定する
	 * ・チェックエラー : データの存在チェック異常
	 * ・チェック正常 : 正常
	 * </pre>
	 * @param nonconformityLabelPrintDto 不適品ラベル出力用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkPrint")
	public StatusDto checkPrint(NonconformityLabelPrintDto nonconformityLabelPrintDto) {
		// Entity変換
		TTrbaditemcaseDtoMapper mapper = new TTrbaditemcaseDtoMapper();
		final List<TTrbaditemcase> checkEntity = mapper.mappingToEntityList(nonconformityLabelPrintDto.data.list);

		// データの存在チェック
		selectLogic.checkExists(checkEntity, errRetSts(StatusCode.SEARCH_DATA_ERROR));
		if (getErrorManager().size() > 0) {
			//処理中止
			return null;
		}

		return null;
	}

	/**
	 * <h2>不適品ラベル発行。</h2>
	 * <pre>
	 * コントロールNo.を更新してから、不適品ラベル帳票データ更新を取得する
	 * 帳票を発行する
	 * エラーがない場合は、データベースに不適品ラベル帳票データ更新を更新する
	 * </pre>
	 * @param entityList 不適品ラベル出力用DTO
	 * @return PrintParamDto 不適品ラベルアウトプットデータ
	 * @throws Exception
	 */
	@GET
	@Path("/print")
	public PrintParamDto print(NonconformityLabelPrintDto nonconformityLabelPrintDto) throws Exception {
		// Entity変換
		TTrbaditemcaseDtoMapper mapper = new TTrbaditemcaseDtoMapper();
		final List<TTrbaditemcase> entityList = mapper.mappingToEntityList(nonconformityLabelPrintDto.data.list);

		// システム日付の取得
		TTrbaditemcaseDto search = nonconformityLabelPrintDto.data.search;
		String systemDt = getSystemDt(search.getCenterCd(), search.getClientCd(),
				errRetSts(StatusCode.SEARCH_DATA_ERROR));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// 対象の不適品ラベル情報にコントロールNo.をセットする
		updateLogic.setControlNo(entityList, controlNo);

		// コントロールNo.がセットされた不適品ラベル情報の帳票用DTOを取得する
		List<NonconformityLabelDto> printList = selectLogic.selectControlNo(controlNo);

		// 帳票発行処理
		JSON json = new JSON();
		json.setSuppressNull(true);
		PrintParamDto printDto = nonconformityLabelPrintDto.data.printData;
		printDto.printBasicData.outputData = json.format(printList);
		printLogic.print(printDto);

		// コントロールNo.をクリアする
		updateLogic.clearControlNo(controlNo, systemDt);

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return printDto;
	}

	/**
	 * 拠点CDと荷主CDからシステム日付を取得する
	 * @param centerCd 拠点CD
	 * @param clientCd 荷車CD
	 * @return String システム日付
	 */
	private String getSystemDt(String centerCd, String clientCd, ErrorStatus errSts) {
		//拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			getErrorManager().add(errSts, WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			// 処理中止
			return null;
		}

		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			// 処理中止
			return null;
		}

		// システム管理日付取得
		MClientCenter mClientCenter = new MClientCenter();
		mClientCenter.setCenterId(mCenter.getCenterId());
		mClientCenter.setClientId(mClient.getClientId());
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);
		if (mClientCenter == null) {
			getErrorManager().add(errSts, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
			// 処理中止
			return null;
		}

		return mClientCenter.getSystemDt();
	}
}
