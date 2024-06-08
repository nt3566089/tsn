/**
 * @ngdoc overview
 * @name oneslogiWms.EcDelivAddressModify
 *
 * @description
 * EC送り状データ出力の送付先住所変更
 */
angular.module('oneslogiWms.EcDelivAddressModify',[])

/**
 * @ngdoc service
 * @name oneslogiWms.EcDelivAddressModify.service:ecDelivAddressModifyApi
 *
 * @description
 * 送付先住所変更操作用WebApi<br>
 * ・resources/ecorder/ecDelivAddressModify/init         画面用初期データ取得<br>
 * ＷＭＳ共通マスタデータ操作用WebApi<br>
 * ・resources/common/deliveryCourse/record     配送コースデータ取得処理<br>
 * ・resources/ecorder/importType/keyValueList  取込種別データ取得・設定処理<br>
 *
 */
.factory('ecDelivAddressModifyApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		deliveryCourse: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/deliveryCourse/record']
				 ]
		),
		importTypeFlg: AngularAPIClient.make([
		                                     ['query', 'GET', 'resources/ecorder/importType/keyValueList']
	                                         ]
		),
		ecDelivAddressModify: AngularAPIClient.make([
		                                           ['init',                  'GET',   'resources/ecorder/ecDelivAddressModify/init']
		                                           ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
 *
 * @description EC送り状データ出力住所変更画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('EcDelivAddressModify', ['$scope', '$modalInstance','$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ecDelivAddressModifyApi',"items", function($scope,$modalInstance, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api,items){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#initScreen
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {

		// モード設定
		$scope.screenMode = $route.current.params.mode;
		// 検索条件を表示状態に変更
		$scope.isopen = true;
		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#initScreenHttp
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description 画面初期化用の通信制御処理<br>
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
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#deferredGetdeliveryCourse
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description
	 * 配送コースデータ取得処理<br>
	 *
	 * サーバとの通信を行い、配送コース情報を取得し画面項目に反映する。
	 */
	$scope.deferredGetdeliveryCourse = function() {
		// 入力された配送コースコードを取得
		var deliveryCourseCd = $scope.deliveryCourseCd

		if(deliveryCourseCd && 0 < deliveryCourseCd.length) {
			var request = {};
			request.centerId = userInfo.centerId;
			request.deliveryCourseCd = deliveryCourseCd;

			$scope.deliveryCourseNm = null;

			// 配送コース情報の取得
			api.deliveryCourse.record(request).then(function(response){
				$scope.deliveryCourseNm = response.data.mDeliveryCourse.deliveryCourseNm;
			});

		} else {
			$scope.deliveryCourseNm = null;
		}
	};


	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#deferredGetImportType
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description 取込種別データ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetImportType = function () {
		var deferred = $q.defer();

		var request = {};
		request.clientCd =userInfo.clientCd;

		owsCommon.getDataCacheable(api.importTypeFlg, request).then(function(response){
			$scope.importTypeList = response.data.mImportType;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#deferredGetInitData
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description 画面初期化用の通信制御処理<br>
	 *
	 * サーバとの通信を制御し、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function(){
		var deferred = $q.defer();

		api.ecDelivAddressModify.init().then(function(response){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'delivAddressModifyform')) {
				deferred.reject();
				return;
			}

			$scope.conditionH = response.data.head;
			$scope.conditionH.mclient.clientCd = userInfo.clientCd;
			$scope.conditionH.mcenter.centerCd = userInfo.centerCd;

			// 参照元画面の情報を設定
			if (items) {
				$scope.conditionH.importDt                                        = items.importDt;
				$scope.conditionH.orderNo                                         = items.orderNo;
				$scope.conditionH.mimportType.importTypeCd                        = items.importType;
				$scope.conditionH.tshippingInstH.mdeliveryCourse.deliveryCourseCd = items.deliveryCourseCd;
				$scope.conditionH.delivAddress1                                   = items.delivAddress1;
				$scope.conditionH.delivAddress2                                   = items.delivAddress2;
				$scope.conditionH.delivAddress3                                   = items.delivAddress3;
				// 退避用送り状送付先住所
				$scope.strdelivAddress1                                           = items.delivAddress1;
				$scope.strdelivAddress2                                           = items.delivAddress2;
				$scope.strdelivAddress3                                           = items.delivAddress3;
			}
			// 配送コースデータ取得処理
			$scope.deferredGetdeliveryCourse();
			// 取込種別データ取得処理
			$scope.deferredGetImportType();

			//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
			owsCommon.setFirstFocus('delivAddressModifyform');
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#register
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		owsCommon.syncExec(function() {
			// 画面内容を引数に設定
			var request = {};

			request.data = {};
			request.data.head = $scope.conditionH;

			var checkFunc;   // 入力チェック関数
			var execFunc;    // データ登録関数
			var successFunc; // 正常終了後関数

			var strAddress1AllModified  = $scope.strdelivAddress1 + $scope.strdelivAddress2 + $scope.strdelivAddress3; // EC送り状送付先住所(修正後)
			var strAddress1All = $scope.conditionH.delivAddress1 + $scope.conditionH.delivAddress2 + $scope.conditionH.delivAddress3; // EC送り状送付先住所(修正前)

			// 修正内容が変わらない時
			if(strAddress1All == strAddress1AllModified ){
				if (!owsCommon.viewConfirm("processExecuteConfirmation")) {
					return;
				}
			} else {
				// 修正内容が変わった時
				if (!owsCommon.viewConfirm("ecDelivAddressModifyUpdateConfirmation")) {
					return;
				}
			}

			var selectedItem = {};
			selectedItem.delivAddress1 = $scope.conditionH.delivAddress1;
			selectedItem.delivAddress2 = $scope.conditionH.delivAddress2;
			selectedItem.delivAddress3 = $scope.conditionH.delivAddress3;
			$modalInstance.close(selectedItem);
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify#modalClose
	 * @methodOf oneslogiWms.EcDelivAddressModify.object:EcDelivAddressModify
	 *
	 * @description
	 * 閉じるボタン押下処理<br>
	 * ・画面を閉じる処理呼び出し
	 */
	$scope.modalClose = function(){
		$modalInstance.dismiss();
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);