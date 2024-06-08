package com.oneslogi.wms.exception;

public class WmsException extends RuntimeException {

	public WmsException(String message, Throwable cause) {
		super(message, cause);
	}

	public WmsException(String message) {
		super(message);
	}
}
