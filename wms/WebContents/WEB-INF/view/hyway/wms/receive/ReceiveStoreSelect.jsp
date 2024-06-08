<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>

<c:set var="list" value="${ReceiveStoreDto.lstStockTypeId}"/>
<c:set var="pageIndex" value="${ReceiveStoreDto.pageIndex}"/>

<c:set var="pageNow" value="${ReceiveStoreDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}" />
<c:set var="limitDt" value="${''} "/>

<c:if test="${fn:length(ReceiveStoreDto.wHtReceiveStoreDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ReceiveStoreDto.wHtReceiveStoreDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%--入庫格納(選択) --%>
<%--ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.janCd)}</text>
<%--商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.productCd)}</text>

<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.productNm)}</text>
<%--ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.lot)}</text>
 <%--期限日 --%>
 <text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
  <%--在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("stkClsNm")}:${fn:escapeXml(ReceiveStoreDto.lstStockTypeNm[pageIndex])}</text>
<%--預託 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("depositNm")}:${fn:escapeXml(ReceiveStoreDto.lstDepositNm[pageIndex])}</text>
<%--仕入先 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("supplierNm")}:${fn:escapeXml(ReceiveStoreDto.lstSupplierNm[pageIndex])}</text>
<%--page --%>
<text mode="1"
      size="2"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>