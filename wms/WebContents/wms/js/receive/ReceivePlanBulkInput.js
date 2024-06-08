/**
 * @ngdoc overview
 * @name oneslogiWms.ReceivePlanBulkInput
 *
 * @description
 * 入荷予定一括取込画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.ReceivePlanBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceivePlanBulkInput.service:receivePlanBulkInputApi
 *
 * @description
 * 入荷予定一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * processType 処理区分データ操作用WebAPI<br>
 * ・resources/common/processType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * supplierCustomer 仕入先データ操作用WebAPI<br>
 * ・resources/common/supplierCustomer/record 単一行データ取得WebAPI<br>
 * <br>
 * product 商品データ操作用WebAPI<br>
 * ・resources/common/product/record 単一行データ取得WebAPI<br>
 * <br>
 * depositCustomer 預託データ操作用WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * receivePlan 入荷予定一括取込操作用WebApi<br>
 * ・resources/receive/receivePlanBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/receive/receivePlanBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/receive/receivePlanBulkInput/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/receive/receivePlanBulkInput/register 一括登録WebAPI<br>
 * ・resources/receive/receivePlanBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('receivePlanBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		processType : AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.20 honma start
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		receivePlanBulkInput : AngularAPIClient.make(
				[
				 ['initNew',  'GET',  'resources/receive/receivePlanBulkInput/initNew'],
				 ['fileUpload',  'POST',  'resources/receive/receivePlanBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/receive/receivePlanBulkInput/register'],
				 ['search',  'GET',  'resources/receive/receivePlanBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/receive/receivePlanBulkInput/checkExistError'],
				 ['excel',  'GET',  'resources/receive/receivePlanBulkInput/excelOutput',  'excel'],
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
				 ['checkErrorMaster',  'POST',  'resources/receive/receivePlanBulkInput/checkErrorMaster']
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
				 ]
		),
		centerClass: AngularAPIClient.make(
				[
				 ['getList', 'GET', 'resources/common/centerClass/keyValueList']
				]
		)
	};
}])
.controller('ReceivePlanBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'receivePlanBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.receivePlanBulkInputCols = [
										{field : "lineNo", displayName:"No."},
										{field : "treceivePlanH.planClientReceiveNo", displayName : "予定顧客入荷指示No."},
										{field : "treceivePlanH.planSupplierCd", displayName : "仕入先CD"},
										{field : "treceivePlanH.mcustomerByPlanSupplierId.customerNm", displayName : "仕入先名称"},
										{field : "treceivePlanH.mcustomerByPlanSupplierId.customerAbbr", displayName : "仕入先略称"},
										{field : "treceivePlanH.receivePlanDt", displayName : "入荷予定日"},
										{field : "treceivePlanH.mprocessType.processTypeCd", displayName : "処理区分"},
										{field : "treceivePlanH.mstockType.stockTypeCd", displayName : "在庫区分"},
										{field : "treceivePlanH.planDepositCd", displayName : "預託"},
										{field : "productCd", displayName : "商品CD"},
										{field : "mproduct.productNm", displayName : "商品名称"},
										{field : "mproduct.productAbbr", displayName : "商品略称"},
										{field : "mproduct.janCd", displayName : "JANCD"},
										{field : "planNum", displayName : "予定数"},
										{field : "planWarehouseCd", displayName : "予定倉庫"},
										{field : "planLocationCd", displayName : "予定ロケーションCD"},
										{field : "planLot", displayName : "予定ロット"},
										{field : "planLimitDt", displayName : "予定期限日"},
										{field : "planClientOrderNo", displayName : "予定顧客発注No."},
										{field : "errorMessageNm", displayName : "エラー内容"},
										// [#2253]予備項目対応 2017.08.18 sampei Start
										{field : "treceivePlanSpare.spareStr1", displayName : "予備項目１（文字列）"},
										{field : "treceivePlanSpare.spareStr2", displayName : "予備項目２（文字列）"},
										{field : "treceivePlanSpare.spareStr3", displayName : "予備項目３（文字列）"},
										{field : "treceivePlanSpare.spareNum1", displayName : "予備項目１（数値）"},
										{field : "treceivePlanSpare.spareNum2", displayName : "予備項目２（数値）"},
										{field : "treceivePlanSpare.spareNum3", displayName : "予備項目３（数値）"}
										// [#2253]予備項目対応 2017.08.18 sampei End
									];

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;

	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 倉庫の設定
		$scope.warehouseListAll = userInfo.warehouseList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.receivePlanH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response) {
				newDepositStockTypeList = response.data;
			});
			// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi Start
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response) {
				newStockTypeList = response.data;
			});
			// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi End
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.receivePlanH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi Start
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList);
				// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi End
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
			data : 'receivePlan',
			columnDefs : 'receivePlanBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "receivePlan");

		$scope.fileOptions = {
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa End
				formData : uploadParam
		};
		// [SK2-075] エラーをロケーションに表示を変更 2014.12.17 衛 Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "treceivePlanH.planSupplierCd",5, 2);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planWarehouseCd",5, 3);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planLocationCd",5, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planLot",5, 6);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planLimitDt",5, 7);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "treceivePlanH.planClientReceiveNo",5, 8);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planLocationCd",5, 9);
		// [SK2-075] エラーをロケーションに表示を変更 2014.12.17 衛 End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
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
				 $scope.deferredGetProcessTypeList(),
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
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * エラー処理方法 ドロップダウンリスト取得・設定<br>
	 *
	 */
	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana Start
		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response) {
		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End

			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProcessTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.receiveFlg = "1";
		request.shippingFlg = "0";
		request.moveFlg = "0";

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response) {
			$scope.processTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#processTypeChange
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 処理区分変更の監視設定（選択内容変更時）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.processTypeChange = function(index) {
		// 在庫区分の設定
		setStockTypeDefault(index);
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 処理区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.receivePlanH.mcenter.centerCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response) {
			deferred.resolve(response);
		});
		return deferred.promise;
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list) {
		$scope.stockTypeList = list;
	};
	// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
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
		request.clientCd = $scope.receivePlanH.mclient.clientCd;

		request.depositFlg = "1";
		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response) {
			$scope.depositStockTypeList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 入荷予定データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */

	var oldPageSize = -1;
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.receivePlanBulkInput.initNew().then(function(response) {

			$scope.gridOptions.totalItems=0;

			$scope.receivePlanH = response.data.head; // 入荷予定ヘッダ関連
			$scope.receivePlan = []; // 入荷予定一括取込明細関連
			$scope.receivePlan = response.data.receivePlan; // 入荷予定一括取込明細関連
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

			$scope.receivePlanH.mcenter.centerCd = userInfo.centerCd; // センタの初期値設定
			$scope.receivePlanH.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定
			$scope.receivePlanH.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

			// 荷主変更後処理
			$scope.changeClient(true);

			$scope.paging = response.paging;
			// ページングオプション変更監視処理

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
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#changeClient
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response) {
			setDepositStockTypeList(response.data, clearSelected);
		});

		// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi Start
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response) {
			setStockTypeList(response.data);
		});
		// [Ver1.1.1] [ON推-品向-936] 在庫区分を追加する 2015.09.11 hayashi End
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositStockTypeList.length == 1) {
				$scope.receivePlanH.planDepositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.receivePlanH.planDepositCd = null;
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
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#excelOutput
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function() {

		var request = {};
		request.data = {};
		request.data.head = $scope.receivePlanH;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "receivePlan", document.title);
		api.receivePlanBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/receive/receivePlanBulkInput/fileUpload?centerCd=" + $scope.receivePlanH.mcenter.centerCd + "&clientCd=" + $scope.receivePlanH.mclient.clientCd + "&chkErrorShow=" + $scope.receivePlanH.chkErrorShow + "&errorProcessMet=" + $scope.receivePlanH.errorProcessMet;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	$scope.excelUploadSuccess = function(e, response) {

		// [SK2-068] 処理前にグリッドをクリアする。 2014.12.16 KI Start
		$scope.receivePlan = [];

		owsCommon.syncExec(function() {

		// [SK2-068] 処理前にグリッドをクリアする。 2014.12.16 KI End
			$scope.receiveCd = response.result.data.receiveCd;
			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}
			$scope.search();
		}, 3);
	};

	// [ON推-品向-583] 明細　ヘッダー行の選択 2016.03.13 DSW Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#search
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
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
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.receivePlanH;
		request.data.receiveCd = $scope.receiveCd;
