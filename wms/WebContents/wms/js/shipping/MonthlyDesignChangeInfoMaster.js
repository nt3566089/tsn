/**
 * @ngdoc overview
 * @name oneslogiWms.MonthlyDesignChangeInfoMaster
 *
 * @description
 * 月替り・デザイン変更情報マスタ画面
 */
angular.module('oneslogiWms.MonthlyDesignChangeInfoMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.service:monthlyDesignApi
 *
 * @description
 * 月替り・デザイン変更情報マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/shipping/monthlyDesignChangeInfoMaster/init 初期化用WebApi<br>
 * ・resources/shipping/monthlyDesignChangeInfoMaster/search 検索用WebApi<br>
 * ・resources/shipping/monthlyDesignChangeInfoMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/shipping/monthlyDesignChangeInfoMaster/register 登録用WebApi<br>
 *
 */
.factory('monthlyDesignApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList'],
				 ['queryCenter','GET','resources/common/centerClass/centerKeyValueList']

				 ]
		),
		productRecord: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/product/record']
				 ]
		),
		location: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/location/record']
				 ]
		),
		monthlyDesignList: AngularAPIClient.make(
				[
				 ['init',   	'GET', 'resources/shipping/monthlyDesignChangeInfoMaster/init'],
				 ['search', 	'GET', 'resources/shipping/monthlyDesignChangeInfoMaster/search'],
				 ['excel',      'GET', 'resources/shipping/monthlyDesignChangeInfoMaster/search', 'excel'],
				 ['rowCopy',    'GET', 'resources/shipping/monthlyDesignChangeInfoMaster/rowCopy'],
				 ['inputCheck', 'POST', 'resources/shipping/monthlyDesignChangeInfoMaster/inputCheck'],
				 ['register', 	'POST', 'resources/shipping/monthlyDesignChangeInfoMaster/register']
				 ]
		)
	};
}])

.controller('MonthlyDesignChangeInfoMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'monthlyDesignApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.monthlyDesignListCols =
	[

	 {field:"productCd", displayName:"銘柄CD"},
	 {field:"productNm", displayName:"銘柄名称"},
	 {field:"sotedunit", displayName:"補充先"},
	 {field:"limitdate", displayName:"製造年月日"},
	 {field:"designflg", displayName:"デザイン区分"},
	 {field:"sotedloc", displayName:"仕分ロケ"},
	 {field:"picklistkey", displayName:"山出しリストキー"},
	 {field:"picklistgno", displayName:"山出しリスト明細行No."},
	 {field:"updDt", displayName:"更新日時"},
	 {field:"updUser", displayName:"更新者"},
	 {field:"delFlg", displayName:"削除"},

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

		//荷主ドロップリストの設定
		$scope.clientList = userInfo.clientList;

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetdesignflg(),
			$scope.deferredGetDelFlg(),
			$scope.deferredGetSotedunit()
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

//		//ページングの設定(ページング有り)
//		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
//
//		$scope.pagingOptions.setPageData = function() {
////			$scope.getPagingData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
//			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);

//		};


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'searchResultList',
			columnDefs: 'monthlyDesignListCols',
		});

		// グリッドの商品コード、ロケーション列にボタンを設定
		$scope.gridButtonOptions = {
				"productCd":{
					clickFunction:"showItem(row.rowIndex)"
				},
				"sotedloc":{
					clickFunction:"showSotedloc(row.rowIndex)"
				}
		};
	//	$scope.pagingOptionsForOutput = owsCommon.getDefaultPagingOptions();

//		$scope.pagingOptionsForOutput.setPageData = function() {
//			$scope.getPagedDataAsync($scope.gridForOutput.paginationPageSize, $scope.gridForOutput.paginationCurrentPage);
//		};

