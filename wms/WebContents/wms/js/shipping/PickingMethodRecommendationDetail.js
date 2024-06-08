/**
 * @ngdoc overview
 * @name oneslogiWms.PickingMethodRecommendationDetail
 *
 * @description ピッキング提案明細画面<br>
 *
 * ピッキング提案明細を表示する画面。
 *
 */
angular.module('oneslogiWms.PickingMethodRecommendationDetail', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PickingMethodRecommendationDetail.service:PickingMethodRecommendationDetailApi
 *
 * @description ピッキング提案明細画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * emergencyFlg, picMthdRcmd  緊急フラグ, 提案ピッキング方法データ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * carrier 運送事業者データ操作用WebAPI<br>
 * ・resources/common/carrierCd/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * deliveryCourse 配送コースデータ操作用WebAPI<br>
 * ・resources/common/deliveryCourse/record ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * PickingMethodRecommendationDetail ピッキング提案明細データ操作用WebAPI<br>
 * ・resources/shipping/pickingMethodRecommendationDetail/init 初期データ取得WebAPI<br>
 * ・resources/shipping/pickingMethodRecommendationDetail/initSearch 初期処理(検索)データ取得WebAPI<br>
 */
.factory('PickingMethodRecommendationDetailApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		emergencyFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		pickingMethodRecommendationDetail: AngularAPIClient.make([
		                                         ['init',                        'GET',  'resources/shipping/pickingMethodRecommendationDetail/init'],
		                                         ['search',                      'GET',  'resources/shipping/pickingMethodRecommendationDetail/search'],
		                                         ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
 *
 * @description ピッキング提案明細画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PickingMethodRecommendationDetail', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'PickingMethodRecommendationDetailApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.PickingMethodRecommendationDetailCols = [{field:"workDt", displayName:"作業日"},
	                               {field:"shippingDt", displayName:"出荷日"},
	                               {field:"supplyCustomerCd", displayName:"納品先CD"},
	                               {field:"supplyCustomerNm", displayName:"納品先名称"},
	                               {field:"delivCustomerCd", displayName:"届先CD"},
	                               {field:"delivCustomerNm", displayName:"届先名称"},
	                               {field:"pickingWorkNo", displayName:"出庫作業No."},
	                               {field:"shippingStatus", displayName:"出荷ステータス"},
	                               {field:"shippingStatusNm", displayName:"出荷ステータス名称"},
	                               {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                               {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                               {field:"carrierCd", displayName:"運送業者CD"},
	                               {field:"carrierNm", displayName:"運送業者名称"},
	                               {field:"pl1OutFlg", displayName:"1次ピッキングリスト発行"},
	                               {field:"slipNum", displayName:"伝票枚数"},
	                               {field:"delivUnitNo", displayName:"届先単位No."},
	                               {field:"delivPlanDt", displayName:"納品予定日"},
	                               {field:"delivDt", displayName:"納品指定日"},
	                               {field:"delivTz", displayName:"納品時間帯CD"},
	                               {field:"delivTzNm", displayName:"納品時間帯名称"},
	                               {field:"emergencyFlg", displayName:"緊急フラグ"}
	                               ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#initScreen
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description 画面初期化処理<br>
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

		// センタ変更の監視設定（選択内容変更時）
		$scope.centerChange = function() {
			// 運送業者リスト変更（同期処理）
			$scope.deferredGetCarrier();
		};

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		var setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'picMthdRcmdData',
			columnDefs: 'PickingMethodRecommendationDetailCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#initScreenHttp
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetEmergency() // 緊急フラグ
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#deferredGetEmergencyFgl
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description
	 * 緊急フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergency = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_FLG";

		owsCommon.getDataCacheable(api.emergencyFlg, request).then(function(response){
			$scope.emergencyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#deferredGetInitData
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description ピッキング提案明細データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		var request = {};
		request.picMthdRcmdId = $route.current.params.picMthdRcmdId;

		api.pickingMethodRecommendationDetail.init(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {

				// 前画面に戻る(メッセージ表示付き)
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				deferred.reject();
				return;
			}

			// ヘッダデータ
			$scope.picMthdRcmdH = response.data.header;
			$scope.picMthdRcmdH.picMthdRcmdId = $route.current.params.picMthdRcmdId;
			// ページング
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete

			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#getPagingData
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {

		var request = {};
		request.data = {};
		request.data.header = $scope.picMthdRcmdH;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.pickingMethodRecommendationDetail.search(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				// 前画面に戻る(メッセージ表示付き)
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				return;
			}

			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#setPagingData
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {

		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.picMthdRcmdH = response.data.header;
		$scope.picMthdRcmdData = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail#getClassForRow
	 * @methodOf oneslogiWms.PickingMethodRecommendationDetail.object:PickingMethodRecommendationDetail
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 緊急の場合のみ背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		var color = "";
		// 緊急の場合のみ
		if (row.entity.emergencyFlg == "1") {
			color = color + " wmslegendcolorred";
		}
		return color;
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
