/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingHistory
 *
 * @description
 * 出荷履歴画面
 */
angular.module('oneslogiWms.ShippingHistory',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingHistory.object:ShippingHistoryApi
 *
 * @description
 * 出荷履歴WebApi定義<br>

 * ・resources/common/processType/keyValueList 処理区分データ取得<br>
 * ・resources/common/deliveryCustomer/record 届先データ取得WebAPI<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 * ・resources/common/deliveryCourse/search 配送コースデータ取得用WebApi<br>
 * ・resources/common/carrierCd/keyValueList 運送業者データ取得WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList 預託区分取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/shipping/shippingHistory/init 初期処理WebApi<br>
 * ・resources/shipping/shippingHistory/search 検索処理WebApi<br>
 * ・resources/shipping/shippingHistory/excelOutput EXCEl出力WebApi<br>
 *
 */
.factory('shippingHistoryApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
			[
			 	['keyValueList', 'GET', 'resources/common/processType/keyValueList']
            ]
		),
		deliveryCustomer: AngularAPIClient.make(
			[
			 	['record', 'GET', 'resources/common/deliveryCustomer/record']
	        ]
		),
		deliveryCourse: AngularAPIClient.make(
			[
			 	['record', 'GET', 'resources/common/deliveryCourse/record'],
			 	['search', 'GET', 'resources/common/deliveryCourse/search']
	        ]
		),
		carrier: AngularAPIClient.make(
			[
			 	['query', 'GET', 'resources/common/carrierCd/keyValueList']
            ]
		),
		depositCustomer: AngularAPIClient.make(
			[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
			]
		),
		product: AngularAPIClient.make(
			[
				['record', 'GET', 'resources/common/product/record']
			]
		),
		stockType: AngularAPIClient.make(
			[
				['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
			]
		),
		shippingHistory: AngularAPIClient.make(
			[
				 ['init', 'GET', 'resources/shipping/shippingHistory/init'],
		         ['search', 'GET', 'resources/shipping/shippingHistory/search'],
		         ['excel', 'GET', 'resources/shipping/shippingHistory/search', 'excel']
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
 * @name oneslogiWms.ShippingHistory.object:ShippingHistory
 * @description
 * 出荷履歴画面コントローラ
 */
.controller('ShippingHistory', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'shippingHistoryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// 出荷履歴グリッドの列情報（デザイン用）
	$scope.shippingHistoryGridCols =
		[
		    {field:"hshippingH.histDt", displayName:"履歴日"},
		    {field:"hshippingH.delivPlanDt", displayName:"納品予定日"},
		    {field:"hshippingH.delivDt", displayName:"納品指定日"},
		    {field:"hshippingH.delivTz", displayName:"納品時間帯"},
		    {field:"hshippingH.shippingDt", displayName:"出荷日"},
		    {field:"hshippingH.workDt", displayName:"作業日"},
		    {field:"hshippingH.supplyCustomerCd", displayName:"納品先CD"},
		    {field:"hshippingH.supplyCustomerNm", displayName:"納品先名称"},
		    {field:"hshippingH.delivCustomerCd", displayName:"届先CD"},
		    {field:"hshippingH.delivCustomerNm", displayName:"届先名称"},
		    {field:"hshippingH.clientShippingNo", displayName:"顧客出荷指示No"},
		    {field:"hshippingH.shippingSlipNo", displayName:"WMS出荷伝票No"},
		    {field:"hshippingH.mprocessType.processTypeCd", displayName:"処理区分CD"},
		    {field:"hshippingH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
		    {field:"hshippingH.deliveryCourseCd", displayName:"配送コースCD"},
		    {field:"hshippingH.deliveryCourseNm", displayName:"配送コース名称"},
		    {field:"hshippingH.carrierCd", displayName:"運送業者CD"},
		    {field:"hshippingH.carrierNm", displayName:"運送業者名称"},
		    {field:"hshippingH.emergencyFlg", displayName:"緊急フラグ"},
		    {field:"hshippingH.mcenterClassDtlByEmergencyFlg.vdict.dictNm", displayName:"緊急フラグ名称"},
		    {field:"hshippingH.pickingWorkMessage", displayName:"出庫作業メッセージ"},
		    {field:"productCd", displayName:"商品CD"},
		    {field:"productNm", displayName:"商品名称"},
		    {field:"lot", displayName:"指定ロット"},
		    {field:"limitDt", displayName:"指定期限日"},
		    {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
		    {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		    {field:"warehouseCd", displayName:"指定倉庫CD"},
		    {field:"warehouseNm", displayName:"指定倉庫名称"},
		    {field:"locationCd", displayName:"指定ロケーションCD"},
		    {field:"locationNm", displayName:"指定ロケーション名称"},
		    {field:"depositCd", displayName:"指定預託CD"},
		    {field:"depositNm", displayName:"指定預託名称"},
		    {field:"storeLabelNo", displayName:"指定入庫ラベルNo"},
		    {field:"shapeCd", displayName:"指定荷姿CD"},
		    {field:"shapeNm", displayName:"指定荷姿名称"},
		    {field:"unitNum", displayName:"指定入数"},
		    {field:"instNum", displayName:"指示数"},
		    {field:"shippingNum", displayName:"出荷数"},
			//荷主センタ変更対応 201７.02.15 sja Start
		 	{field:"hshippingH.clientCd", displayName:"荷主CD"},
		 	{field:"hshippingH.clientNm", displayName:"荷主名称"},
		 	{field:"hshippingH.centerCd", displayName:"センタCD"},
		 	{field:"hshippingH.centerNm", displayName:"センタ名称"}
		 	//荷主センタ変更対応 201７.02.15 sja End
		];

    /**
     * @ngdoc method
     * @name oneslogiWms.ShippingHistory.object:ShippingHistory#initScreen
     * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
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

		// ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// 在庫移動グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'shippingHistoryGrid',
			columnDefs: 'shippingHistoryGridCols',
			pagingOptions : $scope.pagingOptions
		});

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//荷主センタ変更対応 201７.02.15 sja Start
		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
		};
		$scope.centerChange = function() {
			// 運送業者変更（同期処理）
			$scope.deferredGetCarrier();
		};
		//荷主センタ変更対応 201７.02.15 sja End

		// 日付大小チェック
		$scope.fromToDtCheck = function(fromValue, toValue) {
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

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.ShippingHistory.object:ShippingHistory#initScreenHttp
     * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {

		//全通信終了後に以下関数で各種設定を実行
		$q.all(
			 [
			 	$scope.deferredGetProcessType(), // 処理区分
			 	$scope.deferredGetCarrier(), // 運送業者
			 	$scope.deferredGetDepositStockTypeList(), // 指定預託
			 	$scope.deferredGetStockTypeList() // 在庫区分
			 ]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 出荷履歴初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		api.shippingHistory.init().then(function(response){
			$scope.paging = response.paging;

			$scope.headH = response.data.head;
			$scope.headB = response.data.body;
			$scope.shippingHistoryGrid = response.data.bodyList;
			$scope.historyData = response.data;
			// ログイン情報より初期値を設定
			$scope.headH.clientCd = userInfo.clientCd;
			$scope.headH.centerCd = userInfo.centerCd;
			$scope.headH.shippingDt = userInfo.beforeSystemDt; // 出荷日
			$scope.headH.workDt = userInfo.beforeSystemDt; // 作業日

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.historyData = owsHistory.popState();
				$scope.headH = $scope.historyData.head;
				$scope.headB = $scope.historyData.body;
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
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#deferredGetProcessType
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessType = function () {
		var deferred = $q.defer();
		var request = {};
		request.shippingFlg = "1";
		request.receiveFlg = "0";
		request.moveFlg = "0";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#deferredGetCarrier
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.15 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.headH) {
			request.centerCd = $scope.headH.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.15 sja End
		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
	 	//荷主センタ変更対応 201７.02.15 sja Start
//		request.clientCd = userInfo.clientCd;
		if ($scope.headH) {
			request.clientCd = $scope.headH.clientCd;
		} else {
			request.clientCd = userInfo.clientCd;
		}
	 	//荷主センタ変更対応 201７.02.15 sja End
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositStockTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
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
		request.clientCd = userInfo.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			$scope.StockTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#productBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.headB.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.productCd = productCd;

			$scope.headB.productNm = null;

			api.product.record(request).then(function(response){
				$scope.headB.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.headB.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showProduct
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
			clientCd: $scope.headH.clientCd,
			productCd: $scope.headB.productCd
		};
		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.headB.productCd =  selectedItem.productCd;
			$scope.headB.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.headH.supplyCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.headH.supplyCustomerNm = response.data.mCustomer.customerNm;

				// [#1909] 納品先CDを入れると届先CDが入力される問題を修正(問題のコードを削除) 2017.06.08 kawana
			});

		} else {
			$scope.headH.supplyCustomerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showSupplyCustomer
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var items = {
			// 取引先マスタ
			clientCd: $scope.headH.clientCd,
			deliveryCd: $scope.headH.supplyCustomerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.headH.supplyCustomerCd = selectedItem.customerCd;
			$scope.headH.supplyCustomerNm = selectedItem.customerNm;

			// [#1909] 納品先CDを入れると届先CDが入力される問題を修正(問題のコードを削除) 2017.06.08 kawana
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 届先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、届先情報を取得し画面項目に反映する。
	 */
	$scope.delivCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.headH.delivCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.clientCd);
			request.customerCd = deliveryCd;

			// 届先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				// ワンタイムフラグにそって届先名称を設定
				if(response.data.mCustomer.onetimeFlg == "1"){
					if($scope.headH.delivCustomerNm == null || $scope.headH.delivCustomerNm == ""){
						$scope.headH.delivCustomerNm = response.data.mCustomer.customerNm;
					}
				}else{
					$scope.headH.delivCustomerNm = response.data.mCustomer.customerNm;
				}

				// [#1909] 納品先CDを入れると届先CDが入力される問題を修正(問題のコードを削除) 2017.06.08 kawana

				// ワンタイムフラグにそって届先欄を表示・非表示
				var isOnetime = false;
				if(response.data.mCustomer.onetimeFlg == "1"){
					isOnetime = true;
				}

				var request1 = {};
				request1.centerId = userInfo.centerId;
				request1.customerId = response.data.mCustomer.customerId;

				if ($scope.headH.deliveryCourseCd == null || $scope.headH.deliveryCourseCd==""){
					// 配送コース情報の取得
					api.deliveryCourse.search(request1).then(function(response){
						if (response.data.mDeliveryCourse.deliveryCourseCd != null){
							$scope.headH.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
							$scope.deliveryCourseCdBlur();
						}
					});
				}
			});
		} else {
			$scope.headH.delivCustomerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showSupplyCustomer
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 届先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された届先情報を画面項目に反映する。
	 */
	$scope.showDelivCustomer = function(){
		var items = {
			// 取引先マスタ
			clientCd: $scope.headH.clientCd,
			deliveryCd: $scope.headH.delivCustomerCd
		};

		// 届先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 届先マスタ
			$scope.headH.delivCustomerCd = selectedItem.customerCd;

			// ワンタイムフラグにそって届先名称を設定
			if(selectedItem.onetimeFlg == "1"){
				if($scope.headH.delivCustomerNm == null || $scope.headH.delivCustomerNm == ""){
					$scope.headH.delivCustomerNm = selectedItem.customerNm;
				}
			}else{
				$scope.headH.delivCustomerNm = selectedItem.customerNm;
			}

			// [#1909] 納品先CDを入れると届先CDが入力される問題を修正(問題のコードを削除) 2017.06.08 kawana

			var request = {};
			request.centerId = userInfo.centerId;
			request.customerId = selectedItem.customerId;

			if ($scope.headH.deliveryCourseCd == null || $scope.headH.deliveryCourseCd==""){
				// 配送コース情報の取得
				api.deliveryCourse.search(request).then(function(response){
					if (response.data.mDeliveryCourse.deliveryCourseCd != null){
						$scope.headH.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
						$scope.deliveryCourseCdBlur();
					}
				});
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showDeliveryCourse
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(){
		var items = {
			// 配送コードマスタ
			centerCd: $scope.headH.centerCd,
			deliveryCourseCd: $scope.headH.deliveryCourseCd
		};

		// 配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.headH.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.headH.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description 配送コースCDのロストフォーカス処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function(){
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.headH.deliveryCourseCd;
		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.headH.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
			request.deliveryCourseCd = deliveryCourseCd;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.headH.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});
		} else {
			$scope.headH.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#showLocation
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
		// 入力されたロケーションCD
		var locationCd;
		if (index == 1) {
			locationCd = $scope.headB.locationCdFrom;
		} else {
			locationCd = $scope.headB.locationCdTo;
		}
		var items = {
			centerCd: $scope.headH.centerCd,
			locationCd: locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.headB.locationCdFrom = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.headB.locationNmFrom = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}else{
				$scope.headB.locationCdTo = selectedItem.locationCd;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
				$scope.headB.locationNmTo = selectedItem.locationNm;
				// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
			}
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#locationCdBlur
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
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
			locationCd = $scope.headB.locationCdFrom;
		} else {
			locationCd = $scope.headB.locationCdTo;
		}

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.headH.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.headB.locationNmFrom = response.data.mLocation.locationNm;
				}else{
					$scope.headB.locationNmTo = response.data.mLocation.locationNm;
				}
			});
		} else {

			// ロケーション名称をクリア
			if(index == 1){
				$scope.headB.locationNmFrom = null;
			}else{
				$scope.headB.locationNmTo = null;
			}
		}
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.object:ShippingHistory#excelOutput
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head =$scope.headH;
		request.data.body = $scope.headB;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "bodyList", document.title);

		api.shippingHistory.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.ShippingHistory.service:ShippingHistory#search
     * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.ShippingHistory.object:ShippingHistory#getPagingData
     * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
     *
     * @description
     * 検索処理<br>
     * ・権限マスタ検索用WebAPIの呼び出し定義<br>
     * ・検索終了後、検索結果反映処理呼び出し
     */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.headH;
		request.data.body = $scope.headB;

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.shippingHistory.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.ShippingHistory.object:ShippingHistory#setPagingData
     * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
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
		$scope.shippingHistoryGrid = response.data.bodyList;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.historyData);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingHistory.service:ShippingHistory#gridDblClick
	 * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("packingHistory", row);
	  };

	/**
	 * @ngdoc method
     * @name oneslogiWms.ShippingHistory.service:ShippingHistory#packingHistory
     * @methodOf oneslogiWms.ShippingHistory.object:ShippingHistory
	 *
	 * @description
	 * 梱包履歴ボタン押下処理<br>
	 *
	 * 梱包履歴画面を表示する。
	 */
	$scope.packingHistory = function(){
		// 梱包履歴画面へ遷移
		$location.path("wms/shipping/PackingHistory").search({}).search("mode", SCREEN_MODE.Read).search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].hshippingH.centerCd).search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].hshippingH.clientCd).search("shippingDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].hshippingH.shippingDt).search("workDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].hshippingH.workDt).search("shippingSlipNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].hshippingH.shippingSlipNo);
	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);

