<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>

<!-- 入荷検品格納(ラベル選択)-->

<%-- 1:入庫ラベル使用 --%>
<button type="1"
        key="1"
        x="1"
        y="5"
        width="28"
        size="2"
        url="ReceiveInspecStoreLabel/select?labelKbn=1"
        >1:${screen.itemNm("button1")}</button>
<%-- 2:汎用ラベル使用 --%>
<button type="1"
        key="2"
        x="1"
        y="10"
        width="28"
        size="2"
        url="ReceiveInspecStoreLabel/select?labelKbn=2"
        >2:${screen.itemNm("button2")}</button>

<%@ include file="../../base/HTBaseFooter.jsp" %>
