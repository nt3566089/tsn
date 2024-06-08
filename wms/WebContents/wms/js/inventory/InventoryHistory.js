/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryHistory
 *
 * @description
 * 棚卸履歴画面
 */
angular.module('oneslogiWms.InventoryHistory',[])

/**
 * @ngdoc service
 * @name oneslogiWms.InventoryHistory.service:inventoryHistoryApi
 *
 * @description
 * 棚卸履歴WebApi定義<br>
 * ・resources/common/warehouseCd/keyValueList 倉庫データ取得用WebApi<br>
 * ・resources/common/supplierCustomer/record 仕入先CDデータ取得用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託データ取得用WebApi<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得用WebApi<br>
 * ・resources/common/product/record 商品CDデータ取得用WebApi<br>
 * ・resources/inventory/inventoryHistory/init 通常画面用初期データ取得用WebApi<br>
 * ・resources/inventory/inventoryHistory/search 検索用WebApi<br>
 *
 */
.factory('inventoryHistoryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		warehouseList: AngularAPIClient.make(
				[
				 	['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
                ]
		),
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),
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
		product: AngularAPIClient.make(
				[
					['record', 'GET', 'resources/common/product/record']
				]
		),
		inventoryHistory: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/inventory/inventoryHistory/init'],
					['search', 'GET', 'resources/inventory/inventoryHistory/search'],
					['excel',  'GET', 'resources/inventory/inventoryHistory/search', 'excel']
				]
		),
		//荷主センタ変更対応 201７.02.13 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.13 sja End

		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		)
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryHistory.object:InventoryHistory
 *
 * @description
 * 棚卸履歴画面コントローラ
 */
