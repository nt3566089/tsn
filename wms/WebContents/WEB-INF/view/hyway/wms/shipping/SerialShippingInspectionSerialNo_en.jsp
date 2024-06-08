<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SerialShippingInspectionDto" %>
<%-- シリアル登出(ｼﾘｱﾙ)画面 --%>
<c:set var="isPackingNo" value="${SerialShippingInspectionDto.isPackingNo }"/>
<c:set var="supplierCustomerCd" value="${SerialShippingInspectionDto.supplierCustomerCd }"/>
<c:set var="pickingWorkNo" value="${SerialShippingInspectionDto.wHtSerialShippingInspDto.pickingWorkNo}"/>
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
		  <!-- [Ver3.0][#4453] 納品先表示不正修正 2018.04.18 matsumoto Start -->
	<text mode="1"
	      size="1"
	      x="1"
	      y="7"
		  adjusty="0"
		  >${fn:escapeXml(SerialShippingInspectionDto.supplierCustomerNm)}</text>
		  <!-- [Ver3.0][#4453] 納品先表示不正修正 2018.04.18 matsumoto End -->
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
<%-- 登録数 --%>
<text mode="1"
	      size="1"
	      x="1"
	      y="19"
        adjusty="0"
       >${screen.itemNm("inspQty")}:${fn:escapeXml(SerialShippingInspectionDto.inspQty)}</text>
<%-- ｼﾘｱﾙ --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("serialNo")}:</text>
<!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw Start  -->
<input mode="1"
       size="1"
       x="6"
       y="22"
       adjusty="0"
       ${screen.inputTextAttr("serialNo", isOcrFlg)}
       width="21"
       param="serialNo"
       default="${fn:escapeXml(SerialShippingInspectionDto.wHtSerialShippingInspDto.serialNo)}"></input>
 <!-- [#1839] シリアル入力で文字認識対応追加 2017.6.2 nayzaw End  -->
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
