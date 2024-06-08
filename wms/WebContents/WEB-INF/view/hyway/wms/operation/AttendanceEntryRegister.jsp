<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.operation.AttendanceEntryHtDto" %>

<!-- 勤怠入力 -->

<!-- [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start -->
<%-- 1:出勤 --%>
<button type="1"
        func="2"
        key="1"
        x="1"
        y="5"
        width="28"
        size="2"
        url='AttendanceEntryRegister/attendanceRegister'
        >1:${screen.itemNm("attendance")}</button>
<%-- 2:退勤 --%>
<button type="1"
        func="2"
        key="2"
        x="1"
        y="10"
        width="28"
        size="2"
        url='AttendanceEntryRegister/leaveingRegister'
        >2:${screen.itemNm("leaving")}</button>
<%-- 2:休憩開始 --%>
<button type="1"
        func="2"
        key="3"
        x="1"
        y="15"
        width="28"
        size="2"
        url='AttendanceEntryRegister/startRestRegister'
        >3:${screen.itemNm("startRest")}</button>
<%-- 2:休憩終了 --%>
<button type="1"
        func="2"
        key="4"
        x="1"
        y="20"
        width="28"
        size="2"
        url='AttendanceEntryRegister/endRestRegister'
        >4:${screen.itemNm("endRest")}</button>
<c:if test="${AttendanceEntryHtDto.getTestMode()==1}">
    <input name="inDate"
           x="1"
           y="24"
           width="28"
           size="2"
           param="inDate"
           default="yyyyMMdd"></input>
    <input name="inTime"
           x="1"
           y="28"
           width="28"
           size="2"
           param="inTime"
           default="hhmm"></input>
</c:if>
<!-- [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End -->

<%@ include file="../../base/HTBaseFooter.jsp" %>
