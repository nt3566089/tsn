package com.oneslogi.wms.resources.ecorder;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.oneslogi.wms.dto.ecorder.EcDelivAddressModifyDto;
import com.oneslogi.wms.resources.AbstractWmsResource;

/**
 * 住所変更画面のリソースクラス。
 */
@Path("/ecorder/ecDelivAddressModify")
public class EcDelivAddressModifyResource  extends AbstractWmsResource {

	// ===== 定数定義 =====

		/**
		 * ステータスコード定義
		 */
		protected static class StatusCode {
			/**
			 * 正常終了
			 */
			protected static final int SUCCESS = 0;
			/**
			 * ユーザによる確認
			 */
			protected static final int CONFIRMATION = 1;
		}

		// ===== メンバ変数 =====
		/**
		 * <h2>初期処理。</h2>
		 * <pre>
		 * ・画面用DTOの作成
		 * </pre>
		 * @return EcDelivAddressModifyDto 住所変更画面用DTO
		 */
		@GET
		@Path("/init")
		public EcDelivAddressModifyDto init() {
			// 画面用DTO作成
			EcDelivAddressModifyDto ecDelivAddressModifyDto = new EcDelivAddressModifyDto();

			return ecDelivAddressModifyDto;
		}
}
