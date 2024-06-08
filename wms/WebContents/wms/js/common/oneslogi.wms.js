// [基盤分離対応] バグ #1490 FROM_TO_MESSAGE_CDの宣言場所の移動 2017/3/29 inoue start
///**
// * 日付FromTo大小チェック用メッセージコード
// */
//FROM_TO_MESSAGE_CD = "inputLimitCheckReversalError";
//[基盤分離対応] バグ #1490 FROM_TO_MESSAGE_CDの宣言場所の移動 2017/3/29 inoue end

LOCATION_FROM_TO_MESSAGE_CD = "inputLimitCheckCdReversalError";
SHIPPINGDT_CHECK_MESSAGE_CD = "shipDateCannotChangeBeforeWorkDateError";
SHIPPINGDT_DELIVPLANDT_CHECK_MESSAGE_CD = "delivPlanDateCannotChangeBeforeShipDateError";
WORKDT_DELIVPLANDT_CHECK_MESSAGE_CD = "delivPlanDateCannotChangeBeforeWorkDateError";
SHIPPINGDT_DELIVDT_CHECK_MESSAGE_CD = "delivDateCannotChangeBeforeShipDateError";
WORKDT_DELIVDT_CHECK_MESSAGE_CD = "delivDateCannotChangeBeforeWorkDateError";

/**
 * routeExtendへの拡張処理の中から実行されるAPIの定義です。
 * このAPIは、実行時に引数で渡されるinjectUtilのgetメソッドで取得して使用してください。
 * routeExtendへの拡張処理の中から実行されるAPIは、angularJsのinjectionの不具合を回避するために、依存性を排したものである必要があります。
 * 今のところ、$locationを自身が、もしくは自身が依存するmoduleの中でinjectionしている場合にエラーが発生することを確認しています。
 * （なお、上記の件回避策を書いているサイトなどがネットにありますが、影響が見極められなかったので見送っています。）
 * 実行したい処理の中でエラーが発生するmoduleをinjectしたい場合は、oneslogiWebMain側を改修することを検討してください。
 * （oneslogiWebMain側でinjectionして、引数経由で受け取る）
 * 2017/03/01 comment by inoue
 */
angular.module('oneslogiWms.CommonApis',['AngularAPIClient'])
.factory('commonApi', ['AngularAPIClient', function(AngularAPIClient) {
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
		)
	};
}]);

/**
 * oneslogiWeb.Mainモジュールは基盤の処理（oneslogi.web.main.js）の中で宣言されています。
 * このモジュールにはdependsModulesにセットしたモジュールが既にinjectionされています。
 * 依存モジュールの定義についてはoneslogi.wms.depends.jsを参照してください。
 * （「angular.module('oneslogiWebMain',[])」と書くとおかしくなりますので注意してください）
 * 2017/03/01 comment by inoue
 */
angular.module('oneslogiWeb.Main')
/**
 * モーダル
 */
