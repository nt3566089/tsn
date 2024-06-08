/**
 * @ngdoc overview
 * @name oneslogiWms.ReplenishInstList
 *
 * @description
 * 補充指示一覧画面<br>
 *
 * 補充指示一覧に対する検索を行う為の画面。
 */
angular.module('oneslogiWms.ReplenishInstList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReplenishInstList.service:replenishInstListApi
 *
 * @description
 * 補充指示一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * stockTypeList 在庫区分データ操作用WebApi<br>
 * ・resources/common/stockType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * depositCustomer 預託データ操作用WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * warehouseList 倉庫データ操作用WebApi<br>
 * ・resources/common/warehouseCd/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * zoneList ゾーンデータ操作用WebApi<br>
 * ・resources/common/zone/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * location ロケーションデータ操作用WebAPI<br>
 * ・resources/common/location/record 単一行データ取得WebAPI<br>
 * <br>
 * product 商品データ操作用WebAPI<br>
 * ・resources/common/product/record 単一行データ取得WebAPI<br>
 * <br>
 * centerClass 区分値データ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * replenishInst 補充指示データ操作用WebApi<br>
 * ・resources/stock/replenishInstList/init 初期データ取得WebAPI<br>
 * ・resources/stock/replenishInstList/search 検索WebAPI<br>
 * ・resources/stock/replenishInstList/registerCheck 補充指示データ登録前のチェックWebAPI<br>
 * ・resources/stock/replenishInstList/register  補充指示データ登録WebAPI<br>
 */
.factory('replenishInstListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockTypeList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		warehouseList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
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
		centerClass: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		replenishInst: AngularAPIClient.make(
				[
				 ['init',            'GET',  'resources/stock/replenishInstList/init'],
				 ['search',          'GET',  'resources/stock/replenishInstList/search'],
				 ['excel',           'GET',  'resources/stock/replenishInstList/search', 'excel'],
				 ['registerCheck',   'POST',  'resources/stock/replenishInstList/registerCheck'],
				 ['register',        'POST',  'resources/stock/replenishInstList/register']
				]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList
 *
 * @description
 * 補充指示一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ReplenishInstList', ['$scope', '$route', '$filter', '$location', '$q',
                               'alertMessage', 'directiveControl', 'gridDirectiveControl',
                               'optionMessageControl', 'gridOptionMessageControl', 'owsHistory',
                               'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'replenishInstListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.replenishInstCols = [
	                         {field:"replenishToLocationNm", displayName:"補充先ロケーション名称"},
	                         {field:"productCd", displayName:"商品CD"},
	                         {field:"productNm", displayName:"商品名称"},
	                         {field:"productAbbr", displayName:"商品略称"},
	                         {field:"stockTypeCd", displayName:"在庫区分CD"},
	                         {field:"stockTypeNm", displayName:"在庫区分名称"},
	                         {field:"depositCd", displayName:"預託CD"},
	                         {field:"depositNm", displayName:"預託名称"},
	                         {field:"replenishFromStockNum", displayName:"補充元在庫数"},
	                         {field:"replenishToStockNum", displayName:"補充先在庫数"},
	                         {field:"replenishInstOverNum", displayName:"補充指示済数"},
	                         {field:"replenishMinNum", displayName:"補充点"},
	                         {field:"replenishMinUnit", displayName:"補充点-単位"},
	                         {field:"replenishMaxNum", displayName:"最大格納数"},
	                         {field:"replenishMaxUnit", displayName:"最大格納数-単位"},
	                         {field:"replenishInstNum", displayName:"補充指示数"},
                             //荷主センタ変更対応 201７.02.09 sja Start
                 		 	 {field:"clientCd", displayName:"荷主CD"},
                		 	 {field:"clientNm", displayName:"荷主名称"},
                		 	 {field:"centerCd", displayName:"センタCD"},
                		 	 {field:"centerNm", displayName:"センタ名称"}
                		 	 //荷主センタ変更対応 201７.02.09 sja End
	                         ];


	var isSearchCurrentData;

	//検索条件の一時保存
	var savedSearchCondCenterCd = {};
	var savedSearchCondClientCd = {};
	var savedSearchCondStockTypeCd = {};
	var savedSearchCondProductCd = {};
	var savedSearchCondWarehouseCd = {};
	var savedSearchCondZoneCd = {};
	var savedSearchCondLocationCdFrom = {};
	var savedSearchCondLocationCdTo = {};
	var savedSearchCondReplenishMinNumCond = {};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#initScreen
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// ロケーション大小チェック用メッセージ
		$scope.locationFromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// ロケーション大小チェック
		$scope.locationFromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);

			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}

			return true;
		};


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'replenishInstList',
			columnDefs: 'replenishInstCols'
		});


		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#initScreenHttp
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetWarehouseList(),
				//[Ver1.1.4][ON推-仕様変更] 2016.02.02 chou 削除 Start
				//$scope.deferredGetStockTypeList(),
				//$scope.deferredGetDepositList(),
				//[Ver1.1.4][ON推-仕様変更] 2016.02.02 chou 削除 End
				 $scope.deferredGetReplenishSearchConditionList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:ReplenishInstList#deferredGetWarehouseList
	 * @methodOf oneslogiWms.StockList.object:ReplenishInstList
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {

		var deferred = $q.defer();
		var request = {};
		var centerCd = userInfo.centerCd;

		if($scope.searchConditions){
			centerCd = $scope.searchConditions.centerCd_H;
		}

		request.centerId = userInfo.centerIdByCd(centerCd);

		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.09 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
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
	//荷主センタ変更対応 201７.02.09 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:ReplenishInstList#deferredGetZoneList
	 * @methodOf oneslogiWms.StockList.object:ReplenishInstList
	 *
	 * @description ゾーンリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function () {

		var deferred = $q.defer();
		var request = {};
		var warehouseCd;
		var centerCd = userInfo.centerCd;

		request.data = {};

		if($scope.searchConditions){
			centerCd = $scope.searchConditions.centerCd_H;
		}

		request.centerCd = centerCd;

		if($scope.searchConditions){
			warehouseCd = $scope.searchConditions.replenishToWarehouseCd_H;
		}

		request.warehouseCd = warehouseCd;

		owsCommon.getDataCacheable(api.zoneList, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#changeWarehouse
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 補充先倉庫の変更後に、補充先ゾーンリストの再設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.changeWarehouse = function () {

		var deferred = $q.defer();
		var request = {};

		request.data = {};
		request.centerCd = $scope.searchConditions.centerCd_H;
		request.warehouseCd = $scope.searchConditions.replenishToWarehouseCd_H;

		if($scope.searchConditions.replenishToWarehouseCd_H == null){
			$scope.zoneList = null;
			return deferred.promise;
		}
		owsCommon.getDataCacheable(api.zoneList, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
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
		request.clientCd = "";

		owsCommon.getDataCacheable(api.stockTypeList,"keyValueList", request).then(function(response){
			$scope.stockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockInOutList.object:ReplenishInstList#deferredGetDepositList
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositList = function() {

		var deferred = $q.defer();
		var request = {};

		request.data = {};
		request.clientCd = userInfo.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#deferredGetReplenishSearchConditionList
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 補充点検索条件表示リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReplenishSearchConditionList = function(){

		var deferred = $q.defer();
		var request = {};

		request.classCd = "REPLENISH_SEARCH_CLS";

		owsCommon.getDataCacheable(api.centerClass, "keyValueList", request).then(function(response){
			$scope.replenishMinNumCondList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#deferredGetInitData
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 補充指示データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.replenishInst.init().then(function(response){

			$scope.head = response.data.head;
			$scope.body = response.data.body;

			// [#1979]ページングは対応しない為削除 2017.8.8 sampei Start

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				deferred.reject();
				return;
			}

			// 補充指示ヘッダ関連
			$scope.searchConditions = response.data.head;
			// 補充指示一覧リスト関連
			$scope.replenishInstList = response.data.body;
			// センタの初期値設定
			$scope.searchConditions.centerCd_H = userInfo.centerCd;
			// 荷主の初期値設定
			$scope.searchConditions.clientCd_H = userInfo.clientCd;
			// 補充点リストのデフォルト値設定
			$scope.searchConditions.replenishMinNumCond_H = owsCommon.getDefaultValue($scope.replenishMinNumCondList);

			// [#1979]ページングは対応しない為削除 2017.8.8 sampei Start

			//初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#search
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){

		//ページング無しで一覧データ（全件）を取得
		$scope.getSearchData();

		// [#1979]ページングは対応しない為削除 2017.8.8 sampei Start

		savedSearchCondCenterCd = $scope.searchConditions.centerCd_H;
		savedSearchCondClientCd = $scope.searchConditions.clientCd_H;
		savedSearchCondStockTypeCd = $scope.searchConditions.stockTypeCd_H;
		savedSearchCondProductCd = $scope.searchConditions.productCd_H;
		savedSearchCondWarehouseCd = $scope.searchConditions.replenishToWarehouseCd_H;
		savedSearchCondZoneCd = $scope.searchConditions.replenishToZoneCd_H;
		savedSearchCondLocationCdFrom = $scope.searchConditions.replenishToLocationCdFrom_H;
		savedSearchCondLocationCdTo = $scope.searchConditions.replenishToLocationCdTo_H;
		savedSearchCondReplenishMinNumCond = $scope.searchConditions.replenishMinNumCond_H;

	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#getSearchData
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchConditions;

		// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei

		api.replenishInst.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setSearchData(response);
		});
	};

	// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#setSearchData
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		//全選択のチェックをクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		//スクロールバーを設定
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.replenishInstList = response.data.body;

	};

	// [#1979]ページングは対応しない為、該当する処理を削除 2017.8.8 sampei


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#excelOutput
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchConditions;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.replenishInst.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#productCdBlur
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		// 入力された商品コードを取得
		var productCd = $scope.searchConditions.productCd_H;

		if(productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchConditions.clientCd_H);
			request.productCd = productCd;

			// 商品情報の取得
			api.product.record(request).then(function(response){
				$scope.searchConditions.productNm_H = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchConditions.productNm_H = null;
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#locationCdBlur
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 補充先ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {

		// 入力されたロケーションCDを取得
		var locationCd = "";

		if(index == 1){
			locationCd = $scope.searchConditions.replenishToLocationCdFrom_H;
		}else{
			locationCd = $scope.searchConditions.replenishToLocationCdTo_H;
		}

		if(locationCd && 0 < locationCd.length) {
			var request = {};

			request.centerId = userInfo.centerIdByCd($scope.searchConditions.centerCd_H);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				if(index == 1){
					$scope.searchConditions.replenishToLocationNmFrom_H = response.data.mLocation.locationNm;
				}else{
					$scope.searchConditions.replenishToLocationNmTo_H = response.data.mLocation.locationNm;
				}

			});

		} else {
			if(index == 1){
				$scope.searchConditions.replenishToLocationNmFrom_H = null;
			}else{
				$scope.searchConditions.replenishToLocationNmTo_H = null;
			}
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#showProduct
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.searchConditions.clientCd_H,
				productCd: $scope.searchConditions.productCd_H
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchConditions.productCd_H =  selectedItem.productCd;
			$scope.searchConditions.productNm_H =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReplenishInstList#showLocation
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReplenishInstList
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
        var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.searchConditions.replenishToLocationCdFrom_H;
		} else {
			inLocationCd = $scope.searchConditions.replenishToLocationCdTo_H;
		}

		var items = {
				centerCd: $scope.searchConditions.centerCd_H,
				locationCd: inLocationCd,
				warehouseCd: $scope.searchConditions.replenishToWarehouseCd_H,
				zoneCd: $scope.searchConditions.replenishToZoneCd_H

		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.searchConditions.replenishToLocationCdFrom_H = selectedItem.locationCd;
				$scope.searchConditions.replenishToLocationNmFrom_H = selectedItem.locationNm;
			} else {
				$scope.searchConditions.replenishToLocationCdTo_H = selectedItem.locationCd;
				$scope.searchConditions.replenishToLocationNmTo_H = selectedItem.locationNm;
			}
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#register
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
	 *
	 * @description
	 * 補充指示ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、補充指示処理を行う。
	 */
	$scope.register = function(){

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		// [#1979]グリッド入力項目エラーを消す処理であり、当画面では入力項目がなく不要な処理の為削除 2017.8.8 sampei Start
		// gridOptionMessageControl.hideAll($scope.gridOptions);
		// [#1979]グリッド入力項目エラーを消す処理であり、当画面では入力項目がなく不要な処理の為削除 2017.8.8 sampei End


		var listBody = [];
		var emptyBody = [];

		// 補充指示ボタンを押下する前に検索条件が変わっているかをチェック
		if(!($scope.searchConditions.centerCd_H == savedSearchCondCenterCd &&
			$scope.searchConditions.clientCd_H == savedSearchCondClientCd &&
			$scope.searchConditions.stockTypeCd_H == savedSearchCondStockTypeCd &&
			$scope.searchConditions.productCd_H == savedSearchCondProductCd &&
			$scope.searchConditions.replenishToWarehouseCd_H == savedSearchCondWarehouseCd &&
			$scope.searchConditions.replenishToZoneCd_H == savedSearchCondZoneCd &&
			$scope.searchConditions.replenishToLocationCdFrom_H == savedSearchCondLocationCdFrom &&
			$scope.searchConditions.replenishToLocationCdTo_H == savedSearchCondLocationCdTo &&
			$scope.searchConditions.replenishMinNumCond_H == savedSearchCondReplenishMinNumCond)) {

			alertMessage.setErrorMessageByCode("replenishInstCannnotRegisterPageDataIsOldError");
			return;
		}

		// 行選択されていないかをチェック
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;

		for (var row = 0; row < $scope.replenishInstList.length; row++) {
			if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行を退避
				emptyBody.push($scope.replenishInstList[row]);
			}else{
				listBody.push($scope.replenishInstList[row]);
			}
		}

		var request = {};
		request.data = {};
		request.data.head = $scope.searchConditions;
		request.data.body = listBody;

		//登録前入力チェック
		api.replenishInst.registerCheck(request).then(function(response) {

			if (response.status.listStatus != null){
				var isNoErr = true;

				for (var i = 0 ;i <response.status.listStatus.length;i++){
					//チェックエラーCdの判断
					if (response.status.listStatus[i].status.statusCode == 3){
						isNoErr = false;
						break;
					}
				}

				if(isNoErr){
					// 未選択行を削除
					angular.forEach(emptyBody, function(row) {
						$scope.replenishInstList.splice($scope.replenishInstList.indexOf(row), 1);
					});
				}

			}

			owsCommon.syncExec(function() {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {//異常或は、キャンセルボタンを押下した場合
					return;
				}else{//正常の場合

					request.data.body = $scope.replenishInstList;

					api.replenishInst.register(request).then(function(response) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {//異常の場合
							return;
						}else{//正常の場合

							//再検索を行う
							$scope.search();
						}

					});

					return;
				}

			});

		});

	}


	// 画面初期化処理を実行
	$scope.initScreen();

}]);
