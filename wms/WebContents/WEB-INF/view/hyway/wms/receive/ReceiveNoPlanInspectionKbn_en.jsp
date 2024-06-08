<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>

<!-- 予定無し入荷(区分) -->

<!-- 預託 -->
<%-- 預託 --%>
<text mode="1"
      size="1"
      x="1"
      y="5"
>${screen.itemNm("deposit")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.depositNm)}</text>

<!-- 処理区分 -->
<%-- 処理区分 --%>
<text mode="1"
      size="1"
      x="1"
      y="9"
>${screen.itemNm("processType")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.processTypeNm)}</text>

<!-- 在庫区分 -->
<%-- 在庫区分 --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
>${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.stockTypeNm )}</text>

<%-- 1:預託 --%>
<button type="1"
        key="1"
        x="1"
        y="26"
        width="13"
        size="21"
        url="ReceiveNoPlanInspectionKbn/deposit"
        >1:${screen.itemNm("left3")}</button>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
