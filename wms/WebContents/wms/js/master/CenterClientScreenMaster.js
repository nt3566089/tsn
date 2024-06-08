/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClientScreenMaster
 *
 * @description
 * センタ・荷主別画面マスタ画面
 */
angular.module('oneslogiWms.CenterClientScreenMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClientScreenMaster.service:centerClientScreenMasterApi
 *
 * @description
 * センタ・荷主別画面マスタWebApi定義<br>
 * ・resources/class/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/common/centerOrClient/keyValueList センタ・荷主データ操作用WebApi<br>
 * ・resources/master/centerClientScreenMaster/init 初期化用WebApi<br>
 * ・resources/master/centerClientScreenMaster/search 検索用WebApi<br>
 * ・resources/master/centerClientScreenMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/centerClientScreenMaster/register 登録用WebApi<br>
 *
 */
.factory('centerClientScreenMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
		         // [ON推-品向-219] センタ・荷主区分データ経路を修正 2014.11.28 gaoy Start
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
		         // [ON推-品向-219] センタ・荷主区分データ経路を修正 2014.11.28 gaoy End
				 ]
		),
		centerOrClientList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/centerOrClient/keyValueList']
				 ]
		),
		centerClientScreenList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/centerClientScreenMaster/init'],
				 ['search', 'GET', 'resources/master/centerClientScreenMaster/search'],
				 ['inputCheck', 'POST', 'resources/master/centerClientScreenMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/centerClientScreenMaster/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
 *
 * @description
 * センタ・荷主別画面マスタ画面コントローラ
 */
.controller('CenterClientScreenMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'centerClientScreenMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.centerClientScreenListCols =
		[
		 {field:"screenCd", displayName:"画面CD"},
		 // [ON推-品向-562] 多言語対応 2015.05.20 ki Start
		 //{field:"bdict.dictNm", displayName:"画面名"},
		 {field:"vdict.dictNm", displayName:"画面名"},
		 // [ON推-品向-562] 多言語対応 2015.05.20 ki End
		 {field:"centerOrClientScreenNm", displayName:"センタ・荷主別 画面名"},
		 {field:"centerOrClientScreenVisible", displayName:"センタ・荷主別 表示可否"}
		 ];

	var oldcenterClientCls;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#initScreen
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
			oldcenterClientCls = $scope.centerClientScreenMasterSearch.centerClientCls;
		};

		// センタ・荷主区分変更の監視設定（ロストフォーカス時）
		$scope.centerClientClsChange = function() {
				// 選択したセンタ・荷主区分で取得済みのセンタ・荷主を設定
				setCenterOrClientList();
		};
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'centerClientScreenList',
			columnDefs: 'centerClientScreenListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"centerOrClientScreenVisible" : {
					key : "classCd",
					value : "classNm",
					listModel : "visibleList"
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "centerOrClientScreenNm", 6, 2);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#initScreenHttp
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
				 $scope.deferredGetVisible()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#deferredGetCenterClientCls
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#deferredGetVisible
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
	 *
	 * @description
	 * センタ・荷主別画面マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.centerClientScreenList.init().then(function(response){
			$scope.centerClientScreenMasterSearch = response.data.head;
			$scope.centerClientScreenList = response.data.body;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.centerClientScreenMasterSearch = owsHistory.popState();
				$scope.search();
			}

			//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#search
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#getSearchData
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.centerClientScreenMasterSearch;

		api.centerClientScreenList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#setSearchData
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-360] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-360] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.centerClientScreenList = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.centerClientScreenMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#changeCenterClientCls
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
	 * @name oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster#register
	 * @methodOf oneslogiWms.CenterClientScreenMaster.object:CenterClientScreenMaster
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
				if ($scope.centerClientScreenList.length == 0) {
					alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = $scope.centerClientScreenList;
				request.data.head = $scope.centerClientScreenMasterSearch;

				// 入力チェック
				api.centerClientScreenList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// センタ・荷主別画面マスタデータ登録または更新
					api.centerClientScreenList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.centerClientScreenList = null;
						owsHistory.replaceState($scope.centerClientScreenMasterSearch);

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
		request.centerClientCls = $scope.centerClientScreenMasterSearch.centerClientCls;

		api.centerOrClientList.keyValueList(request).then(function(response){
			$scope.centerOrClientList = response.centerOrClientList;

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.centerOrClientList.length == 1) {
				$scope.centerClientScreenMasterSearch.centerOrClientCd = $scope.centerOrClientList[0].centerOrClientCd;
			} else {
				$scope.centerClientScreenMasterSearch.centerOrClientCd = null;
			}

			deferred.resolve();
		});

		return deferred.promise;
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
