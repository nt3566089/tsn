<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>
<fmt:setLocale value="en_US"/>
<!-- [ON推-UK114-006] 入数0でアベンドしてしまう不具合対応 2016/02/18 SJA [S] -->
<%--
<fmt:parseNumber value="${ReceiveInspecStoreDto.TReceivePlanBDto.planNum div ReceiveInspecStoreDto.TReceivePlanBDto.maxUnitNum}" var="planCaseQty" integerOnly="true"/>
<fmt:parseNumber value="${ReceiveInspecStoreDto.TReceivePlanBDto.planNum mod ReceiveInspecStoreDto.TReceivePlanBDto.maxUnitNum}" var="planBaraQty" integerOnly="true"/>
<fmt:parseNumber value="${ReceiveInspecStoreDto.storeNumSum div ReceiveInspecStoreDto.TReceivePlanBDto.maxUnitNum}" var="caseQty" integerOnly="true"/>
<fmt:parseNumber value="${ReceiveInspecStoreDto.storeNumSum mod ReceiveInspecStoreDto.TReceivePlanBDto.maxUnitNum}" var="baraQty" integerOnly="true"/>
 --%>
 <%--[Ver3.0] unit of measure対応 2017.11.28 王 Del--%>
<!-- [ON推-UK114-006] 入数0でアベンドしてしまう不具合対応 2016/02/18 SJA [E] -->
<!-- 完了確認(商品) -->

<c:if test="${ReceiveInspecStoreDto.differentFlg != '0'}">
<%-- 差異がありますが --%>
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
<c:if test="${ReceiveInspecStoreDto.differentFlg == '0'}">
<%-- 入荷検品格納を --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("sameMsg1")}</text>
</c:if>
<!-- 商品 -->
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productCd)}</text>
<!-- 商品名称テスト -->
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.productNm)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- 予定数 -->
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.TReceivePlanBDto.planNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<!-- 検品数 -->
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("spgQtyOns")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.storeNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
