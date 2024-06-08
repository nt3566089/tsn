/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipYupkMasterEdit
 *
 * @description
 * ゆうパック送り状マスタメンテナンス(編集)画面<br>
 *
 * ゆうパック送り状マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.CarrierSlipYupkMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipYupkMasterEdit.service:carrierSlipYupkMasterEditApi
 *
 * @description
 * ゆうパック送り状マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ゆうパック送り状マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/carrierSlipYupkMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/carrierSlipYupkMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/carrierSlipYupkMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/carrierSlipYupkMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/carrierSlipYupkMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('CarrierSlipYupkMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
		zip: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/zip/record']
				 ]
		),
		carrierSlipYupkList: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/carrierSlipYupkMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/carrierSlipYupkMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/carrierSlipYupkMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/carrierSlipYupkMasterEdit/register'],
				 ['update',             'POST', 'resources/master/carrierSlipYupkMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit
 *
 * @description
 * ゆうパック送り状マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CarrierSlipYupkMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'CarrierSlipYupkMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit#initScreen
	 * @methodOf oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit
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
	 * @name oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit
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
				 $scope.deferredGetCharacterCd(),
				 $scope.deferredGetPostType(),
				 $scope.deferredGetCoolType(),
				 $scope.deferredGetCodType(),
				 $scope.deferredGetNoUpsideDownCls(),
				 $scope.deferredGetNoStockCls(),
					// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
				 $scope.deferredGetProductTypeCode()
				 	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End
				 ]
		)
		.then(function(response) {
			// 画面初期化データ設定（同期処理）
			return $scope.deferredGetInitData();
		});

	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetDelFlg
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
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

		api.dropdownList.query(request).then(function(response){
			$scope.delFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetCharacterCd
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * 文字コード取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCharacterCd = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "CHARACTER_CD";

		api.dropdownList.query(request).then(function(response){
			$scope.characterCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetSlipType
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * 送り状種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPostType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "POST_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.postTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetSlipType
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * クール区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCoolType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COOL_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.coolTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetCodType
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * 元/着払/代引 区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCodType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COD_TYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.codTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetNoUpsideDownCls
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * 逆さま厳禁区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNoUpsideDownCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_UPSIDE_DOWN_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.noUpsideDownClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetNoStockCls
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * 下済み厳禁区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetNoStockCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "NO_STOCK_CLS";

		api.dropdownList.query(request).then(function(response){
			$scope.noStockClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster#deferredGetProductTypeCode
	 * @methodOf oneslogiWms.CarrierSlipYupkMaster.object:CarrierSlipYupkMaster
	 *
	 * @description
	 * 商品種別コード取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetProductTypeCode = function() {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PRODUCT_TYPE_CODE";

		api.dropdownList.query(request).then(function(response){
			$scope.productTypeCodeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	}
	// [ONEsLOGI Cloud/WMS バグ・品質向上対策 機能 #403]対応 2016.12.13 nayzaw End

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit
	 *
	 * @description
	 * ゆうパック送り状マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add End
			// 訂正
			var request = {};
			request.carrierSlipYupkId = $route.current.params.carrierSlipYupkId;

			api.carrierSlipYupkList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.carrierSlipYupk = response.data.carrierSlipYupkList[0];

				// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add End
					directiveControl.editable($scope, 'tagType', false);
				// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add Start
				} else {
					$scope.carrierSlipYupk.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
				}
				// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
//				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.carrierSlipYupkList.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
//				$scope.head = response.data.head;
				$scope.carrierSlipYupk = response.data.carrierSlipYupkList[0];

				// 削除の初期値設定
				$scope.carrierSlipYupk.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
				directiveControl.editable($scope, 'delFlg', false);
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

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit#register
	 * @methodOf oneslogiWms.CarrierSlipYupkMasterEdit.object:CarrierSlipYupkMasterEdit
	 *
	 * @description
	 * 登録ボタン押下処理<br>
	 *
	 * 入力データのチェックを行い、サーバに登録・更新データを送信する。
	 */
	$scope.register = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);

		var isError = $scope.searchinputform.$invalid;

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
//		request.data.carrierSlipYupkList = {};
//		request.data.carrierSlipYupkList[0] = $scope.carrierSlipYupk;
		request.data.carrierSlipYupkMasterSearch = $scope.carrierSlipYupk;
		request.data.carrierSlipYupkMasterSearch.mcenter = {};
		request.data.carrierSlipYupkMasterSearch.mcenter.centerCd = $route.current.params.centerCd;

		// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			request.data.carrierSlipYupkMasterSearch.carrierSlipYupkId = null;
		}
		// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add End


		// 入力チェック
		api.carrierSlipYupkList.inputCheck(request).then(function(response){

			// 処理結果確認
			if (response.status.statusCode != 1){
				if (response.status.listStatus != null){
					for (var i = 0 ;i <response.status.listStatus.length;i++){
						//取引先CD存在チェック
						if (response.status.listStatus[i].status.statusCode == 8){
							optionMessageControl.show($scope, "tagNm", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						} else if (response.status.listStatus[i].status.statusCode == 5){
							optionMessageControl.show($scope, "tagType", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						} else if (response.status.listStatus[i].status.statusCode == 7){
							optionMessageControl.show($scope, "slipClientZipCd", $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
						}
					}
					return;
				}
			} else {
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
			}

			// マスタデータ登録または更新
			api.carrierSlipYupkList.register(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add Start
				} else if ($scope.screenMode == SCREEN_MODE.Register) {
				// コピー機能追加 ゆうパック送り状マスタ画面修正 2016.07.27 Lin Zar Ni Myint Add End
					// 初期化
					$scope.initScreenHttp();
				}
			});
		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.ProductShippingList.object:ProductShippingList#modalZip
	 * @methodOf oneslogiWms.ProductShippingList.object:ProductShippingList
	 *
	 * @description
	 * ゆうパック送り状検索ボタンを押下された時に処理<br>
	 *
	 * ゆうパック送り状マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalZip = function(){
		var items = {
			// ゆうパック送り状マスタ
			zipCd: $scope.carrierSlipYupk.slipClientZipCd
		};

		//ゆうパック送り状CD
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// ゆうパック送り状マスタ
			$scope.carrierSlipYupk.slipClientZipCd = selectedItem.zipCd;

			if((($scope.carrierSlipYupk.slipClientAddress1 == null)||($scope.carrierSlipYupk.slipClientAddress1 == ""))&&
					(($scope.carrierSlipYupk.slipClientAddress2 == null)||($scope.carrierSlipYupk.slipClientAddress2 == ""))&&
					(($scope.carrierSlipYupk.slipClientAddress3 == null)||($scope.carrierSlipYupk.slipClientAddress3 == ""))
					){

				$scope.carrierSlipYupk.slipClientAddress1 =  selectedItem.address1;
				$scope.carrierSlipYupk.slipClientAddress2 =  selectedItem.address2;
				$scope.carrierSlipYupk.slipClientAddress3 =  selectedItem.address3;
			};

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.carrierSlipYupkListBulkInput.object:carrierSlipYupkListBulkInput#zipCdBlur
	 * @methodOf oneslogiWms.carrierSlipYupkListBulkInput.object:carrierSlipYupkListBulkInput
	 *
	 * @description
	 * ゆうパック送り状のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ゆうパック送り状の情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function() {

		// 入力された郵便コードを取得
		var zipCd = $scope.carrierSlipYupk.slipClientZipCd;

		if((($scope.carrierSlipYupk.slipClientAddress1 == null)||($scope.carrierSlipYupk.slipClientAddress1 == ""))&&
				(($scope.carrierSlipYupk.slipClientAddress2 == null)||($scope.carrierSlipYupk.slipClientAddress2 == ""))&&
				(($scope.carrierSlipYupk.slipClientAddress3 == null)||($scope.carrierSlipYupk.slipClientAddress3 == ""))){

			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.zip.record(request).then(function(response){
					$scope.carrierSlipYupk.slipClientAddress1 =  response.data.mZip.address1;
					$scope.carrierSlipYupk.slipClientAddress2 =  response.data.mZip.address2;
					$scope.carrierSlipYupk.slipClientAddress3 =  response.data.mZip.address3;
				});
			}
		};
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
