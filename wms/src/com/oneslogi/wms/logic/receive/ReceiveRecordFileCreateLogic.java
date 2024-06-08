package com.oneslogi.wms.logic.receive;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.apache.commons.lang3.StringUtils;
import org.dbflute.cbean.result.ListResultBean;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.cbean.EReceiveRecordSendCB;
import com.oneslogi.base.dbflute.cbean.TTrrcvCB;
import com.oneslogi.base.dbflute.exbhv.EReceiveRecordSendBhv;
import com.oneslogi.base.dbflute.exbhv.TTrrcvBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlReceiveRecordListPmb;
import com.oneslogi.base.dbflute.exentity.EReceiveRecordSend;
import com.oneslogi.base.dbflute.exentity.TTrrcv;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveRecordList;
import com.oneslogi.base.dbflute.exentity.customize.SqlReceiveRecordUsernum1List;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.receive.ReceiveRecordDto.ReceiveRecordBody;

/**
 * 入庫実績送信（販物）出力情報取得ロジッククラス
 */
public class ReceiveRecordFileCreateLogic extends AbstractWmsLogic {

	// ===== 定数定義 =====
	/**
	 * レコード区分：ヘッダ
	 */
	protected static final String RECORD_TYPE_H = "H";

	/**
	 * レコード区分：明細
	 */
	protected static final String RECORD_TYPE_M = "M";

	/**
	 * JT区分
	 */
	protected static final String JT_FLG = "0";

	/**
	 * TSN区分
	 */
	protected static final String TSN_FLG = "1";

	/**
	 * 輸送種別
	 */
	protected static final String TRANSPORT_TYPE = "   ";

	/**
	 * ロット番号
	 */
	protected static final String LOT_NUM = "          ";

	/**
	 * 出力項目桁数定義
	 */
	protected static class OutputColummLength {

		/**
		 * レコード区分
		 */
		protected static final int RECORD_TYPE = 1;

		/**
		 * JT/TS区分
		 */
		protected static final int JTTSFLG = 1;

		/**
		 * 整理番号
		 */
		protected static final int REF_NO = 7;

		/**
		 * シーケンス番号
		 */
		protected static final int SEQNO = 3;

		/**
		 * 輸送種別
		 */
		protected static final int TRANSPORT_TYPE = 3;

		/**
		 * 払出組織CD
		 */
		protected static final int SUPPLIERCD = 4;

		/**
		 * 受入組織CD
		 */
		protected static final int WAREHOUSE_CD = 4;

		/**
		 * 入庫登録年月日
		 */
		protected static final int RECEIVEDATE = 8;

		/**
		 * 入庫登録時刻
		 */
		protected static final int RECEIVEDATETIME = 6;

		/**
		 * 銘柄CD
		 */
		protected static final int ITEMCD = 6;

		/**
		 * ロット番号
		 */
		protected static final int LOTNO = 10;

		/**
		 * 数量
		 */
		protected static final int EXPECT_QTY_SUM = 13;
	}

	/**
	 * パディング文字(半角スペース)
	 */
	protected static final String PADDING_STRING_SPACE = " ";

	/**
	 * パディング文字(0)
	 */
	protected static final String PADDING_STRING_ZERO = "0";

	// ===== 使用テーブル =====
	@Inject
	private TTrrcvBhv tTrrcvBhv;
	@Inject
	private EReceiveRecordSendBhv eReceiveRecordSendBhv;

	/**
	 * <h2>出力対象入庫予定ロック取得</h2>
	 * <pre>
	 * コントロールNo.から出力対象の入庫予定のロックを取得する。
	 * </pre>
	 * @param controlNo コントロールNo
	 * @return int 取得件数
	 */
	public int getTTrrcvLock(Long controlNo) {

		if (controlNo == null) {
			return 0;
		}

		// 検索条件の設定
		TTrrcvCB cb = tTrrcvBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(controlNo);
		cb.lockForUpdate();

		// 検索
		return tTrrcvBhv.selectCount(cb);
	}

