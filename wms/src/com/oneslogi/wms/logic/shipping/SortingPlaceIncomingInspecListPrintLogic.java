package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlSortingPlaceIncomingInspecListPrintPmb;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlSortingPlaceIncomingInspecListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.SortingPlaceIncomingInspecListDto;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 仕分場受入検品リスト発行ロジッククラス
 */
public class SortingPlaceIncomingInspecListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	/**
	 * <h2>仕分場受入検品リストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し仕分場受入検品リストデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<SortingPlaceIncomingInspecListDto> 仕分場受入検品リスト
	 */
	public List<SortingPlaceIncomingInspecListDto> selectPrintData(TTrsolist tTrsolist, ErrorStatus errSts) {

		// ===== 仕分場受入検品リスト発行データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlSortingPlaceIncomingInspecListPrint;	

		// 検索条件の設定
		SqlSortingPlaceIncomingInspecListPrintPmb pmb = setCondition(tTrsolist);

		// 検索実行
		Class<SqlSortingPlaceIncomingInspecListPrint> entityType = SqlSortingPlaceIncomingInspecListPrint.class;
		List<SqlSortingPlaceIncomingInspecListPrint> selectSqlList = tTrsolistBhv.outsideSql().selectList(path, pmb, entityType);
		if (selectSqlList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 帳票DTOへ変換 =====
		List<SortingPlaceIncomingInspecListDto> printDtoList = convertPrintDto(selectSqlList);

		return printDtoList;

	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @return SqlSortingPlaceIncomingInspecListPrintPmb 検索条件pmb
	 */
	private SqlSortingPlaceIncomingInspecListPrintPmb setCondition(TTrsolist tTrsolist) {
		// 検索条件の設定
		SqlSortingPlaceIncomingInspecListPrintPmb pmb = new SqlSortingPlaceIncomingInspecListPrintPmb();
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
	private List<SortingPlaceIncomingInspecListDto> convertPrintDto(List<SqlSortingPlaceIncomingInspecListPrint> printDataList) {

		List<SortingPlaceIncomingInspecListDto> printDtoList = new ArrayList<SortingPlaceIncomingInspecListDto>();

		for (SqlSortingPlaceIncomingInspecListPrint sqlPrint : printDataList) {

			SortingPlaceIncomingInspecListDto printDto = new SortingPlaceIncomingInspecListDto();

			printDto.setWarehouseCd(sqlPrint.getCenterCd());
			printDto.setCenterNm(sqlPrint.getCenterAbbr());
			printDto.setWorkAllocateId(sqlPrint.getWorkallocateid().toString());
			printDto.setBarcode39("SL" + 
					WmsCommonUtil.subStringRight("0000000000" + sqlPrint.getWorkallocateid().toString(), 10) + 
					sqlPrint.getListkbn());
			printDto.setItemCd(sqlPrint.getProductCd());
			printDto.setProductNm(sqlPrint.getProductAbbr());
			printDto.setFloor(sqlPrint.getFloor());

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
			printDto.setOtherLot1(sqlPrint.getOthercd3());
			printDto.setLot3(sqlPrint.getLot3());
			printDto.setSortReceivedCaseQty(sqlPrint.getPickCaseQty().longValue());
			printDto.setSortReceivedCartonQty(sqlPrint.getPickCartonQty().longValue());
			printDto.setPickedPalletQty(sqlPrint.getPalletExpectQty().longValue());
			printDto.setPickedCaseQty(sqlPrint.getCaseExpectQty().longValue());
			printDto.setPickedCartonQty(sqlPrint.getCartonExpectQty().longValue());
			printDto.setClientNm(sqlPrint.getClientNm());
			printDto.setUserNum3(sqlPrint.getUsernum3().toString());
			printDto.setUserNm(sqlPrint.getUserNm());
			printDto.setUserCd(sqlPrint.getUserCd());
			printDto.setListKbn(sqlPrint.getListkbn());
			printDto.setShipSchDateMin(WmsCommonUtil.stringToDateString(sqlPrint.getMinShipschdate()));
			printDto.setShipSchDateMax(WmsCommonUtil.stringToDateString(sqlPrint.getMaxShipschdate()));

			printDtoList.add(printDto);
		}

		return printDtoList;
	}

}
