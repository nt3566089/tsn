/**
 * @ngdoc overview
 * @name oneslogiWms.StockMove
 *
 * @description
 * 在庫移動画面
 */
angular.module('oneslogiWms.StockMove',[])
/**
 * @ngdoc service
 * @name oneslogiWms.StockMove.service:stockMoveApi
 *
 * @description
 * 在庫調整WebApi定義<br>
 * ・resources/stock/stockMove/initNew 初期処理WebApi<br>
 * ・resources/stock/stockMove/initUpdate 初期処理（訂正）WebApi<br>
 * ・resources/stock/stockMove/inputCheckUpdate 在庫移動登録前入力チェックWebApi<br>
 * ・resources/stock/stockMove/checkReplenishInfoOverwrite 確認メッセージ表示チェックWebApi<br>
 * ・resources/stock/stockMove/register 在庫移動登録WebApi<br>
 * ・resources/stock/stockMove/select 確定後在庫データ取得WebApi<br>
 * ・resources/common/product/record 商品データ取得<br>
 * ・resources/common/depositCustomer/keyValueList 預託在庫区分取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分取得<br>
 * ・resources/common/location/record ロケーションデータ取得<br>
 * ・resources/common/supplierCustomer/record  仕入先データ取得<br>
 *
 */
.factory('stockMoveApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
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
		param: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/param/record']
				 ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record'],
				// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
				 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				// [Ver3.0] unit of measure対応 2017.11.27 ライ ENDS
				 ]
		),
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),
		stockMove: AngularAPIClient.make(
				[
				 ['initNew',             'GET',  'resources/stock/stockMove/initNew'],
				 ['initUpdate',          'GET',  'resources/stock/stockMove/initUpdate'],
				 ['select',              'GET',  'resources/stock/stockMove/select'] ,
				 ['selectChargeNum',     'GET',  'resources/stock/stockMove/selectChargeNum'] ,
				 ['selectChargeNumFrom', 'GET',  'resources/stock/stockMove/selectChargeNumFrom'] ,
				 ['selectChargeNumTo',   'GET',  'resources/stock/stockMove/selectChargeNumTo'],
				 ['inputCheckUpdate',    'POST', 'resources/stock/stockMove/inputCheckUpdate'],
				//[ON推-品質問題点指摘（新ｿﾘV2-015）]修正対応 2016.07.20 chou Add Start
				 ['checkReplenishInfoOverwrite',    'POST', 'resources/stock/stockMove/checkReplenishInfoOverwrite'],
				//[ON推-品質問題点指摘（新ｿﾘV2-015）]修正対応 2016.07.20 chou Add End
				 ['register',            'POST', 'resources/stock/stockMove/register']
				 ]
		)
	};
}])
.controller('StockMove', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'stockMoveApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;
	var stockId_All;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#initScreen
	 * @methodOf oneslogiWms.StockMove.object:StockMove
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
		// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
		// 画面表示用の複数荷姿リストmodel共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 複数荷姿用itemCdを定義
				// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana Start
				id: "chargeNum_FMultiText",
				"chargeNum_F" : {
					model : angular.copy(multiTextModels),
					listModel : "fromDto.mproduct.mproductShapeList"
				},
				id: "chargeNum_F_TMultiText",
				"chargeNum_F_T" : {
					model : angular.copy(multiTextModels),
					listModel : "fromDto.mproduct.mproductShapeList"
				},
				// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana End
				id: "chargeNum_TMultiText",
				"chargeNum_T" : {
					model : angular.copy(multiTextModels),
					listModel : "fromDto.mproduct.mproductShapeList"
				},
				id: "moveNumMultiText",
				"moveNum" : {
					model : angular.copy(multiTextModels),
					listModel : "fromDto.mproduct.mproductShapeList"
				}
		};
		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.fromDto.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リストFrom変更（同期処理）
			$scope.deferredGetDepositStockTypeList_F(1)
			.then(function(response){
				newDepositStockTypeList_F = response.data;
			});

			// 預託在庫区分リストTo変更（同期処理）
			$scope.deferredGetDepositStockTypeList_T(1)
			.then(function(response){
				newDepositStockTypeList_T = response.data;
			});

			//在庫区分リストFrom変更（同期処理）
			$scope.deferredGetStockTypeList_F(1)
			.then(function(response){
				newStockTypeList_F = response.data;
			});

			//在庫区分リストTo変更（同期処理）
			$scope.deferredGetStockTypeList_T(1)
			.then(function(response){
				newStockTypeList_T = response.data;
			});

			// 入庫No管理の取得
			$scope.param(1);
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.fromDto.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストFromを設定
				setDepositStockTypeList_F(newDepositStockTypeList_F, true);
				// 選択した荷主で取得済みの預託在庫区分リストToを設定
				setDepositStockTypeList_T(newDepositStockTypeList_T, true);
				// 選択した荷主で取得済みの在庫区分リストFromを設定
				setStockTypeList_F(newStockTypeList_F, true);
				// 選択した荷主で取得済みの在庫区分リストToを設定
				setStockTypeList_T(newStockTypeList_T, true);
			}
		};

		$scope.moveNumCheck = function(moveNum) {
			if (owsCommon.isZeroOrLess(moveNum)) {
				return false;
        	}
        	return true;
        };
        $scope.moveNumMessage = $filter('owfMessage')("minIsOneError");


		// 検索結果を表示、非活性
		$scope.controlEditableInit();
        // 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#changeClient
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託と在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リストFrom変更（同期処理）
		$scope.deferredGetDepositStockTypeList_F(1)
		.then(function(response){
			setDepositStockTypeList_F(response.data, clearSelected);
		});

		// 預託在庫区分リストTo変更（同期処理）
		$scope.deferredGetDepositStockTypeList_T(1)
		.then(function(response){
			setDepositStockTypeList_T(response.data, clearSelected);
		});

		// 在庫区分リストFrom変更（同期処理）
		$scope.deferredGetStockTypeList_F(1)
		.then(function(response){
			setStockTypeList_F(response.data, clearSelected);
		});

		// 在庫区分リストTo変更（同期処理）
		$scope.deferredGetStockTypeList_T(1)
		.then(function(response){
			setStockTypeList_T(response.data, clearSelected);
		});

		// 入庫No管理の取得
		$scope.param(1);
	};

	// 預託在庫区分リストFrom再設定処理
	var setDepositStockTypeList_F = function(list, clearSelected) {
		$scope.depositStockTypeList_F = list;

		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
		if (clearSelected) {
			// クリアする

			if ($scope.depositStockTypeList_F.length == 1) {
				// 選択肢が一つしかない場合は選択状態にする

				$scope.fromDto.mcustomer.customerCd = $scope.depositStockTypeList_F[0].mCustomer.customerCd;
			} else {
				$scope.fromDto.mcustomer.customerCd = null;
			}
		}
		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End
	};

	// 預託在庫区分リストTo再設定処理
	var setDepositStockTypeList_T = function(list, clearSelected) {
		$scope.depositStockTypeList_T = list;


		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
		if (clearSelected) {
			// クリアする

			if ($scope.depositStockTypeList_T.length == 1) {
				// 選択肢が一つしかない場合は選択状態にする

				$scope.toDto.mcustomer.customerCd = $scope.depositStockTypeList_T[0].mCustomer.customerCd;
			} else {
				$scope.toDto.mcustomer.customerCd = null;
			}
		}
		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End
	};

	// 在庫区分リストFrom再設定処理
	var setStockTypeList_F = function(list, clearSelected) {
		$scope.stockTypeList_F = list;

		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
		if (clearSelected) {
			// クリアする

			if ($scope.stockTypeList_F.length == 1) {
				// 選択肢が一つしかない場合は選択状態にする

				$scope.fromDto.mstockType.stockTypeCd = $scope.stockTypeList_F[0].stockTypeCd;

			} else {
				$scope.fromDto.mstockType.stockTypeCd = null;
			}
		}
		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End
	};

	// 在庫区分リストTo再設定処理
	var setStockTypeList_T = function(list, clearSelected) {
		$scope.stockTypeList_T = list;

		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana Start
		if (clearSelected) {
			// クリアする

			if ($scope.stockTypeList_T.length == 1) {
				// 選択肢が一つしかない場合は選択状態にする

				$scope.toDto.mstockType.stockTypeCd = $scope.stockTypeList_T[0].stockTypeCd;

			} else {
				$scope.toDto.mstockType.stockTypeCd = null;
			}
		}
		// [EC-CT1-001] 選択肢が一つしかない場合は選択状態にする 2015.02.09 kawana End
		// 選択肢が一つの場合は一つ目を設定
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#initScreenHttp
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *  画面初期化用の通信制御処理r>
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDepositStockTypeList_F(0),
				 $scope.deferredGetDepositStockTypeList_T(0),
				 $scope.deferredGetStockTypeList_F(0),
				 $scope.deferredGetStockTypeList_T(0),
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
			$scope.stockId_All = $route.current.params.stockId;

			$scope.initUpdate(request.stockId).then(function() {

				// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる(初期値設定は不要になったため削除) 2015.05.12 kawana

				// [NISHI-UT-002] 移動ケース数にフォーカス 2015.07.07 kawana Start

				// [NISHI-UT-002] 移動ケース数にフォーカス 2015.07.07 kawana End
				// [Ver3.0] unit of measure対応 2017.11.27 ライ START
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
			 // [Ver3.0] unit of measure対応 2017.11.27 ライ END
				deferred.resolve();
			});

		}else{
			api.stockMove.initNew().then(function(response){
				$scope.fromDto = response.data.fromDto;
				$scope.toDto = response.data.toDto;
				$scope.fromDto.mclient.clientCd = userInfo.clientCd;
				$scope.fromDto.mlocation.mcenter.centerCd = userInfo.centerCd;

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
	 * @name oneslogiWms.StockMove.object:StockMove#deferredGetDepositStockTypeList_F
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 預託在庫区分From取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList_F = function(index) {
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
			request.clientCd = $scope.fromDto.mclient.clientCd;
		}

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositStockTypeList_F = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#deferredGetDepositStockTypeList_T
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 預託在庫区分To取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositStockTypeList_T = function(index) {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		if (index == 0) {
			//荷主センタ変更対応 201７.03.03 sja Start
			//	request.clientCd = userInfo.clientCd;
				if($route.current.params){
					request.clientCd = $route.current.params.clientCd;
				}else{
					request.clientCd = userInfo.clientCd;
				}
				//荷主センタ変更対応 201７.03.03 sja End
		}else{
			request.clientCd = $scope.fromDto.mclient.clientCd;
		}

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			$scope.depositStockTypeList_T = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#deferredGetStockTypeList_F
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 在庫区分From取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList_F = function(index) {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		if(index == 0 ){
			request.clientCd = userInfo.clientCd;
		}else{
			request.clientCd = $scope.fromDto.mclient.clientCd;
		}

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			$scope.stockTypeList_F = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#deferredGetStockTypeList_T
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 在庫区分To取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList_T = function(index) {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		if(index == 0 ){
			request.clientCd = userInfo.clientCd;
		}else{
			request.clientCd = $scope.fromDto.mclient.clientCd;
		}

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			$scope.stockTypeList_T = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#depositCd_F_Change
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *預託在庫区分_F変更後処理<br>
	 *
	 */
	$scope.depositCd_F_Change = function(clearSelected) {
		$scope.selectChargeNumFrom();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#depositCd_T_Change
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *預託在庫区分_T変更後処理<br>
	 *
	 */
	$scope.depositCd_T_Change = function(clearSelected) {
		$scope.selectChargeNumTo();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#stockTypeCd_F_Change
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *在庫区分_F変更後処理<br>
	 *
	 */
	$scope.stockTypeCd_F_Change = function(clearSelected) {
		$scope.selectChargeNumFrom();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#stockTypeCd_T_Change
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *在庫区分_T変更後処理<br>
	 *
	 */
	$scope.stockTypeCd_T_Change = function(clearSelected) {
		$scope.selectChargeNumTo();
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#productBlur
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
		// 入力された商品コードを取得
		var productCd = $scope.fromDto.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.fromDto.mclient.clientCd);
			request.productCd = productCd;

			$scope.fromDto.mproduct.productNm = null;
			$scope.fromDto.mproduct.janCd = null;
			$scope.fromDto.mproduct.productAbbr = null;

			api.product.record(request).then(function(response){
				$scope.fromDto.mproduct.productNm = response.data.mProduct.productNm;
				$scope.fromDto.mproduct.janCd = response.data.mProduct.janCd;
				$scope.fromDto.mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.fromDto.mproduct.lotManagFlg = response.data.mProduct.lotManagFlg;
				$scope.fromDto.mproduct.limitDtManagFlg = response.data.mProduct.limitDtManagFlg;
				$scope.selectChargeNumFrom();
				directiveControl.editable($scope, 'lot', false);
				optionMessageControl.hide($scope, 'lot');
				directiveControl.editable($scope, 'limitDt', false);
				optionMessageControl.hide($scope, 'limitDt');
				// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正(不要なソースを削除) 2015.07.27 kawana

				//該当商品がロット管理対象の場合のみ、入力可能であり必須項目
				if($scope.fromDto.mproduct.lotManagFlg == "1"){
					directiveControl.editable($scope, 'lot', true);
				}else{
					directiveControl.editable($scope, 'lot', false);
					optionMessageControl.hide($scope, 'lot');
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana Start
					$scope.fromDto.tlot.lot = null;
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana End
				}
				//該当商品が期限日管理対象の場合のみ、入力可能であり必須項目
				if($scope.fromDto.mproduct.limitDtManagFlg == "1"){
					directiveControl.editable($scope, 'limitDt', true);
				}else{
					directiveControl.editable($scope, 'limitDt', false);
					optionMessageControl.hide($scope, 'limitDt');
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana Start
					$scope.fromDto.tlot.limitDt = null;
					// [新WMS-110-032] 商品CDを変更しない場合はロット、期限日は削除しないように修正 2015.07.27 kawana End
				}
				// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
			var productId  = response.data.mProduct.productId;
		    if(productId != null){
			if (String(productId) && 0 < String(productId).length) {
				// [#2799][Ver3.0] unit of measure 対応 2017.11.13 honma Mod Start
				var request = {};
				request.clientId = userInfo.clientIdByCd($scope.fromDto.mclient.clientCd);
				request.productCd = productCd;
				// 商品に紐付く商品荷姿リスト取得(荷姿グループ明細含む)
				api.product.productShape(request).then(function(response){
					if(response != null){
						$scope.fromDto.mproduct.mproductShapeList = response.data.mProduct.mproductShapeList;
						$scope.wkProductShapeList = response.data.mProduct.mproductShapeList;
						// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
						//商品?位
						$scope.stockDataH.productUnit = response.data.mProduct.productUnit;
						// 入数取得
						$scope.fromDto.unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);
						// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana Start
						// 在庫数・総在庫数の荷姿を設定
						multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_F', 'chargeNum_FMultiText', $scope.fromDto.mproduct.productId);
						multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_F_T', 'chargeNum_F_TMultiText', $scope.fromDto.mproduct.productId);
						// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana End
					}
				});
			}
		}else{
			$scope.fromDto.unitNumBreakdown = null;
			var multiTextInitModels = owsCommon.getMultiTextModels(4);
			// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana Start
			$scope.multiTextOptions.chargeNum_F.model = angular.copy(multiTextInitModels);
			$scope.multiTextOptions.chargeNum_F_T.model = angular.copy(multiTextInitModels);
			// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana End
			$scope.multiTextOptions.chargeNum_T.model = angular.copy(multiTextInitModels);
			$scope.multiTextOptions.moveNum.model = angular.copy(multiTextInitModels);
		}
	});
			// [Ver3.0] unit of measure対応 2017.11.27 ライ END
}else {
			$scope.fromDto.mproduct.productNm = null;
			$scope.fromDto.mproduct.janCd = null;
			$scope.fromDto.mproduct.productAbbr = null;
			$scope.fromDto.tlot.lot = null ;
			$scope.fromDto.tlot.limitDt = null ;
			directiveControl.editable($scope, 'limitDt', false);
			optionMessageControl.hide($scope, 'limitDt');
			directiveControl.editable($scope, 'lot', false);
			optionMessageControl.hide($scope, 'lot');
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#showProduct
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(){

		var items = {
				clientCd: $scope.fromDto.mclient.clientCd,
				productCd: $scope.fromDto.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.fromDto.mproduct.productCd =  selectedItem.productCd;
			$scope.fromDto.mproduct.productNm =  selectedItem.productNm;
			$scope.fromDto.mproduct.productAbbr =  selectedItem.productAbbr;
			$scope.fromDto.mproduct.janCd =  selectedItem.janCd;
			$scope.selectChargeNumFrom();
			$scope.fromDto.mproduct.lotManagFlg = selectedItem.lotManagFlg;
			$scope.fromDto.mproduct.limitDtManagFlg = selectedItem.limitDtManagFlg;
			directiveControl.editable($scope, 'lot', false);
			optionMessageControl.hide($scope, 'lot');
			directiveControl.editable($scope, 'limitDt', false);
			optionMessageControl.hide($scope, 'limitDt');
			$scope.fromDto.tlot.lot = null ;
			$scope.fromDto.tlot.limitDt = null ;
			//該当商品がロット管理対象の場合のみ、入力可能であり必須項目
			if($scope.fromDto.mproduct.lotManagFlg == "1"){
				directiveControl.editable($scope, 'lot', true);
			}else{
				directiveControl.editable($scope, 'lot', false);
				optionMessageControl.hide($scope, 'lot');
			}
			//該当商品が期限日管理対象の場合のみ、入力可能であり必須項目
			if($scope.fromDto.mproduct.limitDtManagFlg == "1"){
				directiveControl.editable($scope, 'limitDt', true);
			}else{
				directiveControl.editable($scope, 'limitDt', false);
				optionMessageControl.hide($scope, 'limitDt');
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#showLocation_F
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * ロケーションFrom検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation_F = function(){

		var items = {
				centerCd: $scope.fromDto.mlocation.mcenter.centerCd,
				locationCd: $scope.fromDto.mlocation.locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.fromDto.mlocation.locationCd = selectedItem.locationCd;
			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start
			$scope.fromDto.mlocation.locationNm = selectedItem.locationNm;
			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End
			$scope.selectChargeNumFrom();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#locationCdBlur_F
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur_F = function() {
		// 入力されたロケーションCD
		var locationCd = $scope.fromDto.mlocation.locationCd;

		if (locationCd && 0 < locationCd.length) {

			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.fromDto.mlocation.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){

				// ロケーション名称を表示
				$scope.fromDto.mlocation.locationNm = response.data.mLocation.locationNm;

				// 在庫数を取得して表示
				$scope.selectChargeNumFrom();
			});
		} else {

			// ロケーション名称をクリア
			$scope.fromDto.mlocation.locationNm = null;

			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#showLocation_T
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * ロケーションTo検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation_T = function(){

		var items = {
				centerCd: $scope.fromDto.mlocation.mcenter.centerCd,
				locationCd: $scope.toDto.mlocation.locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.toDto.mlocation.locationCd = selectedItem.locationCd;
			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start
			$scope.toDto.mlocation.locationNm = selectedItem.locationNm;
			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End
			$scope.selectChargeNumTo();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#locationCdBlur_T
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 *ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur_T = function() {
		// 入力されたロケーションCD
		var locationCd = $scope.toDto.mlocation.locationCd;

		if (locationCd && 0 < locationCd.length) {

			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.fromDto.mlocation.mcenter.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){

				// ロケーション名称を表示
				$scope.toDto.mlocation.locationNm = response.data.mLocation.locationNm;

				// 在庫数を取得して表示
				$scope.selectChargeNumTo();
				});
		} else {

			// ロケーション名称をクリア
			$scope.toDto.mlocation.locationNm = null;

			// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#customerCdBlur
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された仕入先コードを取得
		var customerCd = $scope.fromDto.tstoreNo.mcustomer.customerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.fromDto.mclient.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.fromDto.tstoreNo.mcustomer.customerNm = response.data.mCustomer.customerNm;
				$scope.selectChargeNum();
			});

		} else {
			$scope.fromDto.tstoreNo.mcustomer.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#showCustomer
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var items = {
				clientCd: $scope.fromDto.mclient.clientCd,
				vendorCd: $scope.fromDto.tstoreNo.mcustomer.customerCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);


		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

		$scope.fromDto.tstoreNo.mcustomer.customerCd = selectedItem.customerCd;
		$scope.fromDto.tstoreNo.mcustomer.customerNm = selectedItem.customerNm;
		$scope.selectChargeNum();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#lotCdBlur
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * ロットのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.lotCdBlur = function() {
		// 入力された商品コードを取得
		var lotCd = $scope.fromDto.tlot.lot;

		if (lotCd && 0 < lotCd.length) {
			$scope.selectChargeNum();
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#limitDtBlur
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 期限日のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.limitDtBlur = function() {
		// 入力された商品コードを取得
		var limitDt = $scope.fromDto.tlot.limitDt;

		if (limitDt && 0 < limitDt.length) {
			$scope.selectChargeNum();
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#storeLabelNoBlur
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 入庫ラベルNo.のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.storeLabelNoBlur = function() {
		// 入力された商品コードを取得
		var storeLabelNo = $scope.fromDto.tstoreNo.storeLabelNo;

		if (storeLabelNo && 0 < storeLabelNo.length) {
			$scope.selectChargeNum();
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#selectChargeNum
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 移動元部各項目をロストフォーカス時の処理<br>
	 * 在庫から在庫数を取得し、設定する
	 */
	$scope.selectChargeNum = function(){

		// [ON推-品向-596] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var bln = false ;
		var productCd = $scope.fromDto.mproduct.productCd;
		var customerCd = $scope.fromDto.mcustomer.customerCd;
		var locationCd = $scope.fromDto.mlocation.locationCd;
		var stockTypeCd = $scope.fromDto.mstockType.stockTypeCd;
		if(productCd && 0 < productCd.length && customerCd && 0 < customerCd.length  && locationCd && 0 < locationCd.length  && stockTypeCd && 0 < stockTypeCd.length){
			var isError = $scope.searchform.$invalid;
			var request = {};
			request.data = {};
			request.data.fromDto = $scope.fromDto;
			api.stockMove.selectChargeNum(request).then(function(response) {
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
							optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}

						//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
						///預託在庫区分預託在庫区分が存在しません
						if (response.status.listStatus[i].status.statusCode == 11){
							optionMessageControl.show($scope, "depositCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
						//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
					}
				}

				if(bln == true){
					$scope.fromDto.chargeNum = 0;
					return ;
				}

				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					$scope.fromDto.chargeNum = response.data.fromDto.chargeNum;
				}else{
					$scope.fromDto.chargeNum = 0;
				}
			});
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#selectChargeNumFrom
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 移動元部各項目をロストフォーカス時の処理<br>
	 * 在庫から在庫数を取得し、設定する
	 */
	$scope.selectChargeNumFrom = function(){

		// [ON推-品向-596] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var bln = false ;
		var productCd = $scope.fromDto.mproduct.productCd;
		var customerCd = $scope.fromDto.mcustomer.customerCd;
		var locationCd = $scope.fromDto.mlocation.locationCd;
		var stockTypeCd = $scope.fromDto.mstockType.stockTypeCd;
		if(productCd && 0 < productCd.length && customerCd && 0 < customerCd.length  && locationCd && 0 < locationCd.length  && stockTypeCd && 0 < stockTypeCd.length){
			var isError = $scope.searchform.$invalid;
			var request = {};
			request.data = {};
			request.data.fromDto = $scope.fromDto;
			api.stockMove.selectChargeNumFrom(request).then(function(response) {

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
							optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}

						//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
						///預託在庫区分預託在庫区分が存在しません
						if (response.status.listStatus[i].status.statusCode == 11){
							optionMessageControl.show($scope, "depositCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
						//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
					}
				}

				if(bln == true){
					$scope.fromDto.sumChargeNum = 0;
					$scope.fromDto.chargeNum = 0;
					return ;
				}

				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {

					$scope.fromDto.sumChargeNum = response.data.fromDto.sumChargeNum;
					// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana Start
					owsCommon.syncExec(function() {
						// 総在庫数を荷姿内訳を計算
						owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.fromDto.sumChargeNum, "multiTextOptions", "chargeNum_F_T");
					});
					// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana End

					api.stockMove.selectChargeNum(request).then(function(response) {

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
									optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
									bln = true ;
								}
							}
						}

						if(bln == true){
							$scope.fromDto.chargeNum = 0;
							return ;
						}

						if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
							$scope.fromDto.chargeNum = response.data.fromDto.chargeNum;
						}else{
							$scope.fromDto.chargeNum = 0;
						}
						// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana Start
						owsCommon.syncExec(function() {
							// 在庫数を荷姿内訳を計算
							owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.fromDto.chargeNum, "multiTextOptions", "chargeNum_F");
						});
						// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana End

					});

				}else{
					$scope.fromDto.sumChargeNum = 0;
					$scope.fromDto.chargeNum = 0;
				}
			});
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#selectChargeNumTo
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 移動先部「ロケーション、預託在庫区分、在庫区分」の項目をロストフォーカス時の処理<br>
	 * 在庫から在庫数を取得し、設定する
	 */
	$scope.selectChargeNumTo = function(){

		optionMessageControl.hide($scope, 'depositCd_T');
		optionMessageControl.hide($scope, 'locationCd_T');
		optionMessageControl.hide($scope, 'stockTypeCd_T');
		optionMessageControl.hide($scope, 'moveNum');

		var customerCd = $scope.toDto.mcustomer.customerCd;
		var locationCd = $scope.toDto.mlocation.locationCd;
		var stockTypeCd = $scope.toDto.mstockType.stockTypeCd;
		var moveNum = $scope.toDto.chargeNum_A;
		var error = false;

		// [【品質】 問題点指摘票(新ソリューション)-033] 預託(To)、在庫区分(To)とロケーション(To)のチェックを削除 2014.11.21 kei

		// [ON推-品向-596] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var bln = false ;
		var customerCd = $scope.toDto.mcustomer.customerCd;
		var locationCd = $scope.toDto.mlocation.locationCd;
		var stockTypeCd = $scope.toDto.mstockType.stockTypeCd;
		//if(customerCd && 0 < customerCd.length  && locationCd && 0 < locationCd.length  && stockTypeCd && 0 < stockTypeCd.length){
			var isError = $scope.searchform.$invalid;
			var request = {};
			request.data = {};
			request.data.fromDto = $scope.fromDto;
			request.data.toDto = $scope.toDto;
			api.stockMove.selectChargeNumTo(request).then(function(response) {
				// 処理結果確認
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){
						//ロケーションマスタ存在異常
						if (response.status.listStatus[i].status.statusCode == 5){
							optionMessageControl.show($scope, "locationCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}

						//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
						///預託在庫区分預託在庫区分が存在しません
						if (response.status.listStatus[i].status.statusCode == 11){
							optionMessageControl.show($scope, "depositCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}

						if (response.status.listStatus[i].status.statusCode == 12){
							optionMessageControl.show($scope, "depositCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							bln = true ;
						}
						//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
					}
				}

				if(bln == true){
					$scope.toDto.sumChargeNum = 0;
					// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi Start
					$scope.toDto.caseSumChargeNum = 0;
					$scope.toDto.pieceSumChargeNum = 0;
					// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi End
					return ;
				}

				if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					$scope.toDto.sumChargeNum = response.data.toDto.sumChargeNum;
					// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi Start
					var unitNum = response.data.fromDto.unitNum;

					if(unitNum == null || unitNum == "" || unitNum == 0){
						$scope.toDto.caseSumChargeNum = 0;
						$scope.toDto.pieceSumChargeNum = response.data.toDto.sumChargeNum;
					}else{
						$scope.toDto.caseSumChargeNum = owsCommon.divide(response.data.toDto.sumChargeNum, unitNum);
						$scope.toDto.pieceSumChargeNum = owsCommon.remainder(response.data.toDto.sumChargeNum, unitNum);
					}

					// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi End
				}else{
					$scope.toDto.sumChargeNum = 0;
					// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi Start
					$scope.toDto.caseSumChargeNum = 0;
					$scope.toDto.pieceSumChargeNum = 0;
					// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi End
				}
				// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
				owsCommon.syncExec(function() {
					owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.toDto.sumChargeNum, "multiTextOptions", "chargeNum_T");
					owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.toDto.chargeNum_A, "multiTextOptions", "moveNum");
					});
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END

			});
		//}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockAdj.object:stockAdj#initUpdate
	 * @methodOf oneslogiWms.stockAdj.object:stockAdj
	 *
	 * @description
	 * 確定ボタンを押下された時に処理<br>
	 * 商品マスタチェック、画面コントロール活性化変更処理
	 */
	$scope.initUpdate = function(stockId){
		var deferred = $q.defer();

		// [ON推-品向-596] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var isError = $scope.searchform.$invalid;
		var request = {};
		request.data = {};
		request.stockId = stockId;

		api.stockMove.initUpdate(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				$scope.fromDto = response.data.fromDto;
				$scope.toDto = response.data.toDto;
				$scope.fromDto.stockId = $scope.stockId_All;

				// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana Start

				// 移動元 在庫数・総在庫数の荷姿を設定
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_F', 'chargeNum_FMultiText', $scope.fromDto.mproduct.productId);
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_F_T', 'chargeNum_F_TMultiText', $scope.fromDto.mproduct.productId);

				owsCommon.syncExec(function() {
					// 在庫数を荷姿内訳を計算
					owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.fromDto.sumChargeNum, "multiTextOptions", "chargeNum_F_T");
					owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.fromDto.chargeNum, "multiTextOptions", "chargeNum_F");
				});

				// [#4670][v3.0] 移動元在庫数の荷姿内訳を表示 2018.05.30 kawana End

				// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる 2015.05.12 kawana Start
				// 移動先に移動元の情報を設定
				setToDto();
				// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる 2015.05.12 kawana End

				// 検索結果を表示、非活性
				$scope.controlEditable();
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
	 * @name oneslogiWms.stockMove.object:stockMove#confirm
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 確定ボタンを押下された時に処理<br>
	 * 画面コントロール活性化変更処理
	 */
	$scope.confirm = function(){

		optionMessageControl.hide($scope, 'productCd');
		optionMessageControl.hide($scope, 'locationCd_F');
		optionMessageControl.hide($scope, 'lot');
		optionMessageControl.hide($scope, 'limitDt');
		optionMessageControl.hide($scope, 'supplierCustomerCd');

		var lot = $scope.fromDto.tlot.lot;
		var limitDt = $scope.fromDto.tlot.limitDt;
		var bln = false ;
		var error = false;
		if (directiveControl.isEditable($scope,'lot')){
			if (!(lot && 0 < lot.length)) {
				optionMessageControl.show($scope, 'lot', owsCommon.convertMessage('requiredError'));
				error = true;
			}
		}

		if (directiveControl.isEditable($scope,'limitDt')){
			if (!(limitDt && 0 < limitDt.length)) {
				optionMessageControl.show($scope, 'limitDt', owsCommon.convertMessage('requiredError'));
				error = true;
			}
		}

		if ( error ) {
			return;
		}

		// [ON推-品向-596] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var isError = $scope.searchform.$invalid;
		var request = {};
		request.data = {};
		request.data.fromDto = $scope.fromDto;
		request.data.toDto = $scope.toDto;

		api.stockMove.select(request).then(function(response) {
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
						optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//ロケーションマスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 5){
						optionMessageControl.show($scope, "locationCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//倉庫CDが同じでない
					if (response.status.listStatus[i].status.statusCode == 9){
						optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}

					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
					///預託在庫区分預託在庫区分が存在しません
					if (response.status.listStatus[i].status.statusCode == 11){
						optionMessageControl.show($scope, "depositCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
				}
			}

			if(bln == true){
				return ;
			}

			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				$scope.fromDto = response.data.fromDto;
				// [EC-CT1-001] 確定後に移動先(toDto)をリセットする処理を削除(デフォルト値設定がクリアされるため) 2015.02.09 kawana

				// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる 2015.05.12 kawana Start
				// 移動先に移動元の情報を設定
				setToDto();
				// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる 2015.05.12 kawana End
				// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
				// [Ver3.0] unit of measure対応 2017.11.27 ライ END
				// 検索結果を表示、非活性
				$scope.controlEditable();

				optionMessageControl.hide($scope, 'depositCd_T');
				optionMessageControl.hide($scope, 'locationCd_T');
				optionMessageControl.hide($scope, 'stockTypeCd_T');
				optionMessageControl.hide($scope, 'moveNum');

				var customerCd = $scope.toDto.mcustomer.customerCd;
				var locationCd = $scope.toDto.mlocation.locationCd;
				var stockTypeCd = $scope.toDto.mstockType.stockTypeCd;
				var moveNum = $scope.toDto.chargeNum_A;
				var error = false;

				// [【品質】 問題点指摘票(新ソリューション)-033] 移動先在庫総数取得を追加 2014.11.21 kei Start
				request.data = {};
				request.data.fromDto = $scope.fromDto;
				request.data.toDto = $scope.toDto;
				api.stockMove.selectChargeNumTo(request).then(function(response) {
					// 処理結果確認
					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//ロケーションマスタ存在異常
							if (response.status.listStatus[i].status.statusCode == 5){
								optionMessageControl.show($scope, "locationCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								error = true ;
							}

							if (response.status.listStatus[i].status.statusCode == 12){
								optionMessageControl.show($scope, "depositCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								error = true ;
							}
						}
					}

					if(error == true){
						$scope.toDto.sumChargeNum = 0;
					}

					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						$scope.toDto.sumChargeNum = response.data.toDto.sumChargeNum;
					}else{
						$scope.toDto.sumChargeNum = 0;
					}
				});
				// [【品質】 問題点指摘票(新ソリューション)-033] 移動先在庫総数取得を追加 2014.11.21 kei End

				if (!(customerCd && 0 < customerCd.length)) {
					optionMessageControl.show($scope, 'depositCd_T', owsCommon.convertMessage('requiredError'));
					error = true;
				}
				if (!(locationCd && 0 < locationCd.length)) {
					optionMessageControl.show($scope, 'locationCd_T', owsCommon.convertMessage('requiredError'));
					error = true;
				}
				if (!(stockTypeCd && 0 < stockTypeCd.length)) {
					optionMessageControl.show($scope, 'stockTypeCd_T', owsCommon.convertMessage('requiredError'));
					error = true;
				}

				if(isNaN(moveNum)){
					optionMessageControl.show($scope, 'moveNum', owsCommon.convertMessage('numberError'));
					error = true;
				}

				if ( error ) {
					return;
				}

				// [ON推-品向-808] 未入力項目にフォーカス 2015.05.14 kawana Start
        		directiveControl.firstErrorOnFocus('updateform');
				// [ON推-品向-808] 未入力項目にフォーカス 2015.05.14 kawana End
			}
		});
	};

	//[ON推-品質問題点指摘（新ｿﾘV2-015）]修正対応 2016.07.20 chou Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#checkUpdate
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 登録ボタンを押下された時に警告確認メッセージ表示するかのチェック処理<br>
	 */
	$scope.checkUpdate = function() {
		var request = {};
		request.data = {};
		request.data.fromDto = $scope.fromDto;
		request.data.toDto = $scope.toDto;

		//全数移動の場合、移動先の補充商品ＣＤが移動元の補充商品ＣＤで上書きされる確認メッセージを表示するかどうかをチェックする。
		api.stockMove.checkReplenishInfoOverwrite(request).then(function(response) {

			// 処理結果確認
			if (response.status.statusCode == 1){
				if (!owsCommon.viewConfirm("stockMoveRegisterReplenishDataOverwriteConfirmation")) {
					return;
				}
			}

			//在庫更新処理を実行
			$scope.update();

		});
	};
	//[ON推-品質問題点指摘（新ｿﾘV2-015）]修正対応 2016.07.20 chou Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#update
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 登録ボタンを押下された時に処理<br>
	 * 在庫更新する
	 */
	$scope.update = function() {

		optionMessageControl.hide($scope, 'depositCd_T');
		optionMessageControl.hide($scope, 'locationCd_T');
		optionMessageControl.hide($scope, 'stockTypeCd_T');
		optionMessageControl.hide($scope, 'moveNum');

		var customerCd = $scope.toDto.mcustomer.customerCd;
		var locationCd = $scope.toDto.mlocation.locationCd;
		var stockTypeCd = $scope.toDto.mstockType.stockTypeCd;
		var moveNum = $scope.toDto.chargeNum_A;
		var chargeNum_F = $scope.fromDto.chargeNum;
		var error = false;
		var bln = false ;
		// [横並-174] 預託の存在チェック、エラーメッセージ表示を追加 2014.12.01 kei Start
		var blnRegister = false ;
		// [横並-174] 預託の存在チェック、エラーメッセージ表示を追加 2014.12.01 kei End

		if($scope.moveNumform.$invalid){
			error = true;
		}

		if (!(customerCd && 0 < customerCd.length)) {
			optionMessageControl.show($scope, 'depositCd_T', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if (!(locationCd && 0 < locationCd.length)) {
			optionMessageControl.show($scope, 'locationCd_T', owsCommon.convertMessage('requiredError'));
			error = true;
		}
		if (!(stockTypeCd && 0 < stockTypeCd.length)) {
			optionMessageControl.show($scope, 'stockTypeCd_T', owsCommon.convertMessage('requiredError'));
			error = true;
		}

		// [ON推-品向-808] 移動数のチェックは辞書検証マスタの設定を優先するため削除 2015.05.12 kawana

		if(owsCommon.isLessThan(chargeNum_F, moveNum)){
			optionMessageControl.show($scope, 'moveNum', owsCommon.convertMessage('stockMoveCannotExecuteStockShortageError'));
			error = true;
		}


		if ( error ) {
			return;
		}

		//[ON推-品質問題点指摘（新ｿﾘV2-015）]修正対応 2016.07.20 chou Del

		// [ON推-品向-596] 不要なowsHistory.replaceStateを削除 2015.04.14 kawana

		var isError = $scope.searchform.$invalid;
		var request = {};
		request.data = {};
		request.data.fromDto = $scope.fromDto;
		request.data.toDto = $scope.toDto;

		//在庫調整登録前入力チェック
		api.stockMove.inputCheckUpdate(request).then(function(response) {

			// 処理結果確認
			if (response.status.listStatus != null){
				for (var i = 0 ;i <response.status.listStatus.length;i++){
					//ロケーションマスタ存在異常

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
						optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//ロケーションマスタ存在異常
					if (response.status.listStatus[i].status.statusCode == 5){
						optionMessageControl.show($scope, "locationCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//倉庫CDが同じでない
					if (response.status.listStatus[i].status.statusCode == 9){
						optionMessageControl.show($scope, "locationCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//倉庫CDが同じでない
					if (response.status.listStatus[i].status.statusCode == 10){
						optionMessageControl.show($scope, "locationCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}

					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD START
					///預託在庫区分預託在庫区分が存在しません
					if (response.status.listStatus[i].status.statusCode == 11){
						optionMessageControl.show($scope, "depositCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}

					if (response.status.listStatus[i].status.statusCode == 12){
						optionMessageControl.show($scope, "depositCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						bln = true ;
					}
					//◇【品質】問題点指摘票(新ソリ＿横並び確認)-174 2014/11/18 ADD END
				}
			}

			if(bln == true){
				return ;
			}

			if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				//在庫調整登録
				api.stockMove.register(request).then(function(response) {

					for (var i = 0 ;i <response.status.listStatus.length;i++){
						//ロケーションマスタ存在異常
						if (response.status.listStatus[i].status.statusCode == 5){
							optionMessageControl.show($scope, "locationCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							// [横並-174] 預託の存在チェック、エラーメッセージ表示を修正 2014.12.01 kei Start
							blnRegister = true ;
							// [横並-174] 預託の存在チェック、エラーメッセージ表示を修正 2014.12.01 kei End
						}
						// [横並-174] 預託の存在チェック、エラーメッセージ表示を追加 2014.12.01 kei Start
						///預託在庫区分預託在庫区分が存在しません
						if (response.status.listStatus[i].status.statusCode == 11){
							optionMessageControl.show($scope, "depositCd_F", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							blnRegister = true ;
						}

						if (response.status.listStatus[i].status.statusCode == 12){
							optionMessageControl.show($scope, "depositCd_T", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
							blnRegister = true ;
						}
						// [横並-174] 預託の存在チェック、エラーメッセージ表示を追加 2014.12.01 kei End
					}

					// [横並-174] 預託の存在チェック、エラーメッセージ表示を追加 2014.12.01 kei Start
					if(blnRegister == true){
						return ;
					}
					// [横並-174] 預託の存在チェック、エラーメッセージ表示を追加 2014.12.01 kei End

					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 画面モード判定
						if ($scope.screenMode == SCREEN_MODE.Update) {
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						}else{
							$scope.initScreen();
							// 検索結果を表示、非活性
							$scope.controlEditableInit();
							directiveControl.editable($scope, 'confirm', true);
						}
					}
				});
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#controlEditableInit
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 初期化の画面処理<br>
	 *
	 * 表示、非活性
	 */
	$scope.controlEditableInit = function(){
		//◇【品質】問題点指摘票(新ソリ＿横並び確認)-173 2014/11/14 ADD START
		directiveControl.editable($scope, 'clientCd', true);
		directiveControl.editable($scope, 'warehouseCd', true);
		//◇【品質】問題点指摘票(新ソリ＿横並び確認)-173 2014/11/14 ADD END
		directiveControl.editable($scope, 'productCd', true);
		// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
		directiveControl.editable($scope, 'unitNumBreakdown', false);
		directiveControl.editable($scope, 'productCd', false);
		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
		directiveControl.editable($scope, 'depositCd_F', true);
		directiveControl.editable($scope, 'locationCd_F', true);
		directiveControl.editable($scope, 'stockTypeCd_F', true);
		directiveControl.editable($scope, 'supplierCustomerCd', true);
		directiveControl.editable($scope, 'storeLabelNo', true);
		directiveControl.editable($scope, 'chargeNum_F', false);
		directiveControl.editable($scope, 'chargeNum_F_T', false);
		directiveControl.editable($scope, 'unitNum', false);
		directiveControl.editable($scope, 'lot', false);
		directiveControl.editable($scope, 'limitDt', false);
		directiveControl.editable($scope, 'storeLabelNo_B', false);
		directiveControl.editable($scope, 'depositCd_T', false);
		directiveControl.editable($scope, 'locationCd_T', false);
		// [#3989] 移動先総在庫数の非活性を項目マスタで行うように変更(該当処理の削除) 2018.04.05 kawana
		directiveControl.editable($scope, 'moveNum', false);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
		for (var i = 0; i < 4; i++) {
			// 編集可否処理IDの作成
			var wkChargeNum_TMultiTextCd = "chargeNum_TMultiText" + (i + 1);
			var wkMoveNumMultiTextCd = "moveNumMultiText" + (i + 1);
			directiveControl.editable($scope, wkChargeNum_TMultiTextCd, false);
			directiveControl.editable($scope, wkMoveNumMultiTextCd, false);
		}
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		directiveControl.editable($scope, 'stockTypeCd_T', false);
		directiveControl.editable($scope, 'moveInstComment', false);
		directiveControl.editable($scope, 'update', false);
		// [エンハンス PH2.0] 入庫日を追加する 2015.11.19 sja Start
		directiveControl.editable($scope, 'storeDt_F', true);
		directiveControl.editable($scope, 'storeDt_T', false);
		// [エンハンス PH2.0] 入庫日を追加する 2015.11.19 sja End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.stockMove.object:stockMove#controlEditable
	 * @methodOf oneslogiWms.stockMove.object:stockMove
	 *
	 * @description
	 * 確定ボタン押下後、画面処理<br>
	 *
	 * 検索結果を表示、非活性
	 */
	$scope.controlEditable = function(){
		directiveControl.editable($scope, 'depositCd_T', true);
		directiveControl.editable($scope, 'locationCd_T', true);
		// [C-NIS-0004] 移動総数を非活性に変更する 2015.06.30 hayasi Start
		//directiveControl.editable($scope, 'moveNum', true);
		//directiveControl.editable($scope, 'moveNum', false);
		// [C-NIS-0004] 移動総数を非活性に変更する 2015.06.30 hayasi End
		directiveControl.editable($scope, 'stockTypeCd_T', true);
		directiveControl.editable($scope, 'moveInstComment', true);
		directiveControl.editable($scope, 'update', true);
		directiveControl.editable($scope, 'clientCd', false);
		directiveControl.editable($scope, 'centerCd', false);
		directiveControl.editable($scope, 'warehouseCd', false);
		directiveControl.editable($scope, 'productCd', false);
		directiveControl.editable($scope, 'depositCd_F', false);
		directiveControl.editable($scope, 'locationCd_F', false);
		directiveControl.editable($scope, 'stockTypeCd_F', false);
		directiveControl.editable($scope, 'lot', false);
		directiveControl.editable($scope, 'limitDt', false);
		directiveControl.editable($scope, 'supplierCustomerCd', false);
		directiveControl.editable($scope, 'storeLabelNo', false);
		// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
		directiveControl.editable($scope, 'productUnit', false);
		directiveControl.editable($scope, 'unitNumBreakdown', false);
		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
		directiveControl.editable($scope, 'confirm', false);
		// [#3989] 移動先総在庫数の非活性を項目マスタで行うように変更(該当処理の削除) 2018.04.05 kawana
		// [エンハンス PH2.0] 入庫日を追加する 2015.11.19 sja Start
		directiveControl.editable($scope, 'storeDt_F', false);
		directiveControl.editable($scope, 'storeDt_T', true);
		// [エンハンス PH2.0] 入庫日を追加する 2015.11.19 sja End
		// [Ver3.0] unit of measure対応 2017.11.27 ライ Start
		directiveControl.editable($scope, 'moveNum', true);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
		// [Ver3.0] unit of measure対応 2017.11.27 ライ END
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#param
	 * @methodOf oneslogiWms.StockMove.object:StockMove
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
			clientCd = $scope.fromDto.mclient.clientCd;
			centerCd = $scope.fromDto.mlocation.mcenter.centerCd;
		}

		if(clientCd && 0 < clientCd.length && centerCd && 0 < centerCd.length) {
			var request = {};
			request.clientCd = clientCd;
			request.centerCd = centerCd;

			// パラメータ情報の取得
			api.param.record(request).then(function(response){
				strStoreNoFlg = response.data.mParam.storeNoFlg;
				if(strStoreNoFlg == "1"){
					directiveControl.editable($scope, 'storeLabelNo', true);
				}else{
					directiveControl.editable($scope, 'storeLabelNo', false);
				}
			});

		} else {
			directiveControl.editable($scope, 'storeLabelNo', false);
		}
	};

	// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる 2015.05.12 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#setToDto
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * 移動先に移動元の情報を入れる
	 */
	var setToDto = function() {

		// 預託
		$scope.toDto.mcustomer.customerCd = $scope.fromDto.mcustomer.customerCd;
		// ロケーションCD
		$scope.toDto.mlocation.locationCd = $scope.fromDto.mlocation.locationCd;
		// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana Start
		// ロケーション名称
		$scope.toDto.mlocation.locationNm = $scope.fromDto.mlocation.locationNm;
		// [ON推-品向-980] ロケーションCDの下にロケーション名称を表示 2015.10.15 kawana End
		// 在庫区分
		$scope.toDto.mstockType.stockTypeCd = $scope.fromDto.mstockType.stockTypeCd;
		// [エンハンス PH2.0] 入庫日を表示する 2015.11.19 sja Start
		$scope.toDto.tstoreNo.storeDt = $scope.fromDto.tstoreNo.storeDt;
		// [エンハンス PH2.0] 入庫日を表示する 2015.11.19 sja End
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
		multiTextControl.setMultiText($scope, 'multiTextOptions', 'chargeNum_T', 'chargeNum_TMultiText', $scope.fromDto.mproduct.productId);
		multiTextControl.setMultiText($scope, 'multiTextOptions', 'moveNum', 'moveNumMultiText', $scope.fromDto.mproduct.productId);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
		// 総在庫数取得
		$scope.selectChargeNumTo();
	};
	// [ON推-品向-808] 初期表示では移動先に移動元の情報を入れる 2015.05.12 kawana End


	// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.StockMove.object:StockMove#moveNumBlur
	 * @methodOf oneslogiWms.StockMove.object:StockMove
	 *
	 * @description
	 * ケースとピースのロストフォーカス処理<br>
	 *
	 * 移動総数を取得する。
	 */
	$scope.moveNumBlur = function() {
		var pieceAdjNum = $scope.toDto.pieceAdjNum;  // ピース数
		var caseAdjNum = $scope.toDto.caseAdjNum;    // ケース数
		var unitNum = $scope.fromDto.unitNum;        // 入数

		if ((pieceAdjNum == null || pieceAdjNum == "") && (caseAdjNum == null || caseAdjNum == "")){
			$scope.toDto.chargeNum_A = null;
		}
		else{
			if(pieceAdjNum == null || pieceAdjNum == ""){
				pieceAdjNum = 0;
			}
			if(caseAdjNum == null || caseAdjNum == ""){
				caseAdjNum = 0;
			}
			if(unitNum == null || unitNum == ""){
				unitNum = 0;
			}
			$scope.toDto.chargeNum_A = owsCommon.add(pieceAdjNum, owsCommon.multiply(caseAdjNum, unitNum));
		}

	};
	// [C-NIS-0004] ケース数・ピース数を追加 2015.06.30 hayasi End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);

