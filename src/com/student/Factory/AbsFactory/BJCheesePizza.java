package com.student.Factory.AbsFactory;


/**
 * @author promise
 * @version 1.0
 */
public class BJCheesePizza extends Pizza {

    public BJCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prtpare() {
        System.out.println("GreekPizza......prtpare()");
    }


}
