package com.weixiao.designpattern.singleton;

/**
 * @author :weixiao
 * @description :
 * @date :2020/12/22 14:44
 */
public class SingletonTest {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println("runtime="+runtime+" runtime2="+runtime2);
        System.out.println(runtime == runtime);

    }
}
