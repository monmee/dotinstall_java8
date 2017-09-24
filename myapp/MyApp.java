package com.dotinstall.myapp;

public class MyApp {
  public static void main(String[] args) {

    // class
    User tom = new User("Tom");
    System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("Bob");
    System.out.println(bob.name);
    bob.sayHi();
    bob.sayHello();
  }
}
