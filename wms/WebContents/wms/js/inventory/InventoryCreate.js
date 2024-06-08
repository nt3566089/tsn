/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryCreate
 *
 * @description
 * 在庫調査指示作成
 */
angular.module('oneslogiWms.InventoryCreate',[])

/**
 * @ngdoc service
 * @name oneslogiWms.InventoryCreate.service:inventoryCreateApi
 *
 * @description
 * 在庫調査指示作成WebApi定義<br>
 *resources/common/centerClass/keyValueList
 *resources/common/lineBlock/keyValueList
 *resources/common/directrestDirectionPiston/keyValueList
 *resources/common/location/record
 *resources/common/product/record
 *resources/inventory/inventoryCreate/init
 *resources/inventory/inventoryCreate/register 																					
 *
 */
.factory('inventoryCreateApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),	
		lineBlock: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/lineBlock/keyValueList']
				 ]
		),	
		directrestDirectionPiston: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/directrestDirectionPiston/keyValueList']
				 ]
		),		
		warehouse: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),		
		depositeCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),		
		stockTypeList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),		
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zoneCd/keyValueList']
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
		inventoryCreate: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/inventory/inventoryCreate/init'],
					['register', 'POST', 'resources/inventory/inventoryCreate/register']
				]
		)	
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryCreate.object:InventoryCreate
 *
 * @description
 * 棚卸履歴画面コントローラ
 */
