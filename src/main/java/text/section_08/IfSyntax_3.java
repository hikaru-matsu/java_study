package text.section_08;

public class IfSyntax_3 {
  public static void main(String[] args) {
    int randNum = (int)(Math.random() * 10);

    System.out.println(randNum);

    if(randNum == 9) {
      System.out.println("大当たりです！");
    } else if(randNum == 8) {
      System.out.println("当たりです！");
    } else {
      System.out.println("はずれです！");
    }
  }
}
