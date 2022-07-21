package com.student.Factory.commonly;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author promise
 * @version 1.0
 */
public class OrderPizza {


    public OrderPizza() {
        Pizza pizza = null;
        String ordertype = setordertype(); //Pizaa类型

        do {
            if (ordertype.equals("Greek")) {
                pizza = new GreekPizza(ordertype);
                System.out.println(pizza);
            } else if (ordertype.equals("Cheese")) {
                pizza = new CheesePizza(ordertype);
                System.out.println(pizza);
            } else { //增加一个类型 要修改代码 忘完是多处 故将创建Pizza的代码封装到一处 修改时只修改一处
                break;
            }
            pizza.prtpare();
            pizza.bake();
            pizza.cat();
            pizza.pakege();
        } while (pizza == null);
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
