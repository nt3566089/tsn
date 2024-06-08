/**
 * @ngdoc overview
 * @name oneslogiWms.WebHTinfoMaster
 *
 * @description WEBHT管理マスタメンテナンス画面
 */
angular.module('oneslogiWms.WebHTinfoMaster', [])

/**
 * @ngdoc service
 * @name oneslogiWms.WebHTinfoMaster.service:webhtinfoMasterApi
 *
 * @description
 *  WEBHT管理マスタメンテナンスWebApi定義<br>
 *  ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 *  ・resources/master/webhtinfoMaster/init 初期化用WebApi<br>
 *  ・resources/master/webhtinfoMaster/search 検索用WebApi<br>
 *  ・resources/master/webhtinfoMaster/inputCheck 入力チェック用WebApi<br>
 *  ・resources/master/webhtinfoMaster/register 登録用WebApi<br>
 *
 */
.factory('webhtinfoMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		clientList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/clientCenter/clientListNotUseUserClient']
				 ]
		),
		webhtinfoList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/webhtinfoMaster/init'],
				 ['search', 'GET', 'resources/master/webhtinfoMaster/search'],
				 ['excel',  'GET', 'resources/master/webhtinfoMaster/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/webhtinfoMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/webhtinfoMaster/register']
				 ]
		)

	};
}])

/**
 * @ngdoc object
 * @name oneslogiWmsWebHTinfoMaster.object:WebHTinfoMaster
 *
 * @description
 * WEBHT管理マスタメンテナンス画面コントローラ
 */
.controller('WebHTinfoMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'webhtinfoMasterApi', function($scope, $route, $filter, $webhtinfo, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.webhtinfoListCols =
		[
		 {field:"macAddress", displayName:"MACアドレス"},
		 {field:"mclient.clientCd", displayName:"荷主"},
		 {field:"mcenter.centerCd", displayName:"センタ"},
		 {field:"printerNm", displayName:"プリンタ名称"},
		 {field:"delFlg", displayName:"削除フラグ"}
		 ];

	var oldCenterCd;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#initScreen
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
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

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		//グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'webhtinfoList',
			columnDefs: 'webhtinfoListCols',
			pagingOptions : $scope.pagingOptions
		});

		$scope.gridSelectOptions = {
				"mclient.clientCd" : {
					key : "clientCd",
					value : "clientNm",
					listModel : "clientList"
				},
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};
		$scope.gridEventOptions = {
				"macAddress":{
					"ng-change":{
						eventFunction:"macAddressBlur(row.rowIndex)"
					}
				},
				"mclient.clientCd":{
					"ng-change":{
						eventFunction:"clientCdBlur(row.rowIndex)"
					}
				},
				"mcenter.centerCd":{
					"ng-change":{
						eventFunction:"centerCdBlur(row.rowIndex)"
					}
				},
				"printerNm":{
					"ng-change":{
						eventFunction:"printerNmBlur(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "macAddress",5, 2);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#initScreenHttp
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		// 各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetClientList()
				]
		)
				 // 全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	$scope.macAddressBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	$scope.clientCdBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	$scope.centerCdBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	$scope.printerNmBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
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
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#deferredGetClientList
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description
	 *  荷主取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClientList = function () {
		var deferred = $q.defer();
		var request = {};
		request.centerId = userInfo.centerId;

		api.clientList.query(request).then(function(response){
			$scope.clientList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MoveLabelPrint.object:MoveLabelPrint#changeCenter
	 * @methodOf oneslogiWms.MoveLabelPrint.object:MoveLabelPrint
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		$scope.warehouseList = null;
		$scope.mWebHtInfoSearch.mwarehouse.warehouseCd = null;
		// 倉庫リスト変更
		$scope.setWarehouseList();

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#deferredGetInitData
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description
	 * WEBHT管理マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.webhtinfoList.init().then(function(response){
			$scope.mWebHtInfoSearch = response.data.head;
			$scope.webhtinfoList = response.data.body;
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete


			//センタリストの設定
			$scope.centerList = userInfo.centerList;

			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.mWebHtInfoSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.mWebHtInfoSearch = owsHistory.popState();
				$scope.centerChange();
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
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#search
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.mWebHtInfoSearch;
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.webhtinfoList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'searchinputform');
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#setPagingData
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		//検索ボタン押下後のスクロール位置を上に戻す処理
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.webhtinfoList = response.data.body;

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#getClassForRow
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * 削除フラグ='1'の場合明細行背景色レッドに設定する。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#excelOutput
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.mWebHtInfoSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.webhtinfoList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#addRow
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function() {
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.webhtinfoList.push(angular.copy($scope.blankRow));
		//gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.webhtinfoList.length-1);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#removeRow
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
	 *
	 * @description 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){
		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.webhtinfoList.indexOf(row) > -1) {
				if (row.webHtInfoId != null) {
					i += 1;
					return;
				}
			}
		});
		if (i > 0){
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
			return;
		}
		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].macAddress != ""
				  &&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].macAddress != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mclient.clientCd !=""
				  &&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mclient.clientCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcenter.centerCd != ""
				  &&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mcenter.centerCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].printerNm !=""
				  &&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].printerNm != null)
				||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
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
			if ($scope.webhtinfoList.indexOf(row) > -1) {
				$scope.webhtinfoList.splice($scope.webhtinfoList.indexOf(row), 1);
			}
		});
		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster#register
	 * @methodOf oneslogiWms.WebHTinfoMaster.object:WebHTinfoMaster
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

		if($scope.webhtinfoList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		for (var row = 0; row < $scope.webhtinfoList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				emptyBody.push($scope.webhtinfoList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				 gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.webhtinfoList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.webhtinfoList[row]);
			}
		}

		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// 空行への検証機能解除を解除
				gridDirectiveControl.validity($scope.gridOptions, true);

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// MACアドレス重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.webhtinfoList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var macAddress = $scope.webhtinfoList[row].macAddress;
						for (var i = row+1; i < $scope.webhtinfoList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.webhtinfoList[i].macAddress == macAddress){
									rowIndex[j] =i;
									j++;
								}
							}
						}
					}
				}
				if (j > 0){
					// エラーメッセージCD
					var messageCd = "macAddressDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "macAddress", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.webhtinfoList.splice($scope.webhtinfoList.indexOf(row), 1);
				});

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = listBody;

				// 入力チェック
				api.webhtinfoList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// WEBHT管理マスタデータ登録または更新
					api.webhtinfoList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();
					});
					owsCommon.toggleSelectAll($scope.gridOptions, false);
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
