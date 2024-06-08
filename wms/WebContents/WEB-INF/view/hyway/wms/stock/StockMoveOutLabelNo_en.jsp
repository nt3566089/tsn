<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveOutDto" %>
<%-- 移動出庫(入庫No) --%>

<%-- 出庫ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("loc")}:</text>

<%-- ロケ名 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${fn:escapeXml(StockMoveOutDto.TStockDto.MLocation.locationNm)}</text>

<%-- 入庫No --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("labelNo")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="13"
       adjusty="0"
       width="24"
       ${screen.inputTextAttr("labelNo")}
       param="labelNo" default="${fn:escapeXml(StockMoveOutDto.storeLabelNo)}"></input>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
