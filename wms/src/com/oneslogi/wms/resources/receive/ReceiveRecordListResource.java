package com.oneslogi.wms.resources.receive;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TStoreRecordBDto;
import com.oneslogi.base.dbflute.dtomapper.TStoreRecordBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TReceivePlanH;
import com.oneslogi.base.dbflute.exentity.TStoreRecordB;
import com.oneslogi.base.dbflute.exentity.TStoreRecordR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.receive.ReceiveRecordListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.receive.RecieveRecordListOutputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 入荷実績抽出のリソースクラス。
 */
@Path("/receive/receiveRecordList")
public class ReceiveRecordListResource extends AbstractWmsResource {

	// ===== 定数定義 =====
	/**
	 * ステータスコード定義
	 */
	protected static class StatusCode {
		/**
		 * 正常終了
		 */
		protected static final int SUCCESS = 0;
		/**
		 * ユーザによる確認
		 */
		protected static final int CONFIRMATION = 1;
		/**
		 * 入荷実績データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 入庫帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private RecieveRecordListOutputLogic outputLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	/**
	 * <h2>入荷実績データ取得。</h2>
	 * <pre>
	 * ・入荷実績データ取得取り出し
	 * ・入荷実績DTOに設定
	 * </pre>
	 * @param  clientCd 荷主CD
	 * @param  centerCd センタCD
	 * @return ReceiveRecordListDto 入荷実績DTO
	 */
	@GET
	@Path("/search")
	public ReceiveRecordListDto search(@QueryParam("clientCd") String clientCd, @QueryParam("centerCd")String centerCd,@QueryParam("outputDate") String outputDate) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）

		Long controlNo = numberingCenterLogic.getControlNo();

		// コントロール№更新
		// 更新用
		TStoreRecordR update = new TStoreRecordR();
		// 発行条件用
		TReceivePlanH header = new TReceivePlanH();
		TStoreRecordR report = new TStoreRecordR();

		// コントロール№の設定
		update.setControlNo(controlNo);

		// 荷主ID取得
		MClient mClient = new MClient();
		mClient.setClientCd(clientCd);
		mClient = clientLogic.getUkEntity(mClient);
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start
		//if (mClient == null) {
		//	this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CLIENT_NOT_FOUND_ERROR);
		//	return null;
		//}
		//header.setClientId(mClient.getClientId());
		if (mClient == null) {
			header.setClientId(null);
		} else {
			header.setClientId(mClient.getClientId());
		}
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add End

		// センタID取得
		MCenter mCenter = new MCenter();
		mCenter.setCenterCd(centerCd);
		mCenter = centerLogic.getUkEntity(mCenter);
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start
		//if (mCenter == null) {
		//	this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.CENTER_NOT_FOUND_ERROR);
		//	return null;
		//}
		//header.setCenterId(mCenter.getCenterId());
		if (mCenter == null) {
			header.setCenterId(null);
		} else {
			header.setCenterId(mCenter.getCenterId());
		}
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add Start

		// 発行条件の設定
		header.setReceiveStatus_$03(); // 入荷済

		if(CU.isNullOrEmpty(outputDate)){
			// 抽出日が存在しない場合は検索条件は出力フラグのみ追加
			report.setReceiveRecordOutFlg_$0();
		} else {
			// 抽出日が存在する場合は検索条件は出力フラグと抽出日を追加
			report.setReceiveRecordOutFlg_$1();
			try{
				SimpleDateFormat sdft = new SimpleDateFormat("yyyyMMdd");
				Date dt = sdft.parse(outputDate);
				Timestamp ts = new Timestamp(dt.getTime());
				report.setReceiveRecordOutDt(ts);
			}catch(ParseException e){
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATE_INPUT_ERROR);
				return null;
			}
		}

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		outputLogic.updateControlNo(update, header,report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		// 入庫実績帳票(検索用)
		TStoreRecordR tStoreRecordR = new TStoreRecordR();
		tStoreRecordR.setControlNo(controlNo);

		// 入荷実績データ取得メソッド呼出し
		List<TStoreRecordB> selectEntity = outputLogic.select(tStoreRecordR, errRetSts(StatusCode.NOT_FOUND_DATA));

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== JSON通信のためにSimpleDTO変換 =====
		TStoreRecordBDtoMapper mapper1 = new TStoreRecordBDtoMapper();
		List<TStoreRecordBDto> body = mapper1.mappingToDtoList(selectEntity);

		// ===== DTO の作成 =====
		ReceiveRecordListDto result = new ReceiveRecordListDto();
		result.data.search = body.get(0).getTStoreRecordH();
		result.data.list = body;

		// 入庫実績帳票更新
		TStoreRecordR tr = new TStoreRecordR();
		// [#597][2.1.0] 入荷実績抽出 出力済のデータ更新処理修正 2017.01.19 honma Mod Start
		tr.setControlNo(null);
		if (CU.isNullOrEmpty(outputDate)) {
			// 抽出日が存在しない場合は初回抽出の為、出力フラグ等設定
			Timestamp time = new Timestamp(System.currentTimeMillis());
			tr.setReceiveRecordOutFlg_$1();
			tr.setReceiveRecordOutUserId(this.getUserId());
			tr.setReceiveRecordOutDt(time);
		}
		// [#597][2.1.0] 入荷実績抽出 出力済のデータ更新処理修正 2017.01.19 honma Mod End

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		outputLogic.updateReceiveRecordOutFlg(tr, tStoreRecordR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return result;
	}

}
