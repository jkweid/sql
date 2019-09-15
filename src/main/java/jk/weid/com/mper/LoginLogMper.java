package jk.weid.com.mper;

import jk.weid.com.entity.LoginLog;
import jk.weid.com.sqlyj.SqlFile;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper @Repository //登录日志
public interface LoginLogMper extends SqlFile<LoginLog>{}
