package com.student.singleton;

/**
 * @author promise
 * @version 1.0
 */
public class singletontype08 {
    public static void main(String[] args) {
        Singletonenum instance01 = Singletonenum.INSTANCE;
        Singletonenum instance02 = Singletonenum.INSTANCE;
    }
}
enum Singletonenum{
    INSTANCE;

}
