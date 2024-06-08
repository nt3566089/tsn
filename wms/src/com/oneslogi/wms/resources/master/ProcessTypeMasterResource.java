package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

import com.oneslogi.base.dbflute.cbean.MProcessTypeCB;
import com.oneslogi.base.dbflute.dto.MProcessTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MProcessTypeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MProcessTypeBhv;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ProcessTypeMasterDto;
import com.oneslogi.wms.logic.common.ProcessTypeLogic;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.master.ProcessTypeMasterDeleteLogic;
import com.oneslogi.wms.logic.master.ProcessTypeMasterInsertLogic;
import com.oneslogi.wms.logic.master.ProcessTypeMasterSelectLogic;
import com.oneslogi.wms.logic.master.ProcessTypeMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 処理区分マスタ画面のリソースクラス。
 */
@Path("/master/processTypeMaster")
public class ProcessTypeMasterResource extends AbstractWmsResource {

	protected static List<MProcessType> _mProcessTypeList = new ArrayList<MProcessType>();

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
		protected static final int PROCESS_TYPE_MASTER_GET_FAILED = 2;
		/**
		 * 処理区分マスタ登録異常
		 */
		protected static final int PROCESS_TYPE_MASTER_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int PROCESS_TYPE_MASTER_UPDATE_FAILED = 4;
		/**
		 * 処理区分コードで重複異常
		 */
		protected static final int PROCESS_TYPE_CODE_DUPLICATE = 5;
		/**
		 *辞書マスタ存在異常
		 */
		protected static final int PROCESS_TYPE_NAME_NOT_FOUND_ERROR = 6;
		/**
		 *在庫区分存在しない
		 */
		protected static final int STOCK_TYPE_NOT_FOUND_ERROR = 7;
		/**
		 * 削除異常
		 */
		protected static final int PROCESS_TYPE_MASTER_DELETE_FAILED = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ProcessTypeMasterSelectLogic ProcessTypeMasterSelectLogic;
	@Inject
	private ProcessTypeMasterInsertLogic ProcessTypeMasterInsertLogic;
	@Inject
	private ProcessTypeMasterUpdateLogic ProcessTypeMasterUpdateLogic;
	@Inject
	private ProcessTypeMasterDeleteLogic ProcessTypeMasterDeleteLogic;
	// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana Start
	@Inject
	private VDictLogic vDictLogic;
	// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana End
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private ProcessTypeLogic processTypeLogic;
	@Inject
	private MProcessTypeBhv mProcessTypeBhv;

	/**
	 * 登録または更新データ組立の結果
	 */

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ProcessTypeMasterDto 処理区分マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public ProcessTypeMasterDto init() {
		return new ProcessTypeMasterDto();
	}

