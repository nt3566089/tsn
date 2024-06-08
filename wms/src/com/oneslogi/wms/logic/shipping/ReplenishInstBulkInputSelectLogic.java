package com.oneslogi.wms.logic.shipping;

import java.math.BigDecimal;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.bsbhv.BsWReplenishInstInputBhv;
import com.oneslogi.base.dbflute.cbean.TTrflexibilityCB;
import com.oneslogi.base.dbflute.cbean.TTrflexibilityinstructCB;
import com.oneslogi.base.dbflute.cbean.WReplenishInstInputCB;
import com.oneslogi.base.dbflute.exbhv.TTrflexibilityBhv;
import com.oneslogi.base.dbflute.exbhv.TTrflexibilityinstructBhv;
import com.oneslogi.base.dbflute.exbhv.WReplenishInstInputBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlWReplenishInstInputDataListPmb;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TTrflexibility;
import com.oneslogi.base.dbflute.exentity.TTrflexibilityinstruct;
import com.oneslogi.base.dbflute.exentity.WReplenishInstInput;
import com.oneslogi.base.dbflute.exentity.customize.SqlWReplenishInstInputDataList;
import com.oneslogi.base.dto.PagingDto.PagingData;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 融通指示一括登録データ取得ロジッククラス
 */
public class ReplenishInstBulkInputSelectLogic extends AbstractWmsLogic {

	@Inject
	private WReplenishInstInputBhv wReplenishInstInputBhv;

	@Inject
	private TTrflexibilityinstructBhv trflexibilityinstructBhv;
	@Inject
	private TTrflexibilityBhv trflexibilityBhv;

	// ===== enum =====
	/** エラーデータ検索区分 */
	public enum SelectCls {
		/** 全て検索 */
		ALL,
		/** エラーデータのみ検索 */
		ERROR_ONLY,
		/** エラー無データのみ検索 */
		NO_ERROR_ONLY
	}

	/**
	 * <h2>出荷予定受信テーブル検索(出荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param cls エラー検索区分
	 * @return 検索結果のリスト
	 */
	public List<WReplenishInstInput> selectAndConvertWReplenishInstInputList(String receiveCd, String centerCd, String clientCd, SelectCls cls) {
		return selectAndConvertWReplenishInstInputList(receiveCd, centerCd, clientCd, null, cls);
	}

	/**
	 * <h2>出荷予定受信テーブル検索(出荷予定ボディDTOへの変換込).</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @param paging ページング設定
	 * @param cls エラー検索区分
	 * @return 検索結果の出荷指示ヘッダデータリスト
	 */
	public List<WReplenishInstInput> selectAndConvertWReplenishInstInputList(String receiveCd, String centerCd, String clientCd, PagingData paging, SelectCls cls) {

		List<WReplenishInstInput> bodyList = null;

		WReplenishInstInputCB cb = wReplenishInstInputBhv.newConditionBean();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().setCenterCd_Equal(centerCd);
		cb.query().setClientCd_Equal(clientCd);
		cb.query().setWorkFlg_Equal(CDef.WorkFlg.$0.code());
		cb.query().setDelFlg_Equal_$0();
		
		switch (cls) {
		case ALL:
		default:
			break;
		case ERROR_ONLY:
			cb.query().setErrorFlg_Equal(CDef.ErrorFlg.$1.code());
			break;
		case NO_ERROR_ONLY:
			cb.query().setErrorFlg_Equal(CDef.ErrorFlg.$0.code());
			break;
		}
		
		cb.query().addOrderBy_LineNo_Asc();
		
		if (paging != null) {
			bodyList = selectPage(wReplenishInstInputBhv, cb, paging);
		}else {
			bodyList = wReplenishInstInputBhv.selectList(cb);
		}

		return bodyList;
	}

	/**
	 * <h2>融通指示一括取込ワーク検索</h2>
	 * @param receiveCd 受信CD
	 * @param centerCd センタCD
	 * @param clientCd 荷主CD
	 * @return セレクト件数
	 */
	public int getWReplenishInstInputCount(String receiveCd, String centerCd, String clientCd) {

		WReplenishInstInputCB cb = wReplenishInstInputBhv.newConditionBean();
		cb.query().setReceiveCd_Equal(receiveCd);
		cb.query().setCenterCd_Equal(centerCd);
		cb.query().setClientCd_Equal(clientCd);
		
		return wReplenishInstInputBhv.selectCount(cb);
	}

	/**
	 * <h2>チェックデータ取得</h2>
	 * 受信CD で 融通指示一括取込ワーク を検索する
	 * @param receiveCd 受信CD
	 * @param mCenter 拠点マスタ
	 * @param mClient 荷主マスタ
	 * @param errorStatus エラーステータス
	 * @return List<SqlWReplenishInstInputDataList>
	 */
	public List<SqlWReplenishInstInputDataList> selectCheckDataList(String receiveCd, MCenter mCenter, MClient mClient, ErrorStatus errorStatus) {
		// 融通指示一括登録用DTO.受信CD で 融通指示一括取込ワーク を検索する。
		// 外出しSQLの定義
		String path = BsWReplenishInstInputBhv.PATH_selectSqlWReplenishInstInputDataList;

		// 引数設定
		SqlWReplenishInstInputDataListPmb pmb = new SqlWReplenishInstInputDataListPmb();

		pmb.setCenterId(mCenter.getCenterId());
		pmb.setCenterCd(mCenter.getCenterCd());
		pmb.setClientCd(mClient.getClientCd());
		pmb.setReceiveCd(receiveCd);

		// 検索実行
		Class<SqlWReplenishInstInputDataList> entityType = SqlWReplenishInstInputDataList.class;

		List<SqlWReplenishInstInputDataList> list = wReplenishInstInputBhv.outsideSql().selectList(path, pmb, entityType);
		
		return list;
	}

	/**
	 * <h2>融通指示一括登録情報登録取得</h2>
	 * @param flexinstructno 融通指示番号
	 * @return List<TTrflexibilityinstruct>
	 */
	public List<TTrflexibilityinstruct> selectTTrflexibilityinstructDataList(BigDecimal flexinstructno) {
		TTrflexibilityinstructCB tTrflexibilityinstructCB = trflexibilityinstructBhv.newConditionBean();
		tTrflexibilityinstructCB.query().setFlexinstructno_Equal(flexinstructno);
		tTrflexibilityinstructCB.query().setDelFlg_Equal_$0();
		tTrflexibilityinstructCB.query().addOrderBy_Flexinsno_Asc();
		tTrflexibilityinstructCB.query().addOrderBy_Flexibityno_Asc();
		
		return trflexibilityinstructBhv.selectList(tTrflexibilityinstructCB);
	}
	
	/**
	 * <h2>融通輸送情報更新データ取得</h2>
	 * @param flexibityno 融通No
	 * @return List<TTrflexibility>
	 */
	public List<TTrflexibility> selectTTrflexibilityDataList(BigDecimal flexibityno) {
		TTrflexibilityCB tTrflexibilityCB = trflexibilityBhv.newConditionBean();
		tTrflexibilityCB.query().setFlexibityno_Equal(flexibityno);
		tTrflexibilityCB.query().setDelFlg_Equal_$0();

		return trflexibilityBhv.selectList(tTrflexibilityCB);
	}
}
