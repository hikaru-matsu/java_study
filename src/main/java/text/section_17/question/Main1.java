package text.section_17.question;

public class Main1 {
  public static void main(String[] args) {

    try {
      String s = null;
      System.out.println(s.length());
    } catch(NullPointerException e) {
      System.out.println("---ここから---");
      e.printStackTrace();
      System.out.println("---ここまで---");
    }
  }
}
