<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>

<!-- 入荷検品格納確認 -->

<%-- 入荷検品格納完了 --%>
<text mode="1"
      size="2"
      x="5"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%-- データを登録 --%>
<text mode="1"
      size="2"
      x="3"
      y="7"
      >${screen.itemNm("msg2")}</text>
<%-- しますか？ --%>
<text mode="1"
      size="2"
      x="7"
      y="10"
     >${screen.itemNm("msg3")}</text>
<!-- 商品 -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productCd)}</text>
<!-- 商品名称 -->
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productNm)}</text>
<!-- 検品数 -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("storeNum")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.storeNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- 入庫No -->
<c:if test="${ReceiveInspecStoreDto.labelKbn == '2'}">
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("storeLabelNo")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.planStoreLabelNo)}</text>
</c:if>
<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      >${screen.itemNm("loc")}:${fn:escapeXml(ReceiveInspecStoreDto.TStoreRecordBDto.MLocation.locationNm)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%@ include file="../../base/HTBaseFooter.jsp" %>
