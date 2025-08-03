package text.section_17.question;

public class Main3 {
  public static void main(String[] args) {
    try {
      String number = "三";
      int i = Integer.parseInt(number);
    } catch(NumberFormatException e) {
      e.printStackTrace();
    }
  }
}
