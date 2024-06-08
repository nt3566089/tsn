/**
 * @ngdoc overview
 * @name oneslogiWms.ImportTypeMasterList
 *
 * @description 取込み種別マスタ一覧画面<br>
 *
 * 取込み種別マスタ一覧表示する画面。
 *
 */
angular.module('oneslogiWms.ImportTypeMasterList', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ImportTypeMasterList.service:ImportTypeMasterListApi
 *
 * @description 取込み種別マスタ一覧画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */
.factory('ImportTypeMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
		centerClass: AngularAPIClient.make(
			[
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList']
			]
		),
		// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End
		edi: AngularAPIClient.make(
			[
			 	['getList', 'GET', 'resources/ecorder/edi/ediList']
			]
		),
		importTypeMasterList: AngularAPIClient.make(
			[
				['init',                        'GET',  'resources/master/importTypeMasterList/init'],
				['search',                      'GET',  'resources/master/importTypeMasterList/search'],
				['checkDelete',                 'POST', 'resources/master/importTypeMasterList/checkDelete'],
				['deleteMaster',                'POST', 'resources/master/importTypeMasterList/delete']
			 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
 *
 * @description 取込み種別マスタ一覧画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ImportTypeMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ImportTypeMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.importTypeMasterListCols = [
								{field:"importTypeCd", displayName:"取込データ種別CD"},
								{field:"importTypeNm", displayName:"取込データ種別名称"},
							];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#initScreen
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'importTypeMasterList',
			columnDefs: 'importTypeMasterListCols',
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#initScreenHttp
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		$q.all(
				[
				// 各種ドロップダウンリスト用データ設定（同期処理）
				 $scope.getClientList(),
				 $scope.getEdiList(),
				 // [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
				 $scope.getUploadTableList()
				 // [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End
				]
		)
		.then(function(response) {
			// 初期データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#getClientList
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description 荷主項目の選択肢の取得<br>
	 *
	 * 共通変数 userInfoから取得する。
	 */
	$scope.getClientList = function () {
		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#getImportTypeList
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description EDI項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getEdiList = function () {
		var deferred = $q.defer();

		var request = {};
		$scope.ediList = [];
		api.edi.getList(request).then(function(response){
			$scope.ediList = response.data.ediList;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#getUploadTableList
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description アップロードテーブル名項目の選択肢の作成<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.getUploadTableList = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UPLOAD_TABLE_NM";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.uploadTableList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-CWMS-0026] Amazon,Yahoo対応 2015.05.29 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description 取込み種別マスタ一覧データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		var request = {};

		api.importTypeMasterList.init(request).then(function(response){
			$scope.searchDto = response.data.search;
			$scope.importTypeMasterList = response.data.list;

			// 検索条件 初期値を設定
			$scope.searchDto.mclient.clientCd = userInfo.clientCd;

			// 履歴データ取得があれば検索
			if (owsHistory.hasState()) {
				$scope.searchDto = owsHistory.popState();
				$scope.search();
			}

			// 検索条件にフォーカス
			owsCommon.setFirstFocus('searchform');

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#search
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){

		var request = {};
		request.data = {};
		request.data.search = $scope.searchDto;

		api.importTypeMasterList.search(request).then(function(response) {

			// 選択状態をクリアする
			owsCommon.toggleSelectAll($scope.gridOptions, false);

			// スクロール位置を先頭に移動
			$scope.gridOptions.gridViewport.scrollTop(0);

			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				// 取得したデータをグリッドに設定
				$scope.importTypeMasterList = response.data.list;
				// トータル件数を設定
				$scope.gridOptions.totalItems = response.data.list.length;
				// 検索条件を履歴に保存
				owsHistory.replaceState($scope.searchDto);
			} else {
				$scope.importTypeMasterList = [];
				$scope.gridOptions.totalItems = 0;
			}
		});
	};

	// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#copy
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function() {

		//修正画面へ遷移
		$location.path("wms/master/ImportTypeMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("importTypeId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].importTypeId);

	};
	// コピー機能追加 取込種別マスタ画面修正 2016.08.25 Thein Myo Oo Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#register
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 */
	$scope.register = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//新規画面へ遷移
		$location.path("wms/master/ImportTypeMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductList.object:ProductList#update
	 * @methodOf oneslogiWms.ProductList.object:ProductList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 */
	$scope.update = function() {

		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana Start
		//修正画面へ遷移
		$location.path("wms/master/ImportTypeMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("importTypeId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].importTypeId);
		// [ON推-品向-836] 前画面のパラメータが残ってしまう問題を修正 2015.07.03 kawana End
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#gridDblClick
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	$scope.gridDblClick = function(row) {
		owsCommon.syncButtonExec("update", row);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList#deleteRow
	 * @methodOf oneslogiWms.ImportTypeMasterList.object:ImportTypeMasterList
	 *
	 * @description 削除押下処理<br>
	 *
	 */
	$scope.deleteMaster = function() {
		owsCommon.syncExec(function() {
			var request = {};
			request.data = {};
			request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

			// 入力チェック
			api.importTypeMasterList.checkDelete(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 選択行の出荷指示キャンセル処理する
				api.importTypeMasterList.deleteMaster(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 完了後の処理
					$scope.search();
				});
			});
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
