/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipYmtMaster
 *
 * @description
 * ヤマト送り状マスタ画面
 */
angular.module('oneslogiWms.CarrierSlipYmtMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipYmtMaster.service:CarrierSlipYmtMasterApi
 *
 * @description
 * ヤマト送り状マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/CarrierSlipYmtMaster/init 初期化用WebApi<br>
 * ・resources/master/CarrierSlipYmtMaster/search 検索用WebApi<br>
 * ・resources/master/CarrierSlipYmtMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/CarrierSlipYmtMaster/register 登録用WebApi<br>
 *
 */
.factory('CarrierSlipYmtMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
		    [
		        ['query', 'GET', 'resources/common/centerClass/keyValueList']
		    ]
		),
		zip: AngularAPIClient.make(
			[
			 	['record', 'GET', 'resources/common/zip/record']
			 ]
		),
		carrierSlipYmtList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/carrierSlipYmtMaster/init'],
			    ['fileUpload',  'POST',  'resources/master/carrierSlipYmtMaster/fileUpload'],
			    ['search', 'GET', 'resources/master/carrierSlipYmtMaster/search'],
			    ['excel',  'GET', 'resources/master/carrierSlipYmtMaster/search', 'excel'],
			    ['inputCheck', 'POST', 'resources/master/carrierSlipYmtMaster/inputCheck'],
			    ['register', 'POST', 'resources/master/carrierSlipYmtMaster/register'],
			    ['getMasterData', 'GET', 'resources/master/carrierSlipYmtMaster/getMasterData']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.carrierSlipYmtMaster.object:carrierSlipYmtMaster
 *
 * @description
 * ヤマト送り状マスタ画面コントローラ
 */
.controller('CarrierSlipYmtMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo','modalFactory', 'CarrierSlipYmtMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.carrierSlipYmtListCols =
		[
			{field:"centerId", displayName:"センタCD"},
			{field:"tagType", displayName:"データ種別"},
			{field:"tagNm", displayName:"データ種別名称"},
			{field:"characterCd", displayName:"文字コード"},
			{field:"slipType", displayName:"送り状種別"},
			{field:"coolCls", displayName:"クール区分"},
			{field:"honorific", displayName:"敬称"},
			{field:"packingShowFlg", displayName:"個数口表示フラグ"},
			{field:"slipClientTelNo", displayName:"ご依頼主電話番号"},
			{field:"slipClientZipCd", displayName:"ご依頼主郵便番号"},
			{field:"slipClientAddress1", displayName:"ご依頼主住所(都道府県)"},
			{field:"slipClientAddress2", displayName:"ご依頼主住所(市区郡町村)"},
			{field:"slipClientAddress3", displayName:"ご依頼主住所(町域)"},
			{field:"slipClientAddress4", displayName:"ご依頼主住所(アパートマンション名)"},
			{field:"slipClientNm", displayName:"ご依頼主名"},
			{field:"slipItemCd1", displayName:"品名コード1"},
			{field:"slipItemNm1", displayName:"品名1"},
			{field:"slipItemCd2", displayName:"品名コード2"},
			{field:"slipItemNm2", displayName:"品名2"},
			{field:"freightHandling1", displayName:"荷扱い1"},
			{field:"freightHandling2", displayName:"荷扱い2"},
			{field:"article", displayName:"記事"},
			{field:"billingCustomerCd", displayName:"ご請求先顧客コード"},
			{field:"fareNo", displayName:"運賃管理番号"},
			{field:"delFlg", displayName:"削除"},
			//荷主センタ変更対応 201７.02.21 sja Start
			 {field:"mcenter.centerCd", displayName:"センタCD"},
			 {field:"mcenter.centerNm", displayName:"センタ名称"}
			//荷主センタ変更対応 201７.02.21 sja End


		];

    /**
     * @ngdoc method
     * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#initScreen
     * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
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

//		2016.02.18 Pan ページング ※3 Start
		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 kawana Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 kawana End


		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'carrierSlipYmtList',
			columnDefs: 'carrierSlipYmtListCols',
			pagingOptions : $scope.pagingOptions
		});
//		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
//			data: 'carrierSlipYmtList',
//			columnDefs: 'carrierSlipYmtListCols',
//		});
//		2016.02.18 Pan ページング ※3 End

//		2016.03.05 Zhang 一覧編集 ※4 Start
		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
//		$scope.gridSelectOptions = {
//				"centerId" : {
//					key : "centerCd",
//					value : "CENTER_NM",
//					listModel : "centerList"
//				},
//				"characterCd" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "characterCdList",
//					// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana Start
//					viewWithKey : false
//					// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana End
//				},
//				"slipType" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "slipTypeList"
//				},
//				"packingShowFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "packingShowFlgList"
//				},
//				"coolCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "coolClsList"
//				},
//				"delFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "delFlgList",
//					removeBlank:"null"
//				}
//		};
//		$scope.gridEventOptions = {
//				"tagType":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"tagNm":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"characterCd":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipType":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"coolCls":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"honorific":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"packingShowFlg":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientTelNo":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientZipCd":{
//					"ng-change":{
//						eventFunction:"zipCdBlur(row.rowIndex)"
//					}
//				},
//				"slipClientAddress1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientAddress2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientAddress3":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientAddress4":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientNm":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemCd1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemCd2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"freightHandling1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"freightHandling2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"billingCustomerCd":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"fareNo":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"article":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"delFlg":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				}
//		};

		// グリッドの郵便番号列にボタンを設定1
//		$scope.gridButtonOptions = {
//				"slipClientZipCd":{
//					clickFunction:"showZip(row.rowIndex)"
//				}
//		};
//		2016.03.05 Zhang 一覧編集 ※4 End
		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "carrierSlipYmtList");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(xls|xlsx)$/i,
				formData : uploadParam
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#initScreenHttp
     * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
//2016.03.05 Zhang 一覧編集 ※4 Start
//				 $scope.deferredGetDelFlg(),
//				 $scope.deferredGetCharacterCd(),
//				// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana Start
//				 $scope.deferredGetPackingShowFlg(),
//				// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana End
//				 $scope.deferredGetSlipType(),
//				 $scope.deferredGetCoolCls()
//		2016.03.05 Zhang 一覧編集 ※4 End
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};
//	2016.03.05 Zhang 一覧編集 ※4 Start
//	$scope.itemBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#showZip
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 郵便番号検索ボタン押下処理<br>
//	 *
//	 * 検索画面を表示し、選択された郵便番号の情報を取得し画面項目に反映する。
//	 */
//	$scope.showZip = function(rowIndex){
//
//		var items = {
//			zipCd: $scope.carrierSlipYmtList[rowIndex].slipClientZipCd
//		};
//		//マスタのモーダル画面を表示
//		var modalInstance = modalFactory.modalZip(items);
//
//		// モーダル画面が閉じられたら呼ばれるファンクションの登録
//		modalInstance.result.then(function(selectedItem){
//			$scope.carrierSlipYmtList[rowIndex].slipClientZipCd =  selectedItem.zipCd;
//
//			if((($scope.carrierSlipYmtList[rowIndex].slipClientAddress1 == null)||($scope.carrierSlipYmtList[rowIndex].slipClientAddress1 == ""))&&
//					(($scope.carrierSlipYmtList[rowIndex].slipClientAddress2 == null)||($scope.carrierSlipYmtList[rowIndex].slipClientAddress2 == ""))&&
//					(($scope.carrierSlipYmtList[rowIndex].slipClientAddress3 == null)||($scope.carrierSlipYmtList[rowIndex].slipClientAddress3 == ""))
//					){
//
//				$scope.carrierSlipYmtList[rowIndex].slipClientAddress1 =  selectedItem.address1;
//				$scope.carrierSlipYmtList[rowIndex].slipClientAddress2 =  selectedItem.address2;
//				$scope.carrierSlipYmtList[rowIndex].slipClientAddress3 =  selectedItem.address3;
//			};
//		});
//	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.carrierSlipYmtListBulkInput.object:carrierSlipYmtListBulkInput#zipCdBlur
//	 * @methodOf oneslogiWms.carrierSlipYmtListBulkInput.object:carrierSlipYmtListBulkInput
//	 *
//	 * @description
//	 * 郵便番号のロストフォーカス処理<br>
//	 *
//	 * サーバとの通信を行い、郵便番号の情報を取得し画面項目に反映する。
//	 */
//	$scope.zipCdBlur = function(rowIndex) {
//
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//
//		// 入力された郵便コードを取得
//		var zipCd = $scope.carrierSlipYmtList[rowIndex].slipClientZipCd;
//
//		if((($scope.carrierSlipYmtList[rowIndex].slipClientAddress1 == null)||($scope.carrierSlipYmtList[rowIndex].slipClientAddress1 == ""))&&
//				(($scope.carrierSlipYmtList[rowIndex].slipClientAddress2 == null)||($scope.carrierSlipYmtList[rowIndex].slipClientAddress2 == ""))&&
//				(($scope.carrierSlipYmtList[rowIndex].slipClientAddress3 == null)||($scope.carrierSlipYmtList[rowIndex].slipClientAddress3 == ""))){
//
//			if (zipCd && 0 < zipCd.length) {
//				var request = {};
//				request.zipCd = zipCd;
//
//				api.zip.record(request).then(function(response){
//					$scope.carrierSlipYmtList[rowIndex].slipClientAddress1 =  response.data.mZip.address1;
//					$scope.carrierSlipYmtList[rowIndex].slipClientAddress2 =  response.data.mZip.address2;
//					$scope.carrierSlipYmtList[rowIndex].slipClientAddress3 =  response.data.mZip.address3;
//				});
//			}
//		};
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetDelFlg
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 削除フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetDelFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "DEL_FLG";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.delFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetCharacterCd
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 文字コード取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCharacterCd = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "CHARACTER_CD";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.characterCdList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetPackingShowFlg
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 個数口表示フラグ取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetPackingShowFlg = function () {
//		// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana End
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "PACKING_SHOW_FLG";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.packingShowFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetSlipType
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 送り状種別取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetSlipType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SLIP_TYPE";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.slipTypeList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetSlipType
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * クール区分取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredGetCoolCls = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "COOL_CLS";
//
//		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
//			$scope.coolClsList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//	2016.03.05 Zhang 一覧編集 ※4 End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * ヤマト送り状マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.carrierSlipYmtList.init().then(function(response){
			$scope.carrierSlipYmtMasterSearch = response.data.carrierSlipYmtMasterSearch;
			$scope.carrierSlipYmtList = response.data.carrierSlipYmtList;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.carrierSlipYmtMasterSearch.mcenter.centerCd = userInfo.centerCd;
//			$scope.carrierSlipYmtMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
//			2016.02.18 Pan ページング ※3 Start
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

//			2016.02.18 Pan ページング ※3 End

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.carrierSlipYmtMasterSearch = owsHistory.popState();
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
     * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#search
     * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
     *
     * @description
     * 検索ボタン押下処理<br>
     * ・検索処理呼び出し
     */
	$scope.search = function(){
//		2016.02.18 Pan ページング ※3 Start
//		$scope.getSearchData();
		owsCommon.clearPagingOptions($scope.gridOptions);
		$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
//		2016.02.18 Pan ページング ※3 End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#getSearchData
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.carrierSlipYmtMasterSearch = $scope.carrierSlipYmtMasterSearch;
//		2016.02.18 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//		2016.02.18 Pan ページング ※3 End
		api.carrierSlipYmtList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#setSearchData
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
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
		$scope.carrierSlipYmtList = response.data.carrierSlipYmtList;
//		2016.03.05 Zhang 一覧編集 ※4 Start
		//既存行のキー項目が変更不可
//		for (var row = 0; row < $scope.carrierSlipYmtList.length; row++) {
//			if ($scope.carrierSlipYmtList[row].carrierSlipYmtId != null){
//				gridDirectiveControl.editable($scope.gridOptions, 'tagType', false, row);
//			}
//		}
//		2016.03.05 Zhang 一覧編集 ※4 End

//		2016.02.18 Pan ページング ※3 Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
//		2016.02.18 Pan ページング ※3 End
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.carrierSlipYmtMasterSearch);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#getClassForRow
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
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
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#excelOutput
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.carrierSlipYmtMasterSearch = $scope.carrierSlipYmtMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "carrierSlipYmtList", document.title);

		api.carrierSlipYmtList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};

//	2016.03.05 Zhang 一覧編集 ※4 Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#addRow
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 行追加ボタン押下処理<br>
//	 *
//	 * グリッドの最終行の下に空行を追加する。
//	 */
//	$scope.addRow = function(){
//		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
//		$scope.carrierSlipYmtList.push(angular.copy($scope.blankRow));
//
//		// 削除フラグが使用不可
//		for (var row = 0; row < $scope.carrierSlipYmtList.length; row++) {
//			if ($scope.carrierSlipYmtList[row].tagType == null){
//				gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row);
//			}
//		}
//		// 行番号振り直し
//		updateRowNumber($scope.carrierSlipYmtList);
//
//	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#removeRow
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 行削除ボタン押下処理<br>
//	 *
//	 * 選択行をグリッドから削除する。
//	 */
//	$scope.removeRow = function(){
//
//		// 選択行削除チェック
//		var i = 0;
//		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
//			if ($scope.carrierSlipYmtList.indexOf(row) > -1) {
//				if (row.carrierSlipYmtId != null) {
//					i += 1;
//					return;
//				}
//			}
//		});
//		if (i > 0){
//			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
//			return;
//		}
//
//		// 削除対象無し
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
//			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
//			return;
//		}
//
//		// 複数行の場合に警告
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
//			if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
//				return;
//			}
//		}else{
//			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[0].tagType != ""
//				&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].tagType != null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[0].tagNm != ""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[0].tagNm != null)
//								||$scope.gridOptions.gridApi.selection.getSelectedRows()[0].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
//				if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
//					return;
//				}
//			}
//		}
//
//
//
//		// 選択行削除
//		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
//			if ($scope.carrierSlipYmtList.indexOf(row) > -1) {
//				$scope.carrierSlipYmtList.splice($scope.carrierSlipYmtList.indexOf(row), 1);
//			}
//		});
//
//		// 行番号振り直し
//		updateRowNumber($scope.carrierSlipYmtList);
//
//		// ヘッダー行の選択
//		owsCommon.toggleSelectAll($scope.gridOptions, false);
//	};

//	// 行番号振り直し処理
//	var updateRowNumber = function(body) {
//		var i = 1;
//		angular.forEach(body, function(row) {
//			row.lineNo = i++;
//		});
//	};

//	// Excelアップロード前処理
//	$scope.excelBeforeUpload = function() {
//		$scope.fileOptions.url = "resources/master/carrierSlipYmtMaster/fileUpload";
//	}

	// Excelアップロード
//	$scope.excelUploadSuccess = function(e, data) {
//
//		// 処理前にグリッドをクリアする。
//		$scope.carrierSlipYmtList = [];
//
//		owsCommon.syncExec(function() {
//
//			// 画面内容を引数に設定
//			var request = {};
//			request.data = {};
//			request.data.carrierSlipYmtMasterSearch = $scope.carrierSlipYmtMasterSearch;
//			request.data.carrierSlipYmtList        = data.result.data.carrierSlipYmtList;
//
//			// マスタ取得
//			api.carrierSlipYmtList.getMasterData(request).then(function(response){
//				// 取得データセット
//				$scope.carrierSlipYmtList = response.data.carrierSlipYmtList;
//
//				// セット行ループ
//				for (var row = 0; row < $scope.carrierSlipYmtList.length; row++) {
//
//					// 既存行のキー項目が変更不可
//					if ($scope.carrierSlipYmtList[row].carrierSlipYmtId != null){
//						gridDirectiveControl.editable($scope.gridOptions, 'tagType', false, row);
//					}else{
//						gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row); // delFlg編集不可
//					}
//				}
//
//				// 行番号振り直し
//				updateRowNumber($scope.carrierSlipYmtMaster);
//
//				owsCommon.syncExec(function() {
//					// 選択状態にする
//					if ($scope.carrierSlipYmtList.length > 0){
//						owsCommon.toggleSelectAll($scope.gridOptions, true);
//					}else{
//						owsCommon.toggleSelectAll($scope.gridOptions, false);
//					}
//				});
//
//			})
//
//			// 完了後の処理
//			if (!statusInfo.isSuccessAndShowMessage(data.result, 'inputform')) {
//				return;
//			}
//		},3)
//	}

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#register
//	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
//	 *
//	 * @description
//	 * 登録ボタン押下処理<br>
//	 *
//	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
//	 */
//	$scope.register = function() {
//		// 業務エラーのクリア
//		optionMessageControl.hideAll($scope);
//		gridOptionMessageControl.hideAll($scope.gridOptions);
//
//		var listBody = [];
//		var emptyBody = [];
//
//		if($scope.carrierSlipYmtList.length == 0){
//			alertMessage.setErrorMessageByCode("noDetailsError");
//			return;
//		}
//
//		// 行ない選択されていない
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
//			alertMessage.setErrorMessageByCode("lineNotSelectError");
//			return;
//		}
//
//		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
//		// 空行判定
//		var allBody = $scope.gridOptions.gridApi.grid.rows;
//		for (var row = 0; row < $scope.carrierSlipYmtList.length; row++) {
//			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//				// 空行を退避
//				emptyBody.push($scope.carrierSlipYmtList[row]);
//			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
//				// 未選択行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
//				// 未選択行を退避
//				emptyBody.push($scope.carrierSlipYmtList[row]);
//			}else {
//				// 空行以外を退避
//				listBody.push($scope.carrierSlipYmtList[row]);
//			}
//		}
//
//		// 入力系グリッドのチェックを修正する
//		var promiseAll = $q.all([
//		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
//		                         ]);
//
//		promiseAll.then(function(){
//		// 入力系グリッドのチェックを修正する
//			owsCommon.syncExec(function() {
//				var isError = $scope.searchinputform.$invalid;
//
//				// 入力系グリッドのチェックを修正する
//				gridDirectiveControl.validity($scope.gridOptions, true);
//
//				// 入力データ無し
//				if (listBody.length == 0) {
//					alertMessage.setErrorMessageByCode("noDetailsError");
//					return;
//				}
//
//				// [ON推-品向-891] 重複チェック動作異常を修正(不要な削除) 2015.11.13 chou
//
//				// 行番号振り直し
//				updateRowNumber($scope.carrierSlipYmtList);
//
//				// センタIDとデータ種別重複チェック
//				var j = 0;
//				var rowIndex = new Array();
//				var errAry = new Array();
//				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
//
//				// センタID
//				var centerId = userInfo.centerId;
//
//				for (var row = 0; row < $scope.carrierSlipYmtList.length; row++) {
//
//					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
//						// データ種別
//						var tagType = $scope.carrierSlipYmtList[row].tagType;
//						for (var i = row+1; i < $scope.carrierSlipYmtList.length; i++) {
//							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
//								// 重複
//								if ($scope.carrierSlipYmtList[i].tagType == tagType){
//									rowIndex[j] =i;
//									j++;
//								}
//							}
//						}
//					}
//				}
//				if (j > 0){
//					// エラーメッセージCD
//					var messageCd = "tagTypeDuplicateError";
//					gridOptionMessageControl.show($scope.gridOptions, "tagType", $filter('owfMessage')(messageCd), rowIndex);
//					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return;
//				}
//
//				// [ON推-品向-891] 明細に同じデータ2行追加して、登録すると異常終了する。2015.11.13 chou Start
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.carrierSlipYmtList.splice($scope.carrierSlipYmtList.indexOf(row), 1);
//				});
//				// [ON推-品向-891] 明細に同じデータ2行追加して、登録すると異常終了する 2015.11.13 chou End
//
//				// 画面内容を引数に設定
//				var request = {};
//				request.data = {};
//				request.data.carrierSlipYmtList = listBody;
//				request.data.carrierSlipYmtMasterSearch = $scope.carrierSlipYmtMasterSearch;
//
//				// 入力チェック
//				api.carrierSlipYmtList.inputCheck(request).then(function(response){
//					var errFlg = false;
//					var rowIdx = -1;
//					for (var i = 0; i < response.status.listStatus.length; i++) {
//				      if (response.status.listStatus[i].status.statusCode == 5){
//				    	  gridOptionMessageControl.show($scope.gridOptions, "tagType", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
//				    	  gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//				    	  directiveControl.firstErrorOnFocus('searchinputform');
//				    	  errFlg = true;
//					  // [ON推-品向-968] データ種別名称の辞書マスタ存在チェックを削除 2015.10.05 kawana
//					  } else if (response.status.listStatus[i].status.statusCode == 7){
//				    	  gridOptionMessageControl.show($scope.gridOptions, "slipClientZipCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
//				    	  gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//				    	  directiveControl.firstErrorOnFocus('searchinputform');
//				    	  errFlg = true;
//					  }
//				      if (errFlg && rowIdx == -1) {
//				    	  rowIdx = i;
//				      }
//					}
//
//					if (errFlg == true) {
//						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIdx);
//						directiveControl.firstErrorOnFocus('searchinputform');
//						return;
//					}
//
//					// 処理結果確認
//					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
//						return;
//					}
//
//					// ヤマト送り状マスタデータ登録または更新
//					api.carrierSlipYmtList.register(request).then(function(response){
//						// 処理結果確認
//						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
//							return;
//						}
//
//						// 初期化
//						$scope.initScreenHttp();
//
//						owsCommon.toggleSelectAll($scope.gridOptions, false);
//					});
//				});
//			});
//		},
//		// エラー時の処理
//		function(){
//			owsCommon.syncExec(function() {
//				// 空行の検証機能を再開
//				gridDirectiveControl.validity($scope.gridOptions, true);
//				// 最初のエラーにフォーカス
//				directiveControl.firstErrorOnFocus('searchinputform');
//			});
//		});
//	};
//	2016.03.05 Zhang 一覧編集 ※4 End

	// 2016.02.23 Zhang 一覧編集 ※4 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#gridDblClick
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#copy
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * コピボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function(){
		// ヤマト送り状マスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/CarrierSlipYmtMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("carrierSlipYmtId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierSlipYmtId).search("centerCd", $scope.carrierSlipYmtMasterSearch.mcenter.centerCd);
	};
	// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * ヤマト送り状マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.initNew = function(){
		// ヤマト送り状マスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/CarrierSlipYmtMasterEdit").search({}).search("mode", SCREEN_MODE.Register).search("centerCd", $scope.carrierSlipYmtMasterSearch.mcenter.centerCd);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * ヤマト送り状マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.update = function(){
		// ヤマト送り状マスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/CarrierSlipYmtMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("carrierSlipYmtId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierSlipYmtId).search("centerCd", $scope.carrierSlipYmtMasterSearch.mcenter.centerCd);
	};
	// 2016.02.23 Zhang 一覧編集 ※4 End


	//画面初期化処理を実行
	$scope.initScreen();

}]);
