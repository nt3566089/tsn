<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%--  商品棚卸(ロケ)--%>
<%--ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("loc")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="13"
       adjusty="0"
       ${screen.inputTextAttr("loc")}
       width="22"
       param="loc" default="${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.locCd)}"></input>
<%@ include file="../../base/HTBaseFooter.jsp" %>
