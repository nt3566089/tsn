package com.oneslogi.wms.logic.inventory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.inject.Inject;

import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.BClassDtlCB;
import com.oneslogi.base.dbflute.cbean.MMfinvoperationCB;
import com.oneslogi.base.dbflute.cbean.TCsrwhadmCB;
import com.oneslogi.base.dbflute.cbean.TTrsymbolCB;
import com.oneslogi.base.dbflute.exbhv.BClassDtlBhv;
import com.oneslogi.base.dbflute.exbhv.MMfinvoperationBhv;
import com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv;
import com.oneslogi.base.dbflute.exbhv.TDrcdizqaBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryBBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryHBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryInstBhv;
import com.oneslogi.base.dbflute.exbhv.TInventoryRBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TTrassortorderBhv;
import com.oneslogi.base.dbflute.exbhv.TTrcasedetailBhv;
import com.oneslogi.base.dbflute.exbhv.TTrcaseinventoryBhv;
import com.oneslogi.base.dbflute.exbhv.TTrhanbaiinvBhv;
import com.oneslogi.base.dbflute.exbhv.TTrinvcorrectBhv;
import com.oneslogi.base.dbflute.exbhv.TTrmanufacturedatedetailBhv;
import com.oneslogi.base.dbflute.exbhv.TTrmanufacturedatehistoryBhv;
import com.oneslogi.base.dbflute.exbhv.TTrsymbolBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlDrcdizqaListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInventoryBInvCreatePmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlInventoryInfoOffsetPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTTrassortorderListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrCaseDetailListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvAssortListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvBackListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvBackOneRegistListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvDiffQtyCountryTaxListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvDiffQtyListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvList05Pmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvList06Pmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvListWithProductPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvNotObjectListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTrhanbaiinvRemoteIslandListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlgetStockHozeiListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlgetStockListAssortPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlgetStockListPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlgetStockListWithInvPmb;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlgetStockwarehoseListPmb;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MMfinvoperation;
import com.oneslogi.base.dbflute.exentity.TCsrwhadm;
import com.oneslogi.base.dbflute.exentity.TInventoryB;
import com.oneslogi.base.dbflute.exentity.TInventoryH;
import com.oneslogi.base.dbflute.exentity.TInventoryInst;
import com.oneslogi.base.dbflute.exentity.TInventoryR;
import com.oneslogi.base.dbflute.exentity.TTrassortorder;
import com.oneslogi.base.dbflute.exentity.TTrcasedetail;
import com.oneslogi.base.dbflute.exentity.TTrcaseinventory;
import com.oneslogi.base.dbflute.exentity.TTrinvcorrect;
import com.oneslogi.base.dbflute.exentity.TTrmanufacturedatedetail;
import com.oneslogi.base.dbflute.exentity.TTrmanufacturedatehistory;
import com.oneslogi.base.dbflute.exentity.TTrsymbol;
import com.oneslogi.base.dbflute.exentity.customize.SqlDrcdizqaList;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryBInvCreate;
import com.oneslogi.base.dbflute.exentity.customize.SqlInventoryInfoOffset;
import com.oneslogi.base.dbflute.exentity.customize.SqlTTrassortorderList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrCaseDetailList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvAssortList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvBackList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvBackOneRegistList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvDiffQtyCountryTaxList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvDiffQtyList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvList05;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvList06;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvListWithProduct;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvNotObjectList;
import com.oneslogi.base.dbflute.exentity.customize.SqlTrhanbaiinvRemoteIslandList;
import com.oneslogi.base.dbflute.exentity.customize.SqlgetStockHozeiList;
import com.oneslogi.base.dbflute.exentity.customize.SqlgetStockList;
import com.oneslogi.base.dbflute.exentity.customize.SqlgetStockListAssort;
import com.oneslogi.base.dbflute.exentity.customize.SqlgetStockListWithInv;
import com.oneslogi.base.dbflute.exentity.customize.SqlgetStockwarehoseList;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * 棚卸データ登録ロジッククラス
 */
