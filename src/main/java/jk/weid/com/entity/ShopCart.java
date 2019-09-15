package jk.weid.com.entity;

//购物车
public class ShopCart
{
    private String id;//编号

    private String userName; //用户的标识(来自于user表的username)

    private String goodsNber; //商品的唯一标识(商品表)

    private String cmNber;//商品的规格编号

    private String shopNber;//商品规格的数量

    private String timestamp; //创建的时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGoodsNber() {
        return goodsNber;
    }

    public void setGoodsNber(String goodsNber) {
        this.goodsNber = goodsNber;
    }

    public String getShopNber() {
        return shopNber;
    }

    public void setShopNber(String shopNber) {
        this.shopNber = shopNber;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCmNber() {return cmNber;}

    public void setCmNber(String cmNber) {this.cmNber = cmNber;}
}