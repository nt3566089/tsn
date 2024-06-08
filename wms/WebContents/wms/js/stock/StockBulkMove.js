	/**
	 * @ngdoc overview
	 * @name oneslogiWms.StockBulkMove
	 *
	 * @description
	 * 在庫一括移動指示画面
	 */
	angular.module('oneslogiWms.StockBulkMove',[])

	/**
	 * @ngdoc service
	 * @name oneslogiWms.StockBulkMove.service:stockBulkMoveApi
	 *
	 * @description
	 * 在庫一括移動指示WebApi定義<br>
	 * ・resources/stock/stockSetInst/init 初期処理WebApi<br>
	 * ・resources/stock/stockSetInst/getData データ取得処理WebApi<br>
	 * ・resources/stock/stockSetInst/register 指示処理WebApi<br>
	 *
	 */
	.factory('stockBulkMoveApi', ['AngularAPIClient', function(AngularAPIClient) {
		return {
			stockBulkMove: AngularAPIClient.make([
				['init',             'GET',  'resources/stock/stockBulkMove/init'],
				['getData',          'GET',  'resources/stock/stockBulkMove/getData'],
				['inputCheck',       'POST', 'resources/stock/stockBulkMove/inputCheck'],
				['register',         'POST', 'resources/stock/stockBulkMove/register'],
			]),
		};
	}])

	/**
	 * @ngdoc object
	 * @name oneslogiWms.StockBulkMove.service:stockBulkMove
	 * @description
	 * セット組指示画面コントローラ
	 */
	.controller('StockBulkMove', ['$scope', '$modalInstance', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'gridMultiTextControl','owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'stockBulkMoveApi', 'items', function($scope, $modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, gridMultiTextControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api, items) {

		// 構成品グリッドの列情報（デザイン用）
		$scope.listCols =
			[
				{field:"mproduct.productCd", displayName:"商品CD"},
				{field:"mproduct.productNm", displayName:"商品名称"},
				{field:"mlocation.locationCd", displayName:"ロケーションCD(From)"},
				{field:"mlocation.locationNm", displayName:"ロケーション名称"},
				{field:"moveLocationCd", displayName:"ロケーションCD(To)"},
				{field:"chargeNum", displayName:"在庫数"},
				{field:"unitNum", displayName:"ケース入数"},
				{field:"moveCaseNum", displayName:"移動ケース数"},
				{field:"movePieceNum", displayName:"移動ピース数"},
				{field:"moveInstNum", displayName:"移動総数"},
				{field:"mwarehouse.mcenter.centerCd", displayName:"センタCD"},
				{field:"mwarehouse.mcenter.centerNm", displayName:"センタ名称"},
				{field:"mclient.clientCd", displayName:"荷主CD"},
				{field:"mclient.clientNm", displayName:"荷主名称"},
				{field:"mcustomer.customerCd", displayName:"預託CD"},
				{field:"mcustomer.customerNm", displayName:"預託名称"},
				{field:"mstockType.stockTypeCd", displayName:"在庫区分CD"},
				{field:"mstockType.vdict.dictNm", displayName:"在庫区分名称"},
				{field:"tlot.lot", displayName:"ロット"},
				{field:"tlot.limitDt", displayName:"期限日"},
				{field:"tstoreNo.mcustomer.customerCd", displayName:"仕入先CD"},
				{field:"tstoreNo.mcustomer.customerNm", displayName:"仕入先名称"},
				{field:"tstoreNo.storeLabelNo", displayName:"入庫ラベルNo."},
				{field:"tstoreNo.tstoreNoSelf.storeLabelNo", displayName:"元入庫ラベルNo."},
				{field:"tstoreNo.storeDt", displayName:"入庫"}
			];

	    /**
	     * @ngdoc method
	     * @name oneslogiWms.StockBulkMove.service:stockBulkMove#initScreen
	     * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
	     *
	     * @description
	     * 画面初期化処理<br>
	     * ・検索条件枠を開いた状態に設定<br>
	     * ・グリッド設定<br>
	     * ・画面初期化用通信制御処理を呼び出し
	     */
		$scope.initScreen = function() {

			// 在庫一括移動指示グリッドの設定
			$scope.gridOptions = owsCommon.mergeEntryGridOptions({
				data: 'stockBulkMoveList',
				columnDefs: 'listCols'
			});

			// グリッドのロケーション列にボタンを設定
			$scope.gridButtonOptions = {
				"moveLocationCd":{
					clickFunction:"showLocation(row.rowIndex)"
				}
			};

			// グリッドのロケーション、移動ケース数、移動ピース数列にロストフォーカスイベントを設定
			$scope.gridEventOptions = {
				"moveLocationCd":{
					"ng-change":{
						eventFunction:"locationChange(row.rowIndex)"
					}
				},
				"moveCaseNum":{
					"ng-blur":{
						eventFunction:"moveNumBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"moveNumChange(row.rowIndex)"
					}
				},
				"movePieceNum":{
					"ng-blur":{
						eventFunction:"moveNumBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"moveNumChange(row.rowIndex)"
					}
				},
				// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ Start
				"moveInstNum":{
					"ng-blur":{
						eventFunction:"moveNumBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"moveNumChange(row.rowIndex)"
					}
				},
				// [#2799][Ver3.0] UoM対応 - 複数荷姿用在庫数チェック処理追加 2018.03.29 honma Add Start
				"moveInstNumMultiText":{
					"ng-blur":{
						eventFunction:"moveNumBlur(row.rowIndex)"
					},
					"ng-change":{
						eventFunction:"moveNumChange(row.rowIndex)"
					}
				}
				// [#2799][Ver3.0] UoM対応 - 複数荷姿用在庫数チェック処理追加 2018.03.29 honma Add End
			};		// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ END

			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ Start
			var multiTextModels = owsCommon.getMultiTextModels(4);
			$scope.multiTextOptions = {
					// 総数用colCdを定義
					"moveInstNum" : {
						// 複数荷姿用colCdを定義
						multiTextCd: "moveInstNumMultiText",
						// 画面表示用の複数荷姿リストmodel
						model : angular.copy(multiTextModels),
						// 商品に紐付く商品荷姿リストmodel
						listModel : "stockBulkMoveList.mproduct.mproductShapeList"
					}
			};
			$scope.gridMultiTextOptions = [];
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ End


			statusInfo.mappingGridErrorMessage($scope.gridOptions, "moveLocationCd", 2, 3);

			//画面初期化用通信処理を実行
			$scope.initScreenHttp();
		}

	    /**
	     * @ngdoc method
	     * @name oneslogiWms.StockBulkMove.service:stockBulkMove#initScreenHttp
	     * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
	     *
	     * @description
	     * 画面初期化用の通信制御処理<br>
	     * ・初期化データ取得処理の実行設定<br>
	     */
		$scope.initScreenHttp = function() {
			//全通信終了後に以下関数で各種設定を実行
			$q.all([
			])
			.then(function(response) {
				// 画面初期化データ設定（同期処理）
				return $scope.deferredGetInitData();
			});
			// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add Start
			gridMultiTextControl.clearMultiTextOptionsList($scope, 'gridMultiTextOptions');
			// [#4075][Ver3.0] 複数荷姿部品 - 初期化不良 2018.03.28 honma Add End
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#deferredGetInitData
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * 在庫一括移動指示初期値取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetInitData = function () {
			var deferred = $q.defer();

			api.stockBulkMove.init().then(function(response) {

				if (items) {
					$scope.head = items.selectedList;
					$scope.getData();
				}

				// [#6798] フォーカスが当たらない問題を修正(owsCommon.setFirstFocusの位置を変更) 2019.11.11 kawana Delete

				deferred.resolve();
			});

			return deferred.promise;
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#getData
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * 表示データ取得処理<br>
		 * ・表示データ取得処理呼び出し
		 */
		var getData = function() {
			var request = {};
			request.data = {};
			request.data.head = $scope.head;

			api.stockBulkMove.getData(request).then(function(response) {
				statusInfo.isSuccessAndShowMessage(response, 'getDatainputform');
				setData(response);
				// [#6798] フォーカスが当たらない問題を修正 2019.11.11 kawana Start
				owsCommon.setFirstFocus('inputform');
				// [#6798] フォーカスが当たらない問題を修正 2019.11.11 kawana End
			});
		}

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#setData
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * データ設定処理<br>
		 *
		 * 取得結果を画面項目に反映する。
		 */
		var setData = function(response) {
			//選択状態をクリアする
			owsCommon.toggleSelectAll($scope.gridOptions, false);

			$scope.gridOptions.gridViewport.scrollTop(0);

			//取得したデータをグリッドに表示
			$scope.stockBulkMoveList = response.data.body;
			gridMultiTextControl.setMultiTextOptionsListInit($scope, 'gridMultiTextOptions', $scope.multiTextOptions, response.data.body.length);
			for (var row = 0; row < $scope.stockBulkMoveList.length; row++) {
				// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ start
				response.data.body[row].moveInstNum = null;
				// 複数荷姿用各種オプション変数への商品荷姿リスト（検索結果）設定共通処理
				gridMultiTextControl.setMultiText($scope, $scope.gridOptions, 'gridMultiTextOptions', 'moveInstNum', response.data.body[row].mproduct.productId, response.data.body[row].mproduct.mproductShapeList, row);
				// 該当行の荷姿補助内訳数取得
         		owsCommon.getGridCalcAuxiliaryBreakdown($scope,response.data.body[row].moveInstNum, 'gridMultiTextOptions', 'moveInstNum', row);
				// 該当行の総数量取得
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ End
			}
		}

		/**
		 * @ngdoc method
		 * @name oneslogiWms.ReceiveInputNo.object:ReceiveInputNo#showLocation
		 * @methodOf oneslogiWms.ReceiveInputNo.object:ReceiveInputNo
		 *
		 * @description
		 * ロケーション検索ボタン押下処理<br>
		 *
		 * 検索画面を表示し、選択されたロケーション情報を取得し画面項目に反映する。
		 */
		$scope.showLocation = function(rowIndex) {

			var items = {
				centerCd: $scope.stockBulkMoveList[rowIndex].mwarehouse.mcenter.centerCd,
				locationCd: $scope.stockBulkMoveList[rowIndex].moveLocationCd
			};

			// ロケーションマスタのモーダル画面を表示
			var modalInstance = modalFactory.modalLocation(items);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(selectedItem) {

				$scope.stockBulkMoveList[rowIndex].moveLocationCd = selectedItem.locationCd;
				// 明細行のチェック状態を設定
				rowCheckStatusChange(rowIndex);
			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#locationChange
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * ロケーション変更処理<br>
		 *
		 * サーバとの通信を行い、ロケーション変更処理する。
		 */
		$scope.locationChange = function(rowIndex) {
			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#moveNumChange
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * 移動数変更処理<br>
		 *
		 * サーバとの通信を行い、移動数変更処理する。
		 */
		$scope.moveNumChange = function(rowIndex) {
			// 明細行のチェック状態を設定
			rowCheckStatusChange(rowIndex);
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#moveNumBlur
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * 移動数のロストフォーカス処理<br>
		 *
		 * サーバとの通信を行い、移動総数を取得し画面項目に反映する。
		 */
		$scope.moveNumBlur = function(rowIndex) {

			gridOptionMessageControl.hide($scope.gridOptions, "moveInstNum", rowIndex);

			// ケース入数
			var unitNum = $scope.stockBulkMoveList[rowIndex].unitNum;

			// 移動ケース数
			var moveCaseNum = $scope.stockBulkMoveList[rowIndex].moveCaseNum;

			// 移動バラ数
			var movePieceNum = $scope.stockBulkMoveList[rowIndex].movePieceNum;
			var moveInstNum = $scope.stockBulkMoveList[rowIndex].moveInstNum;
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ start
			if (!moveInstNum) {
				//$scope.stockBulkMoveList[rowIndex].moveInstNum = 0;
				$scope.stockBulkMoveList[rowIndex].moveInstNum = null;

			} else {
				if (!unitNum) {
					if (!moveCaseNum && movePieceNum) {
						$scope.stockBulkMoveList[rowIndex].moveInstNum = movePieceNum;
					}
					if (moveCaseNum && !movePieceNum) {
						$scope.stockBulkMoveList[rowIndex].moveInstNum = null;
					}
					if (moveCaseNum && movePieceNum) {
						$scope.stockBulkMoveList[rowIndex].moveInstNum = movePieceNum;
					}
				} else {
					if (!moveCaseNum && movePieceNum) {
						$scope.stockBulkMoveList[rowIndex].moveInstNum = movePieceNum;
					}
					if (moveCaseNum && !movePieceNum) {
						$scope.stockBulkMoveList[rowIndex].moveInstNum = owsCommon.multiply(parseInt(unitNum), moveCaseNum);
					}
					if (moveCaseNum && movePieceNum) {
						$scope.stockBulkMoveList[rowIndex].moveInstNum = owsCommon.add(owsCommon.multiply(parseInt(unitNum), moveCaseNum), movePieceNum);
					}
				}
				if (owsCommon.isGreaterThan($scope.stockBulkMoveList[rowIndex].moveInstNum, $scope.stockBulkMoveList[rowIndex].chargeNum)) {
					gridOptionMessageControl.show($scope.gridOptions, "moveInstNum", $filter('owfMessage')("stockMoveCannotExecuteStockShortageError"), rowIndex);
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ END
				}
			}
		};

		// 明細行のチェック状態を設定
		var rowCheckStatusChange = function(rowIndex) {

			owsCommon.syncExec(function() {
				$scope.gridOptions.selectRow(rowIndex,true);
			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#register
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * 登録ボタン押下処理<br>
		 *
		 * 入力データのチェックを行い、サーバに登録データを送信する。
		 */
		$scope.register = function() {
			// 業務エラーのクリア
			optionMessageControl.hideAll($scope);
			// [#6855][OSS] 登録ボタン押下時にエラーが消えない問題を修正 2019.11.25 kawana Start
			gridOptionMessageControl.hideAll($scope.gridOptions);
			// [#6855][OSS] 登録ボタン押下時にエラーが消えない問題を修正 2019.11.25 kawana End
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ start
			// 明細行が選択してない場合
			var list = $scope.gridOptions.gridApi.selection.getSelectedRows();
			var re = /^[1-9]\d{0,6}$/ ;
			var de = /^([0-9]|[1-9])+([.]{1}[0-9]{1,3})?$/
			if (list.length == 0) {
				alertMessage.setErrorMessageByCode("lineNotSelectError");
				return;
			}
			for (var row = 0; row < list.length; row++) {
               if(!list[row].moveLocationCd){

            	   directiveControl.firstErrorOnFocus('inputform');

            	   return;
              }if(!list[row].moveInstNum){

            	  directiveControl.firstErrorOnFocus('inputform');

           	       return;
             }if(list[row].mproduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg=="1"&&!de.test(list[row].moveInstNum)){

           	  directiveControl.firstErrorOnFocus('inputform');

          	       return;
            }if(list[row].mproduct.mproductShapeList[0].mshapeGrpDtl.mshapeGrp.decimalExistFlg=="0"&&!re.test(list[row].moveInstNum)){

           	  directiveControl.firstErrorOnFocus('inputform');

          	       return;
            }if(owsCommon.isGreaterThan(list[row].moveInstNum, list[row].chargeNum)){
            	// [#2799][Ver3.0] UoM対応 - 在庫数チェック処理エラーメッセージ追加 2018.03.29 honma Add Start
            	gridOptionMessageControl.show($scope.gridOptions, "moveInstNum", $filter('owfMessage')("stockMoveCannotExecuteStockShortageError"), row);
            	// [#2799][Ver3.0] UoM対応 - 在庫数チェック処理エラーメッセージ追加 2018.03.29 honma Add End
             	  directiveControl.firstErrorOnFocus('inputform');

            	       return;
              }
			}
			// [#2799][Ver3.0] unit of measure 対応 2017.12.13 ライ start
			var request = {};
			request.data = {};
			request.data.body = list;
			// 処理前チェックを行う
			api.stockBulkMove.inputCheck(request).then(function(response) {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
					return;
				};
				// 取消処理
				api.stockBulkMove.register(request).then(function(response) {
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					} else {
						$modalInstance.close($scope.gridOptions.gridApi.selection.getSelectedRows()[0]);
					}
				});
			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.StockBulkMove.service:stockBulkMove#modalClose
		 * @methodOf oneslogiWms.StockBulkMove.service:stockBulkMove
		 *
		 * @description
		 * 閉じるボタン押下処理<br>
		 *
		 * ダイアログを閉じる
		 */
		$scope.modalClose = function() {
			$modalInstance.dismiss();
		};

		$scope.getData = getData;

		//画面初期化処理を実行
		$scope.initScreen();
	}]);

