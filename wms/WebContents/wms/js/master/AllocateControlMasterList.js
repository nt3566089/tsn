angular.module('oneslogiWms.AllocateControlMasterList',[])
.factory('allocateControlMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query'			,'GET'	,'resources/common/centerClass/keyValueList'],
			['queryCenter'		,'GET'	,'resources/common/centerClass/centerKeyValueList']
		]),
		allocateControlMasterList: AngularAPIClient.make([
			['init'		,'GET'	,'resources/master/allocateControlMasterList/init'],
			['search'	,'GET'	,'resources/master/allocateControlMasterList/search'],
			['excel'	,'GET'	,'resources/master/allocateControlMasterList/search','excel'],
		    ['checkDelete', 'POST', 'resources/master/allocateControlMasterList/checkDelete'],
		    ['delete'     , 'POST', 'resources/master/allocateControlMasterList/delete']
	    ]),
		productRecord: AngularAPIClient.make([
			['record'	,'GET'	,'resources/common/product/record'],
		]),
	};
}])

.controller('AllocateControlMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'allocateControlMasterListApi','printFactory',function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api,printFactory) {

	// グリッドの列情報（デザイン用）
	$scope.resultListCols =
		[
		 {field:"mProduct.productCd", displayName:"銘柄CD"},
		 {field:"mProduct.productNm", displayName:"銘柄名称"},
		 {field:"pickfrdate",	displayName:"適用開始日"},
		 {field:"picktodate",	displayName:"適用終了日"},
		 {field:"validtye",		displayName:"有効区分"},
		 {field:"pickrank1",	displayName:"デ変(優先1)"},
		 {field:"pickrank2",	displayName:"デ変(優先2)"},
		 {field:"pickrank3",	displayName:"デ変(優先3)"},
		 {field:"pickrank4",	displayName:"デ変(優先4)"},
		 {field:"pickrank5",	displayName:"デ変(優先5)"},
		 {field:"updDt",	displayName:"更新日時"},
		 {field:"updUser",	displayName:"更新者"},
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

		// 荷主ドロップリストの設定
		$scope.clientList = userInfo.clientList;

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetdesignflg(),
			$scope.deferredGetvalidtype(),

		])
		.then(function(){
			return $scope.deferredGetForm();
		})
		.then(function(){
			return deferred.resolve();
		});

		return deferred.promise;
	};

	// 日付大小チェック
	$scope.fromToCheck = function(fromValue, toValue) {
		var fromValueString = owsCommon.dateToString(fromValue);
		var toValueString = owsCommon.dateToString(toValue);

		if (fromValueString != null &&fromValueString.length > 0 &&
				toValueString != null && toValueString.length > 0 &&
				fromValueString > toValueString) {
			return false;
		}

		return true;
	};

	// 日付大小チェック用メッセージ
	$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

	/***
	 * グリッド初期化処理
	 */
	$scope.initializeGrid = function(){
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// TODO: 基盤の処理（enableRowSelection）が false の場合にGrid のヘッダ部が表示されなくなる
//		// グリッドの設定
//		$scope.gridOptions =  {
//				data: 'resultList',
//				columnDefs: 'resultListCols',
//	            enablePaging: true,
//            	enableColumnMenus: false,
//            	enableColumnResizing: true,
//	            enableRowSelection: true,
//            	multiSelect: false,
//            	enableFullRowSelection: true,
//            	enableSorting: false,
//            	showGridFooter: true,
//            	enableChangeColumn: true,
//            	minRowsToShow: 12,
//	            useExternalPagination: true,
//	            enableRowHeaderSelection: true,
//				pagingOptions : $scope.pagingOptions
//		};
//		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
//			data: 'resultList',
//			columnDefs: 'resultListCols',
//			pagingOptions : $scope.pagingOptions
//		});

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

		api.allocateControlMasterList.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.searchCondition = response.data.searchCondition;
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
		$scope.searchCondition.centerCd = userInfo.centerCd;
		$scope.searchCondition.clientCd = userInfo.clientCd;

		// ドロップダウンの初期値を設定
		$scope.searchCondition.designflg = owsCommon.getDefaultValue($scope.designflgList);
		$scope.searchCondition.validtype = owsCommon.getDefaultValue($scope.validtypeList);

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.searchCondition = owsHistory.popState();
			$scope.searchClick();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}


	/***
	 * デザイン区分
	 */
	$scope.deferredGetdesignflg = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.clientId;
		request.classCd = "DESIGNFLG";

		api.dropdownList.queryCenter(request).then(function(response){
			$scope.designflgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/***
	 * 有効区分
	 */
	$scope.deferredGetvalidtype = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "VALIDTYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.validtypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


//	/***
//	 * 削除
//	 */
//	$scope.deferredGetDelFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "DEL_FLG";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.delFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};

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
		request.data.searchCondition = $scope.searchCondition;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.allocateControlMasterList.search(request).then(function(response) {
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
		owsHistory.replaceState($scope.searchCondition);
	};

	/***
	 * 銘柄
	 */
	$scope.modalProduct = function(){
		//商品Aを呼び出してる
		var items = {
				clientCd: $scope.searchCondition.clientCd,
				productCd: $scope.searchCondition.productCd
		};

		var modalInstance = modalFactory.modalProduct(items);

		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.productCd = selectedItem.productCd;
			$scope.searchCondition.productNm = selectedItem.productNm;
		});
	};

		$scope.productCdBlur = function() {
			if(!$scope.searchCondition.productCd){
				$scope.searchCondition.productNm = null;
				return;
			}
		//フォーカスアウト。商品名称アシスタントの追加---start--2023/12/26
		var productCd = $scope.searchCondition.productCd;

		if(productCd && 0 < productCd.length){
			var request ={};

			request.clientId = userInfo.clientIdByCd($scope.searchCondition.clientCd);
			request.productCd = $scope.searchCondition.productCd;

			$scope.searchCondition.productNm = null;


			api.productRecord.record(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
		});

		}else{
			$scope.searchCondition.productNm = null;
	 }
   };


	/***
	 * Excel出力
	 */
	$scope.excelOutputClick = function() {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "resultList", document.title);

		api.allocateControlMasterList.excel(request).then(function(response) {
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
	 * 複製
	 */
	$scope.copyClick = function() {
		//修正画面へ遷移
		$location.path("wms/master/AllocateControlMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Copy)
			.search("clientCd", $scope.searchCondition.clientCd)
			.search("mfpickctlId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mfpickctlId)
	};

	/***
	 * 新規
	 */
	$scope.newClick = function(){
		$location.path("wms/master/AllocateControlMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Create)
			.search("clientCd", $scope.searchCondition.clientCd)
	};

	/***
	 * 修正
	 */
	$scope.updateClick = function(){
		$location.path("wms/master/AllocateControlMasterEdit")
		.search({})
		.search("mode", SCREEN_MODE.Update)
		.search("clientCd", $scope.searchCondition.clientCd)
		.search("mfpickctlId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mfpickctlId)
		};


	/***
	 * 削除
	 */
		$scope.deleteClick = function() {
			var listBody = [];
			//明細が表示されていない場合
			if($scope.resultList.length == 0)
			{
				alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
				return;
			}

//			// 行が選択されていない場合
//			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
//				alertMessage.setErrorMessageByCode("lineNotSelectError");
//				return;
//			}
//
//			// 複数行の場合に警告
//			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
//				if (!owsCommon.viewConfirm("confirmDeleteRow")) {
//					return;
//				}
//			}

			//グリッドの明細行数分繰返
			for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
				listBody.push($scope.gridOptions.gridApi.selection.getSelectedRows()[row]);
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.resultList = listBody;
			request.data.searchCondition = $scope.searchCondition;
			request.data.searchCondition.centerId = userInfo.centerId;
			request.data.searchCondition.clientId = userInfo.clientId;

			api.allocateControlMasterList.checkDelete(request).then(function(response){


//				// 処理結果確認

//				if ($scope.gridOptions.gridApi.selection.getSelectedRows().) {
//					alertMessage.setErrorMessageByCode("pastGenerationApplicableGenerationError");
//					return;
//				}

				if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
					return;
				}

				// 引当制御マスタ削除または更新
				api.allocateControlMasterList.delete(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
						return;
					}

					// 初期化
					$scope.searchClick();
				});
			});
		};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
