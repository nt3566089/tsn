<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.LocationMoveDto" %>
<c:set var="list" value="${LocationMoveDto.lstTStockDto}"/>
<c:set var="pageIndex" value="${LocationMoveDto.pageIndex}"/>
<c:set var="TStockDto" value="${LocationMoveDto.lstTStockDto[pageIndex]}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<%-- ロケ変更(確認))画面 --%>
<%-- メッセージ --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("msg1")}</text>
<text mode="1"
      size="2"
      x="2"
      y="7"
      >${screen.itemNm("msg2")}</text>
<%-- 出庫ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("outLoc")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="16"
	  >${fn:escapeXml(LocationMoveDto.TStockDto.MLocation.locationNm)}</text>
 <%-- 入庫ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${screen.itemNm("inLoc")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="22"
      >${fn:escapeXml(LocationMoveDto.locationNm)}</text>
 <%-- 商品数 --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      adjusty="0"
      >${screen.itemNm("productNum")}:${pageAll}</text>


<%@ include file="../../base/HTBaseFooter.jsp" %>