.factory('modalFactory', ['$modal', 'alertMessage' , '$timeout', function($modal, alertMessage, $timeout){
	return {
		modalProduct: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/assist/ProductMasterSearch.html',
				controller:'ProductMasterSearch',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
        		backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ProductMasterSearch', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ProductMasterSearch');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('ProductMasterSearch');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ProductMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ProductMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ProductMasterSearch');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalVendor: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/assist/VendorMasterSearch.html',
				controller:'VendorMasterSearch',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('VendorMasterSearch', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('VendorMasterSearch');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('VendorMasterSearch');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('VendorMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('VendorMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'VendorMasterSearch');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		//[C-CWMS-0057] 画面マスタコピーモデル画面作成 2016.07.15 ATK Start
		modalScreenList: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'base/partials/master/ScreenListMasterCopy.html',
				controller:'ScreenListMasterCopy',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ScreenListMasterCopy', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ScreenListMasterCopy');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('ScreenListMasterCopy');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ScreenListMasterCopy');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ScreenListMasterCopy');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ScreenListMasterCopy');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		//[C-CWMS-0057] 画面マスタコピーモデル画面作成 2016.07.15 ATK End
		//[C-CWMS-0057] 権限マスタコピーモデル画面作成 2016.07.15 ATK Start
		modalRoleList: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'base/partials/master/RoleListCopy.html',
				controller:'RoleListCopy',
				backdrop:'static',

				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('RoleListCopy', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('RoleListCopy');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('RoleListCopy');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('RoleListCopy');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('RoleListCopy');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'RoleListCopy');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		//[C-CWMS-0057] 権限マスタコピーモデル画面作成 2016.07.15 ATK End
		modalDelivery: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/assist/DeliveryMasterSearch.html',
				controller:'DeliveryMasterSearch',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('DeliveryMasterSearch', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('DeliveryMasterSearch');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('DeliveryMasterSearch');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('DeliveryMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('DeliveryMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'DeliveryMasterSearch');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalDeliveryCourse: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/assist/DeliveryCourseSearch.html',
				controller:'DeliveryCourseSearch',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('DeliveryCourseSearch', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('DeliveryCourseSearch');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('DeliveryCourseSearch');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('DeliveryCourseSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('DeliveryCourseSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'DeliveryCourseSearch');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalZip: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/assist/ZipMasterSearch.html',
				controller:'ZipMasterSearch',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ZipMasterSearch', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ZipMasterSearch');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('ZipMasterSearch');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ZipMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ZipMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ZipMasterSearch');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalLocation: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/assist/LocationMasterSearch.html',
				controller:'LocationMasterSearch',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('LocationMasterSearch', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('LocationMasterSearch');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('LocationMasterSearch');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('LocationMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('LocationMasterSearch');
					elmFocus.focus();
					getNextObject(elmFocus, true).focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'LocationMasterSearch');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalInstBoxInput: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/PieceShippingInspectBox.html',
				controller:'PieceShippingInspectBox',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('PieceShippingInspectBox', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('PieceShippingInspectBox');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window-small',
				beforeClose: function() {
					alertMessage.removeModalAlert('PieceShippingInspectBox');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('PieceShippingInspectBox');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'PieceShippingInspectBox');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalInstSuInput: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/PieceShippingInspectSu.html',
				controller:'PieceShippingInspectSu',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('PieceShippingInspectSu', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('PieceShippingInspectSu');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('PieceShippingInspectSu');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('PieceShippingInspectSu');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'PieceShippingInspectSu');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		// [#5115][v3.1] 単行出荷検品 エラーモーダル画面設定 2018.07.17 fujiwara Start
		modalLargeErrorDialog: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/ModalLargeErrorDialog.html',
				controller:'ModalLargeErrorDialog',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ModalLargeErrorDialog', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ModalLargeErrorDialog');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ModalLargeErrorDialog');
					if (elmFocus) {
						elmFocus.focus();
					}
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ModalLargeErrorDialog');
					if (elmFocus) {
						elmFocus.focus();
					}
				}
			});
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ModalLargeErrorDialog');
			});
			return modal;
		},
		// [#5115][v3.1] 単行出荷検品 エラーモーダル画面設定 2018.07.17 fujiwara End
		// [#5115][v3.1] 単行出荷検品 警告モーダル画面設定 2018.07.17 fujiwara Start
		modalLargeWarnDialog: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/ModalLargeWarnDialog.html',
				controller:'ModalLargeWarnDialog',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ModalLargeWarnDialog', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ModalLargeWarnDialog');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ModalLargeWarnDialog');
					if (elmFocus) {
						elmFocus.focus();
					}
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ModalLargeWarnDialog');
					if (elmFocus) {
						elmFocus.focus();
					}
				}
			});
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ModalLargeWarnDialog');
			});
			return modal;
		},
		// [#5115][v3.1] 単行出荷検品 警告モーダル画面設定 2018.07.17 fujiwara End
		// [#5115][v3.1] 単行出荷検品 出庫指示モーダル画面設定 2018.07.19 fujiwara Start
		modalLargeWorkInstNum: function(items){

			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/ModalLargeWorkInstNum.html',
				controller:'ModalLargeWorkInstNum',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ModalLargeWorkInstNum', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ModalLargeWorkInstNum');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window-small',
				beforeClose: function() {
					alertMessage.removeModalAlert('ModalLargeWorkInstNum');
					if (elmFocus) {
						elmFocus.focus();
					}
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ModalLargeWorkInstNum');
					if (elmFocus) {
						elmFocus.focus();
					}
				}
			});
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ModalLargeWorkInstNum');
			});
			return modal;
		},
		// [#5115][v3.1] 単行出荷検品 出庫指示モーダル画面設定 2018.07.19 fujiwara Start End
		//  米国出荷ドキュメント追加対応 2018.01.05 PYM Start
		modalcarrierTraceNumInput: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/ShippingConfirmListCarrierTraceNum.html',
				controller:'ShippingConfirmListCarrierTraceNum',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ShippingConfirmListCarrierTraceNum', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ShippingConfirmListCarrierTraceNum');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ShippingConfirmListCarrierTraceNum');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ShippingConfirmListCarrierTraceNum');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ShippingConfirmListCarrierTraceNum');
			});
			return modal;
		},
		//  米国出荷ドキュメント追加対応 2018.01.05 PYM End
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 Start
		modalInstListNumInput: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/master/ProductMasterListNum.html',
				controller:'ProductMasterListNum',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ProductMasterListNum', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ProductMasterListNum');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window-small',
				beforeClose: function() {
					alertMessage.removeModalAlert('ProductMasterListNum');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ProductMasterListNum');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ProductMasterListNum');
			});
			return modal;
		},
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/06 End
        modalMessage: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/shipping/ShippingWorkRefUpdate.html',
				controller:'ShippingWorkRefUpdate',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ShippingWorkRefUpdate', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ShippingWorkRefUpdate');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('ShippingWorkRefUpdate');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window-small',
				beforeClose: function() {
					alertMessage.removeModalAlert('ShippingWorkRefUpdate');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ShippingWorkRefUpdate');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ShippingWorkRefUpdate');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		modalInventoryAddRow: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/inventory/InventoryInputAddRow.html',
				controller:'InventoryInputAddRow',
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
				backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('InventoryInputAddRow', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('InventoryInputAddRow');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('InventoryInputAddRow');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('InventoryInputAddRow');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'InventoryInputAddRow');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		// [C-CWMS-0024] 住所変更機能を追加 2015.04.06 kyo Start
		modalEcDelivAddressModify: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/ecorder/EcDelivAddressModify.html',
				controller:'EcDelivAddressModify',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('EcDelivAddressModify', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('EcDelivAddressModify');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('EcDelivAddressModify');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('EcDelivAddressModify');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'EcDelivAddressModify');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		// [C-CWMS-0024] 住所変更機能を追加 2015.04.06 kyo End
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana Start
		modalImportTypeBCopyColumnInput: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/master/ImportTypeBCopyColumnInput.html',
				controller:'ImportTypeBCopyColumnInput',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('ImportTypeBCopyColumnInput', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('ImportTypeBCopyColumnInput');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('ImportTypeBCopyColumnInput');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ImportTypeBCopyColumnInput');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ImportTypeBCopyColumnInput');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ImportTypeBCopyColumnInput');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
		},
		// [C-CWMS-0026] 品名1～5などをEC受注テーブルから設定できるように変更 2015.05.27 kawana End
		// [#2233] 在庫一括移動指示機能追加 2017.08.16 ase Start
		modalStockBulkMove: function(items) {
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/stock/StockBulkMove.html',
				controller:'StockBulkMove',
				backdrop:'static',
				resolve: {
					getScreen: ['owsScreen', function(owsScreen) {
						return new owsScreen.getData('StockBulkMove', true);
					}],
					getItem: ['owsItem', function(owsItem) {
						return new owsItem.getData('StockBulkMove');
					}],
					getColumn: ['owsColumn', function(owsColumn) {
						return new owsColumn.getData('StockBulkMove');
					}],
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('StockBulkMove');
					elmFocus.focus();
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('StockBulkMove');
					elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'StockBulkMove');
			});
			return modal;
		},
		// [ONEsLOGI 労務管理][#5210] 作業時間登録画面用エラー表示モーダルの追加 2018.10.30 shimizu add Start
		modalError: function(items){
			var elmFocus = document.activeElement;
			var modal = $modal.open({
				templateUrl:'wms/partials/operation/ModalError.html',
				controller:'ModalError',
				backdrop:'static',
				resolve: {
					getScreen: function(owsScreen) {
						return new owsScreen.getData('ModalError', true);
					},
					getItem: function(owsItem) {
						return new owsItem.getData('ModalError');
					},
					getColumn: function(owsColumn) {
						return new owsColumn.getData('ModalError');
					},
					items: function () {
						return items;
					}
				},
				windowClass: 'app-modal-window',
				beforeClose: function() {
					alertMessage.removeModalAlert('ModalError');
					// IEだとelmFocusがNullの場合があるので
					if(elmFocus) {
						elmFocus.focus();
					}
				},
				beforeDismiss: function() {
					alertMessage.removeModalAlert('ModalError');
					// IEだとelmFocusがNullの場合があるので
					if(elmFocus) {
						elmFocus.focus();
					}
				}
			}) ;
			modal.opened.then(function() {
				alertMessage.addModalAlert(modal, 'ModalError');
			});
			return modal;
		}
		// [ONEsLOGI 労務管理][#5210] 作業時間登録画面用エラー表示モーダルの追加 2018.10.30 shimizu add End
	}
	// [#2233] 在庫一括移動指示機能追加 2017.08.16 ase End

}])
.factory('selectClientFactory', ['$modal', 'alertMessage', '$timeout', function($modal, alertMessage, $timeout){
    return {
    	modalClient: function(scope) {
			var elmFocus = document.activeElement;
			var modal = $modal.open({
    			templateUrl: "wms/partials/common/SelectClient.html",
				//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI Start
    			backdrop:'static',
        		//[検査-170] 画面外をクリックした時に、自動で画面が閉じ無い様に修正します。 2014.12.01 KI End
                scope: scope,
            	controller:'SelectClient',
                resolve: {
                    getScreen: ['owsScreen', function(owsScreen) {
                        return new owsScreen.getData('SelectClient', true);
                    }],
                    getItem: ['owsItem', function(owsItem) {
                        return new owsItem.getData('SelectClient');
                    }]
                },
                windowClass: 'app-modal-window-small',
				beforeClose: function() {
				    alertMessage.removeModalAlert('SelectClient');
				    elmFocus.focus();
				},
				beforeDismiss: function() {
				    alertMessage.removeModalAlert('SelectClient');
				    elmFocus.focus();
				}
			}) ;
			modal.opened.then(function() {
			    alertMessage.addModalAlert(modal, 'SelectClient');
//				$timeout(function(){
//	                if ($(".modal-dialog").length) {
//	                	$(".modal-dialog").draggable();
//	                }
//				},0);
			});
			return modal;
    	}
    }
}])
/**
 * センタ切り替えメニューのコントローラ
 * ・ver 2.1までは、OneslogiWmsCommon内で定義されていたものを、コントローラとして独立させたものです。 2017/02/24 comment by inoue
 */
