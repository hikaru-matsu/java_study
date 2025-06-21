package text.section_11;

public class WhileSyntax_1 {
  public static void main(String[] args) {

    int dice = 1;

    while(dice != 6) {
      dice = (int)(Math.ceil(Math.random() * 6));
      System.out.println("サイコロの目は、" + dice);
    }

  }
}
