package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.BaseMessageConst;
import com.oneslogi.base.dbflute.dto.MCenterClassGrpDtlDto;
import com.oneslogi.base.dbflute.dtomapper.MCenterClassGrpDtlDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenterClass;
import com.oneslogi.base.dbflute.exentity.MCenterClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrp;
import com.oneslogi.base.dbflute.exentity.MCenterClassGrpDtl;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.master.CenterClassGrpDtlDto;
import com.oneslogi.wms.logic.common.CenterClassGrpLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpDtlMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClassGrpDtlMasterSelectLogic;

/**
 * センタ区分値グループ明細マスタメンテナンス
 */
@Path("/master/centerClassGrpDtlEdit")
public class CenterClassGrpDtlEditResource extends AbstractResource {

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
		 * センタ区分値マスタデータ取得異常
		 */
		protected static final int NOT_FOUND_HEAD_DATA = 2;
		/**
		 * センタ区分値グループ明細マスタデータ取得異常
		 */
		protected static final int NOT_FOUND_BODY_DATA = 3;
		/**
		 * センタ区分値グループ明細マスタデータ登録異常
		 */
		protected static final int UPDATE_FAILED = 4;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClassGrpDtlMasterSelectLogic centerClassGrpDtlMasterSelectLogic;
	@Inject
	private CenterClassGrpDtlMasterInsertLogic centerClassGrpDtlMasterInsertLogic;
	@Inject
	private CenterClassGrpLogic centerClassGrpLogic;


	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * 画面用DTOの作成
	 * センタ区分値グループマスタメンテナンスのデータを画面用DTOに設定
	 * </pre>
	 * @param centerClassId センタ区分値ID
	 * @return CenterClassGrpDtlDto センタ区分値グループマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterClassGrpDtlDto init(@QueryParam("centerClassId") Long centerClassId) {
		CenterClassGrpDtlDto centerClassGrpMasterDto = new CenterClassGrpDtlDto();
		// ===== 検索データ編集 =====
		MCenterClass mCenterClass = new MCenterClass();
		// センタ区分値IDを設定
		mCenterClass.setCenterClassId(centerClassId);

		// センタ区分値グループ明細マスタメンテナンスデータ取得.ヘッダ部データ取得メソッドを呼出し
		MCenterClass result = centerClassGrpDtlMasterSelectLogic.selectCenterClassMaster(mCenterClass, errRetSts(StatusCode.NOT_FOUND_HEAD_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		MCenterClassGrp mCenterClassGrp = new MCenterClassGrp();
		mCenterClassGrp.setMCenterClass(result);
		MCenterClassGrpDtl mCenterClassGrpDtl = new MCenterClassGrpDtl();
		mCenterClassGrpDtl.setMCenterClassGrp(mCenterClassGrp);

		// ===== Entity-Dto変換処理 =====
		// センタ区分値グループマスタメンテナンス情報
		MCenterClassGrpDtlDtoMapper mCenterClassGrpDtlDtoMapper = new MCenterClassGrpDtlDtoMapper();
		MCenterClassGrpDtlDto head = mCenterClassGrpDtlDtoMapper.mappingToDto(mCenterClassGrpDtl);
		centerClassGrpMasterDto.data.head = head;

		return centerClassGrpMasterDto;
	}

	/**
	 * <h2>センタ区分値グループ明細マスタ一覧データ取得。</h2>
	 * <pre>
	 * データベースにセンタ区分値グループ明細マスタ一覧データを取得する
	 * </pre>
	 * @param centerClassGrpDtlDto センタ区分値グループ明細マスタメンテナンス画面用DTO
	 * @return CenterClassGrpDtlDto センタ区分値グループ明細マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public CenterClassGrpDtlDto search(CenterClassGrpDtlDto centerClassGrpDtlDto) {
		CenterClassGrpDtlDto result = new CenterClassGrpDtlDto();

		// ===== Entity変換 =====
		// センタ区分値グループ明細マスタメンテナンス画面明細情報
		MCenterClassGrpDtlDtoMapper mapper = new MCenterClassGrpDtlDtoMapper();
		MCenterClassGrpDtl mCenterClassGrpDtl = mapper.mappingToEntity(centerClassGrpDtlDto.data.head);

		// センタ区分値グループID取得
		MCenterClassGrp mCenterClassGrp = new MCenterClassGrp();
		mCenterClassGrp.setClassGrpCd(mCenterClassGrpDtl.getMCenterClassGrp().getClassGrpCd());
		mCenterClassGrp.setCenterClassId(mCenterClassGrpDtl.getMCenterClassGrp().getMCenterClass().getCenterClassId());
		mCenterClassGrp = centerClassGrpLogic.getUkEntity(mCenterClassGrp);

		List<MCenterClassDtl> sqlData =  centerClassGrpDtlMasterSelectLogic.selectCenterClassGrpMaster(mCenterClassGrpDtl.getMCenterClassGrp().getMCenterClass(), mCenterClassGrp, errRetSts(StatusCode.NOT_FOUND_BODY_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 取得できません
		if (sqlData.size()  == 0 ) {
			return null;
		}

		// センタ区分値グループ明細リストにセット
		List<MCenterClassGrpDtl> mCenterClassGrpDtlList = new ArrayList<MCenterClassGrpDtl>();
		for (MCenterClassDtl mCenterClassDtl : sqlData) {
			MCenterClassGrpDtl bodyData;
			if (mCenterClassDtl.getMCenterClassGrpDtlList().size() == 0) {
				bodyData = new MCenterClassGrpDtl();
				bodyData.setSelectFlg("0");
				bodyData.setCenterClassGrpId(mCenterClassGrp.getCenterClassGrpId());
				bodyData.setCenterClassDtlId(mCenterClassDtl.getCenterClassDtlId());
			} else {
				bodyData = mCenterClassDtl.getMCenterClassGrpDtlList().get(0);
				bodyData.setSelectFlg("1");
			}
			bodyData.setMCenterClassDtl(mCenterClassDtl);
			mCenterClassGrpDtlList.add(bodyData);
		}

		// ===== Entity-Dto変換処理 =====
		// センタ区分値グループマスタメンテナンス情報
		MCenterClassGrpDtlDtoMapper mCenterClassGrpDtlDtoMapper = new MCenterClassGrpDtlDtoMapper();
		List<MCenterClassGrpDtlDto> body = mCenterClassGrpDtlDtoMapper.mappingToDtoList(mCenterClassGrpDtlList);
		result.data.body = body;

		return result;
	}

	/**
	 * <h2>入力チェック（更新）。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param centerClassGrpDtlDto センタ区分値グループ明細マスタメンテナンス画面用DTO
	 * @return statusDto 処理結果DTO
	 */
	@POST
	@Path("/registerCheck")
	public StatusDto inputCheck(CenterClassGrpDtlDto centerClassGrpDtlDto) {
		StatusDto statusDto = new StatusDto();
		// 確認メッセージをエラー管理クラスに登録
		this.getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), BaseMessageConst.DATA_REGISTER_CONFIRMATION);
		return statusDto;
	}

