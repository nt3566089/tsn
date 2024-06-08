/**
 * @ngdoc overview
 * @name oneslogiWms.CenterProductControlMasterList
 *
 * @description
 * センタマスタメンテナンス(一覧)画面
 */
angular.module('oneslogiWms.CenterProductControlMasterList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterProductControlMasterList.service:CenterProductControlMasterListApi
 *
 * @description
 * センタマスタメンテナンス(一覧)WebApi定義<br>
 * ・resources/master/CenterProductControlMasterList/init 初期化用WebApi<br>
 * ・resources/master/CenterProductControlMasterList/selectByConditions 検索用WebApi<br>
 *
 */
.factory('CenterProductControlMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		getCenterCd: AngularAPIClient.make(
			    [
			    ['query', 'GET', 'resources/common/centerCd/keyValueList']
			    ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		CenterProductControlMasterList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/CenterProductControlMasterList/init'],
			    ['search', 'GET', 'resources/master/CenterProductControlMasterList/selectByConditions'],
			    ['excel',  'GET', 'resources/master/CenterProductControlMasterList/selectByConditions', 'excel']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
 *
 * @description
 * センタマスタメンテナンス(一覧)画面コントローラ
 */
.controller('CenterProductControlMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'CenterProductControlMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.CenterProductControlMasterListCols =
		[
			{field:"itemCd", displayName:"銘柄CD"},
			{field:"mProduct.productNm", displayName:"銘柄名称"},
			{field:"slotLocName", displayName:"保管ロケ名称"},
			{field:"pickLocName", displayName:"ピッキングロケ名称"},
			{field:"updDt", displayName:"更新日時"},
			{field:"updUser", displayName:"更新者"},
			{field:"mFcompany.transportPriority", displayName:"出力順(組織)"},
			{field:"mProductSub.userNum3", displayName:"一般出力順"},
			{field:"mProductSub.userNum1", displayName:"内外区分"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#initScreen
     * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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

		// センタ取得
		$scope.centerList = userInfo.centerList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'CenterProductControlMasterList',
			columnDefs: 'CenterProductControlMasterListCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},

				"mclient.clientCd" : {
					key : "clientCd",
					value : "clientNm",
					listModel : "clientList"
				},
				"mmfwhxitem.mfwhItemId" : {
					key : "mfwhItemId",
					value : "mfwhItemNm",
					listModel : "mmfwhxitemList"
				}
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#initScreenHttp
     * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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
	 * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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
	 * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
	 *
	 * @description
	 * センタマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.CenterProductControlMasterList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.CenterProductControlMasterList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.mcenter.centerCd = userInfo.centerCd;

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
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#productBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.head.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.head.mproduct.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showProduct
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
			clientCd: userInfo.clientCd,
			productCd: $scope.head.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd = selectedItem.productCd;
			$scope.head.mproduct.productNm = selectedItem.productNm;
		});
	};



	/**
     * @ngdoc method
     * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#search
     * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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
     * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#getPagedDataAsync
     * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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
		api.CenterProductControlMasterList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#setPagingData
     * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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
		$scope.CenterProductControlMasterList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterList.object:CenterMaster#excelOutput
	 * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterMaster
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

		api.CenterProductControlMasterList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterList.object:CenterMaster#gridDblClick
	 * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterMaster
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
	 * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#getClassForRow
	 * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
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
	 * @name oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList#update
	 * @methodOf oneslogiWms.CenterProductControlMasterList.object:CenterProductControlMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の商品データを修正する為の画面を表示する。
	 */
	$scope.update = function() {

		//修正画面へ遷移
		$location.path("wms/master/CenterProductControlMasterEdit")
			.search({}).search("mode", SCREEN_MODE.Update)
			.search("mfwhItemId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mfwhItemId);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
