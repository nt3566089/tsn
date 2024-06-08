/**
 * @ngdoc overview
 * @name oneslogiWms.CarrierSlipYmtMasterEdit
 *
 * @description
 * ヤマト送り状マスタメンテナンス(編集)画面<br>
 *
 * ヤマト送り状マスタメンテナンスデータに対する新規登録・訂正を行う為の画面。
 */
angular.module('oneslogiWms.CarrierSlipYmtMasterEdit', [])

/**
 * @ngdoc service
 * @name oneslogiWms.CarrierSlipYmtMasterEdit.service:carrierSlipYmtMasterEditApi
 *
 * @description
 * ヤマト送り状マスタメンテナンス(編集)画面用WebAPI定義<br>
 *
 * 当画面の制御に必要となるWebAPIはここに実装される。<br>
 * <br>
 * 区分値データ操作用WebApi<br>
 * ・resources/common/centerClass/keyValueList ドロップダウンリスト用データ取得WebAPI<br>
 * <br>
 * ヤマト送り状マスタメンテナンスデータ操作用WebApi<br>
 * ・resources/master/carrierSlipYmtMasterEdit/initNew 新規画面用初期データ取得WebAPI<br>
 * ・resources/master/carrierSlipYmtMasterEdit/initUpdate 更新画面用初期データ取得WebAPI<br>
 * ・resources/master/carrierSlipYmtMasterEdit/inputCheck 入力チェック（登録と更新）WebAPI<br>
 * ・resources/master/carrierSlipYmtMasterEdit/register 入力データ登録WebAPI<br>
 * ・resources/master/carrierSlipYmtMasterEdit/update 入力データ更新WebAPI<br>
 */
.factory('CarrierSlipYmtMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
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
		carrierSlipYmtList: AngularAPIClient.make(
				[
				 ['initNew',            'GET',  'resources/master/carrierSlipYmtMasterEdit/initNew'],
				 ['initUpdate',         'GET',  'resources/master/carrierSlipYmtMasterEdit/initUpdate'],
				 ['inputCheck',         'POST', 'resources/master/carrierSlipYmtMasterEdit/inputCheck'],
				 ['register',           'POST', 'resources/master/carrierSlipYmtMasterEdit/register'],
				 ['update',             'POST', 'resources/master/carrierSlipYmtMasterEdit/update']
				 ]
		)
	};
}])

/**
 * @ngdoc object
 * @name oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit
 *
 * @description
 * ヤマト送り状マスタメンテナンス(編集)画面用コントローラ<br>
 *
 * 当画面の制御ロジックはここに実装される。
 */
