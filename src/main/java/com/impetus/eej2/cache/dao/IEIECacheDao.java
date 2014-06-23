package com.impetus.eej2.cache.dao;

import com.impetus.eej2.cache.entity.EIERequest;
import com.impetus.eej2.cache.entity.EIEResponse;

/**
 * @author perwaiz.ali
 * 
 */
public interface IEIECacheDao {
  
  /**
   * <p>
   * Get EIE Response for input Request from EIE.
   * </p>
   * @param eieReq
   * @return
   */
  public EIEResponse getEIEResponse(EIERequest eieReq);
  
  /**
   *<p>
   * Add EIE Response from External Interface
   *</p>
   * @param eieRes
   */
  public void addEIEExternalReponse(EIEResponse eieRes);
}
