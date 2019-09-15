package jk.weid.com.entity;

import lombok.Data;

@Data
public class Market
{
    private String id; //编号

    private String number;//编号

    private String marketName;//活动名称

    private String marketImg;//分类图片

    private String site;//活动位置(首页|商品推荐)

    private String sort; //排序

    private String type; //活动类型(默认无)-链接-商品

    private String setTime;//活动时间(默认无|开始时间)

    private String endTime;//活动结束时间

    private String onlineSet;//上线设置,0(立即)|定时上线

    private String clickNber;//点击数

    private String closeType; //关闭类型0-已上线|1-已下线|2-未上线|3-已结束

    private String createTim; //创建的时间

    private Integer start;//分页的起始位置

    private Integer size;//条数


    //时间范围的查找
    private String time1;
    private String time2;


    private String number1;

    private String number2;


    public Market setId(String id) {
        this.id = id;
        return this;
    }


    public Market setSite(String site) {
        this.site = site;
        return this;
    }


    public Market setCloseType(String closeType) {
        this.closeType = closeType;
        return this;
    }



}