package cn.bdqn.entity;


public class Koffice {

  private long id;
  private String kName;
  private String resume;
  private long isEmphasis;
  private long status;
  private String remark;
  private long medicalId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getKName() {
    return kName;
  }

  public void setKName(String kName) {
    this.kName = kName;
  }


  public String getResume() {
    return resume;
  }

  public void setResume(String resume) {
    this.resume = resume;
  }


  public long getIsEmphasis() {
    return isEmphasis;
  }

  public void setIsEmphasis(long isEmphasis) {
    this.isEmphasis = isEmphasis;
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


  public long getMedicalId() {
    return medicalId;
  }

  public void setMedicalId(long medicalId) {
    this.medicalId = medicalId;
  }

}
