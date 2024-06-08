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
import org.dbflute.optional.OptionalEntity;

import com.oneslogi.base.dbflute.cbean.BDictCB;
import com.oneslogi.base.dbflute.cbean.BDictCultureCB;
import com.oneslogi.base.dbflute.cbean.MStockTypeCB;
import com.oneslogi.base.dbflute.dto.MStockTypeDto;
import com.oneslogi.base.dbflute.dtomapper.MStockTypeDtoMapper;
import com.oneslogi.base.dbflute.exbhv.BDictBhv;
import com.oneslogi.base.dbflute.exbhv.BDictCultureBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.BDictCulture;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.InputDto;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.base.util.FileToDto;
import com.oneslogi.base.util.FileUtil;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.StockTypeMasterDto;
import com.oneslogi.wms.logic.common.StockTypeLogic;
import com.oneslogi.wms.logic.master.StockTypeMasterDeleteLogic;
import com.oneslogi.wms.logic.master.StockTypeMasterInsertLogic;
import com.oneslogi.wms.logic.master.StockTypeMasterSelectLogic;
import com.oneslogi.wms.logic.master.StockTypeMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 在庫区分マスタ画面のリソースクラス。
 */
@Path("/master/stockTypeMaster")
public class StockTypeMasterResource extends AbstractWmsResource {

	protected static List<MStockType> _mStockTypeList = new ArrayList<MStockType>();

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
		protected static final int STOCK_TYPE_MASTER_GET_FAILED = 2;
		/**
		 * 在庫区分マスタ登録異常
		 */
		protected static final int STOCK_TYPE_MASTER_INSERT_FAILED = 3;
		/**
		 * 更新異常
		 */
		protected static final int STOCK_TYPE_MASTER_UPDATE_FAILED = 4;
		/**
		 * 在庫区分コードで重複異常
		 */
		protected static final int STOCK_TYPE_CODE_DUPLICATE = 5;
		/**
		 *辞書マスタ存在異常
		 */
		protected static final int STOCK_TYPE_NAME_NOT_FOUND_ERROR = 6;
		/**
		 *処理区分マスタに登録済
		 */
		protected static final int PROCESS_TYPE_EXIST = 7;
		/**
		 * 削除異常
		 */
		protected static final int STOCK_TYPE_MASTER_DELETE_FAILED = 8;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private StockTypeMasterSelectLogic StockTypeMasterSelectLogic;
	@Inject
	private StockTypeMasterInsertLogic StockTypeMasterInsertLogic;
	@Inject
	private StockTypeMasterUpdateLogic StockTypeMasterUpdateLogic;
	@Inject
	private StockTypeMasterDeleteLogic StockTypeMasterDeleteLogic;
	// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana Start
	@Inject
	private VDictLogic vDictLogic;
	// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana End
	@Inject
	private StockTypeLogic stockTypeLogic;
	@Inject
	private MStockTypeBhv mStockTypeBhv;

	@Inject
	private BDictBhv bDictBhv;

	@Inject
	private BDictCultureBhv bDictCultureBhv;

	/**
	 * 登録または更新データ組立の結果
	 */

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return StockTypeMasterDto 在庫区分マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public StockTypeMasterDto init() {
		return new StockTypeMasterDto();
	}

	/**
	 * <h2>在庫区分マスタ一括取込。</h2>
	 * <pre>
	 * アップロードデータ取得し、画面用DTOの作成。
	 * </pre>
	 * @param input アップロードデータ
	 * @return StockTypeMasterDto 在庫区分マスタ一括取込画面用DTO
	 */
	@POST
	@Path("/fileUpload")
	public StockTypeMasterDto fileUpload(MultipartFormDataInput input) throws Exception {

		// 画面用DTO作成
		StockTypeMasterDto StockTypeMasterDto = new StockTypeMasterDto();

		int rows = 0;

		// アップロードデータ取得処理
		InputDto param = getUploadParams(input);
		List<String> files = FileUtil.writeFiles(FileUtil.getTempDir(FileUtil.getContextPathToRelativePath(getServletContext().getContextPath())).getPath(), getUploadFiles(input), true);

		FileToDto conv = new FileToDto();

		// アップロードデータ取込処理
		for (String file : files) {
			conv.open(file);
			conv.setData(StockTypeMasterDto, param);
			rows += conv.getUploadRows();
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.EXCEL_READ_SUCCESS_CONFIRMATION, Integer.toString(rows));

		return StockTypeMasterDto;
	}

