package com.oneslogi.ht.wms.dto.operation;

import javax.ws.rs.QueryParam;

import com.oneslogi.base.dbflute.exentity.BClass;
import com.oneslogi.base.dbflute.exentity.BClassDtl;
import com.oneslogi.base.logic.common.BClassLogic;
import com.oneslogi.ht.base.dto.HandyBaseDto;

/**
 * 勤怠情報を保持します。
 */
public class AttendanceEntryHtDto extends HandyBaseDto {

	// 作業者CD
	@QueryParam("workUserCd")
	private String workUserCd;

	// 勤怠のステータス
	private int state = 0;

	// 選択されたボタンのテキスト
	private String selectBtnTxt;

	public String getWorkUserCd() {
		return workUserCd;
	}

	public void setWorkUserCd(String workUserCd) {
		this.workUserCd = workUserCd;
	}

	public int getState() {
		return state;
	}

	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka Start
	private String testMode = null;

	@QueryParam("inDate")
	private String inDate ;

	@QueryParam("inTime")
	private String inTime ;

	private String textDate ;

	private String textTime ;

	/**
	 * @return inDate
	 */
	public String getInDate() {
		return inDate;
	}

	/**
	 * @param inDate セットする
	 */
	public void setInDate(String inDate) {
		this.inDate = inDate;
	}

	/**
	 * @return inTime
	 */
	public String getInTime() {
		return inTime;
	}

	/**
	 * @param inTime セットする
	 */
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	/**
	 * @return textDate
	 */
	public String getTextDate() {
		return textDate;
	}

	/**
	 * @param textDate セットする
	 */
	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}

	/**
	 * @return textTime
	 */
	public String getTextTime() {
		return textTime;
	}

	/**
	 * @param textTime セットする
	 */
	public void setTextTime(String textTime) {
		this.textTime = textTime;
	}

	/**
	 * @return testMode
	 */
	public String getTestMode() {
		return testMode;
	}

	/**
	 * @param testMode セットする
	 */
	public void setTestMode(String testMode) {
		this.testMode = testMode;
	}
	// [#6756][労務管理] ＷＭＳ出退勤・休憩入力機能修正 2019.11.07 tanaka End

	/**
	 * <h2>勤怠のステータスを設定する。</h2>
	 * <pre>
	 * 引数のステータスから勤怠名を取得し、選択されたボタンのテキストに設定。
	 * 第一引数は<strong>必ずチェック済み</strong>のステータスを設定してください。
	 * </pre>
	 * @param state
	 */
	public void setState(int state, BClassLogic bClassLogic) {
		this.state = state;
		this.setSelectBtnTxt(bClassLogic);
	}

	public String getSelectBtnTxt() {
		return selectBtnTxt;
	}

	private void setSelectBtnTxt(BClassLogic bClassLogic) {
		BClass bClass = new BClass();
		bClass.setClassCd("ATTENDANCE_LEAVING_REST");

		BClassDtl entity = new BClassDtl();
		entity.setClassDtlCd(String.valueOf(this.state));

		BClassDtl bClassDtl = bClassLogic.getUkEntityWithDeletedCheck(bClass, entity);

		if(bClassDtl == null) {
			throw new NullPointerException();
		}

		this.selectBtnTxt = bClassDtl.getVDict().getDictNm();
	}

}
