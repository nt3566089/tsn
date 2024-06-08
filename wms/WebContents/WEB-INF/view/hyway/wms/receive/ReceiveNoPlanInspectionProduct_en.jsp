<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>
<fmt:setLocale value="en_US"/>
<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>
<!-- 完了確認(商品) -->
<%-- Msg1 --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
/>

<%-- Msg2 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
>${screen.itemNm("msg2")}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<!-- 商品名称テスト -->
<%-- 商品名 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- >${screen.itemNm("spgQtyOns")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.storeNumSum)}</text> --%>
>${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ReceiveNoPlanInspectionDto.storeNumSum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
