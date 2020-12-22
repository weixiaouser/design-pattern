package com.weixiao.designpattern.singleton;

/**
 * @author :weixiao
 * @description :静态内部类实现单例模式
 * @date :2020/12/22 10:30
 * 优缺点说明
 * 静态内部类这种方式采用了类装载的机制来保证初始化实例时只有一个线程
 * 静态内部类方式在SingletonTest03类被装载时并不会立即实例化，而是在需要实例化时，
 * 调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化
 * 类都静态属性只会在第一次加载类都时候初始化，所以这里JVM帮我们保证了线程安全，
 * 在类进行初始化时，别的线程无法进入
 * 优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 推荐使用
 */
public class SingletonTest03 {

    private SingletonTest03(){}



    public static class StaticInnerClass{
        public static final SingletonTest03 instance = new SingletonTest03();
    }

    public SingletonTest03 getInstance(){
        return StaticInnerClass.instance;
    }

    public static void main(String[] args) {
        SingletonTest03 test03 = new SingletonTest03();
        SingletonTest03 test04 = new SingletonTest03();
        System.out.println(test03.getInstance() == test04.getInstance());
    }
}
