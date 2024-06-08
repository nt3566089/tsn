package com.oneslogi.wms.logic.tsnCommon;

import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.WmsMessageConst;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;
import com.oneslogi.wms.dto.tsnCommon.TSplitData;
import com.oneslogi.wms.dto.tsnCommon.TSplitDetailData;

public class BGL0005SplitRepresentativeQR extends AbstractWmsLogic {

	public TSplitData splitRepresentativeQR(String inputData, TSplitData tSplitData, ErrorStatus errSts) {

		//nullチェック
		if (inputData == null) {
			inputData = "";
		}
		//入力情報が国産の場合(桁数＋1(カンマ11が最終行には存在しない為)が70桁の倍数の場合)
		if ((inputData.length() + 1) % 70 == 0) {

			//ヘッダ部の変数を初期化する
			tSplitData.setRefNo(null); //整理番号
			tSplitData.setShipCd(null); //発地コードs
			tSplitData.setCarryOutDate(null); //払出実績日
			tSplitData.setShipToCd(null); //着地コード
			tSplitData.setRcvDate(null); //受入予定日
			tSplitData.setZzshType(null); //輸送形態コード
			tSplitData.setTplQty(null); //総パレット数
			tSplitData.setRcvPalletNo(null); //需給パレット番号
			tSplitData.setTaxPalletNo(null); //保税パレット番号
			tSplitData.setCaseQty(null); //段ボール数

			List<TSplitDetailData> splitDetailDataList = new ArrayList<TSplitDetailData>();

			int loopNum = (inputData.length() + 1) / 70;
			//入力情報の明細部の件数分、以下を繰り返す
			for (int i = 0; i < loopNum; i++) {

				TSplitDetailData splitDetailData = new TSplitDetailData();
				//変数に値を設定する。
				splitDetailData.setFactoryCd(inputData.substring(0 + 70 * i, 4 + (70 * i)));//工場コード
				splitDetailData.setItemCd(inputData.substring(5 + 70 * i, 9 + (70 * i)));//銘柄コード
				splitDetailData.setSku(inputData.substring(12 + 70 * i, 20 + (70 * i)));//SKU
				splitDetailData.setDestinationCd(inputData.substring(21 + 70 * i, 25 + (70 * i)));//仕向地コード
				splitDetailData.setManufactureCd(inputData.substring(26 + 70 * i, 30 + (70 * i)));//製造記号
				splitDetailData.setOrderNo(inputData.substring(31 + 70 * i, 37 + (70 * i)));//発注番号
				splitDetailData.setMachineNo(inputData.substring(38 + 70 * i, 40 + (70 * i)));//号機
				splitDetailData.setCreateNo(inputData.substring(41 + 70 * i, 45 + (70 * i)));//生出番号
				splitDetailData.setLimitDate(inputData.substring(46 + 70 * i, 54 + (70 * i)));//製造年月日
				splitDetailData.setMakeTime(inputData.substring(55 + 70 * i, 67 + (70 * i)));//実製造時間
				splitDetailData.setDistributionCd(inputData.substring(68 + 70 * i, 69 + (70 * i)));//流通識別コード
				splitDetailData.setFirmtransportCd(null);//商社搬入番号
				splitDetailData.setRcvKey(null);//入庫キー
				splitDetailData.setDesignCd(null);//デザイン区分
				splitDetailData.setBatjMfYm(null);//BATJ製造月記号
				splitDetailData.setQty(null);//個装数量
				splitDetailData.setLastItemCd(null);//銘柄変更前銘柄コード
				splitDetailData.setLastDesignCd(null);//銘柄変更前デザイン区分
				splitDetailData.setCaseFlg(null);//段ボール有無フラグ

				splitDetailDataList.add(splitDetailData);
			}

			tSplitData.setSplitDetailData(splitDetailDataList);

		} else if ((inputData.length() - 62) % 82 == 0) {
			//入力情報の輸入の場合(桁数-62(ヘッダ部の桁数)が82桁の倍数の場合)

			//入力情報のヘッダ部を分割
			tSplitData.setRefNo(inputData.substring(0, 7)); //整理番号
			tSplitData.setShipCd(inputData.substring(8, 12)); //発地コード
			tSplitData.setCarryOutDate(inputData.substring(12, 20)); //払出実績日
			tSplitData.setShipToCd(inputData.substring(20, 24)); //着地コード
			tSplitData.setRcvDate(inputData.substring(24, 32)); //受入予定日
			tSplitData.setZzshType(inputData.substring(32, 36)); //輸送形態コード
			tSplitData.setTplQty(inputData.substring(36, 39)); //総パレット数
			tSplitData.setRcvPalletNo(inputData.substring(39, 49)); //需給パレット番号
			tSplitData.setTaxPalletNo(inputData.substring(49, 59)); //保税パレット番号
			tSplitData.setCaseQty(inputData.substring(59, 62)); //段ボール数

			List<TSplitDetailData> splitDetailDataList = new ArrayList<TSplitDetailData>();

			int loopNum = (inputData.length() - 62) / 82;
			//入力情報の明細部の件数分、以下を繰り返す
			for (int i = 0; i < loopNum; i++) {

				TSplitDetailData splitDetailData = new TSplitDetailData();
				//変数に値を設定する。
				splitDetailData.setFirmtransportCd(inputData.substring(62 + 18 + 82 * i, 92 + (82 * i)));//商社搬入番号
				splitDetailData.setFactoryCd(inputData.substring(62 + 30 + 82 * i, 96 + (82 * i))); //工場コード
				splitDetailData.setItemCd(inputData.substring(62 + 36 + 82 * i, 102 + (82 * i)));//.銘柄コード
				splitDetailData.setMachineNo(inputData.substring(62 + 40 + 82 * i, 104 + (82 * i)));//号機
				splitDetailData.setCreateNo(inputData.substring(62 + 42 + 82 * i, 108 + (82 * i)));//生出番号
				splitDetailData.setLimitDate(inputData.substring(62 + 46 + 82 * i, 116 + (82 * i)));//製造年月日
				splitDetailData.setRcvKey(inputData.substring(62 + 54 + 82 * i, 126 + (82 * i)));//入庫キー
				splitDetailData.setDesignCd(inputData.substring(62 + 64 + 82 * i, 128 + (82 * i)));//デザイン区分
				splitDetailData.setBatjMfYm(inputData.substring(62 + 66 + 82 * i, 130 + (82 * i)));//BATJ製造月記号
				splitDetailData.setQty(inputData.substring(62 + 68 + 82 * i, 135 + (82 * i)));//個装数量
				splitDetailData.setLastItemCd(inputData.substring(62 + 75 + 82 * i, 141 + (82 * i)));//銘柄変更前銘柄コード
				splitDetailData.setLastDesignCd(inputData.substring(62 + 79 + 82 * i, 143 + (82 * i)));//銘柄変更前デザイン区分
				splitDetailData.setCaseFlg(inputData.substring(62 + 81 + 82 * i, 144 + (82 * i)));//段ボール有無フラグ
				splitDetailData.setSku(null);//SKU
				splitDetailData.setDestinationCd(null);//仕向地コード
				splitDetailData.setManufactureCd(null);//製造記号
				splitDetailData.setOrderNo(null);//発注番号
				splitDetailData.setMakeTime(null);//実製造時間
				splitDetailData.setDistributionCd(null);//流通識別コード

				splitDetailDataList.add(splitDetailData);
			}

			tSplitData.setSplitDetailData(splitDetailDataList);

		} else {

			this.getErrorManager().add(new ErrorStatus(errSts.getStatusCd()),
					WmsMessageConst.EPRESENTATIVE_Q_R_INPUT_ERROR);
			return null;

		}

		return tSplitData;
	}
}
