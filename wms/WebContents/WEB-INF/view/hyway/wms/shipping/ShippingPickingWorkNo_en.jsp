<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingDto" %>
<%-- オーダピック(No) --%>

<%-- 出庫作業No/梱包No --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("workNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="8"
       ${screen.inputTextAttr("workNo")}
       width="18"
       param="pickingWorkNo" default="${fn:escapeXml(ShippingPickingDto.wHtShippingPickingDto.pickingWorkNo)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
