package com.oneslogi.base.dbflute.nogen;

import java.lang.reflect.Method;

import org.dbflute.cbean.cipher.CipherFunctionFilter;
import org.dbflute.cbean.cipher.GearedCipherManager;
import org.dbflute.dbmeta.info.ColumnInfo;

/**
 * DBFlute経由での暗号化・復号化の実装クラスを生成
 *
 */
public class WmsGearedCipherManagerMaker {

	/**
	 * 暗号化・復号化対象の列を{テーブル名}.{列名}の形式で指定
	 * ※ キャメルケース表記(先頭大文字) ※
	 */
	private static final String[] TARGET_COLUMNS = {
			// ===== 楽天RMS受注 =====
			"TRakutenOrder.OrderAddress1",
			"TRakutenOrder.OrderAddress2",
			"TRakutenOrder.OrderAddress3",
			"TRakutenOrder.OrderCustomerNm1",
			"TRakutenOrder.OrderCustomerNm2",
			"TRakutenOrder.OrderCustomerKn1",
			"TRakutenOrder.OrderCustomerKn2",
			"TRakutenOrder.OrderTelNo1",
			"TRakutenOrder.OrderTelNo2",
			"TRakutenOrder.OrderTelNo3",
			"TRakutenOrder.MailAddress",
			"TRakutenOrder.OrderSex",
			"TRakutenOrder.OrderBirthday",
			"TRakutenOrder.CardNo",
			"TRakutenOrder.CardNm",
			"TRakutenOrder.CardAvailable",
			"TRakutenOrder.DelivAddress1",
			"TRakutenOrder.DelivAddress2",
			"TRakutenOrder.DelivAddress3",
			"TRakutenOrder.DelivCustomerNm1",
			"TRakutenOrder.DelivCustomerNm2",
			"TRakutenOrder.DelivCustomerKn1",
			"TRakutenOrder.DelivCustomerKn2",
			"TRakutenOrder.DelivTelNo1",
			"TRakutenOrder.DelivTelNo2",
			"TRakutenOrder.DelivTelNo3",

			// ===== Amazon受注 =====
			"TAmazonOrder.BuyerEmail",
			"TAmazonOrder.BuyerName",
			"TAmazonOrder.BuyerPhoneNumber",
			"TAmazonOrder.RecipientName",
			"TAmazonOrder.ShipAddress1",
			"TAmazonOrder.ShipAddress2",
			"TAmazonOrder.ShipAddress3",
			"TAmazonOrder.ShipCity",
			"TAmazonOrder.ShipState",
			"TAmazonOrder.ShipPhoneNumber",

			// ===== YAHOO受注 =====
			"TYahooOrder.ShipName",
			"TYahooOrder.ShipFirstName",
			"TYahooOrder.ShipLastName",
			"TYahooOrder.ShipAddress1",
			"TYahooOrder.ShipAddress2",
			"TYahooOrder.ShipCity",
			"TYahooOrder.ShipPrefecture",
			"TYahooOrder.ShipNameKana",
			"TYahooOrder.ShipFirstNameKana",
			"TYahooOrder.ShipLastNameKana",
			"TYahooOrder.ShipAddress1Kana",
			"TYahooOrder.ShipAddress2Kana",
			"TYahooOrder.ShipCityKana",
			"TYahooOrder.ShipPrefectureKana",
			"TYahooOrder.ShipPhoneNumber",
			"TYahooOrder.ShipEmgPhoneNumber",
			"TYahooOrder.BillName",
			"TYahooOrder.BillFirstName",
			"TYahooOrder.BillLastName",
			"TYahooOrder.BillAddress1",
			"TYahooOrder.BillAddress2",
			"TYahooOrder.BillCity",
			"TYahooOrder.BillPrefecture",
			"TYahooOrder.BillNameKana",
			"TYahooOrder.BillFirstNameKana",
			"TYahooOrder.BillLastNameKana",
			"TYahooOrder.BillAddress1Kana",
			"TYahooOrder.BillAddress2Kana",
			"TYahooOrder.BillCityKana",
			"TYahooOrder.BillPrefectureKana",
			"TYahooOrder.BillPhoneNumber",
			"TYahooOrder.BillEmgPhoneNumber",
			"TYahooOrder.BillMailAddress",

			// ===== EC受注ヘッダ =====
			"TEcOrderH.OrderAddress1",
			"TEcOrderH.OrderAddress2",
			"TEcOrderH.OrderAddress3",
			"TEcOrderH.OrderCustomerNm",
			"TEcOrderH.OrderCustomerNmKana",
			"TEcOrderH.OrderTelNo",
			"TEcOrderH.DelivAddress1",
			"TEcOrderH.DelivAddress2",
			"TEcOrderH.DelivAddress3",
			"TEcOrderH.InvoiceDelivAddress1",
			"TEcOrderH.InvoiceDelivAddress2",
			"TEcOrderH.InvoiceDelivAddress3",
			"TEcOrderH.DelivCustomerNm",
			"TEcOrderH.DelivCustomerNmKana",
			"TEcOrderH.DelivTelNo",

			// ===== 出荷指示ヘッダ =====
			"TShippingInstH.SupplyCustomerNm",
			"TShippingInstH.DelivAddress1",
			"TShippingInstH.DelivAddress2",
			"TShippingInstH.DelivAddress3",
			"TShippingInstH.DelivCustomerNm",
			"TShippingInstH.DelivTelNo",

			// ===== 引当指示ヘッダ =====
			"TAllocInstH.SupplyCustomerNm",
			"TAllocInstH.DelivAddress1",
			"TAllocInstH.DelivAddress2",
			"TAllocInstH.DelivAddress3",
			"TAllocInstH.DelivCustomerNm",
			"TAllocInstH.DelivTelNo",

			// ===== 出荷ヘッダ履歴 =====
			"HShippingH.SupplyCustomerNm",
			"HShippingH.DelivAddress1",
			"HShippingH.DelivAddress2",
			"HShippingH.DelivAddress3",
			"HShippingH.DelivCustomerNm",
			"HShippingH.DelivTelNo",
	};

