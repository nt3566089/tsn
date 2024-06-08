package com.oneslogi.wms.logic.shipping;

import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.scoping.SubQuery;

import com.oneslogi.base.dbflute.cbean.TPackingHCB;
import com.oneslogi.base.dbflute.cbean.TPackingRCB;
import com.oneslogi.base.dbflute.cbean.TPickingHCB;
import com.oneslogi.base.dbflute.exbhv.TPackingRBhv;
import com.oneslogi.base.dbflute.exbhv.TPickingHBhv;
import com.oneslogi.base.dbflute.exentity.TAllocInstH;
import com.oneslogi.base.dbflute.exentity.TPackingH;
import com.oneslogi.base.dbflute.exentity.TPackingR;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 積込リスト発行ロジッククラス
 */
public class StwListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TPickingHBhv tPickingHBhv;

	@Inject
	private TPackingRBhv tPackingRBhv;

	/**
	 * <h2>積込リストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に積込リストデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 *
	 * @param tPackingR 出庫帳票：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<TPickingH> 出庫ヘッダリスト
	 */
	public List<TPickingH> select(final TPackingR tPackingR,ErrorStatus errSts) {

		List<TPickingH> result = null;

		// ===== 積込リストデータ取得 =====
		 TPickingHCB tPickingHCB = tPickingHBhv.newMyConditionBean();

		 // 検索条件の設定
		 tPickingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrier();
		 tPickingHCB.setupSelect_MClient();
		 tPickingHCB.setupSelect_MCenter();
		 tPickingHCB.setupSelect_MProcessType().withVDict(getCultureId());

		//出庫ヘッダの出庫ヘッダIDのCOUNT値を抽出
		 tPickingHCB.specify().derivedTPackingHList().count(new SubQuery<TPackingHCB>() {
				@Override
				public void query(TPackingHCB subCB) {
					//[SK2-030]「個口数が梱包明細修正画面と積込リスト・配送コース別出荷進捗・出荷確定一覧で正しく表示するよう」に修正 2014.12.11 衛 Start
					//検索条件
					// [SK2-048] 梱包ボディがない梱包ヘッダが削除されたので、[SK2-030]対応部分を外して、元の処理を戻るように修正 2014.12.15 許 Start
					subCB.specify().columnPackingHId();
					setDelFlg(subCB);
					// [SK2-048] 梱包ボディがない梱包ヘッダが削除されたので、[SK2-030]対応部分を外して、元の処理を戻るように修正 2014.12.15 許 End
					//[SK2-030]「個口数が梱包明細修正画面と積込リスト・配送コース別出荷進捗・出荷確定一覧で正しく表示するよう」に修正 2014.12.11 衛 End
				}
			}, TPickingH.ALIAS_sumPickingHCount);

		 //ソート条件
		 tPickingHCB.query().queryMClient().addOrderBy_ClientCd_Asc();
		 tPickingHCB.query().queryMCenter().addOrderBy_CenterCd_Asc();
		 tPickingHCB.query().queryTAllocInstH().addOrderBy_ShippingDt_Asc();
		 tPickingHCB.query().queryTAllocInstH().queryMDeliveryCourse().addOrderBy_DeliveryCourseCd_Asc();
		 tPickingHCB.query().queryTAllocInstH().addOrderBy_SupplyCustomerCd_Asc();
		 tPickingHCB.query().queryMProcessType().addOrderBy_ProcessTypeCd_Asc();
		 tPickingHCB.query().addOrderBy_PickingWorkNo_Asc();
		 tPickingHCB.query().existsTPackingHList(new SubQuery<TPackingHCB>() {
			 @Override
				public void query(TPackingHCB tPackingHCB) {
					tPackingHCB.query().queryMClient();
					tPackingHCB.query().queryMCenter();
					tPackingHCB.query().queryTPackingRAsOne();
					tPackingHCB.query().queryTAllocInstH();
					tPackingHCB.query().queryTAllocInstH().queryMDeliveryCourse().queryMCarrier();
					tPackingHCB.query().queryMProcessType().queryVDict(getCultureId());
					//検索条件
					tPackingHCB.query().queryTPackingRAsOne().setControlNo_Equal(tPackingR.getControlNo());
				}
			});

		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana Start
		// 検索実行
		result = selectListToReport(tPickingHBhv, tPickingHCB);
		// [ON推-品向-601] 帳票用の検索を共通メソッドを使用するように変更 2015.04.17 kawana End

		 tPickingHBhv.loadTPackingHList(result, new ConditionBeanSetupper<TPackingHCB>(){
				public void setup(TPackingHCB tPackingHCB) {
					tPackingHCB.setupSelect_MClient();
					tPackingHCB.setupSelect_MCenter();
					tPackingHCB.setupSelect_TPackingRAsOne();
					tPackingHCB.setupSelect_TAllocInstH();
					tPackingHCB.setupSelect_TAllocInstH().withMDeliveryCourse().withMCarrier();
					tPackingHCB.setupSelect_MProcessType().withVDict(getCultureId());
					//検索条件
					tPackingHCB.query().queryTPackingRAsOne().setControlNo_Equal(tPackingR.getControlNo());
					tPackingHCB.query().queryTPackingRAsOne().addOrderBy_StwOutFlg_Asc();
				}
			});

		 for(TPickingH th:result){
			 for(int i = 0 ; i < th.getTPackingHList().size(); i++){
//				 if(th.getTPackingHList().get(i).chaseTPackingRAsOne().getStwOutFlg().equals("1")){
				 if(CU.equals(th.getTPackingHList().get(i).chaseTPackingRAsOne().getStwOutFlg(), "1")) {
					 th.setStwOutFlg(th.getTPackingHList().get(i).chaseTPackingRAsOne().getStwOutFlg());
				 }
				 else{
					 th.setStwOutFlg("0");
				 }
			 }
		 }

		 TPickingH temp = null;
		 boolean exchange = false;
		 for (int i = 0; i < result.size(); i++) {
			 exchange = false;
		     for (int j = result.size() - 2; j >= i; j--) {

		    	 if (((TPickingH) result.get(j + 1)).getStwOutFlg().compareTo(
		    		((TPickingH) result.get(j)).getStwOutFlg()) < 0) {
		    		 temp = (TPickingH) result.get(j + 1);
		             result.set(j + 1, (TPickingH) result.get(j));
		             result.set(j, temp);
		             exchange = true;
		    	 }
		     }
		     if (!exchange)
		    	 break;
		 }

		 // ===== ０件チェック =====

		 if (result.size() == 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		 }
		return result;
	}

	/**
	 * <h2>梱包帳票を更新する。</h2>
	 * <pre>
	 *
	 * 引数を絞り込み条件に設定し、梱包帳票を更新する。
	 * 対象が見つからない場合、０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param update 梱包帳票(更新用)：全項目
	 * @param tPackingH 梱包ヘッダ：荷主ID・センタID
	 * @param tAllocInstH 引当指示ヘッダ：出荷日・配送コースID
	 * @param report 梱包帳票(検索用)：積込リスト出力フラグ
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateControlNo(TPackingR update, TPackingH tPackingH,TAllocInstH tAllocInstH,TPackingR report, ErrorStatus errStatus) {

		List<TPackingR> result = null;

		// ===== 積込リストデータ取得 =====

		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.setupSelect_TPackingH();
		cb.setupSelect_TPackingH().withTAllocInstH();
		cb.setupSelect_TPackingH().withTPickingH();
		// [C-CWMS-0051] 積込リストの発行条件から検品フラグ(検品済)を削除 2015.11.04 kawana

		cb.query().queryTPackingH().queryTPickingH().setClientId_Equal(tPackingH.getClientId());
		cb.query().queryTPackingH().queryTPickingH().setCenterId_Equal(tPackingH.getCenterId());
		cb.query().queryTPackingH().queryTAllocInstH().setShippingDt_Equal(tAllocInstH.getShippingDt());
		cb.query().queryTPackingH().queryTAllocInstH().setDeliveryCourseId_Equal(tAllocInstH.getDeliveryCourseId());
		cb.query().setStwOutFlg_Equal(report.getStwOutFlg());
		cb.query().queryTPackingH().queryMProcessType().setReceiveFlg_Equal_$0();
		cb.query().queryTPackingH().queryMProcessType().setShippingFlg_Equal_$1();
		cb.query().queryTPackingH().queryMProcessType().setStockAdjustFlg_Equal_$0();

		// ===== 梱包帳票の更新の更新 =====

		tPackingRBhv.queryUpdate(update, cb);

		// ===== データ存在チェック =====

		result = tPackingRBhv.selectList(cb);

		if (result.size() == 0) {
			this.getErrorManager().add(errStatus, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return;
		}
	}

	/**
	 * <h2>梱包帳票を更新する。</h2>
	 * <pre>
	 * 梱包帳票のデータを更新する。
	 *
	 * </pre>
	 * @param update 梱包帳票(更新用)：全項目
	 * @param report 梱包帳票(検索用)：コントロールNo.
	 * @param errStatus エラー時に設定するエラーステータス
	 */
	public void updateSlOutFlg(TPackingR update, TPackingR report, ErrorStatus errStatus) {

		// ===== 梱包帳票データ更新 =====

		// 更新条件
		TPackingRCB cb = tPackingRBhv.newMyConditionBean();
		cb.checkInvalidQuery();
		cb.query().setControlNo_Equal(report.getControlNo());

		// ===== 梱包帳票の更新実行 =====

		tPackingRBhv.queryUpdate(update, cb);
	}

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana Start

	/**
	 * <h2>梱包帳票の積込リスト出力フラグをクリアする.</h2>
	 * <pre>
	 * センタ、荷主、配送コース、出荷日単位に梱包帳票を次のように更新する。
	 * ・積込リスト出力フラグを0(未発行)に設定
	 * ・積込リスト出力者IDをnullに設定
	 * ・積込リスト出力日時をnullに設定
	 * </pre>
	 * @param tAllocInstH 引当指示ヘッダ：荷主ID・センタID・出荷日・配送コースID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void clearStwOutFlg(TAllocInstH tAllocInstH, ErrorStatus errSts) {

		TPackingR updateEntity = new TPackingR();

		updateEntity.setStwOutFlg_$0();
		updateEntity.setStwOutUserId(null);
		updateEntity.setStwOutDt(null);

		TPackingRCB cb = tPackingRBhv.newMyConditionBean();

		cb.checkInvalidQuery();
		cb.query().queryTPackingH().queryTPickingH().setClientId_Equal(tAllocInstH.getClientId());
		cb.query().queryTPackingH().queryTPickingH().setCenterId_Equal(tAllocInstH.getCenterId());
		cb.query().queryTPackingH().queryTAllocInstH().setShippingDt_Equal(tAllocInstH.getShippingDt());
		cb.query().queryTPackingH().queryTAllocInstH().setDeliveryCourseId_Equal(tAllocInstH.getDeliveryCourseId());

		tPackingRBhv.queryUpdate(updateEntity, cb);
	}

	// [#3018] 出荷実績訂正時に梱包データを維持する 2018.02.16 kawana End
}
