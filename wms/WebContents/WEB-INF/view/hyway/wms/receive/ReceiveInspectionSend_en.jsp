<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 入荷検品確認 -->
<%-- 入荷検品確認画面 --%>

<%-- 入荷検品完了 --%>
<text mode="1"
      size="1"
      x="5"
      y="4"
      >${screen.itemNm("msg1")}</text>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="14"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<!-- 商品名称 -->
<text mode="1"
      size="1"
      x="1"
      y="17"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="1"
      x="1"
      y="20"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
      >${screen.itemNm("storeNum")}:${screen.stripTrailingZeros(ReceiveInspectionDto.storeNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>
<!-- 入庫No -->
<%-- 汎用No --%>
<c:if test="${ReceiveInspectionDto.labelKbn == '2'}">
<text mode="1"
      size="1"
      x="1"
      y="23"
      adjusty="0"
      >${screen.itemNm("storeLabelNo")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planStoreLabelNo)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
</c:if>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
