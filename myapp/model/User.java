package com.dotinstall.myapp.model;

class User {
  String name;

  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("Hi, " + this.name);
  }
}
