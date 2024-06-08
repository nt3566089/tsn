package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.cbean.MEdiColumnCB;
import com.oneslogi.base.dbflute.dto.MEdiColumnDto;
import com.oneslogi.base.dbflute.dtomapper.MEdiColumnDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MEdiDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv;
import com.oneslogi.base.dbflute.exentity.MEdi;
import com.oneslogi.base.dbflute.exentity.MEdiColumn;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.EdiColumnMasterDto;
import com.oneslogi.wms.logic.master.EdiColumnMasterInsertLogic;
import com.oneslogi.wms.logic.master.EdiColumnMasterSelectLogic;
import com.oneslogi.wms.logic.master.EdiColumnMasterUpdateLogic;
import com.oneslogi.wms.logic.master.EdiMasterSelectLogic;

/**
 * EDIマスタメンテナンスのリソースクラス
 */
@Path("/master/ediEdit")
public class EdiEditResource extends AbstractResource {

	// ===== 定数定義 =====

	protected static List<MEdiColumn> _mEdiColumnList = new ArrayList<MEdiColumn>();
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
		 * EDIマスタメンテナンスデータ取得異常
		 */
		protected static final int EDI_EDIT_SELECT_FAILED = 3;
		/**
		 * 登録異常
		 */
		protected static final int EDI_EDIT_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int EDI_EDIT_UPDATE_FAILED = 5;
		/**
		 * EDI名称で重複エラー異常
		 */
		protected static final int EDI_NM_DUPLICATE_ERROR = 6;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 7;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private EdiMasterSelectLogic ediMasterSelectLogic;
	@Inject
	private EdiColumnMasterSelectLogic ediColumnMasterSelectLogic;
	@Inject
	private EdiColumnMasterInsertLogic ediColumnMasterInsertLogic;
	@Inject
	private EdiColumnMasterUpdateLogic ediColumnMasterUpdateLogic;
	// ===== 使用テーブル =====
	@Inject
	private MEdiColumnBhv mMEdiColumnBhv;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・EDIマスタメンテナンス明細の空行を新規作成
	 * ・追加用の空行を作成
	 *
	 * </pre>
	 * @return EdiColumnMasterDto EDIマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/initNew")
	public EdiColumnMasterDto initNew() {

		// 画面用DTO作成
     	return new EdiColumnMasterDto();
	}

