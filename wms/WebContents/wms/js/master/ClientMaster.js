/**
 * @ngdoc overview
 * @name oneslogiWms.ClientMaster
 *
 * @description 荷主マスタ画面
 */
angular.module('oneslogiWms.ClientMaster', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ClientMaster.service:clientMasterApi
 *
 * @description
 * 荷主マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/clientMaster/init 初期化用WebApi<br>
 * ・resources/master/clientMaster/search 検索用WebApi<br>
 * ・resources/master/clientMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/clientMaster/register 登録用WebApi<br>
 *
 */
.factory('clientMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		// [Ver3.0] unit of measure対応 2017.11.27 NING Start
		inventoryManagementUnitList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/shapeCD/keyValueList3']
				 ]
		),
		// [Ver3.0] unit of measure対応 2017.11.27 NING End
		clientList: AngularAPIClient.make(
				[
				 ['init',   'GET', 'resources/master/clientMaster/init'],
				 ['search', 'GET', 'resources/master/clientMaster/search'],
				 ['excel',  'GET', 'resources/master/clientMaster/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/clientMaster/inputCheck'],
				 ['register', 'POST', 'resources/master/clientMaster/register']
				]
		)
	};
}])

.controller('ClientMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'clientMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {
	//グリッドの列情報（デザイン用）
	$scope.clientListCols =
		[
		 {field:"clientCd", displayName:"荷主CD"},
		 {field:"clientNm", displayName:"荷主名称"},
		 {field:"clientAbbr", displayName:"荷主略称"},
		 // [Ver3.0] unit of measure対応 2017.11.22 NING Start
		 {field:"mshapeGrp.shapeGrpCd", displayName:"在庫管理単位"},
		 // [Ver3.0] unit of measure対応 2017.11.22 NING End
		 {field:"delFlg", displayName:"削除フラグ"}
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#initScreen
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'clientList',
			columnDefs: 'clientListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-289]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				},
				// [Ver3.0] unit of measure対応 2017.11.22 NING Start
				"mshapeGrp.shapeGrpCd" :{
					key : "shapeCd",
					value : "shapeNm",
					listModel : "setGridInventoryManagementUnitList(row.rowIndex)"
				}
				// [Ver3.0] unit of measure対応 2017.11.22 NING End
		};
		//[ON推-品向-289]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 End
		// グリッドの荷主名称列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"clientNm":{
					"ng-blur":{
						eventFunction:"clientNmBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"clientNmChange(row.rowIndex)"
					}
				},
				"clientCd":{
					"ng-change":{
						eventFunction:"clientCdChange(row.rowIndex)"
					}
				},
				"clientAbbr":{
					"ng-change":{
						eventFunction:"clientAbbrChange(row.rowIndex)"
					}
				},
				// [Ver3.0] unit of measure対応 2017.11.22 NING Start
				"mshapeGrp.shapeGrpCd":{
					"ng-change":{
						eventFunction:"shapeGrpCdChange(row.rowIndex)"
					}
				},
				// [Ver3.0] unit of measure対応 2017.11.22 NING End
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "clientCd",6, 2);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#initScreenHttp
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 * ・初期化データ取得処理の実行設定<br>
	 */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all([$scope.deferredGetDelFlg()])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#clientNmBlur
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * 荷主名称のロストフォーカス処理<br>
	 *
	 * 荷主名称ロストフォーカス時、荷主略称未入力の場合、荷主名称をコピーする。
	 */
	$scope.clientNmBlur = function(rowIndex) {
		var clientNm = $scope.clientList[rowIndex].clientNm;
		// 荷主略称を取得
		var clientAbbr = $scope.clientList[rowIndex].clientAbbr;

		if (clientNm && 0 < clientNm.length) {
			if (clientAbbr && 0 < clientAbbr.length) {
				return;
			}else{
				$scope.clientList[rowIndex].clientAbbr = clientNm;
			}
		}
	};
	$scope.clientNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.clientCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.clientAbbrChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [Ver3.0] unit of measure対応 2017.11.22 NING Start
	$scope.shapeGrpCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [Ver3.0] unit of measure対応 2017.11.22 NING End
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#deferredGetInitData
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * 荷主マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.clientList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.clientList = response.data.body;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.head = owsHistory.popState();
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
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#search
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#getSearchData
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		api.clientList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	// 在庫管理単位リスト格納配列
	var inventoryManagementUnitListMap = {};
	// [Ver3.0] unit of measure対応 2017.11.27 NING End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#setSearchData
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		// [#6790][OSS] 検索時の選択行数不正を修正(owsCommon.toggleSelectAll($scope.gridOptions, false)を移動) 2019.11.06 kawana Delete

		// [ON推-品向-344] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-344] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.clientList = response.data.body;
		// [#6790][OSS] 検索時の選択行数不正を修正 2019.11.06 kawana Start
		var qList = [];
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.clientList.length; row++) {
			if ($scope.clientList[row].clientId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'clientCd', false, row);
			}
			// [Ver3.0] unit of measure対応 2017.11.27 NING Start
			promise = setInventoryManagementUnitListMap($scope.clientList[row].clientCd);
			qList.push(promise);
			// [Ver3.0] unit of measure対応 2017.11.27 NING End
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);

		// 在庫管理単位が設定済の行がある場合、onChangeイベントが発生して選択状態がバグるため、
		// 在庫管理単位のドロップダウンリストが設定された後に選択状態をクリアする
		$q.all(qList).then(function(response){
			//選択状態をクリアする
			owsCommon.toggleSelectAll($scope.gridOptions, false);
		});

		// [#6790][OSS] 検索時の選択行数不正を修正 2019.11.06 kawana End
	};

	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	/**
	 * サーバから、在庫管理単位リストを取得し内部変数に保存する
	 */
	var setInventoryManagementUnitListMap = function(mClientCd){

		var deferred = $q.defer();

		inventoryManagementUnitListMap = {};

		var request = {};
		request.clientCd = mClientCd;
		api.inventoryManagementUnitList.query(request).then(function(response){
			$scope.inventoryManagementUnitList = response.data;
			inventoryManagementUnitListMap[mClientCd] = response.data;
			deferred.resolve();
		});
		return deferred.promise;
	};
	// [Ver3.0] unit of measure対応 2017.11.27 NING End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#getClassForRow
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * 行別背景色取得処理<br>
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
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#excelOutput
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.clientList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#addRow
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		$scope.clientList.push(angular.copy($scope.blankRow));
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.clientList.length-1);
		// 行番号振り直し
		updateRowNumber($scope.clientList);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#removeRow
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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
			if ($scope.clientList.indexOf(row) > -1) {
				if (row.clientId != null) {
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
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientNm != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientNm != null)||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientCd !=""&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientCd != null)||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientAbbr != ""&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].clientAbbr != null)||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
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
			if ($scope.clientList.indexOf(row) > -1) {
				$scope.clientList.splice($scope.clientList.indexOf(row), 1);
			}
		});

		// 行番号振り直し
		updateRowNumber($scope.clientList);

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ClientMaster.object:ClientMaster#register
	 * @methodOf oneslogiWms.ClientMaster.object:ClientMaster
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
//		for (var row = 0; row < $scope.clientList.length; row++) {
//		if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, row);
//		// 空行を退避
//		emptyBody.push($scope.clientList[row]);
//		} else {
//		// 空行以外を退避
//		listBody.push($scope.clientList[row]);
//		}
//		}
//		del  by  qiuy 2014/08/19 end

		//add  by  qiuy 2015/08/19 start
		if($scope.clientList.length == 0){
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
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
		for (var row = 0; row < $scope.clientList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
				// // 空行への検証機能を解除
				// gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
				// 空行を退避
				emptyBody.push($scope.clientList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				 // 未選択行への検証機能を解除
				 gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.clientList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.clientList[row]);
			}
		}

		//add  by  qiuy 2015/08/19 end
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
				// 空行への検証機能解除を解除
				//for (var row = 0; row < $scope.clientList.length; row++) {
				//	gridDirectiveControl.validity($scope.gridOptions, true, row);
				//}
				//
				//// エラーがある場合、フォーカスを当てる
				//if (isError) {
				//	directiveControl.firstErrorOnFocus('searchinputform');
				//	return;
				//}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行のため削除 2017.09.21 honma Delete

				// 荷主CD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
	//			mod  by  qiuy 2014/08/19 start
	//			for (var row = 0; row < $scope.clientList.length; row++) {
	//			var clientCd = $scope.clientList[row].clientCd;
	//			for (var i = row+1; i < $scope.clientList.length; i++) {
	//			if ($scope.clientList[i].clientCd == clientCd){
	//			rowIndex[j] =i;
	//			errAry[j] = "clientCodeDuplicateError";
	//			j++;
	//			}
	//			}
	//			}
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.clientList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var clientCd = $scope.clientList[row].clientCd;
						for (var i = row+1; i < $scope.clientList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.clientList[i].clientCd == clientCd){
									rowIndex[j] =i;
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
									//errAry[j] = "clientCodeDuplicateError";
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
									j++;}
							}
						}
					}
				}
	//			mod  by  qiuy 2014/08/19 end
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "clientCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "clientCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						}
//					}
					// エラーメッセージCD
					var messageCd = "clientCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "clientCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
					return;
				}

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod Start
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.clientList.splice($scope.clientList.indexOf(row), 1);
				});
				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod End

