package jk.weid.com.entity;

public class ShanPinlv
{
    private String id;//编号
    private String cyNber;//商品(关联商品表)
    private String cmNber;//货号
    private String callNber;//访问数
    private String catNber;//购物车数
    private String catlv;//转化率
    private String odrNber;//下单数
    private String odrlv;//转化率
    private String payNber;//支付数
    private String paylv;//转化率
    private String wholeNber;//完成数
    private String wholelv;//转化率
    private String finallv;//最终转化率

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCyNber() {
        return cyNber;
    }

    public void setCyNber(String cyNber) {
        this.cyNber = cyNber;
    }

    public String getCmNber() {
        return cmNber;
    }

    public void setCmNber(String cmNber) {
        this.cmNber = cmNber;
    }

    public String getCallNber() {
        return callNber;
    }

    public void setCallNber(String callNber) {
        this.callNber = callNber;
    }

    public String getCatNber() {
        return catNber;
    }

    public void setCatNber(String catNber) {
        this.catNber = catNber;
    }

    public String getCatlv() {
        return catlv;
    }

    public void setCatlv(String catlv) {
        this.catlv = catlv;
    }

    public String getOdrNber() {
        return odrNber;
    }

    public void setOdrNber(String odrNber) {
        this.odrNber = odrNber;
    }

    public String getOdrlv() {
        return odrlv;
    }

    public void setOdrlv(String odrlv) {
        this.odrlv = odrlv;
    }

    public String getPayNber() {
        return payNber;
    }

    public void setPayNber(String payNber) {
        this.payNber = payNber;
    }

    public String getPaylv() {
        return paylv;
    }

    public void setPaylv(String paylv) {
        this.paylv = paylv;
    }

    public String getWholeNber() {
        return wholeNber;
    }

    public void setWholeNber(String wholeNber) {
        this.wholeNber = wholeNber;
    }

    public String getWholelv() {
        return wholelv;
    }

    public void setWholelv(String wholelv) {
        this.wholelv = wholelv;
    }

    public String getFinallv() {
        return finallv;
    }

    public void setFinallv(String finallv) {
        this.finallv = finallv;
    }
}
