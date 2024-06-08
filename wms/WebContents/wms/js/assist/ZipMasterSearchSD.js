/**
 * @ngdoc overview
 * @name oneslogiWms.ZipMasterSearchSD
 *
 * @description
 * SD用郵便番号マスタ検索画面<br>
 *
 * 郵便番号マスタ検索を行う為の画面。
 */
angular.module('oneslogiWms.ZipMasterSearchSD', [])

// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
/**
 * @ngdoc service
 * @name oneslogiWms.ZipMasterSearchSD.service:zipMasterSearchSDApi
 *
 * @description
 * SD用郵便番号マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * company 大口事業所フラグデータ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList<br>
 * <br>
 * ZipMaster SD用郵便番号マスタデータ操作用WebApi<br>
 * ・resources/common/zipMasterSearchSD/initNew 初期処理WebAPI<br>
 * ・resources/common/zipMasterSearchSD/search 検索WebAPI<br>
 */
.factory('zipMasterSearchSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		zipMasterList: AngularAPIClient.make(
				[
				 ['initNew',        'GET',  'resources/assist/zipMasterSearchSD/initNew'],
				 ['search',         'GET',  'resources/assist/zipMasterSearchSD/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
 *
 * @description
 * SD用郵便番号マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ZipMasterSearchSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicPopup', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'zipMasterSearchSDApi',
                          function($scope,   $state,   $filter,   $location,   $q,   $ionicPopup,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   api){

	// グリッドの列情報（デザイン用）
	$scope.zipMasterSearchCols = [
	                              {field:"zipCd", displayName:"郵便番号"},
	                              {field:"address1", displayName:"都道府県"},
	                              {field:"address2", displayName:"市区町村"},
	                              {field:"companyFlg", displayName:"大口事業所フラグCD"},
	                              {field:"bclassDtlByCompanyFlg.vdict.dictNm", displayName:"大口事業所フラグ名称"}
	                              ];

	// 【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
	var popupHtml = '<ion-header-bar class="bar-positive" align-title="center">' +
						'<button class="button button-icon ion-android-close" ng-click="closePopup();"></button>' +
					    '<h1 class="title">{{multiSelect.title}}</h1>' +
					    '<button class="button button-icon ion-android-done" ng-click="saveAndSearch()"></button>' +
					'</ion-header-bar>' +
					'<ion-content>' +
						'<owd-text id="zipCd" ng-model="tempHead.zipCd" label-text="郵便番号" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
						'<owd-text id="address1" ng-model="tempHead.address1" label-text="都道府県" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
						'<owd-text id="address2" ng-model="tempHead.address2" label-text="市区町村" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
					'</ion-content>';
	// 【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End
	$scope.popup = {
   		title: $scope.screenTitle
   	};

   	$scope.showPopup = function () {
		alertMessage.removeModalAlert('ZipMasterSearchSD');
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
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#initScreen
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件を表示状態に変更
		$scope.isopen = true;

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();
		$scope.paging = {};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#initScreenHttp
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 * ・受信後、ページングオプション変更時ファンクションを設定
	 */
	$scope.initScreenHttp = function() {
		$scope.searchResult = {};

		//各種通信用関数を配列で指定
		$q.all([$scope.getInitData()])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(zipMasterList){
			$scope.head = zipMasterList[0].data.head;
			$scope.paging = zipMasterList[0].paging;

			// 参照元画面の情報を設定
			if ($scope.items) {
				$scope.head.zipCd = $scope.items.zipCd;
			}

			$scope.search();
			owsCommon.setFirstFocus("zipMasterSearchSDform");
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#getInitData
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
	 *
	 * @description
	 * 画面初期化用の初期化データ取得処理<br>
	 * ・画面初期化用WebAPIの呼び出し定義
	 */
	$scope.getInitData = function() {
		var defferd = $q.defer();

		api.zipMasterList.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'zipMasterSearchSDform')) {
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
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#gridDblClick
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
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
		  var selectedItem = $scope.zipMasterList[index]
		  if(!$scope.detailScreen) {
			  $scope.$emit('modalZipReturn', selectedItem);
		  }
		  else {
			  $scope.$emit('detailModalZipReturn', selectedItem);
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
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
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
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#search
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.zipMasterList = [];
		$scope.lastLoaded = 0;
		$scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#getPagedDataAsync
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
	 *
	 * @description
	 * 検索処理<br>
	 * ・SD用郵便番号マスタ検索用WebAPIの呼び出し定義<br>
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
		api.zipMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'zipMasterSearchSDform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD#setPagingData
	 * @methodOf oneslogiWms.ZipMasterSearchSD.object:ZipMasterSearchSD
	 *
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//取得データをグリッドに反映
		$scope.zipMasterList = $scope.zipMasterList.concat(response.data.body);
		//　まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;
	};

	// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End

	//画面初期化処理を実行
	$scope.initScreen();

}]);