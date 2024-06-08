/**
 * @ngdoc overview
 * @name oneslogiWms.ZipMasterEdit
 *
 * @description
 * 郵便番号マスタメンテナンス(編集)画面<br>
 *
 * 郵便番号マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.ZipMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.ZipMasterEdit.service:zipMasterEditApi
 *
 * @description
 * 郵便番号マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * 郵便番号マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/zipMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/zipMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/zipMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/zipMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/zipMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('ZipMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		supplierZip: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		zipList: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/zipMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/zipMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/zipMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/zipMasterEdit/register'],
				 ['update',             'POST', 'resources/master/zipMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.ZipMasterEdit.object:ZipMasterEdit
 *
 * @description
 * 郵便番号マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('ZipMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'ZipMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterEdit.object:ZipMasterEdit#initScreen
	 * @methodOf oneslogiWms.ZipMasterEdit.object:ZipMasterEdit
	 *
	 * @description
	 * 画面初期化処理<br>
	 *
	 * 各項目へのイベント登録、初期値の設定を行い、画面を利用可能な状態とする。
	 */
	$scope.initScreen = function() {
		// モード設定
		$scope.screenMode = $route.current.params.mode;

		// 画面初期化用通信処理を実行
		$scope.initScreenHttp();
	}

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterEdit.object:ZipMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.ZipMasterEdit.object:ZipMasterEdit
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
				 $scope.deferredGetFlg(),
				 $scope.deferredGetUpdType(),
				 $scope.deferredGetReasonType(),
				 $scope.deferredGetCodeType(),
				 $scope.deferredGetCodeFlg(),
				 $scope.deferredGetUpdCd(),
				 $scope.deferredGetCompanyFlg()
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
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
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetFlg
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "ZIP_FLG";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.flgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetUpdType
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetUpdType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UPD_TYPE";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.updTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetReasonType
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetReasonType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "REASON_TYPE";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.reasonTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetCodeType
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCodeType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CODE_TYPE";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.flg5List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetCodeFlg
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCodeFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CODE_FLG";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.flg6List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetUpdCd
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetUpdCd = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "UPD_CD";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.updCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMaster.object:ZipMaster#deferredGetCompanyFlg
	 * @methodOf oneslogiWms.ZipMaster.object:ZipMaster
	 *
	 * @description
	 * 削除フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCompanyFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COMPANY_FLG";

			owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.companyFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterEdit.object:ZipMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.ZipMasterEdit.object:ZipMasterEdit
	 *
	 * @description
	 * 郵便番号マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update) {
			// 訂正
			var request = {};
			request.zipCd = $route.current.params.zipCd;

			api.zipList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;

				// [#7147][OSS] 大口事業所フラグのチェック処理を呼び出し 2020.02.07 tsuboi Start
				$scope.checkCompanyFlg();
				// [#7147][OSS] 大口事業所フラグのチェック処理を呼び出し 2020.02.07 tsuboi End

				directiveControl.editable($scope, 'zipCd', false);

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();

			});

		} else {

			// 新規
			api.zipList.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.head = response.data.head;

				// 削除の初期値設定
				$scope.head.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);

				// [#7147][OSS] 初期値では大口事業所フラグ以外は編集不可に変更 2020.02.06 tsuboi Start
				$scope.checkCompanyFlg();
				// [#7147][OSS] 初期値では大口事業所フラグ以外は編集不可に変更 2020.02.06 tsuboi End

				//
