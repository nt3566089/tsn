<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.operation.AttendanceEntryHtDto" %>

<!-- 勤怠入力(結果) -->

<!-- [出勤/退勤/休憩開始/休憩終了]しました。 -->
<text mode="1"
      size="1"
      x="1"
      y="4"
      >${fn:escapeXml(AttendanceEntryHtDto.getSelectBtnTxt())}${screen.itemNm("msg1")}</text>
<!-- 日付…yyyy/MM/dd -->
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("msg2")}${fn:escapeXml(AttendanceEntryHtDto.getTextDate())}</text>
<!-- 時刻…HH:mm -->
<text mode="1"
      size="1"
      x="1"
      y="10"
      >${screen.itemNm("msg3")}${fn:escapeXml(AttendanceEntryHtDto.getTextTime())}</text>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
