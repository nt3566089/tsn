/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryInputAddRow
 *
 * @description
 * 棚卸データ作成
 */
angular.module('oneslogiWms.InventoryInputAddRow',[])
/**
 * @ngdoc service
 * @name oneslogiWms.InventoryInputAddRow.service:InventoryInputAddRowApi
 *
 * @description
 * 棚卸データ作成操作用WebApi<br>
 * ・resources/inventory/inventoryCreate/init   画面用初期データ取得<br>
 * ・resources/inventory/inventoryCreate/inputCheck   入力チェック<br>
 * ・resources/inventory/inventoryCreate/register   棚卸データ作成<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/wmsCommon/depositCustomerList  預託データ取得<br>
 * ・resources/common/stockType/keyValueList  在庫区分データ取得<br>
 * ・resources/common/location/record  ロケーションデータ取得<br>
 *
 */
.factory('InventoryInputAddRowApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		stockTarget: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
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
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record'],
				// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
				 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				// [Ver3.0] unit of measure対応 2017.12.4 潘 End
				 ]
		),
		// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja Start
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start
		productShape: AngularAPIClient.make(
				[
				 ['productRecordwithShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				 ]
		),
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End
		// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja End
		storeNo: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/storeNo/record']
				 ]
		),
		inventoryInputAddRow: AngularAPIClient.make(
				[
				 ['init',  'GET', 'resources/inventory/inventoryInputAddRow/init'],
				 ['inputCheck',  'POST', 'resources/inventory/inventoryInputAddRow/inputCheck']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.inventoryInputAddRow.object:inventoryInputAddRow
 *
 * @description
 * 棚卸データ作成画面コントローラ
 */
// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
.controller('InventoryInputAddRow', ['$scope', '$modalInstance','$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'InventoryInputAddRowApi',"items", function($scope,$modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api,items){
// [Ver3.0] unit of measure対応 2017.12.4 潘 End
	// 画面初期化処理
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
		// 画面表示用の複数荷姿リストmodel共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 複数荷姿用itemCdを定義
				id: "inventoryNumMultiText",
				// 総数用itemCdを定義
				"inventoryNum" : {
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "conditionB.mproduct.mproductShapeList"
				}
		};
		// [Ver3.0] unit of measure対応 2017.12.4 潘 End

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.conditionH.mclient.clientCd;
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

		// 預託変更の監視設定（選択内容変更時）
		$scope.depositChange = function() {
			var depositCd = $scope.conditionB.mcustomerByDepositId.customerCd;
			if (depositCd && depositCd.length > 0){
				for (var i = 0 ; i < $scope.depositStockTypeList.length ; i ++){
					var tempDepositCd = $scope.depositStockTypeList[i].mCustomer.customerCd;
					if (depositCd == tempDepositCd){
						$scope.conditionB.mcustomerByDepositId.customerNm = $scope.depositStockTypeList[i].mCustomer.customerNm;
					}
				}
			}

		};

		// 在庫区分変更の監視設定（選択内容変更時）
		$scope.stockTypeChange = function() {
			var stockTypeCd = $scope.conditionB.mstockType.stockTypeCd;
			if (stockTypeCd && stockTypeCd.length > 0){
				for (var i = 0 ; i < $scope.stockTypeList.length ; i ++){
					var tempStockTypeCd = $scope.stockTypeList[i].stockTypeCd;
					if (stockTypeCd == tempStockTypeCd){
						$scope.conditionB.mstockType.vdict.dictNm = $scope.stockTypeList[i].stockTypeNm;
					}
				}
			}

		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.conditionH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList, true);
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
				 //$scope.deferredGetConditionList()
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};


	// プリントデータ取得DTOの初期化
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.inventoryInputAddRow.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'addrowform')) {
				deferred.reject();
				return;
			}

			$scope.conditionH = response.data.head;
			$scope.conditionB = response.data.body;
			$scope.conditionH.mclient.clientCd = userInfo.clientCd;
			$scope.conditionH.mcenter.centerCd = userInfo.centerCd;
			$scope.conditionH.inventoryDt = userInfo.systemDt;

			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
			multiTextControl.setMultiText($scope, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText', response.data.body.mproduct.productId);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End

			// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja Start
			$scope.conditionB.storeDt = userInfo.systemDt;
			// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja End

			// 参照元画面の情報を設定
			if (items) {
				$scope.conditionH.mclient.clientCd = items.clientCd;
				//荷主センタ変更対応 201７.02.24 sja Start
				$scope.conditionH.mclient.clientNm = items.clientNm;
				//荷主センタ変更対応 201７.02.24 sja End
				$scope.conditionH.mcenter.centerCd = items.centerCd;
				//荷主センタ変更対応 201７.02.24 sja Start
				$scope.conditionH.mcenter.centerNm = items.centerNm;
				//荷主センタ変更対応 201７.02.24 sja End

				// [#4705] 倉庫CDの指定を削除 2018.06.13 kawana Delete

				$scope.conditionH.inventoryDt = items.inventoryDt;

				// [#4705][v3.0] 入庫日管理をしない場合は入庫日を非活性にする 2018.06.13 kawana Start

				if (items.storeDtFlg == "1") {
					// 入庫日管理する

					// 入庫日は空にする (入力させる)
					$scope.conditionB.storeDt = null;
				} else {
					// 入庫日管理しない

					// 非活性にする
					var screenScope = angular.element($("div[owd-screen = 'InventoryInputAddRow']")).scope();
					directiveControl.editable(screenScope, 'storeDt', false);
				}

				// [#4705][v3.0] 入庫日管理をしない場合は入庫日を非活性にする 2018.06.13 kawana End
			}

			// 荷主変更後処理
			$scope.changeClient(true);
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			// [ON推-品向-212] フォーカス設定を修正 2014.12.01 SJA-ZHENG Start
			owsCommon.setFirstFocus('addrowform');
			// [ON推-品向-212] フォーカス設定を修正 2014.12.01 SJA-ZHENG End

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
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
		request.clientCd = $scope.conditionH.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#changeClient
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託と在庫区分リストデータを再度取得し画面項目に反映する。
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

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			// [EC-CT1-020] 預託、在庫区分が一つのみの場合は選択 2015.02.12 kawana Start
			if ($scope.depositStockTypeList.length == 1) {
				$scope.conditionB.mcustomerByDepositId.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
				$scope.conditionB.mcustomerByDepositId.customerNm = $scope.depositStockTypeList[0].mCustomer.customerNm;
			} else {
				$scope.conditionB.mcustomerByDepositId.customerCd = null;
				$scope.conditionB.mcustomerByDepositId.customerNm = null;
			}
			// [EC-CT1-020] 預託、在庫区分が一つのみの場合は選択 2015.02.12 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryCreate.object:InventoryCreate#deferredGetStockTypeList
	 * @methodOf oneslogiWms.InventoryCreate.object:InventoryCreate
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
		request.clientCd = $scope.conditionH.mclient.clientCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 在庫区分は一つ目を設定
		if (clearSelected) {
			// [EC-CT1-020] 預託、在庫区分が一つのみの場合は選択 2015.02.12 kawana Start
			if ($scope.stockTypeList.length == 1) {
				$scope.conditionB.mstockType.stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
				$scope.conditionB.mstockType.vdict.dictNm = $scope.stockTypeList[0].stockTypeNm;
			} else {
				$scope.conditionB.mstockType.stockTypeCd = null;
				$scope.conditionB.mstockType.vdict.dictNm = null;
			}
			// [EC-CT1-020] 預託、在庫区分が一つのみの場合は選択 2015.02.12 kawana End
		}
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#productBlur
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
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
			// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start
			request.clientId = userInfo.clientIdByCd($scope.conditionH.mclient.clientCd);
			request.productCd = productCd;
			$scope.conditionB.mproduct.productNm = null;
			var screenScope = angular.element($("div[owd-screen = 'InventoryInputAddRow']")).scope();
			api.productShape.productRecordwithShape(request).then(function(response){
				$scope.conditionB.mproduct.productNm = response.data.mProduct.productNm;
				$scope.conditionB.mproduct.janCd = response.data.mProduct.janCd;
				$scope.conditionB.mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.conditionB.mproduct.lotManagFlg = response.data.mProduct.lotManagFlg;
				$scope.conditionB.mproduct.limitDtManagFlg = response.data.mProduct.limitDtManagFlg;
				if (response.data.mProduct.mproductShapeList.length > 0){
					// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
					var productId  = response.data.mProduct.productId;
					$scope.conditionB.mproduct.mproductShapeList = response.data.mProduct.mproductShapeList;
					//Id
					$scope.conditionB.mproduct.productId=productId;
					//単位
					$scope.conditionB.mproduct.productUnit = response.data.mProduct.productUnit;
					// 入数内訳取得共通処理
					$scope.conditionB.unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);

					// 複数荷姿用各種オプション変数への複数荷姿リスト（検索結果）設定共通処理
					multiTextControl.setMultiText($scope, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText', response.data.mProduct.productId);

					// [#3486][Ver3.0] サブテキスト表示モード追加 サブテキスト編集可処理削除 2018.02.23 honma Delete
					// 荷姿補助内訳数取得共通処理
					owsCommon.syncExec(function() {
						owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.conditionB.inventoryNum, "multiTextOptions", "inventoryNum");
						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
						multiTextControl.checkDecimalInput($scope, $scope.conditionB.inventoryNum, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText');
						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
					});
					// [Ver3.0] unit of measure対応 2017.12.4 潘 End

					$scope.conditionB.shapeId = response.data.mProduct.mproductShapeList[0].shapeId;
				}
				// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja Start
				else{
					// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
					// 入数内訳を初期化
					$scope.conditionB.unitNumBreakdown =null;
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
					// 複数荷姿用各種オプション変数への複数荷姿リスト（検索結果）設定共通処理
					multiTextControl.setMultiText($scope, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText', response.data.mProduct.productId);
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					multiTextControl.checkDecimalInput($scope, $scope.conditionB.inventoryNum, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText');
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
					// [Ver3.0] unit of measure対応 2017.12.4 潘 End
					$scope.conditionB.shapeId = null;
				}
				// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja End
				$scope.conditionB.lot = null;
				$scope.conditionB.limitDt = null;

				//取得したロット管理フラグが"1"の場合、予定ロットを入力可能とし、

				if($scope.conditionB.mproduct.lotManagFlg == "1"){
					directiveControl.editable(screenScope, 'lot', true);
					optionMessageControl.hide(screenScope, 'lot');
				}else{
					directiveControl.editable(screenScope, 'lot', false);
					optionMessageControl.hide(screenScope, 'lot');
				}
				//取得した期限日管理フラグが"1"の場合、予定期限日を入力可能とし、
				if($scope.conditionB.mproduct.limitDtManagFlg == "1"){
					directiveControl.editable(screenScope, 'limitDt', true);
					optionMessageControl.hide(screenScope, 'limitDt');
				}else{
					directiveControl.editable(screenScope, 'limitDt', false);
					optionMessageControl.hide(screenScope, 'limitDt');
				}

			});
			// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End

		} else {
			// [Ver3.0] unit of measure対応 2018.02.12 ライ Start
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// 複数荷姿用各種オプション変数への複数荷姿リスト（検索結果）設定共通処理
			multiTextControl.setMultiText($scope, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText', null);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			multiTextControl.checkDecimalInput($scope, $scope.conditionB.inventoryNum, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText');
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			// [Ver3.0] unit of measure対応 2018.02.12 ライ End
			$scope.conditionB.mproduct.productNm = null;
			$scope.conditionB.mproduct.janCd = null;
			$scope.conditionB.mproduct.productAbbr = null;
			$scope.conditionB.mproduct.lotManagFlg = null;
			$scope.conditionB.mproduct.limitDtManagFlg = null;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
			// [Ver3.0] unit of measure対応 2018.02.12 ライ Start
			$scope.conditionB.unitNumBreakdown = null;
			// [Ver3.0] unit of measure対応 2018.02.12 ライ End
			// [Ver3.0] unit of measure対応 2017.12.4 潘 End

			$scope.conditionB.shapeId = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#showProduct
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
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
			$scope.conditionB.mproduct.lotManagFlg = selectedItem.lotManagFlg;
			$scope.conditionB.mproduct.limitDtManagFlg = selectedItem.limitDtManagFlg;

			// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja Start
//			if (selectedItem.mproductShapeList.length > 0){
//				$scope.conditionB.unitNum = selectedItem.mproductShapeList[0].unitNum;
//				$scope.conditionB.shapeId = selectedItem.mproductShapeList[0].shapeId;
//			}
			var productId  = selectedItem.productId;
			if(productId != null){
				if (String(productId) && 0 < String(productId).length) {
					var request = {};
					request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);
					request.caseFlg = "1";
					request.clientId = userInfo.clientIdByCd($scope.conditionH.mclient.clientCd);
					request.productCd = selectedItem.productCd;
					api.productShape.productRecordwithShape(request).then(function(response){
						if (response.data.mProduct.mproductShapeList.length > 0){
							$scope.conditionB.unitNum = response.data.mProduct.mproductShapeList[0].unitNum;
							$scope.conditionB.shapeId = response.data.mProduct.mproductShapeList[0].shapeId;
						}else{
							$scope.conditionB.unitNum = 0;
							$scope.conditionB.shapeId = null;
						}
					});
				}
			}else{
				$scope.conditionB.unitNum = 0;
				$scope.conditionB.shapeId = null;
			}

			// [エンハンス PH2.0] 棚卸入力（行追加）内容を追加 2015.11.25 sja End

			var screenScope = angular.element($("div[owd-screen = 'InventoryInputAddRow']")).scope();

			$scope.conditionB.lot = null;
			$scope.conditionB.limitDt = null;

			//取得したロット管理フラグが"1"の場合、予定ロットを入力可能とし、
			if($scope.conditionB.mproduct.lotManagFlg == "1"){
				directiveControl.editable(screenScope, 'lot', true);
				optionMessageControl.hide(screenScope, 'lot');
			}else{
				directiveControl.editable(screenScope, 'lot', false);
				optionMessageControl.hide(screenScope, 'lot');
			}
			//取得した期限日管理フラグが"1"の場合、予定期限日を入力可能とし、
			if($scope.conditionB.mproduct.limitDtManagFlg == "1"){
				directiveControl.editable(screenScope, 'limitDt', true);
				optionMessageControl.hide(screenScope, 'limitDt');
			}else{
				directiveControl.editable(screenScope, 'limitDt', false);
				optionMessageControl.hide(screenScope, 'limitDt');
			}

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#locationCdBlur
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function() {
		// 入力されたロケーションコードを取得
        var locationCd;
		locationCd = $scope.conditionB.mlocation.locationCd;
		// [ON推-品向-391] ロケーションコードを修正 2014.12.02 SJA-ZHENG Start
		if (locationCd && 0 < locationCd.length) {
			// [ON推-品向-391] ロケーションコードを修正 2014.12.02 SJA-ZHENG End
			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.conditionH.mcenter.centerCd);

			request.locationCd = locationCd;

			$scope.conditionB.mlocation.locationNm = null;

			api.location.record(request).then(function(response){
				// [#6899][OSS] 未存在のロケーションCDでフォーカスアウトした時に入力が消えるのを修正 2019.11.26 tsuboi Start
//				$scope.conditionB.mlocation.locationCd = response.data.mLocation.locationCd;
				// [#6899][OSS] 未存在のロケーションCDでフォーカスアウトした時に入力が消えるのを修正 2019.11.26 tsuboi End
				$scope.conditionB.mlocation.locationNm = response.data.mLocation.locationNm;
				$scope.conditionB.mlocation.zoneId = response.data.mLocation.zoneId;
			});

		} else {
			$scope.conditionB.mlocation.locationNm = null;
			$scope.conditionB.mlocation.zoneId = null;
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#showLocation
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(){

		var items = {
				centerCd: $scope.conditionH.mcenter.centerCd,
				locationCd:  $scope.conditionB.mlocation.locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.conditionB.mlocation.locationCd = selectedItem.locationCd;
			$scope.conditionB.mlocation.locationNm = selectedItem.locationNm;
			$scope.conditionB.mlocation.zoneId = selectedItem.zoneId;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#locationCdBlur
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
	 *
	 * @description
	 * 入庫ラベルNoのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、入庫Noを取得し画面項目に反映する。
	 */
	$scope.storeLabelNoBlur = function() {
		// 入力された商品コードを取得
        var locationCd;
        storeLabelNo = $scope.conditionB.storeLabelNo;

		if (storeLabelNo && 0 < storeLabelNo.length) {
			var request = {};
			request.storeLabelNo = storeLabelNo;

			api.storeNo.record(request).then(function(response){
				$scope.conditionB.storeNoId = response.data.tStoreNo.storeNoId;
			});

		} else {
			$scope.conditionB.storeNoId = null;
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#locationCdBlur
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.vendorCdBlur = function() {
		// 入力された商品コードを取得
        var supplierCustomerCd;
        supplierCustomerCd =  $scope.conditionB.mcustomerBySupplierId.customerCd;

        if (supplierCustomerCd && 0 < supplierCustomerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.conditionH.mclient.clientCd);
			request.customerCd = supplierCustomerCd;

			$scope.conditionB.mcustomerBySupplierId.customerNm = null;

			api.supplierCustomer.record(request).then(function(response){
				$scope.conditionB.mcustomerBySupplierId.customerId =  response.data.mCustomer.customerId;
				$scope.conditionB.mcustomerBySupplierId.customerNm =  response.data.mCustomer.customerNm;

			});

			// [横並-147] 仕入先CDを修正 2014.11.25 SJA-ZHENG Start
			$scope.conditionB.mcustomerBySupplierId.customerCd = supplierCustomerCd;
			// [横並-147] 仕入先CDを修正 2014.11.25 SJA-ZHENG End

		} else {
			$scope.conditionB.mcustomerBySupplierId.customerId = null;
			$scope.conditionB.mcustomerBySupplierId.customerCd = null;
			$scope.conditionB.mcustomerBySupplierId.customerNm =  null;
		}
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow#showLocation
	 * @methodOf oneslogiWms.InventoryInputAddRow.object:InventoryInputAddRow
	 *
	 * @description
	 * 仕入先検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showVendor  = function(){

		var items = {
				clientCd: $scope.conditionH.mclient.clientCd,
				// [横並-153] 仕入先マスタ検索アシスト画面の仕入先CDに入力した値がセットされるよう修正 2014.11.20 SJA-ZHENG Start
				vendorCd:  $scope.conditionB.mcustomerBySupplierId.customerCd
				// [横並-153] 仕入先マスタ検索アシスト画面の仕入先CDに入力した値がセットされるよう修正 2014.11.20 SJA-ZHENG End
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.conditionB.mcustomerBySupplierId.customerId = selectedItem.customerId;
			$scope.conditionB.mcustomerBySupplierId.customerCd = selectedItem.customerCd;
			$scope.conditionB.mcustomerBySupplierId.customerNm =  selectedItem.customerNm;


		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#register
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 追加ボタン押下処理<br>
	 *
	 */
	$scope.addRow = function() {

		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start

		// 追加データの重複チェック
		if (!duplicateDataCheck()) {
			// 重複エラー
			alertMessage.setErrorMessageByCode("dataDuplicateError");
			return;
		}

		// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;

		// 入力チェック
		api.inventoryInputAddRow.inputCheck(request).then(function(response){

			var screenScope = angular.element($("div[owd-screen = 'InventoryInputAddRow']")).scope();
			// 処理結果確認
			if (response.status.listStatus != null){

				for (var i = 0 ;i <response.status.listStatus.length;i++){

					// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start

					if ( 7 < response.status.listStatus[i].status.statusCode ) {
						// マスタ存在異常 以外

						statusInfo.isSuccessAndShowMessage(response, 'addrowform');
						return false;
					}

					// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

					//商品マスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 2){
						optionMessageControl.show(screenScope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
					}
					//仕入先マスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 3){
						optionMessageControl.show(screenScope, "supplierCustomerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
					}
					//ロット期限日チェック異常
					if (response.status.listStatus[i].status.statusCode == 4){
						optionMessageControl.show(screenScope, "limitDt", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
					}
					//ロケーションマスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 5){
						optionMessageControl.show(screenScope, "locationCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
					}
					//ロット存在異常
					if (response.status.listStatus[i].status.statusCode == 6){
						optionMessageControl.show(screenScope, "lot", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
					}
					//入庫ラベルNo.異常
					if (response.status.listStatus[i].status.statusCode == 7){
						optionMessageControl.show(screenScope, "storeLabelNo", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
					}
				}
				return false;
			}else{
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				var decimalInputError = multiTextControl.checkDecimalInput($scope, $scope.conditionB.inventoryNum, 'multiTextOptions', 'inventoryNum', 'inventoryNumMultiText');
				if (decimalInputError) {
					return;
				}
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					return;
				}
			}

			request.data.head = response.data.head;
			$modalInstance.close(request);
		});
	};
    // [ON推-品向-390] 「閉じる」ボタンを追加 2014.12.04 KI Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch#modalClose
	 * @methodOf oneslogiWms.DeliveryCourseSearch.object:DeliveryCourseSearch
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */
	$scope.modalClose = function() {
		$modalInstance.dismiss();
	};

	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana Start

	// 棚卸入力データ重複チェック(棚卸入力画面のグリッド表示分(行追加したデータも含む))
	var duplicateDataCheck = function() {

		// ロケーション
		var locationCd = $scope.conditionB.mlocation.locationCd;
		// 商品
		var productCd = $scope.conditionB.mproduct.productCd;
		// 預託
		var depositCd = $scope.conditionB.mcustomerByDepositId.customerCd;
		// 在庫区分
		var stockTypeCd = $scope.conditionB.mstockType.stockTypeCd;
		// ロット
		var lot = $scope.conditionB.lot;
		// 期限日
		var limitDt = $scope.conditionB.limitDt;
		// 入庫ラベルNo.
		var storeLabelNo = $scope.conditionB.storeLabelNo;
		// 仕入先CD
		var supplierCd = $scope.conditionB.tstoreNo.mcustomer.customerCd;
		// 入庫日
		var storeDt = $scope.conditionB.storeDt;

		// 棚卸入力画面のscope
		var inventoryInputScope = angular.element($("div[owd-screen = 'InventoryInput']")).scope();

		if ( inventoryInputScope.inventoryList ) {
			for (var i = 0; i < inventoryInputScope.inventoryList.length; i++) {

				if ( inventoryInputScope.inventoryList[i].mlocation.locationCd == locationCd
					&& inventoryInputScope.inventoryList[i].mproduct.productCd == productCd
					&& inventoryInputScope.inventoryList[i].mcustomerByDepositId.customerCd == depositCd
					&& inventoryInputScope.inventoryList[i].mstockType.stockTypeCd == stockTypeCd
					&& inventoryInputScope.inventoryList[i].lot == lot
					&& inventoryInputScope.inventoryList[i].limitDt == limitDt
					&& equalsAnyOneEmptyTrue(inventoryInputScope.inventoryList[i].storeLabelNo, storeLabelNo)
					&& equalsAnyOneEmptyTrue(getSupplierCd(inventoryInputScope.inventoryList[i]), supplierCd)
					){

					if (inventoryInputScope.param.storeDtFlg == "1") {
						if (inventoryInputScope.inventoryList[i].storeDt == storeDt) {
							return false;
						}
					} else {
						return false;
					}
				}
			}
		}

		return true;
	}

	// 引数が等しい場合はtrue (引数のうち、いずれかが空の場合もtrue)
	var equalsAnyOneEmptyTrue = function(a, b) {

		if (isAnyOneEmpty(a, b)) {
			return true;
		}

		return a == b;
	}

	// 引数のうち、いずれかが空の場合はtrue
	var isAnyOneEmpty = function(a, b) {

		if (a == null || b == null) {
			return true;
		}

		if (a == "" || b == "") {
			return true;
		}

		return false;
	}

	var getSupplierCd = function(body) {

		if (body.mcustomerBySupplierId) {
			return body.mcustomerBySupplierId.customerCd;
		}

		return null;
	}

	// [#4705][v3.0] 追加データの重複チェックを棚卸入力画面から行追加画面の追加ボタン押下時に移動 2018.06.13 kawana End

	// [ON推-品向-390] 「閉じる」ボタンを追加 2014.12.04 KI End
	// 画面初期化処理を実行
	$scope.initScreen();
}]);