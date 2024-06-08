/**
 * @ngdoc overview
 * @name oneslogiWms.ReceiveInputNo
 *
 * @description
 * 入荷実績入力(予定なし)画面<br>
 *
 * 入荷実績データに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ReceiveInputNo', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceiveInputNo.service:receiveInputNoApi
 *
 * @description
 * 入荷実績入力(予定なし)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * supplierCustomer 仕入先データ操作用WebAPI<br>
 * ・resources/common/supplierCustomer/record 単一行データ取得WebAPI<br>
 * <br>
 * processType 処理区分データ操作用WebAPI<br>
 * ・resources/common/processType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * depositCustomer 預託先データ操作用WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * product 商品データ操作用WebAPI<br>
 * ・resources/common/product/record 単一行データ取得WebAPI<br>
 * <br>
 * receiveInput 入荷実績データ操作用WebAPI<br>
 * ・resources/receive/receiveInputNo/initNew 画面用初期データ取得WebAPI<br>
 * ・resources/receive/receiveInputNo/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/receive/receiveInputNo/register 入荷実績登録登録WebAPI<br>
　// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
　// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
 * ・resources/receive/receiveInputNo/printProductLabel 商品ラベル発行WebAPI<br>
　// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
 * ・resources/receive/receiveInputNo/printStoreLabel 入庫ラベル発行WebAPI<br>
 * ・resources/receive/receiveInputNo/searchReportId 帳票ID検索WebAPI<br>
　// [#1755]入庫ラベル最新化 2017.07.24 sampei Start

 */
.factory('receiveInputNoApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),
		processType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/processType/keyValueList']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start
		product: AngularAPIClient.make(
				[
				// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 Start
				 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 End
				 ]
		),
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End
		productShape: AngularAPIClient.make(
				[
				 ['unitNum', 'GET', 'resources/common/productShape/unitNum']
				 ]
		),
		// [エンハンス PH2.0] 入数取得 2015.11.23 sja End
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		receiveInput: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/receive/receiveInputNo/initNew'],
				 ['inputCheckRegister', 'POST', 'resources/receive/receiveInputNo/inputCheckRegister'],
				//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add Start
				 ['inputCheckLimitDt',  'POST', 'resources/receive/receiveInputNo/inputCheckLimitDt'],
				//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add End
				// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
				// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
                 //['print',              'GET', 'resources/receive/receiveInputNo/print'],
				// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
				 ['printProductLabel',  'GET', 'resources/receive/receiveInputNo/printProductLabel'],
				 ['printStoreLabel',    'GET', 'resources/receive/receiveInputNo/printStoreLabel'],
				 ['searchReportId',    'GET', 'resources/receive/receiveInputNo/searchReportId'],
				// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
				 ['register',           'POST', 'resources/receive/receiveInputNo/register']

				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
 *
 * @description
 * 入荷実績入力(予定なし)用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
//.controller('ReceiveInputNo', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'receiveInputNoApi', '$timeout', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, $timeout){
// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 Start
//.controller('ReceiveInputNo', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'receiveInputNoApi', '$timeout', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, $timeout){
.controller('ReceiveInputNo', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'receiveInputNoApi', '$timeout', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, $timeout){
// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 End
// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End

	// グリッドの列情報（デザイン用）
	$scope.receiveInputCols = [
	                           {field:"treceivePlanB.lineNo", displayName:"No."},
	                           {field:"treceivePlanB.productCd", displayName:"商品CD"},
	                           {field:"treceivePlanB.mproduct.productNm", displayName:"商品名称"},
	                           {field:"treceivePlanB.mproduct.productAbbr", displayName:"商品略称"},
	                           {field:"treceivePlanB.mproduct.janCd", displayName:"JANCD"},
	                           {field:"treceivePlanB.planLocationCd", displayName:"ロケーション"},
	                        // 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete
	                           {field:"storeNum", displayName:"総入庫数"},
	                           {field:"limitDt", displayName:"期限日"},
	                           {field:"lot", displayName:"ロット"},
	                           {field:"clientOrderNo", displayName:"顧客発注No."},
	                           {field:"treceivePlanB.planStoreLabelNo", displayName:"入庫ラベルNo."},
	                           {field:"storeRecordBComment", displayName:"入庫実績ボディ備考"}

	                           ];

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#initScreen
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.receiveInputH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託在庫区分リスト変更（同期処理）
			$scope.deferredGetDepositStockTypeList()
			.then(function(response){
				newDepositStockTypeList = response.data;
			});
			//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi Start
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
			});
			//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi End

			// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe Start
			for (var i = 0; i < $scope.receiveInputB.length; i++) {
				var productCd = $scope.receiveInputB[i].treceivePlanB.productCd;
				if (productCd != null && productCd !=""){
					//在庫数データ取得
					$scope.productCdBlur(i);
				}
			}
			// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe End
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.receiveInputH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi Start
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList);
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi End

				// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe Start
				for (var i = 0; i < $scope.receiveInputB.length; i++) {
					var productCd = $scope.receiveInputB[i].treceivePlanB.productCd;;
					if (productCd != null && productCd !=""){
						//在庫数データ取得
						$scope.productCdBlur(i);
					}
				}
				// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe End
			}
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'receiveInputB',
			columnDefs: 'receiveInputCols',
		});

		// グリッドの商品コード、ロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"treceivePlanB.productCd":{
					clickFunction:"showProduct(row.rowIndex)"
				},
				"treceivePlanB.planLocationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
		};

		// グリッドの商品コード列、入庫ケース数列、入庫バラ数列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"treceivePlanB.productCd":{
					"ng-blur":{
						eventFunction:"productCdBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"productCdChange(row.rowIndex)"
					}
				},
				// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete
				"treceivePlanB.planLocationCd":{
					"ng-change":{
						eventFunction:"locationChange(row.rowIndex)"
					}
				},
				"clientOrderNo":{
					"ng-change":{
						eventFunction:"clientOrderNoChange(row.rowIndex)"
					}
				},
				"treceivePlanB.planStoreLabelNo":{
					"ng-change":{
						eventFunction:"planStoreLabelNoChange(row.rowIndex)"
					}
				},
				"storeRecordBComment":{
					"ng-change":{
						eventFunction:"storeRecordBCommentChange(row.rowIndex)"
					}
				},
				"limitDt":{
					//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.01 chou Add Start
					"ng-blur":{
						eventFunction:"limitDtBlur(row.rowIndex)"
					},
					//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.01 chou Add End
					"ng-change":{
						eventFunction:"limitDtChange(row.rowIndex)"
					}
				},
				"lot":{
					"ng-change":{
						eventFunction:"lotChange(row.rowIndex)"
					}
				}
		};

		// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 Start
		// 画面表示用の商品荷姿リスト共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 総数用colCdを定義
				"storeNum" : {
					// 複数荷姿用colCdを定義
					multiTextCd: "storeNumMultiText",
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "treceivePlanB.mproduct.mproductShapeList"
				}
		};
		// グリッド複数荷姿用各種オプション
		$scope.gridMultiTextOptions = [];
		// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 End

		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
		statusInfo.mappingErrorMessage($scope, "planSupplierCd", 8, 6);
		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "treceivePlanB.planLocationCd",8, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "treceivePlanB.productCd",8, 3);
