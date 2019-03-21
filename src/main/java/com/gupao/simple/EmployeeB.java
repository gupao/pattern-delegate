package com.gupao.simple;

/**
 * created by xuyahui on 2019/3/19
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，开始做" + command + "工作");
    }
}
