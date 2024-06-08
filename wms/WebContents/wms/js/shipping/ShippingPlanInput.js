/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingPlanInput
 *
 * @description 出荷指示入力<br>
 *
 * 出荷指示入力画面。
 *
 */
angular.module('oneslogiWms.ShippingPlanInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingPlanInput.service:shippingPlanInputApi
 *
 * @description 出荷指示入力用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * ・resources/common/centerClass/keyValueList                緊急フラグ、納品時間帯ドロップダウンリスト用データ取得WebAPI<br>
 * ・resources/common/processType/keyValueList                処理区分ドロップダウンリスト用データ取得WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList            預託データ取得WebAPI<br>
 * ・resources/common/warehouseCd/keyValueList                指定倉庫データ取得WebAPI<br>
 * ・resources/common/stockType/keyValueList                  在庫区分データ取得WebAPI<br>
 * ・resources/common/supplierCustomer/record                 納品先データ取得WebAPI<br>
 * ・resources/common/product/record                          商品データ取得WebAPI<br>
 * ・resources/shipping/shippingPlanInput/initNew             新規画面用初期データ取得WebAPI<br>
 * ・resources/shipping/shippingPlanInput/initUpdate          更新画面用初期データ取得WebAPI<br>
 * ・resources/shipping/shippingPlanInput/getStockData        在庫数データ取得WebAPI<br>
 * ・resources/shipping/shippingPlanInput/inputCheckRegister  登録前入力チェックWebAPI<br>
 * ・resources/shipping/shippingPlanInput/register            入力データ登録WebAPI<br>
 * ・resources/shipping/shippingPlanInput/inputCheckUpdate    更新前入力チェックWebAPI<br>
 * ・resources/shipping/shippingPlanInput/update              入力データ更新WebAPI<br>
 */
.factory('shippingPlanInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
		                                     ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		processType: AngularAPIClient.make([
		                                    ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
		                                    ]
		),
		depositCustomer: AngularAPIClient.make([
		                                        ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
		                                        ]
		),
		stockType: AngularAPIClient.make([
		                                  ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
		                                  ]
		),
		deliveryCustomer: AngularAPIClient.make([
		                                         ['record', 'GET', 'resources/common/deliveryCustomer/record']
		                                         ]
		),
		deliveryCourse: AngularAPIClient.make([
		                                       ['record', 'GET', 'resources/common/deliveryCourse/record'],
		                                       ['search', 'GET', 'resources/common/deliveryCourse/search']
		                                       ]
		),
		product: AngularAPIClient.make([
		                                ['record', 'GET', 'resources/common/product/record'],
		                             // [Ver3.0] unit of measure対応 2017.11.29 潘 Start
		                                ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
		                             // [Ver3.0] unit of measure対応 2017.11.29 潘 End
		                                ]
		),
		// [C-CWMS-0021] 届先追加 2015.03.23 kawana Start
		zip: AngularAPIClient.make(
				[
				 	['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		// [C-CWMS-0021] 届先追加 2015.03.23 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
		warehouseCd: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
		shippingPlanInput: AngularAPIClient.make([
		                                          ['initNew',   'GET', 'resources/shipping/shippingPlanInput/initNew'],
		                                          ['initUpdate', 'GET', 'resources/shipping/shippingPlanInput/initUpdate'],
		                                          ['getStockData', 'POST', 'resources/shipping/shippingPlanInput/getStockData'],
		                                          ['inputCheckRegister', 'POST', 'resources/shipping/shippingPlanInput/inputCheckRegister'],
		                                          ['register', 'POST', 'resources/shipping/shippingPlanInput/register'],
		                                          ['inputCheckUpdate', 'POST', 'resources/shipping/shippingPlanInput/inputCheckUpdate'],
		                                          ['update', 'POST', 'resources/shipping/shippingPlanInput/update'],
		                                          ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
 *
 * @description 出荷指示入力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
.controller('ShippingPlanInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'shippingPlanInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){
// [Ver3.0] unit of measure対応 2017.11.29 潘 End
	// グリッドの列情報（デザイン用）
	$scope.ShippingPlanInputCols = [
	                                {field:"lineNo", displayName:"行No."},
	                                {field:"productCd", displayName:"商品CD"},
	                                {field:"mproduct.productNm", displayName:"商品名称"},
	                                {field:"mproduct.productAbbr", displayName:"商品略称"},
	                              //[ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
	                                {field:"mproduct.janCd", displayName:"JANCD"},
	                              //[ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
	                                {field:"instNum", displayName:"指示数"},
	                                {field:"chargeNum", displayName:"引当可能数"},
	                                {field:"lot", displayName:"ロット"},
	                                {field:"limitDt", displayName:"期限日"},
	                                {field:"depositCd", displayName:"預託"},
	                                {field:"stockTypeCd", displayName:"在庫区分"},
	                             // [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kyo Start
	                                {field:"warehouseCd", displayName:"倉庫"},
	                             // [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kyo End
	                                {field:"locationCd", displayName:"ロケーションCD"},
                                    // [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
                                    {field : "unitPrice", displayName : "単価"},
                                    {field : "price", displayName : "金額"},
                                    {field : "tax", displayName : "消費税"},
                                    // [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End
                                    // [#2253]予備項目対応 2017.08.18 sampei Start
                                    {field : "tshippingInstSpareAsOne.spareStr1", displayName : "予備項目１（文字列）"},
                                    {field : "tshippingInstSpareAsOne.spareStr2", displayName : "予備項目２（文字列）"},
                                    {field : "tshippingInstSpareAsOne.spareStr3", displayName : "予備項目３（文字列）"},
                                    {field : "tshippingInstSpareAsOne.spareNum1", displayName : "予備項目１（数値）"},
                                    {field : "tshippingInstSpareAsOne.spareNum2", displayName : "予備項目２（数値）"},
                                    {field : "tshippingInstSpareAsOne.spareNum3", displayName : "予備項目３（数値）"}
                                    // [#2253]予備項目対応 2017.08.18 sampei End

	                                ];

	var oldClient;
	var newDepositList;
	var newStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#initScreen
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.head.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託リスト変更（同期処理）
			$scope.deferredGetDeposit()
			.then(function(response){
				newDepositList = response.data;
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockType()
			.then(function(response){
				newStockTypeList = response.data;
			});

			for (var i = 0; i < $scope.shippingPlanInputList.length; i++) {
				var productCd = $scope.shippingPlanInputList[i].productCd;
				if (productCd != null && productCd !=""){
					//在庫数データ取得
					$scope.productCdBlur(i);
				}
			}

		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.head.mclient.clientCd) {
				// 選択した荷主で取得済みの預託リストを設定
				setDepositList(newDepositList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
				for (var i = 0; i < $scope.shippingPlanInputList.length; i++) {
					var productCd = $scope.shippingPlanInputList[i].productCd;
					if (productCd != null && productCd !=""){
						//在庫数データ取得
						$scope.productCdBlur(i);
					}
				}
			}
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'shippingPlanInputList',
			columnDefs: 'ShippingPlanInputCols'
		});

		// グリッドの商品CD、ロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"productCd":{
					clickFunction:"showProduct(row.rowIndex)"
				},
				"locationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
		};

		// グリッド列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"productCd":{
					// [ON推-品向-288] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
					"ng-blur":{
						eventFunction:"productCdBlur(row.rowIndex)"
					}
				},
				// [#1712] 未使用の処理を削除 (指示数のロストフォーカス処理) 2017.04.26 kawana
				"lot":{
					// [ON推-品向-288] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
					"ng-blur":{
						eventFunction:"lotBlur(row.rowIndex)"
					}
				},
				"limitDt":{
					// [ON推-品向-288] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
					"ng-blur":{
						eventFunction:"limitDtBlur(row.rowIndex)"
					}
				},
				"depositCd":{
					// [ON推-品向-288] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
					"ng-blur":{
						eventFunction:"depositCdBlur(row.rowIndex)"
					}
				},
				"stockTypeCd":{
					// [ON推-品向-288] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
					"ng-blur":{
						eventFunction:"stockTypeCdBlur(row.rowIndex)"
					}
				},
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
				"warehouseCd":{
					"ng-blur":{
						eventFunction:"warehouseCdBlur(row.rowIndex)"
					}
				},
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End
				"locationCd":{
					// [ON推-品向-288] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
					"ng-blur":{
						eventFunction:"locationCdBlur(row.rowIndex)"
					}
				}
		};

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"depositCd" : {
					key : "mCustomer.customerCd",
					value : "mCustomer.customerNm",
					listModel : "depositList"
				},
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
				"warehouseCd" : {
					key : "warehouseCd",
					value : "warehouseNm",
					listModel : "warehouseList"
				},
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
				"stockTypeCd" : {
					key : "stockTypeCd",
					value : "stockTypeNm",
					listModel : "stockTypeList"
				}
		};

		// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
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
					listModel : "shippingPlanInputList.mproduct.mproductShapeList"
				}
		};
		// グリッド複数荷姿用各種オプション
		$scope.gridMultiTextOptions = [];
		// [Ver3.0] unit of measure対応 2017.11.29 潘 End

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "productCd", 8, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "locationCd", 8, 7);
		statusInfo.mappingErrorMessage($scope, "supplyCustomerCd", 8, 5);
		// [C-CWMS-0021] 届先追加 2015.03.23 kawana Start
		statusInfo.mappingErrorMessage($scope, "delivAddress1", 8, 13);
		// [C-CWMS-0021] 届先追加 2015.03.23 kawana End
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "warehouseCd", 8, 14);
		// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
		// [品質-102-011] 配送コースCDを追加 2015.04.07 kawana Start
		statusInfo.mappingErrorMessage($scope, "deliveryCourseCd", 8, 12);
		// [品質-102-011] 配送コースCDを追加 2015.04.07 kawana End
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.27 koyama Start
		statusInfo.mappingErrorMessage($scope, "delivCustomerCd", 8, 15);
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.27 koyama End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#initScreenHttp
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 画面初期化用の通信制御処理<br>
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
				 $scope.deferredGetEmergencyFlg(),//緊急フラグ
				 $scope.deferredGetDelivTz(),//納品時間帯
				 $scope.deferredGetProcessType(),//処理区分
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
				 $scope.deferredGetWarehouseCd()//指定倉庫CD
				 // [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetEmergencyFlg
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 緊急フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergencyFlg = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "EMERGENCY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.emergencyList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetDelivTz
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 納品時間帯取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelivTz = function () {
		var deferred = $q.defer();
		var request = {};
		request.classCd = "DELIV_TZ";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.delivTzList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetProcessType
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
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
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetDeposit
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDeposit = function () {

		var deferred = $q.defer();
		var request = {};
		request.data = {};
		request.clientCd = $scope.head.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.24 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseCd();
	};
	//荷主センタ変更対応 201７.02.24 sja End
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetWarehouseCd
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 倉庫取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCd = function () {

		var deferred = $q.defer();
		var request = {};
		request.data = {};
		//荷主センタ変更対応 201７.02.24 sja Start
		//request.centerId = userInfo.centerId;
		if ($scope.head) {
			request.centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}
		//荷主センタ変更対応 201７.02.24 sja End
		owsCommon.getDataCacheable(api.warehouseCd, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
			//deferred.resolve(response);
		});
		return deferred.promise;
	};
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetStockType
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockType = function () {

		var deferred = $q.defer();
		var request = {};
		request.data = {};
		request.clientCd = $scope.head.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetStockData
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 在庫数データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockData = function (rowIndex) {

		var deferred = $q.defer();
		var request = {};
		var arr = new Array();

		request.data = {};
		request.data.head = $scope.head;

		var instNum = $scope.shippingPlanInputList[rowIndex].instNum;
		// [品質-029] 指示数などに不正な値が入っていると不明エラー発生 2015.02.27 kawana Start

		// [ON推-品向-476] 指示数に0が自動的に設定されないため、削除 2014.12.26 許

		var body = {};
		body.productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		body.locationCd = $scope.shippingPlanInputList[rowIndex].locationCd;
		body.stockTypeCd = $scope.shippingPlanInputList[rowIndex].stockTypeCd;
		body.depositCd = $scope.shippingPlanInputList[rowIndex].depositCd;
		// [C-CWMS-0020] 指定倉庫を追加 2015.03.26 kyo Start
		body.warehouseCd = $scope.shippingPlanInputList[rowIndex].warehouseCd;
		// [C-CWMS-0020] 指定倉庫を追加 2015.03.26 kyo End
		// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットと期限日を追加する  2015.03.27 kyo Start
		body.lot = $scope.shippingPlanInputList[rowIndex].lot;
		body.limitDt = $scope.shippingPlanInputList[rowIndex].limitDt;
		// [EC-CT1-137] 引当可能数の絞り込みにロットと期限日が効いてないために、ロットと期限日を追加する  2015.03.27 kyo End
		arr[0] = body;
		// [品質-029] 指示数などに不正な値が入っていると不明エラー発生 2015.02.27 kawana End

		request.data.body = arr;

		api.shippingPlanInput.getStockData(request).then(function(response){
			// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto Start
			$scope.shippingPlanInputList[rowIndex].chargeNum = +response;
			// [ON推-CT4-255] 戻り値の型をエラー時に取り扱える型に変更 2014.12.02 ko-yamamoto End
			$scope.shippingPlanInputList[rowIndex].instNum = instNum;
			//deferred.resolve();
		});

		return deferred.promise;
	};

	// 預託リスト再設定処理
	var setDepositList = function(list, clearSelected) {
		$scope.depositList = list;
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;
	};

	$scope.productCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.instNumChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.lotChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.limitDtChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.depositCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.stockTypeCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.locationCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#processTypeCdChange
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 処理区分のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.processTypeCdChange = function() {
		for (var row = 0; row < $scope.shippingPlanInputList.length; row++) {
			$scope.productCdBlur(row);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.supplyCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.head.supplyCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.customerCd = deliveryCd;

			// 納品先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				$scope.head.supplyCustomerNm = response.data.mCustomer.customerNm;

				// [C-CWMS-0052] 届先入力追加に伴い、ワンタイム設定と配送コード設定を削除 2015.11.18 koyama

				// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama Start
				//[ON推-品質問題点指摘票(新ｿﾘV2-058)] 修正対応 2016.08.15 chou Mod Start
				if(($scope.head.delivCustomerCd == null || $scope.head.delivCustomerCd == "") && response.data.mCustomer.customerNm != null){
				//[ON推-品質問題点指摘票(新ｿﾘV2-058)] 修正対応 2016.08.15 chou Mod End
					$scope.head.delivCustomerCd = $scope.head.supplyCustomerCd;
					$scope.delivCustomerCdBlur();
				}
				// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama End
			});

		} else {
			$scope.head.supplyCustomerNm = null;

			// [C-CWMS-0052] 届先入力追加に伴い、ワンタイム判定処理を削除 2015.12.10 koyama
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#showSupplyCustomer
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を画面項目に反映する。
	 */
	$scope.showSupplyCustomer = function(){
		var items = {
				// 取引先マスタ
				clientCd: $scope.head.mclient.clientCd,
				deliveryCd: $scope.head.supplyCustomerCd
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.head.supplyCustomerCd = selectedItem.customerCd;
			$scope.head.supplyCustomerNm = selectedItem.customerNm;

			// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama Start
			if($scope.head.delivCustomerCd == null || $scope.head.delivCustomerCd == ""){
				$scope.head.delivCustomerCd = $scope.head.supplyCustomerCd;
				$scope.delivCustomerCdBlur();
			}
			// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama End

			// [C-CWMS-0052] 届先入力追加に伴い、配送コード設定を削除 2015.11.18 koyama

		});
	};

	// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.27 koyama Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#supplyCustomerCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 届先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、届先情報を取得し画面項目に反映する。
	 */
	$scope.delivCustomerCdBlur = function() {
		// 入力された仕入先コードを取得
		var deliveryCd = $scope.head.delivCustomerCd;

		if(deliveryCd && 0 < deliveryCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.customerCd = deliveryCd;

			// 届先情報の取得
			api.deliveryCustomer.record(request).then(function(response){

				// [ON推-CT113-001] 届先CDロストフォーカス時、届先名称の設定を修正 2015.12.17 koyama Start
				// ワンタイムフラグにそって届先名称を設定
				if(response.data.mCustomer.onetimeFlg == "1"){
					if($scope.head.delivCustomerNm == null || $scope.head.delivCustomerNm == ""){
						$scope.head.delivCustomerNm = response.data.mCustomer.customerNm;
					}
				}else{
					$scope.head.delivCustomerNm = response.data.mCustomer.customerNm;
				}
				// [ON推-CT113-001] 届先CDロストフォーカス時、届先名称の設定を修正 2015.12.17 koyama End

				// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama Start
				if($scope.head.supplyCustomerCd == null || $scope.head.supplyCustomerCd == ""){
					$scope.head.supplyCustomerCd = $scope.head.delivCustomerCd;
					$scope.supplyCustomerCdBlur();
				}
				// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama End

				// ワンタイムフラグにそって届先欄を表示・非表示
				var isOnetime = false;
				if(response.data.mCustomer.onetimeFlg == "1"){
					isOnetime = true;
				}
				$scope.setDelivVisible(isOnetime);

				var request1 = {};
				request1.centerId = userInfo.centerId;
				request1.customerId = response.data.mCustomer.customerId;

				if ($scope.head.deliveryCourseCd == null || $scope.head.deliveryCourseCd==""){
					// 配送コース情報の取得
					api.deliveryCourse.search(request1).then(function(response){
						if (response.data.mDeliveryCourse.deliveryCourseCd != null){
							$scope.head.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
							$scope.deliveryCourseCdBlur();
						}
					});
				}
			});
		} else {
			$scope.head.delivCustomerNm = null;

			// 届先欄を非表示
			$scope.setDelivVisible(false);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#showSupplyCustomer
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 届先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された届先情報を画面項目に反映する。
	 */
	$scope.showDelivCustomer = function(){
		var items = {
				// 取引先マスタ
				clientCd: $scope.head.mclient.clientCd,
				deliveryCd: $scope.head.delivCustomerCd
		};

		// 届先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 届先マスタ
			$scope.head.delivCustomerCd = selectedItem.customerCd;

			// [ON推-CT113-001] 届先CD検索ボタン押下時、届先名称の設定を修正 2015.12.17 koyama Start
			// ワンタイムフラグにそって届先名称を設定
			if(selectedItem.onetimeFlg == "1"){
				if($scope.head.delivCustomerNm == null || $scope.head.delivCustomerNm == ""){
					$scope.head.delivCustomerNm = selectedItem.customerNm;
				}
			}else{
				$scope.head.delivCustomerNm = selectedItem.customerNm;
			}
			// [ON推-CT113-001] 届先CD検索ボタン押下時、届先名称の設定を修正 2015.12.17 koyama End

			// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama Start
			if($scope.head.supplyCustomerCd == null || $scope.head.supplyCustomerCd == ""){
				$scope.head.supplyCustomerCd = $scope.head.delivCustomerCd;
				$scope.supplyCustomerCdBlur();
			}
			// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.12.02 koyama End

			var request = {};
			request.centerId = userInfo.centerId;
			request.customerId = selectedItem.customerId;

			if ($scope.head.deliveryCourseCd == null || $scope.head.deliveryCourseCd==""){
				// 配送コース情報の取得
				api.deliveryCourse.search(request).then(function(response){
					if (response.data.mDeliveryCourse.deliveryCourseCd != null){
						$scope.head.deliveryCourseCd = response.data.mDeliveryCourse.deliveryCourseCd;
						$scope.deliveryCourseCdBlur();
					}
				});
			}
		});
	};
	// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.27 koyama End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#showDeliveryCourse
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showDeliveryCourse = function(){
		var items = {
				// 配送コードマスタ
				centerCd: $scope.head.mcenter.centerCd,
				deliveryCourseCd: $scope.head.deliveryCourseCd
		};

		// 配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.head.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.head.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 配送コースCDのロストフォーカス処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function(){
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.head.deliveryCourseCd;

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.head.mcenter.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
			request.deliveryCourseCd = deliveryCourseCd;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.head.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});
		} else {
			$scope.head.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#showProduct
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 商品CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex){
		var items = {
				// 商品マスタ
				clientCd: $scope.head.mclient.clientCd,
				productCd: $scope.shippingPlanInputList[rowIndex].productCd
		};

		// 商品CD
		var modalProduct = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalProduct.result.then(function(selectedItem){
			// 商品マスタ
			$scope.shippingPlanInputList[rowIndex].productCd = selectedItem.productCd;
			$scope.shippingPlanInputList[rowIndex].mproduct.productNm = selectedItem.productNm;
			$scope.shippingPlanInputList[rowIndex].mproduct.productAbbr = selectedItem.productAbbr;
			$scope.shippingPlanInputList[rowIndex].mproduct.janCd = selectedItem.janCd;
			$scope.shippingPlanInputList[rowIndex].lotManagFlg = selectedItem.lotManagFlg;
			$scope.shippingPlanInputList[rowIndex].limitDtManagFlg = selectedItem.limitDtManagFlg;
			//	$scope.shippingPlanInputList[rowIndex].stockTypeCd = owsCommon.getDefaultValue($scope.stockTypeList,'stockTypeCd');

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex, selectedItem.lotManagFlg, selectedItem.limitDtManagFlg);
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#productBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;

		// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.productCd = productCd;

			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			api.product.productShape(request).then(function(response){
				if (response.data.mProduct.productId == null){
					gridOptionMessageControl.show($scope.gridOptions, "productCd", $filter('owfMessage')("productNotFoundError"), rowIndex);
					$scope.shippingPlanInputList[rowIndex].mproduct.productNm = null;
					$scope.shippingPlanInputList[rowIndex].mproduct.productAbbr = null;
					$scope.shippingPlanInputList[rowIndex].mproduct.janCd = null;
					$scope.shippingPlanInputList[rowIndex].chargeNum = null;
					//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
					$scope.shippingPlanInputList[rowIndex].mproduct.productId = response.data.mProduct.productId;
					$scope.shippingPlanInputList[rowIndex].mproduct.mproductShapeList = response.data.mProduct.mproductShapeList;
					// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
					gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					// 商品CDBlur時の小数有無チェック共通処理
					gridMultiTextControl.checkDecimalInput($scope, $scope.shippingPlanInputList[rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', rowIndex);
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
					$scope.shippingPlanInputList[rowIndex].unitNumBreakdown = null;
					//[Ver3.0] unit of measure対応 2018.1.21 ライ End
					// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana

					$scope.shippingPlanInputList[rowIndex].lotManagFlg = '0';
					$scope.shippingPlanInputList[rowIndex].limitDtManagFlg = '0';

					// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana

					// 商品の在庫関連情報の入力可否制御
					productManagCurrentRow(rowIndex,'0', '0');
					return;
				}
				// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
				// 該当行の入数内訳取得
				$scope.shippingPlanInputList[rowIndex].unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);
				// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
				$scope.shippingPlanInputList[rowIndex].mproduct.productId = response.data.mProduct.productId;
				$scope.shippingPlanInputList[rowIndex].mproduct.mproductShapeList = response.data.mProduct.mproductShapeList;
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.shippingPlanInputList[rowIndex].instNum, 'gridMultiTextOptions', 'instNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				// 商品CDBlur時の小数有無チェック共通処理
				gridMultiTextControl.checkDecimalInput($scope, $scope.shippingPlanInputList[rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
				// [Ver3.0] unit of measure対応 2017.11.29 潘 End
				// [ON推-品向-383] 商品CD欄でLostFocusするとテキストボックスが赤くなるが、エラーメッセージは表示されない。 2014.12.02 KI Start
				gridOptionMessageControl.hide($scope.gridOptions,"productCd",rowIndex);
				// [ON推-品向-383] 商品CD欄でLostFocusするとテキストボックスが赤くなるが、エラーメッセージは表示されない。 2014.12.02 KI End
				$scope.shippingPlanInputList[rowIndex].mproduct.productNm = response.data.mProduct.productNm;
				$scope.shippingPlanInputList[rowIndex].mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.shippingPlanInputList[rowIndex].mproduct.janCd = response.data.mProduct.janCd;
				$scope.shippingPlanInputList[rowIndex].lotManagFlg = response.data.mProduct.lotManagFlg;
				$scope.shippingPlanInputList[rowIndex].limitDtManagFlg = response.data.mProduct.limitDtManagFlg;

				// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana

				// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana Start
				var stockTypeCd = $scope.shippingPlanInputList[rowIndex].stockTypeCd;
				if(!stockTypeCd || 0 == stockTypeCd.length){

					stockTypeCd = "";
					var processTypeCd = $scope.head.mprocessType.processTypeCd;
					for (var i = 0; i < $scope.processTypeList.length; i++) {
						if($scope.processTypeList[i].processTypeCd == processTypeCd){
							stockTypeCd = $scope.processTypeList[i].stockTypeCd;
							break;
						}
					}

					$scope.shippingPlanInputList[rowIndex].stockTypeCd = stockTypeCd;
				}
				// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana End

				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
				if ($scope.warehouseList.length == 1) {
					$scope.shippingPlanInputList[rowIndex].warehouseCd = $scope.warehouseList[0].warehouseCd;
				}
				// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End
				if ($scope.depositList.length == 1) {
					$scope.shippingPlanInputList[rowIndex].depositCd = $scope.depositList[0].mCustomer.customerCd;
				}
				if ($scope.stockTypeList.length == 1) {
					$scope.shippingPlanInputList[rowIndex].stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
				}

				// [EC-CT1-150] 不要な処理削除 2015.04.06 kawana

				// 商品の在庫関連情報の入力可否制御
				productManagCurrentRow(rowIndex, response.data.mProduct.lotManagFlg, response.data.mProduct.limitDtManagFlg);

				//在庫数データ取得
				$scope.deferredGetStockData(rowIndex);
			});
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		} else {
			//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			$scope.shippingPlanInputList[rowIndex].mproduct.productId = null;
			// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', null, null, rowIndex);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			// 商品CDBlur時の小数有無チェック共通処理
			gridMultiTextControl.checkDecimalInput($scope, $scope.shippingPlanInputList[rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', rowIndex);
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			$scope.shippingPlanInputList[rowIndex].unitNumBreakdown = null;
			//[Ver3.0] unit of measure対応 2018.1.21 ライ End
			$scope.shippingPlanInputList[rowIndex].mproduct.productNm = null;
			$scope.shippingPlanInputList[rowIndex].mproduct.productAbbr = null;
			$scope.shippingPlanInputList[rowIndex].mproduct.janCd = null;

			// [EC-CT1-150] 預託などはクリアしない(クリア処理を削除) 2015.04.06 kawana

			$scope.shippingPlanInputList[rowIndex].chargeNum = null;
			$scope.shippingPlanInputList[rowIndex].lotManagFlg = '0';
			$scope.shippingPlanInputList[rowIndex].limitDtManagFlg = '0';

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex,'0', '0');
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#showLocation
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(rowIndex){

		var items = {
				centerCd: $scope.head.mcenter.centerCd,
				locationCd: $scope.shippingPlanInputList[rowIndex].locationCd,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.shippingPlanInputList[rowIndex].warehouseCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.shippingPlanInputList[rowIndex].locationCd = selectedItem.locationCd;
			var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
			if (productCd != null && productCd !=""){
				//在庫数データ取得
				//$scope.deferredGetStockData(rowIndex);
				$scope.productCdBlur(rowIndex);
			}
		});
	};

	// [#1712] 未使用の処理を削除 (指示数のロストフォーカス処理) 2017.04.26 kawana

	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#warehouseCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 指定倉庫のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.warehouseCdBlur = function(rowIndex) {
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		if (productCd != null && productCd !=""){
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana Start
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana End
		}

	};
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.26 kyo End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#locationCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(rowIndex) {
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		if (productCd != null && productCd !=""){
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana Start
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana End
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#lotBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * ロットのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.lotBlur = function(rowIndex) {
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		if (productCd != null && productCd !=""){
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana Start
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#limitDtBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 期限日のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.limitDtBlur = function(rowIndex) {
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		if (productCd != null && productCd !=""){
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana Start
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#stockTypeCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 在庫区分のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.stockTypeCdBlur = function(rowIndex) {
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		if (productCd != null && productCd !=""){
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana Start
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#depositCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 預託のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、在庫数を取得し画面項目に反映する。
	 */
	$scope.depositCdBlur = function(rowIndex) {
		var productCd = $scope.shippingPlanInputList[rowIndex].productCd;
		if (productCd != null && productCd !=""){
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana Start
			//在庫数データ取得
			$scope.deferredGetStockData(rowIndex);
			// [#1712] 預託、在庫区分、倉庫を未選択にしても勝手に設定されてしまう問題を修正 2017.04.26 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description 出荷指示入力データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

			// 訂正
			var request = {};
			request.shippingInstHId = $route.current.params.shippingInstHId;

			api.shippingPlanInput.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// [#1823] 指示修正でセンタ、荷主を変更するとWMS伝票No.が重複してしまう 2017.05.24 kawana Start

				// 更新時はセンタ・荷主変更不可
				directiveControl.editable($scope, 'centerCd', false);
				directiveControl.editable($scope, 'clientCd', false);

				// [#1823] 指示修正でセンタ、荷主を変更するとWMS伝票No.が重複してしまう 2017.05.24 kawana End

				$scope.head = response.data.head;
				$scope.shippingPlanInputList = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				$scope.head.mcenter.centerCd = response.data.head.mcenter.centerCd;
				$scope.head.mclient.clientCd = response.data.head.mclient.clientCd;

				$scope.deliveryCourseCdBlur();
				// 行番号振り直し
				updateRowNumber($scope.receivePlanB);

				// 荷主変更後処理
				$scope.changeClient(false);
				//荷主センタ変更対応 2017.03.06 sja Start
				$scope.deferredGetWarehouseCd();
				//荷主センタ変更対応 2017.03.06 sja End
				// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
				// grid複数荷姿用各種オプション変数への検索データ件数分設定共通処理
				gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, response.data.body.length);
				// [Ver3.0] unit of measure対応 2017.11.29 潘 End
				// 商品の在庫関連情報の入力可否制御（Model,View同期後に実行）
				owsCommon.syncExec(function() {
					for (var i = 0; i < $scope.shippingPlanInputList.length; i++) {
						productManagCurrentRow(i, response.data.body[i].mproduct.lotManagFlg, response.data.body[i].mproduct.limitDtManagFlg);
						// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
						// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
						gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', response.data.body[i].mproduct.productId, response.data.body[i].mproduct.mproductShapeList, i);
						// 該当行の荷姿補助内訳数取得
						owsCommon.getGridCalcAuxiliaryBreakdown($scope,response.data.body[i].instNum, 'gridMultiTextOptions', 'instNum', i);
						// [Ver3.0] unit of measure対応 2017.11.29 潘 End
					}
				});

				// [C-CWMS-0021] 届先追加 2015.03.23 kawana Start
				// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.27 koyama Start
				var requestCustomer = {};
				requestCustomer.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
				requestCustomer.customerCd = $scope.head.delivCustomerCd;
				// 届先情報の取得
				api.deliveryCustomer.record(requestCustomer).then(function(responseCustomer){

					if(responseCustomer.data.mCustomer.onetimeFlg == "1"){
						$scope.setDelivVisible(true);
					} else {
						$scope.setDelivVisible(false);
						// 届先を空に設定(再表示したときに納品先が表示されてしまうため)
						// [ON推-CT113-002] 修正モードで画面遷移時の届先名称の設定を修正 2015.12.17 koyama Start
//						$scope.head.delivCustomerNm="";
						// [ON推-CT113-002] 修正モードで画面遷移時の届先名称の設定を修正 2015.12.17 koyama End
						$scope.head.delivZipCd="";
						$scope.head.delivAddress1="";
						$scope.head.delivAddress2="";
						$scope.head.delivAddress3="";
						// [ON推-品向-852] 納品先がワンタイムではない場合に届先住所補足を空に設定していた処理を削除 2015.07.06 kawana
						$scope.head.delivTelNo="";
					}
				});
				// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.27 koyama End
				// [C-CWMS-0021] 届先追加 2015.03.23 kawana End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});
		} else {

			// 新規
			api.shippingPlanInput.initNew().then(function(response){
				$scope.head = response.data.head;
				$scope.shippingPlanInputList = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;


				// ログイン情報より初期値を設定
				$scope.head.mcenter.centerCd = userInfo.centerCd;
				$scope.head.mclient.clientCd = userInfo.clientCd;
				$scope.head.emergencyFlg = owsCommon.getDefaultValue($scope.emergencyList);
				$scope.head.mprocessType.processTypeCd = owsCommon.getDefaultValue($scope.processTypeList,'processTypeCd');
				//荷主センタ変更対応 2017.03.06 sja Start
				$scope.deferredGetWarehouseCd();
				//荷主センタ変更対応 2017.03.06 sja End
				// [C-NIS-0009] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
				if (response.data.delivPlanDtDefFlg == 1) {
					$scope.head.delivPlanDt = userInfo.systemDt;
				}
				if (response.data.workDtDefFlg == 1) {
					$scope.head.workDt = userInfo.systemDt;
				}
				if (response.data.shippingDtDefFlg == 1) {
					$scope.head.shippingDt = userInfo.systemDt;
				}
				// [C-NIS-0009] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End

				//空行を生成
				for (var i = 0; i < getInitRowNum(); i++) {
					$scope.addRow();
				}

				var stockTypeCd = "";
				var processTypeCd = $scope.head.mprocessType.processTypeCd;
				// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
				// [Ver3.0] unit of measure対応 2017.11.29 潘 End
				for (var i = 0; i < $scope.processTypeList.length; i++) {
					if($scope.processTypeList[i].processTypeCd == processTypeCd){
						stockTypeCd = $scope.processTypeList[i].stockTypeCd;
						break;
					}
					// [Ver3.0] unit of measure対応 2017.11.29 潘 Start
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
					// [Ver3.0] unit of measure対応 2017.11.29 潘 End
				}

				// 荷主変更後処理
				$scope.changeClient(true);

				// 商品の在庫関連情報の入力可否制御（Model,View同期後に実行）
				owsCommon.syncExec(function() {
					for (var i = 0; i < $scope.shippingPlanInputList.length; i++) {
						productManagCurrentRow(i, '0', '0');
						$scope.shippingPlanInputList[i].stockTypeCd = stockTypeCd;
					}
				});

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#changeClient
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託リスト変更（同期処理）
		$scope.deferredGetDeposit()
		.then(function(response){
			setDepositList(response.data, clearSelected);
		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockType()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});

		if (clearSelected){
			for (var i = 0; i < $scope.shippingPlanInputList.length; i++) {
				var productCd = $scope.shippingPlanInputList[i].productCd;
				if (productCd != null && productCd !=""){
					//在庫数データ取得
					$scope.productCdBlur(i);
				}
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#addRow
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.shippingPlanInputList.push(angular.copy($scope.blankRow));

		// 行番号振り直し
		updateRowNumber($scope.shippingPlanInputList);
		var stockTypeCd = "";
		var processTypeCd = $scope.head.mprocessType.processTypeCd;
		for (var i = 0; i < $scope.processTypeList.length; i++) {
			if($scope.processTypeList[i].processTypeCd == processTypeCd){
				stockTypeCd = $scope.processTypeList[i].stockTypeCd;
				break;
			}
		}
		$scope.shippingPlanInputList[$scope.shippingPlanInputList.length-1].stockTypeCd = stockTypeCd;

		// [ON推-品向-234] 非活性変更 2014.11.21 wangzs Start
		productManagCurrentRow($scope.shippingPlanInputList.length-1, '0', '0');
		// [ON推-品向-234] 非活性変更 2014.11.21 wangzs End
		// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod Start
		// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
		gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod End
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
		var row = $scope.shippingPlanInputList.length - 1;
		owsCommon.syncExec(function() {
			// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', $scope.shippingPlanInputList[row].mproduct.productId, $scope.shippingPlanInputList[row].mproduct.mproductShapeList, row);
		});
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add end
		// [Ver3.0] unit of measure対応 2017.12.4 潘 End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#removeRow
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
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
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [横並-053] チェック順変更 2014.11.20 zhouj Start

		// 入力済の場合に警告
		var stockTypeCd = "";
		var processTypeCd = $scope.head.mprocessType.processTypeCd;
		for (var i = 0; i < $scope.processTypeList.length; i++) {
			if($scope.processTypeList[i].processTypeCd == processTypeCd){
				stockTypeCd = $scope.processTypeList[i].stockTypeCd;
				break;
			}
		}
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){

			// [品質-028] 何も入力していない行を削除時、「入力済です。～」のメッセージが出力される現象を解消するため、修正する 2015.02.27 kyo Start
			// [EC-CT1-056] 処理の効率化 2015.02.23 kawana Start
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].productCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].productCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].instNum != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].instNum != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].depositCd != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].depositCd!= null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].stockTypeCd != ""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].stockTypeCd != null
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].stockTypeCd !=stockTypeCd)
							// [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kyo Start
							||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseCd !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseCd!= null)
							// [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kyo End
								||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationCd !=""
									&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].locationCd!= null)
									||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].lot !=""
										&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].lot!= null)
										||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].limitDt !=""
											&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].limitDt!= null))
			{
			// [EC-CT1-056] 処理の効率化 2015.02.23 kawana End
		    // [品質-028] 何も入力していない行を削除時、「入力済です。～」のメッセージが出力される現象を解消するため、修正する 2015.02.27 kyo End
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
			if ($scope.shippingPlanInputList.indexOf(row) > -1) {
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod Start
				var targetIndex = $scope.shippingPlanInputList.indexOf(row);
				$scope.shippingPlanInputList.splice(targetIndex, 1);
				// grid複数荷姿用各種オプション変数への行削除件数分設定共通処理
				gridMultiTextControl.removeMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, targetIndex);
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod End
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.shippingPlanInputList);

		// [ON推-品向-583] 明細 ヘッダー行の選択 2015.05.20 ki Start
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細 ヘッダー行の選択 2015.05.20 ki End

		// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Delete
		for (var row = 0; row < $scope.shippingPlanInputList.length; row++) {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'instNum',$scope.shippingPlanInputList[row].mproduct.productId, $scope.shippingPlanInputList[row].mproduct.mproductShapeList, row);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// 該当行の荷姿補助内訳数取得
			owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.shippingPlanInputList[row].instNum, 'gridMultiTextOptions', 'instNum', row);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.12.4 潘 End
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	// 現在行の各項目への制御処理
	var productManagCurrentRow = function(rowIndex, lotManagFlg, limitDtManagFlg) {
		// [Ver3.1][#5881]商品マスタ未存在の場合、ロットと期限日を非活性にする 2019.01.11 matsumoto Start
		if (lotManagFlg == "0" || lotManagFlg == null) {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', false, rowIndex);
			$scope.shippingPlanInputList[rowIndex].lot = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', true, rowIndex);
		}

		if (limitDtManagFlg == "0" || limitDtManagFlg == null) {
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', false, rowIndex);
			$scope.shippingPlanInputList[rowIndex].limitDt = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', true, rowIndex);
		}
		// [Ver3.1][#5881]商品マスタ未存在の場合、ロットと期限日を非活性にする 2019.01.11 matsumoto End
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
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#register
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
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

		// [EC-CT1-056] 処理の効率化 2015.02.23 kawana Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [EC-CT1-056] 処理の効率化 2015.02.23 kawana End

		// 空行判定
		for (var row = 0; row < $scope.shippingPlanInputList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {

				// [EC-CT1-056] 処理の効率化(空行検証機能の解除の位置移動) 2015.02.23 kawana

				// 空行を退避
				emptyBody.push($scope.shippingPlanInputList[row]);
			} else {
				var stockTypeCd = "";
				var processTypeCd = $scope.head.mprocessType.processTypeCd;
				for (var i = 0; i < $scope.processTypeList.length; i++) {
					if($scope.processTypeList[i].processTypeCd == processTypeCd){
						stockTypeCd = $scope.processTypeList[i].stockTypeCd;
						break;
					}
				}
				if(($scope.shippingPlanInputList[row].productCd != ""
					&&$scope.shippingPlanInputList[row].productCd != null)
					||($scope.shippingPlanInputList[row].instNum != ""
						&&$scope.shippingPlanInputList[row].instNum != null)
						||($scope.shippingPlanInputList[row].depositCd != ""
							&&$scope.shippingPlanInputList[row].depositCd!= null)
							||($scope.shippingPlanInputList[row].stockTypeCd != stockTypeCd)
								// [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kyo Start
								||($scope.shippingPlanInputList[row].warehouseCd !=""
								&&$scope.shippingPlanInputList[row].warehouseCd!= null)
								// [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kyo End
									||($scope.shippingPlanInputList[row].locationCd !=""
										&&$scope.shippingPlanInputList[row].locationCd!= null)
										||($scope.shippingPlanInputList[row].lot !=""
											&&$scope.shippingPlanInputList[row].lot!= null)
											||($scope.shippingPlanInputList[row].limitDt !=""
												&&$scope.shippingPlanInputList[row].limitDt!= null)
												// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
												|| ($scope.shippingPlanInputList[row].unitPrice !=""
													&&$scope.shippingPlanInputList[row].unitPrice!= null)
													|| ($scope.shippingPlanInputList[row].price !=""
														&&$scope.shippingPlanInputList[row].price!= null)
														|| ($scope.shippingPlanInputList[row].tax !=""
															&&$scope.shippingPlanInputList[row].tax!= null)
												// [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
															// [#2253]予備項目対応 2017.08.18 sampei Start
															|| ($scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareStr1 !=""
																&&$scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareStr1!= null)
																|| ($scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareStr2 !=""
																	&&$scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareStr2!= null)
																	|| ($scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareStr3 !=""
																		&&$scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareStr3!= null)
																		|| ($scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareNum1 !=""
																			&&$scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareNum1!= null)
																			|| ($scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareNum2 !=""
																				&&$scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareNum2!= null)
																				|| ($scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareNum3 !=""
																					&&$scope.shippingPlanInputList[row].tshippingInstSpareAsOne.spareNum3!= null)
															// [#2253]予備項目対応 2017.08.18 sampei Start
				){
					// 空行以外を退避
					listBody.push($scope.shippingPlanInputList[row]);
				} else {
					// 空行扱い

					// 検証機能を解除
					gridDirectiveControl.validity($scope.gridOptions, false, row);
					// 空行を退避
					emptyBody.push($scope.shippingPlanInputList[row]);
				}
			}
		}

		// [EC-CT1-055][EC-CT1-056] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.02.23 kawana Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [C-EC-018] 更新モードでも明細行なしはエラーにする 2015.02.04 kawana Start
				if (listBody.length == 0) {
					// 入力データ無し

					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}
				// [C-EC-018] 更新モードでも明細行なしはエラーにする 2015.02.04 kawana End

				var delivPlanDt = $scope.head.delivPlanDt;
				var workDt = $scope.head.workDt;
				var shippingDt = $scope.head.shippingDt;
				var delivDt = $scope.head.delivDt;

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

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod Start
					var targetIndex = $scope.shippingPlanInputList.indexOf(row);
					$scope.shippingPlanInputList.splice(targetIndex, 1);
					$scope.gridMultiTextOptions.splice(targetIndex, 1);
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod End
				});

				// 行番号振り直し
				updateRowNumber($scope.shippingPlanInputList);

				//[C-CWMS-0037] 重複チェックいらないので削除 2015.08.05 Nay Zaw

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定
					checkFunc = api.shippingPlanInput.inputCheckUpdate;
					execFunc = api.shippingPlanInput.update;

					successFunc = function(response){
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					}

				} else {
					// 新規登録関数を設定
					checkFunc = api.shippingPlanInput.inputCheckRegister;
					execFunc = api.shippingPlanInput.register;

					successFunc = function(response){
						// 初期化
						$scope.initScreenHttp();
					}

				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.body = listBody;

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					// [品質-102-011] 修正に伴い不要なコードを削除 2015.04.07 kawana

					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							if (checkResponse.status.listStatus[i].status.subStatusCode == 16) {
								// 小数有無チェック共通処理
								gridMultiTextControl.checkDecimalInput($scope, $scope.shippingPlanInputList[checkResponse.status.listStatus[i].status.rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラー箇所までスクロール
								gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラーにフォーカス
								directiveControl.firstErrorOnFocus('inputform');
								return;
							}
						}
					}
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// 入荷予定データ登録または更新
					execFunc(request).then(function(execResponse){

						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
						if (execResponse.status.listStatus != null){
							for (var i = 0 ;i <execResponse.status.listStatus.length;i++){
								if (execResponse.status.listStatus[i].status.subStatusCode == 16) {
									// 小数有無チェック共通処理
									gridMultiTextControl.checkDecimalInput($scope, $scope.shippingPlanInputList[execResponse.status.listStatus[i].status.rowIndex].instNum, $scope.gridOptions, 'gridMultiTextOptions', 'instNum', execResponse.status.listStatus[i].status.rowIndex);
									// 最初のエラー箇所までスクロール
									gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, execResponse.status.listStatus[i].status.rowIndex);
									// 最初のエラーにフォーカス
									directiveControl.firstErrorOnFocus('inputform');
									return;
								}
							}
						}
						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
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
		// [EC-CT1-146] 必須エラーのときに空行の必須エラーが消えてしまう 2015.04.01 kawana Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		// [EC-CT1-146] 必須エラーのときに空行の必須エラーが消えてしまう 2015.04.01 kawana End
		});
		// [EC-CT1-055][EC-CT1-056] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.02.23 kawana End

	};

	// [C-CWMS-0021] 届先追加 2015.03.26 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#showZip
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 郵便番号検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された郵便情報を取得し画面項目に反映する。
	 */
	$scope.showZip = function(){

		var items = {
			zipCd: $scope.head.delivZipCd
		};
		//マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.delivZipCd =  selectedItem.zipCd;
			if((($scope.head.delivAddress1 == null)||($scope.head.delivAddress1 == ""))&&(($scope.head.delivAddress2 == null)||($scope.head.delivAddress2 == ""))&&(($scope.head.delivAddress3 == null)||($scope.head.delivAddress3 == ""))){
				$scope.head.delivAddress1 =  selectedItem.address1;
				$scope.head.delivAddress2 =  selectedItem.address2;
				$scope.head.delivAddress3 =  selectedItem.address3;
			};
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#zipCdBlur
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 郵便番号のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、郵便番号の情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function() {
		// 入力された郵便コードを取得
		var zipCd = $scope.head.delivZipCd;
		if((($scope.head.delivAddress1 == null)||($scope.head.delivAddress1 == ""))&&(($scope.head.delivAddress2 == null)||($scope.head.delivAddress2 == ""))&&(($scope.head.delivAddress3 == null)||($scope.head.delivAddress3 == ""))){
			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.zip.record(request).then(function(response){
					$scope.head.delivAddress1 = response.data.mZip.address1;
					$scope.head.delivAddress2 = response.data.mZip.address2;
					$scope.head.delivAddress3 = response.data.mZip.address3;
				});

			}
		};
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanInput.object:ShippingPlanInput#setDelivVisible
	 * @methodOf oneslogiWms.ShippingPlanInput.object:ShippingPlanInput
	 *
	 * @description
	 * 届先入力欄の表示制御<br>
	 * 引数のワンタイムフラグによって表示・非表示を切り替える
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
