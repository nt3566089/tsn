package com.oneslogi.wms.logic.common;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.BaseConst.StatusCode;
import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserCenterCB;
import com.oneslogi.base.dbflute.cbean.MUserClientCB;
import com.oneslogi.base.dbflute.cbean.MUserLoginCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MUserClientBhv;
import com.oneslogi.base.dbflute.exbhv.MUserLoginBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MUserCenter;
import com.oneslogi.base.dbflute.exentity.MUserClient;
import com.oneslogi.base.dbflute.exentity.MUserLogin;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.common.ClientCenterDto;
import com.oneslogi.wms.dto.common.SelectClientDto;
import com.oneslogi.wms.dto.common.UserClientDto;

/**
 * 荷主取得共通ロジッククラス
 */
public class SelectClientLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MClientCenterBhv clientCenterBhv;

	@Inject
	private MCenterBhv centerBhv;

	@Inject
	private MUserLoginBhv userLoginBhv;

	@Inject
	private MUserClientBhv userClientBhv;

	@Inject
	private MClientBhv clientBhv;

	@Inject
	private MUserCenterBhv userCenterBhv;

	// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動 2017.05.23 kawana Start

	// ===== 使用ロジック =====

	@Inject
	private UserCenterLogic userCenterLogic;

	// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動 2017.05.23 kawana End

	// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start

	/**
	 * 致命的エラー追加有無
	 */
	public enum AddFatalError {
		TRUE,
		FALSE
	}

	// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End

	/**
	 * <h2>荷主を選択する。</h2>
	 * <pre>
	 * 荷主を選択する。
	 * </pre>
	 */
	public SelectClientLogic() {
	}

	/**
	 * <h2>ログインマスタからデフォルトの荷主を取得する。</h2>
	 * <pre>
	 * ユーザーログインマスタから、デフォルト表示する荷主およびセンタの情報を取得する。
	 * </pre>
	 * @return String デフォルトの荷主CD
	 */
	public String getLoginClientCd() {
		//ユーザーログインマスタから、デフォルト表示する荷主およびセンタの情報を取得
		MUserLoginCB loginCB = userLoginBhv.newMyConditionBean();
		loginCB.setupSelect_MClient();
		loginCB.query().setUserId_Equal(getUserId());
		loginCB.query().setDelFlg_Equal_$0();
		loginCB.query().queryMClient().setDelFlg_Equal_$0();
		MUserLogin loginEntity = userLoginBhv.selectEntity(loginCB);
		if (loginEntity == null) {
			return null;
		}
		String defClientCd = loginEntity.getMClient().getClientCd();
		return defClientCd;
	}

	/**
	 * <h2>WMSユーザー荷主を取得する。</h2>
	 * <pre>
	 * ユーザー荷主のデータを取得する。
	 * </pre>
	 * @return UserClientDto ユーザー荷主DTOオブジェクト
	 */
	public UserClientDto getWmsUserClientDto() {
		MUserClientCB clientCB = userClientBhv.newMyConditionBean();
		clientCB.setupSelect_MClient();
		clientCB.query().setUserId_Equal(getUserId());
		clientCB.query().setDelFlg_Equal_$0();
		clientCB.query().queryMClient().setDelFlg_Equal_$0();
		ListResultBean<MUserClient> listClientEntity = userClientBhv.selectList(clientCB);
		UserClientDto userDto = new UserClientDto();
		for (MUserClient tmpClient : listClientEntity) {
			UserClientDto.DropDownListData data = new UserClientDto.DropDownListData();
			data.clientCd = tmpClient.getMClient().getClientCd();
			data.clientNm = tmpClient.getMClient().getClientNm();
			userDto.data.add(data);
		}
		return userDto;
	}

	/**
	 * <h2>荷主・センタを取得する。</h2>
	 * <pre>
	 * センタマスタ・ユーザーセンタからデータを取得する。
	 * </pre>
	 * @return ClientCenterDto 荷主・センタDTOオブジェクト
	 */
	public ClientCenterDto getClientCenterDto() {

		ClientCenterDto centerDto = new ClientCenterDto();

		// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start

		// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動 2017.05.23 kawana Start
		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
		List<MCenter> centerList = userCenterLogic.getCenterList(UserCenterLogic.SelectCls.NO_DELETE_ONLY);
		// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End
		// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動 2017.05.23 kawana End

		for (MCenter center : centerList) {
			ClientCenterDto.DropDownListData data = new ClientCenterDto.DropDownListData();
			data.centerCd = center.getCenterCd();
			data.centerNm = center.getCenterNm();
			centerDto.listdata.add(data);
		}

		// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End

		return centerDto;
	}

	// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
	// [#1815] ログインユーザが扱えるセンタリストの検索をユーザセンタロジックに移動(ここから削除) 2017.05.23 kawana
	// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End

	/**
	 * <h2>センタに紐づいている荷主リストを取得する。</h2>
	 * <pre>
	 * センタに紐づいている荷主リストを取得する。
	 * 荷主リストが1件の場合は選択状態にする。
	 * </pre>
	 * @param dto 選択された荷主オブジェクト
	 * @return SelectClientDto 選択された荷主オブジェクト
	 */
	public SelectClientDto getClientCenterData(SelectClientDto dto) {

		SelectClientDto retDto = dto;

		// [ON推-品向-932] 荷主選択画面の荷主の選択肢がPCとHTで違う問題を修正(処理を共通化) 2015.08.28 kawana Start

		// センタに紐づいている荷主リストを取得
		List<MClient> clientList = selectClientList(dto.getSelCenterCd());

		if (clientList == null) {
			return null;
		}

		UserClientDto clientDto = new UserClientDto();

		// ドロップダウンリストの作成
		for (MClient client : clientList) {

			UserClientDto.DropDownListData data = new UserClientDto.DropDownListData();
			data.clientCd = client.getClientCd();
			data.clientNm = client.getClientNm();

			clientDto.data.add(data);
		}

		// 結果をDTOオブジェクトに格納
		retDto.setUserClientDto(clientDto);

		// 荷主リストが1件の場合は選択状態にする
		if (clientDto.data.size() == 1) {
			retDto.setSelClientCd(clientDto.data.get(0).clientCd);
			retDto.setSelClientNm(clientDto.data.get(0).clientNm);
		}

		// [ON推-品向-932] 荷主選択画面の荷主の選択肢がPCとHTで違う問題を修正(処理を共通化) 2015.08.28 kawana End

		return retDto;

	}

	// [ON推-品向-932] 荷主選択画面の荷主の選択肢がPCとHTで違う問題を修正(処理を共通化) 2015.08.28 kawana Start
	/**
	 * <h2>荷主マスタリストを取得する。</h2>
	 * <pre>
	 * 引数のセンタに登録されている荷主マスタのリストを取得する。
	 * </pre>
	 * @param centerCd センタCD
	 * @return List<MClient> 荷主マスタリスト
	 */
	public List<MClient> selectClientList(String centerCd) {
		return selectClientList(null, centerCd);
	}

	/**
	 * <h2>荷主マスタリストを取得する。</h2>
	 * <pre>
	 * 引数のユーザID、センタCDに登録されている荷主マスタのリストを取得する。
	 * ユーザの権限が付与されていない荷主は除外。
	 * </pre>
	 * @param userId ユーザーID
	 * @param centerCd センタCD
	 * @return List<MClient> 荷主マスタリスト
	 */
	public List<MClient> selectClientList(Long userId, String centerCd) {

		List<MClient> clientList = new ArrayList<MClient>();

		//センタIDの取得
		MCenterCB mCenterCB = centerBhv.newMyConditionBean();
		mCenterCB.checkInvalidQuery();
		mCenterCB.query().setCenterCd_Equal(centerCd);
		mCenterCB.query().setDelFlg_Equal_$0();
		MCenter entity = centerBhv.selectEntity(mCenterCB);

		if (entity == null) {
			return null;
		}

		//荷主センタマスタから、センタCDに紐づく荷主を取得
		MClientCenterCB clientCenterCB = clientCenterBhv.newMyConditionBean();
		clientCenterCB.setupSelect_MClient();
		clientCenterCB.query().setCenterId_Equal(entity.getCenterId());
		clientCenterCB.query().setDelFlg_Equal_$0();
		clientCenterCB.query().queryMClient().setDelFlg_Equal_$0();
		// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
		clientCenterCB.query().queryMClient().addOrderBy_ClientCd_Asc();
		// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
		ListResultBean<MClientCenter> listClientCenterEntity = clientCenterBhv.selectList(clientCenterCB);
		if (listClientCenterEntity.size() >= 1) {

			// ユーザIDが指定されていない場合はログインユーザを設定
			Long cbUserId = userId;
			if (cbUserId == null) {
				// 指定されていないためログインユーザのユーザIDを設定
				userId = getUserId();
			}

			//ユーザークライアントマスタからデータを取得する
			MUserClientCB userClientCB = userClientBhv.newConditionBean();
			userClientCB.query().setUserId_Equal(userId);
			userClientCB.query().setDelFlg_Equal_$0();
			userClientCB.query().queryMClient().setDelFlg_Equal_$0();
			userClientCB.setupSelect_MClient();
			// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
			userClientCB.query().queryMClient().addOrderBy_ClientCd_Asc();
			// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
			ListResultBean<MUserClient> listUserClientEntity = userClientBhv.selectList(userClientCB);
			if (listUserClientEntity.size() >= 1) {
				for (MClientCenter tmpClient : listClientCenterEntity) {
					for (MUserClient tmpUserClient : listUserClientEntity) {
						// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
						if (CU.isNotNullAndEquals(tmpClient.getClientId(), tmpUserClient.getClientId())) {
							// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

							// 荷主マスタリストに追加
							clientList.add(tmpClient.getMClient());
						}
					}
				}
			} else {
				//クライアントマスタからデータを取得
				MClientCB clientCB = clientBhv.newMyConditionBean();
				clientCB.query().setDelFlg_Equal_$0();
				// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana Start
				clientCB.query().addOrderBy_ClientCd_Asc();
				// [#594] トータル在庫問合せ画面 - ユーザに紐づくセンタ・荷主で絞込みを修正 2017.01.18 kawana End
				ListResultBean<MClient> listClientEntity = clientBhv.selectList(clientCB);
				for (MClientCenter tmpClient : listClientCenterEntity) {
					for (MClient tmpMClient : listClientEntity) {
						// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana Start
						if (CU.isNotNullAndEquals(tmpClient.getClientId(), tmpMClient.getClientId())) {
							// [ON推-品向-931] ラッパークラスの比較不正を修正 2015.08.20 kawana End

							// 荷主マスタリストに追加
							clientList.add(tmpClient.getMClient());
						}
					}
				}
			}
		}

		return clientList;
	}

	// [ON推-品向-932] 荷主選択画面の荷主の選択肢がPCとHTで違う問題を修正(処理を共通化) 2015.08.28 kawana End

	/**
	 * <h2>荷主マスタを取得する。</h2>
	 * <pre>
	 * 引数をキーに荷主マスタからデータを取得する。
	 * </pre>
	 * @param dto 選択された荷主DTOオブジェクト
	 * @return MClient 荷主マスタ
	 */
	public MClient getSelectClientId(SelectClientDto dto) {
		MClientCB clientCB = clientBhv.newMyConditionBean();
		clientCB.query().setClientCd_Equal(dto.getSelClientCd());
		MClient clientEntity = clientBhv.selectEntity(clientCB);
		return clientEntity;
	}

	/**
	 * <h2>センタマスタを取得する。</h2>
	 * <pre>
	 * 引数をキーにセンタマスタからデータを取得する。
	 * </pre>
	 * @param dto 選択された荷主DTOオブジェクト
	 * @return MCenter センタマスタ
	 */
	public MCenter getSelectCenterId(SelectClientDto dto) {
		MCenterCB centerCB = centerBhv.newMyConditionBean();
		centerCB.query().setCenterCd_Equal(dto.getSelCenterCd());
		MCenter centerEntity = centerBhv.selectEntity(centerCB);
		return centerEntity;
	}

	/**
	 * <h2>ユーザーログインマスタのデータを設定する。</h2>
	 * <pre>
	 * ユーザーログインマスタのデータをセットする。
	 * ユーザーIDが存在しない場合、新規作成し、それ以外の場合、更新する。
	 * </pre>
	 * @param centerID センタID
	 * @param clientID 荷主ID
	 */
	public void setUserLoginData(Long centerID, Long clientID) {
		//ユーザーログインマスタ更新
		MUserLogin loginEntity = userLoginBhv.selectByPKValue(getUserId());
		if (loginEntity == null) {
			//新規作成
			loginEntity = new MUserLogin();
			loginEntity.setAddDt(new Timestamp(new Date().getTime()));
			loginEntity.setAddProcess(this.getClass().getCanonicalName());
			loginEntity.setAddUser(getUserCd());
			loginEntity.setCenterId(centerID);
			if (clientID != null) {
				loginEntity.setClientId(clientID);
			} else {
				loginEntity.setClientId(null);
			}
			loginEntity.setDelFlg_$0();
			loginEntity.setUserId(getUserId());
			userLoginBhv.insert(loginEntity);
		} else {
			//更新
			if (clientID != null) {
				loginEntity.setClientId(clientID);
			} else {
				loginEntity.setClientId(null);
			}
			loginEntity.setCenterId(centerID);
			loginEntity.setUpdDt(new Timestamp(new Date().getTime()));
			loginEntity.setUpdProcess(this.getClass().getCanonicalName());
			loginEntity.setUpdUser(getUserCd());
			userLoginBhv.update(loginEntity);
		}
	}

	/**
	 * <h2>ユーザーログインマスタのデータを設定する。</h2>
	 * <pre>
	 * ユーザーログインマスタのデータをセットする。
	 * ユーザーIDが存在しない場合、新規作成し、それ以外の場合、更新する。
	 * </pre>
	 * @param centerID センタID
	 * @param clientID 荷主ID
	 * @param userID ユーザID
	 */
	public void setUserLoginData(Long centerID, Long clientID, Long userID) {
		//ユーザーログインマスタ更新
		MUserLogin loginEntity = userLoginBhv.selectByPKValue(userID);
		if (loginEntity == null) {
			//新規作成
			loginEntity = new MUserLogin();
			loginEntity.setAddDt(new Timestamp(new Date().getTime()));
			loginEntity.setAddProcess(this.getClass().getCanonicalName());
			loginEntity.setAddUser(getUserCd());
			loginEntity.setCenterId(centerID);
			if (clientID != null) {
				loginEntity.setClientId(clientID);
			} else {
				loginEntity.setClientId(null);
			}
			loginEntity.setDelFlg_$0();
			loginEntity.setUserId(getUserId());
			userLoginBhv.insert(loginEntity);
		} else {
			//更新
			if (clientID != null) {
				loginEntity.setClientId(clientID);
			} else {
				loginEntity.setClientId(null);
			}
			loginEntity.setCenterId(centerID);
			loginEntity.setUpdDt(new Timestamp(new Date().getTime()));
			loginEntity.setUpdProcess(this.getClass().getCanonicalName());
			loginEntity.setUpdUser(getUserCd());
			userLoginBhv.update(loginEntity);
		}
	}

	/**
	 * <h2>センタ、荷主の組み合わせの妥当性チェックを行う。</h2>
	 * <pre>
	 * ログインユーザとセンタ、荷主の組み合わせのチェックを行う。
	 * ・選択されたセンタが選択条件に合致するかチェック
	 * ・設定された荷主が選択条件に合致するかチェック
	 * ・荷主センタマスタを存在チェック
	 * エラーの場合、エラー情報として管理する。
	 * </pre>
	 * @param dto 選択された荷主オブジェクト
	 * @param addFatalError エラー時の致命的エラー追加有無
	 * @return boolean true：該当するデータが存在する、false：該当するデータが存在しない
	 */
	public boolean checkCenterClientData(SelectClientDto dto, AddFatalError addFatalError) {
		String selCenterCd = dto.getSelCenterCd();
		String selClientCd = dto.getSelClientCd();

		//選択されたセンタが選択条件に合致するかチェック
		MUserCenterCB centerCB = userCenterBhv.newMyConditionBean();
		centerCB.query().setUserId_Equal(getUserId());
		centerCB.query().setDelFlg_Equal_$0();
		centerCB.query().queryMCenter().setDelFlg_Equal_$0();
		centerCB.setupSelect_MCenter();
		ListResultBean<MUserCenter> listCenterEntity = userCenterBhv.selectList(centerCB);
		boolean setCenterExist = false;
		if (listCenterEntity.size() < 1) {
			//センタマスタからデータ取得
			MCenterCB mCenterCB = centerBhv.newMyConditionBean();
			mCenterCB.query().setDelFlg_Equal_$0();
			mCenterCB.query().setCenterCd_Equal(selCenterCd);
			int centerCnt = centerBhv.selectCount(mCenterCB);
			if (centerCnt > 0) {
				setCenterExist = true;
			}
		} else {
			for (MUserCenter tmpCenter : listCenterEntity) {
				if (tmpCenter.getMCenter().getCenterCd().equals(selCenterCd)) {
					setCenterExist = true;
				}
			}
		}
		if (!setCenterExist) {
			//該当するデータが存在しないため、エラー

			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
			if (addFatalError == AddFatalError.TRUE) {
				getErrorManager().add(new ErrorStatus(StatusCode.FATAL_ERROR), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			}
			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End
			return false;
		}

		//設定された荷主が選択条件に合致するかチェック
		MUserClientCB clientCB = userClientBhv.newMyConditionBean();
		clientCB.query().setUserId_Equal(getUserId());
		clientCB.query().setDelFlg_Equal_$0();
		clientCB.query().queryMClient().setDelFlg_Equal_$0();
		clientCB.setupSelect_MClient();
		ListResultBean<MUserClient> listClientEntity = userClientBhv.selectList(clientCB);
		boolean setClientExist = false;
		if (listClientEntity.size() < 1) {
			//荷主マスタからデータ取得
			MClientCB mClientCB = clientBhv.newMyConditionBean();
			mClientCB.query().setDelFlg_Equal_$0();
			mClientCB.query().setClientCd_Equal(selClientCd);
			int clientCnt = clientBhv.selectCount(mClientCB);
			if (clientCnt > 0) {
				setClientExist = true;
			}
		} else {
			for (MUserClient tmpClient : listClientEntity) {
				if (tmpClient.getMClient().getClientCd().equals(selClientCd)) {
					setClientExist = true;
				}
			}
		}
		if (!setClientExist) {
			//該当するデータが存在しないため、エラー

			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
			if (addFatalError == AddFatalError.TRUE) {
				getErrorManager().add(new ErrorStatus(StatusCode.FATAL_ERROR), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			}
			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End
			return false;
		}

		//荷主センタマスタチェック
		MClientCenterCB clientCenterCB = clientCenterBhv.newMyConditionBean();
		clientCenterCB.query().queryMClient().setClientCd_Equal(selClientCd);
		clientCenterCB.query().queryMClient().setDelFlg_Equal_$0();
		clientCenterCB.query().queryMCenter().setCenterCd_Equal(selCenterCd);
		clientCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
		clientCenterCB.query().setDelFlg_Equal_$0();
		int clientCenterCnt = clientCenterBhv.readCount(clientCenterCB);
		if (clientCenterCnt < 1) {
			//該当するデータが存在しないため、エラー

			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
			if (addFatalError == AddFatalError.TRUE) {
				getErrorManager().add(new ErrorStatus(StatusCode.FATAL_ERROR), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			}
			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End
			return false;
		}
		return true;

	}

	//[Ver2.3][#2517] ユーザログインマスタチェック処理のため引数にユーザID追加 2017.10.05 miyabe Start
	/**
	 * <h2>センタ、荷主の組み合わせの妥当性チェックを行う。</h2>
	 * <pre>
	 * ログインユーザとセンタ、荷主の組み合わせのチェックを行う。
	 * ・選択されたセンタが選択条件に合致するかチェック
	 * ・設定された荷主が選択条件に合致するかチェック
	 * ・荷主センタマスタを存在チェック
	 * エラーの場合、エラー情報として管理する。
	 * </pre>
	 * @param dto 選択された荷主オブジェクト
	 * @param addFatalError エラー時の致命的エラー追加有無
	 * @param userId ユーザID
	 * @return boolean true：該当するデータが存在する、false：該当するデータが存在しない
	 */
	public boolean checkCenterClientData(SelectClientDto dto, AddFatalError addFatalError, Long userId) {
		String selCenterCd = dto.getSelCenterCd();
		String selClientCd = dto.getSelClientCd();

		//選択されたセンタが選択条件に合致するかチェック
		MUserCenterCB centerCB = userCenterBhv.newMyConditionBean();
		centerCB.query().setUserId_Equal(userId);
		centerCB.query().setDelFlg_Equal_$0();
		centerCB.query().queryMCenter().setDelFlg_Equal_$0();
		centerCB.setupSelect_MCenter();
		ListResultBean<MUserCenter> listCenterEntity = userCenterBhv.selectList(centerCB);
		boolean setCenterExist = false;
		if (listCenterEntity.size() < 1) {
			//センタマスタからデータ取得
			MCenterCB mCenterCB = centerBhv.newMyConditionBean();
			mCenterCB.query().setDelFlg_Equal_$0();
			mCenterCB.query().setCenterCd_Equal(selCenterCd);
			int centerCnt = centerBhv.selectCount(mCenterCB);
			if (centerCnt > 0) {
				setCenterExist = true;
			}
		} else {
			for (MUserCenter tmpCenter : listCenterEntity) {
				if (tmpCenter.getMCenter().getCenterCd().equals(selCenterCd)) {
					setCenterExist = true;
				}
			}
		}
		if (!setCenterExist) {
			//該当するデータが存在しないため、エラー

			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
			if (addFatalError == AddFatalError.TRUE) {
				getErrorManager().add(new ErrorStatus(StatusCode.FATAL_ERROR), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			}
			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End
			return false;
		}

		//設定された荷主が選択条件に合致するかチェック
		MUserClientCB clientCB = userClientBhv.newMyConditionBean();
		clientCB.query().setUserId_Equal(userId);
		clientCB.query().setDelFlg_Equal_$0();
		clientCB.query().queryMClient().setDelFlg_Equal_$0();
		clientCB.setupSelect_MClient();
		ListResultBean<MUserClient> listClientEntity = userClientBhv.selectList(clientCB);
		boolean setClientExist = false;
		if (listClientEntity.size() < 1) {
			//荷主マスタからデータ取得
			MClientCB mClientCB = clientBhv.newMyConditionBean();
			mClientCB.query().setDelFlg_Equal_$0();
			mClientCB.query().setClientCd_Equal(selClientCd);
			int clientCnt = clientBhv.selectCount(mClientCB);
			if (clientCnt > 0) {
				setClientExist = true;
			}
		} else {
			for (MUserClient tmpClient : listClientEntity) {
				if (tmpClient.getMClient().getClientCd().equals(selClientCd)) {
					setClientExist = true;
				}
			}
		}
		if (!setClientExist) {
			//該当するデータが存在しないため、エラー

			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
			if (addFatalError == AddFatalError.TRUE) {
				getErrorManager().add(new ErrorStatus(StatusCode.FATAL_ERROR), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			}
			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End
			return false;
		}

		//荷主センタマスタチェック
		MClientCenterCB clientCenterCB = clientCenterBhv.newMyConditionBean();
		clientCenterCB.query().queryMClient().setClientCd_Equal(selClientCd);
		clientCenterCB.query().queryMClient().setDelFlg_Equal_$0();
		clientCenterCB.query().queryMCenter().setCenterCd_Equal(selCenterCd);
		clientCenterCB.query().queryMCenter().setDelFlg_Equal_$0();
		clientCenterCB.query().setDelFlg_Equal_$0();
		int clientCenterCnt = clientCenterBhv.readCount(clientCenterCB);
		if (clientCenterCnt < 1) {
			//該当するデータが存在しないため、エラー

			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana Start
			if (addFatalError == AddFatalError.TRUE) {
				getErrorManager().add(new ErrorStatus(StatusCode.FATAL_ERROR), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			}
			// [#272] ログインした時にセンタ・荷主の権限がなかった場合は1件目でログイン 2016.12.20 kawana End
			return false;
		}
		return true;

	}
	//[Ver2.3][#2517] ユーザログインマスタチェック処理のため引数にユーザID追加 2017.10.05 miyabe End

}
