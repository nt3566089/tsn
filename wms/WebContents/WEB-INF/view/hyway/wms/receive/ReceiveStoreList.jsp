<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>

<c:set var="list" value="${ReceiveStoreDto.lstWHtReceiveStoreDto}"/>
<c:set var="pageIndex" value="${ReceiveStoreDto.pageIndex}"/>
<c:set var="wHtReceiveStoreDto" value="${ReceiveStoreDto.lstWHtReceiveStoreDto[pageIndex]}"/>
<c:set var="pageNow" value="${ReceiveStoreDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''} "/>
<c:if test="${fn:length(wHtReceiveStoreDto.limitDt) == 8}">
	<c:set var="limitDt" value="${wHtReceiveStoreDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%--入庫格納(一覧) --%>
<%--ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(wHtReceiveStoreDto.MProduct.janCd)}</text>
<%--商品--%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(wHtReceiveStoreDto.MProduct.productCd)}</text>

<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(wHtReceiveStoreDto.MProduct.productNm)}</text>
<%--在区--%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("stkClsNm")}:${fn:escapeXml(wHtReceiveStoreDto.stkClsNm)}</text>
<%--ロット--%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(wHtReceiveStoreDto.lot)}</text>
<%--期限日--%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Del--%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<%--入荷数--%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(wHtReceiveStoreDto.planNum)}</text>
<%--格納数--%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("storeNum")}:${screen.stripTrailingZeros(wHtReceiveStoreDto.storeNum)}</text>
<%--残数--%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("remnantNum")}:${screen.stripTrailingZeros(wHtReceiveStoreDto.remnantNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%--戻る--%>
<text mode="1"
      size="2"
      x="23"
      y="31"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>