/**
 * @ngdoc overview
 * @name oneslogiWms.PickingListRePrint
 *
 * @description 保税出庫関連リスト出力画面<br>
 *
 * 保税出庫関連リスト出力表示する画面。
 *
 */
angular.module('oneslogiWms.PickingListRePrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PickingListRePrint.service:pickingListRePrintApi
 *
 * @description 保税出庫関連リスト出力画面用WebAPI定義<br>
 *
 */
.factory('pickingListRePrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		keyValueList: AngularAPIClient.make(
				[
					['query', 'GET', 'resources/common/centerClass/keyValueList']
		        ]
		),
		location: AngularAPIClient.make(
				[
					['record', 'GET', 'resources/common/location/record']
				]
		),
		deliveryCustomer: AngularAPIClient.make(
				[
					['record', 'GET', 'resources/common/deliveryCustomer/record']
				]
		),
		mainList: AngularAPIClient.make(
				[
					['init',								'GET',	'resources/shipping/pickingListRePrint/init'],
					['search',								'GET',	'resources/shipping/pickingListRePrint/search'],
					['excel',								'GET',	'resources/shipping/pickingListRePrint/search', 'excel'],
					['checkPrint',							'POST',	'resources/shipping/pickingListRePrint/checkPrint'],
					['printBondedPickingList',				'GET',	'resources/shipping/pickingListRePrint/printBondedPickingList'],
					['printPalleteDtlSingle',				'GET',	'resources/shipping/pickingListRePrint/printPalleteDtlSingle'],
					['printPalletDtlFraction',				'GET',	'resources/shipping/pickingListRePrint/printPalletDtlFraction'],
					['printSortingPlaceIncomingInspecList',	'GET',	'resources/shipping/pickingListRePrint/printSortingPlaceIncomingInspecList'],
					['printShippingLoadingList',			'GET',	'resources/shipping/pickingListRePrint/printShippingLoadingList'],
					['palletSymbol',						'POST',	'resources/shipping/pickingListRePrint/palletSymbol']
		        ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint
 *
 * @description 保税出庫関連リスト出力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PickingListRePrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'pickingListRePrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.PickingListRePrintListCols = [
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#initScreen
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
			data: 'pickingListRePrintList',
			columnDefs: 'PickingListRePrintListCols',
			pagingOptions : $scope.pagingOptions
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#initScreenHttp
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
					$scope.deferredGetListkbn(),
					$scope.deferredGetRequesttype(),
					$scope.deferredGetPickingWorkStatus()
				]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#deferredGetListkbn
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * 帳票区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetListkbn = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SOLISTKBN";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.listkbnList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#deferredGetRequesttype
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * 依頼種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetRequesttype = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REQUESTTYPE";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.otherlot2List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#deferredGetPickingWorkStatus
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * 出庫作業ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPickingWorkStatus = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PICKING_WORK_STATUS";

		owsCommon.getDataCacheable(api.keyValueList, request).then(function(response){
			$scope.trsoliststsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#deferredGetInitData
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
			$scope.searchCondition.shipschdateFrom = userInfo.systemDt;
			$scope.searchCondition.printedflg = "0";

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Read) {
				$scope.searchCondition.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.shipschdateFrom = $route.current.params.shipschdateFrom;
				$scope.searchCondition.shipschdateTo = $route.current.params.shipschdateTo;
				$scope.searchCondition.listkbn = $route.current.params.listkbn;
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#search
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#getPagingData
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#setPagingData
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
		$scope.pickingListRePrintList = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#excelOutput
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#locationCdBlur
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function() {
		// 入力されたロケーションCD
        var locationCd;
		locationCd = $scope.searchCondition.locationCd;

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.centerCd);
			request.locationCd = locationCd;

			// ロケーション情報の取得
			api.location.record(request).then(function(response){
				// ロケーション名称を表示
				$scope.searchCondition.locationNm = response.data.mLocation.locationNm;

			});
		} else {
			$scope.searchCondition.locationNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#showLocation
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(){

		var items = {
				centerCd: $scope.searchCondition.centerCd,
				locationCd: $scope.searchCondition.locationCd,
				warehouseCd: $scope.searchCondition.warehouseCd,
				zoneCd: $scope.searchCondition.zoneCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchCondition.locationCd = selectedItem.locationCd;
			$scope.searchCondition.locationNm = selectedItem.locationNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#customerCdBlur
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * @description
	 * 受入先CD、特約店CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、取引先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function(index) {
		// 入力されたコードを取得
        var customerCd;
		if (index == 1) {
			customerCd = $scope.searchCondition.shiptocd;
		} else {
			customerCd = $scope.searchCondition.customerCd;
		}

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.searchCondition.clientCd);
			request.customerCd = customerCd;

			// 取引先情報の取得
			api.deliveryCustomer.record(request).then(function(response){
				if (index == 1) {
					$scope.searchCondition.shiptoNm = response.data.mCustomer.customerNm;
				} else {
					$scope.searchCondition.customerNm = response.data.mCustomer.customerNm;
				}
			});

		} else {
			if (index == 1) {
				$scope.searchCondition.shiptoNm = null;
			} else {
				$scope.searchCondition.customerNm = null;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#showCustomer
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * @description
	 * 受入先CD、特約店CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された取引先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(index){

		// 入力されたコードを取得
        var customerCd;
		if (index == 1) {
			customerCd = $scope.searchCondition.shiptocd;
		} else {
			customerCd = $scope.searchCondition.customerCd;
		}

		var items = {
				clientCd: $scope.searchCondition.clientCd,
				deliveryCd: customerCd
		};

		// 納品先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			if (index == 1) {
				$scope.searchCondition.shiptocd = selectedItem.customerCd;
				$scope.searchCondition.shiptoNm = selectedItem.customerNm;
			} else {
				$scope.searchCondition.customerCd = selectedItem.customerCd;
				$scope.searchCondition.customerNm = selectedItem.customerNm;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#output
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
			var palletSymbolRow = [];
			
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
				if (row.listkbn == "7") {
					palletSymbolRow.push(row);
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
					// パレット内個体情報コード一覧
					return $scope.palletSymbol(palletSymbolRow);
				})
				.then(function(){
					$scope.search();
				});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#printBondedPickingList
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#printPalleteDtlSingle
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#printPalletDtlFraction
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#printSortingPlaceIncomingInspecList
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#printShippingLoadingList
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
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
	 * @name oneslogiWms.PickingListRePrint.object:PickingListRePrint#palletSymbol
	 * @methodOf oneslogiWms.PickingListRePrint.object:PickingListRePrint
	 *
	 * @description パレット内個体情報コード一覧出力処理<br>
	 *
	 * サーバとの通信を行い、SVF定義作成(パレット内個体情報コード一覧)を呼び出す。
	 */
	$scope.palletSymbol = function (palletSymbolRows) {
		var deferred = $q.defer();

		if (palletSymbolRows.length > 0){

			var request = {};
			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.list = palletSymbolRows;

			// パレット内個体情報コード一覧
			api.mainList.palletSymbol(request).then(function(execResponse){
	
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
					return;
				}
	
				deferred.resolve();

			});

		}else{
			deferred.resolve();
		}

		return deferred.promise;
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
