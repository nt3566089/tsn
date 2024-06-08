/**
 * 日付FromTo大小チェック用メッセージコード
 */
FROM_TO_MESSAGE_CD = "inputLimitCheckReversalError";
LOCATION_FROM_TO_MESSAGE_CD = "inputLimitCheckCdReversalError";
SHIPPINGDT_CHECK_MESSAGE_CD = "shipDateCannotChangeBeforeWorkDateError";
SHIPPINGDT_DELIVPLANDT_CHECK_MESSAGE_CD = "delivPlanDateCannotChangeBeforeShipDateError";
WORKDT_DELIVPLANDT_CHECK_MESSAGE_CD = "delivPlanDateCannotChangeBeforeWorkDateError";
SHIPPINGDT_DELIVDT_CHECK_MESSAGE_CD = "delivDateCannotChangeBeforeShipDateError";
WORKDT_DELIVDT_CHECK_MESSAGE_CD = "delivDateCannotChangeBeforeWorkDateError";
angular.module('oneslogiWebSd',
		[
		 'oneslogiWeb.base.sd',
		 'oneslogiWms.Assist',
		 'oneslogiWms.Receive',
		 'oneslogiWeb.SelectClient',
		 'oneslogiWms.Inventory',
		 'oneslogiWms.Shipping',
		 /* 2015/10/20 INOUE ADD START 簡易ログイン対応 */
		 'oneslogiWeb.base.liteLogin.PasswordChange',
		 /* 2015/10/20 INOUE ADD END */
		/* [HT自動印刷対応] 2016.5.27 inoue Start */
		 'oneslogiWeb.base.common.UserAutoPrintSettingEdit',
		 'oneslogiWeb.base.common.UserAutoPrintSettingList',
		/* [HT自動印刷対応] 2016.5.27 inoue End */
		 'chart.js'
		 ]
)
//サーバへ通信するAPI定義サービスを設定
.factory('commonApi', function(AngularAPIClient) {
	return {
		userClient: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/userClient/keyValueList']
				 ]
		),
		userCenter: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/userCenter/keyValueList']
				 ]
		),
		userWarehouse: AngularAPIClient.make(
				[
				 ['keyValueList', 'GET', 'resources/common/userWarehouse/keyValueList']
				 ]
		),
		userLogin: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/userLogin/record']
				 ]
		),
		clientCenter: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/clientCenter/record']
				 ]
		),
		checkSystemDt: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/checkSystemDt/record']
				 ]
		// [#1056][Ver2.2.0] SD版戻るボタン国際化対応 2017.04.04 honma Add Start
		),
		message: AngularAPIClient.make(
				[
				 ['record', 'GET', 'resources/common/message/record']
				 ]
		// [#1056][Ver2.2.0] SD版戻るボタン国際化対応 2017.04.04 honma Add End
		)
	};
})
//ルーティングの設定
.config(['$httpProvider', '$stateProvider', '$ionicConfigProvider', '$urlRouterProvider', function($httpProvider, $stateProvider, $ionicConfigProvider, $urlRouterProvider) {

	var init = false;
	//$ionicConfigProvider.views.maxCache(0);
	commonRedirectUrl += '/';
	$stateProvider.state('all', {
		url: '/:system/:subSystem/:screenCd',
		abstract: true,
		views:{
            'mainContent' : {
            	//template: '<ion-nav-view name="mainContent" animation="slide-right-left"></ion-nav-view>',
/*            	controller: ['$scope', '$state', '$ionicHistory',
            	             function( $scope, $state, $ionicHistory) {
            					alert('in "all" state');
            	                 $state.go('all.abstract.search');
            	             }],*/
            },
            'menuContent' : {templateUrl: 'base/partials/menu/SideMenuSD.html'},
        },
        resolve: {
            getData: ['$stateParams', '$q', '$rootScope', 'owsSystem', 'owsCulture', 'owsTerminal', 'owsMessage', 'owsMenu', 'owsScreen', 'owsItem', 'owsColumn', 'commonApi', 'userInfo', 'statusInfo', 'tmhDynamicLocale', function($stateParams, $q, $rootScope, owsSystem, owsCulture, owsTerminal, owsMessage, owsMenu, owsScreen, owsItem, owsColumn, api, userInfo, statusInfo, tmhDynamicLocale) {


            	return $q.all(
            			[
            			 owsSystem.getData(),
            			 owsCulture.getData(),
// [#6666][v3.1] 端末設定機能の追加 2019.11.18 kawana Start
						 owsTerminal.getData()
// [#6666][v3.1] 端末設定機能の追加 2019.11.18 kawana End
            			 ]
            	)
        		.then(function() {
        			if(!init)
        				return owsMessage.getData();
        			else
        				return
            	})
        		.then(function() {
        			if(!init)
        				return owsMenu.getData(true);
        			else
        				return
            	})
        		.then(function() {
        			return $q.all(
                			[
                			 owsScreen.getData($stateParams.screenCd),
                			 owsItem.getData($stateParams.screenCd),
                			 owsColumn.getData($stateParams.screenCd)
                			 ]
                	);
            	})
        		.then(function() {

                	statusInfo.clear();

                	// ２回目以降は初期化しない
                	if (init) {
                		return;
                	}

                	userInfo.userCd = owsSystem.getUserCd();
                	userInfo.userNm = owsSystem.getUserNm();

                	//荷主情報取得定義
                	var promiseClient = function() {
                		var request = {};
                		request.centerId = userInfo.centerId;

                		return api.userClient.keyValueList(request).then(function(response){
                			userInfo.clientList = response.data;
                		});
                	};

                	//センタ情報取得定義
                	var promiseCenter = function() {
                		return api.userCenter.keyValueList().then(function(response){
                			userInfo.centerList = response.data;
                		});
                	};

                	//倉庫情報取得定義
                	var promiseWarehouse = function() {
                        var request = {};
                        request.centerId = userInfo.centerId;

                		return api.userWarehouse.keyValueList(request).then(function(response){
                			userInfo.warehouseList = response.data;
                		});
                	};

                	//ユーザ情報取得定義
                	var promiseUserLogin = function() {
                		return api.userLogin.record().then(function(response){
                			if (response.data.mUserLogin.mclient) {
                    			userInfo.clientId = response.data.mUserLogin.mclient.clientId;
                    			userInfo.clientCd = response.data.mUserLogin.mclient.clientCd;
                    			userInfo.clientNm = response.data.mUserLogin.mclient.clientNm;
                			}
                			if (response.data.mUserLogin.mcenter) {
                    			userInfo.centerId = response.data.mUserLogin.mcenter.centerId;
                    			userInfo.centerCd = response.data.mUserLogin.mcenter.centerCd;
                    			userInfo.centerNm = response.data.mUserLogin.mcenter.centerNm;
                			}
            				// [#2828] センタ別ロケール対応 2017.12.21 kawana Start
            				if (response.data.mUserLogin.mcenter.bculture) {
            					// センタのカルチャで上書き
            					tmhDynamicLocale.set(response.data.mUserLogin.mcenter.bculture.cultureCd.toLowerCase());
            				}
            				// [#2828] センタ別ロケール対応 2017.12.21 kawana End
                		});
                	};

                	// 荷主センタ取得定義
                	var promiseClientCenter = function() {
                		var request = {};
                		request.clientId = userInfo.clientId;
                		request.centerId = userInfo.centerId;

                		return api.clientCenter.record(request).then(function(response){
                			if (response.data.mClientCenter) {
                    			userInfo.systemDt = response.data.mClientCenter.systemDt;
                    			// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
                    			if(response.data.mClientCenter.beforeSystemDt != null){
                    				userInfo.beforeSystemDt = response.data.mClientCenter.beforeSystemDt;
                    			}else{
                    				userInfo.beforeSystemDt = userInfo.systemDt;
                    			}
                    			userInfo.tkeepingDays = response.data.mClientCenter.mparamAsOne.tkeepingDays;
                    			// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End
                			} else {
                                var nowDate = new Date();
                    			userInfo.systemDt = nowDate.getFullYear() + ("0" + (nowDate.getMonth() + 1)).slice(-2) + ("0" + nowDate.getDate()).slice(-2);
                    			// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
                    			userInfo.beforeSystemDt = userInfo.systemDt;
                    			userInfo.tkeepingDays = 0;
                    			// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End
                			}
                		});

                	};

                	//日次処理実行済みチェック
                	var promiseCheckSystemDt = function() {
                		var request = {};
                		request.clientId = userInfo.clientId;
                		request.centerId = userInfo.centerId;

                		return api.checkSystemDt.record(request).then(function(response){
    	                    if(response.status.messageCode=="systemDtWarn"){
                                $rootScope.$broadcast('systemDtExceptionMessage', response);
    	                    }
                		});
                	};
                	// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
                	var promiseBeforeSystemDt = function() {
                		var beforeSystemDt = userInfo.beforeSystemDt;
                		var systemDtTm = beforeSystemDt.slice(0,4) + "/" + beforeSystemDt.slice(4,6) + "/" + beforeSystemDt.slice(6,8);
                		var date = new Date(systemDtTm);
            			var tkeepingDays = userInfo.tkeepingDays;
            			date.setDate(date.getDate()-tkeepingDays);
            			userInfo.beforeSystemDt = date.getFullYear() + ("0" + (date.getMonth() + 1)).slice(-2) + ("0" + date.getDate()).slice(-2);
            			return;
                	};
                	// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End

                	// [#1056][Ver2.2.0] SD版戻るボタン国際化対応 2017.04.04 honma Add Start
                	var promiseBackButtonMessage = function() {
                    	var request = {};
                    	request = {};
                    	request.messageCd = "back";

                		return api.message.record(request).then(function(response) {
                			if (response.data.back) {
                				// platformがandroid, ios, windowsphone, defaultの4種類存在しているが、defaultに指定
                				$ionicConfigProvider.platform.default.backButton.previousTitleText(false).text(response.data.back.bMessage.messageNm);
                			} else {
                				$ionicConfigProvider.platform.default.backButton.previousTitleText(false).text("*戻る");
                			}
                		});
                	};
                	// [#1056][Ver2.2.0] SD版戻るボタン国際化対応 2017.04.04 honma Add End

                	return $q.all(
                			[
                			 promiseUserLogin(),
                			 promiseCenter()
                			 ]
                	)
                	.then(function() {
                		return $q.all(
                				[
                				 promiseWarehouse(),
                				 promiseClient()
                				 ]
                		);
                	})
                	.then(function() {
                		return promiseClientCenter();
                	})
                	.then(function() {
                		return promiseCheckSystemDt();
                	})
                	// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
                	.then(function() {
                		return promiseBeforeSystemDt();
                	})
                	// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End
                	// [#1056][Ver2.2.0] SD版戻るボタン国際化対応 2017.04.04 honma Add Start
                	.then(function() {
                		return promiseBackButtonMessage();
                	})
                	// [#1056][Ver2.2.0] SD版戻るボタン国際化対応 2017.04.04 honma Add End
                	.then(function() {
                		userInfo.init = true;
                		init = true;
                	});

        		});

            }]
        }
	}).state('all.abstract', { // メインメニュー画面
		abstract: true,
		views: {
			'mainContent@' : {
            	template: '<ion-nav-view name="mainContent" animation="slide-right-left"></ion-nav-view>',
            	controllerProvider: function($stateParams) {
            		if($stateParams.screenCd == 'MainMenu') {
            			return 'MainMenuCtrl';
            		}
            		// [#981] SD用基盤改修 2017.02.06 honma Mod Start
            		var ctrlName;
            		if ($stateParams.screenCd.indexOf('SD') !== -1) {
            			ctrlName = $stateParams.screenCd;
            		} else {
            			ctrlName = $stateParams.screenCd + "SD";
            		}
            		// [#981] SD用基盤改修 2017.02.06 honma Mod End
                    return ctrlName;
                }
            }
        }/*,
        resolve: {
            getData: ['$stateParams', '$q', '$rootScope', 'owsSystem', 'owsCulture', 'owsMessage', 'owsMenu', 'owsScreen', 'owsItem', 'owsColumn', 'commonApi', 'userInfo', 'statusInfo', function($stateParams, $q, $rootScope, owsSystem, owsCulture, owsMessage, owsMenu, owsScreen, owsItem, owsColumn, api, userInfo, statusInfo) {

            	return $q.all(
            			[
            			 owsScreen.getData($stateParams.screenCd),
            			 owsItem.getData($stateParams.screenCd),
            			 owsColumn.getData($stateParams.screenCd)
            			 ]
            	)
            }]
        }*/
	}).state('all.abstract.main', { // 検索画面
		url: '/',
		views: {
			'mainContent' : {
            	templateUrl: function(params) {
            		// [#981] SD用基盤改修 2017.02.06 honma Mod Start
            		if (params.screenCd.indexOf('SD') !== -1) {
            			return params.system + '/partials/' + params.subSystem + '/' + params.screenCd + '.html';
            		} else {
            			return params.system + '/partials/' + params.subSystem + '/' + params.screenCd + 'SD.html';
            		}
            		// [#981] SD用基盤改修 2017.02.06 honma Mod End
            	}
            }
        }
	}).state('all.abstract.list', { // 一覧画面
		//url: '/list',
		url: '/',
		views: {
			'mainContent' : {
            	templateUrl: function(params) {
            		// [#981] SD用基盤改修 2017.02.06 honma Mod Start
            		return params.system + '/partials/' + params.subSystem + '/' + params.screenCd + '_list.html';
            		// [#981] SD用基盤改修 2017.02.06 honma Mod End
            	}
            }
        }
	// [#1713] 各ピッキング画面遷移変更による画面追加 2017.04.24 honma Add Start
	}).state('all.abstract.detailList', { // 明細一覧画面
		url: '/',
		views: {
			'mainContent' : {
            	templateUrl: function(params) {
            		// [#981] SD用基盤改修 2017.02.06 honma Mod Start
            		return params.system + '/partials/' + params.subSystem + '/' + params.screenCd + '_detailList.html';
            		// [#981] SD用基盤改修 2017.02.06 honma Mod End
            	}
            }
        }
	// [#1713] 各ピッキング画面遷移変更による画面追加 2017.04.24 honma Add End
	}).state('all.abstract.detail', { // 明細詳細画面
		//url: '/:id',
		url: '/',
		views: {
			'mainContent' : {
            	templateUrl: function(params) {
            		// [#981] SD用基盤改修 2017.02.06 honma Mod Start
            		return params.system + '/partials/' + params.subSystem + '/' + params.screenCd + '_detail.html';
            		// [#981] SD用基盤改修 2017.02.06 honma Mod End
            	}
            }
        }
	}).state('error', { // エラー画面
		url: '/:system/:subSystem/:screenCd/Error',
		views:{
            'mainContent' : {templateUrl: 'base/partials/menu/ErrorSD.html'},
            'menuContent' : {templateUrl: 'base/partials/menu/SideMenuSD.html'},
            'errorContent' : {templateUrl: 'base/partials/menu/ErrorSD.html'}
        },
    }).state('passwordChange', {
    	url: '/PasswordChange',
    	views:{
    		'mainContent': {templateUrl: 'base/partials/liteLogin/PasswordChangeSD.html'}
    	}
    });

	$urlRouterProvider.otherwise(commonRedirectUrl);

    $httpProvider.interceptors.push(['$q', '$log', '$rootScope', function($q, $log, $rootScope) {
        return {
        	'request':function(config){
                var rtmp = $rootScope.duplicateCheckToken;
                if(rtmp){
                	$httpProvider.defaults.headers.common['duplicateCheckToken'] = rtmp;
                } else {
                	delete $httpProvider.defaults.headers.common['duplicateCheckToken'];
                }
        		return config;
        	},
            'responseError': function(response) {
                if ($rootScope.isTokenInvalid) {
                	return $q.reject(response);
                }
                $log.error(response);
                //alertMessageを直接呼べないので、イベントで伝播
            	$rootScope.$broadcast('showCommExceptionMessage', response);
            	return $q.reject(response);
            },
            'response': function(response) {
                if ($rootScope.isTokenInvalid) {
                	return $q.reject(response);
                }
                if(response.headers('duplicateCheckToken')){
                	$rootScope.duplicateCheckToken = response.headers('duplicateCheckToken');
                }
                if (response.data) {
                    if (response.data.status) {
                        //ステータスが０より小さい場合、基盤でキャッチしたエラーが発生
                        if (response.data.status.statusCode < 0) {
                        	// 認証トークン無効エラーの場合
                        	if (response.data.status.statusCode == -102) {
                        		$rootScope.isTokenInvalid = true;
                        		$rootScope.$broadcast('showTokenInvalidExceptionMessage', response);
                        		return $q.reject(response);
                        	} else {
                                $log.warn(response);
                                $rootScope.$broadcast('showBaseExceptionMessage', response);
                                return $q.reject(response);
                        	}
                        } else {
                        	if(response.data.status.statusCode == 101){
                        		$rootScope.$broadcast('dailyCheckExceptionMessage', response);
                        	}
                        }
                    }
                }
                return response || $q.when(response);
            }
        };
    }]);
}])
.factory('statusInfo', ['$filter', 'optionMessageControl', 'gridOptionMessageControl', 'alertMessage', 'directiveControl', 'owsCommon', function($filter, optionMessageControl, gridOptionMessageControl, alertMessage, directiveControl, owsCommon) {

	var statusList = [];

	return {
		clear: function() {
			statusList = [];
		},
		mappingErrorMessage: function(scope, controlId, statusCd, subStatusCd) {
			var statusInfo = {};
			statusInfo.type = 1;
			statusInfo.statusCd = statusCd;
			if (typeof subStatusCd === "undefined") {
				statusInfo.subStatusCd = 0;
			} else {
				statusInfo.subStatusCd = subStatusCd;
			}
			statusInfo.scope = scope;
			statusInfo.controlId = controlId;
			statusList.push(statusInfo);
		},
		mappingGridErrorMessage: function(gridOptions, columnCd, statusCd, subStatusCd) {
			var statusInfo = {};
			statusInfo.type = 2;
			statusInfo.statusCd = statusCd;
			if (typeof subStatusCd === "undefined") {
				statusInfo.subStatusCd = 0;
			} else {
				statusInfo.subStatusCd = subStatusCd;
			}
			statusInfo.gridOptions = gridOptions;
			statusInfo.columnCd = columnCd;
			statusList.push(statusInfo);
		},
		isSuccessAndShowMessage: function(response, formName) {

			// 情報がない場合は何もしない
			if (response.status.listStatus == null || response.status.listStatus.length == 0) {
				return true;
			}

			var error = false;
			var alertError = false;
			var alertWarn = false;

			// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (1/4)
			/** 最初のエラーの情報の退避用 */
			var firstGridErrorInfo = null;
			/** 最初のエラーの位置の退避用 */
			var firstErrorRowIndex = -1;
			/** 項目エラーの有無 */
			var hasControlError = false;
			// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (1/4)
			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana Start
			/** 警告ステータスリスト **/
			var listWarnStatus = [];
			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana End

			// 業務エラーを処理
			for (var i = 0; i < response.status.listStatus.length; i++) {

				// 正常・確認以外はエラー
				if ((response.status.listStatus[i].status.statusCode > 1 && response.status.listStatus[i].status.subStatusCode == 0) ||
					(response.status.listStatus[i].status.statusCode > 1 && response.status.listStatus[i].status.subStatusCode >  1)) {
					error = true;
				}

				var statusCode;
				if (response.status.listStatus[i].status.subStatusCode == 0) {
					statusCode = response.status.listStatus[i].status.statusCode;
				} else {
					statusCode = response.status.listStatus[i].status.subStatusCode;
				}

				switch (statusCode) {
				case 0:
					// 正常終了
					continue;
				case 1:
					// ユーザによる確認
					continue;
				default:
					var statusInfo;
					var hasInfo = false;
					var errorRowIndex = -1;
					for (var j = 0; j < statusList.length; j++) {
						statusInfo = statusList[j];

						if (response.status.listStatus[i].status.statusCode == statusInfo.statusCd && response.status.listStatus[i].status.subStatusCode == statusInfo.subStatusCd) {
							if (statusInfo.type == 1) {
								// 項目エラー
								if (!optionMessageControl.isShow(statusInfo.scope, statusInfo.controlId)) {
									optionMessageControl.show(statusInfo.scope, statusInfo.controlId, $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								}
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (2/4)
								// 項目エラー有
								hasControlError = true;
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (2/4)
							} else if (statusInfo.type == 2) {
								// 列エラー
								if (!gridOptionMessageControl.isShow(statusInfo.gridOptions, statusInfo.columnCd, response.status.listStatus[i].status.rowIndex)) {
									gridOptionMessageControl.show(statusInfo.gridOptions, statusInfo.columnCd, $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
									if (errorRowIndex = -1) {
										errorRowIndex = response.status.listStatus[i].status.rowIndex;
									}
								}
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (3/4)
								// firstGridErrorInfoがNULL（つまり初回）の場合のみ値を退避する。
								if (!firstGridErrorInfo) {
									firstGridErrorInfo = statusInfo;
									firstErrorRowIndex = response.status.listStatus[i].status.rowIndex;
								}
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (3/4)
							}
							hasInfo = true;
						}
					}
					if (!hasInfo && response.status.listStatus[i].status.statusCode > 0) {
						if (response.status.listStatus[i].status.statusType == 2) {
							alertWarn = true;
							// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana Start
							listWarnStatus.push(response.status.listStatus[i].status);
							// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana End
						} else {
							alertError = true;
							alertMessage.setErrorMessageByCode(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue);
						}
					}
				}
			}

			// エラーがある場合は終了
			if (error && (alertError || (!alertWarn && !alertError))) {
				// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (4/4)
//				if (errorRowIndex > -1) {
//					gridDirectiveControl.scrollingByRowIndex(statusInfo.gridOptions, errorRowIndex);
//				}
				// 項目エラーがある場合は、スクロール処理は行わない。
				// 項目エラーが無く、退避していたエラー情報がnot nullである場合は、当該行にスクロールする。
				if (!hasControlError && firstGridErrorInfo) {
					gridDirectiveControl.scrollingByRowIndex(firstGridErrorInfo.gridOptions, firstErrorRowIndex);
				}
				// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (4/4)

				directiveControl.firstErrorOnFocus(formName);
				return false;
			}

			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana Start
			// 警告メッセージを処理
			for (var i = 0; i < listWarnStatus.length; i ++) {
				alertMessage.setWarningMessageByCode(listWarnStatus[i].messageCode, listWarnStatus[i].messageReplaceValue);
			}
			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana End

			// 警告がある場合は終了
			if (alertWarn) {
				return true;
			}

			var cancel = false;

			// ユーザ確認を処理
			for (var i = 0; i < response.status.listStatus.length; i++) {

				var statusCode;
				if (response.status.listStatus[i].status.subStatusCode == 0) {
					statusCode = response.status.listStatus[i].status.statusCode;
				} else {
					statusCode = response.status.listStatus[i].status.subStatusCode;
				}

				if (statusCode == 1) {
					var messageCode = response.status.listStatus[i].status.messageCode;
					if(messageCode == null || messageCode == ""){
						messageCode = response.status.messageCode;
					}
					var ret = owsCommon.viewConfirm(messageCode);
					if (!ret) {
						cancel = true;
						break;
					}
				}
			}

			// キャンセルがある場合は終了
			if (cancel) {
				return false;
			}

			// 正常終了を処理
			for (var i = 0; i < response.status.listStatus.length; i++) {
				if (response.status.listStatus[i].status.statusCode == 0) {
					if (response.status.listStatus[i].status.messageCode != null && response.status.listStatus[i].status.messageCode != "") {
						alertMessage.setInfoMessageByCode(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue);
					}
				}
			}

			return true;
		// [Ver2.2.0] エラー存在チェック処理(メッセージ表示なし)追加 2017.03.09 honma Add Start
		},
		isSuccess: function(response, formName) {

			// 情報がない場合は何もしない
			if (response.status.listStatus == null || response.status.listStatus.length == 0) {
				return true;
			}

			var error = false;
			var alertError = false;
			var alertWarn = false;

			// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (1/4)
			/** 最初のエラーの情報の退避用 */
			var firstGridErrorInfo = null;
			/** 最初のエラーの位置の退避用 */
			var firstErrorRowIndex = -1;
			/** 項目エラーの有無 */
			var hasControlError = false;
			// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (1/4)
			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana Start
			/** 警告ステータスリスト **/
			var listWarnStatus = [];
			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana End

			// 業務エラーを処理
			for (var i = 0; i < response.status.listStatus.length; i++) {

				// 正常・確認以外はエラー
				if ((response.status.listStatus[i].status.statusCode > 1 && response.status.listStatus[i].status.subStatusCode == 0) ||
					(response.status.listStatus[i].status.statusCode > 1 && response.status.listStatus[i].status.subStatusCode >  1)) {
					error = true;
				}

				var statusCode;
				if (response.status.listStatus[i].status.subStatusCode == 0) {
					statusCode = response.status.listStatus[i].status.statusCode;
				} else {
					statusCode = response.status.listStatus[i].status.subStatusCode;
				}

				switch (statusCode) {
				case 0:
					// 正常終了
					continue;
				case 1:
					// ユーザによる確認
					continue;
				default:
					var statusInfo;
					var hasInfo = false;
					var errorRowIndex = -1;
					for (var j = 0; j < statusList.length; j++) {
						statusInfo = statusList[j];

						if (response.status.listStatus[i].status.statusCode == statusInfo.statusCd && response.status.listStatus[i].status.subStatusCode == statusInfo.subStatusCd) {
							if (statusInfo.type == 1) {
								// 項目エラー
								if (!optionMessageControl.isShow(statusInfo.scope, statusInfo.controlId)) {
//									optionMessageControl.show(statusInfo.scope, statusInfo.controlId, $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue));
								}
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (2/4)
								// 項目エラー有
								hasControlError = true;
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (2/4)
							} else if (statusInfo.type == 2) {
								// 列エラー
								if (!gridOptionMessageControl.isShow(statusInfo.gridOptions, statusInfo.columnCd, response.status.listStatus[i].status.rowIndex)) {
//									gridOptionMessageControl.show(statusInfo.gridOptions, statusInfo.columnCd, $filter('owfMessage')(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue), response.status.listStatus[i].status.rowIndex);
									if (errorRowIndex = -1) {
										errorRowIndex = response.status.listStatus[i].status.rowIndex;
									}
								}
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (3/4)
								// firstGridErrorInfoがNULL（つまり初回）の場合のみ値を退避する。
								if (!firstGridErrorInfo) {
									firstGridErrorInfo = statusInfo;
									firstErrorRowIndex = response.status.listStatus[i].status.rowIndex;
								}
								// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (3/4)
							}
							hasInfo = true;
						}
					}
					if (!hasInfo && response.status.listStatus[i].status.statusCode > 0) {
						if (response.status.listStatus[i].status.statusType == 2) {
							alertWarn = true;
							// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana Start
							listWarnStatus.push(response.status.listStatus[i].status);
							// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana End
						} else {
							alertError = true;
//							alertMessage.setErrorMessageByCode(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue);
						}
					}
				}
			}

			// エラーがある場合は終了
			if (error && (alertError || (!alertWarn && !alertError))) {
				// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue Start (4/4)
//				if (errorRowIndex > -1) {
//					gridDirectiveControl.scrollingByRowIndex(statusInfo.gridOptions, errorRowIndex);
//				}
				// 項目エラーがある場合は、スクロール処理は行わない。
				// 項目エラーが無く、退避していたエラー情報がnot nullである場合は、当該行にスクロールする。
				if (!hasControlError && firstGridErrorInfo) {
					gridDirectiveControl.scrollingByRowIndex(firstGridErrorInfo.gridOptions, firstErrorRowIndex);
				}
				// [新WMS-110-021] グリッドにエラーがある時、エラー行にスクロールしない 2015.07.21 inoue End (4/4)

				directiveControl.firstErrorOnFocus(formName);
				return false;
			}

			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana Start
			// 警告メッセージを処理
			for (var i = 0; i < listWarnStatus.length; i ++) {
//				alertMessage.setWarningMessageByCode(listWarnStatus[i].messageCode, listWarnStatus[i].messageReplaceValue);
			}
			// [ON推-品向-1030] エラーの場合は警告メッセージを出さないように変更 2015.01.15 kawana End

			// 警告がある場合は終了
			if (alertWarn) {
				return true;
			}

			var cancel = false;

			// ユーザ確認を処理
			for (var i = 0; i < response.status.listStatus.length; i++) {

				var statusCode;
				if (response.status.listStatus[i].status.subStatusCode == 0) {
					statusCode = response.status.listStatus[i].status.statusCode;
				} else {
					statusCode = response.status.listStatus[i].status.subStatusCode;
				}

				if (statusCode == 1) {
					var messageCode = response.status.listStatus[i].status.messageCode;
					if(messageCode == null || messageCode == ""){
						messageCode = response.status.messageCode;
					}
					var ret = owsCommon.viewConfirm(messageCode);
					if (!ret) {
						cancel = true;
						break;
					}
				}
			}

			// キャンセルがある場合は終了
			if (cancel) {
				return false;
			}

			// 正常終了を処理
			for (var i = 0; i < response.status.listStatus.length; i++) {
				if (response.status.listStatus[i].status.statusCode == 0) {
					if (response.status.listStatus[i].status.messageCode != null && response.status.listStatus[i].status.messageCode != "") {
//						alertMessage.setInfoMessageByCode(response.status.listStatus[i].status.messageCode, response.status.listStatus[i].status.messageReplaceValue);
					}
				}
			}

			return true;
		// [Ver2.2.0] エラー存在チェック処理(メッセージ表示なし)追加 2017.03.09 honma Add End
		}
	};
}])
.factory('userInfo', function() {
	var init = false;
	var userCd;
	var userNm;
	var clientList;
	var centerList;
	var warehouseList;
	var clientId;
	var clientCd;
	var clientNm;
	var centerId;
	var centerCd;
	var centerNm;
	var systemDt;
	// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
	var beforeSystemDt;
	// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End
	return {
		init: init,
		userCd: userCd,
		userNm: userNm,
		clientList: clientList,
		clientIdByCd: function(code) {
			for (var i = 0; i < this.clientList.length; i++) {
				if (this.clientList[i].clientCd == code) {
					return this.clientList[i].clientId;
				}
			}
			return null;
		},
		centerList: centerList,
		centerIdByCd: function(code) {
			for (var i = 0; i < this.centerList.length; i++) {
				if (this.centerList[i].centerCd == code) {
					return this.centerList[i].centerId;
				}
			}
			return null;
		},
		centerCdById: function(id) {
			for (var i = 0; i < this.centerList.length; i++) {
				if (this.centerList[i].centerId == id) {
					return this.centerList[i].centerCd;
				}
			}
			return null;
		},
		warehouseList: warehouseList,
		warehouseIdByCd: function(code) {
			for (var i = 0; i < this.warehouseList.length; i++) {
				if (this.warehouseList[i].warehouseCd == code) {
					return this.warehouseList[i].warehouseId;
				}
			}
			return null;
		},
		clientId: clientId,
		clientCd: clientCd,
		clientNm: clientNm,
		centerId: centerId,
		centerCd: centerCd,
		centerNm: centerNm,
		systemDt: systemDt,
		// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
		beforeSystemDt: beforeSystemDt,
		// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End
	}
})


/**
 * ダイアログ表示サービス
 */
// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Mod Start
.factory('modalFactory', ['shared', '$ionicModal', '$q', 'owsScreen', 'owsColumn', 'owsItem', 'alertMessage', function(shared, $ionicModal, $q, owsScreen, owsColumn, owsItem, alertMessage){
// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Mod End
	return {
		modalProduct: function($scope, items, detailScreen){
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
            			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
            			 new owsScreen.getData('ProductMasterSearchSD', true),
            			 new owsColumn.getData('ProductMasterSearchSD'),
            			 new owsItem.getData('ProductMasterSearchSD')
            			 // [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/assist/ProductMasterSearchSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				$scope.items = items;
	    				if(detailScreen){
	    					$scope.detailScreen = true;
	    				} else {
	    					$scope.detailScreen = false;
	    				}
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'ProductMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('ProductMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('ProductMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('ProductMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('ProductMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		},
		modalVendor: function($scope, items, detailScreen) {
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
            			 new owsScreen.getData('VendorMasterSearchSD', true),
            			 new owsColumn.getData('VendorMasterSearchSD'),
            			 new owsItem.getData('VendorMasterSearchSD')
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/assist/VendorMasterSearchSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				$scope.items = items;
	    				if(detailScreen){
	    					$scope.detailScreen = true;
	    				} else {
	    					$scope.detailScreen = false;
	    				}
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'VendorMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('VendorMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('VendorMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('VendorMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('VendorMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		},
		modalDelivery: function($scope, items, detailScreen) {
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
            			 new owsScreen.getData('DeliveryMasterSearchSD', true),
            			 new owsColumn.getData('DeliveryMasterSearchSD'),
            			 new owsItem.getData('DeliveryMasterSearchSD')
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/assist/DeliveryMasterSearchSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				$scope.items = items;
	    				if(detailScreen){
	    					$scope.detailScreen = true;
	    				} else {
	    					$scope.detailScreen = false;
	    				}
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'DeliveryMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('DeliveryMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('DeliveryMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('DeliveryMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('DeliveryMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		},
		modalDeliveryCourse: function($scope, items, detailScreen) {
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
            			 new owsScreen.getData('DeliveryCourseSearchSD', true),
            			 new owsColumn.getData('DeliveryCourseSearchSD'),
            			 new owsItem.getData('DeliveryCourseSearchSD')
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/assist/DeliveryCourseSearchSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				$scope.items = items;
	    				if(detailScreen){
	    					$scope.detailScreen = true;
	    				} else {
	    					$scope.detailScreen = false;
	    				}
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'DeliveryCourseSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('DeliveryCourseSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('DeliveryCourseSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('DeliveryCourseSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('DeliveryCourseSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		},
		modalZip: function($scope, items, detailScreen) {
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
            			 new owsScreen.getData('ZipMasterSearchSD', true),
            			 new owsColumn.getData('ZipMasterSearchSD'),
            			 new owsItem.getData('ZipMasterSearchSD')
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/assist/ZipMasterSearchSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				$scope.items = items;
	    				if(detailScreen){
	    					$scope.detailScreen = true;
	    				} else {
	    					$scope.detailScreen = false;
	    				}
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'ZipMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('ZipMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('ZipMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('ZipMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('ZipMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		},
		modalLocation: function($scope, items, detailScreen){
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod Start
            			 new owsScreen.getData('LocationMasterSearchSD', true),
            			 new owsColumn.getData('LocationMasterSearchSD'),
            			 new owsItem.getData('LocationMasterSearchSD')
             			// [#982] SD用アシスト機能新規作成 2017.02.07 honma Mod End
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/assist/LocationMasterSearchSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				$scope.items = items;
	    				if(detailScreen){
	    					$scope.detailScreen = true;
	    				} else {
	    					$scope.detailScreen = false;
	    				}
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'LocationMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('LocationMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('LocationMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('LocationMasterSearchSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('LocationMasterSearchSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		}

	}
}])

.factory('selectClientFactory', ['$ionicModal', '$q', 'owsScreen', 'owsItem', 'alertMessage', '$timeout', function($ionicModal, $q, owsScreen, owsItem, alertMessage, $timeout){
	return {
		modalClient: function($scope){
			var promise;
			var elmFocus = document.activeElement;

			/** モーダル画面のインスタンスが既に存在するならPromiseにして返す **/
			if($scope.modal) {
				promise = new Promise(function(resolve, reject) {
					resolve($scope.modal);
				});
				return promise;
			}
			else {
				return $q.all(
            			[
            			 new owsScreen.getData('SelectClient', true),
            			 new owsItem.getData('SelectClient')
            			 ]
            	).then(function() {
            		promise = $ionicModal.fromTemplateUrl('wms/partials/common/SelectClientSD.html', {
	    				scope: $scope,
	    				animation: 'slide-in-up'
            		}).then(function(modal) {
	    				$scope.modal = modal;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
	    				alertMessage.addModalAlert(modal, 'SelectClientSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
	    				return modal;
            		});

            		$scope.openModal = function() {
        				$scope.modal.show();
        		    };
        		    $scope.closeModal = function() {
        		    	//$scope.alerts = [];
        		    	$scope.modal.hide();
        		    	$scope.modal.remove();
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('SelectClientSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    };
        		    $scope.$on('$destroy', function() {
        		    	if($scope.modal) {
        		    		$scope.modal.remove();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('SelectClientSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        		    	}
        			});
        			// Execute action on hide modal
        			$scope.$on('modal.hidden', function() {
        				// Execute action
        				if($scope.closeAction) {
        					$scope.closeAction();
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
    						alertMessage.removeModalAlert('SelectClientSD');
    	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        				}
        			});
        			// Execute action on remove modal
        			$scope.$on('modal.removed', function() {
        				// Execute action
        				$scope.modal = null;
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add Start
						alertMessage.removeModalAlert('SelectClientSD');
	    				// [Ver2.2.0] BackSpace押下時にダイアログ「前ページ遷移しますか？」が表示される不具合対応02017.04.04 honma Add End
        			});

        			return promise;
            	});
			}
		}
	}

}])
.factory('printFactory', ['$modal', 'alertMessage', '$timeout', function($modal, alertMessage, $timeout){
    return {
    	modalPrint: function(printParam) {
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl: "base/partials/common/PrintRequestParam.html",
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
        		controller:'PrintRequestParam',
                resolve: {
                    getScreen: ['owsScreen', function(owsScreen) {
                        return new owsScreen.getData('PrintRequestParam', true);
                    }],
                    getItem: ['owsItem', function(owsItem) {
                        return new owsItem.getData('PrintRequestParam');
					}],
					printParam: function () {
						return printParam;
					}
                },
                windowClass: 'app-modal-window-small',
				beforeClose: function() {
				    alertMessage.removeModalAlert('PrintRequestParam');
				    elmFocus.focus();
				},
				beforeDismiss: function() {
				    alertMessage.removeModalAlert('PrintRequestParam');
				    elmFocus.focus();
				}
            });
			modal.opened.then(function() {
			    alertMessage.addModalAlert(modal, 'PrintRequestParam');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
    	}
    	/* [直接印刷対応] 2016.1.27 inoue Start */
		, modalRePrint: function(printRequest) {
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl: "base/partials/common/PrintRequestParam.html",
				backdrop:'static',
				controller:'RePrintRequestParam',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('PrintRequestParam', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('PrintRequestParam');
					}],
					printRequest: function () {
						return printRequest;
					}
				},
	            windowClass: 'app-modal-window-small',
				beforeClose: function() {
					alertMessage.removeModalAlert('PrintRequestParam');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('PrintRequestParam');
					elmFocus.focus();
				}
			});
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'PrintRequestParam');
			});
			return modal;
		}
	    /* [直接印刷対応] 2016.1.27 inoue End */
		// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana Start
		, outputType : {
			html : 1,
			pdf : 2,
			print : 3
		}
		// [ON推-品向-1164] 印刷した時はPDFウィンドウを表示しない 2016.07.07 kawana End
    }
}])
//アラート表示部分のコントローラ
.controller('AlertCtrl', ['$scope', '$rootScope', '$filter', '$log', 'alertMessage', 'owsCommon', '$window', '$location', function($scope, $rootScope, $filter, $log, alertMessage, owsCommon, $window, $location) {

	$scope.nextAlert = function() {
		var first = $rootScope.alerts.pop();
		$rootScope.alerts.unshift(first);
	};

	//アラートをクローズしたら起動されるファンクション
	$scope.closeAlert = function(id, isLast) {
		if (isLast) {
			$rootScope.alerts = [];
		} else {
			for (var i = 0; i < $rootScope.alerts.length; i++) {
				if ($rootScope.alerts[i].id == id) {
					$rootScope.alerts.splice(i, 1);
					break;
				}
			}
		}
	};

	if (!$rootScope.initAlertCtrl) {
		$rootScope.initAlertCtrl = true;

		//HTTP通信エラーが発生したら起動されるファンクション
		$rootScope.$on('showCommExceptionMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter("httpConnectionError", [err.status, err.config.url], false);
			alertMessage.setErrorMessage(msg);
		});

		//基盤でキャッチしたエラーが発生したら起動されるファンクション
		$rootScope.$on('showBaseExceptionMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter(err.data.status.messageCode, err.data.status.messageReplaceValue, false);
			alertMessage.setErrorMessage(msg);
		});

		//基盤でキャッチしたエラーが認証トークン無効の場合に起動されるファンクション
		$rootScope.$on('showTokenInvalidExceptionMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter(err.data.status.messageCode, err.data.status.messageReplaceValue, false);
			if (msg != null && msg != "") {
				owsCommon.viewAlert(msg);
			}
			if (err.data.status.moreValue != null && err.data.status.moreValue != "") {
				var index = err.data.status.moreValue.lastIndexOf("?");
				if (index != -1 && err.data.status.moreValue.indexOf("=", index + 1) != -1) {
					location.href = err.data.status.moreValue + '&goto=' + encodeURIComponent(location.href);
				} else {
					location.href = err.data.status.moreValue + '?goto=' + encodeURIComponent(location.href);
				}
			}
		});

		//日次処理を実行してください
		$rootScope.$on('systemDtExceptionMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter("systemDtWarn", "", false);
			alertMessage.setWarningMessage(msg);
		});

		//日次処理実行中です
		$rootScope.$on('dailyCheckExceptionMessage', function(event, err) {
			var show = false;
			var messageFilter = $filter('owfMessage');
			if($rootScope.alerts){
				for (var i = 0; i < $rootScope.alerts.length; i++) {
					if($rootScope.alerts[i].msg==messageFilter("dailyCheckError", "", false)){
						show=true;
					}
				}
			}
			if(!show){
				var msg = messageFilter("dailyCheckError", "", false);
				alertMessage.setErrorMessage(msg);
				if($window.location.hash!="#" + commonRedirectUrl){
					owsCommon.viewAlert("dailyProcessRunningConfirm");
					$window.location.hash=commonRedirectUrl;
					$window.location.reload();
				}
			}
		});

		/* 2015/09/14 INOUE ADD START ヘッダ入れ替え対応 */
		$rootScope.$on('isMismatchBColAndExtMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter("isMismatchBColAndExtWarn", "", false);
			alertMessage.setWarningMessage(msg);
		});
		/* 2015/09/14 INOUE ADD END */

		/* 2015/10/06 INOUE ADD START [ON推-品向-921] 権限マスタで行けない画面にも、ダブルクリックで遷移できてしまう件の対応 */
		$rootScope.$on('accessDisableToScreenMessage', function(event, err) {
			if($window.location.hash!="#" + commonRedirectUrl){
				owsCommon.viewAlert("accessDisableToScreenError");
				$window.location.hash=commonRedirectUrl;
				$window.location.reload();
			}
		});
		/* 2015/10/06 INOUE ADD END */
	}

}])
/* 2015/10/20 INOUE UPDATE START 簡易ログイン対応 */
//.controller('OeslogiWmsCommon', ['$scope', '$route', '$filter', '$location', '$q', '$window', '$timeout', 'owsCommon', 'userInfo', 'commonApi', 'selectClientFactory', function($scope, $route, $filter, $location, $q, $window, $timeout, owsCommon, userInfo, api, selectClientFactory){
.controller('OneslogiWebCommon'
		, ['$scope'
		   , '$state'
		   , '$filter'
		   , '$location'
		   , '$q'
		   , '$window'
		   , '$timeout'
		   , '$ionicModal'
		   , '$ionicNavBarDelegate'
		   , 'owsCommon'
		   , 'userInfo'
		   , 'commonApi'
		   , 'selectClientFactory'
		   , 'PasswordChangeDialog'
			/* [HT自動印刷対応] 2016.5.27 inoue Start */
		   , 'UserAutoPrintSettingListDialog'
			/* [HT自動印刷対応] 2016.5.27 inoue End */
		   , 'VIEW_MODE_PASSWORD_CHANGE'
		   , function(
				   $scope
				   , $state
				   , $filter
				   , $location
				   , $q
				   , $window
				   , $timeout
				   , $ionicModal
				   , $ionicNavBarDelegate
				   , owsCommon
				   , userInfo
				   , api
				   , selectClientFactory
				   , passwordChangeDialog
					/* [HT自動印刷対応] 2016.5.27 inoue Start */
				   , userAutoPrintSettingListDialog
					/* [HT自動印刷対応] 2016.5.27 inoue End */
				   , VIEW_MODE_PASSWORD_CHANGE){
	$scope.navbar = {};
	$scope.navbar.isCollapsed = true;

/* 2015/10/20 INOUE UPDATE END */
	$scope.userInfo = userInfo;

	//選択ボタン
	$scope.selectClient = function(){
		selectClientFactory.modalClient($scope)
		.then(function(modal) {
			$scope.openModal();
		});
	};

	/* 2015/10/20 INOUE ADD START 簡易ログイン対応 */
	/**
	 * パスワード変更ダイアログを表示する。
	 */
	$scope.showPasswordChangeDialog = function() {
		passwordChangeDialog.show($scope
			, userInfo.userCd
			, commonRedirectUrl
			, VIEW_MODE_PASSWORD_CHANGE
			, $scope.$parent.culture.bCulture.cultureCd)
		.then(function(modal) {
			$scope.openModal();
		});
	};
	/* 2015/10/20 INOUE ADD END */

	/* [HT自動印刷対応] 2016.5.27 inoue Start */
	/**
	 * 自動印刷設定ダイアログを表示する。
	 */
	$scope.showUserAutoPrintSettingListDialog = function() {
		var items = {
				userCd : userInfo.userCd
		};
		// [#1007] 自動印刷設定のSD対応 2017.03.02 honma Mod Start
		// userAutoPrintSettingListDialog.show(items);
		userAutoPrintSettingListDialog.show($scope
			,items)
		.then(function(modal) {
			$scope.openModal();
		});
		// [#1007] 自動印刷設定のSD対応 2017.03.02 honma Mod End
	};
	/* [HT自動印刷対応] 2016.5.27 inoue End */

	// 以下より基盤拡張処理の実装
	var contentsFooterButtonExist = false;
	var contentsFooterControlExist = false;

	var contentsGridExist = false;

	var footerHeight = -1;
	var contentsFooterHeight = -1;
	var contentsFooterButtonHeight = -1;
	var contentsFooterControlHeight = -1;

	/* 2015/06/16 INOUE UPDATE START 複数グリッド対応 */
	/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
//	var gridTagId = null;
//	var ngGridName = null;
	var gridDefInfos = [];

	/**
	 * 指定されたtagの表示/非表示を判定します。
	 * 判定にはtagのstyle.displayを使用しています。
	 */
	var isTagDisplayBlock = function(tag) {
	    var style;
	    var display;

		if (tag.currentStyle) { //クロスブラウザ対応
		    style = tag.currentStyle;
		    display =  style["display"];

		} else if (window.getComputedStyle) {
		    style = window.getComputedStyle(tag, null)
		    display = style.getPropertyValue('display');
		}
		if(display=='none') {
			return false;
		} else {
			return true;
		}
	};

	/**
	 * gridDefInfosに基づいて、そのtagのdisplayの状態をチェックします。
	 * 結果は
	 */
	var checkTagDisplay = function(infos) {
		var blockCount = 0;
    	for (var i=0; i<gridDefInfos.length; i++) {
    		var ngGridName = gridDefInfos[i].ngGridName;
    		var gridTagId = gridDefInfos[i].gridTagId;

    		var gridFormId = "#" + gridTagId;
    		var gridTop = $(gridFormId);

    		var display = isTagDisplayBlock(gridTop[0]);
    		gridDefInfos[i]['display'] = display;
    		if (display) {
    			blockCount++;
    		}
    	}
    	return blockCount;
	};
	/* 2015/05/28 INOUE ADD END */
	/* 2015/06/16 INOUE UPDATE END */

	/* 2015/06/16 INOUE ADD START minify時エラー対応 */
	/**
	 * ngGridのpluginsの中からngGridFlexibleHeightPluginのインスタンスを取得する。
	 * ※ngGird側の処理により、pluginsから必ず「ngGridFlexibleHeightPlugin」でプロパティ参照できることが保障されないため(特にminify時)、
	 * 　名前の直接指定による参照ではなく、plugins内の各オブジェクトからinstanceofの判定によってngGridFlexibleHeightPluginの
	 * 　インスタンスであるオブジェクトをアクセス対象とする。
	 */
	var getNgGridFlexibleHeightPluginObj = function(plugins) {
		var obj = null;
    	for (var name in plugins) {
    		var plugin = plugins[name];
    		if (plugin instanceof ngGridFlexibleHeightPlugin) {
    			obj = plugin;
    			break;
    		}
    	}

    	// 必ずデータがあることを前提とし、データが無い場合はエラーとする。
    	if (obj==null) {
    		throw new Error("[base error]ngGridFlexibleHeightPlugin not in ngGrid plugins.");
    	}

    	return obj;
	};
	/* 2015/06/16 INOUE ADD END */

	// リサイズ時のボタンフッタの高さ自動調整関数
	var resizeContents = function() {
		if ($("#contents").length < 1) {
			return;
		}

		if ($("#navbar").length > 0) {
			$("body").css("padding-top", $("#navbar")[0].offsetHeight - 20);
		}

		// サイズ変更対象の存在チェック
		if (!contentsFooterButtonExist && !contentsFooterControlExist && !contentsGridExist && !gridAdjustFlg) {
			return;
		}

		var windowHeight = $(window).height();
		var contentsTop = $("#contents")[0].offsetTop;
		var contentsHeight = $("#contents")[0].offsetHeight;

		if (contentsFooterButtonExist) {

			if (contentsFooterButtonHeight == -1) {
				var styles = document.styleSheets;
				var cssRules;

				I: for (var i = 0; i < styles.length; i++) {
					cssRules = styles[i].cssRules;

					for (var j = 0; j < cssRules.length; j++) {
						if (cssRules[j].cssText.indexOf("#content-footer-button") != -1) {
							var wk = cssRules[j].style.height;
							wk = wk.replace("px", "");
							contentsFooterButtonHeight = parseFloat(wk);
							break I;
						}
					}

				}

				// 設定値が見つからない場合は既定値を設定
				if (contentsFooterButtonHeight == -1) {
					contentsFooterButtonHeight = 75;
				}
			}

			$("#wrap").css("margin-bottom", (contentsFooterButtonHeight) * -1);
			$("#wrap").css("padding-bottom", contentsFooterButtonHeight);

			// 計算結果よりボタン位置を変更
			if (windowHeight < (contentsTop + contentsHeight) + contentsFooterButtonHeight) {
				$("#content-footer").css("height", contentsFooterHeight + contentsFooterButtonHeight);
				$("#content-footer-button").css("height", contentsFooterButtonHeight);
			} else {
				$("#content-footer").css("height", contentsFooterButtonHeight);
				$("#content-footer-button").css("height", (windowHeight - (contentsTop + contentsHeight)));
			}

		} else if (contentsFooterControlExist) {

			if (contentsFooterControlHeight == -1) {
				var styles = document.styleSheets;
				var cssRules;

				I: for (var i = 0; i < styles.length; i++) {
					cssRules = styles[i].cssRules;

					for (var j = 0; j < cssRules.length; j++) {
						if (cssRules[j].cssText.indexOf("#content-footer-control") != -1) {
							var wk = cssRules[j].style.height;
							wk = wk.replace("px", "");
							contentsFooterControlHeight = parseFloat(wk);
							break I;
						}
					}

				}

				// 設定値が見つからない場合は既定値を設定
				if (contentsFooterControlHeight == -1) {
					contentsFooterControlHeight = 105;
				}
			}

			$("#wrap").css("margin-bottom", (contentsFooterControlHeight) * -1);
			$("#wrap").css("padding-bottom", contentsFooterControlHeight);

			// 計算結果よりボタン位置を変更
			if (windowHeight < (contentsTop + contentsHeight) + contentsFooterControlHeight) {
				$("#content-footer").css("height", contentsFooterHeight + contentsFooterControlHeight);
				$("#content-footer-control").css("height", contentsFooterControlHeight);
			} else {
				$("#content-footer").css("height", contentsFooterControlHeight);
				$("#content-footer-control").css("height", windowHeight - (contentsTop + contentsHeight));
			}

		}

        //Gridの高さ調整
        if(gridAdjustFlg){
        	/* 2015/06/16 INOUE ADD START 複数グリッド対応 */
        	var blockCount = checkTagDisplay(gridDefInfos);
        	// display=blockのグリッドが複数ある場合は自動調整対象とはしない。
        	if (blockCount>1) {
        		return;
        	}

        	for (var i=0; i<gridDefInfos.length; i++) {
        		var ngGridName = gridDefInfos[i].ngGridName;
        		var gridTagId = gridDefInfos[i].gridTagId;

        		var gridFormId = "#" + gridTagId;
        		var gridTop = $(gridFormId);

        		if (!gridDefInfos[i].display) {
        			continue;
        		}

        		/* 2015/06/16 INOUE ADD START minify時エラー対応 */
        		// ngGridFlexibleHeightPluginのインスタンスを取得する。
        		var pluginObj = getNgGridFlexibleHeightPluginObj($scope.$$childTail.$$childTail[ngGridName].plugins);
        		/* 2015/06/16 INOUE ADD END */

        	/* 2015/06/16 INOUE ADD END */
	    		/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
	        	// グリッドオプションの参照は「gridOptions」固定ではなく、ng-grid属性の値を使って参照する。
	//	        if(contentsGridExist && $scope.$$childTail.$$childTail.gridOptions.ngGrid.config.adjust){
	        	if(contentsGridExist && $scope.$$childTail.$$childTail[ngGridName].ngGrid.config.adjust){
	        	/* 2015/05/28 INOUE ADD END */
			        if(!$scope.$parent.$root.modalView){
						if (contentsFooterButtonHeight == -1) {
							var styles = document.styleSheets;
							var cssRules;

							I: for (var i = 0; i < styles.length; i++) {
								cssRules = styles[i].cssRules;

								for (var j = 0; j < cssRules.length; j++) {
									if (cssRules[j].cssText.indexOf("#content-footer-button") != -1) {
										var wk = cssRules[j].style.height;
										wk = wk.replace("px", "");
										contentsFooterButtonHeight = parseFloat(wk);
										break I;
									}
								}

							}

							// 設定値が見つからない場合は既定値を設定
							if (contentsFooterButtonHeight == -1) {
								contentsFooterButtonHeight = 75;
							}
						}

			    		/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
						// グリッドオプションの参照は「gridOptions」固定ではなく、ng-grid属性の値を使って参照する。
	//					var tmpScope = $scope.$$childTail.$$childTail.gridOptions.plugins.ngGridFlexibleHeightPlugin.scope;
	//					var tmpGrid = $scope.$$childTail.$$childTail.gridOptions.plugins.ngGridFlexibleHeightPlugin.grid;

		        		/* 2015/06/16 INOUE UPDATE START minify時エラー対応 */
//						var tmpScope = $scope.$$childTail.$$childTail[ngGridName].plugins.ngGridFlexibleHeightPlugin.scope;
//						var tmpGrid = $scope.$$childTail.$$childTail[ngGridName].plugins.ngGridFlexibleHeightPlugin.grid;
						// ngGridFlexibleHeightPluginへのアクセスは、getNgGridFlexibleHeightPluginObjから取得したオブジェクト経由で行う。
						var tmpScope = pluginObj.scope;
						var tmpGrid = pluginObj.grid;
		        		/* 2015/06/16 INOUE UPDATE END */

						/* 2015/05/28 INOUE ADD END */
				        var gridId = tmpGrid.gridId;
				        var footerPanelSel = '.' + gridId + ' .ngFooterPanel';
				        var extraHeight = tmpGrid.$topPanel.height() + $(footerPanelSel).height();

						/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
				        // タグの特定はdata名ではなく、$viewContentLoadedで取得したng-gridが適用されているタグのIDを使用。
	//					var gridFormId = "#" + $scope.$$childTail.$$childTail.gridOptions.data;
				    	/* 2015/06/16 INOUE DELETE START 複数グリッド対応 */
				        // forの直下に移動
//				        var gridFormId = "#" + gridTagId;
				    	/* 2015/06/16 INOUE DELETE END */
						/* 2015/05/28 INOUE ADD END */
				        /* 2015/06/16 INOUE DELETE START 複数グリッド対応 */
				        //forの直下に移動
//						var gridTop = $(gridFormId);
						/* 2015/06/16 INOUE DELETE END */

						var gridTmpTop = gridTop[0].offsetTop;
						var topMargin = document.getElementsByTagName('body')[0].style.paddingTop;
						topMargin = topMargin.replace("px", "");
						var bottomMargin = $("#wrap").css("padding-bottom");
						bottomMargin = bottomMargin.replace("px", "");

						var remainHeight = windowHeight-gridTmpTop-contentsFooterButtonHeight-topMargin-bottomMargin;

			    		/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
						// グリッドオプションの参照は「gridOptions」固定ではなく、ng-grid属性の値を使って参照する。
	//					if(remainHeight>$scope.$$childTail.$$childTail.gridOptions.ngGrid.config.adjustMinHeight){
						// 2016/05/18 グリッドの3行以下の表示にならないようにng-grid属性値を見ずに固定値で設定するように修正 koseki Start
//						if(remainHeight>$scope.$$childTail.$$childTail[ngGridName].ngGrid.config.adjustMinHeight){
						if(remainHeight>200){
						// 2016/05/18 グリッドの3行以下の表示にならないようにng-grid属性値を見ずに固定値で設定するように修正 koseki End
						/* 2015/05/28 INOUE ADD END */
					        tmpGrid.$viewport.css('height', (remainHeight) + 'px');
					        tmpGrid.$root.css('height', (remainHeight+extraHeight) + 'px');
					        tmpScope.baseViewportHeight = (remainHeight);
				    		/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
					     // グリッドオプションの参照は「gridOptions」固定ではなく、ng-grid属性の値を使って参照する。
	//						$scope.$$childTail.$$childTail.gridOptions.plugins.ngGridFlexibleHeightPlugin.domUtilityService.RebuildGrid(tmpScope,tmpGrid);
							// ngGridFlexibleHeightPluginへのアクセスは、getNgGridFlexibleHeightPluginObjから取得したオブジェクト経由で行う。
//					        $scope.$$childTail.$$childTail[ngGridName].plugins.ngGridFlexibleHeightPlugin.domUtilityService.RebuildGrid(tmpScope,tmpGrid);
					        pluginObj.domUtilityService.RebuildGrid(tmpScope,tmpGrid);
			        		/* 2015/06/16 INOUE UPDATE END */
							/* 2015/05/28 INOUE ADD END */
						}
			        }
		        }
        	/* 2015/06/16 INOUE ADD START 複数グリッド対応 */
        	}
        	/* 2015/06/16 INOUE ADD END */
        }
	};

	// リサイズ時のボタンフッタの高さ自動調整関数
	var syncResizeContents = function() {
		$timeout(function() {
			resizeContents();
		}, 10);
	};

	var initWatch = false;
	var arySize = [-1, -1, -1, -1, -1];

	// ng-view出力後に動作するイベントハンドラ関数の登録
	$scope.$root.$on('$viewContentLoaded', function() {
		// 初回のみ設定ファイルから値を取得
		if (footerHeight == -1) {
			var styles = document.styleSheets;
			var cssRules;

			I: for (var i = 0; i < styles.length; i++) {
				cssRules = styles[i].cssRules;

				for (var j = 0; j < cssRules.length; j++) {
					if (cssRules[j].cssText.indexOf("#footer") != -1) {
						var wk = cssRules[j].style.height;
						wk = wk.replace("px", "");
						footerHeight = parseFloat(wk);
						break I;
					}
				}

			}

			// 設定値が見つからない場合は既定値を設定
			if (footerHeight == -1) {
				footerHeight = 20;
			}
		}

		// 初回のみ設定ファイルから値を取得
		if (contentsFooterHeight == -1) {
			var styles = document.styleSheets;
			var cssRules;

			I: for (var i = 0; i < styles.length; i++) {
				cssRules = styles[i].cssRules;

				for (var j = 0; j < cssRules.length; j++) {
					if (cssRules[j].cssText.indexOf("#content-footer") != -1) {
						var wk = cssRules[j].style.height;
						wk = wk.replace("px", "");
						contentsFooterHeight = parseFloat(wk);
						break I;
					}
				}

			}

			// 設定値が見つからない場合は既定値を設定
			if (contentsFooterHeight == -1) {
				contentsFooterHeight = 15;
			}
		}

		/* 2015/06/16 INOUE UPDATE START 複数グリッド対応 */
		// 前画面の情報が残るため、このタイミングでクリアする。
		gridDefInfos = [];
		/* 2015/06/16 INOUE ADD END */

		/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
		var tags = $("*");
		for (var i=0; i<tags.length; i++) {
			// ng-grid属性が存在するタグの情報を保存する。
			if (tags[i].getAttribute('ng-grid')) {
				/* 2015/06/16 INOUE UPDATE START 複数グリッド対応 */
				// 配列で保持するようにする。
//				ngGridName = tags[i].getAttribute('ng-grid');
//				gridTagId = tags[i].id;
//				break;

				var ngGridName = tags[i].getAttribute('ng-grid');
				var gridTagId = tags[i].id;
				var initialVisibility = true;
				if ($scope.$$childTail.$$childTail[ngGridName]) {
					if (typeof $scope.$$childTail.$$childTail[ngGridName].initialVisibility!=="undefined") {
						initialVisibility = $scope.$$childTail.$$childTail[ngGridName].initialVisibility;
					}

					gridDefInfos.push({
						'ngGridName':ngGridName,
						'gridTagId':gridTagId});
				}
				/* 2015/06/16 INOUE UPDATE END */
			}
		}
		/* 2015/05/28 INOUE ADD END */

		// 最初に既存イベントがあったら解除
		angular.element($window).unbind('resize', resizeContents);

		if ($("#wrap") == undefined || $("#wrap") == null || $("#wrap").length < 1) {
			contentsFooterButtonExist = false;
			contentsFooterControlExist = false;
			return;
		}

		$("#wrap").css("margin-bottom", footerHeight * -1);
		$("#wrap").css("padding-bottom", footerHeight);

		if ($("#content-footer") == undefined || $("#content-footer") == null || $("#content-footer").length < 1) {
			contentsFooterButtonExist = false;
			contentsFooterControlExist = false;
		}

		// サイズ変更対象の存在チェック
		if (($("#content-footer-button") == undefined || $("#content-footer-button") == null || $("#content-footer-button").length < 1) &&
			($("#content-footer-control") == undefined || $("#content-footer-control") == null || $("#content-footer-control").length < 1)) {
			contentsFooterButtonExist = false;
			contentsFooterControlExist = false;
		}

		if ($("#content-footer-button") != undefined && $("#content-footer-button") != null && $("#content-footer-button").length > 0) {
			contentsFooterButtonExist = true;
			contentsFooterControlExist = false;

			// イベント登録前にボタン用フッタ部を非表示に変更
			$("#content-footer-button").css("display", "none");

		} else if ($("#content-footer-control") != undefined && $("#content-footer-control") != null && $("#content-footer-control").length > 0) {
			contentsFooterButtonExist = false;
			contentsFooterControlExist = true;

			// イベント登録前にボタン用フッタ部を非表示に変更
			$("#content-footer-control").css("display", "none");

		}

		/* 2015/05/28 INOUE ADD START gridOptions.dataとタグIDの不一致時エラー対応 */
		// グリッドオプションの参照は「gridOptions」固定ではなく、ng-grid属性の値を使って参照する。
		// また、当該タグにidが設定されていない場合も、対象が無い場合と同等とする。
//		if($scope.$$childTail.$$childTail.gridOptions){
		/* 2015/06/16 INOUE UPDATE START 複数グリッド対応 */
//		if(gridTagId && ngGridName && $scope.$$childTail.$$childTail[ngGridName]){
		if(gridDefInfos && gridDefInfos.length && gridDefInfos.length>0){
		/* 2015/06/16 INOUE UPDATE END */
		/* 2015/05/28 INOUE ADD END */
			contentsGridExist = true;
		} else {
			contentsGridExist = false;
		}

		// ボタンフッタがある場合、画面リサイズ用の関数実行、及びリサイズイベントへの関数登録
		$timeout(function() {

			// リサイズ処理を実行
			resizeContents();

			// ボタン用フッタ部を表示に変更
			if (contentsFooterButtonExist) {
				$("#content-footer-button").css("display", "visible");
			} else if (contentsFooterControlExist) {
				$("#content-footer-control").css("display", "visible");
			}

			// リサイズイベントにリサイズ用の関数を登録
			angular.element($window).bind('resize', resizeContents);

			// メインコンテンツの領域（幅や位置）がリサイズ無しに変更された場合に動作する自動調整関数
			if (!initWatch) {
				initWatch = true;

				$scope.$root.$watchCollection(function() {
					if ($("#contents").length < 1) {
						return arySize;
					}
					arySize[0] = $("#contents")[0].offsetTop;
					arySize[1] = $("#contents")[0].offsetLeft;
					arySize[2] = $("#contents")[0].offsetHeight;
					arySize[3] = $("#contents")[0].offsetWidth;
					if ($("#navbar").length > 0) {
						arySize[4] = $("#navbar")[0].offsetHeight;
					}
					return arySize;
				}, syncResizeContents);

			}

		}, 100);

	});
}])
.controller('SideMenuCtrl', ['$scope', 'userInfo', function($scope, userInfo){
	$scope.userInfo = userInfo;
}]);