/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryBulkUpdate
 *
 * @description
 * 棚卸在庫一括更新画面
 */
angular.module('oneslogiWms.InventoryBulkUpdate',[])

/**
 * @ngdoc service
 * @name oneslogiWms.InventoryBulkUpdat.service:inventoryBulkUpdateApi
 *
 * @description
 * 棚卸在庫一括更新WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/inventory/inventoryBulkUpdate/init 初期化用WebApi<br>
 * ・resources/inventory/inventoryBulkUpdate/search 検索用WebApi<br>
 * ・resources/inventory/inventoryBulkUpdate/check 棚卸在庫一括更新前入力チェック用WebApi<br>
 * ・resources/inventory/inventoryBulkUpdate/bulkUpdate 棚卸在庫一括更新用WebApi<br>
 *
 */
.factory('inventoryBulkUpdateApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockTakingInput: AngularAPIClient.make(
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
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		zone: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.09 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.09 sja End
		inventoryBulkUpdateList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/inventory/inventoryBulkUpdate/init'],
			    ['search', 'GET', 'resources/inventory/inventoryBulkUpdate/search'],
			    ['excel',  'GET', 'resources/inventory/inventoryBulkUpdate/search', 'excel'],
			    ['check', 'POST', 'resources/inventory/inventoryBulkUpdate/check'],
			    ['register', 'POST', 'resources/inventory/inventoryBulkUpdate/register']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
 *
 * @description
 *棚卸在庫一括更新画面コントローラ
 */
.controller('InventoryBulkUpdate', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'inventoryBulkUpdateApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.inventoryBulkUpdateListCols =
		[
		    {field:"productCd", displayName:"商品CD"},
		    // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
		    {field:"janCd", displayName:"JANCD"},
		    // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
		    {field:"productNm", displayName:"商品名称"},
		    {field:"productAbbr", displayName:"商品略称"},
		    {field:"depositCd", displayName:"預託CD"},
		    {field:"depositNm", displayName:"預託名称"}
		];

	// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生(model名一括置換) 2017.03.06 kawana Start

    /**
     * @ngdoc method
     * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#initScreen
     * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
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

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫CDリストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.head.mclient.clientCd;
		};

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'inventoryBulkUpdateList',
			columnDefs: 'inventoryBulkUpdateListCols',
			pagingOptions : $scope.pagingOptions
		});

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
			if (oldClient != $scope.searchCondition.head.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};
		// 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldWarehouse = $scope.searchCondition.body.mwarehouse.warehouseCd;
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
			if (oldWarehouse != $scope.searchCondition.body.mwarehouse.warehouseCd) {
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

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#initScreenHttp
     * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetConditionList(),
				 $scope.deferredGetUnmatchList(),
				//荷主センタ変更対応 201７.02.09 sja Start
				 $scope.deferredGetWarehouseCdList()
				//荷主センタ変更対応 201７.02.09 sja End
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// 棚卸入力有データ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_TAKING_INPUT";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response){
			$scope.stockTakingInputList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// アンマッチ有データ取得
	$scope.deferredGetUnmatchList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UNMATCH";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response){
			$scope.unmatchList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.09 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.inventoryBulkUpdateSearchH) {
			request.centerId = userInfo.centerIdByCd($scope.inventoryBulkUpdateSearchH.mcenter.centerCd);
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
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#deferredGetInitData
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * 棚卸在庫一括更新初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.inventoryBulkUpdateList.init().then(function(response){
			$scope.searchCondition = {};
			$scope.searchCondition.head = response.data.headInventoryH;
			$scope.searchCondition.body = response.data.headInventoryB
			$scope.searchCondition.inst=response.data.headInventoryInst;
			$scope.searchCondition.product = response.data.headProduct;
			$scope.inventoryBulkUpdateList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.searchCondition.head.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.head.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.head.inventoryDt = userInfo.systemDt;
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 Start
			// 荷主変更後処理
			$scope.changeClient(true);
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 End
			// 倉庫変更後処理
			$scope.changeWarehouse(true);

			//棚卸入力有を設定
			$scope.searchCondition.inst.stockTakingInput =  owsCommon.getDefaultValue($scope.stockTakingInputList);

			//アンマッチ有を設定
			$scope.searchCondition.inst.unmatch =  owsCommon.getDefaultValue($scope.unmatchList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {

				// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生 2017.03.06 kawana Start
				owsCommon.syncExec(function() {
					$scope.searchCondition = owsHistory.popState();
					$scope.search();
				});
				// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生 2017.03.06 kawana End
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 2017.03.06 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#changeCenter
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseCdList()
		.then(function(response){
			$scope.deferredGetZoneList()
			.then(function(response){
				setZoneList(response.data, false);
			});
		});
	};
	//荷主センタ変更対応 2017.03.06 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
		request.clientCd = $scope.searchCondition.head.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#changeClient
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
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
	//searchCondition.head.mclient.clientCd;
		$scope.depositStockTypeList = list;
		// 選択肢が一つの場合は一つ目を設定
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 Start
		if (clearSelected) {
			// 選択肢が一つの場合は一つ目を設定
			if ($scope.depositStockTypeList.length == 1) {
				$scope.searchCondition.inst.mcustomer.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.searchCondition.inst.mcustomer.customerCd = null;
			}
		} else {
			$scope.searchCondition.inst.mcustomer.customerCd = null;
		}
	};
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
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
		request.clientCd = $scope.searchCondition.head.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

//		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//			$scope.searchCondition.body.mstockType.stockTypeCd = "W100"
//		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#deferredGetZoneList
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
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
		request.centerCd = $scope.searchCondition.head.mcenter.centerCd;
		request.warehouseCd = $scope.searchCondition.body.mwarehouse.warehouseCd;

		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#changeWarehouse
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
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
			$scope.searchCondition.inst.mzone.zoneCd = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#productBlur
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.product.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.head.mclient.clientCd);
			request.productCd = productCd;

			$scope.searchCondition.body.mproduct.productNm = null;

			api.product.record(request).then(function(response){
				$scope.searchCondition.product.productNm = response.data.mProduct.productNm;
				$scope.searchCondition.product.janCd = response.data.mProduct.janCd;
				$scope.searchCondition.product.productAbbr = response.data.mProduct.productAbbr;
			});

		} else {
			$scope.searchCondition.product.productNm = null;
			$scope.searchCondition.product.janCd = null;
			$scope.searchCondition.product.productAbbr = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#showProduct
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.searchCondition.head.mclient.clientCd,
				productCd: $scope.searchCondition.product.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.product.productCd =  selectedItem.productCd;
			$scope.searchCondition.product.productNm =  selectedItem.productNm;
			$scope.searchCondition.product.productAbbr =  selectedItem.productAbbr;
			$scope.searchCondition.product.janCd =  selectedItem.janCd;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#locationCdBlur
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {
		// 入力された商品コードを取得
        var locationCd;
		if (index == 1) {
			locationCd = $scope.searchCondition.inst.fromLocationCd;
		} else {
			locationCd = $scope.searchCondition.inst.toLocationCd;
		}
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.head.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.searchCondition.inst.fromLocationNm = response.data.mLocation.locationNm;
				}else{
					$scope.searchCondition.inst.toLocationNm = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			//[#7159]ロケーションCD(From)入力欄の内容がクリアされるよう修正 2020.01.30 ono Start
			if(index == 1){
				$scope.searchCondition.inst.fromLocationNm = null;
			}else{
				$scope.searchCondition.inst.toLocationNm = null;
			}
			//[#7159]ロケーションCD(From)入力欄の内容がクリアされるよう修正 2020.01.30 ono End

		}
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#showLocation
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
        var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.searchCondition.inst.fromLocationCd;
		} else {
			inLocationCd = $scope.searchCondition.inst.toLocationCd;
		}

		var items = {
				centerCd: $scope.searchCondition.head.mcenter.centerCd,
				locationCd: inLocationCd,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.searchCondition.body.mwarehouse.warehouseCd,
				zoneCd: $scope.searchCondition.inst.mzone.zoneCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.searchCondition.inst.fromLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.searchCondition.inst.fromLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

			} else {
				$scope.searchCondition.inst.toLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.searchCondition.inst.toLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#search
     * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#getSearchData
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.headInventoryInst = $scope.searchCondition.inst;
		request.data.headInventoryB= $scope.searchCondition.body;
		request.data.headInventoryH= $scope.searchCondition.head;
		request.data.headProduct= $scope.searchCondition.product;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.inventoryBulkUpdateList.search(request).then(function(response) {

			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#getClassForRow
	 * @methodOf oneslogiWmsInventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		// [ON推-品向-446] 追加在庫の色が変わらない問題を解消 2014.12.17 kawana Start
		if ( owsCommon.isNotEqual(row.entity.chargeNum, row.entity.tstock.chargeNum) ||
			 (row.entity.stockAdjustFlg == "1")
		) {
			// [ON推-品向-446] 追加在庫の色が変わらない問題を解消 2014.12.17 kawana End

			return "wmslegendindianred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#setSearchData
	 * @methodOf oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response, page, pageSize) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-338] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-338] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.inventoryBulkUpdateList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生 2017.03.06 kawana Start
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
		// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生 2017.03.06 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#excelOutput
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.headInventoryInst = $scope.searchCondition.inst;
		request.data.headInventoryB= $scope.searchCondition.body;
		request.data.headInventoryH= $scope.searchCondition.head;
		request.data.headProduct= $scope.searchCondition.product;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.inventoryBulkUpdateList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryBulkUpdate.object:InventoryBulkUpdate#register
	 * @methodOf oneslogiWms.InventoryBulkUpdateobject:InventoryBulkUpdate
	 *
	 * @description
	 * 在庫一括更新ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// [#6868][OSS] コンソールエラー修正(入力項目なしのためhideAll不要) 2019.12.05 kawana Start
		// 業務エラーのクリア
//		optionMessageControl.hideAll($scope);
//		gridOptionMessageControl.hideAll($scope.gridOptions);
		// [#6868][OSS] コンソールエラー修正(入力項目なしのためhideAll不要) 2019.12.05 kawana End

		var listBody = [];
		var emptyBody = [];


		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			listBody.push($scope.inventoryBulkUpdateList[row]);
		});

		// [#4701] 入力項目がないので入力グリッドのValidateチェックを削除 2018.06.08 kawana Delete

		// 在庫調整済みがないレコードを選択されている場合
		if ($scope.inventoryBulkUpdateList.length == 0) {
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		if (listBody.length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		for (var row = 0; row < $scope.inventoryBulkUpdateList.length; row++) {
			if($scope.gridOptions.gridApi.grid.rows[row].isSelected){
				if ($scope.inventoryBulkUpdateList[row].stockAdjustFlg == "1") {
					alertMessage.setErrorMessageByCode("inventoryAllCompleteStockUpdateError");
					return;
				}
				//アンマッチがないレコードを選択されている場合
				if (owsCommon.isZero($scope.inventoryBulkUpdateList[row].diffQty)) {

					alertMessage.setErrorMessageByCode("inventoryAllNoDiffStockUpdateError");
					return ;
				}
			}

		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.body = $scope.gridOptions.gridApi.selection.getSelectedRows();
		request.data.headInventoryInst = $scope.searchCondition.inst;
		request.data.headInventoryB = $scope.searchCondition.body;
		request.data.headInventoryH = $scope.searchCondition.head;
		request.data.headProduct = $scope.searchCondition.product;

		// 入力チェック
		api.inventoryBulkUpdateList.check(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}

			// 在庫一括更新 実行
			api.inventoryBulkUpdateList.register(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}

				// 初期化
				$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
			});
		});

		// [#4701] 入力項目がないので入力グリッドのValidateチェックを削除 2018.06.08 kawana Delete
	};

	//画面初期化処理を実行
	$scope.initScreen();

	// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生(model名一括置換) 2017.03.06 kawana End

}]);
