package com.student.Factory.AbsFactory;



/**
 * @author promise
 * @version 1.0
 */
public class LDOrderPizza implements AbsFactory {
    @Override
    public Pizza createFactory( String oderType) {
        Pizza pizza = null;
        if (oderType.equals("Greek")) {
            pizza = new LDGreekPizza(oderType);
            System.out.println(pizza);
        } else if(oderType.equals("Cheese")) {
            pizza = new LDCheesePizza(oderType);
            System.out.println(pizza);
        }
        return pizza;
    }
}
