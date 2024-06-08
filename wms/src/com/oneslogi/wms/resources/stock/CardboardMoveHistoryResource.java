package com.oneslogi.wms.resources.stock;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dtomapper.customize.SqlCardboardMoveHistoryListDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.customize.SqlCardboardMoveHistoryList;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.dto.stock.CardboardMoveHistoryDto;
import com.oneslogi.wms.dto.stock.CardboardMoveHistoryDto.CardboardMoveHistorySearchConditionDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.CsrwhadmSelectLogic;
import com.oneslogi.wms.logic.stock.CardboardMoveHistorySelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 段ボール移動履歴画面のリソースクラス。
 */
@Path("/stock/cardboardMoveHistory")
public class CardboardMoveHistoryResource extends AbstractWmsResource {
	
	// ===== 定数定義 =====
	protected static class StatusCode {
		// 正常終了
		protected static final int SUCCESS = 0;
		// ユーザによる確認
		protected static final int CONFIRMATION = 1;
		// データ未存在
		protected static final int NOT_FOUND_DATA = 2;
		// 入力値エラー
		protected static final int INPUT_ERROR = 3;
		// 入力値エラー
		protected static final int INPUT_ERRORxxx = 4;
		//センタCD未存在エラー
		protected static final int CENTER_NOT_FOUND_ERROR = 5;
		//荷主CD未存在エラー
		protected static final int CLIENT_NOT_FOUND_ERROR = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CardboardMoveHistorySelectLogic cardboardMoveHistorySelectLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CsrwhadmSelectLogic csrwhadmSelectLogic;
		
	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CardboardMoveHistoryDto 段ボール移動履歴画面用DTO
	 */
		
	@GET
	@Path("/init")
	public CardboardMoveHistoryDto initNew() {

		// 画面用DTO作成
		CardboardMoveHistoryDto dto = new CardboardMoveHistoryDto();

		return dto;
	}
		
	/**
	 * <h2>検索処理</h2>
	 * <pre>
	 * 検索ボタンを押下時、データ出力する
	 * </pre>
	 * @return CardboardMoveHistoryDto 段ボール移動履歴画面用DTO
	 */
	@GET
	@Path("/search")
	public CardboardMoveHistoryDto search(CardboardMoveHistoryDto dto){
		//初期化処理
		CardboardMoveHistorySearchConditionDto cond = dto.data.searchCondition;
			
		///////////////////////////////////////////
		// 引数チェック
		///////////////////////////////////////////
		cardboardMoveHistorySelectLogic.mappingAndInputCheck(cond,errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}


		///////////////////////////////////////////
		// 検索実行
		///////////////////////////////////////////
		List<SqlCardboardMoveHistoryList> sqlCardboardMoveHistoryList = cardboardMoveHistorySelectLogic.getSqlCardboardMoveHistory(cond, dto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}



		///////////////////////////////////////////
			// EntityToDtoマッピング
		///////////////////////////////////////////
		SqlCardboardMoveHistoryListDtoMapper sqlCardboardMoveHistoryListMapper = new SqlCardboardMoveHistoryListDtoMapper();
		dto.data.resultList = sqlCardboardMoveHistoryListMapper.mappingToDtoList(sqlCardboardMoveHistoryList);

		return dto;
	}

	@GET
	@Path("/check")
	public StatusDto check(CardboardMoveHistoryDto dto){
		//初期化処理
		CardboardMoveHistorySearchConditionDto cond = dto.data.searchCondition;

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(cond.getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter, errRetSts(StatusCode.INPUT_ERROR));

		if (getErrorManager().size() > 0) {
			return null;
		}


		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(cond.getClientCd());
		mClient = clientLogic.getUkEntity(mClient, errRetSts(StatusCode.INPUT_ERROR));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}
		cond.setClientId(mClient.getClientId());


		csrwhadmSelectLogic.csrwhadmSelect(mClient.getClientId(),mCenter.getCenterId(), errRetSts(StatusCode.INPUT_ERRORxxx));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}



		return null;
	}
	
}
