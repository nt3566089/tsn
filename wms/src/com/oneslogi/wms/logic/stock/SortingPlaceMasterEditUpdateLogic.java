package com.oneslogi.wms.logic.stock;

import javax.inject.Inject;

import com.oneslogi.base.dbflute.exbhv.MCblkBhv;
import com.oneslogi.base.dbflute.exbhv.MClinBhv;
import com.oneslogi.base.dbflute.exbhv.TCsrwhadmBhv;
import com.oneslogi.base.dbflute.exentity.MCblk;
import com.oneslogi.base.dbflute.exentity.MClin;
import com.oneslogi.base.dbflute.exentity.TCsrwhadm;
import com.oneslogi.base.exception.ErrorManager.ErrorStatus;
import com.oneslogi.wms.core.logic.AbstractWmsLogic;

public class SortingPlaceMasterEditUpdateLogic extends AbstractWmsLogic {



	@Inject
	private TCsrwhadmBhv tCsrwhadmBhv;
	@Inject
	private MClinBhv mClinBhv;
	@Inject
	private MCblkBhv mCblkBhv;

	//共通更新
	public void tCsrwhadmUpdate(TCsrwhadm entity, ErrorStatus errSts) {
		tCsrwhadmBhv.update(entity);
	}

	//ライン更新
	public void mClinUpdate(MClin entity, ErrorStatus errSts) {
		mClinBhv.update(entity);
	}

	//ブロック更新
	public void mCblkUpdate(MCblk entity, ErrorStatus errSts) {
		mCblkBhv.update(entity);
	}


}