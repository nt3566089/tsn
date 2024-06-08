/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierMasterList
 *
 * @description
 * 運送業者マスタメンテナンス画面
 */
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
angular.module('oneslogiWms.CarrierMasterList',[])
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierMasterList.service:CarrierMasterListApi
 *
 * @description
 * 運送業者マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/carrierMasterList/init 初期化用WebApi<br>
 * ・resources/master/carrierMasterList/search 検索用WebApi<br>
 * ・resources/master/carrierMasterList/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/carrierMasterList/register 登録用WebApi<br>
 *
 */
.factory('carrierMasterListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		carrierList: AngularAPIClient.make(
				//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)
				[
				 ['init',   'GET', 'resources/master/carrierMasterList/init'],
				 ['search', 'GET', 'resources/master/carrierMasterList/search'],
				 ['excel',  'GET', 'resources/master/carrierMasterList/search', 'excel']
				//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList
 *
 * @description
 * 運送業者マスタ画面コントローラ
 */
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
.controller('CarrierMasterList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'carrierMasterListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, api) {
//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

	//グリッドの列情報（デザイン用）
	$scope.carrierListCols =
		[
			//荷主センタ変更対応 201７.01.18 sja Start
		 {field:"centerCd", displayName:"センタCD"},
		 {field:"centerNm", displayName:"センタ名称"},
			//荷主センタ変更対応 201７.01.18 sja End
		 {field:"carrierCd", displayName:"運送業者CD"},
		 {field:"carrierNm", displayName:"運送業者名称"},
		 {field:"carrierAbbr", displayName:"運送業者略称"},
		 //[C-EC-0007]配送コースに送り状定義マスタを紐付ける対応 業者毎にどの定義かを設定する 2015/01/27 Yokosuka [S]
		 //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		 {field:"carrierCd", displayName:"共通運送業者CD"},
		 {field:"carrierNm", displayName:"共通運送業者名称"},
		 //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		 //[C-EC-0007]配送コースに送り状定義マスタを紐付ける対応 業者毎にどの定義かを設定する 2015/01/27 Yokosuka [E]
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		 {field:"delFlg", displayName:"削除フラグCD"},
		 {field:"bclassDtlByDelFlg.vdict.dictNm", displayName:"削除フラグ名称"}
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
		 ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#initScreen
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
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

		// [#361] ページング処理追加 2016.12.13 kawana Start
		//ページングの設定(ページング有り)
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();
		// [#361] ページング処理追加 2016.12.13 kawana End

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  Start
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
	    //[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End
			data: 'carrierList',
			columnDefs: 'carrierListCols',
			// [#361] ページング処理追加 2016.12.13 kawana Start
			pagingOptions : $scope.pagingOptions
			// [#361] ページング処理追加 2016.12.13 kawana End
		});

		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "carrierCd",6, 2);

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#initScreenHttp
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
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
				//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

				 ])
				 //全通信終了後に以下関数で各種設定を実行
				 .then(function(response){
					 // 画面初期化データ設定（同期処理）
					 return $scope.deferredGetInitData();
				 });
	};

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#deferredGetDelFlg
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
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

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * 運送業者マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.carrierList.init().then(function(response){
			$scope.carrierMasterSearch = response.data.head;
			$scope.carrierList = response.data.body;
			// [#361] ページング処理追加 2016.12.13 kawana Start
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

			// ログイン情報より初期値を設定
			$scope.carrierMasterSearch.mcenter.centerCd = userInfo.centerCd;
			$scope.carrierMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);

			//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.carrierMasterSearch = owsHistory.popState();
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
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#search
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.search = function(){
		// [#361] ページング処理追加 2016.12.13 kawana Start
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getSearchData($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		// [#361] ページング処理追加 2016.12.13 kawana End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#getSearchData
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.head = $scope.carrierMasterSearch;

		// [#361] ページング処理追加 2016.12.13 kawana Start
		// ページング用データ設定
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
		// [#361] ページング処理追加 2016.12.13 kawana End

		api.carrierList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#setSearchData
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		// [#361] ページング処理追加 2016.12.13 kawana Start
		//選択状態をクリアする
		//ON推-UT210N-001 SJA 2016/09/08 Start
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		//ON推-UT210N-001 SJA 2016/09/08 End
		// [#361] ページング処理追加 2016.12.13 kawana End

		// [ON推-品向-350] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-350] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.carrierList = response.data.body;

		//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

		// [#361] ページング処理追加 2016.12.13 kawana Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		// [#361] ページング処理追加 2016.12.13 kawana End

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.carrierMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#getClassForRow
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 削除ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#excelOutput
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.head = $scope.carrierMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.carrierList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04(不要ソース削除)

	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.carrierList.object:carrierList#register
	 * @methodOf oneslogiWms.carrierList.object:carrierList
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * 運送業者マスタメンテナンス新規する為の画面を表示する。
	 */
	$scope.initnew = function() {
		$location.path("wms/master/CarrierMasterEdit").search({}).search("mode", SCREEN_MODE.Register);
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierMasterList.object:CarrierMasterList#gridDblClick
	 * @methodOf oneslogiWms.CarrierMasterList.object:CarrierMasterList
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList#update
	 * @methodOf oneslogiWms.DeliveryCourseMasterList.object:DeliveryCourseMasterList
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * 選択行の配送コースマスタデータを修正する為の画面を表示する。
	 */
	$scope.update = function() {
		//修正画面へ遷移
		//荷主センタ変更対応 201７.01.18 sja Start
//		$location.path("wms/master/CarrierMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("carrierId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierId);
		$location.path("wms/master/CarrierMasterEdit").search({}).search("mode", SCREEN_MODE.Update)
			.search("carrierId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierId)
			.search("centerCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd);
		//荷主センタ変更対応 201７.01.18 sja End
	};
	//[Ver2.1向けエンハンス] 荷札出力対応 BY SJA 2016/07/04  End

	//画面初期化処理を実行
	$scope.initScreen();

}]);
