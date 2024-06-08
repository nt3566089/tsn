/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClientScreenColMaster
 *
 * @description
 * センタ・荷主別画面グリッドマスタ画面
 */
angular.module('oneslogiWms.CenterClientScreenColMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClientScreenColMaster.service:centerClientScreenColMasterApi
 *
 * @description
 * センタ・荷主別画面グリッドマスタWebApi定義<br>
 * ・resources/class/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/common/centerOrClient/keyValueList センタ・荷主データ操作用WebApi
 * ・resources/common/screen/keyValueList 画面データ操作用WebApi
 * ・resources/common/grid/keyValueList グリッドデータ操作用WebApi
 * ・resources/master/centerClientScreenColMaster/init 初期化用WebApi<br>
 * ・resources/master/centerClientScreenColMaster/search 検索用WebApi<br>
 * ・resources/master/centerClientScreenColMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/centerClientScreenColMaster/register 登録用WebApi<br>
 *
 */
.factory('centerClientScreenColMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
	           // [ON推-品向-221] センタ・荷主区分データ経路を修正 2014.11.28 gaoy Start
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
			   // [ON推-品向-221] センタ・荷主区分データ経路を修正 2014.11.28 gaoy End
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
		gridList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/grid/keyValueList']
				 ]
		),
		centerClientScreenColList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/centerClientScreenColMaster/init'],
				 ['search', 'GET', 'resources/master/centerClientScreenColMaster/search'],
				 ['inputCheck', 'POST', 'resources/master/centerClientScreenColMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/centerClientScreenColMaster/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
 *
 * @description
 * センタ・荷主別画面グリッドマスタ画面コントローラ
 */
.controller('CenterClientScreenColMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'centerClientScreenColMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.centerClientScreenColListCols =
		[
		 {field:"colCd", displayName:"列CD"},
		 // [ON推-品向-562] 多言語対応 2015.05.20 ki Start
		 //{field:"bdict.dictNm", displayName:"列名"},
		 {field:"vdict.dictNm", displayName:"列名"},
		 // [ON推-品向-562] 多言語対応 2015.05.20 ki End
		 {field:"visibleName", displayName:"表示可否"},
		 {field:"editableName", displayName:"編集可否"},
		 {field:"necessaryName", displayName:"必須"},
		 {field:"screenColNm", displayName:"センタ・荷主別 列名"},
		 {field:"screenColVisible", displayName:"センタ・荷主別 表示可否"},
		 {field:"screenColEditable", displayName:"センタ・荷主別 編集可否"},
		 {field:"screenColNecessary", displayName:"センタ・荷主別 必須"}
		 ];

	//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto Del
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#initScreen
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
	 *
	 * @description
	 * 画面初期化処理<br>
	 * ・検索条件枠を開いた状態に設定<br>
	 * ・グリッド設定<br>
	 * ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {
		//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto Start
		var oldcenterClientCls;
		var oldscreenCd;
		//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto End

		//検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// センタ・荷主区分変更の監視設定（フォーカス時）
		$scope.centerClientClsFocus = function() {
			oldcenterClientCls = $scope.centerClientScreenColMasterSearch.centerClientCls;
		};

		// センタ・荷主区分変更の監視設定（ロストフォーカス時）
		$scope.centerClientChange = function() {
			// センタ・荷主リスト変更（同期処理）
			setCenterOrClientList();
		};
		//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto Del

		// 画面変更の監視設定（ロストフォーカス時）
		$scope.screenChange = function() {
		if (oldscreenCd != $scope.centerClientScreenColMasterSearch.screenListCd) {
			//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto Start
			// 画面CDが選択されていない場合はグリッドはnullに設定する
			if (!$scope.centerClientScreenColMasterSearch.screenListCd) {
				$scope.gridList = null;
				$scope.centerClientScreenColMasterSearch.itemListCd = null;
			} else {
				// 画面CDが選択されている場合グリッドリストを取得する
				// 選択した画面で取得済みのグリッドを設定
				setGridList();

			}
			//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto End
		}
		//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto Start
		oldscreenCd = $scope.centerClientScreenColMasterSearch.screenListCd;
		//[Ver3.0][#4513] 画面変更時にグリッドがクリアされないことによるアベンド 2018.05.18 matsumoto End
	};


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'centerClientScreenColList',
			columnDefs: 'centerClientScreenColListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"screenColVisible" : {
					key : "classCd",
					value : "classNm",
					listModel : "visibleList"
				},
				"screenColEditable" : {
					key : "classCd",
					value : "classNm",
					listModel : "editableList"
				},
				"screenColNecessary" : {
					key : "classCd",
					value : "classNm",
					listModel : "necessaryList"
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenColNm", 6, 2);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenColVisible", 6, 3);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenColEditable", 6, 4);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "screenColNecessary", 6, 5);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#initScreenHttp
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#deferredGetCenterClientCls
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#deferredGetScreenList
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#deferredGetVisible
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#deferredGetEditable
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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

		owsCommon.getDataCacheable(api.dropdownList,request).then(function(response){
			$scope.editableList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#deferredGetNecessary
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
	 *
	 * @description
	 * センタ・荷主別画面グリッドマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.centerClientScreenColList.init().then(function(response){
			$scope.centerClientScreenColMasterSearch = response.data.head;
			$scope.centerClientScreenColList = response.data.body;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.centerClientScreenColMasterSearch = owsHistory.popState();
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#search
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#getSearchData
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.centerClientScreenColMasterSearch;

		api.centerClientScreenColList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#setSearchData
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-365] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-365] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.centerClientScreenColList = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.centerClientScreenColMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#changeCenterClientCls
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#changeScreen
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
	 *
	 * @description
	 * 画面変更後処理<br>
	 *
	 * 画面が変更された場合、グリッドリストデータを再度取得し画面項目に反映する。
	 */
	$scope.changeScreen = function() {
		// グリッドリスト変更（同期処理）
		setGridList();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster#register
	 * @methodOf oneslogiWms.CenterClientScreenColMaster.object:CenterClientScreenColMaster
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
				if ($scope.centerClientScreenColList.length == 0) {
					alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
					return;
				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = $scope.centerClientScreenColList;
				request.data.head = $scope.centerClientScreenColMasterSearch;

				// 入力チェック
				api.centerClientScreenColList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// センタ・荷主別画面グリッドマスタデータ登録または更新
					api.centerClientScreenColList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.centerClientScreenColList = null;
						owsHistory.replaceState($scope.centerClientScreenColMasterSearch);
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
		request.centerClientCls = $scope.centerClientScreenColMasterSearch.centerClientCls;

		api.centerOrClientList.keyValueList(request).then(function(response){
			$scope.centerOrClientList = response.centerOrClientList;

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.centerOrClientList.length == 1) {
				$scope.centerClientScreenColMasterSearch.centerOrClientCd = $scope.centerOrClientList[0].centerOrClientCd;
			} else {
				$scope.centerClientScreenColMasterSearch.centerOrClientCd = null;
			}
			deferred.resolve();
		});

		return deferred.promise;
	};

	// グリッドリスト再設定処理
	var setGridList = function() {
		var deferred = $q.defer();

		var request = {};
		request.data = {};
		request.screenCd = $scope.centerClientScreenColMasterSearch.screenListCd;

		api.gridList.keyValueList(request).then(function(response){
			$scope.gridList = response.gridList;

			// 選択肢が一つの場合は一つ目を設定
			if ($scope.gridList.length == 1) {
				$scope.centerClientScreenColMasterSearch.itemListCd = $scope.gridList[0].itemListCd;
			} else {
				$scope.centerClientScreenColMasterSearch.itemListCd = null;
			}
			deferred.resolve();
		});

		return deferred.promise;
	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
