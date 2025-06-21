package text.section_12;

public class Array_4 {
  public static void main(String[] args) {
    boolean[] primeNumber = new boolean[101];

    for (int i = 0; i < primeNumber.length; i++) {
      primeNumber[i] = true;
    }

    int divide = 2;
    while(divide < primeNumber.length) {
      for (int i = divide + 1; i < primeNumber.length; i++){
        if(i % divide == 0) {
          primeNumber[i] = false;
        }
      }
      divide++;
    }

    for (int i = 2; i < primeNumber.length; i++) {
      if(primeNumber[i]) {
        System.out.println(i);
      }
    }

  }
}
