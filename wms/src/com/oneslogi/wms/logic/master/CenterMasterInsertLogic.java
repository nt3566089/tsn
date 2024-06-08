package com.oneslogi.wms.logic.master;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタマスタメンテナンス登録ロジッククラス
 */
public class CenterMasterInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterBhv mCenterBhv;
	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private MParamBhv mParamBhv;

	/**
	 * <h2>センタマスタを登録する。</h2>
	 * <pre>
	 * センタマスタを登録する。
	 *
	 * </pre>
	 * @param header センタマスタ：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(MCenter header, ErrorStatus errSts) {
		//センタマスタの登録実行
		mCenterBhv.insert(header);
	}

	/**
	 * <h2>センタマスタを一括登録する。</h2>
	 * <pre>
	 *
	 * センタマスタ、パラメータマスタと荷主センタマスタのデータを一括登録、更新する。
	 * </pre>
	 * @param header センタマスタ：全項目
	 * @param bodylistC 荷主センタマスタリスト：全項目
	 * @param bodylistP パラメータマスタリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insertDtl(MCenter header, List<MClientCenter> bodylistC, List<MParam> bodylistP, ErrorStatus errSts) {

		List<MClientCenter> updateMClientCenter = new ArrayList<>();

		List<MParam> insertMParam = new ArrayList<>();
		List<MParam> updateMParam = new ArrayList<>();

		//荷主センタマスタの更新実行
		int index = 0;
		for (MClientCenter mClientCenter : bodylistC) {

			//センタIDの設定
			mClientCenter.setCenterId(header.getCenterId());

			if (mClientCenter.getClientCenterId() == null) {
				//バッチ処理中フラグの設定
				mClientCenter.setBatchProgressFlg_$0();

				GregorianCalendar now = new GregorianCalendar();
				SimpleDateFormat fmtrq = new SimpleDateFormat("yyyyMMdd");

				//システム管理日時の設定
				mClientCenter.setSystemDt(fmtrq.format(now.getTime()));

				//					insertMClientCenter.add(mClientCenter);
				//荷主センタマスタの登録実行
				mClientCenterBhv.insert(mClientCenter);
			} else {
				//荷主センタマスタの更新実行
				updateMClientCenter.add(mClientCenter);
				//				mClientCenterBhv.update(mClientCenter);
			}

			MParam mParam = bodylistP.get(index);

			if (mParam.getClientCenterId() == null) {
				//荷主センタIDの設定
				mParam.setClientCenterId(mClientCenter.getClientCenterId());
				insertMParam.add(mParam);
				//パラメータマスタの登録実行
				//					mParamBhv.insert(mParam);

			} else {
				updateMParam.add(mParam);
				//パラメータマスタの更新実行
				//					mParamBhv.update(mParam);
			}
			index++;
		}
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW Start
		if (!insertMParam.isEmpty()) {
			//パラメータマスタの登録実行
			mParamBhv.batchInsert(insertMParam);
		}

		if (!updateMClientCenter.isEmpty()) {
			//荷主センタマスタの更新実行
			mClientCenterBhv.batchUpdate(updateMClientCenter);
		}

		if (!updateMParam.isEmpty()) {
			//パラメータマスタの登録実行
			mParamBhv.batchUpdate(updateMParam);
		}
		// [ON推-品向] 一括登録に変更する 2016.02.15 DSW End

	}
}
