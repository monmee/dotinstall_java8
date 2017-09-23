public class MyApp {
  public static String sayHi(String name) {
    // System.out.println("Hi, " + name);
    return "Hi, " + name;
  }

  public static void main(String[] args) {
    String msg = sayHi("Tom");
    System.out.println(msg);

    sayHi("Bob");
  }
}
