angular.module('oneslogiWms.LocationMaster',[])
.factory('locationMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query', 'GET', 'resources/common/centerClass/keyValueList']
		]),
		locationMaster: AngularAPIClient.make([
			['init'		,'GET'	,'resources/master/locationMaster/init'],
			['search'	,'GET'	,'resources/master/locationMaster/search'],
			['excel'	,'GET'	,'resources/master/locationMaster/search'	,'excel'],
			['checkLocationManageList'	,'GET'	,'resources/master/locationMaster/checkLocationManageList'	,'excel'],
			['checkUpdate'	,'GET'	,'resources/master/locationMaster/checkUpdate'],
			['check'	,'GET'	,'resources/master/locationMaster/check'],
		]),

	};
}])

.controller('LocationMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'locationMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.resultListCols =
		[
			 {field:"centerCd", displayName:"拠点CD"},
			 {field:"centerNm", displayName:"拠点名称"},
			 {field:"locationCd", displayName:"ロケーションCD"},
			 {field:"locationNm", displayName:"ロケーション名称"},
			 {field:"locGroup", displayName:"ロケーショングループ"},
			 {field:"allocNgFlg", displayName:"引当可否"},
			 {field:"zone", displayName:"ゾーン"},
			 {field:"pickingOrder", displayName:"山出し順"},
			 {field:"palleteCapacity", displayName:"許容パレット枚数"},
			 {field:"maxStoreNum", displayName:"許容個数"},
			 {field:"linBlk", displayName:"ライン/ブロック"},
			 {field:"lockbn", displayName:"ロケーション区分"},
			 {field:"itemCd", displayName:"銘柄CD"},
			 {field:"productNm", displayName:"銘柄名正称"},
			 {field:"brCtg", displayName:"銘柄カテゴリ"},
			 {field:"splrevUn", displayName:"補充切り上げ単位"},
			 {field:"splrevCtqa", displayName:"補充切り上げカートン数"},
			 {field:"replenishPNum", displayName:"基本補充点"},
			 {field:"bssplpt", displayName:"基本補充量"},
			 {field:"tosplmd", displayName:"当日補充方式"},
			 {field:"presplmd", displayName:"事前補充方式"},
			 {field:"updDt", displayName:"更新日時"},
			 {field:"updUser", displayName:"更新者"},
			 {field:"mclin.delflg.vdict.dictNm", displayName:"削除"},
		 ];

	// グリッドの列情報（デザイン用）
	$scope.resultOutputCols =
		[
			 {field:"linBlk", displayName:"ライン/ブロック"},
			 {field:"sortCenter", displayName:"仕分拠点"},
			 {field:"locationCd", displayName:"ロケーションCD"},
			 {field:"productCd", displayName:"銘柄CD"},
			 {field:"productNm", displayName:"銘柄名"},
			 {field:"stockBox", displayName:"現棚在庫ダンボール数"},
			 {field:"stockCarton", displayName:"現棚在庫カートン数"},
			 {field:"lockbn", displayName:"ロケーション区分"},
			 {field:"brtg", displayName:"銘柄カテゴリ"},
			 {field:"tosplmd", displayName:"当日補充方式"},
			 {field:"presplmd", displayName:"事前補充方式"},
			 {field:"splrevun", displayName:"切上単位"},
			 {field:"splrevctqa", displayName:"切上カートン"},
			 {field:"replenishPNum", displayName:"基本補充点"},
			 {field:"bssplpt", displayName:"基本補充量"},
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
		$scope.clientCdList = userInfo.clientList;


		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetLocGroup(),
			$scope.deferredGetAllocNgFlg(),
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
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'resultList',
			columnDefs: 'resultListCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.pagingOptionsForOutput = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptionsForOutput.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridForOutput.paginationPageSize, $scope.gridForOutput.paginationCurrentPage);
		};

		$scope.gridForOutput = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'excelOutputData',
			columnDefs: 'resultListCols',
			pagingOptions : $scope.pagingOptionsForOutput
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

		api.locationMaster.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.searchCondition = response.data.searchCondition;
			$scope.resultList = response.data.resultList;
			$scope.excelOutputData = response.data.excelOutputData;
			$scope.paging = response.paging;

			// 条件付き必須項目の初期化
			$scope.locGroupChange();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){
		// ログイン情報より初期値を設定
		$scope.searchCondition.clientCd = userInfo.clientCd;
		$scope.searchCondition.centerId = userInfo.centerId;
		$scope.searchCondition.centerCd = userInfo.centerCd;

		// ドロップダウンの初期値を０に設定
		$scope.searchCondition.delFlg = "0";	//owsCommon.getDefaultValue($scope.delFlgList);

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.searchCondition = owsHistory.popState();
			$scope.searchClick();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

	/***
	 * 荷主
	 */
	$scope.clientCdChange = function() {
		$scope.deferredGetClientCd($scope.searchCondition.clientCd)
			.then(function(){
				return $scope.deferredGetClientCd($scope.searchCondition.clientCd, null);
			});
	};

	/***
	 * ロケーショングループ
	 */
	$scope.deferredGetLocGroup = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOC_GROUP";

		api.dropdownList.query(request).then(function(response){
			$scope.locGroupList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * ロケーショングループが０６の場合、引当可否 非活性処理
	 */
	$scope.locGroupChange = function(){

		if($scope.searchCondition.locGroup === "06"){
			directiveControl.editable($scope, 'allocNgFlg', false);
			directiveControl.editable($scope, 'zone', false);

			optionMessageControl.hide($scope,'allocNgFlg');
			optionMessageControl.hide($scope,'zone');

			$scope.searchCondition.allocNgFlg = null;
			$scope.searchCondition.zone = null;

			/***
			 * ロケーショングループが０６を選択＆検索結果が１件以上の場合のみ活性
			 * （ロケーショングループ06以外 ＆ 検索結果が０件の場合非活性）
			 */
			if($scope.resultList.length	>	0){
				directiveControl.editable($scope, 'LocationManageListExcelOutput', true);
			} else {
				directiveControl.editable($scope, 'LocationManageListExcelOutput', false);
			}

		} else {
			directiveControl.editable($scope, 'allocNgFlg', true);
			directiveControl.editable($scope, 'zone', true);
			directiveControl.editable($scope, 'LocationManageListExcelOutput', false);
		}

	};


	/***
	 * 引当可否
	 */
	$scope.deferredGetAllocNgFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ALLC_NG_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.allocNgFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

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
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.locationMaster.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
			$scope.setSearchData(response);
			$scope.setOutputData(response);
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

			// Excel出力の活性非活性を更新
			$scope.locGroupChange();
		});

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
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

		api.locationMaster.excel(request).then(function(response) {
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


	///////////////////////////////////////////
	// ロケーション管理リストExcel出力
	///////////////////////////////////////////

	$scope.setOutputData = function(response) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridForOutput, false);

//		// 検索ボタン押下後のスクロール位置を上に戻す処理を追加
//		$scope.gridOptions.gridViewport.scrollTop(0);
//
		owsCommon.syncExec(function() {
			// 取得したデータをグリッドに表示
			$scope.excelOutputData = response.data.excelOutputData;
		});
//
//		//トータル件数を設定
//		$scope.gridOptions.totalItems = response.paging.allRecordCount;
//
//		// 検索条件を履歴に保存
//		owsHistory.replaceState($scope.searchCondition);
	};
	/***
	 * ロケーション管理リストExcel出力
	 */
	$scope.locationManageListExcelOutputClick = function() {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

//		$scope.searchCondition.clientCd = userInfo.clientCd;
//		$scope.searchCondition.centerCd = userInfo.centerCd;


		// 入力チェック
		api.locationMaster.check(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

			// ファイル出力用パラメータ設定
			owsCommon.setOutputOptions(request, $scope.gridForOutput, "excelOutputData", document.title);

			api.locationMaster.checkLocationManageList(request).then(function(response) {
				if (statusInfo.isSuccessAndShowMessage(response,'searchResultForm')) {
					location.href = response.output.downloadUrl;
				}else{
					$scope.setOutputData(response);
				}
			});

		});


	};

	/***
	 * 複製
	 */
	$scope.copy = function() {

		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].virtuallocflg === "1"){
			alertMessage.setErrorMessageByCode("logicLocationFlagError");
			return ;
		}

		//修正画面へ遷移
		var request = {};
		request.data = {};
		$scope.searchCondition.clientCd = userInfo.clientCd;
		$scope.searchCondition.centerCd = userInfo.centerCd;
		request.data.searchCondition = $scope.searchCondition;

		// 入力チェック
		api.locationMaster.check(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

			$location.path("wms/master/LocationMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Copy)
			.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
			.search("locationId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].locationId);
		});



	};

	/***
	 * 新規
	 */

	$scope.initNew = function(){
		var request = {};
		request.data = {};
		$scope.searchCondition.clientCd = userInfo.clientCd;
		$scope.searchCondition.centerCd = userInfo.centerCd;
		request.data.searchCondition = $scope.searchCondition;

		// 入力チェック
		api.locationMaster.check(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
				return ;
			}

		$location.path("wms/master/LocationMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Create)
			.search("centerCd", $scope.searchCondition.centerCd)
//			.search("clientCd", $scope.searchCondition.clientCd);
		});
	};

	/***
	 * 修正
	 */
	$scope.updateClick = function(){

		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].virtuallocflg === "1"){
			alertMessage.setErrorMessageByCode("logicLocationFlagError");
			return ;
		}

		$location.path("wms/master/LocationMasterEdit")
		.search({})
		.search("mode", SCREEN_MODE.Update)
		.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
		.search("locationId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].locationId);
	};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
