package jk.weid.com.entity;


import lombok.Data;

@Data //物流记录表
public class Logistics
{
   private String id;//编号
   private String wrap;//包裹名称
   private String waybill;//物流单号
   private String firm;//物流公司
   private String code;//物流公司的代号
   private String number;//订单号
   private String sumCash;//总金额(代表订单的总金额)
   private String userName;//用户唯一标识
   private String receiver;//收货人
   private String tel;//手机号
   private String address;//收货地址
   private String cash;//(物流单的金额)
   private String freight;//运费
   private String status;//物流状态0-进行中|已完成(1)
   private String operator;//操作人
   private String jobNber;//工号
   private String createDate;//创建时间


    private String time1;//时间范围1

    private String time2;//时间范围2


    public Logistics setWaybill(String waybill) {
        this.waybill = waybill;
        return this;
    }


    public Logistics setNumber(String number) {
        this.number = number;
        return this;
    }


    public Logistics setStatus(String status) {
        this.status = status;
        return this;
    }

}