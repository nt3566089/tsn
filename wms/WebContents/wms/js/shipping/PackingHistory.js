/**
 * @ngdoc overview
 * @name oneslogiWms.PackingHistory
 *
 * @description
 * 梱包履歴画面
 */
angular.module('oneslogiWms.PackingHistory',[])

/**
 * @ngdoc service
 * @name oneslogiWms.PackingHistory.service:packingHistoryApi
 *
 * @description
 * 梱包履歴WebApi定義<br>
 * ・resources/common/processType/keyValueList 処理区分データ取得用WebApi<br>
 * ・resources/common/deliveryCustomer/record 納品先CDデータ取得用WebApi<br>
 * ・resources/common/deliveryCourse/record 配送コースCDデータ取得用WebApi<br>
 * ・resources/common/deliveryCourse/search 配送コースCDデータ取得用WebApi<br>
 * ・resources/common/carrierCd/keyValueList 運送業者データ取得用WebApi<br>
 * ・resources/common/product/record 商品CDデータ取得用WebApi<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得用WebApi<br>
 * ・resources/shipping/packingHistory/init 通常画面用初期データ取得用WebApi<br>
 * ・resources/shipping/packingHistory/search 検索用WebApi<br>
 *
 */
.factory('packingHistoryApi', ['AngularAPIClient', function(AngularAPIClient) {
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
		packingHistory: AngularAPIClient.make(
			[
				['init', 'GET', 'resources/shipping/packingHistory/init'],
				['initData', 'GET', 'resources/shipping/packingHistory/initData'],
				['search', 'GET', 'resources/shipping/packingHistory/search'],
				['excel', 'GET', 'resources/shipping/packingHistory/search', 'excel']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PackingHistory.object:PackingHistory
 *
 * @description
 * 梱包履歴画面コントローラ
 */
.controller('PackingHistory', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'packingHistoryApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
	//グリッドの列情報（デザイン用）
	$scope.bodyListCols =
		[
		 	{field:"hpackingH.hshippingH.histDt", displayName:"履歴日"},
			{field:"hpackingH.hshippingH.shippingDt", displayName:"出荷日"},
			{field:"hpackingH.hshippingH.workDt", displayName:"作業日"},
			{field:"hpackingH.hshippingH.supplyCustomerCd", displayName:"納品先CD"},
			{field:"hpackingH.hshippingH.supplyCustomerNm", displayName:"納品先名称"},
			{field:"hpackingH.hshippingH.delivCustomerCd", displayName:"届先CD"},
			{field:"hpackingH.hshippingH.delivCustomerNm", displayName:"届先名称"},
			{field:"hpackingH.hshippingH.clientShippingNo", displayName:"顧客出荷指示No."},
			{field:"hpackingH.hshippingH.shippingSlipNo", displayName:"WMS出荷伝票No."},
			{field:"hpackingH.hshippingH.mprocessType.processTypeCd", displayName:"処理区分CD"},
			{field:"hpackingH.hshippingH.mprocessType.vdict.dictNm", displayName:"処理区分名称"},
			{field:"hpackingH.carrierTraceNum", displayName:"貨物追跡No."},
			{field:"hpackingH.hshippingH.deliveryCourseCd", displayName:"配送コースCD"},
			{field:"hpackingH.hshippingH.deliveryCourseNm", displayName:"配送コース名称"},
			{field:"hpackingH.hshippingH.carrierCd", displayName:"運送業者CD"},
			{field:"hpackingH.hshippingH.carrierNm", displayName:"運送業者名称"},
			{field:"hstock.productCd", displayName:"商品CD"},
			{field:"hstock.productNm", displayName:"商品名称"},
			{field:"hstock.productAbbr", displayName:"商品略称"},
			{field:"hstock.janCd", displayName:"JANCD"},
			{field:"hstock.lot", displayName:"ロット"},
			{field:"hstock.limitDt", displayName:"期限日"},
			{field:"hstock.mstockType.stockTypeCd", displayName:"在庫区分CD"},
			{field:"hstock.mstockType.vdict.dictNm", displayName:"在庫区分名称"},
			{field:"hstock.warehouseCd", displayName:"倉庫CD"},
			{field:"hstock.warehouseNm", displayName:"倉庫名称"},
			{field:"hstock.zoneCd", displayName:"ゾーンCD"},
			{field:"hstock.zoneNm", displayName:"ゾーン名称"},
			{field:"hstock.locationCd", displayName:"ロケーションCD"},
			{field:"hstock.locationNm", displayName:"ロケーション名称"},
			{field:"hstock.depositCd", displayName:"預託CD"},
			{field:"hstock.depositNm", displayName:"預託名称"},
			{field:"hstock.depositAbbr", displayName:"預託略称"},
			{field:"hstock.storeLabelNo", displayName:"入庫ラベルNo."},
			{field:"hstock.oldStoreLabelNo", displayName:"元入庫ラベルNo."},
			{field:"hpackingH.boxCd", displayName:"荷材CD"},
			{field:"hpackingH.boxNm", displayName:"荷材名称"},
			{field:"hpackingH.grossWeight", displayName:"総重量(g)"},
			{field:"hpackingH.totalVolume", displayName:"総容積(mm3)"},
			{field:"packingNum", displayName:"梱包数"},
			//荷主センタ変更対応 2017.02.06 sja Start
		 	{field:"headH.hshippingH.clientCd", displayName:"荷主CD"},
		 	{field:"headH.hshippingH.clientNm", displayName:"荷主名称"},
		 	{field:"headH.hshippingH.centerCd", displayName:"センタCD"},
		 	{field:"headH.hshippingH.centerNm", displayName:"センタ名称"}
			//荷主センタ変更対応 2017.02.06 sja End
		];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#initScreen
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// パラメータ設定
		$scope.params = $route.current.params;

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'bodyList',
			columnDefs: 'bodyListCols',
			pagingOptions : $scope.pagingOptions
		});

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

        statusInfo.mappingErrorMessage($scope, "supplyCustomerCd", 8, 5);
        statusInfo.mappingErrorMessage($scope, "delivCustomerCd", 8, 15);
        statusInfo.mappingErrorMessage($scope, "deliveryCourseCd", 8, 12);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#deferredGetStockTypeList
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
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
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#deferredGetProcessType
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 処理区分取得・設定処理（同期可能）<br>
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
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#deferredGetCarrier
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 運送業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.06 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.headH) {
			request.centerCd = $scope.headH.hshippingH.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.06 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#initScreenHttp
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {

		$scope.setDelivVisible(false);

		//全通信終了後に以下関数で各種設定を実行
		$q.all(
			[
			 	$scope.deferredGetProcessType(), // 処理区分
			 	$scope.deferredGetCarrier(), // 運送業者
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
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#deferredGetInitData
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 梱包履歴初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.packingHistory.init().then(function(response){

			$scope.paging = response.paging;

			$scope.headH = response.data.head;
			$scope.headB = response.data.body;
			$scope.bodyList = response.data.bodyList;
			$scope.historyData = response.data;
			$scope.headH.hshippingH.clientCd = userInfo.clientCd;
			$scope.headH.hshippingH.centerCd = userInfo.centerCd;
			$scope.headH.hshippingH.shippingDt = userInfo.beforeSystemDt; // 出荷日
			$scope.headH.hshippingH.workDt = userInfo.beforeSystemDt; // 作業日

			// チェックモード
			if (angular.isDefined($scope.screenMode) && $scope.screenMode == SCREEN_MODE.Read) {
				// パラメータデータ設定
				$scope.headH.hshippingH.centerCd = $scope.params.centerCd;
				$scope.headH.hshippingH.clientCd = $scope.params.clientCd;
				$scope.headH.hshippingH.shippingDt = $scope.params.shippingDt;
				$scope.headH.hshippingH.workDt = $scope.params.workDt;
				$scope.headH.hshippingH.shippingSlipNo = $scope.params.shippingSlipNo;
				// 履歴データ取得・検索処理
				$scope.search();
			}

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

	//荷主センタ変更対応 201７.02.06 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#centerChange
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、運送業者リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 運送業者リスト変更（同期処理）
		$scope.deferredGetCarrier();
	};
	//荷主センタ変更対応 201７.02.06 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#productBlur
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.headB.hstock.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.hshippingH.clientCd);
			request.productCd = productCd;

			$scope.headB.hstock.productNm = null;

			api.product.record(request).then(function(response){
				$scope.headB.hstock.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.headB.hstock.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#showProduct
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
			clientCd: $scope.headH.hshippingH.clientCd,
			productCd: $scope.headB.hstock.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.headB.hstock.productCd =  selectedItem.productCd;
			$scope.headB.hstock.productNm =  selectedItem.productNm;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.headH.hshippingH.supplyCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.hshippingH.clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.headH.hshippingH.supplyCustomerNm = response.data.mCustomer.customerNm;

				if($scope.headH.hshippingH.delivCustomerCd == null || $scope.headH.hshippingH.delivCustomerCd == ""){
					$scope.headH.hshippingH.delivCustomerCd = $scope.headH.hshippingH.supplyCustomerCd;
					$scope.delivCustomerCdBlur();
				}
			});

		} else {
			$scope.headH.hshippingH.supplyCustomerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#showSupplyCustomer
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var items = {
			// 取引先マスタ
			clientCd: $scope.headH.hshippingH.clientCd,
			deliveryCd: $scope.headH.hshippingH.supplyCustomerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.headH.hshippingH.supplyCustomerCd = selectedItem.customerCd;
			$scope.headH.hshippingH.supplyCustomerNm = selectedItem.customerNm;

			if($scope.headH.hshippingH.delivCustomerCd == null || $scope.headH.hshippingH.delivCustomerCd == ""){
				$scope.headH.hshippingH.delivCustomerCd = $scope.headH.hshippingH.supplyCustomerCd;
				$scope.delivCustomerCdBlur();
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 届先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、届先情報を取得し画面項目に反映する。
	 */
	$scope.delivCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.headH.hshippingH.delivCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.headH.hshippingH.clientCd);
			request.customerCd = deliveryCd;

			// 届先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				// ワンタイムフラグにそって届先名称を設定
				if(response.data.mCustomer.onetimeFlg == "1"){
					if($scope.headH.hshippingH.delivCustomerNm == null || $scope.headH.hshippingH.delivCustomerNm == ""){
						$scope.headH.hshippingH.delivCustomerNm = response.data.mCustomer.customerNm;
					}
				}else{
					$scope.headH.hshippingH.delivCustomerNm = response.data.mCustomer.customerNm;
				}

				if($scope.headH.hshippingH.supplyCustomerCd == null || $scope.headH.hshippingH.supplyCustomerCd == ""){
					$scope.headH.hshippingH.supplyCustomerCd = $scope.headH.hshippingH.delivCustomerCd;
					$scope.supplyCustomerCdBlur();
				}

				// ワンタイムフラグにそって届先欄を表示・非表示
				var isOnetime = false;
				if(response.data.mCustomer.onetimeFlg == "1"){
					isOnetime = true;
				}
				$scope.setDelivVisible(isOnetime);

				var request1 = {};
				request1.centerId = userInfo.centerId;
				request1.customerId = response.data.mCustomer.customerId;

				if ($scope.headH.hshippingH.deliveryCourseCd == null || $scope.headH.hshippingH.deliveryCourseCd==""){
					// 配送コース情報の取得
					api.deliveryCourse.search(request1).then(function(response){
						if (response.data.mDeliveryCourse.deliveryCourseCd != null){
							$scope.headH.hshippingH.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
							$scope.deliveryCourseCdBlur();
						}
					});
				}
			});
		} else {
			$scope.headH.hshippingH.delivCustomerNm = null;

			// 届先欄を非表示
			$scope.setDelivVisible(false);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#showSupplyCustomer
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 届先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された届先情報を画面項目に反映する。
	 */
	$scope.showDelivCustomer = function(){
		var items = {
			// 取引先マスタ
			clientCd: $scope.headH.hshippingH.clientCd,
			deliveryCd: $scope.headH.hshippingH.delivCustomerCd
		};

		// 届先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 届先マスタ
			$scope.headH.hshippingH.delivCustomerCd = selectedItem.customerCd;

			// ワンタイムフラグにそって届先名称を設定
			if(selectedItem.onetimeFlg == "1"){
				if($scope.headH.hshippingH.delivCustomerNm == null || $scope.headH.hshippingH.delivCustomerNm == ""){
					$scope.headH.hshippingH.delivCustomerNm = selectedItem.customerNm;
				}
			}else{
				$scope.headH.hshippingH.delivCustomerNm = selectedItem.customerNm;
			}

			if($scope.headH.hshippingH.supplyCustomerCd == null || $scope.headH.hshippingH.supplyCustomerCd == ""){
				$scope.headH.hshippingH.supplyCustomerCd = $scope.headH.hshippingH.delivCustomerCd;
				$scope.supplyCustomerCdBlur();
			}

			var request = {};
			request.centerId = userInfo.centerId;
			request.customerId = selectedItem.customerId;

			if ($scope.headH.hshippingH.deliveryCourseCd == null || $scope.headH.hshippingH.deliveryCourseCd==""){
				// 配送コース情報の取得
				api.deliveryCourse.search(request).then(function(response){
					if (response.data.mDeliveryCourse.deliveryCourseCd != null){
						$scope.headH.hshippingH.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
						$scope.deliveryCourseCdBlur();
					}
				});
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#showDeliveryCourse
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(){
		var items = {
			// 配送コードマスタ
			centerCd: $scope.headH.hshippingH.centerCd,
			deliveryCourseCd: $scope.headH.hshippingH.deliveryCourseCd
		};

		// 配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.headH.hshippingH.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.headH.hshippingH.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description 配送コースCDのロストフォーカス処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function(){
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.headH.hshippingH.deliveryCourseCd;
		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			//荷主センタ変更対応 2017.02.06 sja Start
//			request.centerId = userInfo.centerId;
			request.centerId = userInfo.centerIdByCd($scope.headH.hshippingH.centerCd);
			//荷主センタ変更対応 2017.02.06 sja End
			request.deliveryCourseCd = deliveryCourseCd;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.headH.hshippingH.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});
		} else {
			$scope.headH.hshippingH.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#excelOutput
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
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

		api.packingHistory.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#search
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
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
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#getPagingData
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.headH;
		request.data.body = $scope.headB;
		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.packingHistory.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#setPagingData
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.bodyList = response.data.bodyList;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;//トータル件数を設定
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.historyData);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#setDelivVisible
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * 届先入力欄の表示制御<br>
	 * 引数のワンタイムフラグによって表示・非表示を切り替える
	 */
	$scope.setDelivVisible = function(isOnetime) {

		// 届先項目を表示・非表示切替
		directiveControl.show($scope, "delivCustomerNm", isOnetime);

		$scope.isOnetime = isOnetime;
	}

	// 画面初期化処理を実行
	$scope.initScreen();
}]);