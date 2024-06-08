/**
 * @ngdoc overview
 * @name oneslogiWms.SetStructureEdit
 *
 * @description
 * セット品構成マスタメンテナンス(編集)画面<br>
 *
 * セット品構成マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.SetStructureEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.SetStructureEdit.service:setStructureEditApi
 *
 * @description
 * セット品構成マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/common/product/record 商品データ取得WebAPI<br>
 * <br>
 * setStructureEdit セット品構成マスタメンテナンス(編集)画面用WebAPI<br>
 * ・resources/master/setStructureEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/setStructureEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/setStructureEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/setStructureEdit/update 入力データ更新WebAPI<br>
 */
.factory('setStructureEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),

		product: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),

		setStructureEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/setStructureEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/setStructureEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/setStructureEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/setStructureEdit/register'],
				 ['update',             'POST', 'resources/master/setStructureEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit
 *
 * @description
 * セット品構成マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('SetStructureEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'setStructureEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.setStructureEditCols = [
	                           {field:"mproduct.productCd", displayName:"構成品CD"},
	                           {field:"mproduct.productNm", displayName:"構成品名称"},
	                           {field:"mproduct.productAbbr", displayName:"構成品略称"},
	                           {field:"mproduct.janCd", displayName:"JANCD"},
	                           {field:"unitNum", displayName:"セット入数"},
	                           {field:"delFlg", displayName:"削除"}

	                           ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#initScreen
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
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
			columnDefs: 'setStructureEditCols'
		});

		// グリッドの構成品コード、セット入数列にボタンを設定
		$scope.gridButtonOptions = {
				"mproduct.productCd":{
					clickFunction:"showProduct(row.rowIndex)"
				}
		};

		// グリッドを設定
		$scope.gridEventOptions = {

			// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawaa Start
			// ※ 入力行以外も登録されるため、入力行を自動でチェックする処理を削除
			"mproduct.productCd":{
				"ng-blur":{
					eventFunction:"productCdBlur(row.rowIndex)"
				}
			}
			// [#979] 未入力行がエラーになり登録できない問題を修正 2017.02.14 kawana Start
		};

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"mproduct.productCd" : {
					key : "productCd",
					value : "productNm",
					listModel : "productCdList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#initScreenHttp
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
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
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#showProduct
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * 構成品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された構成品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex){

		var items = {
				clientCd: $scope.head.mproduct.mclient.clientCd,
				productCd: $scope.list[rowIndex].mproduct.productCd
		};

		// 構成品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.list[rowIndex].mproduct.productCd =  selectedItem.productCd;
			$scope.list[rowIndex].mproduct.productNm =  selectedItem.productNm;
			$scope.list[rowIndex].mproduct.productAbbr = selectedItem.productAbbr;
			$scope.list[rowIndex].mproduct.janCd =  selectedItem.janCd;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#productCdBlur
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * 構成品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、構成品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品名称コードを取得
		var productCd = $scope.list[rowIndex].mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mproduct.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				if (response.data.mProduct.productId == null){
					$scope.list[rowIndex].mproduct.productNm = null;
					$scope.list[rowIndex].mproduct.productAbbr = null;
					$scope.list[rowIndex].mproduct.janCd = null;

					return;
				}
				$scope.list[rowIndex].mproduct.productNm = response.data.mProduct.productNm;
				$scope.list[rowIndex].mproduct.productAbbr = response.data.mProduct.productAbbr;
				$scope.list[rowIndex].mproduct.janCd = response.data.mProduct.janCd;
			});

		} else {
			$scope.list[rowIndex].mproduct.productNm = null;
			$scope.list[rowIndex].mproduct.productAbbr = null;
			$scope.list[rowIndex].mproduct.janCd = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#showProducthead
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * 商品コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProducthead = function(){

		var items = {
				clientCd: $scope.head.mproduct.mclient.clientCd,
				productCd: $scope.head.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd =  selectedItem.productCd;
			$scope.head.mproduct.productNm =  selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#productCdBlurhead
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * 親商品コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、親商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlurhead = function() {
		// 入力された親商品コードを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.mproduct.mclient.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.head.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.head.mproduct.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
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
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#deferredGetInitData
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * セット品構成マスタメンテナンス(編集)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add End
			// 訂正
			var request = {};
			request.setParentId = $route.current.params.setParentId;

			api.setStructureEdit.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}
				// 親商品ヘッダ関連
				$scope.head = response.data.head;
				// 構成品明細関連
				$scope.list = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add End
					directiveControl.editable($scope, 'productCd', false);
					gridDirectiveControl.editable($scope.gridOptions, 'mproduct.productCd', false);
				// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add Start
				} else {
					$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope,"delFlg",false);
					gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false);
				}
				// コピー機能追加 セット品構成マスタ画面修正 2016.06.23 Lin Zar Ni Myint Add End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {
			// 新規
			api.setStructureEdit.initNew().then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				// 親商品ヘッダ関連
				$scope.head = response.data.head;
				// 構成品明細関連
				$scope.list = response.data.body;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;
				// ログイン情報より初期値を設定
				$scope.head.mproduct.mclient.clientCd = userInfo.clientCd;

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
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#getClassForRow
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
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
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#addRow
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

		if ($scope.screenMode == SCREEN_MODE.Update) {
			$scope.list.push(angular.copy($scope.blankRow));
			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.list.length-1);

		} else {
			$scope.list.push(angular.copy($scope.blankRow));
			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false);
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#removeRow
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 選択行削除チェック
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma Start
		if ($scope.screenMode != SCREEN_MODE.Copy) {
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma End
			var i = 0;
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.list.indexOf(row) > -1) {
					if (row.setParentId != null) {
						i += 1;
						return;
					}
				}
			});
			if (i > 0){
				alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
				return;
			}
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma Start
		}
		// [#337][Ver2.1.0 品質検査] マスタコピー機能 行削除チェック不正対応 2016.11.29 Add honma End
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mproduct.productCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mproduct.productCd != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].unitNum != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].unitNum != null)
							||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)
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
	 * @name oneslogiWms.SetStructureEdit.object:SetStructureEdit#register
	 * @methodOf oneslogiWms.SetStructureEdit.object:SetStructureEdit
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

		// [#979] 空行の必須エラーで登録できない問題を修正 2017.02.16 kawana Start

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		// 空行判定
		for (var row = 0; row < $scope.list.length; row++) {

			if (!$scope.list[row].delFlg || $scope.list[row].delFlg == "0") {
				// 削除フラグ = 0

				$scope.list[row].delFlg = null;
				if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
					// 空行

					emptyBody.push($scope.list[row]);

					// 検証機能を解除
					gridDirectiveControl.validity($scope.gridOptions, false, row);
				} else {
					// 入力行

					listBody.push($scope.list[row]);
				}
				// 登録時、エラー発生時を考慮し 削除対象、登録対象 に関わらず削除フラグを元に戻しておく
				$scope.list[row].delFlg = "0";

			} else {
				listBody.push($scope.list[row]);
			}
		}

		// [#979] 空行の必須エラーで登録できない問題を修正 2017.02.16 kawana End

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {

				gridDirectiveControl.validity($scope.gridOptions, true);

				// [#979] 空行の必須エラーで登録できない問題を修正 2017.02.14 kawana Start

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.list.splice($scope.list.indexOf(row), 1);
				});

				// [#979] 空行の必須エラーで登録できない問題を修正 2017.02.14 kawana End

				var rowIndex = new Array();
				var errAry = new Array();

				if ($scope.screenMode == SCREEN_MODE.Register) {
					// 明細データなしの場合
					if($scope.list.length == 0){
						alertMessage.setErrorMessageByCode("noDetailsError");
						return;
					}
				}

				// 親商品と構成品重複チェック
				var m = 0;
				var productCd = $scope.head.mproduct.productCd;
				for (var l = 0; l < $scope.list.length; l++) {
					if ($scope.list[l].mproduct.productCd == productCd){
						rowIndex[m] =l;
						m++;
					}
				}
				if (m > 0){
					var messageCd = "identityParentProductAndStructureProductError";
					optionMessageControl.show($scope, "productCd", $filter('owfMessage')(messageCd));
					gridOptionMessageControl.show($scope.gridOptions, "mproduct.productCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 構成品CD重複チェック
				var j = 0;
				for (var row = 0; row < $scope.list.length; row++) {
					var productCd = $scope.list[row].mproduct.productCd;
					for (var i = row+1; i < $scope.list.length; i++) {
						if ($scope.list[i].mproduct.productCd == productCd){
							rowIndex[j] =i;
							j++;
						}
					}
				}
				if (j > 0){
					var messageCd = "structureCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "mproduct.productCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('inputform');
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.body = $scope.list;

				// コピー機能追加 セット品構成マスタ画面修正 2016.07.04 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.setParentId = null;
				}
				// コピー機能追加 セット品構成マスタ画面修正 2016.07.04 Lin Zar Ni Myint Add End

				// 入力チェック
				api.setStructureEdit.inputCheck(request).then(function(response){
					if (response.status.listStatus != null){
						// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
						var err = 0;
						// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							//親商品CD存在チェック
							if (response.status.listStatus[i].status.statusCode == 5){
								optionMessageControl.show($scope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
								//return;
								err++;
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
							}
							//構成品CD存在チェック
							if (response.status.listStatus[i].status.statusCode == 6){
								gridOptionMessageControl.show($scope.gridOptions, "mproduct.productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode), response.status.listStatus[i].status.rowIndex);
								//return;
								err++;
							}
						}
						// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
						if(err > 0){
							return;
						}
						// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
					}
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}

					// 画面モード判定
					if ($scope.screenMode == SCREEN_MODE.Update) {
						// セット品構成マスタメンテナンス(編集)データ登録または更新
						api.setStructureEdit.update(request).then(function(response){
							if (response.status.listStatus != null){
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
								var err = 0;
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//構成品CD存在チェック
									if (response.status.listStatus[i].status.statusCode == 6){
										gridOptionMessageControl.show($scope.gridOptions, "mproduct.productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode), response.status.listStatus[i].status.rowIndex);
										// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
										//return;
										err++;
										// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
									}
								}
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
								if(err > 0){
									return;
								}
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
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
						api.setStructureEdit.register(request).then(function(response){
							if (response.status.listStatus != null){
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
								var err = 0;
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
								for (var i = 0 ;i <response.status.listStatus.length;i++){
									//親商品CD存在チェック
									if (response.status.listStatus[i].status.statusCode == 5){
										optionMessageControl.show($scope, "productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
										// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
										//return;
										err++;
										// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
									}
									//構成品CD存在チェック
									if (response.status.listStatus[i].status.statusCode == 6){
										gridOptionMessageControl.show($scope.gridOptions, "mproduct.productCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode), response.status.listStatus[i].status.rowIndex);
										// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
										//return;
										err++;
										// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
									}
								}
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi Strat
								if(err > 0){
									return;
								}
								// [ON推-CT113-008] 明細はエラー件数より、0件以上処理終了 2015.12.24 hayashi End
							}
							// 処理結果確認
							if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
								return;
							}
							owsCommon.toggleSelectAll($scope.gridOptions, false);
							// コピー機能追加 セット品構成マスタ画面修正 2016.07.04 Lin Zar Ni Myint Add Start
							if ($scope.screenMode == SCREEN_MODE.Register) {
							// コピー機能追加 セット品構成マスタ画面修正 2016.07.04 Lin Zar Ni Myint Add End
								// 初期化を呼び出し
								$scope.initScreenHttp();
							// コピー機能追加 セット品構成マスタ画面修正 2016.07.04 Lin Zar Ni Myint Add Start
							}
							// コピー機能追加 セット品構成マスタ画面修正 2016.07.04 Lin Zar Ni Myint Add End
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