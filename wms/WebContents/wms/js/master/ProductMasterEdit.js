/**
 * @ngdoc overview
 * @name oneslogiWms.ProductMasterEdit
 *
 * @description
 * 商品マスタメンテナンス(編集)画面<br>
 *
 * 商品マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ProductMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ProductMasterEdit.service:productMasterEditApi
 *
 * @description
 * 商品マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 荷姿データ操作用WebApi<br>
 * ・resources/common/shapeCD/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 商品マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/productMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/productMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/productMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/productMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/productMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('productMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
//		shapeCdList: AngularAPIClient.make(
//				[
//				 ['keyValueList', 'GET', 'resources/common/shapeCD/keyValueList']
//				 ]
//		),
		// [Ver3.0] unit of measure対応 2017.12.05 NING Start
		inventoryManagementUnitList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/shapeCD/keyValueList3']
				 ]
		),
		// [Ver3.0] unit of measure対応 2017.12.05 NING End
		product: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/productMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/productMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/productMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/productMasterEdit/register'],
				 ['update',             'POST', 'resources/master/productMasterEdit/update'],
				 ['getProductShape',    'GET',  'resources/master/productMasterEdit/getProductShapeList']
				]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
 *
 * @description
 * 商品マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ProductMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'productMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	// グリッドの列情報（デザイン用）
	// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
//	$scope.productMasterEditCols = [
//	                                {field:"mshape.shapeCd", displayName:"荷姿"},
//	                                {field:"unitNum", displayName:"ケース入数"},
//	                                {field:"length", displayName:"ピース縦(mm)"},
//	                                {field:"width", displayName:"ピース横(mm)"},
//	                                {field:"height", displayName:"ピース高さ(mm)"},
//	                                {field:"volume", displayName:"ピース容積（mm3）"},
//	                                {field:"netWeight", displayName:"ピース商品重量（g）"},
//	                                {field:"grossWeight", displayName:"ピース総重量（g）"}
//	                                ];
	$scope.productMasterEditCols = [
	                                {field:"shapeCd", displayName:"荷姿CD"},
	                                {field:"vdictByShapeDictId.dictNm", displayName:"荷姿名称"},
	                                {field:"mproductShapeList[0].unitNum", displayName:"ケース入数"},
	                                {field:"mproductShapeList[0].length", displayName:"ピース縦(mm)"},
	                                {field:"mproductShapeList[0].width", displayName:"ピース横(mm)"},
	                                {field:"mproductShapeList[0].height", displayName:"ピース高さ(mm)"},
	                                {field:"mproductShapeList[0].volume", displayName:"ピース容積（mm3）"},
	                                {field:"mproductShapeList[0].netWeight", displayName:"ピース商品重量（g）"},
	                                {field:"mproductShapeList[0].grossWeight", displayName:"ピース総重量（g）"}
	                                ];
	// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
	//商品の管理フラグの変数設定
	var lotManagFlag;
	var limitDtManagFlag;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#initScreen
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// [#7006][OSS] グリッドの選択機能を削除 2020.02.05 tsuboi Start
		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryNonSelectGridOptions({
			data: 'product',
			columnDefs: 'productMasterEditCols',
		});
		// [#7006][OSS] グリッドの選択機能を削除 2020.02.05 tsuboi End

		// グリッドの商品コード列にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "mshape.shapeCd":{
				"shapeCd":{
					// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "unitNum":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].unitNum":{
					// [ON推-品向-1116] 入数の最小値を変更 2016/04/28 ichikawa Start
					"ng-blur":{
						eventFunction:"unitNumBlur(row.rowIndex)"
					},
					// [ON推-品向-1116] 入数の最小値を変更 2016/04/28 ichikawa End
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "length":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].length":{
					// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa Start
					"ng-blur":{
						eventFunction:"volumeBlur(row.rowIndex);checkDecimal(row.rowIndex)"
					},
					// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa End
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "width":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].width":{
					// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa Start
					"ng-blur":{
						eventFunction:"volumeBlur(row.rowIndex);checkDecimal(row.rowIndex)"
					},
					// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa End
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "height":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].height":{
					// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa Start
					"ng-blur":{
						eventFunction:"volumeBlur(row.rowIndex);checkDecimal(row.rowIndex)"
					},
					// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa End
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "volume":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].volume":{
					"ng-blur":{
						eventFunction:"checkDecimal(row.rowIndex)"
					},
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "netWeight":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].netWeight":{
					"ng-blur":{
						eventFunction:"checkDecimal(row.rowIndex)"
					},
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				// "grossWeight":{
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
				"mproductShapeList[0].grossWeight":{
					"ng-blur":{
						eventFunction:"checkDecimal(row.rowIndex)"
					},
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				},
			    // [検査-093] 選択欄にチェックが自動設定 2014.11.27 taoys End
				// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana Start
				"mproductShapeList[0].delFlg":{
					// [#7006][OSS] 入力値変更時にメソッドを呼び出す処理を削除 2020.02.05 tsuboi Delete
				}
				// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana End
		};

		$scope.gridSelectOptions = {
//				// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana Start
				"mproductShapeList[0].delFlg" : {
					key : "classCd",
					value : "classNm",
					listModel : "delFlgList",
					removeBlank: "null"
				}
//				// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana End
		};

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
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
				 $scope.deferredGetLotManagFlg(),
				 $scope.deferredGetLotReverseFlg(),
				 $scope.deferredGetLimitDtManagFlg(),
				 $scope.deferredGetLimitDtReverseFlg(),
				 $scope.deferredGetMergeCls(),
				//  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW Start
				 $scope.deferredGetfreightCls(),
				//  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW End
				 $scope.deferredGetShippingStopFlg(),
				 $scope.deferredInventoryManagementUnit()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#productNmBlur
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 商品名称のロストフォーカス処理<br>
	 *
	 * 商品名称ロストフォーカス時、商品略称未入力の場合、商品名称をコピーする。
	 */
	$scope.productNmBlur = function() {
		// 入力された商品名称を取得
		var productNm = $scope.productSearch.productNm;
		// 商品略称を取得
		var productAbbr = $scope.productSearch.productAbbr;

		if (productNm && 0 < productNm.length) {
			if (productAbbr && 0 < productAbbr.length) {
				return;
			}else{
				$scope.productSearch.productAbbr = productNm;
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#inventoryManagementUnitChange
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 在庫管理単位のロストフォーカス処理<br>
	 * 在庫管理単位ロストフォーカス時の処理。
	 */
	$scope.inventoryManagementUnitChange = function() {
		var request = {};
		request.productId = $route.current.params.productId;
		request.clientId = $route.current.params.clientId;
		request.shapeGrpCd = $scope.productSearch.mshapeGrp.shapeGrpCd;

		api.product.getProductShape(request).then(function(response){

			// 商品明細関連
			$scope.product = response.data.gridBody;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;

			$scope.productSearch.mshapeGrp.decimalExistFlg = response.data.decimalExistFlg;

			// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
			for (var row = 0; row < $scope.product.length; row++) {
				if (row == 0){
					$scope.product[row].mproductShapeList[0].unitNum = 0;
					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeList[0].unitNum', false, row);
					//$scope.gridOptions.$gridScope.selectionProvider.setSelection($scope.gridOptions.$gridScope.domAccessProvider.grid.rowCache[0],true);
				} else {
					if ($scope.product[row].mproductShapeList[0].unitNum == 0) {
						$scope.product[row].mproductShapeList[0].unitNum = "";
					}
				}
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#ProductManagFlgBlur
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 商品の管理フラグのロストフォーカス処理<br>
	 * ロット管理フラグと期限日管理フラグロストフォーカス時の処理。
	 */
	$scope.lotManagFlgChange = function() {
		if ($scope.productSearch.lotManagFlg == "0") {
			directiveControl.editable($scope, 'lotReverseFlg', false);
			$scope.productSearch.lotReverseFlg = "0";
		} else {
			directiveControl.editable($scope, 'lotReverseFlg', true);
			if (lotManagFlag == 0){
				$scope.productSearch.lotReverseFlg = "0";
			}
		}
		lotManagFlag=0;
	};
	$scope.limitDtManagFlgChange = function() {
		if ($scope.productSearch.limitDtManagFlg == "0") {
			directiveControl.editable($scope, 'limitDtReverseFlg', false);
			$scope.productSearch.limitDtReverseFlg = "0";
			// [ON推-品向-573] 期限日管理しない場合は期限日数を入力不可に設定 2015.04.23 kawana Start
			directiveControl.editable($scope, 'receiveLimitNum', false);
			directiveControl.editable($scope, 'shippingLimitNum', false);
			// [#492] 期限日管理しない場合の期限日数を0ではなくnullに設定 2016.12.20 kawana Start
			$scope.productSearch.receiveLimitNum = null;
			$scope.productSearch.shippingLimitNum = null;
			// [#492] 期限日管理しない場合の期限日数を0ではなくnullに設定 2016.12.20 kawana End
			// [ON推-品向-573] 期限日管理しない場合は期限日数を入力不可に設定 2015.04.23 kawana End

		} else {
			directiveControl.editable($scope, 'limitDtReverseFlg', true);
			// [ON推-品向-573] 期限日管理しない場合は期限日数を入力不可に設定 2015.04.23 kawana Start
			directiveControl.editable($scope, 'receiveLimitNum', true);
			directiveControl.editable($scope, 'shippingLimitNum', true);
			// [ON推-品向-573] 期限日管理しない場合は期限日数を入力不可に設定 2015.04.23 kawana End
			if (limitDtManagFlag == 0){
			$scope.productSearch.limitDtReverseFlg = "0";
			}
		}
		limitDtManagFlag=0;
	};

	// [#7006][OSS] 入力値変更時に呼び出されるメソッドを削除 2020.02.05 tsuboi Delete

	// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa Start
	$scope.volumeBlur = function(rowIndex) {

		// 縦(mm)
		var length = $scope.product[rowIndex].mproductShapeList[0].length;

		// 横(mm)
		var width = $scope.product[rowIndex].mproductShapeList[0].width;

		// 高さ(mm)
		var height = $scope.product[rowIndex].mproductShapeList[0].height;

		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi Start
		if(length == null || width == null || height == null){
			$scope.product[rowIndex].mproductShapeList[0].volume = null;
		}else if(checkErrorNum(length) || checkErrorNum(width) || checkErrorNum(height)){
			$scope.product[rowIndex].mproductShapeList[0].volume = null;
		}else{
			$scope.product[rowIndex].mproductShapeList[0].volume = owsCommon.multiply(length, width, height);
		}
		// [#7216][OSS] 容積の自動計算を修正 2020.03.10 tsuboi End
	};
	// [ON推-品向-1080] 容積の自動計算を追加 2016/04/15 ichikawa End

	// [#7216][OSS] 自動計算前の入力値チェックを行うメソッドを追加 2020.03.10 tsuboi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#checkErrorNum
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 */
	var checkErrorNum = function(size){
		// 文字以外でtrue
		if(isNaN(size)) return true;
		// 0未満でtrue
		if(size < 0) return true;
		// 指数でtrue
		if(size.toString().indexOf("e") > -1) return true;
		// 先頭文字0判定
		var isSizeFirstNumZero = size.toString().substring(0,1) == 0 ? true : false;
		// 小数以外判定
		var isNotSizeDecimal = size.toString().indexOf(".") == -1 ? true : false;
		// 先頭文字0且つ小数以外でtrue
		return isSizeFirstNumZero && isNotSizeDecimal;
	};
	// [#7216][OSS] 自動計算前の入力値チェックを行うメソッドを追加 2020.03.10 tsuboi End


	// [Ver3.0][#3630] 不要な処理削除 2018.02.15 shimizu

	// [ON推-品向-1116] 入数の最小値を変更 2016/04/28 ichikawa Start
	$scope.unitNumBlur = function(rowIndex) {
		var unitNum = $scope.product[rowIndex].mproductShapeList[0].unitNum;
		var shapeCd = $scope.product[rowIndex].shapeCd;

		if (shapeCd == "PIECE"){
			// 荷姿がピース
			if(unitNum < 0){
				var messageCd = "unitNumInputRequestMinIsZeroError";
				gridOptionMessageControl.show($scope.gridOptions, "mproductShapeList[0].unitNum", $filter('owfMessage')(messageCd), rowIndex);
				gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
				// [Ver3.0][#3642] 入数でエラーがあった際、エラー箇所にフォーカスを合わせる処理削除 2018.02.19 shimizu
				return;
			} else {
				gridOptionMessageControl.hide($scope.gridOptions, "mproductShapeList[0].unitNum", rowIndex);
			}
		} else {
			// 荷姿がピース以外
			if(unitNum < 1){
				var messageCd = "unitNumInputRequestMinIsOneError";
				gridOptionMessageControl.show($scope.gridOptions, "mproductShapeList[0].unitNum", $filter('owfMessage')(messageCd), rowIndex);
				gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, rowIndex[0]);
				// [Ver3.0][#3642] 入数でエラーがあった際、エラー箇所にフォーカスを合わせる処理削除 2018.02.19 shimizu
				return;
			} else {
				gridOptionMessageControl.hide($scope.gridOptions, "mproductShapeList[0].unitNum", rowIndex);
			}
		}
	};
	// [ON推-品向-1116] 入数の最小値を変更 2016/04/28 ichikawa End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetDelFlg
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 削除取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "DEL_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetLotManagFlg
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * ロット管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLotManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOT_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.lotManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetLotReverseFlg
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * ロット逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLotReverseFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LOT_REVERSE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.lotReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetLimitDtManagFlg
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 期限日管理フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitDtManagFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LIMIT_DT_MANAG_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitDtManagFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetLimitDtReverseFlg
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 期限日逆転防止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLimitDtReverseFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "LIMIT_DT_REVERSE_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.limitDtReverseFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetMergeCls
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 入庫No.マージ区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetMergeCls = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "MERGE_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.mergeClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

    //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetfreightCls
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * Freight Class取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetfreightCls = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "FREIGHT_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.freightClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
    //  キャリアEDIシステム(CES)連携対応 2017.01.03 LSW End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetShippingStopFlg
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 出荷停止フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetShippingStopFlg = function () {
		var deferred  = $q.defer();

		var request = {};
		request.classCd = "SHIPPING_STOP_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.shippingStopFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredInventoryManagementUnitList
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 在庫管理単位取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredInventoryManagementUnit = function() {
		var deferred = $q.defer();

		var request = {};
		request.clientCd =  userInfo.clientCd;
		api.inventoryManagementUnitList.query(request).then(function(response){
			$scope.deferredInventoryManagementUnitList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 商品マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 商品マスタ画面修正 2016.6.24 Linn Linn Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 商品マスタ画面修正 2016.6.24 Linn Linn Add End
			// 訂正
			var request = {};
			request.productId = $route.current.params.productId;
			//荷主センタ変更対応 2017.02.24 sja Start
			request.clientId = $route.current.params.clientId;
			//荷主センタ変更対応 2017.02.24 sja End

			api.product.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// 商品ヘッダ関連
				$scope.productSearch = response.data.head;
				// 商品明細関連
//				$scope.product = response.data.body;
				$scope.product = response.data.gridBody;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				$scope.pieceShapeId = response.data.pieceShapeId;
				for (var row = 0; row < $scope.product.length; row++) {
					//$scope.gridOptions.$gridScope.selectionProvider.setSelection($scope.gridOptions.$gridScope.domAccessProvider.grid.rowCache[0], true);
					if (row == 0){
						$scope.product[row].mproductShapeList[0].unitNum = 0;
						gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeList[0].unitNum', false, row);
						// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana Start
						//gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeList[0].delFlg', false, row);
						// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana End
					} else {
						if ($scope.product[row].mproductShapeList[0].unitNum == 0) {
							$scope.product[row].mproductShapeList[0].unitNum = "";
						}
					}

					// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana Start
					// 新規商品荷姿の場合は削除フラグは編集不可
//					if ($scope.product[row].mproductShapeList[0].unitNum == null) {
//						$scope.product[row].mproductShapeList[0].delFlg = "0";
//						//gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeList[0].delFlg', false, row);
//					}
					// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana End
				}
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End

				// コピー機能追加 商品マスタ画面修正 2016.6.24 Linn Linn Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 商品マスタ画面修正 2016.6.24 Linn Linn Add End
					directiveControl.editable($scope, 'productCd', false);
				// コピー機能追加 商品マスタ画面修正 2016.6.24 Linn Linn Add Start

				// [#7006][OSS] コピー時に荷姿の行が選択状態になる処理を削除 2020.02.05 tsuboi Delete
				}
				// コピー機能追加 商品マスタ画面修正 2016.6.24 Linn Linn Add End

				//商品の管理フラグの初期値設定(訂正)
				lotManagFlag = 1;
				limitDtManagFlag = 1;

				//商品の管理フラグの監視設定
				$scope.lotManagFlgChange();
				$scope.limitDtManagFlgChange();
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					directiveControl.editable($scope, 'delFlg', false);
				}
				// [ON推-品向-573] 期限日数の削除は登録時に設定する(処理削除) 2015.04.23 kawana

				// 商品期限日逆転防止フラグの関連情報の入力可否制御（Model,View同期後に実行）
				owsCommon.syncExec(function() {

				});

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('inputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.product.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					deferred.reject();
					return;
				}

				// 商品ヘッダ関連
				$scope.productSearch = response.data.head;
				// 商品明細関連
				$scope.product = [];
				$scope.product = response.data.gridBody;
				// 空行用のオブジェクト
				$scope.blankRow = response.data.blankRow;

				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
				$scope.pieceShapeId = response.data.pieceShapeId;
				for (var row = 0; row < $scope.product.length; row++) {
					if (row == 0){
						$scope.product[row].mproductShapeList[0].unitNum = 0;
						gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeList[0].unitNum', false, row);
					} else {
						if ($scope.product[row].mproductShapeList[0].unitNum == 0) {
							$scope.product[row].mproductShapeList[0].unitNum = "";
						}
					}

					// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana Start
					// 削除フラグは編集不可
//					$scope.product[row].mproductShapeList[0].delFlg = "0";
//					gridDirectiveControl.editable($scope.gridOptions, 'mproductShapeList[0].delFlg', false, row);
					// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana End
				}
//				//空行を生成
//				$scope.addRow();
				// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End

				//商品の管理フラグの初期値設定(新規)
				lotManagFlag= 0;
				limitDtManagFlag= 0;

				// 荷主の初期値設定
				$scope.productSearch.mclient.clientCd = userInfo.clientCd;

				// 削除の初期値設定
				$scope.productSearch.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);

				// 荷姿の初期値設定
				// [EC-CT1-049] 新規登録後の画面再描写で荷姿の必須チェックが外れの現象を解消するため、荷姿の初期値設定値を削除する 2015/02/18 許

				// ロット管理フラグ
				directiveControl.editable($scope, 'delFlg', false);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});

		}

		return deferred.promise;
	};



	// [#7006][OSS] 不要なになったメソッドを削除 2020.02.12 tsuboi Delete

	// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductMasterEdit.object:ProductMasterEdit#getClassForRow
	 * @methodOf oneslogiWms.ProductMasterEdit.object:ProductMasterEdit
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 */
	$scope.getClassForRow = function(row) {
//		if (row.entity.mproductShapeList[0].delFlg == "1") {
//			return "wmslegendred";
//		}
		return "";
	};

	// [#165][2.1.0-CT-019] 商品荷姿の削除機能を追加 2016.11.02 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#addRow
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 行追加ボタン押下処理<br>
	 *
	 * グリッドの最終行の下に空行を追加する。
	 */
	$scope.addRow = function(){

		$scope.product.push(angular.copy($scope.blankRow));

		// [#1798] 不要なコード(行No.)を削除 2017.05.31 kawana

	};

	// [#1798] 不要なコード(行No.)を削除 2017.05.31 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ReceivePlanInput.object:ReceivePlanInput#register
	 * @methodOf oneslogiWms.ReceivePlanInput.object:ReceivePlanInput
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {

		// [Ver3.0][#3630] 荷姿グループマスタ サイズ(縦, 横, 高さ)、容積、重量(商品重量, 総重量)を小数有無フラグ関係なしに小数許容する 2018.02.15 shimizu Start
//		if (decimalErrorFlg) {
//			return ;
//		}
		// [Ver3.0][#3630] 荷姿グループマスタ サイズ(縦, 横, 高さ)、容積、重量(商品重量, 総重量)を小数有無フラグ関係なしに小数許容する 2018.02.15 shimizu End

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		gridOptionMessageControl.hideAll($scope.gridOptions);

		var listBody = [];
		var emptyBody = [];

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		// 空行への検証機能を解除
		gridDirectiveControl.validity($scope.gridOptions, false, gridDirectiveControl.blankRows($scope.gridOptions));
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

		// 空行判定
		// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
		var allBody = $scope.gridOptions.gridApi.grid.rows;
		if (allBody.length > 0) {
			// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End

			// [#7006][OSS] 行選択機能を削除 2020.02.05 tsuboi Delete
			listBody = $scope.product;
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.inputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End
			owsCommon.syncExec(function() {

				var isError = $scope.inputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA Start
				// 空行への検証機能解除を解除
//				for (var row = 0; row < $scope.product.length; row++) {
//					gridDirectiveControl.validity($scope.gridOptions, true, row);
//				}
//
//				// エラーがある場合、フォーカスを当てる
//				if (isError) {
//					directiveControl.firstErrorOnFocus('inputform');
//					return;
//				}
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.27 SJA End

				// 入力データ無し
				if ($scope.screenMode != SCREEN_MODE.Update) {
					if (listBody.length == 0) {
						alertMessage.setErrorMessageByCode("noDetailsError");
						return;
					}
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.product.splice($scope.product.indexOf(row), 1);
				});

				// [#1798] 不要なコード(行No.)を削除 2017.05.31 kawana

				var checkFunc;   // 入力チェック関数
				var execFunc;    // データ登録関数
				var successFunc; // 正常終了後関数

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新処理関数を設定
					checkFunc = api.product.inputCheck;
					execFunc = api.product.update;

					successFunc = function(response){
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					}

				} else {
					// 新規登録関数を設定
					checkFunc = api.product.inputCheck;
					execFunc = api.product.register;

					successFunc = function(response){

						// [#979] 登録後にチェックを外す処理を削除 2017.02.15 kawana

						// コピー機能追加 商品マスタ画面修正 2016.07.05 Linn Linn Add Start
						if ($scope.screenMode == SCREEN_MODE.Register) {
						// コピー機能追加 商品マスタ画面修正 2016.07.05 Linn Linn Add End
							// 初期化
							$scope.initScreenHttp();
						// コピー機能追加 商品マスタ画面修正 2016.07.05 Linn Linn Add Start
						}
						// コピー機能追加 商品マスタ画面修正 2016.07.05 Linn Linn Add End
					}

				}

				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.productSearch;
				if (listBody.length > 0) {
					request.data.gridBody = listBody;
				}

				// コピー機能追加 商品マスタ画面修正 2016.07.05 Linn Linn Add Start
				if ($scope.screenMode == SCREEN_MODE.Copy) {
					request.data.head.productId = null;
				}
				// コピー機能追加 商品マスタ画面修正 2016.07.05 Linn Linn Add End

				// 入力チェック
				checkFunc(request).then(function(checkResponse){
					var unitNumChangedWarnFlg = false;
					if (checkResponse.status.listStatus != null){
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//商品CD存在チェック
							if (checkResponse.status.listStatus[i].status.statusCode == 2){
								optionMessageControl.show($scope, "productCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								// [#7006][OSS] 商品CDが重複だった場合に商品CDにフォーカスが当たるように修正 2020.02.05 tsuboi Start
								directiveControl.firstErrorOnFocus('inputform');
								// [#7006][OSS] 商品CDが重複だった場合に商品CDにフォーカスが当たるように修正 2020.02.05 tsuboi End
								return;
							}
						};
						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//JANCD存在チェック
							if (checkResponse.status.listStatus[i].status.statusCode == 8){
								optionMessageControl.show($scope, "janCd", $filter('owfMessage')(checkResponse.status.listStatus[i].status.messageCode, checkResponse.status.listStatus[i].status.messageReplaceValue));
								// [#7006][OSS] ソースCDが重複だった場合にソースCDにフォーカスが当たるように修正 2020.02.05 tsuboi Start
								directiveControl.firstErrorOnFocus('inputform');
								// [#7006][OSS] ソースCDが重複だった場合にソースCDにフォーカスが当たるように修正 2020.02.05 tsuboi End
								return;
							}
						}

						for (var i = 0 ;i <checkResponse.status.listStatus.length;i++){
							//入数が変更されている場合、警告メッセージを表示する
							if (checkResponse.status.listStatus[i].status.statusCode == 12){
								unitNumChangedWarnFlg = true;
								if (!owsCommon.viewConfirm("unitNumChangedWarn")) {
									return;
								}
							}
						}

					}

					// [ON推-品向-573] 期限日数の入力チェック(0以上)を削除 2015.04.24 kawana

					// ケース入数チェック
					for (var row = 0; row < $scope.product.length; row++) {

						// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
						// gridDirectiveControl.editable($scope.gridOptions, 'unitNum', true, rowIndex);
						// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
						var j = 0;
						var rowIndex = new Array();
						var errAry = new Array();
						// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
						// var shapeCd = $scope.product[row].mshape.shapeCd;
						var shapeCd = $scope.product[row].mshape.shapeCd;
						// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start

						if (shapeCd != null) {
							// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
							// [SK2-077] 更新時の必須チェックを見直します。2014.12.18 KI Start
							// if ((request.data.body[0].unitNum != 0) && (request.data.body[0].unitNum == "" || request.data.body[0].unitNum == null)) {
							if ((request.data.gridBody[0].mproductShapeList[0].unitNum != 0) && (request.data.gridBody[0].mproductShapeList[0].unitNum == "" || request.data.gridBody[0].mproductShapeList[0].unitNum == null)) {
								// [SK2-077] 更新時の必須チェックを見直します。2014.12.18 KI End
								// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
								rowIndex[j] = row;
								errAry[j] = "requiredError";
								j++;
							}
						}
						if (j > 0){
							for(row = 0; row < rowIndex.length; row++){
								// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
//								if (!gridOptionMessageControl.isShow($scope.gridOptions, "unitNum", rowIndex[row])) {									gridOptionMessageControl.show($scope.gridOptions, "unitNum", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
//								}
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "mproductShapeList[0].unitNum", rowIndex[row])) {
									gridOptionMessageControl.show($scope.gridOptions, "mproductShapeList[0].unitNum", $filter('owfMessage')((2, errAry)[0]), rowIndex[row]);
								}
								// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
							}
							// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
							// listBody[row].unitNum = request.data.body[row].unitNum;
							listBody[row].mproductShapeList[0].unitNum = request.data.gridBody[row].mproductShapeList[0].unitNum;
							// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
							return;
						}
					}

					// [Ver3.0] unit of measure対応 2017.12.06 NING Del

					// [#492] 期限日逆転防止フラグが「1」の時の出荷限界日数の相関チェックを削除 2016.12.20 kawana

					// 処理結果確認
					if (!unitNumChangedWarnFlg && !statusInfo.isSuccessAndShowMessage(checkResponse, 'inputform')) {
						return;
					}
					// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja Start
					request.data.pieceShapeId = $scope.pieceShapeId;
					// [エンハンス PH2.0] 商品マスタメンテナンス（編集）荷姿内容を追加 2015.11.26 sja End
					// 商品マスタデータ登録または更新
					execFunc(request).then(function(execResponse){

						// 処理結果確認
						if(execFunc == api.product.register){
							if (!statusInfo.isSuccessAndShowMessage(execResponse, 'inputform')) {
								return;
							}
						}

						// 完了後の処理
						successFunc(execResponse);
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

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
