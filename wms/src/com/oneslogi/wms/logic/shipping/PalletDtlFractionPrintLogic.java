package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPalletDtlFractionPrintPmb;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlPalletDtlFractionPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.PalletDtlFractionDto;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * パレット明細(端数)発行ロジッククラス
 */
public class PalletDtlFractionPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	/**
	 * <h2>パレット明細(端数)データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しパレット明細(端数)データを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<PalletDtlFractionDto> パレット明細(端数)
	 */
	public List<PalletDtlFractionDto> selectPrintData(TTrsolist tTrsolist, ErrorStatus errSts) {

		// ===== パレット明細(端数)発行データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlPalletDtlFractionPrint;	

		// 検索条件の設定
		SqlPalletDtlFractionPrintPmb pmb = setCondition(tTrsolist);

		// 検索実行
		Class<SqlPalletDtlFractionPrint> entityType = SqlPalletDtlFractionPrint.class;
		List<SqlPalletDtlFractionPrint> selectSqlList = tTrsolistBhv.outsideSql().selectList(path, pmb, entityType);
		if (selectSqlList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 帳票DTOへ変換 =====
		List<PalletDtlFractionDto> printDtoList = convertPrintDto(selectSqlList);

		return printDtoList;

	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @return SqlPalletDtlFractionPrintPmb 検索条件pmb
	 */
	private SqlPalletDtlFractionPrintPmb setCondition(TTrsolist tTrsolist) {
		// 検索条件の設定
		SqlPalletDtlFractionPrintPmb pmb = new SqlPalletDtlFractionPrintPmb();
		pmb.setControlNo(tTrsolist.getControlNo());

		return pmb;
	}

	/**
	 * <h2>SQLデータから帳票DTOへ変換</h2>
	 * <pre>
	 * SQLデータから帳票DTOへ変換
	 * </pre>
	 * @param printDataList 外出SQLで検索したデータリスト
	 * @return 帳票DTOのリスト
	 */
	private List<PalletDtlFractionDto> convertPrintDto(List<SqlPalletDtlFractionPrint> printDataList) {

		List<PalletDtlFractionDto> printDtoList = new ArrayList<PalletDtlFractionDto>();

		for (SqlPalletDtlFractionPrint sqlPrint : printDataList) {

			PalletDtlFractionDto printDto = new PalletDtlFractionDto();

			printDto.setBarcode39("PH" + 
					WmsCommonUtil.subStringRight("0000000000" + sqlPrint.getTrsolistkey().toString(), 10) + 
					WmsCommonUtil.subStringRight("000" + sqlPrint.getSopalletno().toString(), 3));
			printDto.setCenterNm(sqlPrint.getCenterAbbr());
			if (sqlPrint.getOtherlot3Cnt() == 1) {
				printDto.setOtherRefNo1(sqlPrint.getOtherrefno1());
			}
			printDto.setReferenceNoHeader(sqlPrint.getOwnersono());
			printDto.setReferenceNo(sqlPrint.getOtherlot3());
			printDto.setRmono(sqlPrint.getRmano());

			if (CU.isNullOrEmpty(sqlPrint.getShipschdate()) == false) {
				String shipschdate = sqlPrint.getShipschdate();
				String printShipschdate = shipschdate.substring(shipschdate.length() - 2) + "日";
				printDto.setShipSchDate(printShipschdate);
			}

			if (CU.equals(sqlPrint.getFax1(), "3") == true) {
				printDto.setCustomerNm(sqlPrint.getCustomerAbbr());
			} else {
				printDto.setCustomerNm(sqlPrint.getCarriersname());
			}
			printDto.setSoPalletNo(sqlPrint.getSopalletno());
			if (sqlPrint.getTransportpriority() != null) {
				printDto.setTransportPriority(sqlPrint.getTransportpriority().stripTrailingZeros().toString());
			}
			printDto.setItemCd(sqlPrint.getProductCd());
			printDto.setProductNm(sqlPrint.getProductAbbr());

			if (sqlPrint.getLot1() != null) {
				StringBuilder strLot1 = new StringBuilder();
				strLot1.append(sqlPrint.getLot1());
				if (sqlPrint.getLot1().length() > 2) {
					strLot1.insert(2, "-");
				}
				if (sqlPrint.getLot1().length() > 5) {
					strLot1.insert(6, "-");	
				}
				if (sqlPrint.getLot1().length() > 7) {
					strLot1.insert(9, "-");
				}
				printDto.setLot1(strLot1.toString());
			}

			if (sqlPrint.getLot4() != null) {
				printDto.setLot4(WmsCommonUtil.stringToDateString(sqlPrint.getLot4()).substring(0, 7));
			}
			
			printDto.setLot2(sqlPrint.getLot2());
			printDto.setLot3(sqlPrint.getLot3());
			printDto.setUserNum(sqlPrint.getUsernum3().toString());
			printDto.setPrice2(sqlPrint.getPrice2().toString());
			printDto.setIfItemCd(sqlPrint.getIfitemcd());

			if (CU.equals(sqlPrint.getFax1(), "3") == false) {
				printDto.setIsSpecialAgents(true);
			} else {
				printDto.setIsSpecialAgents(false);
			}

			printDto.setExpectCaseQty(sqlPrint.getExpectCaseQty().longValue());
			printDto.setExpectCartonQty(sqlPrint.getExpectCartonQty().longValue());
			
			if (sqlPrint.getLot1Cnt() > 1) {
				printDto.setIsMixLot1(true);
			} else {
				printDto.setIsMixLot1(false);
			}

			if (sqlPrint.getLot4Cnt() > 1) {
				printDto.setIsMixLot4(true);
			} else {
				printDto.setIsMixLot4(false);
			}

			if (sqlPrint.getOtherlot3Cnt() > 1) {
				printDto.setIsMixReferenceNo(true);
			} else {
				printDto.setIsMixReferenceNo(false);
			}

			printDtoList.add(printDto);
		}

		return printDtoList;
	}

}
