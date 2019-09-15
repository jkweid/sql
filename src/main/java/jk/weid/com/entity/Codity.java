package jk.weid.com.entity;

import lombok.Data;

import java.util.List;

@Data //商品表
public class Codity
{
    private String id;

    private String huoHao; //商品货号(系统生成永不重复的号)

    private String codityName; //商品名称

    private String typeId; //(关联商品分类表)

    private String typeName;//商品分类名

    private String pinMete; //商品销量

    private String stock; //商品库存

    private String depict; //推荐语

    private String img; //商品图片(最多5张)

    private String set; //运费设置

    private String arSale; //售后设置

    private String shelfSet; //上架设置:0立即上架|定时上架的时间

    private String status; //商品状态:0未上架|1在售中|2储存告急|3已售磬|4已下架

    private String optimal; //优选推荐(是0|否1)

    private String present ;//详情介绍(文字+图片)

    private String report; //参数报告(文字+图片)

    private String topic; //常见问题(文字+图片)

    private String createTim; //创建时间


    private List<CodityModel> codityModelList;//商品型号集合


    public Codity setCodityName(String codityName) {
        this.codityName = codityName.trim();
        return this;
    }

    public Codity setStatus(String status) {
        this.status = status;
        return this;
    }

}