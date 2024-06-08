package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主マスタメンテナンス登録ロジッククラス
 */
public class ClientMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientBhv mClientBhv;

	/**
	 * <h2>荷主マスタを登録する。</h2>
	 * <pre>
	 * 荷主マスタのデータを登録する。
	 * </pre>
	 * @param mClient 荷主マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MClient mClient, ErrorStatus errSts) {
		// ===== 荷主マスタ登録実行 =====
		mClientBhv.insert(mClient);
	}

	/**
	 * <h2>荷主マスタを一括登録する。</h2>
	 * <pre>
	 * 荷主マスタのデータを一括登録する。
	 * </pre>
	 * @param mClientList 荷主マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MClient> mClientList, ErrorStatus errSts) {
		// ===== 荷主マスタ登録実行 =====
		mClientBhv.batchInsert(mClientList);
	}

	/**
	 * <h2>荷主マスタを一括登録・更新する。</h2>
	 * <pre>
	 * 荷主マスタを一括登録・更新する。
	 * 受け取った荷主IDがある場合、データを更新する。
	 * 受け取った荷主IDがない場合、データを登録する。
	 * </pre>
	 * @param mClientList 荷主マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void editClient(List<MClient> mClientList, ErrorStatus errSts){
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start
		List<MClient> insertClient = new ArrayList<>();
		List<MClient> updateClient = new ArrayList<>();
		for (MClient mClient : mClientList) {
			if (mClient.getClientId() == null) {
				insertClient.add(mClient);
			} else {
				updateClient.add(mClient);
			}
		}

		if (!insertClient.isEmpty()){
			// 登録
			mClientBhv.batchInsert(insertClient);
		}

		if (!updateClient.isEmpty()){
			// 修正
			mClientBhv.batchUpdate(updateClient);
		}
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW End
	}
}