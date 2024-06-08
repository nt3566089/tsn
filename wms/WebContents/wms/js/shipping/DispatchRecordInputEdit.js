/**
 * @ngdoc overview
 * @name oneslogiWms.DispatchRecordInputEdit
 *
 * @description
 * 配車実績入力(編集)画面<br>
 *
 * 配車実績入力メンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.DispatchRecordInputEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.DispatchRecordInputEdit.service:dispatchRecordInputEditApi
 *
 * @description
 * 配車実績入力(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 倉庫データ操作用WebApi<br>
 * ・resources/common/center/warehouseList 倉庫区分データ取得WebAPI<br>
 * 配車実績マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/shipping/dispatchRecordInputEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/shipping/dispatchRecordInputEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/shipping/dispatchRecordInputEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/shipping/dispatchRecordInputEdit/register 入力データ登録WebAPI<br>
 * ・resources/shipping/dispatchRecordInputEdit/update 入力データ更新WebAPI<br>
 */
.factory('dispatchRecordInputEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		dispatchRecordInputApi: AngularAPIClient.make(
				[
				['chakuchiList', 'GET', 'resources/shipping/dispatchRecordInput/chakuchiList']
				 ]
		),
		dispatchRecordInputEditApi: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/shipping/dispatchRecordInputEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/shipping/dispatchRecordInputEdit/initUpdate'],
				 ['getMCrelaybs',         'GET',  'resources/shipping/dispatchRecordInputEdit/getMCrelaybs'],
				 ['getMCarriers',         'GET',  'resources/shipping/dispatchRecordInputEdit/getMCarriers'],
				 ['inputCheck',         'POST', 'resources/shipping/dispatchRecordInputEdit/inputCheck'],
				 ['output',          	'POST', 'resources/shipping/dispatchRecordInputEdit/output'],
				 ['register',           'POST', 'resources/shipping/dispatchRecordInputEdit/register'],
				 ['update',             'POST', 'resources/shipping/dispatchRecordInputEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
 *
 * @description
 * 配車実績入力(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('DispatchRecordInputEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'printFactory', 'dispatchRecordInputEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, printFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#initScreen
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// モード設定
		$scope.screenMode = $route.current.params.mode;

		$scope.centerList = userInfo.centerList;
		$scope.clientList = userInfo.clientList;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#initScreenHttp
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
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
				 $scope.deferredGetSupplierrCvFlg(),
				 $scope.deferredGetPlannedCar(),
				 $scope.deferredGetTransportationCo()
				 ]
		)
		.then(function() {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#deferredGetSupplierrCvFlg
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description
	 * 輸送区分リスト取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSupplierrCvFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "TRANSKBN";

		api.dropdownList.query(request).then(function(response){
			$scope.supplierrCvFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#deferredGetPlannedCar
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description 計画車種、実績車種リストフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPlannedCar = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CARKND";

		api.dropdownList.query(request).then(function(response){
			$scope.plannedCarList = response.data;

			request.classCd = "CARTYPECMB0TDISP";

			var disFlg = false;
			api.dropdownList.query(request).then(function(response){
				for(var i = 0; i < response.data.length; i++){
					if(userInfo.centerCd == response.data[i].classCd){
						disFlg = true;
					}
				}

				if(!disFlg){
					for(var i = 0; i < $scope.plannedCarList.length; i++){
						if($scope.plannedCarList[i].classCd == '0'){
							$scope.plannedCarList.splice(i, 1);
							i--;
						}
					}
				}
			});
		});

		deferred.resolve();
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#deferredGetTransportationCo
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description 運送業者リストフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetTransportationCo = function () {
		var deferred = $q.defer();

		$scope.transportationCoOther = [];
		$scope.transportationCoCAP = [];

		var request = {};
		request.systemDt = userInfo.systemDt;
		api.dispatchRecordInputEditApi.getMCrelaybs(request).then(function(response){
			for(var i = 0; i < response.length; i++){
				var obj = {};
				obj.classCd = response[i].rlybscd;
				obj.classNm = response[i].rlyshan;
				$scope.transportationCoOther.push(obj);
			}
		});

		var request = {};
		api.dispatchRecordInputEditApi.getMCarriers(request).then(function(response){
			for(var i = 0; i < response.length; i++){
				var obj = {};
				obj.classCd = response[i].carrierCd;
				obj.classNm = response[i].carrierNm;
				$scope.transportationCoCAP.push(obj);
			}
		});

		deferred.resolve();
		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#landingChange
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description 着地切り替えイベントです<br>
	 *運送業者設定
	 */
	$scope.landingChange = function () {
		var deferred = $q.defer();

		if ("1" == $scope.head.tdrelayid) {
			var request = {};
			request.systemDt = userInfo.systemDt;
			api.dispatchRecordInputEditApi.getMCrelaybs(request).then(function(response){
				$scope.transportationCoOther = [];
				for(var i = 0; i < response.length; i++){
					var obj = {};
					obj.classCd = response[i].rlybscd;
					obj.classNm = response[i].rlyshan;
					$scope.transportationCoOther.push(obj);
				}
				$scope.transportationCo = $scope.transportationCoOther;
				var landing = $scope.head.landing;
				if(landing != null){
					for(var i = 0; i < $scope.transportationCo.length; i++){
						if($scope.transportationCo[i].classCd == landing){
							$scope.head.trannm = landing;
						}
					}
				}else{
					$scope.head.trannm = null;
				}
			});
		}
		if("0" == $scope.head.tdrelayid || "2" == $scope.head.tdrelayid){
			var request = {};
			request.centerId = userInfo.centerIdByCd($scope.head.landing);
			api.dispatchRecordInputEditApi.getMCarriers(request).then(function(response){
				$scope.transportationCoCAP = [];
				for(var i = 0; i < response.length; i++){
					var obj = {};
					obj.classCd = response[i].carrierCd;
					obj.classNm = response[i].carrierNm;
					$scope.transportationCoCAP.push(obj);
				}

				$scope.transportationCo = $scope.transportationCoCAP;

				$scope.head.trannm = null;
			});
		}

		return deferred.promise;
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#deferredGetLanding
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description 着地リストフラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetLandingList = function() {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
		request.centerCd = userInfo.centerCd;
		if ($scope.head != null) {
			request.supplierrCvFlg = $scope.head.tdrelayid;
		}

		request.systemDt = userInfo.systemDt;

		api.dispatchRecordInputApi.chakuchiList(request).then(function(response) {

			// 輸送区分が'1'(中継)の場合
			if ("1" == $scope.head.tdrelayid) {
				// 中継拠点用のドロップダウンリストを設定する
				$scope.landingList = response.data.chakuchiOtherList;
			}
			// 輸送区分が'0:TD'または'2:CAP'の場合
			if("0" == $scope.head.tdrelayid || "2" == $scope.head.tdrelayid){
				// 先組織コード用のドロップダウンリストを設定
				$scope.landingList = response.data.chakuchiSapList;
			}

			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#deferredGetInitData
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description
	 * 配車実績入力(編集)データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
			var request = {};
			request.ccopamId = $route.current.params.ccopamId;
			request.centerId = userInfo.centerIdByCd(userInfo.centerCd);
			request.clientCd = userInfo.clientCd;
			request.centerCd = userInfo.centerCd;
				// 修正
			api.dispatchRecordInputEditApi.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputForm')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;
				$scope.head.ccopamId = $route.current.params.ccopamId
				$scope.printParam = response.printBasicData;

				$scope.head.centerCd = userInfo.centerCd;
				$scope.head.clientCd = userInfo.clientCd;

				$scope.deferredGetLandingList();

				$scope.serControl($scope.head.warehouseCls, $scope.head.tdrelayid);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		} else {
			// 新規
			api.dispatchRecordInputEditApi.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'inputForm')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;

				$scope.head.centerCd = userInfo.centerCd;
				$scope.head.clientCd = userInfo.clientCd;

				$scope.printParam = response.printBasicData;

				$scope.deferredGetLandingList();

				$scope.serControl($scope.head.warehouseCls, $scope.head.tdrelayid);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};

	$scope.supplierrCvFlgChange = function() {
		if($scope.head.tdrelayid == '0' || $scope.head.tdrelayid == '2'){
			// 運送業者活性
			directiveControl.editable($scope, 'transportationCo', true);
			$scope.deferredGetLandingList();
			$scope.transportationCo = $scope.transportationCoCAP;
		}else{
			// 運送業者非活性
			directiveControl.editable($scope, 'transportationCo', false);
			$scope.deferredGetLandingList();
			$scope.transportationCo = $scope.transportationCoOther;
		}

		$scope.landingChange();

	};

	$scope.serControl = function (warehouseCls,tdrelayid) {
		// CAPセンター以外を表示
		if(warehouseCls == '0'){

			if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
				// 輸送区分活性
				directiveControl.editable($scope, 'supplierrCvFlg', false);
				// 着地
				directiveControl.editable($scope, 'landing', false);
			}else{
				// 輸送区分活性
				directiveControl.editable($scope, 'supplierrCvFlg', true);
				// 着地
				directiveControl.editable($scope, 'landing', true);
			}

			// 汎用パレット数表示
			directiveControl.show($scope, 'genericPalletNo', true);
			// その他パレット数表示
			directiveControl.show($scope, 'otherPalletNo', true);
			// 合計パレット数表示
			directiveControl.show($scope, 'rcvSumQty1Pallet', true);
			// 個数非表示
			directiveControl.show($scope, 'no', false);
			// 合計数非表示
			directiveControl.show($scope, 'sum', false);

			// CAPセンター以外の場合:'1:中継'/'2:TD'どちらかを選択
			for(var i = 0; i < $scope.supplierrCvFlgList.length; i++){
				if($scope.supplierrCvFlgList[i].classCd == '2'){
					$scope.supplierrCvFlgList.splice(i, 1);
					i--;
				}
			}

			if($scope.head.no == null || $scope.head.no == 0){
				$scope.head.no = 1;
			}
		}else{
			if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
				// 輸送区分活性
				directiveControl.editable($scope, 'supplierrCvFlg', false);
				// 着地
				directiveControl.editable($scope, 'landing', false);
			}else{
				// 輸送区分活性
				directiveControl.editable($scope, 'supplierrCvFlg', false);
				// 着地
				directiveControl.editable($scope, 'landing', true);
			}
			// 汎用パレット数非表示
			directiveControl.show($scope, 'genericPalletNo', false);
			// その他パレット数非表示
			directiveControl.show($scope, 'otherPalletNo', false);
			// 合計パレット数非表示
			directiveControl.show($scope, 'rcvSumQty1Pallet', false);
			// 個数表示
			directiveControl.show($scope, 'no', true);
			// 合計数表示
			directiveControl.show($scope, 'sum', true);

			// CAPセンターの場合:'3:CAP'を表示。
			for(var i = 0; i < $scope.supplierrCvFlgList.length; i++){
				if($scope.supplierrCvFlgList[i].classCd == '0' || $scope.supplierrCvFlgList[i].classCd == '1'){
					$scope.supplierrCvFlgList.splice(i, 1);
					i--;
				}
			}

			if($scope.head.gnlpltqa == null){
				$scope.head.gnlpltqa = 0;
			}
			if($scope.head.otpltqa == null){
				$scope.head.otpltqa = 0;
			}
		}

		// 輸送区分が中継の場合
		if(tdrelayid == '1'){
			// 着日活性
			directiveControl.editable($scope, 'arrivalDt', true);
			// 発日活性
			directiveControl.editable($scope, 'shipmenTDt', true);
			// 運送業者非活性
			directiveControl.editable($scope, 'transportationCo', false);

			// TODO
//			// 輸送区分が'1:中継'の場合:(空白)を設定する
//			// JT輸送番号
//			$scope.head.snno2 = null;
//			// TSN輸送番号
//			$scope.head.snno1 = null;
//			// 着日
//			$scope.head.arvymd = null;
//
//			// 輸送区分が'1:中継'の場合:仕分日を設定する
//			$scope.head.snymd = null;

			$scope.transportationCo = $scope.transportationCoOther;
		}
		else if(tdrelayid == '0' || tdrelayid == '2'){
			// 着日活性
			directiveControl.editable($scope, 'arrivalDt', false);
			// 発日非活性
			directiveControl.editable($scope, 'shipmenTDt', false);
			// 運送業者活性
			directiveControl.editable($scope, 'transportationCo', true);

			$scope.head.arvymd = userInfo.systemDt;

			$scope.transportationCo = $scope.transportationCoCAP;
		}
	};
	/**
	 * @ngdoc method
	 * @name oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit#register
	 * @methodOf oneslogiWms.DispatchRecordInputEdit.object:DispatchRecordInputEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;

		// 入力チェック
		api.dispatchRecordInputEditApi.inputCheck(request).then(function(response){

			if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
				return;
			}

			if ($scope.screenMode == SCREEN_MODE.Update) {
				if($scope.head.snno3 == null){
					alertMessage.setErrorMessageByCode("noInputError");
					return;
				}
				api.dispatchRecordInputEditApi.update(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}

					// プリンタ選択画面を表示
					var modalInstance = printFactory.modalPrint($scope.printParam);

					// モーダル画面が閉じられたら呼ばれるファンクションの登録
					modalInstance.result.then(function(printParam) {
						var request = {};
						request.data = {};
						request.data.head = $scope.head;
						request.printBasicData = printParam.printBasicData;

						var subWindow;
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfBlankWindow();
						}

						// 発行
						api.dispatchRecordInputEditApi.output(request).then(function(response) {
							if (statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
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
								// 前画面へ戻る
								owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
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
					}).finally(function(response) {
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack("processCompleteInformation", 0);
					});
				});
			}else{
				api.dispatchRecordInputEditApi.register(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
						return;
					}
					request.data.head.ccopamId = response.data.head.ccopamId;
					// プリンタ選択画面を表示
					var modalInstance = printFactory.modalPrint($scope.printParam);

					// モーダル画面が閉じられたら呼ばれるファンクションの登録
					modalInstance.result.then(function(printParam) {
						var request = {};
						request.data = {};
						request.data.head = $scope.head;
						request.printBasicData = printParam.printBasicData;

						var subWindow;
						if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
							subWindow = owsCommon.viewPdfBlankWindow();
						}

						// 発行
						api.dispatchRecordInputEditApi.output(request).then(function(response) {
							if (statusInfo.isSuccessAndShowMessage(response, 'inputform')) {
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
							} else {
								// 異常

								if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
									// プレビュー閉じる
									subWindow = owsCommon.viewPdfCloseWindow(subWindow);
								}
							}
						}).catch(function() {
							if (printParam.printBasicData.outputType == printFactory.outputType.pdf) {
								subWindow = owsCommon.viewPdfCloseWindow(subWindow);
							}
						});
					}).finally(function(response) {
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack("processCompleteInformation", 0);
					});
				});
			}
		});
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
