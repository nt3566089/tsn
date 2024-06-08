package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dto.MCenterClassDto;
import com.oneslogi.base.dbflute.dto.MCenterClassGrpDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterClassDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCenterClassGrpDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.CenterClassGrpMasterDto;
import com.oneslogi.wms.logic.master.CenterClassGrpMasterSelectLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpMasterUpdateLogic;

/**
 * センタ区分値グループマスタメンテナンス
 */
@Path("/master/centerClassGrpEdit")
public class CenterClassGrpEditResource extends AbstractResource {

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
		 * センタ区分値グループマスタメンテナンスデータ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 更新異常
		 */
		protected static final int UPDATE_FAILED = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClassGrpMasterSelectLogic centerClassGrpMasterSelectLogic;
	@Inject
	private CenterClassGrpMasterUpdateLogic centerClassGrpMasterUpdateLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * センタ区分値グループマスタメンテナンスのデータを画面用DTOに設定
	 * </pre>
	 * @param centerClassId センタ区分値ID
	 * @return CenterClassGrpMasterDto センタ区分値グループマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterClassGrpMasterDto init(@QueryParam("centerClassId") Long centerClassId) throws IOException {
		CenterClassGrpMasterDto centerClassGrpMasterDto = new CenterClassGrpMasterDto();
		// ===== 検索データ編集 =====
		MCenterClass mCenterClass = new MCenterClass();
		// センタ区分値IDを設定
		mCenterClass.setCenterClassId(centerClassId);

		// センタ区分値グループマスタメンテナンスデータ取得.センタ区分値マスタデータ取得メソッドを呼出し
		MCenterClass result = centerClassGrpMasterSelectLogic.selectCenterClassMaster(mCenterClass, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// センタ区分値グループマスタメンテナンスデータ取得.センタ区分値グループマスタデータ取得メソッドを呼出し
		List<MCenterClassGrp> resultList = centerClassGrpMasterSelectLogic.selectCenterClassGrpMaster(mCenterClass, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// ===== Entity-Dto変換処理 =====
		// センタ区分値グループマスタメンテナンス情報
		MCenterClassDtoMapper mCenterClassDtoMapper = new MCenterClassDtoMapper();
		MCenterClassDto head = mCenterClassDtoMapper.mappingToDto(result);
		centerClassGrpMasterDto.data.head = head;

		// センタ区分値グループマスタメンテナンス画面明細情報
		MCenterClassGrpDtoMapper mCenterClassGrpDtoMapper = new MCenterClassGrpDtoMapper();
		List<MCenterClassGrpDto> body = mCenterClassGrpDtoMapper.mappingToDtoList(resultList);
		centerClassGrpMasterDto.data.body = body;

		return centerClassGrpMasterDto;
	}

	/**
	 * <h2>入力チェック（更新）。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param centerClassGrpMasterDto センタ区分値グループマスタメンテナンス画面用DTO
	 * @return statusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterClassGrpMasterDto centerClassGrpMasterDto) {
		StatusDto statusDto = new StatusDto();
		// 確認メッセージをエラー管理クラスに登録
		this.getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);
		return statusDto;
	}

	/**
	 * <h2>センタ区分値グループマスタ更新。</h2>
	 * <pre>
	 * エラーがない場合は、センタ区分値グループマスタを更新または削除または登録し、完了メッセージを設定する
	 * </pre>
	 * @param centerClassGrpMasterDto センタ区分値グループマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(CenterClassGrpMasterDto centerClassGrpMasterDto) throws Exception {
		// ===== Entity変換 =====
		// センタ区分値グループマスタメンテナンス情報
		MCenterClassDtoMapper mCenterClassDtoMapper = new MCenterClassDtoMapper();
		MCenterClass mCenterClass = mCenterClassDtoMapper.mappingToEntity(centerClassGrpMasterDto.data.head);

		// センタ区分値グループマスタメンテナンス明細情報
		MCenterClassGrpDtoMapper mCenterClassGrpDtoMapper = new MCenterClassGrpDtoMapper();
		List<MCenterClassGrp> mCenterClassGrpList = mCenterClassGrpDtoMapper.mappingToEntityList(centerClassGrpMasterDto.data.body);

		// センタ区分値グループマスタ更新.区分値グループマスタ更新メソッドを呼出し
		centerClassGrpMasterUpdateLogic.update(mCenterClass, mCenterClassGrpList, errRetSts(StatusCode.UPDATE_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
