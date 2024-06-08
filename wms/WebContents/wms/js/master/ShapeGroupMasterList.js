/**
 * @ngdoc overview
 * @name oneslogiWms.ShapeGroupMasterList
 *
 * @description
 * 荷姿グループマスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.ShapeGroupMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ShapeGroupMasterList.service:ShapeGroupMasterListtApi
 *
 * @description
 * 荷姿グループマスタメンテナンス(一覧)WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/ShapeGroupMasterList/init 初期化用WebApi<br>
 * ・resources/master/ShapeGroupMasterList/search 検索用WebApi<br>
 *
 */
.factory('ShapeGroupMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		ShapeGroupMasterList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/ShapeGroupMasterList/init'],
				 ['search', 'GET', 'resources/master/ShapeGroupMasterList/search'],
				 ['excel',  'GET', 'resources/master/ShapeGroupMasterList/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
 *
 * @description
 * 荷姿グループマスタメンテナンス(一覧)画面コントローラ
 */
.controller('ShapeGroupMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ShapeGroupMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.shapeGroupListCols =
		[
		 {field:"clientCd", displayName:"荷主"},
		 {field:"clientNm", displayName:"荷主名称"},
		 {field:"shapeGrpCd", displayName:"荷姿グループCD"},
		 {field:"shapeGrpName", displayName:"荷姿グループ名称"},
		 {field:"decimalExistFlg", displayName:"小数有無フラグCD"},
		 {field:"bClassDtlByDecimalExistFlg.vdict.dictNm", displayName:"小数有無フラグ名称"},
		 {field:"delFlg", displayName:"削除フラグCD"},
		 {field:"bClassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"}
		 ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#initScreen
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

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
			data: 'shapeGroupList',
			columnDefs: 'shapeGroupListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#initScreenHttp
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
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
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetDecimalExistFlg()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#deferredGetDelFlg
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
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
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#deferredGetDecimalExistFlg
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 小数有無フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDecimalExistFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DECIMAL_EXIST_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.decimalExistFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 荷姿グループメンテナンスマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.ShapeGroupMasterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.shapeGroupList = response.data.shapeGroupMasterList;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mclient.clientCd = userInfo.clientCd;
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
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#excelOutput
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		$scope.head.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "shapeGroupMasterList", document.title);

		api.ShapeGroupMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#search
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
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
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#getPagedDataAsync
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		$scope.head.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.ShapeGroupMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#gridDblClick
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
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
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#getClassForRow
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * センタステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList##setPagingData
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.shapeGroupList = response.data.shapeGroupMasterList;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#update
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の荷姿グループデータを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		$location.path("wms/master/ShapeGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
			.search("setShapeGrpId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].shapeGrpId)
			.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mclient.clientCd);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#copy
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function() {

		$location.path("wms/master/ShapeGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Copy)
			.search("setShapeGrpId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].shapeGrpId)
			.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mclient.clientCd);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList#register
	 * @methodOf oneslogiWms.ShapeGroupMasterList.object:ShapeGroupMasterList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 *荷姿グループメンテナンス新規する為の画面を表示する。
	 */
	$scope.initNew = function() {
		//新規画面へ遷移
		$location.path("wms/master/ShapeGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 不要パラメータの削除 2018.02.22 honma Delete
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
