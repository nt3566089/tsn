<%@ include file="../base/HTBaseHeader_en.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.oneslogi.ht.base.dto.HandyCommonDialogDto" %>
<text mode="1"
      size="1"
      x="1"
      y="4"><c:out value="${dialogDto.text1}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="8"><c:out value="${dialogDto.text2}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="12"><c:out value="${dialogDto.text3}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="16"><c:out value="${dialogDto.text4}" /></text>
<!-- [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana Start -->
<text mode="1"
      size="1"
      x="1"
      y="4"><c:out value="${dialogDto.extText1}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="7"
      ><c:out value="${dialogDto.extText2}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="10"
      ><c:out value="${dialogDto.extText3}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="13"
      ><c:out value="${dialogDto.extText4}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="16"
      ><c:out value="${dialogDto.extText5}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="19"
      ><c:out value="${dialogDto.extText6}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="22"
      ><c:out value="${dialogDto.extText7}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="25"
      ><c:out value="${dialogDto.extText8}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="28"
      ><c:out value="${dialogDto.extText9}" /></text>
<text mode="1"
      size="1"
      x="1"
      y="31"
      ><c:out value="${dialogDto.extText10}" /></text>
<!-- [v3.0]iPodTouchで改行コード(\n)で改行されないため改行されたら新しいTextタグを作成 2019.01.18 kawana End -->
<%@ include file="../base/HTBaseFooter_en.jsp" %>