	/**
	 * <h2>初期処理（更新）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・EDIマスタメンテナンスのデータを画面用DTOに設定
	 * </pre>
	 * @param  ediId EDIID
	 * @return EdiColumnMasterDto EDIマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public EdiColumnMasterDto initUpdate(@QueryParam("ediId") Long ediId) {

		// エンティティ編集
		EdiColumnMasterDto ediColumnMasterDto = new EdiColumnMasterDto();

		MEdiDtoMapper mapperEdi = new MEdiDtoMapper();

		MEdiColumnDtoMapper mapperEdiColumn = new MEdiColumnDtoMapper();

		MEdi mEdi = new MEdi();
		mEdi.setEdiId(ediId);

		// EDIマスタメンテナンスクラスデータ取得.EDIマスタデータ取得メソッドを呼出し
		MEdi result = ediMasterSelectLogic.selectEdiMaster(mEdi, errRetSts(StatusCode.EDI_EDIT_SELECT_FAILED));

		// EDI項目マスタメンテナンスクラスデータ取得.EDI項目マスタデータ取得メソッドを呼出し
		List<MEdiColumn> resultDtl = ediColumnMasterSelectLogic.selectById(mEdi, errRetSts(StatusCode.EDI_EDIT_SELECT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		ediColumnMasterDto.data.head = mapperEdi.mappingToDto(result);
		List<MEdiColumnDto> bClassDtlDtoList = mapperEdiColumn.mappingToDtoList(resultDtl);
		ediColumnMasterDto.data.body = bClassDtlDtoList;

		return ediColumnMasterDto;

	}

	/**
	 * <h2>入力チェック（新規と更新）。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param ediColumnMasterDto EDI列マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(EdiColumnMasterDto ediColumnMasterDto) {

		// 入力チェック処理
		setupInputCheck(ediColumnMasterDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== 確認メッセージの設定 =====
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);

		return null;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 *  辞書マスタ存在チェックを行う
	 * @param ediColumnMasterDto EDIマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupInputCheck(EdiColumnMasterDto ediColumnMasterDto) {

		// Entity変換
		MEdiDtoMapper mapperEdi = new MEdiDtoMapper();
		MEdi mEdi = mapperEdi.mappingToEntity(ediColumnMasterDto.data.head);

		MEdiColumnDtoMapper mapperEdiColumn = new MEdiColumnDtoMapper();
		List<MEdiColumn> mEdiColumnList = mapperEdiColumn.mappingToEntityList( ediColumnMasterDto.data.body);

		MEdi mEdiEnt = new MEdi();
		// EDI名称重複チェック
		if (mEdi.getEdiId() == null) {

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			mEdiEnt = ediMasterSelectLogic.getUkEntity(mEdi,null);
			if (mEdiEnt != null) {
				// EDI名称で重複エラー異常を設定
				// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA Start
				//this.getErrorManager().add(this.errRetSts(StatusCode.EDI_NM_DUPLICATE_ERROR), BaseMessageConst.CLASS_CD_DUPLICATE_ERROR);
				this.getErrorManager().add(this.errRetSts(StatusCode.EDI_NM_DUPLICATE_ERROR), BaseMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA End
				// [ON推-品向-230] 戻る値を削除 2014.11.25 kei
			}

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// [ON推-品向-779] 既存データのチェックを追加する 2015.06.09 SJA Start
		int rowIndex=-1;
		// [ON推-品向-779] 既存データのチェックを追加する 2015.06.09 SJA End

		//EDIマスタメンテナンス明細情報のデータ件数分繰返
		for(MEdiColumn mEdiColumn : mEdiColumnList){
			// [ON推-品向-779] 既存データのチェックを追加する 2015.06.09 SJA Start
			rowIndex++;
			// 項目名重複チェック
			if (mEdi.getEdiId() != null) {

				// 削除フラグ自動検索無効化
				this.setBehaviorAutoDelFlg(false);

				MEdiColumnCB cb = mMEdiColumnBhv.newMyConditionBean();
				//EDIID
				cb.query().setEdiId_Equal(mEdi.getEdiId());
				//EDI項目名
				cb.query().setEdiColumnNm_Equal(mEdiColumn.getEdiColumnNm());
				List<MEdiColumn> list = mMEdiColumnBhv.selectList(cb);
				if(list.size() != 0){
					if(!(list.get(0).getEdiColumnId().equals(mEdiColumn.getEdiColumnId()))){
					// 項目名で重複エラー異常を設定
						this.getErrorManager().add(new ErrorStatus(errRetSts(StatusCode.INPUT_CHECK), StatusCode.INPUT_CHECK, rowIndex), BaseMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
					}
				}

				// 削除フラグ自動検索有効化
				this.setBehaviorAutoDelFlg(true);
			}
			// [ON推-品向-779] 既存データのチェックを追加する 2015.06.09 SJA End

			//削除フラグ
			if(mEdiColumn.getDelFlg() == null){
				mEdiColumn.setDelFlg_$0();
			}
		}

		_mEdiColumnList = mEdiColumnList;

		return null;
	}

	/**
	 * <h2>EDIマスタ登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにEDIマスタとEDI明細マスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param ediColumnMasterDto EDIマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(EdiColumnMasterDto ediColumnMasterDto) {

		// Entity変換
		MEdiDtoMapper mapperEdi = new MEdiDtoMapper();
		MEdi mEdi = mapperEdi.mappingToEntity(ediColumnMasterDto.data.head);

		MEdiColumnDtoMapper mapperEdiColumn = new MEdiColumnDtoMapper();
		List<MEdiColumn> mEdiColumnList = mapperEdiColumn.mappingToEntityList( ediColumnMasterDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(ediColumnMasterDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		mEdiColumnList = _mEdiColumnList;

		// EDIマスタ登録
		ediColumnMasterInsertLogic.insert(mEdi, mEdiColumnList,errRetSts(StatusCode.EDI_EDIT_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		//[ON推-品向-157]「正常に登録されました。」に修正 2014.11.26 衛 Start
		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-157]「正常に登録されました。」に修正 2014.11.26 衛 End
		return null;
	}

	/**
	 * <h2>EDIマスタ更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにEDIマスタを更新し。
	 * EDI明細マスタを更新または削除または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param ediColumnMasterDto EDIマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(EdiColumnMasterDto ediColumnMasterDto) {

		// Entity変換
		MEdiDtoMapper mapperEdi = new MEdiDtoMapper();
		MEdi mEdi = mapperEdi.mappingToEntity(ediColumnMasterDto.data.head);

		MEdiColumnDtoMapper mapperEdiColumn = new MEdiColumnDtoMapper();
		List<MEdiColumn> mEdiColumnList = mapperEdiColumn.mappingToEntityList( ediColumnMasterDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(ediColumnMasterDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		mEdiColumnList = _mEdiColumnList;

		// EDIマスタ更新
		ediColumnMasterUpdateLogic.update(mEdi,mEdiColumnList, errRetSts(StatusCode.EDI_EDIT_UPDATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}