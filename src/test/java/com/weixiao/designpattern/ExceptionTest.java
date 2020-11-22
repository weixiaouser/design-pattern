package com.weixiao.designpattern;

/**
 * @author :weixiao
 * @description :
 * @date :2020/7/28 17:31
 */
public class ExceptionTest {

    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        }catch (Exception e){
            System.out.println(e);
        } finally {
            return;
        }
    }
}
