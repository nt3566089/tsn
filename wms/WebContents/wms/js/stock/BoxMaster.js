/**
 * @ngdoc overview
 * @name oneslogiWms.BoxMaster
 *
 * @description
 * 梱包箱情報マスタ画面
 */
angular.module('oneslogiWms.BoxMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.BoxMaster.service:boxMasterApi
 *
 * @description
 * 荷材マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/stock/boxMaster/init 初期化用WebApi<br>
 * ・resources/stock/boxMaster/search 検索用WebApi<br>
 * ・resources/stock/boxMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/stock/boxMaster/register 登録用WebApi<br>
 *
 */
.factory('boxMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		boxList: AngularAPIClient.make(
				[
				 ['init',   	'GET', 'resources/stock/boxMasterList/init'],
				 ['search', 	'GET', 'resources/stock/boxMasterList/search'],
				 ['excel',      'GET', 'resources/stock/boxMasterList/search', 'excel'],
				 ['inputCheck', 'POST', 'resources/stock/boxMasterList/inputCheck'],
				 ['register', 	'POST', 'resources/stock/boxMasterList/register']
				 ]
		)
	};
}])

.controller('BoxMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'boxMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.boxListCols =
	[

	 {field:"boxCd", displayName:"箱タイプ"},
	 {field:"boxNm", displayName:"箱タイプ名"},
	 {field:"boxType", displayName:"箱種別"},
	 {field:"bxcpy", displayName:"容積(cm3)"},
	 {field:"bxweight", displayName:"空箱重量(g)"},
	 {field:"bxoszl", displayName:"箱外寸(L)(mm)"},
	 {field:"bxoszw", displayName:"箱外寸(W)(mm)"},
	 {field:"bxoszh", displayName:"箱外寸(H)(mm)"},
	 {field:"length", displayName:"箱内寸(L)(mm)"},
	 {field:"width", displayName:"箱内寸(W)(mm)"},
	 {field:"height", displayName:"箱内寸(H)(mm)"},
	 {field:"volumeRate", displayName:"梱包率(%)"},
	 {field:"delFlg", displayName:"削除"},
	 {field:"centerCd", displayName:"拠点CD"},
	 {field:"centerNm", displayName:"拠点名称"},
	 {field:"clientCd", displayName:"荷主CD"},
	 {field:"clientNm", displayName:"荷主名称"},
	 {field:"volume", displayName:"容積(mm3)"},
	 {field:"length", displayName:"箱内寸(L)(mm)"},
	 {field:"permitVolume", displayName:"許容容積(mm3)"}

	 ];


	/***
	 * 画面初期化処理
	 */
	$scope.initScreen = function(isReflesh) {

		// 画面コントロールの初期化
		$scope.initializeControls(isReflesh)
			.then(function(){
				// 画面初期値設定
				$scope.initializeValue();
			});

	}

	/***
	 * コントロール初期化処理
	 */
	$scope.initializeControls = function(isReflesh){
		var deferred = $q.defer();

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// グリッド初期化
		if (isReflesh !== "1"){
			$scope.initializeGrid();
		}

		// センタドロップリストの設定
		$scope.centerList = userInfo.centerList;

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetDelFlg(),
			$scope.deferredGetBoxType()
		])
		.then(function(){
			return $scope.deferredGetForm();
		})
		.then(function(){
			return deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * グリッド初期化処理
	 */
	$scope.initializeGrid = function(){
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'searchResultList',
			columnDefs: 'boxListCols',
		});

	};

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-296]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"boxType" : {
					key : "classCd",
					value : "classNm",
					listModel : "boxTypeList"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};

		// グリッドの荷材にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"boxCd":{
					"ng-change":{
						eventFunction:"boxCdChange(row.rowIndex)"
					}
				},
				"boxNm":{
					"ng-change":{
						eventFunction:"boxNmChange(row.rowIndex)"
					}
				},

				//対応 2024/03/13 ka.seo.ub ADD [S]

				"boxType":{
					"ng-change":{
						eventFunction:"boxTypeChange(row.rowIndex)"
					}
				},

				"bxcpy":{
					"ng-blur": {
	                    eventFunction: "bxcpyBlur(row.rowIndex)"
	                },
					"ng-change":{
						eventFunction:"bxcpyChange(row.rowIndex)"
					}
				},

				"bxweight":{
					"ng-change":{
						eventFunction:"bxweightChange(row.rowIndex)"
					}
				},

				"bxoszl":{
					"ng-change":{
						eventFunction:"bxoszlChange(row.rowIndex)"
					}
				},

				"bxoszw":{
					"ng-change":{
						eventFunction:"bxoszwChange(row.rowIndex)"
					}
				},

				"bxoszh":{
					"ng-change":{
						eventFunction:"bxoszhChange(row.rowIndex)"
					}
				},

				"length":{
					"ng-blur":{
						eventFunction:"lengthBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"lengthChange(row.rowIndex)"
					}
				},

				"width":{
					"ng-blur":{
						eventFunction:"widthBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"widthChange(row.rowIndex)"
					}
				},


				"height":{
					"ng-blur":{
						eventFunction:"heightBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"heightChange(row.rowIndex)"
					}
				},

				"volumeRate":{
					"ng-blur":{
						eventFunction:"volumeRateBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"volumeRateChange(row.rowIndex)"
					}
				},


				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				},
				//対応 2024/03/13 ka.seo.ub ADD [E]
		};


		/**
		 * @ngdoc method
		 * @name oneslogiWms.BoxMaster.object:BoxMaster#BoxBlur
		 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
		 *
		 * @description
		 * 荷材のロストフォーカス処理<br>
		 * 荷材CDと荷材名称と削除フラグロストフォーカス時の処理。
		 */
		$scope.boxCdChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.boxNmChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.boxTypeChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.bxcpyChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.bxweightChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.bxoszlChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.bxoszwChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.bxoszhChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.lengthChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.widthChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.heightChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.volumeRateChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.delFlgChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.lengthBlur = function(rowIndex) {
			$scope.volumeCalculation(rowIndex);
		};
		$scope.widthBlur = function(rowIndex) {
			$scope.volumeCalculation(rowIndex);
		};

		$scope.heightBlur = function(rowIndex) {
			$scope.volumeCalculation(rowIndex);
		};
		$scope.volumeCalculation = function (rowIndex){
			// 縦(mm)
			var length = $scope.searchResultList[rowIndex].length;

			// 横(mm)
			var width = $scope.searchResultList[rowIndex].width;

			// 高さ(mm)
			var height = $scope.searchResultList[rowIndex].height;

			// 入力チェック
			if ((!length) || (!width) || (!height)){
				$scope.searchResultList[rowIndex].bxcpy = 0;
			}else if(isNaN(length) || isNaN(width) || isNaN(height)){
				$scope.searchResultList[rowIndex].bxcpy = 0;
			}else{
				$scope.searchResultList[rowIndex].bxcpy = owsCommon.multiply(length, width, height);
			}

		}

	/***
	 * グリッド色付け処理
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/***
	 * 画面モデル取得処理
	 */
	$scope.deferredGetForm = function () {
		var deferred = $q.defer();

		api.boxList.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.searchCondition = response.data.searchCondition;
			$scope.searchResultList = response.data.resultList;

			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;


			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){
		// ログイン情報より初期値を設定
		$scope.searchCondition.centerCd =userInfo.centerCd;		//"3020";

		// ドロップダウンの初期値を設定
		$scope.searchCondition.delFlg = "0"; //owsCommon.getDefaultValue($scope.delFlgList);

		// 履歴データ取得・検索処理
		if (owsHistory.hasState()) {
			$scope.searchCondition = owsHistory.popState();
			$scope.search();
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

	/***
	 * 削除
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		api.dropdownList.query(request).then(function(response){
			//得られた結果をHTMLで画面に反映
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 箱種別
	 */

	$scope.deferredGetBoxType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "BOX_CATEGORY";

		api.dropdownList.query(request).then(function(response){
			//得られた結果をHTMLで画面に反映
			$scope.boxTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 検索
	 */
	$scope.search = function(){
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
	};

	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

		api.boxList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchResultForm');
			$scope.setSearchData(response);
		});
	};

	$scope.setSearchData = function(response) {
		// 選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// 検索ボタン押下後のスクロール位置を上に戻す処理を追加
		$scope.gridOptions.gridViewport.scrollTop(0);

		owsCommon.syncExec(function() {
			// 取得したデータをグリッドに表示(resultlist⇒searchResultList)
			$scope.searchResultList = response.data.resultList;


		});

		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;

		// 検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/***
	 * Excel出力
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "resultList", document.title);

		api.boxList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchResultForm')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#addRow
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */

	$scope.addRow = function(){

		// 初期化
		$scope.blankRow.delFlg = "0";
//TODO::対応 2024/03/14 ka.seo.ub UPD [S]
		$scope.blankRow.centerId = userInfo.centerId;
//対応 2024/03/14 ka.seo.ub UPD [E]
//		$scope.blankRow.centerCd = userInfo.centerCd;


		// 行追加
		$scope.searchResultList.push(angular.copy($scope.blankRow));

		// 行追加の後処理（編集不可に設定）
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.searchResultList.length - 1);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.BoxMaster.object:BoxMaster#removeRow
	 * @methodOf oneslogiWms.BoxMaster.object:BoxMaster
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
			if ($scope.searchResultList.indexOf(row) > -1) {
				if (row.boxId != null) {
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

		// 複数行の場合に警告
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
				return;
			}
		}else{
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxNm != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxNm != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxType != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].boxType != null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxweight !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxweight != null)
							||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxoszl !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxoszl != null)
								||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxoszw !=""
								&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxoszw != null)
									||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxoszh !=""
									&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].bxoszh != null)
										||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].length !=""
										&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].length != null)
											||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].width !=""
											&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].width != null)
												||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].height !=""
												&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].height != null)
													||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].volumeRate !=""
													&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].volumeRate != null)){
												//		||$scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg !=owsCommon.getDefaultValue($scope.searchResultList)){
				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
					return;
				}
			}
		}



		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.searchResultList.indexOf(row) > -1) {
				$scope.searchResultList.splice($scope.searchResultList.indexOf(row), 1);
			}
		});

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

	/***
	 * 登録
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		// 登録時初期化処理
		$scope.initRegister();

		// クライアント側入力チェック
		if ($scope.clientInputCheck() === false){
			return;
		};


		/////////////////////////////
		//選択行のみを表示(いつか関数にする)
		/////////////////////////////
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));

		// 明細全件をループ
		var spliceRowList = [];		// 除外リスト
		var selectRowList = [];		// 選択リスト
		for (var rowIndex = 0; rowIndex < $scope.searchResultList.length; rowIndex++) {
			// 選択チェックなしの場合
			// 妥当性チェックを無しにする

			if (gridDirectiveControl.isBlankRow($scope.gridOptions, rowIndex)) {
				/////////////////////////////
				// 空行の場合
				/////////////////////////////
				// 除外リストに追加
				spliceRowList.push($scope.searchResultList[rowIndex]);

			}else if ($scope.gridOptions.getSelection($scope.gridOptions.gridApi.grid.rows[rowIndex]) == false) {
				/////////////////////////////
				// 未選択行の場合
				/////////////////////////////
				// 未選択行は ★必須チェック★　検証対象外に設定
				gridDirectiveControl.validity($scope.gridOptions, false, rowIndex);

				// 除外リストに追加
				spliceRowList.push($scope.searchResultList[rowIndex]);
			}else {
				/////////////////////////////
				// その他
				/////////////////////////////
				selectRowList.push($scope.searchResultList[rowIndex]);
			}
		}

		$q.all([
			// グリッド検証を実行
			gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		])
		.then(function(){
//			owsCommon.syncExec(function() {
				// 選択行以外を削除
				angular.forEach(spliceRowList, function(row) {
					$scope.searchResultList.splice($scope.searchResultList.indexOf(row), 1);
				});


				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.resultList = $scope.searchResultList;

				// チェック処理
				api.boxList.inputCheck(request).then(function(response){
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
						return;
					}

					owsCommon.toggleSelectAll($scope.gridOptions, false);
					// 登録処理
					api.boxList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
							return;
						}

						// 初期化
						$scope.initScreen("1");
				});
		});

		})
		.catch(function(error){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);
			});

		})



	};

	$scope.initRegister = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
	};

	$scope.clientInputCheck = function() {
		// 必要に応じて、クライアント側チェック処理を記載
		if($scope.searchResultList.length == 0){
			alertMessage.setErrorMessageByCode("noDetailsError");
			return false;
		}

		// 行選択されていない
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return false;
		}

		return true;
	};

	 /***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
