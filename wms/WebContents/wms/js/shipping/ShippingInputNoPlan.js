/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingInputNoPlan
 *
 * @description
 * 出荷実績入力(予定なし)<br>
 *
 * 出庫の実績（どの商品をどのロケーションからいくつ出庫したか）を入力する画面。
 *
 */
angular.module('oneslogiWms.ShippingInputNoPlan', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingInputNoPlan.service:ShippingInputNoPlanApi
 *
 * @description
 * 出荷実績入力(予定なし)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * processType 処理区分データ操作用WebApi<br>
 * ・resources/common/processType/keyValueList 処理区分ドロップダウンリスト用データ取得WebApi<br>
 * <br>
 * shippingStatus 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 納品時間帯、緊急フラグドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * stockType 在庫区分データ取得用WebApi<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得用WebAPI<br>
 * <br>
 * depositCd 預託データ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * deliveryCustomer 納品先データ取得用WebAPI<br>
 * ・resources/common/deliveryCustomer/record 納品先データ取得用WebAPI<br>
 * <br>
 * deliveryCourse 配送コース取得用WebAPI<br>
 * ・resources/common/deliveryCourse/record 配送コース取得用WebAPI<br>
 * <br>
 * product 商品データ取得用WebAPI<br>
 * ・resources/common/product/record 商品データ取得用WebAPI<br>
 * <br>
 * ShippingInputNoPlan出荷実績入力(予定なし)データ操作用WebApi<br>
 * ・resources/shipping/shippingInputNoPlan/init 初期データ取得WebAPI<br>
 * ・resources/shipping/shippingInputNoPlan/register 出荷実績登録WebAPI<br>
 * ・resources/shipping/shippingInputNoPlan/select 在庫数データ取得WebAPI<br>
 * ・resources/shipping/shippingInputNoPlan/inputCheck 登録前入力チェックWebAPI<br>
 */
.factory('ShippingInputNoPlanApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),

		shippingStatus: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),

		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),

		depositCd: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
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

		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record'],
                 // [Ver3.0] unit of measure対応 2017.12.28 潘 Start
                 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				 	// [Ver3.0] unit of measure対応 2017.12.28 潘 End
				 ]
		),
		// [C-CWMS-0021] 届先追加 2015.03.24 kawana Start
		zip: AngularAPIClient.make(
				[
				 	['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		// [C-CWMS-0021] 届先追加 2015.03.24 kawana End
		ShippingInputNoPlan: AngularAPIClient.make(
				[
				 ['init', 'GET', 'resources/shipping/shippingInputNoPlan/init'],
				 ['insert', 'POST', 'resources/shipping/shippingInputNoPlan/register'],
				 ['select', 'GET', 'resources/shipping/shippingInputNoPlan/select'],
				 ['inputCheck', 'POST', 'resources/shipping/shippingInputNoPlan/inputCheck']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
 *
 * @description
 * 出荷指示明細画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
.controller('ShippingInputNoPlan', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ShippingInputNoPlanApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
// [Ver3.0] unit of measure対応 2017.12.28 潘 End

	//グリッドの列情報
	$scope.shippingInputNoPlanCols = [
	                                  {field:"lineNo", displayName:"行No."},
	                                  {field:"productCd", displayName:"商品CD"},
	                                  {field:"mproduct.productNm", displayName:"商品名称"},
	                                  {field:"mproduct.productAbbr", displayName:"商品略称"},
	                                  {field:"locationCd", displayName:"ロケーションCD"},
	                                  {field:"chargeNum", displayName:"引当可能数"},
	                                  {field:"mproduct.janCd", displayName:"JANCD"},
	                                  {field:"lot", displayName:"ロット"},
	                                  {field:"limitDt", displayName:"期限日"},
	                                  {field:"instNum", displayName:"指示数"},
	                                  {field:"depositCd", displayName:"預託"},
	                                  {field:"stockTypeCd", displayName:"在庫区分"}
	                                  ];

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#initScreen
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.searchCondition.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
			});

			// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe Start
			for (var i = 0; i < $scope.searchBody.length; i++) {
				var productCd = $scope.searchBody[i].productCd;
				if (productCd != null && productCd !=""){
					//在庫数データ取得
					$scope.productCdBlur(i);
				}
			}
		};

		// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe End


		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.searchCondition.mclient.clientCd) {
				// 選択した荷主で取得済みの預託、在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				setStockTypeList(newStockTypeList, true);

				// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe Start
				for (var i = 0; i < $scope.searchBody.length; i++) {
					var productCd = $scope.searchBody[i].productCd;
					if (productCd != null && productCd !=""){
						//在庫数データ取得
						$scope.productCdBlur(i);
					}
				}
				// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe End
			}
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'searchBody',
			columnDefs: 'shippingInputNoPlanCols'
		});

		// グリッドの商品コード、ロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"productCd":{
					clickFunction:"showProduct(row.rowIndex)"
				},
				"locationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
		};

		$scope.gridSelectOptions = {
				"depositCd" : {
					key : "mCustomer.customerCd",
					value : "mCustomer.customerNm",
					listModel : "depositStockTypeList"
				},
				"stockTypeCd" :{
					key : "stockTypeCd",
					value : "stockTypeNm",
					listModel : "stockTypeList"
				}
		};
		// グリッドの商品コード列、入庫ケース数列、入庫バラ数列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"productCd":{
					"ng-blur":{
						eventFunction:"productCdBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"productCdChange(row.rowIndex)"
					}
				},
				"locationCd":{
					"ng-blur":{
						eventFunction:"locationCdBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"locationCdChange(row.rowIndex)"
					}
				},
				"stockTypeCd":{
					"ng-blur":{
						eventFunction:"StockTypeblur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"StockTypeChange(row.rowIndex)"
					}
				},
				"depositCd":{
					"ng-blur":{
						eventFunction:"DepositCdblur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"DepositCdChange(row.rowIndex)"
					}
				},
				"lot":{
					"ng-blur":{
						eventFunction:"lotblur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"lotChange(row.rowIndex)"
					}
				},
				"limitDt":{
					"ng-blur":{
						eventFunction:"limitDtblur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"limitDtChange(row.rowIndex)"
					}
				},
				"instNum":{
					"ng-blur":{
						eventFunction:"instNumBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"instNumChange(row.rowIndex)"
					}
				},
				// [#2799][Ver3.0] unit of measure 対応 2017.12.28 潘 Start
				"instNumMultiText":{
					"ng-change":{
						eventFunction:"instNumMultiTextChange(row.rowIndex)"
					}
				},
				// [#2799][Ver3.0] unit of measure 対応 2017.12.28 潘 End
		};

		// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
		// 画面表示用の商品荷姿リスト共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 総数用colCdを定義
				"instNum" : {
					// 複数荷姿用colCdを定義
					multiTextCd: "instNumMultiText",
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "searchBody.mproduct.mproductShapeList"
				}
		};
		// グリッド複数荷姿用各種オプション
		$scope.gridMultiTextOptions = [];
		// [Ver3.0] unit of measure対応 2017.12.28 潘 End

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "productCd",10, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "locationCd",10, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "lot",10, 11);
		// [C-CWMS-0021] 届先追加 2015.03.24 kawana Start
		statusInfo.mappingErrorMessage($scope, "delivAddress1", 10, 13);
		// [C-CWMS-0021] 届先追加 2015.03.24 kawana End
		// [品質-102-015] 届先追加 2015.04.07 kawana Start
		statusInfo.mappingErrorMessage($scope, "supplierCustomerCd", 10, 8);
		// [品質-102-015] 届先追加 2015.04.07 kawana End
		// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama Start
		statusInfo.mappingErrorMessage($scope, "delivCustomerCd", 10, 14);
		// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	$scope.productCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.locationCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.StockTypeChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.DepositCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.lotChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.limitDtChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.instNumChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [#2799][Ver3.0] unit of measure 対応 2017.12.28 潘 Start
	$scope.instNumMultiTextChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [#2799][Ver3.0] unit of measure 対応 2017.12.28 潘 End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#initScreenHttp
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// [C-CWMS-0021] 届先追加 2015.03.26 kawana Start
		// 届先情報を非表示
		// ※ 通信後では非表示までに時間がかかり見栄えが悪いため
		//    通信前に設定し通信後のデータに応じて表示に切り替える
		$scope.setDelivVisible(false);
		// [C-CWMS-0021] 届先追加 2015.03.26 kawana End

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetProcessTypeList(),
				 $scope.deferredGetDelivTz(),
				 $scope.deferredGetEmergencyFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add Start
		gridMultiTextControl.clearMultiTextOptionsList($scope, 'gridMultiTextOptions');
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add End

	}

	//処理区分変更
	$scope.processTypeChange = function() {
		for (var row = 0; row < $scope.searchBody.length; row++) {
			$scope.productCdBlur(row);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function () {
		var deferred = $q.defer();

		var request = {};
		request.receiveFlg = "0";
		request.shippingFlg = "1";
		request.moveFlg = "0";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.processTypeList = response.data;

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetShippingStatus
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 納品時間帯取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelivTz = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELIV_TZ"; //納品時間帯

		api.shippingStatus.query(request).then(function(response){
			$scope.delivTzList = response.data;

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetShippingStatus
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 緊急フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergencyFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_FLG"; //緊急フラグ

		api.shippingStatus.query(request).then(function(response){
			$scope.emergencyFlgList = response.data;

			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
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
		request.clientCd = $scope.searchCondition.mclient.clientCd;
		// 預託
		owsCommon.getDataCacheable(api.depositCd, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
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
		request.clientCd = $scope.searchCondition.mclient.clientCd;
		// 在庫区分
		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#stockTypeCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 在庫区分のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.StockTypeblur = function(rowIndex) {
		//在庫数データ取得
		$scope.deferredGetStockData(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#depositCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 預託のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.DepositCdblur = function(rowIndex) {
		//在庫数データ取得
		$scope.deferredGetStockData(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#lotblur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * ロットのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.lotblur = function(rowIndex) {
		//在庫数データ取得
		$scope.deferredGetStockData(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#limitDtblur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 期限日のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.limitDtblur = function(rowIndex) {
		//在庫数データ取得
		$scope.deferredGetStockData(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#changeClient
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {

		// 預託リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);

		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});

		for (var row = 0; row < $scope.searchBody.length; row++) {
			stockDataSelect(row);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 出荷実績入力(予定なし)初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.ShippingInputNoPlan.init().then(function(response){
			// 出荷実績ヘッダ関連
			$scope.searchCondition = response.data.head;
			// 出荷実績ボディ関連
			$scope.searchBody = response.data.list;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.workDt = userInfo.systemDt;
			$scope.searchCondition.emergencyFlg = owsCommon.getDefaultValue($scope.emergencyFlgList);
			$scope.searchCondition.mprocessType.processTypeCd = owsCommon.getDefaultValue($scope.processTypeList,'processTypeCd');

			// 荷主変更後処理
			$scope.changeClient(false);

			var stockTypeCd = "";
			var processTypeCd = $scope.searchCondition.mprocessType.processTypeCd;
			for (var i = 0; i < $scope.processTypeList.length; i++) {
				if($scope.processTypeList[i].processTypeCd == processTypeCd){
					stockTypeCd = $scope.processTypeList[i].stockTypeCd;
					break;
				}
			}

			owsCommon.syncExec(function() {
				//空行を生成
				for (var i = 0; i < getInitRowNum(); i++) {
					$scope.searchBody.push(angular.copy($scope.blankRow));
				    $scope.searchBody[i].stockTypeCd = stockTypeCd;
					// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add Start
					// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
					gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
					// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add End
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
					// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
					gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum',$scope.searchBody[i].mproduct.productId, $scope.searchBody[i].mproduct.mproductShapeList, i);
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
				}
				// 行番号振り直し
				updateRowNumber($scope.searchBody);
			});
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();

		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#instNumBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 予定数のロストフォーカス処理<br>
	 *
	 */
	$scope.instNumBlur = function(rowIndex) {
		// 入力された予定数を取得
//		var instNum = $scope.searchBody[rowIndex].instNum;
//		if(instNum && 0 == parseInt(instNum)) {
//			var err = "minIsOneError";
//			if (!gridOptionMessageControl.isShow($scope.gridOptions, "instNum", rowIndex)) {
//				if (!gridOptionMessageControl.isShow($scope.gridOptions, "instNum", rowIndex)) {
//					gridOptionMessageControl.show($scope.gridOptions, "instNum", $filter('owfMessage')((2, err)), rowIndex);
//				}
//			}
//		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#addRow
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		// [ON推-品向-235] 在庫区分の設定を追加 2014.11.24 楊寧 Start
		var stockTypeCd = "";
		var processTypeCd = $scope.searchCondition.mprocessType.processTypeCd;
		for (var i = 0; i < $scope.processTypeList.length; i++) {
			if($scope.processTypeList[i].processTypeCd == processTypeCd){
				stockTypeCd = $scope.processTypeList[i].stockTypeCd;
				break;
			}
		}
		// [ON推-品向-235] 在庫区分の設定を追加 2014.11.24 楊寧 End

		$scope.searchBody.push(angular.copy($scope.blankRow));
		// [ON推-品向-235] 在庫区分の設定を追加 2014.11.24 楊寧 Start
		$scope.searchBody[$scope.searchBody.length - 1].stockTypeCd = stockTypeCd;
		// [ON推-品向-235] 在庫区分の設定を追加 2014.11.24 楊寧 End
		// 行番号振り直し
		updateRowNumber($scope.searchBody);

		// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod Start
		// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
		gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod End
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
		var row = $scope.searchBody.length - 1;
		owsCommon.syncExec(function() {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum',$scope.searchBody[row].mproduct.productId, $scope.searchBody[row].mproduct.mproductShapeList, row);
		});
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
		// [Ver3.0] unit of measure対応 2017.12.28 潘 End

	};

	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#removeRow
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		var Item = 0;
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}
		// [横並-053] チェック順変更 2014.11.20 zhouj Start
		// 入力済の場合に警告
		var stockTypeCd = "";
		var processTypeCd = $scope.searchCondition.mprocessType.processTypeCd;
		for (var i = 0; i < $scope.processTypeList.length; i++) {
			if($scope.processTypeList[i].processTypeCd == processTypeCd){
				stockTypeCd = $scope.processTypeList[i].stockTypeCd;
				break;
			}
		}
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].productCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].productCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].instNum != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].instNum != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].depositCd != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].depositCd!= null)
						// [ON推-CT4-121] メッセージを出す条件を修正 2014.11.21 楊寧 Start
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].stockTypeCd != ""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].stockTypeCd != null
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].stockTypeCd !=stockTypeCd)
						// [ON推-CT4-121] メッセージを出す条件を修正 2014.11.21 楊寧 End
							||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationCd !=""
								&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationCd!= null)
								||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].lot !=""
									&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].lot!= null)
									||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].limitDt !=""
										&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].limitDt!= null))
			{
				Item++;
			}


		}
		if(Item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			// 複数行の場合に警告
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
		// [横並-053] チェック順変更 2014.11.20 zhouj End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.searchBody.indexOf(row) > -1) {
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod Start
				var targetIndex = $scope.searchBody.indexOf(row);
				$scope.searchBody.splice(targetIndex, 1);
				// grid複数荷姿用各種オプション変数への行削除件数分設定共通処理
				gridMultiTextControl.removeMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, targetIndex);
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod End
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.searchBody);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Delete
		for (var row = 0; row < $scope.searchBody.length; row++) {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum',$scope.searchBody[row].mproduct.productId, $scope.searchBody[row].mproduct.mproductShapeList, row);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// 該当行の荷姿補助内訳数取得
			owsCommon.getGridCalcAuxiliaryBreakdown($scope,$scope.searchBody[row].instNum, 'gridMultiTextOptions', 'instNum', row);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.12.28 潘 End
	};

	// 日付大小チェック
	$scope.fromToCheck = function(fromValue, toValue) {
		var fromValueString = owsCommon.dateToString(fromValue);
		var toValueString = owsCommon.dateToString(toValue);
		if (fromValueString > toValueString) {
			return true;
		}
		return false;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#register
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
		// 空行判定
		for (var row = 0; row < $scope.searchBody.length; row++) {
			if($scope.gridOptions.getSelection($scope.gridOptions.gridApi.grid.rows[row]) == true)
			{
				// 空行以外を退避
				listBody.push($scope.searchBody[row]);
			}
			else
			{
				// 空行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 空行を退避
				emptyBody.push($scope.searchBody[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
			owsCommon.syncExec(function() {

				var isError = $scope.searchform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.searchBody.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

				//明細が入力されていない場合
				if($scope.searchBody.length == 0)
				{
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// 入力データ無し
				if (listBody.length == 0) {
					// [EC-CT1-147] メッセージを統一 2015.04.06 kawana Start
					alertMessage.setErrorMessageByCode("noDetailsError");
					// [EC-CT1-147] メッセージを統一 2015.04.06 kawana End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod Start
					var targetIndex = $scope.searchBody.indexOf(row);
					$scope.searchBody.splice(targetIndex, 1);
					$scope.gridMultiTextOptions.splice(targetIndex, 1);
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod End
				});

				// 行番号振り直し
				updateRowNumber($scope.searchBody);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

				var delivPlanDt = $scope.searchCondition.delivPlanDt;
				var workDt = $scope.searchCondition.workDt;
				var shippingDt = $scope.searchCondition.shippingDt;
				var delivDt = $scope.searchCondition.delivDt;

				// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana Start
				if(delivPlanDt){
					// 作業日>納品日の場合
					if ($scope.fromToCheck(workDt,delivPlanDt)){
						alertMessage.setErrorMessageByCode("delivPlanDateCannotChangeBeforeWorkDateError");
						return;
					}

					// 出荷日>納品日の場合
					if ($scope.fromToCheck(shippingDt,delivPlanDt)){
						alertMessage.setErrorMessageByCode("delivPlanDateCannotChangeBeforeShipDateError");
						return;
					}
				}
				// [EC-CT1-003] 納品予定日を必須から任意に変更 2015.02.09 kawana End

				//作業日>出荷日の場合
				if ($scope.fromToCheck(workDt,shippingDt)){
					alertMessage.setErrorMessageByCode("shipDateCannotChangeBeforeWorkDateError");
					return;
				}
				//出荷日>納品指定日の場合
				if (delivDt != null && delivDt != ""){
					if ($scope.fromToCheck(shippingDt,delivDt)){
						alertMessage.setErrorMessageByCode("delivDateCannotChangeBeforeShipDateError");
						return;
					}
				}

				//[C-CWMS-0037] 重複チェックいらない為チェック処理削除 2015.08.05 Nay Zaw

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.searchBody.splice($scope.searchBody.indexOf(row), 1);
//				});
//
//				// 行番号振り直し
//				updateRowNumber($scope.searchBody);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

	//			var errAry1 = new Array();
	//			var err = "minIsOneError";
	//			for (var row = 0; row < $scope.searchBody.length; row++) {
	//				var instNum = $scope.searchBody[row].instNum;
	//				if(instNum && 0 == parseInt(instNum)) {
	//					errAry1.length ++;
	//					if (!gridOptionMessageControl.isShow($scope.gridOptions, "instNum", row)) {
	//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "instNum", row)) {
	//							gridOptionMessageControl.show($scope.gridOptions, "instNum", $filter('owfMessage')((2, err)), row);
	//							directiveControl.firstErrorOnFocus('searchform');
	//						}
	//					}
	//				}
	//			}
	//
	//			if (0 < errAry1.length) {
	//				return;
	//			}

				var errAry2 = new Array();
				var err1 = "lotNotInputLotManagementProductError";
				var err2 = "limitDateNotInputLimitDateManagementProductError";
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
				var firstErrIndex;
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

				for (var row = 0; row < $scope.searchBody.length; row++) {
					if ($scope.searchBody[row].lotManagFlg == "1"){
						if(!($scope.searchBody[row].lot) || 0 == $scope.searchBody[row].lot.length) {
							errAry2.length ++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", row)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", row)) {
									gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')((2, err1)), row);
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
//									directiveControl.firstErrorOnFocus('searchform');
									if (!firstErrIndex) {

										// 現在の行を最初のエラー行に設定
										firstErrIndex = row;
									}
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
								}
							}
						}
					}

					if ($scope.searchBody[row].limitDtManagFlg == "1"){
						if(!($scope.searchBody[row].limitDt) || 0 == $scope.searchBody[row].limitDt.length) {
							errAry2.length ++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", row)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", row)) {
									gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')((2, err2)), row);
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
//									directiveControl.firstErrorOnFocus('searchform');
									if (!firstErrIndex) {

										// 現在の行を最初のエラー行に設定
										firstErrIndex = row;
									}
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
								}
							}
						}
					}
				}

				if (0 < errAry2.length) {
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstErrIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('searchform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
					return;
				}

				// [新WMS-110-028] 在庫不足のエラーをグリッドに表示 2015.07.22 kawana Start

				var chargeNumErrRowIndexList = new Array();
				//引当可能数チェック
				for (var row = 0; row < $scope.searchBody.length; row++) {
					var chargeNum = $scope.searchBody[row].chargeNum;
					var instNum = $scope.searchBody[row].instNum;

					if (chargeNum == null
							|| owsCommon.isZero(chargeNum)
							|| owsCommon.isLessThan(chargeNum, instNum)) {

						// 在庫が不足している
						chargeNumErrRowIndexList.push(row);
					}
				}

				if (0 < chargeNumErrRowIndexList.length ) {

					// 該当行にエラーを表示しスクロールとフォーカス
					gridOptionMessageControl.show($scope.gridOptions, "instNum", $filter('owfMessage')('shipInstructedCannotRegisterStockShortageError'), chargeNumErrRowIndexList);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, chargeNumErrRowIndexList[0]);
					directiveControl.firstErrorOnFocus('searchform');
					return;
				}

				// [新WMS-110-028] 在庫不足のエラーをグリッドに表示 2015.07.22 kawana End

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				// 新規登録関数を設定
				checkFunc = api.ShippingInputNoPlan.inputCheck;
				execFunc = api.ShippingInputNoPlan.insert;

				successFunc = function(){
					// 初期化
					$scope.initScreenHttp();
				}

				// 画面内容を引数に設定

				var request = {};
				request.data = {};
				request.data.head = $scope.searchCondition;
				request.data.list = listBody;

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//取引先マスタ存在異常
							if (checkResponse.status.listStatus[i].status.statusCode == 8){
								optionMessageControl.show($scope, "supplierCustomerCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
							//配送コースマスタ存在異常
							if (checkResponse.status.listStatus[i].status.statusCode == 9){
								optionMessageControl.show($scope, "deliveryCourseCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
							// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
							if (checkResponse.status.listStatus[i].status.subStatusCode == 19) {
								// 小数有無チェック共通処理
								gridMultiTextControl.checkDecimalInput($scope, $scope.searchBody[checkResponse.status.listStatus[i].status.rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラー箇所までスクロール
								gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラーにフォーカス
								directiveControl.firstErrorOnFocus('searchform');
								return;
							}
							// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
						}
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
						return;
					}

					// 入荷予定データ登録または更新
					execFunc(request).then(function(execResponse){

						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
						if (checkResponse.status.listStatus != null){
							for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
								if (execResponse.status.listStatus[i].status.subStatusCode == 19) {
									// 小数有無チェック共通処理
									gridMultiTextControl.checkDecimalInput($scope, $scope.searchBody[execResponse.status.listStatus[i].status.rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', execResponse.status.listStatus[i].status.rowIndex);
									// 最初のエラー箇所までスクロール
									gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, execResponse.status.listStatus[i].status.rowIndex);
									// 最初のエラーにフォーカス
									directiveControl.firstErrorOnFocus('searchform');
									return;
								}
							}
						}
						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
							return;
						}

						// 完了後の処理
						successFunc(execResponse);

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
					});

				});

			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#productBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {

		// 入力された商品コードを取得
		var productCd = $scope.searchBody[rowIndex].productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.productCd = productCd;

			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			api.product.productShape(request).then(function(response){

				// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana Start
				if (response.data.mProduct.productId == null){
					// 商品登録なし

					gridOptionMessageControl.show($scope.gridOptions, "productCd", $filter('owfMessage')("productNotFoundError"), rowIndex);
					//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
					// 該当行の入数内訳を初期化
					$scope.searchBody[rowIndex].unitNumBreakdown = null;
					$scope.searchBody[rowIndex].mproduct.productId = response.data.mProduct.productId;
					// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
					gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					// 商品CDBlur時の小数有無チェック共通処理
					gridMultiTextControl.checkDecimalInput($scope, $scope.searchBody[rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', rowIndex);
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
					//[Ver3.0] unit of measure対応 2018.1.21 ライ End
					$scope.searchBody[rowIndex].mproduct.productNm = null;
					$scope.searchBody[rowIndex].mproduct.productAbbr = null;
					$scope.searchBody[rowIndex].mproduct.janCd = null;
					$scope.searchBody[rowIndex].lotManagFlg = '0';
					$scope.searchBody[rowIndex].limitDtManagFlg = '0';
					$scope.searchBody[rowIndex].chargeNum = null;

					// 商品の在庫関連情報の入力可否制御
					productManagCurrentRow(rowIndex, '0', '0');
					return;
				}

				// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
				$scope.searchBody[rowIndex].mproduct = response.data.mProduct;
				// 該当行の入数内訳取得
				$scope.searchBody[rowIndex].unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);
				// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.searchBody[rowIndex].instNum, 'gridMultiTextOptions', 'instNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				// 商品CDBlur時の小数有無チェック共通処理
				gridMultiTextControl.checkDecimalInput($scope, $scope.searchBody[rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
				// [Ver3.0] unit of measure対応 2017.12.28 潘 End

				gridOptionMessageControl.hide($scope.gridOptions,"productCd",rowIndex);
				// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana End
				$scope.searchBody[rowIndex].mproduct.productNm = response.data.mProduct.productNm;
				$scope.searchBody[rowIndex].mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.searchBody[rowIndex].mproduct.janCd = response.data.mProduct.janCd;
				$scope.searchBody[rowIndex].lotManagFlg = response.data.mProduct.lotManagFlg;
				$scope.searchBody[rowIndex].limitDtManagFlg = response.data.mProduct.limitDtManagFlg;

				// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana Start
				var stockTypeCd = $scope.searchBody[rowIndex].stockTypeCd;
				if(!stockTypeCd || 0 == stockTypeCd.length){
					stockTypeCd = "";
					// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana End
					var processTypeCd = $scope.searchCondition.mprocessType.processTypeCd;
					for (var i = 0; i < $scope.processTypeList.length; i++) {
						if($scope.processTypeList[i].processTypeCd == processTypeCd){
							stockTypeCd = $scope.processTypeList[i].stockTypeCd;
							break;
						}
					}

					$scope.searchBody[rowIndex].stockTypeCd = stockTypeCd;
				}

				if ($scope.depositStockTypeList.length == 1) {
					$scope.searchBody[rowIndex].depositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
				}
				if ($scope.stockTypeList.length == 1) {
					$scope.searchBody[rowIndex].stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
				}

				// 商品の在庫関連情報の入力可否制御
				productManagCurrentRow(rowIndex, response.data.mProduct.lotManagFlg, response.data.mProduct.limitDtManagFlg);

				// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana Start
				//在庫数データ取得
				$scope.deferredGetStockData(rowIndex);
				// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana End
			});
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End

		} else {
			//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
			// 該当行の入数内訳を初期化
			$scope.searchBody[rowIndex].unitNumBreakdown = null;
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			$scope.searchBody[rowIndex].mproduct.productId = null;
			// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', null, null, rowIndex);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			// 商品CDBlur時の小数有無チェック共通処理
			gridMultiTextControl.checkDecimalInput($scope, $scope.searchBody[rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', rowIndex);
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			//[Ver3.0] unit of measure対応 2018.1.21 ライ End
			$scope.searchBody[rowIndex].mproduct.productNm = null;
			$scope.searchBody[rowIndex].mproduct.productAbbr = null;
			$scope.searchBody[rowIndex].mproduct.janCd = null;
			$scope.searchBody[rowIndex].lotManagFlg = '0';
			$scope.searchBody[rowIndex].limitDtManagFlg = '0';
			// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana Start
			$scope.searchBody[rowIndex].chargeNum = null;

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex, '0', '0');
			// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更 2015.04.06 kawana End
		}

		// [EC-CT1-150] 出荷指示入力にあわせてクリア処理を変更(不要な処理削除) 2015.04.06 kawana
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#showProduct
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex){

		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				productCd: $scope.searchBody[rowIndex].productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchBody[rowIndex].productCd =  selectedItem.productCd;
			$scope.searchBody[rowIndex].mproduct.productNm =  selectedItem.productNm;
			$scope.searchBody[rowIndex].mproduct.productAbbr = selectedItem.productAbbr;
			$scope.searchBody[rowIndex].mproduct.janCd =  selectedItem.janCd;
			$scope.searchBody[rowIndex].lotManagFlg = selectedItem.lotManagFlg;
			$scope.searchBody[rowIndex].limitDtManagFlg = selectedItem.limitDtManagFlg;
			//$scope.searchBody[rowIndex].stockTypeCd = 'W100';

			if ($scope.depositStockTypeList.length == 1) {
				$scope.searchBody[rowIndex].depositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			}
			if ($scope.stockTypeList.length == 1) {
				$scope.searchBody[rowIndex].stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
			}

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex, selectedItem.lotManagFlg, selectedItem.limitDtManagFlg);

			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#locationCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * ロケーションのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(rowIndex) {
		//在庫数データ取得
		$scope.deferredGetStockData(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#showLocation
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:planLocationCd
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(rowIndex){

		var items = {
				centerCd: $scope.searchCondition.mcenter.centerCd,
				locationCd: $scope.searchBody[rowIndex].locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			$scope.searchBody[rowIndex].locationCd = selectedItem.locationCd;

			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deliveryCourse
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:deliveryCourse
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された配送コース情報を画面項目に反映する。
	 */
	$scope.deliveryCourse = function(){
		var items = {
				// 配送コードマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.deliveryCourseCd
		};

		// 配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.searchCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.mdeliveryCourse.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#showCustomer
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:modalDelivery
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.supplyCustomerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.supplyCustomerNm = selectedItem.customerNm;

			// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama Start
			if($scope.searchCondition.delivCustomerCd == null || $scope.searchCondition.delivCustomerCd == ""){
				$scope.searchCondition.delivCustomerCd = $scope.searchCondition.supplyCustomerCd;
				$scope.delivCustomerCdBlur();
			}
			// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama End

			// [ON推-品向-1037] 届先入力追加に伴い、配送コード設定を削除 2015.12.21 koyama
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:supplyCustomerCdBlur
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、取引先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された納品先コードを取得
		var supplyCustomerCd = $scope.searchCondition.supplyCustomerCd;

		if(supplyCustomerCd && 0 < supplyCustomerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = supplyCustomerCd;

			$scope.searchCondition.supplyCustomerNm = null;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.searchCondition.supplyCustomerNm = response.data.mCustomer.customerNm;

				// [ON推-品向-1037] 届先入力追加に伴い、ワンタイム設定と配送コード設定を削除 2015.12.21 koyama

				// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama Start
				//[ON推-品質問題点指摘票(新ｿﾘV2-058)] 修正対応 2016.08.18 chou Mod Start
				if(($scope.searchCondition.delivCustomerCd == null || $scope.searchCondition.delivCustomerCd == "") && response.data.mCustomer.customerNm != null){
				//[ON推-品質問題点指摘票(新ｿﾘV2-058)] 修正対応 2016.08.18 chou Mod End
					$scope.searchCondition.delivCustomerCd = $scope.searchCondition.supplyCustomerCd;
					$scope.delivCustomerCdBlur();
				}
				// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama End

			});

		} else {
			$scope.searchCondition.supplyCustomerNm = null;

			// [ON推-品向-1037] 届先入力追加に伴い、ワンタイム判定処理を削除 2015.12.21 koyama
		}
	};

	// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#showdelivCustomer
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:modalDelivery
	 *
	 * @description 届先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showDelivCustomer = function(){
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.delivCustomerCd
		};

		// 届先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 届先マスタ
			$scope.searchCondition.delivCustomerCd = selectedItem.customerCd;

			// ワンタイムフラグにそって届先名称を設定
			if(selectedItem.onetimeFlg == "1"){
				if($scope.searchCondition.delivCustomerNm == null || $scope.searchCondition.delivCustomerNm == ""){
					$scope.searchCondition.delivCustomerNm = selectedItem.customerNm;
				}
			}else{
				$scope.searchCondition.delivCustomerNm = selectedItem.customerNm;
			}

			if($scope.searchCondition.supplyCustomerCd == null || $scope.searchCondition.supplyCustomerCd == ""){
				$scope.searchCondition.supplyCustomerCd = $scope.searchCondition.delivCustomerCd;
				$scope.supplyCustomerCdBlur();
			}

			var request = {};
			request.centerId = userInfo.centerId;
			request.customerId = selectedItem.customerId;

			if($scope.searchCondition.deliveryCourseCd == null || $scope.searchCondition.deliveryCourseCd == ""){
			// 配送コース情報の取得
				api.deliveryCourse.search(request).then(function(response){
					if(response.data.mDeliveryCourse.deliveryCourseCd != null){
						$scope.searchCondition.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
						$scope.deliveryCourseCdBlur();
					}
				});
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:supplyCustomerCdBlur
	 *
	 * @description
	 * 届先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、取引先情報を取得し画面項目に反映する。
	 */
	$scope.delivCustomerCdBlur = function() {
		// 入力された納品先コードを取得
		var deliveryCd = $scope.searchCondition.delivCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = deliveryCd;

			api.deliveryCustomer.record(request).then(function(response){

				// ワンタイムフラグにそって届先名称を設定
				if(response.data.mCustomer.onetimeFlg == "1"){
					if($scope.searchCondition.delivCustomerNm == null || $scope.searchCondition.delivCustomerNm == ""){
						$scope.searchCondition.delivCustomerNm = response.data.mCustomer.customerNm;
					}
				}else{
					$scope.searchCondition.delivCustomerNm = response.data.mCustomer.customerNm;
				}

				if($scope.searchCondition.supplyCustomerCd == null || $scope.searchCondition.supplyCustomerCd == ""){
					$scope.searchCondition.supplyCustomerCd = $scope.searchCondition.delivCustomerCd;
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

				if($scope.searchCondition.deliveryCourseCd == null || $scope.searchCondition.deliveryCourseCd == ""){
					// 配送コース情報の取得
					api.deliveryCourse.search(request1).then(function(response){
						if(response.data.mDeliveryCourse.deliveryCourseCd != null){
							$scope.searchCondition.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
							$scope.deliveryCourseCdBlur();
						}
					});
				}
			});
		} else {
			$scope.searchCondition.delivCustomerNm = null;
			// 届先欄を非表示
			$scope.setDelivVisible(false);
		}
	};
	// [ON推-品向-1037] 届先入力追加に伴い、届先CDの項目追加 2015.12.21 koyama End

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#deferredGetStockData
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description 在庫数データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockData = function (rowIndex) {

		var deferred = $q.defer();

		var productCd = $scope.searchBody[rowIndex].productCd;

		if(!productCd || 0 > productCd.length)
		{
			$scope.searchBody[rowIndex].chargeNum = 0;
			return;
		}

		var request = {};
		var arr = new Array();

		request.data = {};
		request.data.head = $scope.searchCondition;
		// [品質-029] 指示数などに不正な値が入っていると不明エラー発生 2015.02.27 kawana Start
		var body = {};
		body.productCd = $scope.searchBody[rowIndex].productCd;
		body.locationCd = $scope.searchBody[rowIndex].locationCd;
		body.stockTypeCd = $scope.searchBody[rowIndex].stockTypeCd;
		body.depositCd = $scope.searchBody[rowIndex].depositCd;
		// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットと期限日を追加する  2015.03.27 kyo Start
		body.lot = $scope.searchBody[rowIndex].lot;
		body.limitDt = $scope.searchBody[rowIndex].limitDt;
		// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットと期限日を追加する  2015.03.27 kyo End
		arr[0] = body;
		// [品質-029] 指示数などに不正な値が入っていると不明エラー発生 2015.02.27 kawana End
		request.data.list = arr;

		api.ShippingInputNoPlan.select(request).then(function(response){
			$scope.searchBody[rowIndex].chargeNum = response.data.list[0].chargeNum;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 預託リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;
//		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//			// 預託
//			angular.forEach($scope.searchBody, function(row) {
//				if ($scope.depositStockTypeList.length == 1) {
//					row.depositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
//				} else {
//					row.depositCd = null;
//				}
//			});
//		}
	};
	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;
//		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//			// 在庫区分
//			angular.forEach($scope.searchBody, function(row) {
//				if ($scope.stockTypeList.length == 1) {
//					row.stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
//				} else {
//					row.stockTypeCd = 'W100';
//				}
//			});
//		}
	};

	// 現在行の各項目への制御処理
	var productManagCurrentRow = function(rowIndex, lotManagFlg, limitDtManagFlg) {
		if (lotManagFlg == "0") {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', false, rowIndex);
			$scope.searchBody[rowIndex].lot = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', true, rowIndex);
		}

		if (limitDtManagFlg == "0") {
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', false, rowIndex);
			$scope.searchBody[rowIndex].limitDt = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', true, rowIndex);
		}
	};

	// [C-CWMS-0021] 届先追加 2015.03.26 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#showZip
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 郵便番号検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された郵便情報を取得し画面項目に反映する。
	 */
	$scope.showZip = function(){

		var items = {
			zipCd: $scope.searchCondition.delivZipCd
		};
		//マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.delivZipCd =  selectedItem.zipCd;
			if((($scope.searchCondition.delivAddress1 == null)||($scope.searchCondition.delivAddress1 == ""))&&(($scope.searchCondition.delivAddress2 == null)||($scope.searchCondition.delivAddress2 == ""))&&(($scope.searchCondition.delivAddress3 == null)||($scope.searchCondition.delivAddress3 == ""))){
				$scope.searchCondition.delivAddress1 =  selectedItem.address1;
				$scope.searchCondition.delivAddress2 =  selectedItem.address2;
				$scope.searchCondition.delivAddress3 =  selectedItem.address3;
			};
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#zipCdBlur
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 郵便番号のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、郵便番号の情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function() {
		// 入力された郵便コードを取得
		var zipCd = $scope.searchCondition.delivZipCd;
		if((($scope.searchCondition.delivAddress1 == null)||($scope.searchCondition.delivAddress1 == ""))&&(($scope.searchCondition.delivAddress2 == null)||($scope.searchCondition.delivAddress2 == ""))&&(($scope.searchCondition.delivAddress3 == null)||($scope.searchCondition.delivAddress3 == ""))){
			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.zip.record(request).then(function(response){
					$scope.searchCondition.delivAddress1 = response.data.mZip.address1;
					$scope.searchCondition.delivAddress2 = response.data.mZip.address2;
					$scope.searchCondition.delivAddress3 = response.data.mZip.address3;
				});

			}
		};
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan#setDelivVisible
	 * @methodOf oneslogiWms.ShippingInputNoPlan.object:ShippingInputNoPlan
	 *
	 * @description
	 * 届先入力欄の表示制御<br>
	 * 引数のワンタイムフラグによって表示・非表示を切り替える
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.setDelivVisible = function(isOnetime) {

		// 届先項目を表示・非表示切替
		directiveControl.show($scope, "delivCustomerNm", isOnetime);
		directiveControl.show($scope, "delivZipCd", isOnetime);
		directiveControl.show($scope, "delivAddress1", isOnetime);
		directiveControl.show($scope, "delivAddress2", isOnetime);
		directiveControl.show($scope, "delivAddress3", isOnetime);
		directiveControl.show($scope, "delivTelNo", isOnetime);

		$scope.isOnetime = isOnetime;
	}
	// [C-CWMS-0021] 届先追加 2015.03.26 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