//		2016.02.18 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//		2016.02.18 Pan ページング ※3 End
		api.receivePlanBulkInput.search(request).then(function(response) {
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
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#setSearchData
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.receivePlan = response.data.receivePlan;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		updateRowNumber($scope.receivePlan);

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
		for (var row = 0 ; row <$scope.receivePlan.length;row++) {
			$scope.receivePlan[row].treceivePlanH.mprocessType.processTypeCd=$scope.receivePlan[row].treceivePlanH.mprocessType.processTypeNm;
			$scope.receivePlan[row].treceivePlanH.mstockType.stockTypeCd=$scope.receivePlan[row].treceivePlanH.mstockType.stockTypeNm;
			$scope.receivePlan[row].treceivePlanH.planDepositCd=$scope.receivePlan[row].treceivePlanH.planDepositNm;
			$scope.receivePlan[row].planWarehouseCd=$scope.receivePlan[row].planWarehouseNm;
		}
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

	};

	$scope.findErrorList = function() {
		alertMessage.deleteAll();
		$scope.search();
	}
	// [ON推-品向-583] 明細　ヘッダー行の選択 2016.03.13 DSW End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput#register
	 * @methodOf oneslogiWms.ReceivePlanBulkInput.object:ReceivePlanBulkInput
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
			checkExistErrorFunc = api.receivePlanBulkInput.checkExistError;
			execFunc = api.receivePlanBulkInput.register;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			checkMasterFunc = api.receivePlanBulkInput.checkErrorMaster;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			successFunc = function(execResponse) {
				// [1.1.4-CT-062] エラー以外を取込んだ後にエラー行が消えてしまう 2016.05.25 kawana Start
				// エラー行を検索して表示
				$scope.search();
				// [1.1.4-CT-062] エラー以外を取込んだ後にエラー行が消えてしまう 2016.05.25 kawana End
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.receivePlanH;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			request.data.head.mcenter.centerCd = searchCenterCd;
			request.data.head.mclient.clientCd = searchClientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
			request.data.receiveCd = $scope.receiveCd;

			if ($scope.receivePlanH.errorProcessMet == null) {
				// エラー処理方法の選択が無い場合
				return;
			} else if ($scope.receivePlanH.errorProcessMet == '0') {
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

						// 入荷予定データ登録
						execFunc(request).then(function(execResponse) {
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								// 検索処理
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
			} else if ($scope.receivePlanH.errorProcessMet == '1') {
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

					// 入荷予定データ登録
					execFunc(request).then(function(execResponse) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							// 検索処理
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
	};

// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.20 honma end

	// 画面初期化処理を実行
	$scope.initScreen();
}]);