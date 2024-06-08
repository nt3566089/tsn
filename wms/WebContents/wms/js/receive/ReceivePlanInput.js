/**
 * @ngdoc overview
 * @name oneslogiWms.ReceivePlanInput
 *
 * @description
 * 入荷予定入力画面<br>
 *
 * 入荷予定データに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ReceivePlanInput', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ReceivePlanInput.service:receivePlanInputApi
 *
 * @description
 * 入荷予定入力画面用WebAPI定義<br>
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
 * receivePlan 入荷予定データ操作用WebAPI<br>
 * ・resources/receive/receivePlanInput/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/receive/receivePlanInput/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/receive/receivePlanInput/inputCheckRegister 登録前入力チェックWebAPI<br>
 * ・resources/receive/receivePlanInput/register 入力データ登録WebAPI<br>
 * ・resources/receive/receivePlanInput/inputCheckUpdate 更新前入力チェックWebAPI<br>
 * ・resources/receive/receivePlanInput/update 入力データ更新WebAPI<br>
 */
.factory('receivePlanInputApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		supplierCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/supplierCustomer/record']
				 ]
		),

		//荷主センタ変更対応 201７.02.24 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.24 sja End

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
		// [#45] 使用されていないコードを削除(ログインユーザ倉庫の取得) 2016.11.01 kawana
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record'],
				// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
				 ['productShape', 'GET', 'resources/common/product/productRecordwithProductShapewithShapeGrpDtl']
				// [Ver3.0] unit of measure対応 2017.11.28 潘 End
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		receivePlan: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/receive/receivePlanInput/initNew'],
				 ['initUpdate',         'GET',  'resources/receive/receivePlanInput/initUpdate'],
				 ['inputCheckRegister', 'POST', 'resources/receive/receivePlanInput/inputCheckRegister'],
				 ['register',           'POST', 'resources/receive/receivePlanInput/register'],
				 ['inputCheckUpdate',   'POST', 'resources/receive/receivePlanInput/inputCheckUpdate'],
				 ['update',             'POST', 'resources/receive/receivePlanInput/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
 *
 * @description
 * 入荷予定入力画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
	// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
.controller('ReceivePlanInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'receivePlanInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){
	// [Ver3.0] unit of measure対応 2017.11.28 潘 End
	// グリッドの列情報（デザイン用）
	$scope.receivePlanCols = [
	                          {field:"lineNo", displayName:"No."},
	                          {field:"productCd", displayName:"商品CD"},
	                          {field:"productNm", displayName:"商品名称"},
	                          {field:"productAbbr", displayName:"商品略称"},
	                          {field:"janCd", displayName:"JANCD"},
	                          {field:"planNum", displayName:"予定数"},
	                          {field:"planWarehouseCd", displayName:"予定倉庫"},
	                          {field:"planLocationCd", displayName:"予定ロケーション"},
	                          {field:"planLot", displayName:"予定ロット"},
	                          {field:"planLimitDt", displayName:"予定期限日"},
	                          {field:"planClientOrderNo", displayName:"予定顧客発注番号"},
	                          {field:"planStoreLabelNo", displayName:"予定入庫ラベルNo."}
	                          ];

	var oldClient;
	var newDepositStockTypeList;
	var newStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#initScreen
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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

		// 倉庫リストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.receivePlanH.mclient.clientCd;
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
			for (var i = 0; i < $scope.receivePlanB.length; i++) {
				var productCd = $scope.receivePlanB[i].productCd;
				if (productCd != null && productCd !=""){
					//在庫数データ取得
					$scope.productCdBlur(i);
				}
			}
			// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe End
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.receivePlanH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setDepositStockTypeList(newDepositStockTypeList, true);
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi Start
				// 選択した荷主で取得済みの在庫区分リストを設定
				setStockTypeList(newStockTypeList);
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi End

				// [#1884] [1.33 品質向上対応]  荷主変更時の不具合対応 2017.06.08 miyabe Start
				for (var i = 0; i < $scope.receivePlanB.length; i++) {
					var productCd = $scope.receivePlanB[i].productCd;
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
			data: 'receivePlanB',
			columnDefs: 'receivePlanCols',
		});

		// グリッドの商品コード、ロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"productCd":{
					clickFunction:"showProduct(row.rowIndex)"
				},
				"planLocationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
		};

		// グリッドの商品コード列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"productCd":{
					"ng-blur":{
						eventFunction:"productCdBlur(row.rowIndex)"
					},
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planWarehouseCd":{
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planLocationCd":{
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planLot":{
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planLimitDt":{
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planClientOrderNo":{
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planNum":{
					"ng-blur":{
						eventFunction:"planNumBlur(row.rowIndex)"
					},
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
				"planStoreLabelNo":{
					// [ON推-品向-287] データ変更後、チェックしないようにチェック処理を削除する。 2014.11.28 KI
				},
		};

		// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
		// 画面表示用の商品荷姿リスト共通作成処理
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 総数用colCdを定義
				"planNum" : {
					// 複数荷姿用colCdを定義
					multiTextCd: "planNumMultiText",
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "receivePlanB.mproduct.mproductShapeList"
				}
		};
		// グリッド複数荷姿用各種オプション
		$scope.gridMultiTextOptions = [];
		// [Ver3.0] unit of measure対応 2017.11.28 潘 End

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"planWarehouseCd" : {
					key : "warehouseCd",
					value : "warehouseNm",
					listModel : "warehouseList"
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planLocationCd",6, 4);
		// [検査-001] エラーをロケーションに表示を変更 2014.11.21 fengc Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planLocationCd",6, 8);
		// [検査-001] エラーをロケーションに表示を変更 2014.11.21 fengc End
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "planWarehouseCd",6, 9);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}
	//荷主センタ変更対応 201７.02.24 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 倉庫リスト変更（同期処理）
		$scope.deferredGetWarehouseCdList();
		$scope.planWarehouseCdChange();
	};
	//荷主センタ変更対応 201７.02.24 sja End
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#initScreenHttp
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
				 //荷主センタ変更対応 201７.02.24 sja Start
				 ,$scope.deferredGetWarehouseCdList()
				//荷主センタ変更対応 201７.02.24 sja End
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

	//荷主センタ変更対応 201７.02.24 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.receivePlanH) {
			request.centerId = userInfo.centerIdByCd($scope.receivePlanH.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.24 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetProcessTypeList
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetDepositStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
		request.clientCd = $scope.receivePlanH.mclient.clientCd;

		owsCommon.getDataCacheable(api.depositCustomer, "keyValueList", request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.07 hayashi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#processTypeChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
		request.clientCd = $scope.receivePlanH.mcenter.centerCd;

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
		var processTypeCd = $scope.receivePlanH.mprocessType.processTypeCd;
        var j = 0;

		for (var i = 0; i < $scope.processTypeList.length; i++) {
			if (processTypeCd == $scope.processTypeList[i].processTypeCd){
				// 在庫区分の設定
				$scope.receivePlanH.mstockType.stockTypeCd  = $scope.processTypeList[i].stockTypeCd;
				j++;
			}
		}

		// 在庫区分クリア
		if (j == 0){
			$scope.receivePlanH.mstockType.stockTypeCd = null;
		}
	};
	//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.07 hayashi End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deferredGetInitData
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 入荷予定データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

			// 訂正
			var request = {};
			request.receivePlanHId = $route.current.params.receivePlanHId;
			api.receivePlan.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// [#1823] 予定修正でセンタ、荷主を変更するとWMS伝票No.が重複してしまう 2017.05.24 kawana Start

				// 更新時はセンタ・荷主変更不可
				directiveControl.editable($scope, 'centerCd', false);
				directiveControl.editable($scope, 'clientCd', false);

				// [#1823] 予定修正でセンタ、荷主を変更するとWMS伝票No.が重複してしまう 2017.05.24 kawana End

				$scope.receivePlanH = response.data.head; // 入荷予定ヘッダ関連
				$scope.receivePlanB = response.data.body; // 入荷予定明細関連
				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				// 行番号振り直し
				updateRowNumber($scope.receivePlanB);

				// 荷主変更後処理
				$scope.changeClient(false);
				//荷主センタ変更対応 2017.03.06 sja Start
				$scope.deferredGetWarehouseCdList();
				//荷主センタ変更対応 2017.03.06 sja End
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.10 hayashi Start
				$scope.receivePlanH.mstockType.stockTypeCd = response.data.head.mstockType.stockTypeCd;
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.10 hayashi End

				// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
				// grid複数荷姿用各種オプション変数への検索データ件数分設定共通処理
				gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, response.data.body.length);
				for (var i = 0; i < $scope.receivePlanB.length; i++) {
					// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
					gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', response.data.body[i].mproduct.productId, response.data.body[i].mproduct.mproductShapeList, i);
					// 該当行の荷姿補助内訳数取得
					owsCommon.getGridCalcAuxiliaryBreakdown($scope,response.data.body[i].planNum, 'gridMultiTextOptions', 'planNum', i);
				}
				// [Ver3.0] unit of measure対応 2017.11.28 潘 End

				// 商品の在庫関連情報の入力可否制御（Model,View同期後に実行）
				owsCommon.syncExec(function() {
					for (var i = 0; i < $scope.receivePlanB.length; i++) {
						productManagCurrentRow(i, $scope.receivePlanB[i].mproduct.lotManagFlg, $scope.receivePlanB[i].mproduct.limitDtManagFlg);
					}
				});

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.receivePlan.initNew().then(function(response){


				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				$scope.receivePlanH = response.data.head; // 入荷予定ヘッダ関連
				$scope.receivePlanB = response.data.body; // 入荷予定明細関連
				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				//空行を生成
				for (var i = 0; i < getInitRowNum(); i++) {
					$scope.addRow();
				}

				$scope.receivePlanH.mcenter.centerCd = userInfo.centerCd; // センタの初期値設定
				$scope.receivePlanH.mclient.clientCd = userInfo.clientCd; // 荷主の初期値設定
				// [C-NIS-0008] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
				if (response.data.planDtDefFlg == 1) {
					$scope.receivePlanH.receivePlanDt = userInfo.systemDt;
				}
				// [C-NIS-0008] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End
				$scope.receivePlanH.mprocessType.processTypeCd = owsCommon.getDefaultValue($scope.processTypeList, "processTypeCd");

				// 荷主変更後処理
				$scope.changeClient(true);

				// 選択肢が一つの場合は一つ目を設定
				if ($scope.processTypeList.length == 1) {
					$scope.receivePlanH.mprocessType.processTypeCd = $scope.processTypeList[0].processTypeCd;
				}

				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi Start
				// 在庫区分の設定
				setStockTypeDefault();
				//【Ver1.1.1】[C-CWMS-0035] 入荷予定入力画面に在庫区分を追加する 2015.08.12 hayashi End

				// [新ｿﾘ-089] データ登録後の画面表示が１行目から表示されている 2014.11.21 fengc Start
				$scope.gridOptions.gridViewport.scrollTop(0);
				// [新ｿﾘ-089] データ登録後の画面表示が１行目から表示されている 2014.11.21 fengc End

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
				// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
				// [Ver3.0] unit of measure対応 2017.11.28 潘 End
			});

		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#changeClient
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#customerCdBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 仕入先コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function() {
		// 入力された仕入先コードを取得
		var customerCd = $scope.receivePlanH.planSupplierCd;

		if(customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.receivePlanH.mclient.clientCd);
			request.customerCd = customerCd;

			// 仕入先情報の取得
			api.supplierCustomer.record(request).then(function(response){
				$scope.receivePlanH.mcustomerByPlanSupplierId.customerNm = response.data.mCustomer.customerNm;
			});

		} else {
			$scope.receivePlanH.mcustomerByPlanSupplierId.customerNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showCustomer
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 仕入先コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された仕入先情報を画面項目に反映する。
	 */
	$scope.showCustomer = function(){

		var items = {
				clientCd: $scope.receivePlanH.mclient.clientCd,
				vendorCd: $scope.receivePlanH.planSupplierCd
		};

		// 仕入先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalVendor(items);


		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			$scope.receivePlanH.planSupplierCd = selectedItem.customerCd;

			$scope.receivePlanH.mcustomerByPlanSupplierId.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#productBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品コードを取得
		var productCd = $scope.receivePlanB[rowIndex].productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.receivePlanH.mclient.clientCd);
			request.productCd = productCd;

			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			api.product.productShape(request).then(function(response){
				if (response.data.mProduct.productId == null){
					gridOptionMessageControl.show($scope.gridOptions, "productCd", $filter('owfMessage')("productNotFoundError"), rowIndex);
					$scope.receivePlanB[rowIndex].mproduct.productNm = null;
					$scope.receivePlanB[rowIndex].mproduct.productAbbr = null;
					$scope.receivePlanB[rowIndex].mproduct.janCd = null;
					//[Ver3.0] unit of measure対応 2018.1.21 ライ Start
					// 該当行の入数内訳を初期化
					$scope.receivePlanB[rowIndex].unitNumBreakdown = null;
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
					$scope.receivePlanB[rowIndex].mproduct.productId = response.data.mProduct.productId;
					$scope.receivePlanB[rowIndex].mproduct.mproductShapeList = response.data.mProduct.mproductShapeList;
					// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
					gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
					// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					// 商品CDBlur時の小数有無チェック共通処理
					gridMultiTextControl.checkDecimalInput($scope, $scope.receivePlanB[rowIndex].planNum, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', rowIndex);
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
					//[Ver3.0] unit of measure対応 2018.1.21 ライ End

					// 商品の在庫関連情報の入力可否制御
					productManagCurrentRow(rowIndex,'0', '0');
					return;
				}
				// [Ver3.0] unit of measure対応 2017.11.28 潘 Start
				$scope.receivePlanB[rowIndex].mproduct = response.data.mProduct;
				// 該当行の入数内訳取得
				$scope.receivePlanB[rowIndex].unitNumBreakdown = owsCommon.getUnitNumBreakdown(response.data.mProduct.productId, response.data.mProduct.mproductShapeList, response.data.mProduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg);
				// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', response.data.mProduct.productId, response.data.mProduct.mproductShapeList, rowIndex);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.receivePlanB[rowIndex].planNum, 'gridMultiTextOptions', 'planNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
				// 商品CDBlur時の小数有無チェック共通処理
				gridMultiTextControl.checkDecimalInput($scope, $scope.receivePlanB[rowIndex].planNum, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', rowIndex);
				// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
				// [Ver3.0] unit of measure対応 2017.11.28 潘 End

				// [ON推-品向-383] 商品CD欄でLostFocusするとテキストボックスが赤くなるが、エラーメッセージは表示されない。 2014.12.02 KI Start
				gridOptionMessageControl.hide($scope.gridOptions,"productCd",rowIndex);
				// [ON推-品向-383] 商品CD欄でLostFocusするとテキストボックスが赤くなるが、エラーメッセージは表示されない。 2014.12.02 KI End
				$scope.receivePlanB[rowIndex].mproduct.productNm = response.data.mProduct.productNm;
				$scope.receivePlanB[rowIndex].mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.receivePlanB[rowIndex].mproduct.janCd = response.data.mProduct.janCd;
				// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
				$scope.receivePlanB[rowIndex].mproduct = response.data.mProduct;
				// [Ver3.0] unit of measure対応 2017.12.4 潘 End

				// 商品の在庫関連情報の入力可否制御
				productManagCurrentRow(rowIndex, response.data.mProduct.lotManagFlg, response.data.mProduct.limitDtManagFlg);
			});
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		} else {
			$scope.receivePlanB[rowIndex].mproduct.productNm = null;
			$scope.receivePlanB[rowIndex].mproduct.productAbbr = null;
			$scope.receivePlanB[rowIndex].mproduct.janCd = null;
			// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
			// 該当行の入数内訳を初期化
			$scope.receivePlanB[rowIndex].unitNumBreakdown = null;
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			$scope.receivePlanB[rowIndex].mproduct.productId = null;
			// 該当行の複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', null, null, rowIndex);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
			// 商品CDBlur時の小数有無チェック共通処理
			gridMultiTextControl.checkDecimalInput($scope, $scope.receivePlanB[rowIndex].planNum, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', rowIndex);
			// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
			// [Ver3.0] unit of measure対応 2017.12.4 潘 End

		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showProduct
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex){

		var items = {
				clientCd: $scope.receivePlanH.mclient.clientCd,
				productCd: $scope.receivePlanB[rowIndex].productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.receivePlanB[rowIndex].productCd =  selectedItem.productCd;
			$scope.receivePlanB[rowIndex].mproduct.productNm =  selectedItem.productNm;
			$scope.receivePlanB[rowIndex].mproduct.productAbbr = selectedItem.productAbbr;
			$scope.receivePlanB[rowIndex].mproduct.janCd =  selectedItem.janCd;

			// 商品の在庫関連情報の入力可否制御
			productManagCurrentRow(rowIndex, selectedItem.lotManagFlg, selectedItem.limitDtManagFlg);

			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showLocation
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(rowIndex){

		var items = {
				centerCd: $scope.receivePlanH.mcenter.centerCd,
				locationCd: $scope.receivePlanB[rowIndex].planLocationCd,
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
				warehouseCd: $scope.receivePlanB[rowIndex].planWarehouseCd
				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.receivePlanB[rowIndex].planLocationCd = selectedItem.locationCd;

			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planNumBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定数のロストフォーカス処理<br>
	 *
	 */
	$scope.planNumBlur = function(rowIndex) {
		// 入力された予定数を取得
//		var planNum = $scope.receivePlanB[rowIndex].planNum;
//		if(planNum && 0 == parseInt(planNum)) {
//		var err = "minIsOneError";
//		if (!gridOptionMessageControl.isShow($scope.gridOptions, "planNum", rowIndex)) {
//		if (!gridOptionMessageControl.isShow($scope.gridOptions, "planNum", rowIndex)) {
//		gridOptionMessageControl.show($scope.gridOptions, "planNum", $filter('owfMessage')((2, err)), rowIndex);
//		}
//		}
//		}
//		return;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#productCdChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品変更処理<br>
	 *
	 * サーバとの通信を行い、商品変更処理する。
	 */
	$scope.productCdChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#productCdChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 商品変更処理<br>
	 *
	 * サーバとの通信を行い、商品変更処理する。
	 */
	$scope.productCdChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planWarehouseCdChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定倉庫変更処理<br>
	 *
	 * サーバとの通信を行い、予定倉庫変更処理する。
	 */
	$scope.planWarehouseCdChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planLocationCdChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定ロケーション変更処理<br>
	 *
	 * サーバとの通信を行い、予定ロケーション変更処理する。
	 */
	$scope.planLocationCdChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planLotChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定ロット変更処理<br>
	 *
	 * サーバとの通信を行い、予定ロット変更処理する。
	 */
	$scope.planLotChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planLimitDtChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定期限日変更処理<br>
	 *
	 * サーバとの通信を行い、予定期限日変更処理する。
	 */
	$scope.planLimitDtChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planClientOrderNoChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定顧客発注番号変更処理<br>
	 *
	 * サーバとの通信を行い、予定顧客発注番号変更処理する。
	 */
	$scope.planClientOrderNoChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planStoreLabelNo
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 入庫ラベルNO変更処理<br>
	 *
	 * サーバとの通信を行い、入庫ラベルNO変更処理する。
	 */
	$scope.planStoreLabelNoChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceiveInput.object:ReceivePlanInput#planNumChange
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 予定数変更処理<br>
	 *
	 * サーバとの通信を行い、予定数変更処理する。
	 */
	$scope.planNumChange = function(rowIndex) {
		// 明細行のチェック状態を設定
		rowCheckStatusChange(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#addRow
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.receivePlanB.push(angular.copy($scope.blankRow));

		// 行番号振り直し
		updateRowNumber($scope.receivePlanB);
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add Start
		// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
		gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
		owsCommon.syncExec(function() {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			var row = $scope.receivePlanB.length - 1;
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', $scope.receivePlanB[row].mproduct.productId, $scope.receivePlanB[row].mproduct.mproductShapeList, row);
		});
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Add End
	};

	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#removeRow
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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

			// [EC-CT1-060] 処理の効率化 2015.02.25 kawana Start
			if (!gridDirectiveControl.isBlankRowByEntity($scope.gridOptions, $scope.gridOptions.gridApi.selection.getSelectedRows()[row])) {
			// [EC-CT1-060] 処理の効率化 2015.02.25 kawana End

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
			if ($scope.receivePlanB.indexOf(row) > -1) {
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod Start
				var targetIndex = $scope.receivePlanB.indexOf(row);
				$scope.receivePlanB.splice(targetIndex, 1);
				// grid複数荷姿用各種オプション変数への行削除件数分設定共通処理
				gridMultiTextControl.removeMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, targetIndex);
				// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Mod End
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.receivePlanB);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [Ver3.0] unit of measure対応 2017.12.4 潘 Start
		// [#3342][Ver3.0] 行追加/行削除処理用複数荷姿対応 2018.01.30 honma Delete
		for (var row = 0; row < $scope.receivePlanB.length; row++) {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'planNum',$scope.receivePlanB[row].mproduct.productId, $scope.receivePlanB[row].mproduct.mproductShapeList, row);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
			// 該当行の荷姿補助内訳数取得
			owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.receivePlanB[row].planNum, 'gridMultiTextOptions', 'planNum', row);
			// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		}
		// [Ver3.0] unit of measure対応 2017.12.4 潘 End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#register
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
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

		// [EC-CT1-060] 処理の効率化 2015.02.25 kawana Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [EC-CT1-060] 処理の効率化 2015.02.25 kawana End

		// 空行判定
		for (var row = 0; row < $scope.receivePlanB.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {

				// [EC-CT1-060] 処理の効率化(空行検証機能の解除の位置移動) 2015.02.25 kawana

				// 空行を退避
				emptyBody.push($scope.receivePlanB[row]);
			} else {
				// 空行以外を退避
				listBody.push($scope.receivePlanB[row]);
			}
		}

		// [EC-CT1-059][EC-CT1-060] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.02.25 kawana Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 入力データ無し
				if ($scope.screenMode != SCREEN_MODE.Update) {
					if (listBody.length == 0) {
						alertMessage.setErrorMessageByCode("noDetailsError");
						return;
					}
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod Start
					var targetIndex = $scope.receivePlanB.indexOf(row);
					$scope.receivePlanB.splice(targetIndex, 1);
					$scope.gridMultiTextOptions.splice(targetIndex, 1);
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod End
				});

				// 行番号振り直し
				updateRowNumber($scope.receivePlanB);

				// 入庫ラベルNOの重複チェック
				var j = 0;
				var rowIndex = new Array();
				for (var row = 0; row < $scope.receivePlanB.length; row++) {
					var planStoreLabelNo = $scope.receivePlanB[row].planStoreLabelNo;
					for (var i = row+1; i < $scope.receivePlanB.length; i++) {
						if (($scope.receivePlanB[i].planStoreLabelNo !== null && planStoreLabelNo !== null)&&($scope.receivePlanB[i].planStoreLabelNo !== '' && planStoreLabelNo !== '') && $scope.receivePlanB[i].planStoreLabelNo == planStoreLabelNo){
							rowIndex[j] =i;
							j++;
						}
					}
				}
				if (j > 0){

					// [EC-CT1-061] エラーのときにエラー行までスクロールするように変更 2015.02.25 kawana Start
					// エラーメッセージCD
					var messageCd = "planStoreLabelNoDuplicateError";
					// 重複対象の項目に重複のエラーを表示
					gridOptionMessageControl.show($scope.gridOptions, "planStoreLabelNo", $filter('owfMessage')(messageCd), rowIndex);
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('inputform');
					// [EC-CT1-061] エラーのときにエラー行までスクロールするように変更 2015.02.25 kawana End
					return;
				}

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定
					checkFunc = api.receivePlan.inputCheckUpdate;
					execFunc = api.receivePlan.update;

					successFunc = function(response){
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					}

				} else {
					// 新規登録関数を設定
					checkFunc = api.receivePlan.inputCheckRegister;
					execFunc = api.receivePlan.register;

					successFunc = function(response){
						// 初期化
						$scope.initScreenHttp();
					}

				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.receivePlanH;
				request.data.body = listBody;

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//仕入先マスタ存在異常
							if (checkResponse.status.listStatus[i].status.statusCode == 3){
								optionMessageControl.show($scope, "planSupplierCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								// [OSS] フォーカス不正を修正 2020.03.06 kawana Start
								directiveControl.firstErrorOnFocus('inputform');
								// [OSS] フォーカス不正を修正 2020.03.06 kawana End
								return;
							}
							// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
							if (checkResponse.status.listStatus[i].status.subStatusCode == 10) {
								// 小数有無チェック共通処理
								gridMultiTextControl.checkDecimalInput($scope, $scope.receivePlanB[checkResponse.status.listStatus[i].status.rowIndex].planNum, $scope.gridOptions, 'gridMultiTextOptions', 'planNum', checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラー箇所までスクロール
								gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, checkResponse.status.listStatus[i].status.rowIndex);
								// 最初のエラーにフォーカス
								directiveControl.firstErrorOnFocus('inputform');
								return;
							}
							// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End
						}
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// 入荷予定データ登録または更新
					execFunc(request).then(function(execResponse){

						if (execResponse.status.listStatus != null){
							for (var i = 0 ;i <execResponse.status.listStatus.length;i++){
								//仕入先マスタ存在異常
								if (execResponse.status.listStatus[i].status.statusCode == 3){
									optionMessageControl.show($scope, "planSupplierCd", $filter('owfMessage')(execResponse.status.listStatus[i].status.messageCode, execResponse.status.listStatus[i].status.messageReplaceValue));
									// [OSS] フォーカス不正を修正 2020.03.06 kawana Start
									directiveControl.firstErrorOnFocus('inputform');
									// [OSS] フォーカス不正を修正 2020.03.06 kawana End
									return;
								}
							}
						}

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							return;
						}

						// 完了後の処理
						successFunc(execResponse);

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
					});
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
		// [EC-CT1-059][EC-CT1-060] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.02.25 kawana End
	};

	// 預託在庫区分リスト再設定処理
	var setDepositStockTypeList = function(list, clearSelected) {
		$scope.depositStockTypeList = list;

		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			if ($scope.depositStockTypeList.length == 1) {
				$scope.receivePlanH.planDepositCd = $scope.depositStockTypeList[0].mCustomer.customerCd;
			} else {
				$scope.receivePlanH.planDepositCd = null;
			}
		}
	};
	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	// 現在行の各項目への制御処理
	var productManagCurrentRow = function(rowIndex, lotManagFlg, limitDtManagFlg) {
		// [Ver3.1][#5881]商品マスタ未存在の場合、ロットと期限日を非活性にする 2019.01.11 matsumoto Start
		if (lotManagFlg == "0" || lotManagFlg == null) {
			gridDirectiveControl.editable($scope.gridOptions, 'planLot', false, rowIndex);
			$scope.receivePlanB[rowIndex].planLot = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'planLot', true, rowIndex);
		}

		if (limitDtManagFlg == "0" || limitDtManagFlg == null) {
			gridDirectiveControl.editable($scope.gridOptions, 'planLimitDt', false, rowIndex);
			$scope.receivePlanB[rowIndex].planLimitDt = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'planLimitDt', true, rowIndex);
		}
		// [Ver3.1][#5881]商品マスタ未存在の場合、ロットと期限日を非活性にする 2019.01.11 matsumoto End
	};

	// 明細行のチェック状態を設定
	var rowCheckStatusChange = function(rowIndex) {
//		var allBody = $scope.gridOptions.gridApi.grid.rows;
//		$scope.gridOptions.$gridScope.selectionProvider.setSelection(allBody[rowIndex],true);
		owsCommon.syncExec(function() {
			$scope.gridOptions.selectRow(rowIndex,true);
		});
	};


//	/**
//	* @ngdoc method
//	* @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#planStoreLabelBlur
//	* @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
//	*
//	* @description
//	* 入庫ラベルNOのロストフォーカス処理<br>
//	*
//	* サーバとの通信を行い、入庫ラベルNOの重複チェックを行う。
//	*/
//	$scope.planStoreLabelBlur = function(rowIndex) {

//	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
