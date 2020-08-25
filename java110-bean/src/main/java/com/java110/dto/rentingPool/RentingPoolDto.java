package com.java110.dto.rentingPool;

import com.java110.dto.PageDto;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName FloorDto
 * @Description 房屋出租数据层封装
 * @Author wuxw
 * @Date 2019/4/24 8:52
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/
public class RentingPoolDto extends PageDto implements Serializable {

    private String latitude;
private String ownerTel;
private String rentingConfigId;
private String rentingDesc;
private String rentingTitle;
private String checkInDate;
private String rentingId;
private String roomId;
private String paymentType;
private String ownerName;
private String price;
private String state;
private String communityId;
private String longitude;


    private Date createTime;

    private String statusCd = "0";


    public String getLatitude() {
        return latitude;
    }
public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
public String getOwnerTel() {
        return ownerTel;
    }
public void setOwnerTel(String ownerTel) {
        this.ownerTel = ownerTel;
    }
public String getRentingConfigId() {
        return rentingConfigId;
    }
public void setRentingConfigId(String rentingConfigId) {
        this.rentingConfigId = rentingConfigId;
    }
public String getRentingDesc() {
        return rentingDesc;
    }
public void setRentingDesc(String rentingDesc) {
        this.rentingDesc = rentingDesc;
    }
public String getRentingTitle() {
        return rentingTitle;
    }
public void setRentingTitle(String rentingTitle) {
        this.rentingTitle = rentingTitle;
    }
public String getCheckInDate() {
        return checkInDate;
    }
public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }
public String getRentingId() {
        return rentingId;
    }
public void setRentingId(String rentingId) {
        this.rentingId = rentingId;
    }
public String getRoomId() {
        return roomId;
    }
public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
public String getPaymentType() {
        return paymentType;
    }
public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
public String getOwnerName() {
        return ownerName;
    }
public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
public String getPrice() {
        return price;
    }
public void setPrice(String price) {
        this.price = price;
    }
public String getState() {
        return state;
    }
public void setState(String state) {
        this.state = state;
    }
public String getCommunityId() {
        return communityId;
    }
public void setCommunityId(String communityId) {
        this.communityId = communityId;
    }
public String getLongitude() {
        return longitude;
    }
public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }
}