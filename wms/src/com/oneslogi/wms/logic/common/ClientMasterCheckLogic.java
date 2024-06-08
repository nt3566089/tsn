package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主マスタチェック共通ロジッククラス
 */
public class ClientMasterCheckLogic extends AbstractWmsLogic{
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
		 * 荷主CDで重複エラー
		 */
		protected static final int CLIENT_CODE_DUPLICATE = 2;
		// [Ver3.0] unit of measure対応 2017.11.27 NING Start
		/**
		 * 在庫管理単位未選択エラー
		 */
		protected static final int CLIENT_DEFAULT_SHAPE_GRP_ID_NOT_INPUT_ERROR = 3;
		/**
		 * 選択中の荷姿グループ既に削除エラー
		 */
		protected static final int SHAPE_GROUP_ALREADY_DELETED_CANNOT_SELECT = 4;
		// [Ver3.0] unit of measure対応 2017.11.27 NING End
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientLogic clientLogic;

	/**
	 * <h2>荷主マスタチェック処理を行う。</h2>
	 * <pre>
	 * 荷主CD重複チェックを行う。
	 * 既に存在するとき、ステータスコードに荷主CDで重複エラーを設定する。
	 * </pre>
	 * @param mClientList 荷主マスタリスト：荷主CD・荷主ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void checkClientMaster(List<MClient> mClientList, ErrorStatus errSts) {
		int rowIndex = -1;

		// チェック処理
		for (MClient mClient : mClientList) {
			rowIndex++;

			// 荷主CD重複チェック
			if (mClient.getClientId()== null) {
				// 登録の場合
				clientLogic.checkClientCdInsert(mClient, errRetSts(errSts, StatusCode.CLIENT_CODE_DUPLICATE, rowIndex));
			} else {
				// 修正の場合
				clientLogic.checkClientCdUpdate(mClient, errRetSts(errSts, StatusCode.CLIENT_CODE_DUPLICATE, rowIndex));

				// [Ver3.0][#3928] 削除から未削除へ変更する際にチェック処理が行われるように修正 2018.03.07 shimizu Start
				if(mClient.isDelFlg$0()) {
					// [Ver3.0] unit of measure対応 2017.11.27 NING Start
					// 在庫管理単位は未選択場合
					if (mClient.getMShapeGrp() == null || mClient.getMShapeGrp().getShapeGrpCd() == null) {
						// 荷主の荷姿グループが登録済の場合、在庫管理単位は未選択であるかをチェックする。
						clientLogic.checkClientShapeGrpIdNoInput(mClient, errRetSts(errSts, StatusCode.CLIENT_DEFAULT_SHAPE_GRP_ID_NOT_INPUT_ERROR, rowIndex));
					}
					// 在庫管理単位は選択する場合
					if (mClient.getMShapeGrp() != null && mClient.getMShapeGrp().getShapeGrpCd() != null) {
						// 荷姿グループが選択された場合、選択の荷姿グループが存在するかどうかをチェックする。
						clientLogic.checkClientShapeGrpAlreadyDel(mClient, errRetSts(errSts, StatusCode.SHAPE_GROUP_ALREADY_DELETED_CANNOT_SELECT, rowIndex));
					}
					// [Ver3.0] unit of measure対応 2017.11.27 NING End
				}
				// [Ver3.0][#3928] 削除から未削除へ変更する際にチェック処理が行われるように修正 2018.03.07 shimizu End
			}
		}
	}
}
