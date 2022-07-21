package com.student.Factory.AbsFactory;

/**
 * @author promise
 * @version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJOrderPizza());
    }
}
