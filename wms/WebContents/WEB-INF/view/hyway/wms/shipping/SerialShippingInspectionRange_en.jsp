<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>
<%-- シリアル登出(範囲)画面 --%>
<c:set var="isPackingNo" value="${SerialShippingInspectionDto.isPackingNo }"/>
<c:set var="supplierCustomerCd" value="${SerialShippingInspectionDto.supplierCustomerCd }"/>
<c:set var="pickingWorkNo" value="${SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo}"/>
<c:if test="${not empty pickingWorkNo}">
	<c:if test="${isPackingNo==false }">
<%-- 出庫作業No --%>
		<text mode="1"
	          size="1"
	          x="1"
	          y="4"
	          >${screen.itemNm("workNo")}:</text>
	</c:if>
	<c:if test="${isPackingNo==true }">
<%-- 出荷梱包No --%>
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
<c:if test="${empty pickingWorkNo and not empty supplierCustomerCd}">
<%-- 納品先 --%>
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
<c:if test="${empty pickingWorkNo and empty supplierCustomerCd}">
<%-- 出庫作業No --%>
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
      >${screen.itemNm("janCd")}:${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.janCd)}</text>
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.productNm)}</text>
<%-- ｽﾀｰﾄｼﾘｱﾙ --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("startSerialNo")}:${fn:escapeXml(SerialShippingInspectionDto.startSerialNo)}</text>
<%-- 数量 --%>
<text mode="1"
      size="1"
      x="1"
      y="23"
      adjusty="0"
      >${screen.itemNm("serialNum")}:</text>
<input mode="1"
       size="1"
       x="6"
       y="23"
       adjusty="0"

       width="21"
       ${screen.inputNumberAttr("serialNum")}
       param="serialNum"
       default="${fn:escapeXml(SerialShippingInspectionDto.serialNum)}"></input>
<%-- ｼﾘｱﾙ --%>
<text mode="1"
      size="1"
      x="1"
      y="27"
      adjusty="0"
      >${screen.itemNm("serialNo")}:</text>
<!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw Start  -->
<input mode="1"
       size="1"
       x="6"
       y="27"
       adjusty="0"
       ${screen.inputTextAttr("serialNo", isOcrFlg)}
       width="21"
       param="serialNo"
       default="${fn:escapeXml(SerialShippingInspectionDto.endSerialNo)}"></input>
 <!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw End  -->
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
