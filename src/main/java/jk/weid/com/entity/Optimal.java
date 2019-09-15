package jk.weid.com.entity;

import lombok.Data;
import java.util.List;

@Data
public class Optimal {

    private String id; //自增编号

    private String sort; //排序

    private String goodsNber;//商品编号

    private String codityName;//商品名称

    private String img; //商品图片(最多5张)

    private String pinMete;//商品销量(商品型号的销量之和)

    private String createTim; //推荐时间

    private String status;//促销状态(未退出-0|已退出-1)

    private String operator; //操作人

    private String jobnber; //工号


    private List<CodityModel> oneManyL;



    //时间范围查找
    private String time1;
    private String time2;



    public Optimal setCreateTim(String createTim) {
        this.createTim = createTim;
        return  this;
    }

    public Optimal setGoodsNber(String goodsNber) {
        this.goodsNber = goodsNber;
        return this;
    }

    public Optimal setPinMete(String pinMete) {
        this.pinMete = pinMete;
        return this;
    }


    public Optimal setStatus(String status) {
        this.status = status;
        return this;
    }


    public Optimal setOperator(String operator) {
        this.operator = operator;
        return this;
    }


    public Optimal setJobnber(String jobnber) {
        this.jobnber = jobnber;
        return this;
    }


}