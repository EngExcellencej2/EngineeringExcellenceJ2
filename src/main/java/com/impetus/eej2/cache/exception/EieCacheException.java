package com.impetus.eej2.cache.exception;

public class EieCacheException extends RuntimeException {
    private EieCacheErrorCodes errorCode;
	private String message;
	
	public EieCacheErrorCodes getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(EieCacheErrorCodes errorCode) {
		this.errorCode = errorCode;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	public EieCacheException()
	{
		// default constructor
	}
	public EieCacheException(EieCacheErrorCodes errorCode, String message) {
		super();
		this.errorCode = errorCode;
		this.message = message;
	}
	
	
	
	
}
