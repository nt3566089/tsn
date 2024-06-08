/**
 * @ngdoc overview
 * @name oneslogiWms.DeliveryCourseMasterEdit
 *
 * @description
 * 配送コースマスタメンテナンス(編集)メンテナンス画面
 */
angular.module('oneslogiWms.DeliveryCourseMasterEdit',[])

/**
 * @ngdoc service
 * @name oneslogiWms.DeliveryCourseMasterEdit.service:locationMasterApi
 *
 * @description
 * 配送コースマスタメンテナンス(編集)メンテナンスWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/deliveryCourseMasterEdit/initNew 新規画面用初期データ取得用WebApi<br>
 * ・resources/master/deliveryCourseMasterEdit/initUpdate 更新画面用初期データ取得用WebApi<br>
 * ・resources/master/deliveryCourseMasterEdit/inputCheck 入力チェック（登録と更新）用WebApi<br>
 * ・resources/master/deliveryCourseMasterEdit/register 入力データ登録用WebApi<br>
 * ・resources/master/deliveryCourseMasterEdit/update 入力データ更新用WebApi<br>
 *
 */
.factory('deliveryCourseMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		carrierList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/carrierCd/keyValueList']
				 ]
		),
		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe Start
		centerTagTypeAll: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/centerGrpKeyValueList']
				 ]
		),
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.19 miyabe End
		//tagTypeList: AngularAPIClient.make(
		slipTagTypeList: AngularAPIClient.make(
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				[
				 ['tagType', 'GET', 'resources/common/tagType/keyValueList']
				 ]
		),
		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]
		customerList: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		),
		trackingNumberingList:AngularAPIClient.make(
				[
				 ['keyValueList','GET', 'resources/common/bizCd/keyValueList']
				 ]
		),

		deliveryCourseMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',   'GET', 'resources/master/deliveryCourseMasterEdit/initNew'],
				 ['initUpdate',   'GET', 'resources/master/deliveryCourseMasterEdit/initUpdate'],
				 ['inputCheck', 'POST', 'resources/master/deliveryCourseMasterEdit/inputCheck'],
				 ['register', 'POST', 'resources/master/deliveryCourseMasterEdit/register'],
				 ['update', 'POST', 'resources/master/deliveryCourseMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
 *
 * @description
 * 配送コースマスタメンテナンス(編集)メンテナンス画面コントローラ
 */
.controller('DeliveryCourseMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'deliveryCourseMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.deliveryCourseMasterEditCols =
		[
		 {field:"mcustomer.customerCd", displayName:"納品先CD"},
		 {field:"mcustomer.customerNm", displayName:"納品先名称"},
		 {field:"deliveryOrder", displayName:"配送順"},
		 {field:"deliveryReadTime", displayName:"配送リードタイム"}
		 ];
	var oldwarehouse;
	var newZoneCdList;
	var bodyList;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#initScreen
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
		// 運送業者にチェンジイベントを設定
		$scope.carrierCdChange = function() {
			// 送り状データ種別リスト変更（同期処理）
			$scope.deferredGetTagType();
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			$scope.deferredGettagTypeList();
			$scope.deferredGettagTypeAfterList();
			$scope.deferredGettagDataTypeList();
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
		};
		// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]

		// グリッドの商品コード、ロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"mcustomer.customerCd":{
					clickFunction:"showDeliveryMaster(row.rowIndex)"
				}
		};

		// グリッドの商品コード列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"mcustomer.customerCd":{
					"ng-blur":{
						eventFunction:"customerCdBlur(row.rowIndex)"
					}

				// [#979] 入力行以外も登録されるため、入力行を自動でチェックする処理を削除 2017.02.15 kawana

				}
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'deliveryCourseMasterEdit',
			columnDefs: 'deliveryCourseMasterEditCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					// [ON推-品向-386] 削除フラグは必須のため空白なしを設定 2014.12.03 kawana Start
					removeBlank:"null"
					// [ON推-品向-386] 削除フラグは必須のため空白なしを設定 2014.12.03 kawana End
				},
				"mcarrier.carrierCd" : {
					key : "carrierCd",
					value : "carrierNm",
					listModel : "carrierList"
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//				}
				},
				"trackingNumberingUnit" : {
					key : "classCd",
					value : "classNm",
					listModel : "trackingNumberingUnitList"
				},
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				// [#1077] [追跡番号採番キー]をドロップダウン化 2017.6.14 nayzaw Start
				"trackingNumberingKey" :{
					key : "classCd",
					value : "classNm",
					listModel : "trackingNumberingKeyList"
				},
				// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
				"paymentTerm" : {
					key : "classCd",
					value : "classNm",
					listModel : "paymentTermList",
					removeBlank:"null"
				}
				// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
				// [#1077] [追跡番号採番キー]をドロップダウン化 2017.6.14 nayzaw End
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mcustomer.customerCd",9, 7);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mcustomer.customerCd",9, 2);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mcustomer.customerCd",9, 8);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//				 $scope.deferredGetCarrierCd()
				 $scope.deferredGetCarrierCd(),
				 $scope.deferredGettrackingNumberingUnitList(),
				 $scope.deferredGetTrackingNumberingKeyList(),
				 // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End
				// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
				 $scope.deferredGetPaymentTerm()
				// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGetTagType
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 送り状定義取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTagType = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = $scope.head.mcenter.centerCd;
		request.carrierCd = $scope.head.mcarrier.carrierCd;

		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
