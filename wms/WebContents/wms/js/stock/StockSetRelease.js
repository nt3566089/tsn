/**
 * @ngdoc overview
 * @name oneslogiWms.StockSetRelease
 *
 * @description
 * セット解除指示画面
 */
angular.module('oneslogiWms.StockSetRelease',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockSetRelease.service:stockSetReleaseApi
 *
 * @description
 * セット解除指示WebApi定義<br>
 * ・resources/stock/stockSetRelease/init 初期処理WebApi<br>
 * ・resources/stock/stockSetRelease/search 検索処理WebApi<br>
 * ・resources/stock/stockSetRelease/searchStructure 構成品検索処理WebApi<br>
 * ・resources/stock/stockSetRelease/inputCheckUpdate 入力チェックWebApi<br>
 * ・resources/stock/stockSetRelease/register セット解除指示処理WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 *
 */
.factory('stockSetReleaseApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
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
		stockSetRelease: AngularAPIClient.make([
		                                     ['init',             'GET',  'resources/stock/stockSetRelease/init'],
		                                     ['search',           'GET',  'resources/stock/stockSetRelease/search'],
		                                     ['searchStructure',  'GET',  'resources/stock/stockSetRelease/searchStructure'],
		                                     ['inputCheckUpdate', 'POST', 'resources/stock/stockSetRelease/inputCheckUpdate'],
		                                     ['register',         'POST', 'resources/stock/stockSetRelease/register']
		                                    ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockSetRelease.service:stockSetRelease
 * @description
 * セット解除指示画面コントローラ
 */
.controller('StockSetRelease', ['$scope', '$route', '$filter', '$location', '$q', '$timeout', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'stockSetReleaseApi', function($scope, $route, $filter, $location, $q, $timeout, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, api) {

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var stock;

	// 在庫親商品グリッドの列情報（デザイン用）
	$scope.stockListCols =
		[
		 	//荷主センタ変更対応 2017.02.20 sja Start
		 	{field:"mclient.clientCd", displayName:"荷主"},
		 	{field:"mclient.clientNm", displayName:"荷主名称"},
		 	{field:"mlocation.mcenter.centerCd", displayName:"センタ"},
		 	{field:"mlocation.mcenter.centerNm", displayName:"センタ名称"},
		 	//荷主センタ変更対応 2017.02.20 sja End
		    {field:"mproduct.productCd", displayName:"親商品CD"},
		    {field:"mproduct.productNm", displayName:"親商品名称"},
		    {field:"mproduct.productAbbr", displayName:"親商品略称"},
		    {field:"mproduct.janCd", displayName:"JANCD"},
		    {field:"chargeNum", displayName:"数量"},
		    {field:"mlocation.locationCd", displayName:"ロケーション"},
		    {field:"mcustomer.customerCd", displayName:"預託CD"},
		    {field:"mcustomer.customerNm", displayName:"預託名称"},
		    {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
		    {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		    {field:"tlot.lot", displayName:"ロット"},
		    {field:"tlot.limitDt", displayName:"期限日"},
		    {field:"tstoreNo.storeDt", displayName:"入庫日"}
		];

	// 解除指示入力グリッドの列情報（デザイン用）
	$scope.releaseInputCols =
		[
		 	//荷主センタ変更対応 2017.02.20 sja Start
//		 	{field:"mclient.clientCd", displayName:"荷主"},
//		 	{field:"mclient.clientNm", displayName:"荷主名称"},
		 	{field:"mproduct.mclient.clientCd", displayName:"荷主"},
		 	{field:"mproduct.mclient.clientNm", displayName:"荷主名称"},
		 	//荷主センタ変更対応 2017.02.20 sja End
		    {field:"mproduct.productCd", displayName:"構成品CD"},
		    {field:"mproduct.productNm", displayName:"構成品名称"},
		    {field:"mproduct.productAbbr", displayName:"構成品略称"},
		    {field:"mproduct.janCd", displayName:"JANCD"},
		    {field:"unitNum", displayName:"入数"},
		    {field:"chargeNum", displayName:"指示数"},
		    {field:"mlocation.locationCd", displayName:"ロケーション"},
		    {field:"mcustomer.customerCd", displayName:"預託CD"},
		    {field:"mcustomer.customerNm", displayName:"預託名称"},
		    {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
		    {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		    {field:"tlot.lot", displayName:"ロット"},
		    {field:"tlot.limitDt", displayName:"期限日"},
		    {field:"tstoreNo.storeDt", displayName:"入庫日"}
		];
    /**
     * @ngdoc method
     * @name oneslogiWms.StockSetRelease.service:stockSetRelease#initScreen
     * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
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

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.head.mlocation.mcenter.centerCd;
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

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			//荷主センタ変更対応 2017.02.20 sja Start
//			if (oldClient != $scope.head.mlocation.mcenter.centerCd) {
			if (oldClient != $scope.head.mclient.clientCd) {
			//荷主センタ変更対応 2017.02.20 sja End
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList);
			}
		};

		// 構成品グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'stockList',
			columnDefs: 'stockListCols',
		});

		// ===== 在庫グリッドの設定 =====
		// 在庫グリッドの設定
		$scope.gridOptions2 = owsCommon.mergeEntryGridOptions({
			data: 'releaseInput',
			columnDefs: 'releaseInputCols',
			// [#7164][OSS]⑥ 行クリックでは選択できないように修正(enableRowSelection設定削除) 2020.02.14 kawana Delete
		});

		// [#6867][OSS] 行クリックで選択されない問題を修正($scope.gridOptions2.selectWithCheckboxOnlyを削除) 2019.11.19 kawana Delete


		// ロケーション列にボタンを設定
		$scope.gridButtonOptions2 = {
				"mlocation.locationCd":{
					clickFunction:"gridShowLocation(row.rowIndex)"
				}
		};

		// [#244] セット品構成マスタに親商品CDが登録されていない時のエラー表示方法を統一 2016.12.07 kawana Start
		statusInfo.mappingErrorMessage($scope, "productCd", 2, 0);
		statusInfo.mappingErrorMessage($scope, "locationCd", 5, 0);
		// [#244] セット品構成マスタに親商品CDが登録されていない時のエラー表示方法を統一 2016.12.07 kawana End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockSetRelease.service:stockSetRelease#initScreenHttp
     * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//全通信終了後に以下関数で各種設定を実行
		$q.all(
				[
				 ]
		)
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#deferredGetInitData
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * セット解除指示初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockSetRelease.init().then(function(response){
			$scope.head = response.data.head;
			$scope.stockList = response.data.stockList;
			$scope.releaseInput = response.data.releaseInput;
			// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
			$scope.instInput = response.data.instInput;
			// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End

			// ログイン情報より初期値を設定
			$scope.head.mlocation.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;

			//検索条件枠を開いた状態に設定
			$scope.isopen = true;

			// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
			// 画面非活性化設定
			$scope.setEditable(true);
			// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End

			// 荷主変更後処理
			$scope.changeClient(false);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
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
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#showProduct
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * 商品CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 */
	$scope.showProduct = function(){
		var items = {
				clientCd: $scope.head.mclient.clientCd,
				productCd: $scope.head.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd =  selectedItem.productCd;
			$scope.head.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#productCdBlur
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				if(response.data.mProduct.productCd == null){
					$scope.head.mproduct.productNm = null;
				}else{
					$scope.head.mproduct.productNm = response.data.mProduct.productNm;
					lotManagFlg = response.data.mProduct.lotManagFlg;
					limitDtManagFlg = response.data.mProduct.limitDtManagFlg;
				}
			});
		} else {
			$scope.head.mproduct.productNm = null;
		}

	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockSetRelease.service:stockSetRelease#search
     * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		var bln = false;
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		api.stockSetRelease.search(request).then(function(response) {

			// [#244] セット品構成マスタに親商品CDが登録されていない時のエラー表示方法を統一(不要なコード削除) 2016.12.07 kawana

			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				$scope.setData(response);
			}
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockSetRelease.service:stockSetRelease#setData
     * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
     *
     * @description
     * 検索結果反映処理<br>
     * ・行センタ状態のクリア<br>
     * ・取得データをグリッドに反映<br>
     * ・トータル件数を設定
     */
	$scope.setData = function(response) {
		owsCommon.setFirstFocus('inputform');

		//取得データをグリッドに反映
		$scope.stockList = response.data.stockList;
		$scope.releaseInput = null;

		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
		// 行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// 画面活性化設定
		$scope.setEditable(false);
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End

		$scope.isopen = false;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
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
		request.clientCd = $scope.head.mclient.clientCd;
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList",request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#deferredGetStockTypeList
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
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
		request.clientCd = $scope.head.mclient.clientCd;

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
				$scope.head.mcustomer.customerCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			}
		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#changeClient
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
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
			setStockTypeList(response.data);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#showLocation
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(){
        var inLocationCd;
		inLocationCd = $scope.head.mlocation.locationCd;

		var items = {
				centerCd: $scope.head.mlocation.mcenter.centerCd,
				locationCd: inLocationCd,
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mlocation.locationCd = selectedItem.locationCd;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
			$scope.head.mlocation.locationNm = selectedItem.locationNm;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#locationCdBlur
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function() {
		// 入力されたロケーションCD
		var locationCd = $scope.head.mlocation.locationCd;

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.head.mlocation.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				$scope.head.mlocation.locationNm = response.data.mLocation.locationNm;
			});
		} else {

			// ロケーション名称をクリア
			$scope.head.mlocation.locationNm = null;
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#showLocation
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * ロケーション検索ボタン押下処理（グリッド）<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.gridShowLocation = function(rowIndex){
		var items = {
				centerCd: $scope.head.mlocation.mcenter.centerCd,
				locationCd: $scope.releaseInput[rowIndex].mlocation.locationCd,
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.releaseInput[rowIndex].mlocation.locationCd = selectedItem.locationCd;
		});
	};

	// 現在行の各項目への制御処理
	var productManagCurrentRow = function() {
		var lotManagFlg;
		var limitDtManagFlg;

		for(var i=0; i < $scope.releaseInput.length;i++){
			lotManagFlg = $scope.releaseInput[i].mproduct.lotManagFlg;
			limitDtManagFlg = $scope.releaseInput[i].mproduct.limitDtManagFlg;
			// ロット管理フラグ
			if (lotManagFlg == "0") {
				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.lot', false, i);
				$scope.releaseInput[i].tlot.lot = null;
			} else {
				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.lot', true, i);
			}
			// 期限日管理フラグ
			if (limitDtManagFlg == "0") {
				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.limitDt', false, i);
				$scope.releaseInput[i].tlot.limitDt = null;
			} else {
				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.limitDt', true, i);
			}
		}

		// 入庫日を設定
		angular.forEach($scope.releaseInput, function(row) {
			row.tstoreNo.storeDt = userInfo.systemDt;
		});
	};

	// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
	// 画面入力制限設定
	$scope.setEditable= function(flg){
		if (flg) {
			// 初期化画面非活性化設置
			directiveControl.editable($scope, 'chargeNum', false);
		} else {
			// 検索後画面活性化設定
			directiveControl.editable($scope, 'chargeNum', true);
		}
	}
	// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#copyRow
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * 行コピーボタン押下処理<br>
	 *
	 * 選択行をコピーする。
	 */
	// [ON推-CT113-015] コピー元の下に挿入と変更する 2015.12.28 hayashi Start
	$scope.copyRow = function(){
		var selectedItems = $scope.gridOptions2.gridApi.selection.getSelectedRows();
		var blankRow;
		//angular.forEach(selectedItems, function(row) {
		for (var row = 0; row < selectedItems.length; row++) {
			var copyRow = [];
			copyRow.push(angular.copy(selectedItems[row]));
			//blankRow = row;
			blankRow = copyRow[0];

			// コピー対象の入力されたをクリア
			blankRow.chargeNum = null;
			blankRow.mlocation.locationCd = null;
			blankRow.tlot.lot = null;
			blankRow.tlot.limitDt = null;
			blankRow.tstoreNo.storeDt = userInfo.systemDt;
			blankRow.productId = null;
			// 行コピー
			//$scope.releaseInput.push(angular.copy(blankRow));
			$scope.releaseInput.splice(selectedItems[row].lineNo, 0, blankRow);
			// ロット管理フラグ
//			if (blankRow.mproduct.lotManagFlg == "0") {
//				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.lot', false, $scope.releaseInput.length-1);
//			} else {
//				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.lot', true, $scope.releaseInput.length-1);
//			}
//			// 期限日管理フラグ
//			if (blankRow.mproduct.limitDtManagFlg == "0") {
//				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.limitDt', false, $scope.releaseInput.length-1);
//			} else {
//				gridDirectiveControl.editable($scope.gridOptions2, 'tlot.limitDt', true, $scope.releaseInput.length-1);
//			}

			// 行番号振り直し
			updateRowNumber($scope.releaseInput);

		};

		// 現在行の各項目への制御処理
		productManagCurrentRow();

		owsCommon.toggleSelectAll($scope.gridOptions2, false);
	};
	// [ON推-CT113-015] コピー元の下に挿入と変更する 2015.12.28 hayashi End

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#removeRow
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		// 既存データチェック
		var i = 0;
		angular.forEach($scope.gridOptions2.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.releaseInput.indexOf(row) > -1) {
				if (row.productId != null) {
					i++;
					return;
				}
			}
		});

		if(i > 0){
			alertMessage.setErrorMessageByCode("alreadyExistsStructureCannotDeleteError");
			return;
		}

		var item = 0;
		for (var row = 0;row <$scope.gridOptions2.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions2.gridApi.selection.getSelectedRows()[row].chargeNum != ""
				&&$scope.gridOptions2.gridApi.selection.getSelectedRows()[row].chargeNum != null)
				||($scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tlot.lot != ""
					&&$scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tlot.lot != null)
					||($scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tlot.limitDt != ""
						&&$scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tlot.limitDt != null)
						||($scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tstoreNo.storeDt != ""
							&&$scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tstoreNo.storeDt != null
							&&$scope.gridOptions2.gridApi.selection.getSelectedRows()[row].tstoreNo.storeDt != userInfo.systemDt)
							||($scope.gridOptions2.gridApi.selection.getSelectedRows()[row].mlocation.locationCd != ""
								&&$scope.gridOptions2.gridApi.selection.getSelectedRows()[row].mlocation.locationCd != null)){
				item++;
			}
		}

		if(item > 0){
			// 行が入力された
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			// 複数行の場合に警告
			if ($scope.gridOptions2.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
		// 選択行削除
		angular.forEach($scope.gridOptions2.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.releaseInput.indexOf(row) > -1) {
				$scope.releaseInput.splice($scope.releaseInput.indexOf(row), 1);
			}
		});
		// [ON推-CT113-015] コピー元の下に挿入と変更する 2015.12.28 hayashi Start
		// 行番号振り直し
		updateRowNumber($scope.releaseInput);
		// [ON推-CT113-015] コピー元の下に挿入と変更する 2015.12.28 hayashi End

		owsCommon.toggleSelectAll($scope.gridOptions2, false);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#register
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions2);

		var listBody = [];
		var emptyBody = [];

		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add Start
		var isError = $scope.inputform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputform');
			return;
		}
		// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Add End

		var promiseAll = $q.all([
		                         // [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions2,$scope.inputform2)
		                         // [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				//明細が表示されていない場合
				if($scope.releaseInput.length == 0)
				{
					alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
					return;
				}

				// ロット、期限日のチェック
				var rowIndexLot = new Array();
				var rowIndexLimitDt = new Array();
				for (var row = 0; row < $scope.releaseInput.length; row++) {
					if ($scope.releaseInput[row].mproduct.lotManagFlg == "1"){
						if(!($scope.releaseInput[row].tlot.lot) || 0 == $scope.releaseInput[row].tlot.lot.length) {
							rowIndexLot[rowIndexLot.length] = row;
						}
					}

					if ($scope.releaseInput[row].mproduct.limitDtManagFlg == "1"){
						if(!($scope.releaseInput[row].tlot.limitDt) || 0 == $scope.releaseInput[row].tlot.limitDt.length) {
							rowIndexLimitDt[rowIndexLimitDt.length] = row;
						}
					}
				}
				var firstIndexLot;
				var firstIndexLimistDt;
				if (0 < rowIndexLot.length) {
					// エラーメッセージCD
					var messageCd = "lotNotInputLotManagementProductError";
					// 対象の項目にエラーを表示
					gridOptionMessageControl.show($scope.gridOptions2, "tlot.lot", $filter('owfMessage')(messageCd), rowIndexLot);

					firstIndexLot = rowIndexLot[0];
				}

				if (0 < rowIndexLimitDt.length) {
					// エラーメッセージCD
					var messageCd = "limitDateNotInputLimitDateManagementProductError";
					// 対象の項目にエラーを表示
					gridOptionMessageControl.show($scope.gridOptions2, "tlot.limitDt", $filter('owfMessage')(messageCd), rowIndexLimitDt);

					firstIndexLimistDt = rowIndexLimitDt[0];
				}

				if (0 < rowIndexLot.length || 0 < rowIndexLimitDt.length) {
					// 最初のエラー箇所までスクロール
					if (!firstIndexLot) {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, firstIndexLimistDt);
					} else if (!firstIndexLimistDt) {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, firstIndexLot);
					} else if (firstIndexLot < firstIndexLimistDt) {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, firstIndexLot);
					} else {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, firstIndexLimistDt);
					}

					// 最初のエラーにフォーカス
					// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
					directiveControl.firstErrorOnFocus('inputform2');
					// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End
					return;
				}

				var flag = false;
				// 商品の指示数チェック
				// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
				var InstNum = $scope.instInput.chargeNum;
				// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End

				// [#7164][OSS]④ 指示数量が引当可能数を超えていた場合エラーとする 2020.02.04 tsuboi Start
				var stockChargeNum = stock.chargeNum;
				if(InstNum > stockChargeNum){
					alertMessage.setErrorMessageByCode("instChargeNumOverStockChargeNumError");
					return;
				}
				// [#7164][OSS]④ 指示数量が引当可能数を超えていた場合エラーとする 2020.02.04 tsuboi End

				var productList = new Array($scope.releaseInput.length);

				// [#7164][OSS]⑤ 指示数不正発生有無を管理する変数と指示数不正発生の最初の行を管理する変数を追加 2020.02.05 tsuboi Start
				var isIncorrectChargeNum = false;
				var incorrectChargeNumFirstRow = null;
				// [#7164][OSS]⑤ 指示数不正発生有無を管理する変数と指示数不正発生の最初の行を管理する変数を追加 2020.02.05 tsuboi End
				for (var row = 0; row < $scope.releaseInput.length; row++) {
					var productflg = false;
					var productCd = $scope.releaseInput[row].mproduct.productCd;
					var unitNum = $scope.releaseInput[row].unitNum;
					var sumNum = owsCommon.multiply(InstNum, unitNum);
					var chargeNum = $scope.releaseInput[row].chargeNum;
					// [#7164][OSS]⑤ 商品CDの判定を修正 2020.02.05 tsuboi Start
					if(productList.indexOf(productCd) >= 0){
						var productflg = true;
					}
					// [#7164][OSS]⑤ 商品CDの判定を修正 2020.02.05 tsuboi End

					// [#7164][OSS]⑤ 同一商品の行番号を管理する配列を追加 2020.02.05 tsuboi Start
					var sameProductList = new Array();
					// [#7164][OSS]⑤ 同一商品の行番号を管理する配列を追加 2020.02.05 tsuboi End
					if(productflg){
						// チェック済
						// [#7164][OSS]⑤ 同一商品が複数行あった場合に指示数チェックが終了してしまう不具合を修正 2020.02.05 tsuboi Start
						continue;
						// [#7164][OSS]⑤ 同一商品が複数行あった場合に指示数チェックが終了してしまう不具合を修正 2020.02.05 tsuboi End
					}else{
						// 未チェック ⇒ 以降の処理でチェック
						productList[row] = productCd;
						// [#7164][OSS]⑤ 同一商品の行番号を管理 2020.02.05 tsuboi Start
						sameProductList.push(row);
						// [#7164][OSS]⑤ 同一商品の行番号を管理 2020.02.05 tsuboi End
					}

					for (var i = row+1; i < $scope.releaseInput.length; i++) {
						// 同じ商品の指示数の合計
						if($scope.releaseInput[i].mproduct.productCd == productCd){
							chargeNum = owsCommon.add(chargeNum, $scope.releaseInput[i].chargeNum);
							// [#7164][OSS]⑤ 同一商品の行番号を管理 2020.02.05 tsuboi Start
							sameProductList.push(i);
							// [#7164][OSS]⑤ 同一商品の行番号を管理 2020.02.05 tsuboi End
						}
					}

					// [#7164][OSS]⑤ 構成品の指示数が不足している場合と超過している場合でメッセージを変更 2020.02.05 tsuboi Start
					if(sumNum < chargeNum){
						gridOptionMessageControl.show($scope.gridOptions2, "chargeNum", $filter('owfMessage')("instructionRegisterOverageError"), sameProductList);
						if(!isIncorrectChargeNum){
							incorrectChargeNumFirstRow = sameProductList[0];
						}
						isIncorrectChargeNum = true;
					}else if(sumNum > chargeNum){
						gridOptionMessageControl.show($scope.gridOptions2, "chargeNum", $filter('owfMessage')("instructionRegisterShortageError"), sameProductList);
						if(!isIncorrectChargeNum){
							incorrectChargeNumFirstRow = sameProductList[0];
						}
						isIncorrectChargeNum = true;
					}
					// [#7164][OSS]⑤ 構成品の指示数が不足している場合と超過している場合でメッセージを変更 2020.02.05 tsuboi End
				}
				// [#7164][OSS]⑤ 指示数チェックで不正だった場合エラー項目にフォーカスし処理を抜ける 2020.02.05 tsuboi Start
				if(isIncorrectChargeNum){
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, incorrectChargeNumFirstRow);
					directiveControl.firstErrorOnFocus('inputform2');
					return;
				}
				// [#7164][OSS]⑤ 指指示数チェックで不正だった場合エラー項目にフォーカスし処理を抜ける 2020.02.05 tsuboi End

				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.stock = stock;
				// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
				request.data.instInput = $scope.instInput;
				// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End
				request.data.releaseInput = $scope.releaseInput;

				// セット解除指示登録前入力チェック
				api.stockSetRelease.inputCheckUpdate(request).then(function(response) {
					var j = 0;
					// [#6895][OSS] エラー項目までスクロールするために変数を用意 2019.11.26 tsuboi Start
					var firstIndexLocation;
					// [#6895][OSS] エラー項目までスクロールするために変数を用意 2019.11.26 tsuboi End

					// 処理結果確認
					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//ロケーションマスタ存在異常
							if (response.status.listStatus[i].status.statusCode == 5){
								gridOptionMessageControl.show($scope.gridOptions2, "mlocation.locationCd", $filter('owfMessage')((2, response.status.listStatus[i].status.messageCode)), response.status.listStatus[i].status.rowIndex);

								// [#6895][OSS] エラー項目までスクロールする為の変数の処理を追加 2019.11.26 tsuboi Start
								if(j == 0){
									firstIndexLocation = response.status.listStatus[i].status.rowIndex;
								}
								// [#6895][OSS] エラー項目までスクロールする為の変数の処理を追加 2019.11.26 tsuboi End

								j++;
							}
						}
					}

					if(j>0){
						// [#6895][OSS] エラー項目までスクロールする処理を追加 2019.11.26 tsuboi Start
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, firstIndexLocation);
						directiveControl.firstErrorOnFocus('inputform2');
						// [#6895][OSS] エラー項目までスクロールする処理を追加 2019.11.26 tsuboi End

						return;
					}

					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// セット解除指示
						api.stockSetRelease.register(request).then(function(response) {
							if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
								$scope.initScreenHttp();
							}
						});
					}
				});
			});
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				return;
			});
		});
	};

	// [#7164][OSS] ダブルクリックの処理を削除 2020.02.14 kawana Delete

	// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#parentProductSelect
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description
	 * 親商品選択ボタン押下処理<br>
	 *
	 * 指示数量入力チェックを行い。<br>
	 * 解除指示入力明細検索処理呼び出し
	 */
	$scope.parentProductSelect = function() {

		// [#7164][OSS]④ 解除指示入力明細をクリア 2020.02.05 tsuboi Start
		$scope.releaseInput = null;
		// [#7164][OSS]④ 解除指示入力明細をクリア 2020.02.05 tsuboi End

		var isError = $scope.inputform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('inputform');
			return;
		}

		// 明細のダブルフラグをクリア
		for(var i=0; i<$scope.stockList.length; i++){
			$scope.stockList[i].dblFlg = null;
		}

		var request = {};
		request.data = {};
		var row = $scope.stockList.indexOf($scope.gridOptions.gridApi.selection.getSelectedRows()[0])
		request.data.stock = $scope.stockList[row];

		// [#7164][OSS]④ 指示数量が引当可能数を超えていた場合エラーとする 2020.02.04 tsuboi Start
		var instChargeNum = $scope.instInput.chargeNum;
		var stockChargeNum = request.data.stock.chargeNum;
		if(instChargeNum > stockChargeNum){
			alertMessage.setErrorMessageByCode("instChargeNumOverStockChargeNumError");
			return;
		}
		// [#7164][OSS]④ 指示数量が引当可能数を超えていた場合エラーとする 2020.02.04 tsuboi End

		// [ON推-CT113-016] 指示数の初期値を設定する 2015.12.28 hayashi Start
		request.data.head = $scope.head;
		// [ON推-CT113-016] 指示数の初期値を設定する 2015.12.28 hayashi End
		request.data.instInput = $scope.instInput;
		api.stockSetRelease.searchStructure(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform')
			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				// 解除指示入力明細を表示する
				$scope.releaseInput = response.data.releaseInput;
				// [ON推-CT113-015] コピー元の下に挿入と変更する 2015.12.28 hayashi Start
				// 行番号振り直し
				updateRowNumber($scope.releaseInput);
				// [ON推-CT113-015] コピー元の下に挿入と変更する 2015.12.28 hayashi End
				// ダブルフラグを設定する
				$scope.stockList[row].dblFlg = "1";
				// ダブル行を保存する
				stock = $scope.stockList[row];
				// 現在行の各項目への制御処理
				productManagCurrentRow();
				// 解除指示入力明細にフォーカスを設定する
				owsCommon.setFirstFocus("inputform2");

				// [#7164][OSS]③ 在庫親商品明細の選択を解除 2020.02.04 tsuboi Start
				$scope.gridOptions.gridApi.selection.clearSelectedRows();
				// [#7164][OSS]③ 在庫親商品明細の選択を解除 2020.02.04 tsuboi End
			}
		});
	}
	// [#3279][Ver3.0] セット解除指示で親商品の在庫が必ず0になる 2018.01.11 honma Mod End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetRelease.service:stockSetRelease#getClassForRow
	 * @methodOf oneslogiWms.StockSetRelease.service:stockSetRelease
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 在庫移動指示ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.dblFlg == "1") {
			return "wmslegendyellow";
		}
	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);

