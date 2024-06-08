package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.MCenterCB;
import com.oneslogi.base.dbflute.cbean.MClientCB;
import com.oneslogi.base.dbflute.cbean.MWarehouseCB;
import com.oneslogi.base.dbflute.exbhv.MCenterBhv;
import com.oneslogi.base.dbflute.exbhv.MClientBhv;
import com.oneslogi.base.dbflute.exbhv.MWarehouseBhv;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.exception.ReportOverSafetySizeException;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsPropertyConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.stockupdate.StoreLabelNoNumberingLogic;

/**
 * 汎用ラベル発行ロジッククラス
 */
public class ClassLabelPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====

	@Inject
	private MClientBhv mClientBhv;

	@Inject
	private MCenterBhv mCenterBhv;

	@Inject
	private MWarehouseBhv mWarehouseBhv;
	// [#27]使用済の入庫ラベルNo.を除外 Start
	@Inject
	private StoreLabelNoNumberingLogic storeLabelNoNumberingLogic;
	// [#27]使用済の入庫ラベルNo.を除外 End

	/**
	 * <h2>汎用ラベルデータを取得する。</h2>
	 * <pre>
	 * 引数のentityを検索条件にデータベースから汎用ラベル発行データのリストを取得する。
	 * ・荷主マスタ、センタマスタ、倉庫マスタからデータを取得し、
	 * 入庫ラベルNo.を採番後、戻りのエンティティに設定する。
	 * 出力可能件数超える場合、エラー出る。
	 * 検索対象が見つからない場合はNULLを返すと共に、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mClient 荷主マスタ：荷主ID
	 * @param mCenter センタマスタ：センタID
	 * @param mWarehouse 倉庫マスタ：倉庫ID
	 * @param body 入庫実績ボディ：入庫ラベルNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TStoreRecordB> 汎用ラベル発行データのリスト
	 */
	public List<TStoreRecordB> select(MClient mClient,MCenter mCenter,MWarehouse mWarehouse,TStoreRecordB body,ErrorStatus errSts) {

		// [ON推-品向-938] 入庫ラベルの発行上限数を設定ファイルに抜き出し 2015.09.18 kawana Start
		// [ON推-品向-601] 帳票データ件数の上限を設定 2015.04.17 kawana Start
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa Start
		if (getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT_STORE_LABEL) != 0 && Integer.parseInt(body.getStoreLabelNo()) > getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT_STORE_LABEL)) {
			throw new ReportOverSafetySizeException("The report size is over the specified safety size.", getPropertyIntValue(WmsPropertyConst.ALLOW_QUERY_COUNT_TO_REPORT_STORE_LABEL));
		}
		// [ON推-品向-845] システム設定テーブルを作成 2015.12.28 ichikawa End
		// [ON推-品向-601] 帳票データ件数の上限を設定 2015.04.17 kawana End
		// [ON推-品向-938] 入庫ラベルの発行上限数を設定ファイルに抜き出し 2015.09.18 kawana End

		List<MClient> mClientresult = new ArrayList<MClient>();

		List<MCenter> mCenterresult = new ArrayList<MCenter>();

		List<MWarehouse> mWarehouseresult = new ArrayList<MWarehouse>();

		List<TStoreRecordB> result = new ArrayList<TStoreRecordB>();

		// ===== 荷主マスタデータ取得  =====

		MClientCB mClientCB = mClientBhv.newMyConditionBean();

		mClientCB.query().setClientId_Equal(mClient.getClientId());

		mClientresult = mClientBhv.selectList(mClientCB);

		if(mClientresult.size() == 0){
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== センタマスタデータ取得  =====

		MCenterCB mCenterCB = mCenterBhv.newMyConditionBean();

		mCenterCB.query().setCenterId_Equal(mCenter.getCenterId());

		mCenterresult = mCenterBhv.selectList(mCenterCB);

		if(mCenterresult.size() == 0){
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 倉庫マスタデータ取得  =====

		MWarehouseCB mWarehouseCB = mWarehouseBhv.newMyConditionBean();

		if(mWarehouse.getWarehouseId() != null){

			mWarehouseCB.query().setWarehouseId_Equal(mWarehouse.getWarehouseId());

			mWarehouseBhv.selectList(mWarehouseCB);

			//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/06 Start
			mWarehouseresult = selectList(mWarehouseBhv, mWarehouseCB);
			//[ON推-品向-1053] 件数チェックを行うように修正 ichikawa 2016/04/06 End

			if(mWarehouseresult.size() == 0){
				this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
				return null;
			}
		}

		for(int i = 0; i < Integer.parseInt(body.getStoreLabelNo()); i++){

			//エンティティ編集
			TStoreRecordB tStoreRecordB = new TStoreRecordB();
			tStoreRecordB.setClientCd(mClientresult.get(0).getClientCd());
			tStoreRecordB.setClientAbbr(mClientresult.get(0).getClientAbbr());
			tStoreRecordB.setCenterCd(mCenterresult.get(0).getCenterCd());
			tStoreRecordB.setCenterAbbr(mCenterresult.get(0).getCenterAbbr());
			if(mWarehouse.getWarehouseId() != null){
				tStoreRecordB.setWarehouseCd(mWarehouseresult.get(0).getWarehouseCd());
				tStoreRecordB.setWarehouseAbbr(mWarehouseresult.get(0).getWarehouseAbbr());
			}
			// [#27]使用済の入庫ラベルNo.を除外 Start
			tStoreRecordB.setStoreLabelNo(storeLabelNoNumberingLogic.numbering());
			// [#27]使用済の入庫ラベルNo.を除外 End
			result.add(tStoreRecordB);
		}

		return result;
	}
}