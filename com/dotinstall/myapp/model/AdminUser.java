package com.dotinstall.myapp.model;

public class AdminUser extends User {
  public AdminUser(String name) {
    super(name); // 親クラスのconstructor
  }

  public void sayHello() {
    System.out.println("Hello, " + this.name);
  }

  @Override // アノテーション．メソッド名や引数が間違っているとエラーにしてくれる．
  public void sayHi() {
    System.out.println("[admin] Hi, " + this.name);
  }

}
