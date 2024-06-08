/**
 * @ngdoc overview
 * @name oneslogiWms.SingleRowShippingInspect
 *
 * @description
 * 単行出荷検品画面<br>
 *
 * 単行出荷検品する画面。
 */
angular.module('oneslogiWms.SingleRowShippingInspect', [])

/**
 * @ngdoc service
 * @name oneslogiWms.SingleRowShippingInspect.service:singleRowShippingInspectApi
 *
 * @description
 * 単行出荷検品画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 */
.factory('singleRowShippingInspectApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		warehouseList: AngularAPIClient.make([
			['keyValueList', 'GET', 'resources/common/warehouseCd/keyValueList']
		]),
		zoneList: AngularAPIClient.make([
			['keyValueList', 'GET', 'resources/common/zone/keyValueList']
		]),
		user: AngularAPIClient.make([
			['record', 'GET', 'resources/common/user/record']
		 ]),
		product: AngularAPIClient.make([
			['record', 'GET', 'resources/common/product/recordByCdOrJan']
		]),
		box: AngularAPIClient.make([
			['boxId', 'GET',  'resources/common/box/boxId']
		]),
		singleRowShippingInspect: AngularAPIClient.make([
			['init',                 'GET',  'resources/shipping/singleRowShippingInspect/init'],
			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start
			['selectWorkingData',    'GET',  'resources/shipping/singleRowShippingInspect/selectWorkingData'],
			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End
			['selectInstNum',        'GET',  'resources/shipping/singleRowShippingInspect/selectInstNum'],
			['selectInspectionData', 'GET',  'resources/shipping/singleRowShippingInspect/selectInspectionData'],
			['updateBoxId',          'POST', 'resources/shipping/singleRowShippingInspect/updateBoxId'],
			['inspected',            'POST', 'resources/shipping/singleRowShippingInspect/inspected']
		]),
		mParam: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/param/record']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
 *
 * @description
 * 単行出荷検品画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('SingleRowShippingInspect', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'singleRowShippingInspectApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api) {

	// グリッドの列情報（デザイン用）
	$scope.singleRowShippingInspectListCols = [
		{field:"pickingWorkNo", displayName:"出庫作業No."},
		{field:"supplyCustomerCd", displayName:"納品先CD."},
		{field:"supplyCustomerNm", displayName:"納品先名称."},
		{field:"delivCustomerCd", displayName:"届先CD"},
		{field:"delivCustomerNm", displayName:"届先名称"},
		{field:"deliveryCourseCd", displayName:"配送コースCD"},
		{field:"deliveryCourseNm", displayName:"届先コース名称"},
		{field:"pickingWorkMessage", displayName:"出庫作業メッセージ"}
	];

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect#initScreen
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function()
	{
		// 検索条件を表示状態に変更
		$scope.isopen = true;

		// センタリストの設定
		$scope.centerList = userInfo.centerList;

		// 荷主リストの設定
		$scope.clientList = userInfo.clientList;

		// グリッドの設定
		$scope.gridOptions = owsCommon.mergeSingleSelectGridOptions({
			data: 'singleRowShippingInspectList',
			columnDefs: 'singleRowShippingInspectListCols',
		});

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#initScreenHttp
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.initScreenHttp = function() {

		// 各種ドロップダウンリスト用データ設定（同期処理）
		$q.all([
		        $scope.deferredGetWarehouseList(),
		        $scope.deferredGetZoneList(),
		        $scope.deferredParamInfo()
		]).then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData(null);
		});

	};

	/**
	 * 荷主CD取得
	 */
	var getClientCd = function() {

		if ($scope.searchCondition) {
			if ($scope.searchCondition.mclient) {
				if ($scope.searchCondition.mclient.clientCd) {
					return $scope.searchCondition.mclient.clientCd;
				}
			}
		}

		return userInfo.clientCd;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#clientChange
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description 荷主変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.clientChange = function() {

		$scope.productCdBlur();
		$scope.deferredParamInfo();
	};

	/**
	 * センタCD取得
	 */
	var getCenterCd = function() {

		if ($scope.searchCondition) {
			if ($scope.searchCondition.mcenter) {
				if ($scope.searchCondition.mcenter.centerCd) {
					return $scope.searchCondition.mcenter.centerCd;
				}
			}
		}

		return userInfo.centerCd;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#clientChange
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description センタ変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.centerChange = function() {

		$scope.searchCondition.warehouseCd = null;
		$scope.searchCondition.zoneCd = null;

		$scope.deferredGetWarehouseList();
		$scope.deferredParamInfo();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#deferredGetWarehouseList
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description 倉庫リストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetWarehouseList = function () {
		var deferred = $q.defer();

		var request = {};
		var centerCd = getCenterCd();

		request.centerId = userInfo.centerIdByCd(centerCd);

		owsCommon.getDataCacheable(api.warehouseList, "keyValueList", request).then(function(response){
			$scope.warehouseList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#warehouseChange
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description 倉庫変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.warehouseChange = function() {

		$scope.searchCondition.zoneCd = null;

		// ゾーン変更
		$scope.deferredGetZoneList();
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#deferredGetZoneList
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description ゾーンリストの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetZoneList = function () {
		var deferred = $q.defer();

		var request = {};
		request.data = {};

		request.centerCd = getCenterCd();

		var warehouseCd;
		if ($scope.searchCondition) {
			warehouseCd = $scope.searchCondition.warehouseCd;
		}

		request.warehouseCd = warehouseCd;

		owsCommon.getDataCacheable(api.zoneList, "keyValueList", request).then(function(response){
			$scope.zoneList = response.data;
			deferred.resolve(response);
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#deferredParamInfo
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description パラメータの取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、パラメータマスタ情報を取得して設定<br>
	 */
	$scope.deferredParamInfo = function() {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = getCenterCd();
		request.clientCd = getClientCd();

		// パラメータマスタ取得
		api.mParam.record(request).then(function(response){

			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start
			// 単行ピック上限指示数
			$scope.sglRowPicMaxInstNum = response.data.mParam.sglRowPicMaxInstNum;
			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End
			// エラー音再生フラグ
			$scope.errorSoundPlayFlg = response.data.mParam.errorSoundPlayFlg;
			// 警告音再生フラグ
			$scope.warnSoundPlayFlg = response.data.mParam.warnSoundPlayFlg;
			// 検品音再生フラグ
			$scope.inspSoundPlayFlg = response.data.mParam.inspSoundPlayFlg;
			// 検品完了音再生フラグ
			$scope.inspCompSoundPlayFlg = response.data.mParam.inspCompSoundPlayFlg;

			deferred.resolve();
		});

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:singleRowShippingInspectList#deferredGetInitData
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:singleRowShippingInspectList
	 *
	 * @description
	 * 単行出荷検品初期値取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {

		var deferred = $q.defer();

		api.singleRowShippingInspect.init().then(function(response){

			// 検索
			$scope.searchCondition = response.data.search;
			$scope.temp = {};

			// ログイン情報より初期値を設定
			$scope.searchCondition.mcenter.centerCd = userInfo.centerCd;
			$scope.searchCondition.mclient.clientCd = userInfo.clientCd;

			// 検品データのクリア・項目の編集可否設定
			$scope.clearInspectionData(true);

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#userCdBlur
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description ユーザCD変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.userCdBlur = function() {

		var deferred = $q.defer();

		// 入力されたユーザCDを取得
		var userCd = $scope.searchCondition.userCd;

		if (userCd && 0 < userCd.length) {
			var request = {};
			request.userCd = userCd;

			api.user.record(request).then(function(response){
				if (response.data.bUser.userCd == null){
					optionMessageControl.show($scope, "userCd", $filter('owfMessage')("notFoundInUserCodeError"));
					$scope.temp.userNm = null;
					deferred.reject();
				} else {
					$scope.temp.userNm = response.data.bUser.userNm;
					$scope.searchCondition.userId = response.data.bUser.userId;
					deferred.resolve();
				}
			});
		} else {
			$scope.temp.userNm = null;
			deferred.reject();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#productCdBlur
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description 商品CD変更時の処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.productCdBlur = function() {

		var deferred = $q.defer();

		var productCd = $scope.searchCondition.mproduct.productCd;

		if (productCd && 0 < productCd.length) {
			var request = {};
			request.productCd = productCd;
			var clientCd = getClientCd();
			request.clientId = userInfo.clientIdByCd(clientCd);

			api.product.record(request).then(function(response){
				if (response.data.mProduct.productCd == null){
					optionMessageControl.show($scope, "searchJanCd", $filter('owfMessage')("productNotFoundError"));
					$scope.searchCondition.mproduct.productNm = null;
					deferred.reject();
				} else {
					$scope.searchCondition.mproduct.productNm = response.data.mProduct.productNm;
					$scope.searchCondition.productId = response.data.mProduct.productId;
					deferred.resolve();
				}
			});
		} else {
			$scope.searchCondition.mproduct.productNm = null;
			deferred.reject();
		}

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#inspSoundPlay
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 検品時に検品音再生フラグ又は検品完了音再生フラグが「1：再生する」の場合、音を鳴らす<br>
	 *
	 */
	$scope.inspSoundPlay = function() {

		if ($scope.inspSoundPlayFlg === '1') {
			// 検品音再生フラグが「1：再生する」の場合

			new Audio($("#inspSound")[0].src).play();
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#inspCompSoundPlay
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 1伝票の検品終了時、検品完了音再生フラグ又は検品音再生フラグが「1：再生する」の場合、音を鳴らす<br>
	 *
	 */
	$scope.inspCompSoundPlay = function() {

		if ($scope.inspCompSoundPlayFlg === '1') {
			// 検品完了音再生フラグが「1：再生する」の場合

			new Audio($("#inspCompSound")[0].src).play();
		} else if ($scope.inspSoundPlayFlg === '1') {
			// 検品音再生フラグが「1：再生する」の場合

			new Audio($("#inspSound")[0].src).play();
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect#handleKeydown
	 * @methodOf oneslogiWms.singleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description Enter時の処理<br>
	 */
	$scope.handleKeydown = function(e) {

		// ===== 検索条件 =====

    	// ユーザCD
        if (e.which === 13 && e.currentTarget.id === "userCd") {

			e.preventDefault();
			e.stopPropagation();

			$scope.userCdBlur().then(function(response){

				if (!$scope.searchinputform.$invalid) {
					// 検索条件にエラーなし ⇒ 検索実行

	        		owsCommon.syncButtonExec("search");
				} else {
					// エラーあり ⇒ フォーカス

	            	directiveControl.firstErrorOnFocus('searchinputform');
				}
			});

        	return;
        };

    	// ソースCD/商品CD
        if (e.which === 13 && e.currentTarget.id === "searchJanCd") {

			e.preventDefault();
			e.stopPropagation();

			$scope.productCdBlur().then(function(response){

				if (!$scope.searchinputform.$invalid) {
					// 検索条件にエラーなし ⇒ 検索実行

	        		owsCommon.syncButtonExec("search");
				} else {
					// エラーあり ⇒ フォーカス

	            	directiveControl.firstErrorOnFocus('searchinputform');
				}
			});

        	return;
        };

        // ===== 検品項目 =====

    	// ソースCD/商品CD
        if (e.which === 13 && e.currentTarget.id === "janCd") {

			e.preventDefault();
			e.stopPropagation();

			if (!$scope.inspData.inputJanCd) {
				// 入力なし
				return;
			}

			if ($scope.inputform.$invalid) {
				// 入力エラーあり
				return;
			}

			// 検品処理
			$scope.inspected();
			return;
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect#search
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 検索ボタン押下処理<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.search = function(){


		// [#7181][OSS] 【検索】押下時にユーザCDと商品CDの存在有無チェックを追加 2020.02.06 tsuboi Start
		$q.all([
			$scope.userCdBlur(),
			$scope.productCdBlur(),
		]).then(function(response) {

			var request = {};
			request.data = {};
			request.data.search = $scope.searchCondition;

			// ID変換 (ユーザID・商品IDは既に設定済)
			request.data.search.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
			request.data.search.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);

			// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start

			// 検品中データ取得
			api.singleRowShippingInspect.selectWorkingData(request).then(function(response) {

				if (!statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
					// エラーダイアログ表示
					modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
						.then(function() {
							$("#searchJanCd").find(":input").select();
						});
					return;
				}

				if (response.data.inspData) {
					// 検品中データあり

					if (response.status.messageCode) {
						// 警告メッセージあり

						// 警告メッセージ表示
						modalWarnDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
							.then(function() {

								// 検品データ設定
								setInspectionData(response);
							});
					} else {
						// 検品データ設定
						setInspectionData(response);
					}
					return;
				}


				// 検品中データなし

				// 単行ピック上限指示数確認
				if ($scope.sglRowPicMaxInstNum == 1) {
					// 上限指示数が1

					// 検品データ検索
					selectInspectionData(1);
				} else {
					// 上限指示数が1以外

					// 作業指示数検索
					api.singleRowShippingInspect.selectInstNum(request).then(function(response) {

						if (!statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
							// エラーダイアログ表示
							modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
								.then(function() {
									$("#searchJanCd").find(":input").select();
								});
							return;
						}

						// 指示数選択画面表示
						modalWorkInstNum(response.data.instNumList);
					});
				}
			});
		}).catch(function(){
			directiveControl.firstErrorOnFocus('searchinputform');
		});
		// [#7181][OSS] 【検索】押下時にユーザCDと商品CDの存在有無チェックを追加 2020.02.06 tsuboi End
		// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End
	};

	/**
	 * 作業指示数選択画面の表示<br>
	 */
	var modalWorkInstNum = function(instNumList) {

		var items = {};
		items.instNumList = instNumList;
		var modalInstance = modalFactory.modalLargeWorkInstNum(items);

		// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start
		modalInstance.result.then(selectInspectionData);
		// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End
	}

	// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana Start

	/**
	 * 検品データの検索処理
	 */
	var selectInspectionData = function(workInstNum) {

		$scope.searchCondition.workInstNum = workInstNum;

		// 検品データの検索
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;

		request.data.search.centerId = userInfo.centerIdByCd($scope.searchCondition.mcenter.centerCd);
		request.data.search.clientId = userInfo.clientIdByCd($scope.searchCondition.mclient.clientCd);

		// 検索実行
		api.singleRowShippingInspect.selectInspectionData(request).then(function(response) {

			if (!statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {
				// エラーダイアログ表示
				modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function(response) {
						$("#searchJanCd").find(":input").select();
					});
				return;
			}

			if (response.status.messageCode) {
				// 警告メッセージあり

				// 警告メッセージ表示
				modalWarnDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function() {

						// 検品データ設定
						setInspectionData(response);
					});
			} else {
				// 検品データ設定
				setInspectionData(response);
			}
		});
	};

	// [#5588][v3.1] 上限指示数が1の場合は、指示数選択画面をスキップする 2018.12.14 kawana End

	/**
	 * 検品データ設定処理
	 */
	var setInspectionData = function(response) {

		// 検品データを設定
		$scope.inspData = response.data.inspData;
		$scope.singleRowShippingInspectList = response.data.list;
		$scope.userInspSlipNum = response.data.userInspSlipNum;
		$scope.defaultBox = response.data.defaultBox;

		if (!$scope.inspData.wsglRowShipInspH.boxId) {
			// 荷材IDが未登録 ==> 荷材選択画面の表示

			// 荷材選択画面表示
			$scope.registerBox();
		} else {

			// 項目の編集可否を設定
			changeEditable(1);

			if (response.data.pickingWorkMessage) {

				// 出庫作業メッセージ表示
				modalWarnDialog(response.data.pickingWorkMessage).then(function() {
						// ソースCDにフォーカス
						owsCommon.setFirstFocus('inputform');
					});
			} else {

				// ソースCDにフォーカス
				owsCommon.setFirstFocus('inputform');
			}
		}
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect#setPagingData
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 検品データをクリアする<br>
	 *
	 * 取得結果を画面項目に反映する。
	 */
	$scope.clearInspectionData = function(doProductClear) {

		if (doProductClear) {

			// 商品CDクリア
			$scope.searchCondition.mproduct.productCd = null;
			$scope.searchCondition.mproduct.productNm = null;
		}

		// 検品データをクリア
		$scope.inspData = null;
		$scope.singleRowShippingInspectList = [];
		$scope.userInspSlipNum = null;
		$scope.defaultBox = null;

		// 項目の編集可否を設定
		changeEditable(0);

		if (doProductClear) {

			// エラー項目にフォーカス
			directiveControl.firstErrorOnFocus('searchinputform');
		} else {

			// ソースCD選択
			owsCommon.syncExec(function() {
				$("#searchJanCd").find(":input").select();
			});
		}
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect#registerBox
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 箱登録画面表示<br>
	 */
	$scope.registerBox = function() {

		// [#6805][OSS] デフォルト荷材CDが未設定の場合にエラー 2019.11.08 kawana Start
		var items = {
			centerId : $scope.inspData.wsglRowShipInspH.centerId,
			singleRowFlg : true
		};

		if ($scope.defaultBox) {
			items.boxCd = $scope.defaultBox.boxCd;
		}
		// [#6805][OSS] デフォルト荷材CDが未設定の場合にエラー 2019.11.08 kawana End

		var modalInstance = modalFactory.modalInstBoxInput(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){

			var request = {};
			request.centerId = $scope.inspData.wsglRowShipInspH.centerId;
			request.boxCd = selectedItem.boxCd;

			// 荷材ID取得
			api.box.boxId(request).then(function(selectBoxId) {

				$scope.inspData.wsglRowShipInspH.boxId = selectBoxId;

				var request = {};
				request.data = {};
				request.data.inspData = $scope.inspData;

				// 荷材ID更新
				api.singleRowShippingInspect.updateBoxId(request).then(function(response) {

					if (!statusInfo.isSuccessAndShowMessage(response,'searchinputform')) {

						// エラーダイアログ表示
						modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
							.then(function() {
								$("#searchJanCd").find(":input").select();
							});
						return;
					}

					// 項目の編集可否を設定
					changeEditable(1);
					// ソースCDにフォーカス
					owsCommon.setFirstFocus('inputform');
				});
			});
		},
		function() {
			// 箱未選択

			// エラー
			modalErrorDialog(owsCommon.convertMessage('boxCdNotSelectError', null, false))
				.then(function() {
					// 検品は開始しない
					$scope.clearInspectionData(false);
				});
		});
	};

	// 検品処理中フラグ
	// ※「directiveControl.editable」ではなく
	//    jQueryでdisabledを制御した結果、非表示項目でもEnterが連続で聞いてしまう
	//    そのため、フラグでの連続処理対策を行う
	var processing = false;

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect#inspected
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 検品処理<br>
	 *
	 */
	$scope.inspected = function() {

		if (processing) {
			// 検品処理中
			return;
		}

		// 検品処理中に変更
		processing = true;

		// ソースCDの入力を無効 (連続入力対策)
		// ※「directiveControl.editable」を使用すると
		//   処理中(1秒以上かかる処理)に連続入力するとフリーズしてしまう問題あり
		//   特例でjQueryでdisabledを制御
		owsCommon.syncExec(function() {

			$("#janCd").find(":input").prop('disabled', true);
	    	$("#janCd").find(":input").blur();
		}, 1);

		// 検品データを設定
		var request = {};
		request.data = {};
		request.data.search = $scope.searchCondition;
		request.data.inspData = $scope.inspData;

		// 検品処理実行
		api.singleRowShippingInspect.inspected(request).then(function(response) {

			if (!statusInfo.isSuccess(response,'inputform')) {

				// ソースCDの入力を有効
				$("#janCd").find(":input").prop('disabled', false);

				// エラーダイアログ表示
				modalErrorDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function() {

						if(response.data && response.data.noNextData) {

							// 検品データのクリア・項目の編集可否設定
							$scope.clearInspectionData(true);
						} else {

							// エラー
							$("#janCd").find(":input").select();
						}

						processing = false;
					});
				return;
			}

			// 後続処理
			var nextFunc = function() {

				if (response.data.isInspectedSlip) {
					// 検品完了音再生
					$scope.inspCompSoundPlay();
				} else {
					// 検品音再生
					$scope.inspSoundPlay();
				}

				// ソースCDの入力を有効
				$("#janCd").find(":input").prop('disabled', false);

				if (response.data.noNextData) {
					// 次の検品データなし

					if (response.data.pickingWorkMessage) {
						// 出庫作業メセージあり

						// 出庫作業メッセージ表示
						modalWarnDialog(response.data.pickingWorkMessage)
							.then(function() {

								// メッセージの表示
								statusInfo.isSuccessAndShowMessage(response,'inputform');
								// 検品データのクリア・項目の編集可否設定
								$scope.clearInspectionData(true);

								processing = false;
							});
					} else {

						// メッセージの表示
						statusInfo.isSuccessAndShowMessage(response,'inputform');
						// 検品データのクリア・項目の編集可否設定
						$scope.clearInspectionData(true);

						processing = false;
					}
				} else {
					// 次の検品データあり

					// 検品データ設定
					setInspectionData(response);

					processing = false;
				}
			}

			// 警告メッセージ有無判定
			var existsWarn = false;

			if (response.status.listStatus != null && 0 < response.status.listStatus.length) {

				for (var i = 0; i < response.status.listStatus.length; i++) {

					// 正常・確認
					if (response.status.listStatus[i].status.statusCode < 2) {
						continue;
					}

					// 警告・エラーあり
					existsWarn = true;
					break;
				}
			}

			if (existsWarn) {
				// 警告メッセージあり

				// 警告メッセージ表示
				modalWarnDialog(owsCommon.convertMessage(response.status.messageCode, response.status.messageReplaceValue, false))
					.then(function() {

						nextFunc();
					});
			} else {

				nextFunc();
			}

		}, function(response) {
			// エラー

			$("#janCd").find(":input").prop('disabled', false);
			processing = false;
		});
	};

	/**
	 * 画面項目の編集可否設定<
	 */
	var changeEditable = function (mode) {

		var editableSercheItem = true;
		var editableInspectItem = false;

		if (mode == 1) {
			// 検品

			editableSercheItem = false;
			editableInspectItem = true;
		}

		// 検索項目の入力可否を設定
		directiveControl.editable($scope, 'centerCd', editableSercheItem);
		directiveControl.editable($scope, 'clientCd', editableSercheItem);
		directiveControl.editable($scope, 'warehouseCd', editableSercheItem);
		directiveControl.editable($scope, 'zoneCd', editableSercheItem);
		directiveControl.editable($scope, 'searchPickingGroupNo', editableSercheItem);
		directiveControl.editable($scope, 'tempNo', editableSercheItem);
		directiveControl.editable($scope, 'userCd', editableSercheItem);
		directiveControl.editable($scope, 'searchJanCd', editableSercheItem);
		directiveControl.editable($scope, 'search', editableSercheItem);
		$scope.isopen = editableSercheItem;

		// 検品項目を入力可否を設定
		directiveControl.editable($scope, 'janCd', editableInspectItem);
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect#getClassForRow
	 * @methodOf oneslogiWms.SingleRowShippingInspect.object:SingleRowShippingInspect
	 *
	 * @description
	 * 行別背景色取得処理<br>
	 *
	 * 検品状態に応じた背景色をテンプレートに返す。
	 */
	$scope.getClassForRow = function(row) {

		var color;

		if (row.entity.userId == $scope.searchCondition.userId) {
			// 自ユーザ

			if (row.entity.inspectionFlg == "1") {
				// 検品済(自ユーザ)
				color = "wmslegendyellow";
			} else {
				// 検品中(自ユーザ)
				color = "wmslegendpink";
			}
		} else {
			if (row.entity.inspectionFlg == "1") {
				// 検品済(他ユーザ)
				color = "wmslegendlightblue";
			}
		}

		return color;
	};

	/**
	 * エラーダイアログ表示
	 */
	var modalErrorDialog = function(message) {

		var items = {};
		items.message = message;
		if ($scope.errorSoundPlayFlg === '1') {
			// エラー音「1：再生する」場合
			items.sound = true;
		} else {
			items.sound = false;
		}
		var modalInstance = modalFactory.modalLargeErrorDialog(items);

		return modalInstance.result;
	}

	/**
	 * 警告ダイアログ表示
	 */
	var modalWarnDialog = function(message) {

		var items = {};
		items.message = message;
		if ($scope.warnSoundPlayFlg === '1') {
			// エラー音「1：再生する」場合
			items.sound = true;
		} else {
			items.sound = false;
		}
		var modalInstance = modalFactory.modalLargeWarnDialog(items);

		return modalInstance.result;
	}

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