.controller('InventoryCreate', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory',  'printFactory', 'inventoryCreateApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#initScreen
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;
		
		//searchCondition初期化
		$scope.searchCondition = {};
		$scope.searchCondition.tinventoryH = {};
		$scope.searchCondition.tinventoryH.mcenter = {};
		$scope.searchCondition.tinventoryH.mclient = {};
		
		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//センタIDの設定
		$scope.searchCondition.tinventoryH.mcenter.centerId = userInfo.centerId;
		
		//センタCdの設定
		$scope.searchCondition.tinventoryH.mcenter.centerCd = userInfo.centerCd;
		//クライアントCdの設定
		$scope.searchCondition.tinventoryH.mclient.clientCd = userInfo.clientCd;

		directiveControl.editable($scope, 'lineBlock', false);
		directiveControl.editable($scope, 'directionalPistonText', false);
		directiveControl.editable($scope, 'directionalPistonDropdown', false);
		directiveControl.editable($scope, 'locationCd', false);
		directiveControl.editable($scope, 'fromLocationCd', false);
		directiveControl.editable($scope, 'toLocationCd', false);
		directiveControl.editable($scope, 'productDivision', false);
		directiveControl.editable($scope, 'productCd', false);
		
		directiveControl.show($scope, 'warehouseCd', false);
		directiveControl.show($scope, 'inventoryDt', false);
		directiveControl.show($scope, 'depositCd', false);
		directiveControl.show($scope, 'stockTypeCd', false);
		directiveControl.show($scope, 'zoneCd', false);
		directiveControl.show($scope, 'fromStockInoutDt', false);
		directiveControl.show($scope, 'toStockInoutDt', false);
		directiveControl.show($scope, 'stockTarget', false);
		
//		directiveControl.editable($scope, 'warehouseCd', true);
//		directiveControl.editable($scope, 'inventoryDt', true);
//		directiveControl.editable($scope, 'depositCd', true);
//		directiveControl.editable($scope, 'stockTypeCd', true);
//		directiveControl.editable($scope, 'zoneCd', true);
//		directiveControl.editable($scope, 'fromStockInoutDt', true);
//		directiveControl.editable($scope, 'toStockInoutDt', true);
//		directiveControl.editable($scope, 'stockTarget', true);

		// ロケーションfrom/toチェック用メッセージ
        $scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);
		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// ロケーションfrom/toチェック
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#showLocation
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(index){
        var inLocationCd;
		if (index == 1) {
			inLocationCd = $scope.searchCondition.fromLocationCd;
		} else if (index == 2){
			inLocationCd = $scope.searchCondition.toLocationCd;
		}else{
			inLocationCd = $scope.searchCondition.locationCd;
		}

		var items = {
			centerCd: userInfo.centerCd,
			locationCd: inLocationCd,
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.searchCondition.fromLocationCd = selectedItem.locationCd;
				$scope.searchCondition.fromLocationNm = selectedItem.locationNm;
			} else if (index == 2) {
				$scope.searchCondition.toLocationCd = selectedItem.locationCd;
				$scope.searchCondition.toLocationNm = selectedItem.locationNm;
			} else {
				$scope.searchCondition.locationCd = selectedItem.locationCd;
				$scope.searchCondition.locationNm = selectedItem.locationNm;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#locationCdBlur
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(index) {
		// 入力された商品コードを取得
        var locationCd;
		if (index == 1) {
			locationCd = $scope.searchCondition.fromLocationCd;
		} else if (index == 2) {
			locationCd = $scope.searchCondition.toLocationCd;
		} else {
			locationCd = $scope.searchCondition.locationCd;
		}
		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				if(index == 1){
					$scope.searchCondition.fromLocationNm = response.data.mLocation.locationNm;
				} else if (index == 2) {
					$scope.searchCondition.toLocationNm = response.data.mLocation.locationNm;
				} else {
					$scope.searchCondition.locationNm = response.data.mLocation.locationNm;
				}
			});
		} else {
			// ロケーション名称をクリア
			if(index == 1){
				$scope.searchCondition.fromLocationNm = null;
			} else if (index == 2) {
				$scope.searchCondition.toLocationNm = null;
			} else {
				$scope.searchCondition.locationNm = null;
			}
		}
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#showProduct
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
			clientCd: userInfo.clientCd,
			productCd: $scope.searchCondition.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.productCd = selectedItem.productCd;
			$scope.searchCondition.productNm = selectedItem.productNm;
		});
	}
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#productBlur
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.searchCondition.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd(userInfo.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.productNm = null;
		}
	};
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#viewList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 在庫調査指示一覧ボタン押下処理<br>
	 *
	 * 一覧画面に遷移する
	 */
	$scope.viewList = function(){
		$location.path("wms/inventory/InstKeyList").search({}).search("mode", SCREEN_MODE.Create);
	}
	
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#register
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 在庫調査データ作成ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function(){
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		//ロケーションCD(From) > 入力.ロケーションCD(To)チェック
		if($scope.searchCondition.fromLocationCd && $scope.searchCondition.toLocationCd
		&& ($scope.searchCondition.fromLocationCd > $scope.searchCondition.toLocationCd)){
			alertMessage.setErrorMessageByCode("inputLimitCheckCdReversalError");
			//optionMessageControl.show($scope, 'toLocationCd', owsCommon.convertMessage('inputLimitCheckCdReversalError'));
			return;
		}
		//入力.ライン/ブロックが未入力チェック
		var selectInstKbn1 = ['01','02','03'];
		if((selectInstKbn1.indexOf($scope.searchCondition.inventoryInstKbn) != -1) && !$scope.searchCondition.lineBlock){
			alertMessage.setErrorMessageByCode("lineBlockNotInputError");
			//optionMessageControl.show($scope, 'lineBlock', owsCommon.convertMessage('lineBlockNotInputError'));
			return;
		}
		//入力.方面ピストン(手入力)が入力済で5桁以外
		if($scope.searchCondition.inventoryInstKbn == "02" && $scope.searchCondition.directionalPistonText 
			&& $scope.searchCondition.directionalPistonText.length != 5){
			alertMessage.setErrorMessageByCode("inventorySortingWorkCDFormatError");
			//optionMessageControl.show($scope, 'directionalPistonText', owsCommon.convertMessage('inventorySortingWorkCDFormatError'));
			return;
		}
		//入力.方面ピストン(手入力) または入力.方面ピストン(選択)が両方未入力または入力済
		if($scope.searchCondition.inventoryInstKbn == "02" && ((!$scope.searchCondition.directionalPistonText 
			&& !$scope.searchCondition.directionalPistonDropdown) || 
			($scope.searchCondition.directionalPistonText && $scope.searchCondition.directionalPistonDropdown))){
			alertMessage.setErrorMessageByCode("inventorySortingWorkCDNotInputError");
			//optionMessageControl.show($scope, 'directionalPistonText', owsCommon.convertMessage('inventorySortingWorkCDNotInputError'));
			return;
		}
		if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
			return;
		}
