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
 * 荷姿マスタデータの更新ロジッククラス
 */
public class ShapeMasterUpdateLogic extends AbstractWmsLogic {

	@Inject
	private MShapeBhv mShapeBhv;
	@Inject
	private BDictBhv bDictBhv;
	@Inject
	private BDictCultureBhv bDictCultureBhv;

	/**
	 * <h2>荷姿マスタデータの更新処理を行う。</h2>
	 * <pre>
	 * 辞書名存在フラグ = 「0」の場合、辞書マスタを登録し、辞書IDを設定する。
	 * 引数で受け取ったデータで荷姿マスタに更新する。
	 * </pre>
	 * @param mShape 荷姿マスタ：全項目
	 * @param vDictNmExistFlg 辞書名存在フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void update(MShape mShape, String vDictNmExistFlg, ErrorStatus errSts) {
		// ===== 荷姿マスタ更新実行 =====

		if ("0".equals(vDictNmExistFlg)) {
			// 辞書名存在フラグ = 「0」の場合、辞書マスタの登録実行

			BDictCB cbVDictByShapeDict = bDictBhv.newMyConditionBean();

			cbVDictByShapeDict.query().setDictNm_Equal(mShape.getVDictByShapeDictId().getDictNm());
			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			// 検索実行
			BDict chkBVDictByShapeDict = bDictBhv.selectEntity(cbVDictByShapeDict);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			if (chkBVDictByShapeDict == null) {
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
			} else {
				// 辞書マスタ・辞書カルチャマスタ更新

				// 削除フラグ
				chkBVDictByShapeDict.setDelFlg_$0();
				bDictBhv.update(chkBVDictByShapeDict);

				// 辞書カルチャマスタ検索
				BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

				cbCulture.query().setDictId_Equal(chkBVDictByShapeDict.getDictId());

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
				mShape.setShapeDictId(chkBVDictByShapeDict.getDictId());
			}


			BDictCB cbVDictByShapeUnitDict = bDictBhv.newMyConditionBean();
			cbVDictByShapeUnitDict.query().setDictNm_Equal(mShape.getVDictByShapeUnitDictId().getDictNm());

			// 削除フラグ自動検索無効化
			this.setBehaviorAutoDelFlg(false);

			BDict chkVDictByShapeUnitDict = bDictBhv.selectEntity(cbVDictByShapeUnitDict);

			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			if (chkVDictByShapeUnitDict == null) {
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

			} else {
				// 辞書マスタ・辞書カルチャマスタ更新

				// 削除フラグ
				chkVDictByShapeUnitDict.setDelFlg_$0();
				bDictBhv.update(chkVDictByShapeUnitDict);

				// 辞書カルチャマスタ検索
				BDictCultureCB cbCulture = bDictCultureBhv.newMyConditionBean();

				cbCulture.query().setDictId_Equal(chkVDictByShapeUnitDict.getDictId());

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
				mShape.setShapeUnitDictId(chkVDictByShapeUnitDict.getDictId());
			}
		}

		mShapeBhv.update(mShape);
	}

}
