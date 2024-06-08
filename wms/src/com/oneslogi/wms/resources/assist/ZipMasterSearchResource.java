package com.oneslogi.wms.resources.assist;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dbflute.dtomapper.MZipDtoMapper;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.wms.dto.assist.ZipMasterSearchDto;
import com.oneslogi.wms.logic.assist.ZipListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 郵便番号マスタ検索画面のリソースクラス。
 */
@Path("/assist/zipMasterSearch")
public class ZipMasterSearchResource extends AbstractWmsResource {

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
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 郵便番号マスタデータ取得異常
		 */
		protected static final int ZIP_MASTER_SELECT_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ZipListSelectLogic selectLogic;


	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ZipMasterSearchDto 郵便番号マスタ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ZipMasterSearchDto initNew() {

		// 画面用DTO作成
		ZipMasterSearchDto zipMasterSearchDto = new ZipMasterSearchDto();

		return zipMasterSearchDto;
	}

	/**
	 * <h2>郵便番号マスタデータ取得。</h2>
	 * <pre>
	 * ・郵便番号マスタデータ取得
	 * </pre>
	 * @param zipMasterSearchDto 郵便番号マスタ検索画面用DTO
	 * @return ZipMasterSearchDto 郵便番号マスタ検索画面用DTO
	 */
	@GET
	@Path("/search")
	public ZipMasterSearchDto search(ZipMasterSearchDto zipMasterSearchDto) {

		// Entity変換
		MZipDtoMapper headerMapper = new MZipDtoMapper();
		MZip header = headerMapper.mappingToEntity(zipMasterSearchDto.data.head);

		// 郵便番号マスタ取得用
		PagingResultBean<MZip> page = selectLogic.select(header, zipMasterSearchDto.paging, errRetSts(StatusCode.ZIP_MASTER_SELECT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Dto変換処理
		MZipDtoMapper mapper = new MZipDtoMapper();
		List<MZipDto> list = mapper.mappingToDtoList(page);

		zipMasterSearchDto.data.body = list;


		return zipMasterSearchDto;
	}

}
