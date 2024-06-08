package com.oneslogi.base.dbflute.exentity;

import com.oneslogi.base.dbflute.bsentity.BsMClient;

/**
 * The entity of M_CLIENT.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MClient extends BsMClient {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // 選択
   	private String clientCheckBox;

	public String getClientCheckBox() {
		return clientCheckBox;
	}

	public void setClientCheckBox(String clientCheckBox) {
		this.clientCheckBox = clientCheckBox;
	}
}
