angular.module('oneslogiWms.InventoryDateMasterEdit', [])
.factory('inventoryDateMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		inventoryDateMasterEdit: AngularAPIClient.make([
			['initUpdate',         'GET',  'resources/master/inventoryDateMasterEdit/initUpdate'],
			['inputCheck',         'POST', 'resources/master/inventoryDateMasterEdit/inputCheck'],
			['register',           'POST', 'resources/master/inventoryDateMasterEdit/register'],
		]),
		dropdownList: AngularAPIClient.make(
				[
				 ['query', 'GET', 'resources/common/centerClass/keyValueList']
				 ]
		),
	};
}])

.controller('InventoryDateMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'inventoryDateMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

	/***
	 * 画面初期化処理
	 */
	$scope.initScreen = function() {

		// 画面コントロールの初期化
		$scope.initializeControls()
			.then(function(){
				// 画面初期値設定
				$scope.initializeValue();
			});

	}

	/***
	 * コントロール初期化処理
	 */
	$scope.initializeControls = function(){
		var deferred = $q.defer();

		// モード設定
		$scope.screenMode = $route.current.params.mode;


		// 拠点、荷主ドロップリストの設定
		$scope.centerCdList = userInfo.centerList;
		$scope.clientCdList = userInfo.clientList;


		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetSundayFlg(),
			$scope.deferredGetTargetDateEdit(),
			$scope.deferredGetInvDateEdit()
		])
		.then(function(){
			return $scope.deferredGetForm();
		})
		.then(function(){
			return deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 日曜フラグ
	 */
	$scope.deferredGetSundayFlg = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "SUNDAY_FLG";

		api.dropdownList.query(request).then(function(response){
			$scope.sundayFlgList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 対象年月日の曜日
	 */
	$scope.deferredGetTargetDateEdit = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DAYS_OF_WEEK";

		api.dropdownList.query(request).then(function(response){
			$scope.targetDateEditList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};
	/***
	 * たな卸実施日の曜日
	 */
	$scope.deferredGetInvDateEdit = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "DAYS_OF_WEEK";

		api.dropdownList.query(request).then(function(response){
			$scope.invDateEditList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


//	/***
//	 * 画面モデル取得処理
//	 */
	$scope.deferredGetForm = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerCd = $route.current.params.centerCd;
		request.mfinvoperationId = $route.current.params.mfinvoperationId;


		api.inventoryDateMasterEdit.initUpdate(request).then(function(response){
			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				// 前画面に戻る
				owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
				deferred.reject();
				return;
			}
				//結果設定
			$scope.head = response.data.head;

			$scope.targetDateChange();
			$scope.invDateChange();

			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){
		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

	/***
	 * 対象年月日の曜日変換
	 */

	$scope.targetDateChange = function(){

		var targetDate = $scope.head.targetDate;

		targetDate	=	targetDate.slice(0,4) + "/" + targetDate.slice(4,6) + "/" + targetDate.slice(6,8);

		var targetDataDt = new Date(targetDate);
		var targetDateWeek = String(targetDataDt.getDay());
		if (targetDateWeek === "0"){
			targetDateWeek =  "7";
		}

		$scope.head.targetDateEdit	=	targetDateWeek;

	}
	/***
	 * たな卸実施日の曜日変換
	 */
	$scope.invDateChange	=	function(){

		var invDate = $scope.head.invDate;

		invDate	=	invDate.slice(0,4) + "/" + invDate.slice(4,6) + "/" + invDate.slice(6,8);

		var invDateDt = new Date(invDate);
		var invDateWeek = String(invDateDt.getDay());
		if (invDateWeek === "0"){
			invDateWeek =  "7";
		}

		$scope.head.invDateEdit	=	invDateWeek;

	}

	/***
	 * 登録
	 */
	$scope.registerClick = function() {

		// 登録時初期化処理
		$scope.initRegister();

		// クライアント側入力チェック
		$scope.clientInputCheck();

		//1.登録前処理
		//1.1.入力チェック(対象年月日の前6桁とたな卸実施日の前6桁が同じかどうか)
		var inv = $scope.head.invDate;
		var tar = $scope.head.targetDate;
		if( inv.slice(0,5) != tar.slice(0,5) ){
			 alertMessage.setErrorMessageByCode("differentInventoryDateImplementationDateError");
			 return null;
		 }

		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		// チェック処理
		api.inventoryDateMasterEdit.inputCheck(request).then(function(response){
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
				return;
			}

		// 登録処理
			api.inventoryDateMasterEdit.register(request).then(function(response){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					return;
				}
					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);

			});
		});
	};


	$scope.initRegister = function() {
		// 業務エラーのクリア
		optionMessageControl.hideAll($scope);
	};

	$scope.clientInputCheck = function() {
		// 必要に応じて、クライアント側チェック処理を記載
	};

	/***
	 * 画面初期化処理を実行
	 */
	$scope.initScreen();

}]);
