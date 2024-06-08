<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(終了) -->

<%-- Msg1 --%>
<text mode="1"
      size="2"
      x="7"
      y="7"
>${screen.itemNm("msg1")}</text>

<%-- Msg2 --%>
<text mode="1"
      size="2"
      x="4"
      y="10"
>${screen.itemNm("msg2")}</text>

<!-- 預託 -->
<%-- 預託 --%>
<text mode="1"
      size="2"
      x="2"
      y="16"
>${screen.itemNm("deposit")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.depositNm)}</text>

<!-- 処理区分 -->
<%-- 処理区分 --%>
<text mode="1"
      size="2"
      x="2"
      y="19"
>${screen.itemNm("processType")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.processTypeNm)}</text>

<!-- 在庫区分 -->
<%-- 在庫区分 --%>
<text mode="1"
      size="2"
      x="2"
      y="22"
>${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.stockTypeNm)}</text>

<!-- 仕入先 -->
<%-- 仕入先 --%>
<text mode="1"
      size="2"
      x="2"
      y="25"
>${screen.itemNm("supplier")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.supplierNm)}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
