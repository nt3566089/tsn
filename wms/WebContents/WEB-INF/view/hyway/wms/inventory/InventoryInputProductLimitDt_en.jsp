<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%--商品棚卸(詳細)  --%>
<%-- ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("loc")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.locNm)}</text>
<%--ｿｰｽCD  --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.janCd)}</text>
<%--商品  --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.productNm)}</text>
<%--期限日  --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("limitDt")}:</text>
<input mode="1"
       size="1"
       x="12"
       y="16"
       adjusty="0"
       ${screen.inputDateAttr("limitDt")}
       width="16"
       param="limitDt" default="${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.limitDt)}"></input>
<%--預託  --%>
<text mode="1"
      size="1"
      x="1"
      y="20"
      adjusty="0"
      >${screen.itemNm("deposit")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.consignmentClsNm)}</text>
<%--在区  --%>
<text mode="1"
      size="1"
      x="1"
      y="23"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.stkClsNm)}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
