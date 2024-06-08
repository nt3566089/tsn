/**
 * @ngdoc overview
 * @name oneslogiWms.PickingSD
 *
 * @description
 * ピッキング画面 （スマートデバイス用）<br>
 *
 * ピッキング種別を元にバラオーダー/ケースピッキング作業を行う為の画面。
 */
angular.module('oneslogiWms.PickingSD', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PickingSD.service:PickingSDApi
 *
 * @description
 * ピッキング画面 （スマートデバイス用）用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * pickingType ピッキング種別データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * pickingSD ピッキングデータ操作用WebApi<br>
 * ・resources/shipping/pickingSD/init 初期データ取得(通常)WebAPI<br>
 * ・resources/shipping/pickingSD/search ピッキング種別振り分けWebAPI<br>
 */
.factory('PickingSDApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		centerClass: AngularAPIClient.make([
											['query', 'GET', 'resources/common/centerClass/keyValueList']
											]
		),
		pickingSD: AngularAPIClient.make([
											['init', 'GET', 'resources/shipping/pickingSD/init']
		]),
		orderPickingSD: AngularAPIClient.make([
											['checkAutoSortPicking', 'POST', 'resources/shipping/orderPickingSD/checkAutoSortPicking']
		]),
		casePickingSD: AngularAPIClient.make([
											['checkAutoSortPicking', 'POST', 'resources/shipping/casePickingSD/checkAutoSortPicking']
		])
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PickingSD.object:PickingSD
 *
 * @description
 * ピッキング画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PickingSD', ['$scope', '$state', '$filter', '$location', '$q', '$ionicHistory', 'ionicDatePicker', 'alertMessage', 'directiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'owsCommonSd', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'PickingSDApi',
                  function($scope,   $state,   $filter,   $location,   $q,   $ionicHistory,   ionicDatePicker,   alertMessage,   directiveControl,   optionMessageControl,   gridOptionMessageControl,   owsHistory,   owsCommon,   owsCommonSd,   userInfo,   statusInfo,   modalFactory,   printFactory,   api) {

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingSD.object:PickingSD#initScreen
	 * @methodOf oneslogiWms.PickingSD.object:PickingSD
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 画面起動時に一度だけ実行される処理、画面の各種設定を行う。
	 */
	var running = false;
	$scope.initScreen = function() {
		$scope.form = {};
		$scope.searchCondition = {};

		// モード設定
		// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Mod Start
		var searchObject = $location.search();
		$scope.screenMode = searchObject.mode;
		$scope.pickingType = searchObject.pickingType;
		// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Mod End

		//センタコードの設定
		$scope.centerCd = userInfo.centerCd;

		//荷主コードの設定
		$scope.clientCd = userInfo.clientCd;

		//ページングの設定
		$scope.pagingOptions = owsCommonSd.getDefaultPagingOptions();

		// グリッドの設定
		$scope.gridOptions = {
			data: 'pickingSDDetail',
			columnDefs: 'pickingSDDetailCols',
			pagingOptions : $scope.pagingOptions,
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingSD.object:PickingSD#initScreenHttp
	 * @methodOf oneslogiWms.PickingSD.object:PickingSD
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
				 $scope.deferredGetPickingType(), // ピッキング種別
				 $scope.deferredGetTakingShippingFlg() // 作業日/出荷日 ※画面遷移するときのパラメータに使用
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingSD.object:PickingSD#deferredGetPickingType
	 * @methodOf oneslogiWms.PickingSD.object:PickingSD
	 *
	 * @description ピッキング種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPickingType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PICKING_TYPE";

		owsCommon.getDataCacheable(api.centerClass, request).then(function(response){
			$scope.pickingTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingSD.object:PickingSD#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.PickingSD.object:PickingSD
	 *
	 * @description 作業日/出荷日取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTakingShippingFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_FLG";

		owsCommon.getDataCacheable(api.centerClass, request).then(function(response){
			$scope.takingShippingFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingSD.object:PickingSD#deferredGetInitData
	 * @methodOf oneslogiWms.PickingSD.object:PickingSD
	 *
	 * @description
	 * ピッキング初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.pickingSD.init().then(function(response){

			$scope.paging = response.paging;
			$scope.header = response.data.head;
			$scope.footer = response.data.footer;

			// ログイン情報より初期値を設定
			$scope.searchCondition.pickingType = owsCommon.getDefaultValue($scope.pickingTypeList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition.pickingType = owsHistory.popState();
			// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Mod Start
			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				$scope.searchCondition.pickingType = $scope.pickingType;
			// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Mod End
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingSD.object:PickingSD#search
	 * @methodOf oneslogiWms.PickingSD.object:PickingSD
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){

		owsCommon.clearPagingOptions($scope.pagingOptions);
		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition.pickingType);

		// ピッキング種別により画面遷移先を変更
		var pickingType = $scope.searchCondition.pickingType;

		var searchApi;
		var locationPath;

		if (pickingType == "0") {
			// ピッキング種別[0:バラ]

			searchApi = api.orderPickingSD.checkAutoSortPicking;
			locationPath = "wms/shipping/OrderPickingSD/";
		} else {
			// ピッキング種別[1:ケース]

			searchApi = api.casePickingSD.checkAutoSortPicking;
			locationPath = "wms/shipping/CasePickingSD/";
		}

		// データ検索
		// ※遷移前に該当データがあるか確認しておく (エラーの出方を統一するため)
		var request = {};
		request.data = {};
		request.data.head = {};
		request.data.head.tallocInstH = {};
		request.data.head.centerId = userInfo.centerId;
		request.data.head.clientId = userInfo.clientId;
		request.data.head.takingShippingFlg = owsCommon.getDefaultValue($scope.takingShippingFlgList);
		request.data.head.dtFrom = userInfo.systemDt;
		request.data.head.dtTo = userInfo.systemDt;
		request.data.head.emergencyFlg = "0";	// 全件

		searchApi(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				return;
			}

			// 各ピッキング画面へ遷移
			// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Mod Start
			$location.path(locationPath).search({})
				.search("mode", SCREEN_MODE.Update)
				.search("pickingType", $scope.searchCondition.pickingType);
			// [#2130][Ver2.2.0] SDピッキング - 『戻る』ボタン押下後に登録処理を行った場合の登録後の画面遷移先不正 2017.07.18 honma Mod End
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
