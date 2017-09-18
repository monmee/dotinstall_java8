public class MyApp {
  public static void main(String[] args) {
    String signal = "blue";
    switch(signal) {
      case "red":
        System.out.println("STOP");
        break;
      case "blue":
      case "green":
        System.out.println("GO");
        break;
      case "yellow":
        System.out.println("ATTENTION");
        break;
      default:
        System.out.println("Wrong signal");
        break;

    }
  }
}
