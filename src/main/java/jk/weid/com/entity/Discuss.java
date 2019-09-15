package jk.weid.com.entity;

import lombok.Data;

@Data //商品评论
public class Discuss
{
    private String id;//编号

    /*评论来源的字段*/
    private String orNber;//订单编号
    private String goodsNber;//关联商品表标识
    private String goodName;//商品名称
    private String cmId; //商品型号id



    /*评论内容的字段*/
    private String avatar;//用户头像
    private String nickName;//用户昵称
    private String userName;//用户唯一标识
    private String score;//评分(1* 2** 3*** 4**** 5******)
    private String img;//#评论图片(最多4张)
    private String assess;//评价内容
    private String time;//评论时间



    /*评论回复相关的字段*/
    private String detail;//回复内容
    private String ryStatus;//回复并显示(y-显示)否(n-不显示)
    private String zhangHao;//账号-昵称
    private String replyTime;//回复时间

    private String status;//状态0-未处理|1-显示中|2-隐藏中



    //时间的范围查找
    private String time1;//时间范围1
    private String time2;//时间范围2


    public Discuss setStatus(String status)
    {
        this.status = status;
        return  this;
    }


}