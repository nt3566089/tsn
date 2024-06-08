package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.oneslogi.base.dbflute.cbean.MShapeGrpCB;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.exbhv.MShapeGrpBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MShapeGrp;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.ClientMasterDto;
import com.oneslogi.wms.logic.common.ClientMasterCheckLogic;
import com.oneslogi.wms.logic.master.ClientMasterInsertLogic;
import com.oneslogi.wms.logic.master.ClientMasterSelectLogic;
import com.oneslogi.wms.logic.master.ClientMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 荷主マスタメンテナンスのリソースクラス。
 */
@Path("/master/clientMaster")
public class ClientMasterResource extends AbstractWmsResource {

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
		 * 荷主マスタメンテナンスデータ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 3;
		/**
		 * 登録異常
		 */
		protected static final int CLIENT_MASTER_INSERT_FAILED = 4;
		/**
		 * 更新異常
		 */
		protected static final int CLIENTMASTER_UPDATE_FAILED = 5;
		/**
		 * 荷主マスタデータチェック異常
		 */
		protected static final int CLIENT_MASTER_CHECK_FAILED = 6;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientMasterSelectLogic clientMasterSelectLogic;
	@Inject
	private ClientMasterInsertLogic clientMasterInsertLogic;
	@Inject
	private ClientMasterUpdateLogic clientMasterUpdateLogic;
	@Inject
	private ClientMasterCheckLogic clientMasterCheckLogic;
	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	@Inject
	private MShapeGrpBhv mshapegrpBhv;
	// [Ver3.0] unit of measure対応 2017.11.27 NING End

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return ClientMasterDto 荷主マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public ClientMasterDto init() {
		// 画面用DTOの作成
		ClientMasterDto ClientDto = new ClientMasterDto();
		return ClientDto;
	}

	/**
	 * <h2>荷主マスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * ・データベースに荷主マスタメンテナンスデータを取得する
	 * </pre>
	 * @param clientMasterDto 荷主マスタ画面用DTO
	 * @return ClientMasterDto 荷主マスタ画面用DTO
	 */
	@GET
	@Path("/search")
	public ClientMasterDto search(ClientMasterDto clientMasterDto) throws IOException {
		// Entity変換
		MClientDtoMapper mapper = new MClientDtoMapper();
		MClient client = mapper.mappingToEntity(clientMasterDto.data.head);

		// 検索
		List<MClient> clientList = clientMasterSelectLogic.select(client, errRetSts(StatusCode.NOT_FOUND_DATA));

		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			return null;
		}

		// Entity-Dto変換処理
		List<MClientDto> list = mapper.mappingToDtoList(clientList);

		// 検索結果詰込処理
		clientMasterDto.data.body = list;

		return clientMasterDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・荷主CD重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param clientMasterDto 荷主マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(ClientMasterDto clientMasterDto) {
		// Entity変換
		MClientDtoMapper mapper = new MClientDtoMapper();
		List<MClient> mClientList = mapper.mappingToEntityList(clientMasterDto.data.body);

		// チェック処理
		clientMasterCheckLogic.checkClientMaster(mClientList, errRetSts(StatusCode.CLIENT_MASTER_CHECK_FAILED));

		// 結果判定
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		} else {
			// 確認表示
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		}

		return null;
	}

	/**
	 * <h2>荷主マスタ登録。</h2>
	 * <pre>
	 * データの登録・更新処理。
	 * エラーがない場合は、データベースに荷主マスタデータを登録し、完了メッセージを設定する。
	 *
	 *
	 * </pre>
	 * @param clientMasterDto 荷主マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(ClientMasterDto clientMasterDto) {
		// Entity変換
		MClientDtoMapper mapper = new MClientDtoMapper();
		List<MClient> mClientList = mapper.mappingToEntityList(clientMasterDto.data.body);

		// チェック処理
		clientMasterCheckLogic.checkClientMaster(mClientList, errRetSts(StatusCode.CLIENT_MASTER_CHECK_FAILED));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start
		List<MClient> insertClient = new ArrayList<>();

		List<MClient> updateClient = new ArrayList<>();

		for (MClient mClient : mClientList) {
			// [Ver3.0] unit of measure対応 2017.11.27 NING Start
			// 荷姿グループIDを取得
			if (mClient.getMShapeGrp() != null && mClient.getMShapeGrp().getShapeGrpCd() != null) {
				MShapeGrpCB cb = new MShapeGrpCB();
				cb.query().setClientId_Equal(mClient.getClientId());
				cb.query().setShapeGrpCd_Equal(mClient.getMShapeGrp().getShapeGrpCd());
				MShapeGrp msg = mshapegrpBhv.selectEntity(cb);
				if (msg != null) {
					mClient.setShapeGrpId(msg.getShapeGrpId());
				}
			} else {
				// [Ver3.0][#3928] 未削除から削除へ更新する際、在庫管理単位が未選択なら、荷姿グループマスタIDにNullを格納する 2018.03.07 shimizu Start
				mClient.setShapeGrpId(null);
				// [Ver3.0][#3928] 未削除から削除へ更新する際、在庫管理単位が未選択なら、荷姿グループマスタIDにNullを格納する 2018.03.07 shimizu End
			}
			// [Ver3.0] unit of measure対応 2017.11.27 NING End
			if (mClient.getClientId() == null) {
				// 登録
				insertClient.add(mClient);
//				clientMasterInsertLogic.insert(mClient, errRetSts(StatusCode.CLIENT_MASTER_INSERT_FAILED));
			} else {
				// 修正
				updateClient.add(mClient);
//				clientMasterUpdateLogic.update(mClient, errRetSts(StatusCode.CLIENTMASTER_UPDATE_FAILED));
			}
		}

		if (!insertClient.isEmpty()){
			clientMasterInsertLogic.batchInsert(insertClient,errRetSts(StatusCode.CLIENT_MASTER_INSERT_FAILED));
		}

		if (!updateClient.isEmpty()){
			clientMasterUpdateLogic.batchUpdate(updateClient,errRetSts(StatusCode.CLIENT_MASTER_INSERT_FAILED));
		}
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW End
		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		//[ON推-品向-142]「正常に更新されました。」に修正 2014.11.26 衛 Start
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		//[ON推-品向-142]「正常に更新されました。」に修正 2014.11.26 衛 End
		return null;
	}
}
