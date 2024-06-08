package com.oneslogi.wms.dto.shipping;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MProductDto;
import com.oneslogi.base.dbflute.dto.MProductShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDtlDto;
import com.oneslogi.base.dbflute.dto.MShapeGrpDto;
import com.oneslogi.base.dbflute.dto.TAllocInstHDto;
import com.oneslogi.base.dbflute.dto.TPickingHDto;
import com.oneslogi.base.dbflute.dto.VDictDto;
import com.oneslogi.base.dbflute.dto.customize.SqlPackingListUpdateDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class PackingUpdateSelectDto extends PagingDto {

	public static TPickingHDto chaseTPickingHDto() {
		return chaseTPickingHDto(new TPickingHDto());
	}

	public static TPickingHDto chaseTPickingHDto(TPickingHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		return dto;
	}

	public static class SelectData implements Serializable {
		//荷材No.
		public String boxNo = null;
		//荷材
		public String boxCd = null;
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod Start
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		public String unitNumBreakdown = null;
		//[Ver3.0] unit of measure対応 2017.11.22 ライ Start
		public MProductDto product = chaseMProductDto();
		// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Mod End
		// [EC-CT1-112] 選択部の「投入数」、「アイテム別梱包状況・出荷指示数」、「アイテム別梱包状況・投入数」と「アイテム別梱包状況・差異数」に空で表示変更 2015.03.11 kyo Start
		//投入数
		public BigDecimal pickNumSel = null;
		//出荷指示数(アイテム別)
		public BigDecimal allocNum = null;
		//投入数(アイテム別)
		public BigDecimal pickNum = null;
		//差異数(アイテム別)
		public BigDecimal diffNum = null;
		// [EC-CT1-112] 選択部の「投入数」、「アイテム別梱包状況・出荷指示数」、「アイテム別梱包状況・投入数」と「アイテム別梱包状況・差異数」に空で表示変更 2015.03.11 kyo End

		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei Start
		public Timestamp updDt = null;
		public Long count = null;
		// [ON推-CT4-256] 排他処理変更対応引数追加 2014.11.21 kei End
		// [ON推-CT4-256] 排他処理変更対応削除 2014.11.21 kei
	};

	// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add Start

	public static MProductDto chaseMProductDto() {
		return chaseMProductDto(new MProductDto());
	}

	public static MProductDto chaseMProductDto(MProductDto dto) {
		if (dto.getMProductShapeList().size() == 0) {
			dto.getMProductShapeList().add(0, new MProductShapeDto());
		}
		if (dto.getMProductShapeList().get(0).getMShapeGrpDtl() == null) {
			dto.getMProductShapeList().get(0).setMShapeGrpDtl(new MShapeGrpDtlDto());
		}
		if (dto.getMProductShapeList().get(0).getMShapeGrpDtl().getMShapeGrp() == null) {
			dto.getMProductShapeList().get(0).getMShapeGrpDtl().setMShapeGrp(new MShapeGrpDto());;
		}
		if (dto.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape() == null) {
			dto.getMProductShapeList().get(0).getMShapeGrpDtl().setMShape(new MShapeDto());;
		}
		if (dto.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getVDictByShapeDictId() == null) {
			dto.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().setVDictByShapeDictId(new VDictDto());
		}
		if (dto.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().getVDictByShapeUnitDictId() == null) {
			dto.getMProductShapeList().get(0).getMShapeGrpDtl().getMShape().setVDictByShapeUnitDictId(new VDictDto());
		}
		return dto;
	}
	// [#3132][Ver3.0] 小数有無フラグを加味した小数点チェック処理について 2018.02.19 honma Add End

	public static class ReceiveListData implements Serializable {
		//検索条件を入れるDTO
		public TPickingHDto search = chaseTPickingHDto();
		//検索結果を入れるDTO（外だしＳＱＬ用のサンプル）
		public List<SqlPackingListUpdateDto> list = new ArrayList<SqlPackingListUpdateDto>();
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana Start
		// 検索時の梱包ヘッダIDと荷材No.を退避 (更新時に使用)
		public Map<String, Long> boxNoMap = new HashMap<String, Long>();
		// [#2913] 梱包明細修正を差分更新に変更 2018.02.07 kawana End

		public TAllocInstHDto footer = new TAllocInstHDto();

		public TAllocInstHDto footerOld = new TAllocInstHDto();

		public SelectData select = new SelectData();

		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana Start
		public int tagLabelPrintFlg;
		// [#51][C-CWMS-0058] 荷札出力機能追加 2016.11.09 kawana End
	};

	public ReceiveListData data = new ReceiveListData();
}
