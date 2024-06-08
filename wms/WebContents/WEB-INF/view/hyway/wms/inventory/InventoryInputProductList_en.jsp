<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductDto" %>
<c:set var="list" value="${InventoryInputProductDto.lstWHtInventoryInputProdDto}"/>
<c:set var="pageIndex" value="${InventoryInputProductDto.pageIndex}"/>
<c:set var="wHtInventoryInputProdDto" value="${InventoryInputProductDto.lstWHtInventoryInputProdDto[pageIndex]}"/>
<c:set var="pageNow" value="${InventoryInputProductDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:if test="${fn:length(wHtInventoryInputProdDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtInventoryInputProdDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%--商品棚卸(一覧)  --%>
<%--ロケ  --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("loc")}:${fn:escapeXml(wHtInventoryInputProdDto.locNm)}</text>
<%--ｿｰｽCD  --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(wHtInventoryInputProdDto.janCd)}</text>
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(wHtInventoryInputProdDto.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(wHtInventoryInputProdDto.productNm)}</text>
<%--ロット  --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(wHtInventoryInputProdDto.lot)}</text>
<%--期限日  --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--預託  --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("deposit")}:${fn:escapeXml(wHtInventoryInputProdDto.consignmentClsNm)}</text>
<%--在区  --%>
<text mode="1"
      size="1"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(wHtInventoryInputProdDto.stkClsNm)}</text>
<%--数量  --%>
<text mode="1"
      size="1"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(wHtInventoryInputProdDto.qty)}</text>
<text mode="1"
      size="1"
      x="23"
      y="30"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
