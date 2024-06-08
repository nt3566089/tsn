package com.oneslogi.wms.resources.master;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dtomapper.MCenterClassDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.CenterClassMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.CenterClassMasterDeleteLogic;
import com.oneslogi.wms.logic.master.CenterClassMasterSelectLogic;

/**
 * センタ区分値マスタ一覧のリソースクラス
 */
@Path("/master/centerClassList")
public class CenterClassListResource extends AbstractResource {

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
		 * センタ区分値マスタ一覧データ取得異常
		 */
		protected static final int CENTER_CLASS_MASTER_LIST_FAILED = 2;
		/**
		 * 削除異常
		 */
		protected static final int CENTER_CLASS_MASTER_DELETE_FAILED = 3;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClassMasterSelectLogic  centerClassMasterSelectLogic ;
	@Inject
	private CenterClassMasterDeleteLogic  centerClassMasterDeleteLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterClassMasterDto センタ区分値マスタ一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterClassMasterDto init() {

		// 画面用DTO作成
		CenterClassMasterDto centerClassMasterDto = new CenterClassMasterDto();

		return centerClassMasterDto;
	}

	/**
	 * <h2>センタ区分値マスタ一覧データ取得。</h2>
	 * <pre>
	 * ・データベースにセンタ区分値マスタ一覧データを取得する
	 * </pre>
	 * @param  centerClassMasterDto センタ区分値マスタ一覧画面用DTO
	 * @return CenterClassMasterDto センタ区分値マスタ一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public CenterClassMasterDto search(CenterClassMasterDto centerClassMasterDto) {

			// エンティティ編集
			MCenterClassDtoMapper mapper = new MCenterClassDtoMapper();
			MCenterClass mCenterClass = mapper.mappingToEntity(centerClassMasterDto.data.head);

			// ===== センタCd取得とセンタID設定 =====
			String centerCd = mCenterClass.getMCenter().getCenterCd();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCd);
			mCenter = centerLogic.getUkEntity(mCenter);
			if(mCenter != null){
				mCenterClass.setCenterId(mCenter.getCenterId());
			}else{
				mCenterClass.setCenterId(null);
			}

			CenterClassMasterDto centerClassDto = new CenterClassMasterDto();

		    // センタ区分値マスタ一覧データ取得.センタ区分値マスタ一覧データ取得メソッドを呼出し
			PagingResultBean<MCenterClass> page = centerClassMasterSelectLogic.select(mCenterClass,centerClassMasterDto.paging, errRetSts(StatusCode.CENTER_CLASS_MASTER_LIST_FAILED));

			// エラー有りの場合は終了
			if (getErrorManager().size() > 0) {
				return null ;
			}

			//検索結果詰込処理
			centerClassDto.data.body = mapper.mappingToDtoList(page);
			centerClassDto.paging = centerClassMasterDto.paging;
			return centerClassDto;
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
	 * @param centerClassMasterDto センタ区分値マスタ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/checkDelete")
	public StatusDto checkDelete(CenterClassMasterDto centerClassMasterDto,ErrorStatus errSts) {

		// 通常の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_DELETE_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>センタ区分値マスタ削除。</h2>
	 * <pre>
	 * センタ区分値マスタ削除。
	 * エラーがない場合は、データベースにセンタ区分値マスタ削除を削除し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerClassMasterDto センタ区分値マスタ一覧画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/delete")
	public StatusDto delete(CenterClassMasterDto centerClassMasterDto) {

		// エンティティ編集
		MCenterClassDtoMapper mapper = new MCenterClassDtoMapper();
		List<MCenterClass> mCenterClassList = mapper.mappingToEntityList(centerClassMasterDto.data.body);

		for(MCenterClass mCenterClassEnt : mCenterClassList){
			// ===== センタ区分値マスタ削除.センタ区分値マスタ削除メソッドを呼出し =====
			centerClassMasterDeleteLogic.delete(mCenterClassEnt, errRetSts(StatusCode.CENTER_CLASS_MASTER_DELETE_FAILED));

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
