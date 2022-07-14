package com.javaLearn.again1;
public class HelloWorld {
  public static void main(String[] args) {

    boolean a = true ;
    boolean b = true ;
    boolean c = (a=(1==2))&(b=(1==2));

    System.out.println(c);
    System.out.println(a); //
    System.out.println(b); //
  }
}
