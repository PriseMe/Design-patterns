package com.student.Factory.commonly;

/**
 * @author promise
 * @version 1.0
 */
public class CheesePizza extends Pizza{
    public CheesePizza(String name) {
        super(name);
    }

    @Override
    public void prtpare() {
        System.out.println("GreekPizza......prtpare()");
    }


}
