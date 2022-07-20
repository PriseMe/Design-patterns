package com.student.singleton;

/**
 * @author promise
 * @version 1.0
 */
public class singletontype04 {
    public static void main(String[] args) {
        Singletob instance01 = Singletob.getInstance();
        Singletob instance02 = Singletob.getInstance();
        System.out.println(instance01 == instance02);
    }
}


//静态变量
class Singletob04 {
    //可用 线程不安全 只能在单线程使用 多线程下如果一个现场进入判断 还没有往下执行 另一个线程进入 造成多个线程判断
    //1.私有构造器方法，外部不能new
    private Singletob04(){

    }

    //2.本类内部创建对象实例
    private static Singletob04 instance ;


    //3.提供一个公有的静态方法
    //加入了同步处理方法 synchronized 结果是效率低！！ 不推荐
    public static synchronized Singletob04 getInstance(){
        //用到的时候再去创建
        if (instance == null){
            instance = new Singletob04();
        }else{
        }
        return instance;
    }

}
