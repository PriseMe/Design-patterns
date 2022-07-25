package com.student.Bridege.Impl;

import com.student.Bridege.Brand;

/**
 * @author promise
 * @version 1.0
 */
public class Huawei implements Brand {
    @Override
    public void open() {
        System.out.println("huawei open......");
    }

    @Override
    public void close() {
        System.out.println("huawei close......");

    }

    @Override
    public void called() {
        System.out.println("huawei called......");

    }
}
