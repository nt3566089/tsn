package com.oneslogi.wms.resources.master;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.wms.dto.master.CenterMasterListDto;
import com.oneslogi.wms.logic.master.CenterMasterMaintenanceSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタマスタメンテナンス(一覧)のリソースクラス
 */
@Path("/master/centerMasterList")
public class CenterMasterListResource extends AbstractWmsResource {

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
		 * 一覧データ取得異常
		 */
		protected static final int CENTER_MASTER_LIST_FAILED = 2;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterMasterMaintenanceSelectLogic centerMasterMaintenanceSelectLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterMasterListDto センタマスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterMasterListDto init() {

		// 画面用DTO作成
		CenterMasterListDto centerMasterListDto = new CenterMasterListDto();

		return centerMasterListDto;
	}

	/**
	 * <h2>センタマスタメンテナンス(一覧)検索データ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・画面で入力されたCDを元にIDを取得し、データベースにセンタマスタメンテナンス(一覧)データを取得する
	 * </pre>
	 * @param  centerMasterListDto センタマスタメンテナンス(一覧)検索画面用DTO
	 * @return CenterMasterListDto センタマスタメンテナンス(一覧)検索画面用DTO
	 */
	@GET
	@Path("/selectByConditions")
	public CenterMasterListDto selectByConditions(CenterMasterListDto centerMasterListDto) {

		// エンティティ編集
		MCenterDtoMapper mapper = new MCenterDtoMapper();
		// [C-CWMS-0039] センタ間移動機能を追加(住所1を削除) 2015.09.17 kawana Start
		MCenter mCenter = mapper.mappingToEntity(centerMasterListDto.data.head);

		// センタマスタメンテナンス(一覧)検索データ取得.検索データ取得メソッドを呼出し
		PagingResultBean<MCenter> page = centerMasterMaintenanceSelectLogic.selectByConditions(mCenter, centerMasterListDto.paging, errRetSts(StatusCode.CENTER_MASTER_LIST_FAILED));
		// [C-CWMS-0039] センタ間移動機能を追加(住所1を削除) 2015.09.17 kawana End

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		centerMasterListDto.data.body = mapper.mappingToDtoList(page);
		return centerMasterListDto;

	}
}
