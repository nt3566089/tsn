package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.customize.SqlCenterProductControlMasterListDto;
import com.oneslogi.base.dbflute.dtomapper.MMfwhxitemDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.customize.SqlCenterProductControlMasterListDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MMfwhxitem;
import com.oneslogi.base.dbflute.exentity.customize.SqlCenterProductControlMasterList;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterProductControlMasterListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CenterProductControlMasterSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 拠点別銘柄制御マスタメンテナンス(一覧)のリソースクラス
 */
@Path("/master/CenterProductControlMasterList")
public class CenterProductControlMasterListResource extends AbstractWmsResource {

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
		 * 荷主CD未存在エラー
		 */
		protected static final int CLIENT_NOT_FOUND_ERROR = 2;
		/**
		 * 一覧データ取得異常
		 */
		protected static final int SEARCH_DATA_ERROR = 3;
		/**
		 * センタCD未存在エラー
		 */
		protected static final int CENTER_NOT_FOUND_ERROR = 4;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterProductControlMasterSelectLogic CenterProductControlMasterSelectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterProductControlMasterListDto 拠点別銘柄制御マスタメンテナンス(一覧)画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterProductControlMasterListDto init() {

		// 画面用DTO作成
		CenterProductControlMasterListDto CenterProductControlMasterListDto = new CenterProductControlMasterListDto();

		return CenterProductControlMasterListDto;
	}

	//拠点別銘柄制御マスタメンテナンス(一覧)検索データ取得。

	@GET
	@Path("/selectByConditions")
	public CenterProductControlMasterListDto selectByConditions(CenterProductControlMasterListDto dto) {

		//Dto-Entity変換
		 MMfwhxitemDtoMapper mapper = new MMfwhxitemDtoMapper();
		 MMfwhxitem mfwhxitem = mapper.mappingToEntity(dto.data.head);
		 SqlCenterProductControlMasterListDtoMapper mappersql = new SqlCenterProductControlMasterListDtoMapper();

		 //(2)拠点ID取得
		 //(A)検索.拠点から拠点マスタを単一検索、拠点IDを取得する。
		 MCenter centerCondition = new MCenter();
		 centerCondition.setCenterCd(dto.data.head.getMCenter().getCenterCd());
		 centerCondition = centerLogic.getUkEntityWithDeletedCheck(centerCondition);

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
			if (centerCondition == null) {
				getErrorManager().add(errRetSts(StatusCode.CENTER_NOT_FOUND_ERROR), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
				return null;
			}
		 long centerId = centerCondition.getCenterId();
		 mfwhxitem.setCenterId(centerId);

		 //(3)荷主ID取得
		 //(A)検索.荷主から荷主マスタを単一検索、荷主IDを取得する。
		 MClient clientCondition = new MClient();
		 clientCondition.setClientCd(dto.data.head.getMClient().getClientCd());
		 clientCondition = clientLogic.getUkEntityWithDeletedCheck(clientCondition);

		//(B)エラーが発生した場合、エラーメッセージを出力し、処理を中断する。
			if (clientCondition == null) {
				getErrorManager().add(errRetSts(StatusCode.CLIENT_NOT_FOUND_ERROR), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
				return null;
			}
		 long clientId = clientCondition.getClientId();
		 mfwhxitem.setClientId(clientId);

		 //レコード数検索実行
		CenterProductControlMasterSelectLogic.getSqlCenterProductControlMasterCount(mfwhxitem, errRetSts(StatusCode.SEARCH_DATA_ERROR));

		// エラー有りの場合は終了
		if(getErrorManager().size()>0){
			return null;
		}

		//リスト検索実行dto.paging,
		List<SqlCenterProductControlMasterList> sqlCenterProductControlMasterList =
				CenterProductControlMasterSelectLogic.getSqlCenterProductControlMasterList(mfwhxitem, dto.paging,errRetSts(StatusCode.SEARCH_DATA_ERROR));

		 // エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		//Entity-Dto変換処理
		List<SqlCenterProductControlMasterListDto> list = mappersql.mappingToDtoList(sqlCenterProductControlMasterList);

		//検索結果詰込処理
		dto.data.body = list;
		return dto;

	}
}
