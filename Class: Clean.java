import java.util.Scanner;
import java.lang.Math;

class Clean {
  int constant;

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void newline(int constant) {
    while (constant > 0){
      System.out.println();
      constant--;
    }
  }
}