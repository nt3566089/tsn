package com.oneslogi.wms.exception;

public class WmsDailyCheckException extends RuntimeException {

	public WmsDailyCheckException() {
	}

	public WmsDailyCheckException(String message) {
		super(message);
	}

	public WmsDailyCheckException(Throwable cause) {
		super(cause);
	}

	public WmsDailyCheckException(String message, Throwable cause) {
		super(message, cause);
	}

	public WmsDailyCheckException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
