/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingPlanBulkInput
 *
 * @description
 * 出荷指示一括取込画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.ShippingPlanBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingPlanBulkInput.service:shippingPlanBulkInputApi
 *
 * @description
 * 出荷指示一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList 緊急フラグ、納品時間帯ドロップダウンリスト用データ取得
 * processType 処理区分データ操作用WebAPI<br>
 * ・resources/common/processType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * shippingPlanBulkInput 出荷指示一括取込操作用WebApi<br>
 * ・resources/resources/shipping/shippingPlanBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/shipping/shippingPlanBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/shipping/shippingPlanBulkInput/inputCheck 登録前入力チェックWebAPI<br>
 * ・resources/shipping/shippingPlanBulkInput/register 登録WebAPI<br>
 * ・resources/shipping/shippingPlanBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 * <br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/depositCustomer/keyValueList 預託データ取得<br>
 * ・resources/common/stockType/keyValueList 在庫区分データ取得<br>
 * ・resources/common/warehouseCd/keyValueList 指定倉庫データ取得<br>
 * ・resources/common/supplierCustomer/record 納品先データ取得<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得<br>
 * ・resources/common/product/record 商品データ取得<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('shippingPlanBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList : AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		processType : AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),
// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.27 honma start
		// [C-CWMS-0020] 指定倉庫を追加 2015.03.25 kyo Start
		warehouseCd: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		// [C-CWMS-0020] 指定倉庫を追加 2015.03.25 kyo End
		shippingPlanBulkInput : AngularAPIClient.make(
				[
				 ['initNew',  'GET',  'resources/shipping/shippingPlanBulkInput/initNew'],
				 ['fileUpload',  'POST',  'resources/shipping/shippingPlanBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/shipping/shippingPlanBulkInput/register'],
				 ['excel',  'GET',  'resources/shipping/shippingPlanBulkInput/excelOutput',  'excel'],
				 ['search',  'GET',  'resources/shipping/shippingPlanBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/shipping/shippingPlanBulkInput/checkExistError'],
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
				 ['checkErrorMaster',  'POST',  'resources/shipping/shippingPlanBulkInput/checkErrorMaster']
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
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
		)
	};
}])
.controller('ShippingPlanBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'shippingPlanBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.shippingPlanBulkInputCols = [
	                                    {field : "lineNo", displayName:"No."},
	                                    {field : "tshippingInstH.emergencyFlg", displayName:"緊急フラグ"},
	                                    {field : "tshippingInstH.clientShippingNo", displayName : "顧客出荷指示Ｎｏ."},
	                                    {field : "tshippingInstH.mcustomerBySupplyCustomerId.customerCd", displayName : "納品先CD"},
	                                    {field : "tshippingInstH.mcustomerBySupplyCustomerId.customerNm", displayName : "納品先名称"},
	                                    {field : "tshippingInstH.mcustomerBySupplyCustomerId.customerAbbr", displayName : "納品先略称"},
	                                    {field : "tshippingInstH.mprocessType.processTypeCd", displayName : "処理区分"},
	                                    {field : "tshippingInstH.delivPlanDt", displayName : "納品予定日"},
	                                    {field : "tshippingInstH.workDt", displayName : "作業日"},
	                                    {field : "tshippingInstH.shippingDt", displayName : "出荷日"},
	                                    {field : "tshippingInstH.mdeliveryCourse.deliveryCourseCd", displayName : "配送コースCD"},
	                                    {field : "tshippingInstH.mdeliveryCourse.deliveryCourseNm", displayName : "配送コース名称"},
	                                    {field : "tshippingInstH.delivDt", displayName : "納品指定日"},
	                                    {field : "tshippingInstH.delivTz", displayName : "納品時間帯"},
	                                    {field : "mproduct.productCd", displayName : "商品CD"},
	                                    {field : "mproduct.productNm", displayName : "商品名称"},
	                                    {field : "mproduct.productAbbr", displayName : "商品略称"},
	                                    {field : "mproduct.janCd", displayName : "JANCD"},
	                                    {field : "depositCd", displayName : "預託"},
	                                    {field : "stockTypeCd", displayName : "在庫区分"},
	                                    {field : "instNum", displayName : "指示数"},
	                                    {field : "lot", displayName : "指定ロット"},
	                                    {field : "limitDt", displayName : "指定期限日"},
	                                    // [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kawana Start
	                                    {field:"warehouseCd", displayName:"指定倉庫CD"},
	                                    // [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kawana End
	                                    {field : "locationCd", displayName : "指定ロケーションCD"},
	                                    // [C-CWMS-0052] 届先CD追加 2015.11.18 koyama Start
	                                    {field : "tshippingInstH.delivCustomerCd", delivCustomerCd : "届先CD"},
	                                    // [C-CWMS-0052] 届先CD追加 2015.11.18 koyama End
                                        // [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei Start
	                                    {field : "tshippingInstH.totalPrice", displayName : "合計金額"},
	                                    {field : "tshippingInstH.totalTax", displayName : "合計消費税"},
	                                    {field : "unitPrice", displayName : "単価"},
	                                    {field : "price", displayName : "金額"},
	                                    {field : "tax", displayName : "消費税"},
                                        // [#2252]金額データ連携・納品書表示対応 2017.08.21 sampei End
	                                    // [#2253]予備項目対応 2017.08.18 sampei Start
	                                    {field : "tshippingInstSpareAsOne.spareStr1", displayName : "予備項目１（文字列）"},
	                                    {field : "tshippingInstSpareAsOne.spareStr2", displayName : "予備項目２（文字列）"},
	                                    {field : "tshippingInstSpareAsOne.spareStr3", displayName : "予備項目３（文字列）"},
	                                    {field : "tshippingInstSpareAsOne.spareNum1", displayName : "予備項目１（数値）"},
	                                    {field : "tshippingInstSpareAsOne.spareNum2", displayName : "予備項目２（数値）"},
	                                    {field : "tshippingInstSpareAsOne.spareNum3", displayName : "予備項目３（数値）"},
                                        // [#2253]予備項目対応 2017.08.18 sampei End
		                                {field : "errorMessageNm", displayName:"エラー内容"}
	                                    ];

	var oldClient;
	var newDepositList;
	var newStocktyprList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#initScreen
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 画面初期化<br>
	 *
	 */
	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.shippingInstH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託リスト変更（同期処理）
			$scope.deferredGetDepositList()
			.then(function(response) {
				newDepositList = response.data;
			});
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response) {
				newStocktyprList = response.data;
			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.shippingInstH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託リストを設定
				setDepositList(newDepositList, true);
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStocktyprList, true);
			}
		};

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi Start
		var setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'shippingPlan',
			columnDefs : 'shippingPlanBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "shippingPlan");

		$scope.fileOptions = {
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa End
				formData : uploadParam
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "locationCd",8, 7);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "depositCd",8, 3);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.mcustomerBySupplyCustomerId.customerCd",8, 2);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.mprocessType.processTypeCd",8, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.mdeliveryCourse.deliveryCourseCd",8, 9);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mproduct.productCd",8, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "stockTypeCd",8, 6);

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.clientShippingNo",8, 10);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.delivPlanDt",8, 11);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.delivDt",8, 12);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.delivPlanDt",8, 13);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.shippingDt",8, 14);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.clientShippingNo",8, 15);
		// [C-CWMS-0021] ワンタイム導入に伴い届先の項目追加 2015.03.24 kawana Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.delivAddress1",8, 17);
		// [C-CWMS-0021] ワンタイム導入に伴い届先の項目追加 2015.03.24 kawana End
        // [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kawana Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "warehouseCd",8, 18);
        // [C-CWMS-0020] 指定倉庫CD追加 2015.03.25 kawana End
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.18 koyama Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tshippingInstH.delivCustomerCd",8, 19);
		// [C-CWMS-0052] 届先入力追加に伴い、届先CDの項目追加 2015.11.18 koyama End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#excelOutput
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function() {

		var request = {};
		request.data = {};
		request.data.head = $scope.shippingInstH;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "shippingPlan", document.title);
		api.shippingPlanBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	// [ON推-品向-583] 明細　ヘッダー行の選択 2016.03.13 DSW Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#search
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 取込データ検索処理<br>
	 *
	 */
	$scope.search = function() {
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
	var searchCenterCd;
	var searchClientCd;
	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.shippingInstH;
		request.data.receiveCd = $scope.receiveCd;
//		2016.02.18 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//		2016.02.18 Pan ページング ※3 End
		api.shippingPlanBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);

			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			searchCenterCd = request.data.head.mcenter.centerCd;
			searchClientCd = request.data.head.mclient.clientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#setSearchData
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.shippingPlan = response.data.shippingPlan;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		updateRowNumber($scope.shippingPlan);

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
		for (var row = 0 ; row <$scope.shippingPlan.length;row++) {
			$scope.shippingPlan[row].tshippingInstH.emergencyFlg=$scope.shippingPlan[row].tshippingInstH.emergencyFlgNm;
			$scope.shippingPlan[row].tshippingInstH.mprocessType.processTypeCd=$scope.shippingPlan[row].tshippingInstH.mprocessType.processTypeNm;
			$scope.shippingPlan[row].tshippingInstH.delivTz=$scope.shippingPlan[row].tshippingInstH.delivTzNm;
			$scope.shippingPlan[row].depositCd=$scope.shippingPlan[row].depositNm;
			$scope.shippingPlan[row].stockTypeCd=$scope.shippingPlan[row].stockTypeNm;
			$scope.shippingPlan[row].warehouseCd=$scope.shippingPlan[row].warehouseNm;
		}
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
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
				 $scope.deferredGetEmergencyFlgList(),
				 $scope.deferredGetProcessTypeList(),
				 $scope.deferredGetDelivTzList(),
				 // [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
				 $scope.deferredGetWarehouseCd() ,//指定倉庫CD
				 // [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
				 $scope.deferredErrorProcessMet()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetEmergencyFlgList
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 *緊急フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmergencyFlgList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EMERGENCY_FLG";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response) {
			$scope.emergencyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response) {
		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.shippingFlg = "1";
		request.receiveFlg = "0";
		request.moveFlg = "0";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response) {
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetDelivTzList
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 納品時間帯取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelivTzList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELIV_TZ";

		owsCommon.getDataCacheable(api.dropdownList, "keyValueList", request).then(function(response) {
			$scope.delivTzList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetDepositList
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDepositList = function() {

		var deferred = $q.defer();

		var request = {};
		request.clientCd =$scope.shippingInstH.mclient.clientCd;
		request.depositFlg = "1";
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response) {
			$scope.depositList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetWarehouseCd
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description 倉庫取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCd = function () {

		var deferred = $q.defer();
		var request = {};
		request.data = {};
		request.centerId = userInfo.centerId;

		owsCommon.getDataCacheable(api.warehouseCd, "keyValueList", request).then(function(response) {
			$scope.warehouseList = response.data;
			deferred.resolve();
			//deferred.resolve(response);
		});
		return deferred.promise;
	};
	// [C-CWMS-0020] 指定倉庫CDを追加 2015.03.25 kyo End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {

		var deferred = $q.defer();

		var request = {};
		request.clientCd = $scope.shippingInstH.mclient.clientCd;
		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response) {
			$scope.stockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 出荷指示データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.shippingPlanBulkInput.initNew().then(function(response) {

			$scope.gridOptions.totalItems=0;

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			$scope.shippingInstH = response.data.head; // 出荷指示ヘッダ関連
			$scope.shippingPlan = []; // 出荷指示一括取込明細関連
			$scope.shippingPlan = response.data.shippingPlan; // 出荷指示一括取込明細関連
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト
			$scope.shippingInstH.mcenter.centerCd = userInfo.centerCd; // センタの初期値設定
			$scope.shippingInstH.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定

			$scope.shippingInstH.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

			// 荷主変更後処理
			$scope.changeClient(true);

			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
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
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#changeClient
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託と在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託リスト変更（同期処理）
		$scope.deferredGetDepositList()
		.then(function(response) {
			setDepositList(response.data, clearSelected);
		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response) {
			setStockTypeList(response.data, clearSelected);
		});
	};

	// 預託リスト再設定処理
	var setDepositList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositList.length == 1) {
				$scope.depositCd = $scope.depositList[0].mCustomer.customerCd;
			} else {
				$scope.depositCd = null;
			}
		}
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.stockTypeList.length == 1) {
				$scope.stockTypeCd = $scope.stockTypeList[0].stockTypeCd;
			} else {
				$scope.stockTypeCd ="1";
			}
		}
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/shipping/shippingPlanBulkInput/fileUpload?clientCd=" + $scope.shippingInstH.mclient.clientCd + "&centerCd=" + $scope.shippingInstH.mcenter.centerCd + "&chkErrorShow=" + $scope.shippingInstH.chkErrorShow + "&errorProcessMet=" + $scope.shippingInstH.errorProcessMet;

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	$scope.excelUploadSuccess = function(e, response) {

		// [SK2-068] 処理前にグリッドをクリアする。 2014.12.16 KI Start
		$scope.shippingPlan = [];

		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;
			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}
			$scope.search();
		// [SK2-068] 処理前にグリッドをクリアする。 2014.12.16 KI End
		// [SK2-068] 処理前にグリッドをクリアする。 2014.12.16 KI Start
		},3);
		// [SK2-068] 処理前にグリッドをクリアする。 2014.12.16 KI End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput#register
	 * @methodOf oneslogiWms.ShippingPlanBulkInput.object:ShippingPlanBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		owsCommon.syncExec(function() {

			var checkExistErrorFunc;	// エラー存在チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			var checkMasterFunc; // 関連マスタチェック関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			// 新規登録関数を設定
			checkExistErrorFunc = api.shippingPlanBulkInput.checkExistError;
			execFunc = api.shippingPlanBulkInput.register;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			checkMasterFunc = api.shippingPlanBulkInput.checkErrorMaster;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			// 正常終了後処理
			successFunc = function(execResponse) {
				$scope.search();
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.shippingInstH;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			request.data.head.mcenter.centerCd = searchCenterCd;
			request.data.head.mclient.clientCd = searchClientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
			request.data.receiveCd = $scope.receiveCd;

			if ($scope.shippingInstH.errorProcessMet == null) {
				// エラー処理方法の選択が無い場合
				return;
			} else if ($scope.shippingInstH.errorProcessMet=='0') {
				// 0:全て取込まない

				// エラーフラグが「1」のデータを抽出する。
				checkExistErrorFunc(request).then(function(checkExistErrorResponse) {
					// エラーデータがある
					if (!statusInfo.isSuccessAndShowMessage(checkExistErrorResponse, 'inputform')) {
						return;
					}

					// 登録確認
					if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
						$scope.search();
						return;
					}

					// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
					// 登録時の関係マスタチェック
					checkMasterFunc(request).then(function(checkMasterResponse) {
						// 登録時の関係マスタチェックエラー件数を設定
						request.data.errorCount = checkMasterResponse.data.errorCount;

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 登録時の関係マスタチェックエラー存在の場合
						if (checkMasterResponse.data.errorCount > 0) {
							// エラーメッセージの設定(ResourceでgetErrorManagerに設定するとエラーデータのDB更新が出来ないため、JSで設定)
							alertMessage.setErrorMessageByCode("errorDataFoundError");
							// 検索処理
							$scope.search();
							return;
						}

						// 出荷指示データ登録
						execFunc(request).then(function(execResponse) {

							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								$scope.search();
								return;
							}

							// 完了後の処理
							successFunc(execResponse);

							// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
							owsCommon.toggleSelectAll($scope.gridOptions, false);
							// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
						});
					});
					// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
				});
			} else if ($scope.shippingInstH.errorProcessMet == '1') {
				// 1:エラー以外を取り込む

				// 登録確認
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					$scope.search();
					return;
				}

				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod Start
				// 登録時の関係マスタチェック
				checkMasterFunc(request).then(function(checkMasterResponse) {
					// 登録時の関係マスタチェックエラー件数を設定
					request.data.errorCount = checkMasterResponse.data.errorCount;

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
						$scope.search();
						return;
					}

					// 出荷指示データ登録
					execFunc(request).then(function(execResponse) {

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 完了後の処理
						successFunc(execResponse);

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
					});
				});
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
			}
		});
	}

	// 画面初期化処理を実行
	$scope.initScreen();
}]);