<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.LocationMoveDto" %>
<%-- ロケ変更画面 --%>
<%-- 入庫ロケ --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("locationCd")}:</text>
<input mode="1"
       size="1"
       x="1"
       y="8"
       ${screen.inputTextAttr("locationCd")}
       width="24"
       param="locationCd" default="${fn:escapeXml(LocationMoveDto.locationCd)}"></input>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>