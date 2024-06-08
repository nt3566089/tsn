/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierMasterEdit
 *
 * @description
 * 運送業者マスタメンテナンス(編集)メンテナンス画面
 */
angular.module('oneslogiWms.CarrierMasterEdit',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierMasterEdit.service:locationMasterApi
 *
 * @description
 * 運送業者マスタメンテナンス(編集)メンテナンスWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/carrierMasterEdit/initNew 新規画面用初期データ取得用WebApi<br>
 * ・resources/master/carrierMasterEdit/initUpdate 更新画面用初期データ取得用WebApi<br>
 * ・resources/master/carrierMasterEdit/inputCheck 入力チェック（登録と更新）用WebApi<br>
 * ・resources/master/carrierMasterEdit/register 入力データ登録用WebApi<br>
 * ・resources/master/carrierMasterEdit/update 入力データ更新用WebApi<br>
 *
 */
.factory('carrierMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		commonCarrierList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/commoncarrierCd/keyValueList']
				 ]
		),
		carrierMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',   'GET', 'resources/master/carrierMasterEdit/initNew'],
				 ['initUpdate',   'GET', 'resources/master/carrierMasterEdit/initUpdate'],
				 ['inputCheck', 'POST', 'resources/master/carrierMasterEdit/inputCheck'],
				 ['register', 'POST', 'resources/master/carrierMasterEdit/register'],
				 ['update', 'POST', 'resources/master/carrierMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
 *
 * @description
 * 運送業者マスタメンテナンス(編集)メンテナンス画面コントローラ
 */
.controller('CarrierMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'carrierMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.mcarrierBoxListCols =
		[
		 {field:"boxCd", displayName:"荷材"},
		 {field:"boxNm", displayName:"荷材名称"},
		 {field:"mcarrierBox.boxSizeCd", displayName:"荷材サイズCD"},
		 {field:"delFlg", displayName:"削除"},
		 ];
	var oldwarehouse;
	var newZoneCdList;
	var bodyList;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#initScreen
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'mcarrierBoxList',
			columnDefs: 'mcarrierBoxListCols',
		});

		// グリッドの運送業者コード列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"mcarrierBoxList[0].boxSizeCd":{
					"ng-change":{
						eventFunction:"boxSizeCdChanged(row.rowIndex)"
					}
				},
				"mcarrierBoxList[0].delFlg":{
					"ng-change":{
						eventFunction:"delFlgChanged(row.rowIndex)"
					}
		        },
				"carrierNm":{
					"ng-blur":{
						eventFunction:"carrierNmBlur(row.rowIndex)"
					}
		        }
				};

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mcarrierBoxList[0].delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				},
				//米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				"bolOutputTargetFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "bolOutputTargetFlgList",
					removeBlank:"null"
				}
				//米国出荷ドキュメント追加対応 2018.01.07 PYM End
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetCommonCarrier(),
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				 $scope.deferredGetBolOutputTargetFlg(),
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM End
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#CarrierNmBlur
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * 運送業者名称のロストフォーカス処理<br>
	 *
	 * 運送業者名称ロストフォーカス時、運送業者略称未入力の場合、運送業者名称をコピーする。
	 */
	$scope.carrierNmBlur = function() {
		// 入力された運送業者名称を取得
		var carrierNm = $scope.head.carrierNm;
		// 運送業者略称を取得
		var carrierAbbr = $scope.head.carrierAbbr;

		if (carrierNm && 0 < carrierNm.length) {
			if (carrierAbbr && 0 < carrierAbbr.length) {
				return;
			}else{
				$scope.head.carrierAbbr = carrierNm;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#deferredGetBolOutputTargetFlg
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * Bill of Lading発行対象フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBolOutputTargetFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BOL_OUTPUT_TARGET_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.bolOutputTargetFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#checkCarrierCd
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * Bill of Lading発行対象の入力制限チェック。<br>
	 *
	 * 共通運送業者がNULLの場合、Bill of Lading発行対象入力不可。
	 */
	$scope.checkCarrierCd = function() {
		var flg = false;

		if ($scope.head.mcommonCarrier == null) {
			//共通運送業者がNULLの場合
			directiveControl.editable($scope, 'mcommonCarrier.bolOutputTargetFlg', false);
			$scope.head.mcommonCarrier.bolOutputTargetFlg = null;
		} else{
			if ($scope.head.mcommonCarrier.carrierCd == null) {
				//共通運送業者がNULLの場合
				directiveControl.editable($scope, 'mcommonCarrier.bolOutputTargetFlg', false);
				$scope.head.mcommonCarrier.bolOutputTargetFlg = null;
			} else {
				//共通運送業者がNULL以外の場合
				directiveControl.editable($scope, 'mcommonCarrier.bolOutputTargetFlg', true);
			}
		}
		return flg;
	};
	// 米国出荷ドキュメント追加対応 2018.01.07 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#deferredGetCommonCarrier
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 荷材CD取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCommonCarrier = function () {
		var deferred = $q.defer();

		var request = {};
		//荷主センタ変更対応 201７.01.18 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($route.current.params.centerCd) {
			request.centerCd = $route.current.params.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 201７.01.18 sja End
		api.commonCarrierList.keyValueList(request).then(function(response){
			$scope.commonCarrierList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#boxSizeCdChanged
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 荷材サイズCDのロストフォーカス処理<br>
	 * 削除ロストフォーカス時の処理。
	 */
	$scope.boxSizeCdChanged = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChanged = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 運送業者マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

			// 訂正
			var request = {};
			request.carrierId = $route.current.params.carrierId;

			api.carrierMasterEdit.initUpdate(request).then(function(response){

				// 運送業者ヘッダ関連
				$scope.head = response.data.head;
				// 運送業者明細関連
				$scope.mcarrierBoxList = response.data.body;

				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				for (var row = 0; row < $scope.mcarrierBoxList.length; row++) {
					if ($scope.mcarrierBoxList[row].mcarrierBoxList.length == 0) {
						$scope.mcarrierBoxList[row].mcarrierBoxList.push(angular.copy($scope.blankRow));
						gridDirectiveControl.editable($scope.gridOptions, 'mcarrierBoxList[0].delFlg', false,row);
					   }else{
							gridDirectiveControl.editable($scope.gridOptions, 'mcarrierBoxList[0].delFlg', true,row);
					   }

					}
				directiveControl.editable($scope, 'carrierCd', false);
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				//Bill of Lading発行対象の入力制限
				if ($scope.head.mcommonCarrier == null) {
					//共通運送業者がNULLの場合
					directiveControl.editable($scope, 'mcommonCarrier.bolOutputTargetFlg', false);
				}
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM End
				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {
			api.carrierMasterEdit.initNew().then(function(response){
				$scope.head = response.data.head;
				$scope.mcarrierBoxList = [];
				$scope.mcarrierBoxList =response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				for (var row = 0; row < $scope.mcarrierBoxList.length; row++) {
					if ($scope.mcarrierBoxList[row].mcarrierBoxList.length == 0) {
						$scope.mcarrierBoxList[row].mcarrierBoxList.push(angular.copy($scope.blankRow));
						gridDirectiveControl.editable($scope.gridOptions, 'mcarrierBoxList[0].delFlg', false,row);
					}
				}
				// ログイン情報より初期値を設定
				$scope.head.mcenter.centerCd = userInfo.centerCd;
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
				//Bill of Lading発行対象の入力制限
				directiveControl.editable($scope, 'mcommonCarrier.bolOutputTargetFlg', false);
				// 米国出荷ドキュメント追加対応 2018.01.07 PYM End

				// 履歴データ取得・検索処理
				if (owsHistory.hasState()) {
					$scope.head = owsHistory.popState();
					$scope.search();
				}

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#getClassForRow
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.mcarrierBoxList[0].delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	// [Ver2.2.0]行番号振り直し処理の削除 2017.06.06 honma Delete

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit#register
	 * @methodOf oneslogiWms.CarrierMasterEdit.object:CarrierMasterEdit
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

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;

		for (var row = 0; row < $scope.mcarrierBoxList.length; row++) {
			if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.mcarrierBoxList[row]);
			}
			else {
				// 空行以外を退避
				listBody.push($scope.mcarrierBoxList[row]);
			}
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.mcarrierBoxList.splice($scope.mcarrierBoxList.indexOf(row), 1);
				});

				// [Ver2.2.0]行番号振り直し処理の削除 2017.06.06 honma Delete

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = listBody;
				request.data.head = $scope.head;

				// 入力チェック
				api.carrierMasterEdit.inputCheck(request).then(function(response){

					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//運送業者CD存在チェック
							if (response.status.listStatus[i].status.statusCode == 2){
								optionMessageControl.show($scope, "carrierCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						};
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 画面モード判定
					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 運送業者マスタメンテナンス(編集)データ登録または更新
						api.carrierMasterEdit.update(request).then(function(response){
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//運送業者存在チェック
									if (response.status.listStatus[i].status.statusCode == 2){
										optionMessageControl.show($scope, "carrierCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
								return;
							}
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						});
					} else {
						// 運送業者マスタメンテナンス(編集)データ登録または更新

						api.carrierMasterEdit.register(request).then(function(response){
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//運送業者存在チェック
									if (response.status.listStatus[i].status.statusCode == 2){
										optionMessageControl.show($scope, "carrierCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								};
							}
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
								return;
							}
							owsCommon.toggleSelectAll($scope.gridOptions, false);
							// 初期化
							$scope.initScreenHttp();

						});
					}
				});
			});
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

			});
		});
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
