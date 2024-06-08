/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingUpdate
 *
 * @description
 * 出荷実績訂正画面<br>
 *
 * 出荷実績訂正データに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ShippingUpdate', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShippingUpdate.service:shippingUpdateApi
 *
 * @description
 * 出荷実績訂正画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * shippingStatus 出荷ステータスデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * stockType 在庫区分データ操作用WebAPI<br>
 * ・resources/common/stockType/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * depositCustomer 預託データ操作用WebAPI<br>
 * ・resources/common/depositCustomer/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * location ロケーションデータ操作用WebAPI<br>
 * ・resources/common/location/record 単一行データ取得WebAPI<br>
 * <br>
 * shippingUpdate 出荷実績訂正データ操作用WebAPI<br>
 * ・resources/shipping/shippingUpdate/init 画面用初期データ取得WebAPI<br>
 * ・resources/shipping/shippingUpdate/inputCheck 登録前入力チェックWebAPI<br>
 * ・resources/shipping/shippingUpdate/update 入力データ登録WebAPI<br>
 */
.factory('shippingUpdateApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingStatus: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		stockType: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/stockType/keyValueList']
				 ]
		),
		depositCustomer: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/depositCustomer/keyValueList']
				 ]
		),
		// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana Start
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/recordWithAllocNgFlgName']
				 ]
		),
		// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana End
		shippingUpdate: AngularAPIClient.make(
				[['init',            'GET',  'resources/shipping/shippingUpdate/init'],
				 ['inputCheck',      'POST', 'resources/shipping/shippingUpdate/inputCheck'],
				 ['update',          'POST', 'resources/shipping/shippingUpdate/update']
				]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate
 *
 * @description
 * 出荷実績訂正画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
.controller('ShippingUpdate', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'wmsShipCommon', 'shippingUpdateApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, wmsShipCommon, api){
// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End

	// グリッドの列情報（デザイン用）
	$scope.shippingUpdateCols = [
	                             {field:"instNum", displayName:"指示数"},
	                             {field:"allocNum", displayName:"引当済数"},
	                             {field:"tallocInstB.tpickingBList[0].pickingNum", displayName:"出庫数"},
	                             // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
	                             {field:"tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd", displayName:"預託"},
	                             {field:"tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd", displayName:"在庫区分"},
	                             {field:"tallocInstB.tpickingBList[0].tstock.mlocation.locationCd", displayName:"ロケーション名称"},
	                             {field:"tallocInstB.tpickingBList[0].tstock.tlot.lot", displayName:"ロット"},
	                             {field:"tallocInstB.tpickingBList[0].tstock.tlot.limitDt", displayName:"期限日"},
	                             {field:"tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
	                             {field:"tallocInstB.tpickingBList[0].tstock.unitNum", displayName:"ケース入数"},
	                             {field:"tallocInstB.tpickingBList[0].tstock.mlocation.bclassDtlByAllocNgFlg.vdict.dictNm", displayName:"引当禁止フラグ"},
	                             // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
	                             {field:"tshippingInstH.mcustomerBySupplyCustomerId.bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"納品先出荷停止フラグ"},
	                             {field:"mproduct.bclassDtlByShippingStopFlg.vdict.dictNm", displayName:"商品出荷停止フラグ"}
	                             ];

	var oldClient;
	var newCustomerList;
	var newStockTypeList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#initScreen
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// 荷主変更の監視設定（フォーカス時）
		$scope.clientFocus = function() {
			oldClient = $scope.head.tshippingInstH.mclient.clientCd;
		};

		// 荷主変更の監視設定（選択内容変更時）
		$scope.clientChange = function() {
			// 預託リスト変更（同期処理）
			$scope.deferredGetCustomerList()
			.then(function(response){
				newCustomerList = response.data;
			}),
			// 在庫区分リスト変更（同期処理）
			$scope.deferredGetStockTypeList()
			.then(function(response){
				newStockTypeList = response.data;
			});
		};

		// 荷主変更の監視設定（ロストフォーカス時）
		$scope.clientBlur = function() {
			if (oldClient != $scope.head.tshippingInstH.mclient.clientCd) {
				// 選択した荷主で取得済みの預託在庫区分リストを設定
				setCustomerList(newCustomerList, true);
				setStockTypeList(newStockTypeList, true);
			}
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'shippingUpdateList',
			columnDefs: 'shippingUpdateCols',
		});

        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd" : {
					key : "stockTypeCd",
					value : "stockTypeNm",
					listModel : "stockTypeList"
				},
				"tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd" : {
					key : "mCustomer.customerCd",
					value : "mCustomer.customerNm",
					listModel : "customerList"
				}
		};

		// グリッドのロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"tallocInstB.tpickingBList[0].tstock.mlocation.locationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
		};

		// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana Start
		// グリッドのイベント設定
		$scope.gridEventOptions = {
				"tallocInstB.tpickingBList[0].tstock.mlocation.locationCd":{
					"ng-blur":{
						eventFunction:"locationCdBlur(row.rowIndex)"
					}
				}
				// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 列型複数荷姿対応のため小数点チェック処理削除 2018.02.19 honma Delete
	    // [Ver3.0] unit of measure対応 2017.12.25 REN end
		};
		// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana End

		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 総数用colCdを定義
				"tallocInstB.tpickingBList[0].pickingNum" : {
					// 複数荷姿用colCdを定義
					multiTextCd: "pickingNumMultiText",
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "shippingUpdateList.mproduct.mproductShapeList"
				}
		};
		$scope.gridMultiTextOptions = [];
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tallocInstB.tpickingBList[0].tstock.mlocation.locationCd",2, 6);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tallocInstB.tpickingBList[0].tstock.mlocation.locationCd",4, 6);

        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#initScreenHttp
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
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
				 $scope.deferredGetShippingStatusList()
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
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#deferredGetShippingStatusList
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 出荷ステータス取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingStatusList = function() {

		var deferred = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_STATUS";

		owsCommon.getDataCacheable(api.shippingStatus, request).then(function(response){
			$scope.shippingStatusList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#deferredGetStockTypeList
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
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
		request.clientCd = $scope.head.tshippingInstH.mclient.clientCd;

		api.stockType.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#deferredGetCustomerList
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 預託取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCustomerList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.clientCd = $scope.head.tshippingInstH.mclient.clientCd;

		api.depositCustomer.keyValueList(request).then(function(response){
			deferred.resolve(response);
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#deferredGetInitData
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 出荷実績訂正データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		var request = {};
		request.shippingInstBId = $route.current.params.shippingInstBId;
		//request.shippingInstBId = '100';

		api.shippingUpdate.init(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				// 前画面に戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				deferred.reject();
				return;
			}

			$scope.head = response.data.head;
			$scope.shippingUpdateList = response.data.body;
			$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
			// grid複数荷姿用各種オプション変数への検索データ件数分設定共通処理
			gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, response.data.body.length);
			for (var row = 0; row < response.data.body.length; row++) {
				// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'tallocInstB.tpickingBList[0].pickingNum', response.data.body[row].mproduct.productId, response.data.body[row].mproduct.mproductShapeList, row);
				// 該当行の荷姿補助内訳数取得
				owsCommon.getGridCalcAuxiliaryBreakdown($scope, response.data.body[row].tallocInstB.tpickingBList[0].pickingNum, 'gridMultiTextOptions', 'tallocInstB.tpickingBList[0].pickingNum', row);
			}
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End

			// 行番号振り直し
			updateRowNumber($scope.shippingUpdateList);

			// 荷主変更後処理
			$scope.changeClient(false);

			// 画面明細の在庫関連情報の入力可否制御（Model,View同期後に実行）
			owsCommon.syncExec(function() {
				for (var i = 0; i < $scope.shippingUpdateList.length; i++) {
					managCurrentRow(i, $scope.shippingUpdateList[i].mproduct.lotManagFlg, $scope.shippingUpdateList[i].mproduct.limitDtManagFlg, $scope.shippingUpdateList[i].storeNoFlg);
				}
			});
			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#changeClient
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 荷主変更後処理<br>
	 *
	 * 荷主が変更された場合、預託在庫区分リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeClient = function(clearSelected) {
		// 預託リスト変更（同期処理）
		$scope.deferredGetCustomerList()
		.then(function(response){
			setCustomerList(response.data, clearSelected);
		});
		// 在庫区分リスト変更（同期処理）
		$scope.deferredGetStockTypeList()
		.then(function(response){
			setStockTypeList(response.data, clearSelected);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#showLocation
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showLocation = function(rowIndex){

		var items = {
				centerCd: $scope.head.tshippingInstH.mcenter.centerCd,
                // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				locationCd: $scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.locationCd
                // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
            // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			$scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.locationCd = selectedItem.locationCd;
            // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		});
	};

	// [ON推-品向-445] ロケーションCDの変更で引当禁止フラグを更新 2014.12.16 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#locationCdBlur
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * ロケーションコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ロケーション情報を取得し画面項目に反映する。
	 */
	$scope.locationCdBlur = function(rowIndex){

        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start

		// 入力されたロケーションコードを取得
		var locationCd = $scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.locationCd;

		if (locationCd && 0 < locationCd.length) {

			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.head.tshippingInstH.mcenter.centerCd);
			request.locationCd = locationCd;

			api.location.record(request).then(function(response){

				var mLocation = response.data.mLocation;
				if(mLocation){
					 $scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.allocNgFlg = mLocation.allocNgFlg;
	    			// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.28 miyabe Start
					 $scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.bclassDtlByAllocNgFlg.vdict.dictNm = mLocation.bclassDtlByAllocNgFlg.vdict.dictNm;

				} else {
					$scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.allocNgFlg = null;
					$scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.bclassDtlByAllocNgFlg.vdict.dictNm = null;
				}
			});

		} else {
			$scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.allocNgFlg = null;
			$scope.shippingUpdateList[rowIndex].tallocInstB.tpickingBList[0].tstock.mlocation.bclassDtlByAllocNgFlg.vdict.dictNm = null;
				// [#1899] [1.33 品質向上対応] [ver2.2.1] 値の取得先をセンタ区分値マスタから区分値マスタに変更 2017.06.28 miyabe End
		}

        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

	};
	// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 列型複数荷姿対応のため小数点チェック処理削除 2018.02.19 honma Delete
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#getClassForRow
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 出荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		// [#5592][v3.1] 欠品フラグの移動対応 / キャンセル色を削除 (処理の共通化) 2018.11.09 kawana Start

		var shippingStopFlg = '0';

		// [ON推-品向-445] ロケーションが引当禁止の場合は出荷停止の色に変更 2014.12.16 kawana Start
		if ( (row.entity.tshippingInstH.mcustomerBySupplyCustomerId.shippingStopFlg == "1") ||
			 (row.entity.mproduct.shippingStopFlg == "1") ||
			 // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
			 (row.entity.tallocInstB.tpickingBList[0].tstock.mlocation.allocNgFlg == "1")
			 // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
		  ) {
			// [ON推-品向-445] ロケーションが引当禁止の場合は出荷停止の色に変更 2014.12.16 kawana End

			// 出荷停止
			shippingStopFlg = '1'
		}

		var rowInfo = {
			shippingStopFlg : shippingStopFlg,
			stockOutFlg : wmsShipCommon.getStockOutFlgByNum(row.entity.stockOutNum)
		};

		return wmsShipCommon.getClassForRowNonStatus(rowInfo);

		// [#5592][v3.1] 欠品フラグの移動対応 / キャンセル色を削除 (処理の共通化) 2018.11.09 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#addRow
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

//		$scope.blankRow.instNum = 0;
//		$scope.blankRow.allocNum = 0;
//		$scope.blankRow.tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd = 'W100';

		// [Ver3.0] unit of measure対応 2017.11.24 駱 Start
		$scope.blankRow.productUnit = $scope.shippingUpdateList[0].productUnit;
		$scope.blankRow.unitNumBreakdown = $scope.shippingUpdateList[0].unitNumBreakdown;
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
		$scope.blankRow.mproduct = $scope.shippingUpdateList[0].mproduct;
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
		// [Ver3.0] unit of measure対応 2017.11.24 駱 End

		$scope.shippingUpdateList.push(angular.copy($scope.blankRow));

		// 行番号振り直し
		updateRowNumber($scope.shippingUpdateList);

		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
		// grid複数荷姿用各種オプション変数への行追加件数分設定共通処理
		gridMultiTextControl.addMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, 1);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
		owsCommon.syncExec(function() {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			var addRowIndex = $scope.shippingUpdateList.length - 1;
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'tallocInstB.tpickingBList[0].pickingNum', $scope.shippingUpdateList[addRowIndex].mproduct.productId, $scope.shippingUpdateList[addRowIndex].mproduct.mproductShapeList, addRowIndex);
		});
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End

		managCurrentRow($scope.shippingUpdateList.length - 1, $scope.head.mproduct.lotManagFlg, $scope.head.mproduct.limitDtManagFlg, $scope.head.storeNoFlg);
		// [EC-CT1-038] 行追加時預託先デフォルト表示 2015.2.17 Sakata Start
		setDepositStockTypeListAddrow($scope.shippingUpdateList);
		// [EC-CT1-038] 行追加時預託先デフォルト表示 2015.2.17 Sakata End
	};


	// [EC-CT1-038] 行追加時預託先デフォルト表示 2015.2.17 Sakata Start
	// 行追加時預託CD設定処理
	var setDepositStockTypeListAddrow = function(list) {
        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
		if ($scope.customerList.length == 1) {
			$scope.shippingUpdateList[list.length-1].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd = $scope.customerList[0].mCustomer.customerCd;
		} else {
			$scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd = null;
		}
        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
	};
	// [EC-CT1-038] 行追加時預託先デフォルト表示 2015.2.17 Sakata End



	// 行削除ボタン押下処理
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#removeRow
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		var Item = 0;

		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		//削除行が選択を既存行の場合
		for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].shippingInstBId != null) {
				alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
				return;
			}
		}

		// [横並-053] チェック順変更 2014.11.20 zhouj Start

		// 入力済の場合に警告
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			// [EC-CT1-078] 処理の効率化 2015.03.02 kawana Start
			if (!gridDirectiveControl.isBlankRowByEntity($scope.gridOptions, $scope.gridOptions.gridApi.selection.getSelectedRows()[row])) {
			// [EC-CT1-078] 処理の効率化 2015.03.02 kawana End

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
		// [横並-053] チェック順変更 2014.11.20 zhouj End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
			var targetIndex = $scope.shippingUpdateList.indexOf(row);
			if (targetIndex > -1) {
				$scope.shippingUpdateList.splice(targetIndex, 1);
				// grid複数荷姿用各種オプション変数への行削除件数分設定共通処理
				gridMultiTextControl.removeMultiTextOptionsList($scope, 'gridMultiTextOptions', $scope.multiTextOptions, targetIndex);
			}
			// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
		});

		// 行番号振り直し
		updateRowNumber($scope.shippingUpdateList);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add Start
		for (var row = 0; row < $scope.shippingUpdateList.length; row++) {
			// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
			gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'tallocInstB.tpickingBList[0].pickingNum', $scope.shippingUpdateList[row].mproduct.productId, $scope.shippingUpdateList[row].mproduct.mproductShapeList, row);
			// 該当行の荷姿補助内訳数取得
			owsCommon.getGridCalcAuxiliaryBreakdown($scope, $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].pickingNum, 'gridMultiTextOptions', 'tallocInstB.tpickingBList[0].pickingNum', row);
		}
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Add End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShippingUpdate.object:ShippingUpdate#register
	 * @methodOf oneslogiWms.ShippingUpdate.object:ShippingUpdate
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 列型複数荷姿対応のため小数点チェック処理削除 2018.02.19 honma Delete
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];

		// [EC-CT1-078] 処理の効率化 2015.03.02 kawana Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [EC-CT1-078] 処理の効率化 2015.03.02 kawana End


		// 空行判定
		for (var row = 0; row < $scope.shippingUpdateList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {

				// [EC-CT1-078] 処理の効率化(空行検証機能の解除の位置移動) 2015.03.02 kawana

				// 空行を退避
				emptyBody.push($scope.shippingUpdateList[row]);
			} else {
				// 空行以外を退避
				listBody.push($scope.shippingUpdateList[row]);
			}
		}

		// [EC-CT1-077][EC-CT1-078] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.03.02 kawana Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 入力データ無し
				var blankRow;
				for (var row = 0; row < $scope.shippingUpdateList.length; row++) {
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

				// 明細行に指定ロット、預託、在庫区分、期限日、ロケーションCD、入庫ラベルNo.が重複チェック
				for (var row = 0; row < $scope.shippingUpdateList.length; row++) {

			        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start

					var lot = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tlot.lot;
					var depositCd = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd;
					var stockTypeCd = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd;
					var limitDt = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tlot.limitDt;
					var locationCd = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mlocation.locationCd;
					var storeLabelNo = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo;
					// [1.1.4-CT-043] 入庫日を指定できるように変更 2016.05.20 kawana Start
					var storeDt = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeDt;
					// [1.1.4-CT-043] 入庫日を指定できるように変更 2016.05.20 kawana End
					// [#3018] ケース分とバラ分で重複エラーが発生してしまう問題を修正 2018.02.16 kawana Start
					var mixedFlg = $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].mixedFlg;
					// [#3018] ケース分とバラ分で重複エラーが発生してしまう問題を修正 2018.02.16 kawana End

	                // [SK2-035] 重複チェックがかかるべきです。2014.12.11 KI Start
					for (var i = row+1; i < $scope.shippingUpdateList.length; i++) {
						if ($scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tlot.lot == lot
							&& $scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd == depositCd
							&& $scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd == stockTypeCd
							&& $scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tlot.limitDt == limitDt
							&& $scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.mlocation.locationCd == locationCd
							// [#3018] 任意項目が空入力された場合に重複行が発生してしまう問題を修正 2018.02.19 kawana Start
							// [1.1.4-CT-043] 入庫日を指定できるように変更 2016.05.20 kawana Start
							&& equalsAnyOneEmptyTrue($scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeDt, storeDt)
							// [1.1.4-CT-043] 入庫日を指定できるように変更 2016.05.20 kawana End
							&& equalsAnyOneEmptyTrue($scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo, storeLabelNo)
							// [#3018] 任意項目が空入力された場合に重複行が発生してしまう問題を修正 2018.02.19 kawana End
							// [#3018] ケース分とバラ分で重複エラーが発生してしまう問題を修正 2018.02.16 kawana Start
							&& $scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].mixedFlg == mixedFlg ){
							// [#3018] ケース分とバラ分で重複エラーが発生してしまう問題を修正 2018.02.16 kawana End

							// [#3018] 任意項目が空入力された場合に重複行が発生してしまう問題を修正 2018.02.19 kawana Start

							if (isAnyOneEmpty($scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeDt, storeDt)) {
								// 入庫日が空で重複エラー

								if (isAnyOneEmpty($scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo, storeLabelNo)) {
									// 入庫ラベルNo.も空

									alertMessage.setErrorMessageByCode("shippingUpdateSameStockNotInputStoreDtOrStoreNoError");
									return;
								} else {
									// 入庫日のみ空

									alertMessage.setErrorMessageByCode("shippingUpdateSameStockNotInputStoreDtError");
									return;
								}
							}

							if (isAnyOneEmpty($scope.shippingUpdateList[i].tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo, storeLabelNo)) {
								// 入庫ラベルNo.が空で重複エラー

								alertMessage.setErrorMessageByCode("shippingUpdateSameStockNotInputStoreNoError");
								return;
							}

							// 重複エラー
							alertMessage.setErrorMessageByCode("dataDuplicateError");
							return;

							// [#3018] 任意項目が空入力された場合に重複行が発生してしまう問題を修正 2018.02.19 kawana End
						}
					}
					// [SK2-035] 重複チェックがかかるべきです。2014.12.11 KI End
			        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add Start
					var isCheckDecimalError = false;
					var decimalErrorIndex;
					// 小数有無チェック共通処理
					isCheckDecimalError = gridMultiTextControl.checkDecimalInput($scope, $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].pickingNum, $scope.gridOptions, 'gridMultiTextOptions', 'tallocInstB.tpickingBList[0].pickingNum', row);
					if (isCheckDecimalError) {
						decimalErrorIndex = row;
						break;
					}
					if (isCheckDecimalError) {
						// 最初のエラー箇所までスクロール
						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, decimalErrorIndex);
						// 最初のエラーにフォーカス
						directiveControl.firstErrorOnFocus('shippingUpdateList');
						return;
					}
					// [#3558][Ver3.0] 小数有無チェック処理不正 2018.03.07 honma Add End

				}

				//明細行の実績数>指示数の場合
				var pickingNum = 0;
				var instNum = $scope.shippingUpdateList[0].instNum;

				for(row = 0; row < $scope.shippingUpdateList.length; row++)
				{
					pickingNum = owsCommon.add(pickingNum, $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].pickingNum);
				}

				if(owsCommon.isGreaterThan(pickingNum, instNum))
				{
					alertMessage.setErrorMessageByCode("inspectQtyCannotInputMoreThanShipOderQtyError");
					return;
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod Start
					var targetIndex = $scope.shippingUpdateList.indexOf(row);
					$scope.shippingUpdateList.splice(targetIndex, 1);
					$scope.gridMultiTextOptions.splice(targetIndex, 1);
					// [#4075][Ver3.0] 複数荷姿部品 - 登録処理時の空行削除処理対応 2018.03.28 honma Mod End
				});

				// 行番号振り直し
				updateRowNumber($scope.shippingUpdateList);

				// [EC-CT1-079] エラーのときにエラー行までスクロールするように変更 2015.03.02 kawana Start
				var errCnt = 0;
				var errFirstIndex;
				var errCdLot = "lotNotInputLotManagementProductError";
				var errCdLimitDt = "limitDateNotInputLimitDateManagementProductError";

				for (var row = 0; row < $scope.shippingUpdateList.length; row++) {
					if ($scope.head.mproduct.lotManagFlg == "1"){
				        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
						if(!($scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tlot.lot)
								|| 0 == $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tlot.lot.length) {
					        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

							errCnt++;
							if(!errFirstIndex){
								errFirstIndex = row;
							}
					        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "tallocInstB.tpickingBList[0].tstock.tlot.lot", row)) {
								gridOptionMessageControl.show($scope.gridOptions, "tallocInstB.tpickingBList[0].tstock.tlot.lot", $filter('owfMessage')(errCdLot), row);
							}
					        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
						}
					}

					if ($scope.head.mproduct.limitDtManagFlg == "1"){
				        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
						if(!($scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tlot.limitDt)
								|| 0 == $scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.tlot.limitDt.length) {
					        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

							errCnt++;
							if(!errFirstIndex){
								errFirstIndex = row;
							}
					        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "tallocInstB.tpickingBList[0].tstock.tlot.limitDt", row)) {
								gridOptionMessageControl.show($scope.gridOptions, "tallocInstB.tpickingBList[0].tstock.tlot.limitDt", $filter('owfMessage')(errCdLimitDt), row);
							}
					        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
						}
					}
				}

				if (0 < errCnt) {
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, errFirstIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('shippingUpdateList');
					return;
				}
				// [EC-CT1-079] エラーのときにエラー行までスクロールするように変更 2015.03.02 kawana End

				var cShippingStopFlg = $scope.shippingUpdateList[0].tshippingInstH.mcustomerBySupplyCustomerId.shippingStopFlg;

				if(cShippingStopFlg == "1")
				{
					alertMessage.setErrorMessageByCode("foundStoppedShipToError");
					return;
				}

				var pShippingStopFlg = $scope.shippingUpdateList[0].mproduct.shippingStopFlg;

				if(pShippingStopFlg == "1")
				{
					alertMessage.setErrorMessageByCode("foundStoppedOrProductError");
					return;
				}

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				// 更新処理関数を設定
				checkFunc = api.shippingUpdate.inputCheck;
				execFunc = api.shippingUpdate.update;

				successFunc = function(){
					// 初期化
					$scope.initScreenHttp();
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.headBase64 = $.base64.encode(JSON.stringify($scope.head), true);
				request.data.bodyBase64 = $.base64.encode(JSON.stringify(angular.copy(listBody)), true);

				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// 入荷予定データ登録または更新
					execFunc(request).then(function(execResponse){

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
			// [EC-CT1-077][EC-CT1-078] グリッドに表示されない位置のエラーチェック修正・JSチェック中も処理中を表示 2015.03.02 kawana End
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

	};

	// [#3018] 任意項目が空入力された場合に重複行が発生してしまう問題を修正 2018.02.19 kawana Start

	// 引数が等しい場合はtrue (引数のうち、いずれかが空の場合もtrue)
	var equalsAnyOneEmptyTrue = function(a, b) {

		if (isAnyOneEmpty(a, b)) {
			return true;
		}

		return a == b;
	}

	// 引数のうち、いずれかが空の場合はtrue
	var isAnyOneEmpty = function(a, b) {

		if (a == null || b == null) {
			return true;
		}

		if (a == "" || b == "") {
			return true;
		}

		return false;
	}

	// [#3018] 任意項目が空入力された場合に重複行が発生してしまう問題を修正 2018.02.19 kawana End

	// 預託リスト再設定処理
	var setCustomerList = function(list, clearSelected) {
		$scope.customerList = list;
		// [EC-CT1-038] 行追加時預託先デフォルト表示 2015.2.17 Sakata Start
//		// 選択肢が一つの場合は一つ目を設定
		if (clearSelected) {
			for(row = 0; row < $scope.shippingUpdateList.length; row++){
		        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				if ($scope.customerList.length == 1) {
					$scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd = $scope.customerList[0].mCustomer.customerCd;
				} else {
					$scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd = null;
				}
		        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
			}
		}else{
			for(row = 0; row < $scope.shippingUpdateList.length; row++){
		        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start
				if ($scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mcustomer.customerCd == null) {
			        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End

					setDepositStockTypeListAddrow($scope.shippingUpdateList);
				}
			}
		}
		// [EC-CT1-038] 行追加時預託先デフォルト表示 2015.2.17 Sakata End
	};

	// 在庫区分リスト再設定処理
	var setStockTypeList = function(list, clearSelected) {
		$scope.stockTypeList = list;

//		// 選択肢が一つの場合は一つ目を設定
//		if (clearSelected) {
//		for(row = 0; row < $scope.shippingUpdateList.length; row++)
//		{
//		if ($scope.stockTypeList.length == 1) {
//		$scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd = $scope.stockTypeList[0].mStockType.stockTypeCd;
//		} else {
//		$scope.shippingUpdateList[row].tallocInstB.tpickingBList[0].tstock.mstockType.stockTypeCd = 'W100';
//		}
//		}
//		}
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	// 現在行の各項目への制御処理
	var managCurrentRow = function(rowIndex, lotManagFlg, limitDtManagFlg, storeNoFlg) {

        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana Start

		if (lotManagFlg == "0") {
			gridDirectiveControl.editable($scope.gridOptions, 'tallocInstB.tpickingBList[0].tstock.tlot.lot', false, rowIndex);
			//$scope.shippingUpdateList[rowIndex].planLot = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'tallocInstB.tpickingBList[0].tstock.tlot.lot', true, rowIndex);
		}

		if (limitDtManagFlg == "0") {
			gridDirectiveControl.editable($scope.gridOptions, 'tallocInstB.tpickingBList[0].tstock.tlot.limitDt', false, rowIndex);
			//$scope.shippingUpdateList[rowIndex].planLimitDt = null;
		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'tallocInstB.tpickingBList[0].tstock.tlot.limitDt', true, rowIndex);
		}

//		if (storeNoFlg == "0") {
//		gridDirectiveControl.editable($scope.gridOptions, 'tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo', false, rowIndex);
//		//$scope.shippingUpdateList[rowIndex].planLimitDt = null;
//		} else {
//		gridDirectiveControl.editable($scope.gridOptions, 'tallocInstB.tpickingBList[0].tstock.tstoreNo.storeLabelNo', true, rowIndex);
//		}

        // レスポンス対策 - 出庫ボディの在庫受払IDを在庫IDに変更 2016.02.15 kawana End
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
