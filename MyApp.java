class User {
  String name;

  // consructor
  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("Hi, " + this.name);
  }
}

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
