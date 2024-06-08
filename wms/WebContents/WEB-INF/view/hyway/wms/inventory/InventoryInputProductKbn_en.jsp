<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%--商品棚卸(在区)--%>
<%--預託 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      >${screen.itemNm("consigenmentCls")}:${fn:escapeXml(InventoryInputProductDto.deposit)}</text>
<text mode="1"
      size="1"
      x="1"
      y="13"
      >${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.consignmentClsNm)}</text>
<%--在区 --%>
<text mode="1"
      size="1"
      x="1"
      y="18"
      >${screen.itemNm("stockType")}:${fn:escapeXml(InventoryInputProductDto.stockType)}</text>
<text mode="1"
      size="1"
      x="1"
      y="21"
      >${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.stkClsNm)}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
