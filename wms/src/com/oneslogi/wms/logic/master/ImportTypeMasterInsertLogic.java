package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MImportTypeBBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBCopyBBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBCopyHBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBhv;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.MImportTypeB;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyB;
import com.oneslogi.base.dbflute.exentity.MImportTypeBCopyH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;

/**
 * 取込種別マスタメンテナンス登録ロジッククラス
 */
public class ImportTypeMasterInsertLogic extends AbstractLogic {

	// ===== 使用テーブル =====
	@Inject
	private MImportTypeBhv mImportTypeBhv;
	@Inject
	private MImportTypeBBhv mImportTypeBBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	@Inject
	private MImportTypeBCopyHBhv mImportTypeBCopyHBhv;
	@Inject
	private MImportTypeBCopyBBhv mImportTypeBCopyBBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

	/**
	 * <h2>取込種別マスタを登録する。</h2>
	 * <pre>
	 *
	 * 取込種別マスタと取込種別ボディマスタのデータを登録する。
	 * EC受注ヘッダコピーマスタとEC受注ボディコピーマスタを登録する。
	 * </pre>
	 * @param importType 取込種別マスタ：全項目
	 * @param importTypeBodyList 取込種別ボディマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MImportType importType, List<MImportTypeB> importTypeBodyList, ErrorStatus errSts) {

		// ===== 取込種別マスタ登録実行 =====
		mImportTypeBhv.insert(importType);

		if (importTypeBodyList == null || importTypeBodyList.size() == 0) {
			return;
		}

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		List<MImportTypeBCopyH> insertCopyHList = new ArrayList<MImportTypeBCopyH>();
		List<MImportTypeBCopyB> insertCopyBList = new ArrayList<MImportTypeBCopyB>();

		for (MImportTypeB body : importTypeBodyList) {

			// 取込種別マスタIDを設定
			body.setImportTypeId(importType.getImportTypeId());

			// ===== 取込種別ボディマスタ登録実行 =====
			mImportTypeBBhv.insert(body);

			// EC受注ヘッダコピーマスタリストへ追加
			for (MImportTypeBCopyH h : body.getMImportTypeBCopyHList()) {
				h.setImportTypeBId(body.getImportTypeBId());
				insertCopyHList.add(h);
			}

			// EC受注ボディコピーマスタリストへ追加
			for (MImportTypeBCopyB b : body.getMImportTypeBCopyBList()) {
				b.setImportTypeBId(body.getImportTypeBId());
				insertCopyBList.add(b);
			}
		}

		if (0 < insertCopyHList.size()) {
			// ===== EC受注ヘッダコピーマスタの登録実行 =====
			mImportTypeBCopyHBhv.batchInsert(insertCopyHList);
		}

		if (0 < insertCopyBList.size()) {
			// ===== EC受注ボディコピーマスタの登録実行 =====
			mImportTypeBCopyBBhv.batchInsert(insertCopyBList);
		}
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End
	}
}
