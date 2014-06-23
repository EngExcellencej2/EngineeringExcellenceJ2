package com.impetus.eej2.cache.entity;

public class EIERequest {

  private String TN;
  
  private String CC;
  
  private Integer reqType;

  public String getTN()
  {
    return TN;
  }

  public void setTN(String tN)
  {
    TN = tN;
  }

  public String getCC()
  {
    return CC;
  }

  public void setCC(String cC)
  {
    CC = cC;
  }

  public Integer getReqType()
  {
    return reqType;
  }

  public void setReqType(Integer reqType)
  {
    this.reqType = reqType;
  }


}
