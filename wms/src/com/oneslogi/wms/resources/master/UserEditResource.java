package com.oneslogi.wms.resources.master;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MUserCenterDto;
import com.oneslogi.base.dbflute.dto.MUserClientDto;
import com.oneslogi.base.dbflute.dtomapper.BUserDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCenterDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MClientDtoMapper;
import com.oneslogi.base.dbflute.dtomapper.MCustomerDtoMapper;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MUserCenter;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dbflute.exentity.MUserDeposit;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.dto.StatusDto;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.dto.master.UserEditDto;
import com.oneslogi.wms.logic.common.UserLoginRegisterLogic;
import com.oneslogi.wms.logic.master.UserCenterListSelectLogic;
import com.oneslogi.wms.logic.master.UserClientListSelectLogic;
import com.oneslogi.wms.logic.master.UserDepositListSelectLogic;
import com.oneslogi.wms.logic.master.UserEditDeleteLogic;
import com.oneslogi.wms.logic.master.UserEditInsertLogic;
import com.oneslogi.wms.logic.master.UserMasterListSelectLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * ユーザマスタメンテナンス画面のリソースクラス。
 */
@Path("/master/userEdit")
public class UserEditResource extends AbstractWmsResource {

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
		 * ユーザマスタデータ取得異常
		 */
		protected static final int USER_SELECT_FAILED = 2;
		/**
		 * ユーザセンタマスタ登録異常
		 */
		protected static final int USERCENTER_INSERT_FAILED = 3;
		/**
		 * ユーザ荷主マスタ登録異常
		 */
		protected static final int USERCLIENT_INSERT_FAILED = 4;
		/**
		 * ユーザセンタマスタ削除異常
		 */
		protected static final int USERCENTER_DELETE_FAILED = 5;
		/**
		 * ユーザ荷主マスタ削除異常
		 */
		protected static final int USERCLIENT_DELETE_FAILED = 6;
		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 ユーザマスタ更新機能削除 2017.12.05 honma Delete
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		/**
		 * ユーザ預託マスタ荷主権限チェックエラー
		 */
		protected static final int USERDEPOSIT_USERCLIENT_NOT_ROLE_ERROR = 8;
		/**
		 * ユーザ預託マスタ登録異常
		 */
		protected static final int USERDEPOSIT_INSERT_FAILED = 9;
		/**
		 * ユーザ預託マスタ削除異常
		 */
		protected static final int USERDEPOSIT_DELETE_FAILED = 10;
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
	}

	/**
	 * 登録または更新データ組立の結果
	 */
	private enum ResultSetupData {
		ALL_OK,
		USERDEPOSIT_USERCLIENT_NOT_ROLE_ERROR,
	}

	// ===== 使用ロジッククラス =====
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod Start
	@Inject
	private UserMasterListSelectLogic userMasterListSelectLogic;
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod End

	@Inject
	private UserCenterListSelectLogic userCenterListSelectLogic;

	@Inject
	private UserClientListSelectLogic userClientListSelectLogic;

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
	@Inject
	private UserDepositListSelectLogic userDepositListSelectLogic;
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

	@Inject
	private UserEditInsertLogic userEditInsertLogic;

	@Inject
	private UserEditDeleteLogic userEditDeleteLogic;

	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 ユーザマスタ更新機能削除 2017.12.05 honma Delete

	@Inject
	private UserLoginRegisterLogic userLoginRegisterLogic;

	/**
	 * <h2>初期処理。</h2>
	 * <pre>
	 * ・画面用DTOの作成
	 * ・ユーザマスタIDをキーにユーザマスタ、ユーザ管理センタ、ユーザ管理荷主データ取り出し
	 * ・ユーザマスタのデータを画面用DTOに設定
	 * </pre>
	 * @param userId ユーザID
	 * @return UserEditDto ユーザマスタメンテナンス画面用DTO
	 */
	@GET
	@Path("/init")
	public UserEditDto init(@QueryParam("userId") Long userId) {

		// ユーザマスタメンテナンス(編集)データ取得の検索データ編集
		// エンティティ編集
		BUser bUser = new BUser();
		bUser.setUserId(userId);

		// ユーザマスタデータの取得
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod Start
		BUser user = userMasterListSelectLogic.selectById(bUser, errRetSts(StatusCode.USER_SELECT_FAILED));
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod End

		// ユーザ管理センタデータの取得
		List<MCenter> centerList = userCenterListSelectLogic.selectByIdCenter(bUser, errRetSts(StatusCode.USER_SELECT_FAILED));

		for (int i = 0; i < centerList.size(); i++) {
			if (centerList.get(i).getMUserCenterList().size() > 0) {
				centerList.get(i).setCenterCheckBox("1");
			}
		}

		// ユーザ管理荷主データの取得
		List<MClient> clientList = userClientListSelectLogic.selectByIdClient(bUser, errRetSts(StatusCode.USER_SELECT_FAILED));

		for (int j = 0; j < clientList.size(); j++) {
			if (clientList.get(j).getMUserClientList().size() > 0) {
				clientList.get(j).setClientCheckBox("1");
			}
		}

		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		// ユーザ管理預託データの取得
		List<MCustomer> depositList = userDepositListSelectLogic.selectByIdCustomerDeposit(bUser, errRetSts(StatusCode.USER_SELECT_FAILED));
		// センタマスタデータの取得
		List<MCenter> allCenterList = userMasterListSelectLogic.selectMCenterList(errRetSts(StatusCode.USER_SELECT_FAILED));
		// 荷主マスタデータの取得
		List<MClient> allClientList = userMasterListSelectLogic.selectMClientList(errRetSts(StatusCode.USER_SELECT_FAILED));

		for (int j = 0; j < depositList.size(); j++) {
			if (depositList.get(j).getMUserDepositList().size() > 0) {
				depositList.get(j).setDepositCheckBox("1");
			}
		}
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		// エラーが存在する場合
		if (0 < getErrorManager().size()) {
			// 処理終了
			return null;
		}

		BUserDtoMapper userMapper = new BUserDtoMapper();
		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		MClientDtoMapper clientMapper = new MClientDtoMapper();
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		MCustomerDtoMapper customerMapper = new MCustomerDtoMapper();
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		// ユーザマスタメンテナンス(編集)画面用DTOデータセット
		UserEditDto userEditDto = new UserEditDto();
		userEditDto.data.user = userMapper.mappingToDto(user);
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		if (userEditDto.data.user.getMUserCenterList().size() == 0) {
			userEditDto.data.user.getMUserCenterList().add(0, new MUserCenterDto());
		}
		if (userEditDto.data.user.getMUserCenterList().get(0).getMCenter() == null) {
			userEditDto.data.user.getMUserCenterList().get(0).setMCenter(new MCenterDto());
		}
		if (userEditDto.data.user.getMUserClientList().size() == 0) {
			userEditDto.data.user.getMUserClientList().add(0, new MUserClientDto());
		}
		if (userEditDto.data.user.getMUserClientList().get(0).getMClient() == null) {
			userEditDto.data.user.getMUserClientList().get(0).setMClient(new MClientDto());
		}
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End
		userEditDto.data.centerList = centerMapper.mappingToDtoList(centerList);
		userEditDto.data.clientList = clientMapper.mappingToDtoList(clientList);
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		userEditDto.data.depositList = customerMapper.mappingToDtoList(depositList);
		userEditDto.data.searchConditonCenterList = centerMapper.mappingToDtoList(allCenterList);
		userEditDto.data.searchConditonClientList = clientMapper.mappingToDtoList(allClientList);
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		return userEditDto;
	}

	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod Start
	/**
	 * <h2>入力チェック（新規と更新）。</h2>
	 * <pre>
	 * 新規登録と更新データのチェックを行う
	 * エラーがない場合は、次の条件に合わせて確認メッセージを設定する
	 * ・チェックエラー用メッセージ
	 * ・通常の登録確認メッセージ
	 * </pre>
	 * @param userEditDto ユーザマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/inputCheck")
	public StatusDto inputCheck(UserEditDto userEditDto) {

		// Entity変換
		MClientDtoMapper clientMapper = new MClientDtoMapper();
		MCustomerDtoMapper customerMapper = new MCustomerDtoMapper();
		List<MClient> clientList = clientMapper.mappingToEntityList(userEditDto.data.clientList);
		List<MCustomer> depositList = customerMapper.mappingToEntityList(userEditDto.data.depositList);

		// 登録または更新チェック
		ResultSetupData resultStatus = setupInputCheck(clientList, depositList);

		switch (resultStatus) {
		case ALL_OK:
			// 通常の確認メッセージを設定
			getInfoManager().add(infoRetSts(StatusCode.CONFIRMATION), WmsMessageConst.DATA_REGISTER_CONFIRMATION);
			break;
		default:
			break;
		}

		return null;
	}

	/**
	 * <h2>登録または更新チェック。</h2>
	 * <pre>
	 * ユーザ預託のユーザ荷主権限有無チェックを行う
	 * </pre>
	 * @param clientList ユーザ荷主リスト
	 * @param depositList ユーザ預託リスト
	 * @return StatusDto 処理結果DTO
	 *
	 */
	private ResultSetupData setupInputCheck(List<MClient> clientList, List<MCustomer> depositList) {

		boolean userDepositUserClientNotRoleCheck = false;

		// ユーザ荷主権限有リスト取得
		List<Long> userClientIdList = new ArrayList<Long>();
		for (int clientRow = 0; clientRow < clientList.size(); clientRow++) {
			// チェックボックスを選択している場合
			if ("1".equals(clientList.get(clientRow).getClientCheckBox())) {
				userClientIdList.add(clientList.get(clientRow).getClientId());
			}
		}

		// ユーザ預託のユーザ荷主権限有無チェック
		for (int depositRow = 0; depositRow < depositList.size(); depositRow++) {
			// チェックボックスを選択している場合
			if ("1".equals(depositList.get(depositRow).getDepositCheckBox())) {
				if (!userClientIdList.contains(depositList.get(depositRow).getClientId())) {
					userDepositUserClientNotRoleCheck = true;
				}
			}
		}

		// ===== 結果の設定 =====

		ResultSetupData resultStatus;
		if (userDepositUserClientNotRoleCheck) {
			resultStatus = ResultSetupData.USERDEPOSIT_USERCLIENT_NOT_ROLE_ERROR;
		} else {
			resultStatus = ResultSetupData.ALL_OK;
		}

		switch (resultStatus) {
		case USERDEPOSIT_USERCLIENT_NOT_ROLE_ERROR:
			// ユーザ預託のユーザ荷主権限有無チェックのメッセージを設定
			getErrorManager().add(errRetSts(StatusCode.USERDEPOSIT_USERCLIENT_NOT_ROLE_ERROR), WmsMessageConst.DEPOSIT_CLIENT_NOT_SELECT_ERROR);
			break;
		default:
			break;
		}

		return resultStatus;
	}
	// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Mod End

	/**
	 * <h2>ユーザマスタメンテナンスデータ更新処理。</h2>
	 * <pre>
	 * ・ユーザログインマスタ登録
	 * ・ユーザセンタマスタ登録
	 * ・ユーザセンタマスタ削除
	 * ・ユーザ荷主マスタ登録
	 * ・ユーザ荷主マスタ削除
	 * ・ユーザ預託マスタ登録
	 * ・ユーザ預託マスタ削除
	 * </pre>
	 * @param userEditDto ユーザマスタメンテナンス画面用DTO
	 * @return StatusDto 処理結果DTO
	 */
	@POST
	@Path("/register")
	public UserEditDto register(UserEditDto userEditDto) throws IOException {
		// ユーザマスタメンテナンス(編集)の登録データ編集
		// Entity変換
		BUserDtoMapper mapper = new BUserDtoMapper();
		BUser user = mapper.mappingToEntity(userEditDto.data.user);
		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
		List<MCenter> centerList = centerMapper.mappingToEntityList(userEditDto.data.centerList);
		MClientDtoMapper clientMapper = new MClientDtoMapper();
		List<MClient> clientList = clientMapper.mappingToEntityList(userEditDto.data.clientList);
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		MCustomerDtoMapper customerMapper = new MCustomerDtoMapper();
		List<MCustomer> depositList = customerMapper.mappingToEntityList(userEditDto.data.depositList);

		// 登録または更新チェック
		ResultSetupData resultStatus = setupInputCheck(clientList, depositList);

		// 結果判定
		if (resultStatus != ResultSetupData.ALL_OK) {
			return null;
		}
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 ユーザマスタ更新機能削除 2017.12.05 honma Delete Start

		//[Ver2.2][#2517] Ver2.2以前対応のため登録処理復活 2017.10.05 miyabe Start
		MUserLogin mUserLogin = userLoginRegisterLogic.getMUserLogin(user.getUserId());
		if (mUserLogin == null) {
			List<Long> userCenterIdList = userLoginRegisterLogic.getUserCenterIdList(
					user.getUserId()
					, user.getUserCd());
			mUserLogin = userLoginRegisterLogic.insert(
					userCenterIdList
					, user.getUserId()
					// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana Start
					, getUserCd());
			// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana End
		}
		//[Ver2.2][#2517] Ver2.2以前対応のため登録処理復活 2017.10.05 miyabe End

		/* 2015/11/04 INOUE ADD END */

		// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 ユーザマスタ更新機能削除 2017.12.05 honma Delete

		// ユーザセンタマスタ登録と削除処理
		for (int centerRow = 0; centerRow < centerList.size(); centerRow++) {
			MUserCenter userCenter = new MUserCenter();

			if (centerList.get(centerRow).getMUserCenterList().size() > 0) {
				userCenter = centerList.get(centerRow).getMUserCenterList().get(0);
			} else {
				userCenter.setUserId(user.getUserId());
				userCenter.setCenterId(centerList.get(centerRow).getCenterId());
			}

			// チェックボックスの選んだ場合
			if ("1".equals(centerList.get(centerRow).getCenterCheckBox())) {
				if (centerList.get(centerRow).getMUserCenterList().size() > 0) {
					continue;
				} else {
					userEditInsertLogic.insertMUserCenter(userCenter, errRetSts(StatusCode.USERCENTER_DELETE_FAILED));
				}
			} else {
				if (centerList.get(centerRow).getMUserCenterList().size() > 0) {
					userEditDeleteLogic.deleteMUserCenter(userCenter, errRetSts(StatusCode.USERCENTER_INSERT_FAILED));
				}
			}
		}

		// ユーザ荷主マスタ登録と削除処理
		for (int clientRow = 0; clientRow < clientList.size(); clientRow++) {
			MUserClient userClient = new MUserClient();

			if (clientList.get(clientRow).getMUserClientList().size() > 0) {
				userClient = clientList.get(clientRow).getMUserClientList().get(0);
			} else {
				userClient.setUserId(user.getUserId());
				userClient.setClientId(clientList.get(clientRow).getClientId());
			}

			// チェックボックスの選んだ場合
			if ("1".equals(clientList.get(clientRow).getClientCheckBox())) {
				if (clientList.get(clientRow).getMUserClientList().size() > 0) {
					continue;
				} else {
					userEditInsertLogic.insertMuserClient(userClient, errRetSts(StatusCode.USERCENTER_DELETE_FAILED));
				}
			} else {
				if (clientList.get(clientRow).getMUserClientList().size() > 0) {
					userEditDeleteLogic.deleteMUserClient(userClient, errRetSts(StatusCode.USERCENTER_INSERT_FAILED));
				}
			}
		}

		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add Start
		// ユーザ預託マスタ登録と削除処理
		for (int depositRow = 0; depositRow < depositList.size(); depositRow++) {
			MUserDeposit userDeposit = new MUserDeposit();

			if (depositList.get(depositRow).getMUserDepositList().size() > 0) {
				userDeposit = depositList.get(depositRow).getMUserDepositList().get(0);
			} else {
				userDeposit.setUserId(user.getUserId());
				userDeposit.setCustomerId(depositList.get(depositRow).getCustomerId());
			}

			// チェックボックスを選択している場合
			if ("1".equals(depositList.get(depositRow).getDepositCheckBox())) {
				if (depositList.get(depositRow).getMUserDepositList().size() > 0) {
					continue;
				} else {
					userEditInsertLogic.insertMUserDeposit(userDeposit, errRetSts(StatusCode.USERDEPOSIT_INSERT_FAILED));
				}
			} else {
				if (depositList.get(depositRow).getMUserDepositList().size() > 0) {
					userEditDeleteLogic.deleteMUserDeposit(userDeposit, errRetSts(StatusCode.USERDEPOSIT_DELETE_FAILED));
				}
			}
		}
		// [#3147][Ver3.0] ユーザ預託管理機能を追加 2017.12.06 honma Add End

		// エラーの場合
		if (0 < getErrorManager().size()) {
			// 処理終了s
			return null;
		}

		// 完了メッセージの設定
		getInfoManager().add(infoRetSts(StatusCode.SUCCESS), WmsMessageConst.INSERT_PROCESS_NORMAL_END_INFORMATION);

		return null;
	}

	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete Start
