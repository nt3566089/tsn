/**
 * @ngdoc overview
 * @name oneslogiWms.BoxGroupMasterEdit
 *
 * @description
 * 荷材グループメンテナンス(編集)画面<br>
 *
 * 荷材グループの情報を登録・更新・削除する画面。
 */
angular.module('oneslogiWms.BoxGroupMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.BoxGroupMasterEdit.service:boxGroupMasterEditApi
 *
 * @description
 * 荷材グループメンテナンス(編集)画面用WebAPI定義<br>
 *
 * データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/common/boxCd/query 荷材データ取得WebAPI<br>
 * <br>
 * boxGroupMasterEdit  荷材グループメンテナンス(編集)画面用WebAPI<br>
 * ・resources/master/boxGroupMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/boxGroupMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/boxGroupMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/boxGroupMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('boxGroupMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		boxList: AngularAPIClient.make(
			    [
			        ['query', 'GET', 'resources/common/boxCd/query']
			    ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),

		boxGroupMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/boxGroupMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/boxGroupMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/boxGroupMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/boxGroupMasterEdit/register'],
				 ['update',             'POST', 'resources/master/boxGroupMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
 *
 * @description
 * 荷材グループメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('BoxGroupMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'boxGroupMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.setBoxGroupMasterEditCols = [
	                           {field:"mbox.boxCd", displayName:"荷材CD"}

	                           ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#initScreen
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'list',
			columnDefs: 'setBoxGroupMasterEditCols'
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mbox.boxCd" : {
					key : "boxCd",
					value : "boxNm",
					listModel : "boxList"
				}
		};

		// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana
		// ※ 入力行以外も登録されるため、入力行を自動でチェックする処理を削除

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * 初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetBox(),
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana
	// ※ 入力行以外も登録されるため、入力行を自動でチェックする処理を削除

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PBoxGroupMasterEdit.object:BoxGroupMasterEdit#deferredGetBox
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
	 *
	 * @description
	 * 荷材CD取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBox = function () {
		var deferred = $q.defer();

		var request = {};
		//荷主センタ変更対応 201７.01.23 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($route.current.params.centerCd) {
			request.centerCd = $route.current.params.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
		//荷主センタ変更対応 201７.01.23 sja End
		api.boxList.query(request).then(function(response){
			$scope.boxList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
	 *
	 * @description
	 * 荷材グループメンテナンス(編集)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End
			// 訂正
			var request = {};
			request.setBoxGrpId = $route.current.params.setBoxGrpId;

			api.boxGroupMasterEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}
				// 荷材グループヘッダ関連
				$scope.head = response.data.head;

				// 荷材グループ明細関連
				$scope.list = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End
					directiveControl.editable($scope, 'boxGrpCd', false);
				// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
				} else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope,"delFlg",false);
				}
				// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End
				directiveControl.editable($scope, 'centerCd', false);

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {
			// 新規
			api.boxGroupMasterEdit.initNew().then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				// 荷材グループヘッダ関連
				$scope.head = response.data.head;
				// 荷材グループ明細関連
				$scope.list = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				// ログイン情報より初期値を設定
				$scope.head.mbox.mcenter.centerCd = userInfo.centerCd;

				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope,"delFlg",false);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#getClassForRow
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#addRow
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		if ($scope.screenMode == SCREEN_MODE.Update) {
			$scope.list.push(angular.copy($scope.blankRow));

		} else {
			$scope.list.push(angular.copy($scope.blankRow));
	    }
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#removeRow
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.24 sja Start
		// 選択行削除チェック
//		var i = 0;
//		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
//			if ($scope.list.indexOf(row) > -1) {
//				if (row.boxGrpId != null) {
//					i += 1;
//					return;
//				}
//			}
//		});
//		if (i > 0){
//			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
//			return;
//		}
		// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.24 sja End
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mbox.boxCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mbox.boxCd != null)
						){
				item++;
			}
		}
		// 複数行の場合に警告
		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.list.indexOf(row) > -1) {
				$scope.list.splice($scope.list.indexOf(row), 1);
			}
		});

		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit#register
	 * @methodOf oneslogiWms.BoxGroupMasterEdit.object:BoxGroupMasterEdit
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

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;

		// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana Start

		// [エンハンス PH2.0] ON推受入_問題点指摘票(空行の検証解除処理を削除) ON推-UK114-009  2016.02.24 sja

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		// 選択行の確認
		for (var row = 0; row < $scope.list.length; row++) {

			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// 空行
				emptyBody.push($scope.list[row]);
			} else {
				// 入力行
				listBody.push($scope.list[row]);
			}
		}

		// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana End


		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				gridDirectiveControl.validity($scope.gridOptions, true);

				// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana Start

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.list.splice($scope.list.indexOf(row), 1);
				});

				// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana End

				var rowIndex = new Array();
				var errAry = new Array();

				if ($scope.screenMode == SCREEN_MODE.Register) {
					// 明細データなしの場合
					// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.24 sja Start
//					if($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0){
					if($scope.list.length == 0){
				   // [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.24 sja End
						alertMessage.setErrorMessageByCode("noDetailsError");
						return;
					}
				}

				// 基準荷材CDと明細部の荷材CD重複チェック
				var m = 0;
				var boxCd = $scope.head.mbox.boxCd;
				// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.24 sja Start
