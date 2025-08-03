package text.section_17;

public class Main3 {
  public static void main(String[] args) {
    try {
      throw new UnsupportedMusicFileException("未対応のファイルです");
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
