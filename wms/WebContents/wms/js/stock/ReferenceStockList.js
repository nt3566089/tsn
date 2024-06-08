/**
 * @ngdoc overview
 * @name oneslogiWms.ReferenceStockList
 *
 * @description
 * 現品在庫問合せ(参照)画面
 */
angular.module('oneslogiWms.ReferenceStockList',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ReferenceStockList.service:referenceStockListApi
 *
 * @description
 * 現品在庫問合せWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/stock/ReferenceStockList/init 初期化用WebApi<br>
 * ・resources/stock/ReferenceStockList/search 検索用WebApi<br>
 * ・resources/stock/ReferenceStockList/search,excel Excel用WebApi<br>
 * ・resources/common/product/record 商品データ取得<br>
 * ・resources/common/depositCustomer/keyValueListLimitUser 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分取得<br>
 *
 */
.factory('referenceStockListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		referenceStockList: AngularAPIClient.make(
				[
				    ['init',   'GET', 'resources/stock/ReferenceStockList/init'],
				    ['search', 'GET', 'resources/stock/ReferenceStockList/search'],
				    ['excel', 'GET', 'resources/stock/ReferenceStockList/search', 'excel'],
				]
	    ),
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
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		depositCustomerList: AngularAPIClient.make(
				[
				 ['keyValueListLimitUser', 'GET', 'resources/common/depositCustomer/keyValueListLimitUser']
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
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList
 *
 * @description
 * 現品在庫問合せ(参照)画面コントローラ
 */
.controller('ReferenceStockList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'printFactory', 'referenceStockListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, printFactory, api) {

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
	var isSearchCurrentData;

    /**
     * @ngdoc method
     * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#initScreen
     * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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
		// 荷主を変更不可ににする
		directiveControl.editable($scope,"clientCd",false);

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

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start

		//ページングの設定
		$scope.referenceStockOrderByProductNoReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.referenceStockOrderByProductNoReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.referenceStockOrderByProductNoReportGridOptions.paginationPageSize, $scope.referenceStockOrderByProductNoReportGridOptions.paginationCurrentPage);
		};
		$scope.referenceStockOrderByProductNoReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.referenceStockOrderByProductNoReportGridOptions.paginationPageSize;
			$scope.referenceStockOrderByProductReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByLocationNoReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByLocationReportGridOptions.paginationPageSize = pageSize;
		};

		$scope.referenceStockOrderByProductReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.referenceStockOrderByProductReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.referenceStockOrderByProductReportGridOptions.paginationPageSize, $scope.referenceStockOrderByProductReportGridOptions.paginationCurrentPage);
		};
		$scope.referenceStockOrderByProductReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.referenceStockOrderByProductReportGridOptions.paginationPageSize;
			$scope.referenceStockOrderByProductNoReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByLocationNoReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByLocationReportGridOptions.paginationPageSize = pageSize;
		};

		$scope.referenceStockOrderByLocationNoReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.referenceStockOrderByLocationNoReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.referenceStockOrderByLocationNoReportGridOptions.paginationPageSize, $scope.referenceStockOrderByLocationNoReportGridOptions.paginationCurrentPage);
		};
		$scope.referenceStockOrderByLocationNoReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.referenceStockOrderByLocationNoReportGridOptions.paginationPageSize;
			$scope.referenceStockOrderByProductNoReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByProductReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByLocationReportGridOptions.paginationPageSize = pageSize;
		};

		$scope.referenceStockOrderByLocationReportPagingOptions = owsCommon.getDefaultPagingOptions();
		$scope.referenceStockOrderByLocationReportPagingOptions.setPageData = function() {
			// 検索
			$scope.getPagedDataAsync($scope.referenceStockOrderByLocationReportGridOptions.paginationPageSize, $scope.referenceStockOrderByLocationReportGridOptions.paginationCurrentPage);
		};
		$scope.referenceStockOrderByLocationReportPagingOptions.setPageDataWhenPageSizeChanged = function() {
			// ページサイズの変更を他の非表示グリッドにも適用
			var pageSize = $scope.referenceStockOrderByLocationReportGridOptions.paginationPageSize;
			$scope.referenceStockOrderByProductNoReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByProductReportGridOptions.paginationPageSize = pageSize;
			$scope.referenceStockOrderByLocationNoReportGridOptions.paginationPageSize = pageSize;
		};

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End

		// グリッドの設定
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの列情報を修正 2018.02.23 shimizu Start
		$scope.referenceStockOrderByProductNoReportGridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'referenceStockOrderByProductNoReportList',
			columnDefs: 'stockOrderByProductNoReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.referenceStockOrderByProductNoReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		$scope.referenceStockOrderByProductReportGridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'referenceStockOrderByProductReportList',
			columnDefs: 'stockOrderByProductReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.referenceStockOrderByProductReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		$scope.referenceStockOrderByLocationNoReportGridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'referenceStockOrderByLocationNoReportList',
			columnDefs: 'stockOrderByLocationNoReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.referenceStockOrderByLocationNoReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});

		$scope.referenceStockOrderByLocationReportGridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'referenceStockOrderByLocationReportList',
			columnDefs: 'stockOrderByLocationReportListCols',
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
			pagingOptions : $scope.referenceStockOrderByLocationReportPagingOptions
			// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana End
		});
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの列情報を修正 2018.02.23 shimizu End
		// [C-CWMS-0043] 入庫ラベル発行機能追加 2015.08.25 kawana End

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの表示設定を修正 2018.02.23 shimizu Start
		$scope.viewGridReferenceStockOrderByProductNoReport = true;
		$scope.viewGridReferenceStockOrderByProductReport = false;
		$scope.viewGridReferenceStockOrderByLocationNoReport = false;
		$scope.viewGridReferenceStockOrderByLocationReport = false;
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたグリッドの表示設定を修正 2018.02.23 shimizu End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.ReferenceStockList.object:ReferenceStockListr#initScreenHttp
     * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//全通信終了後に以下関数で各種設定を実行

		$q.all(
				[
				 $scope.deferredGetWarehouseList(),
				 $scope.deferredGetZoneList(),
				 $scope.deferredGetStockDisplayFld(),
				 $scope.deferredGetStockNumDisplay(),
				 $scope.deferredGetChargeNumDisplay(),
				 $scope.deferredGetDisplay(),
				 $scope.deferredGetTransitDisplay()
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


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#deferredGetWarehouseList
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#deferredGetZoneList
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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


		request.warehouseCd = warehouseCd;

		owsCommon.getDataCacheable(api.zoneList, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};


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


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#warehouseChange
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#centerChange
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#deferredGetInitData
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
	 *
	 * @description
	 * 現品在庫問合せ(参照)初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.referenceStockList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.referenceStockOrderByProductNoReportList = response.data.body;
			$scope.paging = response.paging;

			// ログイン情報より初期値を設定
			$scope.head.tstock.mwarehouse.mcenter.centerCd = userInfo.centerCd;
			$scope.head.tstock.mclient.clientCd = userInfo.clientCd;
			$scope.head.tstock.dataTime = userInfo.systemDt;
			// 荷主変更後処理
			$scope.changeClient(true);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 kawana Delete

			// 在庫表示順データ有を設定
			if ($scope.stockdisplayfldList.length > 0) {
				$scope.head.stockdisplayfld = $scope.stockdisplayfldList[0].classCd;
			}

			// 在庫数 0非表示
			$scope.head.tstock.stockNumDisplay = owsCommon.getDefaultValue($scope.stockNumDisplayList);

			// 引当可能数 0非表示
			if ($scope.chargeNumDisplayList.length > 0) {
				$scope.head.chargeNumDisplay = owsCommon.getDefaultValue($scope.chargeNumDisplayList);
			}
			// 0非表示
			if ($scope.displayList.length > 0) {
				$scope.head.display = owsCommon.getDefaultValue($scope.displayList);
			}

			// 積送中在庫のみ表示
			$scope.head.tstock.transitDisplay = owsCommon.getDefaultValue($scope.transitDisplayList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
				$scope.deferredGetWarehouseList();
				$scope.deferredGetZoneList();
				$scope.changeClient(true);
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

		owsCommon.getDataCacheable(api.depositCustomerList, "keyValueListLimitUser", request).then(function(response){
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

		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

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
				warehouseCd: $scope.head.tstock.mwarehouse.warehouseCd,
				zoneCd: $scope.head.tstock.mlocation.mzone.zoneCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.head.locationCdFrom = selectedItem.locationCd;
				$scope.head.locationNmFrom = selectedItem.locationNm;
			} else {
				$scope.head.locationCdTo = selectedItem.locationCd;
				$scope.head.locationNmTo = selectedItem.locationNm;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#locationCdBlur
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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

	/**
     * @ngdoc method
     * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#search
     * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 kawana Start
		owsCommon.clearPagingOptions($scope.referenceStockOrderByProductNoReportGridOptions);
		owsCommon.clearPagingOptions($scope.referenceStockOrderByProductReportGridOptions);
		owsCommon.clearPagingOptions($scope.referenceStockOrderByLocationNoReportGridOptions);
		owsCommon.clearPagingOptions($scope.referenceStockOrderByLocationReportGridOptions);
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
			return $scope.referenceStockOrderByProductNoReportGridOptions;
		} else if ($scope.head.stockdisplayfld == "1") {
			// 商品順(日報あり)
			return $scope.referenceStockOrderByProductReportGridOptions;
		} else if($scope.head.stockdisplayfld == "2") {
			// ロケーション順(日報なし)
			return $scope.referenceStockOrderByLocationNoReportGridOptions;
		} else if($scope.head.stockdisplayfld == "3") {
			// ロケーション順(日報あり)
			return $scope.referenceStockOrderByLocationReportGridOptions;
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

		// 検索前に初期化
		isSearchCurrentData = false;

		// ユーザに付与された権限の範囲でデータを取得するためリクエストにユーザCDをセットする
		request.data.head.referenceUserCd = userInfo.userCd;

		api.referenceStockList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response, page, pageSize);

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

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けて表示結果を変更する。 2018.02.26 shimizu Start
		// グリッドのスクロール位置を先頭に移動
		owsCommon.toggleSelectAll($scope.referenceStockOrderByProductNoReportGridOptions, false);
		owsCommon.toggleSelectAll($scope.referenceStockOrderByProductReportGridOptions, false);
		owsCommon.toggleSelectAll($scope.referenceStockOrderByLocationNoReportGridOptions, false);
		owsCommon.toggleSelectAll($scope.referenceStockOrderByLocationReportGridOptions, false);

		// 現在の在庫が検索されたかを設定
		isSearchCurrentData = response.data.isSearchCurrentData;

		// 取得データをグリッドに反映
		if ($scope.head.stockdisplayfld == "0") {
			// 商品順(日報なし)
			$scope.viewGridReferenceStockOrderByProductNoReport = true;
			$scope.viewGridReferenceStockOrderByProductReport = false;
			$scope.viewGridReferenceStockOrderByLocationNoReport = false;
			$scope.viewGridReferenceStockOrderByLocationReport = false;


			$scope.referenceStockOrderByProductNoReportList = response.data.body;
			$scope.referenceStockOrderByProductNoReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.referenceStockOrderByProductNoReportGridOptions);

		} else if ($scope.head.stockdisplayfld == "1") {
			// 商品順(日報あり)
			$scope.viewGridReferenceStockOrderByProductNoReport = false;
			$scope.viewGridReferenceStockOrderByProductReport = true;
			$scope.viewGridReferenceStockOrderByLocationNoReport = false;
			$scope.viewGridReferenceStockOrderByLocationReport = false;

			$scope.referenceStockOrderByProductReportList = response.data.body;
			$scope.referenceStockOrderByProductReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.referenceStockOrderByProductReportGridOptions);

		} else if($scope.head.stockdisplayfld == "2") {
			// ロケーション順(日報なし)
			$scope.viewGridReferenceStockOrderByProductNoReport = false;
			$scope.viewGridReferenceStockOrderByProductReport = false;
			$scope.viewGridReferenceStockOrderByLocationNoReport = true;
			$scope.viewGridReferenceStockOrderByLocationReport = false;

			$scope.referenceStockOrderByLocationNoReportList = response.data.body;
			$scope.referenceStockOrderByLocationNoReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.referenceStockOrderByLocationNoReportGridOptions);

		} else if($scope.head.stockdisplayfld == "3") {
			// ロケーション順(日報あり)
			$scope.viewGridReferenceStockOrderByProductNoReport = false;
			$scope.viewGridReferenceStockOrderByProductReport = false;
			$scope.viewGridReferenceStockOrderByLocationNoReport = false;
			$scope.viewGridReferenceStockOrderByLocationReport = true;

			$scope.referenceStockOrderByLocationReportList = response.data.body;
			$scope.referenceStockOrderByLocationReportGridOptions.totalItems = response.paging.allRecordCount;
			owsCommon.syncExecAndRebuildGrid($scope.referenceStockOrderByLocationReportGridOptions);
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けて表示結果を変更する。 2018.02.26 shimizu End

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);

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

		if (row.entity.tstock.tlot.limitDt != null && row.entity.tstock.mproduct.shippingLimitNum != "0" && row.entity.dtAddLdn > row.entity.tstock.tlot.limitDt ) {
			return "wmslegendcyanTxt";
		}

		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReferenceStockList.object:ReferenceStockList#excelOutput
	 * @methodOf oneslogiWms.ReferenceStockList.object:ReferenceStockList
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
		request.data.head.referenceUserCd = userInfo.userCd;

		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたExcel出力に修正 2018.02.26 shimizu Start
		// ファイル出力用パラメータ設定
		if($scope.head.stockdisplayfld == "0"){
			owsCommon.setOutputOptions(request, $scope.referenceStockOrderByProductNoReportGridOptions, "body", document.title);
		} else if($scope.head.stockdisplayfld == "1"){
			owsCommon.setOutputOptions(request, $scope.referenceStockOrderByProductReportGridOptions, "body", document.title);
		} else if($scope.head.stockdisplayfld == "2"){
			owsCommon.setOutputOptions(request, $scope.referenceStockOrderByLocationNoReportGridOptions, "body", document.title);
		} else if($scope.head.stockdisplayfld == "3"){
			owsCommon.setOutputOptions(request, $scope.referenceStockOrderByLocationReportGridOptions, "body", document.title);
		}
		// [Ver3.0][#3065] 4つのパターンに(商品順, ロケーション順それぞれ日報なし/ありの合計4つ)分けたExcel出力に修正 2018.02.26 shimizu End

		api.referenceStockList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
