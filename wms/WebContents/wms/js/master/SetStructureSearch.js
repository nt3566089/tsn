/**
 * @ngdoc overview
 * @name oneslogiWms.SetStructureSearch
 *
 * @description
 * セット品構成マスタメンテナンス（一覧）画面<br>
 */
angular.module('oneslogiWms.SetStructureSearch', [])

/**
 * @ngdoc service
 * @name oneslogiWms.SetStructureSearch.service:setStructureSearchApi
 *
 * @description
 * セット品構成マスタメンテナンス(一覧)WebApi定義<br>
 *
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/setStructureSearch/init 初期化用WebApi<br>
 * ・resources/master/setStructureSearch/search 検索用WebApi<br>
 */
.factory('setStructureSearchApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		setStructureSearch: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/setStructureSearch/init'],
				 ['search', 'GET', 'resources/master/setStructureSearch/search'],
				 ['excel',  'GET', 'resources/master/setStructureSearch/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch
 *
 * @description
 * セット品構成マスタメンテナンス(一覧)画面コントローラ<br>
 */
.controller('SetStructureSearch', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'setStructureSearchApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.setStructureSearchCols = [
	                           {field:"mproduct.productCd", displayName:"親商品CD"},
	                           {field:"mproduct.productNm", displayName:"親商品名称"},
	                           {field:"mproduct.productAbbr", displayName:"親商品略称"},
	                           {field:"mproduct.janCd", displayName:"JANCD"},
	                           {field:"delFlg", displayName:"削除フラグCD"},
	                  	       {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"},
	                  		   //荷主センタ変更対応 201７.02.13 sja Start
	                  		   {field:"mproduct.mclient.clientCd", displayName:"荷主CD"},
	                  		   {field:"mproduct.mclient.clientNm", displayName:"荷主名称"}
	                  		   //荷主センタ変更対応 201７.02.13 sja End

	                           ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#initScreen
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'setStructureSearchList',
			columnDefs: 'setStructureSearchCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#initScreenHttp
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDelFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object::SetStructureSearch#deferredGetDelFlg
	 * @methodOf oneslogiWms.:SetStructureSearch.object::SetStructureSearch
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#deferredGetInitData
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * セット品構成マスタ初期値取得・設定処理（同期可能）<br>
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.setStructureSearch.init().then(function(response){
			$scope.head = response.data.head;
			$scope.setStructureSearchList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mproduct.mclient.clientCd = userInfo.clientCd;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearcht#excelOutput
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.setStructureSearch.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#gridDblClick
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#search
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 検索ボタンを押下された時に処理<br>
	 * ・グリッドのページングクリア処理呼び出し<br>
	 * ・検索処理呼び出し
	 */
	  $scope.search = function(){
			owsCommon.clearPagingOptions($scope.gridOptions);
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#getPagedDataAsync
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 検索処理<br>
	 * ・セット品構成マスタ検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.setStructureSearch.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#setPagingData
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
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

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.setStructureSearchList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#getClassForRow
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#update
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * セット品構成マスタメンテナンス(編集)画面へ遷移。
	 */
	$scope.update = function() {
		//荷主センタ変更対応 201７.02.13 sja Start
		//修正画面へ遷移
		$location.path("wms/master/SetStructureEdit").search({}).search("mode", SCREEN_MODE.Update)
		.search("setParentId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].setParentId)
		.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd);
		//荷主センタ変更対応 201７.02.13 sja End
	};

	// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#copy
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function() {

		//修正画面へ遷移
		$location.path("wms/master/SetStructureEdit").search({}).search("mode", SCREEN_MODE.Copy).search("setParentId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].setParentId);
	};
	// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureSearch.object:SetStructureSearch#register
	 * @methodOf oneslogiWms.SetStructureSearch.object:SetStructureSearch
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * セット品構成マスタメンテナンス(編集)画面へ遷移。
	 */
	$scope.register = function() {

		//新規画面へ遷移
		$location.path("wms/master/SetStructureEdit").search({}).search("mode", SCREEN_MODE.Register);

	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);