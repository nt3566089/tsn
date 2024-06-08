<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>
<c:set var="list" value="${ReceiveInspectionDto.lstTReceivePlanBDto}"/>
<c:set var="pageIndex" value="${ReceiveInspectionDto.pageIndex}"/>
<c:set var="TReceivePlanBDto" value="${ReceiveInspectionDto.lstTReceivePlanBDto[pageIndex]}"/>
<c:set var="pageNow" value="${ReceiveInspectionDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>

<!-- 入荷検品(詳細)センタ間移動ロット・期限日選択 -->

<!-- JAN -->
<%-- 入荷検品(詳細)画面 --%>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- ロット -->
<%-- ロット --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      param="lot" default="${fn:escapeXml(TReceivePlanBDto.planLot)}"
      >${screen.itemNm("lot")}:${fn:escapeXml(TReceivePlanBDto.planLot)}</text>

<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(TReceivePlanBDto.planLimitDt)}</text>
<!-- 予定数 -->
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<%-- 予数 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(TReceivePlanBDto.planNum)}</text>
<!-- 検品済数 -->
<%-- 済数 --%>
<text mode="1"
      size="1"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(TReceivePlanBDto.sumStoreNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
<%-- Page --%>
<text mode="1"
      size="1"
      x="23"
      y="25"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
