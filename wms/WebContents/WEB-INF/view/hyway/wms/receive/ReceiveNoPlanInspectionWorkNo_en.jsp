<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 完了確認(伝票No) -->

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

<!-- 伝票No -->
<%-- 伝票No --%>
<text mode="1"
      size="1"
      x="2"
      y="16"
      adjusty="0"
>${screen.itemNm("workNo")}:</text>

<%-- 伝票No値 --%>
<text mode="1"
      size="1"
      x="2"
      y="19"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.htWorkNo)}</text>

<!-- 総検品数 -->
<%-- 総検品数 --%>
<text mode="1"
      size="1"
      x="2"
      y="22"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- >${screen.itemNm("planNum2")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.storeNumSum)}</text> --%>
>${screen.itemNm("planNum2")}:${screen.stripTrailingZeros(ReceiveNoPlanInspectionDto.storeNumSum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