	/**
	 * <h2>在庫区分マスタデータ取得</h2>
	 * <pre>
	 * 在庫区分マスタデータの一括取得処理
	 * </pre>
	 * @param StockTypeMasterDto 在庫区分マスタ一括取込画面用DTO
	 * @return StockTypeMasterDto 在庫区分マスタ一括取込画面用DTO
	 */
	@GET
	@Path("/getMasterData")
	public StockTypeMasterDto getMasterData(StockTypeMasterDto StockTypeMasterDto) {

		// データが存在しない場合
		if (StockTypeMasterDto.data.stockTypeList.size() == 0) {
			return StockTypeMasterDto;
		}

		// エンティティに変換
		// ヘッダ項目
		MStockTypeDtoMapper mStockTypeoDtoMapper = new MStockTypeDtoMapper();

		// 一覧項目
		List<MStockType> mStockTypeList = mStockTypeoDtoMapper.mappingToEntityList(StockTypeMasterDto.data.stockTypeList);

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// 存在チェック用配列
		Map<String, MStockType> stockTypeCdMap = new HashMap<String, MStockType>();

		// 一覧件数分ループ(Map作成)
		for (MStockType stockType : mStockTypeList) {
			//チェック用配列に格納
			if (!CU.isNullOrEmpty(stockType.getStockTypeCd()) && !stockTypeCdMap.containsKey(stockType.getStockTypeCd())) {
				stockTypeCdMap.put(stockType.getStockTypeCd(), null);
			}
		}

		// 初期値設定
		List<MStockType> mStockTypeDbList = null;

		// 在庫区分マスタ一括取得
		if (stockTypeCdMap.size() > 0) {
			// 削除フラグの自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			//検索条件設定
			MStockTypeCB cbMStockType = mStockTypeBhv.newConditionBean();
			cbMStockType.query().setStockTypeCd_InScope(stockTypeCdMap.keySet()); // 在庫区分CDが一緒

			//在庫区分マスタ取得
			mStockTypeDbList = mStockTypeBhv.selectList(cbMStockType);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);
		}

		// 取得した在庫区分データをMap化
		stockTypeCdMap.clear();
		if (mStockTypeDbList != null) {
			for (MStockType mStockType : mStockTypeDbList) {
				stockTypeCdMap.put(mStockType.getStockTypeCd(), mStockType);
			}
		}

		for (MStockType mStockType : mStockTypeList) {

			// 在庫区分CDをつなげkeyとする
			String key = mStockType.getStockTypeCd();

			// StockTypeCd一致確認
			if (stockTypeCdMap.containsKey(key)) {
				// 一致するデータがある場合
				mStockType.setStockTypeId(stockTypeCdMap.get(key).getStockTypeId());
				// 更新処理の場合共通項目をセットする
				mStockType.setVersionNo(stockTypeCdMap.get(key).getVersionNo());
				mStockType.setControlNo(stockTypeCdMap.get(key).getControlNo());
				mStockType.setAddDt(stockTypeCdMap.get(key).getAddDt());
				mStockType.setAddUser(stockTypeCdMap.get(key).getAddUser());
				mStockType.setAddProcess(stockTypeCdMap.get(key).getAddProcess());
				mStockType.setUpdDt(stockTypeCdMap.get(key).getUpdDt());
				mStockType.setUpdUser(stockTypeCdMap.get(key).getUpdUser());
				mStockType.setUpdProcess(stockTypeCdMap.get(key).getUpdProcess());
			} else {
				// 一致するデータがない場合
				mStockType.setStockTypeId(null);
				mStockType.setDelFlg("0");
			}
		}

