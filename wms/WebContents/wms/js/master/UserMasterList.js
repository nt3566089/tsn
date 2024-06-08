/**
 * @ngdoc overview
 * @name oneslogiWms.UserMasterList
 *
 * @description
 * ユーザマスタ一覧画面
 */
angular.module('oneslogiWms.UserMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.UserMasterList.service:userMasterListApi
 *
 * @description
 * ユーザマスタ一覧WebApi定義<br>
 * ・resources/common/cultureCD/keyValueList カルチャデータ操作用WebApi<br>
 * ・resources/common/roleGrp/keyValueList 権限グループデータ操作用WebApi<br>
 * ・resources/base/master/userMasterList/init 初期化用WebApi<br>
 * ・resources/base/master/userMasterList/search 検索用WebApi<br>
 *
 */
.factory('userMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		culture: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/cultureCD/cultureList']
				 ]
		),
		roleGrp: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/roleGrp/keyValueList']
				 ]
		),
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		userMasterList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/userMasterList/init'],
				 ['search', 'GET', 'resources/master/userMasterList/search'],
				 ['excel',  'GET', 'resources/master/userMasterList/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.UserMasterList.object:UserMasterList
 *
 * @description
 * ユーザマスタ一覧画面コントローラ
 */
.controller('UserMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsSystem', 'userInfo', 'statusInfo', 'modalFactory', 'userMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, owsSystem, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.userMasterListCols =
		[
		 {field:"userCd", displayName:"ユーザCD"},
		 {field:"userNm", displayName:"ユーザ名"},
		 {field:"bculture.cultureCd", displayName:"カルチャCD"},
		 {field:"cultureNm", displayName:"カルチャ名"},
		 {field:"broleGrp.roleGrpCd", displayName:"権限グループCD"},
		 {field:"roleGrpNm", displayName:"権限グループ名"},
		 {field:"delFlgNm", displayName:"削除フラグ"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#initScreen
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'userMasterList',
			columnDefs: 'userMasterListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#initScreenHttp
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
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
				 $scope.deferredGetCulture(),
				 $scope.deferredGetRoleGrp(),
				 $scope.deferredGetDelFlg()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#deferredGetCulture
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * カルチャ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCulture = function () {
		var deferred = $q.defer();
		var request = {};
		api.culture.keyValueList(request).then(function(response){
			$scope.cultureList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#deferredGetRoleGrp
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * 権限グループ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetRoleGrp = function () {
		var deferred = $q.defer();
		var request = {};
		api.roleGrp.keyValueList(request).then(function(response){
			$scope.roleGrpList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#getClassForRow
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 削除フラグ='1'の場合明細行背景色レッドに設定する。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * ユーザマスタ一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.userMasterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.userMasterList = response.data.body;
			//センタリストの設定
			$scope.centerList = response.data.centerList;
			//荷主リストの設定
			$scope.clientList = response.data.clientList;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#excelOutput
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
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

		api.userMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#search
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
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
	 * @name oneslogiWms.InfoMaster.object:InfoMaster#gridDblClick
	 * @methodOf oneslogiWms.InfoMaster.object:InfoMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	$scope.gridDblClick = function(row) {
		owsCommon.syncButtonExec("role", row);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#getPagedDataAsync
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * 検索処理<br>
	 * ・ユーザマスタ一覧検索用WebAPIの呼び出し定義<br>
	 * ・検索終了後、検索結果反映処理呼び出し
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.userMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#setPagingData
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
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

		// 検索ボタン押下後のスクロール位置を上に戻す
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.userMasterList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#copy
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、[システムメニュー]ユーザマスタメンテナンス編集画面を表示する。
	 */
	$scope.copy = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		$location.path("base/master/UserMgtCopy")
		.search({})
		.search("mode", "COPY")
		.search("userId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].userId);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#register
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * [システムメニュー]ユーザマスタメンテナンス.ユーザ新規登録画面へ遷移する。
	 */
	$scope.register = function() {
		$location.path("base/master/UserMgtRegisterNew").search({}).search("mode", "NEW");
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#update
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行のユーザマスタメンテナンスを修正する為の[システムメニュー]ユーザマスタメンテナンス編集画面を表示する。
	 */
	$scope.update = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		$location.path("base/master/UserMgt")
			.search({})
			.search("mode", "UPDATE")
			.search("userId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].userId);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.UserMasterList.object:UserMasterList#passwordManagement
	 * @methodOf oneslogiWms.UserMasterList.object:UserMasterList
	 *
	 * @description
	 * 権限ボタン押下処理<br>
	 *
	 * 選択行のWMSユーザマスタメンテナンスを修正する為の[マスタメニュー]ユーザマスタメンテナンス編集画面を表示する。
	 */
	$scope.role = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// WMSユーザマスタメンテナンス画面へ遷移
		$location.path("wms/master/UserEdit").search({})
			.search("userId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].userId)
			.search("centerCd", $scope.head.muserCenterList[0].mcenter.centerCd)
			.search("clientCd", $scope.head.muserClientList[0].mclient.clientCd);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
