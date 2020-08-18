package com.errand.orderservice.web.rest.vm;


public class Tb_Order_DetailVM {

  private long id;
  private String orderId;
  private String userUsername;
  private String userMobile;
  private long userAddressId;
  private String userAddress;
  private String userLongitude;
  private String userLatitude;
  private String shopShopname;
  private String shopMobile;
  private String shopAddress;
  private String shopLongitude;
  private String shopLatitude;
  private long deliverId;
  private String deliverName;
  private String deliverMobile;


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


  public String getUserUsername() {
    return userUsername;
  }

  public void setUserUsername(String userUsername) {
    this.userUsername = userUsername;
  }


  public String getUserMobile() {
    return userMobile;
  }

  public void setUserMobile(String userMobile) {
    this.userMobile = userMobile;
  }


  public long getUserAddressId() {
    return userAddressId;
  }

  public void setUserAddressId(long userAddressId) {
    this.userAddressId = userAddressId;
  }


  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }


  public String getUserLongitude() {
    return userLongitude;
  }

  public void setUserLongitude(String userLongitude) {
    this.userLongitude = userLongitude;
  }


  public String getUserLatitude() {
    return userLatitude;
  }

  public void setUserLatitude(String userLatitude) {
    this.userLatitude = userLatitude;
  }


  public String getShopShopname() {
    return shopShopname;
  }

  public void setShopShopname(String shopShopname) {
    this.shopShopname = shopShopname;
  }


  public String getShopMobile() {
    return shopMobile;
  }

  public void setShopMobile(String shopMobile) {
    this.shopMobile = shopMobile;
  }


  public String getShopAddress() {
    return shopAddress;
  }

  public void setShopAddress(String shopAddress) {
    this.shopAddress = shopAddress;
  }


  public String getShopLongitude() {
    return shopLongitude;
  }

  public void setShopLongitude(String shopLongitude) {
    this.shopLongitude = shopLongitude;
  }


  public String getShopLatitude() {
    return shopLatitude;
  }

  public void setShopLatitude(String shopLatitude) {
    this.shopLatitude = shopLatitude;
  }


  public long getDeliverId() {
    return deliverId;
  }

  public void setDeliverId(long deliverId) {
    this.deliverId = deliverId;
  }


  public String getDeliverName() {
    return deliverName;
  }

  public void setDeliverName(String deliverName) {
    this.deliverName = deliverName;
  }


  public String getDeliverMobile() {
    return deliverMobile;
  }

  public void setDeliverMobile(String deliverMobile) {
    this.deliverMobile = deliverMobile;
  }

}
