package com.student.Bridege;

/**
 * @author promise
 * @version 1.0
 */
public abstract class Phone {
   private Brand brand;

   public  Phone( Brand brand){
      super();
      this.brand = brand;
   }
   protected void opne(){
      this.brand.open();
   }
   protected void close(){
      this.brand.close();
   }
   protected void called(){
      this.brand.called();
   }
}
