package com.student.singleton;

/**
 * @author promise
 * @version 1.0
 */
public class singletontype06{
    public static void main(String[] args) {
        Singletob instance01 = Singletob.getInstance();
        Singletob instance02 = Singletob.getInstance();
        System.out.println(instance01 == instance02);
    }
}


//静态变量
class Singletob06 {
    //1.私有构造器方法，外部不能new
    private Singletob06(){

    }

    //2.本类内部创建对象实例 加入volatile 推荐
    private static volatile Singletob06 instance ;


    //3.提供一个公有的静态方法
    //加入了同步处理方法
    public static Singletob06 getInstance(){
        //用到的时候再去创建
        if (instance == null) {

            synchronized (Singletob06.class) {
                if (instance == null) {
                    instance = new Singletob06();
                }
            }
        }
        return instance;
    }

}
