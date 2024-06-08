package com.oneslogi.wms.resources.shipping;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.dto.TPackingBDto;
import com.oneslogi.base.dbflute.dtomapper.TPackingBDtoMapper;
import com.oneslogi.base.dbflute.exentity.MCenter;
import com.oneslogi.base.dbflute.exentity.MClient;
import com.oneslogi.base.dbflute.exentity.TPackingB;
import com.oneslogi.base.dbflute.exentity.TPickingH;
import com.oneslogi.base.dbflute.exentity.TPickingR;
import com.oneslogi.base.exception.InfoManager.InfoStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.NumberingCenterLogic;
import com.oneslogi.wms.dto.shipping.ShippingRecordListDto;
import com.oneslogi.wms.logic.common.CenterLogic;
import com.oneslogi.wms.logic.common.ClientLogic;
import com.oneslogi.wms.logic.shipping.ShippingRecordListOutputLogic;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 出荷実績抽出のリソースクラス。
 */
@Path("/shipping/shippingRecordList")
public class ShippingRecordListResource extends AbstractWmsResource {

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
		 * 出荷実績データ取得異常
		 */
		protected static final int NOT_FOUND_DATA = 2;
		/**
		 * 出庫帳票更新異常
		 */
		protected static final int UPDATE_EXCEPTION = 3;
	}

	// ===== 使用ロジッククラス =====
	@Inject
	private CenterLogic centerLogic;
	@Inject
	private ClientLogic clientLogic;
	@Inject
	private ShippingRecordListOutputLogic outputLogic;
	@Inject
	private NumberingCenterLogic numberingCenterLogic;

	/**
	 * <h2>出荷実績データ取得。</h2>
	 * <pre>
	 * ・出荷実績データ取得取り出し
	 * ・出荷実績DTOに設定
	 * </pre>
	 * @param  clientCd 荷主CD
	 * @param  centerCd センタCD
	 * @return ShippingRecordListDto 出荷実績DTO
	 */
	@GET
	@Path("/search")
	public ShippingRecordListDto search(@QueryParam("clientCd") String clientCd, @QueryParam("centerCd")String centerCd, @QueryParam("outputDate") String outputDate) {

		// コントロールNo.を採番（ロジッククラスを呼ぶ）
		Long controlNo = numberingCenterLogic.getControlNo();

		// コントロール№更新
		// 更新用
		TPickingR update = new TPickingR();
		// 発行条件用
		TPickingH header = new TPickingH();
		TPickingR report = new TPickingR();

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
		// [#426][2.1.0-CT-081]センタ・荷主を指定しないとデータ抽出ができない 2016.12.12 shimizu Add End

		// 発行条件の設定
		header.setPickingStatus_$55();       // 出荷確定済

		if(CU.isNullOrEmpty(outputDate)){
			// 抽出日が存在しない場合は検索条件は出力フラグのみ
			report.setShippingRecordOutFlg_$0();
		} else {
			// 抽出日が存在する場合は検索条件は出力フラグと抽出日
			report.setShippingRecordOutFlg_$1();
			try{
				SimpleDateFormat sdft = new SimpleDateFormat("yyyyMMdd");
				Date dt = sdft.parse(outputDate);
				Timestamp ts = new Timestamp(dt.getTime());
				report.setShippingRecordOutDt(ts);
			}catch(ParseException e){
				this.getErrorManager().add(errRetSts(StatusCode.NOT_FOUND_DATA), WmsMessageConst.DATE_INPUT_ERROR);
				return null;
			}
		}

		// 帳票発行対象へのマーキング処理（ロジッククラスを呼ぶ）
		outputLogic.updateControlNo(update, header, report, errRetSts(StatusCode.UPDATE_EXCEPTION));

		// 出庫帳票(検索用)
		TPickingR tPickingR = new TPickingR();
		tPickingR.setControlNo(controlNo);

		// 出荷実績データ取得メソッド呼出し
		List<TPackingB> selectEntity = outputLogic.select(tPickingR, errRetSts(StatusCode.NOT_FOUND_DATA));

		// ===== エラーが存在する場合 =====
		if (0 < getErrorManager().size()) {
			// ===== 処理中止 =====
			return null;
		}

		// ===== JSON通信のためにSimpleDTO変換 =====
		TPackingBDtoMapper mapper1 = new TPackingBDtoMapper();
		List<TPackingBDto> body = mapper1.mappingToDtoList(selectEntity);

		// ===== DTO の作成 =====
		ShippingRecordListDto result = new ShippingRecordListDto();
		result.data.search = body.get(0).getTPackingH();
		result.data.list = body;

		// 出庫帳票更新
		TPickingR tr = new TPickingR();
		// [#694][2.1.0] 出力済データの更新をCONTROL_NOのクリア更新のみに修正 2017.01.23 honma Mod Start
		tr.setControlNo(null);
		if (CU.isNullOrEmpty(outputDate)) {
			// 抽出日が存在しない場合は初回抽出の為、出力フラグ等設定
			Timestamp time = new Timestamp(System.currentTimeMillis());
			tr.setShippingRecordOutFlg_$1();
			tr.setShippingRecordOutUserId(this.getUserId());
			tr.setShippingRecordOutDt(time);
		}
		// [#694][2.1.0] 出力済データの更新をCONTROL_NOのクリア更新のみに修正 2017.01.23 honma Mod End

		// 帳票発行済フラグ更新処理（ロジッククラスを呼ぶ）
		outputLogic.updateShippingRecordOutFlg(tr, tPickingR, errRetSts(StatusCode.UPDATE_EXCEPTION));

		getInfoManager().add(new InfoStatus(StatusCode.SUCCESS), WmsMessageConst.PROCESS_COMPLETE_INFORMATION);

		return result;
	}

}
