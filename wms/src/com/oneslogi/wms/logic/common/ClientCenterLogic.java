package com.oneslogi.wms.logic.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import org.dbflute.exception.EntityAlreadyDeletedException;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.WarnManager.WarnStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 荷主センタマスタ共通ロジッククラス
 */
public class ClientCenterLogic extends AbstractWmsLogic {

	// [EC-CT1-193] app.propertiesの読込みをbaseクラスに集約 2015.04.10 kawana

	@Inject
	private MClientCenterBhv mClientCenterBhv;

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主センタマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getPkEntityWithDeletedCheck(MClientCenter entity) {
		if (entity.getClientCenterId() == null) {
			return null;
		}
		return mClientCenterBhv.selectByPKValueWithDeletedCheck(entity.getClientCenterId());
	}

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getPkEntity(MClientCenter entity) {

		return getPkEntity(entity, null);
	}

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * プライマリキーを条件に荷主センタマスタデータを取得する。
	 * 検索対象が見つからない場合、未存在エラーをエラー情報として管理する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getPkEntity(MClientCenter entity, ErrorStatus errSts) {
		MClientCenter resultEntity = null;
		try {
			resultEntity = getPkEntityWithDeletedCheck(entity);
		} catch (EntityAlreadyDeletedException ex) {
			//検索対象が０件の場合
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
		}
		return resultEntity;
	}

	// レスポンス対策 2016.02.24 kawana Start

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntityWithDeletedCheck(MClientCenter entity) {

		MClientCenterCB cb = newUkCb(entity);
		if (cb == null) {
			return null;
		}
		return mClientCenterBhv.selectEntityWithDeletedCheck(cb);
	}

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntity(MClientCenter entity) {

		return getUkEntity(entity, null);
	}

	/**
	 * <h2>荷主センタマスタを取得する。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntity(MClientCenter entity, ErrorStatus errSts) {

		return getUkEntity(entity, errSts, false);
	}

	/**
	 * <h2>荷主センタマスタを取得する(キャッシュ使用)(エラー情報なし)。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntityCacheable(MClientCenter entity) {

		return getUkEntityCacheable(entity, null);
	}

	/**
	 * <h2>荷主センタマスタを取得する(キャッシュ使用)(エラー情報あり)。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntityCacheable(MClientCenter entity, ErrorStatus errSts) {

		return getUkEntity(entity, errSts, true);
	}

	/**
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラー情報として管理する。
	 *
	 * @param entity 検索条件：荷主ID・センタID
	 * @param errSts エラー時に設定するエラーステータス
	 * @return MClientCenter 荷主センタマスタ
	 */
	private MClientCenter getUkEntity(MClientCenter entity, ErrorStatus errSts, boolean cacheable) {

		MClientCenterCB cb = newUkCb(entity);
		if (cb == null) {
			return null;
		}

		MClientCenter clientCenter;
		if (cacheable) {
			clientCenter = selectEntityCacheable(mClientCenterBhv, cb);
		} else {
			clientCenter = mClientCenterBhv.selectEntity(cb);
		}

		if (clientCenter == null) {
			// 検索対象なし
			this.getErrorManager().add(errSts, WmsMessageConst.CLIENT_CENTER_NOT_FOUND_ERROR);
		}

		return clientCenter;

	}

	// レスポンス対策 2016.02.24 kawana End

