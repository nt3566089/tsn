/**
 * @ngdoc overview
 * @name oneslogiWms.CenterClassGrpDtlEdit
 *
 * @description
 * センタ区分値グループ明細マスタ画面
 */
angular.module('oneslogiWms.CenterClassGrpDtlEdit',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterClassGrpDtlEdit.service:centerClassGrpDtlEditApi
 *
 * @description
 * センタ区分値グループ明細マスタWebApi定義<br>
 * ・resources/class/keyValueList 区分値ドロップダウンリスト用データ取得WebApi<br>
 * ・resources/common/classDtl/keyValueList センタ区分値グループドロップダウンリスト用データ取得WebApi<br>
 * ・resources/master/classGrpDtlEdit/init 画面用初期データ取得用WebApi<br>
 * ・resources/master/classGrpDtlEdit/search 検索用WebApi<br>
 * ・resources/master/classGrpDtlEdit/registerCheck 入力チェック（登録）用WebApi<br>
 * ・resources/master/classGrpDtlEdit/register 入力データ登録用WebApi<br>
 *
 */
.factory('centerClassGrpDtlEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		keyValueList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/class/keyValueList']
				 ]
		),
		centerClassValueList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/centerClassKeyValueList']
				 ]
		),
		centerClassGrpValueList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClassGrp/keyValueList']
				 ]
		),
		centerClassGrpDtlEdit: AngularAPIClient.make(
			[
			    ['init',          'GET',  'resources/master/centerClassGrpDtlEdit/init'],
			    ['search',        'GET',  'resources/master/centerClassGrpDtlEdit/search'],
			    ['registerCheck', 'POST', 'resources/master/centerClassGrpDtlEdit/registerCheck'],
			    ['register',      'POST', 'resources/master/centerClassGrpDtlEdit/register']
			]
		)

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
 *
 * @description
 * センタ区分値グループ明細マスタ画面コントローラ
 */