.controller('SelectClientCtrl'
		, ['$scope'
		   , 'selectClientFactory'
		   , function(
				   $scope
				   , selectClientFactory){
		//選択ボタン
		$scope.selectClient = function(){
			var modalInstance = selectClientFactory.modalClient($scope);
			modalInstance.result.then(function(dataList){
				modalInstance.close();
			});
		};
}])
/**
 * ユーザ情報の拡張設定
 * userInfoに対してフィールドやメソッドの追加を行うことができます。
 * userInfo自体の定義は基盤のソース(oneslogi.web.main.js)内で行われており、共通フィールド（userNm、userCd等）はあらかじめ定義されています。
 * 追加したいフィールドやメソッドを持つオブジェクトを、userInfoProvider.extendの引数でオブジェクトに渡してください。
 * 渡されたオブジェクトの内容がuserInfoにマージされます。
 * controllerやfactory、serviceでuserInfoをinjectされるuserInfoはマージされた状態で取得できます。
 * 2017/02/15 comment by inoue
 *
 */
.config(['userInfoProvider', function (userInfoProvider) {
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
	userInfoProvider.extend({
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
	});
}])
/**
 * $routeの拡張
 * 画面遷移時に共通的に行いたい処理を登録することができます。
 * 2017/03/01 comment by inoue
 */