public class InventoryCreateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TInventoryInstBhv tInventoryInstBhv;
	@Inject
	private TInventoryHBhv tInventoryHBhv;
	@Inject
	private TStockBhv tStockBhv;
	@Inject
	private TInventoryBBhv tInventoryBhv;
	
	@Inject
	private TInventoryRBhv tInventoryRBhv;
	@Inject
	private TTrsymbolBhv tTrsymbolBhv;
	@Inject
	private TTrcasedetailBhv tTrcasedetailBhv;
	@Inject
	private TTrassortorderBhv tTrassortorderBhv;
	@Inject
	private TTrinvcorrectBhv tTrinvcorrectBhv;
	@Inject
	private TTrcaseinventoryBhv tTrcaseinventoryBhv;
	@Inject
	private TDrcdizqaBhv tDrcdizqaBhv;
	@Inject
	private TCsrwhadmBhv tCsrwhadmBhv;
	@Inject
	private TTrhanbaiinvBhv tTrhanbaiinvBhv;
	@Inject
	private BClassDtlBhv bClassDtlBhv;
	@Inject
	private MMfinvoperationBhv mMfinvoperationBhv;
	@Inject
	private TTrmanufacturedatedetailBhv tTrmanufacturedatedetailBhv;
	@Inject
	private TTrmanufacturedatehistoryBhv tTrmanufacturedatehistoryBhv;
	
	// ===== 使用ロジック =====
	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	/**
	 * <h2>外出しSQL文の検索条件を設定する。</h2>
	 * <pre>
	 * 外出しSQL文の検索条件を設定する。
	 * </pre>
	 * @param tInventoryH 棚卸ヘッダ：棚卸日(From)・棚卸日(To)・荷主ID・センタID
	 * @param tInventoryInst 棚卸指示：預託ID・在庫区分ID・ロケーションCD(From)・ロケーションCD(To)
	 * @return SqlInstKeyListCountPmb 在庫調査指示一覧
	 */
	public void registerInventory(TInventoryInst tInventoryInst, MClientCenter clientCenter, MCenter center, MClient client, ErrorStatus errSts) {
		//最小ロケーションCD取得
		String fromLocationCd = tInventoryInst.getFromLocationCd() == null ? " " : tInventoryInst.getFromLocationCd(); 
		//最大ロケーションCD取得
		String toLocationCd = (tInventoryInst.getToLocationCd() == null || tInventoryInst.getToLocationCd().isEmpty()) 
				? "ZZZZZZZZZZZZ" : String.format("%-12s", tInventoryInst.getToLocationCd()).replace(" ", "Z");; 
		//変数棚卸情報リストの初期化
		List<TInventoryInst> tInventoryInstList = new ArrayList<TInventoryInst>();
		//在庫調査区分取得
		String inventoryInstKbn = tInventoryInst.getInventoryInstKbn() == null ? "" : tInventoryInst.getInventoryInstKbn();
		//拠点区分取得
		String centerKbn = clientCenter.getMParamAsOne() == null ? "" : clientCenter.getMParamAsOne().getCenterKbn();
		//在庫調査指示キー
		String instKey = "";
		switch(inventoryInstKbn) {
			case "00": //(保管場)の場合
					switch(centerKbn) {
						case "0": //(保税)の場合
							//外部sqlのパラメータを設定
							SqlgetStockHozeiListPmb hozeiListPmb = new SqlgetStockHozeiListPmb();
							hozeiListPmb.setCenterId(clientCenter.getCenterId());
							hozeiListPmb.setClientId(clientCenter.getClientId());
							hozeiListPmb.setLocGroup(tInventoryInst.getLocationGrp());
							hozeiListPmb.setLocationCd_PrefixSearch(tInventoryInst.getLocationCd());
							hozeiListPmb.setFromLocationCd(fromLocationCd);
							hozeiListPmb.setToLocationCd(toLocationCd);
							//外部sql実行して、リスト取得する
							ListResultBean<SqlgetStockHozeiList> hozeiListResult = tStockBhv.outsideSql().selectList(tStockBhv.PATH_selectSqlgetStockHozeiList, hozeiListPmb, SqlgetStockHozeiList.class);
							// ===== 件数チェック =====
							if (hozeiListResult.size() == 0) {
								this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
								return;
							}else {
								for(SqlgetStockHozeiList entity : hozeiListResult) {
									TInventoryInst inst = new TInventoryInst();
									//ロケーションID
									inst.setLocationId(entity.getLid());
									//商品ID
									inst.setProductionId(entity.getPid());
									//引当可能数
									inst.setSumcharge(entity.getSumcharge());
									//引当済数
									inst.setSumalloc(entity.getSumalloc());
									//移動中数
									inst.setMoveNum(WCC.ZERO);
									//銘柄CD
									inst.setProductCd(entity.getPcd());
									//商社搬入番号
									inst.setLot1(entity.getLot1());
									//製造年月日
									inst.setLot4(entity.getLot4());
									//製造記号
									inst.setLot2(entity.getLot2());
									tInventoryInstList.add(inst);
								}
							}
							
							break;
						case "1": //(倉庫)の場合
							SqlgetStockwarehoseListPmb warehoseListPmb = new SqlgetStockwarehoseListPmb();
							warehoseListPmb.setCenterId(clientCenter.getCenterId());
							warehoseListPmb.setClientId(clientCenter.getClientId());
							warehoseListPmb.setLocationCd_PrefixSearch(tInventoryInst.getLocationCd());
							warehoseListPmb.setFromLocationCd(fromLocationCd);
							warehoseListPmb.setToLocationCd(toLocationCd);
							//外部sql実行して、リスト取得する
							ListResultBean<SqlgetStockwarehoseList> warehoseListResult = tStockBhv.outsideSql().selectList(tStockBhv.PATH_selectSqlgetStockwarehoseList, warehoseListPmb, SqlgetStockwarehoseList.class);
							// ===== 件数チェック =====
							if (warehoseListResult.size() == 0) {
								this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
								return;
							}else {
								for(SqlgetStockwarehoseList entity : warehoseListResult) {
									TInventoryInst inst = new TInventoryInst();
									//ロケーションID
									inst.setLocationId(entity.getLid());
									//商品ID
									inst.setProductionId(entity.getPid());
									//引当可能数
									inst.setSumcharge(entity.getSumcharge());
									//引当済数
									inst.setSumalloc(entity.getSumalloc());
									//移動中数
									inst.setMoveNum(WCC.ZERO);
									//銘柄CD
									inst.setProductCd(entity.getPcd());
									tInventoryInstList.add(inst);
								}
							}
						default:
					}
				break;
			case "01": //仕分場(開始)の場合
			case "03": //仕分場(終了)の場合
				//在庫調査補正情報修正
				SqlInventoryInfoOffsetPmb offsetPmb = new SqlInventoryInfoOffsetPmb();
				offsetPmb.setCenterId(clientCenter.getCenterId());
				offsetPmb.setClientId(clientCenter.getClientId());
				offsetPmb.setSystemDt(clientCenter.getSystemDt());
				//外部sql実行して、リスト取得する
				ListResultBean<SqlInventoryInfoOffset> offsetResult = tInventoryHBhv.outsideSql().selectList(tInventoryHBhv.PATH_selectSqlInventoryInfoOffset, offsetPmb, SqlInventoryInfoOffset.class);
				if (offsetResult.size() > 0) {
					//ダミーケースコードリスト
					List<Long> tempCaseCodeList = new ArrayList<Long>();
					//ダミーケース明細番号リスト
					List<Integer> tempCaseDetailNoList = new ArrayList<Integer>();
					//ダミーさしず番号リスト
					List<String> tempInstNoList = new ArrayList<String>();
					for(SqlInventoryInfoOffset entity : offsetResult) {
						//在庫調査補正情報.挿入ダミーケースCDがNULL以外の場合,在庫調査補正情報.挿入ダミーケースCDを変数.ダミーケースコードリストに追加(add)する。
						if(entity.getOffsetcasecd() != null) {
							tempCaseCodeList.add(entity.getOffsetcasecd().longValue());
						}
						//在庫調査補正情報.挿入ダミー分割ケースCDがNULL以外の場合,在庫調査補正情報.挿入ダミー分割ケースCDを変数.ダミーケースコードリストに追加(add)する。
						if(entity.getOffsetcutcasecd() != null) {
							tempCaseCodeList.add(entity.getOffsetcutcasecd().longValue());
						}
						//在庫調査補正情報.挿入ダミーケース明細番号がNULL以外の場合,在庫調査補正情報.挿入ダミーケース明細番号を変数.ダミーケース明細番号リストに追加(add)する。
						if(entity.getOffsetdtlno() != null) {
							tempCaseDetailNoList.add(entity.getOffsetdtlno().intValue());
						}
						//在庫調査補正情報.挿入ダミーさしず番号がNULL以外の場合,在庫調査補正情報.挿入ダミーさしず番号+','+在庫調査補正情報.挿入ダミーさしず実績枝番号を変数.ダミーさしず番号リストに追加(add)する。
						if(entity.getOffsetinstno() != null) {
							tempInstNoList.add(entity.getOffsetinstno().toString() + "," + entity.getOffsetinstbranchno().toString());
						}
					}
					//ケース情報を取得する
					TTrsymbolCB tTrsymbolCB = tTrsymbolBhv.newMyConditionBean();
					// ====== データ取得テーブル ======
					tTrsymbolCB.specify().columnTrsymbolId();
					tTrsymbolCB.specify().columnVersionNo();
					// ====== 検索条件 ======
					tTrsymbolCB.query().setCenterId_Equal(clientCenter.getCenterId());
					tTrsymbolCB.query().setClientId_Equal(clientCenter.getClientId());
					tTrsymbolCB.query().setCasecd_InScope(tempCaseCodeList);
					// ====== 検索実行 ======
					List<TTrsymbol> tTrsymbolList = selectList(tTrsymbolBhv, tTrsymbolCB);
					for(TTrsymbol entity : tTrsymbolList) {
						entity.setDelFlg_$1();
					}
					if(tTrsymbolList.size() > 0) {
						//段ボール情報削除(T_TRSYMBOL).更新
						tTrsymbolBhv.batchUpdate(tTrsymbolList);
					}
					
					//ケース明細情報を取得する
					SqlTrCaseDetailListPmb caseDetailListPmb = new SqlTrCaseDetailListPmb();
					caseDetailListPmb.setCenterId(clientCenter.getCenterId());
					caseDetailListPmb.setClientId(clientCenter.getClientId());
					caseDetailListPmb.setTempCaseDetailNoList(tempCaseDetailNoList);
					//外部sql実行して、リスト取得する
					ListResultBean<SqlTrCaseDetailList> caseDetailList = tTrcasedetailBhv.outsideSql().selectList(tTrcasedetailBhv.PATH_selectSqlTrCaseDetailList, caseDetailListPmb, SqlTrCaseDetailList.class);
					List<TTrcasedetail> tTrcasedetailEntityList = new ArrayList<TTrcasedetail>();
					for(SqlTrCaseDetailList caseDetail : caseDetailList) {
						TTrcasedetail entity = new TTrcasedetail();
						entity.setTrcasedetailId(caseDetail.getTrcasedetailId());
						entity.setVersionNo(caseDetail.getVersionNo());
						entity.setDelFlg_$1();
						tTrcasedetailEntityList.add(entity);
					}
					if(tTrcasedetailEntityList.size() > 0) {
						//ケース明細情報削除(T_TRCASEDETAIL).更新
						tTrcasedetailBhv.batchUpdate(tTrcasedetailEntityList);
					}
					//追跡情報(棚卸)を取得する
					SqlTTrassortorderListPmb trassortorderListPmb = new SqlTTrassortorderListPmb();
					trassortorderListPmb.setWarehouseCd(center.getCenterCd());
					trassortorderListPmb.setTempInstNoList(tempInstNoList);
					//外部sql実行して、リスト取得する
					ListResultBean<SqlTTrassortorderList> trassortorderList = tTrassortorderBhv.outsideSql().selectList(tTrassortorderBhv.PATH_selectSqlTTrassortorderList, trassortorderListPmb, SqlTTrassortorderList.class);
					if(trassortorderList.size() > 0) {
						List<TTrassortorder> tTrassortorderList = new ArrayList<TTrassortorder>();
						for(SqlTTrassortorderList trassortorder : trassortorderList) {
							TTrassortorder tTrassortorderEntity = new TTrassortorder();
							tTrassortorderEntity.setDirectionordergno(trassortorder.getDirectionordergno());
							tTrassortorderEntity.setDirectionorderkey(trassortorder.getDirectionorderkey());
							tTrassortorderEntity.setVersionNo(trassortorder.getVersionNo());
							tTrassortorderEntity.setDelFlg_$1();
							tTrassortorderList.add(tTrassortorderEntity);
						}
						//追跡情報(棚卸)削除(T_TRASSORTORDER).更新
						tTrassortorderBhv.batchUpdate(tTrassortorderList);
					}
					List<TTrinvcorrect> tTrinvcorrectList = new ArrayList<TTrinvcorrect>();
					List<TTrcaseinventory> tTrcaseinventoryList = new ArrayList<TTrcaseinventory>();
					for(SqlInventoryInfoOffset offset : offsetResult) {
						//在庫調査補正情報
						TTrinvcorrect tTrinvcorrectEntity = new TTrinvcorrect();
						tTrinvcorrectEntity.setTrinvcorrectId(offset.getOffsetid());
						tTrinvcorrectEntity.setPutdmycasecd(offset.getOffsetcasecd());
						tTrinvcorrectEntity.setPutdmycutcasecd(offset.getOffsetcutcasecd());
						tTrinvcorrectEntity.setPutdmycasedetailno(offset.getOffsetdtlno());
						tTrinvcorrectEntity.setPutdmydirectionno(offset.getOffsetinstno());
						tTrinvcorrectEntity.setPutdmydirectionordergno(offset.getOffsetinstbranchno());
						tTrinvcorrectEntity.setVersionNo(offset.getOffsetversion());
						tTrinvcorrectEntity.setDelFlg_$1();
						tTrinvcorrectList.add(tTrinvcorrectEntity);
						//ケース在庫調査情報
						TTrcaseinventory tTrcaseinventoryEntity = new TTrcaseinventory();
						tTrcaseinventoryEntity.setTrcaseinventoryId(offset.getInfoid());
						tTrcaseinventoryEntity.setVersionNo(offset.getInfoversion());
						tTrcaseinventoryEntity.setDelFlg_$1();
						tTrcaseinventoryList.add(tTrcaseinventoryEntity);
					}
					//在庫調査補正情報削除(T_TRINVCORRECT).更新
					tTrinvcorrectBhv.batchUpdate(tTrinvcorrectList);
					//ケース在庫調査情報削除(T_TRCASEINVENTORY).更新
					tTrcaseinventoryBhv.batchUpdate(tTrcaseinventoryList);
				}
				//在庫情報リストを取得する
				SqlgetStockListPmb stockListPmb = new SqlgetStockListPmb();
				stockListPmb.setCenterId(clientCenter.getCenterId());
				stockListPmb.setClientId(clientCenter.getClientId());
				stockListPmb.setLineBlock_PrefixSearch(tInventoryInst.getLineBlock());
				stockListPmb.setFromLocationCd(fromLocationCd);
				stockListPmb.setToLocationCd(toLocationCd);
				stockListPmb.setLocationCd_PrefixSearch(tInventoryInst.getLocationCd());
				//外部sql実行して、リスト取得する
				ListResultBean<SqlgetStockList> stockList = tStockBhv.outsideSql().selectList(tStockBhv.PATH_selectSqlgetStockList, stockListPmb, SqlgetStockList.class);
				if(stockList.size() == 0) {
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return;
				}else {
					for(SqlgetStockList stock : stockList) {
						TInventoryInst entiy = new TInventoryInst();
						entiy.setLocationId(stock.getLid());
						entiy.setProductionId(stock.getPid());
						entiy.setSumcharge(stock.getSumcharge());
						entiy.setSumalloc(stock.getSumalloc());
						entiy.setMoveNum(WCC.ZERO);
						entiy.setProductCd(stock.getPcd());
						tInventoryInstList.add(entiy);
					}
				}
				break;
			case "02": //仕分場(中間)の場合
				//方面ピストン変数の初期化
				String piston = (tInventoryInst.getDirectionalPistonText() == null || tInventoryInst.getDirectionalPistonText().length() != 5) ? 
						tInventoryInst.getDirectionalPistonDropdown() : tInventoryInst.getDirectionalPistonText();
				//方面別残数リストを取得する
				SqlDrcdizqaListPmb drcdizqaListPmb = new SqlDrcdizqaListPmb();
				drcdizqaListPmb.setCenterId(clientCenter.getCenterId());
				drcdizqaListPmb.setClientId(clientCenter.getCenterId());
				drcdizqaListPmb.setLineBlock(tInventoryInst.getLineBlock());
				drcdizqaListPmb.setDed(piston.substring(0, Math.min(piston.length(), 4)));
				drcdizqaListPmb.setPstnid(piston.substring(Math.min(piston.length() - 1, 3),Math.min(piston.length(), 5)));
				//外部sql実行して、リスト取得する
				ListResultBean<SqlDrcdizqaList> drcdizqaList = tDrcdizqaBhv.outsideSql().selectList(tDrcdizqaBhv.PATH_selectSqlDrcdizqaList, drcdizqaListPmb, SqlDrcdizqaList.class);
				if(drcdizqaList.size() == 0) {
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return;
				}else {
					for(SqlDrcdizqaList drcdizqa : drcdizqaList) {
						TInventoryInst entiy = new TInventoryInst();
						entiy.setDirectionalPiston(drcdizqa.getDed() + drcdizqa.getPstnid());
						entiy.setSortingOrder(drcdizqa.getSrrnk().toString());
						entiy.setLocationId(drcdizqa.getLocationId());
						entiy.setProductionId(drcdizqa.getProductId());
						entiy.setSumcharge(BigDecimal.valueOf(drcdizqa.getZqacp()).multiply(drcdizqa.getUnit1()).multiply(drcdizqa.getUnit2()).
								add(BigDecimal.valueOf(drcdizqa.getZqactqa()).multiply(drcdizqa.getUnit2())));
						entiy.setSumalloc(WCC.ZERO);
						entiy.setMoveNum(WCC.ZERO);
						entiy.setProductCd(drcdizqa.getZzmatnr());
						entiy.setSortingWrokNumtimes(drcdizqa.getSroprtcnt());
						tInventoryInstList.add(entiy);
					}
				}
				break;
			case "04": //(引取場)の場合
				TCsrwhadmCB csrwhadmCb = new TCsrwhadmCB();
				csrwhadmCb.specify().columnSrymd();
				csrwhadmCb.query().setCenterId_Equal(clientCenter.getCenterId());
				csrwhadmCb.query().setZzorgncd_Equal(center.getCenterCd());
				TCsrwhadm csrwhadmEntity = tCsrwhadmBhv.selectEntity(csrwhadmCb);
				if(csrwhadmEntity == null) {
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return;
				}
				SqlTrhanbaiinvListWithProductPmb trhanbaiinvListWithProductPmb = new SqlTrhanbaiinvListWithProductPmb();
				trhanbaiinvListWithProductPmb.setCenterId(clientCenter.getCenterId());
				trhanbaiinvListWithProductPmb.setClientId(clientCenter.getClientId());
				trhanbaiinvListWithProductPmb.setProductCd_PrefixSearch(tInventoryInst.getProductCd());
				trhanbaiinvListWithProductPmb.setSystemDt(clientCenter.getSystemDt());
				//外部sql実行して、リスト取得する
				ListResultBean<SqlTrhanbaiinvListWithProduct> trhanbaiinvListWithProductList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvListWithProduct, trhanbaiinvListWithProductPmb, SqlTrhanbaiinvListWithProduct.class);
				if(trhanbaiinvListWithProductList.size() == 0) {
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return;
				}
				SqlgetStockListWithInvPmb stockListWithInvPmb = new SqlgetStockListWithInvPmb();
				stockListWithInvPmb.setCenterId(clientCenter.getCenterId());
				stockListWithInvPmb.setClientId(clientCenter.getClientId());
				stockListWithInvPmb.setSystemDt(clientCenter.getSystemDt());
				//外部sql実行して、保管場在庫情報リスト取得する
				ListResultBean<SqlgetStockListWithInv> stockListWithInvList = tStockBhv.outsideSql().selectList(tStockBhv.PATH_selectSqlgetStockListWithInv, stockListWithInvPmb, SqlgetStockListWithInv.class);
				SqlgetStockListAssortPmb stockListAssortPmb = new SqlgetStockListAssortPmb();
				stockListAssortPmb.setCenterId(clientCenter.getCenterId());
				stockListAssortPmb.setClientId(clientCenter.getClientId());
				stockListAssortPmb.setSystemDt(clientCenter.getSystemDt());
				//外部sql実行して、仕分場在庫情報リスト取得する
				ListResultBean<SqlgetStockListAssort> stockListAssortList = tStockBhv.outsideSql().selectList(tStockBhv.PATH_selectSqlgetStockListAssort, stockListAssortPmb, SqlgetStockListAssort.class);
				SqlTrhanbaiinvAssortListPmb trhanbaiinvAssortListPmb = new SqlTrhanbaiinvAssortListPmb();
				trhanbaiinvAssortListPmb.setCenterCd(center.getCenterCd());
				trhanbaiinvAssortListPmb.setCenterId(clientCenter.getCenterId());
				trhanbaiinvAssortListPmb.setClientId(clientCenter.getClientId());
				trhanbaiinvAssortListPmb.setSrymd(csrwhadmEntity.getSrymd());
				trhanbaiinvAssortListPmb.setSystemDt(clientCenter.getSystemDt());
				//外部sql実行して、仮置場在庫仕分済品リスト取得する
				ListResultBean<SqlTrhanbaiinvAssortList> assortList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvAssortList, trhanbaiinvAssortListPmb, SqlTrhanbaiinvAssortList.class);
				SqlTrhanbaiinvRemoteIslandListPmb remoteIslandListPmb = new SqlTrhanbaiinvRemoteIslandListPmb();
				remoteIslandListPmb.setCenterCd(center.getCenterCd());
				remoteIslandListPmb.setCenterId(clientCenter.getCenterId());
				remoteIslandListPmb.setClientId(clientCenter.getClientId());
				remoteIslandListPmb.setSrymd(csrwhadmEntity.getSrymd());
				remoteIslandListPmb.setSystemDt(clientCenter.getSystemDt());
				//外部sql実行して、離島在庫情報リスト取得する
				ListResultBean<SqlTrhanbaiinvRemoteIslandList> remoteIslandList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvRemoteIslandList, remoteIslandListPmb, SqlTrhanbaiinvRemoteIslandList.class);
				//変数.保管場在庫情報初期化
				Map<String, BigDecimal> stockListWithInvMap = new HashMap<String, BigDecimal>();
				for(SqlgetStockListWithInv stockListWithInv : stockListWithInvList) {
					stockListWithInvMap.put(stockListWithInv.getPcd(), stockListWithInv.getTotal());
				}
				//変数.仕分場在庫情報
				Map<String, BigDecimal> stockListAssortMap = new HashMap<String, BigDecimal>();
				for(SqlgetStockListAssort stockListAssort : stockListAssortList) {
					stockListAssortMap.put(stockListAssort.getPcd(), stockListAssort.getTotal());
				}
				//変数.仮置場在庫仕分済品情報
				Map<String, BigDecimal> assortMap = new HashMap<String, BigDecimal>();
				for(SqlTrhanbaiinvAssortList assort : assortList) {
					assortMap.put(assort.getPcd(), assort.getTotal());
				}
				//変数.離島在庫情報
				Map<String, BigDecimal> remoteIslandMap = new HashMap<String, BigDecimal>();
				for(SqlTrhanbaiinvRemoteIslandList remoteIsland : remoteIslandList) {
					remoteIslandMap.put(remoteIsland.getPcd(), remoteIsland.getTotal());
				}
				//販売物流在庫情報リスト
				for(SqlTrhanbaiinvListWithProduct result : trhanbaiinvListWithProductList) {
					BigDecimal minusCount = WCC.ZERO;
					for(Entry<String, BigDecimal> entry : stockListWithInvMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							minusCount.add(entry.getValue());
						}
					}
					for(Entry<String, BigDecimal> entry : stockListAssortMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							minusCount.add(entry.getValue());
						}
					}
					for(Entry<String, BigDecimal> entry : assortMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							minusCount.add(entry.getValue());
						}
					}
					for(Entry<String, BigDecimal> entry : remoteIslandMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							minusCount.add(entry.getValue());
						}
					}
					TInventoryInst entiy = new TInventoryInst();
					entiy.setProductionId(result.getPid());
					entiy.setSumcharge(BigDecimal.valueOf(result.getTotal()).subtract(minusCount));
					entiy.setSumalloc(WCC.ZERO);
					entiy.setMoveNum(WCC.ZERO);
					entiy.setProductCd(result.getPcd());
				}
				break;
			case "05": //(かし品)の場合
				SqlTrhanbaiinvList05Pmb trhanbaiinvList05Pmb = new SqlTrhanbaiinvList05Pmb();
				trhanbaiinvList05Pmb.setCenterId(clientCenter.getCenterId());
				trhanbaiinvList05Pmb.setClientId(clientCenter.getClientId());
				trhanbaiinvList05Pmb.setProductCd_PrefixSearch(tInventoryInst.getProductCd());
				trhanbaiinvList05Pmb.setSystemDt(clientCenter.getSystemDt());
				ListResultBean<SqlTrhanbaiinvList05> inv05List = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvList05, trhanbaiinvList05Pmb, SqlTrhanbaiinvList05.class);
				if(inv05List.size() == 0) {
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return;
				}else {
					for(SqlTrhanbaiinvList05 result : inv05List) {
						TInventoryInst entiy = new TInventoryInst();
						entiy.setProductionId(result.getPid());
						entiy.setSumcharge(BigDecimal.valueOf(result.getTotal()));
						entiy.setSumalloc(WCC.ZERO);
						entiy.setMoveNum(WCC.ZERO);
						entiy.setProductCd(result.getPcd());
						tInventoryInstList.add(entiy);
					}
				}
				break;
			case "06": //(不適品)の場合
				//内外区分初期化
				String inoutKbn = "0000".equals(tInventoryInst.getProductDivision()) ? "0001" : tInventoryInst.getProductDivision();
				//年月初期化
				String yearMonth = clientCenter.getSystemDt().substring(0, 6);
				//販売物流在庫情報リストを取得する
				SqlTrhanbaiinvList06Pmb trhanbaiinvList06Pmb = new SqlTrhanbaiinvList06Pmb();
				trhanbaiinvList06Pmb.setCenterId(clientCenter.getCenterId());
				trhanbaiinvList06Pmb.setClientId(clientCenter.getClientId());
				trhanbaiinvList06Pmb.setInoutKbn(inoutKbn);
				trhanbaiinvList06Pmb.setSystemDt(clientCenter.getSystemDt());
				ListResultBean<SqlTrhanbaiinvList06> inv06List = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvList06, trhanbaiinvList06Pmb, SqlTrhanbaiinvList06.class);
				if(inv06List.size() == 0) {
					this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
					return;
				}
				//過不足計(返品)情報リストを取得する
				SqlTrhanbaiinvDiffQtyListPmb trhanbaiinvDiffQtyListPmb = new SqlTrhanbaiinvDiffQtyListPmb();
				trhanbaiinvDiffQtyListPmb.setCenterId(clientCenter.getCenterId());
				trhanbaiinvDiffQtyListPmb.setClientId(clientCenter.getCenterId());
				trhanbaiinvDiffQtyListPmb.setInoutKbn(inoutKbn);
				trhanbaiinvDiffQtyListPmb.setSystemDt(clientCenter.getSystemDt());
				trhanbaiinvDiffQtyListPmb.setYearMoth01(yearMonth + "01");
				ListResultBean<SqlTrhanbaiinvDiffQtyList> diffQtyList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvDiffQtyList, trhanbaiinvDiffQtyListPmb, SqlTrhanbaiinvDiffQtyList.class);
				//From日付初期化
				String fromDate = yearMonth + "01";
				//区分値明細CDを取得する
				BClassDtlCB classDtlcb = bClassDtlBhv.newMyConditionBean();
				// ====== データ取得 ======
				classDtlcb.setupSelect_BClass();
				// ====== 検索条件 ======
				// 区分値CD
				classDtlcb.query().queryBClass().setClassCd_Equal("SETTLEMENTINVMONTH");
				classDtlcb.query().setClassDtlCd_Equal(clientCenter.getSystemDt().substring(4, 5));
				BClassDtl classEntity = bClassDtlBhv.selectEntity(classDtlcb);
				if(classEntity == null) {
					return;
				}
				//たな卸実施日リストを取得する
				MMfinvoperationCB mfinvoperationCB = new MMfinvoperationCB();
				mfinvoperationCB.specify().columnInvDate();
				mfinvoperationCB.query().setCenterId_Equal(clientCenter.getCenterId());
				mfinvoperationCB.query().setClientId_Equal(clientCenter.getClientId());
				mfinvoperationCB.query().setInvDate_PrefixSearch(clientCenter.getSystemDt().substring(0, 6));
				mfinvoperationCB.query().addOrderBy_InvDate_Asc();
				List<MMfinvoperation> mMfinvoperationList = selectList(mMfinvoperationBhv, mfinvoperationCB);
				if(mMfinvoperationList.size() > 0 && (mMfinvoperationList.get(0).getInvDate().compareTo(clientCenter.getSystemDt()) < 0)) {
					String tempDate = mMfinvoperationList.get(0).getInvDate();
					int year = Integer.valueOf(tempDate.substring(0, 4));
					int month = Integer.valueOf(tempDate.substring(4, 6));
					int day = Integer.valueOf(tempDate.substring(6, 8));
					LocalDate localDate = LocalDate.of(year, month, day);
					//変数.From日付にたな卸実施日+1を設定する
					fromDate = localDate.plusDays(1).toString();
				}
				//過不足計(国税還付品)情報リストを取得する
				SqlTrhanbaiinvDiffQtyCountryTaxListPmb diffQtyCountryTaxListPmb = new SqlTrhanbaiinvDiffQtyCountryTaxListPmb();
				diffQtyCountryTaxListPmb.setCenterId(clientCenter.getCenterId());
				diffQtyCountryTaxListPmb.setClientId(clientCenter.getClientId());
				diffQtyCountryTaxListPmb.setInoutKbn(inoutKbn);
				diffQtyCountryTaxListPmb.setSystemDt(clientCenter.getSystemDt());
				diffQtyCountryTaxListPmb.setYearMoth01(fromDate);
				ListResultBean<SqlTrhanbaiinvDiffQtyCountryTaxList> diffQtyCountryTaxList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvDiffQtyCountryTaxList, diffQtyCountryTaxListPmb, SqlTrhanbaiinvDiffQtyCountryTaxList.class);
				//り災品情報リストを取得する
				SqlTrhanbaiinvBackListPmb trhanbaiinvBackListPmb = new SqlTrhanbaiinvBackListPmb();
				trhanbaiinvBackListPmb.setCenterId(clientCenter.getCenterId());
				trhanbaiinvBackListPmb.setClientId(clientCenter.getClientId());
				trhanbaiinvBackListPmb.setInoutKbn(inoutKbn);
				trhanbaiinvBackListPmb.setSystemDt(clientCenter.getSystemDt());
				trhanbaiinvBackListPmb.setYearMoth01(yearMonth + "01");
				ListResultBean<SqlTrhanbaiinvBackList> backList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvBackList, trhanbaiinvBackListPmb, SqlTrhanbaiinvBackList.class);
				
				//不適品ラベル作成個装数情報リストを取得する
				SqlTrhanbaiinvNotObjectListPmb notObjectListPmb = new SqlTrhanbaiinvNotObjectListPmb();
				notObjectListPmb.setCenterId(clientCenter.getCenterId());
				notObjectListPmb.setClientId(clientCenter.getClientId());
				notObjectListPmb.setInoutKbn(inoutKbn);
				notObjectListPmb.setSystemDt(clientCenter.getSystemDt());
				notObjectListPmb.setYearMoth01(yearMonth);
				ListResultBean<SqlTrhanbaiinvNotObjectList> notObjectList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvNotObjectList, notObjectListPmb, SqlTrhanbaiinvNotObjectList.class);
				
				//一括登録個装数情報リストを取得する
				SqlTrhanbaiinvBackOneRegistListPmb backOneRegistListPmb = new SqlTrhanbaiinvBackOneRegistListPmb();
				backOneRegistListPmb.setCenterId(clientCenter.getCenterId());
				backOneRegistListPmb.setClientId(clientCenter.getClientId());
				backOneRegistListPmb.setInoutKbn(inoutKbn);
				backOneRegistListPmb.setSystemDt(clientCenter.getSystemDt());
				ListResultBean<SqlTrhanbaiinvBackOneRegistList> backOneRegistList = tTrhanbaiinvBhv.outsideSql().selectList(tTrhanbaiinvBhv.PATH_selectSqlTrhanbaiinvBackOneRegistList, backOneRegistListPmb, SqlTrhanbaiinvBackOneRegistList.class);
				
				//過不足計(返品)情報
				Map<String,Long> returnItemMap = new HashMap<String, Long>();
				//過不足計(国税還付品)情報
				Map<String,Long> taxMap = new HashMap<String, Long>();
				//り災品情報
				Map<String,Long> backItemMap = new HashMap<String, Long>();
				//不適品ラベル作成個装数情報
				Map<String,Long> badItemMap = new HashMap<String, Long>();
				//一括登録個装数情報
				Map<String,Long> registItemMap = new HashMap<String, Long>();
				for(SqlTrhanbaiinvDiffQtyList result : diffQtyList) {
					returnItemMap.put(result.getPcd(), result.getTotal().longValue());
				}
				for(SqlTrhanbaiinvDiffQtyCountryTaxList result : diffQtyCountryTaxList) {
					taxMap.put(result.getPcd(), result.getTotal().longValue());
				}
				for(SqlTrhanbaiinvBackList result : backList) {
					backItemMap.put(result.getPcd(), result.getTotal().longValue());
				}
				for(SqlTrhanbaiinvNotObjectList result : notObjectList) {
					badItemMap.put(result.getPcd(), result.getTotal().longValue());
				}
				for(SqlTrhanbaiinvBackOneRegistList result : backOneRegistList) {
					registItemMap.put(result.getPcd(), result.getTotal().longValue());
				}
				for(SqlTrhanbaiinvList06 result : inv06List) {
					TInventoryInst entity = new TInventoryInst();
					entity.setSumcharge(BigDecimal.valueOf(result.getTotal()));
					entity.setSumalloc(WCC.ZERO);
					entity.setMoveNum(WCC.ZERO);
					entity.setProductionId(result.getPid());
					entity.setProductCd(result.getPcd());
					entity.setInoutKbn(result.getInoutkbn());
					for(Entry<String, Long> entry : returnItemMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							entity.setRetrunTotal(entry.getValue());
						}
					}
					for(Entry<String, Long> entry : taxMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							entity.setTaxlessTotal(entry.getValue());
						}
					}
					for(Entry<String, Long> entry : backItemMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							entity.setBackTotal(entry.getValue());
						}
					}
					for(Entry<String, Long> entry : badItemMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							entity.setNotObjectTotal(entry.getValue());
						}
					}
					for(Entry<String, Long> entry : registItemMap.entrySet()) {
						if(result.getPcd().equals(entry.getKey())) {
							entity.setRegistTotal(entry.getValue());
						}
					}
					entity.setTaxTotal(result.getTaxtota());
					tInventoryInstList.add(entity);
				}
				
				break;
			default:
		}
		//拠点採番マスタからWMS棚卸バッチNo.を取得する
		String numberTake = numberingCenterLogic.getNumbering(clientCenter.getCenterId(), WmsNumberingConst.INVENTORY_BATCH_NUM);
		if(numberTake == null || numberTake.isEmpty()) {
			this.getErrorManager().add(errSts, WmsMessageConst.NUMBERING_CENTER_NOT_FOUND_ERROR);
			return;
		}
		//在庫調査指示キー初期化
		instKey = String.format("%10s", numberTake).replace(" ", "0");
		//棚卸ヘッダデータの登録
		TInventoryH tInventoryH = new TInventoryH();
		tInventoryH.setClientId(clientCenter.getClientId());
		tInventoryH.setCenterId(clientCenter.getCenterId());
		tInventoryH.setBatchNum(Long.valueOf(numberTake));
		tInventoryH.setInventoryDt(clientCenter.getSystemDt());
		tInventoryH.setInventoryKey(Long.valueOf(instKey));
		tInventoryHBhv.insert(tInventoryH);
		Long headId = tInventoryH.getInventoryHId();
		//棚卸ボディデータを登録
		List<TInventoryB> bodyList = new ArrayList<TInventoryB>();
		for(TInventoryInst entity : tInventoryInstList) {
			TInventoryB body = new TInventoryB();
			body.setInventoryHId(headId);
			body.setProductId(entity.getProductionId());
			body.setLocationId(entity.getLocationId());
			body.setChargeNum(entity.getSumcharge());
			body.setAllocNum(entity.getSumalloc());
			body.setMoveNum(entity.getMoveNum());
			body.setInventoryNum(WCC.ZERO);
			body.setInputType_$00();
			body.setStockAdjustFlg_$0();
			body.setProductCd(entity.getProductCd());
			body.setFirmtransportCd(entity.getLot1());
			body.setManufactureDt(entity.getLot4());
			body.setManufactureSymbol(entity.getLot2());
			body.setFcflg(entity.getInoutKbn());
			body.setDiffqtyHenpin(entity.getRetrunTotal());
			body.setDiffqtyTaxrefond(entity.getTaxlessTotal());
			body.setSuffererQty(entity.getBackTotal());
			body.setMonthStatussu(entity.getNotObjectTotal());
			body.setBlukRecivedQty(entity.getRegistTotal());
			body.setRefunditemQty(entity.getTaxTotal());
			//棚卸ボディ
			bodyList.add(body);
		}
		tInventoryBhv.batchInsert(bodyList);
		//棚卸帳票データを登録
		List<TInventoryR> reportList = new ArrayList<TInventoryR>();
		for(TInventoryB body : bodyList) {
			TInventoryR report = new TInventoryR();
			report.setInventoryBId(body.getInventoryBId());
			report.setTwlOutFlg_$0();
			reportList.add(report);
		}
		tInventoryRBhv.batchInsert(reportList);
		//tInventoryHBhv.insert(tInventoryH);
		//棚卸指示データの登録
		TInventoryInst inst = new TInventoryInst();
		inst.setInventoryHId(headId);
		inst.setFromLocationCd(fromLocationCd);
		inst.setToLocationCd(toLocationCd);
		inst.setStockExistOnlyFlg_$0();
		inst.setInventoryInstKbn(inventoryInstKbn);
		inst.setLineBlock(tInventoryInst.getLineBlock());
		if(CDef.InventoryInstKbn.$02.code().equals(inventoryInstKbn)) {
			inst.setDirectionalPiston(tInventoryInstList.get(0).getDirectionalPiston());
			inst.setSortingOrder(tInventoryInstList.get(0).getSortingOrder());
			inst.setSortingNumTimes(tInventoryInstList.get(0).getSortingWrokNumtimes());
		}
		inst.setLocationCd(tInventoryInst.getLocationCd());
		inst.setProductCd(tInventoryInst.getProductCd());
		inst.setProductDivision(tInventoryInst.getProductDivision());
		inst.setLocationGrp(tInventoryInst.getLocationGrp());
		tInventoryInstBhv.insert(inst);
		//入力.在庫調査区分が'01'(仕分場(開始))または'03'(仕分場(終了))の場合
		if(Arrays.asList(CDef.InventoryInstKbn.$01.code(),CDef.InventoryInstKbn.$03.code()).contains(inventoryInstKbn)) {
			SqlInventoryBInvCreatePmb sqlInventoryBInvCreatePmb = new SqlInventoryBInvCreatePmb();
			sqlInventoryBInvCreatePmb.setCenterId(clientCenter.getCenterId());
			sqlInventoryBInvCreatePmb.setClientId(clientCenter.getClientId());
			sqlInventoryBInvCreatePmb.setInventoryKey(Integer.valueOf(instKey));
			sqlInventoryBInvCreatePmb.setSystemDt(clientCenter.getSystemDt());
			ListResultBean<SqlInventoryBInvCreate> bInvCreateList = tInventoryBhv.outsideSql().selectList(tInventoryBhv.PATH_selectSqlInventoryBInvCreate, sqlInventoryBInvCreatePmb, SqlInventoryBInvCreate.class);
			//製造年月日明細登録用リスト初期化
			List<TTrmanufacturedatedetail> detailList = new ArrayList<TTrmanufacturedatedetail>();
			//製造年月日明細更新用リスト初期化
			List<TTrmanufacturedatedetail> detailUpdateList = new ArrayList<TTrmanufacturedatedetail>();
			//製造年月日履歴リスト初期化
			List<TTrmanufacturedatehistory> historyList = new ArrayList<TTrmanufacturedatehistory>();
			//棚卸ボディリスト繰り返し
			for(SqlInventoryBInvCreate result : bInvCreateList) {
				//前回製造年月日初期化
				String beforeManDate = result.getManufactureDate();
				TTrmanufacturedatedetail detailEntity = new TTrmanufacturedatedetail();
				detailEntity.setCenterCd(center.getCenterCd());
				detailEntity.setOwnerCd(client.getClientCd());
				detailEntity.setInventoryKbn("02");
				detailEntity.setLineBlock(result.getLocationCd().substring(0,2));
				detailEntity.setProductCd(result.getLocationCd());
				detailEntity.setInventoryKey(result.getInventoryKey());
				detailEntity.setInventoryBId(result.getInventoryBId());
				detailEntity.setInventoryDate(result.getInventoryDt());
				detailEntity.setBfManufactureDate(beforeManDate);
				detailEntity.setCenterId(clientCenter.getCenterId());
				detailEntity.setClientId(clientCenter.getClientId());
				if(result.getManufactureDate() == null || result.getManufactureDate().isEmpty()) {
					detailList.add(detailEntity);
				}else {
					detailUpdateList.add(detailEntity);
				}
				TTrmanufacturedatehistory historyEntity = new TTrmanufacturedatehistory();
				historyEntity.setCenterCd(center.getCenterCd());
				historyEntity.setOwnerCd(client.getClientCd());
				historyEntity.setInventoryKbn("02");
				historyEntity.setLineBlock(result.getLocationCd().substring(0,2));
				historyEntity.setProductCd(result.getLocationCd());
				historyEntity.setInventoryKey(result.getInventoryKey());
				historyEntity.setInventoryBId(result.getInventoryBId());
				historyEntity.setInventoryDate(result.getInventoryDt());
				historyEntity.setBfManufactureDate(beforeManDate);
				historyEntity.setCenterId(clientCenter.getCenterId());
				historyEntity.setClientId(clientCenter.getClientId());
				historyList.add(historyEntity);
			}
			if(detailList.size() > 0) {
				tTrmanufacturedatedetailBhv.batchInsert(detailList);
			}
			if(detailUpdateList.size() > 0) {
				tTrmanufacturedatedetailBhv.batchUpdate(detailUpdateList);
			}
			if(historyList.size() > 0) {
				tTrmanufacturedatehistoryBhv.batchInsert(historyList);
			}
			
		}
	}
}
