package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dtomapper.MEdiDtoMapper;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.EdiMasterDto;
import com.oneslogi.wms.logic.master.EdiMasterDeleteLogic;
import com.oneslogi.wms.logic.master.EdiMasterSelectLogic;

/**
 * EDIマスタ一覧のリソースクラス
 */
@Path("/master/ediList")
public class EdiListResource extends AbstractResource {

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
		 * EDIマスタ一覧データ取得異常
		 */
		protected static final int EDI_MASTER_LIST_FAILED = 2;
		/**
		 * 削除異常
		 */
		protected static final int EDI_MASTER_DELETE_FAILED = 3;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private EdiMasterSelectLogic  ediMasterSelectLogic ;
	@Inject
	private EdiMasterDeleteLogic  ediMasterDeleteLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ClassMasterDto EDIマスタ一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public EdiMasterDto init() {

		// 画面用DTO作成
		EdiMasterDto ediMasterDto = new EdiMasterDto();

		return ediMasterDto;
	}

	/**
	 * <h2>EDIマスタ一覧データ取得。</h2>
	 * <pre>
	 * ・データベースにEDIマスタ一覧データを取得する
	 * </pre>
	 * @param  ediMasterDto EDIマスタ一覧画面用DTO
	 * @return ClassMasterDto  EDIマスタ一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public EdiMasterDto search(EdiMasterDto ediMasterDto) {

			// エンティティ編集
			MEdiDtoMapper mapper = new MEdiDtoMapper();
			MEdi mEdi = mapper.mappingToEntity(ediMasterDto.data.head);

			EdiMasterDto classDto = new EdiMasterDto();

		    // EDIマスタ一覧データ取得.EDIマスタ一覧データ取得メソッドを呼出し
			PagingResultBean<MEdi> page = ediMasterSelectLogic.select(mEdi,ediMasterDto.paging, errRetSts(StatusCode.EDI_MASTER_LIST_FAILED));

			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null ;
			}

			//検索結果詰込処理
			classDto.data.body = mapper.mappingToDtoList(page);
			classDto.paging = ediMasterDto.paging;
			return classDto;
	}

	/**
	 * <h2>チェック処理（削除）。</h2>
	 * <pre>
	 * 削除データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 * @param classMasterDto EDIマスタ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDelete")
	public StatusDto checkDelete(EdiMasterDto classMasterDto,ErrorStatus errSts) {

		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_DELETE_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>EDIマスタ削除。</h2>
	 * <pre>
	 * EDIマスタ削除。
	 * エラーがない場合は、データベースにEDIマスタ削除を削除し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param ediMasterDto EDIマスタ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/delete")
	public StatusDto delete(EdiMasterDto ediMasterDto) {

		// エンティティ編集
		MEdiDtoMapper mapper = new MEdiDtoMapper();
		List<MEdi> mEdiList = mapper.mappingToEntityList(ediMasterDto.data.body);

		for(MEdi mEdiEnt : mEdiList){
			// ===== EDIマスタ削除.EDIマスタ削除メソッドを呼出し =====
			ediMasterDeleteLogic.delete(mEdiEnt, errRetSts(StatusCode.EDI_MASTER_DELETE_FAILED));

			// ===== エラーが存在する場合 =====
			if (0 < getErrorManager().size()) {
				// ===== 処理中止 =====
				return null;
			}
		}

		// ===== 完了メッセージをエラー管理クラスに登録 =====
		getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.PROCESS_COMPLETE_INFORMATION);

		return null;
	}
}
