<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>
<fmt:setLocale value="en_US"/>
<!-- [1.1.4-CT-025] 画面表示で致命的エラー発生 2016.05.16 kawana Start -->
<%-- <fmt:parseNumber value="${ReceiveInspecStoreDto.TReceivePlanBDto.planNum div ReceiveInspecStoreDto.TReceivePlanBDto.unitNum}" var="planCaseQty" integerOnly="true"/>
<fmt:parseNumber value="${ReceiveInspecStoreDto.TReceivePlanBDto.planNum mod ReceiveInspecStoreDto.TReceivePlanBDto.unitNum}" var="planBaraQty" integerOnly="true"/>
--%>
<%--[Ver3.0] unit of measure対応 2017.12.07 王 Del--%>
<!-- 検品数確認 -->
<%-- 予定数を超えています --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%-- が登録しますか？ --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("msg2")}</text>
<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productCd)}</text>
<!-- 商品名称テスト -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 予定数 -->
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.TReceivePlanBDto.planNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- 検品数 -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.storeNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>

<%@ include file="../../base/HTBaseFooter.jsp" %>
