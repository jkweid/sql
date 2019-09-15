package jk.weid.com.entity;

import lombok.Data;

@Data //订单详情表
public class OrderFull
{
    private String id;//编号
    private String orderNber;//订单号(关联订单表)-订单总编号
    private String sonNber ;//物流单号(作为拆单发货的标识)
    private String afterNber;//服务单号(作为商品退款的标识)
    private String userName;//用户唯一标识
    private String coditNber;//商品编号(关联商品表)
    private String coditNamer;//商品名称
    private String normNber;//商品规格编号(关联商品规格表)
    private String mName;//商品名称
    private String cmImg;//商品型号图片
    private String oddPrice;//单价
    private String amount;//购买数量
    private String totalPrice;//总价格
    private String ship;//0-待发货|1-已发货|2已完成|3-退款中|4-已退款|5-退款取消|6-待付款|7-待评价|8-已评价







    public OrderFull setSonNber(String sonNber)
    {
        this.sonNber = sonNber;
        return this;
    }

    public OrderFull setOrderNber(String orderNber) {
        this.orderNber = orderNber;
        return this;
    }


    public OrderFull setShip(String ship) {
        this.ship = ship;
        return this;
    }

}