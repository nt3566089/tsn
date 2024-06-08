<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="static com.oneslogi.base.jsp.JspControl.*" %>

<li class="dropdown">
	<a href="" class="dropdown-toggle" data-toggle="dropdown">
		<span ng-bind-html="userInfo.centerNm"></span>
		<span class="caret"></span>
	</a>
	<ul class="dropdown-menu">
		<li class="dropdown-header">
			<span ng-bind-html="'centerTitle' | owfMessage"></span>
		</li>
		<li>
			<a href="">
				<span ng-bind-html="userInfo.centerNm"></span>
			</a>
		</li>
		<li class="dropdown-header">
			<span ng-bind-html="'clientTitle' | owfMessage"></span>
		</li>
		<li>
			<a href="">
				<span ng-bind-html="userInfo.clientNm"></span>
			</a>
		</li>
<!-- [基盤分離対応] 機能 #1019 oneslogi.wms.jsからbodyのコントローラ定義を分離する 2017/02/14 inoue start -->
		<!-- <div align="center"> -->
		<div align="center" ng-controller="SelectClientCtrl">
<!-- [基盤分離対応] 機能 #1019 oneslogi.wms.jsからbodyのコントローラ定義を分離する 2017/02/14 inoue end -->
			<button id="select" class="btn-info" ng-click="selectClient()">
				<span ng-bind-html="'clientCenterSelect' | owfMessage"></span>
			</button>
		</div>
	</ul>
</li>

