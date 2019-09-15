package jk.weid.com.mper;

import jk.weid.com.entity.LoginLog;
import jk.weid.com.sqlyj.Esing;
import jk.weid.com.sqlyj.Eways;
import jk.weid.com.sqlyj.SqlUtil;
import lombok.SneakyThrows;
import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static jk.weid.com.sqlyj.SqlUtil.Lead;
import static jk.weid.com.sqlyj.SqlUtil.Mark;

public class INSERT
{
    private Object Obj;
    private String INSERT="";
    List<String> columns = new ArrayList();


    public String getINSERT() {
        return INSERT;
    }


    //添加单条数据
    public INSERT(Object Obj)
    {
        this.INSERT="INSERT INTO "+ SqlUtil.RawTable(Obj)+Columns(Obj)+" VALUES "+Values(Obj);
    }


    //添加单条数据时验证唯一值
    protected INSERT(Object Obj, Esing Esing)
    {
        this.INSERT="INSERT "+Esing.getSing()+" INTO "+SqlUtil.RawTable(Obj)+Columns(Obj)+" VALUES "+Values(Obj);
    }

    //添加数据时如果有重复值,将进行修改
    protected  INSERT(Object Obj, Eways Eways)
    {
        this.INSERT="INSERT INTO "+SqlUtil.RawTable(Obj)+Columns(Obj)+" VALUES "+Values(Obj);
        this.INSERT=this.INSERT+" ON DUPLICATE KEY UPDATE "+Mark(Eways.getPram()[0])+"="+Lead(Eways.getPram()[1]);
    }

    //添加多条数据
    public INSERT(List<Object> Obj)
    {
        this.INSERT="INSERT INTO "+SqlUtil.RawTable(Obj.get(0))+Columns(Obj.get(0))+" VALUES "+Values(Obj);
    }








    private String SqlClause(List<String> parts)
    {
        StringBuffer builder=new StringBuffer("(");
        for (int i = 0;i < parts.size(); i++)
        {
            builder.append(parts.get(i)+",");
        }
        SqlUtil.Remove(builder,",",",");
        builder.append(")");
        return builder.toString();
    }

    private  String Columns(Object Obj)
    {
        Field[] Field=SqlUtil.Fields(Obj);
        for(int i=1;i<Field.length;i++)
        {
            Field[i].setAccessible(true);
            columns.add(Mark(Field[i].getName()));
        }
        return SqlClause(columns);
    }
    @SneakyThrows(IllegalAccessException.class)
    private  String Values(Object Obj)
    {
        List<String> values = new ArrayList();
        Field[] Field=SqlUtil.Fields(Obj);
        for(int i=1;i<Field.length;i++)
        {
            Field[i].setAccessible(true);
            values.add(Lead(Field[i].get(Obj)+""));
        }
        return  SqlClause(values);
    }
    private String Values(List<Object> Obj)
    {
        StringBuffer builder=new StringBuffer();
        for(int i=0;i<Obj.size();i++)
        {
            builder.append(Values(Obj.get(i))+",");
        }
        return SqlUtil.Remove(builder,",",",");
    }

}