//				for (var l = 0; l  <$scope.gridOptions.gridApi.selection.getSelectedRows().length; l++) {
				for (var l = 0; l  <$scope.list.length; l++) {
					if ($scope.list[l].mbox.boxCd == boxCd){
//					if ($scope.gridOptions.gridApi.selection.getSelectedRows()[l].mbox.boxCd == boxCd){
			    // [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.24 sja End
						rowIndex[m] =l;
						m++;
					}
				}
				// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.14 sja Start
				if (m == 0){
					var messageCd = "boxCdCannotInputAnotherBoxCdError";
					optionMessageControl.show($scope, "boxCd", $filter('owfMessage')(messageCd));
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}
				// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.14 sja End
				// 荷材CD重複チェック
				var j = 0;
				// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.14 sja Start
				for (var row = 0; row <$scope.list.length; row++) {
					var boxCd = $scope.list[row].mbox.boxCd;
					for (var i = row+1; i <$scope.list.length; i++) {
						if ($scope.list[i].mbox.boxCd == boxCd){
			   // [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.14 sja End
							rowIndex[j] =i;
							j++;
						}
					}
				}
				if (j > 0){
					var messageCd = "boxCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "mbox.boxCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana Start
				// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.14 sja Start
				request.data.body = listBody;
				// [エンハンス PH2.0] ON推受入_問題点指摘票 ON推-UK114-009  2016.02.14 sja End
				// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana End

				// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.boxGrpId = null;
				}
				// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End

				// 入力チェック
				api.boxGroupMasterEdit.inputCheck(request).then(function(response){
					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//親商品CD存在チェック
							if (response.status.listStatus[i].status.statusCode == 5){
								optionMessageControl.show($scope, "boxGrpCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								return;
							}

						}
					}
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}
					// 画面モード判定
					if ($scope.screenMode == SCREEN_MODE.Update) {
						// セット品構成マスタメンテナンス(編集)データ登録または更新
						api.boxGroupMasterEdit.update(request).then(function(response){
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){

								}
							}
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
								return;
							}
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						});
					} else {
						// セット品構成マスタメンテナンス(編集)データ登録または更新
						api.boxGroupMasterEdit.register(request).then(function(response){
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//荷材CD存在チェック
									if (response.status.listStatus[i].status.statusCode == 5){
										optionMessageControl.show($scope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
								return;
							}
							owsCommon.toggleSelectAll($scope.gridOptions, false);
							// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
							if ($scope.screenMode == SCREEN_MODE.Register) {
							// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End
								// 初期化を呼び出し
								$scope.initScreenHttp();
							// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add Start
							}
							// コピー機能追加 荷材グループマスタ画面修正 2016.07.07 Lin Zar Ni Myint Add End
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

	// 画面初期化処理を実行
	$scope.initScreen();
}]);