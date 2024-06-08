package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.dto.BColDto;
import com.oneslogi.base.dbflute.dtomapper.BColDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BCol;
import com.oneslogi.base.dbflute.exentity.BItem;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterCol;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCol;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.logic.common.ItemLogic;
import com.oneslogi.base.logic.common.ScreenLogic;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterClientScreenColMasterDto;
import com.oneslogi.wms.logic.common.CenterClientScreenColMasterCheckLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenColMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenColMasterSelectLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenColMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタ・荷主別画面グリッドマスタ画面のリソースクラス。
 */
@Path("/master/centerClientScreenColMaster")
public class CenterClientScreenColMasterResource extends AbstractWmsResource {

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
		 * 該当データ無し
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_COL_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED = 5;
		/**
		 * センタ・荷主別画面グリッドマスタデータチェック異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_COL_MASTER_CHECK_FAILED = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClientScreenColMasterSelectLogic centerClientScreenColMasterSelectLogic;
	@Inject
	private CenterClientScreenColMasterInsertLogic centerClientScreenColMasterInsertLogic;
	@Inject
	private CenterClientScreenColMasterUpdateLogic centerClientScreenColMasterUpdateLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//	@Inject
//	private DictLogic dictLogic;
	@Inject
	private VDictLogic vdictLogic;
	// [ON推-品向-562] 多言語対応 2015.05.20 ki End
	@Inject
	private ScreenLogic screenLogic;
	@Inject
	private ItemLogic itemLogic;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;

	@Inject
	private CenterClientScreenColMasterCheckLogic centerClientScreenColMasterCheckLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterClientScreenColMasterDto センタ・荷主別画面グリッドマスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterClientScreenColMasterDto init() {
		return new CenterClientScreenColMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタ・荷主別画面グリッドマスタ画面用DTOをキーにセンタ・荷主別画面グリッドマスタデータ取り出し
	 * </pre>
	 * @param centerClientScreenColMasterDto センタ・荷主別画面グリッドマスタ画面用DTO
	 * @return centerClientScreenColMasterDto センタ・荷主別画面グリッドマスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CenterClientScreenColMasterDto search(CenterClientScreenColMasterDto centerClientScreenColMasterDto) throws IOException {
		CenterClientScreenColMasterDto centerClientScreenColDto = new CenterClientScreenColMasterDto();

		// Entity変換
		BColDtoMapper mapper = new BColDtoMapper();
		BCol col = mapper.mappingToEntity(centerClientScreenColMasterDto.data.head);

		//センタ・荷主区分取得
		String centerClientCls = col.getCenterClientCls();

		//荷主場合
		if(centerClientCls.equals("2")){
			//荷主ID取得
			String clientCd = col.getCenterOrClientCd();
			MClient mClient = new MClient();
			mClient.setClientCd(clientCd);
			mClient = clientLogic.getUkEntity(mClient);
			col.setCenterOrClientId(mClient.getClientId());
		}else{//センタ場合

			//センタID取得
			String centerCd = col.getCenterOrClientCd();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCd);
			mCenter = centerLogic.getUkEntity(mCenter);
			col.setCenterOrClientId(mCenter.getCenterId());
		}

		//画面ID取得
		String screenCd = col.getScreenListCd();
		BScreen bScreen = new BScreen();
		bScreen.setScreenCd(screenCd);
		bScreen= screenLogic.getUkEntity(bScreen);

		BItem bItem = new BItem();
		bItem.setScreenId(bScreen.getScreenId());

		//項目ID取得
		String itemCd = col.getItemListCd();
		bItem.setItemCd(itemCd);
		bItem= itemLogic.getUkEntity(bItem);
		col.setItemId(bItem.getItemId());

		// 検索
		List<BCol> page = centerClientScreenColMasterSelectLogic.select(col, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<BColDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		centerClientScreenColDto.data.body = list;

		return centerClientScreenColDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・列名存在チェックエラー用メッセージ
	 * ・列CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param centerClientScreenColMasterDto センタ・荷主別画面グリッドマスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterClientScreenColMasterDto centerClientScreenColMasterDto) {
		// Entity変換
		BColDtoMapper mapper = new BColDtoMapper();
		List<BCol> colList = mapper.mappingToEntityList(centerClientScreenColMasterDto.data.body);
		BCol col = mapper.mappingToEntity(centerClientScreenColMasterDto.data.head);

		// 登録データ組み立て
		//荷主場合
		centerClientScreenColMasterCheckLogic.checkCenterClientColMasterWithConfirm(colList, col, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_CHECK_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>センタ・荷主別画面グリッドマスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにセンタ・荷主別画面グリッドマスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param centerClientScreenColMasterDto センタ・荷主別画面グリッドマスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CenterClientScreenColMasterDto centerClientScreenColMasterDto) {
		// Entity変換
		BColDtoMapper mapper = new BColDtoMapper();
		List<BCol> colList = mapper.mappingToEntityList(centerClientScreenColMasterDto.data.body);
		BCol col = mapper.mappingToEntity(centerClientScreenColMasterDto.data.head);

		centerClientScreenColMasterCheckLogic.checkCenterClientColMasterNoneConfirm(colList, col, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_CHECK_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}


		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		List<MClientCol> clientIntList = new ArrayList<>();

		List<MClientCol> clientUpdList = new ArrayList<>();

		List<MCenterCol> centerIntList = new ArrayList<>();

		List<MCenterCol> centerUpdList = new ArrayList<>();
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End

		for (BCol bCol : colList) {
			//辞書ID取得
			// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//			BDict bDict = new BDict();
//			if(bCol.getScreenColNm() != null){
//				if(bCol.getScreenColNm().length() > 0){
//					bDict.setDictNm(bCol.getScreenColNm());
//					bDict = dictLogic.getUkEntity(bDict);
//				}
//			}

			VDict vDict = new VDict();
			if(bCol.getScreenColNm() != null){
				if(bCol.getScreenColNm().length() > 0){
					vDict.setDictNm(bCol.getScreenColNm());
					vDict.setCultureId(getCultureId());
					vDict = vdictLogic.getUkEntity(vDict);
				}
			}
			// [ON推-品向-562] 多言語対応 2015.05.20 ki End

			//荷主の場合
			if(bCol.getCenterClientCls().equals("2")){
				MClientCB cb = mClientBhv.newMyConditionBean();
				cb.query().setClientCd_Equal(col.getCenterOrClientCd());
				MClient mClient = mClientBhv.selectEntity(cb);

				MClientCol mClientCol =new MClientCol();
				if(bCol.getMClientColList().size() > 0){
					mClientCol = bCol.getMClientColList().get(0);
				}

				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//				if(bDict != null){
//					mClientCol.setDictId(bDict.getDictId());
//				}
				if(vDict != null){
					mClientCol.setDictId(vDict.getDictId());
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End

				//表示可否取得
				mClientCol.setVisible(bCol.getScreenColVisible());
				//編集可否取得
				mClientCol.setEditable(bCol.getScreenColEditable());
				//必須取得
				mClientCol.setNecessary(bCol.getScreenColNecessary());
				// データの登録・更新判定
				if (bCol.getCenterOrClientColId() == null) {

					if((bCol.getScreenColNm() != null && bCol.getScreenColNm().length() > 0) ||
							(bCol.getScreenColVisible() != null && bCol.getScreenColVisible().length() > 0) ||
							(bCol.getScreenColEditable() != null && bCol.getScreenColEditable().length() > 0) ||
							(bCol.getScreenColNecessary() != null && bCol.getScreenColNecessary().length() > 0)){
						if(mClient != null){
							//ログインユーザが選択した荷主ID取得
							mClientCol.setClientId(mClient.getClientId());
						}
						//列ID取得
						mClientCol.setColId(bCol.getColId());
						clientIntList.add(mClientCol);
						// 登録
//						centerClientScreenColMasterInsertLogic.insertByClient(mClientCol, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_INSERT_FAILED));
					}
				} else {
					clientUpdList.add(mClientCol);
					// 修正
//					centerClientScreenColMasterUpdateLogic.updateByClient(mClientCol, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED));
				}
			}
			//センタ場合
			if(bCol.getCenterClientCls().equals("1")){
				MCenterCB cb = mCenterBhv.newMyConditionBean();
				cb.query().setCenterCd_Equal(col.getCenterOrClientCd());
				MCenter mCenter = mCenterBhv.selectEntity(cb);

				MCenterCol mCenterCol =new MCenterCol();
				if(bCol.getMCenterColList().size() > 0){
					mCenterCol = bCol.getMCenterColList().get(0);
				}

				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//				if(bDict != null){
//					mCenterCol.setDictId(bDict.getDictId());
//				}
				if(vDict != null){
					mCenterCol.setDictId(vDict.getDictId());
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End

				//表示可否取得
				mCenterCol.setVisible(bCol.getScreenColVisible());
				//編集可否取得
				mCenterCol.setEditable(bCol.getScreenColEditable());
				//必須取得
				mCenterCol.setNecessary(bCol.getScreenColNecessary());
				// データの登録・更新判定
				if (bCol.getCenterOrClientColId() == null) {

					if((bCol.getScreenColNm() != null && bCol.getScreenColNm().length() > 0) ||
							(bCol.getScreenColVisible() != null && bCol.getScreenColVisible().length() > 0) ||
							(bCol.getScreenColEditable() != null && bCol.getScreenColEditable().length() > 0) ||
							(bCol.getScreenColNecessary() != null && bCol.getScreenColNecessary().length() > 0)){
						if(mCenter != null){
							//ログインユーザが選択したセンタID取得
							mCenterCol.setCenterId(mCenter.getCenterId());
						}

						//列ID取得
						mCenterCol.setColId(bCol.getColId());
						centerIntList.add(mCenterCol);
						// 登録
//						centerClientScreenColMasterInsertLogic.insertByCenter(mCenterCol, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_INSERT_FAILED));
					}
				} else {
					centerUpdList.add(mCenterCol);
					// 修正
//					centerClientScreenColMasterUpdateLogic.updateByCenter(mCenterCol, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED));
				}
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		if (!clientIntList.isEmpty()){
			// 登録
			centerClientScreenColMasterInsertLogic.batchInsertByClient(clientIntList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED));
		}

		if (!clientUpdList.isEmpty()){
			// 登録
			centerClientScreenColMasterUpdateLogic.batchUpdateByClient(clientUpdList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED));
		}

		if (!centerIntList.isEmpty()){
			// 登録
			centerClientScreenColMasterInsertLogic.batchInsertByCenter(centerIntList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED));
		}

		if (!centerUpdList.isEmpty()){
			// 登録
			centerClientScreenColMasterUpdateLogic.batchUpdateByCenter(centerUpdList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_COL_MASTER_UPDATE_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ON推-品向-164] 完了メッセージを統一 2015.01.06 kawana Start
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-164] 完了メッセージを統一 2015.01.06 kawana End
		return null;
	}
}
