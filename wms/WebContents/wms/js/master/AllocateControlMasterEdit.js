angular.module('oneslogiWms.AllocateControlMasterEdit', [])
.factory('allocateControlMasterEditApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		dropdownList: AngularAPIClient.make([
			['query'	,'GET'	,'resources/common/centerClass/keyValueList'],
			['queryCenter'		,'GET'	,'resources/common/centerClass/centerKeyValueList'],
		]),
		productRecord: AngularAPIClient.make([
			['record'	,'GET'	,'resources/common/product/record'],
		]),
		allocateControlMasterEdit: AngularAPIClient.make([
			['initNew',            'GET',  'resources/master/allocateControlMasterEdit/initNew'],
			['initUpdate',         'GET',  'resources/master/allocateControlMasterEdit/initUpdate'],
			['inputCheck',         'POST', 'resources/master/allocateControlMasterEdit/inputCheck'],
			['register',           'POST', 'resources/master/allocateControlMasterEdit/register'],
			['update',             'POST', 'resources/master/allocateControlMasterEdit/update'],
		]),
	};
}])

.controller('AllocateControlMasterEdit', ['$scope', '$route', '$filter', '$location', '$q', 'alertMessage', 'directiveControl', 'gridDirectiveControl', 'optionMessageControl', 'gridOptionMessageControl', 'owsHistory', 'owsCommon', 'userInfo', 'statusInfo', 'modalFactory', 'allocateControlMasterEditApi', function($scope, $route, $filter, $location, $q, alertMessage, directiveControl, gridDirectiveControl, optionMessageControl, gridOptionMessageControl, owsHistory, owsCommon, userInfo, statusInfo, modalFactory, api){

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

		// 検索条件枠を開いた状態に設定
		$scope.isopen = true;

		// 荷主ドロップリストの設定
		$scope.clientList = userInfo.clientList;

		// 画面初期化とドロップリストの設定
		$q.all([
			$scope.deferredGetdesignflg(),
			$scope.deferredGetvalidtype(),
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
	 * 画面モデル取得処理
	 */
	$scope.deferredGetForm = function () {
		var deferred = $q.defer();

		// 画面モード判定
		if ($scope.screenMode == SCREEN_MODE.Update || $scope.screenMode == SCREEN_MODE.Copy) {
			// 修正
			var request = {};

			request.mfpickctlId = $route.current.params.mfpickctlId;
			request.clientCd = $route.current.params.clientCd;

			api.allocateControlMasterEdit.initUpdate(request).then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					// 前画面に戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);
					deferred.reject();
					return;
				}

				//結果設定
				$scope.head = response.data.head;

				if ($scope.screenMode == SCREEN_MODE.Update) {
					// 更新モード
					// キー項目の編集可否設定
					directiveControl.editable($scope, 'productCd', false);
					directiveControl.editable($scope, 'pickfrdate', false);
				} else {
					// 複製モード
					// キー項目の編集可否設定
					directiveControl.editable($scope, 'pickfrdate', true);
					directiveControl.editable($scope, 'productCd', true);
				}

				deferred.resolve();
			});

		} else {
			// 新規
			api.allocateControlMasterEdit.initNew().then(function(response){
				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
					deferred.reject();
					return;
				}

				//結果設定
				$scope.head = response.data.head;

				// キー項目の編集可否設定
				directiveControl.editable($scope, 'pickfrdate', true);
				directiveControl.editable($scope, 'productCd', true);

				deferred.resolve();
			});
		}
		return deferred.promise;
	};


	/***
	 * 初期値設定処理
	 */
	$scope.initializeValue = function(){

		// 初期値設定
		if ($scope.screenMode == SCREEN_MODE.Copy) {
			// コピーモード
			$scope.head.mfpickctlId = null;

		}else if($scope.screenMode == SCREEN_MODE.Create){
			// 新規モード
			$scope.head.clientCd = $route.current.params.clientCd;
		}

		// 最初の項目にフォーカス設定
		owsCommon.setFirstFocus();
	}

//	/***
//	 * 削除
//	 */
//	$scope.deferredGetDelFlg = function () {
//		var deferred = $q.defer();
//
//		var request = {};
//		request.classCd = "DEL_FLG";
//
//		api.classDtlList.query(request).then(function(response){
//			$scope.delFlgList = response.data;
//			deferred.resolve();
//		});
//
//		return deferred.promise;
//	};


	/***
	 * デザイン区分
	 */
	$scope.deferredGetdesignflg = function () {
		var deferred = $q.defer();

		var request = {};
		request.centerId = userInfo.clientId;
		request.classCd = "DESIGNFLG";

		api.dropdownList.queryCenter(request).then(function(response){
			$scope.pickrank1List = response.data;
			$scope.pickrank2List = response.data;
			$scope.pickrank3List = response.data;
			$scope.pickrank4List = response.data;
			$scope.pickrank5List = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};


	/***
	 * 有効区分
	 */
	$scope.deferredGetvalidtype = function () {
		var deferred = $q.defer();

		var request = {};
		request.classCd = "VALIDTYPE";

		api.dropdownList.query(request).then(function(response){
			$scope.validtypeList = response.data;
			deferred.resolve();
		});

		return deferred.promise;
	};

	/***
	 * 銘柄
	 */
	$scope.modalProduct = function(){
		//商品Aを呼び出してる
		var items = {
				clientCd: $scope.head.clientCd,
				productCd: $scope.head.productCd
		};

		var modalInstance = modalFactory.modalProduct(items);

		modalInstance.result.then(function(selectedItem){
			$scope.head.productCd = selectedItem.productCd;
			$scope.head.productNm = selectedItem.productNm;
		});
	};

	$scope.productCdBlur = function() {
		// コード未入力の場合は、名称を空に設定
		if(!$scope.head.productCd){
			$scope.head.productNm = null;
			return;
		}


		var request ={};

		request.clientId = userInfo.clientIdByCd($scope.head.clientCd);
		request.productCd = $scope.head.productCd;

		$scope.head.productNm = null;

		api.productRecord.record(request).then(function(response){
			$scope.head.productNm = response.data.mProduct.productNm;
		});
   };

	/***
	 * 登録
	 */
	$scope.registerClick = function() {
		// 登録時初期化処理
		$scope.initRegister();

		// クライアント側入力チェック
		$scope.clientInputCheck();


		//デ変重複チェック
		var arrayDesignflgs = [
								$scope.head.pickrank1,
								$scope.head.pickrank2,
								$scope.head.pickrank3,
								$scope.head.pickrank4,
								$scope.head.pickrank5
							];

		var DesignflgscheckList = [];
		for(var i = 0; i < arrayDesignflgs.length; i++){
			if(!arrayDesignflgs[i]){
				continue;
			}
			if(DesignflgscheckList.includes(arrayDesignflgs[i])){
				alertMessage.setErrorMessageByCode("designChangeMultipleError");
				return false;
			}else{
				DesignflgscheckList.push(arrayDesignflgs[i]);
			}
		}

		//デ変前詰めチェック
		var arrayPickranks = [
								$scope.head.pickrank1,
								$scope.head.pickrank2,
								$scope.head.pickrank3,
								$scope.head.pickrank4,
								$scope.head.pickrank5
							];
		var isBlank = false;

		for(var row = 0; row < arrayPickranks.length; row++){
			if(!arrayPickranks[row]){
				//入力なしの場合
				isBlank = true;
			}else{
				//入力ありの場合

				//現在の状態が入力なしの場合はエラー
				if (isBlank === true){
					alertMessage.setErrorMessageByCode("designChangeMissingpartsError");
					return;
				}

				isBlank = false;
			}

		};


		// 適用開始日に業務日付よりも過去の日付が入力された場合のエラー
		var pickdate = $scope.head.pickfrdate;
		var sysDt    = $scope.userInfo.systemDt;
		if(pickdate < sysDt){
		   alertMessage.setErrorMessageByCode("pastStartApplyDateInputError");
		   return null;
		}


		//適用開始日に不正な日付を入力した場合のエラー

		var maxdate ="2100/01/01"
		if(pickdate >= maxdate){
		   alertMessage.setErrorMessageByCode("incorrectStartApplyDateInputError");
		    return null;
		}


		// 画面内容を引数に設定
		var request = {};
		request.data = {};
		request.data.head = $scope.head;
		request.data.head.centerId = userInfo.centerId;
		request.data.head.centerCd = userInfo.centerCd;

		// チェック処理
		api.allocateControlMasterEdit.inputCheck(request).then(function(response){
			if (!statusInfo.isSuccessAndShowMessage(response, 'searchinputform')) {
				return;
			}
				//新規複製の場合の登録処理
			if ($scope.screenMode == SCREEN_MODE.Create || $scope.screenMode == SCREEN_MODE.Copy){
				api.allocateControlMasterEdit.register(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
						return;
					}

					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);

				});
				//修正の場合の更新処理
			}else{($scope.screenMode == SCREEN_MODE.Update)
				api.allocateControlMasterEdit.update(request).then(function(response){
					// 処理結果確認
					if (!statusInfo.isSuccessAndShowMessage(response, 'searchInputForm')) {
						return;
					}

					// 前画面へ戻る
					owsCommon.viewInfoAndHistoryBack(response.status.messageCode, response.status.messageReplaceValue);

				});

			}
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
