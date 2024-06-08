<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>
<fmt:setLocale value="en_US"/>
<%--[Ver3.0] unit of measure対応 2017.11.23 王 Del--%>

<!-- 完了確認(商品) -->
<%-- 完了確認(商品)画面 --%>

<%-- 差異がありますが --%>
<c:if test="${ReceiveInspectionDto.differentFlg != '0'}">
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("diffMsg1")}</text>
<%-- 検品を完了しますか？ --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("diffMsg2")}</text>
</c:if>

<%--  --%>
<c:if test="${ReceiveInspectionDto.differentFlg == '0'}">
<text mode="1"
      size="1"
      x="1"
      y="4"
      />
<%-- 検品を完了しますか？ --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("sameMsg2")}</text>
</c:if>
<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productCd)}</text>
<!-- 商品名称テスト -->
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.MProduct.productNm)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<!-- 予定数 -->
<%-- 予数 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(ReceiveInspectionDto.TReceivePlanBDto.planNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>
<!-- 検品数 -->
<%-- 検数 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ReceiveInspectionDto.storeNumSum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Del--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>