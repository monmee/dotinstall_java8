public class MyApp {
  public static void main(String[] args) {
    // int x = 10;
    // int y = 5;
    // System.out.println(x);
    // System.out.println(y);


    int[] a = {3, 5, 7};
    int[] b = a;
    b[1] = 8;
    System.out.println(a[1]); // -> 8
    System.out.println(b[1]); // -> 8
    // 「int[] b = a」の時点で b には a が格納されているメモリ領域の番地が入るので,
    //  a と b も同じ {3, 5, 7} のデータを指し示しているから．

    String s = "hello";
    String t = s;
    t = "world";
    System.out.println(s);
    System.out.println(t);
    // String型は参照型だが，文字列に関してはほぼ基本データ型と同じような動きを行う．
    // 基本的に文字列は変更が不可になっていて、
    // 違う文字列を割り当てると別の領域に新しくデータを確保するという仕組みになっているから
  }
}
