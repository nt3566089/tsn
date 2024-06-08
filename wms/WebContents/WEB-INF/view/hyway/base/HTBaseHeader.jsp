<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<%
	// キャッシュ不可
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("If-Modified-Since", "Thu, 01 Jun 1970 00:00:00 GMT");

	// 認証処理後かどうかチェック
	boolean ssoSession = false;
	boolean ssoTokenInvalid = false;
	boolean appSession = false;
/*
	if (com.oneslogi.ht.base.resources.HandyLoginResource.sso) {
		if (request.getCookies() != null) {
			for (int i = 0; i < request.getCookies().length; i++) {
				if(request.getCookies()[i]!=null && request.getCookies()[i].getName()!=null){
					if (com.oneslogi.ht.base.resources.HandyLoginResource.tokenKey.equals(request.getCookies()[i].getName())) {
						if (request.getCookies()[i].getValue() != null && !"".equals(request.getCookies()[i].getValue())) {
							String token = request.getCookies()[i].getValue();
							ssoSession = true;
							ssoTokenInvalid = true;

							// Tokenチェック
							if (com.oneslogi.ht.base.resources.HandyLoginResource.checkTokenValid(token)) {
								ssoTokenInvalid = false;
							}

							break;
						}
					}
				}
			}
		}
	} else {
		ssoSession = true;
	}

	if (request.getCookies() != null) {
		for (int i = 0; i < request.getCookies().length; i++) {
			if (com.oneslogi.ht.base.resources.HandyLoginResource.X_ONESLOGI_AUTHENTICATION_DATA.equals(request.getCookies()[i].getName())) {
				if (request.getCookies()[i].getValue() != null && !"".equals(request.getCookies()[i].getValue())) {
					appSession = true;
					break;
				}
			}
		}
	}
*/

%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<fmt:setBundle basename="handy" var="handyBundle" />
<xml bitmap="4"
     fgcolor="<fmt:message bundle="${handyBundle}" key="fgcolor"/>"
     bgcolor="<fmt:message bundle="${handyBundle}" key="bgcolor"/>">
<setting name="GUIMode" value="2"/>
<setting name="HalfRowMode" value="1"/>
<setting name="ReceiveTimeout" value="59"/>
<setting name="ButtonFocusbgcolor" value="#a9a9a9"/>
<c:if test="${!empty handyHeader}">
<%-- 2015/06/16 INOUE UPDATE エラー時文字色指定 --%>
<text mode="5"
      size="2"
      x="1"
      y="1"
      bgcolor="${handyHeader.headerColor}"
      fgcolor="${handyHeader.headerTextColor}" width="37"></text>
<text mode="5"
      size="2"
      x="1"
      y="1"
      bgcolor="${handyHeader.headerColor}"
      fgcolor="${handyHeader.headerTextColor}" width="32">${fn:escapeXml(handyHeader.headerText)}</text>
</c:if>
