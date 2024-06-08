<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.stock.LocationMoveDto" %>
<c:set var="list" value="${LocationMoveDto.lstTStockDto}"/>
<c:set var="pageIndex" value="${LocationMoveDto.pageIndex}"/>
<c:set var="TStockDto" value="${LocationMoveDto.lstTStockDto[pageIndex]}"/>
<c:set var="pageNow" value="${LocationMoveDto.pageIndex + 1}"/>
<c:set var="pageAll" value="${fn:length(list)}"/>
<c:set var="limitDt" value="${''}"/>
<c:if test="${fn:length(TStockDto.TLot.limitDt) == 8}">
	<c:set var="limitDt" value="${TStockDto.TLot.limitDt}"/>
	<c:set var="limitDt" value="${fn:substring(limitDt, 0, 4)}/${fn:substring(limitDt, 4, 6)}/${fn:substring(limitDt, 6, 8)}"/>
</c:if>
<%-- ロケ変更(一覧)画面 --%>
<%-- ｿｰｽCD --%>
<text mode="1"
      size="2"
      x="1"
      y="4"
      >${screen.itemNm("janCd")}:${fn:escapeXml(TStockDto.MProduct.janCd)}</text>
<%-- 商品 --%>
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("product")}:${fn:escapeXml(TStockDto.MProduct.productCd)}</text>
<text mode="1"
      size="2"
      x="1"
      y="10"
      >${fn:escapeXml(TStockDto.MProduct.productNm)}</text>
<%-- 預託 --%>
<text mode="1"
      size="2"
      x="1"
      y="13"
      >${screen.itemNm("deposit")}:${fn:escapeXml(TStockDto.MCustomer.customerNm)}</text>
<%-- 在区 --%>
<text mode="1"
      size="2"
      x="1"
      y="16"
      >${screen.itemNm("stockType")}:${fn:escapeXml(TStockDto.MStockType.VDict.dictNm)}</text>
<%-- ロット --%>
<text mode="1"
      size="2"
      x="1"
      y="19"
      >${screen.itemNm("lot")}:${fn:escapeXml(TStockDto.TLot.lot)}</text>
<%-- 期限日 --%>
<text mode="1"
      size="2"
      x="1"
      y="22"
      >${screen.itemNm("limitDt")}:${fn:escapeXml(limitDt)}</text>
<%-- ロケ --%>
<text mode="1"
      size="2"
      x="1"
      y="25"
      >${screen.itemNm("locationCd")}:${fn:escapeXml(TStockDto.MLocation.locationNm)}</text>

<%-- 移動数 --%>
<text mode="1"
      size="2"
      x="1"
      y="28"
      <%-- [#3603][Ver3.0] [HT]ロケ変更(一覧) - 小数点含まない商品の移動数小数表示不正 2018.02.07 honma Mod Start --%>
      >${screen.itemNm("chargeNum")}:${screen.stripTrailingZeros(TStockDto.chargeNum)}</text>
      <%-- [#3603][Ver3.0] [HT]ロケ変更(一覧) - 小数点含まない商品の移動数小数表示不正 2018.02.07 honma Mod End --%>
<text mode="1"
      size="2"
      x="23"
      y="28"
      >${pageNow}/${pageAll}</text>

<%@ include file="../../base/HTBaseFooter.jsp" %>
