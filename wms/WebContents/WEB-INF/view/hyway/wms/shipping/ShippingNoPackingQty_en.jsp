<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.shipping.ShippingNoPackingDto" %>
<c:set var="pieceNo" value="${ShippingNoPackingDto.wHtShippingDto.pieceNo > 0 ? ShippingNoPackingDto.wHtShippingDto.pieceNo : ''}"/>
<c:set var="isPackingNo" value="${ShippingNoPackingDto.isPackingNo }"/>
<%--バラ出荷検品(数量)  --%>
<%--出庫作業No--%>
<c:if test="${isPackingNo==false }">
   <text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("workNo")}:</text>
</c:if>
<%--出荷梱包No  --%>
<c:if test="${isPackingNo==true }">
   <text mode="1"
      size="1"
      x="1"
      y="4"
      >${screen.itemNm("shippingPackingNo")}:</text>
</c:if>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.pickingWorkNo)}</text>
<%--ｿｰｽCD  --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.MProduct.janCd)}</text>
<%--商品  --%>
<text mode="1"
      size="1"
      x="1"
      y="13"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.MProduct.productCd)}</text>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${fn:escapeXml(ShippingNoPackingDto.wHtShippingDto.MProduct.productNm)}</text>
<%--検品数 --%>
<text mode="1"
      size="1"
      x="1"
      y="19"
      adjusty="2"
      >${screen.itemNm("spgQtyOns")}:</text>
<input mode="1"
       size="1"
       x="11"
       y="19"
       adjusty="0"
       ${screen.inputNumberAttr("spgQtyOns")}
       width="13"
       param="qty" default="${screen.stripTrailingZeros(ShippingNoPackingDto.qty)}"></input>
<%--[Ver3.0] unit of measure対応 2017.11.28 王 Start --%>
<button type="1"
        key=""
        x="22"
        y="23"
        adjusty="0"
        width="5"
        size="21"
        func="2"
        url="inputQty"
        >${screen.itemNm("inputAuxiliary")}</button>
<%--検品残数--%>
<text mode="1"
      size="1"
      x="1"
      y="23"
      adjusty="0"
      >${screen.itemNm("spgQtyRemain")}:${screen.stripTrailingZeros(ShippingNoPackingDto.wHtShippingDto.spgQtyRemain)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.28 王 End --%>
<%--合計個口数  --%>
<c:if test="${pieceNo -1  == 0 }" >
<text mode="1"
      size="1"
      x="1"
      y="26"
      >${screen.itemNm("pieceDenoRecode")}:</text>
</c:if>
<c:if test="${pieceNo - 1 != 0 }" >
<text mode="1"
      size="1"
      x="1"
      y="26"
      >${screen.itemNm("pieceDenoRecode")}:${fn:escapeXml(pieceNo - 1)}</text>
</c:if>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
