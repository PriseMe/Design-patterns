package com.student.Bridege;

import com.student.Bridege.Impl.Huawei;
import com.student.Bridege.Impl.SildePhone;

/**
 * @author promise
 * @version 1.0
 */
public class ClientTest {
   public static void main(String[] args) {
      Phone phone = new SildePhone(new Huawei());
      phone.opne();
      phone.close();
      phone.called();
   }
}
