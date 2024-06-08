/**
 * @ngdoc overview
 * @name oneslogiWms.MatchingMaster
 *
 * @description マッチングマスタメンテナンス画面
 */
angular.module('oneslogiWms.MatchingMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.MatchingMaster.service:matchingMasterApi
 *
 * @description マッチングマスタメンテナンスWebApi定義
 *
 */
.factory('matchingMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		centerClass: AngularAPIClient.make(
			[
			 	['getList', 'GET', 'resources/common/centerClass/keyValueList']
			]
		),
		matchingMaster: AngularAPIClient.make(
			[
				['init',   'GET', 'resources/master/matchingMaster/init'],
				['search', 'GET', 'resources/master/matchingMaster/search'],
				['inputCheck', 'POST', 'resources/master/matchingMaster/inputCheck'],
				['register', 'POST', 'resources/master/matchingMaster/register']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.MatchingMaster.object:MatchingMaster
 *
 * @description マッチングマスタメンテナンス画面コントローラ
 */
.controller('MatchingMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'matchingMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.matchingListCols =
		[
			 {field:"matchingType", displayName:"マッチング種類"},
			 {field:"matchingKeyword", displayName:"マッチングキーワード"},
			 {field:"transformCd", displayName:"変換CD"},
			 {field:"delFlg", displayName:"削除フラグ"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#initScreen
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 画面初期化処理<br>
	 *              ・検索条件枠を開いた状態に設定<br>
	 *              ・グリッド設定<br>
	 *              ・画面初期化用通信制御処理を呼び出し
	 */
	$scope.initScreen = function() {

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

//		2016.02.19 Pan ページング ※3 Start
		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
			data: 'matchingList',
			columnDefs: 'matchingListCols',
			pagingOptions : $scope.pagingOptions
		});

//		// グリッドの設定
//		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
//			data: 'matchingList',
//			columnDefs: 'matchingListCols',
//		});

//		2016.02.19 Pan ページング ※3 End

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
			"delFlg" : {
				key : "classCd",
				value : "classNm",
				listModel : "delFlgList"
			}
		};

		// グリッドの倉庫名称列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
			"matchingType":{
				"ng-change":{
					eventFunction:"matchingTypeChange(row.rowIndex)"
				}
			},
			"matchingKeyword":{
				"ng-change":{
					eventFunction:"matchingKeywordChange(row.rowIndex)"
				}
			},
			"transformCd":{
				"ng-change":{
					eventFunction:"transformCdChange(row.rowIndex)"
				}
			},
			"delFlg":{
				"ng-change":{
					eventFunction:"delFlgChange(row.rowIndex)"
				}
			}
		};

		// エラーマッピング
		// 重複
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "matchingType", 3, 6);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "matchingKeyword",3, 6);

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	$scope.matchingTypeChange = function(rowIndex) {
		// 変更行を選択
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.matchingKeywordChange = function(rowIndex) {
		// 変更行を選択
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.transformCdChange = function(rowIndex) {
		// 変更行を選択
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		// 変更行を選択
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#initScreenHttp
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *              ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		// 各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg()
				 ])
				 // 全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EdiEdit.object:EdiEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.EdiEdit.object:EdiEdit
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PHYSICAL_DELETE";

		owsCommon.getDataCacheable(api.centerClass, "getList", request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#deferredGetInitData
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 倉庫マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.matchingMaster.init().then(function(response){
			$scope.searchDto = response.data.search;
			$scope.matchingList = response.data.list;

			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

//			2016.02.19 Pan ページング ※3 Start
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

//			2016.02.19 Pan ページング ※3 End

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchDto = owsHistory.popState();
				$scope.getSearchData();
			}

			// 最初の入力にフォーカス
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#search
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 検索ボタン押下処理<br>
	 *              ・検索処理呼び出し
	 */
	$scope.search = function(){
//		2016.02.19 Pan ページング ※3 Start
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
//		$scope.getSearchData();
//		2016.02.19 Pan ページング ※3 End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#getSearchData
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
//	    2016.02.19 Pan ページング ※3 Start
//	$scope.getPagedDataAsync = function() {
	$scope.getPagedDataAsync = function(pageSize, page) {
//		2016.02.19 Pan ページング ※3 End
		var request = {};
		request.data = {};
		request.data.search = $scope.searchDto;
//	    2016.02.19 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//	    2016.02.19 Pan ページング ※3 End
		api.matchingMaster.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response, 'inputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#setSearchData
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		// 選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// グリッドのスクロール位置をリセット
		$scope.gridOptions.gridViewport.scrollTop(0);

		// 取得したデータをグリッドに設定
		$scope.matchingList = response.data.list;
//	    2016.02.19 Pan ページング ※3 Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
//	    2016.02.19 Pan ページング ※3 End
		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchDto);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#getClassForRow
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 行別背景色取得処理<br>
	 *
	 * マッチングマスタステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#addRow
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		// 削除フラグの初期値設定
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		// 空行コピー
		$scope.matchingList.push(angular.copy($scope.blankRow));
		// 削除フラグ 入力不可
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.matchingList.length-1);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#removeRow
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 削除対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
			return;
		}

		// 選択行削除チェック
		var isError = false;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.matchingList.indexOf(row) > -1) {
				if (row.matchingId != null) {
					isError = true;
					return;
				}
			}
		});
		if (isError){
			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
			return;
		}

		// 入力済の場合に警告
		var isInput = false;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){

			if( ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].matchingType != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].matchingType != null ) ||
					($scope.gridOptions.gridApi.selection.getSelectedRows()[row].matchingKeyword != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].matchingKeyword != null ) ||
					($scope.gridOptions.gridApi.selection.getSelectedRows()[row].transformCd != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].transformCd != null ) ) {
				isInput = true;
				break;
			}
		}
		if(isInput){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.matchingList.indexOf(row) > -1) {
				$scope.matchingList.splice($scope.matchingList.indexOf(row), 1);
			}
		});

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MatchingMaster.object:MatchingMaster#register
	 * @methodOf oneslogiWms.MatchingMaster.object:MatchingMaster
	 *
	 * @description 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		// 明細行なし
		if($scope.matchingList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 選択行なし
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
		// 空行判定
		var listBody = [];
		var emptyBody = [];
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.matchingList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
				// 空行を退避
				emptyBody.push($scope.matchingList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.matchingList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.matchingList[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.inputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.matchingList.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('inputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.29 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.matchingList.splice($scope.matchingList.indexOf(row), 1);
				});

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.list = listBody;

				// 入力チェック
				api.matchingMaster.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}

					// 登録を実行
					api.matchingMaster.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
							return;
						}

						// 明細行を空
						$scope.matchingList = [];

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
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

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
