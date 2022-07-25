package com.student.Bridege.Impl;

import com.student.Bridege.Brand;
import com.student.Bridege.Phone;

/**
 * @author promise
 * @version 1.0
 */
public class UpRigthPhone extends Phone {
   public UpRigthPhone(Brand brand) {
      super(brand);
   }

   @Override
   protected void opne() {
      super.opne();
      System.out.println("UpRigthPhone..........");

   }

   @Override
   protected void close() {
      super.close();
      System.out.println("UpRigthPhone..........");
   }

   @Override
   protected void called() {
      super.called();
      System.out.println("UpRigthPhone..........");
   }
}
