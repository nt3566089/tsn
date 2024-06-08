package com.oneslogi.wms.logic.stock;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.ReferrerLoaderHandler;

import com.oneslogi.base.BaseConst;
import com.oneslogi.base.dbflute.bsbhv.loader.LoaderOfTStockInout;
import com.oneslogi.base.dbflute.cbean.HStockInoutCB;
import com.oneslogi.base.dbflute.cbean.HStockReportCB;
import com.oneslogi.base.dbflute.cbean.MProductShapeCB;
import com.oneslogi.base.dbflute.cbean.TShippingInstHCB;
import com.oneslogi.base.dbflute.cbean.TStockCB;
import com.oneslogi.base.dbflute.cbean.TStockInoutCB;
import com.oneslogi.base.dbflute.exbhv.HStockInoutBhv;
import com.oneslogi.base.dbflute.exbhv.HStockReportBhv;
import com.oneslogi.base.dbflute.exbhv.MProductBhv;
import com.oneslogi.base.dbflute.exbhv.TAllocInstHBhv;
import com.oneslogi.base.dbflute.exbhv.TStockBhv;
import com.oneslogi.base.dbflute.exbhv.TStockInoutBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.HStockInout;
import com.oneslogi.base.dbflute.exentity.HStockReport;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.MClientCenter;
import com.oneslogi.base.dbflute.exentity.MCustomer;
import com.oneslogi.base.dbflute.exentity.MLocation;
import com.oneslogi.base.dbflute.exentity.MProcessType;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MProductShape;
import com.oneslogi.base.dbflute.exentity.MStockType;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TLot;
import com.oneslogi.base.dbflute.exentity.TShippingInstH;
import com.oneslogi.base.dbflute.exentity.TStock;
import com.oneslogi.base.dbflute.exentity.TStockInout;
import com.oneslogi.base.dbflute.exentity.TStoreNo;
import com.oneslogi.base.dbflute.exentity.VDict;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.stock.StockInOutListDto;
import com.oneslogi.wms.logic.common.ClientCenterLogic;
import com.oneslogi.wms.logic.common.LocationLogic;
import com.oneslogi.wms.logic.common.UserLogic;
import com.oneslogi.wms.util.WmsMultipleShapeUtil;

/**
 * 在庫受払問合せデータ取得ロジッククラス
 */
