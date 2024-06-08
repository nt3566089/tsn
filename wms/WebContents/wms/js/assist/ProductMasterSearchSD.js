/**
 * @ngdoc overview
 * @name oneslogiWms.ProductMasterSearchSD
 *
 * @description
 * SD用商品マスタ検索画面<br>
 */
angular.module('oneslogiWms.ProductMasterSearchSD', [])

// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
/**
 * @ngdoc service
 * @name oneslogiWms.ProductMasterSearchSD.service:productMasterSearchSDApi
 *
 * @description
 * SD用商品マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * productMasterSearchSD 商品マスタデータ操作用WebApi<br>
 * ・resources/common/productMasterSearchSD/initNew 初期化用WebApi<br>
 * ・resources/common/productMasterSearchSD/search 検索用WebApi<br>
 *
 */
.factory('productMasterSearchSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		productStatus: AngularAPIClient.make([
		                                      ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                      ]
		),
		productMasterSearchSD: AngularAPIClient.make(
				[
				 ['initNew', 'GET',  'resources/assist/productMasterSearchSD/initNew'],
				 ['search', 'GET',  'resources/assist/productMasterSearchSD/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
 *
 * @description
 * SD用商品マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ProductMasterSearchSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicPopup', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterSearchSDApi',
                              function($scope,   $state,   $filter,   $location,   $q,   $ionicPopup,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   api){

	//グリッドの列情報（デザイン用）
	$scope.productListCols =
		[
		 {field:"productCd", displayName:"商品CD"},
		 {field:"productNm", displayName:"商品名称"},
		 {field:"janCd", displayName:"JANCD"},
		 {field:"productAbbr", displayName:"商品略称"},
		 {field:"lotManagFlg", displayName:"ロット管理フラグ"},
		 {field:"bclassDtlByLotManagFlg.vdict.dictNm", displayName:"ロット逆転防止フラグ名称"},
		 {field:"lotReverseFlg", displayName:"ロット逆転防止フラグ"},
		 {field:"bclassDtlByLotReverseFlg.vdict.dictNm", displayName:"ロット逆転防止フラグ名称"},
		 {field:"limitDtManagFlg", displayName:"期限日管理フラグ"},
		 {field:"bclassDtlByLimitDtManagFlg.vdict.dictNm", displayName:"期限日管理フラグ名称"},
		 {field:"limitDtReverseFlg", displayName:"期限日逆転防止フラグ"},
		 {field:"bclassDtlByLimitDtReverseFlg.vdict.dictNm", displayName:"期限日逆転防止フラグ名称"},
		 {field:"receiveLimitNum", displayName:"入荷期限日数"},
		 {field:"shippingLimitNum", displayName:"出荷期限日数"},
		 {field:"mergeCls", displayName:"入庫No.マージ区分"},
		 {field:"bclassDtlByMergeCls.vdict.dictNm", displayName:"入庫No.マージ区分名称"},
		 {field:"shippingStopFlg", displayName:"出荷停止フラグ"},
		 {field:"bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"出荷停止フラグ名称"}
		 ];

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
	var popupHtml = '<ion-header-bar class="bar-positive" align-title="center">' +
						'<button class="button button-icon ion-android-close" ng-click="closePopup();"></button>' +
					    '<h1 class="title">{{multiSelect.title}}</h1>' +
					    '<button class="button button-icon ion-android-done" ng-click="saveAndSearch()"></button>' +
					'</ion-header-bar>' +
					'<ion-content>' +
						'<owd-select id="clientCd" ng-model="tempProductSearch.mclient.clientCd" owd-models="clientList" owd-repeat-key="clientCd" owd-repeat-value="clientNm" label-text="荷主" owd-remove-blank></owd-select>' +
						'<owd-text id="productCd" ng-model="tempProductSearch.productCd" label-text="商品CD" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
						'<owd-text id="productNm" ng-model="tempProductSearch.productNm" label-text="商品名称" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
						'<owd-text id="janCd" ng-model="tempProductSearch.janCd" label-text="JANコード" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
					'</ion-content>';
	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End
	$scope.popup = {
    		title: $scope.screenTitle
    	};

    	$scope.showPopup = function () {
			alertMessage.removeModalAlert('ProductMasterSearchSD');
    		$scope.tempProductSearch = angular.copy($scope.productSearch);
    		$scope.myPopup = $ionicPopup.show({
    			template: popupHtml,
    			scope: $scope
    		});
    	}

    	$scope.saveAndSearch = function () {
    		$scope.productSearch = $scope.tempProductSearch;
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
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#initScreen
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッドをページングするように設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {
		$scope.searchResult = {};

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();
		$scope.paging = {};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#initScreenHttp
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 * ・受信後、ページングオプション変更時ファンクションを設定
	 */
	$scope.initScreenHttp = function() {

		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetInitData()
				 ])
				 .then(function() {
					 $scope.search();
				 });

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#deferredGetInitData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 商品マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.productMasterSearchSD.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'productMasterSearchSDform')) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
				deferred.reject();
				return;
			}

			$scope.productSearch = response.data.head;
			$scope.productList = response.data.list;
			$scope.paging = response.paging;

			// 参照元画面の情報を設定
			if ($scope.items) {
				$scope.productSearch.mclient.clientCd = $scope.items.clientCd;
				$scope.productSearch.productCd = $scope.items.productCd;
			}

			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			owsCommon.setFirstFocus("productMasterSearchSDform");
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#gridDblClick
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("selection", row);
	  };

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
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

	  $scope.select = function(index) {
		  var selectedItem = $scope.productList[index]
		  if(!$scope.detailScreen) {
			  $scope.$emit('modalProductReturn', selectedItem);
		  }
		  else {
			  $scope.$emit('detailProductReturn', selectedItem);
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#search
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.productList = [];
		$scope.lastLoaded = 0;
		$scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
	 *
	 * @description
	 * 検索処理<br>
	 * ・SD用商品マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.productSearch;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if(page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		api.productMasterSearchSD.search(request).then(function(response) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			statusInfo.isSuccessAndShowMessage(response, 'productMasterSearchSDform');
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			$scope.setPagingData(response, page, pageSize);
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD#setPagingData
	 * @methodOf oneslogiWms.ProductMasterSearchSD.object:ProductMasterSearchSD
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//取得データをグリッドに反映
		$scope.productList = $scope.productList.concat(response.data.list);
		//　まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;
	};

// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End

	//画面初期化処理を実行
	$scope.initScreen();
}]);