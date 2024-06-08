/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryDateMasterList
 *
 * @description たな卸実施日マスタメンテナンス画面
 */
angular.module('oneslogiWms.InventoryDateMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.InventoryDateMasterList.service:inventoryDateMasterListApi
 *
 * @description たな卸実施日マスタメンテナンスWebApi定義<br>
 *              ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 *              ・resources/master/inventoryDateMasterListList/init 初期化用WebApi<br>
 *              ・resources/master/inventoryDateMasterListList/search 検索用WebApi<br>

 *
 */
.factory('inventoryDateMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		inventoryDateMasterList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/inventoryDateMasterList/init'],
				 ['search', 'GET', 'resources/master/inventoryDateMasterList/search'],
				 ['excel',  'GET', 'resources/master/inventoryDateMasterList/search', 'excel'],
				 ]
		),
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryDateMasterList.object:InventoryDateMasterList
 *
 * @description たな卸実施日マスタメンテナンス画面コントローラ
 */
.controller('InventoryDateMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'inventoryDateMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.resultListCols =
		[
		 {field:"targetDate", displayName:"対象年月日"},
		 {field:"targetDateEdit", displayName:"曜日"},
		 {field:"sundayFlgNm", displayName:"日曜フラグ"},
		 {field:"invDate", displayName:"たな卸実施日"},
		 {field:"invDateEdit", displayName:"たな卸実施曜日"},
		 {field:"updDt", displayName:"更新日時"},
		 {field:"updUser", displayName:"更新者"},
//		 {field:"centerCd", displayName:"センタCD"},
//		 {field:"centerNm", displayName:"センタ名称"},
		 ];

	/***
	 * 画面初期化処理
	 */
	$scope.initScreen = function() {

		// 画面コントロールの初期化
		$scope.initializeControls()
			.then(function(){
				// 画面初期値設定
				$scope.initializeValue();
			});

	}
	/***
	 * コントロール初期化処理
	 */
	$scope.initializeControls = function(){
		var deferred = $q.defer();

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// グリッド初期化
		$scope.initializeGrid();

		// センタ、荷主ドロップリストの設定
		$scope.centerList = userInfo.centerList;
		$scope.clientList = userInfo.clientList;

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetSundayFlg()
		])
		.then(function(){
			return $scope.deferredGetForm();
		})
		.then(function(){
			return deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * グリッド初期化処理
	 */
	$scope.initializeGrid = function(){
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'resultList',
			columnDefs: 'resultListCols',
			pagingOptions : $scope.pagingOptions
		});
	};
	/***
	 * グリッド色付け処理
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/***
	 * 画面モデル取得処理
	 */
	$scope.deferredGetForm = function () {
		var deferred = $q.defer();

		api.inventoryDateMasterList.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchConditionForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.cond = response.data.cond;
			$scope.resultList = response.data.resultList;
			$scope.paging = response.paging;

			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){
		// ログイン情報より初期値を設定
		$scope.cond.centerCd = userInfo.centerCd;
		$scope.cond.clientCd = userInfo.clientCd;

		// ドロップダウンの初期値を設定
//		$scope.cond.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

//		$scope.cond.sundayFlg = "0";

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.cond = owsHistory.popState();
			$scope.searchClick();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}


	/***
	 * 日曜フラグ
	 */
	$scope.deferredGetSundayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SUNDAY_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.sundayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 検索
	 */
	$scope.searchClick = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.cond = $scope.cond;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.inventoryDateMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
			$scope.setSearchData(response);
		});
	};

	$scope.setSearchData = function(response) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// 検索ボタン押下後のスクロール位置を上に戻す処理を追加
		$scope.gridOptions.gridViewport.scrollTop(0);

		owsCommon.syncExec(function() {
			// 取得したデータをグリッドに表示
			$scope.resultList = response.data.resultList;
		});

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.cond);
	};

	/***
	 * Excel出力
	 */
	$scope.excelOutputClick = function() {
		var request = {};
		request.data = {};
		request.data.cond = $scope.cond;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "resultList", document.title);

		api.inventoryDateMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchResultForm')) {
				location.href = response.output.downloadUrl;
			}else{

				$scope.setSearchData(response);
			}
		});

	};

	/***
	 * グリッドダブルクリック処理
	 */
	$scope.gridDblClick = function(row) {
		 owsCommon.syncButtonExec("update", row);
	};
	/***
	 * 修正
	 */
	$scope.updateClick = function(){
		$location.path("wms/master/InventoryDateMasterEdit")
		.search({})
		.search("mode", SCREEN_MODE.Update)
		//[WMS_3.1a.2.2] 一覧追加 2024/03/27 ma-urate UPD [S]
//		.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
		.search("centerCd", $scope.cond.centerCd)
		//[WMS_3.1a.2.2] 一覧追加 2024/03/27 ma-urate UPD [E]
		.search("mfinvoperationId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mfinvoperationId);
	};
	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);