.controller('CarrierSlipYmtMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'CarrierSlipYmtMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit#initScreen
	 * @methodOf oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit
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
	 * @name oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit#initScreenHttp
	 * @methodOf oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit
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
				 $scope.deferredGetPackingShowFlg(),
				 $scope.deferredGetSlipType(),
				 $scope.deferredGetCoolCls()
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
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetCharacterCd
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
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

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.characterCdList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana Start
	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetPackingShowFlg
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * 個数口表示フラグ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetPackingShowFlg = function () {
		// [ON推-品向-969] 文字コードの区分値定義不正を修正 2015.10.05 kawana End
		var deferred = $q.defer();

		var request = {};
		request.classCd = "PACKING_SHOW_FLG";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.packingShowFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetSlipType
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * 送り状種別取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetSlipType = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SLIP_TYPE";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.slipTypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster#deferredGetSlipType
	 * @methodOf oneslogiWms.CarrierSlipYmtMaster.object:CarrierSlipYmtMaster
	 *
	 * @description
	 * クール区分取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetCoolCls = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "COOL_CLS";

		owsCommon.getDataCacheable(api.dropdownList, request).then(function(response){
			$scope.coolClsList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit#deferredGetInitData
	 * @methodOf oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit
	 *
	 * @description
	 * ヤマト送り状マスタデータ取得・設定処理（同期可能）<br>
	 *
	 * サーバとの通信を行い、取得結果を画面項目に反映する。
	 */
	$scope.deferredGetInitData = function () {
		var deferred = $q.defer();

		// 画面モード判定
		// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
		// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add End
			// 訂正
			var request = {};
			request.carrierSlipYmtId = $route.current.params.carrierSlipYmtId;

			api.carrierSlipYmtList.initUpdate(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				// ヘッダ関連
				$scope.carrierSlipYmt = response.data.carrierSlipYmtList[0];

				// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add Start
				if ($scope.screenMode == SCREEN_MODE.Update) {
				// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add End
					directiveControl.editable($scope, 'tagType', false);
				// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add Start
				} else {
					$scope.carrierSlipYmt.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
					directiveControl.editable($scope, 'delFlg', false);
				}
				// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add End

				//モーダル画面の場合は、初期化の最終処理として、以下関数を呼び出す
//				owsCommon.setFirstFocus('searchinputform');

				deferred.resolve();
			});

		} else {

			// 新規
			api.carrierSlipYmtList.initNew().then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					deferred.reject();
					return;
				}

				// ヘッダ関連
//				$scope.head = response.data.head;
				$scope.carrierSlipYmt = response.data.carrierSlipYmtList[0];

				// 削除の初期値設定
				$scope.carrierSlipYmt.delFlg = owsCommon.getDefaultValue($scope.delFlgList);
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
	 * @name oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit#register
	 * @methodOf oneslogiWms.CarrierSlipYmtMasterEdit.object:CarrierSlipYmtMasterEdit
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
//		request.data.carrierSlipYmtList = {};
//		request.data.carrierSlipYmtList[0] = $scope.carrierSlipYmt;
		request.data.carrierSlipYmtMasterSearch = $scope.carrierSlipYmt;
		request.data.carrierSlipYmtMasterSearch.mcenter = {};
		request.data.carrierSlipYmtMasterSearch.mcenter.centerCd = $route.current.params.centerCd;

		// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add Start
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			request.data.carrierSlipYmtMasterSearch.carrierSlipYmtId = null;
		}
		// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add End


		// 入力チェック
		api.carrierSlipYmtList.inputCheck(request).then(function(response){

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
			api.carrierSlipYmtList.register(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
					return;
				}
				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add Start
				} else if ($scope.screenMode == SCREEN_MODE.Register) {
				// コピー機能追加 ヤマト送り状マスタ画面修正 2016.07.22 Lin Zar Ni Myint Add End
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
	 * ヤマト送り状検索ボタンを押下された時に処理<br>
	 *
	 * ヤマト送り状マスタ検索アシスト画面をモーダル表示する。
	 */
	$scope.modalZip = function(){
		var items = {
			// ヤマト送り状マスタ
			zipCd: $scope.carrierSlipYmt.slipClientZipCd
		};

		//ヤマト送り状CD
		var modalInstance = modalFactory.modalZip(items);

		// モーダル画面が閉じられたら呼ばれるファンクションの登録
		modalInstance.result.then(function(selectedItem){
			// ヤマト送り状マスタ
			$scope.carrierSlipYmt.slipClientZipCd = selectedItem.zipCd;

			if((($scope.carrierSlipYmt.slipClientAddress1 == null)||($scope.carrierSlipYmt.slipClientAddress1 == ""))&&
					(($scope.carrierSlipYmt.slipClientAddress2 == null)||($scope.carrierSlipYmt.slipClientAddress2 == ""))&&
					(($scope.carrierSlipYmt.slipClientAddress3 == null)||($scope.carrierSlipYmt.slipClientAddress3 == ""))
					){

				$scope.carrierSlipYmt.slipClientAddress1 =  selectedItem.address1;
				$scope.carrierSlipYmt.slipClientAddress2 =  selectedItem.address2;
				$scope.carrierSlipYmt.slipClientAddress3 =  selectedItem.address3;
			};

		});
	};

	/**
	 * @ngdoc method
	 * @name oneslogiWms.carrierSlipYmtListBulkInput.object:carrierSlipYmtListBulkInput#zipCdBlur
	 * @methodOf oneslogiWms.carrierSlipYmtListBulkInput.object:carrierSlipYmtListBulkInput
	 *
	 * @description
	 * ヤマト送り状のロストフォーカス処理<br>
	 *
	 * サーバとの通信を行い、ヤマト送り状の情報を取得し画面項目に反映する。
	 */
	$scope.zipCdBlur = function() {

		// 入力された郵便コードを取得
		var zipCd = $scope.carrierSlipYmt.slipClientZipCd;

		if((($scope.carrierSlipYmt.slipClientAddress1 == null)||($scope.carrierSlipYmt.slipClientAddress1 == ""))&&
				(($scope.carrierSlipYmt.slipClientAddress2 == null)||($scope.carrierSlipYmt.slipClientAddress2 == ""))&&
				(($scope.carrierSlipYmt.slipClientAddress3 == null)||($scope.carrierSlipYmt.slipClientAddress3 == ""))){

			if (zipCd && 0 < zipCd.length) {
				var request = {};
				request.zipCd = zipCd;

				api.zip.record(request).then(function(response){
					$scope.carrierSlipYmt.slipClientAddress1 =  response.data.mZip.address1;
					$scope.carrierSlipYmt.slipClientAddress2 =  response.data.mZip.address2;
					$scope.carrierSlipYmt.slipClientAddress3 =  response.data.mZip.address3;
				});
			}
		};
	};

	// 画面初期化処理を実行
	$scope.initScreen();

}]);
