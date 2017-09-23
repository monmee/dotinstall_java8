class User {
  String name = "ME!";

  void sayHi() {
    System.out.println("Hi!");
  }
}

public class MyApp {
  public static void main(String[] args) {

    // class
    User tom;
    tom = new User(); // インスタンス

    System.out.println(tom.name);
    tom.sayHi();
  }
}
