/**
 * @ngdoc overview
 * @name oneslogiWms.StockMoveBodyList
 *
 * @description
 * 在庫移動明細一覧画面
 */
angular.module('oneslogiWms.StockMoveBodyList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyListApi
 *
 * @description
 * 在庫移動明細一覧WebApi定義<br>
 * ・resources/stock/stockMoveBodyList/init 初期処理WebApi<br>
 * ・resources/stock/stockMoveBodyList/search 検索処理WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 *
 */
.factory('stockMoveBodyListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.16 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.16 sja End
		processType: AngularAPIClient.make(
				[
				 // 処理区分データ絞り込み
				 ['keyValueList2', 'GET', 'resources/common/processType/keyValueList2']
				 ]
		),
		stockMoveBodyList: AngularAPIClient.make([
		                                      ['init',             'GET',  'resources/stock/stockMoveBodyList/init'],
		                                      ['search',           'GET',  'resources/stock/stockMoveBodyList/search'],
		                                      ['excel',            'GET',  'resources/stock/stockMoveBodyList/search', 'excel']
		                                     ]
		),
		// 検索条件の項目
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
 * @description
 * 在庫移動明細一覧画面コントローラ
 */
.controller('StockMoveBodyList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'printFactory', 'stockMoveBodyListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, printFactory, api) {

	var oldClient;

	// 在庫移動明細一覧グリッドの列情報（デザイン用）
	$scope.listCols =
		[
		 	//荷主センタ変更対応 2017.02.16 sja Start
		 	{field:"tmoveInstH.mclient.clientCd", displayName:"荷主"},
		 	{field:"tmoveInstH.mclient.clientNm", displayName:"荷主名称"},
		 	{field:"tmoveInstH.mcenter.centerCd", displayName:"センタ"},
		 	{field:"tmoveInstH.mcenter.centerNm", displayName:"センタ名称"},
		 	//荷主センタ変更対応 2017.02.16 sja End
		    {field:"tmoveInstH.instDt", displayName:"指示日"},
		    {field:"tmoveInstH.moveSlipNo", displayName:"WMS在庫移動伝票No."},
		    {field:"tmoveInstH.mprocessType.processTypeCd", displayName:"処理区分CD"},
		    {field:"tmoveInstH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
		    {field:"moveInstStatus", displayName:"在庫移動指示ステータスCD"},
		    {field:"mcenterClassDtlByMoveInstStatus.vdict.dictNm", displayName:"在庫移動指示ステータス名称"},
		    {field:"tmoveInstH.sourceBatchNo", displayName:"指示元バッチNo."},
		    {field:"inoutType", displayName:"入出庫区分CD"},
		    {field:"inoutTypeNm", displayName:"入出庫区分名称"},
		    {field:"productCd", displayName:"商品CD"},
		    {field:"mproduct.productNm", displayName:"商品名称"},
		    {field:"mproduct.productAbbr", displayName:"商品略称"},
		    {field:"tmoveInstH.instCaseNum", displayName:"指示ケース数"},
		    {field:"tmoveInstH.instPieceNum", displayName:"指示ピース数"},
		    {field:"instNum", displayName:"指示入出庫数"},
            {field:"tmoveRecordBList[0].moveNum", displayName:"入出庫数"},
		    {field:"tmoveInstH.moveInstComment", displayName:"在庫移動指示備考"},
            {field:"mproduct.janCd", displayName:"JANCD"},
            {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
            {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
            {field:"warehouseCd", displayName:"倉庫CD"},
		    {field:"mwarehouse.warehouseNm", displayName:"倉庫名称"},
		    {field:"mlocation.locationCd", displayName:"ロケーションCD"},
            {field:"mlocation.locationNm", displayName:"ロケーション名称"},
            {field:"mcustomerByDepositId.customerCd", displayName:"預託CD"},
            {field:"mcustomerByDepositId.customerNm", displayName:"預託名称"},
            {field:"lot", displayName:"ロット"},
            {field:"limitDt", displayName:"期限日"},
            {field:"tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
            {field:"tstoreNo.tstoreNoSelf.storeLabelNo", displayName:"移動元入庫ラベルNo."},
            {field:"mcustomerBySupplierId.customerCd", displayName:"仕入先CD"},
            {field:"mcustomerBySupplierId.customerNm", displayName:"仕入先名称"},
            {field:"addDt", displayName:"登録日時"},
            {field:"updDt", displayName:"更新日時"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#initScreen
     * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {

		// 検索モードでの遷移
		$scope.screenMode = $route.current.params.mode;

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// 在庫移動一覧グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'list',
			columnDefs: 'listCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#initScreenHttp
     * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//全通信終了後に以下関数で各種設定を実行
		$q.all(
				[
				 $scope.deferredGetMoveInstStatus(),
				 $scope.deferredGetNotCompletedFlgList(),
				 $scope.deferredGetConditionList(),
				// 荷主センタ変更対応 201７.02.16 sja Start
				 $scope.deferredGetWarehouseCdList(),
				// 荷主センタ変更対応 201７.02.16 sja End
				 $scope.deferredGetProcessTypeList()
				 ]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#showProduct
	 * @methodOf oneslogiWms.StockMoveBodyList.object:stockMoveBodyList
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.head.mclient.clientCd,
				productCd: $scope.head.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.productCd =  selectedItem.productCd;
			$scope.head.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#productCdBlur
	 * @methodOf oneslogiWms.StockMoveBodyList.object:stockMoveBodyList
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		// 入力された商品コードを取得
		var productCd = $scope.head.productCd;

		if(productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.productCd = productCd;

			// 商品情報の取得
			api.product.record(request).then(function(response){
				$scope.head.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.head.productNm = null;
		}

	};

	// 発行条件プルダウンデータ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		api.dropdownList.query(request).then(function(response){
			$scope.printConditionList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#deferredGetMoveInstStatus
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description
	 * 在庫移動明細指示ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMoveInstStatus = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "MOVE_INST_STATUS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.moveInstStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#deferredGetNotCompletedFlg
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description
	 * 未完了のみ表示リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNotCompletedFlgList = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "NOT_COMPLETED_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.notCompletedFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.receiveFlg = "0";
		request.shippingFlg = "0";
		// 処理区分データ絞り込み
		request.moveFlg = "";

		api.processType.keyValueList2(request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.16 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#deferredGetWarehouseCdList
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description
	 * 倉庫プルダウンデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.head) {
			request.centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}
		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.16 sja End

	//荷主センタ変更対応 201７.02.16 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#changeCenter
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseCdList();
	};
	//荷主センタ変更対応 201７.02.16 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#deferredGetInitData
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description
	 * 在庫移動明細一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockMoveBodyList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.list = response.data.list;
			$scope.paging = response.paging;
			$scope.printParam = response.data.directionsPrintParam.printBasicData;

			// ログイン情報より初期値を設定
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.instDtFrom = userInfo.systemDt;
			$scope.head.instDtTo = userInfo.systemDt;

			// 未完了のみ表示 (0:全件表示)
			$scope.head.notCompletedFlg = 0;

			// 発行状況 (2：全件)
			$scope.head.printCondition = 2;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			if (owsHistory.hasState()) {
				// 履歴から検索
				$scope.head = owsHistory.popState();
				$scope.search();

				// 検索モードでの遷移
			} else if ($scope.screenMode == SCREEN_MODE.Read) {

				// 検索モード
				$scope.head.mprocessType.processTypeCd = $route.current.params.processTypeCd;
				$scope.search();
			}

			//荷主センタ変更対応 201７.02.16 sja Start
			// センタ変更後処理
			$scope.centerChange(true);
			//荷主センタ変更対応 201７.02.16 sja End
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#excelOutput
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
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

		api.stockMoveBodyList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#search
     * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#getPagedDataAsync
     * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
     *
     * @description
     * 検索処理<br>
     * ・検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.stockMoveBodyList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#setPagingData
     * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
     *
     * @description
     * 検索結果反映処理<br>
     * ・行センタ状態のクリア<br>
     * ・取得データをグリッドに反映<br>
     * ・トータル件数を設定
     */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
		$scope.list = response.data.body;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	// 日付大小チェック
	$scope.fromToCheck = function(fromValue, toValue) {
		var fromValueString = owsCommon.dateToString(fromValue);
		var toValueString = owsCommon.dateToString(toValue);

		if (fromValueString != null &&fromValueString.length > 0 &&
				toValueString != null && toValueString.length > 0 &&
				fromValueString > toValueString) {
			return false;
		}

		return true;
	};

	// 日付大小チェック用メッセージ
	$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveBodyList.service:stockMoveBodyList#getClassForRow
	 * @methodOf oneslogiWms.StockMoveBodyList.service:stockMoveBodyList
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 在庫移動明細指示ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		// 作業中
		if (row.entity.moveInstStatus == "01") {
			return "wmslegendlightblue";
		}
		// 完了
		if (row.entity.moveInstStatus == "02") {
			return "wmslegendturquoise";
		}
		// 取消
		if (row.entity.moveInstStatus == "99") {
			return "wmslegendindianred";
		}

	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);

