package text.section_09;

public class SwitchSyntax_2 {
  public static void main(String[] args) {
    int randNum = (int)(Math.random() * 10);

    System.out.println(randNum);

    switch(randNum) {
      case 0, 9 -> System.out.println("大当たりです");
      case 1, 8 -> System.out.println("当たりです");
      default -> System.out.println("はずれです");
    }
  }
}
