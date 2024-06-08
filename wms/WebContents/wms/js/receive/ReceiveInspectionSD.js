/**
 * @ngdoc overview
 * @name oneslogiWms.ReceiveInspectionSD
 *
 * @description
 * 入荷検品画面 （スマートデバイス用）<br>
 *
 * 入荷実績データに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ReceiveInspectionSD', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceiveInspectionSD.service:ReceiveInspectionSDApi
 *
 * @description
 * 入荷検品画面 （スマートデバイス用）用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * centerClass 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 入荷ステータスドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * receiveInspectionSD 入荷検品データ操作用WebApi<br>
 * ・resources/receive/receiveInspectionSD/initNew 初期データ取得(通常)WebAPI<br>
 * ・resources/receive/receiveInspectionSD/search 検索WebAPI<br>
 * ・resources/receive/receiveInspectionSD/inputCheckLimitDt 入荷期限日チェック（登録）WebAPI<br>
 * <br>
 * commonSearch ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/supplierCustomer/record 仕入先データ取得WebAPI<br>
 * ・resources/common/product/record 商品データ取得WebAPI<br>
 * <br>
 * product 商品データ操作用WebAPI<br>
 * ・resources/common/product/record 単一行データ取得WebAPI<br>
 * <br>
 * location ロケーションデータ操作用WebAPI<br>
 * ・resources/common/location/record 単一行データ取得WebAPI<br>
 * <br>
 * receiveInspectionSD 入荷実績データ操作用WebAPI<br>
 * ・resources/receive/receiveInspectionSD/initSearch 画面用初期データ取得WebAPI<br>
 * ・resources/receive/receiveInspectionSD/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/receive/receiveInspectionSD/inputCheckLimitDt 入荷期限日チェック（登録）WebAPI<br>
 * ・resources/receive/receiveInspectionSD/register 入荷実績登録WebAPI<br>
 */
