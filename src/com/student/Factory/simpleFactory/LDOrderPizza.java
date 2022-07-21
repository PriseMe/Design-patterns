package com.student.Factory.simpleFactory;

/**
 * @author promise
 * @version 1.0
 */
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String oderType) {
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
