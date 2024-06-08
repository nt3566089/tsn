<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto" %>

<%-- 単行出荷検品(作業指示数選択)画面 --%>

<%-- 選択肢 --%>
<c:set var="list" value="${SingleRowShippingNoPackingDto.getInstNumList()}"/>
<c:forEach var="instNum" items="${list}" varStatus="vs">
<c:set var="xIndex" value="${vs.index < 7 ? 0 : 1}"/>
<button mode="1"
        size="2"
        x="${2 + xIndex * 14}"
        y="${4 + (vs.index % 7) * 4}"
        key="${instNum}"
        width="13"
        url="SingleRowShippingNoPackingInstNumSelect/select?instNum=${fn:escapeXml(instNum)}">${fn:escapeXml(instNum)}</button>
</c:forEach>

<%@ include file="../../base/HTBaseFooter.jsp" %>
