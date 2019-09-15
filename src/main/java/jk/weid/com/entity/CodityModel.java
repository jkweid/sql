package jk.weid.com.entity;

import lombok.Data;

@Data //商品型号表
public class CodityModel
{
    private String id;//自增
    private String cyNber ;//关联商品货号
    private String cmlId  ;//型号(永不重复)
    //private String array;//商品的序列
    private String mName;//型号名称
    private String mImg;//图片
    private String show;//是否显示原价
    private String ctPrice;//成本价
    private String olPrice;//原价
    private String nowPrice;//现价
    private String pinMete;//销量
    private String typeStock;//型号库存


    public CodityModel setCyNber(String cyNber) {
        this.cyNber = cyNber;
        return this;
    }


}