package jk.weid.com.sqlyj;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SqlFile<T>
{
    //运行添加的语句
    @InsertProvider(type=SqlUtil.class,method ="Insert")
    int RunAdd(@Param("Obj") Object Obj);


    //运行删除的语句
    @DeleteProvider(type=SqlUtil.class,method ="RunSql")
    int RunDel(@Param("Obj") Object Obj);


    //运行修改的语句
    @UpdateProvider(type=SqlUtil.class,method ="RunSql")
    int RunUpd(@Param("Obj") Object Obj);


    //运行查找多条的语句
    @SelectProvider(type=SqlUtil.class,method ="RunSql")
    List<T> RunSelM(@Param("Obj") Object Obj);


    //运行查找一条数据
    @SelectProvider(type=SqlUtil.class,method ="RunSql")
    T RunSelO(@Param("Obj") Object Obj);


    //运行只查询表中某个字段的值
    @SelectProvider(type=SqlUtil.class,method ="RunSql")
    String RunSelV(@Param("Obj") Object Obj);


    //运行统计数据
    @SelectProvider(type=SqlUtil.class,method ="RunSql")
    int RunCount(@Param("Obj") Object Obj);

}
