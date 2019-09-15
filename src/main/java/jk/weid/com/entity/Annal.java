package jk.weid.com.entity;

import lombok.Data;

@Data
public class Annal {

    private String id;//自增编号
    private String msgType;//活动\物流\服务
    private String cose;//编号
    private String userName;//用户的唯一标识
}
