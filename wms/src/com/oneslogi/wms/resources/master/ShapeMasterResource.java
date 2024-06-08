package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dbflute.dtomapper.MShapeDtoMapper;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ShapeMasterDto;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.ShapeLogic;
import com.oneslogi.wms.logic.master.ShapeMasterInsertLogic;
import com.oneslogi.wms.logic.master.ShapeMasterSelectLogic;
import com.oneslogi.wms.logic.master.ShapeMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷姿マスタ画面のリソースクラス。
 */
@Path("/master/shapeMasterList")
public class ShapeMasterResource extends AbstractWmsResource {
	protected static List<MShape> _mShapeList = new ArrayList<MShape>();

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
		protected static final int SHAPE_MASTER_GET_FAILED = 2;
		/**
		 * 荷姿マスタ登録異常
		 */
		protected static final int SHAPE_MASTER_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int SHAPE_MASTER_UPDATE_FAILED = 4;
		/**
		 * 荷姿コードで重複異常
		 */
		protected static final int SHAPE_CODE_DUPLICATE = 5;
		/**
		 * 荷姿CDは削除できません
		 */
		protected static final int SHAPE_CODE_DELETE_ERROR = 6;
		// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa Start
		/**
		 * GTIN14シンボルで重複異常
		 */
		protected static final int GTIN14_SYMBOL_DUPLICATE = 7;
		// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa End

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ShapeMasterSelectLogic shapeMasterSelectLogic;
	@Inject
	private ShapeLogic shapeLogic;
	@Inject
	private ShapeMasterInsertLogic shapeMasterInsertLogic;
	@Inject
	private ShapeMasterUpdateLogic shapeMasterUpdateLogic;
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>初期処理。</h2>
	 *
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 *
	 * @return ShapeMasterDto 荷姿マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public ShapeMasterDto init() {
		return new ShapeMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 *
	 * <pre>
	 * ・荷姿マスタDTOをキーに荷姿マスタデータ取り出し
	 * </pre>
	 *
	 * @param shapeMasterDto
	 *            荷姿マスタ画面用DTO
	 * @return ShapeMasterDto 荷姿マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ShapeMasterDto search(ShapeMasterDto shapeMasterDto)
			throws IOException {
		ShapeMasterDto shapeDto = new ShapeMasterDto();

		// Entity変換
		MShapeDtoMapper mapper = new MShapeDtoMapper();
		MShape shapeMaster = mapper.mappingToEntity(shapeMasterDto.data.head);

		//荷主ID取得
		// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
		String clientCd = null;
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		// [Ver3.0] unit of measure対応 2017.11.30 潘 Del

		// 検索
		List<MShape> page = shapeMasterSelectLogic.select(shapeMaster,
				errRetSts(StatusCode.SHAPE_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity-Dto変換処理
		List<MShapeDto> list = mapper.mappingToDtoList(page);

		// 検索結果詰込処理
		shapeDto.data.list = list;

		return shapeDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 *
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・荷姿CD存在チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックは結果で判定。
	 * </pre>
	 *
	 * @param shapeMasterDto
	 *            荷姿マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ShapeMasterDto shapeMasterDto) {
		this.setupInputCheck(shapeMasterDto);
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// 荷姿CD重複の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION),
				WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>荷姿マスタ登録。</h2>
	 *
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに荷姿マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックは結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 *
	 * @param shapeMasterDto
	 *            荷姿マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ShapeMasterDto shapeMasterDto) {
		// 辞書名存在フラグ
		String vDictNmExistFlg = "0";

		// Entity変換
		MShapeDtoMapper mapper = new MShapeDtoMapper();
		//荷主センタ変更対応 201７.02.14 sja Start
//		MShape head = mapper.mappingToEntity(shapeMasterDto.data.head);
		//荷主センタ変更対応 201７.02.14 sja End
		List<MShape> shapeList = mapper.mappingToEntityList(shapeMasterDto.data.list);
		//荷主センタ変更対応 201７.02.14 sja Start
//		//荷主ID取得
//		String clientCd = head.getMClient().getClientCd();
//		MClient mClient = new MClient();
//		mClient.setClientCd(clientCd);
//		mClient = clientLogic.getUkEntity(mClient);
		//荷主センタ変更対応 201７.02.14 sja End
		this.setupInputCheck(shapeMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		shapeList = _mShapeList;

		for (MShape mShape : shapeList) {

			if (mShape.getShapeId() == null) {
				//荷主センタ変更対応 201７.02.14 sja Start
				//荷主ID取得
				// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
				String clientCd = null;
				MClient mClient = new MClient();
				mClient.setClientCd(clientCd);
				mClient = clientLogic.getUkEntity(mClient);
				// 荷主id
				// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
				// 登録
				shapeMasterInsertLogic.insert(mShape,vDictNmExistFlg,errRetSts(StatusCode.SHAPE_MASTER_INSERT_FAILED));
			}else {
					// 修正
					shapeMasterUpdateLogic.update(mShape, vDictNmExistFlg,errRetSts(StatusCode.SHAPE_MASTER_UPDATE_FAILED));
				}
		}

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS),
				WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 *
	 * <pre>
	 * データのチェックを行う。
	 * ・荷姿CD重複チェック
	 * </pre>
	 *
	 * @param mShapeList
	 *            荷姿マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(ShapeMasterDto shapeMasterDto) {
		// 登録されていないセンタがあるか
		MShapeDtoMapper mapper = new MShapeDtoMapper();
		// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
		List<MShape> mShapeList = mapper.mappingToEntityList(shapeMasterDto.data.list);

		//荷主ID取得
		// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
		String clientCd = null;
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		int rowIndex = -1;

		// チェック処理
		for (MShape mShape : mShapeList) {
			rowIndex++;

			// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa Start
			// 荷材IDが無い場合、荷姿CD、GTIN14シンボルの重複チェックを行う
			if (mShape.getShapeId() == null) {
				// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
				// 荷姿CD重複チェック
				if(shapeLogic.checkShapeCdInsert(mShape,errRetSts(errRetSts(StatusCode.SHAPE_CODE_DUPLICATE),StatusCode.SHAPE_CODE_DUPLICATE, rowIndex))){
					return null;
				}
				// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
			}else{
				//更新の場合
				// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
				// 削除フラグが'1'の場合、パラメータマスタ存在チェック処理を行う
				if (mShape.isDelFlg$1()) {
					// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
					// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
					//荷姿グループ明細で登録済みかどうか
					if (shapeLogic.checkMShapeGrpDtlRegistered(mShape,errRetSts(errRetSts(StatusCode.SHAPE_MASTER_UPDATE_FAILED),StatusCode.SHAPE_CODE_DELETE_ERROR, rowIndex))){
						return null;
					}
					// [Ver3.0] unit of measure対応 2017.11.30 潘 End
					// [Ver3.0] unit of measure対応 2017.11.30 潘 Del
				}
			}
			// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa End
		}
		_mShapeList = mShapeList;

		// 結果の設定
		return null;
	}

}
