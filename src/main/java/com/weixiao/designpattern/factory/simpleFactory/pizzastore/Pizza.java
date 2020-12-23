package com.weixiao.designpattern.factory.simpleFactory.pizzastore;

/**
 * @author :weixiao
 * @description :
 * @date :2020/12/23 11:15
 */
public abstract class Pizza {

    private String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+ "烘焙工作。。。");
    }
    public void cut(){
        System.out.println(name+ "切割工作。。。");
    }
    public void box(){
        System.out.println(name+ "打包工作。。。");
    }

    public void setName(String name) {
        this.name = name;
    }
}
