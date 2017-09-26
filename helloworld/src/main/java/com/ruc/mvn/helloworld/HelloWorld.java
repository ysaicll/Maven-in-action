package com.ruc.mvn.helloworld;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
    public String SayHello(){
    	return "Hello";
    }
    public static void main(String[] args) {
		System.out.println(new HelloWorld().SayHello());
	}
}
