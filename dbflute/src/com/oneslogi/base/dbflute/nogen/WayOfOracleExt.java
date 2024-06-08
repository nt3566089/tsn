package com.oneslogi.base.dbflute.nogen;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.dbway.WayOfOracle;

public class WayOfOracleExt extends WayOfOracle {

	private List<String> list = new ArrayList<String>();

	@Override
	public List<String> getOriginalWildCardList() {
		return list;
	}

}
