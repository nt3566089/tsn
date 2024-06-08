<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<c:set var="list" value="${InventoryInputProductDto.lstMCustomerDto}"/>
<%-- 預託選択 --%>
<select mode="1"
        size="1"
        starty="5"
        number="6"
        pagesize="9"
        style="1">
<c:forEach var="var" items="${list}" varStatus="vs">
    <option x="2"
     url="InventoryInputProductDepositSelect/select?deposit=${fn:escapeXml(var.getCustomerCd())}">${fn:escapeXml(var.getCustomerCd())}:${fn:escapeXml(var.getCustomerNm())}</option>
</c:forEach>
</select>
<text size="1"
        x="24"
      y="30"
      name="selectpage"> </text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
