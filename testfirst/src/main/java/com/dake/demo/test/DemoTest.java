package com.dake.demo.test;

public class DemoTest {
    public static void main(String[] args) {
        System.out.println(test(8));
    }

    /**
     * 判断应该数是不是偶数
     * @param a
     * @return
     */
    public static boolean test(int a){
        return (a&1)!=1;
    }
}
