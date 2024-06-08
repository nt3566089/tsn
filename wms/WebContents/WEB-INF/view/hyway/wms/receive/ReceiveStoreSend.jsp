<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>
<c:set var="limitDt" value="${''} "/>
<c:if test="${fn:length(ReceiveStoreDto.wHtReceiveStoreDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ReceiveStoreDto.wHtReceiveStoreDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%--入庫格納確認 --%>
<%--入庫格納完了 --%>
<text mode="1"
      size="2"
      x="7"
      y="4"
      >${screen.itemNm("msg1")}</text>
<%--データを登録 --%>
<text mode="1"
      size="2"
      x="7"
      y="7"
      >${screen.itemNm("msg2")}</text>
<%--しますか？ --%>
<text mode="1"
      size="2"
      x="7"
      y="10"
      >${screen.itemNm("msg3")}</text>
<%--商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.productCd)}</text>

<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.productNm)}</text>
<%--在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("stkClsNm")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.stkClsNm)}</text>
<%--ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.lot)}</text>
<%--期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--数量 --%>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(ReceiveStoreDto.wHtReceiveStoreDto.storeNum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%--ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="31"
      >${screen.itemNm("loc")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.locNm)}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>