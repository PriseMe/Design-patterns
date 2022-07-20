package com.student.singleton;

/**
 * @author promise
 * @version 1.0
 */
public class singletontype02 {
    public static void main(String[] args) {
        Singletob instance01 = Singletob.getInstance();
        Singletob instance02 = Singletob.getInstance();
        System.out.println(instance01 == instance02);
    }
}

//静态变量
class Singletob02{
    //可用 但可能造成内春浪费 没有Lazy Loading
    //1.私有构造器方法，外部不能new
    private Singletob02(){

    }

    //2.本类内部创建对象实例
    private static Singletob02 instance ;
    //instance 在静态代码块创建
    static {
        instance = new Singletob02();
    }


    //3.提供一个公有的静态方法
    public static Singletob02 getInstance(){
        return instance;
    }

}
