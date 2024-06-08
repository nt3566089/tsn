<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto" %>

<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(ShippingCasePickingDto.wHtShippingPickingDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ShippingCasePickingDto.wHtShippingPickingDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<%-- ケースピック(数量)画面 --%>

<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("locationNm")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MLocation.locationNm)}</text>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MProduct.janCd)}</text>

<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.MProduct.productNm)}</text>

<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.TLot.lot)}</text>

<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.29 王 Start --%>
<%-- 指示数 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(ShippingCasePickingDto.wHtShippingPickingDto.instNum)}</text>

<%-- ケース数 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("qty")}:</text>
<input mode="1"
       size="2"
       x="9"
       y="25"
       adjusty="0"
       ${screen.inputNumberAttr("qty")}
       width="14"
       param="qty" default="${screen.stripTrailingZeros(ShippingCasePickingDto.qty)}"></input>
<button type="1"
        key=""
        x="25"
        y="25"
        adjusty="0"
        width="5"
        size="2"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%--[Ver3.0] unit of measure対応 2017.11.29 王 End --%>
<%--[Ver3.0] unit of measure対応 2017.11.29 王 Del --%>

<%@ include file="../../base/HTBaseFooter.jsp" %>
