package jk.weid.com.sqlyj;

import jk.weid.com.mper.SELECT;

import static jk.weid.com.sqlyj.SqlUtil.Mark;

public class Select
{
    private Object Obj;
    private String SELECT="";
    private String TABLE="";
    private String TERM="";
    private String LIKE="";
    private String LIMIT="";

    private String SELECT(String Filed)
    {
        return "SELECT "+Filed+" FROM ";
    }


    public Select(Object Obj)
    {
        this.Obj=Obj;
        this.SELECT=SELECT(SqlUtil.SelAllField(this.Obj));
    }
    public Select(String Filed)
    {
        this.SELECT=SELECT(SqlUtil.SelField(Filed));
    }
    public Select(Esing Esing)
    {
        this.SELECT="SELECT "+Esing.getSing();
    }


    //查找原表
    public Select RAWT()
    {
        this.TABLE=SqlUtil.RawTable(this.Obj);
        return this;
    }
    public Select RAWT(String TableName)
    {
        this.TABLE=Mark(TableName);
        return this;
    }




    //查找视图
    public Select VIEW()
    {
        this.TABLE=SqlUtil.ViwTable(this.Obj);
        return this;
    }



    public Select WhereOne(Eways Eways)
    {
        this.TERM=Where.WhereOne(Eways);
        return this;
    }


    public Select Limit(Integer Number)
    {
        this.LIMIT=Where.LIMIT(Number);
        return this;
    }
}
