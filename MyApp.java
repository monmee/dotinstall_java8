public class MyApp {
  public static void sayHi(String name) {
    int x = 10;
    System.out.println("Hi, " + name);
  }

  public static void sayHi() {
    System.out.println("Hi, nobody" );
  }

  public static void main(String[] args) {
    sayHi();
    sayHi("Bob");
    // System.out.println(name);
    // System.out.println(x);
  }
}
