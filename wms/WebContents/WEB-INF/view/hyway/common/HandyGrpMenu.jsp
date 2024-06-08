<%@ include file="../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:forEach var="list" items="${lstHandyGrpMenuDto}" varStatus="sts">
<button func="1"  position="1" key="${sts.index+1}" x="2" y="${6+sts.index*4}" size="2" url="${list.url}" bgcolor="#f5f5f5" width="35">${fn:escapeXml(sts.index+1)}.${fn:escapeXml(list.menuNm)}ﾒﾆｭｰ</button>
</c:forEach>,


<%@ include file="../base/HTBaseFooter.jsp" %>
