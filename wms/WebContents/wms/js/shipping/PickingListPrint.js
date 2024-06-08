/**
 * @ngdoc overview
 * @name oneslogiWms.PickingListPrint
 *
 * @description ピッキングリスト発行画面<br>
 *
 * ピッキングリスト発行表示する画面。
 *
 */
angular.module('oneslogiWms.PickingListPrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PickingListPrint.service:PickingListPrintApi
 *
 * @description ピッキングリスト発行画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/shipping/PickingListPrint/initNormal 初期データ取得(通常)WebAPI<br>
 * ・resources/shipping/PickingListPrint/search 検索結果取得WebAPI<br>
 * ・resources/shipping/PickingListPrint/print発行ボタンを押下された時に処理WebAPI<br>
 * ・resources/shipping/PickingListPrint/getReportId レポトIDの取得WebAPI<br>
 */
.factory('PickingListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {

		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		),
		takingShippingFlg: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		picListCls1: AngularAPIClient.make([
		                                    // [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana Start
		                                    ['query', 'GET', 'resources/shipping/pickingListPrint/picListCls1KeyValueList'],
		                                    // [ON推-品向-1174] ケースピッキング有無の切替機能を追加 2016.07.14 kawana End
											// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		                                    ['queryCase', 'GET', 'resources/shipping/pickingListPrint/picListCls1CaseKeyValueList']
											// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
		                                    ]
		),

		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.20 miyabe Start
		picListCls2: AngularAPIClient.make([
		                                    ['query', 'GET', 'resources/common/centerClass/centerKeyValueList']
		                                    ]
		),
		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
		picListCls3: AngularAPIClient.make([
		                                    ['query', 'GET', 'resources/common/centerClass/centerKeyValueList']
		                                    ]
		),
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.20 miyabe Start

		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End
		picCls: AngularAPIClient.make([
										//[#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
										['query', 'GET', 'resources/shipping/pickingListPrint/picClsKeyValueList']
										//[#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
		                               ]
		),
		listOutKbn: AngularAPIClient.make([
		                                   ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                   ]
		),
		shippingStatus: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
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
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
		noStockOutFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End
		// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa Start
		deliveryCourseCd: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		deliveryCourse: AngularAPIClient.make([
		                                       ['record', 'GET', 'resources/common/deliveryCourse/record']
		                                       ]
		),
		// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa End
		//[Ver3.1][#5129] 検索条件にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add Start
		casePicFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		sglRowPicFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		//[Ver3.1][#5129] 検索条件にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add End
		pickingListPrint: AngularAPIClient.make([
		                                           ['initNormal',   'GET', 'resources/shipping/pickingListPrint/initNormal'],
		                                           ['search', 'GET', 'resources/shipping/pickingListPrint/search'],
		                                           ['print', 'GET', 'resources/shipping/pickingListPrint/print'],
		                                           ['getReportId', 'GET', 'resources/shipping/pickingListPrint/getReportId'],
		                                           ['excel',  'GET', 'resources/shipping/pickingListPrint/search', 'excel'],
		                                           // [Ver3.1][#5127]発行解除処理を追加 2018.08.28 matsumoto/kawana Start
		                                           ['clearIssue', 'POST', 'resources/shipping/pickingListPrint/clearIssue'],
		                                           ['checkClearIssue', 'POST', 'resources/shipping/pickingListPrint/checkClearIssue']
		                                           // [Ver3.1][#5127]発行解除処理を追加 2018.08.28 matsumoto/kawana End
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PickingListPrint.object:PickingListPrint
 *
 * @description ピッキングリスト発行画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PickingListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'PickingListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.pickingListPrintCols = [
	                                 {field:"PickingBatchNo", displayName:"出庫指示バッチNo."},
	                                 {field:"supplyCustomerCd", displayName:"納品先CD"},
	                                 {field:"supplyCustomerNm", displayName:"納品先名称"},
	                                 // [ON推-品向-1029] 配送コースCD、名称を検索結果に追加 2015.12.03 ichikawa Start
	                                 {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                 {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                 // [ON推-品向-1029] 配送コースCD、名称を検索結果に追加 2015.12.03 ichikawa End
	                                 {field:"pickingWorkNo", displayName:"出庫作業No."},
	                                 {field:"shippingSlipNo", displayName:"伝票枚数"},
	                                 {field:"allocInstBId", displayName:"行数"},
	                                 {field:"productId", displayName:"アイテム数"},
	                                 {field:"pickingNum", displayName:"総ピース数"},
	                                 {field:"CASE_CNT", displayName:"ケース数"},
	                                 {field:"PIECE_CNT", displayName:"ピース数"},
	                                 {field:"tplOutFlg", displayName:"トータルピッキングリスト出力フラグ"},
	                                 {field:"oplOutFlg", displayName:"オーダーピッキングリスト出力フラグ"},
	                                 {field:"pl1OutDt", displayName:"１次ピッキングリスト出力日時"},
	                                 {field:"slOutFlg", displayName:"種蒔きリスト出力フラグ"},
	                                 {field:"plOutFlg", displayName:"摘み取りリスト出力フラグ"},
	                                 {field:"pl2OutDt", displayName:"２次ピッキングリスト出力日時"},
	                                 {field:"pickingGroupNo", displayName:"ピッキンググループNo."},
	                                 {field:"seedingNo", displayName:"種蒔きNo."},
	                    		     {field:"clientCd", displayName:"荷主CD"},
	                    		     {field:"clientNm", displayName:"荷主名称"},
	                     		     {field:"centerCd", displayName:"センタCD"},
	                    		     {field:"centerNm", displayName:"センタ名称"}
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#initScreen
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// 日付大小チェック
		$scope.fromToCheck = function(fromValue, toValue) {
			var fromValueString = owsCommon.dateToString(fromValue);
			var toValueString = owsCommon.dateToString(toValue);
			if (fromValueString > toValueString) {
				return false;
			}
			return true;
		};
		// 日付大小チェック用メッセージ
		$scope.fromToMessage = $filter('owfMessage')("inputLimitCheckReversalError");

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// [EC-CT1-087] ページングなしに変更 2015.03.03 kawana Start
		// ページングの設定(ページングなし)
		$scope.pagingOptions = {
			pageSizes: [0],
			pageSize: 0,
			currentPage: 1
		};
		// [EC-CT1-087] ページングをなしに変更 2015.03.03 kawana End

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		//[#5133][v3.1] リスト発行区分にケースピッキングを追加(不要な処理 $scope.picClsFocus, $scope.picClsChange を削除) 2018.08.27 kawana Delete

		// 荷主センタ変更対応 2017.05.18 不要なソースを削除 kawana

		// [EC-CT1-087] ページングなしに変更 2015.03.03 kawana Start
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'pickingListPrintB',
			columnDefs: 'pickingListPrintCols'
			// [#162][2.1.0-CT-017] 複数行をチェックするとJavaScriptsエラー発生。不要なコードのため削除 2016.11.01 kawana
			// ※ 同じ出庫作業No.の行を自動的にチェックする処理があったが、現在は同じ出庫作業No.が複数行に分かれることはないため削除
		});
		// [EC-CT1-087] ページングをなしに変更 2015.03.03 kawana End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#initScreenHttp
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
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
				 $scope.deferredGetPicCls(), //リスト発行区分
				 $scope.deferredGetListOutKbn(), //発行区分
				 $scope.deferredGetEmergency(),// 緊急のみ
				 $scope.deferredGetPicListCls1(), //リスト発行区分(一次ピッキング)
				 $scope.deferredGetPicListCls2(),//リスト発行区分(二次ピッキング)
				 //Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
				 $scope.deferredGetPicListCls3(),//リスト発行区分(送り状・荷札)
				 //Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End
				 // [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
				 $scope.deferredGetNoStockOutFlg(),//欠品有無のみ
				 // [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End
				//[Ver3.1][#5129] 検索条件にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add Start
				 $scope.deferredGetSglRowPicFlg(),//単行ピッキング対象
				 $scope.deferredGetCasePicFlg()//ケースピッキング対象
				//[Ver3.1][#5129] 検索条件にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetEmergency
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
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
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetTakingShippingFlg
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetPicCls
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description リスト発行区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPicCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PIC_CLS";

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

		if ($scope.searchCondition) {

			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
		} else {

			request.centerId = userInfo.centerId;
			request.clientId = userInfo.clientId;
		}

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

		owsCommon.getDataCacheable(api.picCls, request).then(function(response){
			$scope.picClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetListOutKbn
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 発行区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetListOutKbn = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		owsCommon.getDataCacheable(api.listOutKbn, request).then(function(response){
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			$scope.listOutKbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
	var picListCls1SelectValue;
	var picListCls1SelectList;
	var picListClsCaseSelectList;
	// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetPicListCls1
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description リスト発行区分(一次ピッキング)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPicListCls1 = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PIC_LIST_CLS1";
		//荷主センタ変更対応 2017.03.13 sja Start
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerId;
		}
		if ($scope.searchCondition) {
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
		} else {
			request.clientId = userInfo.clientId;
		}
		//荷主センタ変更対応 2017.03.13 sja End
		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		owsCommon.getDataCacheable(api.picListCls1, "query", request).then(function(response){
			picListCls1SelectList = response.data;
			$scope.picListCls1List = picListCls1SelectList;
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			deferred.resolve();
		});

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

		owsCommon.getDataCacheable(api.picListCls1, "queryCase", request).then(function(response){
			picListClsCaseSelectList = response.data;
		});

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

		return deferred.promise;
	};

	//荷主センタ変更対応 2017.05.18 sja Start
	$scope.centerChange = function() {
		// [#1861][Ver2.2.0] ピッキングリスト発行画面 - 検索条件.センタ、または検索条件.荷主を空欄選択時にエラー発生への対応 2017.06.01 honma Mod Start
		var centerCd = $scope.searchCondition.mcenter.centerCd;
		var clientCd = $scope.searchCondition.mclient.clientCd;

		if (isNullOrUndefined(centerCd) || isNullOrUndefined(clientCd)) {
			// 検索条件で選択されたセンタまたは荷主が空白の場合、リスト発行区分(一次ピッキング)(二次ピッキング)(送り状・荷札)を空にする
			$scope.picListCls1List = [];
			$scope.footer.picListCls1 = null;
			$scope.picListCls2List = [];
			$scope.footer.picListCls2 = null;
			$scope.picListCls3List = [];
			$scope.footer.picListCls3 = null;
		} else {
			$scope.deferredGetPicListCls1()
			.then(function(responce){
				if ($scope.picListCls1List.length > 0) {
					// 取得したリスト発行区分(一次ピッキング)データが存在する場合、デフォルト値を初期表示値として設定
					$scope.footer.picListCls1 = owsCommon.getDefaultValue($scope.picListCls1List);
				}
			});
			$scope.deferredGetPicListCls2()
			.then(function(responce){
				if ($scope.picListCls2List.length > 0) {
					// 取得したリスト発行区分(二次ピッキング)データが存在する場合、デフォルト値を初期表示値として設定
					$scope.footer.picListCls2 = owsCommon.getDefaultValue($scope.picListCls2List);
				}
			});
			$scope.deferredGetPicListCls3()
			.then(function(responce){
				if ($scope.picListCls3List.length > 0) {
					// 取得したリスト発行区分(送り状・荷札)データが存在する場合、デフォルト値を初期表示値として設定
					$scope.footer.picListCls3 = owsCommon.getDefaultValue($scope.picListCls3List);
				}
			});
		}
		// [#1861][Ver2.2.0] ピッキングリスト発行画面 - 検索条件.センタ、または検索条件.荷主を空欄選択時にエラー発生への対応 2017.06.01 honma Mod End
	};

	$scope.clientChange = function() {
		// [#1861][Ver2.2.0] ピッキングリスト発行画面 - 検索条件.センタ、または検索条件.荷主を空欄選択時にエラー発生への対応 2017.06.01 honma Mod Start
		var centerCd = $scope.searchCondition.mcenter.centerCd;
		var clientCd = $scope.searchCondition.mclient.clientCd;

		if (isNullOrUndefined(centerCd) || isNullOrUndefined(clientCd)) {
			// 検索条件で選択されたセンタまたは荷主が空白の場合、リスト発行区分(一次ピッキング)(二次ピッキング)(送り状・荷札)を空にする
			$scope.picListCls1List = [];
			$scope.footer.picListCls1 = null;
			$scope.picListCls2List = [];
			$scope.footer.picListCls2 = null;
			$scope.picListCls3List = [];
			$scope.footer.picListCls3 = null;
		} else {
			$scope.deferredGetPicListCls1()
			.then(function(responce){
				if ($scope.picListCls1List.length > 0) {
					// 取得したリスト発行区分(一次ピッキング)データが存在する場合、デフォルト値を初期表示値として設定
					$scope.footer.picListCls1 = owsCommon.getDefaultValue($scope.picListCls1List);
				}
			});
			$scope.deferredGetPicListCls2()
			.then(function(responce){
				if ($scope.picListCls2List.length > 0) {
					// 取得したリスト発行区分(二次ピッキング)データが存在する場合、デフォルト値を初期表示値として設定
					$scope.footer.picListCls2 = owsCommon.getDefaultValue($scope.picListCls2List);
				}
			});
			$scope.deferredGetPicListCls3()
			.then(function(responce){
				if ($scope.picListCls3List.length > 0) {
					// 取得したリスト発行区分(送り状・荷札)データが存在する場合、デフォルト値を初期表示値として設定
					$scope.footer.picListCls3 = owsCommon.getDefaultValue($scope.picListCls3List);
				}
			});
		}
		// [#1861][Ver2.2.0] ピッキングリスト発行画面 - 検索条件.センタ、または検索条件.荷主を空欄選択時にエラー発生への対応 2017.06.01 honma Mod End
	};

	//荷主センタ変更対応 2017.05.18 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetPicListCls2
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description リスト発行区分(二次ピッキング)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPicListCls2 = function () {
		var deferred = $q.defer();

		var request = {};
		//荷主センタ変更対応 201７.02.17 sja Start
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}
		//荷主センタ変更対応 201７.02.17 sja End
		request.classCd = "PIC_LIST_CLS2";

		owsCommon.getDataCacheable(api.picListCls2, request).then(function(response){
			$scope.picListCls2List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
    // Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetPicListCls3
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description リスト発行区分(送り状・荷札)取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPicListCls3 = function () {
		var deferred = $q.defer();

		var request = {};
		//荷主センタ変更対応 201７.02.17 sja Start
		if ($scope.searchCondition) {
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		}
		//荷主センタ変更対応 201７.02.17 sja End
		request.classCd = "PIC_LIST_CLS3";

		owsCommon.getDataCacheable(api.picListCls3, request).then(function(response){
			$scope.picListCls3List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrintt#deferredGetNoStockOutFlg
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
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
	// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#showCustomer
	 * @methodOf oneslogiWms.ReceivePlanInput.object:deliveryCourse
	 *
	 * @description 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showVendor = function(){

		//納品先のモーダル画面を表示
		var items = {
				clientCd: $scope.searchCondition.mclient.clientCd,
				deliveryCd: $scope.searchCondition.tallocInstH.supplyCustomerCd
		};
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.tallocInstH.supplyCustomerCd = selectedItem.customerCd;
			$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = selectedItem.customerNm;
		});
	};


	//[Ver3.1][#5129] 検索条件にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetCasePicFlg
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description ケースピックフラグ 取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCasePicFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CASE_PIC_TARGET";
		owsCommon.getDataCacheable(api.casePicFlg, request).then(function(response){
			$scope.casePicFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetSglRowPicFlg
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 単行ピックフラグ 取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSglRowPicFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SGL_ROW_PIC_TARGET";
		owsCommon.getDataCacheable(api.sglRowPicFlg, request).then(function(response){
			$scope.sglRowPicFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//[Ver3.1][#5129] 検索条件にケースピックフラグ、単行ピックフラグ追加 2018.09.20 miyabe add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#customerCdBlur
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された納品先コードを取得
		var customerCd = $scope.searchCondition.tallocInstH.supplyCustomerCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);
			request.customerCd = customerCd;

			// 納品先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.searchCondition.tallocInstH.mcustomerBySupplyCustomerId.customerNm = null;
		}
	};

	// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deliveryCourse
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
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
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
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
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe Start
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			// [#1884] [1.33 品質向上対応]  ロストフォーカス時の不具合対応 2017.06.06 miyabe End
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
	// [ON推-品向-1029] 配送コースCD検索条件追加 2015.11.30 ichikawa End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#deferredGetInitData
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description ピッキングリスト発行データを取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.pickingListPrint.initNormal().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;
			$scope.footer = response.data.footer;
			$scope.pickingListPrintB = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.takingShippingFlg =  owsCommon.getDefaultValue($scope.takingShippingFlgList);
			$scope.searchCondition.picCls = owsCommon.getDefaultValue($scope.picClsList);
			// [ON推-品向-1130] 発行状況の初期値の設定を下部に移動 2016.04.22 ichikawa
			$scope.searchCondition.emergencyFlg =  owsCommon.getDefaultValue($scope.emergencyFlgList);
			// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata Start
			// [ON推-品向-1130] 欠品フラグの初期値の設定を下部に移動 2016.04.22 ichikawa
			// [C-EC-004] 欠品有無のみ検索条件追加 2015.1.27 Sakata End
			$scope.searchCondition.dtFrom = userInfo.systemDt;
			$scope.searchCondition.dtTo = userInfo.systemDt;
			$scope.footer.picListCls1 = owsCommon.getDefaultValue($scope.picListCls1List);
			$scope.footer.picListCls2 = owsCommon.getDefaultValue($scope.picListCls2List);
			//Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
			$scope.footer.picListCls3 = owsCommon.getDefaultValue($scope.picListCls3List);
			//Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End

			// リスト発行区分変更後処理
			$scope.changePicCls();

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Update) {
				$scope.searchCondition.dtFrom = $route.current.params.workDt;
				$scope.searchCondition.dtTo = $route.current.params.workDt;
				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.pickingBatchNo = $route.current.params.pickingBatchNo;
				// [#5646] ピッキングリスト発行画面へ遷移する際に作業No.を引継ぐ様に修正 2018.12.07 tanaka Start
				$scope.searchCondition.pickingWorkNo = $route.current.params.pickingWorkNo;
				// [#5646] ピッキングリスト発行画面へ遷移する際に作業No.を引継ぐ様に修正 2018.12.07 tanaka End
				// [ON推-品向-1130] 発行状況の初期値の設定を変更 2016.04.22 ichikawa Start
				$scope.searchCondition.listOutKbn =  "2";
				// [ON推-品向-1130] 発行状況の初期値の設定を変更 2016.04.22 ichikawa End

				// [#1794] ピッキングリスト発行リストにマルチピッキングリストが表示されない問題を修正 2017.05.22 kawana Start
				$scope.centerChange();
				$scope.clientChange();
				// [#1794] ピッキングリスト発行リストにマルチピッキングリストが表示されない問題を修正 2017.05.22 kawana End
				$scope.search();
			} else {
				// [ON推-品向-1130] 発行状況/欠品フラグの初期値の設定を変更 2016.04.22 ichikawa Start
				$scope.searchCondition.listOutKbn =  owsCommon.getDefaultValue($scope.listOutKbnList);
				$scope.searchCondition.noStockOutFlg =  owsCommon.getDefaultValue($scope.noStockOutFlgList);
				// [ON推-品向-1130] 発行状況/欠品フラグの初期値の設定を変更 2016.04.22 ichikawa End
			}
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#changePicCls
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * リスト発行区分変更後処理<br>
	 *
	 * リスト発行区分の選択変更された場合、リスト発行区分(一次ピッキング)、リスト発行区分(二次ピッキング)リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changePicCls = function() {

		// リスト発行区分(一次ピッキング)、リスト発行区分(二次ピッキング)を設定する（同期処理）
		if ($scope.searchCondition.picCls == '1') {
			directiveControl.editable($scope, 'picListCls1', true);
			directiveControl.editable($scope, 'picListCls2', false);
			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
			directiveControl.editable($scope, 'picListCls3', false);
			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End
		}

		// リスト発行区分ドロップダウンリストが"二次ピッキング"を選択されたの場合
		if ($scope.searchCondition.picCls == '2') {
			directiveControl.editable($scope, 'picListCls1', false);
			directiveControl.editable($scope, 'picListCls2', true);
			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
			directiveControl.editable($scope, 'picListCls3', false);
			// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA End
		}

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start

		if ($scope.searchCondition.picCls == '3') {
			directiveControl.editable($scope, 'picListCls1', true);
			directiveControl.editable($scope, 'picListCls2', false);
			directiveControl.editable($scope, 'picListCls3', false);

			// [#5524][v3.1] リスト発行区分を退避する条件を追加 2018.11.05 tanaka Start
			if ($scope.footer.picListCls1 && $scope.footer.picListCls1 != '4') {
				// 変更前の値を退避
				picListCls1SelectValue = $scope.footer.picListCls1;
			}
			// [#5524][v3.1] リスト発行区分を退避する条件を追加 2018.11.05 tanaka End

			// ケースピッキングのみのリストに差替
			$scope.picListCls1List = picListClsCaseSelectList;
			// ケースピッキングリストを選択
			$scope.footer.picListCls1 = '4';
		} else {
			// 通常のリストに差替
			$scope.picListCls1List = picListCls1SelectList;
			if ($scope.footer.picListCls1 == null || $scope.footer.picListCls1 == '4') {
				// 変更前の値を選択
				$scope.footer.picListCls1 = picListCls1SelectValue;
			}
		}

		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End

		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
		// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		// リスト発行区分ドロップダウンリストが"送り状・荷札"を選択されたの場合
		if ($scope.searchCondition.picCls == '4') {
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			directiveControl.editable($scope, 'picListCls1', false);
			directiveControl.editable($scope, 'picListCls2', false);
			directiveControl.editable($scope, 'picListCls3', true);
		}
		// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/07/14 SJA Start
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#search
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		// リスト発行区分変更後処理
		$scope.changePicCls();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#getPagingData
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.getPagingData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.pickingListPrint.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#setPagingData
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-332] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-332] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// 取得したデータをグリッドに表示
		$scope.pickingListPrintB = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#getClassForRow
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		var color;
		if (row.entity.emergencyFlg == "1") {//緊急
			color = "wmslegendcolorred";
		}else if (row.entity.stockOutFlg == "1") {//欠品
			color = "wmslegendblue";
		}
		return color;
	};

	// [Ver3.1][#5127]発行解除処理を追加 2018.08.28 matsumoto/kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:ReceiveInputNo#clearIssue
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 発行解除ボタン押下処理<br>
	 *
	 * ピッキンググループNo.をnullに更新する。
	 */
	$scope.clearIssue = function() {

		//明細が表示されていない場合
		if($scope.pickingListPrintB.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		//明細が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);

		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// 発行解除処理(確認)実行
		api.pickingListPrint.checkClearIssue(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				return
			}

			// 発行解除処理実行
			api.pickingListPrint.clearIssue(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					return
				}

				// 完了後の処理
				$scope.search();
			});
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:ReceiveInputNo#disabledClearIssue
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 発行解除ボタン押下不可確認<br>
	 * <br>
	 * true : 押下不可 , false : 押下可<br>
	 */
	$scope.disabledClearIssue = function() {

		if (!$scope.gridOptions.gridApi.selection.getSelectedRows().length) {
			// 行選択
			return true;
		}

		if (!$scope.searchCondition) {
			return true;
		}

		if (!$scope.searchCondition.picCls) {
			return true;
		}

		if ($scope.searchCondition.picCls == '4') {
			// 発行区分：送り状・荷札
			return true;
		}

		false;
	}

	// [Ver3.1][#5127]発行解除処理を追加 2018.08.28 matsumoto/kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:ReceiveInputNo#register
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	$scope.issue = function() {

		//明細が表示されていない場合
		if($scope.pickingListPrintB.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		//明細が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);

		// 発行
		var printNum;
		var reportId;
		var requestReport = {};
		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc Start
		requestReport.data = {};
		requestReport.data.head = $scope.searchCondition;
		requestReport.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		requestReport.data.footer  = $scope.footer;
		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc End
		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第3回対応 2014.11.27 fengc Start
		requestReport.data.head.reportCd = "OrderPickingList";
		if ($scope.searchCondition.picCls == '1' && $scope.footer.picListCls1 == '0'){
			requestReport.data.head.reportCd = "OrderPickingList";
		}else if ($scope.searchCondition.picCls == '1' && $scope.footer.picListCls1 == '1') {
			requestReport.data.head.reportCd = "TotalPickingList";
			// [エンハンス PH2.0] ケースピッキングリストを追加 2015.12.08 sja Start
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana Start
		}else if ($scope.searchCondition.picCls == '3' && $scope.footer.picListCls1 == '4') {
			// [#5133][v3.1] リスト発行区分にケースピッキングを追加 2018.08.27 kawana End
			requestReport.data.head.reportCd = "CasePickingList";
			// [エンハンス PH2.0] ケースピッキングリストを追加 2015.12.08 sja End
			// [エンハンス PH2.0] マルチピッキングリストを追加 2015.12.24 sja Start
		}else if ($scope.searchCondition.picCls == '1' && $scope.footer.picListCls1 == '5') {
			requestReport.data.head.reportCd = "MultiPickingList";
			// [エンハンス PH2.0] マルチピッキングリストを追加 2015.12.24 sja End
			// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana Start
		}else if ($scope.searchCondition.picCls == '1' && $scope.footer.picListCls1 == '6') {
			requestReport.data.head.reportCd = "SingleRowPickingList";
			// [#5114][v3.1] 単行ピッキングリスト作成 2018.08.02 kawana End
		}else if ($scope.searchCondition.picCls == '2' && $scope.footer.picListCls2 == '2') {
			requestReport.data.head.reportCd = "PLPickingList";

		}else if ($scope.searchCondition.picCls == '2' && $scope.footer.picListCls2 == '3') {
			requestReport.data.head.reportCd = "SLPickingList";
		}
		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第3回対応 2014.11.27 fengc End

		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc Start
		requestReport.data.head.isMessageOutPutFlg = "0";
		var flag = false;
		for (var row = 0; row < requestReport.data.list.length; row++) {
			var warehouseCd = requestReport.data.list[row].warehouseCd;
			var pickingWorkNo = requestReport.data.list[row].pickingWorkNo;
			for (var i = row+1; i < requestReport.data.list.length; i++) {
				if (requestReport.data.list[i].warehouseCd !== warehouseCd && requestReport.data.list[i].pickingWorkNo == pickingWorkNo){
					requestReport.data.head.isMessageOutPutFlg = "1";
					flag = true;
				}
			}
		}

		if (flag) {
			if (!owsCommon.viewConfirm("pickingListPrintMultipleWarehouseConfirmation")) {
				return;
			}
		}
		// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc End

		api.pickingListPrint.getReportId(requestReport).then(function(response){
			// [ON推-品向-483] データ未存在のエラーを表示します。 2014.12.24 KI Start
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				return
			}
			// [ON推-品向-483] データ未存在のエラーを表示します。 2014.12.24 KI End

			// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc Start
			if (response.data.head.isOtherWarehouse == "1") {
				if (!owsCommon.viewConfirm("pickingListPrintMultipleWarehouseConfirmation")) {
					return;
				}
			}
			// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc End
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
//     		reportId = response.printBasicData.reportId;
			$scope.listReportId = response.data.listReportId;
			successPrintFunc = function(){
				if ($scope.listReportId.length > 0) {
					reportId = $scope.listReportId.shift();
				}
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
			// プリンタ選択画面を表示
			var request = {};
			request.reportId = reportId;
			request.userId = null;
			request.reportLayoutData = null;
			request.subrepLayoutData = null;
			request.groupCd = null;
			request.printerNm = null;
			request.trayInfo = null;
			request.trayNm = null;
			request.caltureId = null;
			request.printType = null;
			request.outputType = null;
			request.reportLayoutId = null;
			request.reportLayoutVersion = null;
			request.subrepLayoutId = null;
			request.printerAttributeId = null;
			request.printNum = null;
			request.confirmPrintDia = null;
			request.sheetCollate = null;
			request.printerId = null;
			request.outputData = null;

			var modalInstance = printFactory.modalPrint(request);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.head = $scope.searchCondition;
				request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
				request.data.footer  = $scope.footer;
				request.printBasicData = printParam.printBasicData;

				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// [ON推-品向-267] 帳票発行処理後、再検索処理を追加 2014.11.28 fengc Start
				successFunc = function(){
					// 再検索処理
					$scope.search();
				}
				// [ON推-品向-267] 帳票発行処理後、再検索処理を追加 2014.11.28 fengc End

				// 発行
				api.pickingListPrint.print(request).then(function(response){
			        // Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/08/09 SJA Start
					// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第1回対応を削除 2014.11.26 fengc
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

							// [C-CWMS-0058] 佐川送り状システムAPI対応 2016.11.17 kawana Start

							// プレビュー表示
							if (0 < response.output.listDownloadUrl.length) {
								// 複数帳票用にダウンロードURL格納

								var listDownloadUrl = response.output.listDownloadUrl;
								subWindow = owsCommon.viewPdf(subWindow, listDownloadUrl.shift());
								while (0 < listDownloadUrl.length) {
									owsCommon.viewPdf(null, listDownloadUrl.shift());
								}
							} else {
								// 通常

								subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							}

							// [C-CWMS-0058] 佐川送り状システムAPI対応 2016.11.17 kawana End
						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
						return;
					}
//					// [ON推-品向-267] 帳票発行処理後、再検索処理を追加 2014.11.28 fengc End
					if ($scope.listReportId.length > 0) {
						successPrintFunc();
					} else {
						// リスト発行区分変更後処理
						$scope.changePicCls();
						// [ON推-品向-267] 帳票発行処理後、再検索処理を追加 2014.11.28 fengc Start
						// 完了後の処理
						successFunc(response);
						// [ON推-品向-267] 帳票発行処理後、再検索処理を追加 2014.11.28 fengc End
					}
     				// Ver２．１向けエンハンス 荷札出力対応 C-CWMS-0058 2016/08/09 SJA End

					// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana Start
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana End
				});
				// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
			});
			// [新ｿﾘ-084] 在庫が複数の倉庫に引き当たった場合、確認メッセージを出力 、第2回対応 2014.11.26 fengc End
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  Start
			}

			successPrintFunc();
			// [Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/08/09  End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListPrint.object:PickingListPrint#excelOutput
	 * @methodOf oneslogiWms.PickingListPrint.object:PickingListPrint
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.pickingListPrint.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);
