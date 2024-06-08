/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipSgwMaster
 *
 * @description
 * 佐川送り状マスタ画面
 */
angular.module('oneslogiWms.CarrierSlipSgwMaster',[])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipSgwMaster.service:CarrierSlipSgwMasterApi
 *
 * @description
 * 佐川送り状マスタWebApi定義<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/master/CarrierSlipSgwMaster/init 初期化用WebApi<br>
 * ・resources/master/CarrierSlipSgwMaster/search 検索用WebApi<br>
 * ・resources/master/CarrierSlipSgwMaster/inputCheck 入力チェック用WebApi<br>
 * ・resources/master/CarrierSlipSgwMaster/register 登録用WebApi<br>
 *
 */
.factory('CarrierSlipSgwMasterApi', ['AngularAPIClient', function(AngularAPIClient) {
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
		carrierSlipSgwList: AngularAPIClient.make(
			[
			    ['init',   'GET', 'resources/master/carrierSlipSgwMaster/init'],
			    ['fileUpload',  'POST',  'resources/master/carrierSlipSgwMaster/fileUpload'],
			    ['search', 'GET', 'resources/master/carrierSlipSgwMaster/search'],
			    ['excel',  'GET', 'resources/master/carrierSlipSgwMaster/search', 'excel'],
			    ['inputCheck', 'POST', 'resources/master/carrierSlipSgwMaster/inputCheck'],
			    ['register', 'POST', 'resources/master/carrierSlipSgwMaster/register'],
			    ['getMasterData', 'GET', 'resources/master/carrierSlipSgwMaster/getMasterData']
			]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.carrierSlipSgwMaster.object:carrierSlipSgwMaster
 *
 * @description
 * 佐川送り状マスタ画面コントローラ
 */
.controller('CarrierSlipSgwMaster', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo','modalFactory', 'CarrierSlipSgwMasterApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.carrierSlipSgwListCols =
		[
			{field:"centerId", displayName:"センタid"},
			{field:"tagType", displayName:"データ種別"},
			{field:"tagNm", displayName:"データ種別名称"},
			{field:"characterCd", displayName:"文字コード"},
			{field:"slipCustomerCd", displayName:"お客様コード"},
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/08 HDIS Start
			{field:"webApiRequestUrl", displayName:"WebAPIリクエストURL"},
			{field:"customerId", displayName:"カスタマーID"},
			// [Ver２．１向けエンハンス] 荷札出力対応 C-CWMS-0058 2016/07/08 HDIS End
			{field:"deptConsignorNm", displayName:"部署・担当者"},
			{field:"consignorTelNo", displayName:"荷送人電話番号"},
			{field:"slipClientTelNo", displayName:"ご依頼主電話番号"},
			{field:"slipClientZipCd", displayName:"ご依頼主郵便番号"},
			{field:"slipClientAddress1", displayName:"ご依頼主住所1"},
			{field:"slipClientAddress2", displayName:"ご依頼主住所2"},
			{field:"slipClientNm1", displayName:"ご依頼主名称1"},
			{field:"slipClientNm2", displayName:"ご依頼主名称2"},
			{field:"slipShapeCd", displayName:"荷姿コード"},
			{field:"slipItemNm1", displayName:"品名1"},
			{field:"slipItemNm2", displayName:"品名2"},
			{field:"slipItemNm3", displayName:"品名3"},
			{field:"slipItemNm4", displayName:"品名4"},
			{field:"slipItemNm5", displayName:"品名5"},
			{field:"transportTypeSpeed", displayName:"便種(スピードで選択)"},
			{field:"transportTypeItem", displayName:"便種(商品)"},
			{field:"settlementType", displayName:"決済種別"},
			{field:"sealType1", displayName:"指定シール1"},
			{field:"sealType2", displayName:"指定シール2"},
			{field:"sealType3", displayName:"指定シール3"},
			{field:"codCls", displayName:"元着区分"},
			//[ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73] 対応 2016.11.07 nayzaw start
			{field:"sendCd", displayName:"発店CD"},
			{field:"apiOkuriCode", displayName:"WebAPI送り状コード"},
			{field:"apiBinsyuCode", displayName:"WebAPI便種コード"},
			{field:"apiDaibikiFlg", displayName:"WebAPI代引フラグ"},
			{field:"apiDaibikiType", displayName:"WebAPI代引支払方法区分"},
			{field:"apiWeightCd1", displayName:"WebAPI重量コード1"},
			{field:"apiWeightCd2", displayName:"WebAPI重量コード2"},
			{field:"apiEidomeFlg", displayName:"WebAPI営止フラグ"},
			{field:"delFlg", displayName:"削除フラグ"},
			//荷主センタ変更対応 201７.02.21 sja Start
			 {field:"mcenter.centerCd", displayName:"センタCD"},
			 {field:"mcenter.centerNm", displayName:"センタ名称"}
			//荷主センタ変更対応 201７.02.21 sja End
			//[ONEsLOGI Cloud/WMS バグ・品質向上対策 バグ #73] 対応 2016.11.07 nayzaw end
		];

//	2016.03.08 Zhang 一覧編集 ※4 Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#showZip
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 郵便番号検索ボタン押下処理<br>
//	 *
//	 * 検索画面を表示し、選択された郵便番号の情報を取得し画面項目に反映する。
//	 */
//	$scope.showZip = function(rowIndex){
//
//		var items = {
//			zipCd: $scope.carrierSlipSgwList[rowIndex].slipClientZipCd
//		};
//		//マスタのモーダル画面を表示
//		var modalInstance = modalFactory.modalZip(items);
//
//		// モーダル画面が閉じられたら呼ばれるファンクションの登録
//		modalInstance.result.then(function(selectedItem){
//			$scope.carrierSlipSgwList[rowIndex].slipClientZipCd =  selectedItem.zipCd;
//			if((($scope.carrierSlipSgwList[rowIndex].slipClientAddress1 == null)||($scope.carrierSlipSgwList[rowIndex].slipClientAddress1 == ""))&&
//					(($scope.carrierSlipSgwList[rowIndex].slipClientAddress2 == null)||($scope.carrierSlipSgwList[rowIndex].slipClientAddress2 == ""))){
//				$scope.carrierSlipSgwList[rowIndex].slipClientAddress1 =  selectedItem.address1;
//				if (selectedItem.address2 != null || selectedItem.address3 != null) {
//					$scope.carrierSlipSgwList[rowIndex].slipClientAddress2 =  selectedItem.address2 + selectedItem.address3;
//				}
//			};
//		});
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.carrierSlipSgwListBulkInput.object:carrierSlipSgwListBulkInput#zipCdBlur
//	 * @methodOf oneslogiWms.carrierSlipSgwListBulkInput.object:carrierSlipSgwListBulkInput
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
//		var zipCd = $scope.carrierSlipSgwList[rowIndex].slipClientZipCd;
//
//		if((($scope.carrierSlipSgwList[rowIndex].slipClientAddress1 == null)||($scope.carrierSlipSgwList[rowIndex].slipClientAddress1 == ""))&&
//				(($scope.carrierSlipSgwList[rowIndex].slipClientAddress2 == null)||($scope.carrierSlipSgwList[rowIndex].slipClientAddress2 == ""))){
//
//			if (zipCd && 0 < zipCd.length) {
//				var request = {};
//				request.zipCd = zipCd;
//
//				api.zip.record(request).then(function(response){
//
//					if (response.data.mZip.address1 != null) {
//						$scope.carrierSlipSgwList[rowIndex].slipClientAddress1 =  response.data.mZip.address1;
//					}
//
//					if (response.data.mZip.address2 != null || response.data.mZip.address3 != null) {
//						$scope.carrierSlipSgwList[rowIndex].slipClientAddress2 =  response.data.mZip.address2 + response.data.mZip.address3;
//					}
//				});
//			}
//		};
//	};
//	2016.03.08 Zhang 一覧編集 ※4 End

    /**
     * @ngdoc method
     * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#initScreen
     * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono Start
		$scope.pagingOptions.setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.28 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'carrierSlipSgwList',
			columnDefs: 'carrierSlipSgwListCols',
			pagingOptions : $scope.pagingOptions
		});
//		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
//			data: 'carrierSlipSgwList',
//			columnDefs: 'carrierSlipSgwListCols',
//		});
//		2016.02.18 Pan ページング ※3 End

//		2016.03.08 Zhang 一覧編集 ※4 Start
//		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
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
//				"slipShapeCd" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "slipShapeCdList"
//				},
//				"transportTypeSpeed" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "transportTypeSpeedList"
//				},
//				"transportTypeItem" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "transportTypeItemList"
//				},
//				"settlementType" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "settlementTypeList"
//				},
//				"sealType1" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "sealType1List"
//				},
//				"sealType2" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "sealType2List"
//				},
//				"sealType3" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "sealType3List"
//				},
//				"codCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "codClsList"
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
//				"slipCustomerCd":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"deptConsignorNm":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"consignorTelNo":{
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
//				"slipClientNm1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipClientNm2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipShapeCd":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm3":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm4":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"slipItemNm5":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"transportTypeSpeed":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"transportTypeItem":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"settlementType":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex)"
//					}
//				},
//				"sealType1":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex);checkSameType(row)"
//					}
//				},
//				"sealType2":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex);checkSameType(row)"
//					}
//				},
//				"sealType3":{
//					"ng-change":{
//						eventFunction:"itemBlur(row.rowIndex);checkSameType(row)"
//					}
//				},
//				"codCls":{
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
//
//		// グリッドの郵便番号列にボタンを設定1
//		$scope.gridButtonOptions = {
//				"slipClientZipCd":{
//					clickFunction:"showZip(row.rowIndex)"
//				}
//		};
//		2016.03.08 Zhang 一覧編集 ※4 End

		// Excelアップロード設定
		var uploadParam = owsCommon.getInputOptions($scope.gridOptions, "carrierSlipSgwList");

		$scope.fileOptions = {
				acceptFileTypes : /(\.|\/)(xls|xlsx)$/i,
				formData : uploadParam
		};

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#initScreenHttp
     * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
//2016.03.08 Zhang 一覧編集 ※4 Start
//				 $scope.deferredGetDelFlg(),
//				 $scope.deferredGetCharacterCd(),
//				 $scope.deferredSlipShapeCd(),
//				 $scope.deferredTransportTypeSpeed(),
//				 $scope.deferredTransportTypeItem(),
//				 $scope.deferredSettlementType(),
//				 $scope.deferredSealType1(),
//				 $scope.deferredSealType2(),
//				 $scope.deferredSealType3(),
//				 $scope.deferredCodCls()
//	2016.03.08 Zhang 一覧編集 ※4 End
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
	};

	//2016.03.08 Zhang 一覧編集 ※4 Start
//	$scope.itemBlur = function(rowIndex) {
//		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#checkSameType
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 指定シール1又は指定シール2と同じ内容では無いかチェック。<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.checkSameType = function(row) {
//		var flg = false;
//		// すべて入力しない場合、チェックしない。
//		if ((row.entity.sealType1 == null || row.entity.sealType1 == "")
//				&& (row.entity.sealType2 == null || row.entity.sealType2 == "")
//				&& (row.entity.sealType3 == null || row.entity.sealType3 == "")) {
//			return false;
//		}
//
//		gridOptionMessageControl.hide($scope.gridOptions, "sealType1", row.rowIndex);
//		gridOptionMessageControl.hide($scope.gridOptions, "sealType2", row.rowIndex);
//		gridOptionMessageControl.hide($scope.gridOptions, "sealType3", row.rowIndex);
//
//		if (row.entity.sealType1 == row.entity.sealType2
//				&& (row.entity.sealType1 != null && row.entity.sealType1 != "")){
//			// エラーメッセージCD
//			var messageCd = "sealTypeDuplicateError";
//			gridOptionMessageControl.show($scope.gridOptions, "sealType2", $filter('owfMessage')(messageCd), row.rowIndex);
//			gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, row.rowIndex);
//			flg = true;
//		}
//		if ((row.entity.sealType1 == row.entity.sealType3 && row.entity.sealType1 != null && row.entity.sealType1 != "")
//				|| (row.entity.sealType2 == row.entity.sealType3 && row.entity.sealType2 != null && row.entity.sealType2 != "")){
//			// エラーメッセージCD
//			var messageCd = "sealTypeDuplicateError";
//			gridOptionMessageControl.show($scope.gridOptions, "sealType3", $filter('owfMessage')(messageCd), row.rowIndex);
//			gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, row.rowIndex);
//			flg = true;
//		}
//		return flg;
//	};

//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredGetDelFlg
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
//		api.dropdownList.query(request).then(function(response){
//			$scope.delFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredGetCharacterCd
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
//		api.dropdownList.query(request).then(function(response){
//			$scope.characterCdList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSlipShapeCd
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 荷姿コード取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSlipShapeCd = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SLIP_SHAPE_CD";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.slipShapeCdList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredTransportTypeSpeed
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 便種(スピードで選択)取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredTransportTypeSpeed = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "TRANSPORT_TYPE_SPEED";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.transportTypeSpeedList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredTransportTypeItem
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 便種(商品)取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredTransportTypeItem = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "TRANSPORT_TYPE_ITEM";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.transportTypeItemList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSettlementType
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 決済種別取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSettlementType = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SETTLEMENT_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.settlementTypeList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSealType1
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 指定シール取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSealType1 = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SEAL_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.sealType1List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSealType2
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 指定シール取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSealType2 = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SEAL_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.sealType2List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredSealType3
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 指定シール取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredSealType3 = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "SEAL_TYPE";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.sealType3List = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
//	 /**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredCodCls
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 元着区分取得・設定処理（同期可能）<br>
//	 *
//	 * サーバとの通信を行い、取得結果を画面項目に反映する。
//	 */
//	$scope.deferredCodCls = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "COD_CLS";
//
//		api.dropdownList.query(request).then(function(response){
//			$scope.codClsList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};
	//2016.03.08 Zhang 一覧編集 ※4 End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 佐川送り状マスタ初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.carrierSlipSgwList.init().then(function(response){
			$scope.carrierSlipSgwMasterSearch = response.data.carrierSlipSgwMasterSearch;
			$scope.carrierSlipSgwList = response.data.carrierSlipSgwList;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			// ログイン情報より初期値を設定
			$scope.carrierSlipSgwMasterSearch.mcenter.centerCd = userInfo.centerCd;
//			$scope.carrierSlipSgwMasterSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
//			2016.02.18 Pan ページング ※3 Start
			$scope.paging = response.paging;

			// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.28 ono Delete

//			2016.02.18 Pan ページング ※3 End
			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.carrierSlipSgwMasterSearch = owsHistory.popState();
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
     * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#search
     * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#getSearchData
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.carrierSlipSgwMasterSearch = $scope.carrierSlipSgwMasterSearch;
//		2016.02.18 Pan ページング ※3 Start
		owsCommon.setPagingData(request, $scope.paging, pageSize, page);
//		2016.02.18 Pan ページング ※3 End
		api.carrierSlipSgwList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#setSearchData
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
		$scope.carrierSlipSgwList = response.data.carrierSlipSgwList;
		//2016.03.08 Zhang 一覧編集 ※4 Start
		//既存行のキー項目が変更不可
//		for (var row = 0; row < $scope.carrierSlipSgwList.length; row++) {
//			if ($scope.carrierSlipSgwList[row].carrierSlipSgwId != null){
//				gridDirectiveControl.editable($scope.gridOptions, 'tagType', false, row);
//			}
//		}
		//2016.03.08 Zhang 一覧編集 ※4 End
//		2016.02.18 Pan ページング ※3 Start
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
//		2016.02.18 Pan ページング ※3 End
		//検索条件を履歴に保存
		owsHistory.replaceState($scope.carrierSlipSgwMasterSearch);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#getClassForRow
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#excelOutput
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.carrierSlipSgwMasterSearch = $scope.carrierSlipSgwMasterSearch;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "carrierSlipSgwList", document.title);

		api.carrierSlipSgwList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};
	// 2016.03.08 Zhang 一覧編集 ※4 Start
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#addRow
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
//	 *
//	 * @description
//	 * 行追加ボタン押下処理<br>
//	 *
//	 * グリッドの最終行の下に空行を追加する。
//	 */
//	$scope.addRow = function(){
//		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
//		$scope.carrierSlipSgwList.push(angular.copy($scope.blankRow));
//
//		// 削除フラグが使用不可
//		for (var row = 0; row < $scope.carrierSlipSgwList.length; row++) {
//			if ($scope.carrierSlipSgwList[row].tagType == null){
//				gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row);
//			}
//		}
//		// 行番号振り直し
//		updateRowNumber($scope.carrierSlipSgwList);
//
//	};
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#removeRow
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
//			if ($scope.carrierSlipSgwList.indexOf(row) > -1) {
//				if (row.carrierSlipSgwId != null) {
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
//		// 選択行削除
//		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
//			if ($scope.carrierSlipSgwList.indexOf(row) > -1) {
//				$scope.carrierSlipSgwList.splice($scope.carrierSlipSgwList.indexOf(row), 1);
//			}
//		});
//
//		// 行番号振り直し
//		updateRowNumber($scope.carrierSlipSgwList);
//
//		// ヘッダー行の選択
//		owsCommon.toggleSelectAll($scope.gridOptions, false);
//	};
//
//	// 行番号振り直し処理
//	var updateRowNumber = function(body) {
//		var i = 1;
//		angular.forEach(body, function(row) {
//			row.lineNo = i++;
//		});
//	};
//
//	// Excelアップロード前処理
//	$scope.excelBeforeUpload = function() {
//		$scope.fileOptions.url = "resources/master/carrierSlipSgwMaster/fileUpload";
//	}
//
//	// Excelアップロード
//	$scope.excelUploadSuccess = function(e, data) {
//
//		// 処理前にグリッドをクリアする。
//		$scope.carrierSlipSgwList = [];
//
//		owsCommon.syncExec(function() {
//
//			// 画面内容を引数に設定
//			var request = {};
//			request.data = {};
//			request.data.carrierSlipSgwMasterSearch = $scope.carrierSlipSgwMasterSearch;
//			request.data.carrierSlipSgwList        = data.result.data.carrierSlipSgwList;
//
//			// マスタ取得
//			api.carrierSlipSgwList.getMasterData(request).then(function(response){
//				// 取得データセット
//				$scope.carrierSlipSgwList = response.data.carrierSlipSgwList;
//
//				// セット行ループ
//				for (var row = 0; row < $scope.carrierSlipSgwList.length; row++) {
//
//					// 既存行のキー項目が変更不可
//					if ($scope.carrierSlipSgwList[row].carrierSlipSgwId != null){
//						gridDirectiveControl.editable($scope.gridOptions, 'tagType', false, row);
//					}else{
//						gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, row); // delFlg編集不可
//					}
//				}
//
//				// 行番号振り直し
//				updateRowNumber($scope.carrierSlipSgwMaster);
//
//				owsCommon.syncExec(function() {
//					// 選択状態にする
//					if ($scope.carrierSlipSgwList.length > 0){
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
//
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#register
//	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
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
//		if($scope.carrierSlipSgwList.length == 0){
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
//		for (var row = 0; row < $scope.carrierSlipSgwList.length; row++) {
//			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//				// 空行を退避
//				emptyBody.push($scope.carrierSlipSgwList[row]);
//			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
//				// 未選択行への検証機能を解除
//				gridDirectiveControl.validity($scope.gridOptions, false, row);
//				// 未選択行を退避
//				emptyBody.push($scope.carrierSlipSgwList[row]);
//			}else {
//				// 空行以外を退避
//				listBody.push($scope.carrierSlipSgwList[row]);
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
//				// [ON推-品向-887] 重複チェック動作異常を修正(不要な削除) 2015.07.28 kawana
//
//				// 行番号振り直し
//				updateRowNumber($scope.carrierSlipSgwList);
//
//				// センタIDとデータ種別重複チェック
//				var j = 0;
//				var rowIndex = new Array();
//				var errAry = new Array();
//				var allBodyNo = $scope.gridOptions.gridApi.grid.rows;
//				var sameSealType = false;
//
//				// センタID
//				var centerId = userInfo.centerId;
//
//				for (var row = 0; row < $scope.carrierSlipSgwList.length; row++) {
//					if (row <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[row]) == true)){
//						// データ種別
//						var tagType = $scope.carrierSlipSgwList[row].tagType;
//						for (var i = row+1; i < $scope.carrierSlipSgwList.length; i++) {
//							if (i <= allBodyNo.length && ($scope.gridOptions.getSelection(allBodyNo[i]) == true)){
//								// 重複
//								if ($scope.carrierSlipSgwList[i].tagType == tagType){
//									rowIndex[j] =i;
//									j++;
//								}
//							}
//						}
//
//						// 指定シール1又は指定シール2と同じ内容では無いかチェック
//						if ($scope.checkSameType(allBodyNo[row])) {
//							sameSealType = true;
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
//				if (sameSealType) {
//					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//					directiveControl.firstErrorOnFocus('searchinputform');
//					return ;
//				}
//
//				// [ON推-品向-887] 重複チェック動作異常を修正 2015.07.28 kawana Start
//				// 入力系グリッドのチェックを修正する
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.carrierSlipSgwList.splice($scope.carrierSlipSgwList.indexOf(row), 1);
//				});
//				// [ON推-品向-887] 重複チェック動作異常を修正 2015.07.28 kawana End
//
//				// 画面内容を引数に設定
//				var request = {};
//				request.data = {};
//				request.data.carrierSlipSgwList = listBody;
//				request.data.carrierSlipSgwMasterSearch = $scope.carrierSlipSgwMasterSearch;
//
//				// 入力チェック
//				api.carrierSlipSgwList.inputCheck(request).then(function(response){
//					var errFlg = false;
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
//					}
//
//					if (errFlg == true) {
//						return;
//					}
//
//					// 処理結果確認
//					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
//						return;
//					}
//
//					// 佐川送り状マスタデータ登録または更新
//					api.carrierSlipSgwList.register(request).then(function(response){
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

//	2016.03.08 Zhang 一覧編集 ※4 End

	// 2016.03.08 Zhang 一覧編集 ※4 Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#gridDblClick
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		    owsCommon.syncButtonExec("update", row);
	  };

	// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#copy
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * コピーボタン押下処理<br>
	 *
	 * 一覧で選択されているデータの情報を設定し、編集画面を表示する。
	 */
	$scope.copy = function(){
		// 佐川送り状マスタメンテナンス(編集)画面へ遷移
		// 荷主センタ変更対応 2017.03.13 sja Start
		//$location.path("wms/master/CarrierSlipSgwMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("carrierSlipSgwId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierSlipSgwId).search("centerCd",$scope.carrierSlipSgwMasterSearch.mcenter.centerCd);
		$location.path("wms/master/CarrierSlipSgwMasterEdit").search({}).search("mode", SCREEN_MODE.Copy).search("carrierSlipSgwId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierSlipSgwId).search("centerCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd);
		// 荷主センタ変更対応 2017.03.13 sja End
	};
	// コピー機能追加 佐川送り状マスタ画面修正 2016.07.26 Lin Zar Ni Myint Add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#showZipEdit
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * ヤマト送り状マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.initNew = function(){
		// ヤマト送り状マスタメンテナンス(編集)画面へ遷移
		// 荷主センタ変更対応 2017.03.13 sja Start
		//$location.path("wms/master/CarrierSlipSgwMasterEdit").search({}).search("mode", SCREEN_MODE.Register).search("centerCd", $scope.carrierSlipSgwMasterSearch.mcenter.centerCd);
		$location.path("wms/master/CarrierSlipSgwMasterEdit").search({}).search("mode", SCREEN_MODE.Create).search("centerCd", $scope.carrierSlipSgwMasterSearch.mcenter.centerCd);
		// 荷主センタ変更対応 2017.03.13 sja End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster#update
	 * @methodOf oneslogiWms.CarrierSlipSgwMaster.object:CarrierSlipSgwMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * ヤマト送り状マスタメンテナンス(編集)画面を表示する。
	 */
	$scope.update = function(){
		// ヤマト送り状マスタメンテナンス(編集)画面へ遷移
		// 荷主センタ変更対応 2017.03.13 sja Start
		//$location.path("wms/master/CarrierSlipSgwMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("carrierSlipSgwId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierSlipSgwId).search("centerCd", $scope.carrierSlipSgwMasterSearch.mcenter.centerCd);
		$location.path("wms/master/CarrierSlipSgwMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("carrierSlipSgwId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].carrierSlipSgwId).search("centerCd",$scope.gridOptions.gridApi.selection.getSelectedRows()[0].mcenter.centerCd);
		// 荷主センタ変更対応 2017.03.13 sja End
	};
	// 2016.03.08 Zhang 一覧編集 ※4 End

	//画面初期化処理を実行
	$scope.initScreen();

}]);
