/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryMasterSearchSD
 *
 * @description
 * SD用納品先マスタ検索画面<br>
 *
 * SD用納品先マスタ対する検索を行う為の画面。
 */
angular.module('oneslogiWms.DeliveryMasterSearchSD', [])

// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryMasterSearchSD.service:deliveryMasterSearchSDApi
 *
 * @description
 * SD用納品先マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * deliveryMaster SD用納品先マスタデータ操作用WebAPI<br>
 * ・resources/assist/deliveryMasterSearchSD/initNew 初期処理WebAPI<br>
 * ・resources/assist/deliveryMasterSearchSD/search 検索WebAPI<br>
 */
.factory('deliveryMasterSearchSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		deliveryMaster: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/assist/deliveryMasterSearchSD/initNew'],
				 ['search',             'GET',  'resources/assist/deliveryMasterSearchSD/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
 *
 * @description
 * SD用納品先マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DeliveryMasterSearchSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicPopup', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'deliveryMasterSearchSDApi',
                               function($scope,   $state,   $filter,   $location,   $q,   $ionicPopup,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   api) {

	// グリッドの列情報（デザイン用）
	$scope.deliveryMasterCols = [
	                             {field:"customerCd", displayName:"納品先CD"},
	                             {field:"customerNm", displayName:"納品先名称"},
	                             {field:"customerAbbr", displayName:"納品先略称"},
	                             {field:"address1", displayName:"住所１"},
	                             {field:"zipCd", displayName:"郵便番号"},
	                             {field:"telNo", displayName:"電話番号"}
	                             ];

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
	var popupHtml = '<ion-header-bar class="bar-positive" align-title="center">' +
						'<button class="button button-icon ion-android-close" ng-click="closePopup();"></button>' +
					    '<h1 class="title">{{multiSelect.title}}</h1>' +
					    '<button class="button button-icon ion-android-done" ng-click="saveAndSearch()"></button>' +
					'</ion-header-bar>' +
					'<ion-content>' +
						'<owd-select id="clientCd" ng-model="tempHead.mclient.clientCd" owd-models="clientList" owd-repeat-key="clientCd" owd-repeat-value="clientNm" label-text="荷主"></owd-select>' +
						'<owd-text id="deliveryCd" ng-model="tempHead.customerCd" label-text="納品先CD" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
						'<owd-text id="deliveryNm" ng-model="tempHead.customerNm" label-text="納品先名称" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
					'</ion-content>';
	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End

	$scope.popup = {
    		title: $scope.screenTitle
    	};

    	$scope.showPopup = function () {
			alertMessage.removeModalAlert('DeliveryMasterSearchSD');
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
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#initScreen
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		$scope.searchResult = {};

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();
		$scope.paging = {};

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 * ・受信後、ページングオプション変更時ファンクションを設定
	 */
	$scope.initScreenHttp = function() {

		//各種通信用関数を配列で指定
		$q.all([$scope.getInitData()])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(responseList){
			$scope.head = responseList[0].data.head;
			$scope.paging = responseList[0].paging;

			// 参照元画面の情報を設定
			if ($scope.items) {
				$scope.head.mclient.clientCd = $scope.items.clientCd;
				$scope.head.customerCd = $scope.items.deliveryCd;
			}

			$scope.search();
			owsCommon.setFirstFocus("deliveryMasterSearchSDform");
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#getInitData
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
	 *
	 * @description
	 * 画面初期化用の初期化データ取得処理<br>
	 * ・画面初期化用WebAPIの呼び出し定義
	 */
	$scope.getInitData = function() {
		var defferd = $q.defer();
		api.deliveryMaster.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'deliveryMasterSearchSDform')) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
				deferred.reject();
				return;
			}

			defferd.resolve(response);
		});
		return defferd.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#gridDblClick
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
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
		  var selectedItem = $scope.list[index]
		  if(!$scope.detailScreen) {
			  $scope.$emit('modalDeliveryReturn', selectedItem);
		  }
		  else {
			  $scope.$emit('detailModalDeliveryReturn', selectedItem);
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
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
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
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#search
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.list = [];
		$scope.lastLoaded = 0;
		$scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#getPagedDataAsync
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
	 *
	 * @description
	 * 検索処理<br>
	 * ・SD用納品先マスタ検索用WebAPIの呼び出し定義<br>
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
		api.deliveryMaster.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'deliveryMasterSearchSDform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD#setPagingData
	 * @methodOf oneslogiWms.DeliveryMasterSearchSD.object:DeliveryMasterSearchSD
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//取得データをグリッドに反映
		$scope.list = $scope.list.concat(response.data.list);
		//　まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;
	};

	// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End

	//画面初期化処理を実行
	$scope.initScreen();
}]);