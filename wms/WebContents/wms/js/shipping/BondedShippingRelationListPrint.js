/**
 * @ngdoc overview
 * @name oneslogiWms.BondedShippingRelationListPrint
 *
 * @description 保税出庫関連リスト出力画面<br>
 *
 * 保税出庫関連リスト出力表示する画面。
 *
 */
angular.module('oneslogiWms.BondedShippingRelationListPrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.BondedShippingRelationListPrint.service:bondedShippingRelationListPrintApi
 *
 * @description 保税出庫関連リスト出力画面用WebAPI定義<br>
 *
 */
.factory('bondedShippingRelationListPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		keyValueList: AngularAPIClient.make(
				[
					['query', 'GET', 'resources/common/centerClass/keyValueList']
		        ]
		),
		mainList: AngularAPIClient.make(
				[
					['init',								'GET',	'resources/shipping/bondedShippingRelationListPrint/init'],
					['search',								'GET',	'resources/shipping/bondedShippingRelationListPrint/search'],
					['excel',								'GET',	'resources/shipping/bondedShippingRelationListPrint/search', 'excel'],
					['checkPrint',							'POST',	'resources/shipping/bondedShippingRelationListPrint/checkPrint'],
					['printBondedPickingList',				'GET',	'resources/shipping/bondedShippingRelationListPrint/printBondedPickingList'],
					['printPalleteDtlSingle',				'GET',	'resources/shipping/bondedShippingRelationListPrint/printPalleteDtlSingle'],
					['printPalletDtlFraction',				'GET',	'resources/shipping/bondedShippingRelationListPrint/printPalletDtlFraction'],
					['printSortingPlaceIncomingInspecList',	'GET',	'resources/shipping/bondedShippingRelationListPrint/printSortingPlaceIncomingInspecList'],
					['printShippingLoadingList',			'GET',	'resources/shipping/bondedShippingRelationListPrint/printShippingLoadingList']
		        ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
 *
 * @description 保税出庫関連リスト出力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('BondedShippingRelationListPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'bondedShippingRelationListPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.BondedShippingRelationListPrintCols = [
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#initScreen
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
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

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'bondedShippingRelationListPrint',
			columnDefs: 'BondedShippingRelationListPrintCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#initScreenHttp
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
					$scope.deferredGetPrintedflg(),
					$scope.deferredGetListkbn()
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#deferredGetPrintedflg
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * 印刷済フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPrintedflg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_KBN";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.printedflgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#deferredGetListkbn
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * 帳票区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetListkbn = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SOLISTKBN_2";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.listkbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#deferredGetInitData
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 保税出庫関連リスト出力データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.mainList.init().then(function(response){
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.search;

			//印刷情報
			$scope.printParamBondedPickingList = response.data.prmBondedPickingListDto.printBasicData;
			$scope.printParamPalleteDtlSingle = response.data.prmPalleteDtlSingleDto.printBasicData;
			$scope.printParamPalletDtlFraction = response.data.prmPalletDtlFractionDto.printBasicData;
			$scope.printParamSortingPlaceIncomingInspecList = response.data.prmSortingPlaceIncomingInspecListDto.printBasicData;
			$scope.printParamShippingLoadingList = response.data.prmShippingLoadingListDto.printBasicData;

			// ログイン情報より初期値を設定
			$scope.searchCondition.centerCd = userInfo.centerCd;
			$scope.searchCondition.clientCd = userInfo.clientCd;
			$scope.searchCondition.shipschdateFrom = $scope.getAddDate(userInfo.systemDt);
			$scope.searchCondition.printedflg = "0";

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				$scope.searchCondition.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.printedflg = $route.current.params.printedflg;
				$scope.searchCondition.shipschdateFrom = $route.current.params.shipschdateFrom;
				$scope.searchCondition.shipschdateTo = $route.current.params.shipschdateTo;
				$scope.searchCondition.listkbn = $route.current.params.listkbn;
				$scope.searchCondition.pickbatchkey = $route.current.params.pickbatchkey;
				$scope.searchCondition.workallocateid = $route.current.params.workallocateid;
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
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#search
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
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
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#getPagingData
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
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

		api.mainList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#setPagingData
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
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

		// [ON推-品向-328] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-328] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		// 取得したデータをグリッドに表示
		$scope.bondedShippingRelationListPrint = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#getClassForRow
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		if (row.entity.printedflg == "0") {
			// 未発行
			return "wmslegendwhite";
		} else if (row.entity.printedflg == "1") {
			// 発行済
			return "wmslegendlightblue";
		} else {
			return "";
		}

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#excelOutput
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
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

		api.mainList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#getAddDate
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 日付処理<br>
	 *
	 * 指定日＋２日の日付を返す
	 */
	$scope.getAddDate = function(date) {

		if(!date)return '';
		var sysYear = date.substring(0,4);
		var systMonth = date.substring(4,6);
		var sysDate = date.substring(6,8);
		var dDate = new Date(sysYear + '-' + systMonth + '-' + sysDate);
		dDate.setDate(dDate.getDate() + 2);

        var year = dDate.getFullYear();
        var month =(dDate.getMonth() + 1).toString();
        var day = (dDate.getDate()).toString();

        if (month.length == 1) {
            month = "0" + month;
        }

        if (day.length == 1) {
            day = "0" + day;
        }

		return year + month +  day;

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#output
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 発行ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、各種リストを発行する。
	 */
	$scope.output = function() {

		//明細が表示されていない場合
		if($scope.gridOptions.totalItems == 0) {
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
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		// 入力チェック
		api.mainList.checkPrint(request).then(function(checkResponse){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			//明細ループしそれぞれの配列に詰め替え
			var bondedPickingListRows = [];
			var palleteDtlSingleRows = [];
			var palletDtlFractionRows = [];
			var sortingPlaceIncomingInspecListRows = [];
			var shippingLoadingListRows = [];

			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if (row.listkbn == "1" || row.listkbn == "2") {
					bondedPickingListRows.push(row);
				}
				if (row.listkbn == "3") {
					palleteDtlSingleRows.push(row);
				}
				if (row.listkbn == "4") {
					palletDtlFractionRows.push(row);
				}
				if (row.listkbn == "5") {
					sortingPlaceIncomingInspecListRows.push(row);
				}
				if (row.listkbn == "6") {
					shippingLoadingListRows.push(row);
				}
			});

			// 棚出リスト発行
			$scope.printBondedPickingList(bondedPickingListRows)
				.then(function(){
					// パレット明細(単品)発行
					return $scope.printPalleteDtlSingle(palleteDtlSingleRows);
				})
				.then(function(){
					// パレット明細(端数)発行
					return $scope.printPalletDtlFraction(palletDtlFractionRows);
				})
				.then(function(){
					// 仕分場受入検品リスト発行
					return $scope.printSortingPlaceIncomingInspecList(sortingPlaceIncomingInspecListRows);
				})
				.then(function(){
					// 積込リスト発行
					return $scope.printShippingLoadingList(shippingLoadingListRows);
				})
				.then(function(){
					$scope.search();
				});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#printBondedPickingList
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 棚出リスト発行処理<br>
	 *
	 * サーバとの通信を行い、棚出リストの発行を行う。
	 */
	$scope.printBondedPickingList = function (bondedPickingListRows) {
		var deferred = $q.defer();

		if (bondedPickingListRows.length > 0){

			var modalInstance = printFactory.modalPrint($scope.printParamBondedPickingList);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.search = $scope.searchCondition;
				request.data.list = bondedPickingListRows;

				request.data.prmBondedPickingListDto = {};
				request.data.prmBondedPickingListDto.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.mainList.printBondedPickingList(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.data.prmBondedPickingListDto.output.downloadUrl);
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}

						deferred.reject();
						return;
					}

					deferred.resolve();

				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					deferred.reject();
				});
			});

		}else{
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#printPalleteDtlSingle
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description パレット明細(単品)発行処理<br>
	 *
	 * サーバとの通信を行い、パレット明細(単品)の発行を行う。
	 */
	$scope.printPalleteDtlSingle = function (palleteDtlSingleRows) {
		var deferred = $q.defer();

		if (palleteDtlSingleRows.length > 0){

			var modalInstance = printFactory.modalPrint($scope.printParamPalleteDtlSingle);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.search = $scope.searchCondition;
				request.data.list = palleteDtlSingleRows;

				request.data.prmPalleteDtlSingleDto = {};
				request.data.prmPalleteDtlSingleDto.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.mainList.printPalleteDtlSingle(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.data.prmPalleteDtlSingleDto.output.downloadUrl);
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}

						deferred.reject();
						return;
					}

					deferred.resolve();

				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					deferred.reject();
				});
			});

		}else{
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#printPalletDtlFraction
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description パレット明細(端数)発行処理<br>
	 *
	 * サーバとの通信を行い、パレット明細(端数)の発行を行う。
	 */
	$scope.printPalletDtlFraction = function (palletDtlFractionRows) {
		var deferred = $q.defer();

		if (palletDtlFractionRows.length > 0){

			var modalInstance = printFactory.modalPrint($scope.printParamPalletDtlFraction);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.search = $scope.searchCondition;
				request.data.list = palletDtlFractionRows;

				request.data.prmPalletDtlFractionDto = {};
				request.data.prmPalletDtlFractionDto.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.mainList.printPalletDtlFraction(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.data.prmPalletDtlFractionDto.output.downloadUrl);
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}

						deferred.reject();
						return;
					}

					deferred.resolve();

				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					deferred.reject();
				});
			});

		}else{
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#printSortingPlaceIncomingInspecList
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 仕分場受入検品リスト発行処理<br>
	 *
	 * サーバとの通信を行い、仕分場受入検品リストの発行を行う。
	 */
	$scope.printSortingPlaceIncomingInspecList = function (sortingPlaceIncomingInspecListRows) {
		var deferred = $q.defer();

		if (sortingPlaceIncomingInspecListRows.length > 0){

			var modalInstance = printFactory.modalPrint($scope.printParamSortingPlaceIncomingInspecList);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.search = $scope.searchCondition;
				request.data.list = sortingPlaceIncomingInspecListRows;

				request.data.prmSortingPlaceIncomingInspecListDto = {};
				request.data.prmSortingPlaceIncomingInspecListDto.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.mainList.printSortingPlaceIncomingInspecList(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.data.prmSortingPlaceIncomingInspecListDto.output.downloadUrl);
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}

						deferred.reject();
						return;
					}

					deferred.resolve();

				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					deferred.reject();
				});
			});

		}else{
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#printShippingLoadingList
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description 積込リスト発行処理<br>
	 *
	 * サーバとの通信を行い、積込リストの発行を行う。
	 */
	$scope.printShippingLoadingList = function (shippingLoadingListRows) {
		var deferred = $q.defer();

		if (shippingLoadingListRows.length > 0){

			var modalInstance = printFactory.modalPrint($scope.printParamShippingLoadingList);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.search = $scope.searchCondition;
				request.data.list = shippingLoadingListRows;

				request.data.prmShippingLoadingListDto = {};
				request.data.prmShippingLoadingListDto.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.mainList.printShippingLoadingList(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.data.prmShippingLoadingListDto.output.downloadUrl);
						}
					} else {
						// 異常
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}

						deferred.reject();
						return;
					}

					deferred.resolve();

				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					deferred.reject();
				});
			});

		}else{
			deferred.resolve();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint#pickingListRePrint
	 * @methodOf oneslogiWms.BondedShippingRelationListPrint.object:BondedShippingRelationListPrint
	 *
	 * @description
	 * 保税出庫関連リスト再出力ボタン押下処理<br>
	 *
	 * 保税出庫関連リスト再出力画面に遷移する。
	 */
	$scope.pickingListRePrint = function() {

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

		// 保税出庫関連リスト再出力画面へ遷移
		$location.path("wms/shipping/PickingListRePrint").search({})
			.search("mode", SCREEN_MODE.Read)
			.search("clientCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
			.search("centerCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].centerCd)
			.search("shipschdateFrom",$scope.searchCondition.shipschdateFrom)
			.search("shipschdateTo",$scope.searchCondition.shipschdateTo)
			.search("listkbn", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].listkbn)
			.search("workallocateid", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].workallocateid);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
