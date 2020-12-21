package com.weixiao.designpattern.singleton;

/**
 * @author :weixiao
 * @description :饿汉式单例（静态常量）
 * @date :2020/12/21 13:50
 *优缺点
 * 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题
 * 缺点：在类装载都时候完成实例化，没有达到lazy loading的效果，如果从始至终都未使用过这个实例，则会造成内存都浪费
 * 这种方式基于classloder机制避免类多线程都同步问题，不过，instance在类装载时就实例化，在单例模式中大多数都是调用getInstance方法，
 * 但是导致类装载都原因有很多种，因此不能确定有其他都方式（或者其他都静态方法）导致类装载，
 * 这时候初始化instance就没有达到lazy loading的效果
 * 这种单例模式可用，可能造成内存浪费
 */
public class SingletonTest01 {

    //本类内部创建对象实例
    private static final SingletonTest01 instance = new SingletonTest01();

    /**
     * 单例模式构造器私有
     */
    private SingletonTest01(){}

    /**
     * 提供一个公有都方法供外部调用
     * @return
     */
    public static SingletonTest01 getInstance(){
        return instance;
    }


    public static void main(String[] args) {
        SingletonTest01 instance = SingletonTest01.getInstance();
        SingletonTest01 instance1 = SingletonTest01.getInstance();
        System.out.println(instance ==instance1);
        System.out.println("instance.hashCode="+instance.hashCode());
        System.out.println("instance1.hashCode="+instance1.hashCode());
    }
}
