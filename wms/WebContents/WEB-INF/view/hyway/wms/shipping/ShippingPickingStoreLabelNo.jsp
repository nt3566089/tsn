<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto" %>

<%-- オーダピック(入庫No) --%>

<c:set var="isPackingNo" value="${ShippingPickingDto.isPackingNo }"/>
<c:if test="${isPackingNo==false }">
<%-- 出庫作業No --%>
  <text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("workNo")}:</text>
</c:if>
<c:if test="${isPackingNo==true }">
<%-- 出荷梱包No --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<%-- 出庫作業No/出荷梱包No --%>
<text mode="1"
      size="2"
      x="1"
      y="8"
       >${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.pickingWorkNo)}</text>
<%-- 入庫No --%>
<text mode="1"
      size="2"
      x="1"
      y="12"
      >${screen.itemNm("storeLabelNo")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="16"
       ${screen.inputTextAttr("storeLabelNo")}
        width="18"
       param="storeLabelNo" default="${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.storeLabelNo)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
