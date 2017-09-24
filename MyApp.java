final class User {
  protected String name;
  private static final double VERSION = 1.1; // 定数

  // constructor
  public User(String name) {
    this.name = name;
    User.VERSION = 1.2;
  }

  public final void sayHi() {
    System.out.println("Hi, " + this.name);
  }
}

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

public class MyApp {
  public static void main(String[] args) {
    User.getInfo(); // 0
    User tom = new User("tom");
    User.getInfo(); // 1
    User bob = new User("bob");
    User.getInfo(); // 2
  }
}
