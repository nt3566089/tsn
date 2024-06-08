/**
 * @ngdoc overview
 * @name oneslogiWms.CenterMasterEdit
 *
 * @description
 * センタマスタメンテナンス(編集)画面<br>
 *
 */
angular.module('oneslogiWms.CenterMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CenterMasterEdit.service:CenterMasterEditApi
 *
 * @description
 * センタマスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * deliveryCourse 配送コースデータ操作用WebAPI<br>
 * ・resources/common/deliveryCourse/record 単一行データ取得WebAPI<br>
 * <br>
 * 区分値データ操作用WebApi
 * ・resources/common/centerClass/keyValueList
 * <br>
 * カルチャ操作用WebApi
 * ・resources/common/cultureCD/cultureList
 * <br>
 * タイムゾーン操作用WebApi
 * ・resources/common/timeZone/keyValueList
 * <br>
 * centerMasterEdit センタマスタデータ操作用WebApi<br>
 * ・resources/master/centerMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/centerMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/centerMasterEdit/inputCheckRegister 登録前入力チェックWebAPI<br>
 * ・resources/master/centerMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/centerMasterEdit/inputCheckUpdate 更新前入力チェックWebAPI<br>
 * ・resources/master/centerMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('centerMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		clientList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/clientCd/query']
				 ]
		),
		// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu Start
		culture: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/cultureCD/cultureList']
				 ]
		),
		timeZone: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/timeZone/keyValueList']
				 ]
		),
		// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu End
		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
		shapeList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/shapeCD/query']
				 ]
		),
		wareHouseList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/warehouseCd/keyValueList'],
				 ]
		),
		zoneList: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/zone/keyValueList']
				 ]
		),
		boxGrpList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/boxGrpCd/keyValueList']
				 ]
		),
		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
		centerMasterEdit: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/centerMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/centerMasterEdit/initUpdate'],
				 ['searchPagging',         'GET',  'resources/master/centerMasterEdit/searchPagging'],
				 ['inputCheck',         'POST', 'resources/master/centerMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/centerMasterEdit/register'],
				 ['update',             'POST', 'resources/master/centerMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
 *
 * @description
 * センタマスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CenterMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'centerMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	$scope.centerMasterEditCols = [
	                               {field:"mclient.clientCd", displayName:"荷主CD"},
	                               {field:"mparamAsOne.mdeliveryCourse.deliveryCourseCd", displayName:"配送コースCD"},
	                               {field:"mparamAsOne.mdeliveryCourse.deliveryCourseNm", displayName:"配送コース名称"},
	                               {field:"mparamAsOne.storeNoFlg", displayName:"入庫No.管理フラグ"},
	                               {field:"mparamAsOne.mergeCls", displayName:"入庫No.マージ区分"},
	                               {field:"mparamAsOne.tkeepingDays", displayName:"トランザクション保持期間"},
	                               {field:"mparamAsOne.hkeepingDays", displayName:"履歴保持期間"},
	                               {field:"mparamAsOne.dkeepingDays", displayName:"削除保持期間"},
	                               {field:"delFlg", displayName:"削除フラグ"}
	                               ];


	var bodyList;
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#initScreen
	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
		// センタID
		$scope.centerId = $route.current.params.mcenterId;
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End

//		// 荷主リストの設定
//		$scope.clientList = userInfo.clientList;

		//ページングの設定
		$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 ono Start
		var setPageData = function() {
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};
		$scope.pagingOptions.setPageData = setPageData;
		$scope.pagingOptions.setPageDataWhenPageSizeChanged = setPageData;
		// [#6915][OSS] ページ変更時の動作をページングの設定に追加 2019.11.29 ono End

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergePagingSingleSelectGridOptions({
			data: 'centerMasterEdit',
			columnDefs: 'centerMasterEditCols',
			pagingOptions : $scope.pagingOptions
		});

//		$scope.gridButtonOptions = {
//				"mparamAsOne.mdeliveryCourse.deliveryCourseCd":{
//					clickFunction:"showDeliveryCourse(row.rowIndex)"
//				}
//		};

//		$scope.gridEventOptions = {
//				"mparamAsOne.mdeliveryCourse.deliveryCourseCd":{
//					"ng-blur":{
//						eventFunction:"deliveryCourseCdBlur(row.rowIndex)"
//				// [検査-093] 選択欄にチェックが自動設定 2014.11.27 taoys Start
//					},
//					"ng-change":{
//						eventFunction:"deliveryCourseCdChange(row.rowIndex)"
//					}
//				},
//				"mclient.clientCd":{
//					"ng-change":{
//						eventFunction:"clientCdChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mdeliveryCourse.deliveryCourseNm":{
//					"ng-change":{
//						eventFunction:"deliveryCourseNmChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.storeNoFlg":{
//					"ng-change":{
//						eventFunction:"storeNoFlgChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mergeCls":{
//					"ng-change":{
//						eventFunction:"mergeClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.tkeepingDays":{
//					"ng-change":{
//						eventFunction:"tkeepingDaysChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.hkeepingDays":{
//					"ng-change":{
//						eventFunction:"hkeepingDaysChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.dkeepingDays":{
//					"ng-change":{
//						eventFunction:"dkeepingDaysChange(row.rowIndex)"
//					}
//				},
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana Start
//				"mparamAsOne.overStoreNumFlg":{
//					"ng-change":{
//						eventFunction:"overStoreNumFlgChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.pastStoreDtFlg":{
//					"ng-change":{
//						eventFunction:"pastStoreDtFlgChange(row.rowIndex)"
//					}
//				},
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana End
//				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
//				"mparamAsOne.allocSortKey1":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey2":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey3":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey4":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey5":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey6":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey7":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.allocSortKey8":{
//					"ng-change":{
//						eventFunction:"allocSortKeyChange(row.rowIndex)"
//					}
//				},
//				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
//
//				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
//				"mparamAsOne.storeDtFlg":{
//					"ng-change":{
//						eventFunction:"storeDtFlgChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mshapeByCaseShapeId.shapeCd":{
//					"ng-change":{
//						eventFunction:"shapeCdChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mshapeByBowlShapeId.shapeCd":{
//					"ng-change":{
//						eventFunction:"shapeCdChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mshapeByPieceShapeId.shapeCd":{
//					"ng-change":{
//						eventFunction:"shapeCdChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.multiPicCls":{
//					"ng-change":{
//						eventFunction:"multiPicClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.backetColNum":{
//					"ng-change":{
//						eventFunction:"backetColNumChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.backetRowNum":{
//					"ng-change":{
//						eventFunction:"backetRowNumChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.rgReplenishUnitCls":{
//					"ng-change":{
//						eventFunction:"rgReplenishUnitClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.emReplenishUnitCls":{
//					"ng-change":{
//						eventFunction:"emReplenishUnitClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mzone.mwarehouse.warehouseCd":{
//					"ng-change":{
//						eventFunction:"warehouseCdChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mzone.zoneCd":{
//					"ng-change":{
//						eventFunction:"zoneCdChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.emReplenishAllocCls":{
//					"ng-change":{
//						eventFunction:"emReplenishAllocClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.packingCalCls":{
//					"ng-change":{
//						eventFunction:"packingCalClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.packingProcessCls":{
//					"ng-change":{
//						eventFunction:"packingProcessClsChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.productPartPacking":{
//					"ng-change":{
//						eventFunction:"productPartPackingChange(row.rowIndex)"
//					}
//				},
//				"mparamAsOne.mboxGrp.boxGrpCd":{
//					"ng-change":{
//						eventFunction:"boxGrpCdChange(row.rowIndex)"
//					}
//				},
//				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
//				"delFlg":{
//					"ng-change":{
//						eventFunction:"delFlgChange(row.rowIndex)"
//					}
//				}
//			    // [検査-093] 選択欄にチェックが自動設定 2014.11.27 taoys End
//		};
		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		//[ON推-品向-290]明細の削除ドロップダウンリストにスペースは不要 2014.11.28 衛 Start
