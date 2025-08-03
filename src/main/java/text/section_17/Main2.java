package text.section_17;

import java.io.FileWriter;

public class Main2 {
  public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("data.txt");) {
      fw.write("Java");
    } catch(Exception e) {
      System.out.println("何らかの例外が発生しました!");
    }
  }
}
