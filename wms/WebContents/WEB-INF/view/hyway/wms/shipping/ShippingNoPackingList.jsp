<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto" %>
<c:set var="list" value="${ShippingNoPackingDto.lstWHtShippingDto}"/>
<c:set var="pageIndex" value="${ShippingNoPackingDto.pageIndex}"/>
<c:set var="wHtShippingDto" value="${ShippingNoPackingDto.lstWHtShippingDto[pageIndex]}"/>
<c:set var="pageNow" value="${ShippingNoPackingDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="pieceNo" value="${wHtShippingDto.pieceNo > 0 ? wHtShippingDto.pieceNo : ''}"/>
<%--バラ出荷検品（一覧）--%>
<%--ｿｰｽCD  --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(wHtShippingDto.MProduct.janCd)}</text>
<%--商品  --%>
<text mode="1"
      size="2"
      x="1"
      y="8"
      >${screen.itemNm("productCd")}:${fn:escapeXml(wHtShippingDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="12"
      >${fn:escapeXml(wHtShippingDto.MProduct.productNm)}</text>
<%--個口番号  --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("pieceNo")}:${fn:escapeXml(pieceNo)}</text>
 <%--検品数  --%>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 Start --%>
<text mode="1"
      size="2"
      x="1"
      y="20"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(wHtShippingDto.spgQtyOns)}</text>
  <%--指示数  --%>
<text mode="1"
      size="2"
      x="1"
      y="24"
      >${screen.itemNm("spgQtyRem")}:${screen.stripTrailingZeros(wHtShippingDto.instNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 End --%>
<text mode="1"
      size="2"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
