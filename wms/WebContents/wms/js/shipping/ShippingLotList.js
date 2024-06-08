/**
 * @ngdoc overview
 * @name oneslogiWms.ShippingLotList
 *
 * @description
 * 出荷期限管理一覧画面
 */
angular.module('oneslogiWms.ShippingLotList',[])
/**
 * @ngdoc service
 * @name oneslogiWms.ShippingLotList.service:shippingLotListApi
 *
 * @description
 * ShippingLotListWebApi定義<br>
 * ・resources/class/shippingLotList ドロップダウンリスト用データ取得用WebApi<br>
 * ・resources/shipping/shippingLotList/initNew 初期化用WebApi<br>
 * ・resources/shipping/shippingLotList/search 検索用WebApi<br>
 * ・resources/shipping/shippingLotList/update 修正用WebApi<br>
 *
 */

.factory('shippingLotListApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		shippingLotList: AngularAPIClient.make(
				[
				 ['initNew',   'GET', 'resources/shipping/shippingLotList/initNew'],
				 ['search', 'GET', 'resources/shipping/shippingLotList/search'],
				 ['excel',  'GET', 'resources/shipping/shippingLotList/search', 'excel'],
				 ['update',  'GET', 'resources/shipping/shippingLotList/update'],
				 ['inputCheck',  'POST', 'resources/shipping/shippingLotList/inputCheck']
				 ]
		),
		product : AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/product/record']
				 ]
		),
		deliveryCustomer: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCustomer/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ShippingLotList.object:ShippingLotList
 *
 * @description
 * 出荷期限管理画面コントローラ
 */
