/**
 * @ngdoc overview
 * @name oneslogiWms.DeliverySlipListPrint
 *
 * @description
 * 納品明細発行画面
 */

angular.module('oneslogiWms.DeliverySlipListPrint',[])

/**
 * @ngdoc service
 * @name oneslogiWms.DeliverySlipListPrint.service:deliverySlipListPrintApi
 *
 * @description
 * 	納品明細発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList取得データを発行区分操作用WebApi<br>
 * ・resources/shipping/deliverySlipListPrint/init 初期化用WebApi<br>
 * ・resources/receive/storeLabelPrint/print 検索用WebApi<br>
 */
.factory('deliverySlipListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		deliverySlipListPrint: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/shipping/deliverySlipListPrint/init'],
				 ['print', 'GET', 'resources/shipping/deliverySlipListPrint/print'],
				 //  米国出荷ドキュメント追加対応 2018.01.08 PYM Start
                 ['getReportId', 'GET', 'resources/shipping/deliverySlipListPrint/getReportId'],
				 ['printPackingSlip', 'GET', 'resources/shipping/packingSlipListPrint/printPackingSlip']
				 //  米国出荷ドキュメント追加対応 2018.01.08 PYM End
				 ]
		),
		deliveryCustomer: AngularAPIClient.make(
				[
				 ['record',  'GET', 'resources/common/deliveryCustomer/record'],
				 ]
		)
	};
}])
.controller('DeliverySlipListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'deliverySlipListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// 画面初期化処理
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetConditionList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.deliverySlipListPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.search;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.tallocInstH.shippingDt = userInfo.systemDt;
			$scope.searchCondition.printCondition = owsCommon.getDefaultValue($scope.printConditionList);

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliverySlipListPrint.object:DeliverySlipListPrint#showVendor
	 * @methodOf oneslogiWms.DeliverySlipListPrint.object:DeliverySlipListPrint
	 *
	 * @description
	 * 納品先検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showVendor = function(){
		//納品先のモーダル画面を表示
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.supplyCustomerCd
			};
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.tallocInstH.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.tallocInstH.supplyCustomerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliverySlipListPrint.object:DeliverySlipListPrintt#customerCdBlur
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 納品先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseBlur = function() {

		// 入力された納品先コードを取得
		var supplyCustomerCd = $scope.searchCondition.tallocInstH.supplyCustomerCd;

		if(supplyCustomerCd && 0 < supplyCustomerCd.length) {

			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = supplyCustomerCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.supplyCustomerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.supplyCustomerNm = null;
		}
	};

	// 発行条件プルダウンデータ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.printConditionList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// SLSA対応ソースマージ対応 2018.03.08 kawana Start

	// 発行ボタン
	$scope.issue = function() {

		// ※ SLSA対応で動作が変わってしまったので緊急対応(暫定対応)で
		//    変更前の動作になるようにif(false)を使用
		if (false) {
			// 米国用の納品明細
			$scope.printCultureEn();

		} else {
			// 通常の納品明細
			$scope.print();
		}
	};

	// 通常の納品明細発行
	$scope.print = function() {

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			request.data = {};
			request.data.search = $scope.searchCondition;
			request.printBasicData = printParam.printBasicData;

			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.deliverySlipListPrint.print(request).then(function(response){
				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// 正常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー表示
						subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
					}
				} else {
					// 異常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー閉じる
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				}
				// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana Start
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
				// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana End
			});
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};

	// 米国用の納品明細発行
	$scope.issueCultureEn = function() {

		//  米国出荷ドキュメント追加対応 2018.01.08 PYM Start
		var reportId;
		var reportCd = "DeliverySlipList";

		api.deliverySlipListPrint.getReportId().then(function(response){
			$scope.listReportId = response;
			reportId = response[0];
			// プリンタ選択画面を表示
			var request = {};
			request.reportId = reportId;
			request.userId = null;
			request.reportLayoutData = null;
			request.subrepLayoutData = null;
			request.groupCd = null;
			request.printerNm = null;
			request.trayInfo = null;
			request.trayNm = null;
			request.caltureId = null;
			request.printType = null;
			request.outputType = null;
			request.reportLayoutId = null;
			request.reportLayoutVersion = null;
			request.subrepLayoutId = null;
			request.printerAttributeId = null;
			request.printNum = null;
			request.confirmPrintDia = null;
			request.sheetCollate = null;
			request.printerId = null;
			request.outputData = null;
			//  米国出荷ドキュメント追加対応 2018.01.08 PYM End

			// プリンタ選択画面を表示
			//  米国出荷ドキュメント追加対応 2018.01.08 PYM Del
			//  米国出荷ドキュメント追加対応 2018.01.08 PYM Start
			var modalInstance = printFactory.modalPrint(request);
			//  米国出荷ドキュメント追加対応 2018.01.08 PYM End

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.search = $scope.searchCondition;
				//  米国出荷ドキュメント追加対応 2018.01.08 PYM Del
				//  米国出荷ドキュメント追加対応 2018.01.08 PYM Start
				request.printBasicData = printParam.printBasicData;
				//  米国出荷ドキュメント追加対応 2018.01.08 PYM End

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 米国出荷ドキュメント追加対応 2018.01.08 PYM Start
				// PackingSlipList発行
				api.deliverySlipListPrint.printPackingSlip(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							if (0 < response.output.listDownloadUrl.length) {
								// 複数帳票用にダウンロードURL格納
								var listDownloadUrl = response.output.listDownloadUrl;
								subWindow = owsCommon.viewPdf(subWindow, listDownloadUrl.shift());
								while (0 < listDownloadUrl.length) {
									owsCommon.viewPdf(null, listDownloadUrl.shift());
								}
							} else {
								// プレビュー表示
								subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							}
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
						return
					}
					if ($scope.listReportId.length > 0) {
						successPrintFunc("PackingSlipList");
					}
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
			// 米国出荷ドキュメント追加対応 2018.01.08 PYM End
			});
		});
		// 米国出荷ドキュメント追加対応 2018.01.08 PYM End
	}

	// SLSA対応ソースマージ対応 2018.03.08 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);