.controller('InventoryHistory', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'inventoryHistoryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.bodyListCols =
	[
	 	{field:"hinventoryH.histDt", displayName:"履歴日"},
		{field:"hinventoryH.inventoryDt", displayName:"棚卸日"},
		{field:"hinventoryH.batchNum", displayName:"バッチNo．"},
		{field:"locationCd", displayName:"ロケーションCD"},
		{field:"locationNm", displayName:"ロケーション名称"},
		{field:"productCd", displayName:"商品CD"},
		{field:"productNm", displayName:"商品名称"},
		{field:"inventoryNum", displayName:"棚卸数"},
		{field:"chargeNum", displayName:"引当可能数"},
		{field:"allocNum", displayName:"引当済数"},
		{field:"moveNum", displayName:"移動中数"},
		{field:"unitNum", displayName:"入数"},
		{field:"lot", displayName:"ロット"},
		{field:"limitDt", displayName:"期限日"},
		{field:"storeLabelNo", displayName:"入庫ラベルNo."},
		{field:"storeDt", displayName:"入庫日"},
		{field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
		{field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		{field:"depositCd", displayName:"預託CD"},
		{field:"depositNm", displayName:"預託名称"},
		{field:"supplierCd", displayName:"仕入先CD"},
		{field:"supplierNm", displayName:"仕入先名称"},
		{field:"warehouseCd", displayName:"倉庫CD"},
		{field:"warehouseNm", displayName:"倉庫名称"},
		{field:"inputType", displayName:"入力区分"},
		{field:"stockAdjustFlg", displayName:"在庫調整フラグ"},
     	//荷主センタ変更対応 201７.02.21 sja End
        {field:"hinventoryH.clientCd", displayName:"荷主CD"},
        {field:"hinventoryH.clientNm", displayName:"荷主名称"},
        {field:"hinventoryH.centerCd", displayName:"センタCD"},
        {field:"hinventoryH.centerNm", displayName:"センタ名称"}
    	//荷主センタ変更対応 201７.02.21 sja End
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#initScreen
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'bodyList',
			columnDefs: 'bodyListCols',
			pagingOptions : $scope.pagingOptions
		});

		//荷主センタ変更対応 201７.02.13 sja Start
		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
		};
		$scope.centerChange = function() {
			// 倉庫リスト変更（同期処理）
			$scope.deferredGetWarehouseCdList();
		};
		//荷主センタ変更対応 201７.02.13 sja End

        // 日付大小チェック
        $scope.fromToDtCheck = function(fromValue, toValue) {
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
        $scope.fromToMessage2 = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#deferredGetWarehouseList
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		var centerCd = userInfo.centerCd;

		request.centerId = userInfo.centerIdByCd(centerCd);

		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
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
	 	//荷主センタ変更対応 201７.02.13 sja Start
//		request.clientCd = userInfo.clientCd;
		if ($scope.headH) {
			request.clientCd = $scope.headH.clientCd;
		} else {
			request.clientCd = userInfo.clientCd;
		}
	 	//荷主センタ変更対応 201７.02.13 sja End
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositStockTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
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
		request.clientCd = userInfo.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			$scope.StockTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#initScreenHttp
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {

		//全通信終了後に以下関数で各種設定を実行
		$q.all(
			[
			 	$scope.deferredGetWarehouseList(), // 倉庫
			 	$scope.deferredGetDepositStockTypeList(), // 預託
			 	$scope.deferredGetStockTypeList(),// 在庫区分
			 	//荷主センタ変更対応 201７.02.13 sja Start
			 	$scope.deferredGetWarehouseCdList()
			 	//荷主センタ変更対応 201７.02.13 sja End
			]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#deferredGetInitData
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 棚卸履歴初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.inventoryHistory.init().then(function(response){

			$scope.paging = response.paging;

			$scope.headH = response.data.head;
			$scope.headB = response.data.body;
			$scope.bodyList = response.data.bodyList;
			$scope.historyData = response.data;
			$scope.headH.clientCd = userInfo.clientCd;
			$scope.headH.centerCd = userInfo.centerCd;
			$scope.headH.inventoryDtFrom = userInfo.beforeSystemDt; // 棚卸日(From)
			$scope.headH.inventoryDtTo = userInfo.beforeSystemDt; // 棚卸日(To)

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.historyData = owsHistory.popState();
				$scope.headH = $scope.historyData.head;
				$scope.headB = $scope.historyData.body;
				$scope.search();
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();

		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.13 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.headH) {
			request.centerId = userInfo.centerIdByCd($scope.headH.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.13 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#productBlur
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.headB.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.productCd = productCd;

			$scope.headB.productNm = null;

			api.product.record(request).then(function(response){
				$scope.headB.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.headB.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#showProduct
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
			clientCd: $scope.headH.clientCd,
			productCd: $scope.headB.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.headB.productCd =  selectedItem.productCd;
			$scope.headB.productNm =  selectedItem.productNm;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#customerCdBlur
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 仕入先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された仕入先コードを取得
		var customerCd = $scope.headB.supplierCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.headB.supplierNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.headB.supplierNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#showCustomer
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var items = {
				clientCd: $scope.headH.clientCd,
				vendorCd: $scope.headB.supplierCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.headB.supplierCd = selectedItem.customerCd;
			$scope.headB.supplierNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#showLocation
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		// 入力されたロケーションCD
		var locationCd;
		if (index == 1) {
			locationCd = $scope.headB.locationCdFrom;
		} else {
			locationCd = $scope.headB.locationCdTo;
		}
		var items = {
			centerCd: $scope.headH.centerCd,
			locationCd: locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.headB.locationCdFrom = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.headB.locationNmFrom = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}else{
				$scope.headB.locationCdTo = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.headB.locationNmTo = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#locationCdBlur
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
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
			locationCd = $scope.headB.locationCdFrom;
		} else {
			locationCd = $scope.headB.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.headH.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.headB.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.headB.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.headB.locationNmFrom = null;
			}else{
				$scope.headB.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#excelOutput
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head =$scope.headH;
		request.data.body = $scope.headB;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);

		api.inventoryHistory.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#search
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#getPagingData
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.headH;
		request.data.body = $scope.headB;
		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.inventoryHistory.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistory.object:InventoryHistory#setPagingData
	 * @methodOf oneslogiWms.InventoryHistory.object:InventoryHistory
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.bodyList = response.data.bodyList;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;//トータル件数を設定
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.historyData);
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);