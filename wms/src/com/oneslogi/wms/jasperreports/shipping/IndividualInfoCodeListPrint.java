package com.oneslogi.wms.jasperreports.shipping;

import java.awt.image.BufferedImage;
import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.oneslogi.base.util.CU;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

/**
 * 個体情報コード一覧 JasperReports Scriptlet クラス
 */
public class IndividualInfoCodeListPrint extends JRDefaultScriptlet {

	/**
	 * <h2>ページ初期化前処理。</h2>
	 * <pre>各ページが初期化される前に呼び出されるメソッド 。</pre>
	 */
	@Override
	public void beforePageInit() throws JRScriptletException {

		String concatQrCode = (String)this.fieldsMap.get("concatQrCode").getValue();
		int concatQrCodeLength = (int) this.fieldsMap.get("concatQrCodeLength").getValue();

		this.parametersMap.get("REPORT_CONCAT_QR_CODE_IMAGE1")
				.setValue(this.createQrCodeImage(concatQrCode, 0, 2, concatQrCodeLength)); // 1枚目
		this.parametersMap.get("REPORT_CONCAT_QR_CODE_IMAGE2")
				.setValue(this.createQrCodeImage(concatQrCode, 1, 2, concatQrCodeLength)); // 2枚目
		this.parametersMap.get("REPORT_CONCAT_QR_CODE_IMAGE3")
				.setValue(this.createQrCodeImage(concatQrCode, 2, 2, concatQrCodeLength)); // 3枚目

		super.beforePageInit();
	}

	/**
	 * <h2>パリティ計算処理。</h2>
	 * <pre>パリティ計算を行うメソッド。</pre>
	 */
	private byte calcParity(byte[] data) {
		byte parity;

		parity = data[0];
		for (int i = 1; i < data.length; i++)
			parity = (byte) (parity ^ data[i]);//XOR

		return parity;
	}

	/**
	 * <h2>連結QRコード作成処理。</h2>
	 * <pre>連結QRコードの作成を行い、画像変換してから返す処理。</pre>
	 *
	 * @param qrCodeString コード
	 * @param page ページ数(0,1,2 ...)
	 * @param totalpage 総ページ数
	 * @param length コードから取り出す長さ
	 * @return 連結QRコードの画像
	 */
	private BufferedImage createQrCodeImage(String qrCodeString, int page, int totalpage, int length) {

		// ブランクの場合、null を返す
		if (CU.isNullOrEmpty(qrCodeString))
			return null;

		// 変換：文字列→バイト配列
		byte[] qrCodeBytes = qrCodeString.getBytes();

		// パリティ計算
		int parity = this.calcParity(qrCodeBytes);

		Map<EncodeHintType, Object> hints = new EnumMap<>(EncodeHintType.class);
		hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		hints.put(EncodeHintType.CHARACTER_SET, "ISO-8859-1");
		hints.put(EncodeHintType.MARGIN, 0);

		QRCodeWriter writer = new QRCodeWriter();

		int width = 100; // 幅
		int height = 100; // 高さ
		try {
			byte partbuff[] = new byte[length];
			System.arraycopy(qrCodeBytes, length * page, partbuff, 0, length);
			String contents = new String(partbuff, "ISO-8859-1");

			// 連結QRコードの作成
			BitMatrix matrix = writer.encode_sa((byte) (page & 0xff), (byte)totalpage,
					parity, contents, BarcodeFormat.QR_CODE, width, height, hints);

			// 画像変換
			BufferedImage image = MatrixToImageWriter.toBufferedImage(matrix);

			return image;

		} catch (UnsupportedEncodingException e) {
			// エラーの場合、null を返す
			e.printStackTrace();
			return null;
		} catch (WriterException e) {
			// エラーの場合、null を返す
			e.printStackTrace();
			return null;
		}
	}

}
