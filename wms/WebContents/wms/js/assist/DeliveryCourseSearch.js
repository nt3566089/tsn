/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryCourseSearch
 *
 * @description
 * 配送コースマスタ検索画面<br>
 *
 * 配送コースマスタでーた検索画面 選択画面。
 */
angular.module('oneslogiWms.DeliveryCourseSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryCourseSearch.service:deliveryCourseSearchApi
 *
 * @description
 * 配送コースマスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */

.factory('deliveryCourseSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		deliveryCourseList: AngularAPIClient.make(
				[
				 ['initNew',             'GET',  'resources/assist/deliveryCourseSearch/initNew'],
				 ['search',              'GET',  'resources/assist/deliveryCourseSearch/search']
				 ]
		)
	}
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
 *
 * @description
 * 配送コース画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DeliveryCourseSearch', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'deliveryCourseSearchApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

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
		                           		//荷主センタ変更対応 201７.02.08 sja Start
	                                   {field:"mcenter.centerCd", displayName:"センタCD"},
	                                   {field:"mcenter.centerNm", displayName:"センタ名称"}
	                           			//荷主センタ変更対応 201７.02.08 sja End
	                                   ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#initScreen
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 *
	 * @description
	 * 検索画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'deliveryCourse',
			columnDefs: 'deliveryCourseSearchCols',
			pagingOptions : $scope.pagingOptions
		});

		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi Start
		$scope.deliveryCourse = [];
		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
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
			if (items) {
				$scope.head.mcenter.centerCd = items.centerCd;
				$scope.head.deliveryCourseCd = items.deliveryCourseCd;
			}

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete

			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			owsCommon.setFirstFocus("deliveryCourseSearchform");
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#getInitData
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 *
	 * @description
	 * 画面初期化用の初期化データ取得処理<br>
	 * ・画面初期化用WebAPIの呼び出し定義
	 */
	$scope.getInitData = function() {
		var defferd = $q.defer();
		api.deliveryCourseList.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'deliveryCourseSearchform')) {
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
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#gridDblClick
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
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
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#search
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
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
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#getPagedDataAsync
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 * @description
	 * 検索処理<br>
	 * ・配送コースマスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.deliveryCourseList.search(request).then(function(response) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			statusInfo.isSuccessAndShowMessage(response, 'deliveryCourseSearchform');
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#setPagingData
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 * @description
	 * 検索結果反映処理<br>
	 * ・行センタ状態のクリア<br>
	 * ・取得データをグリッドに反映<br>
	 * ・トータル件数を設定
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-376] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-376] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.deliveryCourse = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#selectClose
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.selectClose = function(){
		$modalInstance.close($scope.gridOptions.gridApi.selection.getSelectedRows()[0]);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
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
			$scope.deliveryCourseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#modalClose
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */

	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);