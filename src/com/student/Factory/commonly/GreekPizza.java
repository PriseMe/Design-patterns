package com.student.Factory.commonly;

/**
 * @author promise
 * @version 1.0
 */
public class GreekPizza extends Pizza{
    public GreekPizza(String name) {
        super(name);
    }

    @Override
    public void prtpare() {
        System.out.println("GreekPizza......prtpare()");
    }
}
