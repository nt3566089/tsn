package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.dto.MMatchingDto;
import com.oneslogi.base.dto.PagingDto;

public class MatchingMasterDto extends PagingDto {

	public static class MatchingMasterData implements Serializable {

		public MMatchingDto search = new MMatchingDto();
		public List<MMatchingDto> list = new ArrayList<MMatchingDto>();
		public MMatchingDto blankRow = new MMatchingDto();

	}

	public MatchingMasterData data = new MatchingMasterData();
}
