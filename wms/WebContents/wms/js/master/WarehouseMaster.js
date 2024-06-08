/**
 * @ngdoc overview
 * @name oneslogiWms.WarehouseMaster
 *
 * @description
 * 倉庫マスタ画面
 */
angular.module('oneslogiWms.WarehouseMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.WarehouseMaster.service:warehouseMasterApi
 *
 * @description
 * 倉庫マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/warehouseMaster/init 初期化用WebApi<br>
 * ・resources/master/warehouseMaster/search 検索用WebApi<br>
 * ・resources/master/warehouseMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/warehouseMaster/register 登録用WebApi<br>
 *
 */
.factory('warehouseMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		warehouseList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/warehouseMaster/init'],
				 ['search', 'GET', 'resources/master/warehouseMaster/search'],
				 ['excel',  'GET', 'resources/master/warehouseMaster/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/warehouseMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/warehouseMaster/register']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster
 *
 * @description
 * 倉庫マスタ画面コントローラ
 */
.controller('WarehouseMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'warehouseMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.warehouseListCols =
		[
		 {field:"centerCd", displayName:"センタCD"},
		 {field:"warehouseCd", displayName:"倉庫CD"},
		 {field:"warehouseNm", displayName:"倉庫名称"},
		 {field:"warehouseAbbr", displayName:"倉庫略称"},
		 {field:"foreignFlg", displayName:"外貨フラグ"},
		 {field:"delFlg", displayName:"削除フラグ"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#initScreen
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'warehouseList',
			columnDefs: 'warehouseListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-291]明細の(削除と外貨)ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				"foreignFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "foreignFlgList",
					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					//[ON推-品向-428] 選択値の間違いを修正するため、removeBlank:"null"を削除 2014.12.10 許
					// [新WMS-110-004] 削除フラグの空の選択肢を削除 2015.07.14 kawana Start
					removeBlank: "null"
					// [新WMS-110-004] 削除フラグの空の選択肢を削除 2015.07.14 kawana End
				}
		};
		//[ON推-品向-291]明細の(削除と外貨)ドロップダウンリストにスペースは不要 2014.11.28 衛 End
		// グリッドの倉庫名称列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"warehouseNm":{
					"ng-blur":{
						eventFunction:"warehouseNmBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"warehouseNmChange(row.rowIndex)"
					}
				},
				"mcenter.centerCd":{
					"ng-change":{
						eventFunction:"centerCdChange(row.rowIndex)"
					}
				},
				"warehouseCd":{
					"ng-change":{
						eventFunction:"warehouseCdChange(row.rowIndex)"
					}
				},
				"warehouseAbbr":{
					"ng-change":{
						eventFunction:"warehouseAbbrChange(row.rowIndex)"
					}
				},
				"foreignFlg":{
					"ng-change":{
						eventFunction:"foreignFlgChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "warehouseCd", 6, 2);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#initScreenHttp
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 $scope.deferredGetForeignFlg()
				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#warehouseNmBlur
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 倉庫名称のロストフォーカス処理<br>
	 *
	 * 倉庫名称ロストフォーカス時、倉庫略称未入力の場合、倉庫名称をコピーする。
	 */
	$scope.warehouseNmBlur = function(rowIndex) {
		// 入力された倉庫名称を取得
		var warehouseNm = $scope.warehouseList[rowIndex].warehouseNm;
		// 倉庫略称を取得
		var warehouseAbbr = $scope.warehouseList[rowIndex].warehouseAbbr;

		if (warehouseNm && 0 < warehouseNm.length) {
			if (warehouseAbbr && 0 < warehouseAbbr.length) {
				return;
			}else{
				$scope.warehouseList[rowIndex].warehouseAbbr = warehouseNm;
			}
		}
	};
	$scope.warehouseNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.warehouseCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.centerCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.warehouseAbbrChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.foreignFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#deferredGetForeignFlg
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 外貨フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetForeignFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "FOREIGN_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.foreignFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#deferredGetInitData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 倉庫マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.warehouseList.init().then(function(response){
			$scope.warehouseMasterSearch = response.data.warehouseMasterSearch;
			$scope.warehouseList = response.data.warehouseList;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.warehouseMasterSearch.mcenter.centerCd = userInfo.centerCd;
			$scope.warehouseMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.warehouseMasterSearch = owsHistory.popState();
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
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#search
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#getSearchData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.warehouseMasterSearch = $scope.warehouseMasterSearch;

		api.warehouseList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#setSearchData
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-342] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-342] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.warehouseList = response.data.warehouseList;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.warehouseList.length; row++) {
			if ($scope.warehouseList[row].warehouseId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, row);
				gridDirectiveControl.editable($scope.gridOptions, 'warehouseCd', false, row);
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.warehouseMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#getClassForRow
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#excelOutput
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.warehouseMasterSearch = $scope.warehouseMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "warehouseList", document.title);

		api.warehouseList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#addRow
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function() {

		// [#1798] 行追加のセンタCDを検索結果に合わせて変更 2017.05.31 kawana Start
		if (0 < $scope.warehouseList.length) {
			$scope.blankRow.mcenter.centerCd = $scope.warehouseList[0].mcenter.centerCd;
		} else {
			$scope.blankRow.mcenter.centerCd = userInfo.centerCd;
		}
		// [#1798] 行追加のセンタCDを検索条件のセンタCDに変更 2017.05.31 kawana End

		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.warehouseList.push(angular.copy($scope.blankRow));

		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.warehouseList.length-1);
		// [#1798] 行追加のセンタCDを編集不可に変更 2017.05.31 kawana Start
		gridDirectiveControl.editable($scope.gridOptions, 'mcenter.centerCd', false, $scope.warehouseList.length-1);
		// [#1798] 行追加のセンタCDを編集不可に変更 2017.05.31 kawana End

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#removeRow
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.removeRow = function(){

		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.warehouseList.indexOf(row) > -1) {
				if (row.warehouseId != null) {
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

		// [横並-053] チェック順変更 2014.11.21 taoys Start
		// 入力済の場合に警告
		var item = 0;
		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
			// [#1798] 行追加のセンタCDを編集不可に変更 2017.05.31 kawana Start
			if ( ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseCd !=""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseAbbr != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseAbbr != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseNm != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].warehouseNm != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].foreignFlg != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].foreignFlg != null) ) {
				// [#1798] 行追加のセンタCDを編集不可に変更 2017.05.31 kawana End
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
	    // [横並-053] チェック順変更 2014.11.21 taoys End

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.warehouseList.indexOf(row) > -1) {
				$scope.warehouseList.splice($scope.warehouseList.indexOf(row), 1);
			}
		});

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.WarehouseMaster.object:WarehouseMaster#register
	 * @methodOf oneslogiWms.WarehouseMaster.object:WarehouseMaster
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

