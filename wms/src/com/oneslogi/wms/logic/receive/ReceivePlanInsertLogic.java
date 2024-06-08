package com.oneslogi.wms.logic.receive;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TReceivePlanHCB;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanBBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanHBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanRBhv;
import com.oneslogi.base.dbflute.exbhv.TReceivePlanSpareBhv;
import com.oneslogi.base.dbflute.exentity.TReceivePlanB;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TReceivePlanR;
import com.oneslogi.base.dbflute.exentity.TReceivePlanSpare;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.WmsNumberingConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;

/**
 * 入荷予定登録ロジッククラス
 */
public class ReceivePlanInsertLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TReceivePlanHBhv tReceivePlanHBhv;
	@Inject
	private TReceivePlanBBhv tReceivePlanBBhv;
	@Inject
	private TReceivePlanRBhv tReceivePlanRBhv;

	// [#2253]予備項目対応 2017.08.18 sampei Start
	@Inject
	private TReceivePlanSpareBhv tReceivePlanSpareBhv;
	// [#2253]予備項目対応 2017.08.18 sampei End

	// ===== 使用ロジッククラス =====
	@Inject
	private NumberingCenterLogic numberingLogic;

	/**
	 * <h2>入荷予定を登録する。</h2>
	 * <pre>
	 * 受け取ったデータの入荷伝票No.がnullの場合、入荷伝票No.を採番し、
	 * 引数のデータを入荷予定ヘッダ、入荷予定帳票、入荷予定ボディに登録する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：全項目
	 * @param bodyList 入荷予定ボディのリスト：全項目
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void insert(TReceivePlanH header, List<TReceivePlanB> bodyList, ErrorStatus errSts) {

		// ===== 入荷予定ヘッダ登録 =====

		// WMS入荷伝票Noを登録する直前に採番
		if (header.getReceiveSlipNo() != null) {
			header.setOldReceivePlanHId(header.getReceivePlanHId());
			header.setReceiveSlipNo(header.getReceiveSlipNo());
		} else {
			header.setReceiveSlipNo(numberingLogic.getNumbering(header.getCenterId(), WmsNumberingConst.RECEIVE_SPLIT_NO));
//			header.setReceiveSlipNo(numberingLogic.getNumbering(getCenterClassCondition(), WmsNumberingConst.RECEIVE_SPLIT_NO));
		}

		// 登録
		tReceivePlanHBhv.insert(header);

		// 登録したときのヘッダID
		long headerId = header.getReceivePlanHId();

		// ===== 入荷予定帳票登録 =====

		TReceivePlanR report = new TReceivePlanR();
		report.setReceivePlanHId(headerId);
		report.setRplOutFlg_$0();

		tReceivePlanRBhv.insert(report);

		// ===== 入荷予定ボディ登録 =====
		long lineNo = 1l;

		for (TReceivePlanB body : bodyList) {

			// 入荷予定ヘッダIDの設定
			body.setReceivePlanHId(headerId);

			// 行Noを設定
			body.setLineNo(lineNo);

			lineNo++;

			// ボディ登録実行
			tReceivePlanBBhv.insert(body);

			// [#2253]予備項目対応 2017.08.18 sampei Start
			TReceivePlanSpare tReceivePlanSpare = new TReceivePlanSpare();
			tReceivePlanSpare.setReceivePlanBId(body.getReceivePlanBId());
			if(body.getTReceivePlanSpareAsOne() != null){
				tReceivePlanSpare.setSpareStr1(body.getTReceivePlanSpareAsOne().getSpareStr1());
				tReceivePlanSpare.setSpareStr2(body.getTReceivePlanSpareAsOne().getSpareStr2());
				tReceivePlanSpare.setSpareStr3(body.getTReceivePlanSpareAsOne().getSpareStr3());
				tReceivePlanSpare.setSpareNum1(body.getTReceivePlanSpareAsOne().getSpareNum1());
				tReceivePlanSpare.setSpareNum2(body.getTReceivePlanSpareAsOne().getSpareNum2());
				tReceivePlanSpare.setSpareNum3(body.getTReceivePlanSpareAsOne().getSpareNum3());
			}
			tReceivePlanSpareBhv.insert(tReceivePlanSpare);
			// [#2253]予備項目対応 2017.08.18 sampei End

		}


	}

	/**
	 * <h2>入荷予定ヘッダ登録済チェックを行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダを検索し、
	 * 検索結果が存在する場合、既に登録済エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：センタID・荷主ID・入荷予定ヘッダID・予定顧客入荷指示No.・
	 *                               予定仕入先CD・入荷予定日・処理区分ID
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void isAlreadyRegisteredDataCheck(TReceivePlanH header, ErrorStatus errSts) {

		// ===== 入荷予定入力データ取得 =====
		List<TReceivePlanH> headList = new ArrayList<TReceivePlanH>();
		TReceivePlanHCB headCb = tReceivePlanHBhv.newMyConditionBean();

		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン Start
		//センタＩＤ（Center_ID）
		headCb.query().setCenterId_Equal(header.getCenterId());
		//クライアントＩＤ（Client_ID）
		headCb.query().setClientId_Equal(header.getClientId());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/28 パン End

		headCb.query().setReceivePlanHId_NotEqual(header.getReceivePlanHId());
		headCb.query().setPlanClientReceiveNo_Equal(header.getPlanClientReceiveNo()); //予定顧客入荷指示No.
		headCb.query().setPlanSupplierCd_Equal(header.getPlanSupplierCd()); //予定仕入先CD
		headCb.query().setReceivePlanDt_Equal(header.getReceivePlanDt()); //入荷予定日
		headCb.query().setProcessTypeId_Equal(header.getProcessTypeId()); //処理区分

		// 検索実行
		headList = tReceivePlanHBhv.selectList(headCb);

		if (headList.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.ALREADY_REGISTERED_CANNOT_REGISTER_ERROR);
		}
	}


	/**
	 * <h2>予定顧客入荷指示No.存在チェックを行う。</h2>
	 * <pre>
	 * 入荷予定ヘッダを検索し、予定顧客入荷指示No.の存在チェックを行う。
	 * 検索結果が存在する場合、予定顧客入荷指示No.の存在エラーをエラーステータスに設定する。
	 * </pre>
	 * @param header 入荷予定ヘッダ：センタID・入荷予定ヘッダID・荷主ID・予定仕入先CD・予定顧客入荷指示No.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public void isPlanClientReceiveNoCheck(TReceivePlanH header, ErrorStatus errSts) {

		// ===== 入荷予定入力データ取得 =====
		List<TReceivePlanH> headList = new ArrayList<TReceivePlanH>();
		TReceivePlanHCB headCb = tReceivePlanHBhv.newMyConditionBean();

		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン Start
		//センタID（Center_ID）
		headCb.query().setCenterId_Equal(header.getCenterId());
		// [ON推-品向-420] 出荷作業Noのみで検索し、センターコードが入っていない問題対応 2015/05/26 パン End

		headCb.query().setReceivePlanHId_NotEqual(header.getReceivePlanHId());
		// [ON推-品向-125] 同一荷主、仕入先、予定顧客入荷指示No.存在チェックを修正 2014.11.24 fengc Start
		headCb.query().setClientId_Equal(header.getClientId());
		headCb.query().setPlanSupplierCd_Equal(header.getPlanSupplierCd());
		// [ON推-品向-125] 同一荷主、仕入先、予定顧客入荷指示No.存在チェックを修正 2014.11.24 fengc End
		headCb.query().setPlanClientReceiveNo_Equal(header.getPlanClientReceiveNo()); //予定顧客入荷指示No.

		// 検索実行
		headList = tReceivePlanHBhv.selectList(headCb);

		if (headList.size() > 0) {
			this.getErrorManager().add(errSts, WmsMessageConst.PLAN_CLIENT_RECEIVE_NO_CANNOT_REGISTER_ALREADY_USED_ERROR);
		}
	}

}
