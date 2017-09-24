class User {
  private String name;
  private static int count; // クラス変数

  // static イニシャライザ
  static {
    User.count = 0;
    System.out.println("Static initializer: ");
  }

  // instance イニシャライザ
  {
    System.out.println("Instance initializer: ");
  }

  // constructor 
  public User(String name) {
    this.name = name;
    User.count++;
    System.out.println("Constructor");
  }

  public static void getInfo() { // クラスメソッド
    System.out.println("# of instances: " + User.count);
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
