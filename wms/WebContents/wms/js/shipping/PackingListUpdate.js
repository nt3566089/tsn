/**
 * @ngdoc overview
 * @name oneslogiWms.PackingListUpdate
 *
 * @description
 * 梱包明細修正
 */

angular.module('oneslogiWms.PackingListUpdate',[])

/**
 * @ngdoc service
 * @name oneslogiWms.PackingListUpdate.service:PackingListUpdateApi
 *
 * @description
 * 梱包明細修正WebApi定義<br>
 * ・resources/common/boxCd/query 荷材No.リスト用データ取得用WebApi<br>
 * ・resources/common/centerClass/keyValueList 荷材リスト用データ取得用WebApi<br>
 * ・resources/common/boxNo/keyValueList 納品指定時間リスト用データ取得用WebApi<br>
 * ・resources/shipping/packingListUpdate/init 初期化用WebApi<br>
 * ・resources/shipping/packingListUpdate/search 検索用WebApi<br>
 * ・resources/shipping/packingListUpdate/inputCheck 入力チェック用WebApi<br>
 * ・resources/shipping/packingListUpdate/update 登録用WebApi<br>
 *
 */
.factory('packingListUpdateApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		boxList: AngularAPIClient.make(
			    [
			        ['query', 'GET', 'resources/common/boxCd/query']
			    ]
		),
		delivTzList: AngularAPIClient.make(
			    [
			        ['keyValueList', 'GET', 'resources/common/centerClass/keyValueList']
			    ]
		),
		boxNoList: AngularAPIClient.make(
			    [
			        ['keyValueList', 'GET', 'resources/common/boxNo/keyValueList']
			    ]
		),
		packingList: AngularAPIClient.make(
			[
			    ['init',                       'GET',  'resources/shipping/packingListUpdate/init'],
			    ['search',                     'GET',  'resources/shipping/packingListUpdate/search'],
			    ['inputCheck',                 'POST', 'resources/shipping/packingListUpdate/inputCheck'],
			    ['register',                   'POST', 'resources/shipping/packingListUpdate/update'],
			    ['excel',                      'GET',  'resources/shipping/packingListUpdate/search', 'excel'],
				// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start
	            ['getTagLabelReportIdList',    'POST', 'resources/shipping/packingListUpdate/getTagLabelReportIdList'],
	            ['printTagLabel',              'POST', 'resources/shipping/packingListUpdate/printTagLabel']
				// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End
			]
		),
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
		zip: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		)
		// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate
 *
 * @description
 * 梱包明細修正画面コントローラ
 */
// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
.controller('PackingListUpdate', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'multiTextControl', 'owsHistory', 'owsCommon', 'userInfo','statusInfo', 'modalFactory', 'printFactory', 'packingListUpdateApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, multiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {
// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
	//グリッドの列情報（デザイン用）
	$scope.packingListCols =
		[
		 	//荷主センタ変更対応 2017.01.20 sja Start
		    {field:"centerCd", displayName:"センタCD."},
		    {field:"centerNm", displayName:"センタ名称"},
		    {field:"clientCd", displayName:"荷主CD"},
		    {field:"clientNm", displayName:"荷主名称"},
		 	//荷主センタ変更対応 2017.01.20 sja End
		    {field:"boxNo", displayName:"荷材No."},
		    {field:"boxCd", displayName:"荷材CD"},
		    {field:"boxNm", displayName:"荷材名称"},
		    {field:"productCd", displayName:"商品"},
		 // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
		    {field:"janCd", displayName:"JANCD"},
		 // [ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
		    {field:"productNm", displayName:"商品名称"},
		    {field:"productAbbr", displayName:"商品略称"},
		    {field:"packingNumSum", displayName:"投入数"},
		    {field:"shippingPackingNo", displayName:"出荷梱包No."}
		];
    /**
     * @ngdoc method
     * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#initScreen
     * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
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

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		$scope.clientFocus = function() {
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.packingList.indexOf(row) > -1) {
					selectedRowIndex = $scope.packingList.indexOf(row);
				}
			});
		};

		$scope.clientBlur = function() {
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.packingList.indexOf(row) > -1) {
					selectedRowIndex = $scope.packingList.indexOf(row);
				}
			});
		};

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'packingList',
			columnDefs: 'packingListCols',
	        afterSelectionChange: function(rowItem, event) {
	        	$scope.select.boxCd = rowItem.entity.boxCd;
	        	$scope.select.boxNo = rowItem.entity.boxNo;
	        	$scope.select.pickNumSel = rowItem.entity.packingNumSum;
	    		var productCd = rowItem.entity.productCd;
	    		var totalPackNumByProduct = 0;
	    		for (var rows = 0; rows < $scope.packingList.length; rows++) {
	    			if ( $scope.packingList[rows].productCd == productCd ) {
	    				totalPackNumByProduct = owsCommon.add(totalPackNumByProduct, $scope.packingList[rows].packingNumSum);
	    				// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
	    				$scope.select.unitNumBreakdown = $scope.packingList[rows].unitNumBreakdown;
	    				$scope.select.product = $scope.packingList[rows].productDto;
	    				// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End
	    			}
	    		}
	    		$scope.select.allocNum = rowItem.entity.pickingNumSum;
	    		$scope.select.pickNum = totalPackNumByProduct;
	    		$scope.select.diffNum = owsCommon.subtract(rowItem.entity.pickingNumSum, totalPackNumByProduct);
	    		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
				// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				multiTextControl.setMultiText($scope, 'multiTextOptions', 'pickNumSel', 'pickNumSelMultiText', $scope.select.product.productId);
				// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Delete
				owsCommon.syncExec(function() {
					owsCommon.getCalcAuxiliaryBreakdown($scope, $scope.select.pickNumSel, "multiTextOptions", "pickNumSel");
				});
				// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
	        },
			showSelectionCheckbox: false
		});

		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
		var multiTextModels = owsCommon.getMultiTextModels(4);
		$scope.multiTextOptions = {
				// 複数荷姿用itemCdを定義
				id: "pickNumSelMultiText",
				// 総数用itemCdを定義
				"pickNumSel" : {
					// 画面表示用の複数荷姿リストmodel
					model : angular.copy(multiTextModels),
					// 商品に紐付く商品荷姿リストmodel
					listModel : "select.product.mproductShapeList"
				}
		};
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End

		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

    /**
     * @ngdoc method
     * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#initScreenHttp
     * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
     *
     * @description
     * 画面初期化用の通信制御処理<br>
     * ・初期化データ取得処理の実行設定<br>
     */
	$scope.initScreenHttp = function() {
		//各種通信用関数を配列で指定
		$q.all(
				[
				 //$scope.deferredGetBox(),
				])
		//全通信終了後に以下関数で各種設定を実行
		.then(function(response){
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add Start
		multiTextControl.clearMultiText($scope, 'multiTextOptions', 'pickNumSel', 'pickNumSelMultiText', null);
		// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add End
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#deferredGetForeignFlg
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 外貨フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBox = function () {
		var deferred = $q.defer();

		var request = {};
	 	//荷主センタ変更対応 2017.01.20 sja Start
//		request.centerCd = userInfo.centerCd;
		if ($scope.search) {
			request.centerCd = $scope.search.mcenter.centerCd;
		} else {
			request.centerCd = userInfo.centerCd;
		}
	 	//荷主センタ変更対応 2017.01.20 sja End

		api.boxList.query(request).then(function(response){
			$scope.boxList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#deferredGetForeignFlg
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 外貨フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetDelivTZ = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DELIV_TZ";

		owsCommon.getDataCacheable(api.delivTzList, "keyValueList", request).then(function(response){
			$scope.delivTzList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#deferredGetForeignFlg
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 外貨フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetBoxNo = function () {
		// [検査-189][ON推-品向-405][ON推-品向-406] クエリストリングのオーバーフロー対応 2014.12.05 kawana Start
        var maxBoxNo = 0;
		for (var row = 0; row < $scope.packingList.length; row++) {

			var boxNo = parseInt($scope.packingList[row].boxNo);

			if(maxBoxNo < boxNo){

				maxBoxNo = boxNo;
			}
		}
		var deferred = $q.defer();

		var request = {};
		request.maxBoxNo = maxBoxNo;
		// [検査-189][ON推-品向-405][ON推-品向-406] クエリストリングのオーバーフロー対応 2014.12.05 kawana End

		owsCommon.getDataCacheable(api.boxNoList, "keyValueList", request).then(function(response){
			$scope.boxNoList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	$scope.deferredGetBoxNoAdd = function () {
		// [検査-189][ON推-品向-405][ON推-品向-406] クエリストリングのオーバーフロー対応 2014.12.05 kawana Start
        var maxBoxNo = 0;
		for (var row = 0; row < $scope.boxNoList.length; row++) {

			var boxNo = parseInt($scope.boxNoList[row].boxNoCd);

			if(maxBoxNo < boxNo){

				maxBoxNo = boxNo;
			}
		}
		var deferred = $q.defer();

		var request = {};
		request.maxBoxNo = maxBoxNo;
		// [検査-189][ON推-品向-405][ON推-品向-406] クエリストリングのオーバーフロー対応 2014.12.05 kawana End

		owsCommon.getDataCacheable(api.boxNoList, "keyValueList", request).then(function(response){
			$scope.boxNoList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#deferredGetInitData
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 梱包明細修正初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.packingList.init().then(function(response){
			$scope.search = response.data.search;
			$scope.packingList = response.data.list;
			$scope.footer = response.data.footer;
			$scope.footerOld = response.data.footerOld;
			$scope.select = response.data.select;
			$scope.setEnabled(true);
			// ログイン情報より初期値を設定
			$scope.search.mclient.clientCd = userInfo.clientCd;
			$scope.search.mcenter.centerCd = userInfo.centerCd;

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#search
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 * ・検索処理呼び出し
	 */
	$scope.searchlist = function(){
		$scope.getSearchData();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#getSearchData
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * データ取得処理<br>
	 *
	 * サーバとの通信を行い、データを取得する。
	 */
	$scope.getSearchData = function(pageSize, page) {
		var request = {};
		request.data = {};
		request.data.search = $scope.search;

		api.packingList.search(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				$scope.setSearchData(response, page, pageSize);
			}
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#setSearchData
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response, page, pageSize) {
		//選択状態をクリアする
		owsCommon.toggleSelectAll($scope.gridOptions, false);

		// [ON推-品向-334] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-334] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.setEnabled(false);
		$scope.packingList = response.data.list;
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		$scope.boxNoMap = response.data.boxNoMap;
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
		$scope.footer = response.data.footer;
		$scope.footerOld = response.data.footerOld;
		$scope.select = response.data.select;
		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana Start
	    $scope.tagLabelPrintFlg = response.data.tagLabelPrintFlg;
	    // [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana End
		$scope.deferredGetBoxNo();
	    $scope.deferredGetDelivTZ();
	    $scope.deferredGetBox();
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod Start
		// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
		multiTextControl.setMultiText($scope, 'multiTextOptions', 'pickNumSel', 'pickNumSelMultiText', $scope.select.product.productId);
		// [#3486][Ver3.0] サブテキスト表示モード追加 2018.02.23 honma Mod End
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#addRow
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 追加・更新ボタン押下処理。
	 */
	$scope.addRow = function(){
		// [EC-CT1-112] 選択部の「投入数」、「アイテム別梱包状況・出荷指示数」、「アイテム別梱包状況・投入数」と「アイテム別梱包状況・差異数」に空で表示変更 2015.03.11 kyo Start
		$scope.select.pickNum = null;
		$scope.select.allocNum = null;
		$scope.select.diffNum = null;
		// [EC-CT1-112] 選択部の「投入数」、「アイテム別梱包状況・出荷指示数」、「アイテム別梱包状況・投入数」と「アイテム別梱包状況・差異数」に空で表示変更 2015.03.11 kyo End
		owsCommon.syncExec(function() {
			// [EC-CT1-111] フォームを分ける修正 searchinputform →inputform 2015.03.11 kyo Start
			var isError = $scope.inputform.$invalid;
			// [EC-CT1-111] フォームを分ける修正 searchinputform →inputform 2015.03.11 kyo End
			// エラーがある場合、フォーカスを当てる
			if (isError) {
				// [EC-CT1-111] フォームを分ける修正 searchinputform →inputform 2015.03.11 kyo Start
				directiveControl.firstErrorOnFocus('inputform');
				// [EC-CT1-111] フォームを分ける修正 searchinputform →inputform 2015.03.11 kyo End
				return;
			}
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
				alertMessage.setErrorMessageByCode("lineNotSelectError");
				return;
			}
			var add = 0;
			var reSet = 0;
			var rowIndex = 0;
			var boxNo = $scope.select.boxNo;
			var boxCd = $scope.select.boxCd;
			var pickNumSel = $scope.select.pickNumSel;
			if ( boxNo == null ) {
				optionMessageControl.show($scope, 'boxNo', owsCommon.convertMessage('requiredError'));
				error = true;
			}
			if ( boxCd == null ) {
				optionMessageControl.show($scope, 'boxCd', owsCommon.convertMessage('requiredError'));
				error = true;
			}
			if ( owsCommon.isZeroOrLess(pickNumSel) ) {
				optionMessageControl.show($scope, 'pickNumSel', owsCommon.convertMessage('numericValueInputRequestMoreThanOneError'));
				error = true;
			}
			if ( error ) {
				return;
			}

			var listIndex = 0;
			for (var row = 0; row <  $scope.boxList.length; row++) {
				if ($scope.boxList[row].boxCd == $scope.select.boxCd) {
					listIndex = row;
				}
			}

			var boxNm = $scope.boxList[listIndex].boxNm;
			var list = [];
			var newPackingList = [];
			var addList = [];
			var error = false;
			var exist = 0;
			angular.forEach($scope.gridOptions.gridApi.selection.getSelectedRows(), function(row) {
				if ($scope.packingList.indexOf(row) > -1) {
					rowIndex = $scope.packingList.indexOf(row);
				}
			});

			if ( owsCommon.isGreaterThan(pickNumSel, $scope.packingList[rowIndex].packingNumSum) ) {
				alertMessage.setErrorMessageByCode("packingQtyCannotInputMoreThanAlowedQtyError");
				return;
			}

			// [検査-154] 同じ箱CDの場合はエラーを表示（条件間違い修正） 2014.12.01 kawana Start
			if ( boxNo == parseInt($scope.packingList[rowIndex].boxNo) && boxCd == $scope.packingList[rowIndex].boxCd ) {
			// [検査-154] 同じ箱CDの場合はエラーを表示（条件間違い修正） 2014.12.01 kawana End
				alertMessage.setErrorMessageByCode("boxTypeAndShapeClassCannotSelectSameError");
				return;
			}

			if ( boxNo == parseInt($scope.packingList[rowIndex].boxNo) && owsCommon.isNotEqual(pickNumSel, $scope.packingList[rowIndex].packingNumSum) ) {
				alertMessage.setErrorMessageByCode("packingQtyCannotChangeSameBoxTypeError");
				return;
			}

			for (var row = 0; row < $scope.packingList.length; row++) {
				if ( boxNo == $scope.packingList[row].boxNo ) {
					if ( boxCd == $scope.packingList[row].boxCd ) {
						if ( $scope.packingList[row].productCd == $scope.packingList[rowIndex].productCd ) {
							add = 0;
							$scope.packingList[row].packingNumSum = owsCommon.add($scope.packingList[row].packingNumSum, pickNumSel);
							$scope.packingList[row].updateRow = "1";
							break;
						} else {
							add = 1;
						}
					} else {
						if ( $scope.packingList[row].productCd == $scope.packingList[rowIndex].productCd ) {
							$scope.packingList[row].boxCd = boxCd;
							$scope.packingList[row].boxNm = boxNm;
							$scope.packingList[row].packingNumSum = owsCommon.add($scope.packingList[row].packingNumSum, pickNumSel);
							$scope.packingList[row].updateRow = "1";
							exist = 1;
							add = 0;
						} else {
							$scope.packingList[row].boxCd = boxCd;
							$scope.packingList[row].boxNm = boxNm;
							$scope.packingList[row].updateRow = "1";
							if (exist != 1) {
								add = 1;
							}
						}
					}
				} else {
					if (exist != 1) {
						add = 1;
					}
				}
			}
			$scope.packingList[rowIndex].packingNumSum = owsCommon.subtract($scope.packingList[rowIndex].packingNumSum, pickNumSel);
			$scope.packingList[rowIndex].updateRow = "1";
			if ( add == 1 ) {
				$scope.packingList.push(angular.copy($scope.packingList[rowIndex]));
				$scope.packingList[$scope.packingList.length - 1].boxNo = boxNo;
				$scope.packingList[$scope.packingList.length - 1].boxCd = boxCd;
				$scope.packingList[$scope.packingList.length - 1].boxNm = boxNm;
				$scope.packingList[$scope.packingList.length - 1].updateRow = "1";
				$scope.packingList[$scope.packingList.length - 1].packingNumSum = pickNumSel;
				$scope.packingList[$scope.packingList.length - 1].shippingPackingNo = "";
			}
			if ( $scope.select.boxNo == $scope.boxNoList[$scope.boxNoList.length - 1].boxNoCd ) {
				$scope.deferredGetBoxNoAdd();
			}

			$scope.gridOptions.selectRow(rowIndex, false);
			$scope.select.boxNo = null;
			$scope.select.boxCd = null;
			// [EC-CT1-113] 投入数を修正した後、選択部の「投入数」、「アイテム別梱包状況・出荷指示数」、「アイテム別梱包状況・投入数」と「アイテム別梱包状況・差異数」に空で表示変更 2015.03.11 kyo Start
			$scope.select.pickNumSel = null;
			$scope.select.allocNum = null;
			$scope.select.pickNum = null;
			$scope.select.diffNum = null;
			// [EC-CT1-113] 投入数を修正した後、選択部の「投入数」、「アイテム別梱包状況・出荷指示数」、「アイテム別梱包状況・投入数」と「アイテム別梱包状況・差異数」に空で表示変更 2015.03.11 kyo End
		});
	};

	// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 小数有無フラグを加味した小数点チェック処理関連を削除 2018.02.19 honma Delete

	//[Ver3.0] unit of measure対応 2017.12.25 ライ END
	$scope.packingListUpdate = function(){
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
		// [EC-CT1-114] [Grid制御用の変数が初期化されていません。]のエラーを解消するため、削除する 2015.03.11 kyo Start
		//gridOptionMessageControl.hideAll($scope.gridOptions);
		// [EC-CT1-114] [Grid制御用の変数が初期化されていません。]のエラーを解消するため、削除する 2015.03.11 kyo End

		// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示(不要な確認メッセージを削除) 2016.06.21 kawana

		// 画面内容を引数に設定
		if ( $scope.footer.delivCustomerNm != $scope.footerOld.delivCustomerNm
		     || $scope.footer.delivZipCd != $scope.footerOld.delivZipCd
		     || $scope.footer.delivTelNo != $scope.footerOld.delivTelNo
		     || $scope.footer.delivAddress1 != $scope.footerOld.delivAddress1
		     || $scope.footer.delivAddress2 != $scope.footerOld.delivAddress2
		     || $scope.footer.delivAddress3 != $scope.footerOld.delivAddress3
		     || $scope.footer.delivDt != $scope.footerOld.delivDt
		     || $scope.footer.delivTz != $scope.footerOld.delivTz) {

			$scope.footer.isChanged = true;
		}
		var request = {};
		request.data = {};
		request.data.list = $scope.packingList;
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		request.data.boxNoMap = $scope.boxNoMap
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End
		request.data.search = $scope.search;
		request.data.footer = $scope.footer;
		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] Start
		request.data.select = $scope.select;
		// 20141030 SJA_XU 追加 [ON推-CT4-017対応] End
		// 入力チェック
		api.packingList.inputCheck(request).then(function(response) {

			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana Start
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				return;
			}
			// [1.1.4-CT-104] 梱包荷材が設定されていない場合はエラー表示 2016.06.21 kawana End

			// ゾーンマスタデータ登録または更新
			api.packingList.register(request).then(function(response){

				// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana Start

				// 処理結果確認
				// [EC-CT1-111] フォームを分ける修正 searchinputform →inputform 2015.03.11 kyo Start
				if (!statusInfo.isSuccess(response)) {
					statusInfo.isSuccessAndShowMessage(response, 'inputform');
					// [EC-CT1-111] フォームを分ける修正 searchinputform →inputform 2015.03.11 kyo End
					return;
				}

				// 荷札出力後処理
				var successFunc = function() {

					// 正常メッセージ表示
					statusInfo.isSuccessAndShowMessage(response, 'inputform');

					// 初期化
					$scope.boxNoList = [];
					$scope.initScreenHttp();
				};

				// 荷札出力実行
				$scope.printTagLabel(successFunc);
				// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana End
			});
		});
	};

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#printTagLabel
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 荷札発行処理<br>
	 *
	 * 荷札出力フラグが1の場合は荷札発行処理をする。
	 */
	$scope.printTagLabel = function(successFunc) {

		if ($scope.tagLabelPrintFlg != 1) {
			successFunc();
			return;
		}

		var request = {};
		request.data = {};
		request.data.centerId = userInfo.centerIdByCd($scope.search.mcenter.centerCd);
		request.data.clientId = userInfo.clientIdByCd($scope.search.mclient.clientCd);
		request.data.targetNo = $scope.search.pickingWorkNo;
		request.data.isShippingPackingNo = false;

		// ===== 帳票IDを取得・設定 =====
		api.packingList.getTagLabelReportIdList(request).then(function(response) {
			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				successFunc();
				return;
			}
			$scope.listReportId = response.data.listReportId;

			printFunc(successFunc);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#printFunc
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 荷札発行処理の印刷実行メソッド<br>
	 *
	 * このメソッドは荷札発行処理から呼ばれる。
	 */
	var printFunc = function(successFunc) {

		if ($scope.listReportId.length > 0) {
			reportId = $scope.listReportId.shift();
		}

		// プリンタ選択画面を表示
		var modalParam = {};
		modalParam.reportId = reportId;
		var modalInstance = printFactory.modalPrint(modalParam);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(printParam) {
			var request = {};
			request.data = {};
			request.data.centerId = userInfo.centerIdByCd($scope.search.mcenter.centerCd);
			request.data.clientId = userInfo.clientIdByCd($scope.search.mclient.clientCd);
			request.data.targetNo = $scope.search.pickingWorkNo;
			request.data.isShippingPackingNo = false;
			request.printBasicData = printParam.printBasicData;

			var subWindow;
			if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
				subWindow = owsCommon.viewPdfBlankWindow();
			}

			// 発行
			api.packingList.printTagLabel(request).then(function(response) {

				if (!statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
					// 異常

					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
					successFunc();
					return;
				}


				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {

					// プレビュー表示
					if(!response.output.listDownloadUrl
						|| response.output.listDownloadUrl == null
						|| response.output.listDownloadUrl.length < 1) {
						// 通常

						subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
					} else {
						// 複数帳票

						var listDownloadUrl = response.output.listDownloadUrl;
						subWindow = owsCommon.viewPdf(subWindow, listDownloadUrl.shift());
						while (0 < listDownloadUrl.length) {
							owsCommon.viewPdf(null, listDownloadUrl.shift());
						}
					}
				}


				if ($scope.listReportId.length > 0) {
					// 次の帳票IDを発行
					printFunc(successFunc);
				} else {
					// 正常終了処理
					successFunc();
				}
			}).catch(function(response) {
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfCloseWindow(subWindow);
				}
				successFunc();
			});
		},
		function(printParam){
			successFunc();
		});
	};

	// [#199][C-CWMS-0058] 荷札出力機能追加 2016.11.28 kawana End

	// [#76][C-CWMS-0067] クリアボタン追加 2016.11.02 kawana Start

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#clear
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * クリア処理<br>
	 *
	 * 確認メッセージを表示し、画面を初期化する。
	 */
	$scope.clear = function() {

		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		// 確認でOKを選択された場合は、処理を進める。
		if (!owsCommon.viewConfirm("packingUpdateClearConfirmation")) {
			return;
		}

		// 初期化
		$scope.boxNoList = [];
		$scope.initScreenHttp();

		// 完了メッセージ表示
		alertMessage.setInfoMessageByCode("packingUpdateClearCompletedInformation");
	};

	// [#76][C-CWMS-0067] クリアボタン追加 2016.11.02 kawana End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#getClassForRow
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 入荷ステータスに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		if (owsCommon.isZero(row.entity.packingNumSum)) {
			return "wmslegendred";
		} else if (row.entity.updateRow == "0") {
			return "wmslegendwhite";
		} else if (row.entity.updateRow == "1") {
			return "wmslegendcyan";
		}
		return "";
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#showLocation
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 郵便番号検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
	 */
	$scope.zipclick = function(index){
        var inZipCd;
        inZipCd = $scope.footer.delivZipCd;

		var items = {
				zipCd: inZipCd
		};

		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.footer.delivZipCd = selectedItem.zipCd;
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
			if((($scope.footer.delivAddress1 == null) || ($scope.footer.delivAddress1 == "")) &&
				(($scope.footer.delivAddress2 == null) || ($scope.footer.delivAddress2 == "")) &&
				(($scope.footer.delivAddress3 == null) || ($scope.footer.delivAddress3 == ""))
				){
				$scope.footer.delivAddress1 = selectedItem.address1;
				$scope.footer.delivAddress2 = selectedItem.address2;
				$scope.footer.delivAddress3 = selectedItem.address3;
			}
			// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End
		});
	};

	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#zipCdBlur
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * 郵便番号のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、郵便番号マスタの情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function() {

		// 入力された郵便コードを取得
		var zipCd = $scope.footer.delivZipCd;

		if((($scope.footer.delivAddress1 == null) || ($scope.footer.delivAddress1 == "")) &&
				(($scope.footer.delivAddress2 == null) || ($scope.footer.delivAddress2 == "")) &&
				(($scope.footer.delivAddress3 == null) || ($scope.footer.delivAddress3 == ""))
				){

			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.zip.record(request).then(function(response){
					$scope.footer.delivAddress1 =  response.data.mZip.address1;
					$scope.footer.delivAddress2 =  response.data.mZip.address2;
					$scope.footer.delivAddress3 =  response.data.mZip.address3;
				});
			}
		};
	};
	// [#250][ONEsLOGI Cloud/WMS バグ・品質向上対策] アシスト機能不具合修正 2016.11.16 shimizu End

	$scope.setEnabled = function(bln) {
		var notBln = false;
		if (bln) {
			notBln = false;
		} else {
			notBln = true;
		}
		directiveControl.editable($scope, 'clientCd', bln);
		directiveControl.editable($scope, 'centerCd', bln);
		directiveControl.editable($scope, 'pickingWorkNo', bln);

		directiveControl.editable($scope, 'boxNo', notBln);
		directiveControl.editable($scope, 'boxCd', notBln);
		directiveControl.editable($scope, 'pickNumSel', notBln);
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start
		directiveControl.editable($scope, 'pickNumSel', notBln);
		for (var i = 0; i < 4; i++) {
			// 編集可能処理用調整総数荷姿IDの作成
			var wkMultiTextCd = 'pickNumSelMultiText' + (i + 1);
			directiveControl.editable($scope, wkMultiTextCd, notBln);
		}
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End
		directiveControl.editable($scope, 'delivCustomerNm', notBln);
		directiveControl.editable($scope, 'delivZipCd', notBln);
		directiveControl.editable($scope, 'delivTelNo', notBln);
		directiveControl.editable($scope, 'delivAddress1', notBln);
		directiveControl.editable($scope, 'delivAddress2', notBln);
		directiveControl.editable($scope, 'delivAddress3', notBln);
		directiveControl.editable($scope, 'delivDt', notBln);
		directiveControl.editable($scope, 'delivTz', notBln);
		directiveControl.editable($scope, 'isChanged', notBln);
		directiveControl.editable($scope, 'addRow', notBln);
		// [ON推-品向-557] Excel出力ボタンの位置変更によりボタン制御から削除 2015.01.15 kawana
		directiveControl.editable($scope, 'packingListUpdate', notBln);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingListUpdate.object:PackingListUpdate#excelOutput
	 * @methodOf oneslogiWms.PackingListUpdate.object:PackingListUpdate
	 *
	 * @description
	 * Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.search;

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.packingList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};


	//画面初期化処理を実行
	$scope.initScreen();

}]);
