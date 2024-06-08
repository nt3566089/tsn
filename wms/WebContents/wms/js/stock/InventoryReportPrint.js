/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryReportPrint
 *
 * @description
 * 在庫調査関連リスト出力画面
 */
angular.module('oneslogiWms.InventoryReportPrint',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryReportPrint.service:InventoryReportPrintApi
 *
 * @description
 * 在庫調査関連リスト出力WebApi<br>
 * ・resources/stock/inventoryReportPrint/init   画面用初期データ取得<br>
 * ・resources/stock/inventoryReportPrint/register   出力帳票データ作成<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/stockType/keyValueList  在庫区分データ取得<br>
 * ・resources/common/location/record  ロケーションデータ取得<br>
 *
 */
.factory('InventoryReportPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		product: AngularAPIClient.make(
			[
				['record', 'GET', 'resources/common/product/record']
				]
		),
		mainList: AngularAPIClient.make(
			[
			 ['init',  'GET', 'resources/stock/inventoryReportPrint/init'],
			 ['register', 'POST', 'resources/stock/inventoryReportPrint/register'],
			 ['getReport', 'GET', 'resources/stock/inventoryReportPrint/getReport']
			]
		),
		inventoryReportList:AngularAPIClient.make(
			[
				['print', 'GET', 'resources/stock/inventoryReportList/print']
				]
		),
		goodItemDiffReportList:AngularAPIClient.make(
			[
				['print', 'GET', 'resources/stock/goodItemDiffReportList/print']
				]
		),
		noGoodItemDiffReportList:AngularAPIClient.make(
			[
				['print', 'GET', 'resources/stock/noGoodItemDiffReportList/print']
				]
		),
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryReportPrint.object:InventoryReportPrint
 *
 * @description
 * 在庫調査関連リスト出力画面コントローラ
 */
.controller('InventoryReportPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'InventoryReportPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryReportPrint.object:InventoryReportPrint#initScreen
	 * @methodOf oneslogiWms.InventoryReportPrint.object:InventoryReportPrint
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		//検索条件枠を開いた状態に設定
		$scope.isopen= true;
		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;
		//過不足報告場所非可选
		directiveControl.editable($scope, 'diffoccarea', false);
		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryReportPrint.object:InventoryReportPrint#initScreenHttp
	 * @methodOf oneslogiWms.InventoryReportPrint.object:InventoryReportPrint
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {
		// 条件付き必須項目の初期化
		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
			[
			 // 出力帳票データ取得
			 $scope.inventoryReportList(),
			 // 内外区分データ取得
			 $scope.inoutkbnList(),
			 // 過不足発生場所データ取得
			 $scope.diffoccareaList(),
			 // CAP製品データ取得 
			 $scope.capitemflgList(),
			 // アンマッチ有データ取得
			 $scope.unmatchList(),
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

		api.mainList.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.searchCondition;
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.inventoryReport = $scope.inventoryReportList[0].classCd;
			$scope.searchCondition.executedate = userInfo.systemDt;
			$scope.searchCondition.inoutkbn = $scope.inoutkbnList[0].classCd;
			$scope.searchCondition.capitemflg = $scope.capitemflgList[0].classCd;
			$scope.searchCondition.unmatch = $scope.unmatchList[0].classCd;
			
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryReportPrint.object:InventoryReportPrint#itemCdBlur
	 * @methodOf oneslogiWms.InventoryReportPrint.object:InventoryReportPrint
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.itemCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.itemcd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryReportPrint.object:InventoryReportPrint#showProduct
	 * @methodOf oneslogiWms.InventoryReportPrint.object:InventoryReportPrint
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showitem = function(){

		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				productCd: $scope.searchCondition.itemcd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.itemcd = selectedItem.productCd;
			$scope.searchCondition.productId = selectedItem.productId;
		});
	};
	// 出力帳票と内外区分を変更した時
	$scope.dataInventoryReportAndInoutkbnChange = function(){
			
		var inventoryReport=$scope.searchCondition.inventoryReport;
		var inoutkbn=$scope.searchCondition.inoutkbn;
			
		// 出力帳票が"不適品過不足報告書"、かつ内外区分が”輸入”の場合、過不足報告場所は活性です。
		if(inventoryReport == '02' && inoutkbn == '0001'){
			directiveControl.editable($scope, 'diffoccarea', true);
		}else{
			$scope.searchCondition.diffoccarea =  null;
			directiveControl.editable($scope, 'diffoccarea', false);
		}
		// 出力帳票が"在庫調査表"の場合、銘柄CDとCAP製品とアンマッチ有は活性です。
		if(inventoryReport == '00'){
			directiveControl.editable($scope, 'itemcd', true);
			directiveControl.editable($scope, 'capitemflg', true);
			directiveControl.editable($scope, 'unmatch', true);
		}else{
			$scope.searchCondition.itemcd =  null;
			$scope.productNm =  null;
			directiveControl.editable($scope, 'itemcd', false);
			$scope.searchCondition.capitemflg =  $scope.capitemflgList[0].classCd
			directiveControl.editable($scope, 'capitemflg', false);
			$scope.searchCondition.unmatch =  $scope.capitemflgList[0].classCd
			directiveControl.editable($scope, 'unmatch', false);
		}
	}

	// 出力帳票データ取得
	$scope.inventoryReportList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_REPORT";

		api.dropdownList.query(request).then(function(response){
			$scope.inventoryReportList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// 内外区分データ取得
	$scope.inoutkbnList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "FCFLG";

		api.dropdownList.query(request).then(function(response){
			$scope.inoutkbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// 過不足発生場所データ取得
	$scope.diffoccareaList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INADEQUACYAREA";

		api.dropdownList.query(request).then(function(response){
			$scope.diffoccareaList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// CAP製品データ取得 
	$scope.capitemflgList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CAPSELECT";

		api.dropdownList.query(request).then(function(response){
			$scope.capitemflgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// アンマッチ有データ取得
	$scope.unmatchList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UNMATCH";

		api.dropdownList.query(request).then(function(response){
			$scope.unmatchList	 = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//在庫照合指示ボタン
	$scope.stockAdjustInst = function(){
		//1.1. 画面より渡されたデータを取得
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

		//1.2. ポップアップ画面を表示
		if (!owsCommon.viewConfirm("dataUpdateConfirmation")) {
			//イベントを中止
			return;
		}
		//「2.登録処理」を実施
		api.mainList.register(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchForm')) {
				return;
			}
		})
	}

	
	// 発行ボタン
	$scope.issue = function() {
		// 1.事前画面データチェック処理
		// 1.1. 処理前チェック(クライアント)
		// (1) 出力帳票が"不適品過不足報告書"、かつ内外区分が”輸入”の場合、過不足報告場所の活性及び必須チェックを行う
		if(($scope.searchCondition.inventoryReport == '02' && $scope.searchCondition.inoutkbn == '0001') && !$scope.searchCondition.diffoccarea){
			alertMessage.setErrorMessageByCode("diffoccareaRequireError");
			return;
		}
		var reportId;
		var request = {};
		var listBody = [];
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;
		api.mainList.getReport(request).then(function(response){
			reportId = response.printBasicData.reportId;
			$scope.printParam.reportId = reportId;
			// プリンタ選択画面を表示
			var modalInstance = printFactory.modalPrint($scope.printParam);
			
			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){

				request.printBasicData = printParam.printBasicData;
				
				//このフィールドを使いましょう
				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}
				
				// 発行  出力帳票は'00'の場合
				if($scope.searchCondition.inventoryReport == '00'){
					api.inventoryReportList.print(request).then(function(response){
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
					}).catch(function(response){
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					});
				}
				// 発行  出力帳票は'01'の場合
				if($scope.searchCondition.inventoryReport == '01'){
					api.goodItemDiffReportList.print(request).then(function(response){
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
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
				}
				// 発行  出力帳票は'02'の場合
				if($scope.searchCondition.inventoryReport == '02'){
					api.noGoodItemDiffReportList.print(request ).then(function(response){
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
					}).catch(function(response){
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					});
				}
			});
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);