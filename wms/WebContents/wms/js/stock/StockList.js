/**
 * @ngdoc overview
 * @name oneslogiWms.StockList
 *
 * @description
 * 現品在庫問合せ画面
 */
angular.module('oneslogiWms.StockList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockList.service:stockListApi
 *
 * @description
 * 現品在庫問合せWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/stock/stocklist/init 初期化用WebApi<br>
 * ・resources/stock/stocklist/search 検索用WebApi<br>
 * ・resources/stock/stocklist/search,excel Excel用WebApi<br>
 * ・resources/common/product/record 商品データ取得<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分取得<br>
 *
 */
.factory('stockListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockList: AngularAPIClient.make(
				[
				    ['init',   'GET', 'resources/stock/stocklist/init'],
				    ['search', 'GET', 'resources/stock/stocklist/search'],
				    ['excel', 'GET', 'resources/stock/stocklist/search', 'excel'],
					// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
				    ['storeLabelPrint', 'GET', 'resources/stock/stocklist/storeLabelPrint'],
					// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End
					// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start
				    ['stockListPrintParam', 'GET', 'resources/stock/stocklist/stockListPrintParam'],
				    ['stockListPrint', 'GET', 'resources/stock/stocklist/stockListPrint']
					// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End
				]
	    ),
		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
		warehouseList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		depositCustomerList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		stockDisplayFld: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		chargeNumDisplay: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		display: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		dropdownList: AngularAPIClient.make(
			    [
			        ['query', 'GET', 'resources/common/centerClass/keyValueList']
			    ]
			),
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		)
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockList.object:StockList
 *
 * @description
 * 現品在庫問合せ画面コントローラ
 */
