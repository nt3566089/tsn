/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryInput
 *
 * @description
 * 棚卸入力
 */
angular.module('oneslogiWms.InventoryInput',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryInput.service:InventoryInputApi
 *
 * @description
 * 棚卸入力操作用WebApi<br>
 * ・resources/inventory/inventoryInput/init   画面用初期処理<br>
 * ・resources/inventory/inventoryInput/select   棚卸入力データ取得<br>
 * ・resources/inventory/inventoryInput/register  棚卸データ更新処理<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList  棚卸入力有無、在庫調査区分、CAP製品、ロケーショングループ、たばこ商品区分、在庫調査キーフラグ、アンマッチフラグ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 * ・resources/common/location/record  ロケーション取得<br>
 *
 */
.factory('InventoryInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockTakingInput: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),

		unmatch: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),

		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),

		inventoryInstKbn: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		maxInvFlg: AngularAPIClient.make(
				[
				['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),
		locationGrp: AngularAPIClient.make(
				[
				['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),

		capProductList: AngularAPIClient.make(
				[
				['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),

		cggdList: AngularAPIClient.make(
				[
				['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),

		inventoryInput: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/inventory/inventoryInput/init'],
				 ['select',  'GET', 'resources/inventory/inventoryInput/select'],
				 ['excel',  'GET', 'resources/inventory/inventoryInput/select', 'excel'],
				 ['register', 'POST', 'resources/inventory/inventoryInput/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryInput.object:InventoryInput
 *
 * @description
 * 棚卸データ作成画面コントローラ
 */
.controller('InventoryInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'InventoryInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	//グリッドの列情報（デザイン用）
	$scope.inventoryListCols =
		[
		    {field:"mlocation.locationNm", displayName:"ロケーション"},
		    {field:"mproduct.productCd", displayName:"商品CD"},
		    {field:"mproduct.janCd", displayName:"JANCD"},
		    {field:"mproduct.productNm", displayName:"商品名称"},
            {field:"storeNoId", displayName:"入庫No."},
            {field:"storeLabelNo", displayName:"入庫ラベルNo."},
            {field:"tstoreNo.mcustomer.customerCd", displayName:"仕入先名称CD"},
            {field:"tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
            {field:"lot", displayName:"ロット"},
            {field:"limitDt", displayName:"期限日"},
            {field:"mcustomerByDepositId.customerCd ", displayName:"預託CD"},
            {field:"mcustomerByDepositId.customerNm", displayName:"預託名称"},
            {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
            {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
            {field:"unitNum", displayName:"ケース入数"},
            {field:"chargeNum", displayName:"棚卸前引当可能数"},
            {field:"allocNum", displayName:"棚卸前引当済数"},
            {field:"moveNum", displayName:"棚卸前移動中数"},
            {field:"caseQtyB", displayName:"棚卸前ケース数"},
            {field:"pieceQtyB", displayName:"棚卸前ピース数"},
            {field:"inventoryNum", displayName:"棚卸数量"},
            {field:"caseQty", displayName:"棚卸ケース数"},
            {field:"pieceQty", displayName:"棚卸ピース数"},
            {field:"histAddUser", displayName:"入力者"},
            {field:"inputDt", displayName:"入力日時"},
            {field:"bclassDtlByStockAdjustFlg.vdict.dictNm", displayName:"棚卸調整入力"},
			{field:"tinventoryH.mclient.clientCd", displayName:"荷主ＣＤ"},
			{field:"tinventoryH.mclient.clientNm", displayName:"荷主名称"},
			{field:"tinventoryH.mcenter.centerCd", displayName:"センタＣＤ"},
			{field:"tinventoryH.mcenter.centerNm", displayName:"センタ名称"}

		];

	// 画面初期化処理
	$scope.initScreen = function() {
		//検索条件を表示状態に変更
		$scope.isopen = true;

		$scope.inventroyParcent = "0%";

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グリッドの設定
//		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'inventoryList',
			columnDefs: 'inventoryListCols'
		});

		// ロケーション大小チェック
        $scope.fromToCheck = function(fromValue, toValue) {
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
        $scope.fromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		// 在庫調査キーフラグ変更の監視
		$scope.keyFlgChange = function() {
			// ゾーンリスト変更（同期処理）
			if($scope.mClientCenter.mparamAsOne.centerKbn == '1'){
				if ($scope.conditionH.inventoryKeyFlg != '1'){
					directiveControl.editable($scope, 'inventoryInstKey', false);
					directiveControl.editable($scope, 'inventoryInstAddDt', false);

					$scope.conditionH.inventoryKey = "";
					$scope.conditionI.registDt = "";
				}else{
					directiveControl.editable($scope, 'inventoryInstKey', true);
					directiveControl.editable($scope, 'inventoryInstAddDt', true);
				}
			}
		};

		// 在庫調査区分変更の監視
		$scope.inventoryInstKbnChange = function() {
			// ゾーンリスト変更（同期処理）
			if($scope.mClientCenter.mparamAsOne.centerKbn == '1'){
				if ($scope.conditionI.inventoryInstKbn != '04'){
					directiveControl.editable($scope, 'capProduct', false);
					$scope.conditionH.capProduct = "";
				}else{
					directiveControl.editable($scope, 'capProduct', true);
				}
			}
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// 画面初期化用の通信制御処理
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetInventoryInstKbnList(),
				 $scope.deferredGetInventoryInstKeyFlgList(),
				 $scope.deferredGetConditionList(),
				 $scope.deferredGetLocationGrpList(),
				 $scope.deferredGetCapProductList(),
				 $scope.deferredGetCggdList(),
				 $scope.deferredGetUnmatchList()
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	// 在庫調査区分リスト取得
	$scope.deferredGetInventoryInstKbnList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_INST_KBN";

		owsCommon.getDataCacheable(api.inventoryInstKbn, "keyValueList", request).then(function(response){
			$scope.inventoryInstKbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// CAP製品リスト取得
	$scope.deferredGetCapProductList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CAPSELECT";

		owsCommon.getDataCacheable(api.capProductList, "keyValueList", request).then(function(response){
			$scope.capProductList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// たばこ商品区分リスト取得
	$scope.deferredGetCggdList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CGGDID";

		owsCommon.getDataCacheable(api.cggdList, "keyValueList", request).then(function(response){
			$scope.cggdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 在庫調査キーフラグ
	$scope.deferredGetInventoryInstKeyFlgList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MAXINVFLG";

		owsCommon.getDataCacheable(api.maxInvFlg, "keyValueList", request).then(function(response){
			$scope.maxInvFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// ロケーショングループ
	$scope.deferredGetLocationGrpList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOC_GROUP";

		owsCommon.getDataCacheable(api.locationGrp, "keyValueList", request).then(function(response){
			$scope.locationGrpList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	// 棚卸入力有データ取得
	$scope.deferredGetConditionList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_TAKING_INPUT";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response){
			$scope.stockTakingInputList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// アンマッチ有データ取得
	$scope.deferredGetUnmatchList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UNMATCH";

		owsCommon.getDataCacheable(api.unmatch, "keyValueList", request).then(function(response){
			$scope.unmatchList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		var request = {};
		request.clientId = userInfo.clientId;
		request.centerId = userInfo.centerId;

		api.inventoryInput.init(request).then(function(response){

			$scope.conditionH = response.data.head;
			$scope.conditionB = response.data.body;
			$scope.conditionI = response.data.Inst;
			$scope.conditionH.mclient.clientCd = userInfo.clientCd;
			$scope.conditionH.mclient.clientId = userInfo.clientId;
			$scope.conditionH.mcenter.centerCd = userInfo.centerCd;
			$scope.conditionH.mcenter.centerId = userInfo.centerId;
			$scope.inventoryList = response.data.gridList;

			$scope.mClientCenter = response.data.mClientCenter;

			//在庫調査区分を設定
			$scope.conditionI.inventoryInstKbn =  owsCommon.getDefaultValue($scope.inventoryInstKbnList);

			//在庫調査キーフラグを設定
			$scope.conditionH.inventoryKeyFlg =  owsCommon.getDefaultValue($scope.maxInvFlgList);

			//アンマッチ有を設定
			$scope.conditionI.unmatch =  owsCommon.getDefaultValue($scope.unmatchList);

			if($scope.mClientCenter.mparamAsOne.centerKbn == '1'){
				directiveControl.show($scope, "locationGrp", false);

				for (var col = 0; col < $scope.gridOptions.columnDefs.length; col++) {
					if($scope.gridOptions.columnDefs[col].field == "addDt"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "firmTransportCd"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "locationGrp"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
				}

			}else{
				directiveControl.show($scope, "inventoryInstKbn", false);
				directiveControl.show($scope, "inventoryKeyFlg", false);
				directiveControl.show($scope, "capProduct", false);

				for (var col = 0; col < $scope.gridOptions.columnDefs.length; col++) {
					if($scope.gridOptions.columnDefs[col].field == "inventoryInstKbn"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "inventoryDt"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "lineBlock"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "directionalPiston"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "sortingOrder"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "sortingNumTimes"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "unitNumBreakdown"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "inventoryBeforeBreakdown"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "inventoryItems"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
					if($scope.gridOptions.columnDefs[col].field == "differenceNum"){
						$scope.gridOptions.columnDefs[col].visible = false;
					}
				}
			}

			$scope.keyFlgChange();
			$scope.inventoryInstKbnChange();

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.condition = owsHistory.popState();

				$scope.conditionH.mclient.clientCd = $scope.condition.clientCd;
				$scope.conditionH.mcenter.centerCd = $scope.condition.centerCd;

				if($scope.mClientCenter.mparamAsOne.centerKbn == '1'){
					$scope.conditionI.inventoryInstKbn = $scope.condition.inventoryInstKbn;
					$scope.conditionH.inventoryKeyFlg = $scope.condition.inventoryKeyFlg;
					$scope.conditionH.capProduct = $scope.condition.capProduct;
				}else{
					$scope.conditionI.locationGrp = $scope.condition.locationGrp;
				}

				$scope.conditionH.inventoryKey = $scope.condition.inventoryKey;
				$scope.conditionI.registDt = $scope.condition.addDt;
				$scope.conditionI.fromLocationCd = $scope.condition.fromLocationCd;
				$scope.conditionI.toLocationCd = $scope.condition.toLocationCd;
				$scope.conditionB.mproduct.productCd = $scope.condition.productCd;
				$scope.conditionH.productType = $scope.condition.productType;
				$scope.conditionI.stockTakingInput = $scope.condition.stockTakingInput;
				$scope.conditionI.unmatch = $scope.condition.unmatch;

				$scope.keyFlgChange();
				$scope.inventoryInstKbnChange();

				// 画面検索
				$scope.search();
			}else if($route.current.params.instKey){

				$scope.conditionH.mclient.clientCd = userInfo.clientCd;
				$scope.conditionH.mcenter.centerCd = userInfo.centerCd;
				$scope.conditionH.inventoryKey = $route.current.params.instKey;

				// 画面検索
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
	 * @name oneslogiWms.InventoryInventroy.object:InventoryInventroy#productBlur
	 * @methodOf oneslogiWms.InventoryInventroy.object:InventoryInventroy
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.conditionB.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.conditionH.mclient.clientCd);
			request.productCd = productCd;

			$scope.conditionB.mproduct.productNm = null;

			api.product.record(request).then(function(response){
				$scope.conditionB.mproduct.productNm = response.data.mProduct.productNm;
				$scope.conditionB.mproduct.janCd = response.data.mProduct.janCd;
				$scope.conditionB.mproduct.productAbbr = response.data.mProduct.productAbbr;
			});

		} else {
			$scope.conditionB.mproduct.productNm = null;
			$scope.conditionB.mproduct.janCd = null;
			$scope.conditionB.mproduct.productAbbr = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInventroy.object:InventoryInventroy#showProduct
	 * @methodOf oneslogiWms.InventoryInventroy.object:InventoryInventroy
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.conditionH.mclient.clientCd,
				productCd: $scope.conditionB.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.conditionB.mproduct.productCd =  selectedItem.productCd;
			$scope.conditionB.mproduct.productNm =  selectedItem.productNm;
			$scope.conditionB.mproduct.productAbbr =  selectedItem.productAbbr;
			$scope.conditionB.mproduct.janCd =  selectedItem.janCd;

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInventroy.object:InventoryInventroy#locationCdBlur
	 * @methodOf oneslogiWms.InventoryInventroy.object:InventoryInventroy
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {
		// 入力されたロケーションCD
        var locationCd;
        if (index == 1) {
        	locationCd = $scope.conditionI.fromLocationCd;
		} else {
			locationCd = $scope.conditionI.toLocationCd;
		}

		if (locationCd && 0 < locationCd.length) {
			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);
			request.locationCd = locationCd;

			api.location.record(request).then(function(response){
				if (index == 1) {
					$scope.conditionI.fromLocationNm = response.data.mLocation.locationNm;
				} else {
					$scope.conditionI.toLocationNm = response.data.mLocation.locationNm;
				}
			});

		} else {
			if (index == 1) {
				$scope.conditionI.fromLocationNm = null;
			} else {
				$scope.conditionI.toLocationNm = null;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInventroy.object:InventoryInventroy#showLocation
	 * @methodOf oneslogiWms.InventoryInventroy.object:InventoryInventroy
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
        var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.conditionI.fromLocationCd;
		} else {
			inLocationCd = $scope.conditionI.toLocationCd;
		}

		var items = {
				centerCd: $scope.conditionH.mcenter.centerCd,
				locationCd: inLocationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.conditionI.fromLocationCd = selectedItem.locationCd;
				$scope.conditionI.fromLocationNm = selectedItem.locationNm;
			} else {
				$scope.conditionI.toLocationCd = selectedItem.locationCd;
				$scope.conditionI.toLocationNm = selectedItem.locationNm;

			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#search
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){

		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		api.inventoryInput.select(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#setSearchData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.inventoryList = response.data.gridList;
		if (response.data.gridList.length > 0 ){
			$scope.inventroyParcent = response.data.gridList[0].inventoryParcent + "%";
		}else{
			$scope.inventroyParcent = "0%"
		}

		//検索条件を履歴に保存
		$scope.condition = {};
		$scope.condition.clientCd = $scope.conditionH.mclient.clientCd;
		$scope.condition.centerCd = $scope.conditionH.mcenter.centerCd;

		if($scope.mClientCenter.mparamAsOne.centerKbn == '1'){
			$scope.condition.inventoryInstKbn = $scope.conditionI.inventoryInstKbn;
			$scope.condition.inventoryKeyFlg = $scope.conditionH.inventoryKeyFlg;
			$scope.condition.capProduct = $scope.conditionH.capProduct;
		}else{
			$scope.condition.locationGrp = $scope.conditionI.locationGrp;
		}

		$scope.condition.inventoryKey = $scope.conditionH.inventoryKey;
		$scope.condition.addDt = $scope.conditionI.registDt;

		$scope.condition.fromLocationCd = $scope.conditionI.fromLocationCd;
		$scope.condition.toLocationCd = $scope.conditionI.toLocationCd;
		$scope.condition.productCd = $scope.conditionB.mproduct.productCd;

		$scope.condition.productType = $scope.conditionH.productType;
		$scope.condition.stockTakingInput = $scope.conditionI.stockTakingInput;
		$scope.condition.unmatch = $scope.conditionI.unmatch;

		owsHistory.replaceState($scope.condition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#excelOutput
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "gridList", document.title);

		api.inventoryInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#register
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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

		// 空行判定
		if ( $scope.inventoryList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){

			owsCommon.syncExec(function() {

				// 登録ボタンを押すと、確認メッセージ、登録処理になる。
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.gridList = $scope.inventoryList;

				// 棚卸データ追加・更新処理を行う。
				api.inventoryInput.register(request).then(function(response){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}

					$scope.search();
				});
			});
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);