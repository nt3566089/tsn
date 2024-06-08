/**
 * @ngdoc overview
 * @name oneslogiWms.ReceiveInput
 *
 * @description
 * 入荷実績入力(予定あり)画面<br>
 *
 * 入荷実績データに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ReceiveInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceiveInput.service:receiveInputApi
 *
 * @description
 * 入荷実績入力(予定あり)画面用WebAPI定義<br>
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
 * ・resources/receive/receiveInput/initNew 画面用初期データ取得WebAPI<br>
 * ・resources/receive/receiveInput/inputCheckRegister 入力チェック（登録）WebAPI<br>
 * ・resources/receive/receiveInput/register 入荷実績登録WebAPI<br>
　// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
　// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 Start
 * ・resources/receive/receiveInput/printProductLabel 商品ラベル発行WebAPI<br>
　// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 End
 * ・resources/receive/receiveInput/printStoreLabel 入庫ラベル発行WebAPI<br>
 * ・resources/receive/receiveInput/searchReportId 帳票ID検索WebAPI<br>
　// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
 */
.factory('receiveInputApi', ['AngularAPIClient', function(AngularAPIClient) {
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
				 ['record', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				 ]
		),
		// [#3347][Ver3.0] TODO残対応(UoM) - ケース、ピース関連処理削除 2018.01.15 honma Mod End
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		receiveInput: AngularAPIClient.make(
				[
				 ['initSearch',         'GET',  'resources/receive/receiveInput/initSearch'],
				 ['inputCheckRegister', 'POST', 'resources/receive/receiveInput/inputCheckRegister'],
				 //[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add Start
				 ['inputCheckLimitDt', 'POST', 'resources/receive/receiveInput/inputCheckLimitDt'],
				 //[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add End
				 ['register',           'POST', 'resources/receive/receiveInput/register'],
				 // [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start
				 ['inputCheckCancel',        'POST', 'resources/receive/receiveInput/inputCheckCancel'],
				 // [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End
				 // [#1755]入庫ラベル最新化 2017.07.24 sampei Start
				 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 Start
                 //['print',              'GET', 'resources/receive/receiveInput/print'],
				 // [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 End
				 ['printProductLabel',  'GET', 'resources/receive/receiveInput/printProductLabel'],
				 ['printStoreLabel',    'GET', 'resources/receive/receiveInput/printStoreLabel'],
				 ['searchReportId',    'GET', 'resources/receive/receiveInput/searchReportId'],
				 // [#1755]入庫ラベル最新化 2017.07.24 sampei End
				 ['cancel',             'POST', 'resources/receive/receiveInput/cancel']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReceiveInput.object:ReceiveInput
 *
 * @description
 * 入荷実績入力(予定あり)用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
.controller('ReceiveInput',   ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'receiveInputApi', '$timeout', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api, $timeout){
// [Ver3.0] unit of measure対応 2017.11.30 潘 End

	// グリッドの列情報（デザイン用）
	$scope.receiveInputCols = [
	                           {field:"treceivePlanB.lineNo", displayName:"No."},
	                           {field:"treceivePlanB.productCd", displayName:"商品CD"},
	                           {field:"treceivePlanB.mproduct.productNm", displayName:"商品名称"},
	                           {field:"treceivePlanB.mproduct.productAbbr", displayName:"商品略称"},
	                           {field:"treceivePlanB.mproduct.janCd", displayName:"JANCD"},
	                           {field:"mlocation.locationCd", displayName:"ロケーション"},
	                           {field:"treceivePlanB.planNum", displayName:"総予定数"},
	                           {field:"storeCaseNum", displayName:"入庫ケース数"},
	                           {field:"storePieceNum", displayName:"入庫バラ数"},
	                           {field:"storeNum", displayName:"総入庫数"},
	                           {field:"limitDt", displayName:"期限日"},
	                           {field:"lot", displayName:"ロット"},
	                           {field:"clientOrderNo", displayName:"顧客発注No."},
	                           {field:"storeLabelNo", displayName:"入庫ラベルNo."},
	                           {field:"storeRecordBComment", displayName:"入庫実績ボディ備考"}

	                           ];

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#initScreen
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
				"mlocation.locationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
		};

		// グリッドの商品コード列、入庫ケース数列、入庫バラ数列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"treceivePlanB.productCd":{
					"ng-blur":{
						eventFunction:"productCdBlur(row.rowIndex)"
					}
				},
				// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 既存ケース/ピース関連処理の削除 2018.02.14 honma Delete
				// [#2799][Ver3.0] unit of measure 対応 2017.12.20 潘 Start
				"storeNum":{
					// [#2799][Ver3.0] unit of measure 対応 2018.02.04 ライ Start
					"ng-blur":{
						eventFunction:"storeNumBlur(row.rowIndex)"
					},
					// [#2799][Ver3.0] unit of measure 対応 2018.02.04 ライ END
					"ng-change":{
						eventFunction:"storeNumChange(row.rowIndex)"
					}
				},
				"storeNumMultiText":{
					"ng-change":{
						eventFunction:"storeNumMultiTextChange(row.rowIndex)"
					}
				},
				// [#2799][Ver3.0] unit of measure 対応 2017.12.20 潘 End
				"mlocation.locationCd":{
					"ng-change":{
						eventFunction:"locationChange(row.rowIndex)"
					}
				},
				"lot":{
					"ng-change":{
						eventFunction:"lotChange(row.rowIndex)"
					}
				},
				"limitDt":{
					//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add Start
					"ng-blur":{
						eventFunction:"limitDtBlur(row.rowIndex)"
					},
					//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add End
					"ng-change":{
						eventFunction:"limitDtChange(row.rowIndex)"
					}
				},
				"clientOrderNo":{
					"ng-change":{
						eventFunction:"clientOrderNoChange(row.rowIndex)"
					}
				},
				"storeLabelNo":{
					"ng-change":{
						eventFunction:"storeLabelNoChange(row.rowIndex)"
					}
				},
				"storeRecordBComment":{
					"ng-change":{
						eventFunction:"storeRecordBCommentChange(row.rowIndex)"
					}
				}
		};

		// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
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
					listModel : "receiveInputB.mproduct.mproductShapeList"
				}
		};
		// グリッド複数荷姿用各種オプション
		$scope.gridMultiTextOptions = [];
		// [Ver3.0] unit of measure対応 2017.11.30 潘 End

		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
		statusInfo.mappingErrorMessage($scope, "planSupplierCd", 9, 7);
		// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mlocation.locationCd",9, 8);
