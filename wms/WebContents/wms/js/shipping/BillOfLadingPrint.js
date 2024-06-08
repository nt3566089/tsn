/**
 * @ngdoc overview
 * @name oneslogiWms.BillOfLadingPrint
 *
 * @description Bill of Lading発行画面<br>
 *
 * Bill of Lading発行表示する画面。
 *
 */
angular.module('oneslogiWms.BillOfLadingPrint', [])

/**
 * @ngdoc service
 * @name oneslogiWms.BillOfLadingPrint.service:BillOfLadingPrintApi
 *
 * @description Bill of Lading発行画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/shipping/BillOfLadingPrint/initNormal 初期データ取得(通常)WebAPI<br>
 * ・resources/shipping/BillOfLadingPrint/search 検索結果取得WebAPI<br>
 * ・resources/shipping/BillOfLadingPrint/print発行ボタンを押下された時に処理WebAPI<br>
 * ・resources/shipping/BillOfLadingPrint/getReportId レポトIDの取得WebAPI<br>
 */
.factory('BillOfLadingPrintApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {

		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		),
		dropdownList: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		centerdropdownList: AngularAPIClient.make([
			                                    ['query', 'GET', 'resources/common/centerClass/centerKeyValueList']
			                                    ]
			),
		carrierList: AngularAPIClient.make([
		                                ['query', 'GET', 'resources/common/carrierCd/keyValueList']
		                                ]
		),
		noStockOutFlg: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		deliveryCourseCd: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                       ]
		),
		deliveryCourse: AngularAPIClient.make([
		                                       ['record', 'GET', 'resources/common/deliveryCourse/record']
		                                       ]
		),
		billOfLadingPrint: AngularAPIClient.make([
		                                           ['initNormal',   'GET', 'resources/shipping/billOfLadingPrint/initNormal'],
		                                           ['search', 'GET', 'resources/shipping/billOfLadingPrint/search'],
		                                           ['print', 'GET', 'resources/shipping/billOfLadingPrint/print'],
		                                           ['getReportId', 'GET', 'resources/shipping/billOfLadingPrint/getReportId'],
		                                           ['traceNoUpdate',      'POST', 'resources/shipping/shippingConfirmListCarrierTraceNum/update'],
		                                           ['issueCancelUpdate',      'GET', 'resources/shipping/billOfLadingPrint/issueCancelUpdate'],
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
 *
 * @description Bill of Lading発行画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('BillOfLadingPrint', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'BillOfLadingPrintApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.billOfLadingPrintCols = [
	                                 {field:"billOfLadingNo", displayName:"Bill of Lading No"},
	                                 {field:"pickingWorkNo", displayName:"出庫作業No"},
	                                 {field:"shippingDt", displayName:"出荷日"},
	                                 {field:"carrierCd", displayName:"運送業者CD"},
	                                 {field:"carrierNm", displayName:"運送業者名称"},
	                                 {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                 {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                 {field:"supplyCustomerCd", displayName:"納品先CD"},
	                                 {field:"supplyCustomerNm", displayName:"納品先名称"},
	                                 {field:"delivCustomerCd", displayName:"届先CD"},
	                                 {field:"delivCustomerNm", displayName:"届先名称"},
	                                 {field:"delivCustomerAddress1", displayName:"届先住所１"},
	                                 {field:"delivCustomerAddress2", displayName:"届先住所２"},
	                                 {field:"delivCustomerAddress3", displayName:"届先住所３"},
	                                 {field:"delivCustomerZip", displayName:"届先郵便番号"},
	                                 {field:"carrierTraceNum", displayName:"貨物追跡番号"},
	                                 {field:"bolOutFlg", displayName:"Bill of lading発行フラグ"},
	                                 {field:"bolOutFlgNm", displayName:"Bill of lading発行フラグ名称"},
	                                 {field:"bolOutDt", displayName:"Bill of lading発行時間"},
	                                 {field:"bolOutUserId", displayName:"Bill of lading発行者名称"}
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#initScreen
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
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

		// ページングの設定(ページングなし)
		$scope.pagingOptions = {
			pageSizes: [0],
			pageSize: 0,
			currentPage: 1
		};

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 tsuboi End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'billOfLadingPrintB',
			columnDefs: 'billOfLadingPrintCols'
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#initScreenHttp
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetBolOutputTargetFlg(),//発行対象のみ表示
				 $scope.deferredGetCarrierCd(), //運送業者
				 $scope.deferredGetBolOutFlg() //未発行のみ表示
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#deferredGetBolOutFlg
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description 未発行のみ表示取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBolOutFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BOL_OUT_FLG";
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
		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.bolOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#deferredGetBolOutputTargetFlg
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description 発行対象のみ表示取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBolOutputTargetFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BOL_OUTPUT_TARGET_FLG";
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
		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.bolOutputTargetFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#deferredGetCarrierCd
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description
	 * 運送業者CD取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCarrierCd = function () {
		var deferred = $q.defer();
		var request = {};
		if ($scope.head) {
			request.centerCd = $scope.head.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}

		api.carrierList.query(request).then(function(response){
			$scope.carrierList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#showCustomer
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#customerCdBlur
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#deliveryCourse
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
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
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
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
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
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
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#deferredGetInitData
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description Bill of Lading発行データを取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.billOfLadingPrint.initNormal().then(function(response){
			$scope.printParam = response.printBasicData;
			$scope.paging = response.paging;
			$scope.searchCondition = response.data.head;
			$scope.billOfLadingPrintB = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.bolOutputTargetFlg =  owsCommon.getDefaultValue($scope.bolOutputTargetFlgList);
			$scope.searchCondition.bolOutFlg = owsCommon.getDefaultValue($scope.bolOutFlgList);
			$scope.searchCondition.tallocInstH.shippingDtFrom = userInfo.systemDt;
			$scope.searchCondition.tallocInstH.shippingDtTo = userInfo.systemDt;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 tsuboi Delete


			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#search
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
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
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#getPagingData
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
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

		api.billOfLadingPrint.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#setPagingData
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに表示
		$scope.billOfLadingPrintB = response.data.list;
		// トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#carrierTrace
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description
	 * 貨物追跡番号登録ボタン押下処理<br>
	 *
	 * 選択行の梱包ヘッダデータを修正する。
	 */
	$scope.carrierTrace = function() {

		// 貨物追跡番号登録ボタンを押下された時に処理貨物追跡番号登録画面をモーダル表示する

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		// 行が選択されていない場合、以下のエラーを表示し、処理を抜ける。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		};
		// 複数行が選択されている場合、エラーメッセージを表示
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1){
			// 複数行が選択されている場合、エラーメッセージを表示
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		};
		// 未発行データが選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows()[0].bolNo == null){
			// 複数行が選択されている場合、エラーメッセージを表示
			alertMessage.setErrorMessageByCode("noPrintedSelected");
			return;
		};

		// ===== 貨物追跡番号登録画面呼び出し =====
		var selectedRow = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];

		var items = {
				bolNo: selectedRow.bolNo,
				pickingHId: selectedRow.pickingHId
		};
		var modalInstance = modalFactory.modalcarrierTraceNumInput(items);
		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			var request = new Array(3);
			request[0] = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request[1] = selectedRow.bolNo;
			request[2] = selectedItem.traceNo;

			if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
				return;
			}
			api.billOfLadingPrint.traceNoUpdate(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					return;
				}
				//選択状態をクリアする
				owsCommon.toggleSelectAll($scope.gridOptions, false);
				// 再検索処理
				$scope.search();
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#issueCancel
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description
	 * 発行取消ボタン押下処理<br>
	 *
	 * 選択行の出庫ヘッダと出庫帳票データを更新する。
	 */
	$scope.issueCancel = function() {

		// 発行取消ボタンを押下された時の処理

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		// 行が選択されていない場合、以下のエラーを表示し、処理を抜ける。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		};
		// 未発行データが選択されている場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].bolNo == null){
				// 複数行が選択されている場合、エラーメッセージを表示
				alertMessage.setErrorMessageByCode("noPrintedDataSelected");
				return;
			};
		}

		// ===== 選択行の出庫ヘッダと出庫帳票データを更新する =====
		successFunc = function(){
			$scope.search();
		}

		if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
			return;
		}

		var request = new Array($scope.gridOptions.gridApi.selection.getSelectedRows().length);
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			request[row] = $scope.gridOptions.gridApi.selection.getSelectedRows()[row].bolNo;
		}

		api.billOfLadingPrint.issueCancelUpdate(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
				return;
			}
			// 完了後の処理
			successFunc(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint#register
	 * @methodOf oneslogiWms.BillOfLadingPrint.object:BillOfLadingPrint
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	$scope.issue = function() {

		//明細が表示されていない場合
		if($scope.billOfLadingPrintB.length == 0){
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
		api.billOfLadingPrint.getReportId().then(function(response){
			// プリンタ選択画面を表示
			var request = {};
			request.reportId = response;
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
			// プリンタ選択画面を表示
			var modalInstance = printFactory.modalPrint(request);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam){
				var request = {};
				request.data = {};
				request.data.head = $scope.searchCondition;
				request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
				request.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.billOfLadingPrint.print(request).then(function(response){
					if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
						// 正常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー表示
							subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							// 再検索処理
							$scope.search();

						}
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}
				}).catch(function(response){
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
			});
		});

	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);
