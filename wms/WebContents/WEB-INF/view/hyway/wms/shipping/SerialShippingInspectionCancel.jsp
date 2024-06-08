<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>

<%-- シリアル登出（終了）画面 --%>

<c:set var="isPackingNo" value="${SerialShippingInspectionDto.isPackingNo }"/>
<c:set var="supplierCustomerCd" value="${SerialShippingInspectionDto.supplierCustomerCd }"/>
<c:set var="pickingWorkNo" value="${SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo}"/>
<%-- シリアル登出を --%>
<text mode="1"
      size="2"
      x="4"
      y="6"
      >${screen.itemNm("msg1")}</text>
<%-- シリアル登出を --%>
<text mode="1"
      size="2"
      x="4"
      y="10"
      >${screen.itemNm("msg2")}</text>
<%-- 出庫作業No --%>
<c:if test="${not empty pickingWorkNo}">
	<c:if test="${isPackingNo==false }">
	<text mode="1"
	      size="2"
	      x="7"
	      y="14"
	      >${screen.itemNm("workNo")}:</text>
	</c:if>
	<c:if test="${isPackingNo==true }">
	<text mode="1"
	      size="2"
	      x="7"
	      y="14"
	      >${screen.itemNm("packingNo")}:</text>
	</c:if>
	<text mode="1"
	      size="2"
	      x="7"
	      y="18"
	      >${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo)} </text>
</c:if>
<%-- 出荷梱包No --%>
<c:if test="${empty pickingWorkNo and not empty supplierCustomerCd}">
	<text mode="1"
	      size="2"
	      x="4"
	      y="14"
	      >${screen.itemNm("customerCd")}:</text>
	<text mode="1"
		size="2"
		x="15"
		y="14"
		>${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerCd)}</text>
	<text mode="1"
		size="2"
		x="4"
		y="18"
		>${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerNm)}</text>
</c:if>

<%@ include file="../../base/HTBaseFooter.jsp" %>
