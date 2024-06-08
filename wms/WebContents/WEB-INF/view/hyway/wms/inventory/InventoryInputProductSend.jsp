<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<%--商品棚卸完了 --%>
<text mode="1"
      size="2"
      x="5"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%--データを登録します --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("msg2")}</text>
<%--か？ --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      >${screen.itemNm("msg3")}</text>
<%--ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("loc")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.locNm)}</text>
<%--商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.productNm)}</text>
<%--ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(InventoryInputProductDto.wHtInventoryInputProdDto.lot)}</text>
<%--期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(InventoryInputProductDto.limitDt)}</text>
<%--数量 --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(InventoryInputProductDto.wHtInventoryInputProdDto.qty)}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
