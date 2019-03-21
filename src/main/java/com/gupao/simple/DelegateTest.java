package com.gupao.simple;

/**
 * created by xuyahui on 2019/3/19
 */
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("pay",new Leader());
    }

}
