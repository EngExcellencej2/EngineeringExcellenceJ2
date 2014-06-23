package com.impetus.eej2.cache.properties;

/**
 * @author hitesh.pawar
 * <p>
 * The class holds database CQL to be used in dao Layer. All database CQL statements properites will go over here
 * </p>
 * @version 0.1
 * 
 */
public class EIECacheProperties {

	private String fetchStatement;
	
	private String insertStatement;

	public String getFetchStatement() {
		return fetchStatement;
	}

	public void setFetchStatement(String fetchStatement) {
		this.fetchStatement = fetchStatement;
	}

	public String getInsertStatement() {
		return insertStatement;
	}

	public void setInsertStatement(String insertStatement) {
		this.insertStatement = insertStatement;
	}
	
}
