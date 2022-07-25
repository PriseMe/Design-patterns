package com.student.Factory.simpleFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