.config(['routeExtendProvider', function (routeExtendProvider) {
	/**
	 * プロパティ追加
	 * setAdditionalFirstRouteChangeProcessとsetAdditionalEveryRouteChangeProcessで登録した関数の実行時の引数に渡されるprocessStatusに対してフィールドの追加を行うことができます。
	 * routeExtendProvider.extendにセットしたオブジェクトがprocessStatusにマージされます。
	 * 2017/03/01 comment by inoue
	 */
	routeExtendProvider.extend({
		checkedDaily: false
	});

	/**
	 * 一度のみ実行される処理
	 * routeExtendProvider.setAdditionalFirstRouteChangeProcessには最初の画面遷移時にのみ実行したい関数をセットしてください。
	 * 登録された関数は基盤マスタの取得処理の完了後に実行されます。
	 * 関数の引数は固定になります。
	 * 関数は必ずpromissを返却するように実装してください。
	 * 2017/03/01 comment by inoue
	 */
	routeExtendProvider.setAdditionalFirstRouteChangeProcess(function($q, $rootScope, owsSystem, owsCulture, owsMessage, owsMenu, owsScreen, owsItem, owsColumn, userInfo, statusInfo, processStatus, injectUtil) {

		// apiの取得
		// 名前の間違いなどがあった場合はエラーが発生しますのでコンソールを確認してください。単純な名前の間違いやinjectModulesへのセット漏れなどが考えられると思います。2017/03/01 comment by inoue
		var api = injectUtil.get('oneslogiWms.CommonApis', 'commonApi');

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
					if (response.data.utcTime) {
						owsSystem.setUtcTime(response.data.utcTime);
					}
				}
			});
		};

		// [#45] 日次締処理終了後の日付反映対応(関連処理を移動) 2016.11.01 kawana

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
		});
	});

	/**
	 * 毎回実行される処理
	 * routeExtendProvider.setAdditionalEveryRouteChangeProcessには画面遷移が行われる都度実行したい関数をセットしてください。
	 * 登録された関数は基盤マスタの取得処理の完了後に実行されます。
	 * 関数の引数は固定になります。
	 * 関数は必ずpromissを返却するように実装してください。
	 * 2017/03/01 comment by inoue
	 */
	routeExtendProvider.setAdditionalEveryRouteChangeProcess(function($q, $rootScope, owsSystem, owsCulture, owsMessage, owsMenu, owsScreen, owsItem, owsColumn, userInfo, statusInfo, processStatus, injectUtil) {
		// apiの取得
		// 名前の間違いなどがあった場合はエラーが発生しますのでコンソールを確認してください。単純な名前の間違いやinjectModulesへのセット漏れなどが考えられると思います。2017/03/01 comment by inoue
		var api = injectUtil.get('oneslogiWms.CommonApis', 'commonApi');

		// 日次関連処理

		// [Ver3.0][#2718] チェック済判定削除 2018.06.11 shimizu Del

		//日次処理実行中、日次処理忘れチェック
		var promiseCheckSystemDt = function() {

			var request = {};
			request.clientId = userInfo.clientId;
			request.centerId = userInfo.centerId;
			request.systemDt = userInfo.systemDt;

			return api.checkSystemDt.record(request).then(function(response){

				// [#12915] セッションタイムアウト後のメニュー遷移でサーバ接続エラー発生 2021.06.01 kawana Start
				if (response.status.statusCode < 0) {
					processStatus.checkedDaily = false;
					return;
				}
				// [#12915] セッションタイムアウト後のメニュー遷移でサーバ接続エラー発生 2021.06.01 kawana End

				if (response.status.messageCode == "dailyCheckError") {
					// 日次処理実行中
					$rootScope.$broadcast('dailyCheckExceptionMessage', response);
					// 次からの画面遷移でもチェック
					processStatus.checkedDaily = false;
					return ;
				}

				// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.11 shimizu Start
				if (response.status.messageCode == "systemDtCheckError") {
					$rootScope.$broadcast('systemDtOfUserDataAndSystemDtOfDbMismatch', response);
					processStatus.checkedDaily = false;
					return ;
				}
				// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.11 shimizu End

				if (!processStatus.checkedDaily && response.status.messageCode == "systemDtWarn") {
					// 日次処理忘れ
					$rootScope.$broadcast('systemDtExceptionMessage', response);
				}
				// チェック済
				processStatus.checkedDaily = true;
			});
		};

		// 荷主センタ情報反映
		var promiseClientCenter = function() {

			var request = {};
			request.clientId = userInfo.clientId;
			request.centerId = userInfo.centerId;

			return api.clientCenter.record(request).then(function(response){

				// [#12915] セッションタイムアウト後のメニュー遷移でサーバ接続エラー発生 2021.06.01 kawana Start
				if (response.status.statusCode < 0) {
					return;
				}
				// [#12915] セッションタイムアウト後のメニュー遷移でサーバ接続エラー発生 2021.06.01 kawana End

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

				// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add Start
				var beforeSystemDt = userInfo.beforeSystemDt;
				var systemDtTm = beforeSystemDt.slice(0,4) + "/" + beforeSystemDt.slice(4,6) + "/" + beforeSystemDt.slice(6,8);
				var date = new Date(systemDtTm);
				var tkeepingDays = userInfo.tkeepingDays;
				date.setDate(date.getDate()-tkeepingDays);
				userInfo.beforeSystemDt = date.getFullYear() + ("0" + (date.getMonth() + 1)).slice(-2) + ("0" + date.getDate()).slice(-2);
				// 履歴検索 梱包履歴と棚卸履歴と出荷履歴と在庫移動履歴と入荷履歴画面新規作成 2016.8.9 Myo Min Oo Add End
			});

    	};

		return promiseCheckSystemDt()
    	.then(function() {
			if (processStatus.checkedDaily) {
        		return promiseClientCenter();
			}
    	})
       	// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana End
		;
	});
}])
/**
 * AlertCtrlの拡張
 * AlertCtrlは、メッセージ表示領域に割り当てられているコントローラです。
 * メッセージ表示領域の初期化処理の中で実行したい処理を登録することができます。
 * 2017/03/01 comment by inoue
 */
