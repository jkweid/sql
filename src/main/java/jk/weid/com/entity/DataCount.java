package jk.weid.com.entity;

//数据统计的相关表结构
public class DataCount
{
    private String id; //编号
    //统计类型(访问数【App\H5】|浏览量【App\H5】|订单数【App\H5】|付款人数【App\H5】|付款金额【App\H5】
    private String countType;
    private String count; //计数
    private String createDate; //创建时间(年/月/天)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountType() {
        return countType;
    }

    public DataCount setCountType(String countType) {
        this.countType = countType;
        return this;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }


    //实时关键数据的辅助类
    public class percent
    {
        private String percent;//百分比
        private String depict;//上升|下降

        public String getPercent() {
            return percent;
        }

        public void setPercent(String percent) {
            this.percent = percent;
        }

        public String getDepict() {
            return depict;
        }

        public void setDepict(String depict) {
            this.depict = depict;
        }
    }

    //详细数据
    public class detailed
    {
        //类型(App|h5)
        private String type;
        //访问数/浏览量/订单数/付款人数/付款金额
        private String countType;
        //时间查找1(7|14|30|2019/03/01)
        private String tim1;
        //时间查找2(2019/03/02)
        private String tim2;

        public String getCountType() {
            return countType;
        }

        public void setCountType(String countType) {
            this.countType = countType;
        }

        public String getTim1() {
            return tim1;
        }

        public void setTim1(String tim1) {
            this.tim1 = tim1;
        }

        public String getTim2() {
            return tim2;
        }

        public void setTim2(String tim2) {
            this.tim2 = tim2;
        }


        public String getType() {
            return type;
        }
        public void setType(String type) {
            this.type = type;
        }

        public void setAccess(String countType)
        {
            if(type.equals("App"))
            {
                this.countType = countType+"App";
            }
            else
            {
                this.countType = countType+"H5";
            }
        }


    }

    public class dataCForm
    {
        private String tiem;
        private String accessApp="0";
        private String accessH5="0";
        private String scanApp="0";
        private String scanH5="0";
        private String orderApp="0";
        private String orderH5="0";
        private String payApp="0";
        private String payH5="0";
        private String moneyApp="0";
        private String moneyH5="0";

        public String getTiem() {
            return tiem;
        }

        public void setTiem(String tiem) {
            this.tiem = tiem;
        }

        public String getAccessApp() {
            return accessApp;
        }

        public void setAccessApp(String accessApp) {
            this.accessApp = accessApp;
        }

        public String getAccessH5() {
            return accessH5;
        }

        public void setAccessH5(String accessH5) {
            this.accessH5 = accessH5;
        }

        public String getScanApp() {
            return scanApp;
        }

        public void setScanApp(String scanApp) {
            this.scanApp = scanApp;
        }

        public String getScanH5() {
            return scanH5;
        }

        public void setScanH5(String scanH5) {
            this.scanH5 = scanH5;
        }

        public String getOrderApp() {
            return orderApp;
        }

        public void setOrderApp(String orderApp) {
            this.orderApp = orderApp;
        }

        public String getOrderH5() {
            return orderH5;
        }

        public void setOrderH5(String orderH5) {
            this.orderH5 = orderH5;
        }

        public String getPayApp() {
            return payApp;
        }

        public void setPayApp(String payApp) {
            this.payApp = payApp;
        }

        public String getPayH5() {
            return payH5;
        }

        public void setPayH5(String payH5) {
            this.payH5 = payH5;
        }

        public String getMoneyApp() {
            return moneyApp;
        }

        public void setMoneyApp(String moneyApp) {
            this.moneyApp = moneyApp;
        }

        public String getMoneyH5() {
            return moneyH5;
        }

        public void setMoneyH5(String moneyH5) {
            this.moneyH5 = moneyH5;
        }

    }

}