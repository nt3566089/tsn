package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlShippingLoadingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlShippingLoadingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.base.util.CU;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.ShippingLoadingListDto;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 積込リスト発行ロジッククラス
 */
public class ShippingLoadingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	/**
	 * <h2>積込リストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し積込リストデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<ShippingLoadingListDto> 積込リスト
	 */
	public List<ShippingLoadingListDto> selectPrintData(TTrsolist tTrsolist, ErrorStatus errSts) {

		// ===== 積込リスト発行データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlShippingLoadingListPrint;

		// 検索条件の設定
		SqlShippingLoadingListPrintPmb pmb = setCondition(tTrsolist);

		// 検索実行
		Class<SqlShippingLoadingListPrint> entityType = SqlShippingLoadingListPrint.class;
		List<SqlShippingLoadingListPrint> selectSqlList = tTrsolistBhv.outsideSql().selectList(path, pmb, entityType);
		if (selectSqlList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 帳票DTOへ変換 =====
		List<ShippingLoadingListDto> printDtoList = convertPrintDto(selectSqlList);

		return printDtoList;

	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @return SqlShippingLoadingListPrintPmb 検索条件pmb
	 */
	private SqlShippingLoadingListPrintPmb setCondition(TTrsolist tTrsolist) {
		// 検索条件の設定
		SqlShippingLoadingListPrintPmb pmb = new SqlShippingLoadingListPrintPmb();
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
	private List<ShippingLoadingListDto> convertPrintDto(List<SqlShippingLoadingListPrint> printDataList) {

		List<ShippingLoadingListDto> printDtoList = new ArrayList<ShippingLoadingListDto>();

		for (SqlShippingLoadingListPrint sqlPrint : printDataList) {

			ShippingLoadingListDto printDto = new ShippingLoadingListDto();

			printDto.setRmaNo(sqlPrint.getRmano());
			printDto.setOwnerSoNo(sqlPrint.getOwnersono());
			printDto.setOtherRefNo1(sqlPrint.getOtherrefno1Nm());

			if (CU.equals(sqlPrint.getFax1(), "3") == true) {
				printDto.setShitToCd(sqlPrint.getCustomerCd());
				printDto.setCustomerNm(sqlPrint.getCustomerAbbr());
			} else {
				printDto.setShitToCd(sqlPrint.getShiptocd());
				printDto.setCustomerNm(sqlPrint.getDelivname());
			}

			printDto.setShipSchDate(WmsCommonUtil.stringToDateString(sqlPrint.getShipschdate()));
			printDto.setCarNo(sqlPrint.getPhoneno());
			printDto.setBarcode39("TS" + 
					WmsCommonUtil.subStringRight("0000000000" + sqlPrint.getTrsolistkey().toString(), 10));

			if (sqlPrint.getTransportpriority() != null) {
				printDto.setTransportPriority(sqlPrint.getTransportpriority().stripTrailingZeros().toString());
			}

			printDto.setTrsoListKey(sqlPrint.getTrsolistkey().toString());
			printDto.setPlNo(sqlPrint.getNotes());
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
			
			printDto.setLot3(sqlPrint.getLot3());

			printDto.setPrice2(sqlPrint.getPrice2().toString());
			printDto.setUserNum3(sqlPrint.getUsernum3().toString());
			printDto.setWarehouseCd(sqlPrint.getCenterCd());
			printDto.setCenterNm(sqlPrint.getCenterAbbr());
			printDto.setUserNm(sqlPrint.getUserNm());
			printDto.setUserCd(sqlPrint.getUserCd());
			printDto.setCaseQty(sqlPrint.getExpectqty1().longValue());
			printDto.setCartonQty(sqlPrint.getExpectqty2().longValue());
			
			if (CU.equals(sqlPrint.getFax1(), "3") == true) {
				printDto.setIsSpecialAgents(true);
			} else {
				printDto.setIsSpecialAgents(false);
			}
			
			printDto.setOrderType(sqlPrint.getOrdertypeNm());

			printDtoList.add(printDto);
		}

		return printDtoList;
	}

}
