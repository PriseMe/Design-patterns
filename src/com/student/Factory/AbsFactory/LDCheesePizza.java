package com.student.Factory.AbsFactory;

/**
 * @author promise
 * @version 1.0
 */
public class LDCheesePizza extends Pizza {


    public LDCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prtpare() {
        System.out.println("GreekPizza......prtpare()");
    }
}
