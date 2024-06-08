<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingCasePickingDto" %>

<c:set var="num" value="${ShippingCasePickingDto.wHtShippingPickingDto.instNum / ShippingCasePickingDto.wHtShippingPickingDto.unitNum}"/>
<c:set var="pos" value="${fn:indexOf(num , '.')}"/>
<c:set var="caseNum" value="${fn:substring(num, 0, pos)}"/>

<%-- ケースピック(入庫No)画面 --%>

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

<%-- 入庫No --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("storeLabelNo")}:${fn:escapeXml(ShippingCasePickingDto.wHtShippingPickingDto.storeLabelNo)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 Start --%>
<%-- 指示数 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("instNum")}:${screen.stripTrailingZeros(ShippingCasePickingDto.wHtShippingPickingDto.instNum)}</text>

<%-- ケース数 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("caseNum")}:${screen.stripTrailingZeros(caseNum)}</text>
<%-- 検品数 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ShippingCasePickingDto.wHtShippingPickingDto.spgQtyOns)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 End --%>
<%-- 入庫No --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("storeLabelNoInput")}:</text>
<input mode="1"
       size="2"
       x="12"
       y="25"
       adjusty="0"
       ${screen.inputTextAttr("storeLabelNoInput")}
       width="17"
       param="storeLabelNo" default="${fn:escapeXml(ShippingCasePickingDto.storeLabelNo)}"></input>

<%-- Ent:商品 --%>
<button type="1"
        key="e"
        x="16"
        y="29"
        width="15"
        size="2"
        url="ShippingCasePickingJanCd/load"
        >Ent:${screen.itemNm("enter")}</button>

<%@ include file="../../base/HTBaseFooter.jsp" %>