//				directiveControl.editable($scope, 'addRow', false);
//				directiveControl.editable($scope, 'removeRow', false);

				//通常画面の場合は、初期化の最終処理として、以下関数を呼び出す
				owsCommon.setFirstFocus();

				deferred.resolve();
			});
		}

		return deferred.promise;
	};


	// [#7147][OSS] 大口事業所フラグが変更された際に呼び出されるメソッドを追加 2020.02.06 tsuboi Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterEdit.object:ZipMasterEdit#checkCompanyFlg
	 * @methodOf oneslogiWms.ZipMasterEdit.object:ZipMasterEdit
	 *
	 * @description
	 * 大口事業所フラグ変更処理<br>
	 *
	 * 大口事業所フラグの状態によって編集可能項目を変更する。
	 *
	 */
	$scope.checkCompanyFlg = function(){
		var companyFlg = $scope.head.companyFlg;
		var head = $scope.head;
		if(companyFlg){
			// 共通
			if ($scope.screenMode != SCREEN_MODE.Update){
				directiveControl.editable($scope, 'zipCd', true);
			}
			directiveControl.editable($scope, 'publicCd', true);
			directiveControl.editable($scope, 'zipCd5', true);
			directiveControl.editable($scope, 'address1', true);
			directiveControl.editable($scope, 'address2', true);
			directiveControl.editable($scope, 'address3', true);

			if(companyFlg == 0){
				// 通常
				directiveControl.editable($scope, 'addressKn1', true);
				directiveControl.editable($scope, 'addressKn2', true);
				directiveControl.editable($scope, 'addressKn3', true);
				directiveControl.editable($scope, 'companyKn', false);
				directiveControl.editable($scope, 'address4', false);
				directiveControl.editable($scope, 'companyNm', false);
				directiveControl.editable($scope, 'flg1', true);
				directiveControl.editable($scope, 'flg2', true);
				directiveControl.editable($scope, 'flg3', true);
				directiveControl.editable($scope, 'flg4', true);
				directiveControl.editable($scope, 'updType', true);
				directiveControl.editable($scope, 'reasonType', true);
				directiveControl.editable($scope, 'handlingAddress', false);
				directiveControl.editable($scope, 'flg5', false);
				directiveControl.editable($scope, 'flg6', false);
				directiveControl.editable($scope, 'updCd', false);

				head.companyKn = null;
				head.address4 = null;
				head.companyNm = null;
				head.handlingAddress = null;
				head.flg5 = null;
				head.flg6 = null;
				head.updCd = null;

				optionMessageControl.hide($scope, "companyNm");

			}else if(companyFlg == 1){
				// 大口
				directiveControl.editable($scope, 'addressKn1', false);
				directiveControl.editable($scope, 'addressKn2', false);
				directiveControl.editable($scope, 'addressKn3', false);
				directiveControl.editable($scope, 'companyKn', true);
				directiveControl.editable($scope, 'address4', true);
				directiveControl.editable($scope, 'companyNm', true);
				directiveControl.editable($scope, 'flg1', false);
				directiveControl.editable($scope, 'flg2', false);
				directiveControl.editable($scope, 'flg3', false);
				directiveControl.editable($scope, 'flg4', false);
				directiveControl.editable($scope, 'updType', false);
				directiveControl.editable($scope, 'reasonType', false);
				directiveControl.editable($scope, 'handlingAddress', true);
				directiveControl.editable($scope, 'flg5', true);
				directiveControl.editable($scope, 'flg6', true);
				directiveControl.editable($scope, 'updCd', true);

				head.addressKn1 = null;
				head.addressKn2 = null;
				head.addressKn3 = null;
				head.flg1 = null;
				head.flg2 = null;
				head.flg3 = null;
				head.flg4 = null;
				head.updType = null;
				head.reasonType = null;
			}
		}else{
			// 全項目編集不可
			directiveControl.editable($scope, 'zipCd', false);
			directiveControl.editable($scope, 'publicCd', false);
			directiveControl.editable($scope, 'zipCd5', false);
			directiveControl.editable($scope, 'addressKn1', false);
			directiveControl.editable($scope, 'addressKn2', false);
			directiveControl.editable($scope, 'addressKn3', false);
			directiveControl.editable($scope, 'companyKn', false);
			directiveControl.editable($scope, 'address1', false);
			directiveControl.editable($scope, 'address2', false);
			directiveControl.editable($scope, 'address3', false);
			directiveControl.editable($scope, 'address4', false);
			directiveControl.editable($scope, 'companyNm', false);
			directiveControl.editable($scope, 'flg1', false);
			directiveControl.editable($scope, 'flg2', false);
			directiveControl.editable($scope, 'flg3', false);
			directiveControl.editable($scope, 'flg4', false);
			directiveControl.editable($scope, 'updType', false);
			directiveControl.editable($scope, 'reasonType', false);
			directiveControl.editable($scope, 'handlingAddress', false);
			directiveControl.editable($scope, 'flg5', false);
			directiveControl.editable($scope, 'flg6', false);
			directiveControl.editable($scope, 'updCd', false);

			if ($scope.screenMode != SCREEN_MODE.Update){
				head.zipCd = null;
			}
			head.publicCd = null;
			head.addressKn1 = null;
			head.addressKn2 = null;
			head.addressKn3 = null;
			head.companyKn = null;
			head.address1 = null;
			head.address2 = null;
			head.address3 = null;
			head.address4 = null;
			head.companyNm = null;
			head.flg1 = null;
			head.flg2 = null;
			head.flg3 = null;
			head.flg4 = null;
			head.updType = null;
			head.reasonType = null;
			head.handlingAddress = null;
			head.flg5 = null;
			head.flg6 = null;
			head.updCd = null;

			optionMessageControl.hideAll($scope);

		}
	};

	// [#7147][OSS] 大口事業所フラグが変更された際の処理を追加 2020.02.06 tsuboi End


	/**
	 * @ngdoc method
	 * @name oneslogiWms.ZipMasterEdit.object:ZipMasterEdit#register
	 * @methodOf oneslogiWms.ZipMasterEdit.object:ZipMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		// [#7147][OSS] 必須項目の入力有無チェックを追加 2020.02.07 tsuboi Start
		var companyFlg = $scope.head.companyFlg;
		if(companyFlg){
			if(companyFlg == 1){
				var errorMessage = "requiredError"
				var companyNm = document.forms.searchinputform.companyNm.value;
				if(!companyNm){
					optionMessageControl.show($scope, "companyNm", $filter('owfMessage')(errorMessage));
				}
			}
		}
		// [#7147][OSS] 必須項目の入力有無チェックを追加 2020.02.07 tsuboi End


		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.05 Mod honma Start
		owsCommon.syncExec(function() {
			var isError = $scope.searchinputform.$invalid;

			if (isError) {
				// 最初のエラーにフォーカスを当てる
				directiveControl.firstErrorOnFocus('searchinputform');
				return;
			}
			// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.05 Mod honma End

			// 画面内容を引数に設定
			var request = {};
			request.data = {};
			request.data.head = $scope.head;

			// 入力チェック
			api.zipList.inputCheck(request).then(function(response){

				// 処理結果確認
				if (response.status.statusCode != 1){
					if (response.status.listStatus != null){
						for (var i = 0 ;i <response.status.listStatus.length;i++){
							// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.01 Mod honma Start
							if (response.status.listStatus[i].status.statusCode == 6) {
								//CD存在チェック
								if (response.status.listStatus[i].status.subStatusCode == 2) {
									optionMessageControl.show($scope, "zipCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								}
								//都道府県、市区町村、町域いずれか必須チェック
								if (response.status.listStatus[i].status.subStatusCode == 10) {
									optionMessageControl.show($scope, "address1", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								}
							}
							// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.01 Mod honma End
						}
						return;
					}
				} else {
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}
				}
				// 郵便番号マスタデータ登録または更新
				api.zipList.register(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
						return;
					}
					if ($scope.screenMode == SCREEN_MODE.Update) {
						// 前画面へ戻る
						owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					} else {
						// 初期化
						$scope.initScreenHttp();
					}
				});
			});
		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.05 Mod honma Start
		});
		// [#356][Ver2.1.0 品質検査] 郵便番号マスタメンテナンス（編集） 都道府県、市区町村、町域いずれか必須チェック追加 2016.12.05 Mod honma End
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
