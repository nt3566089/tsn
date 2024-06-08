/**
 * @ngdoc overview
 * @name oneslogiWms.ZoneMaster
 *
 * @description
 * ゾーンマスタ画面
 */
angular.module('oneslogiWms.ZoneMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.ZoneMaster.service:zoneMasterApi
 *
 * @description
 * ゾーンマスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 Zoneces/master/zoneMaster/init 初期化用WebApi<br>
 * ・resources/master/zoneMaster/search 検索用WebApi<br>
 * ・resources/master/zoneMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/zoneMaster/register 登録用WebApi<br>
 *
 */
.factory('zoneMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
		    [
		        ['query', 'GET', 'resources/common/centerClass/keyValueList']
		    ]
		),
		//荷主センタ変更対応 201７.02.17 sja Start
		warehouseCdList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
				 ]
		),
		//荷主センタ変更対応 201７.02.17 sja End
		zoneList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/zoneMaster/init'],
			    ['fileUpload',  'POST',  'resources/master/zoneMaster/fileUpload'],
			    ['search', 'GET', 'resources/master/zoneMaster/search'],
			    ['excel',  'GET', 'resources/master/zoneMaster/search', 'excel'],
			    ['inputCheck', 'POST', 'resources/master/zoneMaster/inputCheck'],
			    ['register', 'POST', 'resources/master/zoneMaster/register'],
			    ['getMasterData', 'GET', 'resources/master/zoneMaster/getMasterData']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ZoneMaster.object:ZoneMaster
 *
 * @description
 * ゾーンマスタ画面コントローラ
 */
