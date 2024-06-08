/**
 * @ngdoc overview
 * @name oneslogiWms.PickingMethodRecommendation
 *
 * @description
 * ピッキング提案画面<br>
 *
 * ピッキング提案表示する画面。
 *
 */
angular.module('oneslogiWms.PickingMethodRecommendation', [])

/**
 * @ngdoc service
 * @name oneslogiWms.PickingMethodRecommendation.service:PickingMethodRecommendationApi
 *
 * @description
 * ピッキング提案画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * receiveStatus 入荷ステータスデータ操作用WebAPI<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ・resources/shipping/PickingMethodRecommendation/searchInit 初期データ取得WebAPI<br>
 * ・resources/shipping/PickingMethodRecommendation/search 検索結果取得WebAPI<br>
 */
.factory('PickingMethodRecommendationApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		pickingMethodRecommendation: AngularAPIClient.make([
	                                            ['initial',                  'GET',  'resources/shipping/PickingMethodRecommendation/initial'],
	                                            ['checkRecommendationAgain', 'POST', 'resources/shipping/PickingMethodRecommendation/checkRecommendationAgain'],
	                                            ['recommendationAgain',      'POST', 'resources/shipping/PickingMethodRecommendation/recommendationAgain'],
	                                            ['search',                   'GET',  'resources/shipping/PickingMethodRecommendation/search'],
		                                        ['excel',                    'GET',  'resources/shipping/PickingMethodRecommendation/search', 'excel'],
	                                            ["checkBeforePrint",         'POST', 'resources/shipping/PickingMethodRecommendation/checkBeforePrint'],
	                                            ["getReportId",              'GET',  'resources/shipping/PickingMethodRecommendation/getReportId'],
	                                            ["print",                    'POST', 'resources/shipping/PickingMethodRecommendation/print']
		])
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
 *
 * @description
 * ピッキング提案画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('PickingMethodRecommendation', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'PickingMethodRecommendationApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	//グリッドの列情報（デザイン用）
	$scope.PickingMethodRecommendationCols = [
	                                  {field:"pickingBatchNo", displayName:"バッチNo."},
	                                  {field:"rcmdPickingCls", displayName:"提案ピッキング方法"},
	                                  {field:"packingNum", displayName:"梱包数"},
	                                  {field:"workVolume", displayName:"仕事量"},
	                                  {field:"deliveryCourseCd", displayName:"配送コースCD"},
	                                  {field:"deliveryCourseNm", displayName:"配送コース名称"},
	                                  {field:"carrierCd", displayName:"運送業者CD"},
	                                  {field:"carrierNm", displayName:"運送業者名称"},
	                                  {field:"emergencyFlg", displayName:"緊急フラグ"}
	                                  ];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#initScreen
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		//検索条件を表示状態に変更
		$scope.isopen = true;

		//センタリストの設定
		$scope.centerList = userInfo.centerList;

		//荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'pickingMethodRecommendationList',
			columnDefs: 'PickingMethodRecommendationCols',
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#initScreenHttp
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {
		return $scope.deferredGetInitData();

	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PackingHistory.object:PackingHistory#centerChange
	 * @methodOf oneslogiWms.PackingHistory.object:PackingHistory
	 *
	 * @description
	 * センタ変更後処理<br>
	 *
	 * センタが変更された場合、運送業者リストデータを再度取得し画面項目に反映する。
	 */
	$scope.centerChange = function() {
		// 運送業者リスト変更（同期処理）
		$scope.deferredGetCarrier();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#deferredGetInitData
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * ピッキング提案初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.pickingMethodRecommendation.initial().then(function(response){

			$scope.searchCondition = response.data.search;
			$scope.pickingMethodRecommendationList = response.data.list;

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;

			// 履歴データ取得・検索処理
			if (owsHistory.hasState()) {
				$scope.searchCondition = owsHistory.popState();
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
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#search
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 指定ページデータ取得処理<br>
	 *
	 * サーバとの通信を行い、指定ページのデータを取得する。
	 */
	$scope.search = function() {

		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.search.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		request.data.search.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);

		api.pickingMethodRecommendation.search(request).then(function(response) {

			$scope.gridOptions.gridViewport.scrollTop(0);
			// 選択状態をクリア
			owsCommon.toggleSelectAll($scope.gridOptions, false);

			if (!statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				// エラー

				$scope.pickingMethodRecommendationList = [];
				$scope.gridOptions.totalItems = 0;
				return;
			}

			statusInfo.isSuccessAndShowMessage(response, 'searchform');
			$scope.setSearchData(response);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#setPagingData
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 指定ページデータ設定処理<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.setSearchData = function(response) {

		//取得したデータをグリッドに表示
		$scope.pickingMethodRecommendationList = response.data.list;

		//[Ver3.1][#5105] トータル件数設定処理削除（ピッキングリスト発行処理追加に際しDTOの継承元を変更したため） 2018.09.06 miyabe Del

		//検索条件を履歴に保存
		owsHistory.replaceState($scope.searchCondition);
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#getClassForRow
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 緊急フラグに応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {
		var color = "";
		if (row.entity.emergencyFlg == "1") {
			color = color + " wmslegendcolorred";
		}
		return color;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#excelOutput
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description Excel出力処理<br>
	 *
	 * サーバとの通信を行い、取得結果をExcelファイルでダウンロードする。
	 */
	$scope.excelOutput = function() {
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.search.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		request.data.search.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);

		// ファイル出力用パラメータ設定
		owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

		api.pickingMethodRecommendation.excel(request).then(function(response) {
			if (statusInfo.isSuccessAndShowMessage(response,'searchform')) {
				location.href = response.output.downloadUrl;
			}
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#gridDblClick
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * ダブルクリック処理<br>
	 *
	 * 明細行ダブルクリックで画面に遷移。
	 */
	  $scope.gridDblClick = function(row) {
		  owsCommon.syncButtonExec("detail", row);
	  };

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#confirm
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 明細ボタン押下処理<br>
	 *
	 * 明細処理
	 */
	$scope.detail = function() {
		// 行が選択されていない場合
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		}
		// ピッキング提案明細画面へ遷移
		$location.path("wms/shipping/PickingMethodRecommendationDetail").search({}).search("picMthdRcmdId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].picMthdRcmdId);

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#carrierTrace
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 発行ボタン押下処理<br>
	 *
	 * 選択行の梱包ヘッダデータを修正する。
	 */
	$scope.issue = function() {

		// 発行ボタン

		// ===== チェック処理 =====
		// 業務エラーを全てクリアする。
		optionMessageControl.hideAll($scope);

		//明細が表示されていない場合
		if($scope.pickingMethodRecommendationList.length == 0){
			alertMessage.setErrorMessageByCode("detailLineNotDisplayError");
			return;
		};

		// 行が選択されていない場合、以下のエラーを表示し、処理を抜ける。
		if ($scope.gridOptions.gridApi.selection.getSelectedRows().length == 0) {
			alertMessage.setErrorMessageByCode("lineNotSelectError");
			return;
		};

		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();

		api.pickingMethodRecommendation.checkBeforePrint(request).then(function(checkResponse) {
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
				return;
			} else {
				//[Ver3.1][#5105] ピッキングリスト発行処理追加 2018.09.06 miyabe add Start
				api.pickingMethodRecommendation.getReportId(request).then(function(response){
					$scope.listReportId = response.data.listReportId;
					$scope.listReportCd = response.data.listReportCd;
					successPrintFunc = function(){
						if (0 < $scope.listReportId.length) {
							reportId = $scope.listReportId.shift();
							reportCd = $scope.listReportCd.shift();
						};
						var request = {};
						request.reportId = reportId;
						request.userId = null;
						request.reportLayoutData = null;
						request.subrepLayoutData = null;
						request.groupCd = null;
						request.printerNm = null;
						request.trayInfo = null;
						request.trayNm = null;
						request.caltureId = null;
						request.printType = null;
						request.outputType = null;
						request.reportLayoutId = null;
						request.reportLayoutVersion = null;
						request.subrepLayoutId = null;
						request.printerAttributeId = null;
						request.printNum = null;
						request.confirmPrintDia = null;
						request.sheetCollate = null;
						request.printerId = null;
						request.outputData = null;

						var modalInstance = printFactory.modalPrint(request);

						// モーダル画面が閉じられたら呼ばれるファンクションの登録
						modalInstance.result.then(function(printParam){
							var request = {};
							request.data = {};
							request.data.search = $scope.searchCondition;
							request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
							request.printBasicData = printParam.printBasicData;
							request.data.reportCd = reportCd;

							// 印刷時はPDFウィンドウ非表示
							var subWindow;
							if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
								subWindow = owsCommon.viewPdfBlankWindow();
							};

							// 発行処理
							api.pickingMethodRecommendation.print(request).then(function(response){

								if (statusInfo.isSuccessAndShowMessage(response, 'searchform')) {
									// 正常

									if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
										// プレビュー表示

										if (0 < response.output.listDownloadUrl.length) {
											// 複数帳票用にダウンロードURL格納
											var listDownloadUrl = response.output.listDownloadUrl;
											subWindow = owsCommon.viewPdf(subWindow, listDownloadUrl.shift());
											while (0 < listDownloadUrl.length) {
												owsCommon.viewPdf(null, listDownloadUrl.shift());
											}
										} else {
											// 通常
											subWindow = owsCommon.viewPdf(subWindow, response.output.downloadUrl);
										};
									}
								} else {
										// 異常
									if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
										// プレビュー閉じる
										subWindow = owsCommon.viewPdfCloseWindow(subWindow);
									}
									return;
								}
								if ($scope.listReportId.length > 0) {
									successPrintFunc();
								} else {
									// 完了後の処理

									// 再検索
									$scope.search();
								};
							}).catch(function(response){
								// 発行エラー

								if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
									// プレビュー閉じる
									subWindow = owsCommon.viewPdfCloseWindow(subWindow);
								};
							});
						});
					}

					successPrintFunc();
				});
			};
		});
	};
	//[Ver3.1][#5105] ピッキングリスト発行処理追加 2018.09.06 miyabe add End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation#recommendationAgain
	 * @methodOf oneslogiWms.PickingMethodRecommendation.object:PickingMethodRecommendation
	 *
	 * @description
	 * 再提案ボタン押下処理<br>
	 *
	 * 再提案処理
	 */
	$scope.recommendationAgain = function() {

		owsCommon.syncExec(function() {

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.search = $scope.searchCondition;
			request.data.search.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request.data.search.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);

			// 入力チェック
			api.pickingMethodRecommendation.checkRecommendationAgain(request).then(function(checkResponse){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(checkResponse, 'searchform')) {
					return;
				}

				// 出荷確定処理
				api.pickingMethodRecommendation.recommendationAgain(request).then(function(execResponse){

					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(execResponse, 'searchform')) {
						return;
					}

					// 検索して結果を表示
					$scope.search();
				});
			});
		}, 100);
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
