package jk.weid.com.entity;


import lombok.Data;

@Data
public class MallPower
{
    private String id; //自增id
    private String jobnber; //工号
    private String mallName; //账号
    private String salt; //盐值
    private String password;//密码
    private String encryptedPassword; //加密的密码
    private String identity; //身份
    private String authority; //权限
    private String status; //账号状态 0-未冻结|1-已冻结
    private String createdate; //创建时间


    public MallPower setCreatedate(String createdate) {
        this.createdate = createdate;
        return this;
    }


    public MallPower setId(String id) {
        this.id = id;
        return this;
    }


    public MallPower setJobnber(String jobnber) {
        this.jobnber = jobnber;
        return this;
    }


    public MallPower  setMallName(String mallname)
    {
        this.mallName = mallname == null ? null : mallname.trim();
        return this;
    }

    public MallPower setSalt(String salt) {
        this.salt = salt;
        return this;
    }

    public MallPower setPassword(String password)
    {
        this.password = password;
        return this;
    }

    public MallPower setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword ;
        return this;
    }


    public MallPower setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
        return this;
    }


    public MallPower setAuthority(String authority)
    {
        this.authority = authority == null ? null : authority.trim();
        return this;
    }


}