//		statusInfo.mappingGridErrorMessage($scope.gridOptions, "lot",8, 5);
//		statusInfo.mappingGridErrorMessage($scope.gridOptions, "limitDt",8, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "treceivePlanB.planLocationCd",8, 2);
//		statusInfo.mappingGridErrorMessage($scope.gridOptions, "limitDt",8, 7);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#initScreenHttp
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
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
				 $scope.deferredGetProcessTypeList()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add Start
		gridMultiTextControl.clearMultiTextOptionsList($scope, 'gridMultiTextOptions');
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
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

		owsCommon.getDataCacheable(api.processType, "keyValueList", request).then(function(response){
			$scope.processTypeList = response.data;

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
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
		request.clientCd = $scope.receiveInputH.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#processTypeChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 処理区分変更の監視設定（選択内容変更時）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.processTypeChange = function() {
		// 在庫区分の設定
		setStockTypeDefault();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 在庫区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStockTypeList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.receiveInputH.mcenter.centerCd;

		owsCommon.getDataCacheable(api.stockType, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list) {
		$scope.stockTypeList = list;
	};

	// 処理区分より、在庫区分のデフォルトを設定
	var setStockTypeDefault = function() {
		var processTypeCd = $scope.receiveInputH.mprocessType.processTypeCd;
        var j = 0;

		for (var i = 0; i < $scope.processTypeList.length; i++) {
			if (processTypeCd == $scope.processTypeList[i].processTypeCd){
				// 在庫区分の設定
				$scope.receiveInputH.mstockType.stockTypeCd  = $scope.processTypeList[i].stockTypeCd;
				j++;
			}
		}

		// 在庫区分クリア
		if (j == 0){
			$scope.receiveInputH.mstockType.stockTypeCd = null;
		}
	};
	//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#deferredGetInitData
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 入荷実績入力(予定なし)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		// 新規
		api.receiveInput.initNew().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				deferred.reject();
				return;
			}

			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
			// $scope.printParam = response.data.reportData.printBasicData;
			//$scope.productLabelPrintDto = response.data.reportData;
			$scope.productLabelPrintDto = response.data.productLabelPrintDto;
			$scope.storeLabelPrintDto = response.data.storeLabelPrintDto;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			$scope.receiveInputH = response.data.storeHead; // 入庫実績ヘッダ関連
			$scope.receiveInputB = response.data.storeBody; // 入庫実績明細関連
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

			//空行を生成
			for (var i = 0; i < getInitRowNum(); i++) {
				$scope.addRow();
			}

			$scope.receiveInputH.mcenter.centerCd = userInfo.centerCd; // センタの初期値設定
			$scope.receiveInputH.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定
			$scope.receiveInputH.treceivePlanH.receivePlanDt = userInfo.systemDt;

			// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 Start
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
			// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 End

			$scope.receiveInputH.mprocessType.processTypeCd = owsCommon.getDefaultValue($scope.processTypeList, "processTypeCd");

			// 荷主変更後処理
			$scope.changeClient(true);

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.processTypeList.length == 1) {

				$scope.receiveInputH.mprocessType.processTypeCd = $scope.processTypeList[0].processTypeCd;
			}

			//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi Start
			// 在庫区分の設定
			setStockTypeDefault();
			//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi End

			// [新ｿﾘ-089] データ登録後の画面表示が１行目から表示されている 2014.11.21 fengc Start
			$scope.gridOptions.gridViewport.scrollTop(0);
			// [新ｿﾘ-089] データ登録後の画面表示が１行目から表示されている 2014.11.21 fengc End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#changeClient
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {

		// 預託在庫区分リスト変更（同期処理）
		$scope.deferredGetDepositStockTypeList()
		.then(function(response){
			setDepositStockTypeList(response.data, clearSelected);
		});

		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi Start
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data);
		});
		//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#customerCdBlur
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {

		// 入力された仕入先コードを取得
		var customerCd = $scope.receiveInputH.treceivePlanH.planSupplierCd;

		if(customerCd && 0 < customerCd.length) {

			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.receiveInputH.mclient.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){

				$scope.receiveInputH.mcustomerBySupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.receiveInputH.mcustomerBySupplierId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#showCustomer
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var items = {
				clientCd: $scope.receiveInputH.mclient.clientCd,
				vendorCd: $scope.receiveInputH.treceivePlanH.planSupplierCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			$scope.receiveInputH.treceivePlanH.planSupplierCd = selectedItem.customerCd;
			$scope.receiveInputH.mcustomerBySupplierId.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#productBlur
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {

		// 入力された商品コードを取得
		var productCd = $scope.receiveInputB[rowIndex].treceivePlanB.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Delete
			request.clientId = userInfo.clientIdByCd($scope.receiveInputH.mclient.clientCd);
			request.productCd = productCd;

			// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod Start
			api.product.productShape(request).then(function(response){
				if (response.data.mProduct.productId == null){
					gridOptionMessageControl.show($scope.gridOptions, "treceivePlanB.productCd", $filter('owfMessage')("productNotFoundError"), rowIndex);
					$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productNm = null;
					$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productAbbr = null;
					$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.janCd = null;
					$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.lotManagFlg = '0';
					$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.limitDtManagFlg = '0';
					//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
					// 該当行の入数内訳を初期化
					$scope.receiveInputB[rowIndex].unitNumBreakdown = null;
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
					// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
					gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', null, null, rowIndex);
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					// 商品CDBlur時の小数有無チェック共通処理
					gridMultiTextControl.checkDecimalInput($scope, $scope.receiveInputB[rowIndex].storeNum, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', rowIndex);
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
					//[Ver3.0] unit of measure対応 2018.1.21 ライ End
					// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
					checkMaxLimitDt(rowIndex);
					// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

					// 商品の在庫関連情報の入力可否制御
					productManagCurrentRow(rowIndex,'0', '0');
					return;

				}

				// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 Start
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct = response.data.mProduct;
				// 該当行の入数内訳取得
				$scope.receiveInputB[rowIndex].unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);
				// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.receiveInputB[rowIndex].storeNum, 'gridMultiTextOptions', 'storeNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				// 商品CDBlur時の小数有無チェック共通処理
				gridMultiTextControl.checkDecimalInput($scope, $scope.receiveInputB[rowIndex].storeNum, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
				// [Ver3.0] unit of measure対応 2017.12.01 HDIS王 End
				// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End

				// [ON推-品向-383] 商品CD欄でLostFocusするとテキストボックスが赤くなるが、エラーメッセージは表示されない。 2014.12.02 KI Start
				gridOptionMessageControl.hide($scope.gridOptions,"treceivePlanB.productCd",rowIndex);
				// [ON推-品向-383] 商品CD欄でLostFocusするとテキストボックスが赤くなるが、エラーメッセージは表示されない。 2014.12.02 KI End
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productNm = response.data.mProduct.productNm;
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.janCd = response.data.mProduct.janCd;
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.lotManagFlg =  response.data.mProduct.lotManagFlg;
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.limitDtManagFlg =  response.data.mProduct.limitDtManagFlg;
				// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete

				// 商品の在庫関連情報の入力可否制御
				productManagCurrentRow(rowIndex, response.data.mProduct.lotManagFlg, response.data.mProduct.limitDtManagFlg);

				// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete

				// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
				checkMaxLimitDt(rowIndex);
				// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
			});
		} else {
            $scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productNm = null;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productAbbr = null;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.janCd = null;
			//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
			// 該当行の入数内訳を初期化
			$scope.receiveInputB[rowIndex].unitNumBreakdown = null;
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', null, null, rowIndex);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			// 商品CDBlur時の小数有無チェック共通処理
			gridMultiTextControl.checkDecimalInput($scope, $scope.receiveInputB[rowIndex].storeNum, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', rowIndex);
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			//[Ver3.0] unit of measure対応 2018.1.21 ライ End
			// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete
			// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
			checkMaxLimitDt(rowIndex);
			// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
		}
	};

	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.01 chou Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#limitDtBlur
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 期限日のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、期限日をチェックする。
	 */
	$scope.limitDtBlur = function(rowIndex) {
		checkMaxLimitDt(rowIndex);
	};
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.01 chou Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#showProduct
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex){

		var items = {
				clientCd: $scope.receiveInputH.mclient.clientCd,
				productCd: $scope.receiveInputB[rowIndex].treceivePlanB.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.receiveInputB[rowIndex].treceivePlanB.productCd =  selectedItem.productCd;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productNm =  selectedItem.productNm;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productAbbr = selectedItem.productAbbr;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.janCd =  selectedItem.janCd;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.lotManagFlg =  selectedItem.lotManagFlg;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.limitDtManagFlg =  selectedItem.limitDtManagFlg;

			// [エンハンス PH2.0] 入数取得 2015.11.23 sja Start
//			if (0 < selectedItem.mproductShapeList.length) {
//				$scope.receiveInputB[rowIndex].unitNum =  selectedItem.mproductShapeList[0].unitNum;
//			}else {
//				$scope.receiveInputB[rowIndex].unitNum = null;
//			}
			var productId  = selectedItem.productId;
			if(productId != null){
				if (String(productId) && 0 < String(productId).length) {
					var request = {};
					request.clientId = userInfo.clientIdByCd($scope.receiveInputH.mclient.clientCd);
					request.centerId = userInfo.centerIdByCd($scope.receiveInputH.mcenter.centerCd);
					request.productId = productId;
					request.caseFlg = "1";
					api.productShape.unitNum(request).then(function(response){
						if(response.data.mProductShape.unitNum == null){
							$scope.receiveInputB[rowIndex].unitNum = 0;
						}else{
							$scope.receiveInputB[rowIndex].unitNum = response.data.mProductShape.unitNum;
						}
					});
				}
			}else{
				$scope.receiveInputB[rowIndex].unitNum = 0;
			}

			// [エンハンス PH2.0] 入数取得 2015.11.23 sja End

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex, selectedItem.lotManagFlg, selectedItem.limitDtManagFlg);

			// 総入庫数の取得

			// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete
			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
			//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add Start
			checkMaxLimitDt(rowIndex);
			//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add End
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#showLocation
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(rowIndex){

		var items = {
				centerCd: $scope.receiveInputH.mcenter.centerCd,
				locationCd: $scope.receiveInputB[rowIndex].treceivePlanB.planLocationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			$scope.receiveInputB[rowIndex].treceivePlanB.planLocationCd = selectedItem.locationCd;
			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		});
	};
	// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#productCdChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 商品コード変更処理<br>
	 *
	 * サーバとの通信を行い、商品コード変更処理する。
	 */
	$scope.productCdChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};
	// 2017.12.01 [Ver3.0] unit of measure対応 HDIS王 delete
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#locationChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * ロケーション変更処理<br>
	 *
	 * サーバとの通信を行い、ロケーション変更処理する。
	 */
	$scope.locationChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#clientOrderNoChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 顧客発注No.変更処理<br>
	 *
	 * サーバとの通信を行い、顧客発注No.変更処理する。
	 */
	$scope.clientOrderNoChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#planStoreLabelNoChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 入庫ラベルNo.変更処理<br>
	 *
	 * サーバとの通信を行い、入庫ラベルNo.変更処理する。
	 */
	$scope.planStoreLabelNoChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#storeRecordBCommentChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 入庫実績ボディ備考変更処理<br>
	 *
	 * サーバとの通信を行い、入庫実績ボディ備考変更処理する。
	 */
	$scope.storeRecordBCommentChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#limitDtChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 期限日変更処理<br>
	 *
	 * サーバとの通信を行い、期限日変更処理する。
	 */
	$scope.limitDtChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#lotChange
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * ロット変更処理<br>
	 *
	 * サーバとの通信を行い、ロット変更処理する。
	 */
	$scope.lotChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#addRow
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		$scope.receiveInputB.push(angular.copy($scope.blankRow));

		// 行番号振り直し
		updateRowNumber($scope.receiveInputB);
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add Start
		// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
		gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
		owsCommon.syncExec(function() {
			var row = $scope.receiveInputB.length - 1;
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', $scope.receiveInputB[row].treceivePlanB.mproduct.productId, $scope.receiveInputB[row].treceivePlanB.mproduct.mproductShapeList, row);
		});
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add End
	};

	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#removeRow
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		var Item = 0;
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// [横並-053] チェック順変更 2014.11.21 zhouj Start
		// 入力済の場合に警告
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){

			// [EC-CT1-066] 処理の効率化 2015.03.02 kawana Start
			if (!gridDirectiveControl.isBlankRowByEntity($scope.gridOptions, $scope.gridOptions.gridApi.selection.getSelectedRows()[row])) {
			// [EC-CT1-066] 処理の効率化 2015.03.02 kawana End

				Item++;
			}

		}
		if(Item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			// 複数行の場合に警告
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}
		// [横並-053] チェック順変更 2014.11.21 zhouj End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.receiveInputB.indexOf(row) > -1) {
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod Start
				var targetIndex = $scope.receiveInputB.indexOf(row);
				$scope.receiveInputB.splice(targetIndex, 1);
				// grid複数荷姿用各種オプション変数への行削除件数分設定共通処理
				gridMultiTextControl.removeMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, targetIndex);
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod End
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.receiveInputB);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add Start
		for (var row = 0; row < $scope.receiveInputB.length; row++) {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', $scope.receiveInputB[row].treceivePlanB.mproduct.productId, $scope.receiveInputB[row].treceivePlanB.mproduct.mproductShapeList, row);
			$scope.productCdBlur(row);
		}
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#register
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];
		var selectedBody = [];

		// [EC-CT1-066] 処理の効率化 2015.03.02 kawana Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [EC-CT1-066] 処理の効率化 2015.03.02 kawana End


		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.receiveInputB.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {

				// [EC-CT1-066] 処理の効率化(空行検証機能の解除の位置移動) 2015.03.02 kawana

				// 空行を退避
				emptyBody.push($scope.receiveInputB[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.receiveInputB[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.receiveInputB[row]);
			}

			// 選択行を退避
			if (row < allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == true)) {
				selectedBody.push($scope.receiveInputB[row]);
			}
		}

		// [EC-CT1-065][EC-CT1-066] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.03.02 kawana Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [#1024] 未入力行のみにチェックを入れて入力行のチェックを無くすと致命的エラー発生 2017.2.22 kawana Start
				// 明細未入力
				if($scope.receiveInputB.length == 0 || listBody.length == 0) {
					alertMessage.setErrorMessageByCode("detailLineNotInputError");
					return;
				}
				// [#1024] 未入力行のみにチェックを入れて入力行のチェックを無くすと致命的エラー発生 2017.2.22 kawana End

				// 明細が選択されていない場合
				if (selectedBody.length == 0) {
					alertMessage.setErrorMessageByCode("lineNotSelectError");
					return;
				}

				// 入力データ無し
				var blankRow;
				for (var row = 0; row < $scope.receiveInputB.length; row++) {
					if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
						blankRow = 1;
					} else {
						blankRow = 0;
						break;
					}
				}
				if (blankRow == 1) {
					// [EC-CT1-147] メッセージを統一 2015.04.06 kawana Start
					alertMessage.setErrorMessageByCode("noDetailsError");
					// [EC-CT1-147] メッセージを統一 2015.04.06 kawana End
					return;
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod Start
					var targetIndex = $scope.receiveInputB.indexOf(row);
					$scope.receiveInputB.splice(targetIndex, 1);
					$scope.gridMultiTextOptions.splice(targetIndex, 1);
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod End
				});

				// 行番号振り直し
				updateRowNumber($scope.receiveInputB);

				// [#4241] 入庫数のチェックを辞書検証で行うように変更(該当処理を削除) 2018.04.04 kawana

				// ロット、期限日のチェック
				var rowIndexLot = new Array();
				var rowIndexLimitDt = new Array();
				for (var row = 0; row < $scope.receiveInputB.length; row++) {
					if (owsCommon.isNotZero($scope.receiveInputB[row].storeNum)) {
						if ($scope.receiveInputB[row].treceivePlanB.mproduct.lotManagFlg == "1"){
							if(!($scope.receiveInputB[row].lot) || 0 == $scope.receiveInputB[row].lot.length) {
								rowIndexLot[rowIndexLot.length] = row;
							}
						}

						if ($scope.receiveInputB[row].treceivePlanB.mproduct.limitDtManagFlg == "1"){
							if(!($scope.receiveInputB[row].limitDt) || 0 == $scope.receiveInputB[row].limitDt.length) {
								rowIndexLimitDt[rowIndexLimitDt.length] = row;
							}
						}
					}
				}
				var firstIndexLot;
				var firstIndexLimistDt;
				if (0 < rowIndexLot.length) {
					// エラーメッセージCD
					var messageCd = "lotNotInputLotManagementProductError";
					// 対象の項目にエラーを表示
					gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')(messageCd), rowIndexLot);

					firstIndexLot = rowIndexLot[0];
				}

				if (0 < rowIndexLimitDt.length) {
					// エラーメッセージCD
					var messageCd = "limitDateNotInputLimitDateManagementProductError";
					// 対象の項目にエラーを表示
					gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')(messageCd), rowIndexLimitDt);

					firstIndexLimistDt = rowIndexLimitDt[0];
				}

				if (0 < rowIndexLot.length || 0 < rowIndexLimitDt.length) {

					// 最初のエラー箇所までスクロール
					if (!firstIndexLot) {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstIndexLimistDt);
					} else if (!firstIndexLimistDt) {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstIndexLot);
					} else if (firstIndexLot < firstIndexLimistDt) {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstIndexLot);
					} else {
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstIndexLimistDt);
					}

					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// [ON推-品向-231] 商品CD、ロケーションCD、期限日、ロットが重複している場合のチェックを追加 2014.11.20 fengc Start
				//商品CD、ロケーションCD、期限日、ロットが重複している場合
				var flag = false;
				var firstErrIndex;
				for (var row = 0; row < $scope.receiveInputB.length; row++) {
					var productCd = $scope.receiveInputB[row].treceivePlanB.productCd;
					var planLocationCd = $scope.receiveInputB[row].treceivePlanB.planLocationCd;
					var limitDt = $scope.receiveInputB[row].limitDt;
					var lot = $scope.receiveInputB[row].lot;
					// [検査-022] 商品CD、ロケーションCD、期限日、ロットの重複チェック実行時、入庫ラベルNo.の重複チェックも実行。 2014.11.27 fengc Start
					var storeLabelNo = $scope.receiveInputB[row].treceivePlanB.planStoreLabelNo;
					// [検査-022] 商品CD、ロケーションCD、期限日、ロットの重複チェック実行時、入庫ラベルNo.の重複チェックも実行。 2014.11.27 fengc End
					for (var i = row+1; i < $scope.receiveInputB.length; i++) {
						if ($scope.receiveInputB[i].treceivePlanB.productCd == productCd && $scope.receiveInputB[i].treceivePlanB.planLocationCd == planLocationCd && $scope.receiveInputB[i].lot == lot && $scope.receiveInputB[i].limitDt == limitDt){
							flag = true;
							if (!firstErrIndex) {
								firstErrIndex = i;
							}

							if (!gridOptionMessageControl.isShow($scope.gridOptions, "treceivePlanB.productCd", i)) {
								gridOptionMessageControl.show($scope.gridOptions, "treceivePlanB.productCd", $filter('owfMessage')((2, "dataDuplicateError")), i);
							}
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "treceivePlanB.planLocationCd", i)) {
								gridOptionMessageControl.show($scope.gridOptions, "treceivePlanB.planLocationCd", $filter('owfMessage')((2, "dataDuplicateError")), i);
							}
							if ($scope.receiveInputB[i].treceivePlanB.mproduct.lotManagFlg == '1'){
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", i)) {
									gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')((2, "dataDuplicateError")), i);
								}
							}
							if($scope.receiveInputB[i].treceivePlanB.mproduct.limitDtManagFlg == '1') {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", i)) {
									gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')((2, "dataDuplicateError")), i);
								}
							}
						}
						// [検査-022] 商品CD、ロケーションCD、期限日、ロットの重複チェック実行時、入庫ラベルNo.の重複チェックも実行。 2014.11.27 fengc Start
						if (($scope.receiveInputB[i].treceivePlanB.planStoreLabelNo !== null && storeLabelNo !== null)&&($scope.receiveInputB[i].treceivePlanB.planStoreLabelNo !== '' && storeLabelNo !== '') && $scope.receiveInputB[i].treceivePlanB.planStoreLabelNo == storeLabelNo){
							flag = true;
							if (!firstErrIndex) {
								firstErrIndex = i;
							}

							if (!gridOptionMessageControl.isShow($scope.gridOptions, "treceivePlanB.planStoreLabelNo", i)) {
								gridOptionMessageControl.show($scope.gridOptions, "treceivePlanB.planStoreLabelNo", $filter('owfMessage')((2, "onsLabelNumberDuplicateError")), i);
							}
						}
						// [検査-022] 商品CD、ロケーションCD、期限日、ロットの重複チェック実行時、入庫ラベルNo.の重複チェックも実行。 2014.11.27 fengc End
					}
				}

				if (flag){
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstErrIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}
				// [ON推-品向-231] 商品CD、ロケーションCD、期限日、ロットが重複している場合のチェックを追加 2014.11.20 fengc End

				// [EC-CT1-067] エラーのときにエラー行までスクロールするように変更 2015.03.02 kawana End

				// [検査-022] [ON推-CT4-248]に追加の入庫ラベルNOの重複チェックを削除 2014.11.27 fengc

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				// 新規登録関数を設定
				checkFunc = api.receiveInput.inputCheckRegister;
				execFunc = api.receiveInput.register;

				successFunc = function(){
					// 初期化
					$scope.initScreenHttp();
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.storeHead = $scope.receiveInputH;
				request.data.storeBody = listBody;

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					if (checkResponse.status.listStatus != null) {
						for (var i = 0; i < checkResponse.status.listStatus.length; i++) {
							if (checkResponse.status.listStatus[i].status.subStatusCode == 13) {
								// 小数有無チェック共通処理
								gridMultiTextControl.checkDecimalInput($scope, $scope.receiveInputB[checkResponse.status.listStatus[i].status.rowIndex].storeNum, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラー箇所までスクロール
								gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラーにフォーカス
								directiveControl.firstErrorOnFocus('inputform');
								return;
							}
						}
					}
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

					// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start

					// 処理結果確認(確認ダイアログ表示)
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// 入荷予定データ登録または更新
					execFunc(request).then(function(execResponse){

						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
						if (execResponse.status.listStatus != null) {
							for (var i = 0; i < execResponse.status.listStatus.length; i++) {
								if (execResponse.status.listStatus[i].status.subStatusCode == 13) {
									// 小数有無チェック共通処理
									gridMultiTextControl.checkDecimalInput($scope, $scope.receiveInputB[execResponse.status.listStatus[i].status.rowIndex].storeNum, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', execResponse.status.listStatus[i].status.rowIndex);
									// 最初のエラー箇所までスクロール
									gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, execResponse.status.listStatus[i].status.rowIndex);
									// 最初のエラーにフォーカス
									directiveControl.firstErrorOnFocus('inputform');
									return;
								}
							}
						}
						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							return;
						}

						// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 Start
						if (execResponse.data.printFlg == 1) {

							// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
							api.receiveInput.searchReportId(request).then(function(response){
								$scope.printParam = response.data.directionsPrintParam.printBasicData;

								var requestPrint = {};
								requestPrint.data = {};

								var printApi;
								if(response.data.resultAfterProductTarget == "1") {
									// 入庫ラベル
									requestPrint = angular.copy($scope.storeLabelPrintDto);
									requestPrint.data.search.tstoreRecordH = execResponse.data.storeHead
									printApi = api.receiveInput.printStoreLabel;
								}
								if(response.data.resultAfterProductTarget == "2") {
									// 商品ラベル
									requestPrint = angular.copy($scope.productLabelPrintDto);
									requestPrint.data.storeHead = execResponse.data.storeHead;
									printApi = api.receiveInput.printProductLabel;
								}

								// プリンタ選択画面を表示
								var modalInstance = printFactory.modalPrint($scope.printParam);

								// モーダル画面が閉じられたら呼ばれるファンクションの登録
								modalInstance.result.then(function(printParam){

									requestPrint.printBasicData = printParam.printBasicData;

									// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
									var subWindow;
									if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
										subWindow = owsCommon.viewPdfBlankWindow();
									}

									// 発行
									printApi(requestPrint).then(function(printResponse){

										if (statusInfo.isSuccessAndShowMessage(printResponse, 'inputform')) {
											// 正常

											if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
												// プレビュー表示
												subWindow = owsCommon.viewPdf(subWindow, printResponse.output.downloadUrl);
											}
										} else {
											// 異常

											if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
												// プレビュー閉じる
												subWindow = owsCommon.viewPdfCloseWindow(subWindow);
											}
										}

										// 完了後の処理
										successFunc(printResponse);
									}).catch(function(printResponse){
										if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
											subWindow = owsCommon.viewPdfCloseWindow(subWindow);
										}
										directiveControl.editable($scope, 'register', false);
									});
									// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
								});
							});
							// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
						} else {
							// 完了後の処理
							successFunc(execResponse);
						}
							// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/15 End
					});
					// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
				});
			});
		// [EC-CT1-146] 必須エラーのときに空行の必須エラーが消えてしまう 2015.04.01 kawana Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		// [EC-CT1-146] 必須エラーのときに空行の必須エラーが消えてしまう 2015.04.01 kawana End
		});
		// [EC-CT1-065][EC-CT1-066] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.03.02 kawana End
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositStockTypeList.length == 1) {
				$scope.receiveInputH.treceivePlanH.planDepositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.receiveInputH.treceivePlanH.planDepositCd = null;
			}
		}
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.treceivePlanB.lineNo = i++;
		});
	};

	// 現在行の各項目への制御処理
	var productManagCurrentRow = function(rowIndex, lotManagFlg, limitDtManagFlg) {
		if (lotManagFlg == "0") {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', false, rowIndex);
			$scope.receiveInputB[rowIndex].lot = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', true, rowIndex);
		}

		if (limitDtManagFlg == "0") {
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', false, rowIndex);
			$scope.receiveInputB[rowIndex].limitDt = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', true, rowIndex);
		}
	};

	// 明細行のチェック状態を設定
	var rowCheckStatusChange = function(rowIndex) {

		owsCommon.syncExec(function() {
			$scope.gridOptions.selectRow(rowIndex,true);
		});
	};

	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add Start
	// 画面明細行に、商品CD又は期限日を入力する際に、期限日(限界日)チェックを行う
	var checkMaxLimitDt = function(rowIndex) {

		if($scope.receiveInputB[rowIndex].treceivePlanB.mproduct.limitDtManagFlg != "1") {
			// 期限日管理商品ではない

			$scope.receiveInputB[rowIndex].maxLimitDt = null;
			$scope.receiveInputB[rowIndex].limitDtNgFlg = "0";
			return;
		}

		// パラメータ作成
		var request = {};
		request.data = {};
		request.data.storeHead = $scope.receiveInputH;
		var listBody = [];
		listBody.push($scope.receiveInputB[rowIndex]);
		request.data.storeBody = listBody;

		// 期限日(限界日)チェック
		api.receiveInput.inputCheckLimitDt(request).then(function(response) {

			// 明細行に適用
			$scope.receiveInputB[rowIndex].maxLimitDt = response.data.storeBody[0].maxLimitDt;
			$scope.receiveInputB[rowIndex].limitDtNgFlg = response.data.storeBody[0].limitDtNgFlg;
		});
	};
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.07.26 chou Add End
	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#getClassForRow
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 */
	$scope.getClassForRow = function(row) {
		var color;

		// 限界期限日より前の期限日
		if (row.entity.limitDtNgFlg == "1") {
			color = "wmslegendblue";
		}

		return color;
	};
	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.27 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
