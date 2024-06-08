/**
 * @ngdoc overview
 * @name oneslogiWms.ZipMasterSearch
 *
 * @description
 * 郵便番号マスタ検索画面<br>
 *
 * 郵便番号マスタ検索を行う為の画面。
 */
angular.module('oneslogiWms.ZipMasterSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ZipMasterSearch.service:zipMasterSearchApi
 *
 * @description
 * 郵便番号マスタ検索画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * company 大口事業所フラグデータ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList<br>
 * <br>
 * ZipMaster 郵便番号マスタデータ操作用WebApi<br>
 * ・resources/common/zipMasterSearch/initNew 初期処理WebAPI<br>
 * ・resources/common/zipMasterSearch/search 検索WebAPI<br>
 */
.factory('zipMasterSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		zipMasterList: AngularAPIClient.make(
				[
				 ['initNew',        'GET',  'resources/assist/zipMasterSearch/initNew'],
				 ['search',         'GET',  'resources/assist/zipMasterSearch/search']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
 *
 * @description
 * 郵便番号マスタ検索画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ZipMasterSearch', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'zipMasterSearchApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items){

	// グリッドの列情報（デザイン用）
	$scope.zipMasterSearchCols = [
	                              {field:"zipCd", displayName:"郵便番号"},
	                              {field:"address1", displayName:"都道府県"},
	                              {field:"address2", displayName:"市区町村"},
	                              {field:"companyFlg", displayName:"大口事業所フラグCD"},
	                              {field:"bclassDtlByCompanyFlg.vdict.dictNm", displayName:"大口事業所フラグ名称"}
	                              ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#initScreen
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'zipMasterList',
			columnDefs: 'zipMasterSearchCols',
			pagingOptions : $scope.pagingOptions
		});

		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi Start
		$scope.zipMasterList = [];
		// [#6958][OSS] 初期表示時グリッドのヘッダー非表示を修正 2019.12.11 tsuboi End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#initScreenHttp
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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
		.then(function(zipMasterList){
			$scope.head = zipMasterList[0].data.head;
			$scope.paging = zipMasterList[0].paging;

			// 参照元画面の情報を設定
			if (items) {
				$scope.head.zipCd = items.zipCd;
			}

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 tsuboi Delete

			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			owsCommon.setFirstFocus("zipMasterSearchform");
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#getInitData
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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
			if (!statusInfo.isSuccessAndShowMessage(response, 'zipMasterSearchform')) {
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
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#gridDblClick
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#search
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#getPagedDataAsync
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
	 *
	 * @description
	 * 検索処理<br>
	 * ・郵便番号マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.zipMasterList.search(request).then(function(response) {
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys Start
			statusInfo.isSuccessAndShowMessage(response, 'zipMasterSearchform');
			// [横並-094] フォーカスがセットを変更 2014.11.21 taoys End
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#setPagingData
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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

		// [ON推-品向-374] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-374] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.zipMasterList = response.data.body;

		// [ON推-品向-538] 大口事業所フラグを入力不可にする処理は不要なため削除 2015.01.14 kawana

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#selectClose
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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
	 * @name oneslogiWms.ZipMasterSearch.object:ZipMasterSearch#modalClose
	 * @methodOf oneslogiWms.ZipMasterSearch.object:ZipMasterSearch
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