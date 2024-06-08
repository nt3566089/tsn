<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%--商品棚卸(数量) --%>
<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("loc")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.locNm)}</text>
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.janCd)}</text>
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.productNm)}</text>
<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.lot)}</text>
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(InventoryInputProductDto.limitDt)}</text>
<%-- 預託 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("deposit")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.consignmentClsNm)}</text>
<%-- 在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.stkClsNm)}</text>
<%-- 数量  --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("qty")}:</text>
<input mode="1"
       size="2"
       x="9"
       y="28"
       adjusty="0"
       ${screen.inputNumberAttr("qty")}
       width="15"
       param="qty" default="${screen.stripTrailingZeros(InventoryInputProductDto.qty)}"></input>
<%--[Ver3.0] unit of measure対応 2017.11.30 REN Start --%>
<button type="1"
        key=""
        x="25"
        y="28"
        adjusty="0"
        width="5"
        size="2"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%--[Ver3.0] unit of measure対応 2017.11.30 REN End --%>
<%@ include file="../../base/HTBaseFooter.jsp" %>