//		statusInfo.mappingGridErrorMessage($scope.gridOptions, "treceivePlanB.productCd",9, 12);
//		statusInfo.mappingGridErrorMessage($scope.gridOptions, "lot",9, 5);
//		statusInfo.mappingGridErrorMessage($scope.gridOptions, "limitDt",9, 5);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#initScreenHttp
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add Start
		gridMultiTextControl.clearMultiTextOptionsList($scope, 'gridMultiTextOptions');
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#processTypeChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#deferredGetInitData
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入荷実績入力(予定あり)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		// 訂正
		var request = {};
		request.receivePlanHId = $route.current.params.receivePlanHId;

		api.receiveInput.initSearch(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {

				// [ON推-品向-818] ユーザ確認でキャンセルボタン押下を考慮 2015.06.15 kawana Start
				// ステータスコード取得
				var statusCode;
				if (response.status.subStatusCode == 0) {
					statusCode = response.status.statusCode;
				} else {
					statusCode = response.status.subStatusCode;
				}

				if (statusCode == 1) {
					// ユーザによる確認

					// 前画面に戻る
                	$timeout(function() {
                		history.back();
                	}, 500);
				} else {

					// 前画面に戻る (メッセージ表示つき)
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				}
				// [ON推-品向-818] ユーザ確認でキャンセルボタン押下を考慮 2015.06.15 kawana End

				deferred.reject();
				return;
			}

			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 Start
			//$scope.printParam = response.data.reportData.printBasicData;
			//$scope.productLabelPrintDto = response.data.reportData;
			$scope.productLabelPrintDto = response.data.productLabelPrintDto;
			// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/07 End
			$scope.storeLabelPrintDto = response.data.storeLabelPrintDto;
			// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
			$scope.receiveInputH = response.data.storeHead; // 入庫実績ヘッダ関連
			$scope.receiveInputB = response.data.storeBody; // 入庫実績明細関連
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

			// 初期値設定
			// [1.1.4-CT-002] 登録したときの入庫日が表示されない 2016.05.11 kawana Start
            //[ON推-品向-455] 予定あり・なし共に入荷日を触れないようにする。また、入荷日のデフォルト値を業務日付とする。2014.12.22 KI Start
			if (!$scope.receiveInputH.treceivePlanH.receivePlanDt) {
				$scope.receiveInputH.treceivePlanH.receivePlanDt = userInfo.systemDt;
			}
			//[ON推-品向-455] 予定あり・なし共に入荷日を触れないようにする。また、入荷日のデフォルト値を業務日付とする。2014.12.22 KI End
			// [1.1.4-CT-002] 登録したときの入庫日が表示されない 2016.05.11 kawana End
			// [ON推-品向-873] 顧客入荷指示No.が空の場合は予定顧客入荷指示No.を初期値設定 2015.07.13 kawana Start
			if ($scope.receiveInputH.clientReceiveNo == null || $scope.receiveInputH.clientReceiveNo == "") {
				$scope.receiveInputH.clientReceiveNo = $scope.receiveInputH.treceivePlanH.planClientReceiveNo;
			}
			// [ON推-品向-873] 顧客入荷指示No.が空の場合は予定顧客入荷指示No.を初期値設定 2015.07.13 kawana End

			// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
			// grid複数荷姿用各種オプション変数への検索データ件数分設定共通処理
			gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, response.data.storeBody.length);
			// [Ver3.0] unit of measure対応 2017.11.30 潘 End

			// 入荷済データのチェック
			var inputCount = 0;
			var allBody = $scope.gridOptions.gridApi.grid.rows;
			for (var row = 0; row < $scope.receiveInputB.length; row++) {
				if($scope.receiveInputB[row].storeRecordBId !== null && $scope.receiveInputB[row].storeRecordBId !== '') {
					inputCount++;
				}
				// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
				// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', response.data.storeBody[row].treceivePlanB.mproduct.productId, response.data.storeBody[row].treceivePlanB.mproduct.mproductShapeList, row);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope,response.data.storeBody[row].storeNum, 'gridMultiTextOptions', 'storeNum', row);
				// [Ver3.0] unit of measure対応 2017.11.30 潘 End
			}

			if (inputCount == $scope.receiveInputB.length) {
				owsCommon.viewAlert("receiveInputFoundCompletedInformation");
			}

			// 行番号振り直し
			updateRowNumber($scope.receiveInputB);

