package jk.weid.com.sqlyj;

public enum Esing {

    eq("="),//等于
    ne("<>"),//不等于
    gt(">"),//大于
    ge(">="),//大于等于
    lt("<"),//小于
    le("<="), //小于等于
    lf(""), //%左边
    rt(""), //右边%
    bh(""), //%两边%
    IGNORE("IGNORE"),//添加数据的同时验证唯一值
    LAST_INSERT_ID("LAST_INSERT_ID() AS id"),
    IDENTITY("@@IDENTITY AS id");

    /**
     * 私有构造,防止被外部调用
     * @param sing
     */
    private Esing (String sing)
    {
        this.sing=sing;
    }

    private String sing;//中文描述

    public String getSing() {return sing;}
    public void setSing(String sing)
    {
        this.sing=sing;
    }


}
