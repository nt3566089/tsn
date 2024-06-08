/**
 * @ngdoc overview
 * @name oneslogiWms.StockSetInst
 *
 * @description
 * セット組指示画面
 */
angular.module('oneslogiWms.StockSetInst',[])

/**
 * @ngdoc service
 * @name oneslogiWms.StockSetInst.service:stockSetInstApi
 *
 * @description
 * セット組指示WebApi定義<br>
 * ・resources/stock/stockSetInst/init 初期処理WebApi<br>
 * ・resources/stock/stockSetInst/search 検索処理WebApi<br>
 * ・resources/stock/stockSetInst/inputCheckUpdate 指示前入力チェックWebApi<br>
 * ・resources/stock/stockSetInst/register 指示処理WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 *
 */
.factory('stockSetInstApi', ['AngularAPIClient', function(AngularAPIClient) {
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
		// [ON推-CT113-009] ロケーションCDの下にロケーション名称を表示 2015.12.24 hayashi Start
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		),
		// [ON推-CT113-009] ロケーションCDの下にロケーション名称を表示 2015.12.24 hayashi End
		stockSetInst: AngularAPIClient.make([
		                                     ['init',             'GET',  'resources/stock/stockSetInst/init'],
		                                     ['search',           'GET',  'resources/stock/stockSetInst/search'],
		                                     ['inputCheckUpdate', 'POST', 'resources/stock/stockSetInst/inputCheckUpdate'],
		                                     ['register',         'POST', 'resources/stock/stockSetInst/register']
		                                    ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.StockSetInst.service:stockSetInst
 * @description
 * セット組指示画面コントローラ
 */
.controller('StockSetInst', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'stockSetInstApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, api) {

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var lotManagFlg;
	var limitDtManagFlg;

	// 構成品グリッドの列情報（デザイン用）
	$scope.setStructureListCols =
		[
		 	//荷主センタ変更対応 2017.02.20 sja Start
		 	{field:"mproduct.mclient.clientCd", displayName:"荷主"},
		 	{field:"mproduct.mclient.clientNm", displayName:"荷主名称"},
		 	//荷主センタ変更対応 2017.02.20 sja End
		    {field:"mproduct.productCd", displayName:"商品CD"},
		    {field:"mproduct.productNm", displayName:"商品名称"},
		    {field:"mproduct.productAbbr", displayName:"商品略称"},
		    {field:"mproduct.janCd", displayName:"JANCD"},
		    {field:"unitNum", displayName:"入数"},
		    {field:"sumUnitNum", displayName:"入数総数"},
		    {field:"instNum", displayName:"指示数"}
		];

	// 在庫グリッドの列情報（デザイン用）
	$scope.stockListCols =
		[
		 	//荷主センタ変更対応 2017.02.20 sja Start
		 	{field:"mclient.clientCd", displayName:"荷主"},
		 	{field:"mclient.clientNm", displayName:"荷主名称"},
		 	{field:"mlocation.mcenter.centerCd", displayName:"センタ"},
		 	{field:"mlocation.mcenter.centerNm", displayName:"センタ名称"},
		 	//荷主センタ変更対応 2017.02.20 sja End
		    {field:"mproduct.productCd", displayName:"商品CD"},
		    {field:"mproduct.productNm", displayName:"商品名称"},
		    {field:"mproduct.productAbbr", displayName:"商品略称"},
		    {field:"mproduct.janCd", displayName:"JANCD"},
		    {field:"moveNumInfo", displayName:"移動数"},
		    {field:"chargeNum", displayName:"引当可能数"},
		    {field:"mwarehouse.warehouseCd", displayName:"倉庫CD"},
		    {field:"mwarehouse.warehouseNm", displayName:"倉庫名称"},
		    {field:"mlocation.locationNm", displayName:"ロケーション名称"},
		    {field:"mcustomer.customerCd", displayName:"預託CD"},
		    {field:"mcustomer.customerNm", displayName:"預託名称"},
		    {field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
		    {field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
		    {field:"tlot.lot", displayName:"ロット"},
		    {field:"tlot.limitDt", displayName:"期限日"},
		    {field:"tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
		    {field:"tstoreNo.storeDt", displayName:"入庫日"}
		];
    /**
     * @ngdoc method
     * @name oneslogiWms.StockSetInst.service:stockSetInst#initScreen
     * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
     *
     * @description
     * 画面初期化処理<br>
     * ・検索条件枠を開いた状態に設定<br>
     * ・グリッド設定<br>
     * ・画面初期化用通信制御処理を呼び出し
     */
	$scope.initScreen = function() {
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
			if (oldClient != $scope.head.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList);
			}
		};

		// 構成品グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'setStructureList',
			columnDefs: 'setStructureListCols'
		});

		// 在庫グリッドの設定
		$scope.gridOptions2 = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'stockList',
			columnDefs: 'stockListCols'
		});

		// グリッドの商品コード列、入庫ケース数列、入庫バラ数列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"moveNumInfo":{
					"ng-blur":{
						eventFunction:"moveNumInfoBlur(row.rowIndex)"
					}
				}
		};

		// [#244] セット品構成マスタに親商品CDが登録されていない時のエラー表示方法を統一 2016.12.07 kawana Start
		statusInfo.mappingErrorMessage($scope, "productCd", 2, 0);
		statusInfo.mappingErrorMessage($scope, "productCd", 3, 0);
		// [#244] セット品構成マスタに親商品CDが登録されていない時のエラー表示方法を統一 2016.12.07 kawana End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.StockSetInst.service:stockSetInst#initScreenHttp
     * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

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
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#deferredGetInitData
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
	 *
	 * @description
	 * セット組指示初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.stockSetInst.init().then(function(response){
			$scope.head = response.data.head;
			$scope.setStructureList = response.data.setStructureList;
			$scope.stockList = response.data.stockList;

			// ログイン情報より初期値を設定
			$scope.head.mlocation.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.tstoreNo.storeDt = userInfo.systemDt;

			// 画面非活性化設定
			$scope.setEditable(true);

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
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#showProduct
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#productCdBlur
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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
     * @name oneslogiWms.StockSetInst.service:stockSetInst#search
     * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		api.stockSetInst.search(request).then(function(response) {

			// [#244] セット品構成マスタに親商品CDが登録されていない時のエラー表示方法を統一(不要なコード削除) 2016.12.07 kawana

			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				$scope.setData(response);
			}
		});
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockSetInst.service:stockSetInst#setData
     * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
     *
     * @description
     * 検索結果反映処理<br>
     * ・行センタ状態のクリア<br>
     * ・取得データをグリッドに反映<br>
     * ・トータル件数を設定
     */
	$scope.setData = function(response) {
		$scope.isopen = false;
		owsCommon.setFirstFocus('inputform');

		//取得データをグリッドに反映
		$scope.setStructureList = response.data.setStructureList;
		$scope.stockList = response.data.stockList;

		// 画面活性化設定
		$scope.setEditable(false);

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
     * @ngdoc method
     * @name oneslogiWms.StockSetInst.service:stockSetInst#clear
     * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
     *
     * @description
     * クリアボタン押下処理<br>
     * ・クリア処理呼び出し
     */
	$scope.clear = function(){
		//検索条件枠を開いた状態に設定
		$scope.isopen = true;
		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#deferredGetStockTypeList
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#changeClient
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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
	// [ON推-CT113-009] ロケーションCDの下にロケーション名称を表示 2015.12.24 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#locationCdBlur
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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
	// [ON推-CT113-009] ロケーションCDの下にロケーション名称を表示 2015.12.24 hayashi End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#showLocation
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
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
			// [ON推-CT113-010] ロケーションCDの下にロケーション名称を表示 2015.12.24 hayashi Start
			$scope.head.mlocation.locationNm = selectedItem.locationNm;
			// [ON推-CT113-010] ロケーションCDの下にロケーション名称を表示 2015.12.24 hayashi End
		});
	};

	// 画面入力制限設定
	$scope.setEditable= function(flg){
		if(flg){
			// 初期化画面非活性化設置
			//荷主センタ変更対応 201７.02.24 sja Start
			directiveControl.editable($scope, 'centerCd', true);
			directiveControl.editable($scope, 'clientCd', true);
			//荷主センタ変更対応 201７.02.24 sja End
			directiveControl.editable($scope, 'productCd', true);
			directiveControl.editable($scope, 'search', true);
			directiveControl.editable($scope, 'customerCd', false);
			directiveControl.editable($scope, 'stockTypeCd', false);
			directiveControl.editable($scope, 'storeDt', false);
			directiveControl.editable($scope, 'lot', false);
			directiveControl.editable($scope, 'limitDt', false);
			directiveControl.editable($scope, 'chargeNum', false);
			directiveControl.editable($scope, 'locationCd', false);
		}else{
			// 検索後画面活性化設定
			//荷主センタ変更対応 201７.02.24 sja Start
			directiveControl.editable($scope, 'centerCd', false);
			directiveControl.editable($scope, 'clientCd', false);
			//荷主センタ変更対応 201７.02.24 sja End
			directiveControl.editable($scope, 'productCd', false);
			directiveControl.editable($scope, 'search', false);
			directiveControl.editable($scope, 'customerCd', true);
			directiveControl.editable($scope, 'stockTypeCd', true);
			directiveControl.editable($scope, 'storeDt', true);

			if (lotManagFlg == '0'){
				directiveControl.editable($scope, 'lot', false);
				$scope.head.tlot.lot = null;
			}else{
				directiveControl.editable($scope, 'lot', true);
			}
			if(limitDtManagFlg == '0'){
				directiveControl.editable($scope, 'limitDt', false);
				$scope.head.tlot.limitDt = null;
			}else{
				directiveControl.editable($scope, 'limitDt', true);
			}
			directiveControl.editable($scope, 'chargeNum', true);
			directiveControl.editable($scope, 'locationCd', true);

		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#chargeNumBlur
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
	 *
	 * @description
	 * 指示数量のロストフォーカス処理<br>
	 *
	 * 入数総数計算
	 */
	$scope.chargeNumBlur = function() {
		for(var i = 0; i < $scope.setStructureList.length; i++){
			var unitNum = $scope.setStructureList[i].unitNum;
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add Start
			if (isNullOrUndefined($scope.head.chargeNum)) {
				// 構成総数・指示数初期化
				if (!$scope.setStructureList[i].instNum) {
					$scope.setStructureList[i].instNum = null;
					$scope.setStructureList[i].sumUnitNum = null;
					continue;
				}
			}
			// [#3347][Ver3.0] TODO残対応(UoM) 2018.01.15 honma Add End
			// 指示数量 * 入数
			$scope.setStructureList[i].sumUnitNum = owsCommon.multiply($scope.head.chargeNum, unitNum);

			// [ON推-品向-1191] 初期時は指示数に0を表示 2016.09.05 kawana Start
			if (!$scope.setStructureList[i].instNum) {
				$scope.setStructureList[i].instNum = 0;
			}
			// [ON推-品向-1191] 初期時は指示数に0を表示 2016.09.05 kawana End
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#moveNumInfoBlur
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
	 *
	 * @description
	 * グリッドの移動数のロストフォーカス処理<br>
	 *
	 *　商品単位で移動数の合計
	 */
	$scope.moveNumInfoBlur = function(rowIndex) {
		// 商品単位で移動数の合計
		var proCd = $scope.stockList[rowIndex].mproduct.productCd;　// 変更商品
		var sumMoveNum = 0;
		for(var i = 0; i < $scope.stockList.length; i++){
			var productCd = $scope.stockList[i].mproduct.productCd;
			var moveNumInfo = $scope.stockList[i].moveNumInfo;
			if(proCd == productCd){
				if(moveNumInfo && owsCommon.isPositive(moveNumInfo)){
					sumMoveNum = owsCommon.add(sumMoveNum, moveNumInfo);
				}
			}
		}

		// 商品の指示数変更
		for(var i = 0; i < $scope.setStructureList.length; i++){
			var setProCd = $scope.setStructureList[i].mproduct.productCd;
			if(setProCd == proCd){
				$scope.setStructureList[i].instNum = sumMoveNum;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockSetInst.service:stockSetInst#register
	 * @methodOf oneslogiWms.StockSetInst.service:stockSetInst
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーをクリア
		gridOptionMessageControl.hideAll($scope.gridOptions2);

		owsCommon.syncExec(function() {
			var error = false;
			var bln = false;
			// ロット管理チェック
			if (lotManagFlg == '1'){
				var lot = $scope.head.tlot.lot;
				if(!(lot) || lot.length == 0){
					optionMessageControl.show($scope, 'lot', owsCommon.convertMessage('lotNotInputLotManagementProductError'));
					// [#6929][OSS] エラー時のフォーカス不正修正 2019.12.06 kawana Start
					directiveControl.firstErrorOnFocus('inputform');
					// [#6929][OSS] エラー時のフォーカス不正修正 2019.12.06 kawana End
					error = true;
				}
			}

			// 期限日管理チェック
			if(limitDtManagFlg == '1'){
				var limitDt = $scope.head.tlot.limitDt;
				if(!(limitDt) || limitDt.length == 0){
					optionMessageControl.show($scope, 'limitDt', owsCommon.convertMessage('limitDateNotInputLimitDateManagementProductError'));
					// [#6929][OSS] エラー時のフォーカス不正修正 2019.12.06 kawana Start
					directiveControl.firstErrorOnFocus('inputform');
					// [#6929][OSS] エラー時のフォーカス不正修正 2019.12.06 kawana End
					error = true;
				}
			}

			// 入力の移動数チェック
			for(var i = 0; i < $scope.stockList.length; i++){
				var checkMoveNum = $scope.stockList[i].moveNumInfo;
				var checkchargeNum = $scope.stockList[i].chargeNum;
				if(checkMoveNum != null && owsCommon.isPositive(checkMoveNum) && owsCommon.isGreaterThan(checkMoveNum, checkchargeNum)){
					gridOptionMessageControl.show($scope.gridOptions2, "moveNumInfo", $filter('owfMessage')((2, 'moveQtyCannotInputMoreThanstockCanBeAllocateError')), i);
					// [#6929][OSS] エラー時のフォーカス不正修正 2019.12.06 kawana Start
					if (!error) {
						// エラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, i);
						// エラーにフォーカス
						directiveControl.firstErrorOnFocus('gridform');
						error = true;
					}
					// [#6929][OSS] エラー時のフォーカス不正修正 2019.12.06 kawana End
				}
			}

			if (error) {
				return;
			}

			// 指示数チェック
			for(var i = 0; i < $scope.setStructureList.length; i++){
				var sumUnitNum = $scope.setStructureList[i].sumUnitNum;
				var instNum = $scope.setStructureList[i].instNum;
				if(owsCommon.isNotEqual(sumUnitNum, instNum)){
					// セット必要数と入力数が不一致

					// [ON推-品向-1191] 指示数不足と指示数超過でエラーを変更 2016.09.05 kawana Start

					var messageCd;
					if (owsCommon.isLessThan(sumUnitNum, instNum)) {
						// 超過
						messageCd = "instNumCannotExecuteOverageError";
					} else {
						// 不足
						messageCd = "instNumCannotExecuteShortageError";
					}

					var productCd = $scope.setStructureList[i].mproduct.productCd;

					// [新WMS-113-008] 移動数入力で不正エラー表示とフォーカス設定追加 2016.02.08 koyama Start
					for (var j = 0; j < $scope.stockList.length; j++) {

						if (productCd == $scope.stockList[j].mproduct.productCd) {
							// 項目にエラーを表示
							gridOptionMessageControl.show($scope.gridOptions2, "moveNumInfo", $filter('owfMessage')(messageCd), j);
						}
					}

					if (!error) {
						// エラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions2, 0);
						// エラーにフォーカス
						directiveControl.firstErrorOnFocus('gridform');
						// [新WMS-113-008] 移動数入力で不正エラー表示とフォーカス設定追加 2016.02.08 koyama End
						error = true;
					}
				}
			}

			if (error) {
				return;
			}

			// [ON推-品向-1191] 指示数不足と指示数超過でエラーを変更 2016.09.05 kawana End

			// 預託、在庫区分のチェック
			var head = {};
			head.customerCd = $scope.head.mcustomer.customerCd
			head.stockTypeCd = $scope.head.mstockType.stockTypeCd
			for(var i = 0; i < $scope.stockList.length; i++){
				var body = {};
				body.customerCd = $scope.stockList[i].mcustomer.customerCd
				body.stockTypeCd = $scope.stockList[i].mstockType.stockTypeCd
				if($scope.stockList[i].moveNumInfo != null && owsCommon.isPositive($scope.stockList[i].moveNumInfo) ){
					if(head.customerCd != body.customerCd || head.stockTypeCd != body.stockTypeCd){
						alertMessage.setErrorMessageByCode("depositAndLocationCannotExecuteDifferenceError");
						return;
					}
				}
			}

			var request = {};
			request.data = {};
			request.data.head = $scope.head;

			var requestStockList = [];
			for(var i = 0; i < $scope.stockList.length; i ++) {
				if($scope.stockList[i].moveNumInfo) {
					requestStockList.push($scope.stockList[i]);
				}
			}

			request.data.stockList = requestStockList;

			// セット組指示登録前入力チェック
			api.stockSetInst.inputCheckUpdate(request).then(function(response) {
				// 処理結果確認
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){
						//商品マスタ存在異常
						if (response.status.listStatus[i].status.statusCode == 2){
							optionMessageControl.show($scope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
						//ロケーションマスタ存在異常
						if (response.status.listStatus[i].status.statusCode == 5){
							optionMessageControl.show($scope, "locationCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
						//取引先マスタ存在異常
						if (response.status.listStatus[i].status.statusCode == 6){
							optionMessageControl.show($scope, "customerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
						//在庫区分マスタ存在異常
						if (response.status.listStatus[i].status.statusCode == 7){
							optionMessageControl.show($scope, "stockTypeCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
					}
				}

				if(bln == true){
					return ;
				}
				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// セット組指示
					api.stockSetInst.register(request).then(function(response) {
						if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
							// [ON推-CT113-011] 画面初期化用の通信制御処理で使用 2015.12.24 hayashi Start
							//$scope.initScreen();
							$scope.initScreenHttp();
							// [ON推-CT113-011] 画面初期化用の通信制御処理で使用 2015.12.24 hayashi End
						}
					});
				}
			});
		});

	};

	//画面初期化処理を実行
	$scope.initScreen();
}]);

