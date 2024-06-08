/**
 * @ngdoc overview
 * @name oneslogiWms.ReceiveHistory
 *
 * @description
 * 入荷履歴画面
 */
angular.module('oneslogiWms.ReceiveHistory',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceiveHistory.service:receiveHistoryApi
 *
 * @description
 * 入荷履歴WebApi定義<br>
 * ・resources/receive/receiveHistory/init 初期処理WebApi<br>
 * ・resources/receive/receiveHistory/search 検索処理WebApi<br>
 * ・resources/receive/receiveHistory/excelOutput EXCEl出力WebApi<br>
 * ・resources/common/processType/keyValueList 処理区分データ取得<br>
 * ・resources/common/depositCustomer/keyValueList 預託データ取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/warehouseCd/keyValueList 倉庫データ取得用WebApi<br>
 * supplierCustomer 仕入先データ操作用WebAPI<br>
 * ・resources/common/supplierCustomer/record 単一行データ取得WebAPI<br>
 * ・resources/common/product/record 商品データ取得 <br>
 *
 */
.factory('receiveHistoryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
				[
					['keyValueList', 'GET', 'resources/common/processType/keyValueList']
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
		product: AngularAPIClient.make(
				[
					['record', 'GET', 'resources/common/product/record']
				]
		),
		receiveHistory: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/receive/receiveHistory/init'],
					['search', 'GET', 'resources/receive/receiveHistory/search'],
					['excel',  'GET', 'resources/receive/receiveHistory/search', 'excel']
				]
		),
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
 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory
 *
 * @description
 * 入荷履歴画面コントローラ
 */
.controller('ReceiveHistory', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'receiveHistoryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.bodyListCols =
		[
		 	{field:"hreceiveH.histDt", displayName:"履歴日"},
			{field:"hreceiveH.receivePlanDt", displayName:"入荷予定日"},
			{field:"storeDt", displayName:"入庫日"},
			{field:"hreceiveH.supplierCd", displayName:"仕入先CD"},
			{field:"hreceiveH.supplierNm", displayName:"仕入先名称"},
			{field:"hstock.supplierAbbr", displayName:"仕入先略称"},
			{field:"hreceiveH.depositCd", displayName:"預託CD"},
			{field:"hreceiveH.depositNm", displayName:"預託名称"},
			{field:"hstock.depositAbbr", displayName:"預託略称"},
			{field:"hreceiveH.clientReceiveNo", displayName:"顧客入荷指示No."},
			{field:"hreceiveH.receiveSlipNo", displayName:"WMS入荷伝票No."},
			{field:"hreceiveH.mprocessType.processTypeCd", displayName:"処理区分CD"},
			{field:"hreceiveH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
			{field:"hreceiveH.receiveDeliveryStatus", displayName:"入荷納品ステータスCD"},
			{field:"hreceiveH.mcenterClassDtlByReceiveDeliveryStatus.vdict.dictNm", displayName:"入荷納品ステータス名称"},
			{field:"hstock.productCd", displayName:"商品CD"},
			{field:"hstock.productNm", displayName:"商品名称"},
			{field:"hstock.productAbbr", displayName:"商品略称"},
			{field:"hstock.janCd", displayName:"JANCD"},
			{field:"hstock.lot", displayName:"ロット"},
			{field:"hstock.limitDt", displayName:"期限日"},
			{field:"hstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
			{field:"hstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
			{field:"planNum", displayName:"予定数"},
			{field:"storeNum", displayName:"入庫数"},
			{field:"hstock.warehouseCd", displayName:"倉庫CD"},
			{field:"hstock.warehouseNm", displayName:"倉庫名称"},
			{field:"hstock.zoneCd", displayName:"ゾーンCD"},
			{field:"hstock.zoneNm", displayName:"ゾーン名称"},
			{field:"hstock.locationCd", displayName:"ロケーションCD"},
			{field:"hstock.locationNm", displayName:"ロケーション名称"},
			{field:"hstock.storeLabelNo", displayName:"入庫ラベルNo."},
			{field:"hstock.oldStoreLabelNo", displayName:"元入庫ラベルNo."},
			{field:"storeFlg", displayName:"入庫格納フラグ"},
			{field:"storeLocationCd", displayName:"入庫格納ロケーションCD"},
			{field:"storeLocationNm", displayName:"入庫格納ロケーション名称"},
			//荷主センタ変更対応 201７.02.15 sja Start
		 	{field:"hreceiveH.clientCd", displayName:"荷主CD"},
		 	{field:"hreceiveH.clientNm", displayName:"荷主名称"},
		 	{field:"hreceiveH.centerCd", displayName:"センタCD"},
		 	{field:"hreceiveH.centerNm", displayName:"センタ名称"}
		 	//荷主センタ変更対応 201７.02.15 sja End
		];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#initScreen
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'receiveHistoryGrid',
			columnDefs: 'bodyListCols',
			pagingOptions : $scope.pagingOptions
		});

		//荷主センタ変更対応 201７.02.15 sja Start
		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositList()
		};
		//荷主センタ変更対応 201７.02.15 sja End

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
        $scope.fromToLocationCheck = function(fromValue, toValue) {
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
        $scope.fromToLocationMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}
	//荷主センタ変更対応 201７.03.03 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#centerChange
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseList();
	};
	//荷主センタ変更対応 201７.03.03 sja End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
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
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#deferredGetProcessType
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessType = function () {
		var deferred = $q.defer();
		var request = {};
		request.receiveFlg = "1";
		request.shippingFlg = "0";
		request.moveFlg = "0";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#deferredGetDepositList
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
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
		if ($scope.headH) {
			request.clientCd = $scope.headH.clientCd;
		} else {
			request.clientCd = userInfo.clientCd;
		}
	 	//荷主センタ変更対応 201７.02.15 sja End

		request.depositFlg = "1";

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#deferredGetWarehouseList
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		//荷主センタ変更対応 201７.03.03 sja Start
		var centerCd = userInfo.centerCd;
		//request.centerId = userInfo.centerIdByCd(centerCd);

		if ($scope.headH) {
			request.centerId = userInfo.centerIdByCd($scope.headH.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}
		//荷主センタ変更対応 201７.03.03 sja End
		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#initScreenHttp
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {

		// 全通信終了後に以下関数で各種設定を実行
		$q.all(
				[
				 	$scope.deferredGetStockTypeList(), // 在庫区分
				 	$scope.deferredGetProcessType(), // 処理区分
				 	$scope.deferredGetDepositList(), // 預託
				 	$scope.deferredGetWarehouseList() // 倉庫
				]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#deferredGetInitData
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 入荷履歴初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.receiveHistory.init().then(function(response){

			$scope.paging = response.paging;

			$scope.headH = response.data.head;
			$scope.headB = response.data.body;
			$scope.receiveHistoryGrid = response.data.bodyList;
			$scope.historyData = response.data;
			$scope.headH.clientCd = userInfo.clientCd;
			$scope.headH.centerCd = userInfo.centerCd;
			$scope.headB.storeDtFrom = userInfo.beforeSystemDt; // 入庫日(From)
			$scope.headB.storeDtTo = userInfo.beforeSystemDt; // 入庫日(To)

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.historyData = owsHistory.popState();
				$scope.headH = $scope.historyData.head;
				$scope.headB = $scope.historyData.body;
				$scope.search();
			}
			// 通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();

		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#customerCdBlur
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 仕入先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された仕入先コードを取得
		var customerCd = $scope.headH.supplierCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.headH.supplierNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.headH.supplierNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#showCustomer
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){
		var items = {
				clientCd: $scope.headH.clientCd,
				vendorCd: $scope.headH.supplierCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

		$scope.headH.supplierCd = selectedItem.customerCd;
		$scope.headH.supplierNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#productBlur
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.headB.hstock.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.productCd = productCd;

			$scope.headB.hstock.productNm = null;

			api.product.record(request).then(function(response){
				$scope.headB.hstock.productNm = response.data.mProduct.productNm;
			});
		} else {
			$scope.headB.hstock.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#showProduct
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
			clientCd: $scope.headH.clientCd,
			productCd: $scope.headB.hstock.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.headB.hstock.productCd =  selectedItem.productCd;
			$scope.headB.hstock.productNm =  selectedItem.productNm;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#showLocation
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.headB.storeLocationCdFrom;
		} else {
			inLocationCd = $scope.headB.storeLocationCdTo;
		}

		var items = {
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.05 miyabe Start
			centerCd: $scope.headH.centerCd,
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.05 miyabe End
			locationCd: inLocationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.headB.storeLocationCdFrom = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.headB.storeLocationNmFrom = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.headB.storeLocationCdTo = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.headB.storeLocationNmTo = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#locationCdBlur
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
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
			locationCd = $scope.headB.storeLocationCdFrom;
		} else {
			locationCd = $scope.headB.storeLocationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.headH.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.headB.storeLocationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.headB.storeLocationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.headB.storeLocationNmFrom = null;
			}else{
				$scope.headB.storeLocationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#excelOutput
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		// [#598] Excel出力結果が間違っている不具合を修正 2017.01.17 kawana Start
		request.data.head = $scope.headH;
		// [#598] Excel出力結果が間違っている不具合を修正 2017.01.17 kawana End
		request.data.body = $scope.headB;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);

		api.receiveHistory.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#search
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
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
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#getPagingData
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
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

		api.receiveHistory.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveHistory.object:ReceiveHistory#setPagingData
	 * @methodOf oneslogiWms.ReceiveHistory.object:ReceiveHistory
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.receiveHistoryGrid = response.data.bodyList;

		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount; // トータル件数を設定
		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.historyData);
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);

