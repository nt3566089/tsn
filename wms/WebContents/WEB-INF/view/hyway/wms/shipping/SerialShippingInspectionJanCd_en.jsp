<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>
<%-- シリアル登出(ｿｰｽCD)画面 --%>
<c:set var="isPackingNo" value="${SerialShippingInspectionDto.isPackingNo }"/>
<c:set var="supplierCustomerCd" value="${SerialShippingInspectionDto.supplierCustomerCd }"/>
<c:set var="pickingWorkNo" value="${SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo }"/>
<c:if test="${not empty pickingWorkNo}">
<%-- 出庫作業No --%>
	<c:if test="${isPackingNo==false }">
		<text mode="1"
	      size="1"
	      x="1"
	      y="4"
	      >${screen.itemNm("workNo")}:</text>
	</c:if>
<%-- 出荷梱包No --%>
	<c:if test="${isPackingNo==true }">
		<text mode="1"
	      size="1"
	      x="1"
	      y="4"
	      >${screen.itemNm("packingNo")}:</text>
	</c:if>
	<text mode="1"
	      size="1"
	      x="1"
	      y="7"
	      adjusty="0"
	      >${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo)}</text>
</c:if>
<%-- 納品先 --%>
<c:if test="${empty pickingWorkNo and not empty supplierCustomerCd}">
	<text mode="1"
	      size="1"
	      x="1"
	      y="4"
	      >${screen.itemNm("customerCd")}:</text>
	<text mode="1"
		  size="1"
		  x="12"
		  y="4"
		  adjusty="0"
		  >${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerCd)}</text>
	<text mode="1"
		  size="1"
		  x="1"
		  y="7"
		  adjusty="0"
		  >${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerNm)}</text>
</c:if>
<%-- 出庫作業No --%>
<c:if test="${empty pickingWorkNo and empty supplierCustomerCd}">
<text mode="1"
	      size="1"
	      x="1"
	      y="4"
	      >${screen.itemNm("workNo")}:</text>
</c:if>
<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="13"
       adjusty="0"
       ${screen.inputTextAttr("janCd")}
       width="30"
       param="janCd"
       default="${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.janCd)}"></input>
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="17"
      adjusty="0"
      >${screen.itemNm("productCd")}:</text>
<text mode="1"
      size="1"
      x="1"
      y="20"></text>
<%-- 登録数 --%>
<text mode="1"
      size="1"
      x="1"
      y="23"
      adjusty="0"
      >${screen.itemNm("inspQty")}:</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