//		var obj = {inventoryInstKbn:'',tinventoryH:{}};
//		obj.inventoryInstKbn = $scope.searchCondition.inventoryInstKbn;
//		obj.tinventoryH = {mcenter:{},mclient:{}}
//		obj.tinventoryH.mcenter = $scope.searchCondition.tInventoryH.mCenter;
//		obj.tinventoryH.mclient = $scope.searchCondition.tInventoryH.mClient;
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;
		// 入力チェック
		api.inventoryCreate.register(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}


			// 初期化
			$scope.initScreenHttp();

			//owsCommon.toggleSelectAll($scope.gridOptions, false);
		});
	}

	//在庫調査区分が選択された時、連動項目の制御
	//「仕分場(開始)」00、「仕分場(開始)」01、「仕分場(中間)」02、「仕分場(終了)」03、「引取場」04、「かし品」05、「不適品」06
	$scope.changeKubn = function(){
		var selectRange1 = ['01','02','03'];
		var selectRange2 = ['00','01','03'];
		var selectRange3 = ['04','05'];
		if(selectRange1.indexOf($scope.searchCondition.inventoryInstKbn) != -1){
			directiveControl.editable($scope, 'lineBlock', true).then(
				function(response){
					$scope.lineBlockBlankCheck();
				}
			);
		}else{
			directiveControl.editable($scope, 'lineBlock', false).then(
				function(response){
					$scope.lineBlockBlankCheck();
					$scope.searchCondition.lineBlock = null;
				}
			);
		}
		if(selectRange2.indexOf($scope.searchCondition.inventoryInstKbn) != -1){
			directiveControl.editable($scope, 'locationCd', true);
			directiveControl.editable($scope, 'fromLocationCd', true);
			directiveControl.editable($scope, 'toLocationCd', true);
		}else{
			directiveControl.editable($scope, 'locationCd', false);
			directiveControl.editable($scope, 'fromLocationCd', false);
			directiveControl.editable($scope, 'toLocationCd', false);
			$scope.searchCondition.locationCd = null;
			$scope.searchCondition.fromLocationCd = null;
			$scope.searchCondition.toLocationCd = null;
		}
		if('02' == $scope.searchCondition.inventoryInstKbn){
			directiveControl.editable($scope, 'directionalPistonText', true).then(
				function(response){
					$scope.directionalPistonCheck();
				}
			);
			directiveControl.editable($scope, 'directionalPistonDropdown', true).then(
				function(response){
					$scope.directionalPistonCheck();
				}
			);
		}else{
			directiveControl.editable($scope, 'directionalPistonText', false).then(
				function(response){
					$scope.directionalPistonCheck();
					$scope.searchCondition.directionalPistonText = null;
				}
			);
			directiveControl.editable($scope, 'directionalPistonDropdown', false).then(
				function(response){
					$scope.directionalPistonCheck();
					$scope.searchCondition.directionalPistonDropdown = null;
				}
			);
		}
		if(selectRange3.indexOf($scope.searchCondition.inventoryInstKbn) != -1){
			directiveControl.editable($scope, 'productCd', true);
		}else{
			directiveControl.editable($scope, 'productCd', false);
			$scope.searchCondition.productCd = null;
		}
		if('06' == $scope.searchCondition.inventoryInstKbn){
			directiveControl.editable($scope, 'productDivision', true);
		}else{
			directiveControl.editable($scope, 'productDivision', false);
			$scope.searchCondition.productDivision = null;
		}
	}

	//ライン/ブロック必須チェック
	$scope.lineBlockBlankCheck = function(){
		//活性化及び入力なしの場合、必須チェック
		if(directiveControl.isEditable($scope,'lineBlock') && !$scope.searchCondition.lineBlock){
			optionMessageControl.show($scope, 'lineBlock', owsCommon.convertMessage('requiredError'));
			return true;
		}else{
			//
			optionMessageControl.hide($scope, 'lineBlock');
		}
		return false;
	}
	
	//方面ピストン(手入力)と方面ピストン(選択)必須チェック
	$scope.directionalPistonCheck = function(){
//		//入力.方面ピストン(手入力)が入力済で5桁以外
//		if($scope.searchCondition.inventoryInstKbn == "02" && $scope.searchCondition.directionalPistonText 
//			&& $scope.searchCondition.directionalPistonText.length != 5){
//			alertMessage.setErrorMessageByCode("inventorySortingWorkCDFormatError");
//			return;
//		}
		if(directiveControl.isEditable($scope,'directionalPistonText') && directiveControl.isEditable($scope,'directionalPistonDropdown')
		&& !$scope.searchCondition.directionalPistonText && !$scope.searchCondition.directionalPistonDropdown){
			optionMessageControl.show($scope, 'directionalPistonText', owsCommon.convertMessage('requiredError'));
			optionMessageControl.show($scope, 'directionalPistonDropdown', owsCommon.convertMessage('requiredError'));
			return true;
		}else{
			optionMessageControl.hide($scope, 'directionalPistonText');
			optionMessageControl.hide($scope, 'directionalPistonDropdown');
		}
		return false;
	}
	

	// 保税拠点データ取得
	$scope.deferredGetHozeiWareHouseList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "HOZEIWAREHOUSECD";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.inventoryInstKbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	//データー取得判断
	$scope.deferredGetSelectList = function(){
		var deffer = $q.defer();
		var deferredGetArr = [];
		//倉庫リスト取得
		deferredGetArr.push($scope.deferredGetwarehouseList());
		//預託リスト取得
		deferredGetArr.push($scope.deferredGetDepositList());
		//在庫区分リストタ取得
		deferredGetArr.push($scope.deferredGetStockTypeList());
		//ゾーンリスト取得
		deferredGetArr.push($scope.deferredGetZoneList());
		//引当可能数+引当済数>0リスト取得
		deferredGetArr.push($scope.deferredStockTargetList());
		
		if($scope.hozei == "0"){//保税のみ表示
			// ロケーショングループデータ取得
			deferredGetArr.push($scope.deferredGetLocationGrpList());
			//在庫調査区分を非表示にする
			directiveControl.show($scope, 'inventoryInstKbn', false);
			//ライン/ブロックを非表示にする
			directiveControl.show($scope, 'lineBlock', false);
			//方面ピストン(手入力)を非表示にする
			directiveControl.show($scope, 'directionalPistonText', false);
			//方面ピストン(選択)を非表示にする
			directiveControl.show($scope, 'directionalPistonDropdown', false);
			//銘柄CDを非表示にする
			directiveControl.show($scope, 'productCd', false);
			//銘柄区分を非表示にする
			directiveControl.show($scope, 'productDivision', false);
		}else if ($scope.hozei == "1" ){//倉庫のみ表示
			// 在庫調査区分データ取得
			deferredGetArr.push($scope.deferredGetInventoryInstKbnList());
			// ライン/ブロックマスタデータ取得
			deferredGetArr.push($scope.deferredGetLineBlockCdList());
			//方面ピストン(選択)マスタデータ取得
			deferredGetArr.push($scope.deferredGetPistonList());
			//銘柄区分リストデータ取得
			deferredGetArr.push($scope.deferredGetProductKbnList());
			//ロケーショングループを非表示にする
			directiveControl.show($scope, 'locationGrp', false);
			//ロケーションCD活性化
			directiveControl.editable($scope, 'locationCd', true);
			//fromロケーションCD活性化
			directiveControl.editable($scope, 'fromLocationCd', true);
			//toロケーションCD活性化
			directiveControl.editable($scope, 'toLocationCd', true);
		}
		$q.all(
			deferredGetArr
		).then(function(response){
			deferred.resolve();
		});
		return deffer.promise;
	}

	// 在庫調査区分データ取得
	$scope.deferredGetInventoryInstKbnList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVENTORY_INST_KBN";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.inventoryInstKbnList = response.data;
			deferred.resolve();
			$scope.searchCondition.inventoryInstKbn = "00";
		});

		return deferred.promise;
	};

	// ライン/ブロックマスタデータ取得
	$scope.deferredGetLineBlockCdList = function(){
		var deferred = $q.defer();

		api.lineBlock.keyValueList({centerId: $scope.searchCondition.tinventoryH.mcenter.centerId}).then(function(response){
			$scope.lineBlockCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 方面ピストン(選択)マスタデータ取得
	$scope.deferredGetPistonList = function(){
		var deferred = $q.defer();

		api.directrestDirectionPiston.keyValueList({}).then(function(response){
			$scope.pistonList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// 倉庫マスタデータ取得
	$scope.deferredGetwarehouseList = function(){
		var deferred = $q.defer();

		api.warehouse.keyValueList({centerId: $scope.searchCondition.tinventoryH.mcenter.centerId}).then(function(response){
			$scope.wareList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// 預託データ取得
	$scope.deferredGetDepositList = function(){
		var deferred = $q.defer();

		api.depositeCustomer.keyValueList({clientCd: $scope.searchCondition.tinventoryH.mclient.clientCd}).then(function(response){
			$scope.depositCustomerList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// 在庫区分データ取得
	$scope.deferredGetStockTypeList = function(){
		var deferred = $q.defer();

		api.stockTypeList.keyValueList({clientCd: $scope.searchCondition.tinventoryH.mclient.clientCd}).then(function(response){
			$scope.stockTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// ロケーショングループデータ取得
	$scope.deferredGetLocationGrpList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LOC_GROUP";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.locationGrpList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// ゾーンリストデータ取得
	$scope.deferredGetZoneList = function(){
		var deferred = $q.defer();

		api.zoneList.keyValueList({}).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// 引当可能数+引当済数データ取得
	$scope.deferredStockTargetList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_TARGET";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.stockTargetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	
	// 銘柄区分リストデータ取得
	$scope.deferredGetProductKbnList = function(){
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SYHN_KBN";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response){
			$scope.productKbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#initScreenHttp
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		$q.all([
				$scope.deferredGetInitData()
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(
			function(response){
				$scope.deferredGetSelectList();
		})
		
		
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetInitData
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
	 *
	 * @description
	 * 在庫調査指示作成初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.inventoryCreate.init({centerCd:$scope.searchCondition.tinventoryH.mcenter.centerCd,clientCd:$scope.searchCondition.tinventoryH.mclient.clientCd}).then(function(response){
			statusInfo.isSuccessAndShowMessage(response,'createform');
			$scope.hozei = response.data.searchCondition.hozeFlag;
			deferred.resolve();

		});

		return deferred.promise;
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);