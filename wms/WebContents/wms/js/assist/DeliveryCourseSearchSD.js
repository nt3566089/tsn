/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryCourseSearchSD
 *
 * @description
 * SD用配送コースマスタ検索画面<br>
 *
 * SD用配送コースマスタデータ検索画面 選択画面。
 */
angular.module('oneslogiWms.DeliveryCourseSearchSD', [])

// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryCourseSearchSD.service:deliveryCourseSearchSDApi
 *
 * @description
 * SD用配送コースマスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */

.factory('deliveryCourseSearchSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		deliveryCourseSD: AngularAPIClient.make(
				[
				 ['initNew',             'GET',  'resources/assist/deliveryCourseSearchSD/initNew'],
				 ['search',              'GET',  'resources/assist/deliveryCourseSearchSD/search']
				 ]
		)
	}
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
 *
 * @description
 * 配送コース画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DeliveryCourseSearchSD', ['$scope', '$state', '$filter', '$location', '$q','$ionicPopup', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'deliveryCourseSearchSDApi'
                             , function($scope,   $state,   $filter,   $location,   $q,  $ionicPopup,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   api) {

	// グリッドの列情報（デザイン用）
	$scope.deliveryCourseSearchCols = [
	                                   {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                   {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                   {field:"mcarrier.carrierCd", displayName:"運送業者CD"},
	                                   {field:"mcarrier.carrierNm", displayName:"運送業者名称"},
	                                   {field:"mcarrier.carrierAbbr", displayName:"運送業者略称"},
	                                   {field:"pinkingTime", displayName:"出庫開始時刻"},
	                                   {field:"stowageTime", displayName:"積込予定時刻"},
	                                   {field:"shippingTime", displayName:"出荷予定時刻"},
	                                   ];

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
	var popupHtml = '<ion-header-bar class="bar-positive" align-title="center">' +
						'<button class="button button-icon ion-android-close" ng-click="closePopup();"></button>' +
					    '<h1 class="title">{{multiSelect.title}}</h1>' +
					    '<button class="button button-icon ion-android-done" ng-click="saveAndSearch()"></button>' +
					'</ion-header-bar>' +
					'<ion-content>' +
						'<owd-select id="centerCd" ng-model="tempHead.mcenter.centerCd" owd-models="centerList" owd-repeat-key="centerCd" owd-repeat-value="centerNm" label-text="センタ"></owd-select>' +
	                    '<owd-text id="deliveryCourseCd" ng-model="tempHead.deliveryCourseCd" label-text="配送コースCD" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
	                    '<owd-text id="deliveryCourseNm" ng-model="tempHead.deliveryCourseNm" label-text="配送コース名称" ng-focus="inputValueAllSelectOnFocus($event)"></owd-text>' +
					'</ion-content>';
	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End

	$scope.popup = {
		title: $scope.screenTitle
	};

	$scope.showPopup = function () {
		alertMessage.removeModalAlert('DeliveryCourseSearchSD');
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
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#initScreen
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		$scope.searchResult = {};

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();
		$scope.paging = {};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 * @description
	 * 検索画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
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
				$scope.head.mcenter.centerCd = $scope.items.centerCd;
				$scope.head.deliveryCourseCd = $scope.items.deliveryCourseCd;
			}

			$scope.search();
			owsCommon.setFirstFocus("deliveryCourseSearchform");
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#getInitData
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 *
	 * @description
	 * 画面初期化用の初期化データ取得処理<br>
	 * ・画面初期化用WebAPIの呼び出し定義
	 */
	$scope.getInitData = function() {
		var defferd = $q.defer();
		api.deliveryCourseSD.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'deliveryCourseSearchSDform')) {
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
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#gridDblClick
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
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
		  var selectedItem = $scope.deliveryCourse[index]
		  if(!$scope.detailScreen) {
			  $scope.$emit('modalDeliveryCourseReturn', selectedItem);
		  }
		  else {
			  $scope.$emit('detailModalDeliveryCourseReturn', selectedItem);
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
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
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
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#search
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.deliveryCourse = [];
		$scope.lastLoaded = 0;
		$scope.getPagedDataAsync($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#getPagedDataAsync
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 * @description
	 * 検索処理<br>
	 * ・SD用配送コースマスタ検索用WebAPIの呼び出し定義<br>
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
		api.deliveryCourseSD.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'deliveryCourseSearchSDform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#setPagingData
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//取得データをグリッドに反映
		$scope.deliveryCourse = $scope.deliveryCourse.concat(response.data.list);
		//　まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.DeliveryCourseSearchSD.object:DeliveryCourseSearchSD
	 * @description
	 * 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReceiveStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELIVERY_COURSE_STATUS";

		api.receiveStatus.query(request).then(function(response){
			$scope.deliveryCourse = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End

	//画面初期化処理を実行
	$scope.initScreen();
}]);