package jk.weid.com.entity;

import lombok.Data;

@Data
public class CodityType
{
    private String id;//编号

    private String name;//分类名称

    private String img; //图片

    private String online; //是否上线0-否|1-是

    private String sort; //排序

    private String number;//商品的数量

    private String createtim; //创建时间


    public CodityType setOnline(String online) {
        this.online = online;
        return this;
    }

}