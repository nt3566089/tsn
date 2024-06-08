<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveStoreDto" %>
<%--入庫格納(詳細) --%>
<%--ｿｰｽCD --%>
<text mode="1"
      size="1"
      x="1"
      y="4"
      adjusty="0"
      >${screen.itemNm("janCd")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.janCd)}</text>
<%--商品 --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      adjusty="0"
      >${screen.itemNm("productCd")}:${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.productCd)}</text>

<text mode="1"
      size="1"
      x="1"
      y="10"
      adjusty="0"
      >${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.productNm)}</text>
<%--期限日 --%>
<text mode="1"
      size="1"
      x="1"
      y="16"
      adjusty="0"
      >${screen.itemNm("limitDt")}:</text>

<input mode="1"
       size="1"
       x="1"
       y="19"
       adjusty="0"
       ${screen.inputDateAttr("limitDt", isOcrFlg)}
       width="21"
       param="limitDt" default="${fn:escapeXml(ReceiveStoreDto.wHtReceiveStoreDto.limitDt)}"></input>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>