		StockTypeMasterDto.data.stockTypeList = mStockTypeoDtoMapper.mappingToDtoList(mStockTypeList);
		return StockTypeMasterDto;
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・在庫区分マスタDTOをキーに在庫区分マスタデータ取り出し
	 * </pre>
	 * @param stockTypeMasterDto 在庫区分マスタ画面用DTO
	 * @return StockTypeMasterDto 在庫区分マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public StockTypeMasterDto search(StockTypeMasterDto stockTypeMasterDto) throws IOException {
		StockTypeMasterDto stockTypeDto = new StockTypeMasterDto();

		// Entity変換
		MStockTypeDtoMapper mapper = new MStockTypeDtoMapper();
		MStockType stockType = mapper.mappingToEntity(stockTypeMasterDto.data.stockTypeMasterSearch);

		// 検索
		List<MStockType> page = StockTypeMasterSelectLogic.select(stockType, errRetSts(StatusCode.STOCK_TYPE_MASTER_GET_FAILED));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<MStockTypeDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		stockTypeDto.data.stockTypeList = list;

		return stockTypeDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・在庫区分CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 * </pre>
	 * @param stockTypeMasterDto 在庫区分マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(StockTypeMasterDto stockTypeMasterDto) {
		this.setupInputCheck(stockTypeMasterDto);

		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// 在庫区分CD重複の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>在庫区分マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに在庫区分マスタデータを登録し、完了メッセージを設定する。
	 *
	 * データチェックはsetupInputCheck(List)の結果で判定。
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param stockTypeMasterDto 在庫区分マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(StockTypeMasterDto stockTypeMasterDto) {
		// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki Start
		// 辞書名存在フラグ
		String vDictNmExistFlg = "0";
		// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki End

		// Entity変換
		MStockTypeDtoMapper mapper = new MStockTypeDtoMapper();
		List<MStockType> stockTypeList = mapper.mappingToEntityList(stockTypeMasterDto.data.stockTypeList);

		this.setupInputCheck(stockTypeMasterDto);
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		stockTypeList = _mStockTypeList;
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
		List<MStockType> insertList = new ArrayList<>();

		List<MStockType> updateList = new ArrayList<>();

		List<MStockType> deleteList = new ArrayList<>();
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
		for (MStockType mStockType : stockTypeList) {

			if (mStockType.getStockTypeId() == null) {
				// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki Start
				//				// 登録
				//				StockTypeMasterInsertLogic.insert(mStockType, errRetSts(StatusCode.STOCK_TYPE_MASTER_INSERT_FAILED));

				// 辞書名存在フラグ設定
				VDict vDict = new VDict();
				vDict.setDictNm(mStockType.getVDict().getDictNm());

				VDict vdictNm = vDictLogic.getUkEntity(vDict);

				if (vdictNm != null) {
					mStockType.setDictId(vdictNm.getDictId());
					vDictNmExistFlg = "1";
				} else {
					vDictNmExistFlg = "0";
				}

				// 登録
//				StockTypeMasterInsertLogic.insert(mStockType, vDictNmExistFlg, errRetSts(StatusCode.STOCK_TYPE_MASTER_INSERT_FAILED));
				// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki End
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
				if ("0".equals(vDictNmExistFlg)) {
					// 辞書名存在フラグ = 「0」の場合、辞書マスタの登録実行

					BDictCB cb = bDictBhv.newMyConditionBean();

					cb.query().setDictNm_Equal(mStockType.getVDict().getDictNm());

					// 削除フラグ自動検索無効化
					this.setBehaviorAutoDelFlg(false);

					// 検索実行
					BDict chkBDict = bDictBhv.selectEntity(cb);

					// 削除フラグ自動検索有効化
					this.setBehaviorAutoDelFlg(true);

					if (chkBDict == null) {
						// 辞書マスタ登録
						BDict bDict = new BDict();

						// 辞書名
						bDict.setDictNm(mStockType.getVDict().getDictNm());
						// システム種別
						bDict.setSystemType("wms");
						bDictBhv.insert(bDict);

						// 採番された辞書IDの取得
						OptionalEntity<BDict> optBDict = bDictBhv.selectByUniqueOf(mStockType.getVDict().getDictNm());
						Long dictId = optBDict.get().getDictId();

						// 辞書ID設定
						mStockType.setDictId(dictId);
					} else {
						// 辞書マスタ・辞書カルチャマスタ更新

						// 削除フラグ
						chkBDict.setDelFlg_$0();
						bDictBhv.update(chkBDict);

						// 辞書カルチャマスタ検索
						BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

						cbCulture.query().setDictId_Equal(chkBDict.getDictId());

						// 削除フラグ自動検索無効化
						this.setBehaviorAutoDelFlg(false);

						List<BDictCulture> chkBDictCultureList = bDictCultureBhv.selectList(cbCulture);

						// 削除フラグ自動検索有効化
						this.setBehaviorAutoDelFlg(true);

						for (BDictCulture chkBDictCulture : chkBDictCultureList) {
							// 削除フラグ
							chkBDictCulture.setDelFlg_$0();
							bDictCultureBhv.update(chkBDictCulture);
						}

						// 辞書ID設定
						mStockType.setDictId(chkBDict.getDictId());
					}
				}

				insertList.add(mStockType);
				// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
			} else {
				if ("1".equals(mStockType.getDelFlg())) {
					// 削除
//					StockTypeMasterDeleteLogic.delete(mStockType, errRetSts(StatusCode.STOCK_TYPE_MASTER_DELETE_FAILED));
					deleteList.add(mStockType);
				} else {
					// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki Start
					//					// 修正
					//					StockTypeMasterUpdateLogic.update(mStockType, errRetSts(StatusCode.STOCK_TYPE_MASTER_UPDATE_FAILED));

					// 辞書名存在フラグ設定
					VDict vDict = new VDict();
					vDict.setDictNm(mStockType.getVDict().getDictNm());

					VDict vdictNm = vDictLogic.getUkEntity(vDict);

					if (vdictNm != null) {
						mStockType.setDictId(vdictNm.getDictId());
						vDictNmExistFlg = "1";
					} else {
						vDictNmExistFlg = "0";
					}

					// 修正
					//					StockTypeMasterUpdateLogic.update(mStockType, vDictNmExistFlg, errRetSts(StatusCode.STOCK_TYPE_MASTER_UPDATE_FAILED));
					// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki End
					// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
					if ("0".equals(vDictNmExistFlg)) {
						// 辞書名存在フラグ = 「0」の場合、辞書マスタの登録実行

						BDictCB cb = bDictBhv.newMyConditionBean();

						cb.query().setDictNm_Equal(mStockType.getVDict().getDictNm());

						// 削除フラグ自動検索無効化
						this.setBehaviorAutoDelFlg(false);

						// 検索実行
						BDict chkBDict = bDictBhv.selectEntity(cb);

						// 削除フラグ自動検索有効化
						this.setBehaviorAutoDelFlg(true);

						if (chkBDict == null) {
							// 辞書マスタ登録
							BDict bDict = new BDict();

							// 辞書名
							bDict.setDictNm(mStockType.getVDict().getDictNm());
							// システム種別
							bDict.setSystemType("wms");
							bDictBhv.insert(bDict);

							// 採番された辞書IDの取得
							OptionalEntity<BDict> optBDict = bDictBhv.selectByUniqueOf(mStockType.getVDict().getDictNm());
							Long dictId = optBDict.get().getDictId();

							// 辞書ID設定
							mStockType.setDictId(dictId);
						} else {
							// 辞書マスタ・辞書カルチャマスタ更新

							// 削除フラグ
							chkBDict.setDelFlg_$0();
							bDictBhv.update(chkBDict);

							// 辞書カルチャマスタ検索
							BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

							cbCulture.query().setDictId_Equal(chkBDict.getDictId());

							// 削除フラグ自動検索無効化
							this.setBehaviorAutoDelFlg(false);

							List<BDictCulture> chkBDictCultureList = bDictCultureBhv.selectList(cbCulture);

							// 削除フラグ自動検索有効化
							this.setBehaviorAutoDelFlg(true);

							for (BDictCulture chkBDictCulture : chkBDictCultureList) {
								// 削除フラグ
								chkBDictCulture.setDelFlg_$0();
								bDictCultureBhv.update(chkBDictCulture);
							}

							// 辞書ID設定
							mStockType.setDictId(chkBDict.getDictId());
						}
					}
					updateList.add(mStockType);
					// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
				}
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW Start
		if (!insertList.isEmpty()) {
			StockTypeMasterInsertLogic.batchInsert(insertList, errRetSts(StatusCode.STOCK_TYPE_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()) {
			StockTypeMasterUpdateLogic.batchUpdate(updateList, errRetSts(StatusCode.STOCK_TYPE_MASTER_UPDATE_FAILED));
		}

		if (!deleteList.isEmpty()) {
			StockTypeMasterDeleteLogic.batchDelete(deleteList, errRetSts(StatusCode.STOCK_TYPE_MASTER_DELETE_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.25 DSW End
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
	 * ・在庫区分CD重複チェック
	 * </pre>
	 * @param mStockTypeList 在庫区分マスタ画面List
	 * @return ResultSetupData 結果
	 */
	private StatusDto setupInputCheck(StockTypeMasterDto stockTypeMasterDto) {
		// 登録されていないセンタがあるか
		MStockTypeDtoMapper mapper = new MStockTypeDtoMapper();
		List<MStockType> mStockTypeList = mapper.mappingToEntityList(stockTypeMasterDto.data.stockTypeList);

		int rowIndex = -1;

		// チェック処理
		for (MStockType mStockType : mStockTypeList) {
			rowIndex++;

			// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki Start
			//			VDict vDict =new VDict();
			//			vDict.setDictNm(mStockType.getVDict().getDictNm());
			//			// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana Start
			//			VDict vdictNm = vDictLogic.getUkEntity(vDict, new ErrorStatus(errRetSts(StatusCode.STOCK_TYPE_NAME_NOT_FOUND_ERROR), StatusCode.STOCK_TYPE_NAME_NOT_FOUND_ERROR, rowIndex));
			//
			//			if(vdictNm != null){
			//				// [ON推-品向-897] 辞書カルチャマスタを消去すると動作異常を起こす問題を修正 2015.07.16 kawana End
			//
			//				mStockType.setDictId(vdictNm.getDictId());
			//			}
			// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki End

			// 在庫区分CD重複チェック
			if (mStockType.getStockTypeId() == null) {
				// 登録の場合
				stockTypeLogic.checkStockTypeCdInsert(mStockType, errRetSts(errRetSts(StatusCode.STOCK_TYPE_CODE_DUPLICATE), StatusCode.STOCK_TYPE_CODE_DUPLICATE, rowIndex));
			} else {
				// 修正の場合、何もしない
				//				 //処理区分マスタに登録済チェック
				//				 if (mStockType.getDelFlg().equals("1")) {
				//					 stockTypeLogic.checkProcessTypeExist(mStockType, errRetSts(errRetSts(StatusCode.PROCESS_TYPE_EXIST),StatusCode.PROCESS_TYPE_EXIST, rowIndex));
				//				 }
			}

		}

		_mStockTypeList = mStockTypeList;

		// 結果の設定
		return null;

	}
}
