package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.dto.BUserDto;
import com.oneslogi.base.dbflute.dtomapper.BUserDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.exentity.BCulture;
import com.oneslogi.base.dbflute.exentity.BRoleGrp;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.logic.common.CultureLogic;
import com.oneslogi.base.logic.common.RoleGrpLogic;
import com.oneslogi.base.resources.AbstractResource;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.dto.master.UserMasterListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.master.UserMasterListSelectLogic;

/**
 * WMS用ユーザマスタ一覧画面のリソースクラス。
 */
@Path("/master/userMasterList")
public class UserMasterListResource extends AbstractResource {

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
		 * ユーザマスタ一覧データ取得異常
		 */
		protected static final int USER_SELECT_FAILED = 2;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private UserMasterListSelectLogic userMasterListSelectLogic;

	@Inject
	private CenterLogic centerLogic;

	@Inject
	private ClientLogic clientLogic;

	@Inject
	private CultureLogic cultureLogic;

	@Inject
	private RoleGrpLogic roleGrpLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ユーザマスタ一覧画面用DTOの作成
	 * </pre>
	 * @return UserListDto ユーザマスタ一覧画面用DTO
	 */
	@GET
	@Path("/init")
	public UserMasterListDto init() {

		UserMasterListDto userMasterListDto = new UserMasterListDto();

		// センタマスタリスト取得
		List<MCenter> centerList = userMasterListSelectLogic.selectMCenterList(errRetSts(StatusCode.USER_SELECT_FAILED));
		// 荷主マスタリスト取得
		List<MClient> clientList = userMasterListSelectLogic.selectMClientList(errRetSts(StatusCode.USER_SELECT_FAILED));

		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MClientDtoMapper clientMapper = new MClientDtoMapper();
		userMasterListDto.data.centerList = centerMapper.mappingToDtoList(centerList);
		userMasterListDto.data.clientList = clientMapper.mappingToDtoList(clientList);

		return userMasterListDto;
	}

	/**
	 * <h2>ユーザマスタ一覧データ取得</h2>
	 * <pre>
	 * データベースにユーザマスタ一覧データを取得する
	 * </pre>
	 * @param userMasterListDto ユーザマスタ一覧画面用DTO
	 * @return UserListDto ユーザマスタ一覧画面用DTO
	 */
	@GET
	@Path("/search")
	public UserMasterListDto search(UserMasterListDto userMasterListDto) throws IOException {

		UserMasterListDto userMasterDto = new UserMasterListDto();

		// ユーザマスタ一覧データ取得の検索データ編集
		BUserDtoMapper headerMapper = new BUserDtoMapper();
		BUser header = headerMapper.mappingToEntity(userMasterListDto.data.head);

		// センタID取得
		String centerCd = header.getMUserCenterList().get(0).getMCenter().getCenterCd();;
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);

		if (mCenter != null) {
			header.getMUserCenterList().get(0).getMCenter().setCenterId(mCenter.getCenterId());
		} else {
			header.getMUserCenterList().get(0).getMCenter().setCenterId(null);
		}

		// 荷主ID取得
		String clientCd = header.getMUserClientList().get(0).getMClient().getClientCd();
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);

		if (mClient != null) {
			header.getMUserClientList().get(0).getMClient().setClientId(mClient.getClientId());
		} else {
			header.getMUserClientList().get(0).getMClient().setClientId(null);
		}

		// カルチャIDの取得
		BCulture cultureCondition = new BCulture();
		cultureCondition.setCultureCd(header.getBCulture().getCultureCd());
		if(!CU.isNullOrEmpty(header.getBCulture().getCultureCd())){
			long cultureId = cultureLogic.getUkEntityWithDeletedCheck(cultureCondition).getCultureId();
			header.setCultureId(cultureId);
		}

		// 権限グループIDの取得
		BRoleGrp roleGrpCondition = new BRoleGrp();
		roleGrpCondition.setRoleGrpCd(header.getBRoleGrp().getRoleGrpCd());
		if(!CU.isNullOrEmpty(header.getBRoleGrp().getRoleGrpCd())){
			long roleGrpId = roleGrpLogic.getUkEntityWithDeletedCheck(roleGrpCondition).getRoleGrpId();
			header.setRoleGrpId(roleGrpId);
		}

		// ユーザマスタ一覧データ取得
		PagingResultBean<BUser> page = userMasterListSelectLogic.selectByConditions(header, userMasterListDto.paging, errRetSts(StatusCode.USER_SELECT_FAILED));

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理中止
			return null;
		}

		// JSON通信のためにSimpleDTO変換
		List<BUserDto> list = headerMapper.mappingToDtoList(page);

		// 検索結果詰込処理
		userMasterDto.data.body = list;
		userMasterDto.paging = userMasterListDto.paging;

		return userMasterDto;
	}
}
