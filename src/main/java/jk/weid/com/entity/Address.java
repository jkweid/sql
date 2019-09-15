package jk.weid.com.entity;

import lombok.Data;

@Data
public class Address
{

   private String id;//自增编号
   private String userName;//用户的标识(来自于user表的userName)
   private String consignee;//收货人
   private String phoneNber;//手机号
   private String area;//所在地区
   private String areaDetails;//详情地址
   private String frozen;//#0(不是默认地址)1(是默认地址)


   public Address setUserName(String userName) {
        this.userName = userName;
        return this;
   }


    public Address setFrozen(String frozen)
    {
        this.frozen = frozen;
        return this;
    }
}