//		api.tagTypeList.tagType(request).then(function(response){
//			$scope.tagTypeList = response.data;
		api.slipTagTypeList.tagType(request).then(function(response){
			$scope.slipTagTypeList = response.data;
	   // [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End

		//荷主センタ変更対応 201７.01.19 sja Start
			// センタ変更後処理
			$scope.changeCenter(true);
		//荷主センタ変更対応 201７.01.19 sja End

			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]

	//荷主センタ変更対応 201７.01.19 sja Start
	$scope.changeCenter = function(clearSelected) {
		// 作業日/出荷日/納品日リスト変更（同期処理）
		// 運送業者リスト変更（同期処理）
		$scope.deferredGetCarrierCd()
		.then(function(response) {
			// 荷主センタ変更対応 2017.04.21 sja Start
//			setCarrierList(response.data, clearSelected);
			// 荷主センタ変更対応 2017.04.21 sja End
		});
	};

	// 作業日/出荷日/納品日リスト再設定処理
	var setCarrierList = function(list, clearSelected) {
		$scope.carrier = list;

		if (clearSelected) {
			$scope.head.mcarrier.carrierCd = null;
		}
	};
	//荷主センタ変更対応 201７.01.19 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
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





	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGettrackingNumberingUnitList
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 追跡番号採番単位取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGettrackingNumberingUnitList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TRACKING_NUMBERING_UNIT";

		api.dropdownList.query(request).then(function(response){
			$scope.trackingNumberingUnitList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGettagTypeList
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 送り状種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGettagTypeList = function () {
		var deferred = $q.defer();

		var request = {};
		if($scope.head.mcarrier.carrierCd == "YMT") {
			request.classGrpCd = "TAG_TYPE_YMT";
		} else if($scope.head.mcarrier.carrierCd == "SGW") {
			request.classGrpCd = "TAG_TYPE_SGW";
		} else if($scope.head.mcarrier.carrierCd == "JP") {
			request.classGrpCd = "TAG_TYPE_JP";
		} else{
			request.classGrpCd = "TAG_TYPE_COMM";
		};
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
		owsCommon.getDataCacheable(api.centerTagTypeAll, request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe End
			$scope.tagTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGettagTypeAfterList
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 送り状種別(代引時、2枚目以降)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGettagTypeAfterList = function () {
		var deferred = $q.defer();

		var request = {};
		if($scope.head.mcarrier.carrierCd == "YMT"){
			request.classGrpCd = "TAG_TYPE_AFTER_YMT";
		} else if($scope.head.mcarrier.carrierCd == "SGW") {
			request.classGrpCd = "TAG_TYPE_AFTER_SGW";
		} else if($scope.head.mcarrier.carrierCd == "JP") {
			request.classGrpCd = "TAG_TYPE_AFTER_JP";
		} else{
			request.classGrpCd = "TAG_TYPE_AFTER_COMM";
		};
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
		owsCommon.getDataCacheable(api.centerTagTypeAll, request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
			$scope.tagTypeAfterList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGettagDataType
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 送り状データ種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGettagDataTypeList = function () {
		var deferred = $q.defer();

		var request = {};

		if($scope.head.mcarrier.carrierCd == "YMT"){
			request.classGrpCd = "TAG_DATA_TYPE_YMT";
		} else if($scope.head.mcarrier.carrierCd == "SGW") {
			request.classGrpCd = "TAG_DATA_TYPE_SGW";
		} else if($scope.head.mcarrier.carrierCd == "JP") {
			request.classGrpCd = "TAG_DATA_TYPE_JP";
		};
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
		owsCommon.getDataCacheable(api.centerTagTypeAll, request).then(function(response){
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.10 miyabe Start
			$scope.tagDataTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End

	// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGetPaymentTerm
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * Payment Term取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPaymentTerm = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PAYMENT_TERM";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.paymentTermList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End

	// [#979] 入力行以外も登録されるため、入力行を自動でチェックする処理を削除 2017.02.15 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#showProduct
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 納品先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showDeliveryMaster = function(rowIndex){

		var items = {
				clientCd: userInfo.clientCd,
				deliveryCd: $scope.deliveryCourseMasterEdit[rowIndex].mcustomer.customerCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.customerCd =  selectedItem.customerCd;
			$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.customerNm =  selectedItem.customerNm;
			$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.clientId =  selectedItem.clientId;

			// [#979] 入力行以外も登録されるため、入力行を自動でチェックする処理を削除 2017.02.15 kawana
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#productBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 納品先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var customerCd = $scope.deliveryCourseMasterEdit[rowIndex].mcustomer.customerCd;

		if (customerCd && 0 < customerCd.length) {
			var request = {};

			request.clientId = userInfo.clientId;
			request.customerCd = customerCd;

			api.customerList.record(request).then(function(response){
				$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.customerNm = response.data.mCustomer.customerNm;
				$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.clientId =  response.data.mCustomer.clientId;
			});

		} else {
			//  [EC-CT1-131] JSエラー解除 2015.3.20 Sakata Start
			$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.customerNm = null;
			$scope.deliveryCourseMasterEdit[rowIndex].mcustomer.clientId = null;
			//  [EC-CT1-131] JSエラー解除 2015.3.20 Sakata End
		}
	};

	$scope.deferredGetTrackingNumberingKeyList = function(){

		var deferred = $q.defer();
		var request = {};

		if ($scope.head) {
			request.centerCd = $scope.head.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}

		api.trackingNumberingList.keyValueList(request).then(function(response){
			$scope.trackingNumberingKeyList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}


	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGetForeignFlg
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 運送業者ドロップダウンリスト用データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrierCd = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.02.07 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.head) {
			request.centerCd = $scope.head.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.02.07 sja End

		api.carrierList.keyValueList(request).then(function(response){
			$scope.carrierList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 倉庫マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		// 画面モード判定
		// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add End

			// 訂正
			var request = {};
			request.deliveryCourseId = $route.current.params.deliveryCourseId;

			api.deliveryCourseMasterEdit.initUpdate(request).then(function(response){

				// 商品ヘッダ関連
				$scope.head = response.data.head;
				// 商品明細関連
				$scope.deliveryCourseMasterEdit = response.data.body[0].mcenterCustomerList;
				bodyList = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [S]
				// 送り状データ種別リスト変更
				$scope.deferredGetTagType();
				// [C-EC-0007] 配送コースマスタと送り状定義マスタの紐付け追加 2015/01/28 Yokosuka [E]
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
			    $scope.deferredGettagTypeList();
				$scope.deferredGettagTypeAfterList();
				$scope.deferredGettagDataTypeList();
				$scope.deferredGetTrackingNumberingKeyList();
				// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End

				// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add End
					directiveControl.editable($scope, 'deliveryCourseCd', false);
				// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add Start
				} else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
					gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false);
				}
				// コピー機能追加 配送コースマスタ画面修正 2016.06.22 Lin Zar Ni Myint Add End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {
			api.deliveryCourseMasterEdit.initNew().then(function(response){
				$scope.head = response.data.head;

				$scope.deliveryCourseMasterEdit = response.data.body[0].mcenterCustomerList;
				bodyList = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// ログイン情報より初期値を設定
				$scope.head.mcenter.centerCd = userInfo.centerCd;
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);

				// 履歴データ取得・検索処理
				if (owsHistory.hasState()) {
					$scope.head = owsHistory.popState();
					$scope.search();
				}

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}


		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#getClassForRow
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#addRow
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		// [ON推-品向-208] 削除フラグを追加 2014.12.1 yangc Start
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		if ($scope.screenMode == SCREEN_MODE.Update) {
			$scope.deliveryCourseMasterEdit.push(angular.copy($scope.blankRow));
			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.deliveryCourseMasterEdit.length-1);

			// 行番号振り直し
			updateRowNumber($scope.deliveryCourseMasterEdit);

		} else {
			$scope.deliveryCourseMasterEdit.push(angular.copy($scope.blankRow));
			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false);
			// 行番号振り直し
			updateRowNumber($scope.deliveryCourseMasterEdit);
		}
		// [ON推-品向-208] 削除フラグを追加 2014.12.1 yangc End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#removeRow
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		// 選択行削除チェック
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma Start
		if ($scope.screenMode != SCREEN_MODE.Copy) {
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma End
			var i = 0;
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.deliveryCourseMasterEdit.indexOf(row) > -1) {
					if (row.deliveryCourseId != null) {
						i += 1;
						return;
					}
				}
			});
			if (i > 0){
				alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
				return;
			}
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma Start
		}
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma End
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}
	    // [横並-053] チェック順変更 2014.11.21 taoys Start
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcustomer.customerCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcustomer.customerCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcustomer.customerNm != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcustomer.customerNm != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryOrder != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryOrder!= null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryReadTime != ""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].deliveryReadTime!= null)
						){
				item++;
			}
		}
		// 複数行の場合に警告
		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				// 複数行の場合に警告
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
		// [横並-053] チェック順変更 2014.11.21 taoys End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.deliveryCourseMasterEdit.indexOf(row) > -1) {
				$scope.deliveryCourseMasterEdit.splice($scope.deliveryCourseMasterEdit.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.deliveryCourseMasterEdit);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit#register
	 * @methodOf oneslogiWms.DeliveryCourseMasterEdit.object:DeliveryCourseMasterEdit
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

		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS Start
		// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS Start
//		var carrierCd = $scope.head.mcarrier.carrierCd;
//		var tagDataType = $scope.head.tagDataType;
//		if(carrierCd == "YMT" || carrierCd == "SGW" || carrierCd == "JP" ){
//
//			if (!(tagDataType && 0 < tagDataType.length)) {
//				optionMessageControl.show($scope, 'tagDataType', owsCommon.convertMessage('requiredError'));
//				return;
//			}
//		}
		// [ON推-UT210N-003] 送り状データ種別が任意の入力とすべき 2016/09/08 HDIS End
		// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/06 HDIS End

		var listBody = [];
		var emptyBody = [];

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

		// [#979] コピー機能を考慮し表示されているデータ全てを登録する処理に戻す([#657]対応の取消) 2017.02.15 kawana

		// 空行判定
		for (var row = 0; row < $scope.deliveryCourseMasterEdit.length; row++) {

			// [#979] 空行の必須エラーで登録できない問題を修正 2017.02.16 kawana Start

			if (!$scope.deliveryCourseMasterEdit[row].delFlg || $scope.deliveryCourseMasterEdit[row].delFlg == "0") {
				// 削除フラグ = 0

				$scope.deliveryCourseMasterEdit[row].delFlg = null;
				if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
					// 空行

					emptyBody.push($scope.deliveryCourseMasterEdit[row]);

					// 検証機能を解除
					gridDirectiveControl.validity($scope.gridOptions, false, row);
				} else {
					// 入力行

					listBody.push($scope.deliveryCourseMasterEdit[row]);
				}
				// 登録時、エラー発生時を考慮し 削除対象、登録対象 に関わらず削除フラグを元に戻しておく
				$scope.deliveryCourseMasterEdit[row].delFlg = "0";

			// [#979] 空行の必須エラーで登録できない問題を修正 2017.02.16 kawana End

			}else {
				// 空行以外を退避
				listBody.push($scope.deliveryCourseMasterEdit[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {

				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.deliveryCourseMasterEdit.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.deliveryCourseMasterEdit.splice($scope.deliveryCourseMasterEdit.indexOf(row), 1);
				});

				// 行番号振り直し
				updateRowNumber($scope.deliveryCourseMasterEdit);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// ロケーションCD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				for (var row = 0; row < $scope.deliveryCourseMasterEdit.length; row++) {
					var customerCd = $scope.deliveryCourseMasterEdit[row].mcustomer.customerCd;
					for (var i = row+1; i < $scope.deliveryCourseMasterEdit.length; i++) {
						if ($scope.deliveryCourseMasterEdit[i].mcustomer.customerCd == customerCd){
							rowIndex[j] =i;
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//							errAry[j] = "customerCodeDuplicateError";
							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
							j++;
						}
					}
				}
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "mcustomer.customerCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "mcustomer.customerCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						}
//					}
					// エラーメッセージCD
					// [#7412][v3.1][OSS] データ重複時のエラーメッセージ変更 2020/05/11 KAI MOD START
					//var messageCd = "customerCodeDuplicateError";
					var messageCd = "dataDuplicateError";
					// [#7412][v3.1][OSS] データ重複時のエラーメッセージ変更 2020/05/11 KAI MOD END
					gridOptionMessageControl.show($scope.gridOptions, "mcustomer.customerCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.deliveryCourseMasterEdit.splice($scope.deliveryCourseMasterEdit.indexOf(row), 1);
//				});
//
//				// 行番号振り直し
//				updateRowNumber($scope.deliveryCourseMasterEdit);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				bodyList[0].mcenterCustomerList = listBody;
				request.data.body = bodyList;
				request.data.head = $scope.head;

				// コピー機能追加 配送コースマスタ画面修正 2016.07.04 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.deliveryCourseId = null;
				}
				// コピー機能追加 配送コースマスタ画面修正 2016.07.04 Lin Zar Ni Myint Add End

				// 入力チェック
				api.deliveryCourseMasterEdit.inputCheck(request).then(function(response){

					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//配送コースCD存在チェック
							if (response.status.listStatus[i].status.statusCode == 2){
								optionMessageControl.show($scope, "deliveryCourseCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
						};
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//運送業者存在チェック
							if (response.status.listStatus[i].status.statusCode == 6){
								optionMessageControl.show($scope, "carrierCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						}
					    // [検査-095] エラーが表示を修正 2014.11.27 taoys End
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 画面モード判定
					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 配送コースマスタメンテナンス(編集)データ登録または更新
						api.deliveryCourseMasterEdit.update(request).then(function(response){
							// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//運送業者存在チェック
									if (response.status.listStatus[i].status.statusCode == 6){
										optionMessageControl.show($scope, "carrierCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}
							// [検査-095] エラーが表示を修正 2014.11.27 taoys End
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						});
					} else {
						// 配送コースマスタメンテナンス(編集)データ登録または更新
						api.deliveryCourseMasterEdit.register(request).then(function(response){
							// [検査-095] エラーが表示を修正 2014.11.27 taoys Start
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//配送コースCD存在チェック
									if (response.status.listStatus[i].status.statusCode == 2){
										optionMessageControl.show($scope, "deliveryCourseCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}

								};
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//運送業者存在チェック
									if (response.status.listStatus[i].status.statusCode == 6){
										optionMessageControl.show($scope, "carrierCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}
							// [検査-095] エラーが表示を修正 2014.11.27 taoys End

							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
								return;
							}

							// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
							owsCommon.toggleSelectAll($scope.gridOptions, false);
							// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

							// コピー機能追加 配送コースマスタ画面修正 2016.07.04 Lin Zar Ni Myint Add Start
							if ($scope.screenMode == SCREEN_MODE.Register) {
							// コピー機能追加 配送コースマスタ画面修正 2016.07.04 Lin Zar Ni Myint Add End
								// 初期化
								$scope.initScreenHttp();
							// コピー機能追加 配送コースマスタ画面修正 2016.07.04 Lin Zar Ni Myint Add Start
							}
							// コピー機能追加 配送コースマスタ画面修正 2016.07.04 Lin Zar Ni Myint Add End
						});
					}
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
	};

	// ゾーン区分リスト再設定処理
	var setZoneCdList = function(list, clearSelected) {
		$scope.zoneCdList = list;

	};
	//画面初期化処理を実行
	$scope.initScreen();

}]);
