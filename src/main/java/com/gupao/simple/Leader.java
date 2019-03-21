package com.gupao.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * created by xuyahui on 2019/3/19
 */
public class Leader {

    private Map<String,IEmployee> targets = new HashMap<>();

    public Leader(){
        targets.put("login",new EmployeeA());
        targets.put("pay",new EmployeeB());
    }

    public void doing(String command){
        targets.get(command).doing(command);
    }


}
