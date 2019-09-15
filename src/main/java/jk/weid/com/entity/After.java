package jk.weid.com.entity;

import lombok.Data;

@Data //售后(退款服务记录表)
public class After
{

   private String id;//编号
   private String afterOrder;//服务单号(系统生成永不重复的号)
   private String orderNber;//订单号,#关联订单表(-订单编号)
   private String wuliuNber;//物流单号
   private String PayNumber;//支付单号
   private String userName;//用户唯一标识
   private String consignee;//收货人
   private String phoneNber;//手机号
   private String address;//收货地址
   private String cotPrice;//总价
   private String origin;//申请原因
   private String img;//图片
   private String type;//售后类型
   private String gold;//退款金额
   private String status;//状态(待处理(0)|协商中(1)|已接受(2)|已退款(3)|申请取消(4))
   private String consult;//协商内容
   private String buyer;//买家地址
   private String createTim;//申请时间
   private String recallTim;//取消时间
   private String consultTim;//协商时间
   private String fulfilTim;//完成时间


    @Data
   public class AfterDate
   {
       private String afterOrder; //服务单号
       private String orderNber; //订单号
       private String wuliuNber; //物流号
       private String mName; //商品型号名称
       private String cmImg; //商品型号图片
       private String amount; //购买数量
       private String recallTim;//取消时间
       private String fulfilTim;//完成时间

       public String getAfterOrder() {
           return afterOrder;
       }

       public void setAfterOrder(String afterOrder) {
           this.afterOrder = afterOrder;
       }

       public String getOrderNber() {
           return orderNber;
       }

       public void setOrderNber(String orderNber) {
           this.orderNber = orderNber;
       }

       public String getWuliuNber() {
           return wuliuNber;
       }

       public void setWuliuNber(String wuliuNber) {
           this.wuliuNber = wuliuNber;
       }

       public String getmName() {
           return mName;
       }

       public void setmName(String mName) {
           this.mName = mName;
       }

       public String getCmImg() {
           return cmImg;
       }

       public void setCmImg(String cmImg) {
           this.cmImg = cmImg;
       }

       public String getAmount() {
           return amount;
       }

       public void setAmount(String amount) {
           this.amount = amount;
       }

       public String getRecallTim() {
           return recallTim;
       }

       public void setRecallTim(String recallTim) {
           this.recallTim = recallTim;
       }

       public String getFulfilTim() {
           return fulfilTim;
       }

       public void setFulfilTim(String fulfilTim) {
           this.fulfilTim = fulfilTim;
       }

   }

   @Data
   public static class Term
   {
       //时间的查找范围
       private String time1;//时间范围查找1
       private String time2;//时间范围查找2
   }


    public After setAfterOrder(String afterOrder) {
        this.afterOrder = afterOrder;
        return this;
    }


    public After setStatus(String status) {
        this.status = status;
        return this;
    }


}