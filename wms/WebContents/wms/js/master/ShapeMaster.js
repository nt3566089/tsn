/**
 * @ngdoc overview
 * @name oneslogiWms.ShapeMaster
 *
 * @description
 * 荷姿マスタ画面
 */
angular.module('oneslogiWms.ShapeMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.shapeMaster.service:shapeMasterApi
 *
 * @description
 * 荷姿マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/shapeMaster/init 初期化用WebApi<br>
 * ・resources/master/shapeMaster/search 検索用WebApi<br>
 * ・resources/master/shapeMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/shapeMaster/register 登録用WebApi<br>
 *
 */
.factory('shapeMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		shapeList: AngularAPIClient.make(
				[
				 ['init',   	'GET', 'resources/master/shapeMasterList/init'],
				 ['search', 	'GET', 'resources/master/shapeMasterList/search'],
				 ['excel',      'GET', 'resources/master/shapeMasterList/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/master/shapeMasterList/inputCheck'],
				 ['register', 	'POST', 'resources/master/shapeMasterList/register']
				 ]
		)
	};
}])

.controller('ShapeMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'shapeMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.shapeListCols =
		[
		    {field:"ShapeCd", displayName:"荷姿CD"},
		    {field:"vdictByShapeDictId.dictNm", displayName:"荷姿名称"},
		    {field:"vdictByShapeUnitDictId.dictNm", displayName:"荷姿単位"},
		    {field:"gtin14Symbol", displayName:"GTIN14シンボル"},
		    {field:"delFlg", displayName:"削除フラグ"},
		    // [Ver3.0] unit of measure対応 2017.12.1 潘 Del
		];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.shapeMaster.object:shapeMaster#initScreen
	 * @methodOf oneslogiWms.shapeMaster.object:shapeMaster
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

		//荷主の設定
		// [Ver3.0] unit of measure対応 2017.12.1 潘 Del

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'list',
			columnDefs: 'shapeListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};

		// グリッドの荷姿にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"shapeCd":{
					"ng-change":{
						eventFunction:"shapeCdChange(row.rowIndex)"
					}
				},
				"vdictByShapeDictId.dictNm":{
					"ng-change":{
						eventFunction:"shapeNmChange(row.rowIndex)"
					}
				},

				"vdictByShapeUnitDictId.dictNm":{
					"ng-change":{
						eventFunction:"shapeUnitChange(row.rowIndex)"
					}
				},
				"gtin14Symbol":{
					"ng-change":{
						eventFunction:"gtin14SymbolChange(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				}
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "shapeCd",5, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "delFlg",4, 6);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "delFlg",4, 6);
		// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "gtin14Symbol",7, 7);
		// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#initScreenHttp
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#ShapeBlur
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
	 *
	 * @description
	 * 荷姿のロストフォーカス処理<br>
	 * 荷姿CDと荷姿名称と削除フラグロストフォーカス時の処理。
	 */
	$scope.shapeCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.shapeNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.shapeUnitChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		// [Ver3.0] unit of measure対応 2018.1.21 潘 Start
		var unitNm = $scope.list[rowIndex].vdictByShapeUnitDictId.dictNm;
		var flg = false;
		if (unitNm != null && unitNm != "" && unitNm.length > 1){
			for(var i=0;i<unitNm.length; i++) {
				if(unitNm.charCodeAt(i) > 128){
					flg = true;
				}
			}

			if(flg)  {
				var messageCd = "maxlengthError";
				gridOptionMessageControl.show($scope.gridOptions, "vdictByShapeUnitDictId.dictNm", $filter('owfMessage')(messageCd,"2"), rowIndex);
				directiveControl.editable($scope, 'register', false);
			    return;
			}
			else {
				gridOptionMessageControl.hide($scope.gridOptions, "vdictByShapeUnitDictId.dictNm", rowIndex)
				directiveControl.editable($scope, 'register', true);
			}
		}
		else
		{
			gridOptionMessageControl.hide($scope.gridOptions, "vdictByShapeUnitDictId.dictNm", rowIndex)
			directiveControl.editable($scope, 'register', true);
		}
		// [Ver3.0] unit of measure対応 2018.1.21 潘 End
	};
	$scope.gtin14SymbolChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#deferredGetInitData
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
	 *
	 * @description
	 * 荷姿マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.shapeList.init().then(function(response){
			$scope.head = response.data.head;
			$scope.list = response.data.list;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
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
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#search
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		$scope.getSearchData();
	};
	// [Ver3.0] unit of measure対応 2017.12.1 潘 Del

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#getSearchData
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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

		api.shapeList.search(request).then(function(response) {

			// [Ver3.0] unit of measure対応 2017.12.1 潘 Del

			statusInfo.isSuccessAndShowMessage(response,'searchinputform')
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#setSearchData
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// 検索ボタン押下後のスクロール位置を上に戻す処理
		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得したデータをグリッドに表示
		$scope.list = response.data.list;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.list.length; row++) {
			if ($scope.list[row].shapeId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'shapeCd', false, row);
				// [Ver3.0] unit of measure対応 2017.12.1 潘 Del
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#getClassForRow
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#excelOutput
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.shapeList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#addRow
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		var addRow = angular.copy($scope.blankRow);
		addRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

		// [Ver3.0] unit of measure対応 2017.12.1 潘 Del

		$scope.list.push(addRow);

		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.list.length-1);

		// [Ver3.0] unit of measure対応 2017.12.1 潘 Del

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#removeRow
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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
			if ($scope.list.indexOf(row) > -1) {
				if (row.shapeId != null) {
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
			if((  $scope.gridOptions.gridApi.selection.getSelectedRows()[row].shapeCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].shapeCd != null)
			     || $scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)
			     ||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].gtin14Symbol != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].gtin14Symbol != null)){
				    item++;
			}
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeDictId != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeDictId != null) {
				if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeDictId.dictNm != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeDictId.dictNm != null) {
					item++;
				}
			}
			if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeUnitDictId != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeUnitDictId != null) {
				if ($scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeUnitDictId.dictNm != "" && $scope.gridOptions.gridApi.selection.getSelectedRows()[row].vdictByShapeUnitDictId.dictNm != null) {
					item++;
				}
			}
		}

		if(item > 0){
			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
				return;
			}
		}else{
			// 複数行の場合に警告
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
					return;
				}
			}
		}

		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.list.indexOf(row) > -1) {
				$scope.list.splice($scope.list.indexOf(row), 1);
			}
		});

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

		owsCommon.toggleSelectAll($scope.gridOptions, false);
	};

	// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ShapeMaster.object:ShapeMaster#register
	 * @methodOf oneslogiWms.ShapeMaster.object:ShapeMaster
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

		// 空行判定
		if($scope.list.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return;
		}

		// 行ない選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}

		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		// 空行判定
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.list.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// 空行を退避
				emptyBody.push($scope.list[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.list[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.list[row]);
			}
		}
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				gridDirectiveControl.validity($scope.gridOptions, true);

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.list.splice($scope.list.indexOf(row), 1);
				});

				// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

				// 荷姿CD重複チェック
				var j = 0;
				// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa Start
				var k = 0;
				// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa End
				var rowIndex = new Array();
				//[ON推-1.1.4-CT-119]CT指摘の修正対応 2016.06.22 chou Add Start
				var rowIndex2 = new Array();
				var isErrShapeCd = false;
				var isErrGtin14Symbol = false;
				//[ON推-1.1.4-CT-119]CT指摘の修正対応 2016.06.22 chou Add End
				var errAry = new Array();
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.list.length; row++) {
					//[ON推-1.1.4-CT-119]CT指摘の修正対応 2016.06.22 chou Mod Start
//					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var shapeCd = $scope.list[row].shapeCd;
						var gtin14Symbol = $scope.list[row].gtin14Symbol;
						for (var i = row+1; i < $scope.list.length; i++) {
//							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.list[i].shapeCd == shapeCd){
									rowIndex[j] =i;
									j++;
									isErrShapeCd = true;
								}

								if ($scope.list[i].gtin14Symbol != null && $scope.list[i].gtin14Symbol != "" && $scope.list[i].gtin14Symbol == gtin14Symbol){
									rowIndex2[k] =i;
									k++;
									isErrGtin14Symbol = true;
								}
//							}
						}

						if (isErrShapeCd) {
							rowIndex[j++] =row;
							isErrShapeCd = false;
						}

						if (isErrGtin14Symbol) {
							rowIndex2[k++] =row;
							isErrGtin14Symbol = false;
						}

//					}
					//[ON推-1.1.4-CT-119]CT指摘の修正対応 2016.06.22 chou Mod End
				}
				if (j > 0){
					// エラーメッセージCD
					var messageCd = "dataDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "shapeCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}
				// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa Start
				if (k > 0){
					// エラーメッセージCD
					var messageCd = "dataDuplicateError";
					//[ON推-1.1.4-CT-119]CT指摘の修正対応 2016.06.22 chou Mod Start
					gridOptionMessageControl.show($scope.gridOptions, "gtin14Symbol", $filter('owfMessage')(messageCd), rowIndex2);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex2[0]);
					//[ON推-1.1.4-CT-119]CT指摘の修正対応 2016.06.22 chou Mod End
					directiveControl.firstErrorOnFocus('searchinputform');
					return;
				}
				// [ON推-品向-1113] GTIN14シンボル重複チェック処理を追加 2016.4.19 ichikawa End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.list = listBody;

				// 入力チェック
				api.shapeList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// 荷姿マスタデータ登録または更新
					api.shapeList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.initScreenHttp();

						owsCommon.toggleSelectAll($scope.gridOptions, false);
					});
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

	//画面初期化処理を実行
	$scope.initScreen();

}]);
