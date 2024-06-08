<%@ include file="../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.HandyCenterDto" %>
<select mode="1" size="1" starty="3" pagesize="5" number="1" url="" style="1">
<c:forEach var="list" items="${handyCenter}" varStatus="sts">
<option number="${sts.index}" x="3" url="handyCommon/returnCenterData?selIndex=${fn:escapeXml(sts.index)}">${fn:escapeXml(list.centerNm)}</option>
</c:forEach>
</select>
<%@ include file="../base/HTBaseFooter.jsp" %>
