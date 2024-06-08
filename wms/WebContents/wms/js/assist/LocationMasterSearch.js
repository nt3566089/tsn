/**
 * @ngdoc overview
 * @name oneslogiWms.LocationMasterSearch
 *
 * @description
 * ロケーションマスタ検索画面<br>
 *
 * ロケーションマスタに対する検索を行う為の画面。
 */
angular.module('oneslogiWms.LocationMasterSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.LocationMasterSearch.service:locationMasterSearchApi
 *
 * @description
 * ロケーションマスタ検索画面操作用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * locationType ロケーション種別データ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * allocNgFlg 引当禁止フラグデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * locationMaster ロケーションマスタ検索データ操作用WebAPI<br>
 * ・resources/common/LocationMasterSearch/initNew 検索画面用初期データ取得WebAPI<br>
 * ・resources/common/LocationMasterSearch/search 検索WebAPI<br>
 */
.factory('locationMasterSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		warehouseList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End
		locationList: AngularAPIClient.make(
				[
				 ['initNew',             'GET',  'resources/assist/locationMasterSearch/initNew'],
				 ['search',              'GET',  'resources/assist/locationMasterSearch/search']
				 ]
		)
	}
}])

/**
 * @ngdoc object
 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
 *
 * @description
 * ロケーションマスタ検索画面<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('LocationMasterSearch', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'locationMasterSearchApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

	// グリッドの列情報（デザイン用）
	$scope.locationMasterSearchCols = [
	                                   {field:"locationCd", displayName:"ロケーションCD"},
	                                   {field:"locationNm", displayName:"ロケーション名称"},
	                                   {field:"locationType", displayName:"ロケーション種別CD"},
	                                   {field:"bclassDtlByLocationType.vdict.dictNm", displayName:"ロケーション種別名称"},
	                                   {field:"allocNgFlg", displayName:"引当禁止フラグCD"},
	                                   {field:"bclassDtlByAllocNgFlg.vdict.dictNm", displayName:"引当禁止フラグ名称"},
	                       			   //荷主センタ変更対応 201７.02.21 sja Start
	                                   {field:"mcenter.centerCd", displayName:"センタＣＤ"},
	                       	           {field:"mcenter.centerNm", displayName:"センタ名称"}
	                       			   //荷主センタ変更対応 201７.02.21 sja End
	                                   ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#initScreen
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'locationList',
			columnDefs: 'locationMasterSearchCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.gridSelectOptions = {
				"locationType" : {
					key : "classCd",
					value : "classNm",
					listModel : "locationTypeList"
				}
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#initScreenHttp
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
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
				 // [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
				 $scope.deferredGetWarehouseList(),
				 // [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End
				 // [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.28 kawana Start
				 $scope.deferredGetZoneList(),
				 // [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.28 kawana End
				 $scope.deferredGetLocationTypeList(),
				// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana Start
				 $scope.deferredGetPickingLocationFlgList(),
				// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana End
				 $scope.deferredGetAllocNgFlgList()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#deferredGetLocationTypeList
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * ロケーション種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLocationTypeList = function() {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOCATION_TYPE";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.locationTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#deferredGetPickingLocationFlgList
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * ロケーション種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPickingLocationFlgList = function() {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "PICKING_LOCATION_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.pickingLocationFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
	// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#deferredGetAllocNgFlgList
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * 引当禁止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAllocNgFlgList = function() {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "ALLC_NG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.allocNgFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#deferredGetWarehouseList
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		var centerCd = userInfo.centerCd;

		if($scope.head){
			centerCd = $scope.head.mcenter.centerCd;
		}

		request.centerId = userInfo.centerIdByCd(centerCd);

		api.warehouseList.keyValueList(request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#deferredGetZoneList
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description ゾーンリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function () {
		var deferred = $q.defer();

		var request = {};
		request.data = {};

		var centerCd = userInfo.centerCd;
		if($scope.head){
			centerCd = $scope.head.mcenter.centerCd;
		}
		request.centerCd = centerCd;

		var warehouseCd;
		if($scope.head){
			warehouseCd = $scope.head.mzone.mwarehouse.warehouseCd;
		}

		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示(不要な処理を削除) 2015.07.28 kawana

		request.warehouseCd = warehouseCd;

		api.zoneList.keyValueList(request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#warehouseChange
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description 倉庫変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.warehouseChange = function() {

		$scope.head.mzone.zoneCd = null;

		// ゾーン変更
		$scope.deferredGetZoneList().then(function(response){
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#centerChange
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description センタ変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerChange = function() {

		$scope.head.mzone.zoneCd = null;
		$scope.head.mzone.mwarehouse.warehouseCd = null;

		$q.all([
		        $scope.deferredGetWarehouseList(),
		        $scope.deferredGetZoneList(),
		]).then(function(response){
		});
	};

	// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#deferredGetInitData
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * ロケーションマスタ検索画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.locationList.initNew().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'locationMasterSearchform')) {
				deferred.reject();
				return;
			}

			$scope.head = response.data.head;
			$scope.locationList = response.data.list;
			$scope.paging = response.paging;
			// 参照元画面の情報を設定
			if (items) {
				$scope.head.locationCd = items.locationCd;
				$scope.head.mcenter.centerCd = items.centerCd;
				//荷主センタ変更対応 2017.03.07 sja Start
				if ($scope.head.mcenter.centerCd == null) {
					$scope.head.mcenter.centerCd = userInfo.centerCd;
				}
				$scope.deferredGetZoneList();
				//荷主センタ変更対応 2017.03.07 sja End
				// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
				if(items.centerCd){
					// センタ指定の場合は倉庫リスト変更
					$scope.deferredGetWarehouseList(items).then(function(response){

						if(items.warehouseCd){
							// 倉庫指定の場合はゾーンリスト変更
							$scope.head.mzone.mwarehouse.warehouseCd = items.warehouseCd;
							$scope.deferredGetZoneList(items).then(function(response){
								$scope.head.mzone.zoneCd = items.zoneCd;
							});
						}
					});
				}
				// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End
			}

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 tsuboi Delete

			owsCommon.setFirstFocus("locationMasterSearchform");
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#gridDblClick
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("selection", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#search
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索処理<br>
	 * ・商品マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.locationList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'locationMasterSearchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#setPagingData
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {

		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-375] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-375] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.locationList = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#modalClose
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */
	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearch.object:LocationMasterSearch#selectClose
	 * @methodOf oneslogiWms.LocationMasterSearch.object:LocationMasterSearch
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.selectClose = function(){
		$modalInstance.close($scope.gridOptions.gridApi.selection.getSelectedRows()[0]);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
