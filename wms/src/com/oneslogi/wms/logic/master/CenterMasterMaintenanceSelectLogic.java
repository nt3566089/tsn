package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.PagingResultBean;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * センタマスタメンテナンス取得ロジッククラス
 */
public class CenterMasterMaintenanceSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MCenterBhv mCenterBhv;

	/**
	 * <h2>センタマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にセンタマスタ情報を取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header センタマスタ：センタCD・センタ名称・削除フラグ
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return PagingResultBean<MCenter> センタマスタリスト
	 */
	public PagingResultBean<MCenter> selectByConditions(MCenter header, PagingData paging, ErrorStatus errSts) {

		PagingResultBean<MCenter> result = null;

		// ===== 一覧データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCenterCB cb = mCenterBhv.newMyConditionBean();
		// [C-CWMS-0039] センタ間移動機能を追加(住所1を削除) 2015.09.17 kawana

		// [横並-006] 削除フラグを追加 2014.11.26 taoys Start
		//削除フラグ
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
		cb.setupSelect_BClassDtlByDelFlg();
		cb.setupSelect_BClassDtlByDelFlg().withVDict(getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End

		// [Ver3.0][#3267] カルチャ、タイムゾーンのテーブルと連携 2018.01.05 shimizu Start
		cb.setupSelect_BCulture();
		cb.setupSelect_BTimeZone();
		// [Ver3.0][#3267] カルチャ、タイムゾーンのテーブルと連携 2018.01.05 shimizu End

		// [横並-006] 削除フラグを追加 2014.11.26 taoys End
		// センタCDの設定
		cb.query().setCenterCd_PrefixSearch(header.getCenterCd());

		// センタ名称の設定
		cb.query().setCenterNm_LikeSearch(header.getCenterNm(), new LikeSearchOption().likeContain());

		// [C-CWMS-0039] センタ間移動機能を追加(住所1を削除) 2015.09.17 kawana

		cb.query().setDelFlg_Equal(header.getDelFlg());

		// ソート順の設定
		cb.query().addOrderBy_CenterCd_Asc();// センタCD
		cb.query().addOrderBy_CenterNm_Asc();// センタ名称

		// ===== センタマスタ検索実行 =====
		result = selectPage(mCenterBhv, cb, paging);

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	/**
	 * <h2>センタマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を検索条件にデータベースからセンタマスタデータを取得する。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 *  </pre>
	 * @param header センタマスタ：センタID
	 * @param errStatus エラー時に設定するエラーステータス
	 * @return List<MCenter> センタマスタリスト
	 */

	public List<MCenter> selectById(MCenter header, ErrorStatus errStatus) {

		List<MCenter> mCenterList = null;
		// ===== 編集データ取得 =====

		// 削除フラグの自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MCenterCB cb = mCenterBhv.newMyConditionBean();

		// [Ver3.0][#3267] カルチャ、タイムゾーンのデータ取得 2018.01.04 shimizu Start
		// 関連テーブルとの連携
		cb.setupSelect_BCulture();
		cb.setupSelect_BTimeZone();
		// [Ver3.0][#3267] カルチャ、タイムゾーンのデータ取得 2018.01.04 shimizu End

		// センタIDの設定
		cb.query().setCenterId_Equal(header.getCenterId());

		// ==== センタマスタ検索実行 =====
		mCenterList = mCenterBhv.selectList(cb);

		mCenterBhv.loadMClientCenterList(mCenterList, new ConditionBeanSetupper<MClientCenterCB>() {
			public void setup(MClientCenterCB pcb) {
				pcb.setupSelect_MClient();
				pcb.setupSelect_MParamAsOne();
				pcb.setupSelect_MParamAsOne().withMDeliveryCourse();

				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
				pcb.setupSelect_MParamAsOne().withMBoxGrp();
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
				pcb.setupSelect_MParamAsOne().withMZone();
				pcb.setupSelect_MParamAsOne().withMZone().withMWarehouse();
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe Start
				pcb.setupSelect_MParamAsOne().withBClassDtlByDelFlg().withVDict(getCultureId());
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.16 miyabe End
				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
				// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
				// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Ｅｎｄ

				// [ON推-UK114-003] 荷主マスタに削除フラグが立っているデータが不完全な形で表示される。 2016.02.16 sja Start
				pcb.query().queryMClient().setDelFlg_Equal_$0();
				// [ON推-UK114-003] 荷主マスタに削除フラグが立っているデータが不完全な形で表示される。 2016.02.16 sja End

				//ソート順の設定
				pcb.query().queryMClient().addOrderBy_ClientCd_Asc();
			}
		});

		// 削除フラグの自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (mCenterList.size() == 0) {
			this.getErrorManager().add(errStatus, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return mCenterList;
	}

}