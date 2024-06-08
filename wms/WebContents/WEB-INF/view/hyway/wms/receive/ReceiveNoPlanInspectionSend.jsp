<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷確認 -->
<%-- Msg1 --%>
<text mode="1"
      size="2"
      x="3"
      y="4"
>${screen.itemNm("msg1")}</text>

<%-- Msg2 --%>
<text mode="1"
      size="2"
      x="5"
      y="7"
>${screen.itemNm("msg2")}</text>

<%-- Msg3 --%>
<text mode="1"
      size="2"
      x="7"
      y="10"
>${screen.itemNm("msg3")}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<!-- 商品名称 -->
<%-- 商品名 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- >${screen.itemNm("storeNum")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.storeNum)}</text> --%>
>${screen.itemNm("storeNum")}:${screen.stripTrailingZeros(ReceiveNoPlanInspectionDto.storeNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<%-- 2017.11.29 [Ver3.0] unit of measure対応 HDIS王 delete--%>

<!-- 入庫No -->
<%-- 汎用No --%>
<c:if test="${ReceiveNoPlanInspectionDto.labelKbn == '2'}">
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("storeLabelNo")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.storeLabelNo)}</text>
</c:if>
<!-- ロケ -->
<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("loc")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.rcvLocNm)}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
