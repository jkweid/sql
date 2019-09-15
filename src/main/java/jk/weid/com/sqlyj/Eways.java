package jk.weid.com.sqlyj;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

public enum Eways
{
    EQ(new String[]{}),//等于
    NE(new String[]{}),//不等于
    GT(new String[]{}),//大于
    GE(new String[]{}),//大于等于
    LT(new String[]{}),//小于
    LE(new String[]{}),//小于等于
    UP(new String[]{}),//修改唯一列
    TB(new String[]{});//字段与表名

    private String[] Pram;

    protected String[] getPram() {
        return Pram;
    }
    public void setPram(String[] pram) {
        Pram = pram;
    }


    Eways(String[] Pram)
    {
        this.Pram=Pram;
    }

    public static Eways SetPram(Eways Eways,String[] Pram)
    {
        Eways.setPram(Pram);
        return Eways;
    }

}