//	// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana Start
//
//	/**
//	 * <h2>ユーザマスタメンテナンスデータコピー処理。</h2>
//	 * <pre>
//	 * ・ユーザログインマスタ登録
//	 * ・ユーザセンタマスタ登録
//	 * ・ユーザ荷主マスタ登録
//	 * </pre>
//	 * @param userEditDto ユーザマスタメンテナンス画面用DTO
//	 * @return StatusDto 処理結果DTO
//	 */
//	@POST
//	@Path("/registerCopy")
//	public UserEditDto registerCopy(UserEditDto userEditDto) throws IOException {
//		// ユーザマスタメンテナンス(編集)の登録データ編集
//		// Entity変換
//		BUserDtoMapper mapper = new BUserDtoMapper();
//		BUser user = mapper.mappingToEntity(userEditDto.data.user);
//		MCenterDtoMapper centerMapper = new MCenterDtoMapper();
//		List<MCenter> centerList = centerMapper.mappingToEntityList(userEditDto.data.centerList);
//		MClientDtoMapper clientMapper = new MClientDtoMapper();
//		List<MClient> clientList = clientMapper.mappingToEntityList(userEditDto.data.clientList);
//
//		final long userId = user.getUserId();
//
//		// チェックしたセンタIDのリストを作成
//		List<Long> centerIdList = new ArrayList<Long>();
//		for (MCenter center : centerList) {
//
//			if (CU.nullToStr(center.getCenterCheckBox()).equals("1")) {
//				// チェックボックスの選んだ場合
//
//				centerIdList.add(center.getCenterId());
//			}
//		}
//
//		// チェックした荷主IDのリストを作成
//		List<Long> clientIdList = new ArrayList<Long>();
//		for (MClient client : clientList) {
//
//			if (CU.nullToStr(client.getClientCheckBox()).equals("1")) {
//				// チェックボックスの選んだ場合
//
//				clientIdList.add(client.getClientId());
//			}
//		}
//
//		//[Ver2.2][#2517] Ver2.2以前対応のため登録処理復活 2017.10.05 miyabe Start
//		// ユーザログインマスタ登録
//		userLoginRegisterLogic.insert(centerIdList, userId, getUserCd());
//		//[Ver2.2][#2517] Ver2.2以前対応のため登録処理復活 2017.10.05 miyabe End
//
//		// ユーザセンタマスタ登録
//		for (long centerId : centerIdList) {
//			MUserCenter userCenter = new MUserCenter();
//			userCenter.setUserId(userId);
//			userCenter.setCenterId(centerId);
//			userEditInsertLogic.insertMUserCenter(userCenter, errRetSts(StatusCode.USERCENTER_DELETE_FAILED));
//			if (0 < getErrorManager().size()) {
//				return null;
//			}
//		}
//
//		// ユーザ荷主マスタ登録
//		for (long clientId : clientIdList) {
//			MUserClient userClient = new MUserClient();
//			userClient.setUserId(userId);
//			userClient.setClientId(clientId);
//			userEditInsertLogic.insertMuserClient(userClient, errRetSts(StatusCode.USERCENTER_DELETE_FAILED));
//			if (0 < getErrorManager().size()) {
//				return null;
//			}
//		}
//
//		return null;
//	}
//
//	// [C-CWMS-0057][#10] コピー機能追加(コピー不足を修正) 2016.10.27 kawana End
	// [#3142][Ver3.0] ユーザマスタメンテ画面の分割対応 コピー機能削除 2017.12.05 honma Delete End
}
