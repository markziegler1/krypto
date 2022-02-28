import java.util.Scanner;

public class krypto {

  int number;
  char number1 = ' ';
  char b;
  Scanner in = new Scanner(System.in);

int letters1(char a) {
  // skulle tage mellemrum a-å - 0-29
  number = a - 65 + 1;
return number;
}

char letters2(int x1) {
  char b = (char) ((int) x1 + 65 - 1);
  return number1;
}

  public static void main(String[] args) {
    krypto letters1 = new krypto();
    int x = letters1.letters1('Z');
    System.out.println(x);

    krypto letters2 = new krypto();
    char x1 = (char) letters2.letters2('2');
    System.out.println();


    }
}