.factory('ReceiveInspectionSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		centerClass: AngularAPIClient.make([
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList']
		]),
		// [#120] 入荷検品 2017.02.07 honma Mod Start
		receiveInspectionSD: AngularAPIClient.make([
		                                            ['initNew',            'GET',  'resources/receive/receiveInspectionSD/initNew'],
		                                            ['search',             'GET',  'resources/receive/receiveInspectionSD/search'],
		                                            // [#2946][Ver3.0] WAS連携対応 2017/12/19 PYM Start
		                                            ['research',           'GET',  'resources/receive/receiveInspectionSD/research'],
		                                            // [#2946][Ver3.0] WAS連携対応 2017/12/19 PYM End
		                                            ['searchDetail',       'GET',  'resources/receive/receiveInspectionSD/searchDetail'],
		                                            ['initSearch',         'GET',  'resources/receive/receiveInspectionSD/initSearch'],
		                                            ['inputCheckRegister', 'POST', 'resources/receive/receiveInspectionSD/inputCheckRegister'],
		                                            ['inputCheckLimitDt',  'POST', 'resources/receive/receiveInspectionSD/inputCheckLimitDt'],
		                                            ['register',           'POST', 'resources/receive/receiveInspectionSD/register']
		                                            ]
		),
		// [#120] 入荷検品 2017.02.07 honma Mod End
		commonSearch: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record'],
				 ['query',  'GET', 'resources/common/product/record']
				 ]
		),
		product: AngularAPIClient.make(
				[
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start
				 ['record', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End
				 ]
		// [#120] 入荷検品 2017.02.07 honma Delete
		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add Start
		),
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add End
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
 *
 * @description
 * 入荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Mod Start
.controller('ReceiveInspectionSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicHistory', '$ionicScrollDelegate', 'ionicDatePicker', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'detailDirectiveControl', 'detailMultiTextControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'ReceiveInspectionSDApi',
                            function($scope,   $state,   $filter,   $location,   $q,   $ionicHistory,   $ionicScrollDelegate,   ionicDatePicker,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   detailDirectiveControl, detailMultiTextControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   printFactory,   api) {
// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Mod End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#initScreen
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	var running = false;
	$scope.initScreen = function() {
		$scope.form = {};
		$scope.searchResult = {};
		$scope.defaultCondition = {};

		// モード設定
		var searchObject = $location.search();
		$scope.screenMode = searchObject.mode;

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);

			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
				return false;
			}

			return true;
		};

		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();

		// 指示明細一覧グリッドの設定
		$scope.listGridOptions = {
			data: 'receiveInspectionList',
			columnDefs: 'receiveInspectionListCols',
		};

		// 明細詳細グリッドの設定
		$scope.gridOptions = {
			data: 'receiveInspectionDetail',
			columnDefs: 'receiveInspectionDetailCols',
			pagingOptions : $scope.pagingOptions,
		};

		// グリッドの商品コード、ロケーション列にボタンを設定
		$scope.detailButtonOptions = {
				"treceivePlanB.productCd":{
					clickFunction:"showProduct(true)"
				},
				"mlocation.locationCd":{
					clickFunction:"showLocation(true)"
				}
		};

		// グリッドの商品コード列、入庫ケース数列、入庫バラ数列にロストフォーカスイベントを設定
		//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod Start
		$scope.detailEventOptions = {
				"treceivePlanB.productCd":{
					"ng-blur":{
						eventFunction:"productCdBlur(true)"
					}
				},
				"mlocation.locationCd":{
					"ng-focus":{
						eventFunction:"inputValueAllSelectOnFocus($event)"
					}
				},
				//[Ver3.0][#3113]複数荷姿対応に伴い不要となった処理を削除 2017.12.06 miyabe
				"limitDt":{
					"ng-blur":{
						eventFunction:"limitDtBlur(true)"
					},
					"ng-focus":{
						eventFunction:"inputValueAllSelectOnFocus($event)"
					}
				},
				"lot":{
					"ng-focus":{
						eventFunction:"inputValueAllSelectOnFocus($event)"
					}
				},
				"clientOrderNo":{
					"ng-focus":{
						eventFunction:"inputValueAllSelectOnFocus($event)"
					}
				},
				"storeRecordBComment":{
					"ng-focus":{
						eventFunction:"inputValueAllSelectOnFocus($event)"
					}
				}
		};
		//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Mod End

		// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add Start
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 総数用colCdを定義
				"storeNum" : {
					// 複数荷姿用colCdを定義
					multiTextCd: "storeNumMultiText",
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "searchResult.detailedItem.treceivePlanB.mproduct.mproductShapeList"
				}
		};
		// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#initScreenHttp
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetReceiveStatus()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#deferredGetReceiveStatus
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 入荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReceiveStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "RECEIVE_STATUS";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response) {

			$scope.receiveStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#deferredGetInitData
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 商品別入荷一覧初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		// [#120] 入荷検品 2017.02.07 honma Mod Start
		api.receiveInspectionSD.initNew().then(function(response) {
		// [#120] 入荷検品 2017.02.07 honma Mod End

			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;

			// ログイン情報より初期値を設定
			$scope.searchCondition.centerId = userInfo.centerId;
			$scope.searchCondition.clientId = userInfo.clientId;
			$scope.searchCondition.receivePlanDtFrom = userInfo.systemDt;// 入荷予定日From
			$scope.searchCondition.receivePlanDtTo = userInfo.systemDt;// 入荷予定日To

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
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
		}
		else {
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
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#detail
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
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
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#deferredGetDetail
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 明細データの取得・設定<br>
	 *
	 * 指定indexの明細データを取得し明細画面のデータに設定する。
	 */
	$scope.deferredGetDetail = function (index, showErrorDialog) {

		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.data.head = {};
		request.data.head.centerId = userInfo.centerId;
		request.data.head.clientId = userInfo.clientId;
		var body = {};
		body.storeRecordBId = $scope.receiveInspectionList[index].storeRecordBId;
		body.receivePlanBId = $scope.receiveInspectionList[index].receivePlanBId;
		request.data.storeBody = [];
		request.data.storeBody.push(body);

		// 明細データ取得
		api.receiveInspectionSD.searchDetail(request).then(function(response) {


			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {

				// [#1928][Ver2.2.0] 入荷検品ＳＤ - 検索画面のHT検品中時メッセージ不正 2017.06.22 honma Mod Start
				if (response.status.statusCode == 1) {
					// HT検品中の伝票が含まれている場合
					return;
				} else if (showErrorDialog) {
					owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
				}
				// [#1928][Ver2.2.0] 入荷検品ＳＤ - 検索画面のHT検品中時メッセージ不正 2017.06.22 honma Mod End

				deferred.reject();
				return;
			}

			// 明細データ設定
			$scope.receiveInputH = response.data.storeHead;
			var body = response.data.storeBody[0];
			// [#1958][Ver2.2.0] 入荷検品ＳＤ - 仮入力ロケが明細画面に初期表示されない 2017.06.23 K.CHO Mod Start
			// 仮ロケーション明細設定処理
			// すでに予定ロケーションCDが設定されていなかった場合、仮入力したロケーションCDを設定
			if ((body.storeRecordBId == null || body.storeRecordBId == '') && (body.mlocation.locationCd == null || body.mlocation.locationCd == "")) {
				body.mlocation.locationCd = $scope.defaultCondition.locationCd;
				body.mlocation.locationNm = $scope.defaultCondition.locationNm;
			}
			// [#1958][Ver2.2.0] 入荷検品ＳＤ - 仮入力ロケが明細画面に初期表示されない 2017.06.23 K.CHO Mod End
			$scope.receiveInspectionList[index] = body;
			$scope.searchResult.detailedItem = body;

			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add START */
			$scope.detailEventDataList = [];// 明細画面用Control設定リスト
			$scope.detailEventDataList = angular.copy($scope.receiveInspectionList);
			$scope.$broadcast('ngDetailEventData');
			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add END */

			deferred.resolve();
			return;
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#detailPrevious
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
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
		var index = $scope.receiveInspectionList.indexOf($scope.searchResult.detailedItem) - 1;

		// 明細データ取得・設定
		$scope.deferredGetDetail(index, true).then(function(response) {

			// 前/次ボタン、明細番号設定
			setButtons(index);
			$scope.searchResult.index = index;
			// 各項目への制御処理
			var lotManagFlg = $scope.receiveInspectionList[index].treceivePlanB.mproduct.lotManagFlg;
			var limitDtManagFlg = $scope.receiveInspectionList[index].treceivePlanB.mproduct.limitDtManagFlg;
			productManagCurrentItem(index, lotManagFlg, limitDtManagFlg);
			// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add Start
			var productId = $scope.receiveInspectionList[index].treceivePlanB.mproduct.productId;
			var mproductShapeList = $scope.receiveInspectionList[index].treceivePlanB.mproduct.mproductShapeList;
			var multiTextInitModels = owsCommon.getMultiTextModels(4);
			$scope.multiTextOptions.storeNum.model = angular.copy(multiTextInitModels);
			detailMultiTextControl.setMultiText($scope, $scope.gridOptions, 'multiTextOptions', 'storeNum', productId, mproductShapeList, index);
			// 該当行の荷姿補助内訳数取得
			var storeNum = $scope.receiveInspectionList[index].storeNum;
			owsCommon.getCalcAuxiliaryBreakdown($scope, storeNum, "multiTextOptions", "storeNum");
			// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add End

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
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#detailNext
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
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
		var index = $scope.receiveInspectionList.indexOf($scope.searchResult.detailedItem) + 1;

		// 明細データ取得・設定
		$scope.deferredGetDetail(index, true).then(function(response) {

			// 前/次ボタン、明細番号設定
			setButtons(index);
			$scope.searchResult.index = index;
			// 各項目への制御処理
			var lotManagFlg = $scope.receiveInspectionList[index].treceivePlanB.mproduct.lotManagFlg;
			var limitDtManagFlg = $scope.receiveInspectionList[index].treceivePlanB.mproduct.limitDtManagFlg;
			productManagCurrentItem(index, lotManagFlg, limitDtManagFlg);
			// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add Start
			var productId = $scope.receiveInspectionList[index].treceivePlanB.mproduct.productId;
			var mproductShapeList = $scope.receiveInspectionList[index].treceivePlanB.mproduct.mproductShapeList;
			var multiTextInitModels = owsCommon.getMultiTextModels(4);
			$scope.multiTextOptions.storeNum.model = angular.copy(multiTextInitModels);
			detailMultiTextControl.setMultiText($scope, $scope.gridOptions, 'multiTextOptions', 'storeNum', productId, mproductShapeList, index);
			// 該当行の荷姿補助内訳数取得
			var storeNum = $scope.receiveInspectionList[index].storeNum;
			owsCommon.getCalcAuxiliaryBreakdown($scope, storeNum, "multiTextOptions", "storeNum");
			// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add End

			// 上までスクロールしてあげる
			$ionicScrollDelegate.scrollTop();
		},
		function(response) {

			// エラーなら前画面に移動
			$ionicHistory.goBack(-1);
		});
	}

	setButtons = function (index) {
		if (index > 0) {
			$scope.searchResult.hasPrevious = true;
		}
		else {
			$scope.searchResult.hasPrevious = false;
		}
		if (index < ($scope.receiveInspectionList.length-1)) {
			$scope.searchResult.hasNext = true;
		}
		else {
			//まだ読み込んでいない検索結果があるなら次のページを読み込む
			if ($scope.paging.isExistNextPage) {
				$scope.loadMoreData();
				$scope.searchResult.hasNext = true;
			}
			else {
				$scope.searchResult.hasNext = false;
			}
		}
	}


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#search
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function() {

		var isError = $scope.form.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('form.searchform');
			return;
		}
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.receiveInspectionList = [];
		$scope.lastLoaded = 0;
		$scope.getPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

    // [#2946][Ver3.0] WAS連携対応 2017/12/19 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#research
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.research = function() {

		var isError = $scope.form.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('form.searchform');
			return;
		}
		owsCommon.clearPagingOptions($scope.pagingOptions);
		$scope.receiveInspectionList = [];
		$scope.lastLoaded = 0;
		$scope.reGetPagingData($scope.pagingOptions.pageSize, $scope.pagingOptions.currentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#getPagingData
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.reGetPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add Start
		request.data.locationCd = $scope.defaultCondition.locationCd;
		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add End

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if (page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		// [#120] 入荷検品 2017.02.07 honma Mod Start
		api.receiveInspectionSD.research(request).then(function(response) {
		// [#120] 入荷検品 2017.02.07 honma Mod End
			// [#1151][Ver2.2.0] 明細登録後の画面遷移先を検索画面に変更 2017.03.09 honma Mod Start
			var noError = statusInfo.isSuccess(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

			//エラー無しなら検索結果画面へ移行
			if (noError && page == 1) {
				$scope.searchResult.preventDoubleLoad = false;
				$state.go('all.abstract.list');
				$state.go('all.abstract.list', $state.params);
				owsCommon.syncExec(function() {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				});
			// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add Start
			} else if (!noError && response.status.statusCode == 8) {

				// 仮ロケーション値のロケーションマスタ未存在
				optionMessageControl.show($scope, "locationCd", $filter('owfMessage')(response.status.messageCode));
			// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add End
			} else if (!noError) {

				if ($state.current.name == 'all.abstract.detail') {
					// 実績登録後の再検索でエラー有りなら検索条件入力画面へ移行
					$state.go('all.abstract.main', $state.params);
					// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add Start
					if (response.status.statusCode == 2) {
						return
					}
					// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add End
				}
				statusInfo.isSuccessAndShowMessage(response, 'searchform');
			}
			// [#1151][Ver2.2.0] 明細登録後の画面遷移先を検索画面に変更 2017.03.09 honma Mod End
		});
	};
    // [#2946][Ver3.0] WAS連携対応 2017/12/19 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#getPagingData
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add Start
		request.data.locationCd = $scope.defaultCondition.locationCd;
		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add End

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		if (page == $scope.lastLoaded) {
			return
		}
		$scope.lastLoaded = page;

		// [#120] 入荷検品 2017.02.07 honma Mod Start
		api.receiveInspectionSD.search(request).then(function(response) {
		// [#120] 入荷検品 2017.02.07 honma Mod End
			// [#1151][Ver2.2.0] 明細登録後の画面遷移先を検索画面に変更 2017.03.09 honma Mod Start
			var noError = statusInfo.isSuccess(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);

			//エラー無しなら検索結果画面へ移行
			if (noError && page == 1) {
				$scope.searchResult.preventDoubleLoad = false;
				$state.go('all.abstract.list');
				$state.go('all.abstract.list', $state.params);
				owsCommon.syncExec(function() {
					// 初期検索のためスクロールを上まで移動してあげる
					$ionicScrollDelegate.scrollTop();
				});
			// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add Start
			} else if (!noError && response.status.statusCode == 8) {

				// 仮ロケーション値のロケーションマスタ未存在
				optionMessageControl.show($scope, "locationCd", $filter('owfMessage')(response.status.messageCode));
			// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Add End
			} else if (!noError) {

				if ($state.current.name == 'all.abstract.detail') {
					// 実績登録後の再検索でエラー有りなら検索条件入力画面へ移行
					$state.go('all.abstract.main', $state.params);
					// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add Start
					if (response.status.statusCode == 2) {
						return
					}
					// [#1519][Ver2.2.0] 登録後の再検索でデータ存在なしエラーの場合、メッセージ非表示対応 2017.04.07 honma Add End
				}
				statusInfo.isSuccessAndShowMessage(response, 'searchform');
			}
			// [#1151][Ver2.2.0] 明細登録後の画面遷移先を検索画面に変更 2017.03.09 honma Mod End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#setPagingData
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		//取得したデータを次の画面で表示するリストに保存
		$scope.receiveInspectionList = $scope.receiveInspectionList.concat(response.data.storeBody); // 入庫実績明細関連
		// まだ表示していない検索結果が残っているかを保存
		$scope.paging.isExistNextPage = response.paging.isExistNextPage;
		//トータル件数を設定
		$scope.searchResult.totalServerItems = response.paging.allRecordCount;

		/* [#1069] アシスト機能以外の検索結果一覧画面でのスクロール処理の修正 2017/03/08 Dario Add START */
		$scope.searchResult.preventDoubleLoad = false;
		/* [#1069] アシスト機能以外の検索結果一覧画面でのスクロール処理の修正 2017/03/08 Dario Add END */

		// [Ver2.2.0] 入荷入力済アラート表示処理削除 2017.03.09 honma Delete
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	// 明細画面に、期限日を入力する際に、期限日(限界日)チェックを行う
	var checkMaxLimitDt = function() {

		//[Ver3.0][#3113]複数荷姿対応に伴い不要となった処理を削除 2017.12.06 miyabe

		if ($scope.searchResult.detailedItem.treceivePlanB.mproduct.limitDtManagFlg != "1") {
			// 期限日管理商品ではない

			$scope.searchResult.detailedItem.maxLimitDt = null;
			$scope.searchResult.detailedItem.limitDtNgFlg = "0";
			return;
		}

		// パラメータ作成
		var request = {};
		request.data = {};
		request.data.storeHead = $scope.receiveInputH;
		var listBody = [];
		listBody.push($scope.searchResult.detailedItem);
		request.data.storeBody = listBody;

		// [#120] 入荷検品 2017.02.07 honma Mod Start
		// 期限日(限界日)チェック
		api.receiveInspectionSD.inputCheckLimitDt(request).then(function(response) {
		// [#120] 入荷検品 2017.02.07 honma Mod End

			// 明細行に適用
			$scope.searchResult.detailedItem.maxLimitDt = response.data.storeBody[0].maxLimitDt;
			$scope.searchResult.detailedItem.limitDtNgFlg = response.data.storeBody[0].limitDtNgFlg;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#getClassForRow
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 検索結果リスト表示画面で入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		var color = "";

		/* 2017/03/08 Dario Add START */
		if(row == null) {
			return color;
		}
		/* 2017/03/08 Dario Add END */

		if (row.receiveStatus == "01") {
			color = "wmslegendwhite";
		} else if (row.treceivePlanB.receiveStatus == "02") {
			color = "wmslegendlightyellow";
		} else if (row.treceivePlanB.receiveStatus == "03") {
			color = "wmslegendcyan";
		} else if (row.treceivePlanB.receiveStatus == "90") {
			color = "wmslegendred";
		} else if (row.treceivePlanB.receiveStatus == "99") {
			color = "wmslegendpink";
		}

		// 文字色の設定

		// 限界期限日より前の期限日
		if (row.limitDtNgFlg == "1") {
			color = color + " wmslegendblue";
		}

		return color;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#showCustomer
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function() {

		var items = {
				clientCd: userInfo.clientCd,
				vendorCd: $scope.searchCondition.planSupplierCd
		};

		// 仕入先マスタのモーダル画面を表示
		modalFactory.modalVendor($scope, items)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	$scope.$on('modalVendorReturn', function(ev, selectedItem) {
		$scope.searchCondition.planSupplierCd = selectedItem.customerCd;
		$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = selectedItem.customerNm;
	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#customerCdBlur
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {

		// 入力された仕入先コードを取得
		var customerCd = $scope.searchCondition.planSupplierCd;

		if (customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientId;
			request.customerCd = customerCd;

			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = null;

			// 仕入先情報の取得
			api.commonSearch.record(request).then(function(response) {
				$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.mcustomerByPlanSupplierId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#showProduct
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 商品CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を画面項目に反映する。
	 *
	 * @param {boolean} detailScreen 明細画面から呼び出されたならtrue
	 */
	$scope.showProduct = function(detailScreen) {

		if (detailScreen) {
			// 明細画面からの場合
			var items = {
					clientCd: userInfo.clientCd,
					productCd: $scope.searchResult.detailedItem.treceivePlanB.productCd
			};
		}
		else {
			var items = {
					clientCd: userInfo.clientCd,
					productCd: $scope.searchCondition.productCd
			};
		}

		// 商品マスタのモーダル画面を表示
		modalFactory.modalProduct($scope, items)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	$scope.$on('modalProductReturn', function(ev, selectedItem) {
		$scope.searchCondition.productCd =  selectedItem.productCd;
		$scope.searchCondition.productNm =  selectedItem.productNm;
	});
	$scope.$on('detailModalProductReturn', function(ev, selectedItem) {
		$scope.searchResult.detailedItem.treceivePlanB.productCd =  selectedItem.productCd;
		$scope.searchResult.detailedItem.treceivePlanB.mproduct.productNm =  selectedItem.productNm;
		$scope.searchResult.detailedItem.treceivePlanB.mproduct.productAbbr = selectedItem.productAbbr;
		$scope.searchResult.detailedItem.treceivePlanB.mproduct.janCd =  selectedItem.janCd;

		/* [#1057] SD版でもgridOptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
		// 商品の在庫関連情報の入力可否制御
		productManagCurrentItem($scope.searchResult.index, selectedItem.lotManagFlg, selectedItem.limitDtManagFlg);
		/* [#1057] SD版でもgridOptionMessageControlを使用可能にする 2017/04/13 Dario Update END */
	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#productCdBlur
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 *
	 * @param {boolean} detailScreen 明細画面から呼び出されたならtrue
	 */
	$scope.productCdBlur = function(detailScreen) {

		if (!detailScreen) {
			// 入力された商品コードを取得
			var productCd = $scope.searchCondition.productCd;

			if (productCd && 0 < productCd.length) {
				var request = {};
				request.clientId = userInfo.clientId;
				request.productCd = productCd;

				api.commonSearch.query(request).then(function(response) {
					$scope.searchCondition.productNm = response.data.mProduct.productNm;
				});

			} else {
				$scope.searchCondition.productNm = null;
			}

		} else {
			// 明細画面からの場合

			// 入力された商品コードを取得
			var productCd = $scope.searchResult.detailedItem.treceivePlanB.productCd;

			if (productCd && 0 < productCd.length) {
				var request = {};
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start
				request.clientId = userInfo.clientId;
				request.productCd = productCd;
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End

				api.product.record(request).then(function(response) {
					$scope.searchResult.detailedItem.treceivePlanB.mproduct.productNm = response.data.mProduct.productNm;
					$scope.searchResult.detailedItem.treceivePlanB.mproduct.productAbbr = response.data.mProduct.productAbbr;
					$scope.searchResult.detailedItem.treceivePlanB.mproduct.janCd = response.data.mProduct.janCd;

					/* [#1057] SD版でもgridOptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
					// 商品の在庫関連情報の入力可否制御
					productManagCurrentItem($scope.searchResult.index, response.data.mProduct.lotManagFlg, response.data.mProduct.limitDtManagFlg);
					/* [#1057] SD版でもgridOptionMessageControlを使用可能にする 2017/04/13 Dario Update END */
				});

			} else {
				$scope.searchResult.detailedItem.treceivePlanB.mproduct.productNm = null;
				$scope.searchResult.detailedItem.treceivePlanB.mproduct.productAbbr = null;
				$scope.searchResult.detailedItem.treceivePlanB.mproduct.janCd = null;
			}
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#showLocation
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * ロケーションCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を画面項目に反映する。
	 *
	 * @param {boolean} detailScreen 明細画面から呼び出されたならtrue
	 */
	$scope.showLocation = function(detailScreen) {

		if (detailScreen) {
			// 明細画面からの場合
			var items = {
					locationCd: $scope.searchResult.detailedItem.mlocation.locationCd,
					centerCd: userInfo.centerCd
			};
		} else {
			var items = {
					locationCd: $scope.defaultCondition.locationCd,
					centerCd: userInfo.centerCd
			};
		}

		// 商品マスタのモーダル画面を表示
		modalFactory.modalLocation($scope, items, detailScreen)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	$scope.$on('modalLocationReturn', function(ev, selectedItem) {
		$scope.defaultCondition.locationCd =  selectedItem.locationCd;
		$scope.defaultCondition.locationNm =  selectedItem.locationNm;
	});
	$scope.$on('detailModalLocationReturn', function(ev, selectedItem) {
		$scope.searchResult.detailedItem.mlocation.locationCd =  selectedItem.locationCd;
		$scope.searchResult.detailedItem.mlocation.locationNm =  selectedItem.locationNm;
	});

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#productCdBlur
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * ロケーションCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function() {

		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Mod Start
		// 入力された商品コードを取得
		var locationCd = $scope.defaultCondition.locationCd;

		if (locationCd && 0 < locationCd.length) {
			var request = {};
			request.centerId = userInfo.centerId;
			request.locationCd = locationCd;

			api.location.record(request).then(function(response) {
				if (response.data.mLocation.locationId == null) {
					// ロケーションマスタ未存在
					optionMessageControl.show($scope, "locationCd", $filter('owfMessage')("locationNotFoundError"));
				}
			});

		} else {
			$scope.defaultCondition.locationNm = null;
		}
		// [#1064][Ver2.2.0] 仮ロケーションのマスタ存在チェック追加 2017.03.08 honma Mod End
	}

	//【Ver2.2.0】機能 #1072 フォーカスが当たったら、入力内容を全選択する 2017.02.23 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#inputValueAllSelectOnFocus
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInspectionSD
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

	//[Ver3.0][#3113]複数荷姿対応に伴い不要となった処理を削除 2017.12.06 miyabe


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#limitDtBlur
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 期限日のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、期限日をチェックする。
	 */
	$scope.limitDtBlur = function(rowIndex) {
		checkMaxLimitDt(rowIndex);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD#register
	 * @methodOf oneslogiWms.ReceiveInspectionSD.object:ReceiveInspectionSD
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		var request = {};
		request.receivePlanHId = $scope.searchResult.detailedItem.treceivePlanB.receivePlanHId;

		// 現バージョンNo
		var currentVersionNo = $scope.searchResult.detailedItem.treceivePlanB.treceivePlanH.versionNo;

		// [#120] 入荷検品 2017.02.07 honma Mod Start
		api.receiveInspectionSD.initSearch(request).then(function(response) {
		// [#120] 入荷検品 2017.02.07 honma Mod End

			// 業務エラーのクリア
			optionMessageControl.hideAll($scope);
			gridOptionMessageControl.hideAll($scope.gridOptions);

			//【Ver2.2.0】機能 #1143 予定数同数入力で確認メッセージ表示不具合、入庫No.重複エラー対応 2017.03.06 honma Add Start
			// 登録対象データの入庫実績ヘッダ関連
			$scope.receiveInputH = response.data.storeHead; // 入庫実績ヘッダ関連
			//【Ver2.2.0】機能 #1143 予定数同数入力で確認メッセージ表示不具合、入庫No.重複エラー対応 2017.03.06 honma Add End
			// 変更前の情報を退避(登録時に送信)
			$scope.originalStoreHead = response.data.storeHead;
			$scope.originalStoreBody = response.data.storeBody;

			// 排他チェック(現バージョンNoと比較)
			var selectVersionNo = response.data.storeHead.treceivePlanH.versionNo;
			if (currentVersionNo != selectVersionNo) {
				alertMessage.setErrorMessageByCode("entityAlreadyUpdatedError");
				return;
			}

			//  入荷済データ
			var searchList = [];
			for (var row = 0; row < response.data.storeBody.length; row++) {
				if (response.data.storeBody[row].storeRecordBId !== null && response.data.storeBody[row].storeRecordBId !== '') {
					searchList.push(response.data.storeBody[row]);
				}
			}

			var listBody = [];

			listBody.push($scope.searchResult.detailedItem);

			for (var rowSearchList = 0; rowSearchList < searchList.length; rowSearchList++) {
				if ($scope.searchResult.detailedItem.storeRecordBId == searchList[rowSearchList].storeRecordBId) {

					searchList.splice(rowSearchList,1);
					break;
				}
			}

			/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
			var promiseAll = $q.all([
			                         detailDirectiveControl.isValidCheckDetail($scope.form.detailform),
			                         // [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			                         detailMultiTextControl.deferredCheckDecimalInput($scope.form.detailform, $scope, $scope.searchResult.detailedItem.storeNum, $scope.gridOptions, 'multiTextOptions', 'storeNum', $scope.searchResult.index)
			                         // [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			                         ]);

			promiseAll.then(function(){
				/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Add END */
				// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod Start
				owsCommon.syncExec(function() {

					var errCnt = 0;
					var errCdLot = "lotNotInputLotManagementProductError";
					var errCdLimitDt = "limitDateNotInputLimitDateManagementProductError";
					// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Add Start
					var errCdRequired = "requiredError";
					// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.04.11 honma Mod Start
					var errCdCanNotEnterInStoreNumZeroData = "canNotEnterInStoreNumZeroDataError";
					// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.04.11 honma Mod End
					// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Add End

					// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
					if (owsCommon.isZero($scope.searchResult.detailedItem.storeNum)) {
						// ロケーションCD入力不可チェック
						if (!isNullOrUndefined($scope.searchResult.detailedItem.mlocation.locationCd) && 0 < $scope.searchResult.detailedItem.mlocation.locationCd.length) {
							errCnt++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", $scope.searchResult.index)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", $scope.searchResult.index)) {
									gridOptionMessageControl.show($scope.gridOptions, "mlocation.locationCd", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), $scope.searchResult.index);
								}
							}
						}
						// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.05.24 honma/kawana Add Start
						// 期限日入力不可チェック
						if (!isNullOrUndefined($scope.searchResult.detailedItem.limitDt) && 0 < $scope.searchResult.detailedItem.limitDt.length) {
							errCnt++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", $scope.searchResult.index)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", $scope.searchResult.index)) {
									gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), $scope.searchResult.index);
								}
							}
						}
						// ロット入力不可チェック
						if (!isNullOrUndefined($scope.searchResult.detailedItem.lot) && 0 < $scope.searchResult.detailedItem.lot.length) {
							errCnt++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", $scope.searchResult.index)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", $scope.searchResult.index)) {
									gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), $scope.searchResult.index);
								}
							}
						}
						// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.05.24 honma/kawana Add End
					} else {
						// ロケーションCD必須チェック
						if (isNullOrUndefined($scope.searchResult.detailedItem.mlocation.locationCd) || 0 == $scope.searchResult.detailedItem.mlocation.locationCd.length) {
							errCnt++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", $scope.searchResult.index)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", $scope.searchResult.index)) {
									gridOptionMessageControl.show($scope.gridOptions, "mlocation.locationCd", $filter('owfMessage')(errCdRequired), $scope.searchResult.index);
								}
							}
						}

						if ($scope.searchResult.detailedItem.treceivePlanB.mproduct.lotManagFlg == "1") {
							if (!($scope.searchResult.detailedItem.lot) || 0 == $scope.searchResult.detailedItem.lot.length) {
								errCnt++;
								/* [#1057] SD版でもgridOptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", $scope.searchResult.index)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", $scope.searchResult.index)) {
										gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')(errCdLot), $scope.searchResult.index);
									}
								}
							}
						}
						if ($scope.searchResult.detailedItem.treceivePlanB.mproduct.limitDtManagFlg == "1") {
							if (!($scope.searchResult.detailedItem.limitDt) || 0 == $scope.searchResult.detailedItem.limitDt.length) {
								errCnt++;
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", $scope.searchResult.index)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", $scope.searchResult.index)) {
										gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')(errCdLimitDt), $scope.searchResult.index);
									}
								}
								/* [#1057] SD版でもgridOptionMessageControlを使用可能にする 2017/04/13 Dario Update END */
							}
						}
					}
					// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End

					if (0 < errCnt) {
						// 最初のエラーにフォーカス
						/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Update START */
						directiveControl.firstErrorOnFocus('form.detailform');
						/* [#1066] SD版でもoptionMessageControlを使用可能にする 2017/04/13 Dario Update END */
						return;
					}

					var checkFunc;   // 入力チェック関数
					var execFunc;    // データ登録関数

					// [#120] 入荷検品 2017.02.07 honma Mod Start
					// 新規登録関数を設定
					checkFunc = api.receiveInspectionSD.inputCheckRegister;
					execFunc = api.receiveInspectionSD.register;
					// [#120] 入荷検品 2017.02.07 honma Mod End

					// 画面内容を引数に設定
					var request = {};
					request.data = {};
					request.data.storeHead = $scope.receiveInputH;
					request.data.storeBody = listBody;
					// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Add Start
					// 商品ラベル出力用に画面内容を引数に設定
					request.data.printStoreBody = listBody;
					// [#1132][Ver2.2.0] 検品後の商品ラベル出力処理不具合対応 2017.03.13 honma Add End
					// 画面内容の編集前の値を引数に設定
					request.data.originalStoreHead = $scope.originalStoreHead;
					request.data.originalStoreBody = $scope.originalStoreBody;

					var receiveQtyAndLimitFlg = "0";

					// 入力チェック
					checkFunc(request).then(function(checkResponse) {

						// ロケーションCD未存在の場合、項目横にエラー内容表示
						if (checkResponse.status.subStatusCode == 8) {
							gridOptionMessageControl.show($scope.gridOptions, "mlocation.locationCd", $filter('owfMessage')(checkResponse.status.messageCode), $scope.searchResult.index);
							// 最初のエラーにフォーカス
							directiveControl.firstErrorOnFocus('form.detailform');
							return;
						}

						// 処理結果確認(確認ダイアログ表示)
						if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'form.detailform')) {
							return;
						}

						//【Ver2.2.0】機能 #1143 予定数同数入力で確認メッセージ表示不具合、入庫No.重複エラー対応 2017.03.06 honma Add Start
						// 画面内容を引数に設定
						var registBody = [];
						registBody = listBody.concat(searchList);
						request.data.storeBody = registBody;
						//【Ver2.2.0】機能 #1143 予定数同数入力で確認メッセージ表示不具合、入庫No.重複エラー対応 2017.03.06 honma Add End

						// 入荷予定データ登録または更新
						execFunc(request).then(function(execResponse) {

							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'form.detailform')) {
								return;
							}

							// ダイアログ表示(正常終了)
							owsCommon.syncExec(function() {
								// 商品ラベル自動発行エラーのポップアップ表示のためループ処理
								for (var rowListStatus = 0; rowListStatus < execResponse.status.listStatus.length; rowListStatus++) {
									owsCommon.viewAlert(execResponse.status.listStatus[rowListStatus].status.messageCode, execResponse.status.listStatus[rowListStatus].status.messageReplaceValue);
								}

								// [#1151][Ver2.2.0] 明細登録後の画面遷移先を検索画面に変更 2017.03.09 honma Mod Start
								// 再検索
								// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM Start
								$scope.research();
								// [#2946][Ver3.0] WAS連携対応 2017/12/06 PYM End
								// [#1151][Ver2.2.0] 明細登録後の画面遷移先を検索画面に変更 2017.03.09 honma Mod End
							});
						});

					});
				}, 1000);
				// [#1812][Ver2.2.0] iOSブラウザのフリーズ対応の為、timeout1000ミリ秒設定 2017.05.23 honma Mod End
			});
		});
	};

	/* [#1057] SD版でもDirectiveControlを使用可能にする 2017/04/13 Dario Update START */
	$scope.$on('ngDetailEventDataReturn', function(ev, index, entity) {
		var lotManagFlg = entity.treceivePlanB.mproduct.lotManagFlg;
		var limitDtManagFlg = entity.treceivePlanB.mproduct.limitDtManagFlg;
		productManagCurrentItem(index, lotManagFlg, limitDtManagFlg);
		// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add Start
		if (index == $scope.searchResult.index) {
			// 該当行の複数荷姿model初期化
			var multiTextInitModels = owsCommon.getMultiTextModels(4);
			$scope.multiTextOptions.storeNum.model = angular.copy(multiTextInitModels);
			detailMultiTextControl.setMultiText($scope, $scope.gridOptions, 'multiTextOptions', 'storeNum', entity.treceivePlanB.mproduct.productId, entity.treceivePlanB.mproduct.mproductShapeList, index);
			// 該当行の荷姿補助内訳数取得
			owsCommon.getCalcAuxiliaryBreakdown($scope, entity.storeNum, "multiTextOptions", "storeNum");
		}
		// [#2799][Ver3.0] unit of measure 対応 2017.11.30 honma Add End
	});

	// 各項目への制御処理
	var productManagCurrentItem = function(index, lotManagFlg, limitDtManagFlg) {

		// センタ間移動の入荷予定の場合はロット、期限日は入力不可(値は保持)
		if ($scope.receiveInputH.treceivePlanH.centerTransitFlg == "1") {
			detailDirectiveControl.editable($scope.gridOptions, 'lot', false, index);
			detailDirectiveControl.editable($scope.gridOptions, 'limitDt', false, index);
			return;
		}

		if (lotManagFlg == "0") {
			detailDirectiveControl.editable($scope.gridOptions, 'lot', false, index);
			$scope.receiveInspectionList[index].lot = null;
		} else {
			detailDirectiveControl.editable($scope.gridOptions, 'lot', true, index);
		}

		if (limitDtManagFlg == "0") {
			detailDirectiveControl.editable($scope.gridOptions, 'limitDt', false, index);
			$scope.receiveInspectionList[index].limitDt = null;
		} else {
			detailDirectiveControl.editable($scope.gridOptions, 'limitDt', true, index);
		}
	};
	/* [#1057] SD版でもDirectiveControlを使用可能にする 2017/04/13 Dario Update END */

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
