package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dto.MCenterClassDtlDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterClassDtlDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCenterClassDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.wms.dto.master.CenterClassDtlMasterDto;
import com.oneslogi.wms.logic.common.CenterClassLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.master.CenterClassDtlMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClassDtlMasterSelectLogic;
import com.oneslogi.wms.logic.master.CenterClassDtlMasterUpdateLogic;

/**
 * センタ区分値マスタメンテナンスのリソースクラス
 */
@Path("/master/centerClassEdit")
public class CenterClassEditResource extends AbstractResource {

	// ===== 定数定義 =====

	protected static List<MCenterClassDtl> _mCenterClassDtlList = new ArrayList<MCenterClassDtl>();
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
		 * 辞書マスタ存在異常
		 */
		protected static final int DICT_DATA_FOUND_ERROR = 2;
		/**
		 * センタ区分値マスタメンテナンスデータ取得異常
		 */
		protected static final int CENTER_CLASS_EDIT_SELECT_FAILED = 3;
		/**
		 * 登録異常
		 */
		protected static final int CENTER_CLASS_EDIT_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CENTER_CLASS_EDIT_UPDATE_FAILED = 5;
		/**
		 * 区分値CDで重複エラー異常
		 */
		protected static final int CLASS_CD_DUPLICATE_ERROR = 6;
		/**
		 * 入力チェック異常
		 */
		protected static final int INPUT_CHECK = 7;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClassDtlMasterSelectLogic centerClassDtlMasterSelectLogic;
	@Inject
	private CenterClassDtlMasterInsertLogic centerClassDtlMasterInsertLogic;
	@Inject
	private CenterClassDtlMasterUpdateLogic centerClassDtlMasterUpdateLogic;
	// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana Start
	@Inject
	private VDictLogic vDictLogic;
	// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana End
	@Inject
	private CenterClassLogic centerClassLogic;
	@Inject
	private CenterLogic centerLogic;

