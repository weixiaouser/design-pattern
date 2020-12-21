package com.weixiao.designpattern.designPrinciple.liskov;

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
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}


class A {
    public int func1(int a,int b){
        return a-b;
    }
}

class B extends A{
    //此处子类覆写了父类的方法，导致程序出现意想不到的结果
    @Override
    public int func1(int a,int b){
        return a + b;
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }
}
