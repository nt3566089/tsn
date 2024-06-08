/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryMasterSearch
 *
 * @description
 * 納品先マスタ検索画面<br>
 *
 * 納品先マスタ対する検索を行う為の画面。
 */
angular.module('oneslogiWms.DeliveryMasterSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryMasterSearch.service:deliveryMasterSearchApi
 *
 * @description
 * 納品先マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * deliveryMaster 納品先マスタデータ操作用WebAPI<br>
 * ・resources/assist/deliveryMasterSearch/initNew 初期処理WebAPI<br>
 * ・resources/assist/deliveryMasterSearch/search 検索WebAPI<br>
 */
.factory('deliveryMasterSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		deliveryMaster: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/assist/deliveryMasterSearch/initNew'],
				 ['search',             'GET',  'resources/assist/deliveryMasterSearch/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
 *
 * @description
 * 納品先マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DeliveryMasterSearch', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'deliveryMasterSearchApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

	// グリッドの列情報（デザイン用）
	$scope.deliveryMasterCols = [
	                             {field:"customerCd", displayName:"納品先CD"},
	                             {field:"customerNm", displayName:"納品先名称"},
	                             {field:"customerAbbr", displayName:"納品先略称"},
	                             {field:"address1", displayName:"住所１"},
	                             {field:"zipCd", displayName:"郵便番号"},
	                             {field:"telNo", displayName:"電話番号"},
	                         	//荷主センタ変更対応 201７.01.19 sja End
	                             {field:"mclient.clientCd", displayName:"荷主CD"},
	                             {field:"mclient.clientNm", displayName:"荷主名称"}
	                         	//荷主センタ変更対応 201７.01.19 sja End
	                             ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#initScreen
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End


		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'list',
			columnDefs: 'deliveryMasterCols',
			pagingOptions : $scope.pagingOptions
		});

		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi Start
		$scope.list = []
		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
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
			if (items) {
				$scope.head.mclient.clientCd = items.clientCd;
				$scope.head.customerCd = items.deliveryCd;
			}

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete

			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			owsCommon.setFirstFocus("deliveryMasterSearchform");
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#getInitData
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
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
			if (!statusInfo.isSuccessAndShowMessage(response, 'deliveryMasterSearchform')) {
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
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#gridDblClick
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
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
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#search
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
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
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#getPagedDataAsync
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
	 *
	 * @description
	 * 検索処理<br>
	 * ・納品先マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.deliveryMaster.search(request).then(function(response) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			statusInfo.isSuccessAndShowMessage(response, 'deliveryMasterSearchform');
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#setPagingData
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
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

		// [ON推-品向-373] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-373] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.list = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#selectClose
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.selectClose = function(){
		$modalInstance.close($scope.gridOptions.gridApi.selection.getSelectedRows()[0]);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch#modalClose
	 * @methodOf oneslogiWms.DeliveryMasterSearch.object:DeliveryMasterSearch
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
