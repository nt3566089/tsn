<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.SingleRowShippingNoPackingDto" %>

<%-- 単行出荷検品(出庫作業メッセージ)画面 --%>

<%-- 出庫作業No  --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("pickingWorkNo")}:</text>
<text mode="1"
       size="2"
       x="1"
       y="7"
      >${fn:escapeXml(SingleRowShippingNoPackingDto.getPickingWorkNo())}</text>

<text mode="1"
      size="2"
      x="1"
      y="11"
      >${fn:escapeXml(SingleRowShippingNoPackingDto.getPickingWorkMessage())}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
