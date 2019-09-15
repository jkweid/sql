package jk.weid.com.entity;

import lombok.Data;
import java.util.List;


@Data //订单表
public class Order
{
   private String id;//编号
   private String orderNber;//订单号(系统生成永不重复的订单号)
   private String PayNumber;//支付成功后产生的支付订单号
   private String userName;//用户唯一标识
   private String nickName;//用户昵称
   private String consignee;//收货人
   private String phoneNber;//手机号
   private String address;//收货地址
   private String cotPrice;//订单总价
   private String payMode;//(支付宝/微信)
   private String payHem;//支付关闭时间
   private String totalCash;//商品总金额
   private String fare;//运费
   private String buyAmount;//购买的商品总件数
   private String orCount;//已生成的物流单数(记录该单被拆成多少个物流单)
   private String notAmount;//未发货的商品件数(记录还剩余多少件未发货的商品)
   private String ebbAmount;//退款的件数(作为用户申请退款的标识)
   private String mge;//买家留言
   private String status;//状态(待付款-0|待发货-1|进行中-2|已完成-3[所有的商品都发货了]|已取消-4(只要有退款的商品都归属到已取消)
   private String createTime;//下单时间
   private String recallTime;//取消时间
   private String payTime;//支付时间
   private String fulfilTime;//完成时间



    private String time1;//时间范围查找1
    private String time2;//时间范围查找2

    private List<OrderFull> orderFullList;


    public Order setOrderNber(String orderNber) {
        this.orderNber = orderNber;
        return this;
    }


    public Order setStatus(String status) {
        this.status = status;
        return this;
    }


}