public class StockInOutSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TStockInoutBhv tStockInoutBhv;
	@Inject
	private HStockInoutBhv hStockInoutBhv;
	@Inject
	private HStockReportBhv hStockReportBhv;
	@Inject
	private TStockBhv tStockBhv;
	// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start
	@Inject
	private TAllocInstHBhv tAllocInstHBhv;
	// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End
	@Inject
	private MProductBhv mProductBhv;

	// ===== 使用ロジッククラス =====
	@Inject
	private ClientCenterLogic clientCenterLogic;
	@Inject
	private LocationLogic locationLogic;
	@Inject
	private UserLogic userLogic;

	//[Ver3.0] unit of measure対応 2017.11.29 駱 Del


	/**
	 * <h2>在庫受払データを取得する。</h2>
	 * <pre>
	 * 受取った条件で在庫受払データと在庫受払履歴データを取得する。
	 * 両方対象が見つからない場合、０件エラーをエラーステータス情報に設定する。
	 *
	 * 在庫受払履歴データが在庫受払リストデータに詰め替える。
	 *
	 * システム管理日付 = 処理日(From)の場合、在庫データを取得後、前日在庫数、前日在庫のレコードを作成し在庫受払リストに設定する。
	 * それ以外の場合、在庫履歴データを取得し、前日在庫数、前日在庫のレコードを作成し在庫受払リストに設定する。
	 * システム管理日付 >= 処理日(To) の場合、在庫データを取得後、当日在庫数、当日在庫のレコードを作成し在庫受払リストに設定する。
	 * それ以外の場合、在庫履歴データを取得し、当日在庫数、当日在庫のレコードを作成し在庫受払リストに設定する。
	 *
	 * 在庫受払リストの入庫実績ボディIDが存在する場合、入庫データとなり、
	 * 受入数を計算し、仕入先情報、顧客入荷指示No.を取得し在庫受払リストに設定する。
	 * 在庫受払リストの引当指示ボディIDが存在する場合、出庫データとなり、
	 * 払出数を計算し、納品先情報、顧客出荷指示No.を取得し在庫受払リストに設定する。
	 *
	 * </pre>
	 * @param tStockInout 在庫受払：処理日(From)・処理日(To)・処理区分ID
	 * @param tstock 在庫：荷主ID・倉庫ID・預託ID・在庫区分ID
	 * @param mWarehouse 倉庫マスタ：センタID
	 * @param mProduct 商品マスタ：商品CD・JANCD
	 * @param mLocation ロケーションマスタ：ロケーションCD
	 * @param tLot ロット：ロット・期限日(From)・期限日(To)
	 * @param mClientCenter 荷主センタマスタ：システム管理日付
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<StockInOutListDto> 在庫受払リスト
	 * @throws ParseException
	 */
	public List<StockInOutListDto> select(TStockInout tStockInout, TStock tstock, MWarehouse mWarehouse, MProduct mProduct
			, MLocation mLocation, TLot tLot, MClientCenter mClientCenter, ErrorStatus errSts) throws ParseException {

		// [#6069][v2.2] 在庫受払では削除商品の受払も表示する 2019.02.27 kawana Start
		// 関連マスタが削除されていても在庫受払では表示したいため削除フラグの自動設定をなしに変更
		boolean autoDelFlg = getBehaviorAutoDelFlg();
		setBehaviorAutoDelFlg(false);
		// [#6069][v2.2] 在庫受払では削除商品の受払も表示する 2019.02.27 kawana End

		// [検査-231] 受払履歴からも取得するように大幅修正 2014.12.05 koseki Start
		List<TStockInout> tStockInoutList = null;

		// システム管理日付の取得
		mClientCenter = clientCenterLogic.getUkEntity(mClientCenter);

		// ===== 在庫受払問合せデータ取得 =====
		// データ取得テーブル
		TStockInoutCB cb = tStockInoutBhv.newMyConditionBean();

		cb.setupSelect_TStock();
		cb.setupSelect_TStock().withMClient();
		cb.setupSelect_TStock().withMWarehouse();
		cb.setupSelect_TStock().withMWarehouse().withMCenter();
		cb.setupSelect_TStock().withMProduct();
		cb.setupSelect_TStock().withMCustomer();
		cb.setupSelect_TStock().withMStockType();
		cb.setupSelect_TStock().withMStockType().withVDict(this.getCultureId());
		cb.setupSelect_TStock().withTLot();
		cb.setupSelect_TStock().withTStoreNo();
		cb.setupSelect_TStock().withTStoreNo().withTStoreNoSelf();
		cb.setupSelect_TStock().withTStoreNo().withMCustomer();
		cb.setupSelect_MProcessType();
		cb.setupSelect_MProcessType().withVDict(this.getCultureId());
		cb.setupSelect_TStock().withMLocation();
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		cb.setupSelect_TStock().withMLocation().withBClassDtlByAllocNgFlg().withVDict(this.getCultureId());
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start
		cb.setupSelect_TStoreRecordB().withTStoreRecordH();
		// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End
		cb.setupSelect_TAllocInstB();
		cb.setupSelect_TAllocInstB().withTAllocInstH();
		cb.setupSelect_TAllocInstB().withTAllocInstH().withMCustomerBySupplyCustomerId();
		cb.setupSelect_TMoveRecordB();
		cb.setupSelect_TMoveRecordB().withTMoveInstH();

		// ===== 検索条件の設定 =====
		cb.query().queryTStock().setClientId_Equal(tstock.getClientId());
		cb.query().queryTStock().queryMWarehouse().setCenterId_Equal(mWarehouse.getCenterId());
		cb.query().setProcessDt_GreaterEqual(tStockInout.getProcessDtFrom());
		cb.query().setProcessDt_LessEqual(tStockInout.getProcessDtTo());
		cb.query().queryTStock().setWarehouseId_Equal(tstock.getWarehouseId());
		cb.query().queryTStock().setDepositId_Equal(tstock.getDepositId());
		cb.query().queryTStock().setStockTypeId_Equal(tstock.getStockTypeId());
		cb.query().queryTStock().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
		cb.query().setProcessTypeId_Equal(tStockInout.getProcessTypeId());
		//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa
		cb.query().queryTStock().queryMLocation().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocation) == null ? "" : locationLogic.getMinLocationCd(mLocation).getLocationCdFrom());
		cb.query().queryTStock().queryMLocation().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocation) == null ? "" : locationLogic.getMaxLocationCd(mLocation).getLocationCdTo());
		cb.query().queryTStock().queryMProduct().setJanCd_PrefixSearch(mProduct.getJanCd());
		cb.query().queryTStock().queryTLot().setLot_PrefixSearch(tLot.getLot());
		cb.query().queryTStock().queryTLot().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
		cb.query().queryTStock().queryTLot().setLimitDt_LessEqual(tLot.getLimitDtTo());

		// [#6069][v2.2] 在庫受払では削除商品の受払も表示する 2019.02.27 kawana Start
		//[ON推-品向-1185] 修正対応 2016.08.25 chou Add Start
		// 削除フラグ
		cb.query().setDelFlg_Equal_$0();
		//[ON推-品向-1185] 修正対応 2016.08.25 chou Add End
		// [#6069][v2.2] 在庫受払では削除商品の受払も表示する 2019.02.27 kawana End

		// ===== ソート条件 =====
		// 荷主マスタ.荷主CD
		cb.query().queryTStock().queryMClient().addOrderBy_ClientCd_Asc();
		// センタマスタ.センタCD
		cb.query().queryTStock().queryMWarehouse().queryMCenter().addOrderBy_CenterCd_Asc();
		// 商品マスタ.商品CD
		cb.query().queryTStock().queryMProduct().addOrderBy_ProductCd_Asc();
		//[ON推-品向-433]「ソート順よりプロセスIDを削除する。」に修正 2014.12.12 衛 Start
		// 処理No
		//cb.query().addOrderBy_ProcessNo_Asc();
		//[ON推-品向-433]「ソート順よりプロセスIDを削除する。」に修正 2014.12.12 衛 End
		// 登録日時
		cb.query().addOrderBy_AddDt_Asc();

		// 在庫受払ID
		cb.query().addOrderBy_StockInoutId_Asc();

		// 検索実行
		// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki Start
		tStockInoutList = selectList(tStockInoutBhv, cb);
		// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki End

		// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start
		// 顧客出荷伝票No.を設定するため出荷指示ヘッダを取得
		List<TAllocInstH> instHList = new ArrayList<TAllocInstH>();
		for (TStockInout inout : tStockInoutList) {
			TAllocInstH instH = inout.chaseTAllocInstB().getTAllocInstH();
			if (instH != null) {
				instHList.add(instH);
			}
		}
		tAllocInstHBhv.loadTShippingInstHList(instHList, new ConditionBeanSetupper<TShippingInstHCB>() {
			@Override
			public void setup(TShippingInstHCB loadCb) {
			}
		});
		// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End

		// ===== 在庫受払履歴問合せデータ取得 =====
		// データ取得テーブル
		HStockInoutCB cbH = hStockInoutBhv.newMyConditionBean();

		cbH.setupSelect_HStock();
		cbH.setupSelect_HStock();
		cbH.setupSelect_HStock().withMStockType();
		cbH.setupSelect_HStock().withMStockType().withVDict(this.getCultureId());
		cbH.setupSelect_MProcessType();
		cbH.setupSelect_MProcessType().withVDict(this.getCultureId());

		// ===== 検索条件の設定 =====
		cbH.query().queryHStock().setClientId_Equal(tstock.getClientId());
		cbH.query().queryHStock().setCenterId_Equal(mWarehouse.getCenterId());
		cbH.query().setProcessDt_GreaterEqual(tStockInout.getProcessDtFrom());
		cbH.query().setProcessDt_LessEqual(tStockInout.getProcessDtTo());
		cbH.query().queryHStock().setWarehouseId_Equal(tstock.getWarehouseId());
		cbH.query().queryHStock().setDepositId_Equal(tstock.getDepositId());
		cbH.query().queryHStock().setStockTypeId_Equal(tstock.getStockTypeId());
		cbH.query().queryHStock().setProductCd_PrefixSearch(mProduct.getProductCd());
		cbH.query().setProcessTypeId_Equal(tStockInout.getProcessTypeId());
		//検索条件から入庫No.分割表示を削除 2016.03.14 ichikawa
		cbH.query().queryHStock().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocation) == null ? "" : locationLogic.getMinLocationCd(mLocation).getLocationCdFrom());
		cbH.query().queryHStock().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocation) == null ? "" : locationLogic.getMaxLocationCd(mLocation).getLocationCdTo());
		cbH.query().queryHStock().setJanCd_PrefixSearch(mProduct.getJanCd());
		cbH.query().queryHStock().setLot_PrefixSearch(tLot.getLot());
		cbH.query().queryHStock().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
		cbH.query().queryHStock().setLimitDt_LessEqual(tLot.getLimitDtTo());

		// [#6069][v2.2] 在庫受払では削除商品の受払も表示する 2019.02.27 kawana Start
		// 削除フラグ
		cbH.query().setDelFlg_Equal_$0();
		// [#6069][v2.2] 在庫受払では削除商品の受払も表示する 2019.02.27 kawana End

		// ===== ソート条件 =====
		// 荷主マスタ.荷主CD
		cbH.query().queryHStock().addOrderBy_ClientCd_Asc();
		// センタマスタ.センタCD
		cbH.query().queryHStock().addOrderBy_CenterCd_Asc();
		// 商品マスタ.商品CD
		cbH.query().queryHStock().addOrderBy_ProductCd_Asc();
		//[ON推-品向-433]「ソート順よりプロセスIDを削除する。」に修正 2014.12.12 衛 Start
		// 処理No
		//cbH.query().addOrderBy_ProcessNo_Asc();
		//[ON推-品向-433]「ソート順よりプロセスIDを削除する。」に修正 2014.12.12 衛 End
		// 登録日時
		cbH.query().addOrderBy_AddDt_Asc();

		// 在庫受払ID
		cbH.query().addOrderBy_StockInoutId_Asc();

		// 検索実行
		List<HStockInout> hStockInoutList = null;
		// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki Start
		hStockInoutList = selectList(hStockInoutBhv, cbH);
		// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki End

		//===== ０件チェック =====
		if (hStockInoutList.size() + tStockInoutList.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		for (int i = 0; i < hStockInoutList.size(); i++) {
			// 受払データの詰め替え
			TStockInout sio = new TStockInout();
			sio.setStockInoutId(hStockInoutList.get(i).getStockInoutId());
			sio.setFsStockInoutId(hStockInoutList.get(i).getFsStockInoutId());
			sio.setBfStockInoutId(hStockInoutList.get(i).getBfStockInoutId());
			sio.setProcessDt(hStockInoutList.get(i).getProcessDt());
			sio.setProcessTypeId(hStockInoutList.get(i).getProcessTypeId());
			sio.setProcessNo(hStockInoutList.get(i).getProcessNo());
			sio.setCorrectType(hStockInoutList.get(i).getCorrectType());
			sio.setInoutType(hStockInoutList.get(i).getInoutType());
			sio.setStockInoutNum(hStockInoutList.get(i).getStockInoutNum());
			sio.setAddDt(hStockInoutList.get(i).getAddDt());
			sio.setAddUser(hStockInoutList.get(i).getAddUser());
			sio.setAddProcess(hStockInoutList.get(i).getAddProcess());
			sio.setTAllocInstB(null);
			sio.setTMoveRecordB(null);
			sio.setTStoreRecordB(null);

			// 処理区分マスタの詰め替え
			MProcessType mpt = new MProcessType();
			mpt.setProcessTypeId(hStockInoutList.get(i).getProcessTypeId());
			mpt.setProcessTypeCd(hStockInoutList.get(i).getMProcessType().getProcessTypeCd());
			// 処理区分マスタ関連の辞書マスタの詰め替え
			VDict vdt = new VDict();
			vdt.setDictId(hStockInoutList.get(i).getMProcessType().getVDict().getDictId());
			vdt.setCultureId(hStockInoutList.get(i).getMProcessType().getVDict().getCultureId());
			vdt.setDictNm(hStockInoutList.get(i).getMProcessType().getVDict().getDictNm());
			mpt.setVDict(vdt);
			sio.setMProcessType(mpt);

			// 在庫データの詰め替え
			TStock tsk = new TStock();
			tsk.setStockId(hStockInoutList.get(i).getHStock().getStockId());
			tsk.setClientId(hStockInoutList.get(i).getHStock().getClientId());
			tsk.setWarehouseId(hStockInoutList.get(i).getHStock().getWarehouseId());
			tsk.setProductId(hStockInoutList.get(i).getHStock().getProductId());
			tsk.setStockTypeId(hStockInoutList.get(i).getHStock().getStockTypeId());
			tsk.setLocationId(hStockInoutList.get(i).getHStock().getLocationId());
			tsk.setDepositId(hStockInoutList.get(i).getHStock().getDepositId());
			tsk.setLotId(hStockInoutList.get(i).getHStock().getLotId());
			tsk.setShapeId(hStockInoutList.get(i).getHStock().getShapeId());
			tsk.setStoreNoId(hStockInoutList.get(i).getHStock().getStoreNoId());
			//tsk.setUnitNum(hStockInoutList.get(i).getHStock().getUnitNum());

			// 荷主マスタの詰め替え
			MClient mct = new MClient();
			mct.setClientId(hStockInoutList.get(i).getHStock().getClientId());
			mct.setClientCd(hStockInoutList.get(i).getHStock().getClientCd());
			mct.setClientNm(hStockInoutList.get(i).getHStock().getClientNm());
			tsk.setMClient(mct);

			// 倉庫マスタの詰め替え
			MWarehouse mwh = new MWarehouse();
			mwh.setWarehouseId(hStockInoutList.get(i).getHStock().getWarehouseId());
			mwh.setWarehouseCd(hStockInoutList.get(i).getHStock().getWarehouseCd());
			mwh.setWarehouseNm(hStockInoutList.get(i).getHStock().getWarehouseNm());
			// センタマスタの詰め替え
			MCenter mcr = new MCenter();
			mcr.setCenterId(hStockInoutList.get(i).getHStock().getCenterId());
			mcr.setCenterCd(hStockInoutList.get(i).getHStock().getCenterCd());
			mcr.setCenterNm(hStockInoutList.get(i).getHStock().getCenterNm());
			mwh.setCenterId(hStockInoutList.get(i).getHStock().getCenterId());
			mwh.setMCenter(mcr);
			tsk.setMWarehouse(mwh);

			// 商品マスタの詰め替え
			MProduct mpd = new MProduct();
			mpd.setClientId(hStockInoutList.get(i).getHStock().getClientId());
			mpd.setProductId(hStockInoutList.get(i).getHStock().getProductId());
			mpd.setProductCd(hStockInoutList.get(i).getHStock().getProductCd());
			mpd.setProductNm(hStockInoutList.get(i).getHStock().getProductNm());
			mpd.setProductAbbr(hStockInoutList.get(i).getHStock().getProductAbbr());
			mpd.setJanCd(hStockInoutList.get(i).getHStock().getJanCd());
			tsk.setMProduct(mpd);
			sio.setProductCd(hStockInoutList.get(i).getHStock().getProductCd());
			sio.setProductNm(hStockInoutList.get(i).getHStock().getProductNm());

			// 在庫区分マスタの詰め替え
			MStockType mst = new MStockType();
			mst.setStockTypeId(hStockInoutList.get(i).getHStock().getStockTypeId());
			mst.setStockTypeCd(hStockInoutList.get(i).getHStock().getMStockType().getStockTypeCd());
			// 在庫区分マスタ関連の辞書マスタの詰め替え
			VDict vdt2 = new VDict();
			vdt2.setDictId(hStockInoutList.get(i).getHStock().getMStockType().getVDict().getDictId());
			vdt2.setDictNm(hStockInoutList.get(i).getHStock().getMStockType().getVDict().getDictNm());
			vdt2.setCultureId(hStockInoutList.get(i).getHStock().getMStockType().getVDict().getCultureId());
			mst.setVDict(vdt2);
			tsk.setMStockType(mst);

			// ロケーションマスタの詰め替え
			MLocation mlt = new MLocation();
			mlt.setLocationId(hStockInoutList.get(i).getHStock().getLocationId());
			mlt.setLocationCd(hStockInoutList.get(i).getHStock().getLocationCd());
			mlt.setLocationNm(hStockInoutList.get(i).getHStock().getLocationNm());
			tsk.setMLocation(mlt);

			// 預託マスタの詰め替え
			MCustomer mcm = new MCustomer();
			mcm.setCustomerId(hStockInoutList.get(i).getHStock().getDepositId());
			mcm.setClientId(hStockInoutList.get(i).getHStock().getClientId());
			mcm.setCustomerCd(hStockInoutList.get(i).getHStock().getDepositCd());
			mcm.setCustomerNm(hStockInoutList.get(i).getHStock().getDepositNm());
			mcm.setCustomerAbbr(hStockInoutList.get(i).getHStock().getDepositAbbr());
			tsk.setMCustomer(mcm);

			// ロットデータの詰め替え
			TLot tlt = new TLot();
			tlt.setLotId(hStockInoutList.get(i).getHStock().getLotId());
			tlt.setLot(hStockInoutList.get(i).getHStock().getLot());
			tlt.setLimitDt(hStockInoutList.get(i).getHStock().getLimitDt());
			tsk.setTLot(tlt);

			// 入庫№データの詰め替え
			TStoreNo tsn = new TStoreNo();
			tsn.setStoreNoId(hStockInoutList.get(i).getHStock().getStoreNoId());
			tsn.setStoreLabelNo(hStockInoutList.get(i).getHStock().getStoreLabelNo());
			tsn.setStoreDt(hStockInoutList.get(i).getHStock().getStoreDt());
			tsn.setOldStoreNumId(hStockInoutList.get(i).getHStock().getOldStoreNumId());
			MCustomer msm = new MCustomer();
			msm.setCustomerId(hStockInoutList.get(i).getHStock().getSupplierId());
			msm.setCustomerCd(hStockInoutList.get(i).getHStock().getSupplierCd());
			msm.setCustomerNm(hStockInoutList.get(i).getHStock().getSupplierNm());
			msm.setCustomerAbbr(hStockInoutList.get(i).getHStock().getSupplierAbbr());
			tsn.setMCustomer(msm);
			tsk.setTStoreNo(tsn);

			sio.setTStock(tsk);

			tStockInoutList.add(sio);
		}

		// 並び替えを行う
		java.util.Collections.sort(tStockInoutList, new Comparator<TStockInout>() {
			public int compare(TStockInout o1, TStockInout o2) {
				//[ON推-品向-496]「ソート順より正しく表示する。」に修正 2014.12.26 衛 Start

				//				//[ON推-品向-433]「ソート順よりプロセスIDを削除する。」に修正 2014.12.12 衛 Start
				//				String sort1 = o1.getTStock().getMClient().getClientCd() + o1.getTStock().getMWarehouse().getMCenter().getCenterCd() + o1.getTStock().getMProduct().getProductCd() + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(o1.getAddDt());
				//				String sort2 = o2.getTStock().getMClient().getClientCd() + o2.getTStock().getMWarehouse().getMCenter().getCenterCd() + o2.getTStock().getMProduct().getProductCd() + new SimpleDateFormat("yyyyMMddHHmmssSSS").format(o2.getAddDt());
				//				//[ON推-品向-433]「ソート順よりプロセスIDを削除する。」に修正 2014.12.12 衛 End
				//				if (sort1.compareTo(sort2) > 0) {
				//		            return 1;
				//
				//		        } else if (sort1 == sort2) {
				//		            return 0;
				//
				//		        } else {
				//		            return -1;
				//
				//		        }
				if (o1.getTStock().getMClient().getClientCd().compareTo(o2.getTStock().getMClient().getClientCd()) == 0) {
					if (o1.getTStock().getMWarehouse().getMCenter().getCenterCd().compareTo(o2.getTStock().getMWarehouse().getMCenter().getCenterCd()) == 0) {
						if (o1.getTStock().getMProduct().getProductCd().compareTo(o2.getTStock().getMProduct().getProductCd()) == 0) {
							if (new SimpleDateFormat("yyyyMMddHHmmssSSS").format(o1.getAddDt()).compareTo(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(o2.getAddDt())) == 0) {
								return 0;
							} else {
								return new SimpleDateFormat("yyyyMMddHHmmssSSS").format(o1.getAddDt()).compareTo(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(o2.getAddDt()));
							}
						} else {
							return o1.getTStock().getMProduct().getProductCd().compareTo(o2.getTStock().getMProduct().getProductCd());
						}
					} else {
						return o1.getTStock().getMWarehouse().getMCenter().getCenterCd().compareTo(o2.getTStock().getMWarehouse().getMCenter().getCenterCd());
					}
				} else {
					return o1.getTStock().getMClient().getClientCd().compareTo(o2.getTStock().getMClient().getClientCd());
				}
				//[ON推-品向-496]「ソート順より正しく表示する。」に修正 2014.12.26 衛 End

			}
		});

		// 取得した受払から、商品ID一覧を取得する。
		List<TStock> tStockProductList = tStockInoutBhv.pulloutTStock(tStockInoutList);
		List<MProduct> mProductList = tStockBhv.pulloutMProduct(tStockProductList);
		List<Long> mProductIdList = mProductBhv.extractProductIdList(mProductList);

		// ===== 在庫データ/在庫履歴データの取得 =====
		List<TStock> tStockListFrom = null;
		List<HStockReport> hStockReportListFrom = null;

		// システム管理日付 = tStockInout.処理日(From)  の場合、在庫データの取得
		if (mClientCenter.getSystemDt().equals(tStockInout.getProcessDtFrom())) {
			// ===== 在庫データ取得 =====
			// データ取得テーブル
			TStockCB tStockCBFrom = tStockBhv.newMyConditionBean();

			tStockCBFrom.setupSelect_TStockReportAsOne();
			tStockCBFrom.setupSelect_MClient();
			tStockCBFrom.setupSelect_MWarehouse();
			tStockCBFrom.setupSelect_MWarehouse().withMCenter();
			tStockCBFrom.setupSelect_MProduct();
			tStockCBFrom.setupSelect_MStockType();
			tStockCBFrom.setupSelect_TLot();
			tStockCBFrom.setupSelect_MLocation();

			// ===== 検索条件の設定 =====
			tStockCBFrom.query().setClientId_Equal(tstock.getClientId());
			tStockCBFrom.query().queryMWarehouse().setCenterId_Equal(mWarehouse.getCenterId());
			tStockCBFrom.query().setWarehouseId_Equal(tstock.getWarehouseId());
			tStockCBFrom.query().setDepositId_Equal(tstock.getDepositId());
			tStockCBFrom.query().setStockTypeId_Equal(tstock.getStockTypeId());
			tStockCBFrom.query().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
			tStockCBFrom.query().queryMLocation().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocation) == null ? "" : locationLogic.getMinLocationCd(mLocation).getLocationCdFrom());
			tStockCBFrom.query().queryMLocation().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocation) == null ? "" : locationLogic.getMaxLocationCd(mLocation).getLocationCdTo());
			tStockCBFrom.query().queryMProduct().setJanCd_PrefixSearch(mProduct.getJanCd());
			tStockCBFrom.query().queryTLot().setLot_PrefixSearch(tLot.getLot());
			tStockCBFrom.query().queryTLot().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
			tStockCBFrom.query().queryTLot().setLimitDt_LessEqual(tLot.getLimitDtTo());
			tStockCBFrom.query().setProductId_InScope(mProductIdList);
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana Start
			tStockCBFrom.query().setDelFlg_Equal_$0();
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana End

			// ===== ソート条件 =====
			// 荷主マスタ.荷主CD
			tStockCBFrom.query().queryMClient().addOrderBy_ClientCd_Asc();
			// センタマスタ.センタCD
			tStockCBFrom.query().queryMWarehouse().queryMCenter().addOrderBy_CenterCd_Asc();
			// 商品マスタ.商品CD
			tStockCBFrom.query().queryMProduct().addOrderBy_ProductCd_Asc();

			// 検索実行
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki Start
			tStockListFrom = selectList(tStockBhv, tStockCBFrom);
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki End

			// 上記以外場合、在庫履歴データの取得
		} else {
			// ===== 在庫履歴データ取得 =====
			// データ取得テーブル
			HStockReportCB hStockReportCBFrom = hStockReportBhv.newMyConditionBean();

			hStockReportCBFrom.setupSelect_HStock();
			hStockReportCBFrom.setupSelect_HStock().withMStockType();

			// ===== 検索条件の設定 =====
			hStockReportCBFrom.query().queryHStock().setClientId_Equal(tstock.getClientId());
			hStockReportCBFrom.query().queryHStock().setCenterId_Equal(mWarehouse.getCenterId());
			hStockReportCBFrom.query().setHistDt_Equal(tStockInout.getProcessDtFrom());
			hStockReportCBFrom.query().queryHStock().setWarehouseId_Equal(tstock.getWarehouseId());
			hStockReportCBFrom.query().queryHStock().setDepositId_Equal(tstock.getDepositId());
			hStockReportCBFrom.query().queryHStock().setStockTypeId_Equal(tstock.getStockTypeId());
			hStockReportCBFrom.query().queryHStock().setProductCd_PrefixSearch(mProduct.getProductCd());
			hStockReportCBFrom.query().queryHStock().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocation) == null ? "" : locationLogic.getMinLocationCd(mLocation).getLocationCdFrom());
			hStockReportCBFrom.query().queryHStock().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocation) == null ? "" : locationLogic.getMaxLocationCd(mLocation).getLocationCdTo());
			hStockReportCBFrom.query().queryHStock().setJanCd_PrefixSearch(mProduct.getJanCd());
			hStockReportCBFrom.query().queryHStock().setLot_PrefixSearch(tLot.getLot());
			hStockReportCBFrom.query().queryHStock().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
			hStockReportCBFrom.query().queryHStock().setLimitDt_LessEqual(tLot.getLimitDtTo());
			hStockReportCBFrom.query().queryHStock().setProductId_InScope(mProductIdList);
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana Start
			hStockReportCBFrom.query().setDelFlg_Equal_$0();
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana End

			// ===== ソート条件 =====
			// 在庫データ履歴.荷主CD
			hStockReportCBFrom.query().queryHStock().addOrderBy_ClientCd_Asc();
			// 在庫データ履歴.センタCD
			hStockReportCBFrom.query().queryHStock().addOrderBy_CenterCd_Asc();
			// 在庫データ履歴.商品CD
			hStockReportCBFrom.query().queryHStock().addOrderBy_ProductCd_Asc();
			// 在庫日報履歴.履歴日
			hStockReportCBFrom.query().addOrderBy_HistDt_Asc();
			// 在庫日報履歴.在庫ID
			hStockReportCBFrom.query().addOrderBy_StockId_Asc();

			// 検索実行
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki Start
			hStockReportListFrom = selectList(hStockReportBhv, hStockReportCBFrom);
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki End

		}

		// ===== 在庫データ/在庫履歴データの取得 =====
		List<TStock> tStockListTo = null;
		List<HStockReport> hStockReportListTo = null;

		// システム管理日付 >= tStock.処理日(To)  の場合、在庫データの取得
		if (mClientCenter.getSystemDt().compareTo(tStockInout.getProcessDtTo()) <= 0) {
			// ===== 在庫データ取得 =====
			// データ取得テーブル
			TStockCB tStockCBTo = tStockBhv.newMyConditionBean();

			tStockCBTo.setupSelect_MClient();
			tStockCBTo.setupSelect_MWarehouse();
			tStockCBTo.setupSelect_MWarehouse().withMCenter();
			tStockCBTo.setupSelect_MProduct();
			tStockCBTo.setupSelect_MStockType();
			tStockCBTo.setupSelect_TLot();
			tStockCBTo.setupSelect_TStockReportAsOne();
			tStockCBTo.setupSelect_MLocation();

			// ===== 検索条件の設定 =====
			tStockCBTo.query().setClientId_Equal(tstock.getClientId());
			tStockCBTo.query().queryMWarehouse().setCenterId_Equal(mWarehouse.getCenterId());
			tStockCBTo.query().setWarehouseId_Equal(tstock.getWarehouseId());
			tStockCBTo.query().setDepositId_Equal(tstock.getDepositId());
			tStockCBTo.query().setStockTypeId_Equal(tstock.getStockTypeId());
			tStockCBTo.query().queryMProduct().setProductCd_PrefixSearch(mProduct.getProductCd());
			tStockCBTo.query().queryMLocation().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocation) == null ? "" : locationLogic.getMinLocationCd(mLocation).getLocationCdFrom());
			tStockCBTo.query().queryMLocation().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocation) == null ? "" : locationLogic.getMaxLocationCd(mLocation).getLocationCdTo());
			tStockCBTo.query().queryMProduct().setJanCd_PrefixSearch(mProduct.getJanCd());
			tStockCBTo.query().queryTLot().setLot_PrefixSearch(tLot.getLot());
			tStockCBTo.query().queryTLot().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
			tStockCBTo.query().queryTLot().setLimitDt_LessEqual(tLot.getLimitDtTo());
			tStockCBTo.query().setProductId_InScope(mProductIdList);
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana Start
			tStockCBTo.query().setDelFlg_Equal_$0();
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana End

			// ===== ソート条件 =====
			// 荷主マスタ.荷主CD
			tStockCBTo.query().queryMClient().addOrderBy_ClientCd_Asc();
			// センタマスタ.センタCD
			tStockCBTo.query().queryMWarehouse().queryMCenter().addOrderBy_CenterCd_Asc();
			// 商品マスタ.商品CD
			tStockCBTo.query().queryMProduct().addOrderBy_ProductCd_Asc();

			// 検索実行
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki Start
			tStockListTo = selectList(tStockBhv, tStockCBTo);
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki End

			// 上記以外場合、在庫履歴データの取得
		} else {
			// ===== 在庫履歴データ取得 =====
			// データ取得テーブル
			HStockReportCB hStockReportCBTo = hStockReportBhv.newMyConditionBean();

			hStockReportCBTo.setupSelect_HStock();
			hStockReportCBTo.setupSelect_HStock().withMStockType();

			// ===== 検索条件の設定 =====
			hStockReportCBTo.query().queryHStock().setClientId_Equal(tstock.getClientId());
			hStockReportCBTo.query().queryHStock().setCenterId_Equal(mWarehouse.getCenterId());
			hStockReportCBTo.query().setHistDt_Equal(tStockInout.getProcessDtTo());
			hStockReportCBTo.query().queryHStock().setWarehouseId_Equal(tstock.getWarehouseId());
			hStockReportCBTo.query().queryHStock().setDepositId_Equal(tstock.getDepositId());
			hStockReportCBTo.query().queryHStock().setStockTypeId_Equal(tstock.getStockTypeId());
			hStockReportCBTo.query().queryHStock().setProductCd_PrefixSearch(mProduct.getProductCd());
			hStockReportCBTo.query().queryHStock().setLocationCd_GreaterEqual(locationLogic.getMinLocationCd(mLocation) == null ? "" : locationLogic.getMinLocationCd(mLocation).getLocationCdFrom());
			hStockReportCBTo.query().queryHStock().setLocationCd_LessEqual(locationLogic.getMaxLocationCd(mLocation) == null ? "" : locationLogic.getMaxLocationCd(mLocation).getLocationCdTo());
			hStockReportCBTo.query().queryHStock().setJanCd_PrefixSearch(mProduct.getJanCd());
			hStockReportCBTo.query().queryHStock().setLot_PrefixSearch(tLot.getLot());
			hStockReportCBTo.query().queryHStock().setLimitDt_GreaterEqual(tLot.getLimitDtFrom());
			hStockReportCBTo.query().queryHStock().setLimitDt_LessEqual(tLot.getLimitDtTo());
			hStockReportCBTo.query().queryHStock().setProductId_InScope(mProductIdList);
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana Start
			hStockReportCBTo.query().setDelFlg_Equal_$0();
			// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana End

			// ===== ソート条件 =====
			// 在庫データ履歴.荷主CD
			hStockReportCBTo.query().queryHStock().addOrderBy_ClientCd_Asc();
			// 在庫データ履歴.センタCD
			hStockReportCBTo.query().queryHStock().addOrderBy_CenterCd_Asc();
			// 在庫データ履歴.商品CD
			hStockReportCBTo.query().queryHStock().addOrderBy_ProductCd_Asc();
			// 在庫日報履歴.履歴日
			hStockReportCBTo.query().addOrderBy_HistDt_Asc();
			// 在庫日報履歴.在庫ID
			hStockReportCBTo.query().addOrderBy_StockId_Asc();

			// 検索実行
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki Start
			hStockReportListTo = selectList(hStockReportBhv, hStockReportCBTo);
			// [ON推-品向-1050] 2016/03/29 件数チェックする様に修正 t.koseki End
		}

		// ===== リターンの在庫受払リスト編集 =====
		List<StockInOutListDto> retList = new ArrayList<StockInOutListDto>();
		StockInOutListDto dto;
		String strClientCd = "";
		String strCenterCd = "";
		String strProductCd = "";
		BigDecimal sumChargeNumYesterday = WCC.ZERO;
		BigDecimal sumChargeNumToday = WCC.ZERO;
		BigDecimal sumStockInNum = WCC.ZERO;
		BigDecimal sumStockOutNum = WCC.ZERO;
		TStockInout tStockInout1 = null;
		TStockInout tStockInoutBefore = null;

		// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
		// 商品に紐付く商品荷姿マスタ(荷姿グループマスタ関連含む)を抽出
		tStockInoutBhv.load(tStockInoutList, new ReferrerLoaderHandler<LoaderOfTStockInout>() {
			@Override
			public void handle(LoaderOfTStockInout loader) {
				loader.pulloutTStock().pulloutMProduct().loadMProductShapeList(new ConditionBeanSetupper<MProductShapeCB>() {
					@Override
					public void setup(MProductShapeCB subCB) {
						subCB.setupSelect_MShapeGrpDtl().withMShapeGrp();
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeDictId(getCultureId());
						subCB.setupSelect_MShapeGrpDtl().withMShape().withVDictByShapeUnitDictId(getCultureId());
						subCB.query().setDelFlg_Equal_$0();
						subCB.query().queryMShapeGrpDtl().addOrderBy_ShapeSort_Asc();
					}
				});
			}
		});
		// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

		// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana Start
		setBehaviorAutoDelFlg(autoDelFlg);
		// [#6093][v3.1] 在庫受払では削除商品の受払も表示する 2019.11.05 kawana End

		Map<Long, String> decimalExistFlgMap = new HashMap<>();
		Map<Long, String> minimumUnitMap = new HashMap<>();
		Map<Long, List<Long>> parentUnitNumMap = new HashMap<>();
		Map<Long, List<String>> parentUnitMap = new HashMap<>();

		// [Ver3.0] unit of measure対応 2017.11.29 駱 End

		// 在庫受払リストのデータ件数分繰返
		for (int i = 0; i < tStockInoutList.size(); i++) {
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品荷姿リストから最小荷姿単位、親荷姿単位、親荷姿入数を設定するためのMapを作成
			WmsMultipleShapeUtil.getParentMap(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStockInoutList.get(i).getTStock().getMProduct());
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End

			tStockInout1 = tStockInoutList.get(i);
			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.02 sja Start
			MProductShape mProductShape = new MProductShape();
			mProductShape.setProductId(tStockInout1.getTStock().getMProduct().getProductId());
			mProductShape.setClientId(tStockInout1.getTStock().getClientId());
			mProductShape.setCenterId(tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterId());
			mProductShape.setCaseFlg("1");

			// [Ver3.0] unit of measure対応 2017.11.29 駱 Del

			// [エンハンス PH2.0] 入数の設定値を変更 2015.12.02 sja End
			// 荷主・センタ・商品が変わったら
			if (!strClientCd.equals(tStockInout1.getTStock().getMClient().getClientCd())
					|| !strCenterCd.equals(tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterCd())
					|| !strProductCd.equals(tStockInout1.getTStock().getMProduct().getProductCd())) {
				if (i > 0) {
					// 当日在庫数の取得
					sumChargeNumToday = WCC.ZERO;
					if (mClientCenter.getSystemDt().compareTo(tStockInout.getProcessDtTo()) <= 0) {
						for (int j = 0; j < tStockListTo.size(); j++) {
							// [#6069][v2.2] 削除商品が検索結果に含まれると致命的エラーが発生 2019.02.27 kawana Start
							if (tStockInoutBefore.getTStock().getMProduct().getProductCd().equals(tStockListTo.get(j).chaseMProduct().getProductCd())
									&& tStockInoutBefore.getTStock().getMClient().getClientCd().equals(tStockListTo.get(j).chaseMClient().getClientCd())
									&& tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterCd().equals(tStockListTo.get(j).chaseMWarehouse().chaseMCenter().getCenterCd())) {
							// [#6069][v2.2] 削除商品が検索結果に含まれると致命的エラーが発生 2019.02.27 kawana End
								sumChargeNumToday = WCC.add(sumChargeNumToday, tStockListTo.get(j).getChargeNum());
							}
						}
					} else {
						for (int j = 0; j < hStockReportListTo.size(); j++) {
							if (tStockInoutBefore.getTStock().getMProduct().getProductCd().equals(hStockReportListTo.get(j).getHStock().getProductCd())
									&& tStockInoutBefore.getTStock().getMClient().getClientCd().equals(hStockReportListTo.get(j).getHStock().getClientCd())
									&& tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterCd().equals(hStockReportListTo.get(j).getHStock().getCenterCd())) {
								sumChargeNumToday = WCC.add(sumChargeNumToday, hStockReportListTo.get(j).getChargeNum());
							}
						}
					}
					// 当日在庫のレコード作成
					dto = new StockInOutListDto();
					dto.setClientCd(tStockInoutBefore.getTStock().getMClient().getClientCd());
					dto.setCenterCd(tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterCd());
					//荷主センタ変更対応 2017.02.14 sja Start
					dto.setClientNm(tStockInoutBefore.getTStock().getMClient().getClientNm());
					dto.setCenterNm(tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterNm());
					//荷主センタ変更対応 2017.02.14 sja End
					dto.setProductCd(tStockInoutBefore.getTStock().getMProduct().getProductCd());
					dto.setProductNm(tStockInoutBefore.getTStock().getMProduct().getProductNm());
					dto.setProductAbbr(tStockInoutBefore.getTStock().getMProduct().getProductAbbr());
					dto.setJanCd(tStockInoutBefore.getTStock().getMProduct().getJanCd());
					dto.setProcessDt(tStockInout.getProcessDtTo());
					dto.setChargeNum(sumChargeNumToday);
					// [Ver3.0] unit of measure対応 2017.11.29 駱 Del
					// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
					// 商品最小荷姿単位名称
					dto.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tStockInoutBefore.getTStock().getMProduct()));
					// 入数内訳
					dto.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStockInoutBefore.getTStock().getMProduct()));
					// 当日在庫内訳
					dto.setChargeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sumChargeNumToday, minimumUnitMap, parentUnitNumMap
							, parentUnitMap, tStockInoutBefore.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
					// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
					// [Ver3.0] unit of measure対応 2017.11.29 駱 End
					// [C-NIS-0002] 当日ケース数、当日ピース数を追加する 2015.07.01 hayashi End
					dto.setSortFlg("3");
					retList.add(dto);
				}
				strClientCd = tStockInout1.getTStock().getMClient().getClientCd();
				strCenterCd = tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterCd();
				strProductCd = tStockInout1.getTStock().getMProduct().getProductCd();
				tStockInoutBefore = tStockInout1;

				// 前日在庫数の取得
				sumChargeNumYesterday = WCC.ZERO;
				if (mClientCenter.getSystemDt().equals(tStockInout.getProcessDtFrom())) {
					for (int j = 0; j < tStockListFrom.size(); j++) {
						// [#6069][v2.2] 削除商品が検索結果に含まれると致命的エラーが発生 2019.02.27 kawana Start
						if (tStockInout1.getTStock().getMProduct().getProductCd().equals(tStockListFrom.get(j).chaseMProduct().getProductCd())
								&& tStockInout1.getTStock().getMClient().getClientCd().equals(tStockListFrom.get(j).chaseMClient().getClientCd())
								&& tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterCd().equals(tStockListFrom.get(j).chaseMWarehouse().chaseMCenter().getCenterCd())) {
						// [#6069][v2.2] 削除商品が検索結果に含まれると致命的エラーが発生 2019.02.27 kawana End
							sumChargeNumYesterday = WCC.add(sumChargeNumYesterday, tStockListFrom.get(j).getTStockReportAsOne().getPChargeNumDay());
						}
					}
				} else {
					for (int j = 0; j < hStockReportListFrom.size(); j++) {
						if (tStockInout1.getTStock().getMProduct().getProductCd().equals(hStockReportListFrom.get(j).getHStock().getProductCd())
								&& tStockInout1.getTStock().getMClient().getClientCd().equals(hStockReportListFrom.get(j).getHStock().getClientCd())
								&& tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterCd().equals(hStockReportListFrom.get(j).getHStock().getCenterCd())) {
							sumChargeNumYesterday = WCC.add(sumChargeNumYesterday, hStockReportListFrom.get(j).getPChargeNumDay());
						}
					}
				}
				// 前日在庫のレコード作成
				dto = new StockInOutListDto();
				dto.setClientCd(tStockInout1.getTStock().getMClient().getClientCd());
				dto.setCenterCd(tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterCd());
				//荷主センタ変更対応 2017.02.14 sja Start
				dto.setClientNm(tStockInout1.getTStock().getMClient().getClientNm());
				dto.setCenterNm(tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterNm());
				//荷主センタ変更対応 2017.02.14 sja End
				dto.setProductCd(tStockInout1.getTStock().getMProduct().getProductCd());
				dto.setProductNm(tStockInout1.getTStock().getMProduct().getProductNm());
				dto.setProductAbbr(tStockInout1.getTStock().getMProduct().getProductAbbr());
				dto.setJanCd(tStockInout1.getTStock().getMProduct().getJanCd());
				dto.setProcessDt(tStockInout.getProcessDtFrom());
				dto.setpChargeNumDay(sumChargeNumYesterday);
				// [C-NIS-0002] 前日ケース数、前日ピース数を追加する 2015.07.01 hayashi Strat
				// [Ver3.0] unit of measure対応 2017.11.29 駱 Del
				// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品最小荷姿単位名称
				dto.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tStockInout1.getTStock().getMProduct()));
				// 入数内訳
				dto.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStockInout1.getTStock().getMProduct()));
				// 前残内訳
				dto.setPreChargeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sumChargeNumYesterday, minimumUnitMap, parentUnitNumMap
						, parentUnitMap, tStockInout1.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				// [Ver3.0] unit of measure対応 2017.11.29 駱 End
				// [C-NIS-0002] 前日ケース数、前日ピース数を追加する 2015.07.01 hayashi End
				dto.setSortFlg("1");
				retList.add(dto);
			}

			// 受払データから作成
			dto = new StockInOutListDto();
			//在庫受払リストの「入庫実績ボディID」がNULL以外、または入出庫区分が'0'(入庫)の場合
			if (tStockInout1.getStoreRecordBId() != null || "0".equals(tStockInout1.getInoutType())) {
				//在庫受払リストの「赤黒区分」が'0'(黒)の場合
				if ("0".equals(tStockInout1.getCorrectType())) {
					sumStockInNum = tStockInout1.getStockInoutNum();

					//在庫受払リストの「赤黒区分」が'1'(赤)の場合
				} else if ("1".equals(tStockInout1.getCorrectType())) {
					sumStockInNum = WCC.multiply(tStockInout1.getStockInoutNum(), WCC.MINUS_ONE);
				}
				dto.setStockInNum(sumStockInNum);
				// [C-NIS-0002] 受入ケース数、受入ピース数を追加する 2015.07.01 hayashi Strat
				// [Ver3.0] unit of measure対応 2017.11.29 駱 Del
				// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品最小荷姿単位名称
				dto.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tStockInout1.getTStock().getMProduct()));
				// 入数内訳
				dto.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStockInout1.getTStock().getMProduct()));
				// 受入内訳
				dto.setStockInBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sumStockInNum, minimumUnitMap, parentUnitNumMap
						, parentUnitMap, tStockInout1.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				// [Ver3.0] unit of measure対応 2017.11.29 駱 End
				// [C-NIS-0002] 受入ケース数、受入ピース数を追加する 2015.07.01 hayashi End

				//在庫受払リストの「引当指示ボディID」がNULL以外、または入出庫区分が'1'(出庫)の場合
			} else if (tStockInout1.getAllocInstBId() != null || "1".equals(tStockInout1.getInoutType())) {
				//在庫受払リストの「赤黒区分」が'0'(黒)の場合
				if ("0".equals(tStockInout1.getCorrectType())) {
					sumStockOutNum = tStockInout1.getStockInoutNum();

					//在庫受払リストの「赤黒区分」が'1'(赤)の場合
				} else if ("1".equals(tStockInout1.getCorrectType())) {
					sumStockOutNum = WCC.multiply(tStockInout1.getStockInoutNum(), WCC.MINUS_ONE);
				}
				dto.setStockOutNum(sumStockOutNum);
				// [C-NIS-0002] 受入ケース数、受入ピース数を追加する 2015.07.01 hayashi Strat
				// [Ver3.0] unit of measure対応 2017.11.29 駱 Del
				// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
				// 商品最小荷姿単位名称
				dto.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tStockInout1.getTStock().getMProduct()));
				// 入数内訳
				dto.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStockInout1.getTStock().getMProduct()));
				// 払出内訳
				dto.setStockOutBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sumStockOutNum, minimumUnitMap, parentUnitNumMap
						, parentUnitMap, tStockInout1.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
				// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
				// [Ver3.0] unit of measure対応 2017.11.29 駱 End
				// [C-NIS-0002] 受入ケース数、受入ピース数を追加する 2015.07.01 hayashi End
			}

			//「入庫実績ボディID」がNULL以外の場合
			if (tStockInout1.getStoreRecordBId() != null) {

				String strDate = tStockInout1.getTStock().getTLot().getLimitDt();

				if (CU.isNullOrEmpty(strDate)) {
					dto.setFinishDt("");
				} else {
					Date dateTemp = null;
					dateTemp = new SimpleDateFormat(BaseConst.BASE_DATE_FORMAT_STRING).parse(strDate);

					Calendar calendar = new GregorianCalendar();
					calendar.setTime(dateTemp);
					int days = 0;

					if (tStockInout1.getTStock().getMProduct().getReceiveLimitNum() == null) {
						days = 0;
					} else {
						days = new Long(tStockInout1.getTStock().getMProduct().getReceiveLimitNum()).intValue() * (-1);
					}

					calendar.add(Calendar.DATE, days);
					strDate = new SimpleDateFormat(BaseConst.BASE_DATE_FORMAT_STRING).format(calendar.getTime());
					dto.setFinishDt(strDate);
				}

				// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start
				dto.setClientReceiveNo(tStockInout1.chaseTStoreRecordB().chaseTStoreRecordH().getClientReceiveNo());
				// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End

				//「引当指示ボディID」がNULL以外の場合
			} else if (tStockInout1.getAllocInstBId() != null) {

				String strDate = tStockInout1.getTStock().getTLot().getLimitDt();

				if (CU.isNullOrEmpty(strDate)) {
					dto.setFinishDt("");
				} else {
					Date dateTemp = null;
					dateTemp = new SimpleDateFormat(BaseConst.BASE_DATE_FORMAT_STRING).parse(strDate);

					Calendar calendar = new GregorianCalendar();
					calendar.setTime(dateTemp);
					int days = 0;

					if (tStockInout1.getTStock().getMProduct().getShippingLimitNum() == null) {
						days = 0;
					} else {
						days = new Long(tStockInout1.getTStock().getMProduct().getShippingLimitNum()).intValue() * (-1);
					}

					calendar.add(Calendar.DATE, days);
					strDate = new SimpleDateFormat(BaseConst.BASE_DATE_FORMAT_STRING).format(calendar.getTime());
					dto.setFinishDt(strDate);
				}

				// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana Start
				// 顧客出荷伝票No.つなげて設定
				List<String> clientNoList = new ArrayList<String>();
				for (TShippingInstH instH : tStockInout1.chaseTAllocInstB().chaseTAllocInstH().getTShippingInstHList()) {
					String clientNo = instH.getClientShippingNo();
					if (CU.isNullOrEmpty(clientNo)) {
						continue;
					}

					clientNoList.add(clientNo);
				}

				if (0 < clientNoList.size()) {

					dto.setClientShippingNo(CU.join(" , ", clientNoList));
				}
				// [ON推-品向-861] 入荷、出荷の顧客伝票Noを表示 2015.07.10 kawana End
			}

			//判断結果をリターンの在庫受払リストを設定する
			dto.setClientCd(tStockInout1.getTStock().getMClient().getClientCd());
			dto.setCenterCd(tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterCd());
			//荷主センタ変更対応 2017.02.14 sja Start
			dto.setClientNm(tStockInout1.getTStock().getMClient().getClientNm());
			dto.setCenterNm(tStockInout1.getTStock().getMWarehouse().getMCenter().getCenterNm());
			//荷主センタ変更対応 2017.02.14 sja End
			dto.setWarehouseCd(tStockInout1.getTStock().getMWarehouse().getWarehouseCd());
			dto.setWarehouseNm(tStockInout1.getTStock().getMWarehouse().getWarehouseNm());
			dto.setProductCd(tStockInout1.getTStock().getMProduct().getProductCd());
			dto.setProductNm(tStockInout1.getTStock().getMProduct().getProductNm());
			dto.setProductAbbr(tStockInout1.getTStock().getMProduct().getProductAbbr());
			dto.setJanCd(tStockInout1.getTStock().getMProduct().getJanCd());
			dto.setProcessDt(tStockInout1.getProcessDt());
			dto.setDepositCd(tStockInout1.getTStock().getMCustomer().getCustomerCd());
			dto.setDepositNm(tStockInout1.getTStock().getMCustomer().getCustomerNm());
			dto.setStockTypeCd(tStockInout1.getTStock().getMStockType().getStockTypeCd());
			dto.setStockTypeNm(tStockInout1.getTStock().getMStockType().getVDict().getDictNm());
			dto.setLot(tStockInout1.getTStock().getTLot().getLot());
			dto.setLimitDt(tStockInout1.getTStock().getTLot().getLimitDt());
			dto.setStoreLabelNo(tStockInout1.getTStock().getTStoreNo().getStoreLabelNo());
			//[ON推-品質問題点指摘票(新ｿﾘV2-064)] 修正対応 2016.08.24 chou Add Start
			dto.setStoreDt(tStockInout1.getTStock().getTStoreNo().getStoreDt());
			//[ON推-品質問題点指摘票(新ｿﾘV2-064)] 修正対応 2016.08.24 chou Add End

			if (tStockInout1.getTStock().getTStoreNo().getTStoreNoSelf() == null) {
				dto.setStoreLabelNoOld("");
			} else {
				dto.setStoreLabelNoOld(tStockInout1.getTStock().getTStoreNo().getTStoreNoSelf().getStoreLabelNo());
			}

			if (tStockInout1.getTStock().getTStoreNo().getMCustomer() == null) {
				dto.setSupplierCd("");
				dto.setSupplierNm("");
				dto.setSupplierAbbr("");
			} else {
				dto.setSupplierCd(tStockInout1.getTStock().getTStoreNo().getMCustomer().getCustomerCd());
				dto.setSupplierNm(tStockInout1.getTStock().getTStoreNo().getMCustomer().getCustomerNm());
				dto.setSupplierAbbr(tStockInout1.getTStock().getTStoreNo().getMCustomer().getCustomerAbbr());
			}
			dto.setProcessTypeCd(tStockInout1.getMProcessType().getProcessTypeCd());
			dto.setProcessTypeNm(tStockInout1.getMProcessType().getVDict().getDictNm());
			if (tStockInout1.getTStock().getMLocation() == null) {
				dto.setLocationCd("");
				dto.setLocationNm("");
			} else {
				dto.setLocationCd(tStockInout1.getTStock().getMLocation().getLocationCd());
				dto.setLocationNm(tStockInout1.getTStock().getMLocation().getLocationNm());
			}
			dto.setAddDt(tStockInout1.getAddDt());

			// [#1084] 削除ユーザも表示するように修正 2017.03.14 kawana Start

			// ユーザ名称の取得 (削除ユーザも表示)

			boolean beforeAutoDelFlg = getBehaviorAutoDelFlg();
			setBehaviorAutoDelFlg(false);

			BUser buser = new BUser();
			buser.setUserCd(tStockInout1.getAddUser());
			buser = userLogic.getUkEntity(buser);
			if (buser != null) {
				dto.setAddUser(buser.getUserNm());
			}

			setBehaviorAutoDelFlg(beforeAutoDelFlg);

			// [#1084] 削除ユーザも表示するように修正 2017.03.14 kawana End

			dto.setProcessNo(tStockInout1.getProcessNo());

			if (tStockInout1.getTAllocInstB() == null) {
				dto.setSupplyCustomerCd("");
				dto.setSupplyCustomerNm("");
				dto.setSupplyCustomerAbbr("");

			} else {

				if (tStockInout1.getTAllocInstB().getTAllocInstH().getMCustomerBySupplyCustomerId() == null) {
					dto.setSupplyCustomerCd("");
					dto.setSupplyCustomerNm("");
					dto.setSupplyCustomerAbbr("");
				} else {
					dto.setSupplyCustomerCd(tStockInout1.getTAllocInstB().getTAllocInstH().getMCustomerBySupplyCustomerId().getCustomerCd());
					dto.setSupplyCustomerNm(tStockInout1.getTAllocInstB().getTAllocInstH().getMCustomerBySupplyCustomerId().getCustomerNm());
					dto.setSupplyCustomerAbbr(tStockInout1.getTAllocInstB().getTAllocInstH().getMCustomerBySupplyCustomerId().getCustomerAbbr());
				}
			}

			if (tStockInout1.getTMoveRecordB() == null) {
				dto.setMoveInstComment("");
			} else {
				dto.setMoveInstComment(tStockInout1.getTMoveRecordB().getTMoveInstH().getMoveInstComment());
			}

			if (tStockInout1.getTStock().getMLocation() == null) {
				dto.setAllocNgFlg("");
				dto.setAllocNgFlgName("");
			} else {
				dto.setAllocNgFlg(tStockInout1.getTStock().getMLocation().getAllocNgFlg());

				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
				if (tStockInout1.getTStock().getMLocation().getBClassDtlByAllocNgFlg() == null) {
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
					dto.setAllocNgFlgName("");
				} else {
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
					dto.setAllocNgFlgName(tStockInout1.getTStock().getMLocation().getBClassDtlByAllocNgFlg().getVDict().getDictNm());
					// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
				}
			}
			dto.setSortFlg("2");
			retList.add(dto);

		}

		if (retList.size() > 0) {
			// 当日在庫数の取得
			sumChargeNumToday = WCC.ZERO;
			if (mClientCenter.getSystemDt().compareTo(tStockInout.getProcessDtTo()) <= 0) {
				for (int j = 0; j < tStockListTo.size(); j++) {
					// [#6069][v2.2] 削除商品が検索結果に含まれると致命的エラーが発生 2019.02.27 kawana Start
					if (tStockInoutBefore.getTStock().getMProduct().getProductCd().equals(tStockListTo.get(j).chaseMProduct().getProductCd())
							&& tStockInoutBefore.getTStock().getMClient().getClientCd().equals(tStockListTo.get(j).chaseMClient().getClientCd())
							&& tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterCd().equals(tStockListTo.get(j).chaseMWarehouse().chaseMCenter().getCenterCd())) {
					// [#6069][v2.2] 削除商品が検索結果に含まれると致命的エラーが発生 2019.02.27 kawana End
						sumChargeNumToday = WCC.add(sumChargeNumToday, tStockListTo.get(j).getChargeNum());
					}
				}
			} else {
				for (int j = 0; j < hStockReportListTo.size(); j++) {
					if (tStockInoutBefore.getTStock().getMProduct().getProductCd().equals(hStockReportListTo.get(j).getHStock().getProductCd())
							&& tStockInoutBefore.getTStock().getMClient().getClientCd().equals(hStockReportListTo.get(j).getHStock().getClientCd())
							&& tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterCd().equals(hStockReportListTo.get(j).getHStock().getCenterCd())) {
						sumChargeNumToday = WCC.add(sumChargeNumToday, hStockReportListTo.get(j).getChargeNum());
					}
				}
			}
			// 当日在庫のレコード作成
			dto = new StockInOutListDto();
			dto.setClientCd(tStockInoutBefore.getTStock().getMClient().getClientCd());
			dto.setCenterCd(tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterCd());
			//荷主センタ変更対応 2017.02.14 sja Start
			dto.setClientNm(tStockInoutBefore.getTStock().getMClient().getClientNm());
			dto.setCenterNm(tStockInoutBefore.getTStock().getMWarehouse().getMCenter().getCenterNm());
			//荷主センタ変更対応 2017.02.14 sja End
			dto.setProductCd(tStockInoutBefore.getTStock().getMProduct().getProductCd());
			dto.setProductNm(tStockInoutBefore.getTStock().getMProduct().getProductNm());
			dto.setProductAbbr(tStockInoutBefore.getTStock().getMProduct().getProductAbbr());
			dto.setJanCd(tStockInoutBefore.getTStock().getMProduct().getJanCd());
			dto.setProcessDt(tStockInout.getProcessDtTo());
			dto.setChargeNum(sumChargeNumToday);
			// [C-NIS-0002] 当日ケース数、当日ピース数を追加する 2015.07.01 hayashi Strat
			// [Ver3.0] unit of measure対応 2017.11.29 駱 Del
			// [Ver3.0] unit of measure対応 2017.11.29 駱 Start
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod Start
			// 商品最小荷姿単位名称
			dto.setProductUnit(WmsMultipleShapeUtil.getProductMinimumUnit(minimumUnitMap, tStockInout1.getTStock().getMProduct()));
			// 入数内訳
			dto.setUnitNumBreakdown(WmsMultipleShapeUtil.getUnitNumBreakdown(decimalExistFlgMap, minimumUnitMap, parentUnitNumMap, parentUnitMap, tStockInout1.getTStock().getMProduct()));
			// 当日在庫内訳
			dto.setChargeBreakdown(WmsMultipleShapeUtil.getPlanBreakdown(decimalExistFlgMap, sumChargeNumToday, minimumUnitMap, parentUnitNumMap
					, parentUnitMap, tStockInout1.getTStock().getMProduct(), WmsMultipleShapeUtil.DisplayMode.SHAPE_ONLY));
			// [#3798][Ver3.0] 商品マスタ未存在データ参照ABEND 2018.02.21 honma Mod End
			// [Ver3.0] unit of measure対応 2017.11.29 駱 End
			// [C-NIS-0002] 当日ケース数、当日ピース数を追加する 2015.07.01 hayashi End
			dto.setSortFlg("3");
			retList.add(dto);
		}
		// [検査-231] 受払履歴からも取得するように大幅修正 2014.12.05 koseki End

		//===== ０件チェック =====
		if (retList.size() == 0) {
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}
		return retList;
	}
}
