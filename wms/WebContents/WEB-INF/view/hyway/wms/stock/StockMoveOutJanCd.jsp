<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.StockMoveOutDto" %>
<%-- 移動出庫(ｿｰｽCD) --%>

<%-- 出庫ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("loc")}:</text>

<%-- ロケ名 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${fn:escapeXml(StockMoveOutDto.TStockDto.MLocation.locationNm)}</text>

<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="13"
       adjusty="0"
       width="24"
       ${screen.inputTextAttr("janCd")}
       param="janCd" default="${fn:escapeXml(StockMoveOutDto.janCdProd)}"></input>

<%@ include file="../../base/HTBaseFooter.jsp" %>
