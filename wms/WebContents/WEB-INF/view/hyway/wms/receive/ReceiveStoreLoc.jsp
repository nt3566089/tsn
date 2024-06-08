<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>
<c:set var="limitDt" value="${''} "/>
<c:if test="${fn:length(ReceiveStoreDto.wHtReceiveStoreDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ReceiveStoreDto.wHtReceiveStoreDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%--入庫格納(ロケ) --%>
<%--ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
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
<%--在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("stkClsNm")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.stkClsNm)}</text>
<%--ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("lot")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.lot)}</text>
<%--期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 Start--%>
<%--入荷数 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
      >${screen.itemNm("planNum")}:${screen.stripTrailingZeros(ReceiveStoreDto.wHtReceiveStoreDto.planNum - ReceiveStoreDto.wHtReceiveStoreDto.numOfStore)}</text>

<%--数量 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("qty")}:${screen.stripTrailingZeros(ReceiveStoreDto.qty)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.27 王 End--%>
<%--ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      adjusty="0"
      >${screen.itemNm("loc")}:</text>

<input mode="1"
       size="2"
       x="9"
       y="28"
       adjusty="0"
       ${screen.inputTextAttr("loc")}
       width="18"
       param="loc" default="${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.locCd)}"></input>
<%@ include file="../../base/HTBaseFooter.jsp" %>