	/**
	 * <h2>入庫登録情報取得。</h2>
	 * <pre>
	 * 出力対象の国産・輸入区分の検索を行う。
	 *
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @return List<TPickingList> 国産・輸入区分リスト
	 */
	public ListResultBean<SqlReceiveRecordUsernum1List> selectUsernum1List(Long controlNo){

		ListResultBean<SqlReceiveRecordUsernum1List> result = new ListResultBean<SqlReceiveRecordUsernum1List>();

		if (controlNo == null) {
			return result;
		}

		// ===== 出庫計画データ取得 =====

		// 外出しSQLの定義
		String path = TTrrcvBhv.PATH_selectSqlReceiveRecordUsernum1List;

		// 検索条件の設定
		SqlReceiveRecordListPmb pmb = new SqlReceiveRecordListPmb();
		pmb.setControlNo(controlNo);

		// ------ 検索実行 ------
		Class<SqlReceiveRecordUsernum1List> entityType = SqlReceiveRecordUsernum1List.class;
		result = tTrrcvBhv.outsideSql().selectList(path, pmb, entityType);

		return result;
	}

	/**
	 * <h2>入庫登録情報取得。</h2>
	 * <pre>
	 * 出力対象入庫登録情報の検索を行う。
	 * </pre>
	 * @param controlNo コントロールNo.
	 * @param usernum1 国産・輸入区分
	 * @return ListResultBean<SqlReceiveRecordList> 入庫登録情報リスト
	 */
	public ListResultBean<SqlReceiveRecordList> selectReceiveRecordList(Long controlNo, String usernum1){

		ListResultBean<SqlReceiveRecordList> result = new ListResultBean<SqlReceiveRecordList>();

		if (controlNo == null) {
			return result;
		}

		// ===== 入庫登録情報取得 =====

		// 外出しSQLの定義
		String path = TTrrcvBhv.PATH_selectSqlReceiveRecordList;

		// 検索条件の設定
		SqlReceiveRecordListPmb pmb = new SqlReceiveRecordListPmb();
		pmb.setControlNo(controlNo);
		pmb.setUsernum1(usernum1);

		// 検索実行
		Class<SqlReceiveRecordList> entityType = SqlReceiveRecordList.class;
		result = tTrrcvBhv.outsideSql().selectList(path, pmb, entityType);

		return result;
	}

	/**
	 * <h2>入庫登録情報登録。</h2>
	 * <pre>
	 * 出力対象入庫登録情報の登録を行う。
	 * </pre>
	 * @param domesticList 国産入庫登録情報
	 * @param importList 輸入入庫登録情報
	 * @param sendCd 送信CD
	 * @param centerCd 拠点CD
	 */
	public void insertReceiveRecordList(ListResultBean<SqlReceiveRecordList> domesticList,
			ListResultBean<SqlReceiveRecordList> importList, String sendCd, String centerCd){

		List<EReceiveRecordSend> insertList = new ArrayList<EReceiveRecordSend>();
		Long countRow = 0L;
		String beforeRefNoDomestic = "";
		String beforeRefNoImport = "";
		int sequenceNo = 0;

		// APサーバ日時取得
		Timestamp nowTime = new Timestamp(System.currentTimeMillis());
		SimpleDateFormat receiveRegistDtFormat = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat receiveRegistTimeFormat = new SimpleDateFormat("HHmmss");
		String receiveRegistDt = receiveRegistDtFormat.format(nowTime);
		String receiveRegistTime = receiveRegistTimeFormat.format(nowTime);

		// ===== 入庫登録情報作成 =====

		// 国産
		for (SqlReceiveRecordList output : domesticList) {
			countRow++;

			// ヘッダ作成
			if (countRow == 1 || !CU.equals(beforeRefNoDomestic, output.getSupplierrcvno())) {
				sequenceNo = 0;
				insertList.add(createReceiveRecordHList(output, sendCd, centerCd, CDef.Usid.$11.code(), receiveRegistDt,
						receiveRegistTime, countRow, sequenceNo));
				countRow++;
			}

			sequenceNo++;

			// 明細作成
			insertList.add(createReceiveRecordMList(output, sendCd, centerCd, CDef.Usid.$11.code(),
					countRow, sequenceNo));

			beforeRefNoDomestic = output.getSupplierrcvno();
		}

		// 輸入
		for (SqlReceiveRecordList output : importList) {
			countRow++;

			// ヘッダ作成
			if (countRow == 1 || !CU.equals(beforeRefNoImport, output.getSupplierrcvno())) {
				sequenceNo = 0;
				insertList.add(createReceiveRecordHList(output, sendCd, centerCd, CDef.Usid.$31.code(), receiveRegistDt,
						receiveRegistTime, countRow, sequenceNo));
				countRow++;
			}

			sequenceNo++;

			// 明細作成
			insertList.add(createReceiveRecordMList(output, sendCd, centerCd, CDef.Usid.$31.code(),
					countRow, sequenceNo));

			beforeRefNoImport = output.getSupplierrcvno();
		}

		// 入庫実績送信テーブル（販物）一括登録
		eReceiveRecordSendBhv.batchInsert(insertList);
	}