//		$scope.gridForOutput = owsCommon.mergePagingSingleSelectGridOptions({
//			data: 'excelOutputData',
//			columnDefs: 'monthlyDesignListCols',
//			pagingOptions : $scope.pagingOptionsForOutput
//		});
	};

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-296]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				"sotedunit" : {
					key : "classCd",
					value : "classNm",
					listModel : "sotedunitList"
				},
				"designflg" : {
					key : "classCd",
					value : "classNm",
					listModel : "designflgList",
					removeBlank:"null"
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};

		// グリッドにロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"productCd":{
					"ng-change":{
						eventFunction:"productCdChange(row.rowIndex)"
					}
				},
				"sotedunit":{
					"ng-change":{
						eventFunction:"sotedunitChange(row.rowIndex)"
					}
				},


				"limitdate":{
					"ng-change":{
						eventFunction:"limitdateChange(row.rowIndex)"
					}
				},

				"designflg":{
					"ng-change":{
						eventFunction:"designflgChange(row.rowIndex)"
					}
				},

				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgChange(row.rowIndex)"
					}
				},
		};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#BoxBlur
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 荷材のロストフォーカス処理<br>
	 * 荷材CDと荷材名称と削除フラグロストフォーカス時の処理。
	 */
		$scope.productCdChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.sotedunitChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.limitdateChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.designflgChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};
		$scope.delFlgChange = function(rowIndex) {
			$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		};

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

		api.monthlyDesignList.init().then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				deferred.reject();
				return;
			}

			//結果設定
			$scope.searchCondition = response.data.searchCondition;
			$scope.searchResultList = response.data.resultList;
//			$scope.paging = response.paging;

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
		$scope.searchCondition.centerCd =userInfo.centerCd;
		$scope.searchCondition.clientCd =userInfo.clientCd;
