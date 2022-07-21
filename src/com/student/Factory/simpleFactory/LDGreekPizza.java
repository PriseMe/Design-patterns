package com.student.Factory.simpleFactory;

/**
 * @author promise
 * @version 1.0
 */
public class LDGreekPizza extends Pizza {
    public LDGreekPizza(String name) {
        super(name);
    }

    @Override
    public void prtpare() {
        System.out.println("GreekPizza......prtpare()");
    }
}
