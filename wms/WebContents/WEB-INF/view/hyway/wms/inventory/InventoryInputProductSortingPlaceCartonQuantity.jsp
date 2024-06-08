<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.inventory.InventoryInputProductSortingPlaceDto" %>
<%--在庫調査入力[仕分場] --%>
<%--◆先頭ｹｰｽ数量入力 --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("title")}
      </text>

<%--棚卸区分 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("inspectionCategory")}:${fn:escapeXml(InventoryInputProductSortingPlaceDto.stockInspectionCategoryName)}
      </text>

<%--銘柄CD --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      >${screen.itemNm("productCd")}:${fn:escapeXml(InventoryInputProductSortingPlaceDto.outputProductCd6)}
      </text>

<%--銘柄名称 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("productName")}:
      </text>
<text mode="1"
      size="2"
      x="1"
      y="16"
      > ${fn:escapeXml(InventoryInputProductSortingPlaceDto.outputProductName)}
      </text>

<%--調査ﾛｹｰｼｮﾝ --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${screen.itemNm("locationCd")}:
      </text>
<text mode="1"
      size="2"
      x="1"
      y="22"
      > ${fn:escapeXml(InventoryInputProductSortingPlaceDto.inputLocationCd)}
      </text>

<%--ｶｰﾄﾝ --%>
<text mode="1"
      size="2"
      x="18"
      y="25"
      >${screen.itemNm("cartonQty")}
      </text>

<%--先頭ｹｰｽ --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      >${screen.itemNm("caseQty")}
      </text>
<input mode="1"
       size="2"
       x="18"
       y="28"
       char="1"
       len="4"
       width="7"
       param="cartonQty"
       default="${fn:escapeXml(InventoryInputProductSortingPlaceDto.inputHeadCaseCartonQty)}"
       >${screen.inputTextAttr("cartonQty")}
       </input>

<%-- <%@ include file="../../base/HTBaseFooter.jsp" %> --%>
<c:choose>
<c:when test="${!empty footer.optionButton1}">
<button type="${footer.optionButton1.type}"
        key="${footer.optionButton1.key}"
        x="1"
        y="49"
        size="2"
        url="${footer.optionButton1.url}"
        width="15">${fn:escapeXml(footer.optionButton1.value)}</button>
</c:when>
</c:choose>
<c:choose>
<c:when test="${!empty footer.optionButton2}">
<button type="${footer.optionButton2.type}"
        key="${footer.optionButton2.key}"
        x="16"
        y="49"
        size="2"
        url="${footer.optionButton2.url}"
        width="15">${fn:escapeXml(footer.optionButton2.value)}</button>
</c:when>
</c:choose>
<c:choose>
<c:when test="${!empty footer.hideButton}">
<button type="${footer.hideButton.type}"
<c:if test="${!empty footer.hideButton.key}">
        key="${footer.hideButton.key}"
</c:if>
        x="1"
        y="5"
        size="2"
        visible="1"
        func="${footer.hideButton.func}"
        url="${footer.hideButton.url}"
        width="14"></button>
</c:when>
</c:choose>
<c:choose>
<c:when test="${!empty footer.leftButton}">
<button type="${footer.leftButton.type}"
        key="${footer.leftButton.key}"
        x="1"
        y="52"
        size="2"
        bgcolor="#f5f5f5"
        url="${footer.leftButton.url}"
        width="15">${fn:escapeXml(footer.leftButton.value)}</button>
</c:when>
</c:choose>
<c:choose>
<c:when test="${fn:length(footer.rightButton) < 1}">
</c:when>
<c:when test="${fn:length(footer.rightButton) > 1}">
<c:forEach var="list" items="${footer.rightButton}" varStatus="sts">
<button type="${list.type}"
        key="${list.key}"
        x="${sts.index * 8 + 16}"
        y="35"
        width="8"
        size="2"
        url="${list.url}">${fn:escapeXml(list.value)}</button>
</c:forEach>
</c:when>
<c:otherwise>
<c:forEach var="list" items="${footer.rightButton}" varStatus="sts">

<%-- ENT: , ESC: など キーが3文字以上ならwitdhを16にする (左にボタンがない時) --%>
<c:set var="width16Flg" value="${fn:length(fn:split(list.value,':')) > 1 and fn:length((fn:split(list.value,':')[0])) > 2 and empty footer.leftButton}"/>

<button type="${list.type}"
        key="${list.key}"
<c:if test="${width16Flg}">
        x="15"
</c:if>
<c:if test="${!width16Flg}" >
        x="16"
</c:if>
        y="52"
        size="2"
        url="${list.url}"
<c:if test="${width16Flg}">
        width="16"
</c:if>
<c:if test="${!width16Flg}" >
        width="15"
</c:if>
        >${fn:escapeXml(list.value)}</button>
</c:forEach>
</c:otherwise>
</c:choose>

<%-- 2015/05/20 INOUE UPDATE HINT対応 --%>
<c:forEach var="tagHint" items="${viewTemplate.tagHintList}" varStatus="sts">
<hint name="${tagHint.name}"
      method="${tagHint.method}"
      time="${tagHint.time}"
      delay="${tagHint.delay}"
      count="${tagHint.count}"></hint>
</c:forEach>
</xml>
