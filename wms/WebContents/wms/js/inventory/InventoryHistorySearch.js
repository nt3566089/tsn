/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryHistorySearch
 *
 * @description
 * 棚卸履歴検索画面
 */
angular.module('oneslogiWms.InventoryHistorySearch',[])

/**
 * @ngdoc service
 * @name oneslogiWms.WarehouseMaster.service:warehouseMasterApi
 *
 * @description
 * 棚卸履歴検索WebApi定義<br>
 * ・resources/inventory/inventoryHistorySearch/init 通常画面用初期データ取得用WebApi<br>
 * ・resources/inventory/inventoryHistorySearch/search 検索用WebApi<br>
 * ・resources/common/deliveryCourse/record 商品データ取得用WebApi<br>
 * ・resources/common/wmsCommon/depositCustomerList 預託在庫データ取得用WebApi<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得用WebApi<br>
 *
 */
.factory('inventoryHistorySearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		product: AngularAPIClient.make(
				[
					['record', 'GET', 'resources/common/product/record']
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
		zone: AngularAPIClient.make(
				[
					['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				]
		),
		inventoryHistorySearchList: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/inventory/inventoryHistorySearch/init'],
					['search', 'GET', 'resources/inventory/inventoryHistorySearch/search'],
					['excel',  'GET', 'resources/inventory/inventoryHistorySearch/search', 'excel']
				]
		),
		//荷主センタ変更対応 201７.02.15 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.15 sja End
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
 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
 *
 * @description
 * 棚卸履歴検索画面コントローラ
 */
.controller('InventoryHistorySearch', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'inventoryHistorySearchApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var oldWarehouse;
	var newZoneList;

	//グリッドの列情報（デザイン用）
	$scope.bodyListCols =
		[
			{field:"tinventoryh.inventoryDt", displayName:"棚卸日"},
			{field:"mlocation.locationCd", displayName:"ロケーション"},
			{field:"mproduct.productCd", displayName:"商品CD"},
		    // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
			{field:"mproduct.janCd", displayName:"JANCD"},
		    // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
			{field:"mproduct.productNm", displayName:"商品名称"},
			{field:"mproduct.productAbbr", displayName:"商品略称"},
			{field:"storeLabelNo", displayName:"入庫ラベルNo."},
			{field:"tstoreNo.mcustomer.customerCd", displayName:"仕入先名称CD"},
			{field:"tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
			{field:"tstoreNo.mcustomer.customerAbbr", displayName:"仕入先略称"},
			{field:"lot", displayName:"ロット"},
			{field:"limitDt", displayName:"期限日"},
			{field:"mcustomerByDepositId.customerCd", displayName:"預託CD"},
			{field:"mcustomerByDepositId.customerNm", displayName:"預託名称"},
			{field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
			{field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
			{field:"unitNum", displayName:"ケース入数"},
			{field:"chargeNum", displayName:"棚卸前引当可能数"},
			{field:"allocNum", displayName:"棚卸前引当済数"},
			{field:"moveNum", displayName:"棚卸前移動中数"},
			{field:"inventoryBeforeCaseNum", displayName:"棚卸前ケース数"},
			{field:"inventoryBeforePieceNum", displayName:"棚卸前ピース数"},
			{field:"inventoryNum", displayName:"棚卸数量"},
			{field:"inventoryCaseNum", displayName:"棚卸ケース数"},
			{field:"inventoryPieceNum", displayName:"棚卸ピース数"},
			{field:"updUser", displayName:"入力者"},
			{field:"updDt", displayName:"入力時間"},
			//荷主センタ変更対応 201７.02.14 sja Start
			{field:"tinventoryH.mclient.clientCd", displayName:"荷主ＣＤ"},
			{field:"tinventoryH.mclient.clientNm", displayName:"荷主名称"},
			{field:"tinventoryH.mcenter.centerCd", displayName:"センタＣＤ"},
			{field:"tinventoryH.mcenter.centerNm", displayName:"センタ名称"}
			//荷主センタ変更対応 201７.02.14 sja End
		];

	// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生(model名一括置換) 2017.03.06 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#initScreen
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

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

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 Start
		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.inventoryH.mclient.clientCd;
		};
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 End
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
			if (oldClient != $scope.searchCondition.inventoryH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};

		// 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldWarehouse = $scope.searchCondition.inventoryB.mwarehouse.warehouseCd;
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
			if (oldWarehouse != $scope.searchCondition.inventoryB.mwarehouse.warehouseCd) {
				// 選択した倉庫で取得済みのゾーンリストを設定
				setZoneList(newZoneList, true);
			}
		};
		// ロケーション大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
        	var fromValueString = fromValue;
        	var toValueString = toValue;
        	//if (fromValueString == null || toValueString == null) {
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
        $scope.fromToDtMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

     // [#6968][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.13 tsuboi Start
        $scope.bodyList= [];
     // [#6968][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.13 tsuboi End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	//荷主センタ変更対応 201７.02.15 sja Start
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
	//荷主センタ変更対応 201７.02.15 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
		request.clientCd = $scope.searchCondition.inventoryH.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
		request.clientCd = $scope.searchCondition.inventoryH.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#deferredGetZoneList
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
		request.centerCd = $scope.searchCondition.inventoryH.mcenter.centerCd;
		request.warehouseCd = $scope.searchCondition.inventoryB.mwarehouse.warehouseCd;


		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#initScreenHttp
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//荷主センタ変更対応 201７.02.15 sja Start
		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetWarehouseCdList()
				 ]
		)
		.then(function(response) {
		// 画面初期化データ設定（同期処理）
		return $scope.deferredGetInitData();
		});
		//荷主センタ変更対応 201７.02.15 sja End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#deferredGetInitData
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * 棚卸履歴検索初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.inventoryHistorySearchList.init().then(function(response){
			//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI Start
			$scope.paging = response.paging;
			//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI End
			$scope.searchCondition = {};
			$scope.searchCondition.inventoryH = response.data.head;
			$scope.searchCondition.inventoryB = response.data.body;
			$scope.searchCondition.inventoryI = response.data.inst;
			$scope.searchCondition.mproduct = response.data.mpro;
			$scope.searchCondition.inventoryH.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.inventoryH.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.inventoryH.inventoryDtFrom = userInfo.systemDt;
			$scope.searchCondition.inventoryH.inventoryDtTo = userInfo.systemDt;
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.05 衛 Start
			// 荷主変更後処理
			$scope.changeClient(true);
			//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.05 衛 End
			// ゾーン
			$scope.deferredGetZoneList()
			.then(function(response){
				setZoneList(response.data, true);
			});
			//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI Start
			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI End
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

	//荷主センタ変更対応 201７.02.15 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.inventoryH) {
			request.centerId = userInfo.centerIdByCd($scope.inventoryH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.15 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#changeClient
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
		//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 Start
		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			// 選択肢が一つの場合は一つ目を設定
			if ($scope.depositStockTypeList.length == 1) {
				$scope.searchCondition.inventoryB.mcustomerByDepositId.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.searchCondition.inventoryB.mcustomerByDepositId.customerCd = null;
			}
		} else {
			$scope.searchCondition.inventoryB.mcustomerByDepositId.customerCd = null;
		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.StockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//			if ($scope.stockTypeList.length > 0) {
//				$scope.searchCondition.inventoryB.mstockType.stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
//			}
//		}
	};
	//[横並-179]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.03 衛 End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#changeWarehouse
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#productBlur
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.inventoryH.mclient.clientCd);
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
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#showProduct
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.searchCondition.inventoryH.mclient.clientCd,
				productCd: $scope.searchCondition.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.mproduct.productCd =  selectedItem.productCd;
			$scope.searchCondition.mproduct.productNm =  selectedItem.productNm;
			$scope.searchCondition.mproduct.productAbbr =  selectedItem.productAbbr;
			$scope.searchCondition.mproduct.janCd =  selectedItem.janCd;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#showLocation
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.searchCondition.inventoryI.fromLocationCd;
		} else {
			inLocationCd = $scope.searchCondition.inventoryI.toLocationCd;
		}

		var items = {
				centerCd: $scope.searchCondition.inventoryH.mcenter.centerCd,
				locationCd: inLocationCd,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.searchCondition.inventoryB.mwarehouse.warehouseCd,
				zoneCd: $scope.searchCondition.inventoryI.mzone.zoneCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.searchCondition.inventoryI.fromLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.searchCondition.inventoryI.fromLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.searchCondition.inventoryI.toLocationCd = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.searchCondition.inventoryI.toLocationNm = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#locationCdBlur
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
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
			locationCd = $scope.searchCondition.inventoryI.fromLocationCd;
		} else {
			locationCd = $scope.searchCondition.inventoryI.toLocationCd;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.inventoryH.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.searchCondition.inventoryI.fromLocationNm = response.data.mLocation.locationNm;
				}else{
					$scope.searchCondition.inventoryI.toLocationNm = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.searchCondition.inventoryI.fromLocationNm = null;
			}else{
				$scope.searchCondition.inventoryI.toLocationNm = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#excelOutput
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head =$scope.searchCondition.inventoryH;
		request.data.body = $scope.searchCondition.inventoryB;
		request.data.inst = $scope.searchCondition.inventoryI;
		request.data.mpro = $scope.searchCondition.mproduct;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);

		api.inventoryHistorySearchList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#search
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI Start
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#getPagingData
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI Start
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition.inventoryH;
		request.data.body = $scope.searchCondition.inventoryB;
		request.data.inst = $scope.searchCondition.inventoryI;
		request.data.mpro = $scope.searchCondition.mproduct;
		request.data.body.mstockType.stockTypeCd = $scope.searchCondition.inventoryB.mstockType.stockTypeCd;
		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.inventoryHistorySearchList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch#setPagingData
	 * @methodOf oneslogiWms.InventoryHistorySearch.object:InventoryHistorySearch
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-340] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-340] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.bodyList = response.data.bodyList;

		//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;//トータル件数を設定
		//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI End
		// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生 2017.03.06 kawana Start
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
		// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生 2017.03.06 kawana End
	};

	// 画面初期化処理を実行
	$scope.initScreen();
	//[ON推-品向-497] 矢印は押せないように修正 2014.12.26 KI End

	// [#1090] ブラウザの戻る⇒進むで再検索すると致命的エラー発生(model名一括置換) 2017.03.06 kawana End
}]);

