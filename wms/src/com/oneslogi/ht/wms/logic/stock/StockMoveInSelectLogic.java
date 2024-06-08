package com.oneslogi.ht.wms.logic.stock;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.cbean.scoping.OrQuery;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.MParamCB;
import com.oneslogi.base.dbflute.cbean.TMoveInstBCB;
import com.oneslogi.base.dbflute.cbean.TMoveRecordBCB;
import com.oneslogi.base.dbflute.exbhv.MParamBhv;
import com.oneslogi.base.dbflute.exbhv.TMoveInstBBhv;
import com.oneslogi.base.dbflute.exentity.BUser;
import com.oneslogi.base.dbflute.exentity.MParam;
import com.oneslogi.base.dbflute.exentity.MProduct;
import com.oneslogi.base.dbflute.exentity.MWarehouse;
import com.oneslogi.base.dbflute.exentity.TMoveInstB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 在庫移動入庫取得ロジッククラス
 */
public class StockMoveInSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	/* 在庫移動指示ボディ     */
	@Inject
	private TMoveInstBBhv tMoveInstBBhv;

	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
	/* パラメータマスタ         */
	@Inject
	private MParamBhv mParamBhv;
	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */

	/**
	 * <h2>在庫移動指示ボディデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから在庫移動指示ボディデータを検索して返却する。
	 * 検索対象が見つからない場合、0件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID・JANCD
	 * @param mWarehouse 倉庫マスタ：倉庫ID・センタID
	 * @param bUser ユーザマスタ：カルチャID
	 * @param blnFlg true：未作業、入庫の検索条件を追加
	 * @return List<TMoveInstB> 在庫移動指示ボディリスト
	 */
	public List<TMoveInstB> selectTMoveInstB(final MProduct mProduct, MWarehouse mWarehouse,
			BUser bUser, boolean blnFlg) {

		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();

		tMoveInstBCB.setupSelect_MWarehouse();
		tMoveInstBCB.setupSelect_TLot();
		tMoveInstBCB.setupSelect_MStockType().withVDict(bUser.getCultureId());
		tMoveInstBCB.setupSelect_MProduct();
		tMoveInstBCB.setupSelect_MLocation();
		tMoveInstBCB.setupSelect_MCustomerByDepositId();
		tMoveInstBCB.setupSelect_MCustomerBySupplierId();
		tMoveInstBCB.setupSelect_TStoreNo().withMCustomer();
		tMoveInstBCB.setupSelect_MShape();
		// [ver3.0][#3718] 緊急補充データが画面に表示されないように修正 2018.02.14 matsumoto End
		tMoveInstBCB.setupSelect_TMoveInstH().withMProcessType();
		// [ver3.0][#3718] 緊急補充データが画面に表示されないように修正 2018.02.14 matsumoto End
		tMoveInstBCB.query().queryMWarehouse().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		//[HT1.5-CT1-016] 他センタ・荷主の絞り込みが抜けている 2015/06/05 yokosuka [S]
		tMoveInstBCB.query().queryTMoveInstH().setClientId_Equal(mProduct.getClientId());
		tMoveInstBCB.query().queryTMoveInstH().setCenterId_Equal(mWarehouse.getCenterId());
		//[HT1.5-CT1-016] 他センタ・荷主の絞り込みが抜けている 2015/06/05 yokosuka [E]
		//[HT1.5-CT1-009] 在庫検索時には取引先マスタのフラグ確認は必要ない 2015/06/05 yokosuka [S]
		////預託フラグ＝'1’
		//tMoveInstBCB.query().queryMCustomerByDepositId().setDepositFlg_Equal_$1();
		////仕入先フラグ＝'1’
		//tMoveInstBCB.query().queryMCustomerBySupplierId().setVendorFlg_Equal_$1();
		//[HT1.5-CT1-009] 在庫検索時には取引先マスタのフラグ確認は必要ない 2015/06/05 yokosuka [E]
		//在庫移動指示ステータス = '00'追加
		if (blnFlg) {
			tMoveInstBCB.query().setMoveInstStatus_Equal_$00();
			//入出庫区分 = '0'(入庫)
			tMoveInstBCB.query().setInoutType_Equal_$0();
		}

		tMoveInstBCB.orScopeQuery(new OrQuery<TMoveInstBCB>() {
			String janCd = mProduct.getJanCd();

			public void query(TMoveInstBCB orCB) {
				orCB.query().queryMProduct().setJanCd_Equal(janCd);
				orCB.query().queryMProduct().setProductCd_Equal(janCd);
			}
		});
		// [ver3.0][#3718] 緊急補充データが画面に表示されないように修正 2018.02.14 matsumoto Start
		tMoveInstBCB.query().notExistsTMoveRecordBList(new SubQuery<TMoveRecordBCB>() {

			@Override
			public void query(TMoveRecordBCB subCB) {
				subCB.query().queryTMoveInstH().queryMProcessType().setProcessTypeCd_Equal(CDef.ProcessTypeCd.$33.code());;
			}
		});
		// [ver3.0][#3718] 緊急補充データが画面に表示されないように修正 2018.02.14 matsumoto End

		List<TMoveInstB> lstTMoveInstB = tMoveInstBBhv.selectList(tMoveInstBCB);

		if (lstTMoveInstB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstTMoveInstB;
		}

		return lstTMoveInstB;
	}

	/**
	 * <h2>在庫移動指示ボディデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に在庫移動指示ボディからデータを検索して返却する。
	 * </pre>
	 * @param tMoveInstB 在庫移動指示ボディ：在庫移動指示ヘッダID
	 * @param bUser ユーザマスタ：カルチャID
	 * @return TMoveInstB 在庫移動指示ボディ
	 */
	public TMoveInstB selectMLocation(final TMoveInstB tMoveInstB, BUser bUser) {

		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();

		tMoveInstBCB.setupSelect_MLocation();
		tMoveInstBCB.query().setMoveInstHId_Equal(tMoveInstB.getMoveInstHId());
		tMoveInstBCB.query().setInoutType_Equal_$1();
		tMoveInstBCB.setupSelect_MWarehouse();
		tMoveInstBCB.setupSelect_TLot();
		tMoveInstBCB.setupSelect_MStockType().withVDict(bUser.getCultureId());
		tMoveInstBCB.setupSelect_MProduct();
		tMoveInstBCB.setupSelect_MLocation();
		tMoveInstBCB.setupSelect_MCustomerByDepositId();
		tMoveInstBCB.setupSelect_MCustomerBySupplierId();
		tMoveInstBCB.setupSelect_TStoreNo().withMCustomer();
		tMoveInstBCB.setupSelect_MShape();
		tMoveInstBCB.setupSelect_TMoveInstH();

		List<TMoveInstB> lstTMoveInstB = tMoveInstBBhv.selectList(tMoveInstBCB);

		return lstTMoveInstB.get(0);
	}

	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA Start */
	/**
	 * <h2>パラメータマスタデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にパラメータマスタデータを取得する。
	 * 取得した１件目のデータを返す。
	 * </pre>
	 * @param clientId 荷主ID
	 * @param centerId センタID
	 * @return MParam パラメータマスタ
	 */
	public MParam getMParam(Long clientId, Long centerId) {

		//パラメータ情報の取得
		MParamCB mParamCB = mParamBhv.newMyConditionBean();
		mParamCB.setupSelect_MClientCenter();
		mParamCB.query().queryMClientCenter().setClientId_Equal(clientId);
		mParamCB.query().queryMClientCenter().setCenterId_Equal(centerId);
		List<MParam> lstMParam = mParamBhv.selectList(mParamCB);

		if (lstMParam.size() > 0) {
			return lstMParam.get(0);
		} else {
			// 0: 管理しない
			return null;
		}
	}

	/**
	 * <h2>在庫移動指示ボディデータを取得する。</h2>
	 * <pre>
	 * 引数を条件にデータベースから在庫移動指示ボディデータを検索して返却する。
	 * 検索対象が見つからない場合、0件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param mProduct 商品マスタ：荷主ID
	 * @param mWarehouse 倉庫マスタ：倉庫ID・センタID
	 * @param bUser ユーザマスタ：カルチャID
	 * @param blnFlg true：未作業、入庫の検索条件を追加
	 * @param storeLabelNo 入庫ラベルNo.
	 * @return List<TMoveInstB> 在庫移動指示ボディリスト
	 */
	public List<TMoveInstB> selectTMoveInstB(final MProduct mProduct, MWarehouse mWarehouse,
			BUser bUser, boolean blnFlg,String storeLabelNo) {

		TMoveInstBCB tMoveInstBCB = tMoveInstBBhv.newMyConditionBean();

		tMoveInstBCB.setupSelect_MWarehouse();
		tMoveInstBCB.setupSelect_TLot();
		tMoveInstBCB.setupSelect_MStockType().withVDict(bUser.getCultureId());
		tMoveInstBCB.setupSelect_MProduct();
		tMoveInstBCB.setupSelect_MLocation();
		tMoveInstBCB.setupSelect_MCustomerByDepositId();
		tMoveInstBCB.setupSelect_MCustomerBySupplierId();
		tMoveInstBCB.setupSelect_TStoreNo().withMCustomer();

		tMoveInstBCB.setupSelect_MShape();
		tMoveInstBCB.setupSelect_TMoveInstH();
		tMoveInstBCB.query().queryMWarehouse().setWarehouseId_Equal(mWarehouse.getWarehouseId());
		tMoveInstBCB.query().queryTMoveInstH().setClientId_Equal(mProduct.getClientId());
		tMoveInstBCB.query().queryTMoveInstH().setCenterId_Equal(mWarehouse.getCenterId());
		//在庫移動指示ステータス = '00'追加
		if (blnFlg) {
			tMoveInstBCB.query().setMoveInstStatus_Equal_$00();
			//入出庫区分 = '0'(入庫)
			tMoveInstBCB.query().setInoutType_Equal_$0();
		}
		// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana Start
		tMoveInstBCB.query().setStoreLabelNo_Equal(storeLabelNo);
		// [#1563] 入庫ラベルNo.を使用したHT在庫移動(部分)が出来ない問題を修正 2017.04.14 kawana End

		List<TMoveInstB> lstTMoveInstB = tMoveInstBBhv.selectList(tMoveInstBCB);

		if (lstTMoveInstB.size() == 0) {
			//該当データが存在しません。
			getErrorManager().add(new ErrorStatus(), WmsMessageConst.HANDY_DATA_NOT_FOUND_ERROR);
			return lstTMoveInstB;
		}

		return lstTMoveInstB;
	}
	/* [次期エンハンス] 入庫No管理判定追加 2015.09.16 By SJA End */
}