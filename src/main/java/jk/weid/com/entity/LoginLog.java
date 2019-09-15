package jk.weid.com.entity;
import lombok.Data;


@Data
public class LoginLog
{
    private String id; //自增列
    private String ip;//Ip地址
    private String place;//登录地点
    private String identity;//身份
    private String account;//账号
    private String logDate;//日志创建时间
}
