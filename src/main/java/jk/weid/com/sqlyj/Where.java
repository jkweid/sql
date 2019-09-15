package jk.weid.com.sqlyj;

import static jk.weid.com.sqlyj.SqlUtil.Lead;
import static jk.weid.com.sqlyj.SqlUtil.Mark;

public class Where
{
    private static final String Where=" WHERE ";
    private static final String Limit=" LIMIT ";

    //单条件
    protected  static String  WhereOne(Eways Eways)
    {
        String[] Arr=Eways.getPram();
        return Where+Mark(Arr[0])+Sing(Eways)+Lead(Arr[1]);
    }
    //单条件的查找一条数据
    protected static String WhereOne1(Eways Eways)
    {
        return WhereOne(Eways)+" LIMIT 1";
    }

    //查找条数
    protected  static String LIMIT(Integer Number)
    {
        return Limit+Number;
    }
    //数据的分页查找
    protected static String Limit(Integer Page, int Size) {

        return  Limit+Start(Page,Size)+","+Size;
    }


    public static Integer Start(Integer Page, int Size) {
        Integer Start = 0;
        if (Page == null || "".equals(Page)) {
            Start = 0;
        } else {
            if (Page <= 0) {
                Start = 0;
            } else {
                Start = (Page - 1) * Size;
            }
        }
        return Start;
    }



    //匹配符号
    private static String Sing(Eways Eways)
    {
        switch (Eways)
        {
            case EQ:return "=";
            case NE:return "!=";
            case GT:return ">";
            case GE:return ">=";
            case LT:return "<";
            default:
                return "<=";
        }
    }
}
