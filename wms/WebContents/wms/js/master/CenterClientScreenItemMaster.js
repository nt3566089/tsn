/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClientScreenItemMaster
 *
 * @description
 * センタ・荷主別画面項目マスタ画面
 */
angular.module('oneslogiWms.CenterClientScreenItemMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClientScreenItemMaster.service:centerClientScreenItemMasterApi
 *
 * @description
 * センタ・荷主別画面項目マスタWebApi定義<br>
 * ・resources/class/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/common/centerOrClient/keyValueList センタ・荷主データ操作用WebApi
 * ・resources/common/screen/keyValueList 画面データ操作用WebApi
 * ・resources/master/centerClientScreenItemMaster/init 初期化用WebApi<br>
 * ・resources/master/centerClientScreenItemMaster/search 検索用WebApi<br>
 * ・resources/master/centerClientScreenItemMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/centerClientScreenItemMaster/register 登録用WebApi<br>
 *
 */
.factory('centerClientScreenItemMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
		         // [ON推-品向-220] センタ・荷主区分データ経路を修正 2014.11.28 gaoy Start
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				// [ON推-品向-220] センタ・荷主区分データ経路を修正 2014.11.28 gaoy End
				 ]
		),
		centerOrClientList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerOrClient/keyValueList']
				 ]
		),
		screenList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/screen/keyValueList']
				 ]
		),
		centerClientScreenItemList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/centerClientScreenItemMaster/init'],
				 ['search', 'GET', 'resources/master/centerClientScreenItemMaster/search'],
				 ['inputCheck', 'POST', 'resources/master/centerClientScreenItemMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/centerClientScreenItemMaster/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
 *
 * @description
 * センタ・荷主別画面項目マスタ画面コントローラ
 */
.controller('CenterClientScreenItemMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'centerClientScreenItemMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.centerClientScreenItemListCols =
		[
		 {field:"itemCd", displayName:"項目CD"},
		 // [ON推-品向-562] 多言語対応 2015.05.20 ki Start
		 //{field:"bdict.dictNm", displayName:"項目名"},
		 {field:"vdict.dictNm", displayName:"項目名"},
		 // [ON推-品向-562] 多言語対応 2015.05.20 ki End
		 {field:"bclassDtlByVisible.vdict.dictNm", displayName:"表示可否"},
		 {field:"bclassDtlByEditable.vdict.dictNm", displayName:"編集可否"},
		 {field:"bclassDtlByNecessary.vdict.dictNm", displayName:"必須"},
		 {field:"screenItemNm", displayName:"センタ・荷主別 項目名"},
		 {field:"screenItemVisible", displayName:"センタ・荷主別 表示可否"},
		 {field:"screenItemEditable", displayName:"センタ・荷主別 編集可否"},
		 {field:"screenItemNecessary", displayName:"センタ・荷主別 必須"}
		 ];

	var oldcenterClientCls;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#initScreen
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタ・荷主区分変更の監視設定（フォーカス時）
		$scope.centerClientClsFocus = function() {
			oldcenterClientCls = $scope.centerClientScreenItemMasterSearch.centerClientCls;
		};

		// センタ・荷主区分変更の監視設定（ロストフォーカス時）
		$scope.centerClientClsChange = function() {
				// 選択したセンタ・荷主区分で取得済みのセンタ・荷主を設定
				setCenterOrClientList();
		};
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'centerClientScreenItemList',
			columnDefs: 'centerClientScreenItemListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"screenItemVisible" : {
					key : "classCd",
					value : "classNm",
					listModel : "visibleList"
				},
				"screenItemEditable" : {
					key : "classCd",
					value : "classNm",
					listModel : "editableList"
				},
				"screenItemNecessary" : {
					key : "classCd",
					value : "classNm",
					listModel : "necessaryList"
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenItemNm", 6, 2);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenItemVisible", 6, 3);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenItemEditable", 6, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenItemNecessary", 6, 5);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#initScreenHttp
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetCenterClientCls(),
				 $scope.deferredGetScreenList(),
				 $scope.deferredGetVisible(),
				 $scope.deferredGetEditable(),
				 $scope.deferredGetNecessary()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#deferredGetCenterClientCls
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * センタ・荷主区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCenterClientCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CENTER_CLIENT_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.centerClientClsList = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#deferredGetScreenList
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * 画面取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetScreenList = function () {
		var deferred = $q.defer();

		var request = {};
		request.data = {};

		api.screenList.keyValueList(request).then(function(response){
			$scope.screenList = response.screenList;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#deferredGetVisible
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * センタ・荷主別 表示可否取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetVisible = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "VISIBLE";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.visibleList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#deferredGetEditable
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * センタ・荷主別 編集可否取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEditable = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "EDITABLE";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.editableList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#deferredGetNecessary
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * センタ・荷主別 必須取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNecessary = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NECESSARY";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.necessaryList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * センタ・荷主別画面項目マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.centerClientScreenItemList.init().then(function(response){
			$scope.centerClientScreenItemMasterSearch = response.data.head;
			$scope.centerClientScreenItemList = response.data.body;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.centerClientScreenItemMasterSearch = owsHistory.popState();
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#search
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		$scope.getSearchData();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#getSearchData
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.centerClientScreenItemMasterSearch;

		api.centerClientScreenItemList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#setSearchData
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-363] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-363] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.centerClientScreenItemList = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.centerClientScreenItemMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#changeCenterClientCls
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
	 *
	 * @description
	 * センタ・荷主区分変更後処理<br>
	 *
	 * センタ・荷主区分が変更された場合、センタ・荷主リストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeCenterClientCls = function() {
		// センタ・荷主リスト変更（同期処理）
		setCenterOrClientList();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster#register
	 * @methodOf oneslogiWms.CenterClientScreenItemMaster.object:CenterClientScreenItemMaster
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

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// エラーがある場合、フォーカスを当てる
				if (isError) {
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}

				// 入力データ無し
				if ($scope.centerClientScreenItemList.length == 0) {
					alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = $scope.centerClientScreenItemList;
				request.data.head = $scope.centerClientScreenItemMasterSearch;

				// 入力チェック
				api.centerClientScreenItemList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// センタ・荷主別画面項目マスタデータ登録または更新
					api.centerClientScreenItemList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.centerClientScreenItemList = null;
						owsHistory.replaceState($scope.centerClientScreenItemMasterSearch);
					});
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start

			// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

	};

	// センタ・荷主リスト再設定処理
	var setCenterOrClientList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.centerClientCls = $scope.centerClientScreenItemMasterSearch.centerClientCls;

		api.centerOrClientList.keyValueList(request).then(function(response){
			$scope.centerOrClientList = response.centerOrClientList;

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.centerOrClientList.length == 1) {
				$scope.centerClientScreenItemMasterSearch.centerOrClientCd = $scope.centerOrClientList[0].centerOrClientCd;
			} else {
				$scope.centerClientScreenItemMasterSearch.centerOrClientCd = null;
			}

			deferred.resolve();
		});

		return deferred.promise;
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
