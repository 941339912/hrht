package cn.bdqn.entity;


public class Zuozhen {

  private long id;
  private String address;
  private java.sql.Timestamp sTime;
  private java.sql.Timestamp eTime;
  private long kId;
  private long dId;
  private String remark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public java.sql.Timestamp getSTime() {
    return sTime;
  }

  public void setSTime(java.sql.Timestamp sTime) {
    this.sTime = sTime;
  }


  public java.sql.Timestamp getETime() {
    return eTime;
  }

  public void setETime(java.sql.Timestamp eTime) {
    this.eTime = eTime;
  }


  public long getKId() {
    return kId;
  }

  public void setKId(long kId) {
    this.kId = kId;
  }


  public long getDId() {
    return dId;
  }

  public void setDId(long dId) {
    this.dId = dId;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
