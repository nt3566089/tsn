package com.oneslogi.wms.resources.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dtomapper.MWebHtInfoDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MWebHtInfo;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.WebHTinfoMasterDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.WebHTinfoCheckLogic;
import com.oneslogi.wms.logic.master.WebHTinfoMasterInsertLogic;
import com.oneslogi.wms.logic.master.WebHTinfoMasterSelectLogic;
import com.oneslogi.wms.logic.master.WebHTinfoMasterUpdateLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * WEBHT管理マスタメンテナンス画面のリソースクラス。
 */
@Path("/master/webhtinfoMaster")
public class WebHTinfoMasterResource extends AbstractWmsResource {

	// ===== 定数定義 =====

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
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * WEBHT管理マスタ登録異常
		 */
		protected static final int WEBHTINFO_MASTER_INSERT_FAILED = 3;
		/**
		 * WEBHT管理マスタ更新異常
		 */
		protected static final int WEBHTINFO_MASTER_UPDATE_FAILED = 4;
		/**
		 * MACアドレス重複
		 */
		protected static final int WEBHTINFO_MASTER_CHECK_FAILED = 5;

	}

	// ===== 使用ロジッククラス =====
	@Inject
	private WebHTinfoMasterSelectLogic selectLogic;
	@Inject
	private WebHTinfoMasterInsertLogic insertLogic;
	@Inject
	private WebHTinfoMasterUpdateLogic updateLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private WebHTinfoCheckLogic CheckLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * </pre>
	 * @return WebHTinfoMasterDto WEBHT管理マスタ画面用DTO
	 */
	@GET
	@Path("/init")
	public WebHTinfoMasterDto init() {
		// 画面用DTOの作成
		WebHTinfoMasterDto WebhtinfoDto = new WebHTinfoMasterDto();
		return WebhtinfoDto;
	}

	/**
	 * <h2>WEBHT管理マスタメンテナンスデータ取得。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・一覧データ取得
	 * ・WEBHT管理マスタメンテナンス画面用DTOデータ設定
	 * </pre>
	 * @param webhtinfoMasterDto WEBHT管理マスタメンテナンス画面用DTO
	 * @return WebHTinfoMasterDto WEBHT管理マスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/search")
	public WebHTinfoMasterDto search(WebHTinfoMasterDto webhtinfoMasterDto) {

		// Entity変換
		MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper();
		MWebHtInfo WebHtInfo = mapper.mappingToEntity(webhtinfoMasterDto.data.head);
		//センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(WebHtInfo.getMCenter().getCenterCd());
		mCenter = centerLogic.getUkEntity(mCenter);
		//センタID設定
		if (mCenter == null) {
			mCenter = new MCenter();
			WebHtInfo.setCenterId(mCenter.getCenterId());
		} else {
			WebHtInfo.setCenterId(mCenter.getCenterId());
		}

		//荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(WebHtInfo.getMClient().getClientCd());
		mClient = clientLogic.getUkEntity(mClient);
		//荷主ID設定
		if (mClient == null) {
			mClient = new MClient();
			WebHtInfo.setClientId(mClient.getClientId());
		} else {
			WebHtInfo.setClientId(mClient.getClientId());
		}

		// 検索
		PagingResultBean<MWebHtInfo> page = selectLogic.select(WebHtInfo, mCenter, webhtinfoMasterDto.paging, errRetSts(StatusCode.NOT_FOUND_DATA));
		// エラー有りの場合は終了
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		WebHTinfoMasterDto resultDto = new WebHTinfoMasterDto();
		//検索結果詰込処理
		MWebHtInfoDtoMapper resultMapper = new MWebHtInfoDtoMapper();
		// Entity-Dto変換処理
		resultDto.data.body = resultMapper.mappingToDtoList(page);

		// 検索結果詰込処理
		resultDto.paging = webhtinfoMasterDto.paging;

		return resultDto;
	}

	/**
	 * <h2>入力チェック。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・MACアドレス重複チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 *
	 * </pre>
	 * @param webhtinfoMasterDto WEBHT管理マスタ画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(WebHTinfoMasterDto webhtinfoMasterDto) {
		// Entity変換
		MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper();
		List<MWebHtInfo> mwebhtinfoList = mapper.mappingToEntityList(webhtinfoMasterDto.data.body);
		// チェック処理
		CheckLogic.checkwebhtinfoMaster(mwebhtinfoList, errRetSts(StatusCode.WEBHTINFO_MASTER_CHECK_FAILED));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}
		// MACアドレス重複の確認メッセージを設定
		getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
		return null;
	}

	/**
	 * <h2>WEBHT管理マスタ登録 。</h2>
	 * <pre>
	 * 登録データのチェックを行う。
	 * 更新データのチェックを行う。
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する。
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param webhtinfoMasterDto WEBHT管理マスタ画面用DTO
	 * @param errSts ErrorStatus
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public StatusDto register(WebHTinfoMasterDto webhtinfoMasterDto, ErrorStatus errSts) {
		// Entity変換
		MWebHtInfoDtoMapper mapper = new MWebHtInfoDtoMapper();
		List<MWebHtInfo> webhtinfosList = mapper.mappingToEntityList(webhtinfoMasterDto.data.body);

		CheckLogic.checkwebhtinfoMaster(webhtinfosList, errRetSts(StatusCode.WEBHTINFO_MASTER_INSERT_FAILED));
		if (getErrorManager().size() > 0) {
			// 処理中止
			return null;
		}

		List<MWebHtInfo> insertList = new ArrayList<>();

		List<MWebHtInfo> updateList = new ArrayList<>();

		for (MWebHtInfo mWebHtInfo : webhtinfosList) {
			MClient mClient = new MClient();
			MCenter mCenter = new MCenter();
			//荷主ID取得
			if (mWebHtInfo.getMClient() != null) {
				mClient.setClientCd(mWebHtInfo.getMClient().getClientCd());
				mClient = clientLogic.getUkEntity(mClient);
				//荷主ID設定
				if (mClient == null) {
					mClient = new MClient();
					mWebHtInfo.setClientId(mClient.getClientId());
				} else {
					mWebHtInfo.setClientId(mClient.getClientId());
				}
			}

			//センタID取得
			if (mWebHtInfo.getMCenter() != null) {
				mCenter.setCenterCd(mWebHtInfo.getMCenter().getCenterCd());
				mCenter = centerLogic.getUkEntity(mCenter);
				// センタID設定
				if (mCenter == null) {
					mCenter = new MCenter();
					mWebHtInfo.setCenterId(mCenter.getCenterId());
				} else {
					mWebHtInfo.setCenterId(mCenter.getCenterId());
				}
			}

			if (mWebHtInfo.getWebHtInfoId() == null) {
				// 登録
				insertList.add(mWebHtInfo);

			} else {
				// 修正
				updateList.add(mWebHtInfo);

			}
		}

		// 一括登録
		if (!insertList.isEmpty()) {
			insertLogic.batchInsert(insertList, errRetSts(StatusCode.WEBHTINFO_MASTER_INSERT_FAILED));
		}

		if (!updateList.isEmpty()) {
			updateLogic.batchUpdate(updateList, errRetSts(StatusCode.WEBHTINFO_MASTER_UPDATE_FAILED));
		}

		// 結果判定
		if (0 < getErrorManager().size()) {
			return null;
		}
		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.UPDATE_PROCESS_NORMAL_END_INFORMATION);
		return null;
	}

}
