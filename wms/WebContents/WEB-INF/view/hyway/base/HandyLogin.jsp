<%@ include file="../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.base.dto.HandyLoginDto" %>

<%-- ログイン画面 --%>

<%-- ユーザCD --%>
<text mode="1"
      size="2"
      x="1"
      y="5">${screen.itemNm("userCd")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="8"
       adjusty="0"
       width="22"
       ${screen.inputTextAttr("userCd")}
       param="user"
       type="1"></input>

<%-- パスワード --%>
<c:if test="${NEED_PASSWORD_INPUT}">
<text mode="1"
      size="2"
      x="1"
      y="12"
      adjusty="0">${screen.itemNm("password")}:</text>
<input mode="1"
       size="2"
       x="1"
       y="15"
       adjusty="0"
       width="22"
       ${screen.inputTextAttr("password")}
       param="pass"
       type="2"></input>
</c:if>

<%@ include file="../base/HTBaseFooter.jsp" %>
