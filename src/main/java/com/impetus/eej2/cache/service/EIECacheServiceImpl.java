package com.impetus.eej2.cache.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impetus.eej2.cache.dao.IEIECacheDao;
import com.impetus.eej2.cache.entity.EIERequest;
import com.impetus.eej2.cache.entity.EIEResponse;

@Service
public class EIECacheServiceImpl implements IEIECacheService {

	@Autowired
	private IEIECacheDao ieieCacheDao;

	public EIEResponse getEIEresponse(EIERequest eieReq) {
		return ieieCacheDao.getEIEResponse(eieReq);
	}

	public void addEIEexternalResponse(EIEResponse eieRes) {

		ieieCacheDao.addEIEExternalReponse(eieRes);
	}

}
