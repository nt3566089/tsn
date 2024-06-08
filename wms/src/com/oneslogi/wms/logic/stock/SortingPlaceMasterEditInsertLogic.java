package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class SortingPlaceMasterEditInsertLogic extends AbstractWmsLogic {

	@Inject
	private MClinBhv mClinBhv;
	@Inject
	private MCblkBhv mCblkBhv;

	//ライン登録
	public void mClinInsert(MClin entity, ErrorStatus errSts) {
		mClinBhv.insert(entity);
	}

	//ブロック登録
	public void mCblkInsert(MCblk entity, ErrorStatus errSts) {
		mCblkBhv.insert(entity);
	}


}