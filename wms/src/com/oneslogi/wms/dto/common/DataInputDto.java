package com.oneslogi.wms.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.dto.MDataInputTypeDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.InputDto.ColumnDefsData;
import com.oneslogi.base.util.CU;

public class DataInputDto extends BaseDto {

	public static class ColumnDefs implements Serializable {

		public String displayName;

		public String field;

		public String visible;

		public int inColIndex;

	};

	public static class InputDefs implements Serializable {

		public String inputField;

		public String lineNumColumn;

		public String errorFlgColumn;

		public String errorMsgColumn;

		public List<ColumnDefs> columnDefs = new ArrayList<ColumnDefs>();

	};

	public static class DataInputCondition implements Serializable {

		public String operationType;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA Start
		public String dataInputTypeCd;

//		public String inputType;
		//Ver２．１向けエンハンス 荷札出力対応2016.7.26 SJA End

		public String dataRange;

		public String processType;

		public String commitType;

		public Long commitUnitNum;

		public InputDefs inputDefs = new InputDefs();

		public String downloadUrl;

		public int cntAll = 0;

		public int cntError = 0;

		public int cntSuccess = 0;

		public int cntErrorLimit = -1;

	};

	public DataInputCondition data = new DataInputCondition();

	public boolean isCommitAll() {
		return CU.equals(this.data.commitType, CDef.DataInputCommitType.$0.code());
	}

	public boolean isCommitBlock() {
		return CU.equals(this.data.commitType, CDef.DataInputCommitType.$1.code());
	}

	public boolean isRewrite() {
		return CU.equals(this.data.processType, CDef.DataInputProcessType.$1.code());
	}

	public boolean isUnfinishedAndNonError() {
		return this.data.dataRange == null;
	}

	public boolean isOnlyUnfinished() {
		return CU.equals(this.data.dataRange, CDef.DataInputRange.$1.code());
	}

	public boolean isOnlyError() {
		return CU.equals(this.data.dataRange, CDef.DataInputRange.$2.code());
	}

	public boolean isOverCommitUnitNum(int cntCommit) {
		return cntCommit >= this.data.commitUnitNum;
	}

	public void initProcess(int cntAll) {
		this.data.cntAll = cntAll;
		this.data.cntError = 0;
		this.data.cntSuccess = 0;
	}

	public void addError() {
		addError(1);
	}

	public void addError(int cntError) {
		this.data.cntError += cntError;
	}

	public void addSuccess() {
		addSuccess(1);
	}

	public void addSuccess(int cntSuccess) {
		this.data.cntSuccess += cntSuccess;
	}

	public boolean isOverErrorLimit() {
		if (this.data.cntErrorLimit < 0) {
			return false;
		}
		return this.data.cntError >= this.data.cntErrorLimit;
	}

	public boolean hasError() {
		return this.data.cntError > 0;
	}
	
	//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA Start
	public static MDataInputTypeDto chaseMDataInputTypeDto() {
		return chaseMDataInputTypeDto(new MDataInputTypeDto());
	}
	public static MDataInputTypeDto chaseMDataInputTypeDto(MDataInputTypeDto dto) {
		return dto;
	}
	public static class WorkInputData implements Serializable {
		public MDataInputTypeDto base = chaseMDataInputTypeDto();
		public List<Object> order = new ArrayList<Object>();
		public String jsonData;
		public Long clientId;
		public Long centerId;
		public List<Object> orderHeader = new ArrayList<Object>();
		public List<Object> orderBody = new ArrayList<Object>();
		public String jsonDataHeader;
		public String jsonDataBody;
		public List<ColumnDefsData> columnDefs;
	};
	public WorkInputData workData = new WorkInputData();
	//Ver２．１向けエンハンス 荷札出力対応2016.7.25 SJA End
}
