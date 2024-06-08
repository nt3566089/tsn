package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlAllocateControlMasterEditDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class AllocateControlMasterEditDto extends PagingDto {

		public static class AllocateControlMasterEditData implements Serializable {
		public SqlAllocateControlMasterEditDto head = new SqlAllocateControlMasterEditDto();
	};

	public AllocateControlMasterEditData data = new AllocateControlMasterEditData();

}
