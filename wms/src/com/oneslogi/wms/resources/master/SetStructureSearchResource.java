package com.oneslogi.wms.resources.master;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MSetParentDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MSetParent;
import com.oneslogi.wms.dto.master.SetStructureSearchDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.SetStructureSearchSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * セット品構成マスタメンテナンス(一覧)のリソースクラス
 */
@Path("/master/setStructureSearch")
public class SetStructureSearchResource extends AbstractWmsResource {

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
		 * セット品構成マスタメンテナンス(一覧)データ取得異常
		 */
		protected static final int SET_STRUCTURE_SEARCH_SELECT_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private SetStructureSearchSelectLogic setStructureSearchSelectLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理</h2>
	 * 
	 * <pre>
	 * ・セット品構成マスタメンテナンス(一覧)画面用DTOの作成
	 * </pre>
	 * 
	 * @return SetStructureSearchDto セット品構成マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public SetStructureSearchDto init() {
		return new SetStructureSearchDto();
	}

	/**
	 * <h2>検索</h2>
	 * 
	 * <pre>
	 * ・データベースにセット品構成マスタメンテナンス(一覧)データを取得する
	 * </pre>
	 * 
	 * @param setStructureSearchDto セット品構成マスタメンテナンス(一覧)画面用DTO
	 * @return SetStructureSearchDto セット品構成マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/search")
	public SetStructureSearchDto search(SetStructureSearchDto setStructureSearchDto) throws IOException {
		SetStructureSearchDto setStructureDto = new SetStructureSearchDto();
		// Entity変換
		MSetParentDtoMapper headerMapper = new MSetParentDtoMapper();
		MSetParent header = headerMapper.mappingToEntity(setStructureSearchDto.data.head);

		// マスタ検索で必要なIDの取得
		MClient clientCondition = new MClient();
		clientCondition.setClientCd(header.getMProduct().getMClient().getClientCd());
		long clientId = clientLogic.getUkEntityWithDeletedCheck(clientCondition).getClientId();
		header.getMProduct().setClientId(clientId);

		// セット品構成マスタメンテナンス(一覧)データ取得
		PagingResultBean<MSetParent> page = setStructureSearchSelectLogic.selectByConditions(header,setStructureSearchDto.paging,errRetSts(StatusCode.SET_STRUCTURE_SEARCH_SELECT_FAILED));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// 検索結果詰込処理
		setStructureDto.data.body = headerMapper.mappingToDtoList(page);
		setStructureDto.paging = setStructureSearchDto.paging;

		return setStructureDto;
	}
}
