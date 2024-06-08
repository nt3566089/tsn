<%@ include file="../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.HandyInputAuxiliaryDto" %>
<%-- 入力補助画面 --%>

<%-- 商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(HandyInputAuxiliaryDto.MProductDto.productCd)}</text>
<!-- [Ver3.0][#3762] リストのサイズが4未満の場合は商品名称を出力するよう変更 2018.02.16 shimizu Start -->
<c:if test="${HandyInputAuxiliaryDto.inputAuxiliaryProductShapeDtoList.size() < 4}">
	<text mode="1"
	      size="1"
	      x="1"
	      y="7"
	      adjusty="0"
	      >${fn:escapeXml(HandyInputAuxiliaryDto.MProductDto.productNm)}</text>
</c:if>
<!-- [Ver3.0][#3762] リストのサイズが4未満の場合は商品名称を出力するよう変更 2018.02.16 shimizu End -->


<%-- 商品荷姿 --%>
<c:forEach var="list" items="${HandyInputAuxiliaryDto.inputAuxiliaryProductShapeDtoList}" varStatus="sts">
<!-- [Ver3.0][#3762] ：を全角から半角に修正 2018.02.27 shimizu Start -->
<text mode="1"
      size="1"
      x="1"
      y="${list.positionTextY}"
      >${fn:escapeXml(list.shapeInputItemNm)}:</text>
<!-- [Ver3.0][#3762] ：を全角から半角に修正 2018.02.27 shimizu End -->
<input mode="1"
       size="1"
       x="1"
       y="${list.positionInputY}"
       adjusty="2"
       width="25"
       ${screen.inputNumberAttr("productShape")}
       param="${list.queryParamNm}"
       default="${fn:escapeXml(list.productShapeInputQty)}"></input>
</c:forEach>

<%@ include file="../base/HTBaseFooter_en.jsp" %>
