package jk.weid.com.sqlyj;

import java.util.List;

public class Sql
{


    public static Insert Add(Object Obj)
    {
        return new Insert(Obj);
    }

    public static Insert Add(List<Object> Obj)
    {
        return new Insert(Obj);
    }

    public static Insert Add(Object Obj,Esing Esing )
    {
        return  new Insert(Obj, Esing);
    }

    public static Insert Add(Object Obj,Eways Eways)
    {
        return new Insert(Obj,Eways);
    }





    public static Select SelR(Object Obj) {
        return new Select(Obj).RAWT();
    }

    public static Select SelR(Eways Eways) {
        return new Select(Eways.getPram()[0]).RAWT(Eways.getPram()[1]);
    }

    public static Select SelR(Esing Esing) {
        return new Select(Esing);
    }

}