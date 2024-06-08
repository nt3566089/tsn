<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveNoPlanInspectionDto" %>
<c:set var="limitDt" value="${''} "/>
<c:if test="${fn:length(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.limitDt) == 8}">
	<c:set var="limitDt" value="${ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>

<!-- 予定無し入荷(ロケ入力) -->

<!-- JAN -->
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      adjusty="0"
>${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.janCd)}</text>

<!-- 商品 -->
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0"
>${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productCd)}</text>

<%-- 商品名 --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
>${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.productNm)}</text>

<!-- 在区 -->
<%-- 在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      adjusty="0"
>${screen.itemNm("stkClsNm")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.stockTypeNm)}</text>

<!-- ロット -->
<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      adjusty="0"
>${screen.itemNm("lot")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.lot)}</text>

<!-- 期限日 -->
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      adjusty="0"
>${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>

<!-- 検品数 -->
<%-- 検品数 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      adjusty="0"
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 Start--%>
<%-- >${screen.itemNm("qty")}:${fn:escapeXml(ReceiveNoPlanInspectionDto.storeNum)}</text> --%>
>${screen.itemNm("qty")}:${screen.stripTrailingZeros(ReceiveNoPlanInspectionDto.storeNum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.29 HDIS王 End--%>

<!-- ロケ -->
<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
>${screen.itemNm("loc")}:</text>
<input mode="1"
       size="2"
       x="9"
       y="25"
       adjusty="0"
       ${screen.inputTextAttr("loc")}
       width="18"
       param="loc" default="${fn:escapeXml(ReceiveNoPlanInspectionDto.wHtReceiveNoPlanInspDto.rcvLocCd)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>