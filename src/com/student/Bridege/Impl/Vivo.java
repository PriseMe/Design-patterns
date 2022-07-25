package com.student.Bridege.Impl;

import com.student.Bridege.Brand;

/**
 * @author promise
 * @version 1.0
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo open......");
    }

    @Override
    public void close() {
        System.out.println("Vivo close......");

    }

    @Override
    public void called() {
        System.out.println("Vivo called......");

    }
}
