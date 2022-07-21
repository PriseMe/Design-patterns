package com.student.Factory.AbsFactory;

/**
 * @author promise
 * @version 1.0
 */

/**
 *
 * 若是增加一个子类则要修改大量的代码
 *
 */
public abstract class Pizza {
    protected String name;

    //准备原料
    public abstract void prtpare();


    public  void bake(){
        System.out.println("pizza....bake()");
    };
    public  void cat(){
        System.out.println("pizza....cat()");
    };
    public  void pakege(){
        System.out.println("pizza....pakege()");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pizza(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"name\":").append(name)
                .append("}\n");
        return sb.toString();
    }
}
