package com.errand.orderservice.web.rest.vm;


public class Tb_Deliver_LincenseVM {

  private long id;
  private long deliverId;
  private String idcardNum;
  private String idcardImg;
  private String idcardImgBack;
  private double bondMoney;
  private String healthImg;
  private String images;
  private long addTime;
  private long status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDeliverId() {
    return deliverId;
  }

  public void setDeliverId(long deliverId) {
    this.deliverId = deliverId;
  }


  public String getIdcardNum() {
    return idcardNum;
  }

  public void setIdcardNum(String idcardNum) {
    this.idcardNum = idcardNum;
  }


  public String getIdcardImg() {
    return idcardImg;
  }

  public void setIdcardImg(String idcardImg) {
    this.idcardImg = idcardImg;
  }


  public String getIdcardImgBack() {
    return idcardImgBack;
  }

  public void setIdcardImgBack(String idcardImgBack) {
    this.idcardImgBack = idcardImgBack;
  }


  public double getBondMoney() {
    return bondMoney;
  }

  public void setBondMoney(double bondMoney) {
    this.bondMoney = bondMoney;
  }


  public String getHealthImg() {
    return healthImg;
  }

  public void setHealthImg(String healthImg) {
    this.healthImg = healthImg;
  }


  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }


  public long getAddTime() {
    return addTime;
  }

  public void setAddTime(long addTime) {
    this.addTime = addTime;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }

}
