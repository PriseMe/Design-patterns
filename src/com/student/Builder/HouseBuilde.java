package com.student.Builder;

/**
 * @author promise
 * @version 1.0
 */
public abstract class HouseBuilde {
    public House house = new House();

    public  abstract void buildBasic();
    public  abstract void buildWell();
    public  abstract void buildroof();
    public   House getHouse(){
        return house;
    };




}
