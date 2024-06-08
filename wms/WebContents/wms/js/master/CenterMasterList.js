/**
 * @ngdoc overview
 * @name oneslogiWms.CenterMasterList
 *
 * @description
 * センタマスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.CenterMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterMasterList.service:centerMasterListApi
 *
 * @description
 * センタマスタメンテナンス(一覧)WebApi定義<br>
 * ・resources/master/centerMasterList/init 初期化用WebApi<br>
 * ・resources/master/centerMasterList/selectByConditions 検索用WebApi<br>
 *
 */
.factory('centerMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		centerMasterList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/centerMasterList/init'],
			    ['search', 'GET', 'resources/master/centerMasterList/selectByConditions'],
			    ['excel',  'GET', 'resources/master/centerMasterList/selectByConditions', 'excel']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterMasterList.object:CenterMasterList
 *
 * @description
 * センタマスタメンテナンス(一覧)画面コントローラ
 */
.controller('CenterMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'centerMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.centerMasterListCols =
		[
         {field:"centerCd", displayName:"センタCD"},
         {field:"centerNm", displayName:"センタ名称"},
         {field:"centerAbbr", displayName:"センタ略称"},
         // [Ver3.0][#3267] カルチャ、タイムゾーンのCD・名称を追加 2018.01.05 shimizu Start
         {field:"bculture.cultureCd", displayName:"カルチャCD"},
         {field:"btimeZone.timeZoneCd", displayName:"タイムゾーンCD"},
         // [Ver3.0][#3267] カルチャ、タイムゾーンのCD・名称を追加 2018.01.05 shimizu End
		 // [横並-006] 削除フラグを追加 2014.11.26 taoys Start
         {field:"mcustomer.telNo", displayName:"電話番号"},
		 {field:"delFlg", displayName:"削除フラグCD"},
		 {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"}
		 // [横並-006] 削除フラグを追加 2014.11.26 taoys End
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.CenterMasterList.object:CenterMasterList#initScreen
     * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
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
		$scope.centerMasterList = userInfo.centerMasterList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'centerMasterList',
			columnDefs: 'centerMasterListCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.CenterMasterList.object:CenterMasterList#initScreenHttp
     * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     *
     * サーバとの通信を制御し、取得結果を画面項目に反映する。
     */
	$scope.initScreenHttp = function(response) {
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterList.object:CenterMasterList#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
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
	 * @name oneslogiWms.CenterMasterList.object:CenterMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
	 *
	 * @description
	 * センタマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.centerMasterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.centerMasterList = response.data.body;
			$scope.paging = response.paging;
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

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
     * @name oneslogiWms.CenterMasterList.object:CenterMasterList#search
     * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
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
     * @name oneslogiWms.CenterMasterList.object:CenterMasterList#getPagedDataAsync
     * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
     *
     * @description
     * 検索処理<br>
     * ・センタマスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.centerMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CenterMasterList.object:CenterMasterList#setPagingData
     * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
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

		// [ON推-品向-341] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-341] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得データをグリッドに反映
		$scope.centerMasterList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterList.object:CenterMaster#excelOutput
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMaster
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

		api.centerMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterList.object:CenterMaster#gridDblClick
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMaster
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
	 * @name oneslogiWms.CenterMasterList.object:CenterMasterList#getClassForRow
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
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
	 * @name oneslogiWms.CenterMasterList.object:CenterMasterList#register
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * センタ新規する為の画面を表示する。
	 */
	$scope.register = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//新規画面へ遷移
		$location.path("wms/master/CenterMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};

	// 画面初期化処理を実行
	$scope.initScreen();


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterList.object:CenterMasterList#update
	 * @methodOf oneslogiWms.CenterMasterList.object:CenterMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		$location.path("wms/master/CenterMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("mcenterId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

	};
}]);
