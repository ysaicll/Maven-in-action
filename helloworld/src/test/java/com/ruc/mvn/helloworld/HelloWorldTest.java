package com.ruc.mvn.helloworld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class HelloWorldTest {
   @Test
   public void testHelloWorld(){
	   HelloWorld HW =new HelloWorld();
	   String res = HW.SayHello();
	   assertEquals("Hello",res);
   }
}