//		del  by  qiuy 2014/08/19 start
		// 空行判定
//		for (var row = 0; row < $scope.warehouseList.length; row++) {
//		if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, row);
//		// 空行を退避
//		emptyBody.push($scope.warehouseList[row]);
//		} else {
//		// 空行以外を退避
//		listBody.push($scope.warehouseList[row]);
//		}
//		}
//		del  by  qiuy 2014/08/19 end

		//add  by  qiuy 2015/08/19 start
		if($scope.warehouseList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.warehouseList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
				// 空行を退避
				emptyBody.push($scope.warehouseList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.warehouseList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.warehouseList[row]);
			}
		}
		//add  by  qiuy 2015/08/19 end

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.warehouseList.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 入力データ無し
				//if (listBody.length == 0) {
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}
	//			mod  by  qiuy 2014/08/21 start

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行のため削除 2017.09.21 honma Delete

				// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 倉庫CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
	//			mod  by  qiuy 2014/08/19 start
	//			for (var row = 0; row < $scope.warehouseList.length; row++) {
	//			var warehouseCd = $scope.warehouseList[row].warehouseCd;
	//			for (var i = row+1; i < $scope.warehouseList.length; i++) {
	//			if ($scope.warehouseList[i].warehouseCd == warehouseCd){
	//			rowIndex[j] =i;
	//			errAry[j] = "warehouseCodeDuplicateError";
	//			j++;
	//			}
	//			}
	//			}
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.warehouseList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var warehouseCd = $scope.warehouseList[row].warehouseCd;
						var centerId = userInfo.centerIdByCd($scope.warehouseList[row].mcenter.centerCd);

						for (var i = row+1; i < $scope.warehouseList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if (($scope.warehouseList[i].warehouseCd == warehouseCd) && (userInfo.centerIdByCd($scope.warehouseList[i].mcenter.centerCd) == centerId)){
									rowIndex[j] =i;
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//									errAry[j] = "warehouseCodeDuplicateError";
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
									j++;
								}
							}
						}
					}
				}
	//			mod  by  qiuy 2014/08/21 end
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "warehouseCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "warehouseCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						}
//					}
					// エラーメッセージCD
					var messageCd = "warehouseCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "warehouseCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
					return;
				}

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod Start
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.warehouseList.splice($scope.warehouseList.indexOf(row), 1);
				});
				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.warehouseList = listBody;

				// 入力チェック
				api.warehouseList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 倉庫マスタデータ登録または更新
					api.warehouseList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();

						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
					});
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

	};

	//画面初期化処理を実行
	$scope.initScreen();

}]);
