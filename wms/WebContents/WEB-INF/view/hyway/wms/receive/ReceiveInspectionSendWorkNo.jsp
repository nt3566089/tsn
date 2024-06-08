<%@ include file="../../base/HTBaseHeader.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.ReceiveInspectionDto" %>

<!-- 完了確認(伝票No) -->
<%-- 完了確認(伝票No)画面 --%>

<%-- 差異がありますが --%>
<c:if test="${ReceiveInspectionDto.differentFlg != '0'}">
<text mode="1"
      size="2"
      x="2"
      y="7"
      >${screen.itemNm("diffMsg1")}</text>
<%-- 検品を完了しますか？ --%>
<text mode="1"
      size="2"
      x="1"
      y="10"
      >${screen.itemNm("diffMsg2")}</text>
</c:if>

<%-- 検品を完了しますか？ --%>
<c:if test="${ReceiveInspectionDto.differentFlg == '0'}">
<text mode="1"
      size="2"
      x="1"
      y="7"
      >${screen.itemNm("sameMsg1")}</text>
<%-- 検品を完了しますか？ --%>
<text mode="1"
      size="2"
      x="5"
      y="10"
      />
</c:if>
<!-- 伝票No -->
<%-- 伝票No --%>
<text mode="1"
      size="2"
      x="2"
      y="16"
      adjusty="0"
      >${screen.itemNm("workNo")}:</text>
<text mode="1"
      size="2"
      x="2"
      y="19"
      adjusty="0"
      >${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.TReceivePlanH.receiveSlipNo)}</text>
<!-- 仮ロケ -->
<%-- 仮ロケ --%>
<text mode="1"
      size="2"
      x="2"
      y="22"
      adjusty="0"
      >${screen.itemNm("loc")}:${fn:escapeXml(ReceiveInspectionDto.TReceivePlanBDto.planLocationCd)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 Start--%>
<!-- 総予定数 -->
<%-- 総予定数 --%>
<text mode="1"
      size="2"
      x="2"
      y="28"
      adjusty="0"
      >${screen.itemNm("planNum1")}:${screen.stripTrailingZeros(ReceiveInspectionDto.planNumSum)}</text>
<!-- 総検品数 -->
<%-- 総検品数 --%>
<text mode="1"
      size="2"
      x="2"
      y="31"
      adjusty="0"
      >${screen.itemNm("planNum2")}:${screen.stripTrailingZeros(ReceiveInspectionDto.storeNumSum)}</text>
<%-- [Ver3.0] unit of measure対応 2017.11.23 王 End--%>

<%@ include file="../../base/HTBaseFooter.jsp" %>
