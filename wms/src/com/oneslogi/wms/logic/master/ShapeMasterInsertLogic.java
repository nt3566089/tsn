package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.optional.OptionalEntity;

import com.oneslogi.base.dbflute.cbean.BDictCB;
import com.oneslogi.base.dbflute.cbean.BDictCultureCB;
import com.oneslogi.base.dbflute.exbhv.BDictBhv;
import com.oneslogi.base.dbflute.exbhv.BDictCultureBhv;
import com.oneslogi.base.dbflute.exbhv.MShapeBhv;
import com.oneslogi.base.dbflute.exentity.BDict;
import com.oneslogi.base.dbflute.exentity.BDictCulture;
import com.oneslogi.base.dbflute.exentity.MShape;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷姿マスタデータの登録ロジッククラス
 */
public class ShapeMasterInsertLogic extends AbstractWmsLogic {

	@Inject
	private MShapeBhv mShapeBhv;
	@Inject
	private BDictBhv bDictBhv;
	@Inject
	private BDictCultureBhv bDictCultureBhv;

	/**
	 * <h2>荷姿マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 荷姿名称辞書IDがNULLの場合、辞書マスタを登録し、辞書IDを設定する。
	 * 荷姿名称辞書IDがNULLでない場合、辞書マスタ・辞書カルチャマスタを更新し、辞書IDを設定する。
	 * 荷姿単位辞書IDがNULLの場合、辞書マスタを登録し、辞書IDを設定する。
	 * 荷姿単位辞書IDがNULLでない場合、辞書マスタ・辞書カルチャマスタを更新し、辞書IDを設定する。
	 * 引数で受け取ったデータを荷姿マスタに登録する。
	 * </pre>
	 * @param mShape 荷姿マスタ：全項目
	 * @param vDictNmExistFlg 辞書名存在フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MShape mShape, String vDictNmExistFlg, ErrorStatus errSts) {
		// ===== 荷姿マスタ登録実行 =====
		// 辞書名存在フラグ = 「0」の場合、辞書マスタの登録実行

		BDictCB cbDictByShapeDic = bDictBhv.newMyConditionBean();

		cbDictByShapeDic.query().setDictNm_Equal(mShape.getVDictByShapeDictId().getDictNm());

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索実行
		BDict chkBDictByShapeDic = bDictBhv.selectEntity(cbDictByShapeDic);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);
		if (chkBDictByShapeDic == null) {
			// 辞書マスタ登録
			BDict bDict = new BDict();

			// 辞書名
			bDict.setDictNm(mShape.getVDictByShapeDictId().getDictNm());
			// システム種別
			bDict.setSystemType("wms");
			bDictBhv.insert(bDict);

			// 採番された辞書IDの取得
			OptionalEntity<BDict> optBDict = bDictBhv.selectByUniqueOf(mShape.getVDictByShapeDictId().getDictNm());
			Long dictId = optBDict.get().getDictId();

			// 辞書ID設定
			mShape.setShapeDictId(dictId);
		}
		else {
			// 辞書マスタ・辞書カルチャマスタ更新

			// 削除フラグ
			chkBDictByShapeDic.setDelFlg_$0();
			bDictBhv.update(chkBDictByShapeDic);

			// 辞書カルチャマスタ検索
			BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

			// 辞書カルチャマスタ検索
			cbCulture.query().setDictId_Equal(chkBDictByShapeDic.getDictId());

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			List<BDictCulture> chkBDictCultureList = bDictCultureBhv.selectList(cbCulture);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			for (BDictCulture chkBDictCulture : chkBDictCultureList) {
				// 削除フラグ
				chkBDictCulture.setDelFlg_$0();
				bDictCultureBhv.update(chkBDictCulture);
			}

			// 辞書ID設定
			mShape.setShapeDictId(chkBDictByShapeDic.getDictId());
		}

		BDictCB cbDictByShapeUnitDict = bDictBhv.newMyConditionBean();
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		cbDictByShapeUnitDict.query().setDictNm_Equal(mShape.getVDictByShapeUnitDictId().getDictNm());
		BDict chkBDictByShapeUnitDict = bDictBhv.selectEntity(cbDictByShapeUnitDict);

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		if (chkBDictByShapeUnitDict == null) {
			// 辞書マスタ登録
			BDict bDict = new BDict();
			// 辞書名
			bDict.setDictNm(mShape.getVDictByShapeUnitDictId().getDictNm());
			// システム種別
			bDict.setSystemType("wms");
			bDictBhv.insert(bDict);
			// 採番された辞書IDの取得
			OptionalEntity<BDict> optBDict = bDictBhv.selectByUniqueOf(mShape.getVDictByShapeUnitDictId().getDictNm());
			Long dictId = optBDict.get().getDictId();
			// 辞書ID設定
			mShape.setShapeUnitDictId(dictId);
		}
		else {
			// 辞書マスタ・辞書カルチャマスタ更新

			// 削除フラグ
			chkBDictByShapeUnitDict.setDelFlg_$0();
			bDictBhv.update(chkBDictByShapeUnitDict);

			// 辞書カルチャマスタ検索
			BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

			cbCulture.query().setDictId_Equal(chkBDictByShapeUnitDict.getDictId());

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			List<BDictCulture> chkBDictCultureList = bDictCultureBhv.selectList(cbCulture);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			for (BDictCulture chkBDictCulture : chkBDictCultureList) {
				// 削除フラグ
				chkBDictCulture.setDelFlg_$0();
				bDictCultureBhv.update(chkBDictCulture);
			}

			// 辞書ID設定
			mShape.setShapeUnitDictId(chkBDictByShapeUnitDict.getDictId());
		}

		mShapeBhv.insert(mShape);
	}

	// [#2166] 2017.8.4 ase Start
	/**
	 * <h2>荷姿マスタデータの登録処理を行う。</h2>
	 * <pre>
	 * 引数で受け取ったデータを荷姿マスタに登録する。
	 * </pre>
	 * @param mShape 荷姿マスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MShape mShape, ErrorStatus errSts) {
		// ===== 荷姿マスタ登録実行 =====
		mShapeBhv.insert(mShape);
	}
	// [#2166] 2017.8.4 ase End

}