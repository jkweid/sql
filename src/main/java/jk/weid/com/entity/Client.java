package jk.weid.com.entity;


import lombok.Data;

@Data //客户(当用户付款的时候才添加数据)
public class Client
{
    private String id; //编号
    private String userName; //用户名---关联user表
    private String nickName; //用户昵称
    private String tel; //手机号
    private String gender;//性别
    private String age;//年龄
    private String birthday;//出生日期
    private String role; //客户类型
    private String number; //交易数
    private String amount; //交易累计金额
    private String address; //收货地址

    //年龄范围的查找
    private String age1;//年龄的范围字段1
    private String age2;//年龄的范围字段2

    //金额范围
    private String amount1;//金额范围1
    private String amount2;//金额范围2

    private Integer start;//分页的起始位置

    private Integer size;//条数
}