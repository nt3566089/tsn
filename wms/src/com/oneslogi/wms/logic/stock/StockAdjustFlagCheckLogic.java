package com.oneslogi.wms.logic.stock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.TCorddtasrCB;
import com.oneslogi.base.dbflute.cbean.TCsrwhadmCB;
import com.oneslogi.base.dbflute.cbean.TInventoryInstCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TTrhanbaiinvCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MLocationBhv;
import com.oneslogi.base.dbflute.exbhv.TCorddtasrBhv;
import com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TTrhanbaiinvBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlStoringInventoryIncompletePmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlsortingInventoryIncompletePmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.TCorddtasr;
import com.oneslogi.base.dbflute.exentity.TCsrwhadm;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TTrhanbaiinv;
import com.oneslogi.base.dbflute.exentity.customize.SqlStoringInventoryIncomplete;
import com.oneslogi.base.dbflute.exentity.customize.SqlsortingInventoryIncomplete;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫調査区分チェックロジッククラス
 */
public class StockAdjustFlagCheckLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TCsrwhadmBhv tCsrwhadmBhv;
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;
	@Inject
	private TTrhanbaiinvBhv tTrhanbaiinvBhv;
	@Inject
	private TCorddtasrBhv tCorddtasrBhv;
	@Inject
	private MLocationBhv mLocationBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;

	/**
	 * 完了フラグコード定義
	 */
	protected static class CompleteFlag {
		/**
		 * 未完了
		 */
		protected static final String UNCOMPLETED = "0";
		/**
		 * 完了
		 */
		protected static final String COMPLETED = "1";
	}

	/**
	 * <h2>在庫.移動中数を取得する。</h2>
	 * <pre>
	 * 当該拠点且つ当該荷主且つロケーションマスタ.ロケーショングループが'02'(保管場)且つ在庫.移動中数>0の情報を取得する。
	 * 対象が見つかる場合、移動中数存在エラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param locationGroup ：ロケーショングループ
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void isMoveNumExist(Long centerId, Long clientId, String locationGroup, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		TStockCB cb= tStockBhv.newMyConditionBean();
		// ====== データ取得テーブル ======
		cb.setupSelect_MLocation();
		cb.setupSelect_MWarehouse();
		// ====== 検索条件 ======
		// ロケーショングループが'02'(保管場)の場合
		cb.query().queryMLocation().setLocgroup_Equal(locationGroup);
		// 拠点ID
		cb.query().queryMWarehouse().setCenterId_Equal(centerId);
		//荷主ID
		cb.query().setClientId_Equal(clientId);
		cb.query().setMoveNum_GreaterThan(WCC.ZERO);
		// ====== 検索実行 ======
		List<TStock> result = selectList(tStockBhv, cb);

		// ===== 件数チェック =====
		if (result.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.MOVING_STOCK_EXIST_ERROR);
		}
	}
	
	/**
	 * <h2>仕分拠点管理.仕分作業回数を取得する。</h2>
	 * <pre>
	 * 当該拠点且つシステム管理日付且つ仕分作業回数>0の条件に相応しい情報を取得する。
	 * 対象が見つかる場合、既に仕分一連処理を実施済みのエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param systemDt ：システム管理日付
	 * @param inventoryInstKbn ：在庫調査区分
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void isSroprtcntExist(Long centerId, String systemDt, String inventoryInstKbn, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		TCsrwhadmCB cb= tCsrwhadmBhv.newMyConditionBean();
		// ====== 検索条件 ======
		// 拠点ID
		cb.query().setCenterId_Equal(centerId);
		//荷主ID
		cb.query().setSrymd_Equal(systemDt);
		cb.query().setSroprtcnt_GreaterThan(Long.valueOf(0));
		// ====== 検索実行 ======
		List<TCsrwhadm> result = selectList(tCsrwhadmBhv, cb);
		
		// ===== 件数チェック =====
		switch(inventoryInstKbn) {
		case "01":
			if (result.size() > 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.SORTING_PROCESS_STARTED_ERROR);
			}
			break;
		case "02":
		case "03":
			if (result.size() == 0) {
				this.getErrorManager().add(errSts, WmsMessageConst.SORTING_PROCESS_UNSTARTED_ERROR);
			}
			break;
			default:
		}

	}
	
	/**
	 * <h2>仕分場(終了)データを取得する。</h2>
	 * <pre>
	 * 当該拠点且つ当該荷主且つシステム管理日付且つ棚卸指示が03'(仕分場(終了))の条件に相応しい情報を取得する。
	 * 対象が見つかる場合、終了後検品の指示キー作成済のエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param systemDt ：システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void isSortingLineWorkCompleted(Long centerId, Long clientId, String systemDt, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		TInventoryInstCB cb= tInventoryInstBhv.newMyConditionBean();
		// ====== データ取得テーブル ======
		cb.setupSelect_TInventoryH();
		// ====== 検索条件 ======
		// 拠点ID
		cb.query().queryTInventoryH().setCenterId_Equal(centerId);
		// 荷主ID
		cb.query().queryTInventoryH().setClientId_Equal(clientId);
		// 在庫調査区分
		cb.query().setInventoryInstKbn_Equal(CDef.InventoryInstKbn.$03.code());
		//システム管理日付
		cb.query().queryTInventoryH().setInventoryDt_Equal(systemDt);
		// ====== 検索実行 ======
		List<TInventoryInst> result = selectList(tInventoryInstBhv, cb);
		
		// ===== 件数チェック =====
		if (result.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.SORTING_LINE_WORK_COMPLETED_ERROR);
		}

	}
	
	/**
	 * <h2>さしずヘッダ.完了フラグデータを取得する。</h2>
	 * <pre>
	 * 当該拠点且つ当該荷主且つさしずヘッダ.完了フラグが'0'(未完了)且つさしずデータ(仕分中).ライン／ブロック=入力.ライン/ブロック且つさしずヘッダ.仕分作業回数>0の条件に相応しい情報を取得する。
	 * 対象が見つかる場合、方面指示終了確認のエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param linblk ：ライン/ブロック
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void isSortingProcessInCompleteLineBlock(Long centerId, Long clientId, String linblk, ErrorStatus errSts){
		// ====== セット品構成データ取得処理 =====
		TCorddtasrCB cb= tCorddtasrBhv.newMyConditionBean();
		// ====== データ取得テーブル ======
		cb.setupSelect_TCordhdr();
		// ====== 検索条件 ======
		// 拠点ID
		cb.query().queryTCordhdr().setCenterId_Equal(centerId);
		// 荷主ID
		cb.query().queryTCordhdr().setClientId_Equal(clientId);
		// 仕分作業回数>0
		cb.query().queryTCordhdr().setSroprtcnt_GreaterThan(Long.valueOf(0));
		// 完了フラグ = 未完了
		cb.query().queryTCordhdr().setCompleteFlg_Equal(CompleteFlag.UNCOMPLETED);
		//ライン／ブロック
		cb.query().setLinblk_Equal(linblk);
		// ====== 検索実行 ======
		List<TCorddtasr> result = selectList(tCorddtasrBhv, cb);
		
		// ===== 件数チェック =====
		if (result.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.SORTING_PROCESS_INCOMPLETE_LINE_BLOCK_ERROR);
		}
	}
	
	/**
	 * <h2>さしずヘッダ.完了フラグデータを取得する。</h2>
	 * <pre>
	 * 当該拠点且つ当該荷主且つ当該システム管理日付且つ販売物流在庫情報.適品・不適品区分='0'(適品)の条件に相応しい情報を取得する。
	 * 対象が見つからない場合、販売物流在庫情報未存在のエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param systemDt ：システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws ParseException 
	 */
	public void isHanbaiSuitableProductStockTypeUnreceived(Long centerId, Long clientId, String systemDt,String inventoryInstKbn, ErrorStatus errSts) throws ParseException{
		// ====== セット品構成データ取得処理 =====
		TTrhanbaiinvCB cb= tTrhanbaiinvBhv.newMyConditionBean();
		// ====== 検索条件 ======
		// 拠点ID
		cb.query().setCenterId_Equal(centerId);
		// 荷主ID
		cb.query().setClientId_Equal(clientId);
		// 在庫実績日 = システム管理日付
		String year = systemDt.substring(0, 4);
		String month = systemDt.substring(4, 6);
		String day = systemDt.substring(6, 8);
		String strTo = year + "-" + month + "-" + day + " 23:59:59";
		SimpleDateFormat formatTo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateTo = formatTo.parse(strTo);
		String strFrom = year + "-" + month + "-" + day + " 00:00:00";
		SimpleDateFormat formatFrom = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date dateFrom = formatFrom.parse(strFrom);
		cb.query().setStockdatetime_DateFromTo(dateFrom, dateTo);
		//在庫調査区分が'06'(不適品)の場合
		if(CDef.InventoryInstKbn.$06.code().equals(inventoryInstKbn)) {
			// 適品・不適品区分 = '9'(不適品)
			cb.query().setGooditemkbn_Equal(CDef.Gooditemkbn.$9.code());
		}else {
			// 適品・不適品区分 = '0'(適品)
			cb.query().setGooditemkbn_Equal(CDef.Gooditemkbn.$0.code());
		}

		//内外区分
		if(CDef.InventoryInstKbn.$05.code().equals(inventoryInstKbn)) {
			cb.query().setInoutkbn_Equal(CDef.Fcflg.$0001.code());
		}
		// ====== 検索実行 ======
		List<TTrhanbaiinv> result = selectList(tTrhanbaiinvBhv, cb);
		
		// ===== 件数チェック =====
		if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.HANBAI_SUITABLE_PRODUCT_STOCK_TYPE_UNRECEIVED_ERROR);
		}
	}
	
	/**
	 * <h2>保管場在庫調査の指示が作成されなかったデータを取得する。</h2>
	 * <pre>
	 * メインテーブル:ロケーションマスタ
	 * サブテーブル：①棚卸ヘッダ
	 * サブテーブル：②棚卸指示
	 * サブテーブル：③棚卸ボディ
	 * メインテーブルとサブテーブルを結合して、在庫調査の指示が作成されないデータを取得する。
	 * 対象が見つる場合、保管場在庫調査の指示が作成できない旨のエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param systemDt ：システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws ParseException 
	 */
	public void isStoringInventoryIncomplete(Long centerId, Long clientId, String systemDt, ErrorStatus errSts) throws ParseException{
		//外部sqlのパラメータを設定
		SqlStoringInventoryIncompletePmb pmb = new SqlStoringInventoryIncompletePmb();
		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setSystemDt(systemDt);
		//外部sql実行して、リスト取得する
		ListResultBean<SqlStoringInventoryIncomplete> result = mLocationBhv.outsideSql().selectList(mLocationBhv.PATH_selectSqlStoringInventoryIncomplete, pmb, SqlStoringInventoryIncomplete.class);
		// ===== 件数チェック =====
		if (result.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.STORING_INVENTORY_INCOMPLETE_ERROR);
		}
	}
	
	/**
	 * <h2>区分値マスタを単一検索、区分値明細IDを取得する。</h2>
	 * <pre>
	 * 区分値CD=SORTWAREHOUSECD且つ区分値明細CD＝入力.拠点の情報を取得する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param systemDt ：システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws ParseException 
	 */
	public BClassDtl selectClassMaster(String centerCd) {
		// ====== セット品構成データ取得処理 =====
		BClassDtlCB cb = bClassDtlBhv.newMyConditionBean();
		// ====== データ取得 ======
		cb.setupSelect_BClass();
		// ====== 検索条件 ======
		// 区分値CD
		cb.query().queryBClass().setClassCd_Equal("SORTWAREHOUSECD");
		// 荷主ID
		cb.query().setClassDtlCd_Equal(centerCd);
		// ====== 検索実行 ======
		BClassDtl entity = bClassDtlBhv.selectEntity(cb);
		return entity;
	}
	
	/**
	 * <h2>仕分場在庫調査(終了)の指示が作成されなかったデータを取得する。</h2>
	 * <pre>
	 * メインテーブル:ロケーションマスタ
	 * サブテーブル：①棚卸ヘッダ
	 * サブテーブル：②棚卸指示
	 * サブテーブル：③棚卸ボディ
	 * メインテーブルとサブテーブルを結合して、仕分場在庫調査(終了)の指示が作成されないデータを取得する。
	 * 対象が見つる場合、在庫調査指示が作成できない旨のエラーをエラーステータス情報に設定する。
	 * </pre>
	 * @param centerId ：拠点ID
	 * @param clientId ：荷主ID
	 * @param systemDt ：システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 * @throws ParseException 
	 */
	public void isSortingInventoryIncomplete(Long centerId, Long clientId, String systemDt, ErrorStatus errSts) {
		//外部sqlのパラメータを設定
		SqlsortingInventoryIncompletePmb pmb = new SqlsortingInventoryIncompletePmb();
		pmb.setCenterId(centerId);
		pmb.setClientId(clientId);
		pmb.setSystemDt(systemDt);
		//外部sql実行して、リスト取得する
		ListResultBean<SqlsortingInventoryIncomplete> result = mLocationBhv.outsideSql().selectList(mLocationBhv.PATH_selectSqlsortingInventoryIncomplete, pmb, SqlsortingInventoryIncomplete.class);
		// ===== 件数チェック =====
		if (result.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.SORTING_INVENTORY_INCOMPLETE_ERROR);
		}
	}
}