	/**
	 * <h2>入庫登録情報ヘッダ作成。</h2>
	 * <pre>
	 * 入庫登録情報ヘッダの作成を行う。
	 * </pre>
	 * @param receiveRecord 入庫登録情報
	 * @param sendCd 送信CD
	 * @param centerCd 拠点CD
	 * @param usernum1 国産・輸入区分
	 * @param receiveRegistDt 入庫登録年月日
	 * @param receiveRegistTime 入庫登録時刻
	 * @param countRow 送信行ID
	 * @param sequenceNo シーケンス番号
	 * @return EReceiveRecordSend 入庫登録情報ヘッダ
	 */
	private EReceiveRecordSend createReceiveRecordHList(SqlReceiveRecordList receiveRecord,
			String sendCd, String centerCd, String usernum1, String receiveRegistDt,
			String receiveRegistTime, Long countRow, int sequenceNo){

		// ===== 入庫登録情報作成 =====
		EReceiveRecordSend createData = eReceiveRecordSendBhv.newMyEntity();

		// 送信CD
		createData.setSendCd(sendCd);

		// 送信行ID
		createData.setSendRowId(countRow);

		// 処理済フラグ
		createData.setWorkFlg("0");

		// レコード区分
		createData.setRecordType(RECORD_TYPE_H);

		// JT/TS区分
		if (CDef.Usid.$11.code().equals(usernum1)) {
			createData.setJttsflg(JT_FLG);
		}
		if (CDef.Usid.$31.code().equals(usernum1)) {
			createData.setJttsflg(TSN_FLG);
		}

		// 整理番号
		String refNo = "";
		if (!CU.isNullOrEmpty(receiveRecord.getSupplierrcvno())) {
			refNo = receiveRecord.getSupplierrcvno();
		}
		if (OutputColummLength.REF_NO - refNo.length() > 0) {
			refNo = StringUtils.rightPad(refNo, OutputColummLength.REF_NO, PADDING_STRING_SPACE);
		}
		createData.setRefno(receiveRecord.getSupplierrcvno());

		// シーケンス番号
		createData.setSeqno(String.format("%03d", sequenceNo));

		// 輸送種別
		createData.setTransportType(TRANSPORT_TYPE);

		// 払出組織CD
		String supplierCd = "";
		if (!CU.isNullOrEmpty(receiveRecord.getSuppliercd())) {
			supplierCd = receiveRecord.getSuppliercd();
		}
		if (OutputColummLength.SUPPLIERCD - supplierCd.length() > 0) {
			supplierCd = StringUtils.rightPad(supplierCd, OutputColummLength.SUPPLIERCD, PADDING_STRING_SPACE);
		}
		createData.setSuppliercd(supplierCd);

		// 受入組織CD
		String warehouseCd = "";
		if (!CU.isNullOrEmpty(receiveRecord.getWarehouseCd())) {
			warehouseCd = receiveRecord.getWarehouseCd();
		}
		if (OutputColummLength.WAREHOUSE_CD - warehouseCd.length() > 0) {
			warehouseCd = StringUtils.rightPad(warehouseCd, OutputColummLength.WAREHOUSE_CD, PADDING_STRING_SPACE);
		}
		createData.setWarehouseCd(warehouseCd);

		// 入庫登録年月日
		createData.setReceivedate(receiveRegistDt);

		// 入庫登録時刻
		createData.setReceivedatetime(receiveRegistTime);

		// 国産・輸入区分
		createData.setUsernum1(Long.parseLong(usernum1));

		// 拠点CD
		createData.setCenterCd(centerCd);

		return createData;
	}

