/**
 * @ngdoc overview
 * @name oneslogiWms.ProductShapeMasterBulkInput
 *
 * @description
 * 商品荷姿マスタデータ画面<br>
 *
 * Excel取込と新規登録を行う為の画面。
 */
angular.module('oneslogiWms.ProductShapeMasterBulkInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductShapeMasterBulkInput.service:productShapeMasterBulkInputApi
 *
 * @description
 * 商品荷姿マスタ画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * dropdownList 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * shapeCdList 荷姿データ操作用WebApi<br>
 * ・resources/common/shapeCD/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * productMaster 商品荷姿マスタ一括取込操作用WebApi<br>
 * ・resources/master/productShapeMasterBulkInput/initNew 初期処理WebAPI<br>
 * ・resources/master/productShapeMasterBulkInput/fileUpload Excel取込WebAPI<br>
 * ・resources/master/productShapeMasterBulkInput/productShapeRecord 単一行データ取得WebAPI<br>
 * ・resources/master/productShapeMasterBulkInput/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/master/productShapeMasterBulkInput/register 一括登録WebAPI<br>
 * ・resources/master/productShapeMasterBulkInput/getMasterData マスタデータ一括取得WebAPI<br>
 * ・resources/master/productShapeMasterBulkInput/checkErrorMaster 関連マスタチェックWebAPI<br>
 */

//サーバへ通信するAPI定義サービスを設定
.factory('productShapeMasterBulkInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		shapeCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/shapeCD/keyValueList2']
				 ]
		),
		product : AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.14 honma start
		productShapeMasterBulkInput : AngularAPIClient.make(
				[
				 ['initNew',  'GET',  'resources/master/productShapeMasterBulkInput/initNew'],
				 ['fileUpload',  'POST',  'resources/master/productShapeMasterBulkInput/fileUpload'],
				 ['register', 'POST', 'resources/master/productShapeMasterBulkInput/register'],
				 ['excel',  'GET',  'resources/master/productShapeMasterBulkInput/excelOutput',  'excel'],
				 ['search',  'GET',  'resources/master/productShapeMasterBulkInput/search'],
				 ['checkExistError',  'GET',  'resources/master/productShapeMasterBulkInput/checkExistError'],
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
				 ['checkErrorMaster',  'POST',  'resources/master/productShapeMasterBulkInput/checkErrorMaster']
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End
				 ]
		)
	};
}])
.controller('ProductShapeMasterBulkInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productShapeMasterBulkInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.productShapeMasterBulkInputCols = [
	                                   {field : "lineNo", displayName:"No."},
	                                   {field : "mproduct.productCd", displayName : "商品CD"},
	                                   {field : "mproduct.productNm", displayName : "商品名称"},
	                                   {field : "mshape.shapeCd", displayName:"荷姿CD"},
	                                   {field : "unitNum", displayName:"入数"},
	                                   {field : "length", displayName:"縦(mm)"},
	                                   {field : "width", displayName:"横(mm)"},
	                                   {field : "height", displayName:"高さ(mm)"},
	                                   {field : "volume", displayName:"容積(mm3)"},
	                                   {field : "netWeight", displayName:"商品重量(g)"},
	                                   {field : "grossWeight", displayName:"総重量(g)"},
	                                   {field : "errorMessageNm", displayName:"エラー内容"}
	                                   ];

	var oldClient;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#initScreen
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
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
			data : 'productShapeMaster',
			columnDefs : 'productShapeMasterBulkInputCols',
			pagingOptions : $scope.pagingOptions
		});

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "productShapeMaster");

		$scope.fileOptions = {
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa End
				formData : uploadParam
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#excelOutput
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 */
	$scope.excelOutput = function() {

		var request = {};
		request.data = {};
		request.data.pieceShapeCd=$scope.pieceShapeCd;
		request.data.head = $scope.productMaster;
		request.data.receiveCd = $scope.receiveCd;
		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "productShapeMaster", document.title);
		api.productShapeMasterBulkInput.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'inputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#search
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * 取込データ検索処理<br>
	 * @description
	 *
	 */
	$scope.search = function() {
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
	var searchClientCd;
	// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#getPagedDataAsync
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * 明細データ取得<br>
	 *
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.pieceShapeCd=$scope.pieceShapeCd;
		request.data.head = $scope.productMaster;
		request.data.receiveCd = $scope.receiveCd;
//		2016.02.18 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//		2016.02.18 Pan ページング ※3 End
		api.productShapeMasterBulkInput.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'inputform');
			$scope.setSearchData(response);

			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			searchClientCd = request.data.head.mclient.clientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#setSearchData
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * 検索データをグリッドに表示<br>
	 *
	 */
	$scope.setSearchData = function(response) {
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		$scope.gridOptions.gridViewport.scrollTop(0);
		$scope.productShapeMaster = response.data.productShapeMaster;
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		updateRowNumber($scope.productShapeMaster);

		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
		$scope.dataCount = response.data.dataCount;
		// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end
		// [Ver3.0] unit of measure対応 2017.12.14 NING Del
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#initScreenHttp
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
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
				 $scope.deferredGetShapCdList(),
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
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#deferredGetShapCdList
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * 荷姿取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShapCdList = function() {
		var deferred = $q.defer();

		var request = {};
		request.clientId =  userInfo.clientId;
		api.shapeCdList.keyValueList(request).then(function(response) {
			$scope.shapeCdList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#deferredErrorProcessMet
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
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
		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response) {
		// [ON推-品向-997] 削除データ表示有無の検索条件を追加 2015.11.09 kawana End
			$scope.errorProcessMetList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#deferredGetInitData
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * 商品マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */

	var oldPageSize = -1;

	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 新規
		api.productShapeMasterBulkInput.initNew().then(function(response) {
			$scope.gridOptions.totalItems=0;

			$scope.productMaster = response.data.head; // 商品マスタヘッダ関連
			$scope.productShapeMaster = []; // 商品マスタ一括取込明細関連
			$scope.productShapeMaster = response.data.productShapeMaster; // 商品マスタ一括取込明細関連
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト
			$scope.pieceShapeCd = response.data.pieceShapeCd; // ピース荷姿CD

			$scope.productMaster.errorProcessMet = owsCommon.getDefaultValue($scope.errorProcessMetList);

			$scope.productMaster.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定

			$scope.paging = response.paging;

			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod start
			$scope.dataCount = 0;
			// [Ver3.1][#5754] データが0件の場合はボタンを非活性にするよう修正 2018.12.17 tanaka mod end

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

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#excelBeforeUpload
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード前処理<br>
	 *
	 */
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/master/productShapeMasterBulkInput/fileUpload?clientCd=" + $scope.productMaster.mclient.clientCd + "&chkErrorShow=" + $scope.productMaster.chkErrorShow + "&errorProcessMet=" + $scope.productMaster.errorProcessMet;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#excelUploadSuccess
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * ファイル取込 - Excelアップロード後処理<br>
	 *
	 */
	$scope.excelUploadSuccess = function(e, response) {

		$scope.productMaster = response.result.data.head;

		$scope.paging = response.result.paging;

		$scope.pieceShapeCd = response.data.pieceShapeCd;

		// 処理前にグリッドをクリアする。
		$scope.productShapeMaster = [];

		owsCommon.syncExec(function() {
			$scope.receiveCd = response.result.data.receiveCd;

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(response.result, 'inputform')) {
				return;
			}
			$scope.search();
		},3);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput#register
	 * @methodOf oneslogiWms.ProductShapeMasterBulkInput.object:ProductShapeMasterBulkInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		owsCommon.syncExec(function() {
			var checkExistErrorFunc;   // エラー存在チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			var checkMasterFunc; // 関連マスタチェック関数
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			// 新規登録関数を設定
			checkExistErrorFunc = api.productShapeMasterBulkInput.checkExistError;
			execFunc = api.productShapeMasterBulkInput.register;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add Start
			checkMasterFunc = api.productShapeMasterBulkInput.checkErrorMaster;
			// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Add End

			successFunc = function(execResponse) {
				$scope.search();
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.pieceShapeCd=$scope.pieceShapeCd;
			request.data.head = $scope.productMaster;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana Start
			request.data.head.mclient.clientCd = searchClientCd;
			// [#1853] ファイル取込後にセンタ・荷主を変更し登録すると該当データなしエラーとなる問題を修正 2017.06.05 kawana End
			request.data.receiveCd = $scope.receiveCd;

			// エラー処理方法の選択が無い場合
			if ($scope.productMaster.errorProcessMet == null) {
				return;
			// 0:全て取込まない
			} else if ($scope.productMaster.errorProcessMet == '0') {
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

						// 商品マスタデータ登録
						execFunc(request).then(function(execResponse) {
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								// 検索処理
								$scope.search();
								return;
							}
							// 完了後の処理
							successFunc(execResponse);

							owsCommon.toggleSelectAll($scope.gridOptions, false);
						});
					});
					// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
				});
			// 1:エラー以外を取り込む
			} else if ($scope.productMaster.errorProcessMet == '1') {
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
						// 検索処理
						$scope.search();
						return;
					}

					// 商品マスタデータ登録
					execFunc(request).then(function(execResponse) {
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							// 検索処理
							$scope.search();
							return;
						}
						// 完了後の処理
						successFunc(execResponse);

						owsCommon.toggleSelectAll($scope.gridOptions, false);
					});
				});
				// [#219][2.1.0-CT-039] 登録時の関係マスタチェック処理とエラーがある場合のメッセージ設定の既存処理追加 2016.11.21 honma Mod End
			}
		});
	};

// [C-CWMS-0060] EDI機能(汎用)バッチ化対応（全体見直し） 2016.09.14 honma end

	// 画面初期化処理を実行
	$scope.initScreen();
}]);