.config(['alertCtrlExtendProvider', function (alertCtrlExtendProvider) {
	/**
	 * 初期化処理追加
	 * alertCtrlExtendProvider.setAdditionalInitProcessにはAlertCtrlのコンストラクタの中で実行したい関数をセットしてください。
	 * 関数の引数は固定になります。
	 * 2017/03/01 comment by inoue
	 */
	alertCtrlExtendProvider.setAdditionalInitProcess(function($rootScope, $filter, $log, alertMessage, owsCommon, $window, $location) {
		//日次処理を実行してください
		$rootScope.$on('systemDtExceptionMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter("systemDtWarn", "", false);
			alertMessage.setWarningMessage(msg);
		});

		// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana Start

		//日次処理実行中です
		$rootScope.$on('dailyCheckExceptionMessage', function(event, err) {
			var messageFilter = $filter('owfMessage');
			var msg = messageFilter("dailyCheckError", "", false);
			alertMessage.setErrorMessage(msg);
		});

		//日次処理実行中です (メニューへ遷移)
		$rootScope.$on('dailyCheckExceptionMessageAndMoveMainMenu', function(event, err) {

			// メッセージを表示
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
			}

			if($window.location.hash!="#" + commonRedirectUrl){
				owsCommon.viewAlert("dailyProcessRunningConfirm");
				$window.location.hash=commonRedirectUrl;
				$window.location.reload();
			}
		});

		// [Ver3.0][#2718] broadcastの処理追加 2018.06.08 shimizu Start
		$rootScope.$on('systemDtOfUserDataAndSystemDtOfDbMismatch', function(event, err) {
			owsCommon.viewAlert("systemDtMismatchConfirm");
			$window.location.reload();
		});
		// [Ver3.0][#2718]  broadcastの処理追加 2018.06.08 shimizu End

		// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana End
	});
}])
/**
 * $http受信時の処理の拡張
 * サーバとの通信時に共通的に行いたい処理を登録することができます。
 * 2017/03/01 comment by inoue
 */
