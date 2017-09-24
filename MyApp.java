// 列挙型(enum)

enum Result {
  SUCCESS, // 0
  ERROR,   // 1
}

public class MyApp {
  public static void main(String[] args) {
    Result res;

    res = Result.ERROR;

    switch (res) {
      case SUCCESS:
        System.out.println("OK");
        System.out.println(res.ordinal()); // 0
        break;
      case ERROR:
        System.out.println("NG");
        System.out.println(res.ordinal()); // 1
        break;
    }
  }
}