.controller('StockList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'printFactory', 'stockListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, printFactory, api) {

	//グリッドの列情報（デザイン用）
	// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの列情報を修正 2018.02.23 shimizu Start
	$scope.stockOrderByProductNoReportListCols =
		[
		 	{field:"tstock.mproduct.productCd", displayName:"商品CD"},
		 	{field:"tstock.mproduct.productNm", displayName:"商品名称"},
		 	{field:"productUnit", displayName:"商品単位"},
		 	{field:"tstock.mproduct.janCd", displayName:"ソースCD"},
		 	{field:"tstock.mwarehouse.warehouseCd", displayName:"倉庫CD"},
		 	{field:"tstock.mwarehouse.warehouseNm", displayName:"倉庫名称"},
		 	{field:"tstock.mlocation.locationNm", displayName:"ロケーション名称"},
		 	{field:"tstock.mcustomer.customerCd", displayName:"預託CD"},
		 	{field:"tstock.mcustomer.customerNm", displayName:"預託名称"},
		 	{field:"tstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
		 	{field:"tstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		 	{field:"tstock.tlot.lot", displayName:"ロット"},
		 	{field:"tstock.tlot.limitDt", displayName:"期限日"},
		 	{field:"tstock.tstoreNo.storeDt", displayName:"入庫日"},
		 	{field:"tstock.tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.tstoreNoSelf.storeLabelNo", displayName:"元入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.mcustomer.customerCd", displayName:"仕入先CD"},
		 	{field:"tstock.tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
		 	{field:"tstock.stockNum", displayName:"在庫数"},
		 	{field:"tstock.chargeNum", displayName:"引当可能数"},
		 	{field:"tstock.allocNum", displayName:"引当済数"},
		 	{field:"tstock.moveNum", displayName:"作業中数"},
		 	{field:"tstock.transitNum", displayName:"積送中数"},
		 	{field:"unitNumBreakdown", displayName:"入数内訳"},
		 	{field:"stockBreakdown", displayName:"在庫内訳"},
		 	{field:"chargeBreakdown", displayName:"引当可能内訳"},
		 	{field:"allocBreakdown", displayName:"引当済内訳"},
		 	{field:"moveBreakdown", displayName:"作業中内訳"},
		 	{field:"transitBreakdown", displayName:"積送中内訳"},
		 	{field:"lastStoreDt", displayName:"最新入庫年月日"},
		 	{field:"lastPickingDt", displayName:"最新出庫年月日"},
		 	{field:"addDt", displayName:"登録日時"},
		 	//荷主センタ変更対応 2017.02.14 sja Start
		 	{field:"tstock.mclient.clientCd", displayName:"荷主CD"},
		 	{field:"tstock.mclient.clientNm", displayName:"荷主名称"},
		 	{field:"tstock.mwarehouse.mcenter.centerCd", displayName:"センタCD"},
		 	{field:"tstock.mwarehouse.mcenter.centerNm", displayName:"センタ名称"}
		 	//荷主センタ変更対応 2017.02.14 sja End
		];

	$scope.stockOrderByProductReportListCols =
		[
		 	{field:"tstock.mproduct.productCd", displayName:"商品CD"},
		 	{field:"tstock.mproduct.productNm", displayName:"商品名称"},
		 	{field:"productUnit", displayName:"商品単位"},
		 	{field:"tstock.mproduct.janCd", displayName:"ソースCD"},
		 	{field:"tstock.mwarehouse.warehouseCd", displayName:"倉庫CD"},
		 	{field:"tstock.mwarehouse.warehouseNm", displayName:"倉庫名称"},
		 	{field:"tstock.mlocation.locationNm", displayName:"ロケーション名称"},
		 	{field:"tstock.mcustomer.customerCd", displayName:"預託CD"},
		 	{field:"tstock.mcustomer.customerNm", displayName:"預託名称"},
		 	{field:"tstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
		 	{field:"tstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		 	{field:"tstock.tlot.lot", displayName:"ロット"},
		 	{field:"tstock.tlot.limitDt", displayName:"期限日"},
		 	{field:"tstock.tstoreNo.storeDt", displayName:"入庫日"},
		 	{field:"tstock.tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.tstoreNoSelf.storeLabelNo", displayName:"元入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.mcustomer.customerCd", displayName:"仕入先CD"},
		 	{field:"tstock.tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
		 	{field:"tstock.stockNum", displayName:"在庫数"},
		 	{field:"tstock.chargeNum", displayName:"引当可能数"},
		 	{field:"tstock.allocNum", displayName:"引当済数"},
		 	{field:"tstock.moveNum", displayName:"作業中数"},
		 	{field:"tstock.transitNum", displayName:"積送中数"},
		 	{field:"unitNumBreakdown", displayName:"入数内訳"},
		 	{field:"stockBreakdown", displayName:"在庫内訳"},
		 	{field:"chargeBreakdown", displayName:"引当可能内訳"},
		 	{field:"allocBreakdown", displayName:"引当済内訳"},
		 	{field:"moveBreakdown", displayName:"作業中内訳"},
		 	{field:"transitBreakdown", displayName:"積送中内訳"},
		 	{field:"storeNumDay", displayName:"当日入庫数"},
		 	{field:"pickingNumDay", displayName:"当日出庫数"},
		 	{field:"movePlsNumDay", displayName:"当日移動数＋"},
		 	{field:"moveMnsNumDay", displayName:"当日移動数－"},
		 	{field:"adjPlsNumDay", displayName:"当日調整数＋"},
		 	{field:"adjMnsNumDay", displayName:"当日調整数－"},
		 	{field:"pchargeNumDay", displayName:"前日残"},
		 	{field:"storeNumMonth", displayName:"当月入庫数"},
		 	{field:"pickingNumMonth", displayName:"当月出庫数"},
		 	{field:"movePlsNumMonth", displayName:"当月移動数＋"},
		 	{field:"moveMnsNumMonth", displayName:"当月移動数－"},
		 	{field:"adjPlsNumMonth", displayName:"当月調整数＋"},
		 	{field:"adjMnsNumMonth", displayName:"当月調整数－"},
		 	{field:"pchargeNumMonth", displayName:"前月残"},
		 	{field:"chargeNum10", displayName:"10日残数"},
		 	{field:"chargeNum15", displayName:"15日残数"},
		 	{field:"chargeNum20", displayName:"20日残数"},
		 	{field:"chargeNumLast", displayName:"末日残数"},
		 	{field:"lastStoreDt", displayName:"最新入庫年月日"},
		 	{field:"lastPickingDt", displayName:"最新出庫年月日"},
		 	{field:"addDt", displayName:"登録日時"},
		 	//荷主センタ変更対応 2017.02.14 sja Start
		 	{field:"tstock.mclient.clientCd", displayName:"荷主CD"},
		 	{field:"tstock.mclient.clientNm", displayName:"荷主名称"},
		 	{field:"tstock.mwarehouse.mcenter.centerCd", displayName:"センタCD"},
		 	{field:"tstock.mwarehouse.mcenter.centerNm", displayName:"センタ名称"}
		 	//荷主センタ変更対応 2017.02.14 sja End
		];

	$scope.stockOrderByLocationNoReportListCols =
		[
		 	{field:"tstock.mwarehouse.warehouseCd", displayName:"倉庫CD"},
		 	{field:"tstock.mwarehouse.warehouseNm", displayName:"倉庫名称"},
		 	{field:"tstock.mlocation.locationNm", displayName:"ロケーション名称"},
		 	{field:"tstock.mproduct.productCd", displayName:"商品CD"},
		 	{field:"tstock.mproduct.productNm", displayName:"商品名称"},
		 	{field:"productUnit", displayName:"商品単位"},
		 	{field:"tstock.mproduct.janCd", displayName:"ソースCD"},
		 	{field:"tstock.mcustomer.customerCd", displayName:"預託CD"},
		 	{field:"tstock.mcustomer.customerNm", displayName:"預託名称"},
		 	{field:"tstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
		 	{field:"tstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		 	{field:"tstock.tlot.lot", displayName:"ロット"},
		 	{field:"tstock.tlot.limitDt", displayName:"期限日"},
		 	{field:"tstock.tstoreNo.storeDt", displayName:"入庫日"},
		 	{field:"tstock.tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.tstoreNoSelf.storeLabelNo", displayName:"元入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.mcustomer.customerCd", displayName:"仕入先CD"},
		 	{field:"tstock.tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
		 	{field:"tstock.stockNum", displayName:"在庫数"},
		 	{field:"tstock.chargeNum", displayName:"引当可能数"},
		 	{field:"tstock.allocNum", displayName:"引当済数"},
		 	{field:"tstock.moveNum", displayName:"作業中数"},
		 	{field:"tstock.transitNum", displayName:"積送中数"},
		 	{field:"unitNumBreakdown", displayName:"入数内訳"},
		 	{field:"stockBreakdown", displayName:"在庫内訳"},
		 	{field:"chargeBreakdown", displayName:"引当可能内訳"},
		 	{field:"allocBreakdown", displayName:"引当済内訳"},
		 	{field:"moveBreakdown", displayName:"作業中内訳"},
		 	{field:"transitBreakdown", displayName:"積送中内訳"},
		 	{field:"lastStoreDt", displayName:"最新入庫年月日"},
		 	{field:"lastPickingDt", displayName:"最新出庫年月日"},
		 	{field:"addDt", displayName:"登録日時"},
		 	//荷主センタ変更対応 2017.02.14 sja Start
		 	{field:"tstock.mclient.clientCd", displayName:"荷主CD"},
		 	{field:"tstock.mclient.clientNm", displayName:"荷主名称"},
		 	{field:"tstock.mwarehouse.mcenter.centerCd", displayName:"センタCD"},
		 	{field:"tstock.mwarehouse.mcenter.centerNm", displayName:"センタ名称"}
		 	//荷主センタ変更対応 2017.02.14 sja End
		];

	$scope.stockOrderByLocationReportListCols =
		[
		 	{field:"tstock.mwarehouse.warehouseCd", displayName:"倉庫CD"},
		 	{field:"tstock.mwarehouse.warehouseNm", displayName:"倉庫名称"},
		 	{field:"tstock.mlocation.locationNm", displayName:"ロケーション名称"},
		 	{field:"tstock.mproduct.productCd", displayName:"商品CD"},
		 	{field:"tstock.mproduct.productNm", displayName:"商品名称"},
		 	{field:"productUnit", displayName:"商品単位"},
		 	{field:"tstock.mproduct.janCd", displayName:"ソースCD"},
		 	{field:"tstock.mcustomer.customerCd", displayName:"預託CD"},
		 	{field:"tstock.mcustomer.customerNm", displayName:"預託名称"},
		 	{field:"tstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
		 	{field:"tstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		 	{field:"tstock.tlot.lot", displayName:"ロット"},
		 	{field:"tstock.tlot.limitDt", displayName:"期限日"},
		 	{field:"tstock.tstoreNo.storeDt", displayName:"入庫日"},
		 	{field:"tstock.tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.tstoreNoSelf.storeLabelNo", displayName:"元入庫ラベルNo."},
		 	{field:"tstock.tstoreNo.mcustomer.customerCd", displayName:"仕入先CD"},
		 	{field:"tstock.tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
		 	{field:"tstock.stockNum", displayName:"在庫数"},
		 	{field:"tstock.chargeNum", displayName:"引当可能数"},
		 	{field:"tstock.allocNum", displayName:"引当済数"},
		 	{field:"tstock.moveNum", displayName:"作業中数"},
		 	{field:"tstock.transitNum", displayName:"積送中数"},
		 	{field:"unitNumBreakdown", displayName:"入数内訳"},
		 	{field:"stockBreakdown", displayName:"在庫内訳"},
		 	{field:"chargeBreakdown", displayName:"引当可能内訳"},
		 	{field:"allocBreakdown", displayName:"引当済内訳"},
		 	{field:"moveBreakdown", displayName:"作業中内訳"},
		 	{field:"transitBreakdown", displayName:"積送中内訳"},
		 	{field:"storeNumDay", displayName:"当日入庫数"},
		 	{field:"pickingNumDay", displayName:"当日出庫数"},
		 	{field:"movePlsNumDay", displayName:"当日移動数＋"},
		 	{field:"moveMnsNumDay", displayName:"当日移動数－"},
		 	{field:"adjPlsNumDay", displayName:"当日調整数＋"},
		 	{field:"adjMnsNumDay", displayName:"当日調整数－"},
		 	{field:"pchargeNumDay", displayName:"前日残"},
		 	{field:"storeNumMonth", displayName:"当月入庫数"},
		 	{field:"pickingNumMonth", displayName:"当月出庫数"},
		 	{field:"movePlsNumMonth", displayName:"当月移動数＋"},
		 	{field:"moveMnsNumMonth", displayName:"当月移動数－"},
		 	{field:"adjPlsNumMonth", displayName:"当月調整数＋"},
		 	{field:"adjMnsNumMonth", displayName:"当月調整数－"},
		 	{field:"pchargeNumMonth", displayName:"前月残"},
		 	{field:"chargeNum10", displayName:"10日残数"},
		 	{field:"chargeNum15", displayName:"15日残数"},
		 	{field:"chargeNum20", displayName:"20日残数"},
		 	{field:"chargeNumLast", displayName:"末日残数"},
		 	{field:"lastStoreDt", displayName:"最新入庫年月日"},
		 	{field:"lastPickingDt", displayName:"最新出庫年月日"},
		 	{field:"addDt", displayName:"登録日時"},
		 	//荷主センタ変更対応 2017.02.14 sja Start
		 	{field:"tstock.mclient.clientCd", displayName:"荷主CD"},
		 	{field:"tstock.mclient.clientNm", displayName:"荷主名称"},
		 	{field:"tstock.mwarehouse.mcenter.centerCd", displayName:"センタCD"},
		 	{field:"tstock.mwarehouse.mcenter.centerNm", displayName:"センタ名称"}
		 	//荷主センタ変更対応 2017.02.14 sja End
		];
	// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの列情報を修正 2018.02.23 shimizu End


	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana Start
	var isSearchCurrentData;
	// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana End

    /**
     * @ngdoc method
     * @name oneslogiWms.StockList.object:StockList#initScreen
     * @methodOf oneslogiWms.StockList.object:StockList
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		$scope.warehouseList = userInfo.warehouseList;

		// 日付大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
        	var fromValueString = owsCommon.dateToString(fromValue);
        	var toValueString = owsCommon.dateToString(toValue);
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };

		// 日付大小チェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// ロケーション大小チェック
        $scope.fromToCheck2 = function(fromValue, toValue) {
        	var fromValueString = fromValue;
        	var toValueString = toValue;
        	if (fromValueString == null || fromValueString == "" || toValueString == null || toValueString == "") {
            	return true;
        	}
        	if (fromValueString > toValueString) {
        		return false;
        	}
        	return true;
        };

		// ロケーション大小チェック用メッセージ
        $scope.fromToMessage2 = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.head.tstock.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.head.tstock.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start

		//ページングの設定
		$scope.stockOrderByProductNoReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.stockOrderByProductNoReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.stockOrderByProductNoReportGridOptions.paginationPageSize, $scope.stockOrderByProductNoReportGridOptions.paginationCurrentPage);
		};
		$scope.stockOrderByProductNoReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.stockOrderByProductNoReportGridOptions.paginationPageSize;
			$scope.stockOrderByProductReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByLocationNoReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByLocationReportGridOptions.paginationPageSize = pageSize;
		};

		$scope.stockOrderByProductReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.stockOrderByProductReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.stockOrderByProductReportGridOptions.paginationPageSize, $scope.stockOrderByProductReportGridOptions.paginationCurrentPage);
		};
		$scope.stockOrderByProductReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.stockOrderByProductReportGridOptions.paginationPageSize;
			$scope.stockOrderByProductNoReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByLocationNoReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByLocationReportGridOptions.paginationPageSize = pageSize;
		};

		$scope.stockOrderByLocationNoReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.stockOrderByLocationNoReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.stockOrderByLocationNoReportGridOptions.paginationPageSize, $scope.stockOrderByLocationNoReportGridOptions.paginationCurrentPage);
		};
		$scope.stockOrderByLocationNoReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.stockOrderByLocationNoReportGridOptions.paginationPageSize;
			$scope.stockOrderByProductNoReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByProductReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByLocationReportGridOptions.paginationPageSize = pageSize;
		};

		$scope.stockOrderByLocationReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.stockOrderByLocationReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.stockOrderByLocationReportGridOptions.paginationPageSize, $scope.stockOrderByLocationReportGridOptions.paginationCurrentPage);
		};
		$scope.stockOrderByLocationReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.stockOrderByLocationReportGridOptions.paginationPageSize;
			$scope.stockOrderByProductNoReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByProductReportGridOptions.paginationPageSize = pageSize;
			$scope.stockOrderByLocationNoReportGridOptions.paginationPageSize = pageSize;
		};

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End

		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start

		// グリッドの設定
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの列情報を修正 2018.02.23 shimizu Start
		$scope.stockOrderByProductNoReportGridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'stockOrderByProductNoReportList',
			columnDefs: 'stockOrderByProductNoReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.stockOrderByProductNoReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		$scope.stockOrderByProductReportGridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'stockOrderByProductReportList',
			columnDefs: 'stockOrderByProductReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.stockOrderByProductReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		$scope.stockOrderByLocationNoReportGridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'stockOrderByLocationNoReportList',
			columnDefs: 'stockOrderByLocationNoReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.stockOrderByLocationNoReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		$scope.stockOrderByLocationReportGridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'stockOrderByLocationReportList',
			columnDefs: 'stockOrderByLocationReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.stockOrderByLocationReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの列情報を修正 2018.02.23 shimizu End
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの表示設定を修正 2018.02.23 shimizu Start
		$scope.viewGridStockOrderByProductNoReport = true;
		$scope.viewGridStockOrderByProductReport = false;
		$scope.viewGridStockOrderByLocationNoReport = false;
		$scope.viewGridStockOrderByLocationReport = false;
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの表示設定を修正 2018.02.23 shimizu End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockList.object:StockListr#initScreenHttp
     * @methodOf oneslogiWms.StockList.object:StockList
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//全通信終了後に以下関数で各種設定を実行

		$q.all(
				[
				 // [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
				 $scope.deferredGetWarehouseList(),
				 // [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
				 // [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.28 kawana Start
				 $scope.deferredGetZoneList(),
				 // [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示 2015.07.28 kawana End
				 $scope.deferredGetStockDisplayFld(),
				 // [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
				 $scope.deferredGetStockNumDisplay(),
				 // [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End
				 $scope.deferredGetChargeNumDisplay(),
				 $scope.deferredGetDisplay(),
				 // [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start
				 $scope.deferredGetTransitDisplay()
				 // [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End
				 ]
		)

		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// 在庫表示順データ取得
	$scope.deferredGetStockDisplayFld = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_DISPLAY_FLD";

		owsCommon.getDataCacheable(api.stockDisplayFld, "keyValueList", request).then(function(response){
			$scope.stockdisplayfldList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start

	// 在庫数 0非表示
	$scope.deferredGetStockNumDisplay = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_NUM_0_DISPLAY";

		api.dropdownList.query(request).then(function(response){
			$scope.stockNumDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

	// 引当可能数 0非表示
	$scope.deferredGetChargeNumDisplay = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CHARGE_QTY_0_DISPLAY";

		api.dropdownList.query(request).then(function(response){
			$scope.chargeNumDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 0非表示
	$scope.deferredGetDisplay = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "QTY_0_DISPLAY";

		api.dropdownList.query(request).then(function(response){
			$scope.displayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#deferredGetWarehouseList
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		var centerCd = userInfo.centerCd;

		if($scope.head){
			centerCd = $scope.head.tstock.mwarehouse.mcenter.centerCd;
		}

		request.centerId = userInfo.centerIdByCd(centerCd);

		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#deferredGetZoneList
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description ゾーンリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function () {
		var deferred = $q.defer();

		var request = {};
		request.data = {};

		var centerCd = userInfo.centerCd;
		if($scope.head){
			centerCd = $scope.head.tstock.mwarehouse.mcenter.centerCd;
		}
		request.centerCd = centerCd;

		var warehouseCd;
		if($scope.head){
			warehouseCd = $scope.head.tstock.mwarehouse.warehouseCd;
		}

		// [ON推-品向-922] 検索条件の倉庫が未選択の場合は全ゾーンをゾーンの選択肢に表示(不要な処理を削除) 2015.07.28 kawana

		request.warehouseCd = warehouseCd;

		owsCommon.getDataCacheable(api.zoneList, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana Start

	// 積送中在庫のみ表示
	$scope.deferredGetTransitDisplay = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TRANSIT_DISPLAY";

		api.dropdownList.query(request).then(function(response){
			$scope.transitDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0039] センタ間移動機能を追加 2015.09.15 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#warehouseChange
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description 倉庫変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.warehouseChange = function() {

		$scope.head.tstock.mlocation.mzone.zoneCd = null;

		// ゾーン変更
		$scope.deferredGetZoneList().then(function(response){
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#centerChange
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description センタ変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerChange = function() {

		$scope.head.tstock.mwarehouse.warehouseCd = null;
		$scope.head.tstock.mlocation.mzone.zoneCd = null;

		$q.all([
		        $scope.deferredGetWarehouseList(),
		        $scope.deferredGetZoneList()
		]).then(function(response){
		});
	};
	// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#deferredGetInitData
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 現品在庫問合せ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.body = response.data.body;
			$scope.paging = response.paging;
			// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
			$scope.printParam = response.data.storeLabelPrintParam.printBasicData;
			// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End
			// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start
			$scope.stockListPrintParam = response.data.stockListPrintParam.printBasicData;
			// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End

			// ログイン情報より初期値を設定
			$scope.head.tstock.mwarehouse.mcenter.centerCd = userInfo.centerCd;
			$scope.head.tstock.mclient.clientCd = userInfo.clientCd;
			$scope.head.tstock.dataTime = userInfo.systemDt;
			//[ON推-品向-416]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.06 衛 Start
			// 荷主変更後処理
			$scope.changeClient(true);
			//[ON推-品向-416]「取得した預託データが1件の場合、1件目を選択状態にする。」に修正 2014.12.06 衛 End

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 kawana Delete

			// 在庫表示順データ有を設定
			if ($scope.stockdisplayfldList.length > 0) {
				$scope.head.stockdisplayfld = $scope.stockdisplayfldList[0].classCd;
			}

			// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana Start
			// 在庫数 0非表示
			$scope.head.tstock.stockNumDisplay = owsCommon.getDefaultValue($scope.stockNumDisplayList);
			// [ON推-品向-960] 在庫数を追加 2015.10.06 kawana End

			// 引当可能数 0非表示
			if ($scope.chargeNumDisplayList.length > 0) {
				$scope.head.chargeNumDisplay = owsCommon.getDefaultValue($scope.chargeNumDisplayList);
			}
			// 0非表示
			if ($scope.displayList.length > 0) {
				$scope.head.display = owsCommon.getDefaultValue($scope.displayList);
			}

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana Start
			// 積送中在庫のみ表示
			$scope.head.tstock.transitDisplay = owsCommon.getDefaultValue($scope.transitDisplayList);
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.18 kawana End

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				//荷主センタ変更対応 2017.03.03 sja Start
				$scope.deferredGetWarehouseList();
				$scope.deferredGetZoneList();
				$scope.changeClient(true);
				//荷主センタ変更対応 2017.03.03 sja End
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
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#changeClient
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});

		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
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
		var productCd = $scope.head.tstock.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.tstock.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.head.tstock.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.head.tstock.mproduct.productNm = null;
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
				clientCd: $scope.head.tstock.mclient.clientCd,
				productCd: $scope.head.tstock.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.tstock.mproduct.productCd =  selectedItem.productCd;
			$scope.head.tstock.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		// 荷主ドロップダウンリストの選択値
		request.clientCd = $scope.head.tstock.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomerList, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryDiffListPrint.object:InventoryDiffListPrint
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		// 荷主ドロップダウンリストの選択値
		request.clientCd = $scope.head.tstock.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
		    // 取得した預託データが1件の場合
			if ($scope.depositStockTypeList.length == 1) {
			    // 1件目を選択状態にする
				$scope.head.tstock.mcustomer.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			}
			//[ON推-品向-489]「入力していた検索条件の預託在庫区分がクリアされていない。」に修正 2014.12.24 衛 Start
//			else {
//				$scope.head.tstock.mcustomer.customerCd = null;
//			}

		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 在庫区分は一つ目を設定
		if (clearSelected) {
		    // 在庫区分リスト未選択状態にする
			//$scope.head.tstock.mstockType.stockTypeCd = null;
			//[ON推-品向-489]「入力していた検索条件の預託在庫区分がクリアされていない。」に修正 2014.12.24 衛 End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showLocation
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
        var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.head.locationCdFrom;
		} else {
			inLocationCd = $scope.head.locationCdTo;
		}

		var items = {
				centerCd: $scope.head.tstock.mwarehouse.mcenter.centerCd,
				locationCd: inLocationCd,
				// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana Start
				warehouseCd: $scope.head.tstock.mwarehouse.warehouseCd,
				zoneCd: $scope.head.tstock.mlocation.mzone.zoneCd
				// [C-CWMS-0029] 検索条件にゾーンを追加 2015.06.05 kawana End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.head.locationCdFrom = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.head.locationNmFrom = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			} else {
				$scope.head.locationCdTo = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.head.locationNmTo = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#locationCdBlur
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {

		// 入力されたロケーションCD
		var locationCd = "";
		if (index == 1) {
			locationCd = $scope.head.locationCdFrom;
		} else {
			locationCd = $scope.head.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.head.tstock.mwarehouse.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.head.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.head.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.head.locationNmFrom = null;
			}else{
				$scope.head.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
     * @ngdoc method
     * @name oneslogiWms.StockList.object:StockList#search
     * @methodOf oneslogiWms.StockList.object:StockList
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
		owsCommon.clearPagingOptions($scope.stockOrderByProductNoReportGridOptions);
		owsCommon.clearPagingOptions($scope.stockOrderByProductReportGridOptions);
		owsCommon.clearPagingOptions($scope.stockOrderByLocationNoReportGridOptions);
		owsCommon.clearPagingOptions($scope.stockOrderByLocationReportGridOptions);
		var gridOptions = getSearchGridOptions();
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		$scope.getPagedDataAsync(gridOptions.paginationPageSize, gridOptions.paginationCurrentPage);
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	var getSearchGridOptions = function() {

		// 取得データをグリッドに反映
		if ($scope.head.stockdisplayfld == "0") {
			// 商品順(日報なし)
			return $scope.stockOrderByProductNoReportGridOptions;
		} else if ($scope.head.stockdisplayfld == "1") {
			// 商品順(日報あり)
			return $scope.stockOrderByProductReportGridOptions;
		} else if($scope.head.stockdisplayfld == "2") {
			// ロケーション順(日報なし)
			return $scope.stockOrderByLocationNoReportGridOptions;
		} else if($scope.head.stockdisplayfld == "3") {
			// ロケーション順(日報あり)
			return $scope.stockOrderByLocationReportGridOptions;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana Start
		// 検索前に初期化
		isSearchCurrentData = false;
		// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana End

		api.stockList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response, page, pageSize);

			// [新WMS-110-005] 在庫調整への遷移で致命的エラー(不要な処理を削除) 2015.08.07 kawana
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveList.object:ReceiveList#setPagingData
	 * @methodOf oneslogiWms.ReceiveList.object:ReceiveList
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 行選択状態をクリア

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けて表示結果を変更する。 2018.02.26 shimizu Start
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
		// 全選択のチェックをクリア
		owsCommon.toggleSelectAll($scope.stockOrderByProductNoReportGridOptions, false);
		owsCommon.toggleSelectAll($scope.stockOrderByProductReportGridOptions, false);
		owsCommon.toggleSelectAll($scope.stockOrderByLocationNoReportGridOptions, false);
		owsCommon.toggleSelectAll($scope.stockOrderByLocationReportGridOptions, false);
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

		// [ON推-品向-554] 在庫表示順を変えて検索したときにボタンの活性化が初期化されない問題を改修 2015.01.16 kawana Start

		// [ON推-品向-337] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		// グリッドのスクロール位置を先頭に移動
		$scope.stockOrderByProductNoReportGridOptions.gridViewport.scrollTop(0);
		$scope.stockOrderByProductReportGridOptions.gridViewport.scrollTop(0);
		$scope.stockOrderByLocationNoReportGridOptions.gridViewport.scrollTop(0);
		$scope.stockOrderByLocationReportGridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-337] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana Start
		// 現在の在庫が検索されたかを設定
		isSearchCurrentData = response.data.isSearchCurrentData;
		// [新WMS-110-005] 在庫調整への遷移で致命的エラー 2015.08.07 kawana End

		// 取得データをグリッドに反映
		if ($scope.head.stockdisplayfld == "0") {
			// 商品順(日報なし)
			$scope.viewGridStockOrderByProductNoReport = true;
			$scope.viewGridStockOrderByProductReport = false;
			$scope.viewGridStockOrderByLocationNoReport = false;
			$scope.viewGridStockOrderByLocationReport = false;


			$scope.stockOrderByProductNoReportList = response.data.body;
			$scope.stockOrderByProductNoReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.stockOrderByProductNoReportGridOptions);

		} else if ($scope.head.stockdisplayfld == "1") {
			// 商品順(日報あり)
			$scope.viewGridStockOrderByProductNoReport = false;
			$scope.viewGridStockOrderByProductReport = true;
			$scope.viewGridStockOrderByLocationNoReport = false;
			$scope.viewGridStockOrderByLocationReport = false;

			$scope.stockOrderByProductReportList = response.data.body;
			$scope.stockOrderByProductReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.stockOrderByProductReportGridOptions);

		} else if($scope.head.stockdisplayfld == "2") {
			// ロケーション順(日報なし)
			$scope.viewGridStockOrderByProductNoReport = false;
			$scope.viewGridStockOrderByProductReport = false;
			$scope.viewGridStockOrderByLocationNoReport = true;
			$scope.viewGridStockOrderByLocationReport = false;

			$scope.stockOrderByLocationNoReportList = response.data.body;
			$scope.stockOrderByLocationNoReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.stockOrderByLocationNoReportGridOptions);

		} else if($scope.head.stockdisplayfld == "3") {
			// ロケーション順(日報あり)
			$scope.viewGridStockOrderByProductNoReport = false;
			$scope.viewGridStockOrderByProductReport = false;
			$scope.viewGridStockOrderByLocationNoReport = false;
			$scope.viewGridStockOrderByLocationReport = true;

			$scope.stockOrderByLocationReportList = response.data.body;
			$scope.stockOrderByLocationReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.stockOrderByLocationReportGridOptions);
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
		// [ON推-品向-554] 在庫表示順を変えて検索したときにボタンの活性化が初期化されない問題を改修 2015.01.16 kawana End
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けて表示結果を変更する。 2018.02.26 shimizu End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveList.object:ReceiveList#getClassForRow
	 * @methodOf oneslogiWms.ReceiveList.object:ReceiveList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 現品在庫問合せに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if ((row.entity.tstock.mlocation.allocNgFlg == "1") && (row.entity.tstock.tlot.limitDt != null && row.entity.dtAddLdn > row.entity.tstock.tlot.limitDt)) {
			return "wmslegendredcyan";
		}

		if (row.entity.tstock.mlocation.allocNgFlg == "1") {
			return "wmslegendindianred";
		}

		// [ON推-品向-1028] 出荷期限日数が[0]に設定されているときは期限切れにならないように修正 2015.12.08 ichikawa Start
		if (row.entity.tstock.tlot.limitDt != null && row.entity.tstock.mproduct.shippingLimitNum != "0" && row.entity.dtAddLdn > row.entity.tstock.tlot.limitDt ) {
		// [ON推-品向-1028] 出荷期限日数が[0]に設定されているときは期限切れにならないように修正 2015.12.08 ichikawa End
			return "wmslegendcyanTxt";
		}

		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#excelOutput
	 * @methodOf oneslogiWms.StockList.object:StockList
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

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたExcel出力に修正 2018.02.26 shimizu Start
		// ファイル出力用パラメータ設定
		if($scope.head.stockdisplayfld == "0"){
			owsCommon.setOutputOptions(request, $scope.stockOrderByProductNoReportGridOptions, "body", document.title);
		} else if($scope.head.stockdisplayfld == "1"){
			owsCommon.setOutputOptions(request, $scope.stockOrderByProductReportGridOptions, "body", document.title);
		} else if($scope.head.stockdisplayfld == "2"){
			owsCommon.setOutputOptions(request, $scope.stockOrderByLocationNoReportGridOptions, "body", document.title);
		} else if($scope.head.stockdisplayfld == "3"){
			owsCommon.setOutputOptions(request, $scope.stockOrderByLocationReportGridOptions, "body", document.title);
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたExcel出力に修正 2018.02.26 shimizu End

		api.stockList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#gridDblClick
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("stockInOutList", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#stockInOutList
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 在庫受払問合せ<br>
	 */
	$scope.stockInOutList = function() {

		// [#2251] 在庫表示順による不具合修正(処理を統一) 2017.08.10 kawana Start

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu Start
		var gridOptions;
		if ($scope.viewGridStockOrderByProductNoReport == true) {
			// 商品順(日報なし)に表示
			gridOptions = $scope.stockOrderByProductNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByProductReport == true) {
			// 商品順(日報あり)に表示
			gridOptions = $scope.stockOrderByProductReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationNoReport == true) {
			// ロケーション順(日報なし)に表示
			gridOptions = $scope.stockOrderByLocationNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationReport == true) {
			// ロケーション順(日報あり)に表示
			gridOptions = $scope.stockOrderByLocationReportGridOptions;
		} else {
			// エラー
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu End

		// 明細行がない場合
		if (gridOptions.gridApi.grid.rows.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// 行が選択されていない場合、エラーメッセージを表示
		if (gridOptions.gridApi.selection.getSelectedRows().length == 0){
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
		// 複数行選択の場合はエラーメッセージを表示
		if (gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		$location.path("wms/stock/StockInOutList").search({})
			.search("mode", SCREEN_MODE.Update)
		//荷主センタ変更対応 201７.02.24 sja Start
			.search("centerCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mwarehouse.mcenter.centerCd)
			.search("clientCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mclient.clientCd)
		//荷主センタ変更対応 201７.02.24 sja End
			.search("warehouseCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mwarehouse.warehouseCd)
			.search("dataTime", $scope.head.tstock.dataTime)
			.search("customerCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mcustomer.customerCd)
			.search("stockTypeCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mstockType.stockTypeCd)
			.search("productCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mproduct.productCd)
			.search("productNm", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mproduct.productNm)
		//荷主センタ変更対応 201７.02.24 sja Start
			.search("janCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mproduct.janCd);
		//荷主センタ変更対応 201７.02.24 sja End
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

		// [#2251] 在庫表示順による不具合修正(処理を統一) 2017.08.10 kawana End
	}

	// [#5627][v3.1] 「在庫調整(新規)」ボタンを削除 2018.11.12 kawana Delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#stockAdj
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 在庫調整<br>
	 */
	$scope.stockAdj = function() {

		// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana Start
		// 現在のデータを表示していない場合はエラー
		if(!isSearchCurrentData){
			// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana End
			alertMessage.setErrorMessageByCode("cannotInputHistoryDataError");
			return;
		}

		// [#2251] 在庫表示順による不具合修正(処理を統一) 2017.08.10 kawana Start

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu Start
		var gridOptions;
		if ($scope.viewGridStockOrderByProductNoReport == true) {
			// 商品順(日報なし)に表示
			gridOptions = $scope.stockOrderByProductNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByProductReport == true) {
			// 商品順(日報あり)に表示
			gridOptions = $scope.stockOrderByProductReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationNoReport == true) {
			// ロケーション順(日報なし)に表示
			gridOptions = $scope.stockOrderByLocationNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationReport == true) {
			// ロケーション順(日報あり)に表示
			gridOptions = $scope.stockOrderByLocationReportGridOptions;
		} else {
			// エラー
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu End

		// 明細行がない場合
		if (gridOptions.gridApi.grid.rows.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合、エラーメッセージを表示
		if (gridOptions.gridApi.selection.getSelectedRows().length == 0){
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
		// 複数行選択の場合はエラーメッセージを表示
		if (gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//荷主センタ変更対応 201７.03.01 sja Start

		// 在庫調整画面に遷移
		$location.path("wms/stock/StockAdj").search({})
			.search("mode", SCREEN_MODE.Update).search("stockId", gridOptions.gridApi.selection.getSelectedRows()[0].stockId)
			.search("clientCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mclient.clientCd)
			.search("inventoryId",null);

		//荷主センタ変更対応 201７.03.01 sja End
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

		// [#2251] 在庫表示順による不具合修正(処理を統一) 2017.08.10 kawana End
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#stockMove
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 在庫移動<br>
	 */
	$scope.stockMove = function() {

		// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana Start
		// 現在のデータを表示していない場合はエラー
		if(!isSearchCurrentData){
			// [ON推-品向-533] 表示在庫が履歴データかの判断を修正 2015.01.14 kawana End
			alertMessage.setErrorMessageByCode("cannotInputHistoryDataError");
			return;
		}

		// [#2251] 在庫表示順による不具合修正(処理を統一) 2017.08.10 kawana Start

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu Start
		var gridOptions;
		if ($scope.viewGridStockOrderByProductNoReport == true) {
			// 商品順(日報なし)に表示
			gridOptions = $scope.stockOrderByProductNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByProductReport == true) {
			// 商品順(日報あり)に表示
			gridOptions = $scope.stockOrderByProductReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationNoReport == true) {
			// ロケーション順(日報なし)に表示
			gridOptions = $scope.stockOrderByLocationNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationReport == true) {
			// ロケーション順(日報あり)に表示
			gridOptions = $scope.stockOrderByLocationReportGridOptions;
		} else {
			// エラー
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu End

		// 明細行がない場合
		if (gridOptions.gridApi.grid.rows.length == 0){
			// エラー
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if (gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			// エラー
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
		// 複数行選択の場合
		if (gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			// エラー
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//$location.path("wms/stock/StockMove").search({}).search("mode", SCREEN_MODE.Update).search("stockId", gridOptions.gridApi.selection.getSelectedRows()[0].stockId);
		//荷主センタ変更対応 201７.03.01 sja Start

		// 在庫移動画面に遷移
		$location.path("wms/stock/StockMove").search({}).search("mode", SCREEN_MODE.Update)
			.search("stockId", gridOptions.gridApi.selection.getSelectedRows()[0].stockId)
			.search("clientCd", gridOptions.gridApi.selection.getSelectedRows()[0].tstock.mclient.clientCd);

		//荷主センタ変更対応 201７.03.01 sja End
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End

		// [#2251] 在庫表示順による不具合修正(処理を統一) 2017.08.10 kawana End
	}

	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#storeLabelPrint
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 選択した在庫の入庫ラベルを発行<br>
	 */
	$scope.storeLabelPrint = function() {

		// 現在のデータを表示していない場合はエラー
		if(!isSearchCurrentData){
			alertMessage.setErrorMessageByCode("cannotInputHistoryDataError");
			return;
		}

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu Start
		var gridOptions;
		if ($scope.viewGridStockOrderByProductNoReport == true) {
			// 商品順(日報なし)に表示
			gridOptions = $scope.stockOrderByProductNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByProductReport == true) {
			// 商品順(日報あり)に表示
			gridOptions = $scope.stockOrderByProductReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationNoReport == true) {
			// ロケーション順(日報なし)に表示
			gridOptions = $scope.stockOrderByLocationNoReportGridOptions;
		} else if ($scope.viewGridStockOrderByLocationReport == true) {
			// ロケーション順(日報あり)に表示
			gridOptions = $scope.stockOrderByLocationReportGridOptions;
		} else {
			// エラー
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu End

		// 明細行がない場合はエラー
		if (gridOptions.gridApi.grid.rows.length == 0) {
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合、エラーメッセージを表示
		if (gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.printParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){
			var request = {};
			request.data = {};
			request.data.body = gridOptions.gridApi.selection.getSelectedRows();
			request.data.storeLabelPrintParam = {};
			request.data.storeLabelPrintParam.printBasicData = printParam.printBasicData;

			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.stockList.storeLabelPrint(request).then(function(response){
				var resPrintParam = response.data.storeLabelPrintParam;
				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// 正常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー表示
						subWindow = owsCommon.viewPdf(subWindow, resPrintParam.output.downloadUrl);
					}
				} else {
					// 異常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー閉じる
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				}

				// [ON推-品向-937] 入庫ラベル発行後にチェックをクリア 2015.09.10 kawana Start
				// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu Start
				// 選択のチェックをクリア
				owsCommon.toggleSelectAll($scope.stockOrderByProductNoReportGridOptions, false);
				owsCommon.toggleSelectAll($scope.stockOrderByProductReportGridOptions, false);
				owsCommon.toggleSelectAll($scope.stockOrderByLocationNoReportGridOptions, false);
				owsCommon.toggleSelectAll($scope.stockOrderByLocationReportGridOptions, false);
				// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu End
				// [ON推-品向-937] 入庫ラベル発行後にチェックをクリア 2015.09.10 kawana End
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
			});
			// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
		});
	};
	// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

	// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#stockListPrint
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 検索条件で検索し、在庫リスト発行<br>
	 */
	$scope.stockListPrint = function() {


		// プリンタ選択画面を表示
		var modalInstance = printFactory.modalPrint($scope.stockListPrintParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam){

			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.stockListPrintParam = {};
			request.data.stockListPrintParam.printBasicData = printParam.printBasicData;

			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.stockList.stockListPrint(request).then(function(response){
				var resPrintParam = response.data.stockListPrintParam;
				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// 正常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー表示
						subWindow = owsCommon.viewPdf(subWindow, resPrintParam.output.downloadUrl);
					}
				} else {
					// 異常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						// プレビュー閉じる
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				}
			}).catch(function(response){
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
			});
		});
	};

	// [#2265] 帳票構造化データ利用の調査 在庫リストサンプルの作成 2017.08.17 kawana End

	// [#2233] 在庫一括移動指示機能追加 2017.08.16 ase Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockList.object:StockList#stockBulkMove
	 * @methodOf oneslogiWms.StockList.object:StockList
	 *
	 * @description
	 * 在庫一括移動指示画面に移動<br>
	 */
	$scope.stockBulkMove = function() {

		// 現在のデータを表示していない場合はエラー
		if(!isSearchCurrentData){
			alertMessage.setErrorMessageByCode("cannotInputHistoryDataError");
			return;
		}

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu Start
		var gridOptions;
		if ($scope.head.stockdisplayfld == "0") {
			gridOptions = $scope.stockOrderByProductNoReportGridOptions;
		} else if ($scope.head.stockdisplayfld == "1") {
			gridOptions = $scope.stockOrderByProductReportGridOptions;
		} else if ($scope.head.stockdisplayfld == "2") {
			gridOptions = $scope.stockOrderByLocationNoReportGridOptions;
		} else if ($scope.head.stockdisplayfld == "3") {
			gridOptions = $scope.stockOrderByLocationReportGridOptions;
		} else {
			// エラー
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分ける 2018.02.26 shimizu End

		// 明細行がない場合はエラー
		if (gridOptions.gridApi.grid.rows.length == 0) {
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合、エラーメッセージを表示
		if (gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		var items = {
			selectedList: gridOptions.gridApi.selection.getSelectedRows()
		};

		// [#7068][OSS] ロケーション未存在の場合にエラーメッセージがGridに正しく設定されない問題を修正 2020.01.20 tanaka Start
		// モーダル画面を開く度にstatusInfoがスタックしてしまい入力エラー時に行数の不一致が発生するため
		// モーダル画面に入力項目がある場合はstatusInfoを初期化してからモーダルを開く
		statusInfo.clear();
		// [#7068][OSS] ロケーション未存在の場合にエラーメッセージがGridに正しく設定されない問題を修正 2020.01.20 tanaka End

		// 在庫一括移動指示画面を表示
		var modalInstance = modalFactory.modalStockBulkMove(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem) {
			$scope.search();
		});
	};
	// [#2233] 在庫一括移動指示機能追加 2017.08.16 ase End

	// [Ver3.0][#3065] htmlで判定していた処理をjsの関数内で行うよう修正 2018.02.26 shimizu Start
	// 明細行が無い場合、ボタンを非活性化にする
	$scope.checkButtonDisabled = function() {
		if($scope.stockOrderByProductNoReportGridOptions.gridApi != null
				&& $scope.stockOrderByProductReportGridOptions.gridApi != null
				&& $scope.stockOrderByLocationNoReportGridOptions.gridApi != null
				&& $scope.stockOrderByLocationReportGridOptions.gridApi != null) {

			if($scope.stockOrderByProductNoReportGridOptions.gridApi.selection.getSelectedRows().length
					|| $scope.stockOrderByProductReportGridOptions.gridApi.selection.getSelectedRows().length
					|| $scope.stockOrderByLocationNoReportGridOptions.gridApi.selection.getSelectedRows().length
					|| $scope.stockOrderByLocationReportGridOptions.gridApi.selection.getSelectedRows().length) {
				return true;
			}
		}
		return false;
	}
	// [Ver3.0][#3065] htmlで判定していた処理をjsの関数内で行うよう修正 2018.02.26 shimizu Start


	//画面初期化処理を実行
	$scope.initScreen();

}]);