.controller('ShippingLotList', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo','modalFactory', 'shippingLotListApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo,statusInfo, modalFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.shippingLotListCols =
		[
        //荷主センタ変更対応 2017.02.08 sja Start
         {field:"mproduct.mclient.clientCd", displayName:"荷主CD"},
         {field:"mproduct.mclient.clientNm", displayName:"荷主名称"},
        //荷主センタ変更対応 2017.02.08 sja End
		 {field:"mproduct.productCd", displayName:"商品CD"},
		 {field:"mproduct.productNm", displayName:"商品名称"},
		 {field:"mproduct.productAbbr", displayName:"商品略称"},
		//[ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana Start
		 {field:"mproduct.janCd", displayName:"JANCD"},
		//[ON推-品向-389] JANCDを半角に変更 2014.12.02 kawana End
		 {field:"mcustomer.customerCd", displayName:"納品先CD"},
		 {field:"mcustomer.customerNm", displayName:"納品先名称"},
		 {field:"mcustomer.customerAbbr", displayName:"納品先略称"},
		 {field:"shippingDt", displayName:"出荷日"},
		 {field:"tlot.limitDt", displayName:"最終出荷期限日"},
		 {field:"tlot.lot", displayName:"最終出荷ロット"}

		 ];
	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#initScreen
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
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

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeEntryGridOptions({
			data: 'shippingLotList',
			columnDefs: 'shippingLotListCols',
		});

		// グリッド内のプルダウンの関連付けを以下のJSON形式で行う。列名をキーとし、モデルを設定
		$scope.gridSelectOptions = {
				"clientCd" : {
					key : "clientCd",
					value : "cilentNm",
					listModel : "clientList"
				}
				// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18
		};
		// グリッドの荷材にロストフォーカスイベントを設定
		$scope.gridEventOptions = {
				"tlot.limitDt":{
					"ng-change":{
						eventFunction:"limitDtChange(row.rowIndex)"
					}
				},
				"tlot.lot":{
					"ng-change":{
						eventFunction:"lotChange(row.rowIndex)"
					}
				},
		};

		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tlot.lot",4, 2);
		// [#5820][v3.1] ロットのみに未存在エラーが表示される不具合を修正 2019.01.09 kawana Start
		statusInfo.mappingGridErrorMessage($scope.gridOptions, "tlot.limitDt",4, 2);
		// [#5820][v3.1] ロットのみに未存在エラーが表示される不具合を修正 2019.01.09 kawana End
		//画面初期化用通信処理を実行
		$scope.initScreenHttp();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#initScreenHttp
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
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
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#limitDtChange
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * 最終出荷期限日のロストフォーカス処理<br>
	 * 最終出荷期限日と最終出荷ロットロストフォーカス時の処理。
	 */
	$scope.limitDtChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	$scope.lotChange = function(rowIndex) {
		$scope.gridOptions.gridApi.selection.selectRowByVisibleIndex(rowIndex);
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#deferredGetInitData
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * 出荷期限管理初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		api.shippingLotList.initNew().then(function(response){
			$scope.head = response.data.head;
			$scope.shippingLotList = response.data.body;
			// 空行用のオブジェクト
			$scope.blankRow = response.data.blankRow;
			// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana
			$scope.head.clientCd = userInfo.clientCd;

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

	// 現在行の各項目への制御処理
	var productManagCurrentRow = function(rowIndex, lotManagFlg) {
		if (lotManagFlg == "1") {
			gridDirectiveControl.editable($scope.gridOptions, 'tlot.lot', true, rowIndex);

		} else {
			gridDirectiveControl.editable($scope.gridOptions, 'tlot.lot', false, rowIndex);
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#showCustomer
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * 納品先CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された納品先情報を取得し画面項目に反映する。
	 */
	$scope.showCustomer = function(rowIndex) {

		var items = {
				clientCd: $scope.head.clientCd,
				deliveryCd: $scope.head.mcustomer.customerCd
		};

		// 取引先マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalDelivery(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem) {
			$scope.head.mcustomer.customerCd = selectedItem.customerCd;
			$scope.head.mcustomer.customerNm = selectedItem.customerNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#customerCdBlur
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * 納品先CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、納品先情報を取得し画面項目に反映する。
	 */
	$scope.customerCdBlur = function(rowIndex) {
		// 入力された納品先CDを取得
		var customerCd = $scope.head.mcustomer.customerCd;

		if (customerCd && 0 < customerCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.clientCd);
			request.customerCd = customerCd;

			api.deliveryCustomer.record(request).then(function(response){
				$scope.head.mcustomer.customerNm= response.data.mCustomer.customerNm;
			});

		} else {
			$scope.head.mcustomer.customerNm  = null;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#showProduct
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * 商品CD検索ボタン押下処理<br>
	 *
	 * 検索画面を表示し、選択された商品情報を取得し画面項目に反映する。
	 */
	$scope.showProduct = function(rowIndex) {

		var items = {
				clientCd: $scope.head.clientCd,
				productCd: $scope.head.mproduct.productCd
		};

		// 商品マスタのモーダル画面を表示
		var modalInstance = modalFactory.modalProduct(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			$scope.head.mproduct.productCd = selectedItem.productCd;
			$scope.head.mproduct.productNm = selectedItem.productNm;
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#productBlur
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * 商品CDのロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、商品情報を取得し画面項目に反映する。
	 */
	$scope.productCdBlur = function(rowIndex) {
		// 入力された商品CDを取得
		var productCd = $scope.head.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.clientId = userInfo.clientIdByCd($scope.head.clientCd);
			request.productCd = productCd;

			api.product.record(request).then(function(response){
				$scope.head.mproduct.productNm = response.data.mProduct.productNm;
			});

		} else {
			$scope.head.mproduct.productNm = null;
		}
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#search
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
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
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#getSearchData
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
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

		api.shippingLotList.search(request).then(function(response) {
			statusInfo.isSuccessAndShowMessage(response,'searchinputform');
			$scope.setSearchData(response);
		});
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#setSearchData
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
	 *
	 * @description
	 * データ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		//選択状態をクリアする
		// [ON推-品向-583] 明細 ヘッダー行の選択 2015.05.20 ki Start
		owsCommon.toggleSelectAll($scope.gridOptions, false);
		// [ON推-品向-583] 明細 ヘッダー行の選択 2015.05.20 ki End

		// [ON推-品向-331] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita Start
		$scope.gridOptions.gridViewport.scrollTop(0);
		// [ON推-品向-331] 検索ボタン押下後のスクロール位置を上に戻す処理を追加 2014.11.28 horita End

		//取得したデータをグリッドに表示
		$scope.shippingLotList = response.data.body;
		// 商品の在庫関連情報の入力可否制御
		for (var row = 0; row < $scope.shippingLotList.length; row++) {
			productManagCurrentRow(row, $scope.shippingLotList[row].mproduct.lotManagFlg);
		}

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.head);
	};

	// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana

	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#excelOutput
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
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
		owsCommon.setOutputOptions(request, $scope.gridOptions, "body", document.title);

		api.shippingLotList.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				location.href = response.output.downloadUrl;
			}else{
				$scope.setSearchData(response);
			}
		});

	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.shippingLotList.object:shippingLotList#register
	 * @methodOf oneslogiWms.shippingLotList.object:shippingLotList
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

		var allBody = $scope.gridOptions.gridApi.grid.rows;
		for (var row = 0; row < $scope.shippingLotList.length; row++) {
			if (gridDirectiveControl.isBlankRow($scope.gridOptions, row)) {
				if($scope.gridOptions.getSelection(allBody[row]) == true){
					listBody.push($scope.shippingLotList[row]);
				}else{
					// 空行への検証機能を解除
					gridDirectiveControl.validity($scope.gridOptions, false, row);
					// 空行を退避
					emptyBody.push($scope.shippingLotList[row]);
				}
			}else if (row <= allBody.length && ($scope.gridOptions.getSelection(allBody[row]) == false)) {
				// 未選択行への検証機能を解除
				gridDirectiveControl.validity($scope.gridOptions, false, row);
				// 未選択行を退避
				emptyBody.push($scope.shippingLotList[row]);
			}else {
				// 空行以外を退避
				listBody.push($scope.shippingLotList[row]);
			}
		}

		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
		var promiseAll = $q.all([
		                         gridDirectiveControl.isValidCheckAllRows($scope.gridOptions,$scope.searchinputform)
		                         ]);

		promiseAll.then(function(){
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
			owsCommon.syncExec(function() {
				var isError = $scope.searchinputform.$invalid;

				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
				// 空行への検証機能を有効にする
				gridDirectiveControl.validity($scope.gridOptions, true);
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

				// 入力データ無し
				if ($scope.shippingLotList.length == 0) {
					alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
					return;
				}

				// 選択対象無し
				if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
					alertMessage.setErrorMessageByCode("lineNotSelectError");
					return;
				}

				// 空行を削除
				angular.forEach(emptyBody, function(row) {
					$scope.shippingLotList.splice($scope.shippingLotList.indexOf(row), 1);
				});

				// [#1517] 出荷期限日一覧の不要な項目 (行No、センタCDを削除) 2017.04.18 kawana

				var errAry2 = new Array();
				var err1 = "lotNotInputLotManagementProductError";
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
				var firstErrIndex;
				// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

				for (var row = 0; row < $scope.shippingLotList.length; row++) {
					if ($scope.shippingLotList[row].mproduct.lotManagFlg == "1"){
						if(!($scope.shippingLotList[row].tlot.lot) || 0 == $scope.shippingLotList[row].tlot.lot.length) {
							errAry2.length ++;
							if (!gridOptionMessageControl.isShow($scope.gridOptions, "tlot.lot", row)) {
								if (!gridOptionMessageControl.isShow($scope.gridOptions, "tlot.lot", row)) {
									gridOptionMessageControl.show($scope.gridOptions, "tlot.lot", $filter('owfMessage')((2, err1)), row);
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
									if (!firstErrIndex) {

										// 現在の行を最初のエラー行に設定
										firstErrIndex = row;
									}
									// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
								}
							}
						}
					}

				}

				if (0 < errAry2.length) {
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
					// 最初のエラー箇所までスクロール
					gridDirectiveControl.scrollingByRowIndex($scope.gridOptions, firstErrIndex);
					// 最初のエラーにフォーカス
					directiveControl.firstErrorOnFocus('searchinputform');
					// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End
					return;
				}


				// 画面内容を引数に設定
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.body = listBody;

				// 入力チェック
				api.shippingLotList.inputCheck(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {

						// [#5820][v3.1] ロット管理しない商品はロット項目のエラーを非表示に設定 2019.01.09 kawana Start

						for (var row = 0; row < $scope.shippingLotList.length; row++) {

							if ($scope.shippingLotList[row].mproduct.lotManagFlg !== "1") {
	                    		// ロット管理なし
		                    	gridOptionMessageControl.hide($scope.gridOptions, "tlot.lot", row);
							}
						}

						// [#5820][v3.1] ロット管理しない商品はロット項目のエラーを非表示に設定 2019.01.09 kawana End

						// [#5820][v3.1] エラーの設定処理を削除 ($scope.initScreen)でエラー設定しているため不要 2019.01.09 kawana Delete

						return;
					}
					// 出荷期限管理データ登録または更新
					api.shippingLotList.update(request).then(function(response){
						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
							return;
						}

						// 初期化
						$scope.search();
					});

				});
			});
			// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA Start
		},
		// エラー時の処理
		function(){
			owsCommon.syncExec(function() {
				// 空行の検証機能を再開
				gridDirectiveControl.validity($scope.gridOptions, true);

				// [ON推-品向-859] エラー時の不要な処理を削除 2015.07.07 kawana
			});
		});
		// [ON推-品向-783] 入力系グリッドのチェックを修正する 2015.05.28 SJA End

	};

//	画面初期化処理を実行
	$scope.initScreen();

}]);



