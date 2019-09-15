package jk.weid.com.entity;


import lombok.Data;

import java.util.List;

@Data //商城网页聊天消息模板
public class Muban
{
    private String id;
    private String nberId; //编号
    private String mubanName;//模板名称
    private String detail; //自动回复内容
    private String status; //状态(未选用(0)|已选用(1))


    private List<MubanWord> oneManyL;


    public Muban setMubanName(String mubanName) {
        this.mubanName = mubanName;
        return this;
    }


}