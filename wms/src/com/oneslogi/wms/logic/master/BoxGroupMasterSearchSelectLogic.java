package com.oneslogi.wms.logic.master;

import java.util.Collections;
import java.util.Comparator;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.MBoxGrpCB;
import com.oneslogi.base.dbflute.cbean.MBoxGrpDtlCB;
import com.oneslogi.base.dbflute.exbhv.MBoxGrpBhv;
import com.oneslogi.base.dbflute.exentity.MBoxGrp;
import com.oneslogi.base.dbflute.exentity.MBoxGrpDtl;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷材グループマスタメンテナンス取得ロジッククラス。
 */
public class BoxGroupMasterSearchSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MBoxGrpBhv mBoxGrpBhv;

	/**
	 * <h2>荷材グループマスタメンテナンスデータを取得する。</h2>
	 * <pre>
	 * 引数をキーにデータベースから荷材グループマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 荷材グループマスタ：荷材グループID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MBoxGrp 荷材グループマスタ
	 */
	public MBoxGrp selectById(MBoxGrp header, ErrorStatus errSts) {
		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// ===== 荷材グループメンテナンス(編集)データ取得 =====
		MBoxGrpCB cb = mBoxGrpBhv.newMyConditionBean();
		// ===== 取得テーブル =====

		cb.setupSelect_MBox();
		cb.setupSelect_MBox().withMCenter();
		// ===== 検索条件 =====
		// 荷材グループID
		cb.query().setBoxGrpId_Equal(header.getBoxGrpId());
		// ===== 検索実行 =====
		MBoxGrp result = mBoxGrpBhv.selectEntity(cb);

		// ===== ０件チェック =====
		if (result== null) {
			// 削除フラグ自動検索有効化
			this.setBehaviorAutoDelFlg(true);

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// 荷材グループマスタデータを取得

		mBoxGrpBhv.loadMBoxGrpDtlList(result, new ConditionBeanSetupper<MBoxGrpDtlCB>() {
			@Override
			public void setup(MBoxGrpDtlCB arg0) {
				arg0.setupSelect_MBox();
			}
		});

		// 削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ソート順
		if(result.getMBoxGrpDtlList().size() != 0){
			Collections.sort(result.getMBoxGrpDtlList(), new Comparator<MBoxGrpDtl>() {
				public int compare(MBoxGrpDtl arg0, MBoxGrpDtl arg1) {
					return arg0.getMBox().getBoxCd().compareTo(arg1.getMBox().getBoxCd());
				}
			});
		}

		return result;
	}
}
