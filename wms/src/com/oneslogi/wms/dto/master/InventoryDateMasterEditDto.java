package com.oneslogi.wms.dto.master;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import com.oneslogi.base.dbflute.dto.customize.SqlInventoryDateMasterEditDto;
import com.oneslogi.base.dto.BaseDto;
import com.oneslogi.base.dto.PagingDto;

@XmlRootElement(name = BaseDto.XML_ROOT_NAME)
public class InventoryDateMasterEditDto  extends PagingDto {



	public static class InventoryDateMasterEditData implements Serializable {
		public		SqlInventoryDateMasterEditDto	head	=	new		SqlInventoryDateMasterEditDto();
	};
	public	 InventoryDateMasterEditData data = new InventoryDateMasterEditData();
}











