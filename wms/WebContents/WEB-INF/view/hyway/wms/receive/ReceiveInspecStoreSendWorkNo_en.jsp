<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspecStoreDto" %>

<!-- 完了確認(伝票No) -->

<c:if test="${ReceiveInspecStoreDto.differentFlg != '0'}">
<%-- 差異がありますが --%>
<text mode="1"
      size="1"
      x="2"
      y="7"
      >${screen.itemNm("diffMsg1")}</text>
<%-- 検品を完了しますか？ --%>
<text mode="1"
      size="1"
      x="1"
      y="10"
      >${screen.itemNm("diffMsg2")}</text>
</c:if>
<c:if test="${ReceiveInspecStoreDto.differentFlg == '0'}">
<%-- 入荷検品格納を --%>
<text mode="1"
      size="1"
      x="1"
      y="7"
      >${screen.itemNm("sameMsg1")}</text>
</c:if>
<!-- 伝票No -->
<text mode="1"
      size="1"
      x="2"
      y="16"
      adjusty="0"
      >${screen.itemNm("workNo")}:</text>
<text mode="1"
      size="1"
      x="2"
      y="19"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspecStoreDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.28 王 Start--%>
<!-- 総予定数 -->
<text mode="1"
      size="1"
      x="2"
      y="28"
      adjusty="0"
      >${screen.itemNm("planNum1")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.planNumSum)}</text>
<!-- 総検品数 -->
<text mode="1"
      size="1"
      x="2"
      y="31"
      adjusty="0"
      >${screen.itemNm("planNum2")}:${screen.stripTrailingZeros(ReceiveInspecStoreDto.storeNumSum)}</text>
<%--[Ver3.0] unit of measure対応 2017.11.28 王 End--%>

<%@ include file="../../base/HTBaseFooter_en.jsp" %>
