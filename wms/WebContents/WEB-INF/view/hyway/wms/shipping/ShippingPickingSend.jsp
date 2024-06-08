<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto" %>
<%-- オーダピック(確認) --%>
<%-- メッセージ1 --%>
<text mode="1"
      size="2"
      x="2"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%-- メッセージ2 --%>
<text mode="1"
      size="2"
      x="4"
      y="8"
      >${screen.itemNm("msg2")}</text>
<%-- 入庫No --%>
<text mode="1"
      size="2"
      x="7"
      y="12"
      >${screen.itemNm("storeLabelNo")}:</text>

<text mode="1"
      size="2"
      x="7"
      y="16"
      >${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.storeLabelNo)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.20 王 Start --%>
<%-- 数量 --%>
<text mode="1"
      size="2"
      x="7"
      y="20"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(ShippingPickingDto.qty)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.20 王 End --%>
<%@ include file="../../base/HTBaseFooter.jsp" %>
