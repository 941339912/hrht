package cn.bdqn.entity;


public class Yuyue {

  private long id;
  private long dId;
  private long uId;
  private java.sql.Timestamp yyDate;
  private String yyNum;
  private String numType;
  private double numPrice;
  private java.sql.Timestamp jzDate;
  private long status;
  private String remark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDId() {
    return dId;
  }

  public void setDId(long dId) {
    this.dId = dId;
  }


  public long getUId() {
    return uId;
  }

  public void setUId(long uId) {
    this.uId = uId;
  }


  public java.sql.Timestamp getYyDate() {
    return yyDate;
  }

  public void setYyDate(java.sql.Timestamp yyDate) {
    this.yyDate = yyDate;
  }


  public String getYyNum() {
    return yyNum;
  }

  public void setYyNum(String yyNum) {
    this.yyNum = yyNum;
  }


  public String getNumType() {
    return numType;
  }

  public void setNumType(String numType) {
    this.numType = numType;
  }


  public double getNumPrice() {
    return numPrice;
  }

  public void setNumPrice(double numPrice) {
    this.numPrice = numPrice;
  }


  public java.sql.Timestamp getJzDate() {
    return jzDate;
  }

  public void setJzDate(java.sql.Timestamp jzDate) {
    this.jzDate = jzDate;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