.controller('CenterClassGrpDtlEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'centerClassGrpDtlEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	var centerClassId;
	var centerClassCd;
	//グリッドの列情報（デザイン用）
	$scope.centerClassGrpMasterEditCols =
		[
		 {field:"mcenterClassDtl.mcenterClass.classCd", displayName:"区分値CD"},
		 {field:"mcenterClassDtl.mcenterClass.classComment", displayName:"区分値解説"},
		 {field:"mcenterClassDtl.classDtlCd", displayName:"区分値明細CD"},
		 {field:"mcenterClassDtl.vdict.dictNm", displayName:"区分値明細名"},
		 {field:"selectFlg", displayName:"選択"},
		 {field:"defaultFlg", displayName:"デフォルト"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#initScreen
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
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

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'centerClassGrpDtlList',
			columnDefs: 'centerClassGrpMasterEditCols',
		});

		// グリッドのロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"selectFlg":{
					"ng-click":{
						eventFunction:"selectFlgChange(row.rowIndex)"
					}
				},
				"defaultFlg":{
					"ng-click":{
						eventFunction:"defaultFlgChange(row.rowIndex)"
					}
				}

		};

		// 前画面で区分値IDをセット
		centerClassId = $route.current.params.centerClassId;

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	$scope.selectFlgChange = function(rowIndex) {
		// [#6909][OSS] チェックボックスの状態を正しく取得しない問題を修正 2019.11.27 tanaka Start
		owsCommon.syncExec(function() {
			var selectFlg = $scope.centerClassGrpDtlList[rowIndex].selectFlg;
			if (selectFlg === "1"){
				gridDirectiveControl.editable($scope.gridOptions, 'defaultFlg', true, rowIndex);
			} else {
				gridDirectiveControl.editable($scope.gridOptions, 'defaultFlg', false , rowIndex);
				$scope.centerClassGrpDtlList[rowIndex].defaultFlg = "0";
			}
		});
		// [#6909][OSS] チェックボックスの状態を正しく取得しない問題を修正 2019.11.27 tanaka End
	};

	$scope.defaultFlgChange = function(rowIndex) {
		for (var i = 0; i < $scope.centerClassGrpDtlList.length;i++) {
			if (i != rowIndex) {
				$scope.centerClassGrpDtlList[i].defaultFlg = "0";
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#initScreenHttp
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
//				 $scope.deferredGetClassCdList()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#deferredGetClassCdList
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * 区分値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClassCdList = function () {
		var deferred = $q.defer();
		var request = {};
		request.centerId = $scope.centerClassGrpDtlEditSearch.mcenterClassGrp.mcenterClass.centerId;
		request.classCd  = $scope.centerClassGrpDtlEditSearch.mcenterClassGrp.mcenterClass.classCd;
		// [#6892][OSS] キャッシュしないように修正 2019.11.26 kawana Start
		api.centerClassValueList.query(request).then(function(response){
			// [#6892][OSS] キャッシュしないように修正 2019.11.26 kawana End
			$scope.centerClassCdList = response.data;
			if ($scope.centerClassCdList.length == 1){
				$scope.centerClassGrpDtlEditSearch.mcenterClassGrp.mcenterClass.classCd = $scope.centerClassCdList[0].centerClassCd;
			}
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * センタ区分値グループ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClassGrpCdList = function () {
		var deferred = $q.defer();
		var request = {};
		request.centerId = $scope.centerClassGrpDtlEditSearch.mcenterClassGrp.mcenterClass.centerId;
		request.classCd  = $scope.centerClassGrpDtlEditSearch.mcenterClassGrp.mcenterClass.classCd;
		// [#6892][OSS] キャッシュしないように修正 2019.11.26 kawana Start
		api.centerClassGrpValueList.query(request).then(function(response){
			// [#6892][OSS] キャッシュしないように修正 2019.11.26 kawana End
			$scope.centerClassGrpCdList = response.data;
			if ($scope.centerClassGrpCdList.length == 1) {
				$scope.centerClassGrpDtlEditSearch.mcenterClassGrp.classGrpCd = $scope.centerClassGrpCdList[0].classGrpCd;
			} else {
				$scope.centerClassGrpDtlEditSearch.mcenterClassGrp.classGrpCd = null;
			}
			deferred.resolve();
		});
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * センタ区分値グループ明細マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();
		var request = {};
		request.centerClassId = centerClassId;

		api.centerClassGrpDtlEdit.init(request).then(function(response){
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.deferredSetInitData(response);
			$scope.deferredGetClassCdList();
			$scope.deferredGetClassGrpCdList();

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#deferredSetInitData
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.deferredSetInitData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// 取得したデータをヘッダに表示
		$scope.centerClassGrpDtlEditSearch = response.data.head;
		centerClassCd = $scope.centerClassGrpDtlEditSearch.mcenterClassGrp.mcenterClass.classCd;
		//取得したデータをグリッドに表示
		$scope.centerClassGrpDtlList = response.data.body;
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.centerClassGrpDtlEditSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#search
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
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
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#getSearchData
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.centerClassGrpDtlEditSearch;

		api.centerClassGrpDtlEdit.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#setSearchData
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.centerClassGrpDtlList = response.data.body;

		for (var i = 0; i < $scope.centerClassGrpDtlList.length;i++) {

			var selectFlg = $scope.centerClassGrpDtlList[i].selectFlg;
			if (selectFlg == 1){
				gridDirectiveControl.editable($scope.gridOptions, 'defaultFlg', true , i);
			} else {
				gridDirectiveControl.editable($scope.gridOptions, 'defaultFlg', false, i);
			}
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.centerClassGrpDtlEditSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit#register
	 * @methodOf oneslogiWms.CenterClassGrpDtlEdit.object:CenterClassGrpDtlEdit
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

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

		if($scope.centerClassGrpDtlList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		}

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

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.centerClassGrpDtlEditSearch;
				request.data.body = $scope.centerClassGrpDtlList;

				// 入力チェック
				api.centerClassGrpDtlEdit.registerCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// センタ区分値グループ明細マスタデータ登録または更新
					api.centerClassGrpDtlEdit.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 明細を空に設定
						$scope.centerClassGrpDtlList = [];
					});
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
