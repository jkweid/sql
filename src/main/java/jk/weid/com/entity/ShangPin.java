package jk.weid.com.entity;

import lombok.Data;

@Data //商品的视图
public class ShangPin
{
    private String id;//商品编号
    private String name;//商品类型名称
    private String online;//商品类型是否上线
    private String goodsNber;//商品的编号
    private String codityName;//商品名称
    private String img;//商品图片
    private String depict;//推荐语
    private String shelfSet;//上架设置:0立即上架|定时上架的时间
    private String status;//商品状态:0未上架|1已上架|2已下架|3在售中|4已售磬|5储存告急
    private String optimal;//标签-优选|新品
    private String show;//是否显示商品的原价
    //规格名称
    private String ctPrice;//成本价
    private String olPrice;//原价
    private String nowPrice;//现价
    //销量
    //价格
    private String createTim;//创建时间

    public ShangPin setName(String name) {
        this.name = name;
        return this;
    }


    public ShangPin setGoodsNber(String goodsNber) {
        this.goodsNber = goodsNber;
        return this;
    }


    public ShangPin setCodityName(String codityName) {
        this.codityName = codityName;
        return this;
    }


    public ShangPin setOptimal(String optimal) {
        this.optimal = optimal;
        return this;
    }


    public ShangPin setCreateTim(String createTim) {
        this.createTim = createTim;
        return this;
    }

}
