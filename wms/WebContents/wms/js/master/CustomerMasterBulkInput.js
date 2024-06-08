/**
 * @ngdoc overview
 * @name oneslogiWms.CustomerMasterBulkInput
 *
 * @description
 * 取引先マスタ一括取込画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.CustomerMasterBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CustomerMasterBulkInput.service:customerMasterBulkInputApi
 *
 * @description
 * 取引先マスタ一括取込画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * customerMaster 取引先マスタ一括取込操作用WebApi<br>
 * ・resources/master/customerMasterBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/master/customerMasterBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/master/customerMasterBulkInput/customerRecord 単一行データ取得WebAPI<br>
 * ・resources/master/customerMasterBulkInput/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/master/customerMasterBulkInput/register 一括登録WebAPI<br>
 * ・resources/master/customerMasterBulkInput/getMasterData マスタデータ一括取得WebAPI<br>
 */
.factory('customerMasterBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 (全体見直し) 2016.08.01 kawana Start
		customerMasterBulkInput : AngularAPIClient.make(
				[
				 ['initNew', 'GET', 'resources/master/customerMasterBulkInput/initNew'],
				 ['fileUpload', 'POST', 'resources/master/customerMasterBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/master/customerMasterBulkInput/register'],
				 ['search',  'GET',  'resources/master/customerMasterBulkInput/search'],
				//[Ver3.1][#5754] Excel出力処理を他一括取込系画面と統一 2018.12.18 tanaka start
				 ['excel',  'GET',  'resources/master/customerMasterBulkInput/excelOutput',  'excel'],
				//[Ver3.1][#5754] Excel出力処理を他一括取込系画面と統一 2018.12.18 tanaka end
				 ['checkExistError',  'GET',  'resources/master/customerMasterBulkInput/checkExistError'],
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add Start
				 ['checkErrorMaster',  'POST',  'resources/master/customerMasterBulkInput/checkErrorMaster']
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Add End
				 ]
		)
	};
}])
.controller('CustomerMasterBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'customerMasterBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.customerMasterBulkInputCols = [
	                                      {field : "lineNo", displayName:"No."},
	                                      {field : "mcustomer.customerCd", displayName:"取引先CD"},
	                                      {field : "mcustomer.customerNm", displayName:"取引先名称"},
	                                      {field : "mcustomer.customerAbbr", displayName:"取引先略称"},
	                                      {field : "mcustomer.deliveryFlg", displayName:"納品先フラグ"},
	                                      {field : "mcustomer.vendorFlg", displayName:"仕入先フラグ"},
	                                      {field : "mcustomer.onetimeFlg", displayName:"ワンタイムフラグ"},
	                                      {field : "mcustomer.depositFlg", displayName:"預託先フラグ"},
	                                      {field : "mcustomer.address1", displayName:"住所１"},
	                                      {field : "mcustomer.address2", displayName:"住所２"},
	                                      {field : "mcustomer.address3", displayName:"住所３"},
	                                      {field : "mcustomer.zipCd", displayName:"郵便番号"},
	                                      {field : "mcustomer.telNo", displayName:"電話番号"},
	                                      {field : "mcustomer.allocOrder", displayName:"引当順序"},
	                                      {field : "mcustomer.shippingStopFlg", displayName:"出荷停止フラグ"},
	                                      {field : "mcustomer.limitDtReverseFlg", displayName:"期限日逆転防止フラグ"},
	                                      {field : "mdeliveryCourse.deliveryCourseCd", displayName:"配送コースCD"},
	                                      {field : "mdeliveryCourse.deliveryCourseNm", displayName:"配送コース名称"},
	                                      {field : "deliveryOrder", displayName:"配送順"},
	                                      {field : "deliveryReadTime", displayName:"配送リードタイム"},
	                                      {field : "errorMessageNm", displayName:"エラー内容"}
	                                      ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#initScreen
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * 画面初期化<br>
	 *
	 */
	$scope.initScreen = function() {

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 ono Start
		var setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data : 'customerMaster',
			columnDefs : 'customerMasterBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "customerMaster");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#search
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * 取込データ検索処理<br>
	 *
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
	var searchClientCd;
	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.customerMasterH;
		request.data.receiveCd = $scope.receiveCd;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		api.customerMasterBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);

			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			searchClientCd = request.data.head.mclient.clientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#setSearchData
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.customerMaster = response.data.customerMaster;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		for (var row =0; row <$scope.customerMaster.length; row++){
			$scope.customerMaster[row].mcustomer.deliveryFlg = $scope.customerMaster[row].mcustomer.deliveryFlgNm;
			$scope.customerMaster[row].mcustomer.vendorFlg = $scope.customerMaster[row].mcustomer.vendorFlgNm;
			$scope.customerMaster[row].mcustomer.onetimeFlg = $scope.customerMaster[row].mcustomer.onetimeFlgNm;
			$scope.customerMaster[row].mcustomer.depositFlg = $scope.customerMaster[row].mcustomer.depositFlgNm;
			$scope.customerMaster[row].mcustomer.shippingStopFlg = $scope.customerMaster[row].mcustomer.shippingStopFlgNm;
			$scope.customerMaster[row].mcustomer.limitDtReverseFlg = $scope.customerMaster[row].mcustomer.limitDtReverseFlgNm;
		}
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#excelOutput
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function(){
		var request = {};
		request.data = {};
		request.data.head = $scope.customerMasterH;
		request.data.receiveCd = $scope.receiveCd;
		owsCommon.setOutputOptions(request, $scope.gridOptions, "customerMaster", document.title);
		api.customerMasterBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
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
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * エラー処理方法 ドロップダウンリスト取得・設定<br>
	 *
	 */
	$scope.deferredErrorProcessMet = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_PROCESS_MET";

		api.dropdownList.query(request).then(function(response){
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * 取引先マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	var oldPageSize = -1;

	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.customerMasterBulkInput.initNew().then(function(response){

			$scope.gridOptions.totalItems = 0;

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			$scope.customerMasterH = response.data.head; // 取引先マスタヘッダ関連
			$scope.customerMaster = response.data.customerMaster; // 取引先マスタ一括取込明細関連

			$scope.customerMasterH.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定

			$scope.customerMasterH.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 ono Delete


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
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/master/customerMasterBulkInput/fileUpload?clientCd=" + $scope.customerMasterH.mclient.clientCd + "&chkErrorShow=" + $scope.customerMasterH.chkErrorShow;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	$scope.excelUploadSuccess = function(e, response) {

		// 処理前にグリッドをクリアする。
		$scope.customerMaster = [];

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
	 * @name oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput#register
	 * @methodOf oneslogiWms.CustomerMasterBulkInput.object:CustomerMasterBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 登録API
		var execFunc = api.customerMasterBulkInput.register;
		var execCheckMasterFunc = api.customerMasterBulkInput.checkErrorMaster;

		// 検索処理
		searchFunc = function(execResponse){
			$scope.search();
		}

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.customerMasterH;
		// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
		request.data.head.mclient.clientCd = searchClientCd;
		// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
		request.data.receiveCd = $scope.receiveCd;

		if ($scope.customerMasterH.errorProcessMet == '0') {
			// エラーの場合、全て取込まない

			api.customerMasterBulkInput.checkExistError(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
					return;
				}

				// 登録確認
				if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
					return;
				}

				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Mod Start
				// 登録時の関係マスタチェック
				execCheckMasterFunc(request).then(function(checkMasterResponse){

					// 登録時の関係マスタチェックエラー件数を設定
					request.data.errorCount = checkMasterResponse.data.errorCount;

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
						return;
					}

					// 登録時の関係マスタチェックエラー存在の場合
					if (checkMasterResponse.data.errorCount > 0) {
						// エラーメッセージの設定(ResourceでgetErrorManagerに設定するとエラーデータのDB更新が出来ないため、JSで設定)
						alertMessage.setErrorMessageByCode("errorDataFoundError");
						// 再検索処理
						searchFunc(checkMasterResponse);
						return;
					}

					// データ登録
					execFunc(request).then(function(execResponse){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							searchFunc(execResponse);
							return;
						}
						// 完了後の処理
						searchFunc(execResponse);
					});
				});
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Mod End
			});

		} else if ($scope.customerMasterH.errorProcessMet == '1') {
			// エラー以外を取込

			// 登録確認
			if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
				return;
			}

			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Mod Start
			// 登録時の関係マスタチェック
			execCheckMasterFunc(request).then(function(checkMasterResponse){

				// 登録時の関係マスタチェックエラー件数を設定
				request.data.errorCount = checkMasterResponse.data.errorCount;

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkMasterResponse, 'inputform')) {
					return;
				}

				// データ登録
				execFunc(request).then(function(execResponse){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
						searchFunc(execResponse);
						return;
					}
					// 完了後の処理
					searchFunc(execResponse);
				});
			});
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.18 honma Mod End
		}
	};

// [C-CWMS-0060] EDI機能(汎用)バッチ化対応 (全体見直し) 2016.08.01 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();
}]);