	/**
	 * <h2>センタ区分値グループ明細マスタデータ登録。</h2>
	 * <pre>
	 * センタ区分値グループ明細マスタデータ登録
	 * エラーがない場合は、データベースにセンタ区分値グループ明細マスタを登録し、完了メッセージを設定する
	 * </pre>
	 * @param centerClassGrpDtlDto センタ区分値グループ明細マスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto update(CenterClassGrpDtlDto centerClassGrpDtlDto) {
		// ===== Entity変換 =====
		// センタ区分値グループマスタメンテナンス明細情報
		MCenterClassGrpDtlDtoMapper mCenterClassGrpDtlDtoMapper = new MCenterClassGrpDtlDtoMapper();

		List<MCenterClassGrpDtl> bodyList = mCenterClassGrpDtlDtoMapper.mappingToEntityList(centerClassGrpDtlDto.data.body);

		for (MCenterClassGrpDtl body :bodyList ) {

			body.setSelectFlg(CU.nullOrEmptyToZero(body.getSelectFlg()));
			// デフォルトフラグ
			body.setDefaultFlg(CU.nullOrEmptyToZero(body.getDefaultFlg()));

			// センタ区分値グループ明細マスタメンテナンスデータ登録.センタ区分値グループ明細マスタ登録メソッドを呼出し
			centerClassGrpDtlMasterInsertLogic.update(body, errRetSts(StatusCode.UPDATE_FAILED));
		}

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), BaseMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}
}
