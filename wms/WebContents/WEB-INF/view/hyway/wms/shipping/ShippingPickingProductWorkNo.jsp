<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingPickingProductDto" %>
<%-- オーダピック（No）--%>

<%-- 出庫作業No/梱包No --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("workNo")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="8"
       width="18"
       ${screen.inputTextAttr("workNo")}
       param="pickingWorkNo" default="${fn:escapeXml(ShippingPickingProductDto.wHtShippingPickingDto.pickingWorkNo)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