	/**
	 * <h2>初期処理（新規）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタ区分値マスタメンテナンス明細の空行を新規作成
	 * ・追加用の空行を作成
	 *
	 * </pre>
	 * @return CenterClassDtlMasterDto センタ区分値マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/initNew")
	public CenterClassDtlMasterDto initNew() {

		// 画面用DTO作成
     	return new CenterClassDtlMasterDto();
	}

	/**
	 * <h2>初期処理（更新）。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタ区分値マスタメンテナンスのデータを画面用DTOに設定
	 * </pre>
	 * @param  centerClassId 区分値ID
	 * @return CenterClassDtlMasterDto センタ区分値マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/initUpdate")
	public CenterClassDtlMasterDto initUpdate(@QueryParam("centerClassId") Long centerClassId) {

		// エンティティ編集
		CenterClassDtlMasterDto centerClassDtlMasterDto = new CenterClassDtlMasterDto();

		MCenterClassDtoMapper mapperClass = new MCenterClassDtoMapper();

		MCenterClassDtlDtoMapper mapperClassDtl = new MCenterClassDtlDtoMapper();

		MCenterClass mCenterClass = new MCenterClass();
		mCenterClass.setCenterClassId(centerClassId);

		// センタ区分値マスタメンテナンスクラスデータ取得.センタ区分値マスタデータ取得メソッドを呼出し
		MCenterClass result = centerClassDtlMasterSelectLogic.selectCenterClassMaster(mCenterClass, errRetSts(StatusCode.CENTER_CLASS_EDIT_SELECT_FAILED));

		// センタ区分値マスタメンテナンスクラスデータ取得.センタ区分値明細マスタデータ取得メソッドを呼出し
		List<MCenterClassDtl> resultDtl = centerClassDtlMasterSelectLogic.selectById(mCenterClass, errRetSts(StatusCode.CENTER_CLASS_EDIT_SELECT_FAILED));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Dto変換処理
		centerClassDtlMasterDto.data.head = mapperClass.mappingToDto(result);
		List<MCenterClassDtlDto> mCenterClassDtlDtoList = mapperClassDtl.mappingToDtoList(resultDtl);
		centerClassDtlMasterDto.data.body = mCenterClassDtlDtoList;

		return centerClassDtlMasterDto;

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
	 * @param centerClassDtlMasterDto センタ区分値マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterClassDtlMasterDto centerClassDtlMasterDto) {

		// 入力チェック処理
		setupInputCheck(centerClassDtlMasterDto);

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
	 * @param centerClassDtlMasterDto センタ区分値マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	protected StatusDto setupInputCheck(CenterClassDtlMasterDto centerClassDtlMasterDto) {

		// Entity変換
		MCenterClassDtoMapper mapperClass = new MCenterClassDtoMapper();
		MCenterClass mCenterClass = mapperClass.mappingToEntity(centerClassDtlMasterDto.data.head);

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

		MCenterClassDtlDtoMapper mapperClassDtl = new MCenterClassDtlDtoMapper();
		List<MCenterClassDtl> mCenterClassDtlList = mapperClassDtl.mappingToEntityList(centerClassDtlMasterDto.data.body);

		MCenterClass mCenterClassEnt = new MCenterClass();
		// 区分値CD重複チェック
		if (mCenterClass.getCenterClassId() == null) {

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			mCenterClassEnt = centerClassLogic.getUkEntity(mCenterClass);
			if (mCenterClassEnt != null) {
				// 区分値CDで重複エラー異常を設定
				// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA Start
				//this.getErrorManager().add(this.errRetSts(StatusCode.CLASS_CD_DUPLICATE_ERROR), BaseMessageConst.CLASS_CD_DUPLICATE_ERROR);
				this.getErrorManager().add(this.errRetSts(StatusCode.CLASS_CD_DUPLICATE_ERROR), BaseMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
				// [ON推-品向-779] 既存データとの重複エラーのメッセージ（略称）を「既に登録済」に変更する 2015.05.20 SJA End
			}

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		int rowIndex=-1;

		//センタ区分値マスタメンテナンス明細情報のデータ件数分繰返
		for(MCenterClassDtl mCenterClassDtl : mCenterClassDtlList){

			rowIndex++;

			// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//			BDict bDict =new BDict();
//			bDict.setDictNm(mCenterClassDtl.getVDict().getDictNm());
//
//			//辞書IDの取得
//			BDict bdictNm =dictMasterSelectLogic.selectId(bDict,errRetSts(StatusCode.DICT_DATA_FOUND_ERROR));
//			if(bdictNm == null){
//				// 辞書マスタ存在チェックエラー異常を設定
//				this.getErrorManager().add(new ErrorStatus(errRetSts(StatusCode.INPUT_CHECK), StatusCode.DICT_DATA_FOUND_ERROR, rowIndex), BaseMessageConst.DICT_NM_NOT_FOUND_IN_DICT_MASTER_ERROR);
//			}else{
//				mCenterClassDtl.setDictId(bdictNm.getDictId());
//			}

			VDict vDict =new VDict();
			vDict.setDictNm(mCenterClassDtl.getVDict().getDictNm());
			// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana Start
			VDict vdictNm = vDictLogic.getUkEntity(vDict, new ErrorStatus(errRetSts(StatusCode.INPUT_CHECK), StatusCode.DICT_DATA_FOUND_ERROR, rowIndex));

			if (vdictNm != null) {
				// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana End
				mCenterClassDtl.setDictId(vdictNm.getDictId());
			}
			// [ON推-品向-562] 多言語対応 2015.05.20 ki End

			//デフォルトフラグ
			if(mCenterClassDtl.getDefaultFlg() == null){
				mCenterClassDtl.setDefaultFlg("0");
			}
			//削除フラグ
			if(mCenterClassDtl.getDelFlg() == null){
				mCenterClassDtl.setDelFlg_$0();
			}
		}

		_mCenterClassDtlList = mCenterClassDtlList;

		return null;
	}

	/**
	 * <h2>センタ区分値マスタ登録。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにセンタ区分値マスタとセンタ区分値明細マスタを登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerClassDtlMasterDto センタ区分値マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CenterClassDtlMasterDto centerClassDtlMasterDto) {

		// Entity変換
		MCenterClassDtoMapper mapperClass = new MCenterClassDtoMapper();
		MCenterClass mCenterClass = mapperClass.mappingToEntity(centerClassDtlMasterDto.data.head);

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

		MCenterClassDtlDtoMapper mapperClassDtl = new MCenterClassDtlDtoMapper();
		List<MCenterClassDtl> mCenterClassDtlList = mapperClassDtl.mappingToEntityList( centerClassDtlMasterDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(centerClassDtlMasterDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		mCenterClassDtlList = _mCenterClassDtlList;

		// センタ区分値マスタ登録
		centerClassDtlMasterInsertLogic.insert(mCenterClass, mCenterClassDtlList,errRetSts(StatusCode.CENTER_CLASS_EDIT_INSERT_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// ===== 完了メッセージの設定 =====
		this.getInfoManager().add(this.infoRetSts(StatusCode.SUCCESS), BaseMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

	/**
	 * <h2>センタ区分値マスタ更新。</h2>
	 * <pre>
	 * エラーがない場合は、データベースにセンタ区分値マスタを更新し。
	 * センタ区分値明細マスタを更新または削除または登録し、完了メッセージを設定する。
	 *
	 * </pre>
	 * @param centerClassDtlMasterDto センタ区分値マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/update")
	public StatusDto update(CenterClassDtlMasterDto centerClassDtlMasterDto) {

		// Entity変換
		MCenterClassDtoMapper mapperClass = new MCenterClassDtoMapper();
		MCenterClass mCenterClass = mapperClass.mappingToEntity(centerClassDtlMasterDto.data.head);

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

		MCenterClassDtlDtoMapper mapperClassDtl = new MCenterClassDtlDtoMapper();
		List<MCenterClassDtl> mCenterClassDtlList = mapperClassDtl.mappingToEntityList( centerClassDtlMasterDto.data.body);

		//登録または更新チェックメソッドを呼出し
		setupInputCheck(centerClassDtlMasterDto);

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		mCenterClassDtlList = _mCenterClassDtlList;

		// センタ区分値マスタ更新
		centerClassDtlMasterUpdateLogic.update(mCenterClass,mCenterClassDtlList, errRetSts(StatusCode.CENTER_CLASS_EDIT_UPDATE_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}