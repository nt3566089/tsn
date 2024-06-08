package com.oneslogi.wms.dto.master;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlEZipListDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class ZipMasterBulkInputDto extends PagingDto {

	public static SqlEZipListDto chaseMZipDto() {
		return new SqlEZipListDto();
	}

	public static SqlEZipListDto chaseMZipBodyDto() {
		return new SqlEZipListDto();
	}

	public boolean isOverCommitUnitNum(int cntCommit) {
		return cntCommit >= this.data.commitUnitNum;
	}

	public static class ZipMasterData implements Serializable {
		public String receiveCd;
		public int errorCount;
		//[Ver3.1][#5754] 未インポートデータが0件の場合はボタンを非活性に修正 2018.12.13 tanaka start
		public int dataCount;
		//[Ver3.1][#5754] 未インポートデータが0件の場合はボタンを非活性に修正 2018.12.13 tanaka end
		public Long commitUnitNum;
		//検索条件
		public SqlEZipListDto head = new SqlEZipListDto();
		//検索結果(郵便番号マスタ受信テーブル)
		public List<SqlEZipListDto> body = new ArrayList<SqlEZipListDto>();
		//空行
		public SqlEZipListDto blankRow = chaseMZipBodyDto();
	};

	public ZipMasterData data = new ZipMasterData();
}