	/**
	 * <h2>入庫登録情報明細作成。</h2>
	 * <pre>
	 * 入庫登録情報明細の作成を行う。
	 * </pre>
	 * @param receiveRecord 入庫登録情報
	 * @param sendCd 送信CD
	 * @param centerCd 拠点CD
	 * @param usernum1 国産・輸入区分
	 * @param countRow 送信行ID
	 * @param sequenceNo シーケンス番号
	 * @return EReceiveRecordSend 入庫登録情報明細
	 */
	private EReceiveRecordSend createReceiveRecordMList(SqlReceiveRecordList receiveRecord,
			String sendCd, String centerCd, String usernum1, Long countRow, int sequenceNo){

		// ===== 入庫登録情報作成 =====
		EReceiveRecordSend createData = eReceiveRecordSendBhv.newMyEntity();

		// 送信CD
		createData.setSendCd(sendCd);

		// 送信行ID
		createData.setSendRowId(countRow);

		// 処理済フラグ
		createData.setWorkFlg("0");

		// レコード区分
		createData.setRecordType(RECORD_TYPE_M);

		// 整理番号
		String refNo = "";
		if (!CU.isNullOrEmpty(receiveRecord.getSupplierrcvno())) {
			refNo = receiveRecord.getSupplierrcvno();
		}
		if (OutputColummLength.REF_NO - refNo.length() > 0) {
			refNo = StringUtils.rightPad(refNo, OutputColummLength.REF_NO, PADDING_STRING_SPACE);
		}
		createData.setRefno(receiveRecord.getSupplierrcvno());

		// シーケンス番号
		createData.setSeqno(String.format("%03d", sequenceNo));

		// 輸送種別
		createData.setTransportType(TRANSPORT_TYPE);

		// 銘柄CD
		String itemCd = "";
		if (!CU.isNullOrEmpty(receiveRecord.getItemcd())) {
			itemCd = receiveRecord.getItemcd();
		}
		if (OutputColummLength.ITEMCD - itemCd.length() > 0) {
			itemCd = StringUtils.leftPad(itemCd, OutputColummLength.ITEMCD, PADDING_STRING_ZERO);
		}
		//createData.setItemcd(itemCd);

		// ロット番号
		createData.setLotno(LOT_NUM);

		// 数量
		String expectQtySum = receiveRecord.getExpectqty1Sum().toString();
		if (OutputColummLength.EXPECT_QTY_SUM - expectQtySum.length() > 0) {
			expectQtySum = StringUtils.leftPad(expectQtySum, OutputColummLength.EXPECT_QTY_SUM, PADDING_STRING_ZERO);
		}
		createData.setExpectQtySum(expectQtySum);

		// 国産・輸入区分
		createData.setUsernum1(Long.parseLong(usernum1));

		// 拠点CD
		createData.setCenterCd(centerCd);

		return createData;
	}

