/**
 * @ngdoc overview
 * @name oneslogiWms.ReceiveDesignMasterList
 *
 * @description たな卸実施日マスタメンテナンス画面
 */
angular.module('oneslogiWms.ReceiveDesignMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceiveDesignMasterList.service:receiveDesignMasterListApi
 *
 * @description たな卸実施日マスタメンテナンスWebApi定義<br>
 *              ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 *      		・resources/common/product/record 商品データ取得用WebApi<br>
 *              ・resources/master/receiveDesignMasterList/init 初期化用WebApi<br>
 *              ・resources/master/receiveDesignMasterList/search 検索用WebApi<br>
 * 				・resources/master/receiveDesignMasterList/register 登録用WebApi<br>

 *
 */
.factory('receiveDesignMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		productRecord: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		receiveDesignMasterList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/receiveDesignMasterList/init'],
				 ['search', 'GET', 'resources/master/receiveDesignMasterList/search'],
				 ['excel',  'GET', 'resources/master/receiveDesignMasterList/search', 'excel'],
				 ['register', 'POST', 'resources/master/receiveDesignMasterList/register']
				 
				 ]
		),
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReceiveDesignMasterList.object:ReceiveDesignMasterList
 *
 * @description たな卸実施日マスタメンテナンス画面コントローラ
 */
.controller('ReceiveDesignMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'receiveDesignMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.resultListCols =
		[
		 {field:"mproduct.productCd", displayName:"銘柄CD"},
		 {field:"mproduct.productNm", displayName:"銘柄名称"},
		 {field:"rcvFrDate", displayName:"適用開始日"},
		 {field:"rcvToDate", displayName:"適用終了日"},
		 {field:"validType", displayName:"有効区分"},
		 {field:"distributionCd", displayName:"流通識別CD"},
		 {field:"designFlg", displayName:"デザイン区分"},
		 {field:"delFlg", displayName:"削除"},
		 {field:"addDt", displayName:"登録日時"},
		 {field:"addUser", displayName:"登録者"},  
		 {field:"updDt", displayName:"更新日時"},
		 {field:"updUser", displayName:"更新者"},

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
			$scope.deferredGetValIdType()
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
	//	$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
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

		api.receiveDesignMasterList.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'condForm')) {
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

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.cond = owsHistory.popState();
			$scope.searchClick();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}


	/***
	 * 有効区分
	 */
	$scope.deferredGetValIdType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "VALIDTYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.validTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 銘柄
	 */
	$scope.modalProduct = function(){
		//商品Aを呼び出してる
		var items = {
				clientCd: $scope.cond.clientCd,
				productCd: $scope.cond.productCd
		};

		var modalInstance = modalFactory.modalProduct(items);

		modalInstance.result.then(function(selectedItem){
			$scope.cond.productCd = selectedItem.productCd;
			$scope.cond.productNm = selectedItem.productNm;
		});
	};

		$scope.productCdBlur = function() {
			if(!$scope.cond.productCd){
				$scope.cond.productNm = null;
				return;
			}
		//フォーカスアウト。商品名称アシスタントの追加
		var productCd = $scope.cond.productCd;

		if(productCd && 0 < productCd.length){
			var request ={};

			request.clientId = userInfo.clientIdByCd($scope.cond.clientCd);
			request.productCd = $scope.cond.productCd;

			$scope.cond.productNm = null;


			api.productRecord.record(request).then(function(response){
				$scope.cond.productNm = response.data.mProduct.productNm;
		});

		}else{
			$scope.cond.productNm = null;
	 }
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

		api.receiveDesignMasterList.search(request).then(function(response) {
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

		api.receiveDesignMasterList.excel(request).then(function(response) {
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
		$location.path("wms/master/ReceiveDesignMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Copy)
			//.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
			.search("clientCd", $scope.cond.clientCd)
			.search("mfpickctlId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mfrcvdesignId)
	};

	/***
	 * 新規
	 */
	$scope.createClick = function(){
		$location.path("wms/master/ReceiveDesignMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Create)
			//.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
			.search("clientCd", $scope.cond.clientCd)
	};
	
		/***
	 * 削除
	 */
	$scope.updateClick = function(){
		$location.path("wms/master/ReceiveDesignMasterEdit")
			.search({})
			.search("mode", SCREEN_MODE.Update)
			//.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
			.search("clientCd", $scope.cond.clientCd)
			.search("mfpickctlId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mfrcvdesignId)
	};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);


