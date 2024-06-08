/**
 * @ngdoc overview
 * @name oneslogiWms.ediList
 *
 * @description
 * EDIマスタ一覧画面
 */
angular.module('oneslogiWms.EdiList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ediList.service:ediListApi
 *
 * @description
 *   ediListApi EDIマスタ一覧WebApi定義<br>
 * ・resources/master/ediList/init 初期化用WebApi<br>
 * ・resources/master/ediList/search 検索用WebApi<br>
 * ・resources/master/ediList/checkDelete チェック処理（削除）用WebApi<br>
 * ・resources/master/ediList/delete 削除用WebApi<br>
 *
 */
.factory('ediListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {

		ediList: AngularAPIClient.make(
			[
			    ['init'       , 'GET',  'resources/master/ediList/init'],
			    ['search'     , 'GET',  'resources/master/ediList/search'],
			    ['checkDelete', 'POST', 'resources/master/ediList/checkDelete'],
			    ['delete'     , 'POST', 'resources/master/ediList/delete']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.EdiList.object:EdiList
 *
 * @description
 * 区分値マスタ(一覧)画面コントローラ
 */
.controller('EdiList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'ediListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.ediListCols =
		[
         {field:"ediNm", displayName:"EDI名称"},
         {field:"ediId", displayName:"EDIID"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.EdiList.object:EdiList#initScreen
     * @methodOf oneslogiWms.EdiList.object:EdiList
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

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'ediList',
			columnDefs: 'ediListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.EdiList.object:EdiList#initScreenHttp
     * @methodOf oneslogiWms.EdiList.object:EdiList
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     *
     * サーバとの通信を制御し、取得結果を画面項目に反映する。
     */
	$scope.initScreenHttp = function(response) {

			$q.all(
					[
					 ])
			//全通信終了後に以下関数で各種設定を実行
			.then(function(response){
				// 画面初期化データ設定（同期処理）

				return $scope.deferredGetInitData();
			});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiList.object:EdiList#deferredGetInitData
	 * @methodOf oneslogiWms.EdiList.object:EdiList
	 *
	 * @description
	 * EDIマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.ediList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.ediList = response.data.body;
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
     * @name oneslogiWms.EdiList.object:EdiList#search
     * @methodOf oneslogiWms.EdiList.object:EdiList
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
     * @name oneslogiWms.EdiList.object:EdiList#getPagedDataAsync
     * @methodOf oneslogiWms.EdiList.object:EdiList
     *
     * @description
     * 検索処理<br>
     * ・EDIマスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.ediList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.EdiList.object:EdiList#setPagingData
     * @methodOf oneslogiWms.EdiList.object:EdiList
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

		// [ON推-品向-366] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-366] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.ediList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiList.object:EdiList#getClassForRow
	 * @methodOf oneslogiWms.EdiList.object:EdiList
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
		if($scope.ediList.length == 0)
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

		api.ediList.checkDelete(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}

			// EDIマスタ削除または更新
			api.ediList.delete(request).then(function(response){
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
	 * @name oneslogiWms.EdiList.object:EdiList#register
	 * @methodOf oneslogiWms.EdiList.object:EdiList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * EDIマスタ新規する為の画面を表示する。
	 */
	$scope.register = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//新規画面へ遷移
		$location.path("wms/master/EdiEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	// 画面初期化処理を実行
	$scope.initScreen();

	// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiList.object:EdiList#copy
	 * @methodOf oneslogiWms.EdiList.object:EdiList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function() {

		//修正画面へ遷移
		$location.path("wms/master/EdiEdit").search({}).search("mode", SCREEN_MODE.Copy).search("ediId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].ediId);

	};
	// コピー機能追加 EDIマスタ画面修正 2016.07.28 Lin Zar Ni Myint Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiList.object:EdiList#update
	 * @methodOf oneslogiWms.EdiList.object:EdiList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		var listBody = [];

		//明細が表示されていない場合
		if($scope.ediList.length == 0){
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
			//CT4_基盤-63 2014/11/20 UPD START
			//alertMessage.setErrorMessageByCode("lineMoreSelectError");
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			//CT4_基盤-63 2014/11/20 UPD END
			return;
	    }

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		$location.path("wms/master/EdiEdit").search({}).search("mode", SCREEN_MODE.Update).search("ediId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].ediId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

}]);
