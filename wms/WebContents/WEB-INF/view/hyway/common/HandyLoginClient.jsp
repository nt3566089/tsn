<%@ include file="../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- ログイン荷主確認画面 --%>

<%-- ユーザCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4">${screen.itemNm("userCd")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="7"
      adjusty="0">${fn:escapeXml(loginUserCd)}</text>

<%-- ユーザ名 --%>
<text mode="1"
      size="2"
      x="1"
      y="11"
      adjusty="0">${screen.itemNm("userNm")}:</text>
<text mode="1"
      size="2"
      x="1"
      y="14"
      adjusty="0">${fn:escapeXml(loginInfo.userNm)}</text>

<%-- 荷主 --%>
<text mode="1"
      size="2"
      x="1"
      y="18"
<%-- [Ver3.0][#3998]項目名変更に伴い修正 2018.04.10 miyabe upd Start --%>
      adjusty="0">${screen.itemNm("clientCd")}:</text>
<%-- [Ver3.0][#3998]項目名変更に伴い修正 2018.04.10 miyabe upd End --%>
<text mode="1"
      size="2"
      x="1"
      y="21"
      adjusty="0">${fn:escapeXml(loginInfo.clientCd)}</text>
<%@ include file="../base/HTBaseFooter.jsp" %>
