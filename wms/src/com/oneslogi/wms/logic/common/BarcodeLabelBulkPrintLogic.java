package com.oneslogi.wms.logic.common;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.EBarcodeLabelCB;
import com.oneslogi.base.dbflute.exbhv.EBarcodeLabelBhv;
import com.oneslogi.base.dbflute.exentity.EBarcodeLabel;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * バーコードラベル一括出力ロジッククラス
 */
public class BarcodeLabelBulkPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private EBarcodeLabelBhv eBarcodeLabelBhv;

	/**
	 * <h2>バーコードラベル受信データを取得する。</h2>
	 * <pre>
	 * 引数のheaderを検索条件にデータベースからバーコードラベル受信データを取得する。
	 *
	 * </pre>
	 * @param header バーコードラベル受信：受信ID・エラーのみ表示
	 * @param paging nullの場合は全件出力
	 * @param optType 操作の区別  (1:「エラーフラグ：0」のみ出力)
	 * @return List<EBarcodeLabel> バーコードラベル受信リスト
	 */
	public List<EBarcodeLabel> getBarcodeLabelList(EBarcodeLabel header, PagingData paging, int optType) {

		List<EBarcodeLabel> result = null;

		EBarcodeLabelCB cb = eBarcodeLabelBhv.newMyConditionBean();
		cb.query().setReceiveId_Equal(header.getReceiveId() == null ? 0 : header.getReceiveId());
		cb.query().setImportFlg_Equal("0");

		// エラーのみ表示（チェックありの場合）
		if ("1".equals(header.getChkErrorShow())) {
			cb.query().setErrorFlg_Equal("1");
		}

		// 検索条件に関わらず「エラーフラグ：0」のデータのみ抽出
		if (optType == 1) {
			cb.query().setErrorFlg_Equal("0");
		}

		if (paging == null) {
			// 帳票出力用
			result = selectList(eBarcodeLabelBhv, cb);
		} else {
			// 画面出力用
			result = selectPage(eBarcodeLabelBhv, cb, paging);
		}

		return result;
	}

	/**
	 * <h2>バーコードラベル受信データを一括登録する。</h2>
	 * <pre>
	 * バーコードラベル受信データを一括登録する。
	 * </pre>
	 *
	 * @param eBarcodeLabelList バーコードラベル受信リスト：全項目
	 */
	public void batchInsert(List<EBarcodeLabel> eBarcodeLabelList) {
		eBarcodeLabelBhv.batchInsert(eBarcodeLabelList);
	}
}
