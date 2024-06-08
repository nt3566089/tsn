package com.oneslogi.wms.resources.operation;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.customize.SqlWorkloadInquiryListDto;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlWorkloadInquiryListDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlWorkloadInquiryList;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.operation.WorkloadInquiryDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.operation.WorkloadInquirySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 作業量照会画面のリソースクラス。
 */
@Path("/operation/workloadInquiry")
public class WorkloadInquiryResource extends AbstractWmsResource {

	// ===== 定数定義 =====

	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 作業量照会一覧データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
	}

	// ===== メンバ変数 =====

	// ===== 使用ロジッククラス =====
	@Inject
	private WorkloadInquirySelectLogic selectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return WorkloadInquiryDto 作業量照会一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public WorkloadInquiryDto init() {

		WorkloadInquiryDto workloadInquiryDto = new WorkloadInquiryDto();

		return workloadInquiryDto;
	}

	/**
	 * <h2>作業量照会一覧データ取得</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力された検索条件を元に、作業量照会一覧データ取得
	 * </pre>
	 * @param workloadInquiryDto 作業量照会画面用DTO
	 * @return resultWorkloadInquiryDto 作業量照会画面用DTO
	 */
	@GET
	@Path("/search")
	public WorkloadInquiryDto search(WorkloadInquiryDto workloadInquiryDto) {

		WorkloadInquiryDto resultWorkloadInquiryDto = new WorkloadInquiryDto();

		// Entity変換
		SqlWorkloadInquiryListDtoMapper mapper = new SqlWorkloadInquiryListDtoMapper();
		final SqlWorkloadInquiryList header = mapper.mappingToEntity(workloadInquiryDto.data.head);
		List<SqlWorkloadInquiryList> bodyList = mapper.mappingToEntityList(workloadInquiryDto.data.list);

		// 拠点ID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(header.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		if (mCenter == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
			return null;
		}

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(header.getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		if (mClient == null) {
			this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
			return null;
		}

		// 作業量照会一覧データ取得用
		List<SqlWorkloadInquiryList> page = selectLogic.select(header, bodyList, workloadInquiryDto.paging,
				errRetSts(StatusCode.NOT_FOUND_DATA), false);

		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		List<SqlWorkloadInquiryListDto> list = mapper.mappingToDtoList(page);

		//検索結果詰め替え処理
		resultWorkloadInquiryDto.paging = workloadInquiryDto.paging;
		resultWorkloadInquiryDto.data.list = list;

		return resultWorkloadInquiryDto;
	}

	/**
	 * <h2>CSV出力</h2>
	 * <pre>
	 * CSVファイルを出力する。
	 *
	 * </pre>
	 * @param workloadInquiryDto 作業量照会画面用DTO
	 * @return resultWorkloadInquiryDto 作業量照会画面用DTO
	 */
	@GET
	@Path("/csvOutput")
	public WorkloadInquiryDto csvOutput(final WorkloadInquiryDto workloadInquiryDto) {

		WorkloadInquiryDto resultWorkloadInquiryDto = new WorkloadInquiryDto();

		// Entity変換
		SqlWorkloadInquiryListDtoMapper mapper = new SqlWorkloadInquiryListDtoMapper();
		final SqlWorkloadInquiryList header = mapper.mappingToEntity(workloadInquiryDto.data.head);
		List<SqlWorkloadInquiryList> headerList = mapper.mappingToEntityList(workloadInquiryDto.data.list);

		List<SqlWorkloadInquiryList> selectCsvList = selectLogic.select(header, headerList, workloadInquiryDto.paging,
				errRetSts(StatusCode.NOT_FOUND_DATA), true);

		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		List<SqlWorkloadInquiryListDto> list = mapper.mappingToDtoList(selectCsvList);

		// 検索結果詰め替え処理
		resultWorkloadInquiryDto.data.list = list;

		return resultWorkloadInquiryDto;
	}

}
