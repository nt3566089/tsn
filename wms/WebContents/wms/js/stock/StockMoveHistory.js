/**
 * @ngdoc overview
 * @name oneslogiWms.StockMoveHistory
 *
 * @description
 * 在庫移動履歴画面
 */
angular.module('oneslogiWms.StockMoveHistory',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockMoveHistory.service:stockMoveHistoryApi
 *
 * @description
 * 在庫移動履歴WebApi定義<br>
 * ・resources/stock/stockMoveHistory/init 初期処理WebApi<br>
 * ・resources/stock/stockMoveHistory/search 検索処理WebApi<br>
 * ・resources/stock/stockMoveHistory/excelOutput EXCEl出力WebApi<br>
 * ・resources/common/processType/keyValueList 処理区分データ取得<br>
 * ・resources/common/centerClass/keyValueList 入出庫区分データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/warehouseCd/keyValueList 倉庫データ取得用WebApi<br
 * ・resources/common/location/record ロケーションデータ取得<br>
 * ・resources/common/depositCustomer/keyValueList 預託区分取得<br>
 *
 */
.factory('stockMoveHistoryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
				[
				 ['keyValueList2', 'GET', 'resources/common/processType/keyValueList2']
				 ]
		),
		inoutType: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		warehouseList: AngularAPIClient.make(
				[
				 	['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
                ]
		),
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		stockMoveHistory: AngularAPIClient.make([
		                                      ['init',             'GET',  'resources/stock/stockMoveHistory/init'],
		                                      ['search',           'GET',  'resources/stock/stockMoveHistory/search'],
		                                      ['excel',            'GET',  'resources/stock/stockMoveHistory/search', 'excel']
		                                     ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockMoveHistory.service:stockMoveHistory
 * @description
 * 在庫移動履歴画面コントローラ
 */
.controller('StockMoveHistory', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'printFactory', 'stockMoveHistoryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, printFactory, api) {

	var oldWarehouse;

	// 在庫移動履歴グリッドの列情報（デザイン用）
	$scope.stockMoveHistoryGridCols =
		[
		 	//荷主センタ変更対応 2017.02.16 sja Start
		 	{field:"tmoveInstH.mclient.clientCd", displayName:"荷主"},
		 	{field:"tmoveInstH.mclient.clientNm", displayName:"荷主名称"},
		 	{field:"tmoveInstH.mcenter.centerCd", displayName:"センタ"},
		 	{field:"tmoveInstH.mcenter.centerNm", displayName:"センタ名称"},
		 	//荷主センタ変更対応 2017.02.16 sja End
		    {field:"hmoveH.histDt", displayName:"履歴日"},
		    {field:"hmoveH.mprocessType.processTypeCd", displayName:"処理区分CD"},
		    {field:"hmoveH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
		    {field:"inoutType", displayName:"入出庫区分"},
		    {field:"moveDt", displayName:"移動日"},
		    {field:"moveNum", displayName:"在庫移動実績数"},
		    {field:"hstock.warehouseCd", displayName:"倉庫CD"},
		    {field:"hstock.warehouseNm", displayName:"倉庫名称"},
		    {field:"hstock.productCd", displayName:"商品CD"},
		    {field:"hstock.productNm", displayName:"商品名称"},
		    {field:"hstock.productAbbr", displayName:"商品略称"},
		    {field:"hstock.janCd", displayName:"JANCD"},
		    {field:"hstock.lot", displayName:"ロット"},
		    {field:"hstock.limitDt", displayName:"期限日"},
		    {field:"hstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
		    {field:"hstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		    {field:"hstock.zoneCd", displayName:"ゾーンCD"},
		    {field:"hstock.zoneNm", displayName:"ゾーン名称"},
		    {field:"hstock.locationCd", displayName:"ロケーションCD"},
		    {field:"hstock.locationNm", displayName:"ロケーション名称"},
		    {field:"hstock.depositCd", displayName:"預託CD"},
		    {field:"hstock.depositNm", displayName:"預託名称"},
		    {field:"hstock.depositAbbr", displayName:"預託略称"},
		    {field:"hstock.storeLabelNo", displayName:"入庫ラベルNo"},
		    {field:"hstock.oldStoreLabelNo", displayName:"元入庫ラベルNo"},
		    {field:"hstock.supplierCd", displayName:"仕入先CD"},
		    {field:"hstock.supplierNm", displayName:"仕入先名称"},
		    {field:"hstock.supplierAbbr", displayName:"仕入先略称"},
		    {field:"hstock.storeDt", displayName:"入庫日"},
		    {field:"hmoveH.moveInstComment", displayName:"在庫移動指示備考"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.StockMoveHistory.service:stockMoveHistory#initScreen
     * @methodOf oneslogiWms.StockMoveHistory.service:stockMoveHistory
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {
		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// 在庫移動グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'stockMoveHistoryGrid',
			columnDefs: 'stockMoveHistoryGridCols',
			pagingOptions : $scope.pagingOptions
		});

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//荷主センタ変更対応 201７.02.16 sja Start
		// 荷主変更後処理
		$scope.clientChange = function() {
			// 預託取得・設定処理（同期可能）
			$scope.deferredGetDepositList();
		};

		//センタ変更後処理
		$scope.centerChange = function() {
			// 倉庫リストの取得・設定処理（同期可能）
			$scope.deferredGetWarehouseList();
		};
		//荷主センタ変更対応 201７.02.16 sja End

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
        $scope.fromToMessage2 = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockMoveHistory.service:stockMoveHistory#initScreenHttp
     * @methodOf oneslogiWms.StockMoveHistory.service:stockMoveHistory
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//全通信終了後に以下関数で各種設定を実行
		$q.all(
				[
				 $scope.deferredGetProcessTypeList(),
				 $scope.deferredGetInoutType(),
				 $scope.deferredGetStockTypeList(),
				 $scope.deferredGetWarehouseList(),
				 $scope.deferredGetDepositList()
				 ]

		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.service:stockMoveHistory#deferredGetInitData
	 * @methodOf oneslogiWms.StockMoveHistory.service:stockMoveHistory
	 *
	 * @description
	 * 在庫移動履歴初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockMoveHistory.init().then(function(response){
			$scope.head = response.data.head;
			$scope.stockMoveHistoryGrid = response.data.list;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.hstock.centerCd = userInfo.centerCd;
			$scope.head.hstock.clientCd = userInfo.clientCd;

			$scope.head.moveDtFrom = userInfo.beforeSystemDt; // 移動日(From)
			$scope.head.moveDtTo = userInfo.beforeSystemDt; // 移動日(To)

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.service:stockMoveHistory#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.StockMoveHistory.service:stockMoveHistory
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function() {
		var deferred = $q.defer();
		var request = {};
		request.receiveFlg = "0";
		request.shippingFlg = "0";

		api.processType.keyValueList2(request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#deferredGetInoutType
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description
	 * センタ区分値グループ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInoutType = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "INOUT_TYPE";

		owsCommon.getDataCacheable(api.inoutType, request).then(function(response){
			$scope.inoutTypeList = response.data;
			if ($scope.inoutTypeList.length == 1) {
				$scope.inoutTypeList.classGrpCd = $scope.inoutTypeList[0].classGrpCd;
			} else {
				$scope.inoutTypeList.classGrpCd = null;
			}
			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#deferredGetStockTypeList
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
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
			$scope.stockTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#deferredGetWarehouseList
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		var centerCd = userInfo.centerCd;
		//荷主センタ変更対応 201７.02.16 sja Start
//		request.centerId = userInfo.centerIdByCd(centerCd);
		if ($scope.head) {
			request.centerId = userInfo.centerIdByCd($scope.head.hstock.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}
		//荷主センタ変更対応 201７.02.16 sja End
		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			//荷主センタ変更対応 201７.02.16 sja Start
//			deferred.resolve();
			deferred.resolve(response);
			//荷主センタ変更対応 201７.02.16 sja End
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#deferredGetDepositList
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description
	 * 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositList = function() {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 201７.02.15 sja Start
//		request.clientCd = userInfo.clientCd;
		request.depositFlg = "1";
		if ($scope.head) {
			request.clientCd = $scope.head.hstock.clientCd;
		} else {
			request.clientCd = userInfo.clientCd;
		}
	 	//荷主センタ変更対応 201７.02.15 sja End
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#productBlur
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.head.hstock.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.hstock.clientCd);
			request.productCd = productCd;

			$scope.head.hstock.productNm = null;

			api.product.record(request).then(function(response){
				$scope.head.hstock.productNm = response.data.mProduct.productNm;
			});
		} else {
			$scope.head.hstock.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#showProduct
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
			clientCd: $scope.head.hstock.clientCd,
			productCd: $scope.head.hstock.productCd
		};
		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.hstock.productCd =  selectedItem.productCd;
			$scope.head.hstock.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#showLocation
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.head.hstock.locationCdFrom;
		} else {
			inLocationCd = $scope.head.hstock.locationCdTo;
		}

		var items = {
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.05 miyabe Start
			centerCd: $scope.head.hstock.centerCd,
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.05 miyabe End
			locationCd: inLocationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.head.hstock.locationCdFrom = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.head.hstock.locationNmFrom = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.head.hstock.locationCdTo = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.head.hstock.locationNmTo = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#locationCdBlur
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
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
			locationCd = $scope.head.hstock.locationCdFrom;
		} else {
			locationCd = $scope.head.hstock.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.head.hstock.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.head.hstock.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.head.hstock.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.head.hstock.locationNmFrom = null;
			}else{
				$scope.head.hstock.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#excelOutput
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);
		api.stockMoveHistory.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveHistory.service:StockMoveHistory#search
     * @methodOf oneslogiWms.StockMoveHistory.service:stockMoveHistory
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveHistory.service:stockMoveHistory#getPagedDataAsync
     * @methodOf oneslogiWms.StockMoveHistory.service:stockMoveHistory
     *
     * @description
     * 検索処理<br>
     * ・権限マスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.stockMoveHistory.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#setPagingData
     * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
     *
     * @description
     * 検索結果反映処理<br>
     * ・行センタ状態のクリア<br>
     * ・取得データをグリッドに反映<br>
     * ・トータル件数を設定
     */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.stockMoveHistoryGrid = response.data.list;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	// [#4333] 日付大小チェックが重複して定義されていたので削除 (他画面とあわせて$scope.initScreen内の定義を有効に) 2018.04.17 kawana Delete

	//画面初期化処理を実行
	$scope.initScreen();
}]);

