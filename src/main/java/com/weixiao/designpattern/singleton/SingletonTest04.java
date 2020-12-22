package com.weixiao.designpattern.singleton;

/**
 * @author :weixiao
 * @description :枚举创建单例
 * @date :2020/12/22 11:34
 *
 * 优缺点说明
 * 借助JDK1.5中添加的枚举来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建新的对象
 * 这种方式是Effective java作者josh Bloch提倡的方式
 * 推荐使用
 */
public enum SingletonTest04 {

    INSTANCE;

    public void sayOk(){
        System.out.println("ok~");
    }

    public static void main(String[] args) {
        System.out.println(SingletonTest04.INSTANCE.hashCode());
        System.out.println(SingletonTest04.INSTANCE.hashCode());
    }

}
