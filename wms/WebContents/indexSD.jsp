<!-- ※※※※※※※※※※※※※※※※※※※※※※※※※※ -->
<!-- このソースは基盤ソースです。変更は行わないで下さい。 -->
<!-- ※※※※※※※※※※※※※※※※※※※※※※※※※※ -->


<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="static com.oneslogi.base.jsp.JspControl.*"%>

<%
	// 認証状態チェック処理
	if (!isAuth(request, response)) {
		return;
	}
%>

<!DOCTYPE html>
<html ng-app="oneslogiWebSd" xmlns:ng="http://angularjs.org" id="ng-app">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="initial-scale=1,maximum-scale=1,user-scalable=no,width=device-width">
	<meta http-equiv="X-UA-Compatible" content="IE=Edge">

	<title>ONEsLOGIWeb SmartDevice Template</title>

	<link rel="icon" href="base/image/favicon.ico" type="image/x-icon">
	<link rel="apple-touch-icon" href="base/image/apple-touch-icon.png" sizes="180x180">

	<link rel="stylesheet" href="base/css/ionic-1.3.1/ionic.min.css">

	<link rel="stylesheet" href="base/css/ionic-datepicker-1.2.1/ionic-datepicker.styles.min.css">

	<link rel="stylesheet" href="base/css/commonSD.min.css">

	<link rel="stylesheet" href="base/css/AngularOverlay/stylesSD.min.css">

</head>
<body ng-controller="OneslogiWebCommon" owd-body>

	<ion-side-menus enable-menu-with-back-views="true">

		
		

		
		<ion-side-menu-content>
			<ion-nav-bar class="bar-positive">
				
				<ion-nav-back-button class="button-clear"><i class="icon ion-chevron-left"></i></ion-nav-back-button>
				
				
				<ion-nav-buttons side="right">
					<button menu-toggle="right" class="button button-icon icon ion-navicon"></button>
				</ion-nav-buttons>
			</ion-nav-bar>

			
			
			<div>
				
				<ui-view name="mainContent"></ui-view>
			</div>

			
			
			<div ng-controller="AlertCtrl">
				<div ng-repeat="alert in alerts | orderBy:'addDt':true" style="display: inline-block">
					
					<div id="alert" style="height:auto; min-height:44px; display: inline-block" ng-show="alert.id == alerts[alerts.length-1].id" class="bar bar-footer" ng-class="{'bar-info': alert.type == 'info', 'bar-warning': alert.type == 'warning', 'bar-danger': alert.type == 'danger'}" ng-click="nextAlert()">
					
						<button href="" class="alert-link button button-clear" style="position: absolute">
							<span class="badge btn-info" ng-show="alerts.length > 1">{{alerts.length}}</span>
						</button>
						<p class="title item-text-wrap" style="position: relative; height:auto; line-height:normal; white-space:normal; text-overflow:initial; margin: 5px 34px 0px 28px" close="closeAlert(alert.id)" class="alertblink" ng-bind-html="alert.msg"></p>
						<button class="button button-clear" class="close" ng-click="closeAlert(alert.id)">
							<i class="icon ion-close"></i>
						</button>
					</div>
				</div>
			</div>
			

			
			

		</ion-side-menu-content>

		
		<ion-side-menu side="right" enable-menu-with-back-views="true">
			<header class="bar bar-header bar-calm">
				<h1 class="title"></h1>
			</header>
			<ion-nav-view name="menuContent" animation="slide-right-left"></ion-nav-view>
		</ion-side-menu>
	</ion-side-menus>

	
 	<div data-wc-overlay="" data-wc-overlay-delay="500">
		<br>
		<ion-spinner class="spinner-positive"></ion-spinner>
	</div>
	

	
	<script src="base/js/jquery-1.11.0/jquery-1.11.0.min.js"></script>

	<script src="base/js/jquery.base64-0.0.1/jquery.base64.min.js"></script>

	<script src="base/js/zlib-0.2.0/zlib.min.js"></script>

	<script src="base/js/ionic-1.3.1/ionic.bundle.min.js"></script>

	<script src="base/js/ionic-datepicker-1.2.1/ionic-datepicker.min.js"></script>

	
	<script src="base/js/angular-1.2.16/angular-cookies.min.js"></script>
	

	<script src="base/js/angular-dynamic-locale-0.1.32/tmhDynamicLocale.min.js"></script>

	<script src="base/js/ui-bootstrap-0.10.0/ui-bootstrap-tpls-0.10.0.min.js"></script>

	<script src="base/js/ui-utils-0.1.1/ui-utils.min.js"></script>

	<script src="base/js/jquery-file-upload-9.5.7/jquery.fileupload.min.js"></script>

	<script src="base/js/AngularOverlay/wcAngularOverlay.min.js"></script>

	<script src="base/js/Chart.js-2.3.0/Chart.min.js"></script>

	<script src="base/js/angular-chart-1.0.3/angular-chart.min.js"></script>

	<script src="base/js/angular-api-client/angular-api-client.min.js"></script>

	

	<script src="base/js/decimal.js-7.3.0/decimal.min.js"></script>

	

	<script src="<%= appendFileUpdateDt("base/js/designMode.js", request) %>"></script>
	<script src="<%= appendFileUpdateDt("base/js/parameter.js", request) %>"></script>

	<script src="base/js/oneslogi.base.sd.min.js"></script>

	<script src="base/js/oneslogi.base.liteLogin.sd.min.js"></script>

	<jsp:include page="includeJS.sd.jsp" />

<script type="text/javascript">

	// サイドメニューボタンの表示が処理されるまで待つ
	// ※setTimeoutよりいい方法があれば変更したい
	setTimeout(function(){
		// サイドメニューボタンが押されている間はボタンを非表示
		// ※disabledでは#6952の動作不良が改善されなかったためhideで対応
		$("button[menu-toggle='right']").on('touchstart', function(){
			$("button[menu-toggle='right']").hide();
		});
		$("button[menu-toggle='right']").on('touchend', function(){
			$("button[menu-toggle='right']").show();
		});
	}, 1000);
</script>


</body>
</html>