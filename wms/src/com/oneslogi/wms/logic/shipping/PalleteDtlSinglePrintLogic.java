package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlPalleteDtlSinglePrintPmb;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlPalleteDtlSinglePrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.PalleteDtlSingleDto;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * パレット明細(単品)発行ロジッククラス
 */
public class PalleteDtlSinglePrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	/**
	 * <h2>パレット明細(単品)データを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用しパレット明細(単品)データを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<PalleteDtlSingleDto> パレット明細(単品)
	 */
	public List<PalleteDtlSingleDto> selectPrintData(TTrsolist tTrsolist, ErrorStatus errSts) {

		// ===== パレット明細(単品)発行データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlPalleteDtlSinglePrint;

		// 検索条件の設定
		SqlPalleteDtlSinglePrintPmb pmb = setCondition(tTrsolist);

		// 検索実行
		Class<SqlPalleteDtlSinglePrint> entityType = SqlPalleteDtlSinglePrint.class;
		List<SqlPalleteDtlSinglePrint> selectSqlList = tTrsolistBhv.outsideSql().selectList(path, pmb, entityType);
		if (selectSqlList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 帳票DTOへ変換 =====
		List<PalleteDtlSingleDto> printDtoList = convertPrintDto(selectSqlList);

		return printDtoList;

	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @return SqlPalleteDtlSinglePrintPmb 検索条件pmb
	 */
	private SqlPalleteDtlSinglePrintPmb setCondition(TTrsolist tTrsolist) {
		// 検索条件の設定
		SqlPalleteDtlSinglePrintPmb pmb = new SqlPalleteDtlSinglePrintPmb();
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
	private List<PalleteDtlSingleDto> convertPrintDto(List<SqlPalleteDtlSinglePrint> printDataList) {

		List<PalleteDtlSingleDto> printDtoList = new ArrayList<PalleteDtlSingleDto>();

		for (SqlPalleteDtlSinglePrint sqlPrint : printDataList) {

			PalleteDtlSingleDto printDto = new PalleteDtlSingleDto();

			printDto.setLocCd(sqlPrint.getLocationCd());
			if (sqlPrint.getTransportpriority() != null) {
				printDto.setTransportPriority(sqlPrint.getTransportpriority().stripTrailingZeros().toString());
			}
			printDto.setWorkAllocateId(sqlPrint.getWorkallocateid().toString());
			printDto.setUserNum(sqlPrint.getUsernum3().toString());
			printDto.setCenterNm(sqlPrint.getCenterAbbr());
			printDto.setOtherRefNo1(sqlPrint.getOtherrefno1());
			printDto.setReferenceNo(sqlPrint.getOwnersono());
			printDto.setRmaNo(sqlPrint.getRmano());

			if (CU.isNullOrEmpty(sqlPrint.getShipschdate()) == false) {
				String shipschdate = sqlPrint.getShipschdate();
				String printShipschdate = shipschdate.substring(shipschdate.length() - 2) + "日";
				printDto.setShipSchDate(printShipschdate);
			}

			printDto.setSoPalletNo(sqlPrint.getSopalletno());

			if (CU.equals(sqlPrint.getFax1(), "3") == true) {
				printDto.setCustomerNm(sqlPrint.getCustomerAbbr());
			} else {
				printDto.setCustomerNm(sqlPrint.getCarriersname());
			}
			
			printDto.setItemCd(sqlPrint.getProductCd());
			printDto.setProductNm(sqlPrint.getProductAbbr());

			if (CU.isNullOrEmpty(sqlPrint.getLot1()) == false) {
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

			if (CU.isNullOrEmpty(sqlPrint.getLot4()) == false) {
				printDto.setLot4(WmsCommonUtil.stringToDateString(sqlPrint.getLot4()).substring(0, 7));
			}
			
			printDto.setLot2(sqlPrint.getLot2());
			printDto.setLot3(sqlPrint.getLot3());

			printDto.setBarcode39("PT" + 
					WmsCommonUtil.subStringRight("0000000000" + sqlPrint.getTrsolistkey().toString(), 10) + 
					WmsCommonUtil.subStringRight("00000" + sqlPrint.getSolineno().toString(), 5));

			printDto.setStkClsNm(sqlPrint.getOthercd3());
			printDto.setSpgWorkComment(sqlPrint.getNotes());
			printDto.setIfItemCd(sqlPrint.getIfitemcd());
			printDto.setExpectQty(sqlPrint.getCaseExpectqty1().longValue());

			if (CU.equals(sqlPrint.getFax1(), "3") == false) {
				printDto.setIsSpecialAgents(true);
			} else {
				printDto.setIsSpecialAgents(false);
			}

			printDtoList.add(printDto);
		}

		return printDtoList;
	}

}
