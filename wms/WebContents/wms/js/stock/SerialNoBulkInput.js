/**
 * @ngdoc overview
 * @name oneslogiWms.SerialNoBulkInput
 *
 * @description
 * シリアルNo.メンテナンス画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.SerialNoBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.SerialNoBulkInput.service:serialNoBulkInputApi
 *
 * @description
 * シリアルNo.メンテナンス画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * serialNoList シリアルNo.メンテナンス操作用WebApi<br>
 * ・resources/master/serialNoBulkInput/init 初期処理WebAPI<br>
 * ・resources/master/serialNoBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/master/serialNoBulkInput/search データ取得WebAPI<br>
 * ・resources/master/serialNoBulkInput/checkExistError 入力チェック（登録）WebAPI<br>
 * ・resources/master/serialNoBulkInput/register 一括登録WebAPI<br>
 * ・resources/master/serialNoBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('serialNoBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				]
		),
		serialNoBulkInput : AngularAPIClient.make(
				[
				 ['init',  'GET',  'resources/stock/serialNoBulkInput/init'],
				 ['fileUpload',  'POST',  'resources/stock/serialNoBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/stock/serialNoBulkInput/register'],
				 ['findErrorList',  'GET',  'resources/stock/serialNoBulkInput/findErrorList'],
				 ['search',  'GET',  'resources/stock/serialNoBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/stock/serialNoBulkInput/checkExistError'],
				 ['excel',  'GET',  'resources/stock/serialNoBulkInput/excelOutput',  'excel'],
				 ['checkErrorMaster',  'POST',  'resources/stock/serialNoBulkInput/checkErrorMaster']
				]
		)
	};
}])
.controller('SerialNoBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'serialNoBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.serialNoBulkInputCols = [
		{field : "lineNo", displayName:"No."},
		{field : "processType", displayName : "処理区分"},
		{field : "mproduct.productCd", displayName : "商品CD"},
		{field : "serialNo", displayName : "シリアルNo."},
		{field : "supplierCd", displayName : "仕入先CD"},
		{field : "supplierNm", displayName : "仕入先名称"},
		{field : "receiveSlipNo", displayName : "WMS入荷伝票No."},
		{field : "supplyCustomerCd", displayName : "納品先CD"},
		{field : "supplyCustomerNm", displayName : "納品先名称"},
		{field : "pickingWorkNo", displayName : "出庫作業No"},
		{field : "workDt", displayName : "作業日"},
		{field : "errorMessageNm", displayName : "エラー内容"}
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#initScreen
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
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
			data : 'serialNoList',
			columnDefs : 'serialNoBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "serialNoList");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#excelOutput
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function(){
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "serialNoList", document.title);
		api.serialNoBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
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
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * エラー処理方法 ドロップダウンリスト取得・設定<br>
	 *
	 */
	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		owsCommon.getDataCacheable(api.dropdownList, "query", request).then(function(response) {
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}


	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * ロケーションマスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.serialNoBulkInput.init().then(function(response){

			$scope.head = response.data.head;
			$scope.serialNoList = []; // 入荷予定一括取込明細関連
			$scope.serialNoList = response.data.serialNoList;
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

			// ログイン情報より初期値を設定
			$scope.head.mcenter.centerCd = userInfo.centerCd;
			$scope.head.mclient.clientCd = userInfo.clientCd;
			$scope.head.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka mod end

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

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/stock/serialNoBulkInput/fileUpload?centerCd=" + $scope.head.mcenter.centerCd + "&clientCd=" + $scope.head.mclient.clientCd + "&chkErrorShow=" + $scope.head.chkErrorShow + "&errorProcessMet=" + $scope.head.errorProcessMet;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	// Excelアップロード
	$scope.excelUploadSuccess = function(e, response) {

		// 処理前にグリッドをクリアする。
		$scope.serialNoList = [];
		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}

			$scope.search();
		}, 3);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#search
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * 取込データ検索処理<br>
	 * @description
	 *
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	var searchCenterCd;
	var searchClientCd;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.receiveCd = $scope.receiveCd;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.serialNoBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);

			searchCenterCd = request.data.head.mcenter.centerCd;
			searchClientCd = request.data.head.mclient.clientCd;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#setSearchData
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.serialNoList = response.data.serialNoList;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		updateRowNumber($scope.serialNoList);

		if ($scope.serialNoList && $scope.serialNoList.length > 0) {
			for (var row = 0 ;row < $scope.serialNoList.length; row++) {
				$scope.serialNoList[row].processType = $scope.serialNoList[row].processTypeNm;
			}
		}

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka mod start
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.18 tanaka mod end

		owsHistory.replaceState($scope.serialNoList);
	};

	$scope.findErrorList = function(){
		alertMessage.deleteAll();
		$scope.search();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput#register
	 * @methodOf oneslogiWms.SerialNoBulkInput.object:SerialNoBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		owsCommon.syncExec(function() {

			var checkExistErrorFunc;
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数
			var checkMasterFunc; // 関連マスタチェック関数

			// 新規登録関数を設定
			checkExistErrorFunc = api.serialNoBulkInput.checkExistError;
			checkFunc = api.serialNoBulkInput.inputCheck;
			execFunc = api.serialNoBulkInput.register;
			checkMasterFunc = api.serialNoBulkInput.checkErrorMaster;

			successFunc = function(execResponse){
				$scope.search();
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.receiveCd = $scope.receiveCd;
			request.data.head.mcenter.centerCd = searchCenterCd;
			request.data.head.mclient.clientCd = searchClientCd;

			// 0:全て取込まない
			if ($scope.head.errorProcessMet == '0') {
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

						// ロケーションマスタデータ登録
						execFunc(request).then(function(execResponse) {
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								$scope.search();
								return;
							}
							// 完了後の処理
							successFunc(execResponse);
							owsCommon.toggleSelectAll($scope.gridOptions, false);
						});
					});
				});
			// 1:エラー以外を取り込む
			} else if ($scope.head.errorProcessMet=='1') {
				// 登録確認
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					$scope.search();
					return;
				}

				// 登録時の関係マスタチェック
				checkMasterFunc(request).then(function(checkMasterResponse) {
					// 登録時の関係マスタチェックエラー件数を設定
					request.data.errorCount = checkMasterResponse.data.errorCount;

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
						$scope.search();
						return;
					}

					// ロケーションマスタデータ登録
					execFunc(request).then(function(execResponse) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							$scope.search();
							return;
						}

						// 完了後の処理
						successFunc(execResponse);

						owsCommon.toggleSelectAll($scope.gridOptions, false);
					});
				});
			}
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();
}]);