//		$scope.gridSelectOptions = {
//				"mclient.clientCd" : {
//					key : "clientCd",
//					value : "clientNm",
//					listModel : "clientList"
//				},
//				"mparamAsOne.storeNoFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "storeNoFlgList"
//				},
//				"mparamAsOne.mergeCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "mergeClsList"
//				},
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana Start
//				"mparamAsOne.overStoreNumFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "overStoreNumFlgList"
//				},
//				"mparamAsOne.pastStoreDtFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "pastStoreDtFlgList"
//				},
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana End
//				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
//				"mparamAsOne.allocSortKey1" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey2" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey3" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey4" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey5" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey6" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey7" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				"mparamAsOne.allocSortKey8" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "allocSortKeyList",
//					viewWithKey : false
//				},
//				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
//
//				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
//				"mparamAsOne.storeDtFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "storeDtFlgList"
//				},
//				"mparamAsOne.mshapeByCaseShapeId.shapeCd" : {
//					key : "shapeCd",
//					value : "shapeNm",
//					listModel : "setGridShapeList(row.rowIndex)"
//				},
//				"mparamAsOne.mshapeByBowlShapeId.shapeCd" : {
//					key : "shapeCd",
//					value : "shapeNm",
//					listModel : "setGridShapeList(row.rowIndex)"
//				},
//				"mparamAsOne.mshapeByPieceShapeId.shapeCd" : {
//					key : "shapeCd",
//					value : "shapeNm",
//					listModel : "setGridShapeList(row.rowIndex)"
//				},
//				"mparamAsOne.multiPicCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "multiPicClsList"
//				},
//				"mparamAsOne.rgReplenishUnitCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "rgReplenishUnitClsList"
//				},
//				"mparamAsOne.emReplenishUnitCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "emReplenishUnitClsList"
//				},
//				"mparamAsOne.mzone.mwarehouse.warehouseCd" : {
//					key : "warehouseCd",
//					value : "warehouseNm",
//					listModel : "warehouseList"
//				},
//				"mparamAsOne.mzone.zoneCd" : {
//					key : "zoneCd",
//					value : "zoneNm",
//					listModel : "setGridZoneList(row.rowIndex)"
//				},
//				"mparamAsOne.emReplenishAllocCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "emReplenishAllocClsList"
//				},
//				"mparamAsOne.packingCalCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "packingCalClsList"
//				},
//				"mparamAsOne.packingProcessCls" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "packingProcessClsList"
//				},
//				"mparamAsOne.productPartPacking" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "productPartPackingList"
//				},
//				"mparamAsOne.mboxGrp.boxGrpCd" : {
//					key : "boxGrpCd",
//					value : "boxGrpNm",
//					listModel : "boxGrpList"
//				},
//
//				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
//				"delFlg" : {
//					key : "classCd",
//					value : "classNm",
//					listModel : "delFlgList",
//					removeBlank:"null"
//				}
//		};
		//[ON推-品向-290]明細の(削除と外貨)ドロップダウンリストにスペースは不要 2014.11.28 衛 End
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mclient.clientCd",8, 3);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.tkeepingDays",8, 5);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mdeliveryCourse.deliveryCourseCd",8, 7);

		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mshapeByCaseShapeId.shapeCd",8, 9);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mshapeByBowlShapeId.shapeCd",8, 10);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mshapeByPieceShapeId.shapeCd",8, 11);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mzone.mwarehouse.warehouseCd",8, 12);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mzone.zoneCd",8, 13);
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "mparamAsOne.mboxGrp.boxGrpCd",8, 14);
		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all(
				[
				 $scope.deferredGetDelFlg(),
				 // [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu Start
				 $scope.deferredGetCulture(),
				 $scope.deferredGetTimeZone()
				 // [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu End
//				 $scope.deferredGetClientList(),
//				 $scope.deferredGetStoreNoFlg(),
//				 $scope.deferredGetMergeCls(),
//				 // [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
//				 $scope.deferredGetAllocSortKey(),
//				 // [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana Start
//				 $scope.deferredGetOverStoreNumFlg(),
//				 $scope.deferredGetPastStoreDtFlg(),
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana End
//
//				 // [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
//				 $scope.deferredGetStoreDtFlg(),
//				 $scope.deferredGetMultiPicCls(),
//				 $scope.deferredGetReplenishUnitCls(),
//				 $scope.deferredGetWarehouseCd(),
//				 $scope.deferredGetEmReplenishAllocCls(),
//				 $scope.deferredGetPackingCalCls(),
//				 $scope.deferredGetPackingProcessCls(),
//				 $scope.deferredGetProductPartPacking(),
//				 $scope.deferredGetBoxGrpList(),
//				 // [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};


	$scope.showDeliveryCourse = function(rowIndex){

		var items = {
				centerCd: $scope.head.centerCd,
				deliveryCourseCd: $scope.centerMasterEdit[rowIndex].mparamAsOne.mdeliveryCourse.deliveryCourseCd
		};

		// 配送コースのモーダル画面を表示
		var modalInstance = modalFactory.modalDeliveryCourse(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.centerMasterEdit[rowIndex].mparamAsOne.mdeliveryCourse.deliveryCourseCd =  selectedItem.deliveryCourseCd;
			$scope.centerMasterEdit[rowIndex].mparamAsOne.mdeliveryCourse.deliveryCourseNm =  selectedItem.deliveryCourseNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#deliveryCourseBlur
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 配送コースコードのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deliveryCourseCdBlur = function(rowIndex) {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.centerMasterEdit[rowIndex].mparamAsOne.mdeliveryCourse.deliveryCourseCd;

		if (deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			request.centerId = $scope.head.centerId
			request.deliveryCourseCd = deliveryCourseCd;

			api.deliveryCourse.record(request).then(function(response){
				$scope.centerMasterEdit[rowIndex].mparamAsOne.mdeliveryCourse.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;

			});

		} else {
			$scope.centerMasterEdit[rowIndex].mparamAsOne.mdeliveryCourse.deliveryCourseNm = null;
		}
	};
	// [検査-093] 選択欄にチェックが自動設定 2014.11.27 taoys Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#DeliveryCourseChange
	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
	 *
	 * @description
	 * 荷主CDのロストフォーカス処理<br>
	 * 荷主CDと配送コースCDと配送コース名称と入庫No.管理フラグと入庫No.マージ区分とトランザクション保持期間と履歴保持期間と削除保持期間と削除フラグロストフォーカス時の処理。
	 */
	$scope.deliveryCourseCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.clientCdChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
		$scope.centerMasterEdit[rowIndex].mparamAsOne.mshapeByCaseShapeId.shapeCd = null;
		$scope.centerMasterEdit[rowIndex].mparamAsOne.mshapeByBowlShapeId.shapeCd = null;
		$scope.centerMasterEdit[rowIndex].mparamAsOne.mshapeByPieceShapeId.shapeCd = null;
		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End
	};
	//  米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	$scope.packingSlipAutoOutputFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	//  米国出荷ドキュメント追加対応 2018.01.07 PYM End
	//  キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
	$scope.cesIntegrationFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	//  キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End
	$scope.deliveryCourseNmChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.storeNoFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.mergeClsChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.tkeepingDaysChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.hkeepingDaysChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.dkeepingDaysChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana Start
	$scope.overStoreNumFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.pastStoreDtFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana End
	// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
	$scope.allocSortKeyChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
	$scope.delFlgChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
    // [検査-093] 選択欄にチェックが自動設定 2014.11.27 taoys End

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
	$scope.storeDtFlgChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.shapeCdChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.multiPicClsChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.backetColNumChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.backetRowNumChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.rgReplenishUnitClsChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.emReplenishUnitClsChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.warehouseCdChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.centerMasterEdit[rowIndex].mparamAsOne.mzone.zoneCd = null;
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.zoneCdChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.emReplenishAllocClsChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.packingCalClsChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.packingProcessClsChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.productPartPackingChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.boxGrpCdChange = function(rowIndex) {
		// ゾーン選択状態をクリア
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End


	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMaster#clientNmBlur
	 * @methodOf oneslogiWms.clientMaster.object:clientMaster
	 *
	 * @description
	 * センタ名称のロストフォーカス処理<br>
	 *
	 * センタ名称ロストフォーカス時、 センタ略称未入力の場合、 センタ名称をコピーする。
	 */
	$scope.centerNmBlur = function() {
		// 入力された センタ名称を取得
		var centerNm = $scope.head.centerNm;
		//  センタ略称を取得
		var centerAbbr = $scope.head.centerAbbr;

		if (centerNm && 0 < centerNm.length) {
			if (centerAbbr && 0 <centerAbbr.length) {
				return;
			}else{
				$scope.head.centerAbbr = centerNm;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
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
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetClientList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 *  荷主取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetClientList = function () {
		var deferred = $q.defer();

		var request = {};
		owsCommon.getDataCacheable(api.clientList, request).then(function(response){
			$scope.clientList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// 米国出荷ドキュメント追加対応 2018.01.07 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetPackingSlipAutoOutputFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * 納品明細書自動発行フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingSlipAutoOutputFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_SLIP_AUTO_OUTPUT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.packingSlipAutoOutputFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// 米国出荷ドキュメント追加対応 2018.01.07 PYM End

	//キャリアEDIシステム(CES)連携対応 2018.01.07 PYM Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit#deferredGetCesIntegrationFlg
	 * @methodOf oneslogiWms.ParameterMasterEdit.object:ParameterMasterEdit
	 *
	 * @description
	 * CES連携フラグリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCesIntegrationFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CES_INTEGRATION_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.cesIntegrationFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	//キャリアEDIシステム(CES)連携対応 2018.01.07 PYM End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetStoreNoFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 入庫No.管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStoreNoFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STORE_NO_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.storeNoFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetMergeCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 入庫No.マージ区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMergeCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MERGE_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.mergeClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetAllocSortKey
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 引当ソートキーの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetAllocSortKey = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ALLOC_SORT_KEY";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.allocSortKeyList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End

	// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetOverStoreNumFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 過入荷可フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetOverStoreNumFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "OVER_STORE_NUM_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.overStoreNumFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetPastStoreDtFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 過去日入力可フラグの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPastStoreDtFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PAST_STORE_DT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.pastStoreDtFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana End


	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetStoreDtFlg
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 入庫日管理区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetStoreDtFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "STORE_DT_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.storeDtFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetShapeList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 荷姿の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShapeList = function (clientCd) {
		var deferred = $q.defer();

		var request = {};
		var result = {};
		request.clientCd = clientCd;
		result.clientCd = clientCd;
		owsCommon.getDataCacheable(api.shapeList, request).then(function(response){
			$scope.shapeList = response.data;
			result.shapeList = response.data;
			deferred.resolve(result);
		});

		return deferred.promise;
	};

	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetCulture
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * カルチャ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCulture = function () {
		var deferred = $q.defer();
		var request = {};
		api.culture.keyValueList(request).then(function(response){
			$scope.cultureList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetTimeZone
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * タイムゾーン取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTimeZone = function () {
		var deferred = $q.defer();
		var request = {};
		api.timeZone.keyValueList(request).then(function(response){
			$scope.timeZoneList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// カルチャリスト再設定処理
	var setCultureList = function(bCulture) {
		if(bCulture) {
			$scope.head.cultureCd = bCulture.cultureCd;
		}
	};

	// タイムゾーンリスト再設定処理
	var setTimeZoneList = function(bTimeZone) {
		if(bTimeZone) {
			$scope.head.timeZoneCd = bTimeZone.timeZoneCd;
		}
	};
	// [Ver3.0][#3267] カルチャ、タイムゾーンのドロップダウン追加 2018.01.04 shimizu End

	/**
	 * 荷主毎の荷姿リスト
	 */
	var shapeListMap = {};

	/**
	 * 検索エリアに設定された荷主ID、荷主リストから
	 * 荷姿リストを取得し内部変数に保存する
	 */
	var setShapeListMap = function(){

		var deferred = $q.defer();
		if (!$scope.clientList) {
			return;
		}
		var countGetShape = $scope.clientList.length + 1;
		// 荷姿リストの繰返
		for (var i = 0 ; i < $scope.clientList.length ; i++) {
			var clientCd = $scope.clientList[i].clientCd;
			if (!clientCd) {
				continue;
			}

			// 荷姿リストの取得(非同期)
			$scope.deferredGetShapeList(clientCd).then(function(response){

				// 取得したゾーンリストを保存
				if(!shapeListMap[response.clientCd]){
					shapeListMap[response.clientCd] = {};
				}

				shapeListMap[response.clientCd] = response.shapeList;

				countGetShape = countGetShape - 1;
				if(countGetShape <= 0) {
					// 全荷姿の取得完了
					deferred.resolve();
				}
			});
		}

		return deferred.promise;
	};

	/**
	 * グリッドの荷姿リストの設定
	 * 選択された荷主に従っての荷姿リストを設定する
	 */
	$scope.setGridShapeList = function(rowIndex) {

		var clientCd = $scope.centerMasterEdit[rowIndex].mclient.clientCd;
		if (!clientCd) {
			return null;
		}
		if (shapeListMap[clientCd]) {
			if (shapeListMap[clientCd]) {
				return shapeListMap[clientCd];
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetMultiPicCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * マルチピック計算区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMultiPicCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "MULTI_PIC_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.multiPicClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetReplenishUnitCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 補充単位区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReplenishUnitCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REPLENISH_UNIT_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.rgReplenishUnitClsList = response.data;
			$scope.emReplenishUnitClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetWarehouseCd
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 緊急補充倉庫の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseCd = function () {
		var deferred = $q.defer();

		var request = {};
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
		request.centerId = $scope.centerId;
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End

		if (request.centerId == null || request.centerId == ""){
			return;
		}
		owsCommon.getDataCacheable(api.wareHouseList, request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * センタ,倉庫毎のゾーンリスト
	 */
	var zoneListMap = {};

	/**
	 * センタ毎のゾーンリスト
	 */
	var zoneListMapCenter = {};

	/**
	 * 検索エリアに設定されたセンタCD、倉庫リストから
	 * ゾーンリストを取得し内部変数に保存する
	 */
	var setZoneListMap = function(){

		var deferred = $q.defer();

		// センタCD
		var centerCd = $scope.head.centerCd;
		if (!centerCd) {
			return;
		}

		if (!$scope.warehouseList) {
			return;
		}

		var countGetZone = $scope.warehouseList.length + 1;

		// センタ毎のゾーンリストの取得(非同期)
		$scope.deferredGetZoneList(centerCd, null).then(function(response){

			// 取得したゾーンリストを保存
			zoneListMapCenter[response.centerCd] = response.zoneList;

			countGetZone = countGetZone - 1;
			if(countGetZone <= 0) {
				// 全ゾーンの取得完了
				deferred.resolve();
			}
		});

		// 倉庫リストの繰返
		for (var i = 0 ; i < $scope.warehouseList.length ; i++) {
			var warehouseCd = $scope.warehouseList[i].warehouseCd;
			if (!warehouseCd) {
				continue;
			}

			// ゾーンリストの取得(非同期)
			$scope.deferredGetZoneList(centerCd, warehouseCd).then(function(response){

				// 取得したゾーンリストを保存
				if(!zoneListMap[response.centerCd]){
					zoneListMap[response.centerCd] = {};
				}

				zoneListMap[response.centerCd][response.warehouseCd] = response.zoneList;

				countGetZone = countGetZone - 1;
				if(countGetZone <= 0) {
					// 全ゾーンの取得完了
					deferred.resolve();
				}
			});
		}

		return deferred.promise;
	}

	/**
	 * 引数のセンタCD,倉庫CDを条件にゾーンリストを作成し返却する
	 */
	$scope.deferredGetZoneList = function(centerCd, warehouseCd) {

		var deferred = $q.defer();

		// 戻り値
		var result = {};
		result.centerCd = centerCd;
		result.warehouseCd = warehouseCd;

		if (!centerCd) {
			deferred.reject(result);
			return deferred.promise;
		}

		var request = {};
		request.data = {};
		request.centerCd = centerCd;
		request.warehouseCd = warehouseCd;
		api.zoneList.keyValueList(request).then(function(response){

			result.zoneList = response.data;
			deferred.resolve(result);
		});

		return deferred.promise;
	}

	/**
	 * グリッドのゾーンリストの設定
	 * 選択されたセンタ、倉庫に従ってゾーンリストを設定する
	 */
	$scope.setGridZoneList = function(rowIndex) {

		var centerCd = $scope.head.centerCd;

		if (!centerCd) {
			return null;
		}

		var mwarehouse = $scope.centerMasterEdit[rowIndex].mparamAsOne.mzone.mwarehouse;
		if (!mwarehouse) {
			return null;
		}

		var warehouseCd = $scope.centerMasterEdit[rowIndex].mparamAsOne.mzone.mwarehouse.warehouseCd;
		if (!warehouseCd) {
			return null;
		}

		if (zoneListMap[centerCd]) {
			if (zoneListMap[centerCd][warehouseCd]) {

				return zoneListMap[centerCd][warehouseCd];
			} else {

				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetEmReplenishAllocCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 緊急補充ロケ割付方法の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetEmReplenishAllocCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REPLENISH_ALLOC_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.emReplenishAllocClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetPackingCalCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 梱包計算処理区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingCalCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_CAL_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.packingCalClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetPackingProcessCls
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 詰込区分の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingProcessCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_PROCESS_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.packingProcessClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetProductPartPacking
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 商品毎別梱包の取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProductPartPacking = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRODUCT_PART_PACKING";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.productPartPackingList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.clientMasterEdit.object:clientMasterEdit#deferredGetBoxGrpList
	 * @methodOf oneslogiWms.clientMasterEdit.object:clientMasterEdit
	 *
	 * @description
	 * 梱包荷材グループの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBoxGrpList = function () {
		var deferred = $q.defer();

		var request = {};
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
		request.centerId = $scope.centerId;
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End
		if (request.centerId == null || request.centerId == ""){
			return;
		}
		owsCommon.getDataCacheable(api.boxGrpList, request).then(function(response){
			$scope.boxGrpList = response.data;　　
			deferred.resolve();
		});

		return deferred.promise;
	};
	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

	// 検索ボタンがないので、「pageSize」を変更時に、検索処理を実行
	var oldPageSize = -1;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
	 *
	 * @description
	 * センタマスタメンテナンスデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {

//			// 新規した後、画面は編集モードに変更する場合、正常更新メッセージを表示する。
//			if ($route.current.params.insertFlg) {
//				alertMessage.setInfoMessageByCode("updateProcessNormalEndInformation");
//			}

			// 訂正
			var request = {};
			// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
			request.mcenterId = $scope.centerId;
			// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End

			api.centerMasterEdit.initUpdate(request).then(function(response){
//				directiveControl.show($scope,"register",false);
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}
				// 行番号振り直し
//				updateRowNumber($scope.centerMasterEdit);

				$scope.head = response.data.head; // センタマスタメンテナンスヘッダ関連
//				$scope.centerMasterEdit = response.data.body[0].mclientCenterList; // センタマスタメンテナンス明細関連
				$scope.centerMasterEdit = response.data.body; // センタマスタメンテナンス明細関連
				bodyList = response.data.body;
//				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				$scope.paging = response.paging;

				// [Ver3.0][#3267] センタに紐づくカルチャ、タイムゾーンの初期値セット追加 2018.01.04 shimizu Start
				setCultureList(response.data.head.bculture);
				setTimeZoneList(response.data.head.btimeZone);
				// [Ver3.0][#3267] センタに紐づくカルチャ、タイムゾーンの初期値セット追加 2018.01.04 shimizu End

				directiveControl.editable($scope,"centerCd",false);
//				var j = response.data.body[0].mclientCenterList;
//				for(var i = 0; i <j.length; i++){
//					if(response.data.body[0].mclientCenterList[i].batchProgressFlg == "1"){
				var j = response.data.body;
				for(var i = 0; i <j.length; i++){
					if(response.data.body[i].batchProgressFlg == "1"){
						directiveControl.editable($scope,"register",false);
						break;
					}
//					gridDirectiveControl.editable($scope.gridOptions, 'mparamAsOne.mshapeByPieceShapeId.shapeCd', false, i);
				}
				// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod Start
				if (response.data.head.delFlg == '0') {
					directiveControl.editable($scope,"new",true);
				} else {
					directiveControl.editable($scope,"new",false);
					directiveControl.editable($scope,"update",false);
				}
				// [#2432][#2272][Ver2.2.1] ユーザマスタメンテナンス（編集） - センタ使用権限チェック修正 2017.08.31 honma Mod End

				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
				// ゾーンリスト作成
				setZoneListMap();
				setShapeListMap();
//				if ($scope.warehouseList.length == 1) {
//					$scope.blankRow.mparamAsOne.mzone.mwarehouse.warehouseCd = $scope.warehouseList[0].warehouseCd;
//				}
				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				// [#6915][OSS] ページングオプション変更監視処理(owsCommon.watchPagingOptions)を削除 2019.11.29 ono Delete


				deferred.resolve();
			});

		} else {

			// 新規
			api.centerMasterEdit.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				$scope.head = response.data.head; // センタマスタメンテナンスヘッダ関連
////				$scope.centerMasterEdit = response.data.body[0].mclientCenterList; // センタマスタメンテナンス明細関連
				$scope.centerMasterEdit = response.data.body; // センタマスタメンテナンス明細関連
//				bodyList = response.data.body;
//				$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト

				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope,"delFlg",false);
				directiveControl.editable($scope,"new",false);
				directiveControl.editable($scope,"update",false);


				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
				// ゾーンリスト作成
//				setZoneListMap();
//				setShapeListMap();
//				if ($scope.warehouseList.length == 1) {
//					$scope.blankRow.mparamAsOne.mzone.mwarehouse.warehouseCd = $scope.warehouseList[0].warehouseCd;
//
//				}
				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});

		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#getClassForRow
	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * センタステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (row.entity.delFlg == "1") {
			return "wmslegendred";
		}
		return "";
	};
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#addRow
//	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
//	 *
//	 * @description
//	 * 行追加ボタン押下処理<br>
//	 *
//	 * グリッドの最終行の下に空行を追加する。
//	 */
//	$scope.addRow = function(){
//		$scope.blankRow.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
//		if ($scope.screenMode == SCREEN_MODE.Update) {
//			$scope.centerMasterEdit.push(angular.copy($scope.blankRow));
//			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false, $scope.centerMasterEdit.length-1);
//
//			// 行番号振り直し
//			updateRowNumber($scope.centerMasterEdit);
//
//		} else {
//			$scope.centerMasterEdit.push(angular.copy($scope.blankRow));
//			// [ON推-品向-944] 不要な処理を削除(エラー発生を解消) 2015.09.30 kawana
//			gridDirectiveControl.editable($scope.gridOptions, 'delFlg', false);
//			// 行番号振り直し
//			updateRowNumber($scope.centerMasterEdit);
//		}
//	};
//
//	// 行削除ボタン押下処理
//	/**
//	 * @ngdoc method
//	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#removeRow
//	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
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
//			if ($scope.centerMasterEdit.indexOf(row) > -1) {
//				if (row.clientCenterId != null) {
//					i += 1;
//					return;
//				}
//			}
//		});
//		if (i > 0){
//			alertMessage.setErrorMessageByCode("alreadyRegisteredCannotDeleteError");
//			return;
//		}
//		// 削除対象無し
//		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
//			alertMessage.setErrorMessageByCode("deleteRowErrNotSelect");
//			return;
//		}
//	    // [横並-053] チェック順変更 2014.11.21 taoys Start
//		// 入力済の場合に警告
//		var item = 0;
//		for (var row = 0;row <$scope.gridOptions.gridApi.selection.getSelectedRows().length; row++){
//			if(($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mclient.clientCd != ""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mclient.clientCd != null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.mdeliveryCourse.deliveryCourseCd != ""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.mdeliveryCourse.deliveryCourseCd != null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.mdeliveryCourse.deliveryCourseNm != ""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.mdeliveryCourse.deliveryCourseNm != null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.storeNoFlg !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.storeNoFlg != null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.mergeCls !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.mergeCls!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.tkeepingDays !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.tkeepingDays!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.hkeepingDays !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.hkeepingDays!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.dkeepingDays !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.dkeepingDays!= null)
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana Start
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.overStoreNumFlg !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.overStoreNumFlg!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.pastStoreDtFlg !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.pastStoreDtFlg!= null)
//				// [ON推-品向-804] 過入荷可フラグ、過去日入力可フラグを追加 2015.05.12 kawana End
//				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey1 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey1!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey2 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey2!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey3 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey3!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey4 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey4!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey5 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey5!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey6 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey6!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey7 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey7!= null)
//				||($scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey8 !=""
//					&&$scope.gridOptions.gridApi.selection.getSelectedRows()[row].mparamAsOne.allocSortKey8!= null)
//				// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
//				||$scope.gridOptions.gridApi.selection.getSelectedRows()[row].delFlg !=owsCommon.getDefaultValue($scope.delFlgList)){
//
//				item++;
//			}
//		}
//		// 複数行の場合に警告
//		if(item > 0){
//			if (!owsCommon.viewConfirm("deleteRowAlreadyInputConfirmation")) {
//				return;
//			}
//		}else{
//			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
//				if (!owsCommon.viewConfirm("deleteRowMultipleConfirmation")) {
//					return;
//				}
//			}
//		}
//	    // [横並-053] チェック順変更 2014.11.21 taoys End
//
//		// 選択行削除
//		angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
//			if ($scope.centerMasterEdit.indexOf(row) > -1) {
//				$scope.centerMasterEdit.splice($scope.centerMasterEdit.indexOf(row), 1);
//			}
//		});
//
//		// 行番号振り直し
//		updateRowNumber($scope.centerMasterEdit);
//
//		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
//		//owsCommon.toggleSelectAll($scope.gridOptions, false);
//		owsCommon.toggleSelectAll($scope.gridOptions, false);
//		// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
//	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CenterMasterEdit.object:CenterMasterEdit#register
	 * @methodOf oneslogiWms.CenterMasterEdit.object:CenterMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
//		gridOptionMessageControl.hideAll($scope.gridOptions);

//		var listBody = [];
//		var emptyBody = [];

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
//		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
		// 空行判定
//		for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
//				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
////				// 空行への検証機能を解除
////				gridDirectiveControl.validity($scope.gridOptions, false, row);
//				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
//				// 空行を退避
//				emptyBody.push($scope.centerMasterEdit[row]);
//			} else {
//				// 空行以外を退避
//				listBody.push($scope.centerMasterEdit[row]);
//			}
//		}

//		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//		var promiseAll = $q.all([
//		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
//		                         ]);
//
//		promiseAll.then(function(){
//		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {

//				var isError = $scope.inputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('inputform');
//					return;
//				}
//				gridDirectiveControl.validity($scope.gridOptions, true);
//
//				// 空行を削除
//				angular.forEach(emptyBody, function(row) {
//					$scope.centerMasterEdit.splice($scope.centerMasterEdit.indexOf(row), 1);
//				});

//				// 行番号振り直し
//				updateRowNumber($scope.centerMasterEdit);
//				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

//				// 荷主CD重複チェック
//				var j = 0;
//				var rowIndex = new Array();
//				var errAry = new Array();
//				for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//					var clientCd = $scope.centerMasterEdit[row].mclient.clientCd;
//					for (var i = row+1; i < $scope.centerMasterEdit.length; i++) {
//						if ($scope.centerMasterEdit[i].mclient.clientCd == clientCd){
//							rowIndex[j] =i;
//							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
////							errAry[j] = "clientCodeDuplicateError";
//							// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
//							j++;
//						}
//					}
//				}
//				if (j > 0){
//					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
////					for(row = 0; row < rowIndex.length; row++){
////						if (!gridOptionMessageControl.isShow($scope.gridOptions, "mclient.clientCd", rowIndex[row])) {
////							gridOptionMessageControl.show($scope.gridOptions, "mclient.clientCd", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
////						}
////					}
//					// エラーメッセージCD
//					var messageCd = "clientCodeDuplicateError";
//					gridOptionMessageControl.show($scope.gridOptions, "mclient.clientCd", $filter('owfMessage')(messageCd), rowIndex);
//					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//					directiveControl.firstErrorOnFocus('inputform');
//					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
//					return;
//				}
//				var k = 0;
//				var rowIndex = new Array();
//				var errAry = new Array();
//
//				for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//						if($scope.centerMasterEdit[row].mparamAsOne.storeNoFlg =="0"){
//							if($scope.centerMasterEdit[row].mparamAsOne.mergeCls =="01"||$scope.centerMasterEdit[row].mparamAsOne.mergeCls =="02"){
//								rowIndex[k] =row;
//								// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
////								errAry[k] = "mergeClsCannotSelectExceptionCaseError";
//								// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
//								k++;
//							}
//						}
//				}
//				if (k > 0){
//					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
////					for(row = 0; row < rowIndex.length; row++){
////						if (!gridOptionMessageControl.isShow($scope.gridOptions, "mparamAsOne.mergeCls", rowIndex[row])) {
////							gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.mergeCls", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
////						}
////					}
//					// エラーメッセージCD
//					var messageCd2 = "mergeClsCannotSelectExceptionCaseError";
//					gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.mergeCls", $filter('owfMessage')(messageCd2), rowIndex);
//					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//					directiveControl.firstErrorOnFocus('inputform');
//					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
//					return;
//				}
//
//				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
//				// 3つの荷姿は同じ荷姿が指定されていた場合、エラーとする(行内)
//				var rowIndex = new Array();
//				var m = 0;
//				for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//
//					if(isDuplicateShapeErr(row)){
//						rowIndex[m] = row;
//						m++;
//					}
//				}
//
//				if (m > 0){
//					// スクロールとフォーカス
//					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//					directiveControl.firstErrorOnFocus('inputform');
//					return;
//				}

//				// マルチピック計算区分が「1：マルチピック計算有り」の場合、バケット列数とバケット段数が必須入力
//				var rowIndexBacketColNum = new Array();
//				var rowIndexBacketRowNum = new Array();
//				for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//					if ($scope.centerMasterEdit[row].mparamAsOne.multiPicCls == "1" ){
//						if(!($scope.centerMasterEdit[row].mparamAsOne.backetColNum)
//								|| 0 == $scope.centerMasterEdit[row].mparamAsOne.backetColNum.length) {
//							rowIndexBacketColNum[rowIndexBacketColNum.length] = row;
//						}
//						if(!($scope.centerMasterEdit[row].mparamAsOne.backetRowNum)
//								|| 0 == $scope.centerMasterEdit[row].mparamAsOne.backetRowNum.length) {
//							rowIndexBacketRowNum[rowIndexBacketRowNum.length] = row;
//						}
//					}
//				}
//				if (rowIndexBacketColNum.length > 0　|| rowIndexBacketRowNum.length > 0 ){
//
//					if (rowIndexBacketColNum.length > 0　){
//						// エラーメッセージCD
//						var messageCd = "necessaryItemNotInputError";
//						// 対象の項目にエラーを表示
//						gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.backetColNum", $filter('owfMessage')(messageCd), rowIndexBacketColNum);
//						// 最初のエラー箇所までスクロール
//						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//						// 最初のエラーにフォーカス
//						directiveControl.firstErrorOnFocus('inputform');
//					}
//					if (rowIndexBacketRowNum.length > 0){
//
//						// エラーメッセージCD
//						var messageCd = "necessaryItemNotInputError";
//						// 対象の項目にエラーを表示
//						gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.backetRowNum", $filter('owfMessage')(messageCd), rowIndexBacketRowNum);
//						// 最初のエラー箇所までスクロール
//						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//						// 最初のエラーにフォーカス
//						directiveControl.firstErrorOnFocus('inputform');
//					}
//					return;
//				}

//				// 梱包計算処理区分が"1"の場合、詰込区分、商品毎別梱包と梱包荷材グループ項目が必須入力
//				var rowIndexPackingProcessCls = new Array();
//				var rowIndexProductPartPacking = new Array();
//				var rowIndexPackingBoxGroupId = new Array();
//				for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//					if ($scope.centerMasterEdit[row].mparamAsOne.packingCalCls == "1" ){
//						if(!($scope.centerMasterEdit[row].mparamAsOne.packingProcessCls)
//								|| 0 == $scope.centerMasterEdit[row].mparamAsOne.packingProcessCls.length) {
//							rowIndexPackingProcessCls[rowIndexPackingProcessCls.length] = row;
//						}
//						if(!($scope.centerMasterEdit[row].mparamAsOne.productPartPacking)
//								|| 0 == $scope.centerMasterEdit[row].mparamAsOne.productPartPacking.length) {
//							rowIndexProductPartPacking[rowIndexProductPartPacking.length] = row;
//						}
//						if(!($scope.centerMasterEdit[row].mparamAsOne.mboxGrp.boxGrpCd)
//								|| 0 == $scope.centerMasterEdit[row].mparamAsOne.mboxGrp.boxGrpCd.length) {
//							rowIndexPackingBoxGroupId[rowIndexPackingBoxGroupId.length] = row;
//						}
//					}
//				}
//				if (rowIndexPackingProcessCls.length > 0　
//						|| rowIndexProductPartPacking.length > 0
//						|| rowIndexPackingBoxGroupId.length > 0){
//
//					if (rowIndexPackingProcessCls.length > 0　){
//						// エラーメッセージCD
//						var messageCd = "necessaryItemNotInputError";
//						// 対象の項目にエラーを表示
//						gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.packingProcessCls", $filter('owfMessage')(messageCd), rowIndexPackingProcessCls);
//						// 最初のエラー箇所までスクロール
//						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//						// 最初のエラーにフォーカス
//						directiveControl.firstErrorOnFocus('inputform');
//					}
//					if (rowIndexProductPartPacking.length > 0){
//
//						// エラーメッセージCD
//						var messageCd = "necessaryItemNotInputError";
//						// 対象の項目にエラーを表示
//						gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.productPartPacking", $filter('owfMessage')(messageCd), rowIndexProductPartPacking);
//						// 最初のエラー箇所までスクロール
//						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//						// 最初のエラーにフォーカス
//						directiveControl.firstErrorOnFocus('inputform');
//					}
//					if (rowIndexPackingBoxGroupId.length > 0){
//
//						// エラーメッセージCD
//						var messageCd = "necessaryItemNotInputError";
//						// 対象の項目にエラーを表示
//						gridOptionMessageControl.show($scope.gridOptions, "mparamAsOne.mboxGrp.boxGrpCd", $filter('owfMessage')(messageCd), rowIndexPackingBoxGroupId);
//						// 最初のエラー箇所までスクロール
//						gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//						// 最初のエラーにフォーカス
//						directiveControl.firstErrorOnFocus('inputform');
//					}
//					return;
//				}
				// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

//			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
//			// 引当ソートキーの重複チェック(行内)
//			var rowIndex = new Array();
//			var m = 0;
//			for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//
//				if(isDuplicateSortKeyErr(row)){
//					rowIndex[m] = row;
//					m++;
//				}
//			}
//
//			if (m > 0){
//				// スクロールとフォーカス
//				gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//				directiveControl.firstErrorOnFocus('inputform');
//				return;
//			}
//			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
//
//			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
//			// 引当ソートキーの重複チェック(行内)
//			var rowIndex = new Array();
//			var m = 0;
//			for (var row = 0; row < $scope.centerMasterEdit.length; row++) {
//
//				if(isDuplicateSortKeyErr(row)){
//					rowIndex[m] = row;
//					m++;
//				}
//			}
//
//			if (m > 0){
//				// スクロールとフォーカス
//				gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
//				directiveControl.firstErrorOnFocus('inputform');
//				return;
//			}
//			// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End
//
//			// 空行を削除
//			angular.forEach(emptyBody, function(row) {
//				$scope.centerMasterEdit.splice($scope.centerMasterEdit.indexOf(row), 1);
//			});

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定
					checkFunc = api.centerMasterEdit.inputCheck;
					execFunc = api.centerMasterEdit.update;

					successFunc = function(response){
						// 前画面へ戻る
//						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);

						var param = {};
						param.mode = SCREEN_MODE.Update;
						param.mcenterId = response.data.head.centerId;

						// 次の画面へ遷移する。
						owsCommon.viewInfoAndMovePage(
								"wms/master/CenterMasterEdit"
								, param
								, response.status.messageCode
								,response.status.messageReplaceValue);
						$route.reload();
					}

				} else {
					// 新規登録関数を設定
					checkFunc = api.centerMasterEdit.inputCheck;
					execFunc = api.centerMasterEdit.register;

					successFunc = function(response){
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki Start
//						owsCommon.toggleSelectAll($scope.gridOptions, false);
						// [ON推-品向-583] 明細　ヘッダー行の選択 2015.05.20 ki End
//
//						// 初期化
//						$scope.initScreenHttp();
						// 更新モードで画面を開きなおす。
						var param = {};
						param.mode = SCREEN_MODE.Update;
						param.mcenterId = response.data.head.centerId;

						// 次の画面へ遷移する。
						owsCommon.viewInfoAndMovePage(
								"wms/master/CenterMasterEdit"
								, param
								, response.status.messageCode
								,response.status.messageReplaceValue);
//						$location.replace();
					}

				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
//				bodyList[0].mclientCenterList = listBody;
//				request.data.body = bodyList;
				// 入力チェック
				checkFunc(request).then(function(checkResponse){

					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//センタCD存在チェック
							if (checkResponse.status.listStatus[i].status.statusCode == 2){
								optionMessageControl.show($scope, "centerCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								return;
							}
						}
					}

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}

					// センタマスタメンテナンスデータ登録または更新
					execFunc(request).then(function(execResponse){

						// 処理結果確認
//						if(execFunc == api.centerMasterEdit.register){
						if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
							return;
						}
//						}

						// 完了後の処理
						successFunc(execResponse);
					});

				});

			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
//		},
//		// エラー時の処理
//		function(){
//			owsCommon.syncExec(function() {
//				// 空行の検証機能を再開
//				gridDirectiveControl.validity($scope.gridOptions, true);
//
//				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
//			});
//		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
	};

	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
	var isDuplicateShapeErr = function(rowIndex){
		var shapeId1 = $scope.centerMasterEdit[rowIndex].mparamAsOne.mshapeByCaseShapeId.shapeCd;
		var shapeId2 = $scope.centerMasterEdit[rowIndex].mparamAsOne.mshapeByBowlShapeId.shapeCd;
		var shapeId3 = $scope.centerMasterEdit[rowIndex].mparamAsOne.mshapeByPieceShapeId.shapeCd;

		var shapeIds = [shapeId1, shapeId2, shapeId3];
		var shapeIdElementStrs = ["mparamAsOne.mshapeByCaseShapeId.shapeCd", "mparamAsOne.mshapeByBowlShapeId.shapeCd", "mparamAsOne.mshapeByPieceShapeId.shapeCd"];

		// エラーメッセージCD
		var messageCd = "dataDuplicateError";

		var isErr = false;
		for(var i = 0 ; i < shapeIds.length ; i++){
			// 比較元
			var srcKey =  shapeIds[i];
			if(srcKey){
				// 定義あり

				// 残りが重複していないかチェック
				for(var j = i+1 ; j < shapeIds.length ; j ++){
					// 比較先
					var dstKey = shapeIds[j];

					// 比較
					if(srcKey == dstKey){
						// 重複
						var srcElementStr =  shapeIdElementStrs[i];
						var dstElementStr =  shapeIdElementStrs[j];
						gridOptionMessageControl.show($scope.gridOptions, srcElementStr, $filter('owfMessage')(messageCd), rowIndex);
						gridOptionMessageControl.show($scope.gridOptions, dstElementStr, $filter('owfMessage')(messageCd), rowIndex);

						isErr = true;
					}
				}
			}
		}

		return isErr;
	}
	// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

	// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana Start
	// 指定行の引当ソートキーに重複がないかのチェック
	var isDuplicateSortKeyErr = function(rowIndex){
		var sortkey1 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey1;
		var sortkey2 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey2;
		var sortkey3 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey3;
		var sortkey4 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey4;
		var sortkey5 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey5;
		var sortkey6 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey6;
		var sortkey7 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey7;
		var sortkey8 = $scope.centerMasterEdit[rowIndex].mparamAsOne.allocSortKey8;

		var sortkeys = [sortkey1, sortkey2, sortkey3, sortkey4, sortkey5, sortkey6, sortkey7, sortkey8];

		// エラーメッセージCD
		var messageCd = "dataDuplicateError";

		var isErr = false;
		for(var i = 0 ; i < sortkeys.length ; i++){
			// 比較元
			var srcKey =  sortkeys[i];
			if(srcKey){
				// 定義あり

				// 残りが重複していないかチェック
				for(var j = i+1 ; j < sortkeys.length ; j ++){
					// 比較先
					var dstKey = sortkeys[j];

					// 比較
					if(srcKey == dstKey){
						// 重複
						var srcElementStr =  "mparamAsOne.allocSortKey" + (i+1);
						var dstElementStr =  "mparamAsOne.allocSortKey" + (j+1);
						gridOptionMessageControl.show($scope.gridOptions, srcElementStr, $filter('owfMessage')(messageCd), rowIndex);
						gridOptionMessageControl.show($scope.gridOptions, dstElementStr, $filter('owfMessage')(messageCd), rowIndex);

						isErr = true;
					}
				}
			}
		}

		return isErr;
	}
	// [C-CWMS-0025] センタマスタメンテナンス - 引当ソートキーの設定を追加 2015.05.12 kawana End


	// 行番号振り直し処理
	var updateRowNumber = function(body) {
		var i = 1;
		angular.forEach(body, function(row) {
			row.lineNo = i++;
		});
	};
	// 画面初期化処理を実行
	$scope.initScreen();

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster#getPagedDataAsync
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getPagedDataAsync = function(pageSize, page) {
		var request = {};
		request.data = {};
//		request.data.head = $scope.head;
		request.data.head = {};
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
		request.data.head.centerId = $scope.centerId;
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End

		owsCommon.setPagingData(request, $scope.paging, pageSize, page);

//		api.centerMasterEdit.initUpdate(request).then(function(response) {
		api.centerMasterEdit.searchPagging(request).then(function(response) {
//			statusInfo.isSuccessAndShowMessage(response,'searchform')
			$scope.setPagingData(response, page, pageSize);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CustomerMaster.object:CustomerMaster##setPagingData
	 * @methodOf oneslogiWms.CustomerMaster.object:CustomerMaster
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setPagingData = function(response, page, pageSize) {
		//行選択状態をクリア
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		$scope.gridOptions.gridViewport.scrollTop(0);

		//取得データをグリッドに反映
//		$scope.customerList = response.data.body;
		//トータル件数を設定
		$scope.gridOptions.totalItems = response.paging.allRecordCount;
		//検索条件を履歴に保存
//		owsHistory.replaceState($scope.head);


		// 処理結果確認
		if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
			// 前画面に戻る
			owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
			// [#462] スクリプトエラー発生(問題のコード削除) 2017.03.14 kawana
			return;
		}
		// 行番号振り直し
		updateRowNumber($scope.centerMasterEdit);

		$scope.head = response.data.head; // センタマスタメンテナンスヘッダ関連
//		$scope.centerMasterEdit = response.data.body[0].mclientCenterList; // センタマスタメンテナンス明細関連
		$scope.centerMasterEdit = response.data.body; // センタマスタメンテナンス明細関連
		bodyList = response.data.body;
		$scope.blankRow = response.data.blankRow; // 空行用のオブジェクト
		directiveControl.editable($scope,"centerCd",false);
//		var j = response.data.body[0].mclientCenterList;
		var j = response.data.body;
		for(var i = 0; i <j.length; i++){
//			if(response.data.body[0].mclientCenterList[i].batchProgressFlg == "1"){
			if(response.data.body[i].batchProgressFlg == "1"){
				directiveControl.editable($scope,"register",false);
				break;
			}
//			gridDirectiveControl.editable($scope.gridOptions, 'mparamAsOne.mshapeByPieceShapeId.shapeCd', false, i);
		}

		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja Start
		// ゾーンリスト作成
		setZoneListMap();
		setShapeListMap();

		// [#6869][OSS] 倉庫CDの配列を取得できずにコンソールエラーになっていたのを修正 2019.11.29 tsuboi Start
//		if ($scope.warehouseList.length == 1) {
//			$scope.blankRow.mparamAsOne.mzone.mwarehouse.warehouseCd = $scope.warehouseList[0].warehouseCd;
//		}
		// [#6869][OSS] 倉庫CDの配列を取得できずにコンソールエラーになっていたのを修正 2019.11.29 tsuboi End

		// [エンハンス PH2.0] センタマスタメンテナンス - 明細部内容を追加 2015.11.13 sja End

		//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
		owsCommon.setFirstFocus('inputform');

	};


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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 新規ボタン押下処理<br>
	 *
	 * パラメータマスタメンテナンス(編集)画面を表示する。
	 */
	$scope.initNew = function(){
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
		// パラメータマスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/ParameterMasterEdit").search({}).search("mode", SCREEN_MODE.Register).search("mcenterId", $scope.centerId).search("centerCd", $scope.head.centerCd);
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#showZipEdit
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 修正ボタン押下処理<br>
	 *
	 * パラメータマスタメンテナンス(編集)画面を表示する。
	 */
	$scope.update = function(){
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana Start
		// パラメータマスタメンテナンス(編集)画面へ遷移
		$location.path("wms/master/ParameterMasterEdit").search({}).search("mode", SCREEN_MODE.Update).search("clientCenterId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCenterId).search("mcenterId", $scope.centerId).search("centerCd", $scope.head.centerCd).search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].mclient.clientCd);
		// [#5416][v3.1] URLからセンタIDを取得する処理を初期処理のみに変更(戻るボタンを連打すると致命的エラー発生) 2018.10.19 kawana End
	};
	// 2016.02.23 Zhang 一覧編集 ※4 End
}]);