	/**
	 * <h2>システム日付チェック処理を行う。</h2>
	 * <pre>
	 * 引数をキーにシステム管理日付取得する。
	 * 検索条件がNULLの場合はNULLをリターンする。
	 * 現在の日付はシステム日付より小さい場合、日次処理実行のワーニングメッセージを出力する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID・システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws ParseException 日付文字列が"yyyyMMdd"以外の場合の例外
	 */
	public void getSystemDtCheck(MClientCenter entity, WarnStatus errSts) throws ParseException {

		// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana Start

		// 荷主センタ取得
		MClientCenter cc = getUkEntity(entity);
		if (cc == null) {
			return;
		}

		// ===== 日次実行中チェック =====
		if (cc.isBatchProgressFlg$1()) {
			// 実行中エラー

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd(), errSts.getRowIndex()) , WmsMessageConst.DAILY_CHECK_ERROR);
			return;
		}

		// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana End

		// ===== 日次忘れチェック =====

		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		String chktime = getPropertyValue(WmsPropertyConst.SYSTEM_DT_CHECK_TIME);
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End
		if (chktime == null) {
			return;
		}

		// [#45] 日次締処理終了後の日付反映対応(荷主センタの取得処理を移動) 2016.11.01 kawana

		if (cc.getSystemDt() != null) {

			// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.08 shimizu Start
			if(entity.getSystemDt() != null && !entity.getSystemDt().equals(cc.getSystemDt())) {
				this.getWarnManager().add(errSts, WmsMessageConst.SYSTEM_DT_CHECK_ERROR);
				return ;
			}
			// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.08 shimizu End

			Calendar nowCal = Calendar.getInstance();
			nowCal.add(Calendar.MINUTE, Integer.valueOf(chktime).intValue() * -1);
			Date date = nowCal.getTime();

			SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
			Date sysDate = df.parse(cc.getSystemDt());
			if (sysDate.before(date)) {
				this.getWarnManager().add(errSts, WmsMessageConst.SYSTEM_DT_WARN);
			}
		}
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana Start

	// レスポンス対策 2016.02.24 kawana Start

	/**
	 * <h2>荷主センタマスタを取得する(取引先マスタを結合)。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntityWithCustomer(MClientCenter entity) {
		return getUkEntityWithCustomer(entity, false);
	}

	/**
	 * <h2>荷主センタマスタを取得する(取引先マスタを結合)(キャッシュ使用)。</h2>
	 * <pre>
	 * ユニークキーを条件に荷主センタマスタデータを取得する。
	 * </pre>
	 * @param entity 荷主センタマスタ：荷主ID・センタID目
	 * @return MClientCenter 荷主センタマスタ
	 */
	public MClientCenter getUkEntityWithCustomerCacheable(MClientCenter entity) {
		return getUkEntityWithCustomer(entity, true);
	}

	/**
	 * ユニークキーを条件にエンティティを返す(取引先マスタを結合)(キャッシュ使用)。
	 * 検索条件がNULLの場合はNULLを返す。
	 * 検索対象が見つからない場合はNULLを返す。
	 *
	 * @param entity 検索条件：荷主ID・センタID
	 * @param cacheable キャッシュ使用有無
	 * @return MClientCenter 荷主センタマスタ
	 */
	private MClientCenter getUkEntityWithCustomer(MClientCenter entity, boolean cacheable) {

		MClientCenterCB cb = newUkCb(entity);
		if (cb == null) {
			return null;
		}
		cb.setupSelect_MCustomer();

		MClientCenter clientCenter;
		if (cacheable) {
			clientCenter = selectEntityCacheable(mClientCenterBhv, cb);
		} else {
			clientCenter = mClientCenterBhv.selectEntity(cb);
		}

		return clientCenter;
	}

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.10 kawana End

	/**
	 * ユニークキー条件の作成
	 * @param entity
	 * @return MClientCenterCB
	 */
	private MClientCenterCB newUkCb(MClientCenter entity) {
		if (entity.getClientId() == null) {
			return null;
		}
		if (entity.getCenterId() == null) {
			return null;
		}

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana Start
		cb.setupSelect_MParamAsOne();
		// [C-CWMS-0048] 入庫日管理対応 2015.12.28 kawana End
		cb.query().setClientId_Equal(entity.getClientId());
		cb.query().setCenterId_Equal(entity.getCenterId());

		return cb;
	}

	// レスポンス対策 2016.02.24 kawana End
}
