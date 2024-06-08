angular.module('oneslogiWms.SelectClient', [])
//サーバへ通信するAPI定義サービスを設定
.factory('SelectClientApi', ['AngularAPIClient', function(AngularAPIClient) {
	return {
		selectClient : AngularAPIClient.make(
				[
				 ['initNew', 'GET', 'resources/common/selectClient/initNew'],
				 ['initialize', 'GET', 'resources/common/selectClient/initialize'],
				 ['changeCenterList', 'POST', 'resources/common/selectClient/changeCenterList'],
				 ['decide', 'POST', 'resources/common/selectClient/decide']
				 ]
		)
	};
}])
.controller('SelectClient', ['$scope', 'SelectClientApi', '$route', '$q', 'userInfo', 'statusInfo', '$rootScope', '$location', '$window', 'owsCommon', 'alertMessage', function($scope, api, $route, $q, userInfo, statusInfo, $rootScope, $location, $window, owsCommon, alertMessage) {

	//センタ変更に伴う荷主リスト再取得
	$scope.centerChange = function() {
		var defferd = $q.defer();
		var params = {};
		params = $scope.selectClient;
		if(params.selCenterCd){
			api.selectClient.changeCenterList(params)
			.then(function(data){

				// 処理結果確認
				if (!statusInfo.isSuccessAndShowMessage(data, 'chgclientform')) {
					deferred.reject();
					return;
				}

				$scope.clientList = data.userClientDto.data;
				if($scope.clientList.length>1){
					$scope.clientListed = true;
					$scope.clientNotListed = false;
					$scope.clientNoData = false;
				} else if($scope.clientList.length==1){
					$scope.clientListed = false;
					$scope.clientNotListed = true;
					$scope.clientNoData = false;
					$scope.selClientCd = data.selClientCd;
					$scope.selectClient.selClientCd = data.selClientCd;
					$scope.selectClient.selClientNm = data.selClientNm;
				} else {
					$scope.clientListed = false;
					$scope.clientNotListed = false;
					$scope.clientNoData = true;
					$scope.selClientCd = data.selClientCd;
					$scope.selectClient.selClientCd = "";
					$scope.selectClient.selClientNm = "";
				}
				defferd.resolve();
			});
		}
		return defferd.promise;
	};

	var promiseClientList = function() {
		var defferd = $q.defer();
		var params = {};
		api.selectClient.initialize(params)
		.then(function(data){

			// 処理結果確認
			if (!statusInfo.isSuccessAndShowMessage(data, 'chgclientform')) {
				deferred.reject();
				return;
			}

			$scope.selectClient = data;
			$scope.clientList = data.userClientDto.data;
			$scope.centerList = data.clientCenterDto.listdata;
			if($scope.centerList.length>1){
				$scope.centerListed = true;
				$scope.centerNotListed = false;
				$scope.centerNoData = false;
				$scope.selCenterCd = data.selCenterCd;
				$scope.selectClient.selCenterCd = data.selCenterCd;
				$scope.selectClient.selCenterNm = data.selCenterNm;
				// [ON推-品向-600] センタ情報が1件のみの場合の表示修正 2015.03.27 watanabe Start
				} else if($scope.centerList.length==1){
				$scope.centerListed = false;
				$scope.centerNotListed = true;
				$scope.centerNoData = false;
				$scope.selCenterCd = data.selCenterCd;
				$scope.selectClient.selCenterCd = $scope.centerList[0].centerCd;
				$scope.selectClient.selCenterNm = $scope.centerList[0].centerNm;
			} else {
				$scope.centerListed = false;
				$scope.centerNotListed = false;
				$scope.centerNoData = true;
				$scope.selCenterCd = data.selCenterCd;
				$scope.selectClient.selCenterCd = "";
				$scope.selectClient.selCenterNm = "";
				// [ON推-品向-600] センタ情報が1件のみの場合の表示修正 2015.03.27 watanabe End
			}
			if($scope.clientList.length>1){
				$scope.clientListed = true;
				$scope.clientNotListed = false;
				$scope.clientNoData = false;
				$scope.selClientCd = data.selClientCd;
				$scope.selectClient.selClientCd = data.selClientCd;
				$scope.selectClient.selClientNm = data.selClientNm;
			} else if($scope.clientList.length==1){
				$scope.clientListed = false;
				$scope.clientNotListed = true;
				$scope.clientNoData = false;
				$scope.selClientCd = data.selClientCd;
				$scope.selectClient.selClientCd = data.selClientCd;
				$scope.selectClient.selClientNm = data.selClientNm;
			} else {
				$scope.clientListed = false;
				$scope.clientNotListed = false;
				$scope.clientNoData = true;
				$scope.selClientCd = data.selClientCd;
				$scope.selectClient.selClientCd = "";
				$scope.selectClient.selClientNm = "";
			}
			defferd.resolve();
		});
		return defferd.promise;
	};
	promiseClientList();

	// 登録
	$scope.register = function() {
		if(owsCommon.viewConfirm("changeCenterClientConfirm")){
			if($scope.selectClient.selCenterCd!=""){
				if(($scope.selectClient.selClientCd!="" && !$scope.clientNoData)){
					var request = {};
					request = $scope.selectClient;
					api.selectClient.decide(request)
					.then(function(data) {

						// 処理結果確認
						if (!statusInfo.isSuccessAndShowMessage(data, 'chgclientform')) {
							// [#462] スクリプトエラー発生(問題のコード削除) 2017.03.14 kawana
							return;
						}

						//正常終了時
						userInfo.clientCd = data.selClientCd;
						userInfo.clientNm = data.selClientNm;
						userInfo.clientId = data.selClientId;
						userInfo.centerCd = data.selCenterCd;
						userInfo.centerNm = data.selCenterNm;
						userInfo.centerId = data.selCenterId;

						$window.location.hash=commonRedirectUrl;
						$window.location.reload();
					});
				}

			} else {
				alertMessage.setErrorMessageByCode("cancelChangeCenterClient");
			}
		}
	};

}]);
