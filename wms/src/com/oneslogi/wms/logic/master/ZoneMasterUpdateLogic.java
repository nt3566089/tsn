package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MZoneBhv;
import com.oneslogi.base.dbflute.exentity.MZone;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * ゾーンマスタデータの更新ロジッククラス
 */
public class ZoneMasterUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MZoneBhv mZoneBhv;

	/**
	 * <h2>ゾーンマスタデータの更新処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータでゾーンマスタに更新する。
	 * </pre>
	 * @param mZone ゾーンマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MZone mZone, ErrorStatus errSts) {
		// ===== ゾーンマスタ更新実行 =====
		mZoneBhv.update(mZone);
	}

	/**
	 * <h2>バッチでゾーンマスタリストデータの一括更新処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータでゾーンマスタに一括更新する。
	 * </pre>
	 * @param mZoneList ゾーンマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchUpdate(List<MZone> mZoneList, ErrorStatus errSts) {
		// ===== ゾーンマスタ更新実行 =====
		mZoneBhv.batchUpdate(mZoneList);
	}



}
