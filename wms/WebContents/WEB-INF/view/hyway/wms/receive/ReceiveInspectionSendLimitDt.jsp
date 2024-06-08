<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 期限日確認 -->
<%-- 期限日確認画面 --%>

<%-- 期限日が過ぎています --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("msg1")}</text>

<%-- 登録しますか？ --%>
<text mode="1"
      size="2"
      x="4"
      y="10"
      >${screen.itemNm("msg2")}</text>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<!-- 商品名称テスト -->
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(ReceiveInspectionDto.limitDt)}</text>
<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ReceiveInspectionDto.storeNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>

<%@ include file="../../base/HTBaseFooter.jsp" %>