	/**
	 * <h2>コントロールNoクリア。</h2>
	 * <pre>
	 * 対象データのコントロールNoをクリアする。
	 * </pre>
	 * @param controlNo コントロールNo
	 */
	public void clearControlNo(Long controlNo) {

		// ===== 入庫予定更新 =====
		TTrrcvCB cb = tTrrcvBhv.newMyConditionBean();
		cb.query().setControlNo_Equal(controlNo);

		TTrrcv tTrrcv = tTrrcvBhv.newMyEntity();
		tTrrcv.setFromname("2");
		tTrrcv.setControlNo(null);
		tTrrcvBhv.queryUpdate(tTrrcv, cb);

	}

	/**
	 * <h2>入庫登録情報作成</h2>
	 * <pre>
	 * 出力データを作成する。
	 * </pre>
	 * @param controlNo コントロールNo
	 * @return List<ReceiveRecordBody> 入庫登録情報リスト
	 */
	public List<ReceiveRecordBody> createOutputData(String centerCd, String sendCd, String usernum1) {

		List<ReceiveRecordBody> outputData = new ArrayList<ReceiveRecordBody>();

		// ===== 入庫実績送信テーブル（販物）取得 =====
		EReceiveRecordSendCB cb = eReceiveRecordSendBhv.newMyConditionBean();

		// 対象項目
		cb.specify().columnRecordType();
		cb.specify().columnJttsflg();
		cb.specify().columnRefno();
		cb.specify().columnSeqno();
		cb.specify().columnTransportType();
		cb.specify().columnSuppliercd();
		cb.specify().columnWarehouseCd();
		cb.specify().columnReceivedate();
		cb.specify().columnReceivedatetime();
		//cb.specify().columnItemcd();
		cb.specify().columnLotno();
		cb.specify().columnExpectQtySum();

		// 検索条件
		cb.query().setCenterCd_Equal(centerCd);
		cb.query().setSendCd_Equal(sendCd);
		cb.query().setUsernum1_Equal(Long.parseLong(usernum1));
		cb.query().setWorkFlg_Equal("0");

		// ソート条件
		cb.query().addOrderBy_SendRowId_Asc();

		// 検索
		List<EReceiveRecordSend> resultList = eReceiveRecordSendBhv.selectList(cb);

		// 0件の場合
		if (resultList.size() == 0) {
			return null;
		}

		for (EReceiveRecordSend result : resultList) {
			ReceiveRecordBody createString = new ReceiveRecordBody();
			StringBuffer outputString = new StringBuffer();

			// ヘッダ
			if (RECORD_TYPE_H.equals(result.getRecordType())) {
				outputString.append(result.getRecordType());
				outputString.append(result.getJttsflg());
				outputString.append(result.getRefno());
				outputString.append(result.getSeqno());
				outputString.append(result.getTransportType());
				outputString.append(result.getSuppliercd());
				outputString.append(result.getWarehouseCd());
				outputString.append(result.getReceivedate());
				outputString.append(result.getReceivedatetime());
			}

			// 明細
			if (RECORD_TYPE_M.equals(result.getRecordType())) {
				outputString.append(result.getRecordType());
				outputString.append(result.getRefno());
				outputString.append(result.getSeqno());
				//outputString.append(result.getItemcd());
				outputString.append(result.getLotno());
				outputString.append(result.getExpectQtySum());
			}

			createString.outputString = outputString.toString();
			outputData.add(createString);
		}

		return outputData;

	}

	/**
	 * <h2>入庫実績送信テーブル（販物）フラグ更新</h2>
	 * <pre>
	 * 対象データのフラグを更新する。
	 * </pre>
	 * @param sendCd 送信CD
	 */
	public void updateWorkFlg(String sendCd) {

		// ===== 入庫実績送信テーブル（販物） =====
		EReceiveRecordSendCB cb = eReceiveRecordSendBhv.newMyConditionBean();
		cb.query().setSendCd_Equal(sendCd);

		EReceiveRecordSend eReceiveRecordSend = eReceiveRecordSendBhv.newMyEntity();
		eReceiveRecordSend.setWorkFlg("1");
		eReceiveRecordSendBhv.queryUpdate(eReceiveRecordSend, cb);
	}

}
