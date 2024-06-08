package com.oneslogi.wms.logic.shipping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.bsbhv.pmbean.BsSqlTCcopamPrintUsedPmb;
import com.oneslogi.base.dbflute.exbhv.TCcopamBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlTCcopamPrintDataPmb;
import com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamPrintData;
import com.oneslogi.base.dbflute.exentity.customize.SqlTCcopamPrintUsed;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.DeliveryListDto;
import com.oneslogi.wms.util.WCU;

/**
 * 配車実績項目取得ロジッククラス
 */
public class ShippingInstructionInfoPrintSelectLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TCcopamBhv tCcopamBhv;

	// ===== 使用ロジッククラス =====

	public DeliveryListDto selectPrintDataEdit(String tdrelayid, Long controlNo, ErrorStatus errSts) {
		// 外出しSQLの定義
		String path = TCcopamBhv.PATH_selectSqlTCcopamPrintData;

		// 引数定義
		SqlTCcopamPrintDataPmb pmb = new SqlTCcopamPrintDataPmb();
		
		// 引数の値を設定
		pmb.setSupplierrCvFlg(tdrelayid);
		pmb.setControlNo(controlNo);
		
		// 検索実行
		Class<SqlTCcopamPrintData> entityType = SqlTCcopamPrintData.class;

		// 配車実績を検索し、配車実績項目を取得する
		SqlTCcopamPrintData sqlTCcopamPrintData = tCcopamBhv.outsideSql().entityHandling().selectEntity(path, pmb, entityType);
		
		if (sqlTCcopamPrintData == null) {
			getErrorManager().add(errSts, WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
			return null;
		}
		
		DeliveryListDto deliveryListDto = new DeliveryListDto();
		// 運送業者名
		deliveryListDto.setCarrierNm(sqlTCcopamPrintData.getTrannm());
		// 発送番号
		deliveryListDto.setSnNo3(sqlTCcopamPrintData.getSnno3());
		// ＪＴ整理番号
		deliveryListDto.setSnNo2(sqlTCcopamPrintData.getSnno2());
		// ＴＳＮ整理番号
		deliveryListDto.setSnNo1(sqlTCcopamPrintData.getSnno1());
		// 号車No
		deliveryListDto.setCarNo(sqlTCcopamPrintData.getCarno());
		// 計画車種
		deliveryListDto.setPlnCarKnd(stringToInteger(sqlTCcopamPrintData.getPlncarknd()));
		// 実績車種
		deliveryListDto.setAmCarKnd(stringToInteger(sqlTCcopamPrintData.getAmcarknd()));
		// 発送日
		deliveryListDto.setSnYMD(WCU.stringToDateString(sqlTCcopamPrintData.getSnymd()));
		// 到着日
		deliveryListDto.setArvYMD(WCU.stringToDateString(sqlTCcopamPrintData.getArvymd()));
		// 発送元
		deliveryListDto.setSupplierName("");
		// 発送先
		deliveryListDto.setShipName(sqlTCcopamPrintData.getStcd());
		// 汎用パレット
		deliveryListDto.setGnPltQa(sqlTCcopamPrintData.getGnlpltqa().intValue());
		// その他のパレット
		deliveryListDto.setOtPltQa(sqlTCcopamPrintData.getOtpltqa().intValue());
		// 封印Ｎｏ1
		deliveryListDto.setSelNo1(sqlTCcopamPrintData.getSelno1());
		// 封印Ｎｏ2 
		deliveryListDto.setSelNo2(sqlTCcopamPrintData.getSelno2());
		// 封印Ｎｏ3
		deliveryListDto.setSelNo3(sqlTCcopamPrintData.getSelno3());
		// 区分
		deliveryListDto.setDeliveryClass(sqlTCcopamPrintData.getTdrelayid());
		// 作成日
		Calendar calendar = Calendar.getInstance();
		Date dateNow = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		deliveryListDto.setAddDt(WCU.stringToDateString(sdf.format(dateNow)));
		// 帳票名
		deliveryListDto.setReportName("輸送帳票");
		// 
		deliveryListDto.setReportTypeDetail("");
		
		return deliveryListDto;
	}
	
	/**
	 * <h2>配車実績項目を取得する。</h2>
	 * <pre>
	 * 配車実績を検索し、配車実績項目を取得する。
	 * </pre>
	 * @param tdrelayid 輸送区分
	 * @param systemDt システム管理日付
	 * @param controlNo コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 */
	public DeliveryListDto selectPrintData(String tdrelayid, String systemDt, Long controlNo, ErrorStatus errSts) {

		// 輸送帳票DTO
		DeliveryListDto deliveryListDto = new DeliveryListDto();
		
		// 外出しSQLの定義
		String pathTCcopamPrintUsed = TCcopamBhv.PATH_selectSqlTCcopamPrintUsed;

		// 引数定義
		BsSqlTCcopamPrintUsedPmb pmbTCcopamPrintUsed = new BsSqlTCcopamPrintUsedPmb();
		
		// 引数の値を設定
		pmbTCcopamPrintUsed.setTdrelayid(tdrelayid);
		pmbTCcopamPrintUsed.setSystemDt(systemDt);
		pmbTCcopamPrintUsed.setControlNo(controlNo);
		
		// 検索実行
		Class<SqlTCcopamPrintUsed> entityType = SqlTCcopamPrintUsed.class;
		SqlTCcopamPrintUsed sqlTCcopamPrintUsed;

		// 配車実績を検索し、配車実績項目を取得する
		sqlTCcopamPrintUsed = tCcopamBhv.outsideSql().entityHandling().selectEntity(pathTCcopamPrintUsed, pmbTCcopamPrintUsed, entityType);
		
		if (sqlTCcopamPrintUsed == null) {
			// 取得した件数 = 0 場合
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()), WmsMessageConst.ENTITY_ALREADY_DELETED_ERROR);
		} else {
			// 運送業者名
			deliveryListDto.setCarrierNm(sqlTCcopamPrintUsed.getCarrierNm());
			// 発送番号
			deliveryListDto.setSnNo3(sqlTCcopamPrintUsed.getSnNo3());
			// ＪＴ整理番号
			deliveryListDto.setSnNo2(sqlTCcopamPrintUsed.getSnNo2());
			/** ＴＳＮ整理番号 */
			deliveryListDto.setSnNo1(sqlTCcopamPrintUsed.getSnNo1());
			// 号車No
			deliveryListDto.setCarNo(sqlTCcopamPrintUsed.getCarNo());
			// 計画車種
			if (!CU.isNullOrEmpty(sqlTCcopamPrintUsed.getPlnCarKnd())) {
				deliveryListDto.setPlnCarKnd(stringToInteger(sqlTCcopamPrintUsed.getPlnCarKnd()));
			}			
			// 実績車種
			if (!CU.isNullOrEmpty(sqlTCcopamPrintUsed.getAmCarKnd())) {
				deliveryListDto.setAmCarKnd(stringToInteger(sqlTCcopamPrintUsed.getAmCarKnd()));
			}	
			// 発送日
			deliveryListDto.setSnYMD(WCU.stringToDateString(sqlTCcopamPrintUsed.getSnYMD()));
			// 到着日
			deliveryListDto.setArvYMD(WCU.stringToDateString(sqlTCcopamPrintUsed.getArvYMD()));
			// 発送先
			deliveryListDto.setShipName(sqlTCcopamPrintUsed.getShipNm());
			// 汎用パレット
			if (sqlTCcopamPrintUsed.getGnPltQa() != null) {
				deliveryListDto.setGnPltQa(sqlTCcopamPrintUsed.getGnPltQa().intValue());
			}			
			// その他のパレット
			if (sqlTCcopamPrintUsed.getOtPltQa() != null) {
				deliveryListDto.setOtPltQa(sqlTCcopamPrintUsed.getOtPltQa().intValue());
			}			
			// 封印Ｎｏ1
			deliveryListDto.setSelNo1(sqlTCcopamPrintUsed.getSealNo1());
			// 封印Ｎｏ2 
			deliveryListDto.setSelNo2(sqlTCcopamPrintUsed.getSealNo2());
			// 封印Ｎｏ3
			deliveryListDto.setSelNo3(sqlTCcopamPrintUsed.getSealNo3());
			// 区分
			deliveryListDto.setDeliveryClass(sqlTCcopamPrintUsed.getDeliveryClassCd());
			// 作成日
			Calendar calendar = Calendar.getInstance();
			Date dateNow = calendar.getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			deliveryListDto.setAddDt(WCU.stringToDateString(sdf.format(dateNow)));
		}

		return deliveryListDto;
	}

	/**
	 * <h2>Stringを Integerに変更 </h2>
	 * <pre>
	 * Stringを Integerに変更
	 * </pre>
	 *
	 * @param str 文字列
	 * @return Integer 変換後数値
	 * @throws ParseException
	 */
	private Integer stringToInteger(String str) {
		Integer number = null;
		try {
		    number = Integer.parseInt(str);
		} catch (NumberFormatException e) {
		    // なにもしない
		}
		return number;
	}
}