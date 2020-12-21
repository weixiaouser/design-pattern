package com.weixiao.designpattern.singleton;

/**
 * @author :weixiao
 * @description :懒汉式单例
 * 优缺点
 * 起到Lazy Loading的效果，但是只能在单线程下使用
 * 如果在多线程下，一个线程进入了if(instance == null) 判断语句块，还未来得及往下执行，
 * 另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可使用这种方式
 * 结论：在实际开发中，不要使用这种方式
 * @date :2020/12/21 14:27
 */
public class SingletonTest02 {

    private static  SingletonTest02 instance = null;

    private SingletonTest02(){}

    public static SingletonTest02 getInstance(){
        if (instance == null) {
            synchronized (SingletonTest02.class) {
                if (instance == null) {
                    instance = new SingletonTest02();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonTest02 instance = SingletonTest02.getInstance();
        SingletonTest02 instance2 = SingletonTest02.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance2.hashCode="+instance2.hashCode());
    }
}
