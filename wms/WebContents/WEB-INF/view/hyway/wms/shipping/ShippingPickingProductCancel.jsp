<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductDto" %>
<c:set var="isPackingNo" value="${ShippingPickingProductDto.isPackingNo }"/>
<%-- オーダピック(終了)画面 --%>

<%-- オーダピッキングを --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%-- 終了しますか？ --%>
<text mode="1"
      size="2"
      x="4"
      y="8"
      >${screen.itemNm("msg2")}</text>
<c:if test="${isPackingNo==false }">
<%-- 出庫作業No --%>
  <text mode="1"
      size="2"
      x="4"
      y="12"
      >${screen.itemNm("workNo")}:</text>
</c:if>
<c:if test="${isPackingNo==true }">
<%-- 出荷梱包No --%>
  <text mode="1"
      size="2"
      x="4"
      y="12"
      >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<text mode="1"
      size="2"
      x="4"
      y="16"
      >${fn:escapeXml(ShippingPickingProductDto.wHtShippingPickingDto.pickingWorkNo)}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
