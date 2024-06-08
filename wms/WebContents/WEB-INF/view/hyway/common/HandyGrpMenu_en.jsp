<%@ include file="../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:forEach var="list" items="${lstHandyGrpMenuDto}" varStatus="sts">
<button func="1" key="${sts.index+1}" x="2" y="${4+sts.index*4}" size="1" url="${list.url}" width="28">${fn:escapeXml(sts.index+1)}:${fn:escapeXml(list.menuNm)}</button>
</c:forEach>
<%@ include file="../base/HTBaseFooter_en.jsp" %>
