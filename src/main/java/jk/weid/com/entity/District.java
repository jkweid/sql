package jk.weid.com.entity;

import lombok.Data;

@Data //行政表
public class District {

    private Integer id; //自增列

    private String code; //编码

    private String parent; //关联

    private String name; //(省/市/区/县(街道)名称)


    public District setCode(String code) {
        this.code = code == null ? null : code.trim();
        return this;
    }

}