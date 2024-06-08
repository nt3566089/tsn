/**
 * @ngdoc overview
 * @name oneslogiWms.EcOrderList
 *
 * @description EC受注データ一覧画面<br>
 *
 * EC受注データ一覧表示する画面。
 *
 */
angular.module('oneslogiWms.EcOrderList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.EcOrderList.service:EcOrderListApi
 *
 * @description EC受注データ一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */
.factory('EcOrderListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		centerClass: AngularAPIClient.make(
			[
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList'],
			 	['getGrpList', 'GET', 'resources/common/centerClass/grpKeyValueList']
			]
		),
		importType: AngularAPIClient.make(
				[
				 	['getList', 'GET', 'resources/ecorder/importType/keyValueList']
				]
			),
		deliveryCourse: AngularAPIClient.make(
			[
				['record', 'GET', 'resources/common/deliveryCourse/record']
			 ]
		),
		ecOrderList: AngularAPIClient.make(
			[
				['init',                        'GET',  'resources/ecorder/ecOrderList/init'],
				['search',                      'GET',  'resources/ecorder/ecOrderList/search'],
				['excel',                       'GET',  'resources/ecorder/ecOrderList/search', 'excel'],
				['checkInstUpdate',             'POST',  'resources/ecorder/ecOrderList/checkInstUpdate'],
				['checkStatementOut',           'POST',  'resources/ecorder/ecOrderList/checkStatementOut'],
				['statementOut',                'GET',   'resources/ecorder/ecOrderList/statementOut'],
				['checkOrderCancel',            'POST',  'resources/ecorder/ecOrderList/checkOrderCancel'],
				['orderCancel',                 'POST',  'resources/ecorder/ecOrderList/orderCancel'],
				['checkErrorDelete',            'POST',  'resources/ecorder/ecOrderList/checkErrorDelete'],
                ['errorDelete',                 'POST',  'resources/ecorder/ecOrderList/errorDelete']
			 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.EcOrderList.object:EcOrderList
 *
 * @description EC受注データ一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('EcOrderList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory','printFactory', 'wmsShipCommon', 'EcOrderListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory,printFactory, wmsShipCommon, api) {

	// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana Start
	// 履歴に保存する情報
	$scope.historyInfo = {
		searchCondition : null,
		searchConditionIsOpen : true,
		selectedRowIndexList : new Array()
	};

	var setSelectedColorIndex = {};
	// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana End

	// グリッドの列情報（デザイン用）
	$scope.ecOrderListCols = [
								{field:"importTypeCd", displayName:"取込データ種別"},
								{field:"importTypeNm", displayName:"取込データ種別名称"},
								{field:"importDt", displayName:"取込日"},
								{field:"orderNo", displayName:"受注番号"},
								{field:"priorityFlg", displayName:"優先フラグ"},
								{field:"priorityFlgNm", displayName:"優先フラグ名称"},
								{field:"shippingStatus", displayName:"出荷ステータス"},
								{field:"shippingStatusNm", displayName:"出荷ステータス名称"},
								{field:"shippingDt", displayName:"出荷日"},
								{field:"workDt", displayName:"作業日"},
								{field:"pickingWorkNo", displayName:"出庫作業No."},
								{field:"statementOutFlg", displayName:"納品書出力フラグ"},
								{field:"statementOutFlgNm", displayName:"納品書出力フラグ名称"},
								{field:"invoiceCreateFlg", displayName:"EC送り状データ出力フラグ"},
								{field:"invoiceCreateFlgNm", displayName:"EC送り状データ出力フラグ名称"},
								{field:"errorFlg", displayName:"エラーフラグ"},
								{field:"errorFlgNm", displayName:"エラーフラグ名称"},
								{field:"stockOutFlg", displayName:"欠品フラグ"},
								{field:"stockOutFlgNm", displayName:"欠品フラグ名称"},
								{field:"orderDt", displayName:"注文日"},
								{field:"orderTime", displayName:"注文時刻"},
								{field:"comment1", displayName:"コメント1"},
								{field:"comment2", displayName:"コメント2"},
								{field:"delivDt", displayName:"お届け日指定"},
								{field:"delivTz", displayName:"お届け時間帯"},
								{field:"delivTzNm", displayName:"お届け時間帯名称"},
								{field:"giftFlg", displayName:"ギフトフラグ"},
								{field:"giftFlgNm", displayName:"ギフトフラグ名称"},
								{field:"noshi", displayName:"のし"},
								{field:"orderZipCd", displayName:"注文者郵便番号"},
								{field:"orderAddress1", displayName:"注文者住所：都道府県"},
								{field:"orderAddress2", displayName:"注文者住所：都市区"},
								{field:"orderAddress3", displayName:"注文者住所：町以降"},
								{field:"orderCustomerNm", displayName:"注文者名称"},
								{field:"orderTelNo", displayName:"注文者電話番号"},
								{field:"delivMatchFlg", displayName:"送付先一致フラグ"},
								{field:"delivMatchFlgNm", displayName:"送付先一致フラグ名称"},
								{field:"mergeId", displayName:"名寄せID"},
								{field:"delivZipCd", displayName:"送付先郵便番号"},
								{field:"delivAddress1", displayName:"送付先住所：都道府県"},
								{field:"delivAddress2", displayName:"送付先住所：都市区"},
								{field:"delivAddress3", displayName:"送付先住所：町以降"},
								{field:"delivCustomerNm", displayName:"送付先名称"},
								{field:"delivTelNo", displayName:"送付先電話番号"},
								{field:"deliveryCourseCd", displayName:"配送コースCD"},
								{field:"deliveryCourseNm", displayName:"配送コース名称"},
								{field:"delivMethod", displayName:"配送方法"},
								{field:"delivType", displayName:"配送区分"},
								{field:"delivCompany", displayName:"配送会社"},
								{field:"errorMessageCd", displayName:"エラーメッセージCD"},
								{field:"errorMessage", displayName:"エラーメッセージ"}
							];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#initScreen
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana Start
		// 検索条件を表示状態に設定
		$scope.searchConditionIsOpen = true;
		// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana End

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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'ecOrderList',
			columnDefs: 'ecOrderListCols',
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#changeClient
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 荷主が変更されたときの処理<br>
	 *
	 * 荷主が変更された場合、取込種別リストデータを再度取得し画面項目に反映する。
	 * 荷主が空白の場合、取込種別リストデータ再度取得は行わずに空にする。
	 */
	$scope.changeClient = function() {

		var clientCd = $scope.searchCondition.mclient.clientCd;
		if (isNullOrUndefined(clientCd)) {
			// 検索条件で選択された荷主が空白の場合、取込種別リストを空にする
			$scope.importTypeList = [];
			$scope.searchCondition.mimportType.importTypeCd = null;
		} else {
			// 取込種別ドロップダウン用取得・設定処理（同期処理）
			$scope.getImportTypeList(clientCd)
			.then(function(responce){
				if ($scope.importTypeList.length > 0) {
					// 取得した取込種別ドロップダウンリストデータが存在する場合、先頭データを初期表示値として設定
					$scope.searchCondition.mimportType.importTypeCd = $scope.importTypeList[0].importTypeCd;
				}
			});
		}
	};
	// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#initScreenHttp
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		$q.all(
				[
				// 各種ドロップダウンリスト用データ設定（同期処理）
				 $scope.getDtClsList(),
				 $scope.getCenterList(),
				 $scope.getClientList(),
				 $scope.getShippingStatusList(),
				 $scope.getImportTypeList(userInfo.clientCd),
				 $scope.getStatementOutFlgList(),
				 $scope.getInvoiceCreateFlgList(),
				 $scope.getErrorFlgList(),
				 $scope.getStockOutFlgList(),
				 $scope.getPriorityFlgList(),
				 $scope.getGiftFlgList(),
				 $scope.getMergeFlgList(),
				 $scope.getCancelDisplayList(),
				 // [C-CWMS-0045] 検索条件にコメント有無を追加 2015.08.03 kawana Start
				 $scope.getCommentFlgList()
				 // [C-CWMS-0045] 検索条件にコメント有無を追加 2015.08.03 kawana End
				]
		)
		.then(function(response) {
			// 初期データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getDtClsList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 取込日/出荷日/作業日 項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getDtClsList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DT_CLS";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.dtClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getCenterList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description センタ項目の選択肢の取得<br>
	 *
	 * 共通変数 userInfoから取得する。
	 */
	$scope.getCenterList = function () {
		// センタリストの設定
		$scope.centerList = userInfo.centerList;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getClientList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 荷主項目の選択肢の取得<br>
	 *
	 * 共通変数 userInfoから取得する。
	 */
	$scope.getClientList = function () {
		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getShippingStatusList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 出荷ステータス項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getShippingStatusList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classGrpCd = "SHIPPING_STATUS_EOL";

		// [#55] コンボボックスの中身が表示されない 2016.10.18 kawana Start
		owsCommon.getDataCacheable(api.centerClass, "getGrpList", request).then(function(response){
		// [#55] コンボボックスの中身が表示されない 2016.10.18 kawana End
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getImportTypeList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 取込データ種別項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getImportTypeList = function (clientCd) {
		var deferred = $q.defer();

		var request = {};
		request.clientCd = clientCd;

		$scope.importTypeList = [];
		owsCommon.getDataCacheable(api.importType, "getList", request).then(function(response){
			$scope.importTypeList = response.data.mImportType;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getStatementOutFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 納品書出力項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getStatementOutFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "LIST_OUT_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.statementOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getInvoiceCreateFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description EC送り状データ出力項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getInvoiceCreateFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVOICE_CREATE_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.invoiceCreateFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getErrorFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description エラーフラグ項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getErrorFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ERROR_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.errorFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getStockOutFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 欠品フラグ項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getStockOutFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		// [EC-CT1-189] 欠品フラグの検索条件を出庫指示一覧にあわせて修正 2015.04.09 kawana Start
		request.classCd = "NO_STOCK_OUT_FLG";
		// [EC-CT1-189] 欠品フラグの検索条件を出庫指示一覧にあわせて修正 2015.04.09 kawana End

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.stockOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getPriorityFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 優先フラグ項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getPriorityFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRIORITY_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.priorityFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getGiftFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description ギフトフラグ項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getGiftFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "GIFT_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.giftFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getMergeFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 名寄せ有無項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getMergeFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MERGE_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.mergeFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getCancelDisplayList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description キャンセルデータ表示項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getCancelDisplayList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CANCEL_DATA_DISPLAY";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.cancelDisplayList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0045] 検索条件にコメント有無を追加 2015.08.03 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getCommentFlgList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description コメント1有無の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getCommentFlgList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COMMENT_FLG";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.commentFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-CWMS-0045] 検索条件にコメント有無を追加 2015.08.03 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#assistDeliveryCourse
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.assistDeliveryCourse = function(){

		// 画面の選択状態を設定
		var items = {
			centerCd: $scope.searchCondition.mcenter.centerCd,
			deliveryCourseCd: $scope.searchCondition.tshippingInstH.deliveryCourseCd
		};

		// 配送コースCD検索画面表示
		var modalInstance = modalFactory.modalDeliveryCourse(items);
		modalInstance.result.then(function(selectedItem){

			// 選択された配送コースを画面に設定
			$scope.searchCondition.tshippingInstH.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.tshippingInstH.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * 配送コースCDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function() {

		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.searchCondition.tshippingInstH.deliveryCourseCd
		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod Start
			request.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod End
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.searchCondition.tshippingInstH.mdeliveryCourse.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.searchCondition.tshippingInstH.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.searchCondition.tshippingInstH.mdeliveryCourse.deliveryCourseNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#deferredGetInitData
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description EC受注データ一覧データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		var request = {};

		api.ecOrderList.init(request).then(function(response){
			$scope.searchCondition = response.data.search;

			// 検索条件 初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.dtFrom = userInfo.systemDt;
			$scope.searchCondition.dtTo = userInfo.systemDt;
			$scope.reportId = response.printBasicData.reportId;

			// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Add Start
			if ($scope.importTypeList.length > 0) {
				$scope.searchCondition.mimportType.importTypeCd = $scope.importTypeList[0].importTypeCd;
			}
			// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Add End

			// 区分値のデフォルト値設定(必須項目)
			$scope.searchCondition.dtCls = owsCommon.getDefaultValue($scope.dtClsList);
			$scope.searchCondition.cancelDisplay = owsCommon.getDefaultValue($scope.cancelDisplayList);

			// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana Start
			// 履歴情報がある場合は再検索
			if (owsHistory.hasState()) {
				// 履歴情報を取得
				$scope.historyInfo = owsHistory.popState();

				if($scope.historyInfo.searchCondition != null) {

					// 履歴から検索条件を置換
					$scope.searchCondition = $scope.historyInfo.searchCondition;
					// 検索条件の表示/非表示の切替
					$scope.searchConditionIsOpen = $scope.historyInfo.searchConditionIsOpen;

					// 検索実行
					$scope.search(true);
				}
			}
			// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana End

			// 検索条件にフォーカス
			owsCommon.setFirstFocus('searchform');

			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana Start

	// 検索条件の開閉状態を監視
	$scope.$watch('searchConditionIsOpen', function() {

		// 現在の検索条件の開閉状態を履歴に保存
		$scope.historyInfo.searchConditionIsOpen = $scope.searchConditionIsOpen;
		owsHistory.replaceState($scope.historyInfo);
	});

	// 明細の選択状態を監視
	$scope.$watch('gridOptions.gridApi.selection.getSelectedRows().length', function(){

		var index = -1;

		$scope.historyInfo.selectedRowIndexList = new Array();

		// 選択行が1行以上の場合はindexを抽出
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 0) {

			for (var rowIndex = 0; rowIndex < $scope.ecOrderList.length; rowIndex++) {
				// 選択されている場合は選択行に追加
				if ($scope.gridOptions.getSelection($scope.gridOptions.gridApi.grid.rows[rowIndex]) == true) {
					$scope.historyInfo.selectedRowIndexList.push(rowIndex);
				}
			}
		}

		// 現在の選択行を履歴に保存
		owsHistory.replaceState($scope.historyInfo);
	});

	// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#search
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(isHistory){

		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		api.ecOrderList.search(request).then(function(response) {

			// 選択状態をクリアする
			// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
			//owsCommon.toggleSelectAll($scope.gridOptions, false);
			owsCommon.toggleSelectAll($scope.gridOptions, false);
			// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

			// スクロール位置を先頭に移動
			$scope.gridOptions.gridViewport.scrollTop(0);

			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				// 取得したデータをグリッドに設定
				$scope.ecOrderList = response.data.list;
				// トータル件数を設定
				$scope.gridOptions.totalItems = response.data.list.length;

				// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana Start

				// 検索条件、選択行を履歴に保存(検索したら選択行をなしにする)
				$scope.historyInfo.searchCondition = angular.copy($scope.searchCondition);
				// 履歴での検索の場合は選択状態をクリアしない
				if (!isHistory) {
					$scope.historyInfo.selectedRowIndexList = new Array();
				}
				owsHistory.replaceState($scope.historyInfo);

				setSelectedColorIndex = {};

				// 履歴に保持した行を再選択
				if ($scope.historyInfo.selectedRowIndexList.length > 0) {

					owsCommon.syncExec(function() {
						// 隠れている検索条件にフォーカスしてしまうため、明示的に検索ボタンにフォーカスする。
						$('#search').focus();

						var doScroll = true;
						for (var i = 0 ; i < $scope.historyInfo.selectedRowIndexList.length ; i++) {
							var selectedIndex = $scope.historyInfo.selectedRowIndexList[i];

							if (selectedIndex < $scope.ecOrderList.length) {

								// 選択行を色付け対象に設定
								setSelectedColorIndex[selectedIndex] = true;

								if(doScroll){
									// 最初の選択行にスクロール
									gridDirectiveControl.scrollingByRowIndexForViewOnlyList($scope.gridOptions, selectedIndex - 1);
									doScroll = false;
								}
							}
						}
					});
				}
				// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana End
			} else {
				$scope.ecOrderList = [];
				$scope.gridOptions.totalItems = 0;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#getClassForRow
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		var inst = row.entity.tshippingInstH;
		if(!inst){
			// 出庫指示が削除されている

			return "wmslegenddarkgray2";
		}

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana Start

		// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana Start
		// [#6936][OSS] ui-grid対応 2019.12.05 kawana Start
		// 前回選択行の色設定
		if (setSelectedColorIndex[$scope.convertRowToRowIndex(row)]) {
			// [#6936][OSS] ui-grid対応 2019.12.05 kawana End
			var rowClass = "wmslegendyellow";

			// [品質検査対応][Ver3.1][#5577] 欠品フラグ取得対象変更 2018.11.07 matsumoto Start
			// 文字色の設定
			if (row.entity.tshippingInstH.stockOutFlg == "1") {
			// [品質検査対応][Ver3.1][#5577] 欠品フラグ取得対象変更 2018.11.07 matsumoto End
				// 欠品
				rowClass = rowClass + " wmslegendblue";
			}

			return rowClass;
		}
		// [C-CWMS-0047] 次画面から戻った時に選択行の色変更と検索条件の開閉状態を再現 2015.07.31 kawana End

		var supplyerStopFlg = "0";
		if (inst.mcustomerBySupplyCustomerId) {
			supplyerStopFlg = inst.mcustomerBySupplyCustomerId.shippingStopFlg;
		}
		var productStopFlg = row.entity.productShippingStopFlg;
		var allocNgFlg = row.entity.allocNgFlg;

		var shippingStopFlg = '0';
		if (supplyerStopFlg == "1"
				|| productStopFlg == "1"
				|| allocNgFlg == "1") {

			// 出荷停止
			shippingStopFlg = '1'
		}

		var rowInfo = {
			shippingStatus : inst.shippingStatus,
			shippingStopFlg : shippingStopFlg,
			emergencyFlg : '0',
			stockOutFlg : row.entity.tshippingInstH.stockOutFlg
		};

		return wmsShipCommon.getClassForRow(rowInfo);

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana End
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#excelOutput
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
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

		api.ecOrderList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#gridDblClick
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	$scope.gridDblClick = function(row) {
		owsCommon.syncButtonExec("instUpdate", row);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#instUpdate
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * 指示修正ボタン押下処理<br>
	 *
	 * 【指示修正】画面へ遷移する。
	 */
	$scope.instUpdate = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		owsCommon.syncExec(function() {

			// 入力チェック
			var request = {};
			request.data = {};
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
			api.ecOrderList.checkInstUpdate(request).then(function(response) {

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					return;
				}

				// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
				// 指示修正画面へ遷移
				$location.path("wms/shipping/ShippingPlanInput").search({})
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
				.search("mode", SCREEN_MODE.Update)
				.search("shippingInstHId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].shippingInstHId);
			});
		});
	};

	// [#5627][v3.1] 「受注データ一括取込」ボタンを削除 2018.11.12 kawana Delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#invoiceCreate
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * EC送り状データ出力ボタン押下処理<br>
	 *
	 * 明細で選択されているデータ内容を引き継ぎ【EC送り状データ出力】画面へ遷移する。
	 */
	$scope.invoiceCreate = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// [#672] EC送り状データ出力画面に遷移前にステータスのチェックを追加 2017.01.25 kawana Start
		// ステータスチェック
		var shippingInstH = $scope.gridOptions.gridApi.selection.getSelectedRows()[0].tshippingInstH;
		if (!shippingInstH) {
			// 出庫指示削除

			alertMessage.setErrorMessageByCode("ecShippingTagDataOutputCannotInvoiceCreateNotShippingError");
			return;
		}

		var shippingStatus = shippingInstH.shippingStatus;
		if (shippingStatus == "10" ||
			shippingStatus == "90" ||
			shippingStatus == "99") {
			// 出庫指示済以外のステータス

			alertMessage.setErrorMessageByCode("ecShippingTagDataOutputCannotInvoiceCreateNotShippingError");
			return;
		}
		// [#672] EC送り状データ出力画面に遷移前にステータスのチェックを追加 2017.01.25 kawana End

		// 引継情報設定
		var param = {};
		var body = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];
		param.mode = SCREEN_MODE.Read;
		param.clientCd = body.mclient.clientCd;
		param.centerCd = body.mcenter.centerCd;
		param.orderNo = body.orderNo;
		param.dtCls = 0;
		param.dtFrom = body.importDt;
		param.dtTo = body.importDt;
		param.importType = body.mimportType.importTypeCd;
		var instH = body.tshippingInstH;
		if (instH) {
			param.deliveryCourseCd = instH.deliveryCourseCd;
			if (instH.mdeliveryCourse) {
				param.deliveryCourseNm = instH.mdeliveryCourse.deliveryCourseNm;
			}
			param.shippingStatus = instH.shippingStatus;
		}

		// EC送り状データ出力画面へ遷移
		$location.path("wms/ecorder/EcShippingTagDataOutput").search(param);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#deliveryCourseShippingList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * 配送コース別出荷進捗ボタン押下処理<br>
	 *
	 * 明細で選択されているデータ内容を引き継ぎ【配送コース別出荷進捗】画面へ遷移する。
	 */
	$scope.deliveryCourseShippingList = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// 引継情報設定
		var param = {};
		var body = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];
		param.mode = SCREEN_MODE.Read;
		param.clientCd = body.mclient.clientCd;
		param.centerCd = body.mcenter.centerCd;
		param.noAllcDisplayFlg = 0;
		param.emergencyFlg = 0;
		var instH = body.tshippingInstH;
		if (instH) {
			param.shippingDtFrom = instH.shippingDt;
			param.shippingDtTo = instH.shippingDt;
			param.deliveryCourseCd = instH.deliveryCourseCd;
			if (instH.mdeliveryCourse) {
				param.deliveryCourseNm = instH.mdeliveryCourse.deliveryCourseNm;
			}

			if (instH.pickingBatchNo) {
				param.pickingBatchNo = instH.pickingBatchNo;
			}
			param.shippingStatus = instH.shippingStatus;
		}

		// 配送コース別出荷進捗画面へ遷移
		$location.path("wms/shipping/DeliveryCourseShippingList").search(param);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#shippingInstList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * 出庫指示一覧ボタン押下処理<br>
	 *
	 * 明細で選択されているデータ内容を引き継ぎ【出庫指示一覧】画面へ遷移する。
	 */
	$scope.shippingInstList = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// 引継情報設定
		var param = {};
		var body = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];
		param.mode = SCREEN_MODE.Read;
		param.clientCd = body.mclient.clientCd;
		param.centerCd = body.mcenter.centerCd;
		param.noAllcDisplayFlg = 0;
		param.emergencyFlg = 0;
		var instH = body.tshippingInstH;
		if (instH) {
			param.workDt = instH.workDt;
			if (instH.pickingBatchNo) {
				param.pickingBatchNo = instH.pickingBatchNo;
			}
			param.shippingStatus = instH.shippingStatus;
			param.deliveryCourseCd = instH.deliveryCourseCd;
			param.supplyCustomerCd = instH.supplyCustomerCd;
			param.supplyCustomerNm = instH.supplyCustomerNm;
			param.clientShippingNo = body.orderNo;
			param.shippingSlipNo = instH.shippingSlipNo;
			if (instH.mdeliveryCourse) {
				param.deliveryCourseNm = instH.mdeliveryCourse.deliveryCourseNm;
			}
			if (instH.tallocInstH) {
				if (instH.tallocInstH.tpickingH) {
					param.pickingWorkNo = instH.tallocInstH.tpickingH.pickingWorkNo;
				}
			}
		}

		// 出庫指示一覧画面へ遷移
		$location.path("wms/shipping/ShippingInstList").search(param);
	};

	// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#productShippingList
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description
	 * 商品別出荷一覧ボタン押下処理<br>
	 *
	 * 明細で選択されているデータ内容を引き継ぎ【商品別出荷一覧】画面へ遷移する。
	 */
	$scope.productShippingList = function() {

		// 複数行が選択されている場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		}

		// 引継情報設定
		var param = {};
		var body = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];
		param.mode = SCREEN_MODE.Update;
		param.clientCd = body.mclient.clientCd;
		param.centerCd = body.mcenter.centerCd;
		param.stockOutFlg = 0;
		param.emergencyFlg = 0;
		var instH = body.tshippingInstH;
		if (instH) {
			param.takingShippingFlg = 0;
			param.workDt = instH.workDt;
			param.shippingSlipNo = instH.shippingSlipNo;
			param.deliveryCourseCd = instH.deliveryCourseCd;
			if (instH.mdeliveryCourse) {
				param.deliveryCourseNm = instH.mdeliveryCourse.deliveryCourseNm;
			}
			if (instH.pickingBatchNo) {
				param.pickingBatchNo = instH.pickingBatchNo;
			}
			param.shippingSlipNo = instH.shippingSlipNo;
			param.supplyCustomerCd = instH.supplyCustomerCd;
			param.supplyCustomerNm = instH.supplyCustomerNm;
			param.clientShippingNo = body.orderNo;
			param.shippingStatus = instH.shippingStatus;
			if (instH.tallocInstH) {
				if (instH.tallocInstH.tpickingH) {
					param.pickingWorkNo = instH.tallocInstH.tpickingH.pickingWorkNo;
				}
			}
		}

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		// 商品別出荷一覧画面へ遷移
		$location.path("wms/shipping/ProductShippingList").search(param);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};
	// [Ver1.1.1] [C-CWMS-0036] 画面名称を変更する、「伝票別出荷一覧」⇒「商品別出荷一覧」 2015.08.31 hayashi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#statementOut()
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 納品書出力ボタン押下処理<br>
	 *
	 * 明細で選択されているデータのお買上明細を出力する。
	 */
	$scope.statementOut = function() {

		owsCommon.syncExec(function() {
			var request = {};
			request.data = {};
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

			// 入力チェック
			api.ecOrderList.checkStatementOut(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// プリンタ選択画面を表示
				var request = {};
				request.reportId = $scope.reportId;
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
					request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
					request.printBasicData = printParam.printBasicData;

					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
					var subWindow;
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfBlankWindow();
					}

					// 発行
					api.ecOrderList.statementOut(request).then(function(response){
						if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
							// 正常

							if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
								// プレビュー表示
								subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
							}
						} else {
							// 異常

							if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
								// プレビュー閉じる
								subWindow = owsCommon.viewPdfCloseWindow(subWindow);
							}
						}

					    // 再検索
					    $scope.search();
						// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana Start
					}).catch(function(response){

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
						// [ON推-品向-601] エラー時にプレビューを閉じる 2015.04.17 kawana End
					});
					// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
				});
			});
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#orderCancel
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 受注キャンセルボタン押下処理<br>
	 *
	 * 選択行の受注をキャンセル処理する。
	 */
	$scope.orderCancel = function() {
		owsCommon.syncExec(function() {
			var request = {};
			request.data = {};
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

			// 入力チェック
			api.ecOrderList.checkOrderCancel(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行の出荷指示キャンセル処理する
				api.ecOrderList.orderCancel(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					$scope.search();
				});
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcOrderList.object:EcOrderList#errorDelete
	 * @methodOf oneslogiWms.EcOrderList.object:EcOrderList
	 *
	 * @description 受注エラー削除ボタン押下処理<br>
	 *
	 * 選択行の受注エラー削除処理する。
	 */
	$scope.errorDelete = function() {
		owsCommon.syncExec(function() {
			var request = {};
			request.data = {};
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

			// 入力チェック
			api.ecOrderList.checkErrorDelete(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行の受注エラー削除処理する。
				api.ecOrderList.errorDelete(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					$scope.search();
				});
			});
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
