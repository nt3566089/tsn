/**
 * @ngdoc overview
 * @name oneslogiWms.boxGroupMasterList
 *
 * @description
 * 荷材グループマスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.BoxGroupMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.boxGroupMasterList.service:BoxGroupMasterListtApi
 *
 * @description
 * 荷材グループメンテナンス（一覧）WebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/BoxGroupMasterList/init 初期化用WebApi<br>
 * ・resources/master/BoxGroupMasterList/search 検索用WebApi<br>
 *
 */
.factory('BoxGroupMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		boxGroupMasterList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/boxGroupMasterList/init'],
				 ['search', 'GET', 'resources/master/boxGroupMasterList/search'],
				 ['excel',  'GET', 'resources/master/boxGroupMasterList/search', 'excel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
 *
 * @description
 * 荷材グループメンテナンス（一覧）画面コントローラ
 */
.controller('BoxGroupMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'BoxGroupMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.boxGroupListCols =
		[
		//荷主センタ変更対応 201７.01.23 sja Start
		 {field:"mbox.mcenter.centerCd", displayName:"センタCD"},
		 {field:"mbox.mcenter.centerNm", displayName:"センタ名称"},
		//荷主センタ変更対応 201７.01.23 sja End
		 {field:"boxGrpCd", displayName:"荷材グループCD"},
		 {field:"boxGrpNm", displayName:"荷材グループ名称"},
		 {field:"mbox.boxCd", displayName:"基準荷材CD"},
		 {field:"mbox.boxNm", displayName:"基準荷材名称"},
		 {field:"delFlg", displayName:"削除フラグCD"},
		 {field:"mcenterClassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"}
		 ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#initScreen
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
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

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'boxGroupList',
			columnDefs: 'boxGroupListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#initScreenHttp
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
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
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#deferredGetDelFlg
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
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
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
	 *
	 * @description
	 * 荷材グループメンテナンスマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.boxGroupMasterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.boxGroupList = response.data.boxGroupMasterList;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mbox.mcenter.centerCd = userInfo.centerCd;
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
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#excelOutput
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		// [#980] 検索結果とExcel出力が異なる不具合を修正 2017.02.14 kawana Start
		$scope.head.centerId = userInfo.centerIdByCd($scope.head.mbox.mcenter.centerCd);
		// [#980] 検索結果とExcel出力が異なる不具合を修正 2017.02.14 kawana End
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "boxGroupMasterList", document.title);

		api.boxGroupMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#search
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
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
	 * @name oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList#getPagedDataAsync
	 * @methodOf oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		$scope.head.centerId = userInfo.centerIdByCd($scope.head.mbox.mcenter.centerCd);
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.boxGroupMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList#gridDblClick
	 * @methodOf oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList
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
	 * @name oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList#getClassForRow
	 * @methodOf oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList
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
	 * @name oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList##setPagingData
	 * @methodOf oneslogiWms.BoxGroupMasterList.object:BoxGroupMasterList
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
		$scope.boxGroupList = response.data.boxGroupMasterList;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#update
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の荷材グループデータを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		//修正画面へ遷移
		//荷主センタ変更対応 201７.01.23 sja Start
//		$location.path("wms/master/BoxGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("setBoxGrpId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxGrpId);
		$location.path("wms/master/BoxGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
			.search("setBoxGrpId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxGrpId)
			.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd);
		//荷主センタ変更対応 201７.01.23 sja End
	};

	// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#copy
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function() {

		//修正画面へ遷移
		//荷主センタ変更対応 201７.01.23 sja Start
//		$location.path("wms/master/BoxGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("setBoxGrpId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxGrpId);
		$location.path("wms/master/BoxGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Copy)
			.search("setBoxGrpId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxGrpId)
			.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd);
		//荷主センタ変更対応 201７.01.23 sja End
	};
	// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.boxGroupMasterList.object:boxGroupMasterList#register
	 * @methodOf oneslogiWms.boxGroupMasterList.object:boxGroupMasterList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 *荷材グループメンテナンス新規する為の画面を表示する。
	 */
	$scope.initNew = function() {
		//新規画面へ遷移
		$location.path("wms/master/BoxGroupMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
