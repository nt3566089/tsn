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
import com.oneslogi.base.dbflute.dto.BItemDto;
import com.oneslogi.base.dbflute.dtomapper.BItemDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BItem;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterItem;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientItem;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.logic.common.ScreenLogic;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterClientScreenItemMasterDto;
import com.oneslogi.wms.logic.common.CenterClientScreenItemMasterCheckLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenItemMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenItemMasterSelectLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenItemMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタ・荷主別画面項目マスタ画面のリソースクラス。
 */
@Path("/master/centerClientScreenItemMaster")
public class CenterClientScreenItemMasterResource extends AbstractWmsResource {

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
		protected static final int CENTER_CLIENT_SCREEN_ITEM_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED = 5;
		/**
		 * センタ・荷主別画面項目マスタデータチェック異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_ITEM_MASTER_CHECK_FAILED = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClientScreenItemMasterSelectLogic centerClientScreenItemMasterSelectLogic;
	@Inject
	private CenterClientScreenItemMasterInsertLogic centerClientScreenItemMasterInsertLogic;
	@Inject
	private CenterClientScreenItemMasterUpdateLogic centerClientScreenItemMasterUpdateLogic;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;
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
	private CenterClientScreenItemMasterCheckLogic centerClientScreenItemMasterCheckLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterClientScreenItemMasterDto センタ・荷主別画面項目マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterClientScreenItemMasterDto init() {
		return new CenterClientScreenItemMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタ・荷主別画面項目マスタ画面用DTOをキーにセンタ・荷主別画面項目マスタデータ取り出し
	 * </pre>
	 * @param centerClientScreenItemMasterDto センタ・荷主別画面項目マスタ画面用DTO
	 * @return centerClientScreenItemMasterDto センタ・荷主別画面項目マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CenterClientScreenItemMasterDto search(CenterClientScreenItemMasterDto centerClientScreenItemMasterDto) throws IOException {
		CenterClientScreenItemMasterDto centerClientScreenItemDto = new CenterClientScreenItemMasterDto();

		// Entity変換
		BItemDtoMapper mapper = new BItemDtoMapper();
		BItem item = mapper.mappingToEntity(centerClientScreenItemMasterDto.data.head);

		//センタ・荷主区分取得
		String centerClientCls = item.getCenterClientCls();

		//荷主場合
		if (centerClientCls.equals("2")) {
			//荷主ID取得
			String clientCd = item.getCenterOrClientCd();
			MClient mClient = new MClient();
			mClient.setClientCd(clientCd);
			mClient = clientLogic.getUkEntity(mClient);
			item.setCenterOrClientId(mClient.getClientId());
		} else {//センタ場合

			//センタID取得
			String centerCd = item.getCenterOrClientCd();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCd);
			mCenter = centerLogic.getUkEntity(mCenter);
			item.setCenterOrClientId(mCenter.getCenterId());
		}

		//画面ID取得
		String screenCd = item.getScreenListCd();
		BScreen bScreen = new BScreen();
		bScreen.setScreenCd(screenCd);
		bScreen = screenLogic.getUkEntity(bScreen);
		item.setScreenId(bScreen.getScreenId());

		// 検索
		List<BItem> page = centerClientScreenItemMasterSelectLogic.select(item, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<BItemDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		centerClientScreenItemDto.data.body = list;

		return centerClientScreenItemDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・項目名存在チェックエラー用メッセージ
	 * ・項目CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param centerClientScreenItemMasterDto センタ・荷主別画面項目マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterClientScreenItemMasterDto centerClientScreenItemMasterDto) {
		// Entity変換
		BItemDtoMapper mapper = new BItemDtoMapper();
		List<BItem> itemList = mapper.mappingToEntityList(centerClientScreenItemMasterDto.data.body);
		BItem item = mapper.mappingToEntity(centerClientScreenItemMasterDto.data.head);

		// 登録データ組み立て
		//荷主場合
		centerClientScreenItemMasterCheckLogic.checkCenterClientItemMasterWithConfirm(itemList, item, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_CHECK_FAILED));

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
	 * <h2>センタ・荷主別画面項目マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにセンタ・荷主別画面項目マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param centerClientScreenItemMasterDto センタ・荷主別画面項目マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CenterClientScreenItemMasterDto centerClientScreenItemMasterDto) {
		// Entity変換
		BItemDtoMapper mapper = new BItemDtoMapper();
		List<BItem> itemList = mapper.mappingToEntityList(centerClientScreenItemMasterDto.data.body);
		BItem item = mapper.mappingToEntity(centerClientScreenItemMasterDto.data.head);

		centerClientScreenItemMasterCheckLogic.checkCenterClientItemMasterNoneConfirm(itemList, item, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_CHECK_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		List<MClientItem> clientIntList = new ArrayList<>();

		List<MClientItem> clientUpdList = new ArrayList<>();

		List<MCenterItem> centerIntList = new ArrayList<>();

		List<MCenterItem> centerUpdList = new ArrayList<>();
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End

		for (BItem bItem : itemList) {
			//辞書ID取得
			// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
			//			BDict bDict = new BDict();
			//			if(bItem.getScreenItemNm() != null){
			//				if(bItem.getScreenItemNm().length() > 0){
			//					bDict.setDictNm(bItem.getScreenItemNm());
			//					bDict = dictLogic.getUkEntity(bDict);
			//				}
			//			}

			VDict vDict = new VDict();
			if (bItem.getScreenItemNm() != null) {
				if (bItem.getScreenItemNm().length() > 0) {
					vDict.setDictNm(bItem.getScreenItemNm());
					vDict.setCultureId(getCultureId());
					vDict = vdictLogic.getUkEntity(vDict);
				}
			}
			// [ON推-品向-562] 多言語対応 2015.05.20 ki End

			//荷主の場合
			if (bItem.getCenterClientCls().equals("2")) {
				MClientCB cb = mClientBhv.newMyConditionBean();
				cb.query().setClientCd_Equal(item.getCenterOrClientCd());
				MClient mClient = mClientBhv.selectEntity(cb);

				MClientItem mClientItem = new MClientItem();
				if (bItem.getMClientItemList().size() > 0) {
					mClientItem = bItem.getMClientItemList().get(0);
				}

				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
				//				if(bDict != null){
				//					mClientItem.setDictId(bDict.getDictId());
				//				}
				if (vDict != null) {
					mClientItem.setDictId(vDict.getDictId());
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End

				//表示可否取得
				mClientItem.setVisible(bItem.getScreenItemVisible());
				//編集可否取得
				mClientItem.setEditable(bItem.getScreenItemEditable());
				//必須取得
				mClientItem.setNecessary(bItem.getScreenItemNecessary());
				// データの登録・更新判定
				if (bItem.getCenterOrClientItemId() == null) {

					if ((bItem.getScreenItemNm() != null && bItem.getScreenItemNm().length() > 0) ||
							(bItem.getScreenItemVisible() != null && bItem.getScreenItemVisible().length() > 0) ||
							(bItem.getScreenItemEditable() != null && bItem.getScreenItemEditable().length() > 0) ||
							(bItem.getScreenItemNecessary() != null && bItem.getScreenItemNecessary().length() > 0)) {
						if (mClient != null) {
							//ログインユーザが選択した荷主ID取得
							mClientItem.setClientId(mClient.getClientId());
						}
						//項目ID取得
						mClientItem.setItemId(bItem.getItemId());

						clientIntList.add(mClientItem);

						// 登録
//						centerClientScreenItemMasterInsertLogic.insertByClient(mClientItem, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_INSERT_FAILED));
					}
				} else {
					clientUpdList.add(mClientItem);
					// 修正
//					centerClientScreenItemMasterUpdateLogic.updateByClient(mClientItem, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED));
				}
			}
			//センタ場合
			if (bItem.getCenterClientCls().equals("1")) {
				MCenterCB cb = mCenterBhv.newMyConditionBean();
				cb.query().setCenterCd_Equal(item.getCenterOrClientCd());
				MCenter mCenter = mCenterBhv.selectEntity(cb);
				MCenterItem mCenterItem = new MCenterItem();
				if (bItem.getMCenterItemList().size() > 0) {
					mCenterItem = bItem.getMCenterItemList().get(0);
				}

				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
				//				if(bDict != null){
				//					mCenterItem.setDictId(bDict.getDictId());
				//				}
				if (vDict != null) {
					mCenterItem.setDictId(vDict.getDictId());
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End

				//表示可否取得
				mCenterItem.setVisible(bItem.getScreenItemVisible());
				//編集可否取得
				mCenterItem.setEditable(bItem.getScreenItemEditable());
				//必須取得
				mCenterItem.setNecessary(bItem.getScreenItemNecessary());
				// データの登録・更新判定
				if (bItem.getCenterOrClientItemId() == null) {

					if ((bItem.getScreenItemNm() != null && bItem.getScreenItemNm().length() > 0) ||
							(bItem.getScreenItemVisible() != null && bItem.getScreenItemVisible().length() > 0) ||
							(bItem.getScreenItemEditable() != null && bItem.getScreenItemEditable().length() > 0) ||
							(bItem.getScreenItemNecessary() != null && bItem.getScreenItemNecessary().length() > 0)) {
						if (mCenter != null) {
							//ログインユーザが選択したセンタID取得
							mCenterItem.setCenterId(mCenter.getCenterId());
						}

						//項目ID取得
						mCenterItem.setItemId(bItem.getItemId());

						centerIntList.add(mCenterItem);

						// 登録
//						centerClientScreenItemMasterInsertLogic.insertByCenter(mCenterItem, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_INSERT_FAILED));
					}
				} else {
					centerUpdList.add(mCenterItem);
					// 修正
//					centerClientScreenItemMasterUpdateLogic.updateByCenter(mCenterItem, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED));
				}
			}
		}

		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		if (!clientIntList.isEmpty()) {
			// 登録
			centerClientScreenItemMasterInsertLogic.batchInsertByClient(clientIntList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED));
		}

		if (!clientUpdList.isEmpty()) {
			// 修正
			centerClientScreenItemMasterUpdateLogic.batchUpdateByClient(clientUpdList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED));
		}

		if (!centerIntList.isEmpty()) {
			// 登録
			centerClientScreenItemMasterInsertLogic.batchInsertByCenter(centerIntList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED));
		}

		if (!centerUpdList.isEmpty()) {
			// [#918] 更新されない不具合を修正 2017.01.27 kawana Start
			// 修正
			centerClientScreenItemMasterUpdateLogic.batchUpdateByCenter(centerUpdList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_ITEM_MASTER_UPDATE_FAILED));
			// [#918] 更新されない不具合を修正 2017.01.27 kawana End
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ON推-品向-163] 完了メッセージを統一 2015.01.06 kawana Start
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-163] 完了メッセージを統一 2015.01.06 kawana End
		return null;
	}
}
