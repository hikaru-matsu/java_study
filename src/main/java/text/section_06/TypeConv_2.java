package text.section_06;

public class TypeConv_2 {
  public static void main(String[] args) {
    short valShort = 32767;
    byte valByte = (byte)valShort;
    System.out.println(valByte);

    double valDouble = 123.456;
    int valInt = (int)valDouble;
    System.out.println(valInt);
  }
}
