package com.oneslogi.wms.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.oneslogi.base.cdi.annotation.Access;
import com.oneslogi.base.cdi.annotation.Authentication;
import com.oneslogi.base.cdi.annotation.CheckBase;
import com.oneslogi.base.cdi.annotation.CheckBase.CheckMode;
import com.oneslogi.base.cdi.annotation.DBFluteAccessContext;
import com.oneslogi.base.cdi.annotation.ErrorControl;
import com.oneslogi.base.cdi.annotation.Trace;
import com.oneslogi.base.cdi.annotation.Transaction;
import com.oneslogi.base.cdi.annotation.Transaction.Mode;
import com.oneslogi.wms.core.AbstractWmsBase;
/**
 * ベースとなるRESTful用のリソースクラスです。
 *
 * @author user
 *
 */
@Authentication
@DBFluteAccessContext
@Access
@ErrorControl
@Trace
@Transaction(Mode.BEGIN_TRANSACTION)
@CheckBase(CheckMode.TYPE_CHECK)
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.MULTIPART_FORM_DATA })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public abstract class AbstractWmsResource extends AbstractWmsBase {

	//公開メソッド
	public Long getCenterClassCondition() {
		return super.getCenterId();
	}

	//公開メソッド
	public Long getClientId() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public String getClientCd() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public String getClientNm() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public Long getCenterId() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public String getCenterCd() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public String getCenterNm() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public Long getWarehouseId() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public String getWarehouseCd() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

	//公開メソッド
	public String getWarehouseNm() {
		throw new RuntimeException("Resourceクラスから当メソッドを実行する事はできません。呼び出し元からEntity経由で取得して下さい。");
	}

}
