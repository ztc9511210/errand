package com.errand.orderservice.web.rest.vm;


public class TbOrderListVM {

  private long id;
  private String orderId;
  private long userId;
  private long shopId;
  private double sendCost;
  private double totalMoney;
  private double discountMoney;
  private String couponId;
  private double couponMoney;
  private double payMoney;
  private long payWay;
  private long demandTime;
  private long addTime;
  private long status;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getShopId() {
    return shopId;
  }

  public void setShopId(long shopId) {
    this.shopId = shopId;
  }


  public double getSendCost() {
    return sendCost;
  }

  public void setSendCost(double sendCost) {
    this.sendCost = sendCost;
  }


  public double getTotalMoney() {
    return totalMoney;
  }

  public void setTotalMoney(double totalMoney) {
    this.totalMoney = totalMoney;
  }


  public double getDiscountMoney() {
    return discountMoney;
  }

  public void setDiscountMoney(double discountMoney) {
    this.discountMoney = discountMoney;
  }


  public String getCouponId() {
    return couponId;
  }

  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }


  public double getCouponMoney() {
    return couponMoney;
  }

  public void setCouponMoney(double couponMoney) {
    this.couponMoney = couponMoney;
  }


  public double getPayMoney() {
    return payMoney;
  }

  public void setPayMoney(double payMoney) {
    this.payMoney = payMoney;
  }


  public long getPayWay() {
    return payWay;
  }

  public void setPayWay(long payWay) {
    this.payWay = payWay;
  }


  public long getDemandTime() {
    return demandTime;
  }

  public void setDemandTime(long demandTime) {
    this.demandTime = demandTime;
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
