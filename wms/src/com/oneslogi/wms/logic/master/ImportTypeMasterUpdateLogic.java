package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyBCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyHCB;
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
 * 取込種別マスタメンテナンス更新ロジッククラス
 */
public class ImportTypeMasterUpdateLogic extends AbstractLogic {

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

	/**
	 * <h2>取込種別マスタを更新する。</h2>
	 * <pre>
	 *
	 * 取込種別マスタのデータを更新する。
	 * EC受注ヘッダコピーマスタ、 EC受注ボディコピーマスタを削除して、
	 * 取込種別ボディマスタのデータを削除・追加・更新する。
	 * EC受注ヘッダコピーマスタとEC受注ボディコピーマスタを登録する。
	 * </pre>
	 * @param importType 取込種別マスタ：取込種別マスタID
	 * @param updateBodyList 更新する取込種別ボディマスタリスト：全項目
	 * @param insertBodyList 追加登録する取込種別ボディマスタリスト：全項目
	 * @param deleteBodyList 削除する取込種別ボディマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MImportType importType, List<MImportTypeB> updateBodyList, List<MImportTypeB> insertBodyList, List<MImportTypeB> deleteBodyList, ErrorStatus errSts) {

		// ===== 取込種別マスタ更新実行 =====
		mImportTypeBhv.update(importType);

		// EC受注ヘッダコピーマスタ、 EC受注ボディコピーマスタ削除
		deleteCopyColumn(updateBodyList, deleteBodyList);

		List<MImportTypeBCopyH> insertCopyHList = new ArrayList<MImportTypeBCopyH>();
		List<MImportTypeBCopyB> insertCopyBList = new ArrayList<MImportTypeBCopyB>();

		if (deleteBodyList != null && deleteBodyList.size() > 0) {
			// ===== 取込種別ボディマスタ削除実行 =====
			mImportTypeBBhv.batchDelete(deleteBodyList);
		}

		if (insertBodyList != null && insertBodyList.size() > 0) {

			for (MImportTypeB body : insertBodyList) {

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
		}

		if (updateBodyList != null && updateBodyList.size() > 0) {

			// ===== 取込種別ボディマスタ更新実行 =====
			mImportTypeBBhv.batchUpdate(updateBodyList);

			for (MImportTypeB body : updateBodyList) {
				// EC受注ヘッダコピーマスタリストへ追加
				insertCopyHList.addAll(body.getMImportTypeBCopyHList());
				// EC受注ボディコピーマスタリストへ追加
				insertCopyBList.addAll(body.getMImportTypeBCopyBList());
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
	}

	private void deleteCopyColumn(List<MImportTypeB> updateBodyList, List<MImportTypeB> deleteBodyList) {

		List<Long> deleteImportTypeBIdList = new ArrayList<Long>();

		for (MImportTypeB imtb : updateBodyList) {
			deleteImportTypeBIdList.add(imtb.getImportTypeBId());
		}

		for (MImportTypeB imtb : deleteBodyList) {
			deleteImportTypeBIdList.add(imtb.getImportTypeBId());
		}

		// [#6801][OSS] 致命的エラー発生 2019.11.07 kawana Start
		if (deleteImportTypeBIdList.isEmpty()) {
			return;
		}
		// [#6801][OSS] 致命的エラー発生 2019.11.07 kawana End

		// 削除フラグの条件付加を停止する
		this.setBehaviorAutoDelFlg(false);

		// EC受注ヘッダコピー削除
		MImportTypeBCopyHCB delCopyHCb = mImportTypeBCopyHBhv.newMyConditionBean();
		delCopyHCb.checkInvalidQuery();
		delCopyHCb.query().setImportTypeBId_InScope(deleteImportTypeBIdList);
		mImportTypeBCopyHBhv.queryDelete(delCopyHCb);

		// EC受注ボディコピー削除
		MImportTypeBCopyBCB delCopyBCb = mImportTypeBCopyBBhv.newMyConditionBean();
		delCopyBCb.checkInvalidQuery();
		delCopyBCb.query().setImportTypeBId_InScope(deleteImportTypeBIdList);
		mImportTypeBCopyBBhv.queryDelete(delCopyBCb);

		// 削除フラグの条件付加を開始する
		this.setBehaviorAutoDelFlg(true);
	}

	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End
}
