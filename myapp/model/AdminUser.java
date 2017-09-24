package com.dotinstall.myapp.model;

class AdminUser extends User {
  AdminUser(String name) {
    super(name); // 親クラスのconstructor
  }

  void sayHello() {
    System.out.println("Hello, " + this.name);
  }

  @Override // アノテーション．メソッド名や引数が間違っているとエラーにしてくれる．
  void sayHi() {
    System.out.println("[admin] Hi, " + this.name);
  }

}
