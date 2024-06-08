<%@ include file="../../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.wms.dto.receive.SerialReceiveInspectionDto" %>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw Start-->
<c:set var="receiveSlipNo" value="${SerialReceiveInspectionDto.receiveSlipNo}"/>
<c:set var="supplierCd" value="${SerialReceiveInspectionDto.supplierCd }"/>
<!-- [#1844]伝票No.、仕入先などの入力チェック方法修正 2017.6.7 nayzaw End-->

<!-- 入荷検品(終了) -->
<%-- メッセージ --%>
<text mode="1"
      size="1"
      x="4"
      y="6"
      >${screen.itemNm("msg1")}</text>
<!-- 伝票No -->
<c:if test="${not empty receiveSlipNo}">
	<text mode="1"
	      size="1"
	      x="2"
	      y="14"
	      adjusty="0"
	      >${screen.itemNm("workNo")}:</text>
	<text mode="1"
	      size="1"
	      x="2"
	      y="18"
	      adjusty="0"
	      >${fn:escapeXml(SerialReceiveInspectionDto.receiveSlipNo)}</text>
</c:if>
<c:if test="${empty receiveSlipNo}">
	<c:if test="${not empty supplierCd}">
		<text mode="1"
		      size="1"
		      x="2"
		      y="14"
		      adjusty="0"
		      >${screen.itemNm("supplierCd")}:</text>

		<text mode="1"
		      size="1"
		      x="13"
		      y="14"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierCd)}</text>

		<text mode="1"
		      size="1"
		      x="2"
		      y="18"
		      adjusty="0"
		      >${fn:escapeXml(SerialReceiveInspectionDto.supplierNm)}</text>

	</c:if>
</c:if>
<%@ include file="../../base/HTBaseFooter_en.jsp" %>