	private WmsGearedCipherManagerMaker() {
		// new 禁止
	}

	/**
	 * DBFlute経由での暗号化・復号化の実装クラスを生成
	 */
	public static GearedCipherManager getGearedCipherManager() {

		GearedCipherManager gcm = new GearedCipherManager();

		// フィルタ対象の列分 繰返
		for (String targetColumn : TARGET_COLUMNS) {

			String[] strs = targetColumn.split("\\.");

			String classNmDbm = new StringBuffer()
					.append("com.oneslogi.base.dbflute.bsentity.dbmeta.")
					.append(strs[0])
					.append("Dbm").toString();

			String methodNmGetInstance = "getInstance";

			String methodNmColumnInfo = new StringBuffer()
					.append("column")
					.append(strs[1]).toString();

			ColumnInfo colInfo;
			try {
				Class<?> cls = Class.forName(classNmDbm);
				Method methodGetInstance = cls.getMethod(methodNmGetInstance);

				Object obj = methodGetInstance.invoke((Object) null);
				Method methodColumn = obj.getClass().getMethod(methodNmColumnInfo);
				colInfo = (ColumnInfo) methodColumn.invoke(obj);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}

			// 列に対してのフィルタを登録
			gcm.addFunctionFilter(colInfo, new MyCipherFunctionFilter());
		}

		return gcm;
	}

	private static class MyCipherFunctionFilter implements CipherFunctionFilter {

		@Override
		public String encrypt(String value) {
			// DBのストアドファンクション(暗号化)呼出
			StringBuilder sb = new StringBuilder()
					.append("f_encrypt(")
					.append(value)
					.append(")");
			return sb.toString();
		}

		@Override
		public String decrypt(String value) {
			// DBのストアドファンクション(復号化)呼出
			StringBuilder sb = new StringBuilder()
					.append("f_decrypt(")
					.append(value)
					.append(")");
			return sb.toString();
		}
	}
}
