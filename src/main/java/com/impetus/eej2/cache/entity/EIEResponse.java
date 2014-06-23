package com.impetus.eej2.cache.entity;

import java.util.Date;

/**\
 * @author perwaiz.ali
 * <p>
 * An entity to represent EIE Response from EIE Cache.
 * </p>
 * @version 0.1
 */
public class EIEResponse {

  
  private Integer id;
  
  private String cc;
  
  private String TN;
  
  private String MNC;
  
  private String MCC;
  
  private String SPID;
  
  private Date crDate;
  
  private Date updDate;
  
  private Integer reqType;
  
  private String resString;
  
  private Integer status;
  
  private Integer IMSI;
  
  private Integer HLR;
  
  private Integer MSC;
  
  private String TN_Type;

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getCc()
  {
    return cc;
  }

  public void setCc(String cc)
  {
    this.cc = cc;
  }

  public String getTN()
  {
    return TN;
  }

  public void setTN(String tN)
  {
    TN = tN;
  }

  public String getMNC()
  {
    return MNC;
  }

  public void setMNC(String mNC)
  {
    MNC = mNC;
  }

  public String getMCC()
  {
    return MCC;
  }

  public void setMCC(String mCC)
  {
    MCC = mCC;
  }

  public String getSPID()
  {
    return SPID;
  }

  public void setSPID(String sPID)
  {
    SPID = sPID;
  }

  public Date getCrDate()
  {
    return crDate;
  }

  public void setCrDate(Date crDate)
  {
    this.crDate = crDate;
  }

  public Date getUpdDate()
  {
    return updDate;
  }

  public void setUpdDate(Date updDate)
  {
    this.updDate = updDate;
  }

  public Integer getReqType()
  {
    return reqType;
  }

  public void setReqType(Integer reqType)
  {
    this.reqType = reqType;
  }

  public String getResString()
  {
    return resString;
  }

  public void setResString(String resString)
  {
    this.resString = resString;
  }

  public Integer getStatus()
  {
    return status;
  }

  public void setStatus(Integer status)
  {
    this.status = status;
  }

  public Integer getIMSI()
  {
    return IMSI;
  }

  public void setIMSI(Integer iMSI)
  {
    IMSI = iMSI;
  }

  public Integer getHLR()
  {
    return HLR;
  }

  public void setHLR(Integer hLR)
  {
    HLR = hLR;
  }

  public Integer getMSC()
  {
    return MSC;
  }

  public void setMSC(Integer mSC)
  {
    MSC = mSC;
  }

  public String getTN_Type()
  {
    return TN_Type;
  }

  public void setTN_Type(String tN_Type)
  {
    TN_Type = tN_Type;
  }
  
 
  
}
