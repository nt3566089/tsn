package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゾーンマスタデータの登録ロジッククラス
 */
public class ZoneMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * <h2>ゾーンマスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをゾーンマスタに登録する。
	 * </pre>
	 * @param mZone ゾーンマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MZone mZone, ErrorStatus errSts) {
		// ===== ゾーンマスタ登録実行 =====
		mZoneBhv.insert(mZone);
	}

	/**
	 * <h2>バッチでゾーンマスタリストデータの一括登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータをゾーンマスタリストに一括登録する。
	 * </pre>
	 * @param mZoneList ゾーンマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MZone> mZoneList, ErrorStatus errSts) {
		// ===== ゾーンマスタ登録実行 =====
		mZoneBhv.batchInsert(mZoneList);
	}

}