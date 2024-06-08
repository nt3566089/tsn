/**
 * @ngdoc overview
 * @name oneslogiWms.LocationMasterSearchSD
 *
 * @description
 * SD用ロケーションマスタ検索画面<br>
 *
 * ロケーションマスタに対する検索を行う為の画面。
 */
angular.module('oneslogiWms.LocationMasterSearchSD', [])

// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
/**
 * @ngdoc service
 * @name oneslogiWms.LocationMasterSearchSD.service:locationMasterSearchSDApi
 *
 * @description
 * SD用ロケーションマスタ検索画面操作用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * locationType ロケーション種別データ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * allocNgFlg 引当禁止フラグデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * locationMaster SD用ロケーションマスタ検索データ操作用WebAPI<br>
 * ・resources/common/LocationMasterSearchSD/initNew 検索画面用初期データ取得WebAPI<br>
 * ・resources/common/LocationMasterSearchSD/search 検索WebAPI<br>
 */
.factory('locationMasterSearchSDApi', ['AngularAPIClient', function(AngularAPIClient) {
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
				 ['initNew',             'GET',  'resources/assist/locationMasterSearchSD/initNew'],
				 ['search',              'GET',  'resources/assist/locationMasterSearchSD/search']
				 ]
		)
	}
}])

/**
 * @ngdoc object
 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
 *
 * @description
 * SD用ロケーションマスタ検索画面<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('LocationMasterSearchSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicPopup', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'locationMasterSearchSDApi',
                               function($scope,   $state,   $filter,   $location,   $q,   $ionicPopup,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   api) {

	// グリッドの列情報（デザイン用）
	$scope.locationMasterSearchCols = [
	                                   {field:"locationCd", displayName:"ロケーションCD"},
	                                   {field:"locationNm", displayName:"ロケーション名称"},
	                                   {field:"locationType", displayName:"ロケーション種別CD"},
	                                   {field:"bclassDtlByLocationType.vdict.dictNm", displayName:"ロケーション種別名称"},
	                                   {field:"allocNgFlg", displayName:"引当禁止フラグCD"},
	                                   {field:"bclassDtlByAllocNgFlg.vdict.dictNm", displayName:"引当禁止フラグ名称"}
	                                   ];

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
	var popupHtml = '<ion-header-bar class="bar-positive" align-title="center">' +
						'<button class="button button-icon ion-android-close" ng-click="closePopup();"></button>' +
					    '<h1 class="title">{{multiSelect.title}}</h1>' +
					    '<button class="button button-icon ion-android-done" ng-click="saveAndSearch()"></button>' +
					'</ion-header-bar>' +
					'<ion-content>' +
						'<owd-select id="centerCd" ng-model="tempHead.mcenter.centerCd" owd-models="centerList" owd-repeat-key="centerCd" owd-repeat-value="centerNm" label-text="センタ" ng-change="centerChange()"></owd-select>' +
						'<owd-select id="warehouse" ng-model="tempHead.mzone.mwarehouse.warehouseCd" owd-models="warehouseList" owd-repeat-key="warehouseCd" owd-repeat-value="warehouseNm" label-text="倉庫" ng-change="warehouseChange()" ></owd-select>' +
						'<owd-select id="zone" ng-model="tempHead.mzone.zoneCd" owd-models="zoneList" owd-repeat-key="zoneCd" owd-repeat-value="zoneNm" label-text="ゾーン"></owd-select>' +
						'<owd-text id="locationCd" ng-model="tempHead.locationCd" label-text="ロケーションCD" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
						'<owd-select id="locationType" ng-model="tempHead.locationType" owd-models="locationTypeList" owd-repeat-key="classCd" owd-repeat-value="classNm" label-text="ロケーション種別"></owd-select>' +
						'<owd-select id="pickingLocationFlg" ng-model="tempHead.pickingLocationFlg" owd-models="pickingLocationFlgList" owd-repeat-key="classCd" owd-repeat-value="classNm" label-text="ピックロケフラグ"></owd-select>' +
					'</ion-content>';
	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End

	$scope.popup = {
    		title: $scope.screenTitle
    	};

    	$scope.showPopup = function () {
    		alertMessage.removeModalAlert('LocationMasterSearchSD');
    		$scope.tempHead = angular.copy($scope.head);
    		$scope.myPopup = $ionicPopup.show({
    			template: popupHtml,
    			scope: $scope
    		});
    	}

    	$scope.saveAndSearch = function () {
    		$scope.head = $scope.tempHead;
    		$scope.search();
    		$scope.closePopup();
    	}

    	$scope.closePopup = function() {
    		$scope.myPopup.close();
    	}

    	$scope.$on('$destroy', function() {
    		if($scope.myPopup){
    			$scope.myPopup.close();
    		}
    	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#initScreen
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		$scope.searchResult = {};

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();
		$scope.paging = {};

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
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#initScreenHttp
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		/*$q.all(
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
				 });*/
		/*$q.all([$scope.getInitData()])
		.then.then(function(responseList){

		});*/
