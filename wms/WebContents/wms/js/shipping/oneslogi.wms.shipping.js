angular.module('oneslogiWms.Shipping',
		[
		'oneslogiWms.PackingListUpdate',
		'oneslogiWms.PieceShippingInspect',
		'oneslogiWms.PieceShippingInspectBox',
		'oneslogiWms.PieceShippingInspectSu',
		// [#5115][v3.1] 単行出荷検品 追加 2018.07.09 Fujiwara Add Start
		'oneslogiWms.SingleRowShippingInspect',
		'oneslogiWms.ModalLargeErrorDialog',
		'oneslogiWms.ModalLargeWarnDialog',
		'oneslogiWms.ModalLargeWorkInstNum',
		// [#5115][v3.1] 単行出荷検品 追加 2018.07.09 Fujiwara Add End
		'oneslogiWms.ShippingPlanInput',
		'oneslogiWms.DeliveryCourseShippingList',
		'oneslogiWms.ProductShippingList',
		// [Ver3.0][#3136] 商品別出荷一覧（参照）追加 2017.12.11 Shimizu Add Start
		'oneslogiWms.ReferenceProductShippingList',
		// [Ver3.0][#3136] 商品別出荷一覧（参照）追加 2017.12.11 Shimizu Add End
		'oneslogiWms.ShippingInputNoPlan',
		'oneslogiWms.ShippingInstDetail',
		'oneslogiWms.ShippingWorkRefUpdate',
		'oneslogiWms.DeliverySlipListPrint',
		'oneslogiWms.StwListPrint',
		'oneslogiWms.ShippingInstList',
		'oneslogiWms.ShippingConfirmList',
		//  米国出荷ドキュメント追加対応 2018.01.05 PYM Start
		'oneslogiWms.ShippingConfirmListCarrierTraceNum',
		'oneslogiWms.BillOfLadingPrint',
		//  米国出荷ドキュメント追加対応 2018.01.05 PYM End
		'oneslogiWms.ShippingUpdate',
		'oneslogiWms.PickingListPrint',
		'oneslogiWms.ShippingPlanBulkInput',
		'oneslogiWms.ShippingLotList',
		'oneslogiWms.ShippingTagDataOutput',
		'oneslogiWms.ShippingStatusProgress',
		'oneslogiWms.PackingList',
		// 履歴検索 出荷履歴画面新規作成 2016.7.6 Linn Linn Add Start
		'oneslogiWms.ShippingHistory',
		// 履歴検索 出荷履歴画面新規作成 2016.7.6 Linn Linn Add End
		// 履歴検索 梱包履歴画面新規作成 2016.6.20 Myo Min Oo Add Start
		'oneslogiWms.PackingHistory',
		// 履歴検索 梱包履歴画面新規作成 2016.6.20 Myo Min Oo Add End
		// [#5105][v3.1] ピッキング提案画面新規作成 2018.7.10 Fujiwara Add Start
		'oneslogiWms.PickingMethodRecommendation',
		// [#5105][v3.1] ピッキング提案画面新規作成 2018.7.10 Fujiwara Add End
		// [#5106][v3.1] ピッキング提案明細画面新規作成 2018.7.11 Fujiwara Add Start
		'oneslogiWms.PickingMethodRecommendationDetail'
		// [#5106][v3.1] ピッキング提案明細画面新規作成 2018.7.11 Fujiwara Add End
		//【TSN KGL030301_保税出庫関連リスト出力】 2024.02.26 K.SATO ADD [S]
		,'oneslogiWms.BondedShippingRelationListPrint'
		//【TSN KGL030301_保税出庫関連リスト出力】 2024.02.26 K.SATO ADD [E]
		//【TSN KGL030308_保税出庫関連リスト再出力】 2024.04.11 K.SATO ADD [S]
		,'oneslogiWms.PickingListRePrint'
		//【TSN KGL030308_保税出庫関連リスト再出力】 2024.04.11 K.SATO ADD [E]
		//配車実績入力画面新規作成 2024.05.20 LSC Add [S]
                                ,'oneslogiWms.ReplenishInstBulkInput'
		,'oneslogiWms.DispatchRecordInput'
		,'oneslogiWms.DispatchRecordInputEdit'
		//配車実績入力画面新規作成 2024.05.20 LSC Add [E]		
		 ]
)
// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana Start
// 出荷 共通関数
.factory('wmsShipCommon', ['$filter', 'owsCommon', function($filter, owsCommon) {
	return {
		/**
		 * @ngdoc method
		 * @name oneslogiWms.Shipping:wmsShipCommon#getClassForRow
		 * @methodOf oneslogiWms.Shipping:wmsShipCommon
		 *
		 * @description グリッドの明細行の色を取得
		 *
		 * @param {object} rowInfo 明細行情報
		 * 					--> rowInfo.shippingStatus 出荷ステータス
		 * 					--> rowInfo.shippingStopFlg 出荷停止フラグ
		 * 					--> rowInfo.emergencyFlg 緊急フラグ
		 * 					--> rowInfo.stockOutFlg 欠品フラグ
		 * @returns {string} グリッドの明細行の色 (css)
		 */
		getClassForRow: function(rowInfo) {

			var rowClass;

			// 出荷停止
			var isStop = false;
			if (rowInfo.shippingStopFlg === '1') {
				isStop = true;
			}

			switch (rowInfo.shippingStatus) {
			case "10":
			case "20":
				if (isStop) {
					// 出荷停止 引当禁止
					rowClass = "wmslegendindianred";
				} else {
					// 未出荷
					rowClass = "wmslegendwhite";
				}
				break;
			case "15": // 出庫指示中
				rowClass = "wmslegendorange";
				break;
			case "25":
			case "30":
			case "35":
			case "40":
			case "45":
				if (isStop) {
					// 出荷停止 引当禁止
					rowClass = "wmslegendindianred";
				} else {
					// 出庫指示済
					rowClass = "wmslegendlightblue";
				}
				break;
			case "50":
				if (isStop) {
					// 出荷停止 引当禁止
					rowClass = "wmslegendindianred";
				} else {
					// 出荷検品済
					rowClass = "wmslegendaqua";
				}
				break;
			case "55":
				if (isStop) {
					// 出荷停止 引当禁止
					rowClass = "wmslegendindianred";
				} else {
					// 出荷確定済
					rowClass = "wmslegendturquoise";
				}
				break;
			case "90":
				// キャンセル
				rowClass = "wmslegenddarkgray";
				break;
			case "99":
				// エラー有
				rowClass = "wmslegendpink";
				break;
			}

			if (rowInfo.emergencyFlg === "1") {
				// 緊急
				rowClass = rowClass + " wmslegendcolorred";
			} else if (rowInfo.stockOutFlg === '1') {
				// 欠品

				if (!isStop) {
					// 出荷停止以外
					rowClass = rowClass + " wmslegendblue";
				}
			}

			return rowClass;
		},
		/**
		 * @ngdoc method
		 * @name oneslogiWms.Shipping:wmsShipCommon#getClassForRowNonStatus
		 * @methodOf oneslogiWms.Shipping:wmsShipCommon
		 *
		 * @description グリッドの明細行の色を取得(出荷ステータス無)
		 *
		 * @param {object} rowInfo 明細行情報
		 * 					--> rowInfo.shippingStopFlg 出荷停止フラグ
		 * 					--> rowInfo.stockOutFlg 欠品フラグ
		 * @returns {string} グリッドの明細行の色 (css)
		 */
		getClassForRowNonStatus: function(rowInfo) {

			// 出荷停止＋欠品 の場合は 出荷停止のみ設定

			if (rowInfo.shippingStopFlg === '1') {
				// 出荷停止
				return 'wmslegendindianred';
			}

			if (rowInfo.stockOutFlg === '1') {
				// 欠品
				return 'wmslegendblue';
			}

			// 通常
			return '';
		},
		/**
		 * @ngdoc method
		 * @name oneslogiWms.Shipping:wmsShipCommon#getStockOutFlgByNum
		 * @methodOf oneslogiWms.Shipping:wmsShipCommon
		 *
		 * @description 欠品数から欠品フラグの取得
		 *
		 * @param {number} stockOutNum 欠品数
		 * @returns {string} グリッドの明細行の色 (css)
		 */
		getStockOutFlgByNum: function(stockOutNum) {

			if (!stockOutNum) {
				// 欠品数未設定 => 欠品なし
				return '0';
			}

			if (owsCommon.isPositive(stockOutNum)) {
				// 0 < 欠品数
				return '1';
			}

			return '0';
		},
	};
}])
// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana End
;