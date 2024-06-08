package com.oneslogi.wms.batch.shipping;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.jboss.weld.exceptions.IllegalArgumentException;

import com.oneslogi.base.dbflute.cbean.MClientCenterCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.exbhv.MClientCenterBhv;
import com.oneslogi.base.dbflute.exbhv.TShippingInstHBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.logic.common.MessageLogic;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.batch.AbstractWmsBatch;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.common.LogLogic;
import com.oneslogi.wms.logic.shipping.ShippingInstErrorCheckLogic;
import com.oneslogi.wms.logic.shipping.WorkOrderLogic;

/**
 * 自動出庫指示登録バッチクラス
 */
public class CallShippingInstBatch extends AbstractWmsBatch {

	/**
	 * ステータスコード定義(ロジック呼出用)
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * 引数チェック異常
		 */
		protected static final int ARGUMENT_CHECK_ERROR = 2;
		/**
		 * 出庫指示データチェック異常
		 */
		protected static final int DATA_CHECK_ERROR = 3;
		/**
		 * 出庫指示ジョブ登録異常
		 */
		protected static final int JOB_QUE_ENTRY_ERROR = 4;
	}

	// ===== 使用テーブル =====

	@Inject
	private MClientCenterBhv mClientCenterBhv;
	@Inject
	private TShippingInstHBhv tShippingInstHBhv;

	// ===== 使用ロジッククラス =====

	@Inject
	private ClientLogic clientLogic;
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private NumberingCenterLogic numberingLogic;
	@Inject
	private ShippingInstErrorCheckLogic errorCheckLogic;
	@Inject
	private WorkOrderLogic workOrderLogic;
	@Inject
	private MessageLogic messageLogic;
	@Inject
	private LogLogic logLogic;

	/**
	 * <h2>自動出庫指示登録を実施する。</h2>
	 * <pre>
	 * 未出荷の出荷指示データを検索し、出庫指示バッチに登録する。
	 * 登録前に出荷指示データのエラーチェックをし、エラーデータは対象外にする。
	 * </pre>
	 * @return int ステータスコード
	 */
	@Override
	protected int execute() {

		Map<String, String> args = getKeyValueArgs();

		// ※空も許容 (その場合は全センタ・全荷主に対して処理する)
		final String argClientCd = args.get("clientCd");
		final String argCenterCd = args.get("centerCd");

		// ===== 引数チェック =====

		// 荷主CDチェック (nullの場合はエラーにならない)
		clientLogic.getUkEntity(newClientUkEntity(argClientCd), errRetSts(StatusCode.ARGUMENT_CHECK_ERROR));
		// センタCDチェック (nullの場合はエラーにならない)
		centerLogic.getUkEntity(newCenterUkEntity(argCenterCd), errRetSts(StatusCode.ARGUMENT_CHECK_ERROR));
		if (0 < getErrorManager().size()) {
			// 引数異常
			getErrorManager().throwException(new IllegalArgumentException("The request aregument was not found on master data."));
		}

		// 対象の荷主センタを検索
		List<MClientCenter> clientCenterList = selectClientCenterList(argClientCd, argCenterCd);

		if (clientCenterList.isEmpty()) {
			return StatusCode.SUCCESS;
		}

		boolean startLog = false;

		// 荷主・センタ分の繰返
		for (MClientCenter clientCenter : clientCenterList) {

			final long centerId = clientCenter.getCenterId();
			final long clientId = clientCenter.getClientId();

			// [#5893][v3.1] 自動出庫指示に作業日が未来日の分も含まれてしまう問題を修正 2019.01.16 kawana Start
			// 出荷指示ヘッダ検索 (未出荷)
			List<TShippingInstH> shippingInstHList = selectShippingInstHList(clientId, centerId, clientCenter.getSystemDt(), clientCenter.getMParamAsOne());
			// [#5893][v3.1] 自動出庫指示に作業日が未来日の分も含まれてしまう問題を修正 2019.01.16 kawana End

			if (shippingInstHList.isEmpty()) {
				// 0件
				continue;
			}

			if (!startLog) {

				startLog(argClientCd, argCenterCd);
				startLog = true;
			}

			// コントロールNo.採番
			long controlNo = numberingLogic.getControlNo();

			// 出庫指示ヘッダにコントロールNo.設定
			for (TShippingInstH instH : shippingInstHList) {
				instH.setControlNo(controlNo);
				tShippingInstHBhv.updateNonstrict(instH);
			}

			// データのエラーチェック
			boolean existErrorData = errorCheckLogic.check(controlNo, null, errRetSts(StatusCode.DATA_CHECK_ERROR));
			if (0 < getErrorManager().size()) {
				logLogic.endLogAddErrorManagerLog();
				return StatusCode.DATA_CHECK_ERROR;
			}

			int errorDataCount = 0;
			if (existErrorData) {
				// エラーデータあり

				// エラーデータのコントロールNoをクリア
				errorDataCount = clearErrorDataControlNo(controlNo);
			}

			int batchDataCount = shippingInstHList.size() - errorDataCount;
			if (batchDataCount < 1) {
				// 全件エラー

				getDatabaseLogger().addInfoLogDtl(WmsMessageConst.CALL_SHIPPING_INST_BATCH_ERROR_CHECK_INFORMATION,
						clientCenter.getMCenter().getCenterCd(),
						clientCenter.getMClient().getClientCd(),
						String.valueOf(batchDataCount),
						String.valueOf(errorDataCount));
				continue;
			}

			// 出庫指示バッチ登録
			String jobQueNo = workOrderLogic.shipInstructeJobEntry(clientCenter.getMCenter(), clientCenter.getMClient(), controlNo, batchDataCount, errRetSts(StatusCode.JOB_QUE_ENTRY_ERROR));
			if (0 < getErrorManager().size()) {
				logLogic.endLogAddErrorManagerLog();
				return StatusCode.JOB_QUE_ENTRY_ERROR;
			}

			// 運用ログ出力
			addJobEntryLog(jobQueNo, controlNo, clientCenter, errorDataCount, batchDataCount);
		}

		if (startLog) {

			// ログ終了（正常終了)
			getDatabaseLogger().endSuccessLog();
		}

		return StatusCode.SUCCESS;
	}

	private MClient newClientUkEntity(String clientCd) {
		MClient entity = new MClient();
		entity.setClientCd(clientCd);
		return entity;
	}

	private MCenter newCenterUkEntity(String centerCd) {
		MCenter entity = new MCenter();
		entity.setCenterCd(centerCd);
		return entity;
	}

	/**
	 * 対象の荷主センタマスタの検索
	 */
	private List<MClientCenter> selectClientCenterList(final String clientCd, final String centerCd) {

		MClientCenterCB cb = mClientCenterBhv.newMyConditionBean();

		// ===== 結合 =====

		cb.setupSelect_MParamAsOne();
		cb.setupSelect_MCenter();
		cb.setupSelect_MClient();

		// ===== 検索条件 =====

		cb.query().queryMClient().setClientCd_Equal(clientCd);
		cb.query().queryMCenter().setCenterCd_Equal(centerCd);
		// 日次処理中ではない
		cb.query().setBatchProgressFlg_Equal_$0();
		// 自動出庫指示を使用する
		cb.query().queryMParamAsOne().setAutoShipInstFlg_Equal_$1();

		// ===== ソート順(実行順) =====

		cb.query().queryMCenter().addOrderBy_CenterCd_Asc();
		cb.query().queryMClient().addOrderBy_ClientCd_Asc();

		// 検索実行
		List<MClientCenter> clientCenterList = mClientCenterBhv.selectList(cb);
		return clientCenterList;
	}

	/**
	 * 対象の出荷指示ヘッダ検索
	 */
	private List<TShippingInstH> selectShippingInstHList(long clientId, long centerId, String systemDt, MParam param) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setCenterId_Equal(centerId);
		cb.query().setClientId_Equal(clientId);
		cb.query().setShippingStatus_Equal_$10();
		// [#5893][v3.1] 自動出庫指示に作業日が未来日の分も含まれてしまう問題を修正 2019.01.16 kawana Start
		cb.query().setWorkDt_LessEqual(systemDt);
		// [#5893][v3.1] 自動出庫指示に作業日が未来日の分も含まれてしまう問題を修正 2019.01.16 kawana End
		cb.query().setControlNo_IsNull();

		if (param.isStockOutAutoInstFlg$0()) {
			// 欠品は含めない

			cb.orScopeQuery(new OrQuery<TShippingInstHCB>() {
				@Override
				public void query(TShippingInstHCB orCb) {
					orCb.query().setStockOutFlg_Equal_$0();
					orCb.query().setStockOutFlg_IsNull();
				}
			});
		}

		List<TShippingInstH> shippingInstHList = tShippingInstHBhv.selectList(cb);
		return shippingInstHList;
	}

	/**
	 * ログ開始
	 */
	private void startLog(final String argClientCd, final String argCenterCd) {

		// プログラムCD設定
		getDatabaseLogger().setPgmCd(WmsMessageConst.CALL_SHIPPING_INST_BATCH_PROGRAM_NAME);
		// 属性１設定 (センターCD)
		getDatabaseLogger().setAttribute1(argCenterCd);
		// 属性２設定 (荷主CD)
		getDatabaseLogger().setAttribute2(argClientCd);
		// ログ開始
		getDatabaseLogger().startLog();
		// ログ追加（パラメータ情報
		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.CALL_SHIPPING_INST_BATCH_PARAMETER_INFORMATION, nullToHyphen(argCenterCd), nullToHyphen(argClientCd));
	}

	/**
	 * エラーデータのコントロールNo.をクリア
	 */
	private int clearErrorDataControlNo(long controlNo) {

		TShippingInstHCB cb = tShippingInstHBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(controlNo);
		cb.query().setShippingStatus_NotEqual_$10();

		TShippingInstH entity = tShippingInstHBhv.newMyEntity();
		entity.setControlNo(null);

		int count = tShippingInstHBhv.queryUpdate(entity, cb);
		return count;
	}

	/**
	 * ジョブキュー登録ログの追加
	 */
	private void addJobEntryLog(String jobQueNo, long controlNo, MClientCenter clientCenter, int errorDataCount, int batchDataCount) {

		// ※ 運用ログの差替文字列の上限が5個のため、メッセージを分割

		String infoMessage = messageLogic.getMessageNm(WmsMessageConst.CALL_SHIPPING_INST_BATCH_ERROR_CHECK_INFORMATION,
				clientCenter.getMCenter().getCenterCd(),
				clientCenter.getMClient().getClientCd(),
				String.valueOf(batchDataCount),
				String.valueOf(errorDataCount));

		getDatabaseLogger().addInfoLogDtl(WmsMessageConst.CALL_SHIPPING_INST_BATCH_EXECUTE_INFORMATION, jobQueNo, String.valueOf(controlNo), infoMessage);
	}

	/**
	 * 空文字の場合は"-"に変換
	 */
	private String nullToHyphen(String str) {

		if (CU.isNullOrEmpty(str)) {
			return "-";
		}

		return str;
	}

}
