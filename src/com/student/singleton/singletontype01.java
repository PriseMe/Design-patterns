package com.student.singleton;

/**
 * @author promise
 * @version 1.0
 */
public class singletontype01 {
    public static void main(String[] args) {
        Singletob instance01 = Singletob.getInstance();
        Singletob instance02 = Singletob.getInstance();
        System.out.println(instance01 == instance02);
    }
}
class Singletob{
    //可用 但可能造成内春浪费 没有Lazy Loading
    //1.私有构造器方法，外部不能new
    private Singletob(){

    }

    //2.本类内部创建对象实例
    private final static Singletob instance = new Singletob();

    //3.提供一个公有的静态方法
    public static Singletob getInstance(){
        return instance;
    }

}
