package com.student.Builder;

/**
 * @author promise
 * @version 1.0
 */
public class Buildedirector {
    public HouseBuilde houseBuilde;
    public Buildedirector(HouseBuilde houseBuilde){
        this.houseBuilde = houseBuilde;
    }

    public House constractBuilde(){
        houseBuilde.buildBasic();
        houseBuilde.buildWell();
        houseBuilde.buildroof();

        return  houseBuilde.getHouse();
    }

}