//			$scope.receiveInputH.mprocessType.processTypeCd = owsCommon.getDefaultValue($scope.processTypeList, "processTypeCd");

			// 荷主変更後処理
			$scope.changeClient(false);

			// 仕入先名称の取得
			$scope.customerCdBlur();

			//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi Start
			// 在庫区分の設定
			$scope.receiveInputH.mstockType.stockTypeCd = response.data.storeHead.mstockType.stockTypeCd;
			//【Ver1.1.1】[C-CWMS-0035] 入荷実績入力(予定なし)画面に在庫区分を追加する 2015.08.10 hayashi End

			// 商品の在庫関連情報の入力可否制御（Model,View同期後に実行）
			owsCommon.syncExec(function() {
				for (var i = 0; i < $scope.receiveInputB.length; i++) {
					productManagCurrentRow(i, $scope.receiveInputB[i].treceivePlanB.mproduct.lotManagFlg, $scope.receiveInputB[i].treceivePlanB.mproduct.limitDtManagFlg);
				}
			});

			// [EC-CT1-024] 入庫No.管理有無にかかわらず「明細分割」「分割解除」を押下可能に変更(ボタンのeditable制御を削除) 2015.02.18 kawana

			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
			if ($scope.receiveInputH.treceivePlanH.centerTransitFlg == "1") {
				// センタ間移動の場合は仕入先、在庫区分などは変更不可

				directiveControl.editable($scope, 'clientCd', false);
				directiveControl.editable($scope, 'planSupplierCd', false);
				directiveControl.editable($scope, 'processTypeCd', false);
				directiveControl.editable($scope, 'stockTypeCd', false);
				directiveControl.editable($scope, 'planDepositCd', false);
			}
			// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana End

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#changeClient
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#customerCdBlur
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#showCustomer
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#productBlur
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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

			api.product.record(request).then(function(response){
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productNm = response.data.mProduct.productNm;
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.janCd = response.data.mProduct.janCd;

				// 商品の在庫関連情報の入力可否制御
				productManagCurrentRow(rowIndex, response.data.mProduct.lotManagFlg, response.data.mProduct.limitDtManagFlg);
			});

		} else {
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productNm = null;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productAbbr = null;
			$scope.receiveInputB[rowIndex].treceivePlanB.mproduct.janCd = null;
		}
	};

	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add Start
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
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#showProduct
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex, selectedItem.lotManagFlg, selectedItem.limitDtManagFlg);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#showLocation
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(rowIndex){
		var items = {
				centerCd: $scope.receiveInputH.mcenter.centerCd,
				locationCd: $scope.receiveInputB[rowIndex].mlocation.locationCd
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			$scope.receiveInputB[rowIndex].mlocation.locationCd = selectedItem.locationCd;
			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#locationChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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

	// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 既存ケース/ピース関連処理の削除 2018.02.14 honma Delete

	// [#2799][Ver3.0] unit of measure 対応 2017.12.20 潘 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#storeNumChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入庫数変更処理<br>
	 *
	 * サーバとの通信を行い、入庫数変更処理する。
	 */
	$scope.storeNumChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};
	// [#2799][Ver3.0] unit of measure 対応 2017.12.20 潘 End

	// [#2799][Ver3.0] unit of measure 対応 2017.12.27 潘 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#storeNumMultiTextChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入庫数荷姿変更処理<br>
	 *
	 * サーバとの通信を行い、入庫数荷姿変更処理する。
	 */
	$scope.storeNumMultiTextChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};
	// [#2799][Ver3.0] unit of measure 対応 2017.12.27 潘 End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#lotChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#limitDtChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#clientOrderNoChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
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
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#storeLabelNoChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入庫ラベルNo.変更処理<br>
	 *
	 * サーバとの通信を行い、入庫ラベルNo.変更処理する。
	 */
	$scope.storeLabelNoChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#storeRecordBCommentChange
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入庫実績ボディ備考変更処理<br>
	 *
	 * サーバとの通信を行い、顧客発注No.変更処理する。
	 */
	$scope.storeRecordBCommentChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 既存ケース/ピース関連処理の削除 2018.02.14 honma Delete

	// [Ver3.0] unit of measure対応 2018.02.04 ライ Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#storePieceNumBlur
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入庫数のロストフォーカス処理<br>
	 *
	 * 入庫数は未入力の場合、0に登録する。
	 */
	$scope.storeNumBlur = function(rowIndex) {

		if  (!$scope.receiveInputB[rowIndex].storeNum) {
			$scope.receiveInputB[rowIndex].storeNum = 0;
				// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', $scope.receiveInputB[rowIndex].treceivePlanB.mproduct.productId, $scope.receiveInputB[rowIndex].treceivePlanB.mproduct.mproductShapeList, rowIndex);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope,$scope.receiveInputB[rowIndex].storeNum, 'gridMultiTextOptions', 'storeNum', rowIndex);

		}
	};
	// [Ver3.0] unit of measure対応 2018.02.04 ライ End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#addRow
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		//明細が表示されていない場合
		if($scope.receiveInputB.length == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 複数行の場合に警告
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!owsCommon.viewConfirm("addRowMultipleConfirmation")) {
				return;
			}
		}

		//選択した行のコピー

		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			var copyRow = [] ;
			copyRow.push(angular.copy($scope.gridOptions.gridApi.selection.getSelectedRows()[row]));
			$scope.blankRow = copyRow[0];

			$scope.blankRow.mlocation.locationCd = null;
			$scope.blankRow.treceivePlanB.planNum = 0;
			// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 既存ケース/ピース関連処理の削除 2018.02.14 honma Delete
			$scope.blankRow.storeNum = 0;
			$scope.blankRow.storeLabelNo = null;
			$scope.blankRow.storeRecordBComment = null;
			$scope.blankRow.existFlg = '0';
			$scope.blankRow.storeRecordBId = null;

			$scope.receiveInputB.splice($scope.gridOptions.gridApi.selection.getSelectedRows()[row].treceivePlanB.lineNo, 0, $scope.blankRow);

			// 行番号振り直し
			updateRowNumber($scope.receiveInputB);

		}

		// [Ver3.0] unit of measure対応 2017.11.30 潘 Start
		// grid複数荷姿用各種オプション変数への検索データ件数分設定共通処理
		gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, $scope.receiveInputB.length);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete

		owsCommon.syncExec(function() {
			var allBody = $scope.gridOptions.gridApi.grid.rows;

			for (var i = 0; i < $scope.receiveInputB.length; i++) {
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
				// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', $scope.receiveInputB[i].treceivePlanB.mproduct.productId, $scope.receiveInputB[i].treceivePlanB.mproduct.mproductShapeList, i);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope,$scope.receiveInputB[i].storeNum, 'gridMultiTextOptions', 'storeNum', i);
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
				// 商品コードのロストフォーカス処理
				$scope.productCdBlur(i);

				// コピーの行を選択処理
				if (i >= 1 && i <= allBody.length && ($scope.gridOptions.getSelection(allBody[i-1]) == true)) {
					if ($scope.receiveInputB[i].existFlg == '0') {
						$scope.gridOptions.selectRow(i,true);
					}
				}
			}

		});

	};

	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#removeRow
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		var Item = 0;

		//明細が表示されていない場合
		if($scope.receiveInputB.length == 0)
		{
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		var existRow;
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {

			if (!$scope.gridOptions.gridApi.selection.getSelectedRows()[row].existFlg) {

				existRow = 1;
				break;
			}
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].existFlg == '0') {
				existRow = 0;
			}
		}
		if (existRow == 1) {
			// [SK2-087] メッセージをボタン名にあわせて変更 2014.12.19 kawana Start
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotSplitCancelError");
			// [SK2-087] メッセージをボタン名にあわせて変更 2014.12.19 kawana End
			return;
		}

		// [横並-053] チェック順変更 2014.11.21 zhouj Start
		// 入力済の場合に警告
		// [ON推-品向-474]入力しない場合も、メッセージを表示します。 2014.12.24 KI Start
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			// [EC-CT1-063] 処理の効率化 2015.03.02 kawana Start
			if (!gridDirectiveControl.isBlankRowByEntity($scope.gridOptions, $scope.gridOptions.gridApi.selection.getSelectedRows()[row])) {
			// [EC-CT1-063] 処理の効率化 2015.03.02 kawana End

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

		// [Ver3.0] unit of measure対応 2017.12.28 潘 Start
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Delete
		for (var row = 0; row < $scope.receiveInputB.length; row++) {
			// grid複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'storeNum', $scope.receiveInputB[row].treceivePlanB.mproduct.productId, $scope.receiveInputB[row].treceivePlanB.mproduct.mproductShapeList, row);
			// 該当行の荷姿補助内訳数取得
			owsCommon.getGridCalcAuxiliaryBreakdown($scope,$scope.receiveInputB[row].storeNum, 'gridMultiTextOptions', 'storeNum', row);
		}
		// [Ver3.0] unit of measure対応 2017.12.28 潘 End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#receiveCancel
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 入荷取消ボタン押下処理<br>
	 *
	 * 入荷実績入力の取消処理を行う。
	 */
	$scope.receiveCancel = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		 // [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana Start

		owsCommon.syncExec(function() {

			// 引数作成
			var request = {};
			request.data = {};
			request.data.storeHead = $scope.receiveInputH;

			// 入荷取消チェック
			api.receiveInput.inputCheckCancel(request).then(function(checkResponse){

				// 処理結果確認(確認ダイアログ表示)
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
					return;
				}

				// 入荷取消実行
				api.receiveInput.cancel(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
						return;
					}

					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(execResponse.status.messageCode, execResponse.status.messageReplaceValue);
				});

			});
		});

		 // [ON推-品向-826] 入荷取消時にHT・他端末検品中チェックを追加 2015.06.22 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceiveInput#register
	 * @methodOf oneslogiWms.ReceiveInput.object:ReceiveInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 訂正
		var request = {};
		request.receivePlanHId = $route.current.params.receivePlanHId;

		// [ON推-品向-825] 登録前の排他チェックを追加 2015.06.22 kawana Start
		// 現バージョンNo
		var currentVersionNo = $scope.receiveInputH.treceivePlanH.versionNo;
		// [ON推-品向-825] 登録前の排他チェックを追加 2015.06.22 kawana End

		api.receiveInput.initSearch(request).then(function(response){

			// [ON推-品向-825] 登録前の排他チェックを追加 2015.06.22 kawana Start
			// 業務エラーのクリア
			optionMessageControl.hideAll($scope);
			gridOptionMessageControl.hideAll($scope.gridOptions);

			// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
			// 変更前の情報を退避(登録時に送信)
			$scope.originalStoreHead = response.data.storeHead;
			$scope.originalStoreBody = response.data.storeBody;
			// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

			// 排他チェック(現バージョンNoと比較)
			var selectVersionNo = response.data.storeHead.treceivePlanH.versionNo;
			if (currentVersionNo != selectVersionNo) {
				alertMessage.setErrorMessageByCode("entityAlreadyUpdatedError");
				return;
			}
			// [ON推-品向-825] 登録前の排他チェックを追加 2015.06.22 kawana End

			//  入荷済データ
			var searchList = [];
			for (var row = 0; row < response.data.storeBody.length; row++) {
				if(response.data.storeBody[row].storeRecordBId !== null && response.data.storeBody[row].storeRecordBId !== '') {
					searchList.push(response.data.storeBody[row]);
				}
			}

			// [ON推-品向-825] 業務エラーのクリアを移動 2015.06.22 kawana

			//明細が選択されていない場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
				alertMessage.setErrorMessageByCode("lineNotSelectError");
				return;
			}

			var listBody = [];
			var emptyBody = [];

			// 空行判定
			var allBody = $scope.gridOptions.gridApi.grid.rows;


			for (var row = 0; row < $scope.receiveInputB.length; row++) {

				if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
					// 未選択行への検証機能を解除
					gridDirectiveControl.validity($scope.gridOptions, false, row);
					// 未選択行を退避
					emptyBody.push($scope.receiveInputB[row]);
				}else {
					// 空行以外を退避
					listBody.push($scope.receiveInputB[row]);

					for (var rowSearchList = 0; rowSearchList < searchList.length; rowSearchList++) {
						if ($scope.receiveInputB[row].storeRecordBId == searchList[rowSearchList].storeRecordBId) {

							searchList.splice(rowSearchList,1);
							break;
						}
					}
				}
			}

			// [EC-CT1-062][EC-CT1-063] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.03.02 kawana Start
			var promiseAll = $q.all([
			                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
			                         ]);

			promiseAll.then(function(){
				owsCommon.syncExec(function() {


					// 空行への検証機能解除を解除
					gridDirectiveControl.validity($scope.gridOptions, true);

					//明細が表示されていない場合
					if($scope.receiveInputB.length == 0)
					{
						alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
						return;
					}

					// 入力データ無し
					var blankRow;
					for (var row = 0; row < $scope.receiveInputB.length; row++) {
						if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
							// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
							if (!isNullOrUndefined($scope.receiveInputB[row].storeNum) && owsCommon.isZeroOrGreater($scope.receiveInputB[row].storeNum)) {
								blankRow = 0;
							} else {
								blankRow = 1;
							}
							// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End
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

					// [EC-CT1-064] エラーのときにエラー行までスクロールするように変更 2015.03.02 kawana Start
					var errCnt = 0;
					var errFistIndex;
					var errCdLot = "lotNotInputLotManagementProductError";
					var errCdLimitDt = "limitDateNotInputLimitDateManagementProductError";
					// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Add Start
					var errCdRequired = "requiredError";
					// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.04.11 honma Mod Start
					var errCdCanNotEnterInStoreNumZeroData = "canNotEnterInStoreNumZeroDataError";
					// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.04.11 honma Mod End
					// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Add End

					for (var row = 0; row < $scope.receiveInputB.length; row++) {
						// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod Start
						if (owsCommon.isZero($scope.receiveInputB[row].storeNum)) {
							// ロケーションCD入力不可チェック
							if (!isNullOrUndefined($scope.receiveInputB[row].mlocation.locationCd) && 0 < $scope.receiveInputB[row].mlocation.locationCd.length) {
								errCnt++;
								if (!errFistIndex){
									errFistIndex = row;
								}
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", row)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", row)) {
										gridOptionMessageControl.show($scope.gridOptions, "mlocation.locationCd", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), row);
									}
								}
							}
							// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.04.11 honma Add Start
							// 期限日入力不可チェック
							if (!isNullOrUndefined($scope.receiveInputB[row].limitDt) && 0 < $scope.receiveInputB[row].limitDt.length) {
								errCnt++;
								if (!errFistIndex){
									errFistIndex = row;
								}
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", row)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", row)) {
										gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), row);
									}
								}
							}
							// ロット入力不可チェック
							if (!isNullOrUndefined($scope.receiveInputB[row].lot) && 0 < $scope.receiveInputB[row].lot.length) {
								errCnt++;
								if (!errFistIndex){
									errFistIndex = row;
								}
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", row)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", row)) {
										gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), row);
									}
								}
							}
							// 入庫ラベルNo.入力不可チェック
							if (!isNullOrUndefined($scope.receiveInputB[row].storeLabelNo) && 0 < $scope.receiveInputB[row].storeLabelNo.length) {
								errCnt++;
								if (!errFistIndex){
									errFistIndex = row;
								}
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "storeLabelNo", row)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "storeLabelNo", row)) {
										gridOptionMessageControl.show($scope.gridOptions, "storeLabelNo", $filter('owfMessage')(errCdCanNotEnterInStoreNumZeroData), row);
									}
								}
							}
							// [#4261][Ver3.0] 入荷実績入力(予定あり) - 0入庫データ登録チェック処理不良 2018.04.11 honma Add End
						} else {
							// ロケーションCD必須チェック
							if (isNullOrUndefined($scope.receiveInputB[row].mlocation.locationCd) || 0 == $scope.receiveInputB[row].mlocation.locationCd.length) {
								errCnt++;
								if (!errFistIndex){
									errFistIndex = row;
								}
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", row)) {
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "mlocation.locationCd", row)) {
										gridOptionMessageControl.show($scope.gridOptions, "mlocation.locationCd", $filter('owfMessage')(errCdRequired), row);
									}
								}
							}

							if ($scope.receiveInputB[row].treceivePlanB.mproduct.lotManagFlg == "1"){
								if(!($scope.receiveInputB[row].lot) || 0 == $scope.receiveInputB[row].lot.length) {
									errCnt++;
									if(!errFistIndex){
										errFistIndex = row;
									}
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", row)) {
										if (!gridOptionMessageControl.isShow($scope.gridOptions, "lot", row)) {
											gridOptionMessageControl.show($scope.gridOptions, "lot", $filter('owfMessage')(errCdLot), row);
										}
									}
								}
							}

							if ($scope.receiveInputB[row].treceivePlanB.mproduct.limitDtManagFlg == "1"){
								if(!($scope.receiveInputB[row].limitDt) || 0 == $scope.receiveInputB[row].limitDt.length) {
									errCnt++;
									if(!errFistIndex){
										errFistIndex = row;
									}
									if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", row)) {
										if (!gridOptionMessageControl.isShow($scope.gridOptions, "limitDt", row)) {
											gridOptionMessageControl.show($scope.gridOptions, "limitDt", $filter('owfMessage')(errCdLimitDt), row);
										}
									}
								}
							}
						}
						// [#3584][Ver3.0] 入荷実績入力（予定あり） - 入庫数空値登録で内部エラー 2018.02.14 honma Mod End
					}

					if (0 < errCnt) {
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, errFistIndex);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('inputform');
						return;
					}

					// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、入庫ラベルNOの重複チェックを追加 2014.11.21 fengc Start
					// 入庫ラベルNOの重複チェック
					var j = 0;
					var rowIndex = new Array();
					for (var row = 0; row < $scope.receiveInputB.length; row++) {
						var storeLabelNo = $scope.receiveInputB[row].storeLabelNo;
						for (var i = row+1; i < $scope.receiveInputB.length; i++) {
							if (($scope.receiveInputB[i].storeLabelNo !== null && storeLabelNo !== null)&&($scope.receiveInputB[i].storeLabelNo !== '' && storeLabelNo !== '') && $scope.receiveInputB[i].storeLabelNo == storeLabelNo){
								rowIndex[j] =i;
								j++;
							}
						}
					}
					if (j > 0){
						// エラーメッセージCD
						var messageCd = "onsLabelNumberDuplicateError";
						// 対象の項目にエラーを表示
						gridOptionMessageControl.show($scope.gridOptions, "storeLabelNo", $filter('owfMessage')(messageCd), rowIndex);
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('inputform');
						return;
					}
					// [ON推-CT4-248] 入庫ラベルNO編集可能に変更後、ソースを修正、入庫ラベルNOの重複チェックを追加 2014.11.21 fengc End

					// [EC-CT1-064] エラーのときにエラー行までスクロールするように変更 2015.03.02 kawana End

					var checkFunc;   // 入力チェック関数
					var execFunc;    // データ登録関数
					var successFunc; // 正常終了後関数

					// 新規登録関数を設定
					checkFunc = api.receiveInput.inputCheckRegister;
					execFunc = api.receiveInput.register;

					successFunc = function(response){
						// 前画面へ戻る
						// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 Start
//						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						if (response.data.printFlg == 1) {
							owsCommon.viewAlert(response.status.messageCode, response.status.messageReplaceValue);
						} else {
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						}
						// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/13 End
					}

					// 画面内容を引数に設定
					// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana Start
					var request = {};
					request.data = {};
					request.data.storeHead = $scope.receiveInputH;
					request.data.storeBody = listBody;
					// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana End
					// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana Start
					request.data.originalStoreHead = $scope.originalStoreHead;
					request.data.originalStoreBody = $scope.originalStoreBody;
					// [ON推-品向-1024] 入荷中の商品が出荷された後に別商品の実績を登録した時にエラーとならないように変更 2015.12.18 kawana End

					var receiveQtyAndLimitFlg = "0";

					// 入力チェック
					checkFunc(request).then(function(checkResponse){

						// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
						if (checkResponse.status.listStatus != null) {
							for (var i = 0; i < checkResponse.status.listStatus.length; i++) {
								if (checkResponse.status.listStatus[i].status.subStatusCode == 18) {
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

						// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana Start
						var registBody = [];
						registBody = listBody.concat(searchList);
						request.data.storeBody = registBody;
						// [#291][2.1.0-CT-055] 選択されていないデータの入荷数超えの確認メッセージを表示しない 2016.11.28 kawana End

						// 入荷予定データ登録または更新
						execFunc(request).then(function(execResponse){

							// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
							if (execResponse.status.listStatus != null) {
								for (var i = 0; i < execResponse.status.listStatus.length; i++) {
									if (execResponse.status.listStatus[i].status.subStatusCode == 18) {
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

							// 完了後の処理
							successFunc(execResponse);
							// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
							if (execResponse.data.printFlg == 1) {

								// [#1755]入庫ラベル最新化 2017.07.24 sampei Start
								api.receiveInput.searchReportId(request).then(function(response){
									$scope.printParam = response.data.directionsPrintParam.printBasicData;

								    // プリンタ選択画面を表示
									var modalInstance = printFactory.modalPrint($scope.printParam);

									// モーダル画面が閉じられたら呼ばれるファンクションの登録
									modalInstance.result.then(function(printParam){
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

										requestPrint.printBasicData = printParam.printBasicData;

										// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
										var subWindow;
										if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
											subWindow = owsCommon.viewPdfBlankWindow();
										}

										// 発行
										printApi(requestPrint).then(function(printResponse){
											// [ON推-UT210-003] 直接印刷対応 変更 2016.06.30 By SJA Start
											if (statusInfo.isSuccessAndShowMessage(printResponse, 'inputform')) {
												if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
													subWindow = owsCommon.viewPdf(subWindow, printResponse.output.downloadUrl);
												}

												// [#4656] プレビュー画面への帳票表示よりもアラートが先に表示されてしまう問題の対策 2018.07.03 kawana Start
												owsCommon.viewInfoAndHistoryBack(printResponse.status.messageCode, printResponse.status.messageReplaceValue);
												return;
												// [#4656] プレビュー画面への帳票表示よりもアラートが先に表示されてしまう問題の対策 2018.07.03 kawana End
												// [#173][2.1.0-CT-021] 印刷画面の閉じるボタンを押下しても前画面に戻るように修正(該当コードを移動) 2016.11.02 kawana
												// [ON推-UT210-003] 直接印刷対応 変更 2016.06.30 By SJA End
											} else {
												if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
													subWindow = owsCommon.viewPdfCloseWindow(subWindow);
												}
												// [Ver3.0][#4775] 検品後入庫ラベル出力時のエラーメッセージ設定 2018.06.28 shimizu Start
												owsCommon.viewInfoAndHistoryBack(printResponse.status.messageCode, printResponse.status.messageReplaceValue);
												return ;
												// [Ver3.0][#4775] 検品後入庫ラベル出力時のエラーメッセージ設定 2018.06.28 shimizu End
											}

											// [#4656] プレビュー画面への帳票表示よりもアラートが先に表示されてしまう問題の対策(history.back()処理削除) 2018.07.03 kawana Delete

										}).catch(function(printResponse){
											if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
												subWindow = owsCommon.viewPdfCloseWindow(subWindow);
											}
											// [#173][2.1.0-CT-021] 印刷画面の閉じるボタンを押下しても前画面に戻るように修正 2016.11.02 kawana Start
											// [#88][2.1.0-CT-004] 商品ラベル出力後、前画面に戻ったあとに再検索されるよう修正 2016.11.07 honma Mod Start
	//										history.back();
											owsCommon.syncExec(function() {
												history.back();
											});
											// [#88][2.1.0-CT-004] 商品ラベル出力後、前画面に戻ったあとに再検索されるよう修正 2016.11.07 honma Mod End
											// [#173][2.1.0-CT-021] 印刷画面の閉じるボタンを押下しても前画面に戻るように修正 2016.11.02 kawana End
										});
										// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
									},
									// [#173][2.1.0-CT-021] 印刷画面の閉じるボタンを押下しても前画面に戻るように修正 2016.11.02 kawana Start
									function(printParam){
										// 閉じるボタン押下 など
										owsCommon.syncExec(function() {
											history.back();
										});
									});
									// [#173][2.1.0-CT-021] 印刷画面の閉じるボタンを押下しても前画面に戻るように修正 2016.11.02 kawana End
								});
								// [#1755]入庫ラベル最新化 2017.07.24 sampei End
							}
							// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
						});

						// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End
					});
				});
				// [EC-CT1-062][EC-CT1-063] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.03.02 kawana End
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
		});


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

		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana Start
		// センタ間移動の入荷予定の場合はロット、期限日は入力不可(値は保持)
		if ($scope.receiveInputH.treceivePlanH.centerTransitFlg == "1") {
			gridDirectiveControl.editable($scope.gridOptions, 'lot', false, rowIndex);
			gridDirectiveControl.editable($scope.gridOptions, 'limitDt', false, rowIndex);
			return;
		}
		// [C-CWMS-0039] センタ間移動機能を追加 2015.09.09 kawana End

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
//		var allBody = $scope.gridOptions.gridApi.grid.rows;
//		$scope.gridOptions.$gridScope.selectionProvider.setSelection(allBody[rowIndex],true);

		owsCommon.syncExec(function() {
			$scope.gridOptions.selectRow(rowIndex,true);
		});
	};

	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana Start
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add Start
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
	//[ON推-品質問題点指摘（新ｿﾘV2-024）]修正対応 2016.08.02 chou Add End
	// [ON推-品向-1201] 入荷限界期限日チェック対応の見直し 2016.09.15 kawana End

	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInput#getClassForRow
	 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInput
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
	// [ON推-品向-568] 期限日を過ぎた商品の行の色を変更 2015.04.28 kawana End

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
