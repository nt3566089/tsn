<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.system.PrinterSelectDto" %>
<%-- プリンタ選択(終了) --%>
<%-- メッセージ --%>
<text mode="1"
      size="2"
      x="6"
      y="4"
      >${screen.itemNm("msg1")}</text>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("msg2")}</text>
<%@ include file="../../base/HTBaseFooter.jsp" %>