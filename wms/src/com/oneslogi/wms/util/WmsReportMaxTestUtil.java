package com.oneslogi.wms.util;

import java.math.BigDecimal;

import com.oneslogi.wms.core.WCC;

public class WmsReportMaxTestUtil {

	/** 荷主CD **/
	public static String clientCd() {
		// 半角文字 最大5桁
		return getStr("W", 5);
	}

	/** 荷主略称 */
	public static String clientAbbr() {
		// 全角文字 最大10桁
		return getStr("○", 10);
	}

	/** センタCD **/
	public static String centerCd() {
		// 半角文字 最大5桁
		return getStr("W", 5);
	}

	/** センタ略称 */
	public static String centerAbbr() {
		// 全角文字 最大10桁
		return getStr("○", 10);
	}

	/** 取引先CD */
	public static String customerCd() {
		// 半角文字 最大10桁
		return getStr("W", 10);
	}

	/** 取引先略称 */
	public static String customerAbbr() {
		// 全角文字 最大15桁
		return getStr("○", 15);
	}

	/** 運送業者CD */
	public static String carrierCd() {
		// 半角文字 最大5桁
		return getStr("W", 5);
	}

	/** 運送業者略称 */
	public static String carrierAbbr() {
		// 全角文字 最大50桁
		return getStr("○", 50);
	}

	/** 配送コースCD */
	public static String deliveryCourseCd() {
		// 半角文字 最大5桁
		return getStr("W", 5);
	}

	/** 配送コース名称 */
	public static String deliveryCourseNm() {
		// 全角文字 最大50桁
		return getStr("○", 50);
	}

	/** 荷材CD **/
	public static String boxCd() {
		// 半角文字 最大10桁
		return getStr("W", 10);
	}

	/** 荷材名称 **/
	public static String boxNm() {
		// 全角文字 最大20桁
		return getStr("○", 20);
	}

	/** 倉庫CD **/
	public static String warehouseCd() {
		// 半角文字 最大5桁
		return getStr("W", 5);
	}

	/** 倉庫略称 */
	public static String warehouseAbbr() {
		// 全角文字 最大10桁
		return getStr("○", 10);
	}

	/** ゾーンCD **/
	public static String zoneCd() {
		// 半角文字 最大2桁
		return getStr("W", 2);
	}

	/** ゾーン略称 */
	public static String zoneNm() {
		// 全角文字 最大10桁
		return getStr("○", 10);
	}

	/** 在庫区分CD **/
	public static String stockTypeCd() {
		// 半角文字 最大5桁
		return getStr("W", 5);
	}

	/** 在庫区分名称 */
	public static String stockTypeNm() {
		// 全角文字 最大60桁
		return getStr("○", 60);
	}

	/** 日付 */
	public static String date() {
		// 8桁数字(日付)
		return "29991229";
	}

	/** 伝票数 */
	public static String slipNum() {
		// 数値 最大3桁
		return getStr("9", 3);
	}

	/** ロケーションCD */
	public static String locationCd() {
		// 半角文字 最大10桁
		return getStr("W", 10);
	}

	/** ロケーション名称 */
	public static String locationNm() {
		// 全角文字 最大15桁
		return getStr("○", 15);
	}

	/** 商品CD */
	public static String productCd() {
		// 半角文字 30桁
		return getStr("W", 30);
	}

	/** 商品略称 */
	public static String productAbbr() {
		// 全角文字 最大30桁
		return getStr("○", 30);
	}

	/** ソースCD */
	public static String janCd() {
		// 半角文字 30桁
		return getStr("W", 30);
	}

	/** ロット */
	public static String lot() {
		// 半角文字 10桁
		return getStr("W", 10);
	}

	/** 入庫ラベルNo. */
	public static String storeLabelNo() {
		// 半角文字 11桁
		return getStr("W", 11);
	}

	/** 在庫数量 */
	public static BigDecimal stockNum() {
		// 数値 最大7桁 ※記載基準より
		return WCC.toBigDecimal(getStr("9", 7));
	}

	/** 内訳 */
	public static String breakDown() {

		return "9999ts, 9999cs, 9999bl, 9999ps";
	}

	/** 入数 */
	public static String unitNum() {

		return "1ts=999cs, 1cs=999bl, 1bl=999ps";
	}

	/** 在庫管理最小単位 */
	public static String minimumUnit() {

		return "ps";
	}

	/** 顧客出荷指示No. */
	public static String clientShippingNo() {
		// 半角文字 最大30桁
		return getStr("W", 30);
	}

	/** WMS出荷伝票No. */
	public static String wmsShippingSlipNo() {
		// 数値 13桁
		return getStr("9", 13);
	}

	/** 出庫作業No. */
	public static String pickingWorkNo() {
		// PW + 数値 9桁
		return "PW" + getStr("9", 9);
	}

	/** 出荷梱包No. */
	public static String shippingPackingNo() {
		// SP + 数値 9桁
		return "SP" + getStr("9", 9);
	}

	/** 届先単位No. */
	public static String delivUnitNo() {
		// 数値 10桁
		return getStr("9", 10);
	}

	/** ピッキンググループNo. */
	public static String pickingGroupNo() {
		// 数値 11桁
		return getStr("9", 11);
	}

	/** 仮置No. */
	public static String tempNo() {
		// 数値 4桁
		return getStr("9", 4);
	}

	/** 仮置No. */
	public static String tempNo(int i) {
		// 数値 4桁
		String tmpNoStr = "0000" + String.valueOf(i);
		tmpNoStr = tmpNoStr.substring(tmpNoStr.length() - 4);
		return tmpNoStr;
	}

	/** 種蒔きNo. */
	public static String seedingNo() {
		// 数値 10桁
		return getStr("9", 10);
	}

	/** ケースピッキングNo. */
	public static String casePickingNo() {
		// 数値 11桁
		return getStr("9", 11);
	}

	/** 出庫作業メッセージ */
	public static String pickingWorkMessage() {
		// 全角文字 最大100桁 × 5伝票
		return getStr("○", 500);
	}

	/** 電話番号 */
	public static String telNo() {
		// 数値 15桁
		return getStr("9", 15);
	}

	/** 金額 */
	public static BigDecimal price() {
		// 数値 最大7桁
		return WCC.toBigDecimal(getStr("9", 7));
	}

	/** 文字列の作成 */
	private static String getStr(String str, int size) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(str);
		}
		return sb.toString();
	}
}
