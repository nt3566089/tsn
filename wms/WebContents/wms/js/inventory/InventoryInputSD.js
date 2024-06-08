/**
 * @ngdoc overview
 * @name oneslogiWms.InventoryInputSD
 *
 * @description
 * 棚卸入力画面(スマートデバイス用)<br>
 *
 * 棚卸データの検索・登録を行う為の画面
 */
angular.module('oneslogiWms.InventoryInputSD', [])

/**
 * @ngdoc service
 * @name oneslogiWms.InventoryInputSD.service:InventoryInputSDApi
 *
 * @description
 * 棚卸入力用WebApi<br>
 * ・resources/inventory/InventoryInputSD/init 画面初期処理<br>
 * ・resources/inventory/InventoryInputSD/select   棚卸入力データ取得<br>
 * ・resources/inventory/InventoryInputSD/register  棚卸データ追加・更新処理<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList  預託在庫リスト用データ取得<br>
 * ・resources/common/stockType/keyValueList  在庫区分リスト用データ取得<br>
 * ・resources/common/supplierCustomer/record  仕入先データ取得<br>
 * ・resources/common/product/record  商品データ取得<br>
 */
.factory('InventoryInputSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return{
		stockTakingInput: AngularAPIClient.make([
		                                         ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
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
		location: AngularAPIClient.make([
		                                 ['record', 'GET', 'resources/common/location/record']
		                                 ]
		),
		product: AngularAPIClient.make([
		                                ['record', 'GET', 'resources/common/product/record']
		                                ]
		),
		zone: AngularAPIClient.make([
		                             ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
		                             ]
		),
		inventoryInputSD: AngularAPIClient.make([
		                                       ['init',         'GET',  'resources/inventory/inventoryInputSD/init'],
		                                       ['search',       'GET',  'resources/inventory/inventoryInputSD/search'],
		                                       // [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		                                       ['research',       'GET',  'resources/inventory/inventoryInputSD/research'],
		                                       // [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
	                                           ['searchDetail', 'GET',  'resources/inventory/inventoryInputSD/searchDetail'],
		                                       ['register',     'POST', 'resources/inventory/inventoryInputSD/register']
		                                       ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD
 *
 * @description
 * 棚卸データ作成画面コントローラ
 */
.controller('InventoryInputSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicHistory', '$ionicScrollDelegate', 'ionicDatePicker', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'detailDirectiveControl', 'detailMultiTextControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'InventoryInputSDApi',
                         function($scope,   $state,   $filter,   $location,   $q,   $ionicHistory,   $ionicScrollDelegate,   ionicDatePicker,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   detailDirectiveControl,   detailMultiTextControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   printFactory,   api) {


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#initScreen
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う
	 */
	var running = false;
	$scope.initScreen = function() {
		$scope.form = {};
		$scope.searchResult = {};
		$scope.Location = {};

		// モード設定
		var searchObject = $location.search();
		$scope.screenMode = searchObject.mode;

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 倉庫変更の監視設定（フォーカス時）
		$scope.warehouseFocus = function() {
			oldWarehouse = $scope.conditionB.mwarehouse.warehouseCd;
		};

		// 倉庫変更の監視設定（選択内容変更時）
		$scope.warehouseChange = function() {
			// ゾーンリスト変更（同期処理）
			$scope.deferredGetZoneList()
			.then(function(response) {
				newZoneList = response.data;
			});
		};

		//倉庫変更の監視設定(ロストフォーカス時)
		$scope.warehouseBlur = function() {
			if (oldWarehouse != $scope.conditionB.mwarehouse.warehouseCd) {
				//選択した倉庫で取得済みのゾーンリストを設定
				setZoneList(newZoneList, true);
			}
		};

		//ロケーション大小チェック
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

		//ロケーション大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')(LOCATION_FROM_TO_MESSAGE_CD);

		//商品明細の棚卸数量、ケース数、ピース数入力欄にロストフォーカスイベントを設定
		//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
		$scope.detailEventOptions = {
				"inventoryNum":{
					"ng-blur":{
						eventFunction:"inventoryNumBlur()"
					},
					"ng-focus":{
						eventFunction:"inputValueAllSelectOnFocus($event)"
					}
				}
				// [#3116] SD棚卸 UoM対応 - ケース数、ピース数の設定を削除 2017.12.19 kawana
		};
		//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();

		// 指示明細一覧グリッドの設定
		$scope.listGridOptions = {
			data: 'inventoryInputList',
			columnDefs: 'inventoryInputListCols',
		};

		// 明細詳細グリッドの設定
		$scope.gridOptions = {
				data: 'inventoryInputList',
				columnDefs: 'inventoryInputListCols',
				pagingOptions: $scope.pagingOptions
		};

		// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start
		// 棚卸数量の複数荷姿入力設定
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
			"inventoryNum" : {
				multiTextCd : "inventoryNumMultiText",
				model : angular.copy(multiTextModels),
				listModel : "mproduct.mproductShapeList"
			}
		};
		// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#initScreenhttp
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する
	 */
	$scope.initScreenHttp = function() {

		//各種ドロップダウンリスト用データ設定(同期処理)
		$q.all(
				[
		         $scope.deferredGetConditionList(),
		         $scope.deferredGetUnmatchList()
		        ]
		)
		.then(function(response) {
			//画面初期化データ設定(同期処理)
			return $scope.deferredGetInitData();
		});

	};

	// 棚卸入力有データ取得
	$scope.deferredGetConditionList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_TAKING_INPUT";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response) {
			$scope.stockTakingInputList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// アンマッチ有データ取得
	$scope.deferredGetUnmatchList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UNMATCH";

		owsCommon.getDataCacheable(api.stockTakingInput, "keyValueList", request).then(function(response) {
			$scope.unmatchList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#deferredGetZoneList
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * ゾーン取得・設定処理(同期可能)<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する
	 */
	$scope.deferredGetZoneList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.centerCd = userInfo.centerCd;
		request.warehouseCd = $scope.conditionB.mwarehouse.warehouseCd;

		owsCommon.getDataCacheable(api.zone, "keyValueList", request).then(function(response) {
			deferred.resolve(response);
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#changeWarehouse
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 倉庫変更後処理<br>
	 *
	 * 倉庫が変更された場合、ゾーンリストデータを再度取得し画面項目に反映する
	 */
	$scope.changeWarehouse = function(clearSelected) {
		// ゾーンリスト変更（同期処理）
		$scope.deferredGetZoneList()
		.then(function(response) {
			setZoneList(response.data, clearSelected);
		});
	};

	// ゾーンリスト再設定処理
	var setZoneList = function(list, clearSelected) {
		$scope.zoneList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			$scope.conditionI.mzone.zoneCd = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#deferredGetInitData
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 商品別入荷一覧初期値取得・設定処理(同期可能)<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する
	 */
	$scope.deferredGetInitData = function() {
		var deferred = $q.defer();

		//新規
		api.inventoryInputSD.init().then(function(response) {

			$scope.paging = response.paging;
			$scope.conditionH = response.data.head;
			$scope.conditionB = response.data.body;
			$scope.conditionI = response.data.Inst;

			//ログイン情報より初期値を設定
			$scope.conditionH.centerId = userInfo.centerId;
			$scope.conditionH.clientId = userInfo.clientId;
			$scope.conditionH.inventoryDt = userInfo.systemDt;

			//倉庫変更後処理
			$scope.changeWarehouse(false);

			//棚卸入力有のデフォルト値を設定
			$scope.conditionI.stockTakingInput = owsCommon.getDefaultValue($scope.stockTakingInputList);
			//アンマッチ有のデフォルト値を設定
			$scope.conditionI.unmatch = owsCommon.getDefaultValue($scope.unmatchList);


			//履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				// [#6938][OSS] ブラウザの次へボタンで不明なエラー発生 2019.12.05 kawana Start
				var searchCondition = owsHistory.popState();
				$scope.conditionH = searchCondition.conditionH;
				$scope.conditionI = searchCondition.conditionI;
				$scope.conditionB = searchCondition.conditionB;
				// [#6938][OSS] ブラウザの次へボタンで不明なエラー発生 2019.12.05 kawana End

				$scope.search();
			}

			//通常画面の場合は、初期化の処理を最終処理として、以下の関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});
		return deferred.promise;
	};


	$scope.moreDataCanBeLoaded = function() {
		return $scope.paging.isExistNextPage;
	}
	$scope.loadMoreData = function() {
		if ($scope.searchResult.preventDoubleLoad) {
			/* [#1069] アシスト機能以外の検索結果一覧画面でのスクロール処理の修正 2017/03/08 Dario Update START */
			//$scope.searchResult.preventDoubleLoad = false;
			/* [#1069] アシスト機能以外の検索結果一覧画面でのスクロール処理の修正 2017/03/08 Dario Update END */
		} else {
			$scope.pagingOptions.lastCurrentPage = $scope.pagingOptions.currentPage;
			$scope.pagingOptions.currentPage = $scope.pagingOptions.currentPage + 1;
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
			$scope.reGetPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
			// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

			$scope.searchResult.preventDoubleLoad = true;
		}
		$scope.$broadcast('scroll.infiniteScrollComplete');
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#detail
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 一覧画面での明細押下処理<br>
	 *
	 * 選択した明細データを再取得し、次の画面に遷移する
	 */
	$scope.detail = function(index) {

		$scope.searchResult.index = index;
		setButtons(index);

		// 明細データ取得・設定
		$scope.deferredGetDetail(index, false).then(function(response) {

			// 明細画面へ遷移
			$state.go('all.abstract.detail', {id: index});
			// 明細画面の場合は、初期化の最終処理として、以下関数を呼び出しフォーカスを設定する
			owsCommon.setFirstFocus("detailform");
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#deferredGetDetail
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 明細データの取得・設定<br>
	 *
	 * 指定indexの明細データを取得し明細画面のデータに設定する。
	 */
	$scope.deferredGetDetail = function(index, showErrorDialog) {

		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.data.head = {};
		request.data.head.centerId = userInfo.centerId;
		request.data.head.clientId = userInfo.clientId;
		request.data.body = {};
		request.data.body.inventoryBId = $scope.inventoryInputList[index].inventoryBId;

		api.inventoryInputSD.searchDetail(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {

				if (showErrorDialog) {
					owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
				}

				deferred.reject();
				return;
			}

			// 明細データ設定
			var body = response.data.bodyList[0];
			$scope.inventoryInputList[index] = body;
			$scope.searchResult.detailedItem = body;

			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add START */
			$scope.detailEventDataList = [];// 明細画面用Control設定リスト
			$scope.detailEventDataList = angular.copy($scope.inventoryInputList);
			$scope.$broadcast('ngDetailEventData');
			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add END */

			deferred.resolve();
			return;
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#detailPrevious
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 明細画面での「前」押下処理<br>
	 *
	 * 1件前の明細データを再取得し、画面に反映する
	 */
	$scope.detailPrevious = function() {

		if (!$scope.searchResult.hasPrevious) {
			return;
		}

		// 画面遷移しないのでエラーを消す
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		// 現在のindex - 1
		var index = $scope.inventoryInputList.indexOf($scope.searchResult.detailedItem) - 1;

		// 明細データ取得・設定
		$scope.deferredGetDetail(index, true).then(function(response) {

			// 前/次ボタン、明細番号設定
			setButtons(index);
			$scope.searchResult.index = index;
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start
			// 棚卸数量の複数荷姿入力設定
			$scope.setInventoryNumMultiTextItem(index, $scope.inventoryInputList[index]);

			// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End
			// 各項目への制御処理
			var stockAdjustFlg = $scope.inventoryInputList[index].stockAdjustFlg;
			inventoryManagCurrentItem(index, stockAdjustFlg);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End

			// 上までスクロールしてあげる
			$ionicScrollDelegate.scrollTop();
		},
		function(response) {

			// エラーなら前画面に移動
			$ionicHistory.goBack(-1);
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#detailNext
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 明細画面での「次」押下処理<br>
	 *
	 * 1件後の明細データを再取得し、画面に反映する
	 */
	$scope.detailNext = function() {

		if (!$scope.searchResult.hasNext) {
			return;
		}

		// 画面遷移しないのでエラーを消す
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		// 現在のindex + 1
		var index = $scope.inventoryInputList.indexOf($scope.searchResult.detailedItem) + 1;

		// 明細データ取得・設定
		$scope.deferredGetDetail(index, true).then(function(response) {

			// 前/次ボタン、明細番号設定
			setButtons(index);
			$scope.searchResult.index = index;
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start
			// 棚卸数量の複数荷姿入力設定
			$scope.setInventoryNumMultiTextItem(index, $scope.inventoryInputList[index]);
			// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End

			// 各項目への制御処理
			var stockAdjustFlg = $scope.inventoryInputList[index].stockAdjustFlg;
			inventoryManagCurrentItem(index, stockAdjustFlg);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End

			// 上までスクロールしてあげる
			$ionicScrollDelegate.scrollTop();
		},
		function(response) {

			// エラーなら前画面に移動
			$ionicHistory.goBack(-1);
		});
	}

	setButtons = function(index) {
		if (index > 0) {
			$scope.searchResult.hasPrevious = true;
		} else {
			$scope.searchResult.hasPrevious = false;
		}
		if (index < ($scope.inventoryInputList.length-1)) {
			$scope.searchResult.hasNext = true;
		} else {
			//まだ読み込んでいない検索結果があるなら次のページを読み込む
			if ($scope.paging.isExistNextPage) {
				$scope.loadMoreData();
				$scope.searchResult.hasNext = true;
			} else {
				$scope.searchResult.hasNext = false;
			}
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#search
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する
	 */
	$scope.search = function() {
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.lastLoaded = 0;
		$scope.inventoryInputList = [];
		$scope.getPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#research
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する
	 */
	$scope.research = function() {
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.lastLoaded = 0;
		$scope.inventoryInputList = [];
		$scope.reGetPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#reGetPagingData
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページデータを取得する
	 */
	$scope.reGetPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		//ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if (page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		api.inventoryInputSD.research(request).then(function(response) {
			var noError = statusInfo.isSuccess(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

			//エラー無しなら検索結果画面へ移行
			if (noError && page == 1) {
				$scope.searchResult.preventDoubleLoad = false;
				$state.go('all.abstract.list');
				$state.go('all.abstract.list', $state.params);
				// 画面表示後に動作させるためにtimeout設定
				owsCommon.syncExec(function() {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				});
			// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add Start
			} else if (!noError) {

				if ($state.current.name == 'all.abstract.detail') {
					// 実績登録後の再検索でエラー有りなら検索条件入力画面へ移行
					$state.go('all.abstract.main', $state.params);
					// 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示
					if (response.status.statusCode == 2) {
						return
					}
				}
				statusInfo.isSuccessAndShowMessage(response, 'searchform');
			// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add End
			}
		});

	};
	// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#getPagingData
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページデータを取得する
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.conditionH;
		request.data.body = $scope.conditionB;
		request.data.Inst = $scope.conditionI;

		//ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if (page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		api.inventoryInputSD.search(request).then(function(response) {
			var noError = statusInfo.isSuccess(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

			//エラー無しなら検索結果画面へ移行
			if (noError && page == 1) {
				$scope.searchResult.preventDoubleLoad = false;
				$state.go('all.abstract.list');
				$state.go('all.abstract.list', $state.params);
				// 画面表示後に動作させるためにtimeout設定
				owsCommon.syncExec(function() {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				});
			// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add Start
			} else if (!noError) {

				if ($state.current.name == 'all.abstract.detail') {
					// 実績登録後の再検索でエラー有りなら検索条件入力画面へ移行
					$state.go('all.abstract.main', $state.params);
					// 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示
					if (response.status.statusCode == 2) {
						return
					}
				}
				statusInfo.isSuccessAndShowMessage(response, 'searchform');
			// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add End
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#setPagingData
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択条件をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		//取得したデータを次の画面で表示するリストに保存
		$scope.inventoryInputList = $scope.inventoryInputList.concat(response.data.bodyList);
		//まだ表示していない結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;

		/* [#1069] アシスト機能以外の検索結果一覧画面でのスクロール処理の修正 2017/03/08 Dario Add START */
		$scope.searchResult.preventDoubleLoad = false;
		/* [#1069] アシスト機能以外の検索結果一覧画面でのスクロール処理の修正 2017/03/08 Dario Add END */

		//検索条件を履歴に保存

		// [#6938][OSS] ブラウザの次へボタンで不明なエラー発生 2019.12.05 kawana Start
		var searchCondition = {
			conditionH : $scope.conditionH,
			conditionI : $scope.conditionI,
			conditionB : $scope.conditionB
		};
		owsHistory.replaceState(searchCondition);
		// [#6938][OSS] ブラウザの次へボタンで不明なエラー発生 2019.12.05 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#showLocation
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @descripption
	 * ロケーションCD検索ボタン押下処理
	 *
	 * 検索画面を表示し、選択されたロケーション情報を画面項目に反映する
	 */
	$scope.showLocation = function(index) {
		var inLocationCd;
		$scope.Location.index = index;
		if (index == 1) {
			inLocationCd = $scope.conditionI.fromLocationCd;
		} else {
			inLocationCd = $scope.conditionI.toLocationCd;
		}

		var items = {
				locationCd: inLocationCd,
				centerCd: userInfo.centerCd,
				warehouseCd: $scope.conditionB.mwarehouse.warehouseCd,
				zoneCd: $scope.conditionI.mzone.zoneCd
		};

		//ロケーションマスタのモーダル画面を表示
		modalFactory.modalLocation($scope, items)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	$scope.$on('modalLocationReturn', function(ev, selectedItem) {
		if ($scope.Location.index == 1) {
			$scope.conditionI.fromLocationCd = selectedItem.locationCd;
		} else {
			$scope.conditionI.toLocationCd = selectedItem.locationCd;
		}
	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#inventoryNumBlur
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 棚卸数量変更処理<br>
	 */
	$scope.inventoryNumBlur = function() {
		var index = $scope.inventoryInputList.indexOf($scope.searchResult.detailedItem);

		// [#3116] SD棚卸 UoM対応 - ケース数、ピース数の設定を削除 2017.12.19 kawana Start

		// 入力された商品コードを取得
		var inventoryNum = $scope.inventoryInputList[index].inventoryNum;
		var histAddUser = $scope.inventoryInputList[index].histAddUser;

		// [#1509] 不正な値を入力してもエラーメッセージが出ない対応 2017.04.26 honma Add Start
		if (isNaN(inventoryNum)) {
			// 数値不正
			return;
		}
		// [#1509] 不正な値を入力してもエラーメッセージが出ない対応 2017.04.26 honma Add End

		// 入力された棚卸数量を取得
		if (inventoryNum && owsCommon.isNegative(inventoryNum)) {
			// マイナス
			return;
		// [#4424] 棚卸数0を入力すると消えてしまう問題を修正 2018.05.08 kawana Start
		} else if ( inventoryNum == null || inventoryNum === "") {
		// [#4424] 棚卸数0を入力すると消えてしまう問題を修正 2018.05.08 kawana End
			// 未入力

			if (histAddUser == null || histAddUser == "") {
				$scope.inventoryInputList[index].inventoryNum = null;
			} else {
				// 既に棚卸入力済の場合は 0 で棚卸したことにする
				$scope.inventoryInputList[index].inventoryNum = 0;
			}
			return;
		}

		// [#3116] SD棚卸 UoM対応 - ケース数、ピース数の設定を削除 2017.12.19 kawana End
	};

	// [#3116] SD棚卸 UoM対応 - ケース数、ピース数のロストフォーカス処理を削除 2017.12.19 kawana

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 入力可能項目のフォーカス処理<br>
	 *
	 * 値を全選択状態にする。
	 */
	$scope.inputValueAllSelectOnFocus = function($event) {
		owsCommon.valueAllSelectOnFocus($event);
	}
	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#register
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する
	 */
	$scope.register = function() {

		var request = {};
		request.data = {};
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
		request.data.bodyList = [];
		request.data.bodyList.push($scope.searchResult.detailedItem);
		// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End


			// 業務エラーのクリア
			optionMessageControl.hideAll($scope);
			gridOptionMessageControl.hideAll($scope.gridOptions);

			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
			var promiseAll = $q.all([
		                        	 detailDirectiveControl.isValidCheckDetail($scope.form.detailform),
		                        	 // [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
		                        	 detailMultiTextControl.deferredCheckDecimalInput($scope.form.detailform, $scope, $scope.searchResult.detailedItem.inventoryNum, $scope.gridOptions, 'multiTextOptions', 'inventoryNum', $scope.searchResult.index)
		                        	 // [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
		                         	]);
			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add END */

			promiseAll.then(function() {
				// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod Start
				owsCommon.syncExec(function() {

					// 入力された予定数チェック
					var errCnt = 0;
				// [#7216][OSS] 0～9の正規表現チェックのエラーメッセージを数値のみ⇒数字のみに変更 2020.03.18 kawana Start
				// 棚卸数は数値なので「数値のみ」エラーにメッセージCD変更
					var err = "numberError";
				// [#7216][OSS] 0～9の正規表現チェックのエラーメッセージを数値のみ⇒数字のみに変更 2020.03.18 kawana End

					var inventoryNum = $scope.searchResult.detailedItem.inventoryNum;
					// [#3116] SD棚卸 UoM対応 - ケース数、ピース数の設定を削除 2017.12.19 kawana
					if (inventoryNum && owsCommon.isNegative(inventoryNum)) {
						errCnt++;
						if (!gridOptionMessageControl.isShow($scope.gridOptions, "inventoryNum", $scope.searchResult.index)) {
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "inventoryNum", $scope.searchResult.index)) {
								gridOptionMessageControl.show($scope.gridOptions, "inventoryNum", $filter('owfMessage')((2, err)), $scope.searchResult.index);
							}
						}
					}

					// [#3116] SD棚卸 UoM対応 - ケース数、ピース数のチェックを削除 2017.12.19 kawana

					if (0 < errCnt) {
						// 最初のエラーにフォーカス
						/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
						directiveControl.firstErrorOnFocus('form.detailform');
						/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Update END */
						return;
					}

					// 登録確認メッセージ
					if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
						return;
					}

					// 棚卸データ追加・更新処理を行う。
					api.inventoryInputSD.register(request).then(function(response) {

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'form.detailform')) {
							return;
						}

						// ダイアログ表示(正常終了)
						owsCommon.syncExec(function() {
							//棚卸データ追加・登録処理が正常終了した際、メッセージを表示
							owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);

							// [#1510][Ver2.2.0] SD棚卸入力で連続登録すると、排他エラーへの対応 2017.03.31 honma Mod Start
							// 再検索処理を実行し、棚卸一覧画面へ戻る
							// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
							$scope.research();
							// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
							// [#1510][Ver2.2.0] SD棚卸入力で連続登録すると、排他エラーへの対応 2017.03.31 honma Mod End
						});
					});
				}, 1000);
				// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod End
			});
	};

	/* [#1057] SD版でもDirectiveControlを使用可能にする 2017/04/13 Dario Update START */
	$scope.$on('ngDetailEventDataReturn', function(ev, index, entity) {
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
		// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start
		// 棚卸数量の複数荷姿入力設定
		if (index == $scope.searchResult.index) {
			$scope.setInventoryNumMultiTextItem(index, entity);
		}

		var stockAdjustFlg = entity.stockAdjustFlg;
		inventoryManagCurrentItem(index, stockAdjustFlg);
		// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
	});
	/* [#1057] SD版でもDirectiveControlを使用可能にする 2017/04/13 Dario Update END */

	// 各項目への制御処理
	var inventoryManagCurrentItem = function(index, stockAdjustFlg) {

		// 在庫調整済の棚卸の場合は棚卸数量は入力不可(値は保持)
		if (stockAdjustFlg == "1") {

			detailDirectiveControl.editable($scope.gridOptions, 'inventoryNum', false, index);
			// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			for (var i = 0; i < 4; i++) {
				// 編集可否処理IDの作成
				var wkMultiTextCd = "inventoryNumMultiText" + (i + 1);
				detailDirectiveControl.editable($scope.gridOptions, wkMultiTextCd, false, index);
			}
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
			// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End
		}
	};

	// [#3116] SD棚卸 UoM対応 2017.12.19 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.InventoryInputSD.object:InventoryInputSD#setInventoryNumMultiTextItem
	 * @methodOf oneslogiWms.InventoryInputSD.object:InventoryInputSD
	 *
	 * @description
	 * 棚卸数量の複数荷姿入力設定<br>
	 *
	 * 商品荷姿リストから現在の棚卸数量に合わせて各荷姿の内訳を計算し設定する
	 */
	$scope.setInventoryNumMultiTextItem = function(index, inventoryB) {

		$scope.multiTextOptions.inventoryNum.model = angular.copy(owsCommon.getMultiTextModels(4));
		detailMultiTextControl.setMultiText($scope, $scope.gridOptions, 'multiTextOptions', 'inventoryNum', inventoryB.productId, inventoryB.mproduct.mproductShapeList, index);
		owsCommon.getCalcAuxiliaryBreakdown($scope, inventoryB.inventoryNum, "multiTextOptions", "inventoryNum");
	};

	// [#3116] SD棚卸 UoM対応 2017.12.19 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