	/**
	 * <h2>処理区分マスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return ProcessTypeMasterDto 処理区分マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public ProcessTypeMasterDto fileUpload(MultipartFormDataInput input) throws Exception {

		// 画面用DTO作成
		ProcessTypeMasterDto ProcessTypeMasterDto = new ProcessTypeMasterDto();

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(ProcessTypeMasterDto, param);
			rows += conv.getUploadRows();
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return ProcessTypeMasterDto;
	}

	/**
	 * <h2>処理区分マスタデータ取得</h2>
	 * <pre>
	 * 処理区分マスタデータの一括取得処理
	 * </pre>
	 * @param ProcessTypeMasterDto 処理区分マスタ一括取込画面用DTO
	 * @return ProcessTypeMasterDto 処理区分マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public ProcessTypeMasterDto getMasterData(ProcessTypeMasterDto ProcessTypeMasterDto) {

		// データが存在しない場合
		if (ProcessTypeMasterDto.data.processTypeList.size() == 0) {
			return ProcessTypeMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MProcessTypeDtoMapper mProcessTypeoDtoMapper = new MProcessTypeDtoMapper();

		// 一覧項目
		List<MProcessType> mProcessTypeList = mProcessTypeoDtoMapper.mappingToEntityList(ProcessTypeMasterDto.data.processTypeList);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MProcessType> processTypeCdMap = new HashMap<String, MProcessType>();

		// 一覧件数分ループ(Map作成)
		for (MProcessType processType : mProcessTypeList) {
			//チェック用配列に格納
			if (!CU.isNullOrEmpty(processType.getProcessTypeCd()) && !processTypeCdMap.containsKey(processType.getProcessTypeCd())) {
				processTypeCdMap.put(processType.getProcessTypeCd(), null);
			}
		}

		// 初期値設定
		List<MProcessType> mProcessTypeDbList = null;

		// 処理区分マスタ一括取得
		if (processTypeCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			//検索条件設定
			MProcessTypeCB cbMProcessType = mProcessTypeBhv.newConditionBean();
			cbMProcessType.query().setProcessTypeCd_InScope(processTypeCdMap.keySet()); // 処理区分CDが一緒

			//処理区分マスタ取得
			mProcessTypeDbList = mProcessTypeBhv.selectList(cbMProcessType);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得した処理区分データをMap化
		processTypeCdMap.clear();
		if (mProcessTypeDbList != null) {
			for (MProcessType mProcessType : mProcessTypeDbList) {
				processTypeCdMap.put(mProcessType.getProcessTypeCd(), mProcessType);
			}
		}

		for (MProcessType mProcessType : mProcessTypeList) {

			// 処理区分CDをつなげkeyとする
			String key = mProcessType.getProcessTypeCd();

			// ProcessTypeCd一致確認
			if (processTypeCdMap.containsKey(key)) {
				// 一致するデータがある場合
				mProcessType.setProcessTypeId(processTypeCdMap.get(key).getProcessTypeId());
				// 更新処理の場合共通項目をセットする
				mProcessType.setVersionNo(processTypeCdMap.get(key).getVersionNo());
				mProcessType.setControlNo(processTypeCdMap.get(key).getControlNo());
				mProcessType.setAddDt(processTypeCdMap.get(key).getAddDt());
				mProcessType.setAddUser(processTypeCdMap.get(key).getAddUser());
				mProcessType.setAddProcess(processTypeCdMap.get(key).getAddProcess());
				mProcessType.setUpdDt(processTypeCdMap.get(key).getUpdDt());
				mProcessType.setUpdUser(processTypeCdMap.get(key).getUpdUser());
				mProcessType.setUpdProcess(processTypeCdMap.get(key).getUpdProcess());
			} else {
				// 一致するデータがない場合
				mProcessType.setProcessTypeId(null);
				mProcessType.setDelFlg("0");
			}
		}

		ProcessTypeMasterDto.data.processTypeList = mProcessTypeoDtoMapper.mappingToDtoList(mProcessTypeList);
		return ProcessTypeMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・処理区分マスタDTOをキーに処理区分マスタデータ取り出し
	 * </pre>
	 * @param processTypeMasterDto 処理区分マスタ画面用DTO
	 * @return ProcessTypeMasterDto 処理区分マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ProcessTypeMasterDto search(ProcessTypeMasterDto processTypeMasterDto) throws IOException {
		ProcessTypeMasterDto processTypeDto = new ProcessTypeMasterDto();

		// Entity変換
		MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper();
		MProcessType processType = mapper.mappingToEntity(processTypeMasterDto.data.processTypeMasterSearch);

		//在庫区分ID取得
		String stockTypeCd = processType.getMStockType().getStockTypeCd();
		if (stockTypeCd!=null){
			MStockType mStockType = new MStockType();
			mStockType.setStockTypeCd(stockTypeCd);
			mStockType = stockTypeLogic.getUkEntity(mStockType);

			if(mStockType != null){
				processType.setStockTypeId(mStockType.getStockTypeId());
			}else{
				this.getErrorManager().add(new ErrorStatus(errRetSts(StatusCode.PROCESS_TYPE_MASTER_GET_FAILED).getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}

		}

		// 検索
		List<MProcessType> page = ProcessTypeMasterSelectLogic.select(processType, errRetSts(StatusCode.PROCESS_TYPE_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MProcessTypeDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		processTypeDto.data.processTypeList = list;

		return processTypeDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・処理区分CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 * </pre>
	 * @param processTypeMasterDto 処理区分マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ProcessTypeMasterDto processTypeMasterDto) {
	this.setupInputCheck(processTypeMasterDto);

	if (getErrorManager().size() > 0) {
		// 処理中止
		return null;
	}
	// 処理区分CD重複の確認メッセージを設定
	getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
	return null;
	}

	/**
	 * <h2>処理区分マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに処理区分マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param processTypeMasterDto 処理区分マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ProcessTypeMasterDto processTypeMasterDto) {
		// Entity変換
		MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper();
		List<MProcessType> processTypeList = mapper.mappingToEntityList(processTypeMasterDto.data.processTypeList);

		this.setupInputCheck(processTypeMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		processTypeList = _mProcessTypeList;

		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW Start
		List<MProcessType> insertList = new ArrayList<>();

		List<MProcessType> updateList = new ArrayList<>();

		List<MProcessType> deleteList = new ArrayList<>();

		for (MProcessType mProcessType : processTypeList) {

			// 入荷フラグ設定
			if (mProcessType.getReceiveFlg() == null) {
				mProcessType.setReceiveFlg_$0();
			}
			// 出荷フラグ設定
			if (mProcessType.getShippingFlg() == null) {
				mProcessType.setShippingFlg_$0();
			}
			// 在庫調整フラグ設定
			if (mProcessType.getStockAdjustFlg() == null) {
				mProcessType.setStockAdjustFlg_$0();
			}
			// デフォルトフラグ設定
			if (mProcessType.getDefaultFlg() == null || "1".equals(mProcessType.getDefaultFlg()) == false) {
				mProcessType.setDefaultFlg("0");
			}

			if (mProcessType.getProcessTypeId() == null) {
				// 追加
				insertList.add(mProcessType);
				// [1.1.4-CT-006] 登録にて致命的エラー発生(不要な処理を削除) 2016.05.12 kawana
			} else {
				if ("1".equals(mProcessType.getDelFlg())){
					// 削除
					deleteList.add(mProcessType);
					// [1.1.4-CT-006] 登録にて致命的エラー発生(不要な処理を削除) 2016.05.12 kawana
				} else {
					// 修正
					updateList.add(mProcessType);
					// [1.1.4-CT-006] 登録にて致命的エラー発生(不要な処理を削除) 2016.05.12 kawana
				}
			}
		}

		if (!insertList.isEmpty()){
			ProcessTypeMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.PROCESS_TYPE_MASTER_INSERT_FAILED));
		}

		if (!deleteList.isEmpty()){
			ProcessTypeMasterDeleteLogic.batchDelete(deleteList, errRetSts(StatusCode.PROCESS_TYPE_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()){
			ProcessTypeMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.PROCESS_TYPE_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.17 DSW End

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	/**
	 * <h2>チェック処理。</h2>
	 * <pre>
	 * データのチェックを行う。
	 * ・センタCD存在チェック
	 * ・処理区分CD重複チェック
	 * </pre>
	 * @param mProcessTypeList 処理区分マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(ProcessTypeMasterDto processTypeMasterDto) {
		// 登録されていないセンタがあるか
		MProcessTypeDtoMapper mapper = new MProcessTypeDtoMapper();
		List<MProcessType> mProcessTypeList = mapper.mappingToEntityList(processTypeMasterDto.data.processTypeList);

		int rowIndex = -1;

		// チェック処理
		for (MProcessType mProcessType : mProcessTypeList) {
			rowIndex++;

			VDict vDict =new VDict();
			vDict.setDictNm(mProcessType.getVDict().getDictNm());
			// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana Start
			VDict vdictNm = vDictLogic.getUkEntity(vDict, new ErrorStatus(errRetSts(StatusCode.PROCESS_TYPE_NAME_NOT_FOUND_ERROR), StatusCode.PROCESS_TYPE_NAME_NOT_FOUND_ERROR, rowIndex));

			if(vdictNm != null){
				// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana End

				mProcessType.setDictId(vdictNm.getDictId());
			}

			if (mProcessType.getMStockType() != null && mProcessType.getMStockType().getStockTypeCd() != null) {
				// 在庫区分ID取得
				MStockType mStockType = new MStockType();
				mStockType.setStockTypeCd(mProcessType.getMStockType().getStockTypeCd());

				mStockType = stockTypeLogic.getUkEntity(mStockType,errRetSts(errRetSts(StatusCode.STOCK_TYPE_NOT_FOUND_ERROR),StatusCode.STOCK_TYPE_NOT_FOUND_ERROR, rowIndex));

				// 処理区分が存在しないエラーとする。
				if (mStockType == null) {
			    	return null;
				}

				// 在庫区分ID設定
				mProcessType.setStockTypeId(mStockType.getStockTypeId());
			} else {
				// 在庫区分ID設定
				mProcessType.setStockTypeId(null);
			}

			// 処理区分CD重複チェック
			if (mProcessType.getProcessTypeId() == null) {
				// 登録の場合
				 processTypeLogic.checkProcessTypeCdInsert(mProcessType, errRetSts(errRetSts(StatusCode.PROCESS_TYPE_CODE_DUPLICATE),StatusCode.PROCESS_TYPE_CODE_DUPLICATE, rowIndex));
			} else {
				// 修正の場合、何もしない
			}

		}

		_mProcessTypeList = mProcessTypeList;

		// 結果の設定
		return null;

	}
}
