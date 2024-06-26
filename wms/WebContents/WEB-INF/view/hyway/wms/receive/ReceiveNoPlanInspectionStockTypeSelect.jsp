<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>
<c:set var="list" value="${ReceiveNoPlanInspectionDto.lstMStockTypeDto}"/>
<select mode="1"
        size="2"
        starty="5"
        number="6"
        pagesize="9"
        style="1">
<c:forEach var="var" items="${list}" varStatus="vs">
    <option x="2"
    url="ReceiveNoPlanInspectionStockTypeSelect/select?stockType=${fn:escapeXml(var.getStockTypeCd())}">${fn:escapeXml(var.getStockTypeCd())}:${fn:escapeXml(var.getVDict().getDictNm())}</option>
</c:forEach>
</select>
<text size="2"
      x="24"
      y="30"
      name="selectpage"> </text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
