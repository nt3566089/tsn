/**
 * @ngdoc overview
 * @name oneslogiWms.ShapeGroupMasterEdit
 *
 * @description
 * 荷姿グループメンテナンス(編集)画面<br>
 *
 * 荷姿グループの情報を登録・更新・削除する画面。
 */
angular.module('oneslogiWms.ShapeGroupMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ShapeGroupMasterEdit.service:shapeGroupMasterEditApi
 *
 * @description
 * 荷姿グループメンテナンス(編集)画面用WebAPI定義<br>
 *
 * データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/common/shapeCd/query 荷姿データ取得WebAPI<br>
 * <br>
 * shapeGroupMasterEdit  荷姿グループメンテナンス(編集)画面用WebAPI<br>
 * ・resources/master/shapeGroupMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/shapeGroupMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/shapeGroupMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/shapeGroupMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('ShapeGroupMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		shapeList: AngularAPIClient.make(
			    [
			        ['query', 'GET', 'resources/common/shapeCD/query']
			    ]
		),
		parentShapeList: AngularAPIClient.make(
			    [
			        ['query', 'GET', 'resources/common/shapeCD/query']
			    ]
		),
		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),

		shapeGroupMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/ShapeGroupMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/ShapeGroupMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/ShapeGroupMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/ShapeGroupMasterEdit/register'],
				 ['update',             'POST', 'resources/master/ShapeGroupMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
 *
 * @description
 * 荷姿グループメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ShapeGroupMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ShapeGroupMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.setShapeGroupMasterEditCols = [
	                           {field:"mshape.shapeCd", displayName:"荷姿CD"}

	                           ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#initScreen
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'list',
			columnDefs: 'setShapeGroupMasterEditCols'
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mshape.shapeCd" : {
					key : "shapeCd",
					value : "shapeNm",
					listModel : "shapeList"
				},
				"shapeCd" : {
					key : "shapeCd",
					value : "shapeNm",
					listModel : "parentShapeList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList"
				}
		};

		// グリッドの荷姿にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"mshape.shapeCd":{
					"ng-change":{
						eventFunction:"shapeCdChange(row.rowIndex)"
					}
				},
				"gtin14Symbol":{
					"ng-change":{
						eventFunction:"gtin14SymbolChange(row.rowIndex)"
					}
				},
				"shapeCd":{
					"ng-change":{
						eventFunction:"parentShapeCdChange(row.rowIndex)"
					}
				},
				"casePickFlg":{
					"ng-click":{
						eventFunction:"casePickFlgChange(row.rowIndex)"
					}
				},
				"emReplenishShapeFlg":{
					"ng-click":{
						eventFunction:"emReplenishShapeFlgChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
					eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
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
				 $scope.deferredGetDecimalExistFlg(),
				 $scope.deferredGetShape(),
				 $scope.deferredGetParentShape(),
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#ShapeBlur
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
	 *
	 * @description
	 * 荷姿のロストフォーカス処理<br>
	 * 荷姿のロストフォーカス時の処理。
	 */
	$scope.shapeCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.gtin14SymbolChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.casePickFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.emReplenishShapeFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.parentShapeCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
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
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#deferredGetDecimalExistFlg
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 小数有無フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDecimalExistFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DECIMAL_EXIST_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.decimalExistFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PShapeGroupMasterEdit.object:ShapeGroupMasterEdit#deferredGetShape
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 荷姿CD取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShape = function () {
		var deferred = $q.defer();

		var request = {};
		request.clientCd = userInfo.clientCd;

		api.shapeList.query(request).then(function(response){
			$scope.shapeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PShapeGroupMasterEdit.object:ShapeGroupMasterEdit#deferredGetParentShape
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 親荷姿CD取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetParentShape = function () {
		var deferred = $q.defer();

		var request = {};
		request.clientCd = userInfo.clientCd;

		api.parentShapeList.query(request).then(function(response){
			$scope.parentShapeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 荷姿グループメンテナンス(編集)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
			// 訂正
			var request = {};
			request.setShapeGrpId = $route.current.params.setShapeGrpId;

			api.shapeGroupMasterEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}
				// 荷姿グループヘッダ関連
				$scope.head = response.data.head;

				// 荷姿グループ明細関連
				$scope.list = response.data.body;

				//親荷姿CD設定
				for (var row = 0; row < $scope.list.length; row++) {
					if (row < $scope.list.length-1) {
						$scope.list[row].shapeCd = $scope.list[row+1].mshape.shapeCd;
					}
			    }

				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add Start
				// 最大荷姿件数
				$scope.maxShapeCount = response.data.maxShapeCount;
				// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add End

				if ($scope.screenMode == SCREEN_MODE.Update) {
					directiveControl.editable($scope, 'shapeGrpCd', false);
				} else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope,"delFlg",false);
				}

				directiveControl.editable($scope, 'clientCd', false);

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {
			// 新規
			api.shapeGroupMasterEdit.initNew().then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				// 荷姿グループヘッダ関連
				$scope.head = response.data.head;
				// 荷姿グループ明細関連
				$scope.list = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add Start
				// 最大荷姿件数
				$scope.maxShapeCount = response.data.maxShapeCount;
				// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Add End
				// ログイン情報より初期値を設定
				$scope.head.mclient.clientCd = userInfo.clientCd;
				$scope.head.mclient.clientId = userInfo.clientId;

				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope,"delFlg",false);

				// 小数有無の初期値設定
				directiveControl.editable($scope,"decimalExistFlg",true);

				//最初に１行の空行を設定する
				var addRow = angular.copy($scope.blankRow);
				addRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				// 行追加
				$scope.list.push(addRow);
				gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.list.length-1);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#getClassForRow
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
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
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#addRow
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Mod Start
		if ($scope.list.length < $scope.maxShapeCount) {
			var addRow = angular.copy($scope.blankRow);
			addRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
			// 行追加
			$scope.list.push(addRow);
			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.list.length-1);
		} else {
			alertMessage.setErrorMessageByCode("overShapeGroupDtlError", $scope.maxShapeCount);
			return;
		}
		// [#3496][Ver3.0] 最大荷姿数のプロパティ管理対応 2018.02.22 honma Mod End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#removeRow
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		// 選択行削除チェック
		var i = 0;
		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.list.indexOf(row) > -1) {
					if (row.shapeId != null) {
						i += 1;
						return;
					}
				}
			});
			if (i > 0){
				alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
				return;
			}
		}

		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mshape.shapeCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mshape.shapeCd != null)
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
	 * @name oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit#register
	 * @methodOf oneslogiWms.ShapeGroupMasterEdit.object:ShapeGroupMasterEdit
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

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				gridDirectiveControl.validity($scope.gridOptions, true);

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.list.splice($scope.list.indexOf(row), 1);
				});

				var rowIndex = new Array();
				var errAry = new Array();

				// 明細データなしの場合
				var c = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						c = c + 1;
					}
				}
				if(c == 0){
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// 小数有無フラグで「1：小数を含む」を選択したかつ明細行数＞１行の場合
				var overOneLine = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						overOneLine = overOneLine + 1;
					}
				}
				var listCount = 0;
				if ($scope.head.decimalExistFlg == '1' && overOneLine > 1) {
					alertMessage.setErrorMessageByCode("shapeGroupDtlOverOneLineError");
					return;
				}

				// 荷姿CD重複チェック
				var j = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						var shapeCd = $scope.list[row].mshape.shapeCd;
						for (var i = row+1; i <$scope.list.length; i++) {
							if ($scope.list[i].delFlg == '0') {
								if ($scope.list[i].mshape.shapeCd == shapeCd){
									rowIndex[j] =i;
									j++;
								}
							}
						}
					}
				}
				if (j > 0){
					var messageCd = "shapeCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "mshape.shapeCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// GTIN14重複チェック
				var k = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						var gtin14Symbol = $scope.list[row].gtin14Symbol;
						for (var i = row+1; i <$scope.list.length; i++) {
							if ($scope.list[i].delFlg == '0') {
								if (gtin14Symbol != null && gtin14Symbol != '' && $scope.list[i].gtin14Symbol != null && $scope.list[i].gtin14Symbol != ''){
									if ($scope.list[i].gtin14Symbol == gtin14Symbol){
										rowIndex[k] =i;
										k++;
									}
								}
							}
						}
					}
				}
				if (k > 0){
					var messageCd = "gtin14DuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "gtin14Symbol", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 親荷姿CD重複チェック
				var l = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						var parentShapeCd = $scope.list[row].shapeCd;
						for (var i = row+1; i <$scope.list.length; i++) {
							if ($scope.list[i].delFlg == '0') {
								if ($scope.list[i].shapeCd == parentShapeCd && parentShapeCd != null){
									rowIndex[l] =i;
									l++;
								}
							}
						}
					}
				}
				if (l > 0){
					var messageCd = "parentshapeCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "shapeCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 親荷姿CDが共に入力している場合
				var a = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						if (isNullOrUndefined($scope.list[row].shapeCd) == false){
							a = a + 1;
						}
					}
				}

				if (a == row){
					alertMessage.setErrorMessageByCode("allParentShapeCdInputError");
					return;
				}

				// ２行以上の親荷姿CDが未入力の場合
				var m = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						if (isNullOrUndefined($scope.list[row].shapeCd)){
							m = m + 1;
						}
					}
				}

				if (m > 1){
					alertMessage.setErrorMessageByCode("parentShapeCdPluralNotInputError");
					return;
				}

				// 荷姿CDと親荷姿CDが同じの場合
				var b = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						if ($scope.list[row].mshape.shapeCd == $scope.list[row].shapeCd){
							rowIndex[b] = row;
							b++;
						}
					}
				}

				if (b > 0){
					var messageCd = "parentChildShapeCdInputSameShapeCdError";
					gridOptionMessageControl.show($scope.gridOptions, "shapeCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 最大単位の荷姿が親荷姿として指定されていない場合
				var s = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0' && $scope.list[row].shapeCd == null) {
						var shapeCd = $scope.list[row].mshape.shapeCd
						for (var i = 0; i <$scope.list.length; i++) {
							if ($scope.list[i].delFlg == '0') {
								if ($scope.list[i].shapeCd == shapeCd){
									s++;
								}
							}
						}
					}
				}

				if (s == 0 && overOneLine > 1){
					alertMessage.setErrorMessageByCode("largestShapeCdNotSelectedAsParentShapeCdError");
					return;
				}

				// ２行以上のケースピッキング対象にチェックを入れる場合
				var o = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						if ($scope.list[row].casePickFlg == '1'){
							o = o + 1;
						}
					}
				}

				if (o > 1){
					alertMessage.setErrorMessageByCode("casePickFlgPluralNotInputError");
					return;
				}

				// ２行以上の緊急補充ゾーン補充荷姿にチェックを入れる場合
				var r = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					if ($scope.list[row].delFlg == '0') {
						if ($scope.list[row].emReplenishShapeFlg == '1'){
							r = r + 1;
						}
					}
				}

				if (r > 1){
					alertMessage.setErrorMessageByCode("emReplanishShapeFlgPluralNotInputError");
					return;
				}

				// 最小荷姿（一番下の子荷姿）のケースピッキング対象にチェックを入れる場合
				var u = 0;
				for (var row = 0; row <$scope.list.length; row++) {
					var v = 0;
					if ($scope.list[row].delFlg == '0') {
						var shapeCd = $scope.list[row].mshape.shapeCd;
						for (var i = 0; i <$scope.list.length; i++) {
							if ($scope.list[i].delFlg == '0') {
								if ($scope.list[i].shapeCd == shapeCd){
									v++;
								}
							}
						}
						if (v==0 && $scope.list[row].casePickFlg == '1'){
							rowIndex[u] =row;
							u++;
						}
					}
				}

				if (u > 0){
					alertMessage.setErrorMessageByCode("casePickFlgCannotSetError");
					return;
				}

				//荷姿グループ明細のソート順の設定
				//未削除の明細の行数
				var countRow = 0
				for (var row = 0; row <listBody.length; row++) {
					if (listBody[row].delFlg == '0'){
						countRow = countRow + 1;
					}
				}
				//明細の行数の判定
				if (countRow == 4) {
					//最大の親荷姿CD
					var maxShapeCd = '';
					for (var row = 0; row <listBody.length; row++) {
						//ソート順設定Flg
						var setFlg = false;
						if (listBody[row].delFlg == '0'){
							//最大の親荷姿の判定
							if (listBody[row].shapeCd == null) {
								listBody[row].shapeSort = 4;
								setFlg = true;
							}

							var j = 0;
							for (var i = 0; i <listBody.length; i++) {
								if (listBody[i].delFlg == '0'){
									if (listBody[row].mshape.shapeCd == listBody[i].shapeCd) {
										j = j + 1;
									}
									if (listBody[i].shapeCd == null) {
										maxShapeCd = listBody[i].mshape.shapeCd
									}
								}
							}

							//最小の荷姿単位の判定
							if (j == 0 && setFlg == false) {
								listBody[row].shapeSort = 1;
								setFlg = true;
							}

							//ソート順=3の判定
							if (listBody[row].shapeCd == maxShapeCd && setFlg == false) {
								listBody[row].shapeSort = 3;
								setFlg = true;
							}

							//ソート順=2の判定
							if (setFlg == false) {
								listBody[row].shapeSort = 2;
							}
						}
					}
				}

				if (countRow == 3) {
					for (var row = 0; row <listBody.length; row++) {
						if (listBody[row].delFlg == '0'){
							//最大の親荷姿の判定
							if (listBody[row].shapeCd == null) {
								listBody[row].shapeSort = 3;
							} else {
								var j = 0;
								for (var i = 0; i <listBody.length; i++) {
									if (listBody[i].delFlg == '0'){
										if (listBody[row].mshape.shapeCd == listBody[i].shapeCd) {
											j = j + 1;
										}
									}
								}
								//最小の荷姿単位の判定
								if (j == 0) {
									listBody[row].shapeSort = 1;
								} else {
									listBody[row].shapeSort = 2;
								}
							}
						}
					}
				}

				if (countRow == 2) {
					for (var row = 0; row <listBody.length; row++) {
						if (listBody[row].delFlg == '0'){
							//親荷姿の判定
							if (listBody[row].shapeCd == null) {
								listBody[row].shapeSort = 2;
							} else {
								listBody[row].shapeSort = 1;
							}
						}
					}
				}

				if (countRow == 1) {
					for (var row = 0; row <listBody.length; row++) {
						if (listBody[row].delFlg == '0'){
							listBody[row].shapeSort = 1;
						}
					}
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.body = listBody;

				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.shapeGrpId = null;
				}

				// 入力チェック
				api.shapeGroupMasterEdit.inputCheck(request).then(function(response){
					var warnmessageFlg = false;
					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							if ($scope.screenMode == SCREEN_MODE.Update) {
								//荷姿グループに紐付く商品存在チェック
								if (response.status.listStatus[i].status.statusCode == 7){
									alertMessage.setErrorMessageByCode("shapeGroupCannotDeleteUsedByProductError");
									return;
								}
								//荷姿グループ明細に紐付く商品変更チェック
								if (response.status.listStatus[i].status.statusCode == 8){
									alertMessage.setErrorMessageByCode("shapeGroupDtlCannotUpdateUsedByProductError");
									return;
								}

								//荷姿グループ明細に紐付く商品存在チェック
								if (response.status.listStatus[i].status.statusCode == 9){
									alertMessage.setErrorMessageByCode("shapeGroupDtlCannotDeleteUsedByProductError");
									return;
								}

								//荷姿グループ明細に紐付く商品追加チェック
								if (response.status.listStatus[i].status.statusCode == 12){
									alertMessage.setErrorMessageByCode("shapeGroupDtlCannotInsertUsedByProductError");
									return;
								}

								//荷姿グループ明細に紐付く商品変更チェック
								if (response.status.listStatus[i].status.statusCode == 13){
									warnmessageFlg = true
									if (!owsCommon.viewConfirm("shapeGroupDtlCannotChangeUsedByProductError")) {
										return;
									}
								}
							}

							//荷姿グループ存在チェック
							if (response.status.listStatus[i].status.statusCode == 10){
								optionMessageControl.show($scope, "shapeGrpCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								return;
							}

							//荷姿マスタ存在チェック
							if (response.status.listStatus[i].status.statusCode == 11){
								var messageCd = "shapeCdNotFoundError";
								gridOptionMessageControl.show($scope.gridOptions, "mshape.shapeCd", $filter('owfMessage')(messageCd), parseInt(response.status.listStatus[i].status.messageCode));
								gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
								directiveControl.firstErrorOnFocus('inputform');
								return;
							}

						}
					}
					// 登録確認
					if (warnmessageFlg == false) {
						if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
							return
						}
					}

					// 画面モード判定
					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 荷姿グループマスタ、荷姿グループ明細マスタメンテナンス(編集)データ登録または更新
						api.shapeGroupMasterEdit.update(request).then(function(response){
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
								return;
							}
							// 前画面へ戻る
							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
						});
					} else {
						// 荷姿グループマスタ、荷姿グループ明細マスタメンテナンス(編集)データ登録または更新
						api.shapeGroupMasterEdit.register(request).then(function(response){
							if (response.status.listStatus != null){
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//荷姿CD存在チェック
									if (response.status.listStatus[i].status.statusCode == 5){
										optionMessageControl.show($scope, "shapeGrpCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										return;
									}
								}
							}
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
								return;
							}
							owsCommon.toggleSelectAll($scope.gridOptions, false);

                           	if ($scope.screenMode == SCREEN_MODE.Register) {
						    	// 初期化を呼び出し
                           		$scope.initScreenHttp();
							}
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