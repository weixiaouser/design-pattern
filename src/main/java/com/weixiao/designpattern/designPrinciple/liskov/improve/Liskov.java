package com.weixiao.designpattern.designPrinciple.liskov.improve;

/**
 * @author :weixiao
 * @description :里氏替换原则
 * @date :2020/12/18 10:37
 */
public class Liskov {

    public static void main(String[] args) {

        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("----------------------");
        B b = new B();
        System.out.println("11+3="+b.func1(11,3));
        System.out.println("1+8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));

        System.out.println("----------");
        System.out.println("11-3="+b.func3(11,3));
    }
}
//创建一个基类，让A,B类都继承Base类
class Base{

}

class A extends Base {
    public int func1(int a,int b){
        return a-b;
    }
}

class B extends Base {
    //使用组合方式引入A
    private A a = new A();

    public int func1(int a,int b){
        return a + b;
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }

    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
