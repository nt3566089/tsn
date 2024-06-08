/**
 * @ngdoc overview
 * @name oneslogiWms.StockAdj
 *
 * @description
 * 在庫調整画面
 */
angular.module('oneslogiWms.StockAdj',[])
/**
 * @ngdoc service
 * @name oneslogiWms.StockAdj.service:stockAdjApi
 *
 * @description
 * 在庫調整WebApi定義<br>
 * ・resources/stock/stockAdj/initNew 初期処理WebApi<br>
 * ・resources/stock/stockAdj/initUpdate 初期処理（訂正）WebApi<br>
 * ・resources/stock/resources/stock/stockAdj/inputCheckUpdate 在庫調整登録前入力チェックWebApi<br>
 * ・resources/stock/stockAdj/register 在庫調整登録WebApi<br>
 * ・resources/stock/stockAdj/select 確定後在庫データ取得WebApi<br>
 * ・resources/common/product/record 商品データ取得<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分取得<br>
 * ・resources/common/processType/keyValueList 処理区分取得<br>
 * ・resources/common/location/record ロケーションデータ取得<br>
 * ・resources/common/supplierCustomer/record  仕入先データ取得<br>
 *
 */
.factory('stockAdjApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		),
		param: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/param/record']
				 ]
		),
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record'],
				 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				 ]
		),
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End
		productShape: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/productShape/record'],
				 ['unitNum', 'GET', 'resources/common/productShape/unitNum']
				 ]
		),
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),
		stockAdj: AngularAPIClient.make(
				[
				 ['initNew',           'GET',  'resources/stock/stockAdj/initNew'],
				 ['initUpdate',        'GET',  'resources/stock/stockAdj/initUpdate'],
				 ['inputCheckUpdate',  'POST', 'resources/stock/stockAdj/inputCheckUpdate'],
				 ['register',          'POST', 'resources/stock/stockAdj/register'],
				 ['select',            'GET',  'resources/stock/stockAdj/select']
				 ]
		)
	};
}])
// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
.controller('StockAdj', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'stockAdjApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){
// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var newProcessTypeList;
	var stockId_All;
	var inventoryId_All;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#initScreen
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 画面初期化処理<br>
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

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add Start
		// 画面表示用の複数荷姿リストmodel共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 複数荷姿用itemCdを定義
				id: "chargeNumMultiText",
				// 総数用itemCdを定義
				"chargeNum" : {
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "stockDataH.mproduct.mproductShapeList"
				},
				id: "chargeNum_AMultiText",
				"chargeNum_A" : {
					model : angular.copy(multiTextModels),
					listModel : "stockDataH.mproduct.mproductShapeList"
				},
				id: "adjNumMultiText",
				"adjNum" : {
					model : angular.copy(multiTextModels),
					listModel : "stockDataH.mproduct.mproductShapeList"
				}
		};
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Add End

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.stockDataH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList(1)
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
			//在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList(1)
			.then(function(response){
				newStockTypeList = response.data;
			});
			// 入庫No管理の取得
			$scope.param(1);
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.stockDataH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
			}
		};

		$scope.adjNumCheck = function(adjNum) {
			if (owsCommon.isZeroOrLess(adjNum)) {
				return false;
        	}
        	return true;
        };
        $scope.adjNumMessage = $filter('owfMessage')("minIsOneError");

		// 検索結果を表示、非活性
		$scope.controlEditableInit();
        // 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#changeClient
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託と在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList(1)
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});

		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList(1)
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});

		// 入庫No管理の取得
		$scope.param(1);
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
		if (clearSelected) {
			// クリアする

			if ($scope.depositStockTypeList.length == 1) {
				// 選択肢が一つしかない場合は選択状態にする

				$scope.stockDataH.mcustomer.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.stockDataH.mcustomer.customerCd = null;
			}
		}
		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
		if (clearSelected) {
			// クリアする

			if ($scope.stockTypeList.length == 1) {
				// 選択肢が一つしかない場合は選択状態にする

				$scope.stockDataH.mstockType.stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
			} else {
				$scope.stockDataH.mstockType.stockTypeCd = null;
			}
		}
		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#initScreenHttp
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 *  画面初期化用の通信制御処理r>
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDepositStockTypeList(0),
				 $scope.deferredGetStockTypeList(0),
				 $scope.deferredGetProcessTypeList(),
				 $scope.param(0)
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	//確定データ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {
			// 訂正
			var request = {};
			request.stockId = $route.current.params.stockId;
			request.inventoryId = $route.current.params.inventoryId;
			$scope.stockId_All = $route.current.params.stockId;
			$scope.inventoryId_All = $route.current.params.inventoryId;
			$scope.initUpdate(request.stockId,request.inventoryId).then(function() {

				// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
				// 選択肢が一つの場合は一つ目を設定
				if ($scope.processTypeList.length == 1) {
					$scope.stockDataH.processTypeCd = $scope.processTypeList[0].processTypeCd;
				}
				// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('updateform');
				// [Ver3.0] unit of measure対応 2017.11.27 ライ START
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END
				deferred.resolve();
			});

		}else{
			api.stockAdj.initNew().then(function(response){
				$scope.stockDataH = response.data.head;
				$scope.stockDataB = response.data.body;
				$scope.stockDataH.mclient.clientCd = userInfo.clientCd;
				$scope.stockDataH.mlocation.mcenter.centerCd = userInfo.centerCd;
				// [エンハンス PH2.0] 修正モード、入庫日使用不可 2015.11.19 sja Start
				$scope.stockDataH.tstoreNo.storeDt = userInfo.systemDt;
				// [エンハンス PH2.0] 修正モード、入庫日使用不可 2015.11.19 sja End

				// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
				// 選択肢が一つの場合は一つ目を設定
				if ($scope.processTypeList.length == 1) {
					$scope.stockDataH.processTypeCd = $scope.processTypeList[0].processTypeCd;
				}
				// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End

				// 荷主変更後処理
				$scope.changeClient(true);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 預託在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList = function(index) {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		if (index == 0) {
			//荷主センタ変更対応 201７.03.01 sja Start
		//	request.clientCd = userInfo.clientCd;
			if($route.current.params){
				request.clientCd = $route.current.params.clientCd;
			}else{
				request.clientCd = userInfo.clientCd;
			}
			//荷主センタ変更対応 201７.03.01 sja End
		}else{
			request.clientCd = $scope.stockDataH.mclient.clientCd;
		}

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositStockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#deferredGetStockTypeList
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function(index) {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		if(index == 0 ){
			request.clientCd = userInfo.clientCd;
		}else{
			request.clientCd = $scope.stockDataH.mclient.clientCd;
		}

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			$scope.stockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
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
		request.moveFlg = "1";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#productBlur
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.stockDataH.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.stockDataH.mclient.clientCd);
			request.productCd = productCd;

			$scope.stockDataH.mproduct.productNm = null;
			$scope.stockDataH.mproduct.janCd = null;
			$scope.stockDataH.mproduct.productAbbr = null;

			api.product.record(request).then(function(response){
				$scope.stockDataH.mproduct.productNm = response.data.mProduct.productNm;
				$scope.stockDataH.mproduct.janCd = response.data.mProduct.janCd;
				$scope.stockDataH.mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.stockDataH.mproduct.lotManagFlg = response.data.mProduct.lotManagFlg;
				$scope.stockDataH.mproduct.limitDtManagFlg = response.data.mProduct.limitDtManagFlg;
				directiveControl.editable($scope, 'limitDt', false);
				optionMessageControl.hide($scope, 'limitDt');
				directiveControl.editable($scope, 'lot', false);
				optionMessageControl.hide($scope, 'lot');
				// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正(不要なソースを削除) 2015.07.27 kawana

				//該当商品がロット管理対象の場合のみ、入力可能であり必須項目
				if($scope.stockDataH.mproduct.lotManagFlg == "1"){
					directiveControl.editable($scope, 'lot', true);
				}else{
					directiveControl.editable($scope, 'lot', false);
					optionMessageControl.hide($scope, 'lot');
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana Start
					$scope.stockDataH.tlot.lot = null;
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana End
				}
				//該当商品が期限日管理対象の場合のみ、入力可能であり必須項目
				if($scope.stockDataH.mproduct.limitDtManagFlg == "1"){
					directiveControl.editable($scope, 'limitDt', true);
				}else{
					directiveControl.editable($scope, 'limitDt', false);
					optionMessageControl.hide($scope, 'limitDt');
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana Start
					$scope.stockDataH.tlot.limitDt = null;
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana End
				}

				var productId  = response.data.mProduct.productId;
				if(productId != null){
					if (String(productId) && 0 < String(productId).length) {
						// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
						var request = {};
						request.clientId = userInfo.clientIdByCd($scope.stockDataH.mclient.clientCd);
						request.productCd = productCd;
						// 商品に紐付く商品荷姿リスト取得(荷姿グループ明細含む)
						api.product.productShape(request).then(function(response){
							if(response != null){
								$scope.stockDataH.mproduct.mproductShapeList = response.data.mProduct.mproductShapeList;
								$scope.wkProductShapeList = response.data.mProduct.mproductShapeList;
								// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
								//商品?位
								$scope.stockDataH.productUnit = response.data.mProduct.productUnit;
								// [Ver3.0] unit of measure対応 2017.11.27 ライ END
								// 入数取得
								$scope.stockDataH.unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);
							}
						});
						// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End
					}
				}else{
					// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
					$scope.stockDataH.unitNumBreakdown = null;
					// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End
					// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
					$scope.stockDataH.productUnit = null;
					// [Ver3.0] unit of measure対応 2017.11.27 ライ END
				}
			});

			} else {
				// [Ver3.0] unit of measure対応 2018.1.21 ライ Start
				$scope.stockDataH.productUnit = null;
				$scope.stockDataH.unitNumBreakdown = null;
				// [Ver3.0] unit of measure対応 2018.1.21 ライ END
				$scope.stockDataH.mproduct.productNm = null;
				$scope.stockDataH.mproduct.janCd = null;
				$scope.stockDataH.mproduct.productAbbr = null;
				$scope.stockDataH.tlot.lot = null ;
				$scope.stockDataH.tlot.limitDt = null ;
				directiveControl.editable($scope, 'limitDt', false);
				optionMessageControl.hide($scope, 'limitDt');
				directiveControl.editable($scope, 'lot', false);
				optionMessageControl.hide($scope, 'lot');
			}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#showProduct
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.stockDataH.mclient.clientCd,
				productCd: $scope.stockDataH.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.stockDataH.mproduct.productCd =  selectedItem.productCd;
			$scope.stockDataH.mproduct.productNm =  selectedItem.productNm;
			$scope.stockDataH.mproduct.productAbbr =  selectedItem.productAbbr;
			$scope.stockDataH.mproduct.janCd =  selectedItem.janCd;
			$scope.stockDataH.mproduct.lotManagFlg = selectedItem.lotManagFlg;
			$scope.stockDataH.mproduct.limitDtManagFlg = selectedItem.limitDtManagFlg;
			directiveControl.editable($scope, 'lot', false);
			optionMessageControl.hide($scope, 'lot');
			directiveControl.editable($scope, 'limitDt', false);
			optionMessageControl.hide($scope, 'limitDt');
			$scope.stockDataH.tlot.lot = null ;
			$scope.stockDataH.tlot.limitDt = null ;
			//該当商品がロット管理対象の場合のみ、入力可能であり必須項目
			if($scope.stockDataH.mproduct.lotManagFlg == "1"){
				directiveControl.editable($scope, 'lot', true);
			}else{
				directiveControl.editable($scope, 'lot', false);
				optionMessageControl.hide($scope, 'lot');
			}
			//該当商品が期限日管理対象の場合のみ、入力可能であり必須項目
			if($scope.stockDataH.mproduct.limitDtManagFlg == "1"){
				directiveControl.editable($scope, 'limitDt', true);
			}else{
				directiveControl.editable($scope, 'limitDt', false);
				optionMessageControl.hide($scope, 'limitDt');
			}

			var productId  = selectedItem.productId;
			if(productId != null){
				if (String(productId) && 0 < String(productId).length) {
					// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja Start
					var request = {};
					request.clientId = userInfo.clientIdByCd($scope.stockDataH.mclient.clientCd);
					request.centerId = userInfo.centerIdByCd($scope.stockDataH.mlocation.mcenter.centerCd);
					request.productId = productId;
					request.caseFlg = "1";
					api.productShape.unitNum(request).then(function(response){
						if(response == null){
							$scope.stockDataH.unitNum = 0;
						}else{
							$scope.stockDataH.unitNum = response.data.mProductShape.unitNum;
						}
					});
					// [エンハンス PH2.0] 入数の設定値を変更 2015.11.19 sja End
				}
			}else{
				$scope.stockDataH.unitNum = null;
			}
		});

		var strProductCd = $scope.stockDataH.mproduct.productCd;
		if(strProductCd && 0 < strProductCd.length){
		}else{
			directiveControl.editable($scope, 'lot', false);
			optionMessageControl.hide($scope, 'lot');
			directiveControl.editable($scope, 'limitDt', false);
			optionMessageControl.hide($scope, 'limitDt');
			$scope.stockDataH.tlot.lot = null ;
			$scope.stockDataH.tlot.limitDt = null ;
		}
	};

	// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#locationCdBlur
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function() {
		// 入力されたロケーションCD
		var locationCd = $scope.stockDataH.mlocation.locationCd;

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.stockDataH.mlocation.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){

				// ロケーション名称を表示
				$scope.stockDataH.mlocation.locationNm = response.data.mLocation.locationNm;
			});
		} else {

			// ロケーション名称をクリア
			$scope.stockDataH.mlocation.locationNm = null;
		}
	};
	// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#showLocation
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(){

		var items = {
				centerCd: $scope.stockDataH.mlocation.mcenter.centerCd,
				locationCd: $scope.stockDataH.mlocation.locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.stockDataH.mlocation.locationCd = selectedItem.locationCd;
			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start
			$scope.stockDataH.mlocation.locationNm = selectedItem.locationNm;
			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#customerCdBlur
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 仕入先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された仕入先コードを取得
		var customerCd = $scope.stockDataH.tstoreNo.mcustomer.customerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.stockDataH.mclient.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.stockDataH.tstoreNo.mcustomer.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.stockDataH.tstoreNo.mcustomer.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#showCustomer
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var items = {
				clientCd: $scope.stockDataH.mclient.clientCd,
				vendorCd: $scope.stockDataH.tstoreNo.mcustomer.customerCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

		$scope.stockDataH.tstoreNo.mcustomer.customerCd = selectedItem.customerCd;
		$scope.stockDataH.tstoreNo.mcustomer.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#adjNumBlur
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 調整数量のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.adjNumBlur = function() {
		// 入力された仕入先コードを取得

		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
		owsCommon.syncExec(function() {
			var processTypeCd = $scope.stockDataH.processTypeCd;
			// 調整前総数
			var chargeNum = $scope.stockDataH.chargeNum;
			// 調整総数
			var adjNum = $scope.stockDataH.adjNum;

			// [#2799][Ver3.0] unit of measure対応(数値判定追加) 2018.04.04 honma Mod Start
			if (adjNum == null || adjNum == "" || !isFinite(adjNum)) {
			// [#2799][Ver3.0] unit of measure対応(数値判定追加) 2018.04.04 honma Mod Start
				$scope.stockDataH.chargeNum_A = null;
			} else {
				if("23" == processTypeCd){
					// 調整後総数
					// [Ver3.0] unit of measure対応 2017.11.27 ライ START
					$scope.stockDataH.chargeNum_A = owsCommon.subtract($scope.stockDataH.chargeNum,$scope.stockDataH.adjNum);
				}else if("24" == processTypeCd){
					// 調整後総数
					$scope.stockDataH.chargeNum_A = owsCommon.add($scope.stockDataH.chargeNum,$scope.stockDataH.adjNum);
				}
			}		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
			// [#2799][Ver3.0] unit of measure 対応 調整後総数の複数荷姿計算処理呼び出し 2018.03.22 honma Mod Start
			owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.stockDataH.chargeNum_A, "multiTextOptions", "chargeNum_A");
			// [#2799][Ver3.0] unit of measure 対応 調整後総数の複数荷姿計算処理呼び出し 2018.03.22 honma Mod End
		});
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockAdj.object:stockAdj#initUpdate
	 * @methodOf oneslogiWms.stockAdj.object:stockAdj
	 *
	 * @description
	 * 更新モードの初期処理<br>
	 */
	$scope.initUpdate = function(stockId,inventoryId){
		var deferred = $q.defer();

		// [ON推-品向-597] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var isError = $scope.searchform.$invalid;
		var request = {};
		request.data = {};
		request.stockId = stockId;
		request.inventoryId = inventoryId;

		api.stockAdj.initUpdate(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				$scope.stockDataH = response.data.head;
				$scope.stockDataB = response.data.body;
				$scope.stockDataB.stockId = $scope.stockId_All;
				$scope.stockDataB.inventoryBId = $scope.inventoryId_All;
				// [C-NIS-0003] ケース数・ピース数を追加 2015.07.01 hayasi Start
				var unitNum = response.data.head.unitNum;

				if(unitNum == null || unitNum == "" || unitNum == 0){
					$scope.stockDataH.casePreChargeNum = 0;
					$scope.stockDataH.piecePreChargeNum = response.data.head.chargeNum;
				}else{
					$scope.stockDataH.casePreChargeNum = owsCommon.divide(response.data.head.chargeNum, unitNum);
					$scope.stockDataH.piecePreChargeNum = owsCommon.remainder(response.data.head.chargeNum, unitNum);
				}
				// [C-NIS-0003] ケース数・ピース数を追加 2015.07.01 hayasi End

				// [横並-131] 在庫移動指示備考取得を追加 2014.11.20 kei Start
				var strMsg = $filter('owfMessage')("stockMoveRemarksInformation");
				if($scope.stockDataB.inventoryBId !=null){
					$scope.stockDataH.instComment = strMsg +"（" + String(userInfo.systemDt).substr(0,4) + "/" + String(userInfo.systemDt).substr(4,2) + "/" + String(userInfo.systemDt).substr(6,2) + ")";
				}
				// [横並-131] 在庫移動指示備考取得を追加 2014.11.20 kei End

				// [ON推-品向-963] 棚卸からの在庫調整の場合は処理区分、調整数を入力不可に変更 2015.10.05 kawana Start
				// 棚卸入力からの遷移か判定
				var isInventory = false;
				if (inventoryId) {
					isInventory = true;
				}

				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
				// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum', 'chargeNumMultiText', response.data.head.mproduct.productId);
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_A', 'chargeNum_AMultiText', response.data.head.mproduct.productId);
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'adjNum', 'adjNumMultiText', response.data.head.mproduct.productId);
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End

				// 検索結果を表示、非活性
				$scope.controlEditableConfirm(isInventory);
				// [ON推-品向-963] 棚卸からの在庫調整の場合は処理区分、調整数を入力不可に変更 2015.10.05 kawana End
				deferred.resolve();
			}else{
				// 前画面へ戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				deferred.reject();
			}
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockAdj.object:stockAdj#confirm
	 * @methodOf oneslogiWms.stockAdj.object:stockAdj
	 *
	 * @description
	 * 確定 押下された時に処理<br>
	 * 商品マスタチェック、画面コントロール活性化変更処理
	 */
	$scope.confirm = function(){

		optionMessageControl.hide($scope, 'productCd');
		optionMessageControl.hide($scope, 'locationCd');
		optionMessageControl.hide($scope, 'lot');
		optionMessageControl.hide($scope, 'limitDt');
		optionMessageControl.hide($scope, 'supplierCustomerCd');

		var lot = $scope.stockDataH.tlot.lot;
		var limitDt = $scope.stockDataH.tlot.limitDt;
		var error = false;
		if (directiveControl.isEditable($scope,'lot')){
			if (!(lot && 0 < lot.length) ) {
				optionMessageControl.show($scope, 'lot', owsCommon.convertMessage('requiredError'));
				error = true;
			}
		}

		if (directiveControl.isEditable($scope,'limitDt')){
			if (!(limitDt && 0 < limitDt.length) ) {
				optionMessageControl.show($scope, 'limitDt', owsCommon.convertMessage('requiredError'));
				error = true;
			}
		}

		if ( error ) {
			return;
		}

		// [ON推-品向-597] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var bln = false ;
		var isError = $scope.searchform.$invalid;
		var request = {};
		request.data = {};
		request.data.head = $scope.stockDataH;
		request.data.body = $scope.stockDataB;

		api.stockAdj.select(request).then(function(response) {
			// 処理結果確認
			if (response.status.listStatus != null){
				for (var i = 0 ;i <response.status.listStatus.length;i++){
					//仕入先マスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 2){
						optionMessageControl.show($scope, "supplierCustomerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//商品マスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 3){
						optionMessageControl.show($scope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//ロケーションマスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 4){
						optionMessageControl.show($scope, "locationCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//ロケーションマスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 8){
						optionMessageControl.show($scope, "locationCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}

					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD START
					///預託在庫区分預託在庫区分が存在しません
					if (response.status.listStatus[i].status.statusCode == 9){
						optionMessageControl.show($scope, "depositCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD END
				}
			}

			if(bln == true){
				return ;
			}
			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				$scope.stockDataH = response.data.head;
				$scope.stockDataB = response.data.body;

				// [C-NIS-0003] ケース数・ピース数を追加 2015.06.30 hayasi Start
				$scope.stockDataH.casePreChargeNum = 0;
				$scope.stockDataH.piecePreChargeNum = 0;
				// [C-NIS-0003] ケース数・ピース数を追加 2015.06.30 hayasi End

				// [#2799][Ver3.0] unit of measure 対応 2017.12.05 Add Start
				// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum', 'chargeNumMultiText', response.data.head.mproduct.productId);
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_A', 'chargeNum_AMultiText', response.data.head.mproduct.productId);
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'adjNum', 'adjNumMultiText', response.data.head.mproduct.productId);
				// [#2799][Ver3.0] unit of measure 対応 2017.12.05 Add End

				// [ON推-品向-963] 棚卸からの在庫調整の場合は処理区分、調整数を入力不可に変更 2015.10.05 kawana Start
				// 検索結果を表示、非活性
				$scope.controlEditableConfirm(false);
				// [ON推-品向-963] 棚卸からの在庫調整の場合は処理区分、調整数を入力不可に変更 2015.10.05 kawana End

				// [NISHI-UT-006] 確定ボタン押下後のフォーカスを設定 2015.07.09 kawana Start
				owsCommon.syncExec(function() {
					owsCommon.setFirstFocus('updateform');
				},100);
				// [NISHI-UT-006] 確定ボタン押下後のフォーカスを設定 2015.07.09 kawana End

				optionMessageControl.hide($scope, 'processTypeCd');
				optionMessageControl.hide($scope, 'adjNum');

				var processTypeCd = $scope.stockDataH.processTypeCd;
				var adjNum = $scope.stockDataH.adjNum;
				var error = false;
				if ( !(processTypeCd && 0 < processTypeCd.length) ) {
					optionMessageControl.show($scope, 'processTypeCd', owsCommon.convertMessage('requiredError'));
					error = true;
				}
				if (!(adjNum && 0 < adjNum.length) || owsCommon.isZeroOrLess(adjNum)) {
					optionMessageControl.show($scope, 'adjNum', owsCommon.convertMessage('numericValueInputRequestMoreThanOneError'));
					error = true;
				}
				if(isNaN(adjNum)){
					optionMessageControl.show($scope, 'adjNum', owsCommon.convertMessage('numberError'));
					error = true;
				}

				if ( error ) {
					return;
				}
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockAdj.object:stockAdj#update
	 * @methodOf oneslogiWms.stockAdj.object:stockAdj
	 *
	 * @description
	 * 登録ボタンを押下された時に処理<br>
	 * 在庫更新する
	 * 棚卸データ更新する
	 */
	$scope.update = function() {

		optionMessageControl.hide($scope, 'processTypeCd');
		optionMessageControl.hide($scope, 'adjNum');

		var processTypeCd = $scope.stockDataH.processTypeCd;
	    // [Ver3.0] unit of measure対応 2017.12.28 ライ START
		var adjNum = ($scope.stockDataH.adjNum).toString();
	    // [Ver3.0] unit of measure対応 2017.12.28 ライ END
		var chargeNum_A = $scope.stockDataH.chargeNum_A;
		var error = false;

		if($scope.adjNumform.$invalid){
			error = true;
		}
		if ( !(processTypeCd && 0 < processTypeCd.length) ) {
			optionMessageControl.show($scope, 'processTypeCd', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if (!(adjNum && 0 < adjNum.length) || owsCommon.isZeroOrLess(adjNum)) {
			optionMessageControl.show($scope, 'adjNum', owsCommon.convertMessage('numericValueInputRequestMoreThanOneError'));
			error = true;
		}
		if(isNaN(adjNum)){
			optionMessageControl.show($scope, 'adjNum', owsCommon.convertMessage('numberError'));
			error = true;
		}
		if (owsCommon.isNegative(chargeNum_A)) {
			optionMessageControl.show($scope, 'adjNum', owsCommon.convertMessage('stockAdjustmentQtyCannotInputMoreThanBeforeError'));
			error = true;
		}

		// [ON推-品向-854] 不要な桁数チェックを削除 2015.07.06 kawana

		if ( error ) {
			return;
		}

		var bln = false ;

		// [ON推-品向-597] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var isError = $scope.searchform.$invalid;
		var request = {};
		request.data = {};
		request.data.head = $scope.stockDataH;
		request.data.body = $scope.stockDataB;

		//在庫調整登録前入力チェック
		api.stockAdj.inputCheckUpdate(request).then(function(response) {

			// 処理結果確認
			if (response.status.listStatus != null){
				for (var i = 0 ;i <response.status.listStatus.length;i++){
					//仕入先マスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 2){
						optionMessageControl.show($scope, "supplierCustomerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//商品マスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 3){
						optionMessageControl.show($scope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//ロケーションマスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 4){
						optionMessageControl.show($scope, "locationCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}

					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD START
					///預託在庫区分預託在庫区分が存在しません
					if (response.status.listStatus[i].status.statusCode == 9){
						optionMessageControl.show($scope, "depositCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-184 2014/11/18 ADD END
					// [検査-240] ロット期限日チェック追加 2014/12/08 KI Start
					// if (response.status.listStatus[i].status.statusCode == 10){
						// alertMessage.setErrorMessageByCode("adjLotLimitdtChangeError")
						// bln = true ;
					// }
					// [検査-240] ロット期限日チェック追加 2014/12/08 KI End
				}
			}

			if(bln == true){
				return ;
			}

			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				//在庫調整登録
				api.stockAdj.register(request).then(function(response) {
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 画面モード判定
						if ($scope.screenMode == SCREEN_MODE.Update) {
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						}else{
							$scope.initScreen();
							// 検索結果を表示、非活性
							$scope.controlEditableInit();
						}
					}
				});
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockAdj.object:stockAdj#controlEditableInit
	 * @methodOf oneslogiWms.stockAdj.object:stockAdj
	 *
	 * @description
	 * 画面初期処理<br>
	 *
	 * 検索結果を表示、非活性
	 */
	$scope.controlEditableInit = function(){
		directiveControl.editable($scope, 'clientCd', true);
		directiveControl.editable($scope, 'centerCd', true);
		directiveControl.editable($scope, 'warehouseCd', true);
		directiveControl.editable($scope, 'productCd', true);
		directiveControl.editable($scope, 'depositCd', true);
		directiveControl.editable($scope, 'stockTypeCd', true);
		directiveControl.editable($scope, 'locationCd', true);
		directiveControl.editable($scope, 'storeLabelNo', true);
		directiveControl.editable($scope, 'supplierCustomerCd', true);
		directiveControl.editable($scope, 'confirm', true);
		directiveControl.editable($scope, 'storeLabelNo_B', false);
		// [#4222] 商品単位、入数内訳の非活性を項目マスタで行うように変更(該当処理の削除) 2018.04.04 kawana
		directiveControl.editable($scope, 'lot', false);
		directiveControl.editable($scope, 'limitDt', false);
		directiveControl.editable($scope, 'chargeNum', false);
		directiveControl.editable($scope, 'chargeNum_A', false);
		directiveControl.editable($scope, 'processTypeCd', false);
		directiveControl.editable($scope, 'adjNum', false);
		directiveControl.editable($scope, 'moveInstComment', false);
		directiveControl.editable($scope, 'update', false);
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
		for (var i = 0; i < 4; i++) {
			// 編集可否処理IDの作成
			var wkChargeNumMultiTextCd = "chargeNumMultiText" + (i + 1);
			var wkChargeNum_AMultiTextCd = "chargeNum_AMultiText" + (i + 1);
			var wkAdjNumMultiTextCd = "adjNumMultiText" + (i + 1);
			directiveControl.editable($scope, wkChargeNumMultiTextCd, false);
			directiveControl.editable($scope, wkChargeNum_AMultiTextCd, false);
			directiveControl.editable($scope, wkAdjNumMultiTextCd, false);
		}
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod End
		// [エンハンス PH2.0] 修正モード、入庫日使用可 2015.11.19 sja Start
		directiveControl.editable($scope, 'storeDt', true);
		// [エンハンス PH2.0] 修正モード、入庫日使用可 2015.11.19 sja End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockAdj.object:stockAdj#controlEditableConfirm
	 * @methodOf oneslogiWms.stockAdj.object:stockAdj
	 *
	 * @description
	 * 確定ボタン押下後、画面処理<br>
	 *
	 * 検索結果を表示、非活性
	 */
	$scope.controlEditableConfirm = function(isInventory){
		directiveControl.editable($scope, 'clientCd', false);
		directiveControl.editable($scope, 'centerCd', false);
		directiveControl.editable($scope, 'warehouseCd', false);
		directiveControl.editable($scope, 'productCd', false);
		directiveControl.editable($scope, 'depositCd', false);
		directiveControl.editable($scope, 'stockTypeCd', false);
		directiveControl.editable($scope, 'locationCd', false);
		directiveControl.editable($scope, 'lot', false);
		directiveControl.editable($scope, 'limitDt', false);
		directiveControl.editable($scope, 'storeLabelNo', false);
		directiveControl.editable($scope, 'supplierCustomerCd', false);
		// [エンハンス PH2.0] 修正モード、入庫日使用不可 2015.11.19 sja Start
		directiveControl.editable($scope, 'storeDt', false);
		// [エンハンス PH2.0] 修正モード、入庫日使用不可 2015.11.19 sja End
		// [ON推-品向-963] 棚卸からの在庫調整の場合は処理区分、調整数を入力不可に変更 2015.10.05 kawana Start
		// [C-NIS-0003] ケース数・ピース数を追加 2015.07.01 hayasi Start
		// [#4222] 商品単位、入数内訳の非活性を項目マスタで行うように変更(該当処理の削除) 2018.04.04 kawana
		directiveControl.editable($scope, 'confirm', false);

		if(isInventory) {
			// 棚卸入力からの差異調整のため自動入力(手入力不可)

			directiveControl.editable($scope, 'processTypeCd', false);
			directiveControl.editable($scope, 'caseAdjNum', false);
			directiveControl.editable($scope, 'pieceAdjNum', false);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			owsCommon.syncExec(function() {
				for (var i = 0; i < 4; i++) {
					// 編集可否処理IDの作成
					var wkAdjNumMultiTextCd = "adjNumMultiText" + (i + 1);
					directiveControl.editable($scope, wkAdjNumMultiTextCd, false);
				}
				owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.stockDataH.adjNum, "multiTextOptions", "adjNum");
			});
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		} else {
			// 通常の確定

			directiveControl.editable($scope, 'processTypeCd', true);
			// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
			directiveControl.editable($scope, 'adjNum', true);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
		}
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
		owsCommon.syncExec(function() {
			for (var i = 0; i < 4; i++) {
				// 編集可否処理IDの作成
				var wkChargeNumMultiTextCd = "chargeNumMultiText" + (i + 1);
				var wkChargeNum_AMultiTextCd = "chargeNum_AMultiText" + (i + 1);
				directiveControl.editable($scope, wkChargeNumMultiTextCd, false);
				directiveControl.editable($scope, wkChargeNum_AMultiTextCd, false);
			}
			owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.stockDataH.chargeNum, "multiTextOptions", "chargeNum");
			owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.stockDataH.chargeNum_A, "multiTextOptions", "chargeNum_A");
		});
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End

		directiveControl.editable($scope, 'moveInstComment', true);
		directiveControl.editable($scope, 'update', true);
		// [C-NIS-0003] ケース数・ピース数を追加 2015.07.01 hayasi End
		// [ON推-品向-963] 棚卸からの在庫調整の場合は処理区分、調整数を入力不可に変更 2015.10.05 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockAdj.object:StockAdj#customerCdBlur
	 * @methodOf oneslogiWms.StockAdj.object:StockAdj
	 *
	 * @description
	 * 入庫No管理処理<br>
	 *
	 * サーバとの通信を行い、入庫No管理を取得し画面項目に反映する。
	 */
	$scope.param = function(index) {

		// 入力された荷主コードを取得
		var clientCd = "";
		// 入力されたセンタコードを取得
		var centerCd = "";
		var strStoreNoFlg = "";

		if (index == 0) {
			clientCd = userInfo.clientCd;
			centerCd = userInfo.centerCd;
		}else{
			clientCd = $scope.stockDataH.mclient.clientCd;
			centerCd = $scope.stockDataH.mlocation.mcenter.centerCd;
		}

		if(clientCd && 0 < clientCd.length && centerCd && 0 < centerCd.length) {
			var request = {};
			request.clientCd = clientCd;
			request.centerCd = centerCd;

			// パラメータ情報の取得
			// [ON推-品向-409] 同期処理にする。 2014.12.04 koseki Start
			var deferred = $q.defer();
			api.param.record(request).then(function(response){
				strStoreNoFlg = response.data.mParam.storeNoFlg;
				if(strStoreNoFlg == "1"){
					directiveControl.editable($scope, 'storeLabelNo', true);
				}else{
					directiveControl.editable($scope, 'storeLabelNo', false);
				}
				deferred.resolve();
			});
			return deferred.promise;
			// [ON推-品向-409] 同期処理にする。 2014.12.04 koseki End
		} else {
			directiveControl.editable($scope, 'storeLabelNo', false);
		}
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);

