/**
 * @ngdoc overview
 * @name oneslogiWms.VendorMasterSearch
 *
 * @description
 * 仕入先マスタ検索画面<br>
 *
 * 仕入先マスタ対する検索を行う為の画面。
 */
angular.module('oneslogiWms.VendorMasterSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.VendorMasterSearch.service:vendorMasterSearchApi
 *
 * @description
 * 仕入先マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * vendorMaster 仕入先マスタデータ操作用WebAPI<br>
 * ・resources/common/vendorMasterSearch/initNew 初期処理WebAPI<br>
 * ・resources/common/vendorMasterSearch/search 検索WebAPI<br>
 */
.factory('vendorMasterSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		vendorMaster: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/assist/vendorMasterSearch/initNew'],
				 ['search',             'GET',  'resources/assist/vendorMasterSearch/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
 *
 * @description
 * 仕入先マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('VendorMasterSearch', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'vendorMasterSearchApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

	// グリッドの列情報（デザイン用）
	$scope.vendorMasterCols = [
	                           {field:"customerCd", displayName:"仕入先CD"},
	                           {field:"customerNm", displayName:"仕入先名称"},
	                           {field:"customerAbbr", displayName:"仕入先略称"},
	                           {field:"address1", displayName:"住所１"},
	                           {field:"zipCd", displayName:"郵便番号"},
	                           {field:"telNo", displayName:"電話番号"}
	                           ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#initScreen
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
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

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'list',
			columnDefs: 'vendorMasterCols',
			pagingOptions : $scope.pagingOptions
		});

		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi Start
		$scope.list = [];
		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#initScreenHttp
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
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
				$scope.head.customerCd = items.vendorCd;
			}

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 tsuboi Delete

			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			owsCommon.setFirstFocus("vendorMasterSearchform");
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#getInitData
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
	 *
	 * @description
	 * 画面初期化用の初期化データ取得処理<br>
	 * ・画面初期化用WebAPIの呼び出し定義
	 */
	$scope.getInitData = function() {
		var defferd = $q.defer();
		api.vendorMaster.initNew().then(function(response){

			// 処理結果確認
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'vendorMasterSearchform')) {
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
	 * @name oneslogiWms.ProductMasterSearch.object:ProductMasterSearch#gridDblClick
	 * @methodOf oneslogiWms.ProductMasterSearch.object:ProductMasterSearch
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
	 * @name oneslogiWms.VendorasterSearch.object:VendorMasterSearch#search
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
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
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#getPagedDataAsync
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
	 *
	 * @description
	 * 検索処理<br>
	 * ・仕入先マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.vendorMaster.search(request).then(function(response) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			statusInfo.isSuccessAndShowMessage(response, 'vendorMasterSearchform');
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#setPagingData
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
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

		// [ON推-品向-372] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-372] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.list = response.data.list;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#selectClose
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
	 *
	 * @description
	 * 選択ボタン押下処理<br>
	 * ・選択行のEntityを渡し、画面を閉じる処理呼び出し
	 */
	$scope.selectClose = function(){

//		// 明細が表示されていない
//		if($scope.list.length == 0){
//			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
//		}
//		// 行ない選択されていない
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
//			alertMessage.setErrorMessageByCode("lineNotSelectError");
//			return;
//		}
		$modalInstance.close($scope.gridOptions.gridApi.selection.getSelectedRows()[0]);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.VendorMasterSearch.object:VendorMasterSearch#modalClose
	 * @methodOf oneslogiWms.VendorMasterSearch.object:VendorMasterSearch
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
