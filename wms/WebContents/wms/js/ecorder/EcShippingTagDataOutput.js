/**
 * @ngdoc overview
 * @name oneslogiWms.EcShippingTagDataOutput
 *
 * @description EC送り状データ出力画面<br>
 *
 * EC送り状データ出力表示する画面。
 *
 */
angular.module('oneslogiWms.EcShippingTagDataOutput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.EcShippingTagDataOutput.service:EcShippingTagDataOutputputApi
 *
 * @description EC送り状データ出力画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * ・resources/common/centerClass/keyValueList 取込日/作業日/出荷日 ロップダウンリスト用データ取得WebAPI<br>
 * ・resources/common/deliveryCourse/record 配送コースデータ取得WebAPI<br>
 * ・resources/common/centerClass/keyValueList 出荷ステータスロップダウンリスト用データ取得WebAPI<br>
 * ・resources/common/centerClass/keyValueList 欠品フラグ ロップダウンリスト用データ取得WebAPI<br>
 * ・resources/common/centerClass/keyValueList EC送り状データ作成フラグロップダウンリスト用データ取得WebAPI<br>
 * ・resources/ecorder/importType/keyValueList 取込データ種別ロップダウンリスト用データ取得WebAPI<br>

 * <br>
 * ・resources/ecorder/ecShippingTagDataOutput/initNew 初期データ取得用WebApi<br>
 * ・resources/ecorder/ecShippingTagDataOutput/search 検索結果取得WebAPI<br>
 * ・resources/ecorder/ecShippingTagDataOutput/print 出力ボタンを押下された時に処理WebAPI<br>
 * ・resources/ecorder/ecShippingTagDataOutput/inputCheck 住所変更する時、排他チェック処理WebAPI<br>
 * ・resources/ecorder/ecShippingTagDataOutput/register 住所変更処理WebAPI<br>
 */
.factory('ecShippingTagDataOutputputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dtCls: AngularAPIClient.make([
		                                          ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                          ]
		),
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		shippingStatus: AngularAPIClient.make([
		                                       ['query', 'GET', 'resources/common/centerClass/grpKeyValueList']
		                                       ]
		),
		stockOutFlg: AngularAPIClient.make([
			                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
		                                         ]
		),
		invoiceCreateFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/common/centerClass/keyValueList']
	                                         ]
		),
		importTypeFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/ecorder/importType/keyValueList']
	                                         ]
		),
		ecShippingTagDataOutput: AngularAPIClient.make([
		                                           ['initNew',               'GET',   'resources/ecorder/ecShippingTagDataOutput/initNew'],
		                                           ['search',                'GET',   'resources/ecorder/ecShippingTagDataOutput/search'],
		                                           // [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
		                                           ['checkPrint',            'POST',  'resources/ecorder/ecShippingTagDataOutput/checkPrint'],
		                                           // [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana ENd
		                                           ['print',                 'GET',   'resources/ecorder/ecShippingTagDataOutput/print'],
		                                        // [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo Start
		                                           ['register',              'POST',  'resources/ecorder/ecShippingTagDataOutput/register'],
		                                           ['inputCheck',            'POST',  'resources/ecorder/ecShippingTagDataOutput/inputCheck']
		                                        // [C-CWMS-0024] 住所変更機能を追加 2015.04.08 kyo End
		                                           ]
		),
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.01 miyabe Start
		tagDataType: AngularAPIClient.make([
                                      ['query', 'GET', 'resources/common/centerClass/centerKeyValueList']
                                      ]
		)
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.01 miyabe End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
 *
 * @description EC送り状データ出力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('EcShippingTagDataOutput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'wmsShipCommon', 'ecShippingTagDataOutputputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, wmsShipCommon, api) {

	// グリッドの列情報（デザイン用）
	$scope.ecShippingTagDataOutputputCols = [
	                                 {field:"mimportType.mimportTypeBList[0].mediColumn.medi.ediNm", displayName:"EDI名称"},
	                                 {field:"importDt", displayName:"取込日"},
	                                 {field:"orderNo", displayName:"受注番号"},
	                                 {field:"mimportType.importTypeCd", displayName:"取込データ種別"},
	                                 {field:"mimportType.importTypeNm", displayName:"取込データ種別名称"},
	                                 {field:"priorityFlg", displayName:"優先フラグ"},
	                                 {field:"mcenterClassDtlByPriorityFlg.vdict.dictNm", displayName:"優先フラグ名称"},
	                                 {field:"stockOutFlg", displayName:"欠品フラグ"},
	                                 {field:"stockOutFlgNm", displayName:"欠品フラグ名称"},
	                                 {field:"tshippingInstH.shippingStatus", displayName:"出荷ステータス"},
	                                 {field:"tshippingInstH.mcenterClassDtlByShippingStatus.vdict.dictNm", displayName:"出荷ステータス名称"},
	                                 {field:"tshippingInstH.shippingDt", displayName:"出荷日"},
	                                 {field:"tshippingInstH.workDt", displayName:"作業日"},
	                                 {field:"tecOrderRAsOne.invoiceCreateFlg", displayName:"EC送り状データ出力フラグ"},
	                                 {field:"tecOrderRAsOne.mcenterClassDtlByInvoiceCreateFlg.vdict.dictNm", displayName:"EC送り状データ出力フラグ名称"},
	                                 {field:"delivDt", displayName:"お届け日指定"},
	                                 {field:"delivTz", displayName:"お届け時間帯"},
	                                 {field:"giftFlg", displayName:"ギフトフラグ"},
	                                 {field:"mcenterClassDtlByGiftFlg.vdict.dictNm", displayName:"ギフトフラグ名称"},
	                                 {field:"noshi", displayName:"のし"},
	                                 {field:"delivZipCd", displayName:"送付先郵便番号"},
	                                 {field:"delivAddress1", displayName:"送付先住所：都道府県"},
	                                 {field:"delivAddress2", displayName:"送付先住所：都市区"},
	                                 {field:"tshippingInstH.deliveryCourseCd", displayName:"配送コースCD"},
	                                 {field:"tshippingInstH.mdeliveryCourse.deliveryCourseNm", displayName:"配送コース名称"},
	                                 {field:"delivMethod", displayName:"配送方法"},
	                                 {field:"delivType", displayName:"配送区分"},
	                                 {field:"delivCompany", displayName:"配送会社"}
	                                 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#initScreen
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
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
			if (fromValueString != null &&fromValueString.length > 0 &&
					toValueString != null && toValueString.length > 0 &&
					fromValueString > toValueString) {
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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeMultiSelectGridOptions({
			data: 'ecShippingTagDataOutput',
			columnDefs: 'ecShippingTagDataOutputputCols',
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#initScreenHttp
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDtCls(),//  取込日/作業日/出荷日
				 $scope.deferredGetImportTypeFlg(),// 取込データ種別
				 $scope.deferredGetTagDataTypeList(), // 送り状データ種別
				 $scope.deferredGetStockOutFlg(),// 欠品フラグ
				 $scope.deferredGetshippingStatus(),//出荷ステータス
				 $scope.deferredGetInvoice()//送り状データ作成フラグ
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	}

	// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.06.02 honma Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#clientChange
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、取込種別リストデータを再度取得し画面項目に反映する。
	 * 荷主が空白の場合、取込種別リストデータ再度取得は行わずに空にする。
	 */
	$scope.clientChange = function() {

		var deferred = $q.defer();

		var clientCd = $scope.searchCondition.mclient.clientCd;
		if (isNullOrUndefined(clientCd)) {
			// 検索条件で選択された荷主が空白の場合、取込種別リストを空にする
			$scope.importTypeList = [];
			$scope.searchCondition.mimportType.importTypeCd = null;
			deferred.resolve();

		} else {
			// 取込種別ドロップダウン用取得・設定処理（同期処理）
			$scope.deferredGetImportTypeFlg().then(function(responce){
				if ($scope.importTypeList.length > 0) {
					// 取得した取込種別ドロップダウンリストデータが存在する場合、先頭データを初期表示値として設定

					if ($scope.searchCondition.mimportType.importTypeCd == null) {
						$scope.searchCondition.mimportType.importTypeCd = $scope.importTypeList[0].importTypeCd;
					}
				}
				deferred.resolve();
			});
		}

		return deferred.promise;
	}
	// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.06.02 honma Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deferredGetshippingStatus
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetshippingStatus = function () {
		var deferred = $q.defer();

		var request = {};
		// [#4682][v3.0] 出荷ステータスグループ名を変更 2018.06.05 kawana Start
		request.classGrpCd = "SHIPPING_STATUS_WORKING";
		// [#4682][v3.0] 出荷ステータスグループ名を変更 2018.06.05 kawana End

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deferredGetStockOutFlg
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 欠品フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockOutFlg = function () {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "STOCK_OUT_FLG";

		owsCommon.getDataCacheable(api.stockOutFlg, request).then(function(response){
			$scope.stockOutFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deferredGetInvoice
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 送り状データ作成フラグデータ種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInvoice = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "INVOICE_CREATE_FLG";

		owsCommon.getDataCacheable(api.invoiceCreateFlg, request).then(function(response){
			$scope.invoiceCreateFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deferredGetDtCls
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 取込日/作業日/出荷日取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDtCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DT_CLS";

		owsCommon.getDataCacheable(api.dtCls, request).then(function(response){
			$scope.dtClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deferredGetImportTypeFlg
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 取込データ種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetImportTypeFlg = function () {
		var deferred = $q.defer();

		var request = {};

		// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod Start
		if ($scope.searchCondition) {
			request.clientCd = $scope.searchCondition.mclient.clientCd;
		} else {
			request.clientCd = userInfo.clientCd;
		}
		// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Mod End

		owsCommon.getDataCacheable(api.importTypeFlg, request).then(function(response){
			$scope.importTypeList = response.data.mImportType;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMaster.object:CarrierMaster#deferredGetTagDataType
	 * @methodOf oneslogiWms.CarrierMaster.object:CarrierMaster
	 *
	 * @description 送り状データ種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTagDataTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TAG_DATA_TYPE";
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.01 miyabe Start
		owsCommon.getDataCacheable(api.tagDataType, request).then(function(response) {
		// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.07.01 miyabe End
			$scope.tagDataTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deferredGetInitData
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description EC送り状出力データを取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.ecShippingTagDataOutput.initNew().then(function(response){
			$scope.searchCondition = response.data.search;
			$scope.ecShippingTagDataOutput = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;
			$scope.searchCondition.dtFrom = userInfo.systemDt;
			$scope.searchCondition.dtTo = userInfo.systemDt;

			// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Add Start
			if ($scope.importTypeList.length > 0) {
				// 取得した取込種別ドロップダウンリストデータが存在する場合、先頭データを初期表示値として設定
				$scope.searchCondition.mimportType.importTypeCd = $scope.importTypeList[0].importTypeCd;
			}
			// [#1835][Ver2.2.0] EC受注データ一覧・EC送り状データ出力 - センタ・荷主変更対応 2017.05.31 honma Add End

			// 区分値のデフォルト値設定(必須項目)
			$scope.searchCondition.dtCls = owsCommon.getDefaultValue($scope.dtClsList);
			$scope.searchCondition.tecOrderRAsOne.invoiceCreateFlg = owsCommon.getDefaultValue($scope.invoiceCreateFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
				$scope.search();

			} else if ($scope.screenMode == SCREEN_MODE.Read) {

				$scope.searchCondition.mclient.clientCd = $route.current.params.clientCd;
				$scope.searchCondition.mcenter.centerCd = $route.current.params.centerCd;
				$scope.searchCondition.orderNo = $route.current.params.orderNo;
				$scope.searchCondition.dtCls = String($route.current.params.dtCls);
				$scope.searchCondition.dtFrom = $route.current.params.dtFrom;
				$scope.searchCondition.dtTo = $route.current.params.dtTo;
				$scope.searchCondition.mimportType.importTypeCd = $route.current.params.importType;
				$scope.searchCondition.tshippingInstH.deliveryCourseCd = $route.current.params.deliveryCourseCd;
				$scope.searchCondition.tshippingInstH.deliveryCourseNm = $route.current.params.deliveryCourseNm;
				$scope.searchCondition.tshippingInstH.shippingStatus = $route.current.params.shippingStatus;
				//[#3728][ver3.0] EC受注データ一覧からの遷移時、出力済みのデータも表示されるよう修正 2018.03.02 miyabe add Start
				$scope.searchCondition.tecOrderRAsOne.invoiceCreateFlg = null;
				//[#3728][ver3.0] EC受注データ一覧からの遷移時、出力済みのデータも表示されるよう修正 2018.03.02 miyabe add End

				// [#1865] ログインとは別荷主のデータを選択して画面遷移すると取込種別が空になる問題を修正 2017.06.02 kawana Start

				// 荷主CD変更
				$scope.clientChange().then(function(responce){

					$scope.search();
				});

				// [#1865] ログインとは別荷主のデータを選択して画面遷移すると取込種別が空になる問題を修正 2017.06.02 kawana End
			}

			//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus('searchform');

			deferred.resolve();
		});
	return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deliveryCourse
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description
	 * 配送コースCD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された配送コースCD情報を画面項目に反映する。
	 */
	$scope.deliveryCourse = function(){

		var items = {
				// 配送コースマスタ
				centerCd: $scope.searchCondition.mcenter.centerCd,
				deliveryCourseCd: $scope.searchCondition.tshippingInstH.deliveryCourseCd
		};

		//配送コースCD
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// 配送コードマスタ
			$scope.searchCondition.tshippingInstH.deliveryCourseCd = selectedItem.deliveryCourseCd;
			$scope.searchCondition.tshippingInstH.mdeliveryCourse.deliveryCourseNm = selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#deliveryCourseCdBlur
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
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
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#search
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		api.ecShippingTagDataOutput.search(request).then(function(response) {

			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			// 選択状態をクリアする
			// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
			//owsCommon.toggleSelectAll($scope.gridOptions, false);
			owsCommon.toggleSelectAll($scope.gridOptions, false);
			// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
			$scope.gridOptions.gridViewport.scrollTop(0);
			// 取得したデータをグリッドに表示
			$scope.ecShippingTagDataOutput = response.data.list;
			// トータル件数を設定
			//$scope.gridOptions.totalItems = response.paging.allRecordCount;

			// 検索条件を履歴に保存
			owsHistory.replaceState($scope.searchCondition);
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#getClassForRow
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana Start

		var supplyerStopFlg;
		if(row.entity.tshippingInstH.mcustomerBySupplyCustomerId){
			supplyerStopFlg = row.entity.tshippingInstH.mcustomerBySupplyCustomerId.shippingStopFlg;
		}
		var productStopFlg = row.entity.productShippingStopFlg;
		var allocNgFlg = row.entity.allocNgFlg;

		var shippingStopFlg = '0';
		if (supplyerStopFlg == "1" || productStopFlg == "1" || allocNgFlg == "1") {

			// 出荷停止
			shippingStopFlg = '1'
		}

		var rowInfo = {
			shippingStatus : row.entity.tshippingInstH.shippingStatus,
			shippingStopFlg : shippingStopFlg,
			emergencyFlg : '0',
			stockOutFlg : row.entity.tshippingInstH.stockOutFlg
		};

		return wmsShipCommon.getClassForRow(rowInfo);

		// [#5592][v3.1] グリッド明細行の色判定処理の共通化 2018.11.09 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#csvOutput
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description
	 * データ出力ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに発行・更新データを送信する。
	 */
	$scope.csvOutput = function() {

		//明細が表示されていない場合
		if($scope.ecShippingTagDataOutput.length == 0){
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
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
		// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana Start
		// 入力チェック
		api.ecShippingTagDataOutput.checkPrint(request).then(function(checkResponse){
			// [新WMS-110-062] 実行前にエラーチェックをし確認メッセージを表示する 2015.08.10 kawana End
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			}

			// CSVデータ出力
			api.ecShippingTagDataOutput.print(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					return;
				}

				location.href = response.output.downloadUrl;
				$scope.search();
			});
		});
	};

	// [C-CWMS-0024] 住所変更機能を追加 2015.04.06 kyo Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput#registerAddress
	 * @methodOf oneslogiWms.EcShippingTagDataOutput.object:EcShippingTagDataOutput
	 *
	 * @description
	 * 住所変更ボタン押下処理<br>
	 *
	 * 選択行のEC受注データを修正する為の画面を表示する。
	 */
	$scope.registerAddress = function() {
		// 住所変更ボタンを押下された時に住所変更画面をモーダル表示する

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		// 複数行が選択されている場合、エラーメッセージを表示
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1){
			// 複数行が選択されている場合、エラーメッセージを表示
			alertMessage.setErrorMessageByCode("onlyOneSelect");
			return;
		};

		// ===== 住所変更画面呼び出し =====
		var selectedRow = $scope.gridOptions.gridApi.selection.getSelectedRows()[0];
		var rowIndex = -1;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.ecShippingTagDataOutput.indexOf(row) > -1) {
				rowIndex = $scope.ecShippingTagDataOutput.indexOf(row);
			}
		});

		var items = {
				importDt         : selectedRow.importDt,
				orderNo          : selectedRow.orderNo,
				importType       : selectedRow.mimportType.importTypeCd,
				deliveryCourseCd : selectedRow.tshippingInstH.deliveryCourseCd,
				delivAddress1    : selectedRow.delivAddress1,
				delivAddress2    : selectedRow.delivAddress2,
				delivAddress3    : selectedRow.delivAddress3
		};

		var modalInstance = modalFactory.modalEcDelivAddressModify(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			selectedRow.delivAddress1 = selectedItem.delivAddress1;
			selectedRow.delivAddress2 = selectedItem.delivAddress2;
			selectedRow.delivAddress3 = selectedItem.delivAddress3;

			inputCheckFunc = api.ecShippingTagDataOutput.inputCheck;
			execFunc = api.ecShippingTagDataOutput.register;

			successFunc = function(){
				// 画面再検索処理
				$scope.search();
			}

			var request = {};
			request.data = {};
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

			// 排他チェック
			inputCheckFunc(request).then(function(inputCheckResponse){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(inputCheckResponse, 'searchform')) {
					return;
				}

				// 登録処理
				execFunc(request).then(function(execResponse){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}
					// 完了後の処理
					successFunc(execResponse);
				});
			});
		});
	};
	// [C-CWMS-0024] 住所変更機能を追加 2015.04.06 kyo End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
