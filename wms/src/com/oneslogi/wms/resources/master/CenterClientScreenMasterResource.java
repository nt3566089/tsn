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
import com.oneslogi.base.dbflute.dto.BScreenDto;
import com.oneslogi.base.dbflute.dtomapper.BScreenDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.BScreen;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MCenterScreen;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientScreen;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.logic.common.VDictLogic;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.CenterClientScreenMasterDto;
import com.oneslogi.wms.logic.common.CenterClientScreenMasterCheckLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenMasterInsertLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenMasterSelectLogic;
import com.oneslogi.wms.logic.master.CenterClientScreenMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * センタ・荷主別画面マスタ画面のリソースクラス。
 */
@Path("/master/centerClientScreenMaster")
public class CenterClientScreenMasterResource extends AbstractWmsResource {

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
		protected static final int CENTER_CLIENT_SCREEN_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED = 5;
		/**
		 * センタ・荷主別画面マスタデータチェック異常
		 */
		protected static final int CENTER_CLIENT_SCREEN_MASTER_CHECK_FAILED = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterClientScreenMasterSelectLogic centerClientScreenMasterSelectLogic;
	@Inject
	private CenterClientScreenMasterInsertLogic centerClientScreenMasterInsertLogic;
	@Inject
	private CenterClientScreenMasterUpdateLogic centerClientScreenMasterUpdateLogic;
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
	private CenterClientScreenMasterCheckLogic centerClientScreenMasterCheckLogic;
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientBhv mClientBhv;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return CenterClientScreenMasterDto センタ・荷主別画面マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public CenterClientScreenMasterDto init() {
		return new CenterClientScreenMasterDto();
	}

