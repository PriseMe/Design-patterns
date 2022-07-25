package com.student.Builder;

/**
 * @author promise
 * @version 1.0
 */
public class Cilent {
    public static void main(String[] args) {
        Buildedirector buildedirector = new Buildedirector(new commondHouse());
        System.out.println( buildedirector.constractBuilde());
    }
}
