package com.oneslogi.wms.dto.receive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.MCenterDto;
import com.oneslogi.base.dbflute.dto.MClientDto;
import com.oneslogi.base.dbflute.dto.MCustomerDto;
import com.oneslogi.base.dbflute.dto.TReceivePlanHDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class SlipNoReceiveListDto extends PagingDto {

	public static TReceivePlanHDto chaseTReceivePlanHDto() {
		return chaseTReceivePlanHDto(new TReceivePlanHDto());
	}

	public static TReceivePlanHDto chaseTReceivePlanHDto(TReceivePlanHDto dto) {
		if (dto.getMCenter() == null) {
			dto.setMCenter(new MCenterDto());
		}
		if (dto.getMClient() == null) {
			dto.setMClient(new MClientDto());
		}
		if (dto.getMCustomerByPlanSupplierId() == null) {
			dto.setMCustomerByPlanSupplierId(new MCustomerDto());
		}
		return dto;
	}

	// [ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
	// public static class ProgressData implements Serializable {
	// //全体件数
	// public Long allCount = 0L;
	// //未入荷件数
	// public Long nonReceiveCount = 0L;
	// //入荷中件数
	// public Long receivingCount = 0L;
	// //入荷済件数
	// public Long storedCount = 0L;
	// };
	// [ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End

	public static class SlipNoReceiveListData implements Serializable {
		// 検索条件を入れるDTO
		public TReceivePlanHDto head = chaseTReceivePlanHDto();
		// 検索結果を入れるDTO
		public List<TReceivePlanHDto> list = new ArrayList<TReceivePlanHDto>();
		// 進捗状態を入れるDTO
		// [ON推]進捗率の表示をしないように修正 2016.04.06 chou Del Start
		// public ProgressData progress = new ProgressData();
		// [ON推]進捗率の表示をしないように修正 2016.04.06 chou Del End
		// [C-NIS-0006] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana Start
		// 日付(From)デフォルト表示設定
		public int dtFromDefFlg;
		// 日付(To)デフォルト表示設定
		public int dtToDefFlg;
		// [C-NIS-0006] システム日付の入力有無を設定ファイルで変更できるように変更 2015.07.03 kawana End
		public ReceivePlanListPrintDto test = new ReceivePlanListPrintDto();
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 SJA Start
		public ReceivePlanListPrintDto test2 = new ReceivePlanListPrintDto();
		// [Ver2.1向けエンハンス] 商品ラベル追加 BY SJA 2016/06/02 SJA End
	};

	public SlipNoReceiveListData data = new SlipNoReceiveListData();
}