	/**
	 * <h2>検索処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・センタ・荷主別画面マスタ画面用DTOをキーにセンタ・荷主別画面マスタデータ取り出し
	 * </pre>
	 * @param centerClientScreenMasterDto センタ・荷主別画面マスタ画面用DTO
	 * @return centerClientScreenMasterDto センタ・荷主別画面マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public CenterClientScreenMasterDto search(CenterClientScreenMasterDto centerClientScreenMasterDto) throws IOException {
		CenterClientScreenMasterDto centerClientScreenDto = new CenterClientScreenMasterDto();

		// Entity変換
		BScreenDtoMapper mapper = new BScreenDtoMapper();
		BScreen screen = mapper.mappingToEntity(centerClientScreenMasterDto.data.head);

		//センタ・荷主区分取得
		String centerClientCls = screen.getCenterClientCls();

		//荷主場合
		if(centerClientCls.equals("2")){
			//荷主ID取得
			String clientCd = screen.getCenterOrClientCd();
			MClient mClient = new MClient();
			mClient.setClientCd(clientCd);
			mClient = clientLogic.getUkEntity(mClient);
			screen.setCenterOrClientId(mClient.getClientId());
		}else{//センタ場合

			//センタID取得
			String centerCd = screen.getCenterOrClientCd();
			MCenter mCenter = new MCenter();
			mCenter.setCenterCd(centerCd);
			mCenter = centerLogic.getUkEntity(mCenter);
			screen.setCenterOrClientId(mCenter.getCenterId());
		}

		// 検索
		List<BScreen> page = centerClientScreenMasterSelectLogic.select(screen, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		//Entity-Dto変換処理
		List<BScreenDto> list = mapper.mappingToDtoList(page);

		//検索結果詰込処理
		centerClientScreenDto.data.body = list;

		return centerClientScreenDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・画面名存在チェックエラー用メッセージ
	 * ・画面CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param centerClientScreenMasterDto センタ・荷主別画面マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(CenterClientScreenMasterDto centerClientScreenMasterDto) {
		// Entity変換
		BScreenDtoMapper mapper = new BScreenDtoMapper();
		List<BScreen> screenList = mapper.mappingToEntityList(centerClientScreenMasterDto.data.body);

		BScreen screen = mapper.mappingToEntity(centerClientScreenMasterDto.data.head);


		// 登録データ組み立て
		//荷主場合
		centerClientScreenMasterCheckLogic.checkCenterClientScreenMasterWithConfirm(screenList, screen,errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_CHECK_FAILED));

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
	 * <h2>センタ・荷主別画面マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースにセンタ・荷主別画面マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * 登録データに次の値を設定する。
	 * ・センタID
	 * </pre>
	 * @param centerClientScreenMasterDto センタ・荷主別画面マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(CenterClientScreenMasterDto centerClientScreenMasterDto) {
		// Entity変換
		BScreenDtoMapper mapper = new BScreenDtoMapper();
		List<BScreen> screenList = mapper.mappingToEntityList(centerClientScreenMasterDto.data.body);
		BScreen screen = mapper.mappingToEntity(centerClientScreenMasterDto.data.head);

		centerClientScreenMasterCheckLogic.checkCenterClientScreenMasterNoneConfirm(screenList, screen,errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_CHECK_FAILED));

		// 結果判定
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}


		List<MClientScreen> clientInsList = new ArrayList<>();

		List<MClientScreen> clientUpdList = new ArrayList<>();


		List<MCenterScreen> centerInsList = new ArrayList<>();

		List<MCenterScreen> centerUpdList = new ArrayList<>();


		for (BScreen bScreen : screenList) {
			//辞書ID取得
			// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//			BDict bDict = new BDict();
//			if(bScreen.getCenterOrClientScreenNm() != null){
//				if(bScreen.getCenterOrClientScreenNm().length() > 0){
//					bDict.setDictNm(bScreen.getCenterOrClientScreenNm());
//					bDict = dictLogic.getUkEntity(bDict);
//				}
//			}

			VDict vDict = new VDict();
			if(bScreen.getCenterOrClientScreenNm() != null){
				if(bScreen.getCenterOrClientScreenNm().length() > 0){
					vDict.setDictNm(bScreen.getCenterOrClientScreenNm());
					vDict.setCultureId(getCultureId());
					vDict = vdictLogic.getUkEntity(vDict);
				}
			}
			// [ON推-品向-562] 多言語対応 2015.05.20 ki End

			//荷主の場合
			if(bScreen.getCenterClientCls().equals("2")){
				MClientCB cb = mClientBhv.newMyConditionBean();
				cb.query().setClientCd_Equal(screen.getCenterOrClientCd());
				MClient mClient = mClientBhv.selectEntity(cb);

				MClientScreen mClientScreen =new MClientScreen();
				if(bScreen.getMClientScreenList().size() > 0){
					mClientScreen = bScreen.getMClientScreenList().get(0);
				}

				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//				if(bDict != null){
//					mClientScreen.setDictId(bDict.getDictId());
//				}
				if(vDict != null){
					mClientScreen.setDictId(vDict.getDictId());
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End

				//表示可否取得
				mClientScreen.setVisible(bScreen.getCenterOrClientScreenVisible());
				// データの登録・更新判定
				if (bScreen.getCenterOrClientScreenId() == null) {


					if((bScreen.getCenterOrClientScreenNm() != null && bScreen.getCenterOrClientScreenNm().length() > 0) ||
							(bScreen.getCenterOrClientScreenVisible() != null && bScreen.getCenterOrClientScreenVisible().length() > 0)){
						if(mClient != null){
							//ログインユーザが選択した荷主ID取得
							mClientScreen.setClientId(mClient.getClientId());
						}
						//画面ID取得
						mClientScreen.setScreenId(bScreen.getScreenId());

						// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
						clientInsList.add(mClientScreen);
						// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End

						// 登録
//						centerClientScreenMasterInsertLogic.insertByClient(mClientScreen, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_INSERT_FAILED));
					}
				} else {
					// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
					clientUpdList.add(mClientScreen);
					// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
					// 修正
//					centerClientScreenMasterUpdateLogic.updateByClient(mClientScreen, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED));
				}
			}
			//センタ場合
			if(bScreen.getCenterClientCls().equals("1")){

				MCenterCB cb = mCenterBhv.newMyConditionBean();
				cb.query().setCenterCd_Equal(screen.getCenterOrClientCd());
				MCenter center = mCenterBhv.selectEntity(cb);
				MCenterScreen mCenterScreen =new MCenterScreen();
				if(bScreen.getMCenterScreenList().size() > 0){
					mCenterScreen = bScreen.getMCenterScreenList().get(0);
				}

				// [ON推-品向-562] 多言語対応 2015.05.20 ki Start
//				if(bDict != null){
//					mCenterScreen.setDictId(bDict.getDictId());
//				}
				if(vDict != null){
					mCenterScreen.setDictId(vDict.getDictId());
				}
				// [ON推-品向-562] 多言語対応 2015.05.20 ki End

				//表示可否取得
				mCenterScreen.setVisible(bScreen.getCenterOrClientScreenVisible());
				// データの登録・更新判定
				if (bScreen.getCenterOrClientScreenId() == null) {

					if((bScreen.getCenterOrClientScreenNm() != null && bScreen.getCenterOrClientScreenNm().length() > 0) ||
							(bScreen.getCenterOrClientScreenVisible() != null && bScreen.getCenterOrClientScreenVisible().length() > 0)){
						if(center != null){
							//ログインユーザが選択したセンタID取得
							mCenterScreen.setCenterId(center.getCenterId());
						}

						//画面ID取得
						mCenterScreen.setScreenId(bScreen.getScreenId());

						// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
						centerInsList.add(mCenterScreen);
						// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
						// 登録
//						centerClientScreenMasterInsertLogic.insertByCenter(mCenterScreen, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_INSERT_FAILED));
					}
				} else {
					// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
					centerUpdList.add(mCenterScreen);
					// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End
					// 修正
//					centerClientScreenMasterUpdateLogic.updateByCenter(mCenterScreen, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED));
				}
			}
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW Start
		if (!clientInsList.isEmpty()){
			// 登録
			centerClientScreenMasterInsertLogic.batchInsertByClient(clientInsList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED));
		}

		if (!clientUpdList.isEmpty()){
			// 修正
			centerClientScreenMasterUpdateLogic.batchUpdateByClient(clientUpdList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED));
		}


		if (!centerInsList.isEmpty()){
			// 登録
			centerClientScreenMasterInsertLogic.batchInsertByCenter(centerInsList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED));
		}

		if (!centerUpdList.isEmpty()){
			// 修正
			centerClientScreenMasterUpdateLogic.batchUpdateByCenter(centerUpdList, errRetSts(StatusCode.CENTER_CLIENT_SCREEN_MASTER_UPDATE_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.18 DSW End

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}

		// [ON推-品向-162] 完了メッセージを統一 2015.01.06 kawana Start
		// 完了メッセージの設定
		this.getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		// [ON推-品向-162] 完了メッセージを統一 2015.01.06 kawana End
		return null;
	}
}
