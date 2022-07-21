package com.student.singleton;

/**
 * @author promise
 * @version 1.0
 */
public class singletontype07{
    public static void main(String[] args) {
        Singletob07 instance01 = Singletob07.getInstance();
        Singletob07 instance02 = Singletob07.getInstance();
        System.out.println(instance01 == instance02);
    }
}


//静态变量
class Singletob07 {
    //1.私有构造器方法，外部不能new
    private Singletob07(){

    }

    //2.本类内部创建对象实例 加入volatile 推荐 //volatile 可以及时看到其他线程对变量的改变
    private static volatile Singletob07 instance ;

    //写一个静态内部类 该类中有一个静态属性
    public static class  SingletonInstace{
        private static final  Singletob07 instance = new Singletob07();
    }
    //3.提供一个公有的静态方法
    //加入了同步处理方法
    public static synchronized Singletob07 getInstance(){
        return SingletonInstace.instance;
    }

}
