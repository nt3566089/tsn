package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.optional.OptionalEntity;

import com.oneslogi.base.dbflute.cbean.BDictCB;
import com.oneslogi.base.dbflute.cbean.BDictCultureCB;
import com.oneslogi.base.dbflute.exbhv.BDictBhv;
import com.oneslogi.base.dbflute.exbhv.BDictCultureBhv;
import com.oneslogi.base.dbflute.exbhv.MStockTypeBhv;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.BDictCulture;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫区分マスタデータの登録ロジッククラス
 */
public class StockTypeMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MStockTypeBhv mStockTypeBhv;
	// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki Start
	@Inject
	private BDictBhv bDictBhv;
	@Inject
	private BDictCultureBhv bDictCultureBhv;
	// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki End

	/**
	 * <h2>在庫区分マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 辞書名存在フラグ = 「0」の場合、辞書マスタを登録し、辞書IDを設定する。
	 * 引数で受け取ったデータを在庫区分マスタに登録する。
	 * </pre>
	 * @param mStockType 在庫区分マスタ：全項目
	 * @param vDictNmExistFlg 辞書名存在フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MStockType mStockType, String vDictNmExistFlg, ErrorStatus errSts) {
		// ===== 在庫区分マスタ登録実行 =====

		// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki Start
		if ("0".equals(vDictNmExistFlg)) {
			// 辞書名存在フラグ = 「0」の場合、辞書マスタの登録実行

			BDictCB cb = bDictBhv.newMyConditionBean();

			cb.query().setDictNm_Equal(mStockType.getVDict().getDictNm());

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			// 検索実行
			BDict chkBDict = bDictBhv.selectEntity(cb);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			if (chkBDict == null) {
				// 辞書マスタ登録
				BDict bDict = new BDict();

				// 辞書名
				bDict.setDictNm(mStockType.getVDict().getDictNm());
				// システム種別
				bDict.setSystemType("wms");
				bDictBhv.insert(bDict);

				// 採番された辞書IDの取得
		        OptionalEntity<BDict> optBDict = bDictBhv.selectByUniqueOf(mStockType.getVDict().getDictNm());
		        Long dictId = optBDict.get().getDictId();

				// 辞書ID設定
				mStockType.setDictId(dictId);
			} else {
				// 辞書マスタ・辞書カルチャマスタ更新

				// 削除フラグ
				chkBDict.setDelFlg_$0();
				bDictBhv.update(chkBDict);

				// 辞書カルチャマスタ検索
				BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

				cbCulture.query().setDictId_Equal(chkBDict.getDictId());

				// 削除フラグ自動検索無効化
				this.setBehaviorAutoDelFlg(false);

				List<BDictCulture> chkBDictCultureList = bDictCultureBhv.selectList(cbCulture);

				// 削除フラグ自動検索有効化
				this.setBehaviorAutoDelFlg(true);

				for(BDictCulture chkBDictCulture : chkBDictCultureList) {
					// 削除フラグ
					chkBDictCulture.setDelFlg_$0();
					bDictCultureBhv.update(chkBDictCulture);
				}

				// 辞書ID設定
				mStockType.setDictId(chkBDict.getDictId());
			}
		}
		// [C-CWMS-0042] 辞書ビュー存在チェック削除 2015.08.20 ki End

		mStockTypeBhv.insert(mStockType);
	}

	/**
	 * <h2>バッチで在庫区分マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを在庫区分マスタに登録する。
	 * </pre>
	 * @param mStockType 在庫区分マスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void batchInsert(List<MStockType> mStockType, ErrorStatus errSts) {
		// ===== 在庫区分マスタ登録実行 =====
		mStockTypeBhv.batchInsert(mStockType);
	}

}