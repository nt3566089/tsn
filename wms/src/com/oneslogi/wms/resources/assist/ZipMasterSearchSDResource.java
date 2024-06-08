package com.oneslogi.wms.resources.assist;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.MZipDto;
import com.oneslogi.base.dbflute.dtomapper.MZipDtoMapper;
import com.oneslogi.base.dbflute.exentity.MZip;
import com.oneslogi.wms.dto.assist.ZipMasterSearchSDDto;
import com.oneslogi.wms.logic.assist.ZipListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * SD用郵便番号マスタ検索画面のリソースクラス。
 */
@Path("/assist/zipMasterSearchSD")
public class ZipMasterSearchSDResource extends AbstractWmsResource {

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
	 * @return ZipMasterSearchSDDto SD用郵便番号マスタ検索画面用DTO
	 */
	@GET
	@Path("/initNew")
	public ZipMasterSearchSDDto initNew() {

		// 画面用DTO作成
		ZipMasterSearchSDDto zipMasterSearchSDDto = new ZipMasterSearchSDDto();

		return zipMasterSearchSDDto;
	}

	/**
	 * <h2>郵便番号マスタデータ取得。</h2>
	 * <pre>
	 * ・郵便番号マスタデータ取得
	 * </pre>
	 * @param zipMasterSearchSDDto SD用郵便番号マスタ検索画面用DTO
	 * @return ZipMasterSearchSDDto SD用郵便番号マスタ検索画面用DTO
	 */
	@GET
	@Path("/search")
	public ZipMasterSearchSDDto search(ZipMasterSearchSDDto zipMasterSearchSDDto) {

		// Entity変換
		MZipDtoMapper headerMapper = new MZipDtoMapper();
		MZip header = headerMapper.mappingToEntity(zipMasterSearchSDDto.data.head);

		// 郵便番号マスタ取得用
		PagingResultBean<MZip> page = selectLogic.select(header, zipMasterSearchSDDto.paging, errRetSts(StatusCode.ZIP_MASTER_SELECT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// Dto変換処理
		MZipDtoMapper mapper = new MZipDtoMapper();
		List<MZipDto> list = mapper.mappingToDtoList(page);

		zipMasterSearchSDDto.data.body = list;


		return zipMasterSearchSDDto;
	}

}
