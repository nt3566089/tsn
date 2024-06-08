<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>
<%-- シリアル登出(確認)画面 --%>
<c:set var="isPackingNo" value="${SerialShippingInspectionDto.isPackingNo }"/>
<c:set var="supplierCustomerCd" value="${SerialShippingInspectionDto.supplierCustomerCd }"/>
<c:set var="pickingWorkNo" value="${SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo}"/>
<%-- データを登録します。 --%>
<text mode="1"
      size="2"
      x="2"
      y="6"
      >${screen.itemNm("msg1")}</text>
<%-- よろしいですか？ --%>
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
          x="4"
          y="14"
	  >${screen.itemNm("workNo")}:</text>
	</c:if>
<%-- 出荷梱包No --%>
	<c:if test="${isPackingNo==true }">
	<text mode="1"
      	  size="2"
          x="4"
          y="14"
      >${screen.itemNm("packingNo")}:</text>
	</c:if>
	<text mode="1"
          size="2"
          x="4"
          y="18"
	  >${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo)}</text>
</c:if>
<c:if test="${empty pickingWorkNo and not empty supplierCustomerCd}">
<%-- 納品先 --%>
	<text mode="1"
          size="2"
          x="1"
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
<%-- 登録数 --%>
<text mode="1"
      size="2"
      x="4"
      y="22"
      >${screen.itemNm("inspQty")}:</text>
<text mode="1"
      size="2"
      x="15"
      y="22"
	>${fn:escapeXml(SerialShippingInspectionDto.inspQty)}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>