.config(['httpExtendProvider', function (httpExtendProvider) {
	/**
	 * httpExtendProvider.setAdditionalResponseProcessにはレスポンス受信時に実行したい関数をセットしてください。
	 * 関数の引数は固定になります。
	 * 登録された関数は、基盤の共通チェックが行われた後に実行されます。
	 * この為、基盤のチェックでエラーが検知された場合（認証エラーなど）は実行されません。
	 * またresponse.dataとresponse.data.statusがnot nullである場合のみ実行されます。
	 * 処理は実行されるだけですので、受信の成否そのものを変更することはできません。
	 * 引数の「response」が受信したデータです。
	 * 2017/03/01 comment by inoue
	 */
	httpExtendProvider.setAdditionalResponseProcess(function($log, $rootScope, response) {
		if(response.data.status.statusCode == 101){
			// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana Start
			$rootScope.$broadcast('dailyCheckExceptionMessageAndMoveMainMenu', response);
			// [#45] 日次締処理終了後の日付反映対応 2016.11.01 kawana End
		}
		// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.08 shimizu Start
		else if(response.data.status.statusCode == 103) {
			$rootScope.$broadcast('systemDtOfUserDataAndSystemDtOfDbMismatch', response);
		}
		// [Ver3.0][#2718] システム管理日付のチェック処理追加 2018.06.08 shimizu End
	});
}])
// [#5885][v3.1] デバッグログを表示しないように変更 2019.01.11 kawana Start
.config(['$logProvider', function ($logProvider) {

	$logProvider.debugEnabled(false);
}])
// [#5885][v3.1] デバッグログを表示しないように変更 2019.01.11 kawana End
;
