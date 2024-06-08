/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingInstList
 *
 * @description 出庫指示一覧画面<br>
 *
 * 出庫指示一覧表示する画面。
 *
 */
angular.module('oneslogiWms.ShippingInstList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingInstList.service:ShippingInstListApi
 *
 * @description 出庫指示一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * takingShippingFlg、shippingStatus、 noAllcDisplayFlg、emergencyFlg 作業日/出荷日、出荷ステータス、未出庫全件、緊急のみデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * carrier 運送事業者データ操作用WebAPI<br>
 * ・resources/common/carrierCd/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * supplierCustomer 納品先データ操作用WebAPI<br>
 * ・resources/common/deliveryCustomer/record ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * deliveryCourse 配送コースデータ操作用WebAPI<br>
 * ・resources/common/deliveryCourse/record ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ShippingInstList 出庫指示一覧データ操作用WebAPI<br>
 * ・resources/shipping/shippingInstList/initUsually 初期データ取得WebAPI<br>
 * ・resources/shipping/shippingInstList/initSearch 初期処理(検索)データ取得WebAPI<br>
 * ・resources/shipping/shippingInstList/checkIndicator チェック処理(出庫指示)WebAPI<br>
 * ・resources/shipping/shippingInstList/indicator 出庫指示WebAPI<br>
 * ・resources/shipping/shippingInstList/checkIndicatingLift チェック処理(出庫指示解除時)WebAPI<br>
 * ・resources/shipping/shippingInstList/indicatorLift 出庫指示解除WebAPI<br>
 // [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo Start
 * ・resources/shipping/shippingInstList/checkpieceShippingInspectCancel チェック処理(出荷検品解除時)WebAPI<br>
 * ・resources/shipping/shippingInstList/pieceShippingInspectCancel 出荷検品解除WebAPI<br>
 // [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo End
 * ・resources/shipping/shippingInstList/checkIndicatorCancel チェック処理(出荷指示キャンセル時)WebAPI<br>
 * ・resources/shipping/shippingInstList/indicatorCancel 出荷指示キャンセルWebAPI<br>
 * ・resources/shipping/shippingInstList/checkErrorDelete チェック処理(エラーデータ削除時)WebAPI<br>
 * ・resources/shipping/shippingInstList/errorDelete エラーデータ削除WebAPI<br>
 * ・resources/shipping/shippingInstList/checkErrorCheck チェック処理(エラーチェック時)WebAPI<br>
 * ・resources/shipping/shippingInstList/errorCheck エラーチェックWebAPI<br>
 * ・resources/shipping/shippingInstList/dateUpdateCheck チェック処理(日付一括変更)WebAPI<br>
 * ・resources/shipping/shippingInstList/dateUpdate 日付一括変更処理WebAPI<br>
 * ・resources/shipping/shippingInstList/checkDeliveryCourseUpdata チェック処理(配送コース一括変更)WebAPI<br>
 * ・resources/shipping/shippingInstList/deliveryCourseUpdata 配送コース一括変更WebAPI<br>
 * ・resources/shipping/shippingInstList/progress 進捗率表示切替(ピース⇔行数)WebAPI<br>
 * ・resources/shipping/shippingInstList/checkShippingWorkRefUpdate チェック処理(出庫作業メッセージ登録)WebAPI<br>
 * ・resources/shipping/shippingInstList/shippingWorkRefUpdate 出庫作業メッセージ登録処理WebAPI<br>
 * ・resources/shipping/shippingInstList/search 検索結果取得WebAPI<br>
 */
.factory('ShippingInstListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		takingShippingFlg: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		shippingStatus: AngularAPIClient.make([
		                                       // [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana Start
		                                       ['query', 'GET', 'resources/common/centerClass/grpKeyValueList']
		                                       // [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana End
		                                       ]
		),
		noAllcDisplayFlg: AngularAPIClient.make([
		                                         ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                         ]
		),
		emergencyFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		carrier: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		supplierCustomer: AngularAPIClient.make(//納品先CDのロストフォーカス処理
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		),
		deliveryCourse: AngularAPIClient.make(//配送コースCDのロストフォーカス処理
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
		noStockOutFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End
		// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
		cancelDisplay: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
		// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
		workMessageFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                     ]
		),
		// [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End
		ShippingInstList: AngularAPIClient.make([
		                                         ['init',                        'GET',  'resources/shipping/shippingInstList/init'],
		                                         ['search',                      'GET',  'resources/shipping/shippingInstList/search'],
		                                         ['excel',                       'GET',  'resources/shipping/shippingInstList/search', 'excel'],
		                                         ['checkDateUpdate',             'POST', 'resources/shipping/shippingInstList/checkDateUpdate'],
		                                         ['workShippingDtUpdate',        'POST', 'resources/shipping/shippingInstList/dateUpdate'],
		                                         ['checkDeliveryCourseUpdate',   'POST', 'resources/shipping/shippingInstList/checkDeliveryCourseUpdate'],
		                                         ['deliveryCourseUpdate',        'POST', 'resources/shipping/shippingInstList/deliveryCourseUpdate'],
		                                         ['checkIndicatorCancel',        'POST', 'resources/shipping/shippingInstList/checkIndicatorCancel'],
		                                         ['indicatorCancel',             'POST', 'resources/shipping/shippingInstList/indicatorCancel'],
		                                         ['checkErrorDelete',            'POST', 'resources/shipping/shippingInstList/checkErrorDelete'],
		                                         ['errorDelete',                 'POST', 'resources/shipping/shippingInstList/errorDelete'],
		                                         // [Ver3.1][#5125]欠品クリアボタンを追加 2018.08.20 matsumoto Start
		                                         ['checkClearShortage',		 'POST', 'resources/shipping/shippingInstList/checkClearShortage'],
		                                         ['clearShortage',				 'POST', 'resources/shipping/shippingInstList/clearShortage'],
		                                         // [Ver3.1][#5125]欠品クリアボタンを追加 2018.08.20 matsumoto End
		                                         ['checkErrorCheck',             'POST', 'resources/shipping/shippingInstList/checkErrorCheck'],
		                                         ['errorCheck',                  'POST', 'resources/shipping/shippingInstList/errorCheck'],
		                                         ['checkIndicator',              'POST', 'resources/shipping/shippingInstList/checkIndicator'],
		                                         ['indicator',                   'POST', 'resources/shipping/shippingInstList/indicator'],
		                                         // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
		                                         ['indicatorBatch',              'POST', 'resources/shipping/shippingInstList/indicatorBatch'],
		                                         // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End
		                                         ['checkIndicatingLift',         'POST', 'resources/shipping/shippingInstList/checkIndicatingLift'],
		                                         ['indicatorLift',               'POST', 'resources/shipping/shippingInstList/indicatorLift'],
		                                         // [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo Start
		                                         ['checkpieceShippingInspectCancel',  'POST', 'resources/shipping/shippingInstList/checkpieceShippingInspectCancel'],
		                                         ['pieceShippingInspectCancel',       'POST', 'resources/shipping/shippingInstList/pieceShippingInspectCancel'],
		                                         // [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo End
		                                         ['checkShippingWorkRefUpdate',  'POST', 'resources/shipping/shippingInstList/checkShippingWorkRefUpdate'],
		                                         ['shippingWorkRefUpdate',       'POST', 'resources/shipping/shippingInstList/shippingWorkRefUpdate']
		                                         ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingInstList.object:ShippingInstList
 *
 * @description 出庫指示一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShippingInstList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'wmsShipCommon', 'ShippingInstListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, wmsShipCommon, api) {

	// グリッドの列情報（デザイン用）
	$scope.ShippingInstListCols = [{field:"mcenter.centerCd", displayName:"選択"},
	                               //荷主センタ変更対応 2017.01.19 sja Start
	                               {field:"centerCd", displayName:"センタCD"},
	                               {field:"centerNm", displayName:"センタ名称"},
	                               {field:"clientCd", displayName:"荷主CD"},
	                               {field:"clientNm", displayName:"荷主名称"},
	                               //荷主センタ変更対応 2017.01.19 sja End
	                               {field:"workDt", displayName:"作業日"},
	                               {field:"shippingDt", displayName:"出荷日"},
	                               {field:"pickingBatchNo", displayName:"出庫指示バッチNo."},
	                               {field:"supplyCustomerCd", displayName:"納品先CD"},
	                               {field:"customerNm", displayName:"納品先名称"},
	                               {field:"customerAbbr", displayName:"納品先略称"},
	                               {field:"shippingSlipNo", displayName:"WMS出荷伝票No."},
	                               {field:"clientShippingNo", displayName:"顧客出荷指示No."},
	                               {field:"shippingStatus", displayName:"出荷ステータス"},
	                               {field:"shippingStatus1", displayName:"出荷ステータス名称"},
	                               {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                               {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                               {field:"carrierCd", displayName:"運送業者CD"},
	                               {field:"carrierNm", displayName:"運送業者名称"},
	                               {field:"slipNo", displayName:"伝枚"},
	                               {field:"lineNo", displayName:"行数"},
	                               {field:"productId", displayName:"アイテム数"},
	                               {field:"instNum", displayName:"指示数"},
	                               {field:"allocNum", displayName:"引当済数"},
	                               {field:"oplOutFlg", displayName:"トータルピッキングリスト出力"},
	                               {field:"tplOutFlg", displayName:"オーダーピッキングリスト出力"},
	                               {field:"plOutFlg", displayName:"種まきリスト出力"},
	                               {field:"slOutFlg", displayName:"摘み取りリスト出力"},
	                               // [検査-222] 納品明細出力に文言統一 2014.12.08 Sakata Start
	                               {field:"packingOutFlg", displayName:"納品明細出力"},
	                               // [検査-222] 納品明細出力に文言統一 2014.12.08 Sakata End
	                               {field:"invoiceCreateFlg", displayName:"送り状データ作成"},
	                               {field:"stwOutFlg", displayName:"積込リスト出力"},
	                               {field:"pickingNum", displayName:"出庫(％)"},
	                               {field:"inspectionNum", displayName:"検品(％)"},
	                               {field:"loadingStatus", displayName:"積込検品(％)"},
	                               {field:"pickingWorkNo", displayName:"出庫作業No."},
	                               {field:"delivUnitNo", displayName:"届先単位No."},
	                               {field:"delivPlanDt", displayName:"納品予定日"},
	                               {field:"delivDt", displayName:"納品指定日"},
	                               {field:"delivTzCd", displayName:"納品時間帯CD"},
	                               {field:"delivTzNm", displayName:"納品時間帯名称"},
	                               {field:"onetimFlg", displayName:"ワンタイムフラグ"},
	                               {field:"messageNm", displayName:"エラー内容"},
	                               {field:"pickingWorkMessage", displayName:"出庫作業メッセージ"},
	                               {field:"forceFixedFlg", displayName:"引当禁止フラグ"},
	                               {field:"shippingStopFlg1", displayName:"納品先出荷停止フラグ"},
	                               {field:"shippingStopFlg", displayName:"商品出荷停止フラグ"},
	                               {field:"allocNgFlg", displayName:"強制確定フラグ"},
	                               {field:"updDt", displayName:"更新日時"},
	                               {field:"clientId", displayName:"荷主ID"},
	                               {field:"centerId", displayName:"センタID"},
	                               {field:"shippingInstHId", displayName:"出荷指示ヘッダID"},
	                               {field:"controlNo", displayName:"コントロールNo."},
	                               {field:"num", displayName:"行数(ヘッダ)"}
	                               ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#initScreen
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// モード設定
		$scope.screenMode = $route.current.params.mode;

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
		$scope.fromToMessage = $filter('owfMessage')(FROM_TO_MESSAGE_CD);

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタ変更の監視設定（選択内容変更時）
		$scope.centerChange = function() {
			// 運送業者リスト変更（同期処理）
//			$scope.deferredGetCarrier()
//			.then(function(response) {
//				newCarrierList = response.data;
//			});
			$scope.deferredGetCarrier();
		};

		//ページングの設定
		$scope.pagingOptions = owsCommon.getLargePagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'shippingInstList',
			columnDefs: 'ShippingInstListCols',
			pagingOptions : $scope.pagingOptions
		});

		//配送コース
		statusInfo.mappingErrorMessage($scope, "deliveryCourseCdBatch", 5, 5);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#initScreenHttp
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetTakingShippingFlg(),
				 $scope.deferredGetshippingStatus(),// 出荷ステータス
				 $scope.deferredGetnoAllcDisplayFlg(),// 未出荷全件
				 $scope.deferredGetEmergency(),// 緊急のみ
				 $scope.deferredGetCarrier(),// 運送業者
				 // [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
				 $scope.deferredGetNoStockOutFlg(),
				 // [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End
				 // [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
				 $scope.deferredGetCancelDisplayList(),
				 // [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End
				 // [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
				 $scope.deferredGetWorkMessageFlgList()
				 // [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstListt.object:ShippingInstListt#deferredGetCarrier
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 運送事業者取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrier = function () {
		var deferred = $q.defer();
		var request = {};
		//荷主センタ変更対応 2017.01.19 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.searchCondition) {
			request.centerCd = $scope.searchCondition.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 2017.01.19 sja End

		owsCommon.getDataCacheable(api.carrier, request).then(function(response){
			$scope.carrier = response.data;
			//荷主センタ変更対応 2017.01.19 sja Start
//			deferred.resolve();
			deferred.resolve(response);
			//荷主センタ変更対応 2017.01.19 sja End
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetnoAllcDisplayFlg
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 未出庫全件取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetnoAllcDisplayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_ALLC_DISPLAY_FLG";

		owsCommon.getDataCacheable(api.noAllcDisplayFlg, request).then(function(response){
			$scope.noAllcDisplayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetEmergencyFgl
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 緊急のみ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergency = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_DISPLAY";

		owsCommon.getDataCacheable(api.emergencyFlg, request).then(function(response){
			$scope.emergencyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetshippingStatus
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetshippingStatus = function () {
		var deferred = $q.defer();

		var request = {};
		// [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana Start
		request.classGrpCd = "SHIPPING_STATUS_SELECT";
		// [#303] 削除フラグ「1」のデータ整備 2016.12.02 kawana End

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 作業日/出荷日取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTakingShippingFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAKING_SHIPPING_FLG";

		owsCommon.getDataCacheable(api.takingShippingFlg, request).then(function(response){
			$scope.takingShippingFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetNoStockOutFlg
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 欠品無のみ表示/欠品有のみ表示 取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNoStockOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_STOCK_OUT_FLG";

		owsCommon.getDataCacheable(api.noStockOutFlg, request).then(function(response){
			$scope.noStockOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End

	// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetCancelDisplayList
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description キャンセルデータ表示項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCancelDisplayList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CANCEL_DATA_DISPLAY";

		owsCommon.getDataCacheable(api.cancelDisplay, request).then(function(response){
			$scope.cancelDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

	 // [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetWorkMessageFlgList
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 欠品無のみ表示/欠品有のみ表示 取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWorkMessageFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "WORK_MESSAGE_FLG";

		owsCommon.getDataCacheable(api.workMessageFlg, request).then(function(response){
			$scope.workMessageFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	 // [C-CWMS-0046] 検索条件に出庫作業メッセージ有無、出庫作業メッセージを追加 2015.08.03 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deliveryCourse
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourse = function(){
		var items = {
				// 配送コードマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.deliveryCourseCd

		};

		// 配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.searchCondition.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deliveryCourseBatch
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.deliveryCourseBatch = function(){
		//荷主センタ変更対応 201７.02.27 sja Start
		var centerCd;
		if($scope.shippingInstList &&  $scope.shippingInstList.length > 0){
			centerCd = $scope.shippingInstList[0].centerCd;
		} else {
			centerCd = $scope.searchCondition.mcenter.centerCd;
		}
		//荷主センタ変更対応 201７.02.27 sja End
		var items = {
				// 配送コードマスタ
				//荷主センタ変更対応 201７.02.27 sja Start
				//centerCd: $scope.searchCondition.mcenter.centerCd,
				centerCd: centerCd,
				//荷主センタ変更対応 201７.02.27 sja End
				// [EC-CT1-181] 配送コースCD間違いを修正 2015.04.02 kawana Start
				deliveryCourseCd: $scope.updateCondition.deliveryCourseCdBatch
				// [EC-CT1-181] 配送コースCD間違いを修正 2015.04.02 kawana End
		};

		// 配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.updateCondition.deliveryCourseCdBatch = selectedItem.deliveryCourseCd;
			$scope.updateCondition.deliveryCourseNmBatch = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
            //荷主センタ変更対応 2017.01.19 sja Start
//			request.centerId = userInfo.centerId;
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
            //荷主センタ変更対応 2017.01.19 sja End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deliveryCourseCdBlurFooter
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlurFooter = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.updateCondition.deliveryCourseCdBatch
		//荷主センタ変更対応 201７.02.27 sja Start
		var centerCd;
		if($scope.shippingInstList &&  $scope.shippingInstList.length > 0){
			centerCd = $scope.shippingInstList[0].centerCd;
		} else {
			centerCd = $scope.searchCondition.mcenter.centerCd;
		}
		//荷主センタ変更対応 201７.02.27 sja End

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
            //荷主センタ変更対応 2017.01.19 sja Start
//			request.centerId = userInfo.centerId;
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
            //荷主センタ変更対応 2017.01.19 sja End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.updateCondition.deliveryCourseNmBatch = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				if(response.data.mDeliveryCourse.deliveryCourseNm == null){
					// [#169] メッセージの重複を削除 2016.12.05 kawana Start
					optionMessageControl.show($scope, "deliveryCourseCdBatch", $filter('owfMessage')("deliveryCourseCdNotFoundError"));
					// [#169] メッセージの重複を削除 2016.12.05 kawana End
				}else{
					$scope.updateCondition.deliveryCourseNmBatch = response.data.mDeliveryCourse.deliveryCourseNm;
				}
			});

		} else {
			$scope.updateCondition.deliveryCourseNmBatch = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#customerCdBlur
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 納品先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		// 入力された納品先コードを取得
		var supplyCustomerCd = $scope.searchCondition.supplyCustomerCd;

		if(supplyCustomerCd && 0 < supplyCustomerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = supplyCustomerCd;

			$scope.searchCondition.customerNm = null;

			// 納品先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.searchCondition.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#showCustomer
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){
		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		var items = {
				// 取引先マスタ
				clientCd: $scope.searchCondition.mclient.clientCd,
				// [検査-039] パラメータの名前を修正 2014.11.24 楊寧 Start
				deliveryCd: $scope.searchCondition.supplyCustomerCd
				// [検査-039] パラメータの名前を修正 2014.11.24 楊寧 End
		};

		// 納品先CD
		var modalCustomer = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalCustomer.result.then(function(selectedItem){
			// 納品先マスタ
			$scope.searchCondition.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 出庫指示一覧データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// [SK2-056] 検索ボタンを押す前後の進捗率モードは一致。  2014.12.15 KI Start
		if ($scope.screenMode != SCREEN_MODE.Read) {
			strDIPS_FLG = 1;
		}
		// [SK2-056] 検索ボタンを押す前後の進捗率モードは一致。  2014.12.15 KI End

		api.ShippingInstList.init().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;
			$scope.updateCondition = response.data.shippingInstFooter;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;

			// [C-NIS-0007] 日付のデフォルト制御追加 2015.07.03 hayashi Start
			//日付(From)
			if(response.data.dtFromDefFlg == 1){
				$scope.searchCondition.dtFrom = userInfo.systemDt;
			}
			//日付(To)
			if(response.data.dtToDefFlg == 1){
				$scope.searchCondition.dtTo = userInfo.systemDt;
			}
			// [C-NIS-0007] 日付のデフォルト制御追加 2015.07.03 hayashi End

			$scope.searchCondition.takingShippingFlg =  owsCommon.getDefaultValue($scope.takingShippingFlgList);
			$scope.searchCondition.noAllcDisplayFlg =  owsCommon.getDefaultValue($scope.noAllcDisplayFlgList);
			$scope.searchCondition.emergencyFlg =  owsCommon.getDefaultValue($scope.emergencyFlgList);
			// [EC-CT1-004] 欠品フラグのデフォルト値は設定なしに変更(設定削除) kawana
			// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana Start
			$scope.searchCondition.cancelDisplay = owsCommon.getDefaultValue($scope.cancelDisplayList);
			// [EC-CT1-155] 検索条件にキャンセルデータ表示有無を追加 2015.03.28 kawana End

			$scope.updateCondition.workShippingDtFlg = owsCommon.getDefaultValue($scope.takingShippingFlgList);

			directiveControl.show($scope, "progressLine", false);
			directiveControl.show($scope, "progressPiece", true);

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.deliveryCourseNm = $route.current.params.deliveryCourseNm;
				if ($route.current.params.shippingDt) {
					$scope.searchCondition.takingShippingFlg = "1";
					$scope.searchCondition.dtFrom = $route.current.params.shippingDt;
					$scope.searchCondition.dtTo = $route.current.params.shippingDt;
				}else{
					$scope.searchCondition.takingShippingFlg = "0";
					$scope.searchCondition.dtFrom = $route.current.params.workDt;
					$scope.searchCondition.dtTo = $route.current.params.workDt;
				}
				$scope.searchCondition.pickingBatchNo = $route.current.params.pickingBatchNo;
				$scope.searchCondition.shippingStatus = $route.current.params.shippingStatus;
				$scope.searchCondition.emergencyFlg = $route.current.params.emergencyFlg;
				$scope.searchCondition.deliveryCourseCd = $route.current.params.deliveryCourseCd;
				$scope.searchCondition.carrierCd = $route.current.params.carrierCd;
				$scope.searchCondition.pickingWorkNo = $route.current.params.pickingWorkNo;
				$scope.searchCondition.noAllcDisplayFlg = $route.current.params.noAllcDisplayFlg;
				$scope.searchCondition.noStockOutFlg = $route.current.params.noStockOutFlg;
				$scope.searchCondition.supplyCustomerCd = $route.current.params.supplyCustomerCd;
				$scope.searchCondition.supplyCustomerNm = $route.current.params.supplyCustomerNm;
				$scope.searchCondition.clientShippingNo = $route.current.params.clientShippingNo;
				$scope.searchCondition.shippingSlipNo = $route.current.params.shippingSlipNo;

				if ($route.current.params.cancelDisplay) {
					$scope.searchCondition.cancelDisplay = $route.current.params.cancelDisplay;
				} else {
					$scope.searchCondition.cancelDisplay = "1";
				}

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
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#search
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#getPagingData
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.ShippingInstList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#setPagingData
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	var nonShippingParcentRow;
	var shippingInstedParcentRow;
	var inspectionedParcentRow;
	var shippingFixedParcentRow;
	var shippingInstedParcentPiece;
	var inspectionedParcentPiece;
	var shippingFixedParcentPiece;
	var nonShippingParcentPiece;
	var strDIPS_FLG = 0;
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-328] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-328] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// 取得したデータをグリッドに表示
		$scope.shippingInstList = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#getClassForRow
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana Start

		var shippingStopFlg = '0';
		// [ON推-品向-1202] 出荷停止の色が変わらない 2016.09.16 kawana Start
		if(row.entity.shippingStopCs == "1" ||
			row.entity.shippingStopPd == "1") {
			// 出荷停止
			// [ON推-品向-1202] 出荷停止の色が変わらない 2016.09.16 kawana End

			// 出荷停止
			shippingStopFlg = '1'
		}

		var rowInfo = {
			shippingStatus : row.entity.shippingStatus,
			shippingStopFlg : shippingStopFlg,
			emergencyFlg : row.entity.emergencyFlg,
			stockOutFlg : row.entity.stockOutFlg
		};

		return wmsShipCommon.getClassForRow(rowInfo);

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#excelOutput
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.ShippingInstList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#gridDblClick
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	$scope.gridDblClick = function(row) {
		owsCommon.syncButtonExec("productShippingList", row);
	};
	// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoShippingList.object:SlipNoShippingList#workShippingDtUpdate
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 選択行更新(日付一括変更)ボタン押下処理<br>
	 *
	 * 選択行更新(日付一括変更)処理
	 */
	$scope.workShippingDtUpdate = function() {
		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;
			request.data.shippingInstFooter = $scope.updateCondition;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkDateUpdate;
			execFunc = api.ShippingInstList.workShippingDtUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform1')) {
					return;
				}

				// 選択行更新(日付一括変更)
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform1')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SlipNoShippingList.object:SlipNoShippingList#deliveryCourseUpdate
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 選択行更新(配送コース一括変更)ボタン押下処理<br>
	 *
	 * 選択行更新(配送コース一括変更)処理
	 */
	$scope.deliveryCourseUpdate = function() {
		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;
			request.data.shippingInstFooter = $scope.updateCondition;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkDeliveryCourseUpdate;
			execFunc = api.ShippingInstList.deliveryCourseUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform2')) {
					return;
				}

				// 選択行更新(日付一括変更)
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform2')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#indicatorCancel
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 出荷指示キャンセルボタン押下処理<br>
	 *
	 * 選択行の出荷指示キャンセル処理する。
	 */
	$scope.indicatorCancel = function() {
		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkIndicatorCancel;
			execFunc = api.ShippingInstList.indicatorCancel;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行の出荷指示キャンセル処理する
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#errorDelete
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description エラーデータ削除ボタン押下処理<br>
	 *
	 * 選択行のエラーデータ削除処理する。
	 */
	$scope.errorDelete = function() {
		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;
			request.data.shippingInstFooter = $scope.updateCondition;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkErrorDelete;
			execFunc = api.ShippingInstList.errorDelete;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行のエラーデータ削除処理する。
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});
		});
	};

	// [Ver3.1][#5125]欠品クリアボタンを追加 2018.08.20 matsumoto Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#clearShortage
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description 欠品解除ボタン押下処理<br>
	 *
	 * 未出荷の出荷指示に対して欠品フラグ、欠品数をnullに更新する。
	 */
	$scope.clearShortage = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if ($scope.gridOptions.totalItems == 0)	{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 出荷ステータスチェック
		var isNotShipping = false;
		for (var i = 0; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
			//出荷ステータスが未出荷の場合エラー
			var shippingStatus = $scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatus;
			if (!(shippingStatus == "10")){
				isNotShipping = true;
			}
		}
		if (isNotShipping) {
			alertMessage.setErrorMessageByCode("clearShortageExceptNotShippingStartError");
			return;
		}

		owsCommon.syncExec(function() {

			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkClearShortage;
			execFunc = api.ShippingInstList.clearShortage;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行のエラーデータ削除処理する。
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});

		})

	};
	// [Ver3.1][#5125]欠品クリアボタンを追加 2018.08.20 matsumoto End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#errorCheck
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description エラーチェックボタン押下処理<br>
	 *
	 * 選択行のエラーチェック処理処理する。
	 */
	$scope.errorCheck = function() {
		owsCommon.syncExec(function() {
			var isError = $scope.searchform.$invalid;
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				directiveControl.firstErrorOnFocus('searchform');
				return;
			}
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;
			request.data.shippingInstFooter = $scope.updateCondition;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkErrorCheck;
			execFunc = api.ShippingInstList.errorCheck;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行のエラーデータ削除処理する。
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});

			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#indicator
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 出庫指示ボタン押下処理<br>
	 *
	 * 出庫指示処理
	 */
	$scope.indicator = function(isBatch) {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkIndicator;
		    // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana Start
			if (isBatch) {
				execFunc = api.ShippingInstList.indicatorBatch;
			} else {
				execFunc = api.ShippingInstList.indicator;
			}
		    // [C-CWMS-0066] 非同期処理化 2016.10.19 kawana End

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出庫指示処理
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#indicatorLift
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 出庫指示解除ボタン押下処理<br>
	 *
	 * 出庫指示解除処理
	 */
	$scope.indicatorLift = function() {

		var isError = $scope.searchform.$invalid;
		var isInspectioned = false;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ON推-品向-313] チェックを修正 2014/11/28 wangzs Start
		for (var i = 0; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
			//出荷ステータスがピッキング中／済または検品中／済の場合
			var shippingStatus = $scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatus;
			if (shippingStatus == "30" ||
					shippingStatus == "35" ||
					shippingStatus == "40" ||
					shippingStatus == "45" ||
					shippingStatus == "50"){
				isInspectioned = true;
			}
		}
		if(isInspectioned){
			if (!owsCommon.viewConfirm("pickingInstCancelExistedWorkingStateConfirmation")) {
				return;
			}
		}
		// [ON推-品向-313] チェックを修正 2014/11/28 wangzs End

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkIndicatingLift;
			execFunc = api.ShippingInstList.indicatorLift;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if(checkResponse == "1"){
					if(!isInspectioned){
						if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
							return;
						}
					}
				}else if(checkResponse == "2"){
					if(!isInspectioned){
						if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
							return;
						}
					}
					if (!owsCommon.viewConfirm("workOrderCancelConfirmation")) {
						return;
					}
				}
				// [ON推-品向-313] チェックを修正 2014/11/28 楊寧 Start
				else{
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
						return;
					}
				}
				// [ON推-品向-313] チェックを修正 2014/11/28 楊寧 End

				// 出庫指示解除処理
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};

	// [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#pieceShippingInspectCancel
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 出荷検品解除ボタン押下処理<br>
	 *
	 * 出荷検品解除処理
	 */
	$scope.pieceShippingInspectCancel = function() {

		var isError = $scope.searchform.$invalid;
		var isInspectting = false;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		for (var i = 0; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {
			//出荷ステータスが出荷検品中の場合
			var shippingStatus = $scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatus;
			if (shippingStatus == "40"){
				isInspectting = true;
			}
		}
		if(isInspectting){
			if (!owsCommon.viewConfirm("pieceShippingInspectCancelExistedInspectStateConfirmation")) {
				return;
			}
		}
		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkpieceShippingInspectCancel;
			execFunc = api.ShippingInstList.pieceShippingInspectCancel;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// 処理結果確認
				if(checkResponse == "1"){
					if(!isInspectting){
						if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
							return;
						}
					}
				}else if(checkResponse == "2"){
					if(!isInspectting){
						if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
							return;
						}
					}
					if (!owsCommon.viewConfirm("pieceShippingInspectCancelConfirmation")) {
						return;
					}
				}
				else{
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
						return;
					}
				}

				// 出荷検品解除処理
				execFunc(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};
	// [C-CWMS-0019] 出荷検品解除機能を追加 2015/03/23 kyo End

	// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#productShippingList
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 商品別出荷一覧ボタン押下処理<br>
	 *
	 * 商品別出荷一覧処理。
	 */
	$scope.productShippingList = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// 商品別出荷一覧画面へ遷移
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		$location.path("wms/shipping/ProductShippingList").search({})
		.search("mode", SCREEN_MODE.Update)
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
		// [#921] 出庫指示一覧で選択したデータが商品別出荷一覧で表示されない不具合を修正(不要な引継項目を削除) 2017.01.30 kawana
        //荷主センタ変更対応 2017.01.19 sja Start
//		.search("clientCd",$scope.searchCondition.mclient.clientCd)
//		.search("centerCd",$scope.searchCondition.mcenter.centerCd)
		.search("clientCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
		.search("centerCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
        //荷主センタ変更対応 2017.01.19 sja End
		.search("shippingSlipNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingSlipNo)
		// [#921] 出庫指示一覧で選択したデータが商品別出荷一覧で表示されない不具合を修正 2017.01.30 kawana Start
		// 作業日で検索するように設定
		.search("takingShippingFlg", "0")
		// [#921] 出庫指示一覧で選択したデータが商品別出荷一覧で表示されない不具合を修正 2017.01.30 kawana End
		.search("workDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].workDt)
		.search("shippingDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingDt)
		// [ON推-品向-127] パラメータを追加 2014.11.21 楊寧 Start
		.search("deliveryCourseCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].deliveryCourseCd)
		.search("deliveryCourseNm", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].deliveryCourseNm)
		.search("carrierCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierCd)
		.search("pickingBatchNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingBatchNo)
		.search("supplyCustomerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].supplyCustomerCd)
		// [C-EC-010] 引数の納品先名称をCDに合わせた変数名に変更 2015.01.29 kawana Start
		.search("supplyCustomerNm", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].customerNm)
		// [C-EC-010] 引数の納品先名称をCDに合わせた変数名に変更 2015.01.29 kawana End
		.search("clientShippingNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientShippingNo)
		.search("pickingWorkNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingWorkNo);
		// [1.1.4-CT-071] 商品別出荷一覧へ遷移した時の検索条件から出荷ステータスを削除 2016.06.02 kawana
		// [ON推-品向-127] パラメータを追加 2014.11.21 楊寧 End
	};
	// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#pickingListPrint
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * ピッキングリスト発行ボタン押下処理<br>
	 *
	 * ピッキングリスト発行処理。
	 */
	$scope.pickingListPrint = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// 未出荷の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingWorkNo == null) {
			alertMessage.setErrorMessageByCode("notShippingDataCannotTransitionError");
			return;
		}

		//ピッキングリスト発行画面へ遷移
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		$location.path("wms/shipping/PickingListPrint").search({})
		.search("mode", SCREEN_MODE.Update)
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
        //荷主センタ変更対応 2017.01.19 sja Start
//		.search("clientCd",$scope.searchCondition.mclient.clientCd)
//		.search("centerCd",$scope.searchCondition.mcenter.centerCd)
		.search("clientCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
		.search("centerCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
        //荷主センタ変更対応 2017.01.19 sja End
		.search("workDt", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].workDt)
		.search("pickingBatchNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingBatchNo)
		// [#5646] ピッキングリスト発行画面へ遷移する際に作業No.を引継ぐ様に修正 2018.12.07 tanaka Start
		.search("pickingWorkNo", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingWorkNo)
		// [#5646] ピッキングリスト発行画面へ遷移する際に作業No.を引継ぐ様に修正 2017.12.07 tanaka End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingInstList.object:ShippingInstList#shippingWorkRefUpdate
	 * @methodOf oneslogiWms.ShippingInstList.object:ShippingInstList
	 *
	 * @description
	 * 出庫作業メッセージ登録ボタン押下処理<br>
	 *
	 * 出庫作業メッセージ登録処理。
	 */
	$scope.shippingWorkRefUpdate = function() {

		var isError = $scope.searchform.$invalid;
		// エラーがある場合、フォーカスを当てる
		if (isError) {
			directiveControl.firstErrorOnFocus('searchform');
			return;
		}
		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [検査-043] 「出荷確定済」または「キャンセル」の行が選択されている場合、チェックを追加 2014.11.24 楊寧 Start

		// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana Start
		// 現在の出庫作業メッセージセット
		var messageSet = new Set();
		// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana End

		for (var i = 0; i < $scope.gridOptions.gridApi.selection.getSelectedRows().length; i++) {

			//出荷ステータスが出荷確定済の場合
			// [検査-043]と[検査-149] 判断処理を修正 2014.11.28 楊寧 Start
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatus == "55"){
				// [検査-043]と[検査-149] 判断処理を修正 2014.11.28 楊寧 End
				alertMessage.setErrorMessageByCode("foundShipCompletedError");
				return;
			}
			//出荷ステータスがキャンセルの場合
			// [検査-043]と[検査-149] 判断処理を修正 2014.11.28 楊寧 Start
			else if ($scope.gridOptions.gridApi.selection.getSelectedRows()[i].shippingStatus == "90"){
				// [検査-043]と[検査-149] 判断処理を修正 2014.11.28 楊寧 End
				alertMessage.setErrorMessageByCode("cannotExecuteCancelDataIncludedError");
				return;
			}

			// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana Start
			// 現在の出庫作業メッセージを取得
			if (1 == $scope.gridOptions.gridApi.selection.getSelectedRows()[i].pickingWorkMessageCount) {
				// 1件
				messageSet.add($scope.gridOptions.gridApi.selection.getSelectedRows()[i].pickingWorkMessage);
			} else if (1 < $scope.gridOptions.gridApi.selection.getSelectedRows()[i].pickingWorkMessageCount) {
				// 2件以上

				var messageList = $scope.gridOptions.gridApi.selection.getSelectedRows()[i].pickingWorkMessage.replace(new RegExp("\\[","g"),"").split("]");
				for (var key in messageList) {
					var message = messageList[key];
					if (message && 0 < message.length) {
						messageSet.add(message);
					}
				}
			}
			// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana End
		}
		// [検査-043] 「出荷確定済」または「キャンセル」の行が選択されている場合、チェックを追加 2014.11.24 楊寧 End

		// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana Start
		// メッセージ複数判定
		var multiple = false;
		// 表示するメッセージを作成
		var message = "";
		if (messageSet.size != 0) {
			if (messageSet.size == 1) {
				messageSet.forEach(function(value) {
					message = value;
				});
			} else {
				multiple = true;
				messageSet.forEach(function(value) {
					message = message + "[" + value + "]";
				});
			}
		}
		// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana End

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			var listBody = $scope.gridOptions.gridApi.selection.getSelectedRows();

			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = listBody;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			checkFunc = api.ShippingInstList.checkShippingWorkRefUpdate;
			execFunc = api.ShippingInstList.shippingWorkRefUpdate;

			successFunc = function(){
				$scope.search();
			}

			// 入力チェック
			checkFunc(request).then(function(checkResponse){

				// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana Start
				if (multiple) {
					// 複数メッセージ上書き確認
					if (!owsCommon.viewConfirm("pickingWorkMessageUpdateMultipleOverwriteConfirm")) {
						return;
					}
				}
				// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana End

				var items = {
						// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana Start
						messageNm: message
						// [#5772][v3.1] 出庫作業メッセージが複数ある場合は確認ダイアログを表示 2018.12.14 kawana End
				};

				// 出庫作業メッセージ登録
				var modalInstance = modalFactory.modalMessage(items);

				// モーダル画面が閉じられたら呼ばれるファンクションの登録
				modalInstance.result.then(function(selectedItem){
					// 出庫作業メッセージ登録
					request.data.message = selectedItem;

					// 出庫作業メッセージ登録処理
					execFunc(request).then(function(execResponse){

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
							return;
						}

						// 完了後の処理
						successFunc(execResponse);
					});
				});
			});
		});
	};

	$scope.isOpenBulkDate = false;
	$scope.isOpenBulkCourse = false;

	$scope.openBulkDate = function() {
		$scope.isOpenBulkDate = true;
		$scope.isOpenBulkCourse = false;
		owsCommon.syncExec(function() {
			var p = $("#footerBulkDate").offset().top;
			$('html,body').animate({ scrollTop: p }, 'slow');
		});
	}

	$scope.openBulkCourse = function() {
		$scope.isOpenBulkDate = false;
		$scope.isOpenBulkCourse = true;
		owsCommon.syncExec(function() {
			var p = $("#footerBulkCourse").offset().top;
			$('html,body').animate({ scrollTop: p }, 'slow');
		});
	}

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
