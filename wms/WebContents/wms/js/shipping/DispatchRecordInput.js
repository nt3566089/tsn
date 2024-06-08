/**
 * @ngdoc overview
 * @name oneslogiWms.DispatchRecordInput
 *
 * @description 配車実績入力(一覧)画面
 */
angular.module('oneslogiWms.DispatchRecordInput', [])

	/**
	 * @ngdoc service
	 * @name oneslogiWms.DispatchRecordInput.service:dispatchRecordInputApi
	 *
	 * @description 配車実績入力(一覧)WebApi定義<br>
	 *              ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得用WebApi<br>
	 *      		・resources/common/supplierCustomer/record 発送元データ取得用WebApi<br>
	 *       		・resources/common/deliveryCustomer/record 発送元データ取得用WebApi<br>
	 *      		・resources/common/product/record 商品データ取得用WebApi<br>
	 *              ・resources/shipping/dispatchRecordInput/init 初期化用WebApi<br>
	 *              ・resources/shipping/dispatchRecordInput/search 検索用WebApi<br>
	 *              ・resources/shipping/dispatchRecordInput/chakuchiList 着地リスト検索用WebApi<br>
	 *              ・resources/shipping/dispatchRecordInput/output 発行用WebApi<br>
	 * 				・resources/shipping/dispatchRecordInput/register 削除用WebApi<br>
	
	 *
	 */
	.factory('dispatchRecordInputApi', ['AngularAPIClient', function(AngularAPIClient) {
		return {
			dropdownList: AngularAPIClient.make(
				[
					['query', 'GET', 'resources/common/centerClass/keyValueList']
				]
			),
			dispatchRecordInputApi: AngularAPIClient.make(
				[
					['init', 'GET', 'resources/shipping/dispatchRecordInput/init'],
					['search', 'GET', 'resources/shipping/dispatchRecordInput/search'],
					['excel', 'GET', 'resources/shipping/dispatchRecordInput/search', 'excel'],
					['chakuchiList', 'GET', 'resources/shipping/dispatchRecordInput/chakuchiList'],
					['register', 'POST', 'resources/shipping/dispatchRecordInput/register'],
					['output', 'POST', 'resources/shipping/dispatchRecordInput/output']

				]
			),
		};
	}])

	/**
	 * @ngdoc object
	 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
	 *
	 * @description 配車実績入力(一覧)画面コントローラ
	 */
	.controller('DispatchRecordInput', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'dispatchRecordInputApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

		// グリッドの列情報（デザイン用）
		$scope.resultListCols =
			[
				{ field: "supplierrCvFlg", displayName: "輸送区分" },
				{ field: "landing", displayName: "着地" },
				{ field: "supplierrCvNo", displayName: "輸送番号" },
				{ field: "supplierrCvNo2", displayName: "JT輸送番号" },
				{ field: "supplierrCvNo1", displayName: "TSN輸送番号" },
				{ field: "shipmentDt", displayName: "発日" },
				{ field: "arrivalDt", displayName: "着日" },
				{ field: "plannedCar", displayName: "計画車種" },
				{ field: "achievedCar", displayName: "実績車種" },
				{ field: "transportationCo", displayName: "運送業者" },
				{ field: "carNo", displayName: "号車No." },
				{ field: "genericPalletNo", displayName: "汎用パレット数" },
				{ field: "otherPalletNo", displayName: "その他パレット数" },
				{ field: "rcvSumQty1Pallet", displayName: "合計パレット数" },
				{ field: "no", displayName: "個数" },
				{ field: "sum", displayName: "合計数" },
				{ field: "sealNo1", displayName: "封印No.(1)" },
				{ field: "sealNo2", displayName: "封印No.(2)" },
				{ field: "sealNo3", displayName: "封印No.(3)" },				
				{ field: "centerCd", displayName: "拠点CD" },
				{ field: "centerNm", displayName: "拠点名称" },
				{ field: "clientCd", displayName: "荷主CD" },
				{ field: "clientNm", displayName: "荷主名称" },

			];

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#initScreen
		 * @methodOf oneslogiWms.dispatchRecordInput.object:dispatchRecordInput
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
			
			// 輸送区分変更の監視設定（選択内容変更時）
			$scope.supplierrCvFlgChange = function() {
				$scope.deferredGetLandingList();
			};

			//ページングの設定
			$scope.pagingOptions = owsCommon.getDefaultPagingOptions();

			$scope.pagingOptions.setPageData = function() {
				$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
			};
			// グリッドの設定
			$scope.gridOptions = owsCommon.mergePagingMultiSelectGridOptions({
				data: 'slipNoReceiveList',
				columnDefs: 'resultListCols',
				pagingOptions: $scope.pagingOptions
			});

			//画面初期化用通信処理を実行
			$scope.initScreenHttp();
		}

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#initScreenHttp
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 画面初期化用の通信制御処理<br>
		 * ・初期化データ取得処理の実行設定<br>
		 */
		$scope.initScreenHttp = function() {

			//各種通信用関数を配列で指定
			$q.all(
				[
					$scope.deferredGetLandingList()
					
				]
			)
				//全通信終了後に以下関数で各種設定を実行
				.then(function(response) {
					// 画面初期化データ設定（同期処理）
					return $scope.deferredGetInitData();
				});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#deferredGetSupplierrCvFlgList
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 輸送区分取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetSupplierrCvFlgList = function() {
			var deferred = $q.defer();

			var request = {};
			request.classCd = "TRANSKBN";
			var supplierrCvFlgList = [];

			api.dropdownList.query(request).then(function(response) {
				
				for (var i = 0; i < response.data.length; i++) {
					var supplierrCvFlg = {};
					if ("1" == $scope.capFlg) {
						// CAPセンターの場合:'2:CAP'を表示。
						if ("2" == response.data[i].classCd) {
							// 輸送区分リストを作成
							supplierrCvFlg.classCd = response.data[i].classCd;
							supplierrCvFlg.classNm = response.data[i].classNm;
							supplierrCvFlgList.push(supplierrCvFlg);
						}
					} else {
						// CAPセンター以外の場合:'1:中継'/'0:TD'どちらかを選択、初期値は'1:中継'。
						if (("1" == response.data[i].classCd) ||("0" == response.data[i].classCd)) {
							// 輸送区分リストを作成
							supplierrCvFlg.classCd = response.data[i].classCd;
							supplierrCvFlg.classNm = response.data[i].classNm;
							supplierrCvFlgList.push(supplierrCvFlg);
						}
					}
					
				}
				$scope.supplierrCvFlgList = supplierrCvFlgList;

				deferred.resolve();
			});

			return deferred.promise;
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#deferredGetInoutTypeList
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 内外区分取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetLandingList = function(initFl) {
			var deferred = $q.defer();

			var request = {};
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
			request.centerCd = userInfo.centerCd;
			if ($scope.head != null) {
				request.supplierrCvFlg = $scope.head.tdrelayid;
			}
			
			request.systemDt = userInfo.systemDt;

			api.dispatchRecordInputApi.chakuchiList(request).then(function(response) {
				
				// CAPセンターフラグ
				$scope.capFlg = response.data.capFlg;
				
				if ("1" == $scope.capFlg) {
					// CAPセンターの場合
					$scope.landingList = response.data.chakuchiSapList;
				} else {
					if ($scope.head != null) {
						// CAPセンター以外の場合
						if ("0" == $scope.head.tdrelayid) {
							// 輸送区分がTDの場合
							$scope.landingList = response.data.chakuchiSapList;
						} else if ("1" == $scope.head.tdrelayid) {
							// 輸送区分が中継の場合
							$scope.landingList = response.data.chakuchiOtherList;
						} else {
							// 輸送区分が空白の場合
							var chakuchiList = [];
							for (var i = 0; i < response.data.chakuchiOtherList.length; i++) {
								var chakuchiOther = {};
								chakuchiOther.rlybscd = response.data.chakuchiOtherList[i].rlybscd;
								chakuchiOther.rlybssnm = response.data.chakuchiOtherList[i].rlybssnm;
								chakuchiList.push(chakuchiOther);
							}
							for (var i = 0; i < response.data.chakuchiSapList.length; i++) {
								var chakuchiSap = {};
								chakuchiSap.rlybscd = response.data.chakuchiSapList[i].rlybscd;
								chakuchiSap.rlybssnm = response.data.chakuchiSapList[i].rlybssnm;
								chakuchiList.push(chakuchiSap);
							}
							$scope.landingList = chakuchiList;
						}
					} else {
						// 輸送区分が中継の場合
						$scope.landingList = response.data.chakuchiOtherList;
					}
					
				}
				
				deferred.resolve();
			});

			return deferred.promise;
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#deferredGetInitData
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 配車実績入力(一覧)初期値取得・設定処理（同期可能）<br>
		 *
		 * サーバとの通信を行い、取得結果を画面項目に反映する。
		 */
		$scope.deferredGetInitData = function() {
			var deferred = $q.defer();

			$scope.deferredGetSupplierrCvFlgList();
			api.dispatchRecordInputApi.init().then(function(response) {
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchConditionForm')) {
					return;
				}
			
				$scope.paging = response.paging;
				$scope.head = response.data.head;

				$scope.slipNoReceiveList = response.data.list;
				$scope.head.mclient.clientCd = userInfo.clientCd;
				$scope.head.mcenter.centerCd = userInfo.centerCd;
				// 輸送区分(CAPセンター以外の場合:'1:中継'/'0:TD'どちらかを選択、初期値は'1:中継'。CAPセンターの場合:'2:CAP'を表示)
				$scope.head.tdrelayid = response.data.head.tdrelayid;
				// CAPセンターフラグ
				$scope.capFlg = response.data.capFlg;
				if ("1" == $scope.capFlg) {
					// 輸送区分
					directiveControl.editable($scope, 'supplierrCvFlg', false);
					// 汎用パレット数
					$scope.gridOptions.columnDefs[11].visible = false;
					// その他パレット数
					$scope.gridOptions.columnDefs[12].visible = false;
					// 合計パレット数
					$scope.gridOptions.columnDefs[13].visible = false;
					// 個数
					$scope.gridOptions.columnDefs[14].visible = true;
					// 合計数
					$scope.gridOptions.columnDefs[15].visible = true;
				} else {
					// 輸送区分
					directiveControl.editable($scope, 'supplierrCvFlg', true);
					// 汎用パレット数
					$scope.gridOptions.columnDefs[11].visible = true;
					// その他パレット数
					$scope.gridOptions.columnDefs[12].visible = true;
					// 合計パレット数
					$scope.gridOptions.columnDefs[13].visible = true;
					// 個数
					$scope.gridOptions.columnDefs[14].visible = false;
					// 合計数
					$scope.gridOptions.columnDefs[15].visible = false;
				}

				$scope.printParam = response.data.dispatchRecordInputPrintDto.printBasicData;

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

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#search
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 検索ボタン押下処理<br>
		 * ・検索処理呼び出し
		 */
		$scope.search = function() {
			owsCommon.clearPagingOptions($scope.gridOptions);
			$scope.getPagedDataAsync($scope.gridOptions.paginationPageSize, $scope.gridOptions.paginationCurrentPage);
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#getSearchData
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * データ取得処理<br>
		 *
		 * サーバとの通信を行い、データを取得する。
		 */
		$scope.getPagedDataAsync = function(pageSize, page) {
			var request = {};
			request.data = {};
			request.data.head = $scope.head;
			request.data.systemDt = userInfo.systemDt;

			owsCommon.setPagingData(request, $scope.paging, pageSize, page);

			api.dispatchRecordInputApi.search(request).then(function(response) {

				statusInfo.isSuccessAndShowMessage(response, 'searchinputform')
				$scope.setSearchData(response);
			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#setSearchData
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * データ設定処理<br>
		 *
		 * 取得結果を画面項目に反映する。
		 */
		$scope.setSearchData = function(response) {
			//選択状態をクリアする
			owsCommon.toggleSelectAll($scope.gridOptions, false);

			// 検索ボタン押下後のスクロール位置を上に戻す処理
			$scope.gridOptions.gridViewport.scrollTop(0);

			owsCommon.syncExec(function() {
				// 取得したデータをグリッドに表示
				$scope.slipNoReceiveList = response.data.list;
			});

			//トータル件数を設定
			$scope.gridOptions.totalItems = response.paging.allRecordCount;

			//検索条件を履歴に保存
			owsHistory.replaceState($scope.head);
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#excelOutput
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
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
			request.data.systemDt = userInfo.systemDt

			// ファイル出力用パラメータ設定
			owsCommon.setOutputOptions(request, $scope.gridOptions, "list", document.title);

			api.dispatchRecordInputApi.excel(request).then(function(response) {
				if (statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					location.href = response.output.downloadUrl;
				} else {
					$scope.setPagingData(response, $scope.gridOptions.paginationCurrentPage, $scope.gridOptions.paginationPageSize);
				}
			});

		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#newClick
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 新規ボタン押下処理<br>
		 *
		 * 配車実績入力(編集)新規する為の画面を表示する。
		 */
		$scope.newClick = function() {
			// 配車実績入力(編集)画面へ遷移
			$location.path("wms/shipping/DispatchRecordInputEdit").search({}).search("mode", SCREEN_MODE.Register);
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#copyClick
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 修正ボタン押下処理<br>
		 *
		 * 一覧で選択されたデータの情報を新規編集画面に設定し、表示する。
		 */
		$scope.updateClick = function() {

			// 複数行の場合
			if ($scope.gridOptions.gridApi.selection.getSelectedRows().length > 1) {
				alertMessage.setErrorMessageByCode("onlyOneSelect");
				return;
			}

			// 配車実績入力(編集)画面へ遷移
			$location.path("wms/shipping/DispatchRecordInputEdit").search({})
				.search("mode", SCREEN_MODE.Update)
				.search("clientCd", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].clientCd)
				.search("ccopamId", $scope.gridOptions.gridApi.selection.getSelectedRows()[0].ccopamId);

		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#deleteClick
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 削除ボタン押下処理<br>
		 *
		 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
		 */
		$scope.deleteClick = function() {
			
			// 業務エラーのクリア
			optionMessageControl.hideAll($scope);
			gridOptionMessageControl.hideAll($scope.gridOptions);

			var listBody = [];

			// ポップアップ画面を表示する
			if (!owsCommon.viewConfirm("confirmDeleteRow")) {
				return;
			}

			// グリッドの明細行数分繰返
			for (var row = 0; row < $scope.gridOptions.gridApi.selection.getSelectedRows().length; row++) {
				listBody.push($scope.gridOptions.gridApi.selection.getSelectedRows()[row]);
			}

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.list = listBody;
			request.data.head = $scope.head;
			request.data.head.centerId = userInfo.centerId;
			request.data.head.clientId = userInfo.clientId;

			api.dispatchRecordInputApi.register(request).then(function(response) {

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
					return;
				}

				// 初期化
				$scope.search();

			});
		};

		/**
		 * @ngdoc method
		 * @name oneslogiWms.DispatchRecordInput.object:DispatchRecordInput#publicationClick
		 * @methodOf oneslogiWms.DispatchRecordInput.object:DispatchRecordInput
		 *
		 * @description
		 * 発行ボタン押下処理<br>
		 *
		 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
		 */
		$scope.publicationClick = function() {
			// 検索条件を履歴に保存
			owsHistory.replaceState($scope.head);

			// プリンタ選択画面を表示
			var modalInstance = printFactory.modalPrint($scope.printParam);

			// モーダル画面が閉じられたら呼ばれるファンクションの登録
			modalInstance.result.then(function(printParam) {
				var request = {};
				request.data = {};
				request.data.head = $scope.head;
				request.data.list = $scope.gridOptions.gridApi.selection.getSelectedRows();
				request.data.systemDt = userInfo.systemDt;
				request.printBasicData = printParam.printBasicData;

				var subWindow;
				if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
					subWindow = owsCommon.viewPdfBlankWindow();
				}

				// 発行
				api.dispatchRecordInputApi.output(request).then(function(response) {
					if (statusInfo.isSuccessAndShowMessage(response, 'searchResultListForm')) {
						// 正常

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
						}
						// 再検索処理
						$scope.search();
					} else {
						// 異常

						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							// プレビュー閉じる
							subWindow = owsCommon.viewPdfCloseWindow(subWindow);
						}
					}
				}).catch(function(response) {
					if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
						subWindow = owsCommon.viewPdfCloseWindow(subWindow);
					}
				});
			});

		};

		//画面初期化処理を実行
		$scope.initScreen();

	}]);
