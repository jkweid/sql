package jk.weid.com.entity;

import lombok.Data;

@Data   //历史聊天记录表
public class ChatDay
{
    private String id; //编号
    private String oddChain;//单链
    private String userName; //用户唯一标识
    private String nickName;//用户昵称
    private String mallId;//客服唯一标识
    private String mallName;//客服昵称
    private String newsNber;//聊天条数
    private String detail;//聊天详情
    private String createTime; //创建时间
    private String endTime;//结束时间



    //时间范围的查找
    private String time1;//时间1
    private String time2;//时间2


}