//		$scope.deferredGetInitData();

		$q.all(
				[
				 // [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.28 kawana Start
				 $scope.deferredGetZoneList(),
				 // [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.28 kawana End
				 $scope.deferredGetLocationTypeList(),
				// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana Start
				 $scope.deferredGetPickingLocationFlgList()
				// [1.1.4-CT-060] 検索条件、結果にピックロケフラグを追加 2016.05.25 kawana End
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#deferredGetLocationTypeList
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
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
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#deferredGetPickingLocationFlgList
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
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
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#deferredGetAllocNgFlgList
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
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
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#deferredGetWarehouseList
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		var centerCd = userInfo.centerCd;

		if($scope.tempHead){
			centerCd = $scope.tempHead.mcenter.centerCd;
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
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#deferredGetZoneList
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description ゾーンリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function (items) {
		var deferred = $q.defer();

		var request = {};
		request.data = {};

		var centerCd = userInfo.centerCd;
		if (items) {
			if (items.centerCd) {
				centerCd = items.centerCd;
			}
		}

		if($scope.tempHead){
			centerCd = $scope.tempHead.mcenter.centerCd;
		}
		request.centerCd = centerCd;

		var warehouseCd;
		if(items){
			if(items.warehouseCd){
				warehouseCd = items.warehouseCd;
			}
		}
		if($scope.tempHead){
			warehouseCd = $scope.tempHead.mzone.mwarehouse.warehouseCd;
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
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#warehouseChange
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description 倉庫変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.warehouseChange = function() {

		$scope.tempHead.mzone.zoneCd = null;

		// ゾーン変更
		$scope.deferredGetZoneList().then(function(response){
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#centerChange
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description センタ変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerChange = function() {

		$scope.tempHead.mzone.zoneCd = null;
		$scope.tempHead.mzone.mwarehouse.warehouseCd = null;

		$q.all([
		        $scope.deferredGetWarehouseList(),
		        $scope.deferredGetZoneList(),
		]).then(function(response){
		});
	};

	// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#deferredGetInitData
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description
	 * SD用ロケーションマスタ検索画面初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.locationList.initNew().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'locationMasterSearchSDform')) {
				deferred.reject();
				return;
			}

			$scope.head = response.data.head;
			$scope.locationList = response.data.list;
			$scope.paging = response.paging;
			$scope.head.mcenter.centerCd = userInfo.centerCd;

			// 参照元画面の情報を設定
			if ($scope.items) {
				$scope.head.locationCd = $scope.items.locationCd;

				// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana Start
				if($scope.items.centerCd){

					$scope.head.mcenter.centerCd = $scope.items.centerCd;

					if($scope.items.warehouseCd){
						$scope.head.mzone.mwarehouse.warehouseCd = $scope.items.warehouseCd;
					}

					if($scope.items.zoneCd){
						$scope.head.mzone.zoneCd = $scope.items.zoneCd;
					}
					// センタ指定の場合は倉庫リスト変更
					$scope.deferredGetWarehouseList($scope.items).then(function(response){

						if($scope.items.warehouseCd){
							// 倉庫指定の場合はゾーンリスト変更
							$scope.head.mzone.mwarehouse.warehouseCd = $scope.items.warehouseCd;
							$scope.deferredGetZoneList($scope.items).then(function(response){
								if($scope.items.zoneCd){
									$scope.head.mzone.zoneCd = $scope.items.zoneCd;
								}
							});
						}
					});
				}
				// [C-CWMS-0028] 検索条件に倉庫、ゾーンを追加 2015.06.05 kawana End
			}

			owsCommon.setFirstFocus("locationMasterSearchSDform");

			$scope.search();
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#gridDblClick
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("selection", row);
	  };


	  $scope.select = function(index) {
		  var selectedItem = $scope.locationList[index]
		  if(!$scope.detailScreen) {
			  $scope.$emit('modalLocationReturn', selectedItem);
		  }
		  else {
			  $scope.$emit('detailModalLocationReturn', selectedItem);
		  }
		  $scope.closeModal();
	  }

	  $scope.moreDataCanBeLoaded = function() {
		  return $scope.paging.isExistNextPage;
	  }
	  $scope.loadMoreData = function() {
		  if($scope.searchResult.preventDoubleLoad) {
			  $scope.searchResult.preventDoubleLoad = false;
		  }
		  else {
			  $scope.pagingOptions.lastCurrentPage = $scope.pagingOptions.currentPage;
			  $scope.pagingOptions.currentPage = $scope.pagingOptions.currentPage + 1;
			  $scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);

			  $scope.searchResult.preventDoubleLoad = true;
		  }
		  $scope.$broadcast('scroll.infiniteScrollComplete');
	  }

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.LocationMasterSearchSD.object:LocationMasterSearchSD
	 *
	 * @description
	 * 入力可能項目のフォーカス処理<br>
	 *
	 * 値を全選択状態にする。
	 */
	$scope.inputValueAllSelectOnFocus = function($event) {
		owsCommon.valueAllSelectOnFocus($event);
	}
	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Add End

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
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.locationList = [];
		$scope.lastLoaded = 0;
		$scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
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

		if(page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.locationList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'locationMasterSearchSDform');
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
		// 取得データをグリッドに反映
		$scope.locationList = $scope.locationList.concat(response.data.list);
		// まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		// トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;
	};

	// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);