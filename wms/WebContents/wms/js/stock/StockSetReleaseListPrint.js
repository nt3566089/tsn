/**
 * @ngdoc overview
 * @name oneslogiWms.StockSetReleaseListPrint
 *
 * @description
 * セット解除指示書発行画面
 */

angular.module('oneslogiWms.StockSetReleaseListPrint',[])
/**
 * @ngdoc service
 * @name oneslogiWms.StockSetReleaseListPrint.service:stockSetReleaseListPrintApi
 *
 * @description
 * セット解除指示書発行発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/stockType/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/location/record ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/product/record ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/stock/stockSetReleaseListPrint/init 初期化用WebApi<br>
 * ・resources/stock/stockSetReleaseListPrint/print 発行用WebApi<br>
 */
.factory('stockSetReleaseListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama Start
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama End
		depositCustomer: AngularAPIClient.make(
			[
			 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
			 ]
		),
		stockType: AngularAPIClient.make(
			[
			 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
			 ]
		),
		location: AngularAPIClient.make(
			[
			 ['record', 'GET', 'resources/common/location/record']
			 ]
		),
		product: AngularAPIClient.make(
			[
			 ['record', 'GET', 'resources/common/product/record']
			 ]
		),
		stockSetReleaseListPrint: AngularAPIClient.make(
			[
			 ['init',  'GET', 'resources/stock/stockSetReleaseListPrint/init'],
			 ['print', 'GET', 'resources/stock/stockSetReleaseListPrint/print']
			 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
 *
 * @description
 * セット解除指示書発行発行画面<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('StockSetReleaseListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'stockSetReleaseListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var oldWarehouse;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#initScreen
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// センタリストの設定
		$scope.centerList = userInfo.centerList;
		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;
		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.tmoveInstH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.searchCondition.tmoveInstH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};

		// 日付大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
        	var fromValueString = owsCommon.dateToString(fromValue);
        	var toValueString = owsCommon.dateToString(toValue);
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };

		// 日付大小チェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// ロケーション大小チェック
        $scope.fromToCheck2 = function(fromValue, toValue) {
        	var fromValueString = fromValue;
        	var toValueString = toValue;
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };

        // ロケーション大小チェック用メッセージ
		$scope.locationFromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.searchCondition.tmoveInstH.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#deferredGetStockTypeList
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.searchCondition.tmoveInstH.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#initScreenHttp
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
			[
			 // [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama Start
			 $scope.deferredGetConditionList()
			 // [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama End
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

		api.stockSetReleaseListPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.searchCondition = response.data.search;

			$scope.searchCondition.tmoveInstH.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.tmoveInstH.mcenter.centerCd= userInfo.centerCd;
			$scope.searchCondition.storeDtFrom = userInfo.systemDt;
			$scope.searchCondition.storeDtTo = userInfo.systemDt;
			// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama Start
			$scope.searchCondition.printCondition = owsCommon.getDefaultValue($scope.printConditionList);
			// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama End

			// 荷主変更後処理
			$scope.changeClient(true);
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};
	// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama Start
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
	// [ON推-品向-1033] 検索条件に発行条件を追加 2015.12.16 koyama End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#changeClient
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託と在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			// 選択肢が一つの場合は一つ目を設定
			if ($scope.depositStockTypeList.length == 1) {
				//#2621 Upd by k.cho Start
//				$scope.searchCondition.depositCd = $scope.depositStockTypeList[0].tmoveInstB.depositCd;
				$scope.searchCondition.depositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
				//#2621 Upd by k.cho End
			} else {
				$scope.searchCondition.depositCd = null;
			}
		} else {
			$scope.searchCondition.depositCd = null;
		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#productBlur
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.tmoveInstH.mclient.clientCd);
			request.productCd = productCd;

			$scope.searchCondition.mproduct.productNm = null;

			api.product.record(request).then(function(response){
				$scope.searchCondition.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.mproduct.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#showProduct
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
			clientCd: $scope.searchCondition.tmoveInstH.mclient.clientCd,
			productCd: $scope.searchCondition.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.mproduct.productCd =  selectedItem.productCd;
			$scope.searchCondition.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#showLocation
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.searchCondition.locationCdFrom;
		} else {
			inLocationCd = $scope.searchCondition.locationCdTo;
		}

		var items = {
			centerCd: $scope.searchCondition.tmoveInstH.mcenter.centerCd,
			locationCd: inLocationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.searchCondition.locationCdFrom = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.searchCondition.locationNmFrom = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.searchCondition.locationCdTo = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.searchCondition.locationNmTo = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint#locationCdBlur
	 * @methodOf oneslogiWms.StockSetReleaseListPrint.object:StockSetReleaseListPrint
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {

		// 入力されたロケーションCD
		var locationCd = "";
		if (index == 1) {
			locationCd = $scope.searchCondition.locationCdFrom;
		} else {
			locationCd = $scope.searchCondition.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.tmoveInstH.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.searchCondition.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.searchCondition.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.searchCondition.locationNmFrom = null;
			}else{
				$scope.searchCondition.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	// 発行ボタン
	$scope.issue = function() {
		var isError = $scope.searchform.$invalid;

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
			api.stockSetReleaseListPrint.print(request).then(function(response){
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
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);

