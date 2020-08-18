package com.errand.orderservice.web.rest.vm;


public class Tb_DeliverVM {

  private long id;
  private String username;
  private String mobile;
  private String password;
  private double score;
  private long monthTaskNum;
  private long totalTaskNum;
  private long status;
  private long addTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }


  public long getMonthTaskNum() {
    return monthTaskNum;
  }

  public void setMonthTaskNum(long monthTaskNum) {
    this.monthTaskNum = monthTaskNum;
  }


  public long getTotalTaskNum() {
    return totalTaskNum;
  }

  public void setTotalTaskNum(long totalTaskNum) {
    this.totalTaskNum = totalTaskNum;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }

}
