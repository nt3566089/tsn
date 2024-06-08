<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.operation.AttendanceEntryHtDto" %>

<!-- 勤怠入力(確認) -->

<%-- [出勤/退勤/休憩開始/休憩終了]します。 --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${fn:escapeXml(AttendanceEntryHtDto.getSelectBtnTxt())}${screen.itemNm("msg1")}</text>
<%-- よろしいですか？ --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("msg2")}</text>


<%@ include file="../../base/HTBaseFooter.jsp" %>
