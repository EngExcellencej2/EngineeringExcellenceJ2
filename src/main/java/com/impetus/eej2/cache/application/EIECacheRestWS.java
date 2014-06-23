package com.impetus.eej2.cache.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.impetus.eej2.cache.entity.EIERequest;
import com.impetus.eej2.cache.entity.EIEResponse;
import com.impetus.eej2.cache.service.IEIECacheService;

@Service("eieCacheRestImpl")
@Produces("application/json")
@Consumes("application/json")
@Path("/eieCacheRest")
public class EIECacheRestWS {

	@Autowired
	private IEIECacheService cacheService;

	@GET
	public EIEResponse getEIEReponse(@QueryParam("telNumber") String telNumber,
			@QueryParam("countryCode") String countryCode,
			@QueryParam("requestType") Integer requestType) {
		if (telNumber != null && countryCode != null && requestType != null) {
			EIERequest eieRequest=new EIERequest();
			eieRequest.setCC(countryCode);
			eieRequest.setReqType(requestType);
			eieRequest.setTN(telNumber);
			return cacheService.getEIEresponse(eieRequest);
		} else {

			return null;
		}

	}

	@POST
	public void addEIEExternalReponse(EIEResponse response) {
		cacheService.addEIEexternalResponse(response);

	}

}
