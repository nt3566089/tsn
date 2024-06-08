/**
 * @ngdoc overview
 * @name oneslogiWms.CenterProductControlMasterEdit
 *
 * @description
 * 商品マスタメンテナンス(編集)画面<br>
 *
 * 商品マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.CenterProductControlMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterProductControlMasterEdit.service:CenterProductControlMasterEditApi
 *
 * @description
 * 商品マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 商品マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/CenterProductControlMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/CenterProductControlMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/CenterProductControlMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/CenterProductControlMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/CenterProductControlMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('CenterProductControlMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		supplierZip: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		CenterProductControlMasterList: AngularAPIClient.make(
				[
				 ['initUpdate',         'GET',  'resources/master/CenterProductControlMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/CenterProductControlMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/CenterProductControlMasterEdit/register'],
				 ['update',             'POST', 'resources/master/CenterProductControlMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit
 *
 * @description
 * 商品マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CenterProductControlMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'CenterProductControlMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.CenterProductControlMasterListEditCols =
		[
		 {field:"mcenter.centerCd", displayName:"センタ"},
		 {field:"deliveryOrder", displayName:"配送順"},
		 {field:"deliveryReadTime", displayName:"配送リードタイム"},
		 {field:"delFlg", displayName:"削除"}
		 ];

	var bodyList;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit#initScreen
	 * @methodOf oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit
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
		// 荷主リストの設定
		$scope.clientCenterProductControlMasterList = userInfo.clientList;
		// センタ取得
		$scope.centerList = userInfo.centerList;

		// [#979] 選択なしのグリッドに変更 2017.02.15 kawana Start
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
		// [#979] 選択なしのグリッドに変更 2017.02.15 kawana End

			data: 'CenterProductControlMasterList',
			columnDefs: 'CenterProductControlMasterListEditCols',
		});
		//[ON推-品向-294]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"mclient.clientCd" : {
					key : "clientId",
					value : "clientCd",
					listModel : "clientList"
				}
		};
		//[ON推-品向-294]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 End

		// 項目のエラーマッピング
		statusInfo.mappingErrorMessage($scope, "centerCd", 6, 9);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit
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
				 $scope.deferredGetDelFlg(),
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showSlotLocation
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showSlotLocation = function(){

		var items = {
				centerCd: $scope.head.mcenter.centerCd,
				locationCd: $scope.head.slotlocname
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.slotlocname = selectedItem.locationCd;
		});
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#showPickLocation
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * ロケーション検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showPickLocation = function(){

		var items = {
				centerCd: $scope.head.mcenter.centerCd,
				locationCd: $scope.head.picklocname
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.picklocname = selectedItem.locationCd;
		});
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit
	 *
	 * @description
	 * 削除取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */

		$scope.deferredGetDelFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		//荷主センタ変更対応 2017.02.27 sja Start
		if ($route.current.params.clientCd) {
			request.clientId = userInfo.clientIdByCd($route.current.params.clientCd);
		} else {
			request.clientId = userInfo.clientIdByCd(userInfo.clientCd);
		}
		//荷主センタ変更対応 2017.02.27 sja End
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			//荷主センタ変更対応 201７.02.06 sja Start
			deferred.resolve();
			//deferred.resolve(response);
			//荷主センタ変更対応 201７.02.06 sja End
		});

		return deferred.promise;
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit
	 *
	 * @description
	 * 商品マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

			//2.2.初期値設定
			var request = {};
			request.mfwhItemId = $route.current.params.mfwhItemId;

			api.CenterProductControlMasterList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}
				// ヘッダ関連
				$scope.head = response.data.head;

				owsCommon.syncExec(function() {

				});

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});


		return deferred.promise;
	};



	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit#register
	 * @methodOf oneslogiWms.CenterProductControlMasterEdit.object:CenterProductControlMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		if (!owsCommon.viewConfirm("dataRegisterConfirmation")) {
			return;
		}

		// データ登録または更新
		api.CenterProductControlMasterList.register(request).then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}
			// 前画面へ戻る
			owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
		});
	};
	// 画面初期化処理を実行
	$scope.initScreen();

}]);






