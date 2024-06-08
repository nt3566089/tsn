package com.oneslogi.wms.logic.receive;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.inject.Inject;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;

import com.oneslogi.base.dbflute.cbean.TReceivePlanBCB;
import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.cbean.TStoreRecordBCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.WCC;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

/**
 * 入荷予定ステータス更新ロジッククラス
 */
public class ReceiveStatusUpdateLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;

	/**
	 * <h2>入荷ステータス更新処理を行う（入荷済）。</h2>
	 * <pre>
	 * 入荷予定ボディリストが0件の場合は、致命的例外をスローする。
	 * 入荷予定ボディデータの入荷ステータスを入荷済に更新する。
	 * 引数（入荷予定ボディリスト）の入荷予定ヘッダIDをキーに入荷予定ボディデータを検索する。
	 * 検索結果の入荷ステータス(最小値)が入荷済の場合は、入荷予定ヘッダデータの入荷ステータスを入荷済に更新する。
	 * 検索結果の入荷ステータス(最小値)が入荷済以外の場合は、入荷予定ヘッダデータの入荷ステータスを入荷中に更新する。
	 * </pre>
	 * @param rPlanBodyList 入荷予定ボディリスト：入荷予定ボディID・入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void received( List<TReceivePlanB> rPlanBodyList, ErrorStatus errSts) {

		// ===== rPlanBodyListの件数＝0の場合 =====
		if (rPlanBodyList.size() == 0) {
			// ===== 致命的例外をスローする =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return ;

		} else {

			// ===== rPlanBodyListのデータ件数分繰返 =====
			for (TReceivePlanB body : rPlanBodyList) {

				// ===== 入荷予定ボディIDの取得 =====
				long bodyId = body.getReceivePlanBId();
				// ===== 入荷予定ボディを検索条件 =====
				TReceivePlanBCB cb_A = tReceivePlanBBhv.newMyConditionBean();
				cb_A.query().setReceivePlanBId_Equal(bodyId);
				// ===== 入荷予定ボディを検索実行 =====
				List<TReceivePlanB> RPB_A = tReceivePlanBBhv.selectList(cb_A);
				// ===== 入荷予定ボディが1件の場合 =====
				if(RPB_A.size() == 1)
				{
					// ===== 入荷ステータスに"03"(入荷済)設定 =====
					RPB_A.get(0).setReceiveStatus_$03();
					// ===== 入荷予定ボディの更新実行 =====
				    tReceivePlanBBhv.update(RPB_A.get(0));
				}else{
					// ===== 致命的例外をスローする(状態不正) =====
					this.getErrorManager().throwException(new IllegalStateException());
					return ;
				}

				// ===== 入荷予定ボディを検索 =====
				TReceivePlanBCB cb_B = tReceivePlanBBhv.newMyConditionBean();
				cb_B.query().setReceivePlanHId_Equal(body.getReceivePlanHId());
				// ===== 入荷予定ボディを検索実行 =====
				List<TReceivePlanB> RPB_B = tReceivePlanBBhv.selectList(cb_B);

				// ===== 入荷ステータスの集約用リストreceiveStatusListの初期化 =====
				List<String> receiveStatusList = new  ArrayList<String>();
				for (TReceivePlanB body_H : RPB_B) {
					receiveStatusList.add(body_H.getReceiveStatus());
				}

				if(receiveStatusList.size() != 0) {

					// ===== ASC =====
					Collections.sort(receiveStatusList);

					// ===== 入荷予定ボディ.入荷ステータス(最小値)＝"03"(入荷済)の場合 =====
					if ("03".equals(receiveStatusList.get(0))  ){
						// ===== 入荷予定ヘッダIDの取得 =====
						long headId_C = body.getReceivePlanHId() ;


						// ===== 入荷予定ヘッダィを検索件数 =====
						TReceivePlanHCB cb_C = tReceivePlanHBhv.newMyConditionBean();
						cb_C.query().setReceivePlanHId_Equal(headId_C);

						// ===== 入荷予定ヘッダィを検索実行 =====
						List<TReceivePlanH> RPH_C = tReceivePlanHBhv.selectList(cb_C);

						if(RPH_C.size() ==1){
							// ===== 入荷ステータスに"03"(入荷済)設定 =====
							RPH_C.get(0).setReceiveStatus_$03();
							// ===== 入荷予定ヘッダの更新実行 =====
							tReceivePlanHBhv.update(RPH_C.get(0));
						}else{
							// ===== 致命的例外をスローする(状態不正) =====
							this.getErrorManager().throwException(new IllegalStateException());
							return ;
						}

					}else{
						// ===== 入荷予定ボディ.入荷ステータス(最小値)＝"03"(入荷済)以外の場合 =====
						// ===== 入荷予定ヘッダIDの取得 =====
						long headId_D = body.getReceivePlanHId() ;

						// ===== 入荷予定ヘッダィを検索条件 =====
						TReceivePlanHCB cb_D = tReceivePlanHBhv.newMyConditionBean();
						cb_D.query().setReceivePlanHId_Equal(headId_D);
						// ===== 入荷予定ヘッダィを検索実行 =====
						List<TReceivePlanH> RPH_D = tReceivePlanHBhv.selectList(cb_D);
						if(RPH_D.size() ==1){
							// ===== 入荷ステータスに"02"(入荷中)設定 =====
							RPH_D.get(0).setReceiveStatus_$02();
							// ===== 入荷予定ヘッダの更新実行 =====
							tReceivePlanHBhv.update(RPH_D.get(0));
						}else{
							// ===== 致命的例外をスローする(状態不正) =====
							this.getErrorManager().throwException(new IllegalStateException());
							return ;
						}
					}
				}

			}
		}
	}

	// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana Start

	/**
	 * <p>入荷予定ヘッダステータス更新.</p>
	 * <pre>
	 * 入荷予定ヘッダのステータスを更新する。
	 * ※ queryUpdate使用 (排他に注意)
	 * ステータスの判定は次の順番で行う。
	 *
	 * (1) 入荷予定ボディのステータスが全て入荷済の場合 : 入荷済
	 * (2) 上記以外 : 入荷中
	 * </pre>
	 * @param receivePlanHId 入荷予定ヘッダID
	 * @param errSts エラー発生時に設定するエラーステータス
	 */
	public void recceivedUpdateOnlyHeader(long receivePlanHId, ErrorStatus errSts) {

		// ===== 入荷予定ボディを検索 =====

		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
		cb.query().setReceivePlanHId_Equal(receivePlanHId);
		// ステータスのみ取得
		cb.specify().columnReceiveStatus();

		List<TReceivePlanB> planBodyList = tReceivePlanBBhv.selectList(cb);

		// ===== ステータス(入荷済)の判定 =====

		boolean completed = true;
		for (TReceivePlanB body : planBodyList) {
			if (!body.isReceiveStatus$03()) {
				// 入荷済以外が存在

				completed = false;
				break;
			}
		}

		// ===== 入荷予定ヘッダのステータス更新 =====

		TReceivePlanH updateEntity = new TReceivePlanH();
		TReceivePlanHCB updateCb = tReceivePlanHBhv.newMyConditionBean();
		updateCb.query().setReceivePlanHId_Equal(receivePlanHId);

		if (completed) {
			updateEntity.setReceiveStatus_$03();
			updateCb.query().setReceiveStatus_NotEqual_$03();
		} else {
			updateEntity.setReceiveStatus_$02();
			updateCb.query().setReceiveStatus_NotEqual_$02();
		}

		tReceivePlanHBhv.queryUpdate(updateEntity, updateCb);
	}

	// [#1065] HTで一部のみ入荷した時は入荷済ではなく入荷中になるように変更 2017.03.08 kawana End

	/**
	 * <h2>入荷ステータス更新処理を行う（入荷削除）。</h2>
	 * <pre>
	 * 入荷予定ボディリストが0件の場合は、致命的例外をスローする。
	 * 入荷予定ボディデータの入荷ステータスを未入荷に更新する。
	 * 引数（入荷予定ボディリスト）の入荷予定ヘッダIDをキーに入荷予定ボディデータを検索する。
	 * 検索結果の入荷ステータス(最大値)が未入荷の場合は、入荷予定ヘッダデータの入荷ステータスを未入荷に更新する。
	 * 検索結果の入荷ステータス(最大値)が入荷削除の場合は、入荷予定ヘッダデータの入荷ステータスを入荷削除に更新する。
	 * 検索結果の入荷ステータス(最大値)がそれ以外の場合は、入荷予定ヘッダデータの入荷ステータスを入荷中に更新する。
	 *  </pre>
	 * @param rPlanBodyList 入荷予定ボディリスト：入荷予定ボディID・入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receivedCancel( List<TReceivePlanB> rPlanBodyList, ErrorStatus errSts) {

		// ===== パラメータ「rPlanBodyList」の件数＝0の場合 =====
		if(rPlanBodyList.size() ==0){

			// ===== 致命的例外をスローする(パラメータ不正) =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return ;

		}else{
			for (TReceivePlanB body : rPlanBodyList) {
				// ===== 入荷予定ボディIDの取得 =====
				long bodyId = body.getReceivePlanBId();
				// ===== 入荷予定ボディを検索条件 =====
				TReceivePlanBCB cb_A = tReceivePlanBBhv.newMyConditionBean();
				cb_A.query().setReceivePlanBId_Equal(bodyId);
				// ===== 入荷予定ボディを検索実行 =====
				List<TReceivePlanB> RPB_A = tReceivePlanBBhv.selectList(cb_A);
				// ===== 入荷予定ボディが1件の場合 =====
				if(RPB_A.size()==1)
				{
					// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(90:入荷削除)に入荷ステータスを変更するように追加 2014.12.11 許 Start
					TReceivePlanHCB recivePlanHcb = tReceivePlanHBhv.newMyConditionBean();
					recivePlanHcb.query().setReceivePlanHId_Equal(RPB_A.get(0).getReceivePlanHId());
					List<TReceivePlanH> recivePlanHList = tReceivePlanHBhv.selectList(recivePlanHcb);

					// 予定仕入れ先CDを取得する
					String strPlanSupplerCd = "";
					if(recivePlanHList.size() > 0){
						strPlanSupplerCd = recivePlanHList.get(0).getPlanSupplierCd();
						// 予定仕入れ先CDを取得しない場合、予定なしで入荷したデータを判断する条件とする
						if(CU.isNullOrEmpty(strPlanSupplerCd)) {
							// ===== 入荷ステータスに"90"(入荷削除)設定 =====
							RPB_A.get(0).setReceiveStatus_$90();
						} else {
							// ===== 入荷ステータスに"01"(未入荷)設定 =====
							RPB_A.get(0).setReceiveStatus_$01();
						}
					}
					// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(90:入荷削除)に入荷ステータスを変更するように追加 2014.12.11 許 End

					// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(01:未入荷)に入荷ステータスを変更処理の位置の変更ため、元の処理を削除する 2014.12.11 許

					// ===== 入荷予定ボディの更新実行 =====
					tReceivePlanBBhv.update(RPB_A.get(0));
				}else{
					// ===== 致命的例外をスローする(状態不正) =====
					this.getErrorManager().throwException(new IllegalStateException());
					return ;
				}

				// ===== 入荷予定ボディを検索条件 =====
				TReceivePlanBCB cb_B = tReceivePlanBBhv.newMyConditionBean();
				cb_B.query().setReceivePlanHId_Equal(body.getReceivePlanHId());
				cb_B.query().addOrderBy_ReceiveStatus_Desc();
				// ===== 入荷予定ボディを検索実行 =====
				List<TReceivePlanB> RPB_B = tReceivePlanBBhv.selectList(cb_B);

				// ===== 入荷ステータスの集約用リストreceiveStatusListの初期化 =====
				List<String> receiveStatusList = new  ArrayList<String>();
				for (TReceivePlanB body_B : RPB_B) {
					receiveStatusList.add(body_B.getReceiveStatus());
				}

				if (receiveStatusList.size() != 0){

					// ===== DESC =====
					Collections.sort(receiveStatusList, new Comparator<String>() {
						public int compare(String arg0, String arg1) {
								return arg1.compareTo(arg0);
						};
					});

					// ===== 入荷予定ボディ.入荷ステータス(最大値)＝"01"(未入荷)の場合 =====
					if ("01".equals(receiveStatusList.get(0))) {
						// ===== 入荷予定ヘッダIDの取得 =====
						long headId_C = RPB_B.get(0).getReceivePlanHId() ;

						// ===== 入荷予定ヘッダィを検索件数条件 =====
						TReceivePlanHCB cb_C = tReceivePlanHBhv.newMyConditionBean();
						cb_C.query().setReceivePlanHId_Equal(headId_C);
						// ===== 入荷予定ヘッダィを検索実行 =====
						List<TReceivePlanH> RPH_C = tReceivePlanHBhv.selectList(cb_C);

						if(RPH_C.size() ==1){
							// ===== 入荷ステータスに"01"(未入荷)設定 =====
							RPH_C.get(0).setReceiveStatus_$01();
							// ===== 入荷予定ヘッダの更新実行 =====
							tReceivePlanHBhv.update(RPH_C.get(0));
						}else{
							// ===== 致命的例外をスローする(状態不正) =====
							this.getErrorManager().throwException(new IllegalStateException());
							return ;
						}
					// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(90:入荷削除)に入荷ステータスを変更するように追加 2014.12.11 許 Start
					} else if("90".equals(receiveStatusList.get(0))){
						// ===== 入荷予定ヘッダIDの取得 =====
						long headId_D = RPB_B.get(0).getReceivePlanHId() ;

						// ===== 入荷予定ヘッダィを検索件数条件 =====
						TReceivePlanHCB cb_D = tReceivePlanHBhv.newMyConditionBean();
						cb_D.query().setReceivePlanHId_Equal(headId_D);
						// ===== 入荷予定ヘッダィを検索実行 =====
						List<TReceivePlanH>  RPH_D = tReceivePlanHBhv.selectList(cb_D);

						if(RPH_D.size() == 1){
							// ===== 入荷ステータスに"90"(入荷削除)設定 =====
							RPH_D.get(0).setReceiveStatus_$90();
							// ===== 入荷予定ヘッダの更新実行 =====
							tReceivePlanHBhv.update(RPH_D.get(0));
						}else{
							// ===== 致命的例外をスローする(状態不正) =====
							this.getErrorManager().throwException(new IllegalStateException());
							return ;
						}
						// [ON推-品向-426] 予定なしで入荷したデータを入荷取消した場合、(90:入荷削除)に入荷ステータスを変更するように追加 2014.12.11 許 End
					}else{
						// ===== 入荷予定ボディ.入荷ステータス(最大値)＝"01"(未入荷)以外の場合 =====

						// ===== 入荷予定ヘッダIDの取得 =====
						long headId_D = RPB_B.get(0).getReceivePlanHId() ;

						// ===== 入荷予定ヘッダィを検索件数条件 =====
						TReceivePlanHCB cb_D = tReceivePlanHBhv.newMyConditionBean();
						cb_D.query().setReceivePlanHId_Equal(headId_D);
						// ===== 入荷予定ヘッダィを検索実行 =====
						List<TReceivePlanH>  RPH_D = tReceivePlanHBhv.selectList(cb_D);

						if(RPH_D.size() ==1){
							// ===== 入荷ステータスに"02"(入荷中)設定 =====
							RPH_D.get(0).setReceiveStatus_$02();
							// ===== 入荷予定ヘッダの更新実行 =====
							tReceivePlanHBhv.update(RPH_D.get(0));
						}else{
							// ===== 致命的例外をスローする(状態不正) =====
							this.getErrorManager().throwException(new IllegalStateException());
							return ;
						}
					}
				}
			}
		}
	}

	/**
	 * <h2>入荷ステータス更新処理を行う（完納）。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストが0件の場合は、致命的例外をスローする。
	 * 入荷予定ヘッダデータの入荷納品ステータスを完納に更新する。
	 *  </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveComplete( List<TReceivePlanH> rPlanHeaderList, ErrorStatus errSts) {

		// ===== rPlanHeaderListの件数＝0の場合 =====
		if (rPlanHeaderList.size()==0){
			// ===== 致命的例外をスローする(パラメータ不正) =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return ;
		}else{
			for (TReceivePlanH head : rPlanHeaderList) {
				// ===== 入荷予定ヘッダIDの取得 =====
				long headId = head.getReceivePlanHId();

				// ===== 入荷予定ヘッダを検索条件 =====
				TReceivePlanHCB cb_A = tReceivePlanHBhv.newMyConditionBean();
				cb_A.query().setReceivePlanHId_Equal(headId);
				// ===== 入荷予定ヘッダを検索実行 =====
				List<TReceivePlanH> RPH_A = tReceivePlanHBhv.selectList(cb_A);
				// ===== 入荷予定ヘッダが1件の場合 =====
				if(RPH_A.size()==1){
					// ===== 入荷納品ステータスに"01"(完納)設定 =====
					RPH_A.get(0).setReceiveDeliveryStatus_$01();;

					// ===== 入荷予定ヘッダの更新実行 =====
					tReceivePlanHBhv.update(RPH_A.get(0));
				}else{
					// ===== 致命的例外をスローする(状態不正) =====
					this.getErrorManager().throwException(new IllegalStateException());
					return ;
				}
			}
		}
	}

	/**
	 * <h2>入荷ステータス更新処理を行う（分納）。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストが0件の場合は、致命的例外をスローする。
	 * 入荷予定ヘッダデータの入荷納品ステータスを分納に更新する。
	 *  </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveInstallment( List<TReceivePlanH> rPlanHeaderList, ErrorStatus errSts) {

		// ===== rPlanHeaderListの件数＝0の場合 =====
		if (rPlanHeaderList.size()==0){
			// ===== 致命的例外をスローする(パラメータ不正) =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return ;
		}else{
			for (TReceivePlanH head : rPlanHeaderList) {
				// ===== 入荷予定ヘッダIDの取得 =====
				long headId = head.getReceivePlanHId();

				// ===== 入荷予定ヘッダを検索条件 =====
				TReceivePlanHCB cb_A = tReceivePlanHBhv.newMyConditionBean();
				cb_A.query().setReceivePlanHId_Equal(headId);
				// ===== 入荷予定ヘッダを検索実行 =====
				List<TReceivePlanH> RPH_A = tReceivePlanHBhv.selectList(cb_A);
				// ===== 入荷予定ヘッダが1件の場合 =====
				if(RPH_A.size()==1){
					// ===== 入荷納品ステータスに"02"(分納)設定 =====
					RPH_A.get(0).setReceiveDeliveryStatus_$02();;

					// ===== 入荷予定ヘッダの更新実行 =====
					tReceivePlanHBhv.update(RPH_A.get(0));
				}else{
					// ===== 致命的例外をスローする(状態不正) =====
					this.getErrorManager().throwException(new IllegalStateException());
					return ;
				}
			}
		}
	}

	/**
	 * <h2>入荷ステータス更新処理を行う（打切り）。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストが0件の場合は、致命的例外をスローする。
	 * 入荷予定ヘッダデータの入荷納品ステータスを打切りに更新する。
	 *  </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveClose( List<TReceivePlanH> rPlanHeaderList, ErrorStatus errSts) {

		// ===== rPlanHeaderListの件数＝0の場合 =====
		if (rPlanHeaderList.size()==0){
			// ===== 致命的例外をスローする(パラメータ不正) =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return ;
		}else{
			for (TReceivePlanH head : rPlanHeaderList) {
				// ===== 入荷予定ヘッダIDの取得 =====
				long headId = head.getReceivePlanHId();

				// ===== 入荷予定ヘッダを検索条件 =====
				TReceivePlanHCB cb_A = tReceivePlanHBhv.newMyConditionBean();
				cb_A.query().setReceivePlanHId_Equal(headId);
				// ===== 入荷予定ヘッダを検索実行 =====
				List<TReceivePlanH> RPH_A = tReceivePlanHBhv.selectList(cb_A);
				// ===== 入荷予定ヘッダが1件の場合 =====
				if(RPH_A.size()==1){
					// ===== 入荷納品ステータスに"09"(打切り)設定 =====
					RPH_A.get(0).setReceiveDeliveryStatus_$09();;

					// ===== 入荷予定ヘッダの更新実行 =====
					tReceivePlanHBhv.update(RPH_A.get(0));
				}else{
					// ===== 致命的例外をスローする(状態不正) =====
					this.getErrorManager().throwException(new IllegalStateException());
					return ;
				}
			}
		}
	}

	/**
	 * <h2>入荷ステータス更新処理を行う（未完）。</h2>
	 * <pre>
	 * 入荷予定ヘッダリストが0件の場合は、致命的例外をスローする。
	 * 入荷予定ヘッダデータの入荷納品ステータスを未完に更新する。
	 *  </pre>
	 * @param rPlanHeaderList 入荷予定ヘッダリスト：入荷予定ヘッダID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void receiveNotComplete( List<TReceivePlanH> rPlanHeaderList, ErrorStatus errSts) {

		// ===== rPlanHeaderListの件数＝0の場合 =====
		if (rPlanHeaderList.size()==0){
			// ===== 致命的例外をスローする(パラメータ不正) =====
			this.getErrorManager().throwException(new IllegalArgumentException());
			return ;
		}else{
			for (TReceivePlanH head : rPlanHeaderList) {
				// ===== 入荷予定ヘッダIDの取得 =====
				long headId = head.getReceivePlanHId();

				// ===== 入荷予定ヘッダを検索条件 =====
				TReceivePlanHCB cb_A = tReceivePlanHBhv.newMyConditionBean();
				cb_A.query().setReceivePlanHId_Equal(headId);
				// ===== 入荷予定ヘッダを検索実行 =====
				List<TReceivePlanH> RPH_A = tReceivePlanHBhv.selectList(cb_A);
				// ===== 入荷予定ヘッダが1件の場合 =====
				if(RPH_A.size()==1){
					// ===== 入荷納品ステータスに"00"(未完)設定 =====
					RPH_A.get(0).setReceiveDeliveryStatus_$00();;

					// ===== 入荷予定ヘッダの更新実行 =====
					tReceivePlanHBhv.update(RPH_A.get(0));
				}else{
					// ===== 致命的例外をスローする(状態不正) =====
					this.getErrorManager().throwException(new IllegalStateException());
					return ;
				}
			}
		}
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start

	/**
	 * <h2>完納判定を行う。</h2>
	 * <pre>
	 * データベースから入荷予定数と入庫実績数を取得し、
	 * 完納したか判定する。
	 * </pre>
	 * @param receivePlanHId 入荷予定ヘッダID
	 * @return boolean true : 完納
	 */
	public boolean checkReceiveComplete(long receivePlanHId) {

		// DBから入荷予定、入庫実績を検索
		TReceivePlanBCB cb = tReceivePlanBBhv.newMyConditionBean();
		cb.setupSelect_TReceivePlanH();
		cb.query().setReceivePlanHId_Equal(receivePlanHId);
		List<TReceivePlanB> selectList = tReceivePlanBBhv.selectList(cb);

		if (selectList.size() == 0) {
			return false;
		}

		tReceivePlanBBhv.loadTStoreRecordBList(selectList, new ConditionBeanSetupper<TStoreRecordBCB>() {
			@Override
			public void setup(TStoreRecordBCB recordBCb) {
			}
		});

		boolean isCompleted = true;

		for (TReceivePlanB planB : selectList) {

			if (WCC.isZeroOrLess(planB.getPlanNum())) {
				continue;
			}

			List<TStoreRecordB> storeBList = planB.getTStoreRecordBList();
			if (storeBList == null || storeBList.size() == 0) {
				// 未納あり
				isCompleted = false;
				break;
			}

			// 予定数
			BigDecimal planNum = planB.getPlanNum();
			// 実績数
			BigDecimal storeNum = WCC.ZERO;
			for (TStoreRecordB storeB : storeBList) {
				storeNum = WCC.add(storeNum, CU.nullToZero(storeB.getStoreNum()));
			}

			// 予定数に達していない
			if (WCC.isGreaterThan(planNum, storeNum)) {
				// 未納あり
				isCompleted = false;
				break;
			}
		}

		return isCompleted;
	}

	// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

}
