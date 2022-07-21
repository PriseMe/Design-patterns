package com.student.Factory.simpleFactory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author promise
 * @version 1.0
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String oderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType = setordertype();//披萨类型

        do {
            pizza =createPizza(orderType);
            pizza.prtpare();
            pizza.bake();
            pizza.cat();
            pizza.pakege();
        }while (pizza == null);
    }


    public String setordertype(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("输入种类:");
            String str = bufferedReader.readLine();
            return str ;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