.controller('ZoneMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo','modalFactory', 'zoneMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.zoneListCols =
		[
		    //荷主センタ変更対応 2017.04.20 sja Start
		    {field:"center", displayName:"センタ"},
			//荷主センタ変更対応 2017.04.20 sja End
		    {field:"warehouse", displayName:"倉庫"},
		    {field:"zoneCd", displayName:"ゾーン"},
		    {field:"pickingorder", displayName:"ピッキング順序"},
		    {field:"delFlg", displayName:"削除フラグ"}
		];

	//荷主センタ変更対応 2017.04.20 sja Start
	var oldCenterCd;
	/**
	 * センタ毎の倉庫リスト
	 */
	var warehouseListMap = {};
	//荷主センタ変更対応 2017.04.20 sja End

    /**
     * @ngdoc method
     * @name oneslogiWms.ZoneMaster.object:ZoneMaster#initScreen
     * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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

		// センタリストの設定
		$scope.warehouseList = userInfo.warehouseList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'zoneList',
			columnDefs: 'zoneListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-292]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
		$scope.gridSelectOptions = {
				// 荷主センタ変更対応 2017.04.20 sja Start
				"mwarehouse.mcenter.centerCd" : {
					key : "centerCd",
					value : "centerNm",
					listModel : "centerList"
				},
				// 荷主センタ変更対応 2017.04.20 sja End
				"mwarehouse.warehouseCd" : {
					key : "warehouseCd",
					value : "warehouseNm",
					// 荷主センタ変更対応 2017.04.20 sja Start
					// listModel : "warehouseList"
					listModel : "setGridWarehouseList(row.rowIndex)"
					// 荷主センタ変更対応 2017.04.20 sja End
				},
				"delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank:"null"
				}
		};
		//[ON推-品向-292]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 End
		$scope.gridEventOptions = {
//				// 荷主センタ変更対応 2017.04.20 sja Start
//				"mwarehouse.mcenter.centerCd" : {
//					"ng-change":{
//						eventFunction:"centerCdBlur(row.rowIndex)"
//					}
//				},
//				// 荷主センタ変更対応 2017.04.20 sja End
				"zoneCd":{
					"ng-change":{
						eventFunction:"zoneCdBlur(row.rowIndex)"
					}
				},
				"zoneNm":{
					"ng-change":{
						eventFunction:"zoneNmBlur(row.rowIndex)"
					}
				},
				"mwarehouse.warehouseCd":{
					"ng-change":{
						eventFunction:"warehouseCdBlur(row.rowIndex)"
					}
				},

				"pickingOrder":{
					"ng-change":{
						eventFunction:"pickingOrderBlur(row.rowIndex)"
					}
				},
				"delFlg":{
					"ng-change":{
						eventFunction:"delFlgBlur(row.rowIndex)"
					}
				}
		};

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "zoneList");

		$scope.fileOptions = {
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa Start
				acceptFileTypes : /(\.|\/)(xls|xlsx|csv)$/i,
				// CSVファイルの取り込みに対応 2016.7.7 ichikawa End
				formData : uploadParam
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "zoneCd",5, 5);
		// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mwarehouse.warehouseCd",5, 7);
		// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI End
		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.ZoneMaster.object:ZoneMaster#initScreenHttp
     * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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
					//荷主センタ変更対応 201７.02.17 sja Start
				 $scope.deferredGetWarehouseCdList()
					//荷主センタ変更対応 201７.02.17 sja End
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	$scope.warehouseCdBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.zoneCdBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.zoneNmBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.pickingOrderBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.delFlgBlur = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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

	//荷主センタ変更対応 201７.02.17 sja Start
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
		// 荷主センタ変更対応 2017.04.20 sja Start
//		// 倉庫リスト変更（同期処理）
//		$scope.deferredGetWarehouseCdList();
//		//荷主センタ変更対応 201７.02.27 sja Start
//		//$scope.getSearchData();
//		if($scope.zoneList.length > 0){
//			alertMessage.setErrorMessageByCode("researchByCenterChangeWarn");
//			return;
//		}
//		//荷主センタ変更対応 201７.02.27 sja End
		$scope.warehouseList = null;
		$scope.zoneMasterSearch.mwarehouse.warehouseCd = null;
		// 倉庫リスト変更
		$scope.setWarehouseList();

		// 荷主センタ変更対応 2017.04.20 sja End
	};
	//荷主センタ変更対応 201７.02.17 sja End

//	// 荷主センタ変更対応 2017.04.20 sja Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#centerCdBlur
//	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
//	 *
//	 * @description
//	 * センタ変更後処理<br>
//	 *
//	 * センタが変更された場合、倉庫リストデータを再度取得し画面項目に反映する。
//	 */
//	$scope.centerCdBlur = function(rowIndex) {
//		if (typeof(rowIndex) !== "undefined" ) {
//			// 倉庫リスト変更（同期処理）
//			$scope.deferredGetWarehouseCdListByGrid(rowIndex);
//		}
//	};
//	// 荷主センタ変更対応 2017.04.20 sja End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#deferredGetInitData
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
	 *
	 * @description
	 * ゾーンマスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.zoneList.init().then(function(response){
			$scope.zoneMasterSearch = response.data.zoneMasterSearch;
			$scope.zoneList = response.data.zoneList;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.zoneMasterSearch.mwarehouse.mcenter.centerCd = userInfo.centerCd;
			$scope.zoneMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			// 荷主センタ変更対応 2017.04.20 sja Start
			// 倉庫リスト作成
			setWarehouseListMap().then(function(){
				$scope.setWarehouseList();
			});
			// 荷主センタ変更対応 2017.04.20 sja End

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.zoneMasterSearch = owsHistory.popState();
				// 荷主センタ変更対応 2017.04.20 sja Start
				$scope.centerChange();
				// 荷主センタ変更対応 2017.04.20 sja End
				$scope.search();
			}

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	//荷主センタ変更対応 201７.02.17 sja Start
	// 倉庫プルダウンデータ取得
	$scope.deferredGetWarehouseCdList = function(){
		var deferred = $q.defer();

		var request = {};
		if ($scope.zoneMasterSearch) {
			request.centerId = userInfo.centerIdByCd($scope.zoneMasterSearch.mwarehouse.mcenter.centerCd);
		} else {
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);;
		}

		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};
	//荷主センタ変更対応 201７.02.17 sja End

	//荷主センタ変更対応 2017.04.20 sja Start
	/**
	 * 検索エリアに設定されたセンタCDリストから
	 * 倉庫リストを取得し内部変数に保存する
	 */
	var setWarehouseListMap = function(){

		var deferred = $q.defer();

		// センタリスト
		if (!$scope.centerList) {
			return;
		}

		warehouseListMap = {};
		var countGetWarehouse = $scope.centerList.length + 1;

		// センタリストの繰返
		for (var i = 0 ; i < $scope.centerList.length ; i++) {
			var centerCd = $scope.centerList[i].centerCd;
			if (!centerCd) {
				continue;
			}

			// 倉庫リストの取得(非同期)
			$scope.deferredGetWarehouseList(centerCd).then(function(response){

				// 取得した倉庫リストを保存
				warehouseListMap[response.centerCd] = response.warehouseList;

				countGetWarehouse = countGetWarehouse - 1;
				if(countGetWarehouse <= 0) {
					// 全倉庫の取得完了
					deferred.resolve();
				}
			});
		}

		return deferred.promise;
	};

	/**
	 * 引数のセンタCDを条件に倉庫リストを作成し返却する
	 */
	$scope.deferredGetWarehouseList = function(centerCd) {

		var deferred = $q.defer();

		// 戻り値
		var result = {};
		result.centerCd = centerCd;

		if (!centerCd) {
			deferred.reject(result);
			return deferred.promise;
		}

		var request = {};
		request.data = {};
		request.centerId = userInfo.centerIdByCd(centerCd);
		owsCommon.getDataCacheable(api.warehouseCdList, "keyValueList", request).then(function(response){
			result.warehouseList = response.data;
			deferred.resolve(result);
		});

		return deferred.promise;
	};

	/**
	 * 検索条件のゾーンリストの設定
	 * 選択されたセンタ、倉庫に従ってゾーンリストを設定する
	 */
	$scope.setWarehouseList = function() {

		var centerCd = $scope.zoneMasterSearch.mwarehouse.mcenter.centerCd;
		if (!centerCd) {
			$scope.warehouseList = null;
			return;
		}

		if (warehouseListMap[centerCd]) {

			$scope.warehouseList =  warehouseListMap[centerCd];
		} else {

			$scope.warehouseList = null;
		}
	}

	// 倉庫プルダウンデータ取得
	$scope.setGridWarehouseList = function(rowIndex){
		var centerCd;

		// [#6766][OSS] 登録後にブラウザのコンソールエラー発生 2019.11.07 kawana Start
		var bodyList = $scope.gridOptions.gridApi.grid.rows;
		if (!bodyList || bodyList.length < (rowIndex + 1)) {
			return null;
		}
		var centerCd = bodyList[rowIndex].entity.mwarehouse.mcenter.centerCd;
		// [#6766][OSS] 登録後にブラウザのコンソールエラー発生 2019.11.07 kawana End

		if (!centerCd) {
			return null;
		}

		if (warehouseListMap[centerCd]) {
			return warehouseListMap[centerCd];
		} else {
			return null;
		}
	};
	//荷主センタ変更対応 2017.04.20 sja End

	/**
     * @ngdoc method
     * @name oneslogiWms.ZoneMaster.object:ZoneMaster#search
     * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#getSearchData
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function() {
		var request = {};
		request.data = {};
		request.data.zoneMasterSearch = $scope.zoneMasterSearch;

		api.zoneList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#setSearchData
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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

		// [ON推-品向-351] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-351] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.zoneList = response.data.zoneList;
		//既存行のキー項目が変更不可
		for (var row = 0; row < $scope.zoneList.length; row++) {
			// 荷主センタ変更対応 2017.04.21 sja Start
			gridDirectiveControl.editable($scope.gridOptions, 'mwarehouse.mcenter.centerCd', false, row);
			// 荷主センタ変更対応 2017.04.21 sja End
			if ($scope.zoneList[row].zoneId != null){
				gridDirectiveControl.editable($scope.gridOptions, 'mwarehouse.warehouseCd', false, row);
				gridDirectiveControl.editable($scope.gridOptions, 'zoneCd', false, row);
			}
		}
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.zoneMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#getClassForRow
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#excelOutput
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.zoneMasterSearch = $scope.zoneMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "zoneList", document.title);

		api.zoneList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#addRow
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){
		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
		// [#1798] 行追加のセンタCDを検索結果に合わせて変更 2017.05.31 kawana Start
		if (0 < $scope.zoneList.length) {
			$scope.blankRow.mwarehouse.mcenter.centerCd = $scope.zoneList[0].mwarehouse.mcenter.centerCd;
		} else {
			$scope.blankRow.mwarehouse.mcenter.centerCd = userInfo.centerCd;
		}
		$scope.blankRow.mwarehouse.mcenter.centerId = userInfo.centerIdByCd($scope.blankRow.mwarehouse.mcenter.centerCd);
		$scope.blankRow.mwarehouse.centerId = $scope.blankRow.mwarehouse.mcenter.centerId;
		// [#1798] 行追加のセンタCDを検索条件のセンタCDに変更 2017.05.31 kawana End
		$scope.zoneList.push(angular.copy($scope.blankRow));

		// [#1798] 不要なfor文を削除 2017.05.31 kawana Start
		gridDirectiveControl.editable($scope.gridOptions, 'mwarehouse.mcenter.centerCd', false, $scope.zoneList.length - 1);
		gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.zoneList.length - 1);
		// [#1798] 不要なfor文を削除 2017.05.31 kawana End

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#removeRow
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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
			if ($scope.zoneList.indexOf(row) > -1) {
				if (row.zoneId != null) {
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
			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].zoneCd != ""
				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].zoneCd != null)
				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingOrder != ""
					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].pickingOrder != null)
					||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].zoneNm != ""
						&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].zoneNm != null)
						||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].mwarehouse.warehouseCd !=""
							&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].mwarehouse.warehouseCd != null)
								||$scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
					return;
				}
			}
		}



		// 選択行削除
		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
			if ($scope.zoneList.indexOf(row) > -1) {
				$scope.zoneList.splice($scope.zoneList.indexOf(row), 1);
			}
		});

		// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
		//owsCommon.toggleSelectAll($scope.gridOptions, false);
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
	};

	// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

	// Excelアップロード前処理
	$scope.excelBeforeUpload = function() {
		$scope.fileOptions.url = "resources/master/zoneMaster/fileUpload";
	}

	// Excelアップロード
	$scope.excelUploadSuccess = function(e, data) {

		// 処理前にグリッドをクリアする。
		$scope.zoneList = [];

		owsCommon.syncExec(function() {

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.zoneMasterSearch = $scope.zoneMasterSearch;
			// [#1864] センタ・荷主を空にして押下すると致命的エラー発生 2017.06.05 kawana Start
			if (request.data.zoneMasterSearch.mwarehouse.mcenter.centerCd == null) {
				// センタ未選択の場合はログインセンタを設定

				request.data.zoneMasterSearch.mwarehouse.mcenter.centerCd = userInfo.centerCd;
			}
			// [#1864] センタ・荷主を空にして押下すると致命的エラー発生 2017.06.05 kawana End
			request.data.zoneList        = data.result.data.zoneList;

			// マスタ取得
			api.zoneList.getMasterData(request).then(function(response){
				// 取得データセット
				$scope.zoneList = response.data.zoneList;

				// セット行ループ
				for (var row = 0; row < $scope.zoneList.length; row++) {

					// 荷主センタ変更対応 2017.04.21 sja Start
					gridDirectiveControl.editable($scope.gridOptions, 'mwarehouse.mcenter.centerCd', false, row);// centerCd編集不可
					// 荷主センタ変更対応 2017.04.21 sja End
					// 既存行のキー項目が変更不可
					if ($scope.zoneList[row].zoneId != null){
						gridDirectiveControl.editable($scope.gridOptions, 'mwarehouse.warehouseCd', false, row); // warehouseCd編集不可
						gridDirectiveControl.editable($scope.gridOptions, 'zoneCd', false, row); // zoneCd編集不可
					}else{
						gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row); // delFlg編集不可
					}

				}

				// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

				owsCommon.syncExec(function() {
					// 選択状態にする
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
					if ($scope.zoneList.length > 0){
						//$scope.gridOptions.ngGrid.rowFactory.selectionProvider.toggleSelectAll(true, true);
						owsCommon.toggleSelectAll($scope.gridOptions, true);

						// [#7010][OSS] 不正値が取り込まれた場合に空値と未選択がリスト表示されてしまう問題を修正 2020.01.21 kaawna Start

						// 通常は基盤(oneslogi.base.pc.js)で吸収される動作だが、listModelにfunctionとrowを使用しているため動作しない
						// そのため、基盤と同じ処理を入れることで対応する
						for (var row = 0; row < $scope.zoneList.length; row++) {

							// 対象行のドロップダウンリストを取得
							var warehouseList = $scope.setGridWarehouseList(row);

		                    var isFind = false;
		                    var len = 0;
		                    if (warehouseList) {
		                        len = warehouseList.length;
		                    }
		                    for (var i = 0; i < len; i++) {
		                        if (warehouseList[i].warehouseCd === $scope.zoneList[row].mwarehouse.warehouseCd) {
		                            // ドロップダウンリストに同じ値が存在
		                            isFind = true;
		                        }
		                    }
		                    if (!isFind) {
		                    	// ドロップダウンリストに同じ値がないので「null」を設定
		                    	$scope.zoneList[row].mwarehouse.warehouseCd = null;
		                    }
						}

						// [#7010][OSS] 不正値が取り込まれた場合に空値と未選択がリスト表示されてしまう問題を修正 2020.01.21 kaawna End

					}else{
						owsCommon.toggleSelectAll($scope.gridOptions, false);
					}
					// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
				});

			})

			// 完了後の処理
			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
				return;
			}
		},3)
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZoneMaster.object:ZoneMaster#register
	 * @methodOf oneslogiWms.ZoneMaster.object:ZoneMaster
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
//		for (var row = 0; row < $scope.zoneList.length; row++) {
//			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
//				// 空行を退避
//				emptyBody.push($scope.zoneList[row]);
//			} else {
//				// 空行以外を退避
//				listBody.push($scope.zoneList[row]);
//			}
//		}


		if($scope.zoneList.length == 0){
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
		for (var row = 0; row < $scope.zoneList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//				// 空行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
				// 空行を退避
				emptyBody.push($scope.zoneList[row]);
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.zoneList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.zoneList[row]);
			}
		}

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
//				for (var row = 0; row < $scope.zoneList.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 入力データ無し
				if (listBody.length == 0) {
					alertMessage.setErrorMessageByCode("noDetailsError");
					return;
				}

				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行のため削除 2017.09.21 honma Delete
				// [#1798] 不要なコード(行No.振り直し)を削除 2017.05.31 kawana

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// ゾーンCD重複チェック
				var j = 0;
				var rowIndex = new Array();
				var errAry = new Array();
	//			for (var row = 0; row < $scope.zoneList.length; row++) {
	//				var zoneCd = $scope.zoneList[row].zoneCd;
	//				for (var i = row+1; i < $scope.zoneList.length; i++) {
	//					if ($scope.zoneList[i].zoneCd == zoneCd){
	//						rowIndex[j] =i;
	//						errAry[j] = "zoneCodeDuplicateError";
	//						j++;
	//					}
	//				}
	//			}
				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
				for (var row = 0; row < $scope.zoneList.length; row++) {
					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
						var zoneCd = $scope.zoneList[row].zoneCd;
						var warehouseCd = $scope.zoneList[row].mwarehouse.warehouseCd;
						for (var i = row+1; i < $scope.zoneList.length; i++) {
							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
								if ($scope.zoneList[i].zoneCd == zoneCd && $scope.zoneList[i].mwarehouse.warehouseCd == warehouseCd){
									rowIndex[j] =i;
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//									errAry[j] = "zoneCodeDuplicateError";
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
									j++;
								}
							}
						}
					}
				}
				if (j > 0){
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//					for(row = 0; row < rowIndex.length; row++){
//						if (!gridOptionMessageControl.isShow($scope.gridOptions, "zoneCd", rowIndex[row])) {
//							gridOptionMessageControl.show($scope.gridOptions, "zoneCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//						}
//					}
					// エラーメッセージCD
					var messageCd = "zoneCodeDuplicateError";
					gridOptionMessageControl.show($scope.gridOptions, "zoneCd", $filter('owfMessage')(messageCd), rowIndex);
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
					return;
				}

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27(不要なコード削除) SJA
				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod Start
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.zoneList.splice($scope.zoneList.indexOf(row), 1);
				});
				// [#2078][Ver2.2.1] 荷材マスタメンテナンス - 重複チェック不正 空行削除処理移行 2017.09.21 honma Mod End

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.zoneList = listBody;
				request.data.zoneMasterSearch = $scope.zoneMasterSearch;

				// 入力チェック
				api.zoneList.inputCheck(request).then(function(response){
				// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI Start
					for (var i = 0; i < response.status.listStatus.length; i++) {
				      if (response.status.listStatus[i].status.statusCode == 7){
					    gridOptionMessageControl.show($scope.gridOptions, "mwarehouse.warehouseCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
					    return;
				      }
					}
				// [SK2-071] 倉庫が存在しないエラーとする。 2014.12.19 KI End
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}

					// ゾーンマスタデータ登録または更新
					api.zoneList.register(request).then(function(response){
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

	// サーバ処理結果に従い、エラー・警告・情報を表示する
	var controlStatus = function (response, formName) {
		// 情報がない場合は何もしない
		if (response.status.listStatus == null || response.status.listStatus.length == 0) {
			return true;
		}

		var error = false;

		// 業務エラーを処理
		for (var i = 0; i < response.status.listStatus.length; i++) {

			// 正常・確認以外はエラー
			if (response.status.listStatus[i].status.statusCode > 1) {
				error = true;
			}

			switch (response.status.listStatus[i].status.statusCode) {
			case 0:
				// 正常終了
				continue;
			case 1:
				// ユーザによる確認
				continue;
			case 2:
				// ゾーンCD重複
				if (!gridOptionMessageControl.isShow($scope.gridOptions, "zoneCd", response.status.listStatus[i].status.rowIndex)) {
					gridOptionMessageControl.show($scope.gridOptions, "zoneCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
				}
				break;
//			case 6:
//				// センタマスタ未存在
//				if (!gridOptionMessageControl.isShow($scope.gridOptions, "centerCd", response.status.listStatus[i].status.rowIndex)) {
//					gridOptionMessageControl.show($scope.gridOptions, "centerCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
//				}
//				break;
			default:
				if (response.status.listStatus[i].status.statusCode > 0) {
					alertMessage.setErrorMessageByCode($filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
				}
			}
		}

		var cancel = false;

		// ユーザ確認を処理
		for (var i = 0; i < response.status.listStatus.length; i++) {
			if (response.status.listStatus[i].status.statusCode == 1) {
				if (!cancel) {
					var ret = owsCommon.viewConfirm(response.status.messageCode);
					if (!ret) {
						cancel = true;
					}
				}
			}
		}

		// キャンセルがある場合は終了
		if (cancel) {
			return false;
		}

		// 正常終了を処理
		for (var i = 0; i < response.status.listStatus.length; i++) {
			if (response.status.listStatus[i].status.statusCode == 0) {
				if (response.status.messageCode != null && response.status.messageCode != "") {
					alertMessage.setInfoMessageByCode(response.status.messageCode, response.status.messageReplaceValue);
				}
			}
		}

		return !error;
	}

	//画面初期化処理を実行
	$scope.initScreen();

}]);
