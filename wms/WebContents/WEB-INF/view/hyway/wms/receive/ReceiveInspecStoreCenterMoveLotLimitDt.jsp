<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>
<c:set var="list" value="${ReceiveInspecStoreDto.lstTReceivePlanBDto}"/>
<c:set var="pageIndex" value="${ReceiveInspecStoreDto.pageIndex}"/>
<c:set var="TReceivePlanBDto" value="${ReceiveInspecStoreDto.lstTReceivePlanBDto[pageIndex]}"/>
<c:set var="pageNow" value="${ReceiveInspecStoreDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>

<!-- 入荷検品(詳細)センタ間移動ロット・期限日選択 -->

<!-- JAN -->
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.janCd)}</text>
<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productCd)}</text>

<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- ロット -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      param="lot" default="${fn:escapeXml(TReceivePlanBDto.planLot)}"
      >${screen.itemNm("lot")}:${fn:escapeXml(TReceivePlanBDto.planLot)}</text>
<!-- 期限日 -->
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(TReceivePlanBDto.planLimitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 Start--%>
<!-- 予定数 -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(TReceivePlanBDto.planNum)}</text>
<!-- 検品済数 -->
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(TReceivePlanBDto.sumStoreNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 End--%>
<text mode="1"
      size="2"
      x="23"
      y="25"
      >${pageNow}/${pageAll}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>
