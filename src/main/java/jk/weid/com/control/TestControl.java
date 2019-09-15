package jk.weid.com.control;

import jk.weid.com.entity.After;
import jk.weid.com.entity.LoginLog;
import jk.weid.com.mper.LoginLogMper;
import jk.weid.com.sqlyj.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestControl
{
    @Autowired
    private LoginLogMper loginLogMper;

    /**
     *说明:内部类的映射必须为静态类
     * @param Term(内部类)
     * @return
     */
    @PostMapping("/insert")
    public String Insert(@RequestBody After.Term Term)
    {
        System.out.println(Term.getTime1());
        return "映射成功";
    }

    @GetMapping("Sel1")
    public String test1(){

        loginLogMper.RunSelM(Sql.SelR(new LoginLog()));
        return "成功";
    }

    @GetMapping("Sel2")
    public String test2(){

        //SELECT `id`,`ip`,`place`,`identity`,`account`,`loginDate` FROM `loginlog` WHERE `id`='1'
        Eways.EQ.setPram(new String[]{"id","1"});
        loginLogMper.RunSelM(Sql.SelR(new LoginLog()).WhereOne(Eways.EQ));

        Eways.TB.setPram(new String[]{"id","loginLog"});
        loginLogMper.RunSelM(Sql.SelR(Eways.TB).WhereOne(Eways.EQ));

        return "成功";
    }

    @GetMapping("Insert1")
    public String test3()
    {
        List list=new ArrayList();
        LoginLog lg1=new LoginLog();
        lg1.setAccount("9999");

        LoginLog lg2=new LoginLog();
        lg2.setAccount("9999");

        list.add(lg1);list.add(lg2);
        loginLogMper.RunAdd(Sql.Add(list));

        return "成功";
    }

    @GetMapping("Insert2")
    public String test4()
    {
        LoginLog lg2=new LoginLog();
        lg2.setAccount("9999");
        loginLogMper.RunAdd(Sql.Add(lg2,Esing.IGNORE));
        return "成功";
    }

    @GetMapping("add")
    public String test5()
    {
        LoginLog lg2=new LoginLog();
        lg2.setAccount("9999");
        Eways.UP.setPram(new String[]{"ip","1"});
        loginLogMper.RunAdd(Sql.Add(lg2,Eways.UP));
        return "成功";
    }
}
