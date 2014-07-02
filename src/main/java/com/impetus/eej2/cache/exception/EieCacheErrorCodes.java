package com.impetus.eej2.cache.exception;

public enum EieCacheErrorCodes {
UNSUCCESSFULL_READ("unsuccesfullRead"),UNSUCCESSFULL_WRITE("unsuccessfullwrite");

private String errorCode;

private EieCacheErrorCodes(String errorCode) {
	this.errorCode = errorCode;
}

public String getErrorCode() {
	return errorCode;
}

public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}


}
