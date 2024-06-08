<%@ include file="../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.base.dbflute.dto.MUserClientDto" %>
<%@ page import="com.oneslogi.ht.wms.dto.HandyLoginUserInfo" %>
<select mode="1"
        size="2"
        starty="4"
        pagesize="5"
        number="1"
        url=""
        style="1">
<c:forEach var="list" items="${clientDto.userClientDto}" varStatus="sts">
<option number="${sts.index}" x="3" url="returnClientData?selIndex=${fn:escapeXml(sts.index)}">${fn:escapeXml(list.MClient.clientCd)}</option>
</c:forEach>
</select>
<text mode="1"
      size="2"
      x="1"
      y="19">${screen.itemNm("selectText")}</text>
<%@ include file="../base/HTBaseFooter.jsp" %>
