package com.oneslogi.wms.logic.shipping;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exbhv.pmbean.SqlBondedPickingListPrintPmb;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.dbflute.exentity.customize.SqlBondedPickingListPrint;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.report.BondedPickingListDto;
import com.oneslogi.wms.util.WmsCommonUtil;

/**
 * 棚出リスト発行ロジッククラス
 */
public class BondedPickingListPrintLogic extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;

	/**
	 * <h2>棚出リストデータを取得する。</h2>
	 * <pre>
	 * 引数を条件に外出しSQLを使用し棚出リストデータを取得する。
	 *
	 * 検索対象が見つからない場合、
	 * ０件エラーをエラーステータスに設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @param errSts エラー時に設定するエラーステータス
	 * @return List<BondedPickingListDto> 棚出リスト
	 */
	public List<BondedPickingListDto> selectPrintData(TTrsolist tTrsolist, ErrorStatus errSts) {

		// ===== 棚出リスト発行データ取得 =====

		// 外出しSQLの定義
		String path = TTrsolistBhv.PATH_selectSqlBondedPickingListPrint;

		// 検索条件の設定
		SqlBondedPickingListPrintPmb pmb = setCondition(tTrsolist);

		// 検索実行
		Class<SqlBondedPickingListPrint> entityType = SqlBondedPickingListPrint.class;
		List<SqlBondedPickingListPrint> selectSqlList = tTrsolistBhv.outsideSql().selectList(path, pmb, entityType);
		if (selectSqlList.size() == 0) {
			getErrorManager().add(errSts, WmsMessageConst.DATA_NOT_FOUND_ERROR);
			return null;
		}

		// ===== 帳票DTOへ変換 =====
		List<BondedPickingListDto> printDtoList = convertPrintDto(selectSqlList);

		return printDtoList;

	}

	/**
	 * <h2>外出しSQLの検索条件を設定する。</h2>
	 * <pre>
	 * 検索条件を設定する。
	 * </pre>
	 * @param tTrsolist 出庫関連リスト印刷：コントロールNo.
	 * @return SqlBondedPickingListPrintPmb 検索条件pmb
	 */
	private SqlBondedPickingListPrintPmb setCondition(TTrsolist tTrsolist) {
		// 検索条件の設定
		SqlBondedPickingListPrintPmb pmb = new SqlBondedPickingListPrintPmb();
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
	private List<BondedPickingListDto> convertPrintDto(List<SqlBondedPickingListPrint> printDataList) {

		List<BondedPickingListDto> printDtoList = new ArrayList<BondedPickingListDto>();

		for (SqlBondedPickingListPrint sqlPrint : printDataList) {

			BondedPickingListDto printDto = new BondedPickingListDto();

			printDto.setListKbn(sqlPrint.getListkbn());
			printDto.setWarehouseCd(sqlPrint.getCenterCd());
			printDto.setCenterNm(sqlPrint.getCenterAbbr());
			printDto.setWorkAllocateId(sqlPrint.getWorkallocateid().toString());
			printDto.setFloor(sqlPrint.getFloor());

			printDto.setBarcode39("TL" + 
					WmsCommonUtil.subStringRight("0000000000" + sqlPrint.getWorkallocateid().toString(), 10) + 
					WmsCommonUtil.subStringRight("000000" + sqlPrint.getFloor(), 6) + 
					sqlPrint.getListkbn());

			printDto.setLocCd(sqlPrint.getLocationCd());
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
			printDto.setOtherLot1(sqlPrint.getOthercd3());
			printDto.setLot3(sqlPrint.getLot3());
			printDto.setPalletQty(sqlPrint.getPalletQty().longValue());
			printDto.setCaseQty(sqlPrint.getCaseQty().longValue());
			printDto.setSortReceivedCaseQty(sqlPrint.getSortReceivedCaseQty().longValue());
			printDto.setSortReceivedCartonQty(sqlPrint.getSortReceivedCartonQty().longValue());
			printDto.setPickedPalletQty(sqlPrint.getPickedPalletQty().longValue());
			printDto.setPickedCaseQty(sqlPrint.getPickedCaseQty().longValue());
			printDto.setPickedCartonQty(sqlPrint.getPickedCartonQty().longValue());
			printDto.setClientNm(sqlPrint.getClientNm());
			printDto.setUserNum3(sqlPrint.getUsernum3().toString());
			printDto.setUserNm(sqlPrint.getUserNm());
			printDto.setUserCd(sqlPrint.getUserCd());
			printDto.setShipSchDateMin(WmsCommonUtil.stringToDateString(sqlPrint.getMinShipschdate()));
			printDto.setShipSchDateMax(WmsCommonUtil.stringToDateString(sqlPrint.getMaxShipschdate()));

			printDtoList.add(printDto);
		}

		return printDtoList;
	}

}
