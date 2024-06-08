package com.oneslogi.wms.logic.master;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.coption.LikeSearchOption;

import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主マスタメンテナンス取得ロジッククラス
 */
public class ClientMasterSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private MClientBhv mClientBhv;

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	/**
	 * <h2>荷主マスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに荷主マスタ情報を取得する、
	 * 検索対象が見つからない場合はNULLを返すと共に、
     * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主CD・荷主名称・削除フラグ
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MClient> 荷主マスタリスト
	 */
	public List<MClient> select(MClient mClient, ErrorStatus errSts) {

		List<MClient> result = null;
		// ===== 荷主マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MClientCB cb = mClientBhv.newMyConditionBean();

		// [Ver3.0] unit of measure対応 2017.11.27 NING Start
		cb.setupSelect_MShapeGrp();
		// [Ver3.0] unit of measure対応 2017.11.27 NING End

		// 荷主CDの設定
		cb.query().setClientCd_PrefixSearch(mClient.getClientCd());

		// 荷主名称の設定
		cb.query().setClientNm_LikeSearch(mClient.getClientNm(),new LikeSearchOption().likeContain());

		// 削除フラグの設定
		cb.query().setDelFlg_Equal(mClient.getDelFlg());

		// ソート順の設定
		cb.query().addOrderBy_ClientCd_Asc();//荷主CD

		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 Start
		// ==== 荷主マスタ検索実行 =====
		result = selectList(mClientBhv, cb);
		//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/05 End

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
		if (result.size() == 0) {
		  this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
		}
		return result;
	}

	/**
	 * <h2>荷主センタマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに荷主センタマスタ情報を取得する。
	 * </pre>
	 * @param header センタマスタ：センタID
	 * @param paging ページ検索の設定
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<MClientCenter> 荷主センタマスタリスト
	 */
	public List<MClientCenter> selectByCenterId(MCenter header, PagingData paging, ErrorStatus errSts) {

		List<MClientCenter> result = null;
		// ===== 荷主マスタデータ取得 =====

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MClientCenterCB cb = mClientCenterBhv.newConditionBean();
		// センタIDの設定
		cb.setupSelect_MParamAsOne();
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();

		// [ON推-品向-1078] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/11 ichikawa Start
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
		// 緊急補充倉庫
		cb.setupSelect_MParamAsOne().withMZone().withMWarehouse();
		// 緊急補充ゾーン
		cb.setupSelect_MParamAsOne().withMZone();
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End
		// 梱包荷材グループ
		cb.setupSelect_MParamAsOne().withMBoxGrp();
		// [ON推-品向-1078] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/11 ichikawa End

		// [Ver3.0][#3267] カルチャ、タイムゾーンのデータ取得 2018.01.04 shimizu Start
		cb.setupSelect_MCenter().withBCulture();
		cb.setupSelect_MCenter().withBTimeZone();
		// [Ver3.0][#3267] カルチャ、タイムゾーンのデータ取得 2018.01.04 shimizu End

		//Ver２．１向けエンハンス C-CWMS-0054 2016/06/02 SJA Start
		cb.setupSelect_MParamAsOne().withMBox();
		//Ver２．１向けエンハンス C-CWMS-0054 2016/06/02 SJA End
		cb.query().setCenterId_Equal(header.getCenterId());

		cb.query().queryMClient().addOrderBy_ClientCd_Asc();

//		result = mClientCenterBhv.selectList(cb);
		result = selectPage(mClientCenterBhv, cb, paging);

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		// ===== ０件チェック =====
//		if (result.size() == 0) {
//		  this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
//		}
		return result;
	}

	/**
	 * <h2>荷主センタマスタデータを取得する。</h2>
	 * <pre>
	 * 引数をキーに荷主センタマスタの情報を取得する。
	 * </pre>
	 * @param clientCenterId 荷主センタマスタ：荷主センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter selectByClientCenterId(Long clientCenterId, ErrorStatus errSts) {

		// 削除フラグ自動検索無効化
		this.setBehaviorAutoDelFlg(false);

		// 検索条件の設定
		MClientCenterCB cb = mClientCenterBhv.newConditionBean();
		// センタIDの設定
		cb.setupSelect_MParamAsOne();
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();

		// [ON推-品向-1091] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/12 ichikawa Start
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
		// 緊急補充倉庫
		cb.setupSelect_MParamAsOne().withMZone().withMWarehouse();
		// 緊急補充ゾーン
		cb.setupSelect_MParamAsOne().withMZone();
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana Start
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
		// [1.1.4-CT-117] 緊急補充ゾーンの補充荷姿設定を追加 2016.06.21 kawana End
		// 梱包荷材グループ
		cb.setupSelect_MParamAsOne().withMBoxGrp();
		// [ON推-品向-1091] 区分値マスタの名称の設定をJava側で実施に変更 2016/04/12 ichikawa End

		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA Start
		cb.setupSelect_MParamAsOne().withMBox();
		//Ver２．１向けエンハンス C-CWMS-0054 2016.06.02 SJA End

		cb.query().setClientCenterId_Equal(clientCenterId);

		final MClientCenter clientCenter = mClientCenterBhv.selectEntity(cb);

		//削除フラグ自動検索有効化
		this.setBehaviorAutoDelFlg(true);

		return clientCenter;
	}
}