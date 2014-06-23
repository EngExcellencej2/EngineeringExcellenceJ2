package com.impetus.eej2.cache.dao;

import org.springframework.stereotype.Service;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.impetus.eej2.cache.entity.EIERequest;
import com.impetus.eej2.cache.entity.EIEResponse;
import com.impetus.eej2.cache.properties.EIECacheProperties;
import com.impetus.eej2.cache.utils.CassandraConnectionUtils;

/**
 * @author perwaiz.ali
 */
@Service
public class EIECacheDaoImpl implements IEIECacheDao {
	private EIECacheProperties cacheProp;

	public EIECacheProperties getCacheProp() {
		return cacheProp;
	}

	public void setCacheProp(EIECacheProperties cacheProp) {
		this.cacheProp = cacheProp;
	}

	@Override
	public EIEResponse getEIEResponse(EIERequest eieReq) {
		int rowID = getRowID(eieReq);
		Session session = CassandraConnectionUtils.CONN.getSession();
		PreparedStatement preparedStatement = session.prepare(cacheProp
				.getFetchStatement());
		BoundStatement boundStatement = preparedStatement.bind(rowID);
		ResultSet rowSet = session.execute(boundStatement);
		EIEResponse eieRes = null;
		for (Row row : rowSet) {
			eieRes = new EIEResponse();
			eieRes.setId(row.getInt("ID"));
			eieRes.setCc(row.getString("CC"));
			eieRes.setTN(row.getString("TN"));
			eieRes.setMNC(row.getString("MNC"));
			eieRes.setMCC(row.getString("MCC"));
			eieRes.setSPID(row.getString("SPID"));
			eieRes.setCrDate(row.getDate("CREATED_DATE"));
			eieRes.setUpdDate(row.getDate("UPDATE_DATE"));
			eieRes.setReqType(row.getInt("REQUEST_TYPE"));
			eieRes.setResString(row.getString("RESPONSE_STRING"));
			eieRes.setStatus(row.getInt("STATUS"));
			eieRes.setIMSI(row.getInt("IMSI"));
			eieRes.setHLR(row.getInt("HLR"));
			eieRes.setMSC(row.getInt("MSC"));
			eieRes.setTN_Type(row.getString("TN_TYPE"));
			break;
		}
		return eieRes;
	}

	/**
	 * <p>
	 * Get unique hash Code as Row Id for Cassandra Column Family.
	 * </p>
	 * 
	 * @param eieReq
	 * @return
	 */
	private int getRowID(EIERequest eieReq) {
		String src = eieReq.getCC() + eieReq.getTN() + eieReq.getReqType();
		return src.hashCode();
	}

	@Override
	public void addEIEExternalReponse(EIEResponse eieRes) {
		Session session = CassandraConnectionUtils.CONN.getSession();
		PreparedStatement preparedStatement = session.prepare(cacheProp
				.getInsertStatement());
		BoundStatement boundStatement = preparedStatement.bind(eieRes.getId(),
				eieRes.getCc(), eieRes.getTN(), eieRes.getMNC(),
				eieRes.getMCC(), eieRes.getSPID(), eieRes.getCrDate(),
				eieRes.getUpdDate(), eieRes.getReqType(),
				eieRes.getResString(), eieRes.getStatus(), eieRes.getStatus(),
				eieRes.getIMSI(), eieRes.getHLR(), eieRes.getMSC(),
				eieRes.getTN_Type());
		session.execute(boundStatement);
	

	}

}