//		$scope.searchResultList.systemDt = userInfo.systemDt;

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
	 * 補充先
	 */

	$scope.deferredGetSotedunit = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SORTTYPE";

		api.dropdownList.query(request).then(function(response){
			//得られた結果をHTMLで画面に反映
			$scope.sotedunitList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * デザイン区分
	 */
	$scope.deferredGetdesignflg = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.clientId;
		request.classCd = "DESIGNFLG";

		api.dropdownList.queryCenter(request).then(function(response){
			$scope.designflgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 検索
	 */
	$scope.search = function(){
		// 銘柄CDと補充先がどちらも未入力
		if ($scope.searchCondition.productCd == null && $scope.searchCondition.sotedunit == null) {
			alertMessage.setErrorMessageByCode("productCdOrReplenishmentDestinationNoNotInputError");
			return;
		}
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);

	};

	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.searchCondition = $scope.searchCondition;

//		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

		api.monthlyDesignList.search(request).then(function(response) {
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

//			for (var rowIndex = 0; rowIndex < $scope.searchResultList.length; rowIndex++) {
//				gridDirectiveControl.editable($scope.gridOptions, 'boxCd', false, rowIndex);
//			}

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

		api.monthlyDesignList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchResultForm')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#modalProduct
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 銘柄コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された銘柄情報を画面項目に反映する。
	 */
	$scope.modalProduct = function(){

//		var isError = $scope.searchform.$invalid;
//		// エラーがある場合、フォーカスを当てる
//		if (isError) {
//			directiveControl.firstErrorOnFocus('searchform');
//			return;
//		}
		var items = {
				clientCd: $scope.searchCondition.clientCd,
				productCd: $scope.searchCondition.productCd

		};

		// 銘柄マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
//			$scope.searchCondition.productCd = selectedItem.productCd;
			$scope.searchCondition.productCd = selectedItem.productCd;
			$scope.searchCondition.productNm = selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMastert#productCdBlur
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 銘柄コードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、仕入先情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function() {
//		if(!$scope.searchCondition.productCd){
//			$scope.searchCondition.productNm = null;
//			return;
//		}
		if(!$scope.searchCondition.productCd){
			$scope.searchCondition.productNm = null;
			return;
		}
		// 入力された仕入先コードを取得
//		var productCd = $scope.searchCondition.productCd;
		var productCd = $scope.searchCondition.productCd;

		if(productCd && 0 < productCd.length) {
			var request = {};

			request.clientId = userInfo.clientIdByCd($scope.searchCondition.clientCd);
			request.productCd = $scope.searchCondition.productCd;

//			$scope.searchCondition.productNm = null;

			// 仕入先情報の取得
			api.productRecord.query(request).then(function(response){
				$scope.searchCondition.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.searchCondition.productNm = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#showItem
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 銘柄コード検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showItem = function(rowIndex){

		var items = {
				clientCd: $scope.searchCondition.clientCd,
				productCd: $scope.searchResultList[rowIndex].productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchResultList[rowIndex].productCd =  selectedItem.productCd;
			$scope.searchResultList[rowIndex].productNm = selectedItem.productNm;

			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#showSotedloc
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 仕分けロケ検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.showSotedloc = function(rowIndex){

		var items = {
				centerCd: $scope.searchResultList[rowIndex].centerCd,
				locationCd: $scope.searchResultList[rowIndex].sotedloc
//				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 Start
//				warehouseCd: $scope.receivePlanB[rowIndex].planWarehouseCd
//				// [C-CWMS-0028] ロケーション検索(アシスト画面) - 検索条件に倉庫、ゾーンを追加 End
		};

		// ロケーションマスタのモーダル画面を表示
		var modalInstance = modalFactory.modalLocation(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.searchResultList[rowIndex].sotedloc = selectedItem.locationCd;

			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#addRow
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
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
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#removeRow
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 行削除ボタン押下処理<br>
	 *
	 * 選択行をグリッドから削除する。
	 */
	$scope.deleteRow = function(){

		// 選択行削除チェック
		var i = 0;
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.searchResultList.indexOf(row) > -1) {
				if (row.mfmonthchgId != null) {
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
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].productCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].productCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].sotedunit != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].sotedunit != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].limitdate != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].limitdate != null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].designflg !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].designflg != null)
							||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].sotedloc !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].sotedloc != null)){
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster#copyRow
	 * @methodOf oneslogiWms.MonthlyDesignChangeInfoMaster.object:MonthlyDesignChangeInfoMaster
	 *
	 * @description
	 * 行複製ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に選択した行を複製する。
	 */

	$scope.copyRow = function(){

		// 複製対象無し
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("copyRowErrNotSelect");
			return;
		}
		// 複数行選択の場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
			alertMessage.setErrorMessageByCode("multipleCopyRowError");
				return;
			}



		// 行複製ボタン押下
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.searchResultList.indexOf(row) > -1) {
				//$scope.searchResultList.splice($scope.searchResultList.indexOf(row), 1);
				$scope.searchResultList.push(angular.copy($scope.searchResultList[$scope.searchResultList.indexOf(row)]));

				//IDは空にする
				 $scope.searchResultList[$scope.searchResultList.length -1].mfmonthchgId = null;


				// 行複製の後処理（編集不可に設定）
//				gridDirectiveControl.editable($scope.gridOptions, 'productNm', false, $scope.searchResultList.length - 1);
//				gridDirectiveControl.editable($scope.gridOptions, 'picklistkey', false, $scope.searchResultList.length - 1);
//				gridDirectiveControl.editable($scope.gridOptions, 'picklistgno', false, $scope.searchResultList.length - 1);
//				gridDirectiveControl.editable($scope.gridOptions, 'updDt', false, $scope.searchResultList.length - 1);
//				gridDirectiveControl.editable($scope.gridOptions, 'updUser', false, $scope.searchResultList.length - 1);
				gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.searchResultList.length - 1);

				// 行複製の後処理（行選択をクリア）
				owsCommon.toggleSelectAll($scope.gridOptions, false);
			}
		});


	};


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

				for (var i = 0 ;i < $scope.searchResultList.length;i++){
					// 製造年月日未来日付
					if ($scope.searchResultList[i].limitdate >  userInfo.systemDt) {
						alertMessage.setErrorMessageByCode("futureMadeDateInputError");
						return;
					}
				}


			// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.resultList = $scope.searchResultList;
				request.data.searchCondition = $scope.searchCondition;

				// チェック処理
				api.monthlyDesignList.inputCheck(request).then(function(response){
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
						return;
					}

					owsCommon.toggleSelectAll($scope.gridOptions, false);
					// 登録処理
					api.monthlyDesignList.register(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
							return;
						}
//						if ($scope.screenMode == SCREEN_MODE.Update) {
//							// 前画面へ戻る
//							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
//						} else if ($scope.screenMode == SCREEN_MODE.Create) {
							// 初期化
//							owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
							$scope.initScreen("1");

//						}
					});
				});
//			});

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

		// 行ない選択されていない
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
