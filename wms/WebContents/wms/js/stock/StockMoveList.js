/**
 * @ngdoc overview
 * @name oneslogiWms.StockMoveList
 *
 * @description
 * 在庫移動一覧画面
 */
angular.module('oneslogiWms.StockMoveList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockMoveList.service:stockMoveListApi
 *
 * @description
 * 在庫移動一覧WebApi定義<br>
 * ・resources/stock/stockSetInst/init 初期処理WebApi<br>
 * ・resources/stock/stockSetInst/search 検索処理WebApi<br>
 * ・resources/stock/stockSetInst/inputCheckUpdate 指示前入力チェックWebApi<br>
 * ・resources/stock/stockSetInst/register 指示処理WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 *
 */
.factory('stockMoveListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		//荷主センタ変更対応 2017.02.17 sja Start
		warehouseList: AngularAPIClient.make(
				[
				 	['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
                ]
		),
		//荷主センタ変更対応 2017.02.17 sja End
		processType: AngularAPIClient.make(
				[
				 //[ON推-品向-1137] 処理区分データ絞り込み 2016.4.25 chou Mod Start
				 ['keyValueList2', 'GET', 'resources/common/processType/keyValueList2']
				 //[ON推-品向-1137] 処理区分データ絞り込み 2016.4.25 chou Mod End
				 ]
		),
		stockMoveList: AngularAPIClient.make([
		                                      ['init',             'GET',  'resources/stock/stockMoveList/init'],
		                                      ['search',           'GET',  'resources/stock/stockMoveList/search'],
		                                      ['updateCheck',      'POST', 'resources/stock/stockMoveList/updateCheck'],
		                                      ['register',         'POST', 'resources/stock/stockMoveList/register'],
		                                      ['cancel',           'POST', 'resources/stock/stockMoveList/cancel'],
		                                      // Excel出力ボタン追加 2016.1.27 koyama Start
		                                      ['excel',            'GET',  'resources/stock/stockMoveList/search', 'excel']
		                                      // Excel出力ボタン追加 2016.1.27 koyama End
		                                     ]
		),
		//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End
		// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama Start
		reportPrint: AngularAPIClient.make(
				[
				 ['instPrint', 'GET', 'resources/stock/stockMoveList/instPrint'],
				 ['releasePrint', 'GET', 'resources/stock/stockMoveList/releasePrint'],
				// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
				 ['replenishPrint', 'GET', 'resources/stock/stockMoveList/replenishPrint'],
				// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End
				//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
				 ['moveLabelPrint', 'GET', 'resources/stock/stockMoveList/moveLabelPrint']
				//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End
				 ]
		),
		reportId: AngularAPIClient.make(
				[
				 ['searchReportId', 'GET', 'resources/stock/stockMoveList/searchReportId']
				 ]
		)
		// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockMoveList.service:stockMoveList
 * @description
 * セット組指示画面コントローラ
 */
.controller('StockMoveList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'printFactory', 'stockMoveListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, printFactory, api) {

	var oldClient;

	// 構成品グリッドの列情報（デザイン用）
	$scope.listCols =
		[
		 	//荷主センタ変更対応 2017.02.17 sja Start
		 	{field:"mclient.clientCd", displayName:"荷主"},
		 	{field:"mclient.clientNm", displayName:"荷主名称"},
		 	{field:"mcenter.centerCd", displayName:"センタ"},
		 	{field:"mcenter.centerNm", displayName:"センタ名称"},
		 	//荷主センタ変更対応 2017.02.17 sja End
		    {field:"instDt", displayName:"指示日"},
		    {field:"moveSlipNo", displayName:"WMS在庫移動伝票No."},
		    {field:"mprocessType.processTypeCd", displayName:"処理区分CD"},
		    {field:"mprocessType.vdict.dictNm", displayName:"処理区分名称"},
		    {field:"moveInstStatus", displayName:"在庫移動指示ステータスCD"},
		    {field:"mcenterClassDtlByMoveInstStatus.vdict.dictNm", displayName:"在庫移動指示ステータス名称"},
		    {field:"warehouseCd", displayName:"倉庫CD"},
		    {field:"warehouseNm", displayName:"倉庫名称"},
		  //[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
		    {field:"sourceBatchNo", displayName:"指示元バッチNo."},
		    {field:"pickingLocation", displayName:"出庫ロケーション"},
		    {field:"storeLocation", displayName:"入庫ロケーション"},
		    {field:"productCd", displayName:"商品CD"},
		    {field:"productNm", displayName:"商品名称"},
		    {field:"instCaseNum", displayName:"指示ケース数"},
		    {field:"instPieceNum", displayName:"指示ピース数"},
		    {field:"instTotalNum", displayName:"指示総数"},
		  //[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End
		    {field:"instNumOut", displayName:"指示出庫数"},
		    {field:"instNumIn", displayName:"指示入庫数"},
		  //[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
		    {field:"printCondition", displayName:"発行状況"},
		    {field:"moveSourceStoreLabelNo", displayName:"移動元入庫ラベルNo."},
		  //[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End
		    {field:"moveInstComment", displayName:"在庫移動指示備考"}
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.StockMoveList.service:stockMoveList#initScreen
     * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {

		// [ON推-品向-1161] 検索モードでの遷移を追加 2016.07.01 kawana Start
		$scope.screenMode = $route.current.params.mode;
		// [ON推-品向-1161] 検索モードでの遷移を追加 2016.07.01 kawana End

		//検索条件枠を開いた状態に設定
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

		//荷主センタ変更対応 201７.02.17 sja Start
		//センタ変更後処理
		$scope.centerChange = function() {
			// 倉庫リストの取得・設定処理（同期可能）
			$scope.deferredGetWarehouseList();
		};
		//荷主センタ変更対応 201７.02.17 sja End

		// 在庫移動一覧グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'list',
			columnDefs: 'listCols',
			pagingOptions : $scope.pagingOptions
		});

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockMoveList.service:stockMoveList#initScreenHttp
     * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
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
				// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana Start
				 $scope.deferredGetNotCompletedFlgList(),
				// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana End
				 //[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
				 $scope.deferredGetConditionList(),
				 //[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End
				 //荷主センタ変更対応 2017.02.17 sja Start
				 $scope.deferredGetWarehouseList(),
				 //荷主センタ変更対応 2017.02.17 sja End
				 $scope.deferredGetProcessTypeList()
				 ]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#showProduct
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
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
	 * @name oneslogiWms.ReplenishInstList.object:ReplenishInstList#productCdBlur
	 * @methodOf oneslogiWms.ReplenishInstList.object:ReplenishInstList
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
	//[ON推-品向-1081] 検索条件に項目を追加 2016.4.11 chou Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#deferredGetMoveInstStatus
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * 在庫移動指示ステータス取得・設定処理（同期可能）<br>
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

	// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#deferredGetNotCompletedFlg
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
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
	// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
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
		//[ON推-品向-1137] 処理区分データ絞り込み 2016.4.25 chou Mod Start
		request.moveFlg = "";

		api.processType.keyValueList2(request).then(function(response){
		//[ON推-品向-1137] 処理区分データ絞り込み 2016.4.25 chou Mod End
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.17 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveHistory.object:StockMoveHistory#deferredGetWarehouseList
	 * @methodOf oneslogiWms.StockMoveHistory.object:StockMoveHistory
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		if ($scope.head) {
			request.centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}

		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.16 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#deferredGetInitData
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * 在庫移動一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockMoveList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.list = response.data.list;
			$scope.paging = response.paging;
			// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama Start
			$scope.printParam = response.data.directionsPrintParam.printBasicData;
			// [ON推-品向-1034] 指示書発行機能追加 2015.12.21 koyama End

			// ログイン情報より初期値を設定
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;

			$scope.head.instDtFrom = userInfo.systemDt;
			$scope.head.instDtTo = userInfo.systemDt;
			// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana Start
			$scope.head.notCompletedFlg = owsCommon.getDefaultValue($scope.notCompletedFlgList);
			// [ON推-品向-1143] 在庫移動一覧 - 未完了のみ表示 追加 2016.04.28 kawana End
			//[ON推-品向-1131] 修正対応 2016.4.19 chou Mod Start
			$scope.head.printCondition = owsCommon.getDefaultValue($scope.printConditionList);
			//[ON推-品向-1131] 修正対応 2016.4.19 chou Mod End

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete



			if (owsHistory.hasState()) {
				// 履歴から検索

				$scope.head = owsHistory.popState();
				$scope.search();

				// [ON推-品向-1161] 検索モードでの遷移を追加 2016.07.01 kawana Start
			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				// 検索モード

				// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana Start
				$scope.head.mcenter.centerCd = $route.current.params.centerCd;
				$scope.head.mclient.clientCd = $route.current.params.clientCd;
				// [#1781] 緊急補充発生時のメッセージからリンクにセンタCD・荷主CDを追加 2017.05.18 kawana End
				$scope.head.mprocessType.processTypeCd = $route.current.params.processTypeCd;
				$scope.search();
			}
			// [ON推-品向-1161] 検索モードでの遷移を追加 2016.07.01 kawana End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	// Excel出力ボタン追加 2016.1.27 koyama Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#excelOutput
	 * @methodOf oneslogiWms.ProductList.object:ProductList
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
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.stockMoveList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};
	// Excel出力ボタン追加 2016.1.27 koyama End

	/**
     * @ngdoc method
     * @name oneslogiWms.StockMoveList.service:stockMoveList#search
     * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
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
     * @name oneslogiWms.StockMoveList.service:stockMoveList#getPagedDataAsync
     * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
     *
     * @description
     * 検索処理<br>
     * ・権限マスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.stockMoveList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.RoleList.object:RoleList#setPagingData
     * @methodOf oneslogiWms.RoleList.object:RoleList
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
		$scope.list = response.data.list;
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
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#getClassForRow
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 在庫移動指示ステータスに応じた背景色をテンプレートに返す。
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#instDetail
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * 指示明細ボタン押下処理<br>
	 *
	 * 【指示明細】画面へ遷移する。
	 */
	$scope.instDetail = function() {
		var list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		if(list.length > 1){
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		//指示明細画面へ遷移
		$location.path("wms/stock/StockMoveInstList").search({}).search("clientCd", list[0].mclient.clientCd).search("centerCd", list[0].mcenter.centerCd).search("moveSlipNo", list[0].moveSlipNo);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#gridDblClick
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	$scope.gridDblClick = function(row) {
		//指示明細画面へ遷移
		$location.path("wms/stock/StockMoveInstList").search({}).search("clientCd", row.entity.mclient.clientCd).search("centerCd", row.entity.mcenter.centerCd).search("moveSlipNo", row.entity.moveSlipNo);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#register
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * 完了ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 明細行が選択してない場合
		var list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		if(list.length == 0){
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ver3.0][#3206] 処理区分が同一でないとき登録不可とする 2018.01.04 matsumoto Start
		var processCd = list[0].mprocessType.processTypeCd;
		// [ver3.0][#3206] 処理区分が同一でないとき登録不可とする 2018.01.04 matsumoto End

		//[ON推-品向-1081] 修正対応 2016.4.14 chou Add Start
		//処理可否のチェックを行う
		for(var i = 0; i < list.length; i++){

			// [ver3.0][#3206] 処理区分が同一でないとき登録不可とする 2018.01.04 matsumoto Start
			// 処理区分が同一でないときエラーとする
			if(list[i].mprocessType.processTypeCd != processCd) {
				alertMessage.setErrorMessageByCode("stockMoveListDataCannotSelectDifferentProcessTypeError");
				return;
			}
			// [ver3.0][#3206] 処理区分が同一でないとき登録不可とする 2018.01.04 matsumoto End

			if (list[i].mprocessType.processTypeCd == "30" || list[i].mprocessType.processTypeCd == "31" ||
					list[i].mprocessType.processTypeCd == "32" || list[i].mprocessType.processTypeCd == "33") {

				//セット組指示、セット解除指示、定期補充、緊急補充の場合、且つ在庫移動指示ステータスが完了、取消の場合に、エラーとする。
				if (list[i].moveInstStatus == "02" || list[i].moveInstStatus == "99") {
					alertMessage.setErrorMessageByCode("moveInstStatusCannotExecuteExceptWorkingNonworkError");
					return;
				}
			// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase Start
			} else if (list[i].mprocessType.processTypeCd == "21") {
				// 在庫移動指示ステータスが完了、取消の場合に、エラーとする。
				if (list[i].moveInstStatus == "02" || list[i].moveInstStatus == "99") {
					alertMessage.setErrorMessageByCode("moveInstStatusCannotExecuteExceptWorkingNonworkError");
					return;
				}
				if (list[i].storeLocationNm == null) {
					// 入庫ロケーション未入力時は処理不可
					alertMessage.setErrorMessageByCode("cannotStockMoveError");
					return;
				}
			// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase End
			} else {
				//それ以外の場合（入荷、出荷、調整など）に、エラーとする。
				alertMessage.setErrorMessageByCode("stockCannotExecuteSetReplenishDataError");
				return;
			}

		}
		//[ON推-品向-1081] 修正対応 2016.4.14 chou Add End

		var request = {};
		request.data = {};
		request.data.list = list;
		// 処理前チェックを行う
		api.stockMoveList.updateCheck(request).then(function(response) {
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			};
			// 取消処理
			api.stockMoveList.register(request).then(function(response) {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
				$scope.search();
			});
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#cancel
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * 取消ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.cancel = function() {
		// 明細行が選択してない場合
		var list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		if(list.length == 0){
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		//[ON推-品向-1081]修正対応 2016.4.14 chou Add Start
		//処理可否のチェックを行う
		for(var i = 0; i < list.length; i++){

			if (list[i].mprocessType.processTypeCd == "33" && (list[i].moveInstStatus == "00" || list[i].moveInstStatus == "01")) {
				//緊急補充、且つ在庫移動指示ステータスが未作業、作業中の場合に、エラーとする。
				alertMessage.setErrorMessageByCode("dataCannotCancelEmergencyReplenishmentDataError");
				return;

			} else if (list[i].mprocessType.processTypeCd == "30" || list[i].mprocessType.processTypeCd == "31" ||
					list[i].mprocessType.processTypeCd == "32" || list[i].mprocessType.processTypeCd == "33") {

				//セット組指示、セット解除指示、定期補充、緊急補充の場合、且つ在庫移動指示ステータスが完了、取消の場合に、エラーとする。
				if (list[i].moveInstStatus == "02" || list[i].moveInstStatus == "99") {
					alertMessage.setErrorMessageByCode("moveInstStatusCannotExecuteExceptWorkingNonworkError");
					return;
				}

			// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase Start
			} else if (list[i].mprocessType.processTypeCd == "21") {
				// 在庫移動指示ステータスが完了、取消の場合に、エラーとする。
				if (list[i].moveInstStatus == "02" || list[i].moveInstStatus == "99") {
					alertMessage.setErrorMessageByCode("moveInstStatusCannotExecuteExceptWorkingNonworkError");
					return;
				}
			// [#2233] 処理対象に処理区分【移動】を追加 2017.08.22 ase End
			} else {
				//それ以外の場合（入荷、出荷、調整など）に、エラーとする。
				alertMessage.setErrorMessageByCode("stockCannotExecuteSetReplenishDataError");
				return;
			}

		}
		//[ON推-品向-1081]修正対応 2016.4.14 chou Add End

		var request = {};
		request.data = {};
		request.data.list = list;
		// 処理前チェックを行う
		api.stockMoveList.updateCheck(request).then(function(response) {
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}
			// 取消処理
			api.stockMoveList.cancel(request).then(function(response) {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
				$scope.search();
			});
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMoveList.service:stockMoveList#listPrint
	 * @methodOf oneslogiWms.StockMoveList.service:stockMoveList
	 *
	 * @description
	 * 指示書ボタン押下処理<br>
	 *
	 * セット組指示書/セット組解除指示書を発行する。
	 */
	$scope.listPrint = function() {

		// 細が表示されていない場合
		if($scope.gridOptions.totalItems == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 明細行が選択してない場合
		var list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		if(list.length == 0){
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [#7089][OSS] 取消状態の明細が選択されている場合に明細を発行させないように対応 2020.01.24 tsuboi Start
		for(var i = 0; i < list.length; i++){
			if(list[i].moveInstStatus == 99){
				alertMessage.setErrorMessageByCode("cancelDataCannotOutputError");
				return;
			}
		}
		// [#7089][OSS] 取消状態の明細が選択されている場合に明細を発行させないように対応 2020.01.24 tsuboi Emd

		// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
		// 処理区分チェック
		for(var i = 0; i < list.length; i++){
			//[ON推-品向-1137]修正対応 2016.4.21 chou Mod Start
//			if(list[i].mprocessType.processTypeCd == "30"|| list[i].mprocessType.processTypeCd == "31"|| list[i].mprocessType.processTypeCd == "32"|| list[i].mprocessType.processTypeCd == "33"){

				if(i == 0){
					var processType = Number(list[0].mprocessType.processTypeCd);
				}else{
					// 異なる複数処理区分を選択している場合
					if(processType != list[i].mprocessType.processTypeCd){
						alertMessage.setErrorMessageByCode("stockMoveDataCannotSelectDifferentProcessTypeError");
						return;
					}
				}
//
//			}else{
//				// 上記以外
//				alertMessage.setErrorMessageByCode("stockMoveDataCannotSelectDifferentProcessTypeError");
//				return;
//			}
			//[ON推-品向-1137]修正対応 2016.4.21 chou Mod End
		}
		// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End

		//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add Start
		//下記の処理区分以外に対して、帳票出力が不可とする。
		if (!(  processType == 21 ||
				processType == 29 ||
				processType == 30 ||
				processType == 31 ||
				processType == 32 ||
				processType == 33)) {
			//[ON推-品質問題点指摘対応（新ｿﾘV2-019）]表示メッセージの追加 2016.07.19 chou Add Start
			alertMessage.setErrorMessageByCode("reportPrintCannotExecuteExceptSetReplenishMoveDataError");
			//[ON推-品質問題点指摘対応（新ｿﾘV2-019）]表示メッセージの追加 2016.07.19 chou Add End
			return;
		}
		//[ON推-品向-1137] 搬送ラベル発行機能追加 2016.4.22 chou Add End

		var isError = $scope.searchform.$invalid;

		// 帳票IDを取得
		api.reportId.searchReportId(processType).then(function(response){
			$scope.printParam = response.data.directionsPrintParam.printBasicData;

			// プリンタ選択画面を表示
			var modalInstance = printFactory.modalPrint($scope.printParam);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama Start
				request.data.head = $scope.head;
				// [C-CWMS-0050] 補充ラベル発行機能追加 2016.1.28 koyama End
				request.data.list = list;
				request.data.directionsPrintParam = {};
				request.data.directionsPrintParam.printBasicData = printParam.printBasicData;

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				var printApi;
				switch (processType) {
				case 30:
					// セット組指示書発行
					printApi = api.reportPrint.instPrint;
					break;
				case 31:
					// セット組解除指示書発行
					printApi = api.reportPrint.releasePrint;
					break;
				case 32:
				case 33:
					// 定期補充・緊急補充ラベル発行
					printApi = api.reportPrint.replenishPrint;
					break;
				case 21:
				case 29:
				default:
					// 搬送ラベル発行(移動・強制移動)
					printApi = api.reportPrint.moveLabelPrint;
					break;
				}

				// 印刷処理
				printApi(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}

					$scope.search();

				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
			});
		});
	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);

