<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>
<c:set var="limitDt" value="${''} "/>
<c:if test="${fn:length(ReceiveInspecStoreDto.TReceivePlanBDto.planLimitDt) == 8}">
	<c:set var="limitDt" value="${ReceiveInspecStoreDto.TReceivePlanBDto.planLimitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<!-- 入庫検品格納(ロケ入力) -->
<!-- JAN -->
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.MProduct.janCd)}</text>

 <!--商品 -->
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

<!-- 在区 -->
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("stockType")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.TReceivePlanH.MStockType.VDict.dictNm)}</text>
<!-- ロット -->
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.planLot)}</text>

<!-- 期限日 -->
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- 数量 -->
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.storeNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<!-- ロケ -->
<text mode="1"
      size="2"
      x="1"
      y="25"
      >${screen.itemNm("loc")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="28"
       ${screen.inputTextAttr("loc")}
       width="26"
       param="loc" default="${fn:escapeXml(ReceiveInspecStoreDto.loc)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>