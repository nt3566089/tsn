angular.module('oneslogiWms.SortingPlaceMasterList',[])
.factory('sortingPlaceMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query'	,'GET'	,'resources/common/centerClass/keyValueList'],
		]),
		sortingPlaceMasterList: AngularAPIClient.make([
			['init'		,'GET'	,'resources/stock/sortingPlaceMasterList/init'],
			['search'	,'GET'	,'resources/stock/sortingPlaceMasterList/search'],
			['checkUpdate'	,'GET'	,'resources/stock/sortingPlaceMasterList/checkUpdate'],
		]),


	};
}])

.controller('SortingPlaceMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'sortingPlaceMasterListApi', 'printFactory', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, printFactory) {

	// グリッドの列情報（デザイン用）

	//ライン
	$scope.resultListLinCols =
		[
			{field:"mclin.linCd", displayName:"ラインCD"},
		 	{field:"mclin.linNm", displayName:"ライン名称"},
		 	{field:"mclin.linBlk1", displayName:"ライン対応ブロック(1)"},
		 	{field:"mclin.linBlk2", displayName:"ライン対応ブロック(2)"},
		    {field:"mclin.linBlk3", displayName:"ライン対応ブロック(3)"},
		    {field:"mclin.hdrdboxrsfid.vdict.dictNm", displayName:"100BOX"},
		    {field:"mclin.pkgrt", displayName:"梱包率（％）"},
		    {field:"mclin.sprprsid.vdict.dictNm", displayName:"個口圧縮"},
		    {field:"mclin.delflg.vdict.dictNm", displayName:"削除"}

		 ];
	//ブロック
	$scope.resultListBlkCols =
		[
		    {field:"mcblk.blkCd", displayName:"ブロックCD"},
		 	{field:"mcblk.blkNm", displayName:"ブロック名称"},
		 	{field:"mcblk.locidfrnk.vdict.dictNm", displayName:"ロケ不定間口貼付順"},
		 	{field:"mcblk.locidfbrctg", displayName:"ロケ不定銘柄カテゴリ貼付順"},
		    {field:"mcblk.hdrdboxrsfid.vdict.dictNm", displayName:"100BOX"},
		    {field:"mcblk.pkgrt", displayName:"梱包率（％）"},
		    {field:"mcblk.sprprsid.vdict.dictNm", displayName:"個口圧縮"},
		    {field:"mcblk.delflg.vdict.dictNm", displayName:"削除"}

		 ];

	/***
	 *  画面初期化処理
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


		$q.all([

			$scope.deferredGetDelFlg(),

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
		//リスト
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'resultListLin',
			columnDefs: 'resultListLinCols',
			pagingOptions : $scope.pagingOptions
		});

		//ブロック
		$scope.gridOptions2 = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'resultListBlk',
			columnDefs: 'resultListBlkCols',
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
		api.sortingPlaceMasterList.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.searchCondition = response.data.searchCondition;
			$scope.resultSrw = response.data.resultSrw;
			$scope.resultListLin = response.data.resultListLin;
			$scope.resultListBlk = response.data.resultListBlk;
			$scope.paging = response.paging;


			//アコーディオンのタイトルを個別設定
			//TODO:angularjs の　documentを利用する必要がある？
			var titleCommon = document.querySelector("#titleCommon").querySelector("a")
			titleCommon.innerText = document.querySelector("#lbltitleCommon label").innerText;

			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){

		// ログイン情報より初期値を設定
		$scope.searchCondition.centerCd = userInfo.centerCd;
		$scope.searchCondition.clientCd = userInfo.clientCd;

		// ドロップダウンの初期値を設定
		$scope.searchCondition.delFlg = "0"; //owsCommon.getDefaultValue($scope.delFlgList);

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.searchCondition = owsHistory.popState();
			$scope.searchClick();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}


	/***
	 * 削除
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/***
	 * 検索
	 */
	$scope.searchClick = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		owsCommon.clearPagingOptions($scope.gridOptions2);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		$scope.getPagedDataAsync($scope.gridOptions2.paginationPageSize, $scope.gridOptions2.paginationCurrentPage);
	};

	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.sortingPlaceMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
			$scope.setSearchData(response);
		});
	};

	$scope.setSearchData = function(response) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.isopen = false;
		owsCommon.setFirstFocus('searchConditionForm');

		// 検索ボタン押下後のスクロール位置を上に戻す処理を追加
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.gridOptions2.gridViewport.scrollTop(0);

		owsCommon.syncExec(function() {
			// 取得したデータを表示
			//共通
			$scope.resultSrw = response.data.resultSrw;
			//ライン
			$scope.resultListLin = response.data.resultListLin;
			//ブロック
			$scope.resultListBlk = response.data.resultListBlk;
		});

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		$scope.gridOptions2.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};


	/***
	 * グリッドダブルクリック処理
	 */
	$scope.gridDblClick = function(row) {
		 owsCommon.syncButtonExec("Edit", row);
	};

	/***
	 * ライン追加
	 */
	$scope.AddLineClick = function() {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition

		api.sortingPlaceMasterList.checkUpdate(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

//			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
//			$scope.setSearchData(response);


			//修正画面へ遷移
			$location.path("wms/stock/SortingPlaceMasterEdit")
				.search({})
				.search("mode", SCREEN_MODE.Create)
				.search("centerCd", $scope.searchCondition.centerCd)
				.search("clientCd", $scope.searchCondition.clientCd)
				.search("lineBlockCommon", '1');

		});
	};

	/***
	 * ブロック追加
	 */
	$scope.AddBlockClick = function(){
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition

		api.sortingPlaceMasterList.checkUpdate(request).then(function(response) {
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

//			$scope.setSearchData(response);

			//修正画面へ遷移
			$location.path("wms/stock/SortingPlaceMasterEdit")
				.search({})
				.search("mode", SCREEN_MODE.Create)
				.search("centerCd", $scope.searchCondition.centerCd)
				.search("clientCd", $scope.searchCondition.clientCd)
				.search("lineBlockCommon", '2');
		});
	};

	/***
	 * 編集
	 */
	$scope.EditClick = function(){
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition

		api.sortingPlaceMasterList.checkUpdate(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

//			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
//			$scope.setSearchData(response);

		// 画面より渡されたデータがラインとブロック両方の明細が選択されている。
			// エラーメッセージを表示
			// 処理を修了する
		if($scope.gridOptions.gridApi.selection.getSelectedRows().length > 0 && $scope.gridOptions2.gridApi.selection.getSelectedRows().length > 0){

			alertMessage.setErrorMessageByCode("lineAndBlockError");
			return;

		// 両方未選択の場合
		// 共通モードで画面遷移
		}else if($scope.gridOptions.gridApi.selection.getSelectedRows().length === 0 && $scope.gridOptions2.gridApi.selection.getSelectedRows().length === 0){
			$location.path("wms/stock/SortingPlaceMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Update)
			.search("centerCd", $scope.searchCondition.centerCd)
			.search("clientCd", $scope.searchCondition.clientCd)
			.search("lineBlockCommon", '5');

		// ラインが選択されている場合
		// ラインモードで画面遷移
		}else if($scope.gridOptions.gridApi.selection.getSelectedRows().length > 0){
			$location.path("wms/stock/SortingPlaceMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Update)
			.search("centerCd", $scope.searchCondition.centerCd)
			.search("clientCd", $scope.searchCondition.clientCd)
			.search("linCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].lincd)
			.search("lineBlockCommon", '3');

		// 上記以外の場合
		}else
			$location.path("wms/stock/SortingPlaceMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Update)
			.search("centerCd", $scope.searchCondition.centerCd)
			.search("clientCd", $scope.searchCondition.clientCd)
			.search("blkCd", $scope.gridOptions2.gridApi.selection.getSelectedRows()[0].blkcd)
			.search("lineBlockCommon", '4');

		});
	};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
