package com.oneslogi.wms.logic.tsnCommon;

import java.util.List;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.cbean.TTrsolistCB;
import com.oneslogi.base.dbflute.exbhv.TTrsolistBhv;
import com.oneslogi.base.dbflute.exentity.TTrsolist;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.tsnCommon.TSplitData;
import com.oneslogi.wms.util.WmsCommonUtil;

public class BGL0006GetPalletDetailItems extends AbstractWmsLogic {

	// ===== 使用テーブル =====
	@Inject
	private TTrsolistBhv tTrsolistBhv;
	
	public TSplitData getPalletDetail(String inputData, TSplitData tSplitData, ErrorStatus errSts) {

		//nullチェック
		if (inputData == null) {
			inputData = "";
		}

		// 入力チェック
		if (inputData.length() == 17 && (inputData.substring(0, 2).equals("PT"))) {
			//入力情報がパレット明細(単品)(17桁かつ先頭２桁が”PT”)の場合

			tSplitData.setShipListKey(inputData.substring(2, 12)); //出庫関連リストキー
			tSplitData.setSoDetailId(inputData.substring(12, 17)); ////出庫予定明細ID
			tSplitData.setPlNo(null);

			// ===== .出庫関連リスト印刷を検索する =====
			TTrsolistCB cb = tTrsolistBhv.newMyConditionBean();
			// 検索条件
			cb.query().setTrsolistkey_Equal(WmsCommonUtil.stringToLong(inputData.substring(2, 12)));
			cb.query().setDelFlg_Equal("0");
			// 検索実行
			List<TTrsolist> trsolistkeyList = tTrsolistBhv.selectList(cb);

			//該当データなしの場合
			if (trsolistkeyList.size() == 0) {

				this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
						WmsMessageConst.PALLET_DETAIL_BARCODE_NOT_FOUND_ERROR);
				return null;


			}

			for(TTrsolist tTrsolist:trsolistkeyList) {

				if (tTrsolist.getSoid() == null) {

					this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
							WmsMessageConst.PALLET_DETAIL_BARCODE_NOT_FOUND_ERROR);
					return null;

				}

				tSplitData.setSoId(tTrsolist.getSoid().toString()); //

			}

		} else if (inputData.length() == 15 && (inputData.substring(0, 2).equals("PH"))) {

			//入力情報がパレット明細(端数)(15桁かつ先頭２桁が”PH”)の場合
			tSplitData.setSoId(inputData.substring(2,12)); //出庫予定ID
			tSplitData.setPlNo(inputData.substring(12,15)); //PLNo
			tSplitData.setShipListKey(null); //出庫関連リストキー
			tSplitData.setSoDetailId(null); //出庫予定明細ID

		} else {
			//上記以外
			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
					WmsMessageConst.PALLET_DETAIL_BARCODE_INPUT_ERROR);
			return null;



		}
		return tSplitData;
	}
}
