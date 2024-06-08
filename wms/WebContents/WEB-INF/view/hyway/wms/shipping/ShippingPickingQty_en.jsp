<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto" %>

<%-- オーダピック(数量) --%>

<c:set var="isPackingNo" value="${ShippingPickingDto.isPackingNo }"/>
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
     >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<%-- 出庫作業No/出荷梱包No --%>
<text mode="1"
      size="1"
      x="1"
      y="8"
      >${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.pickingWorkNo)}</text>
<%-- 入庫No --%>
<text mode="1"
      size="1"
      x="1"
      y="12"
      >${screen.itemNm("storeLabelNo")}:</text>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.storeLabelNo)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.20 王 Start --%>
 <%-- 数量 --%>
<text mode="1"
      size="1"
      x="1"
      y="20"
      >${screen.itemNm("qty")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="24"
       adjusty="2"
       ${screen.inputNumberAttr("qty")}
        width="14"
       param="qty" default="${screen.stripTrailingZeros(ShippingPickingDto.qty)}"></input>
<button type="1"
        key=""
        x="17"
        y="24"
        adjusty="2"
        width="5"
        size="21"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%--[Ver3.0] unit of measure対応 2017.11.20 王 End --%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
