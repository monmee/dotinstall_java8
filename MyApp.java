class User {
  String name;

  // consructor
  User(String name) {
    this.name = name;
  }

  // overload
  User() {
    // this.name = "Me";
    this("Me"); //Userの引数にMeを入れているのでconstructorが呼び出される．結果，"Hi, Me"が出力される．
  }

  void sayHi() {
    System.out.println("Hi, " + this.name);
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
