/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryDiffListPrint
 *
 * @description
 * 棚卸差異リスト発行画面
 */

angular.module('oneslogiWms.InventoryDiffListPrint',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryDiffListPrint.service:inventoryDiffListPrintApi
 *
 * @description
 * 棚卸差異リスト発行WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/stockType/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/location/record ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/zone/keyValueList ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/product/record ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/inventory/inventoryDiffListPrint/init 初期化用WebApi<br>
 * ・resources/inventory/inventoryDiffListPrint/print 発行用WebApi<br>
 */
.factory('inventoryDiffListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		inventoryLocationProduct: AngularAPIClient.make(
			[
			 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
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
		location: AngularAPIClient.make(
			[
			 ['record', 'GET', 'resources/common/location/record']
			 ]
		),
		zone: AngularAPIClient.make(
			[
			 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
			 ]
		),
		product: AngularAPIClient.make(
			[
			 ['record', 'GET', 'resources/common/product/record']
			 ]
		),
		inventoryDiffListPrint: AngularAPIClient.make(
			[
			 ['init',  'GET', 'resources/inventory/inventoryDiffListPrint/init'],
			 ['print', 'GET', 'resources/inventory/inventoryDiffListPrint/print']
			 ]
		),
		//荷主センタ変更対応 201７.02.09 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		)
		//荷主センタ変更対応 201７.02.09 sja End
	};
}])
/**
 * @ngdoc object
 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
 *
 * @description
 * 棚卸差異リスト発行画面<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('InventoryDiffListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'inventoryDiffListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var oldWarehouse;
	var newZoneList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#initScreen
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.conditionH.mclient.clientCd;
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
			if (oldClient != $scope.conditionH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};
		// 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldWarehouse = $scope.conditionB.mwarehouse.warehouseCd;
		};

		// 倉庫変更の監視設定（選択内容変更時）
		$scope.warehouseChange = function() {
			// ゾーンリスト変更（同期処理）
			$scope.deferredGetZoneList()
			.then(function(response){
				newZoneList = response.data;
			});
		};

		// 倉庫変更の監視設定（ロストフォーカス時）
		$scope.warehouseBlur = function() {
			if (oldWarehouse != $scope.conditionB.mwarehouse.warehouseCd) {
				// 選択した倉庫で取得済みのゾーンリストを設定
				setZoneList(newZoneList, true);
			}
		};

		// ロケーション大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
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
		$scope.fromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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
		request.clientCd = $scope.conditionH.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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
		request.clientCd = $scope.conditionH.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#deferredGetZoneList
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * ゾーン取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.centerCd = $scope.conditionH.mcenter.centerCd;
		request.warehouseCd = $scope.conditionB.mwarehouse.warehouseCd;

		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#initScreenHttp
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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
			 $scope.deferredGetConditionList(),
			 //荷主センタ変更対応 2017.02.09 sja Start
			 $scope.deferredGetWarehouseCdList()
			 //荷主センタ変更対応 2017.02.09 sja End
			 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#deferredGetConditionList
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 比較条件差異取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_LOCATION_PRODUCT";

		owsCommon.getDataCacheable(api.inventoryLocationProduct, "keyValueList", request).then(function(response){
			$scope.inventoryLocationProduct = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.inventoryDiffListPrint.init().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.conditionH = response.data.head;
			$scope.conditionB = response.data.body;
			$scope.conditionI = response.data.inst;
			$scope.conditionH.mclient.clientCd = userInfo.clientCd;
			$scope.conditionH.mcenter.centerCd = userInfo.centerCd;
			$scope.conditionH.inventoryDt = userInfo.systemDt;
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 Start
			// 荷主変更後処理
			$scope.changeClient(true);
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.08 衛 End
			// 倉庫変更後処理
			$scope.changeWarehouse(false);

			// 比較条件差異は一つ目を設定
			if ($scope.inventoryLocationProduct.length > 0) {
				$scope.conditionI.inventoryLocationProduct = owsCommon.getDefaultValue($scope.inventoryLocationProduct);
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

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
		//荷主センタ変更対応 2017.03.07 sja Start
//		$scope.deferredGetWarehouseCdList();
		$scope.deferredGetWarehouseCdList()
		.then(function(response){
			$scope.deferredGetZoneList()
			.then(function(response){
				setZoneList(response.data, false);
			});
		});
		//荷主センタ変更対応 2017.03.07 sja End
	};
	//荷主センタ変更対応 201７.02.09 sja End
	
	//荷主センタ変更対応 201７.02.09 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.conditionH) {
			request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.09 sja End
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#changeClient
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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
				$scope.conditionB.mcustomerByDepositId.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.conditionB.mcustomerByDepositId.customerCd = null;
			}
		} else {
			$scope.conditionB.mcustomerByDepositId.customerCd = null;
		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 在庫区分は一つ目を設定
		if (clearSelected) {
			$scope.conditionB.mstockType.stockTypeCd = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#changeWarehouse
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 倉庫変更後処理<br>
	 *
	 * 倉庫が変更された場合、ゾーンリストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeWarehouse = function(clearSelected) {
		// ゾーンリスト変更（同期処理）
		$scope.deferredGetZoneList()
		.then(function(response){
			setZoneList(response.data, clearSelected);
		});
	};

	// ゾーンリスト再設定処理
	var setZoneList = function(list, clearSelected) {
		$scope.zoneList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			$scope.conditionI.mzone.zoneCd = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#productBlur
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.conditionB.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.conditionH.mclient.clientCd);
			request.productCd = productCd;

			$scope.conditionB.mproduct.productNm = null;

			api.product.record(request).then(function(response){
				$scope.conditionB.mproduct.productNm = response.data.mProduct.productNm;
			});
		} else {
			$scope.conditionB.mproduct.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#showProduct
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
			clientCd: $scope.conditionH.mclient.clientCd,
			productCd: $scope.conditionB.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.conditionB.mproduct.productCd =  selectedItem.productCd;
			$scope.conditionB.mproduct.productNm =  selectedItem.productNm;
			$scope.conditionB.mproduct.productAbbr =  selectedItem.productAbbr;
			$scope.conditionB.mproduct.janCd =  selectedItem.janCd;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#showLocation
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.conditionI.fromLocationCd;
		} else {
			inLocationCd = $scope.conditionI.toLocationCd;
		}

		var items = {
			centerCd: $scope.conditionH.mcenter.centerCd,
			locationCd: inLocationCd,
			// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
			warehouseCd: $scope.conditionB.mwarehouse.warehouseCd,
			zoneCd: $scope.conditionI.mzone.zoneCd
			// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.conditionI.fromLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.conditionI.fromLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.conditionI.toLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.conditionI.toLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#locationCdBlur
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
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
			locationCd = $scope.conditionI.fromLocationCd;
		} else {
			locationCd = $scope.conditionI.toLocationCd;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.conditionI.fromLocationNm = response.data.mLocation.locationNm;
				}else{
					$scope.conditionI.toLocationNm = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.conditionI.fromLocationNm = null;
			}else{
				$scope.conditionI.toLocationNm = null;
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
			request.data.head = $scope.conditionH;
			request.data.body = $scope.conditionB;
			request.data.inst = $scope.conditionI;
			request.printBasicData = printParam.printBasicData;

			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.inventoryDiffListPrint.print(request).then(function(response){
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

	// 画面初期化処理を実行
	$scope.initScreen();
}]);

