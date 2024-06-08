/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClassList
 *
 * @description
 * センタ区分値マスタ一覧画面
 */
angular.module('oneslogiWms.CenterClassList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClassList.service:centerClassListApi
 *
 * @description
 *   centerClassListApi センタ区分値マスタ一覧WebApi定義<br>
 * ・resources/master/centerClassList/init 初期化用WebApi<br>
 * ・resources/master/centerClassList/search 検索用WebApi<br>
 * ・resources/master/centerClassList/checkDelete チェック処理（削除）用WebApi<br>
 * ・resources/master/centerClassList/delete 削除用WebApi<br>
 *
 */
.factory('centerClassListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {

		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		centerClassList: AngularAPIClient.make(
			[
			    ['init'       , 'GET',  'resources/master/centerClassList/init'],
			    ['search'     , 'GET',  'resources/master/centerClassList/search'],
			    ['checkDelete', 'POST', 'resources/master/centerClassList/checkDelete'],
			    ['delete'     , 'POST', 'resources/master/centerClassList/delete']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClassList.object:CenterClassList
 *
 * @description
 * センタ区分値マスタ(一覧)画面コントローラ
 */
.controller('CenterClassList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'centerClassListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.classListCols =
		[
         {field:"mcenter.centerCd", displayName:"センタ"},
         {field:"classCd", displayName:"区分値CD"},
         {field:"classComment", displayName:"区分値解説"},
         {field:"systemType", displayName:"システム種別CD"},
         {field:"mcenterClassDtlBySystemType.vdict.dictNm", displayName:"システム種別名称"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.CenterClassList.object:CenterClassList#initScreen
     * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
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
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'centerClassList',
			columnDefs: 'classListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.CenterClassList.object:CenterClassList#initScreenHttp
     * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     *
     * サーバとの通信を制御し、取得結果を画面項目に反映する。
     */
	$scope.initScreenHttp = function(response) {

			$q.all(
					[
					 $scope.systemTypeList()
					 ])
			//全通信終了後に以下関数で各種設定を実行
			.then(function(response){
				// 画面初期化データ設定（同期処理）

				return $scope.deferredGetInitData();
			});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * システム種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.systemTypeList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SYSTEM_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.systemTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassList.object:CenterClassList#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
	 *
	 * @description
	 * 区分値マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.centerClassList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.centerClassList = response.data.body;
			$scope.paging = response.paging;
			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CenterClassList.object:CenterClassList#search
     * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
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
     * @name oneslogiWms.CenterClassList.object:CenterClassList#getPagedDataAsync
     * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
     *
     * @description
     * 検索処理<br>
     * ・区分値マスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.centerClassList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CenterClassList.object:CenterClassList#setPagingData
     * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
     *
     * @description
     * 検索結果反映処理<br>
     * ・行センタ状態のクリア<br>
     * ・取得データをグリッドに反映<br>
     * ・トータル件数を設定
     */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.centerClassList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassList.object:CenterClassList#getClassForRow
	 * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
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
	 * @name oneslogiWms.InfoMaster.object:InfoMaster#gridDblClick
	 * @methodOf oneslogiWms.InfoMaster.object:InfoMaster
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
	 * @name oneslogiWms.centerMasterList.object:centerMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.centerMasterList.object:centerMasterList
	 *
	 * @description
	 * 削除ボタン押下処理<br>
	 *
	 * 削除する為の画面を表示する。
	 */
	$scope.deletedata = function() {
		var listBody = [];
		//明細が表示されていない場合
		if($scope.centerClassList.length == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行の場合に警告
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!owsCommon.viewConfirm("confirmDeleteRow")) {
				return;
			}
		}

		//グリッドの明細行数分繰返
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			listBody.push($scope.gridOptions.gridApi.selection.getSelectedRows()[row]);
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.body = listBody;

		api.centerClassList.checkDelete(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}

			// 区分値プマスタ削除または更新
			api.centerClassList.delete(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}

				// 初期化
				$scope.search();
			});
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassList.object:CenterClassList#register
	 * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * センタ新規する為の画面を表示する。
	 */
	$scope.register = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//新規画面へ遷移
		$location.path("wms/master/CenterClassEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	// 画面初期化処理を実行
	$scope.initScreen();

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassList.object:CenterClassList#update
	 * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		var listBody = [];

		//明細が表示されていない場合
		if($scope.centerClassList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
	    }

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		$location.path("wms/master/CenterClassEdit").search({}).search("mode", SCREEN_MODE.Update).search("centerClassId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerClassId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassList.object:CenterClassList#update
	 * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
	 *
	 * @description
	 * 区分値グループ修正ボタン押下処理<br>
	 *
	 * 【区分値グループメンテナンス】画面へ遷移する。
	 */
	$scope.classGrpUpdate = function() {

		var listBody = [];

		//明細が表示されていない場合
		if($scope.centerClassList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		$location.path("wms/master/CenterClassGrpEdit").search({}).search("centerClassId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerClassId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassList.object:CenterClassList#update
	 * @methodOf oneslogiWms.CenterClassList.object:CenterClassList
	 *
	 * @description
	 * 区分値グループ明細修正ボタン押下処理<br>
	 *
	 * 【区分値グループ明細メンテナンス】画面へ遷移する。
	 */
	$scope.classGrpDtlUpdate = function() {

		var listBody = [];
		//明細が表示されていない場合
		if($scope.centerClassList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		$location.path("wms/master/CenterClassGrpDtlEdit").search({}).search("centerClassId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerClassId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};


}]);