//				// 行番号振り直し
//				updateRowNumber($scope.clientList);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.body = listBody;

				// 入力チェック
				api.clientList.inputCheck(request).then(function(response){
					// [Ver3.0] unit of measure対応 2017.11.27 NING Start
					for (var i = 0; i < response.status.listStatus.length; i++) {
						if (response.status.listStatus[i].status.subStatusCode == 3){
							// 該当荷主の荷姿グループが登録済の場合、在庫管理単位は未選択
							gridOptionMessageControl.show($scope.gridOptions, "mshapeGrp.shapeGrpCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
							return;
						} else if (response.status.listStatus[i].status.subStatusCode == 4){
							// 荷姿グループが選択された場合、選択の荷姿グループが不存在
							gridOptionMessageControl.show($scope.gridOptions, "mshapeGrp.shapeGrpCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
							return;
						}
					}
					// [Ver3.0] unit of measure対応 2017.11.27 NING End
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}


					// 荷主マスタデータ登録または更新
					api.clientList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();
					});

					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
					owsCommon.toggleSelectAll($scope.gridOptions, false);
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.26 SJA End
	};

	// [Ver3.0] unit of measure対応 2017.11.27 NING Start
	// 在庫管理単位プルダウンデータ取得
	$scope.setGridInventoryManagementUnitList = function(rowIndex){

		// [#6766][OSS] 登録後にブラウザのコンソールエラー発生 2019.11.07 kawana Start
		var bodyList = $scope.gridOptions.gridApi.grid.rows;
		if (!bodyList || bodyList.length < (rowIndex + 1)) {
			return null;
		}
		var clientCd = bodyList[rowIndex].entity.clientCd;
		if (!clientCd) {
			return null;
		}

		if (inventoryManagementUnitListMap[clientCd]) {
			return inventoryManagementUnitListMap[clientCd];
		} else {
			return null;
		}

		// [#6766][OSS] 登録後にブラウザのコンソールエラー発生 2019.11.07 kawana End
	}
	// [Ver3.0] unit of measure対応 2017.11.27 NING End

	//画面初期化処理を実行
	$scope.initScreen();

}]);
