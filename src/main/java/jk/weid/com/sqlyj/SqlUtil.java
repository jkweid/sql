package jk.weid.com.sqlyj;

import lombok.SneakyThrows;
import org.apache.ibatis.jdbc.SQL;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SqlUtil
{
    //将实体类名转换成对应的数据库表名(表名必须是骆驼峰的形式)
    public static String toChar(String Stg)
    {
        return Stg.replace(Stg.charAt(0), Character.toLowerCase(Stg.charAt(0)));
    }

    protected static String Mark(String Filed)
    {
        return "`"+Filed+"`";
    }

    protected static String Lead(String value){return "'"+value+"'"+" ";}

    //将实体类名转换为数据库的表名
    protected static String RawTable(Object obj)
    {
        String table= SqlUtil.toChar(obj.getClass().getSimpleName());
        return Mark(table);
    }
    //将实体类名转换为数据库的视图名
    protected static String ViwTable(Object obj)
    {
        String table= SqlUtil.toChar(obj.getClass().getSimpleName());
        if(table.indexOf("V")>0)
        {
            return Mark(table);
        }
        else
        {
            return Mark(table + "V");
        }
    }


    //去除多余字符串的方法
    protected static String Remove(StringBuffer Str,String Pam1,String Pam2)
    {
        if (!Str.toString().equals(""))
        {
            Str.delete(Str.lastIndexOf(Pam1),Str.lastIndexOf(Pam2) + 1);
            return Str.toString();
        }
        return Str.toString();
    }

    //根据逗号进行切割
    protected static String[] Cutting(String Str)
    {
        String [] Arr=Str.split(",");
        return Arr;
    }


    //反射获取多个字段
    protected static Field[] Fields(Object Obj)
    {
        Field[] Fields = Obj.getClass().getDeclaredFields();
        return Fields;
    }
    /*================================================================================================================*/







    /*========================添加语句的生成==========================================================================*/
    public String Insert(Map<Object,Object> para)
    {
        Insert insert=(Insert)para.get("Obj");
        return insert.getINSERT();
    }
    /*================================================================================================================*/








    /*==================================================修改语句的生成================================================*/
    @SneakyThrows(IllegalAccessException.class)
    public static SQL SET(Object Obj, SQL sql)
    {
        Field[] fields = Obj.getClass().getDeclaredFields();
        for (Field field : fields)
        {
            field.setAccessible(true);
            //过滤掉为id的字段
            if ("id".equals(field.getName())) {
                continue;
            }
            if (field.get(Obj) != null && !"".equals(field.get(Obj)))
            {
                sql = sql.SET("`" + field.getName() + "`" + "=" + "'" + field.get(Obj) + "'");
            }
        }
        return sql;
    }
    /*================================================================================================================*/






    /*==================================================查找字段的生成================================================*/
    protected  static String SelAllField(Object Obj)
    {
        StringBuffer Sfr=new StringBuffer("");
        for(Field field:Fields(Obj))
        {
            field.setAccessible(true);
            //过滤有该注解的字段
            if (field.isAnnotationPresent(NoColumn.class))
            {
                continue;
            }
            else
            {
                Sfr.append(Mark(field.getName())+",");
            }
        }
        return Remove(Sfr,",",",");
    }
    //查询指定的表字段
    public  static String SelField(String str)
    {
        String[] fields=str.split(",");
        StringBuffer Sfr=new StringBuffer("");
        for (int i = 0; i < fields.length; i++)
        {
            Sfr.append(Mark(fields[i])+",");
        }
        return Remove(Sfr,",",",");
    }
    /*================================================================================================================*/


    //SQL语句的输出
    public String  RunSql(Map<String,Object> para)
    {
        return sql(para.get("Obj"));
    }


    @SneakyThrows(Exception.class)
    public static String sql(Object Obj)
    {
        StringBuffer SQL = new StringBuffer("");
        for (Field field :Fields(Obj))
        {
            field.setAccessible(true);
            if("Obj".equals(field.getName()))
            {
                continue;
            }
            SQL.append(field.get(Obj));
        }
        return SQL.toString();
    }

}
