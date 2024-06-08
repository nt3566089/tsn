<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveOutDto" %>
<%-- 移動出庫（ロケ） --%>

<%-- 出庫ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("loc")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="8"
       width="24"
       ${screen.inputTextAttr("loc")}
       param="locationCd" default="${fn:escapeXml(StockMoveOutDto.TStockDto.MLocation.locationCd)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
