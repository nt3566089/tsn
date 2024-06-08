<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>
<c:set var="list" value="${SerialShippingInspectionDto.lstMCustomerBySupplierDto}"/>
<select mode="1"
        size="2"
        starty="5"
        number="6"
        pagesize="9"
        style="1">
<c:forEach var="var" items="${list}" varStatus="vs">
    <option x="2"
    url="SerialShippingInspectionSupplierSelect/select?supplier=${fn:escapeXml(var.getCustomerCd())}">${fn:escapeXml(var.getCustomerCd())}:${fn:escapeXml(var.getCustomerNm())}</option>
</c:forEach>
</select>
<text size="2"
        x="24"
      y="30"
      name="selectpage"> </text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
