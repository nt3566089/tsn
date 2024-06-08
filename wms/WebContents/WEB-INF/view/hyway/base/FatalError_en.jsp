<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<%
	// キャッシュ不可
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("If-Modified-Since", "Thu, 01 Jun 1970 00:00:00 GMT");
%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<fmt:setBundle basename="handy" var="handy" />
<fmt:setBundle basename="handyFatalError" var="fatal" />
<fmt:setBundle basename="handyKeyCode" var="keyCode" />

<xml bitmap="4"
     fgcolor="<fmt:message bundle="${handy}" key="fgcolor"/>"
     bgcolor="<fmt:message bundle="${handy}" key="bgcolor"/>">
<setting name="GUIMode" value="2"/>
<setting name="HalfRowMode" value="1"/>
<setting name="ReceiveTimeout" value="59"/>

<text mode="1"
      size="1"
      x="1"
      y="1"
      bgcolor="<fmt:message bundle="${fatal}" key="head.color"/>"
      fgcolor="<fmt:message bundle="${fatal}" key="head.text.color"/>"><fmt:message bundle="${fatal}" key="head.text"/></text>
<text mode="1"
      size="1"
      x="1"
      y="7"><fmt:message bundle="${fatal}" key="text1"/></text>
<text mode="1"
      size="1"
      x="1"
      y="11"><fmt:message bundle="${fatal}" key="text2"/></text>
<text mode="1"
      size="1"
      x="1"
      y="15"><fmt:message bundle="${fatal}" key="text3"/></text>
<text mode="1"
      size="1"
      x="1"
      y="19"><fmt:message bundle="${fatal}" key="text4"/></text>
<text mode="1"
      size="1"
      x="1"
      y="23"><fmt:message bundle="${fatal}" key="text5"/></text>
<button type="1"
        size="1"
        x="17"
        y="27"
        key="<fmt:message bundle="${keyCode}" key="keyEnter.keyCode"/>"
        url="<fmt:message bundle="${fatal}" key="button.url"/>"><fmt:message bundle="${keyCode}" key="keyEnter.keyLabel"/><fmt:message bundle="${fatal}" key="button.label"/></button>
</xml>
