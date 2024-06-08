package com.oneslogi.wms.logic.master;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerListHandler;

import com.oneslogi.base.dbflute.cbean.MEdiColumnCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyBCB;
import com.oneslogi.base.dbflute.cbean.MImportTypeBCopyHCB;
import com.oneslogi.base.dbflute.exbhv.MEdiColumnBhv;
import com.oneslogi.base.dbflute.exbhv.MImportTypeBBhv;
import com.oneslogi.base.dbflute.exentity.MEdiColumn;
import com.oneslogi.base.dbflute.exentity.MImportType;
import com.oneslogi.base.dbflute.exentity.MImportTypeB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.logic.AbstractLogic;
/**
 * 取込種別マスタメンテナンス取得ロジッククラス
 */
public class ImportTypeBMasterSelectLogic extends AbstractLogic {

	//===== 使用テーブル =====
	@Inject
	private MEdiColumnBhv mEdiColumnBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
	@Inject
	private MImportTypeBBhv mImportTypeBBhv;
	// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End
	/**
	 * <h2>取込種別ボディデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに取込種別マスタ、EDI項目マスタ、取込種別ボディ、EC受注ヘッダコピーマスタ、EC受注ボディコピーマスタから取込種別ボディデータを取得する。
	 * </pre>
	 * @param importType 取込種別マスタ：取込種別ID、EDIID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return List<MImportTypeB> 取込種別ボディ
	 */
	public List<MImportTypeB> select(final MImportType importType, ErrorStatus errStatus) {

		// 新規登録か
		boolean isNew = importType.getImportTypeId() == null;

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		//検索条件の設定
		MEdiColumnCB cb = mEdiColumnBhv.newMyConditionBean();
		cb.checkInvalidQuery();

		cb.query().setEdiId_Equal(importType.getEdiId());
		cb.query().addOrderBy_EdiColumnId_Asc();

		List<MEdiColumn> ediColumnList = mEdiColumnBhv.selectList(cb);

		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		if (!isNew) {
			// 新規ではない場合、取込種別ボディ、EC受注ヘッダコピーマスタ、EC受注ボディコピーマスタを取得


			mEdiColumnBhv.loadMImportTypeBList(ediColumnList, new ConditionBeanSetupper<MImportTypeBCB>() {
				@Override
				public void setup(MImportTypeBCB loadCb) {
					loadCb.checkInvalidQuery();
					loadCb.query().setImportTypeId_Equal(importType.getImportTypeId());
				}
			}).withNestedReferrer(new ReferrerListHandler<MImportTypeB>() {
				@Override
				public void handle(List<MImportTypeB> bodyList) {
					mImportTypeBBhv.loadMImportTypeBCopyHList(bodyList, new ConditionBeanSetupper<MImportTypeBCopyHCB>() {
						@Override
						public void setup(MImportTypeBCopyHCB copyHCb) {
						}
					});

					mImportTypeBBhv.loadMImportTypeBCopyBList(bodyList, new ConditionBeanSetupper<MImportTypeBCopyBCB>() {
						@Override
						public void setup(MImportTypeBCopyBCB copyBCb) {
						}
					});
				}
			});
		}
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// EDI項目マスタリストを取込種別ボディマスタに詰め替え
		List<MImportTypeB> result = new ArrayList<MImportTypeB>();
		for (MEdiColumn ediColumn : ediColumnList) {

			MImportTypeB bodyData;

			if (isNew) {
				bodyData = new MImportTypeB();
				bodyData.setEdiColumnId(ediColumn.getEdiColumnId());
			} else {
				if (ediColumn.getMImportTypeBList().size() == 0) {
					bodyData = new MImportTypeB();
					bodyData.setEdiColumnId(ediColumn.getEdiColumnId());
				} else {
					bodyData = ediColumn.getMImportTypeBList().get(0);
				}
			}

			bodyData.setMEdiColumn(ediColumn);
			result.add(bodyData);
		}

		return result;
	}
}