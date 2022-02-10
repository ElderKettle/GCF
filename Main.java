import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {

    while (true){
      new Fraction();
    }
  }
}

class Fraction {

  private String input;
  private int num;
  private int den;
  private int GCF = 1;
  private double remn = 1;
  private double remd = 1;
  private double dec;

  Scanner scl = new Scanner(System.in);

  Fraction() {

    clearScreen();

    System.out.println();
    System.out.println();

    getNumerator(); 

    getDenominator();

    getDecimal();

    getGCF();

    System.out.println();
    stateFraction();

    stateSimple();

    stateDecimal();

    System.out.println("Type Anything to Continue");

    input = scl.next();

    clearScreen();
  }

  public void getNumerator() {
    System.out.println("Enter a Numerator:");
    num = scl.nextInt();

  }

  public void getDenominator() {
    System.out.println("Enter a Denominator:");
    den = scl.nextInt();

    while (den == 0) {
      System.out.println("Invalid, try again");
      den = scl.nextInt();
    } 
  }

  public void stateFraction(){
    System.out.println("Inputed Fraction: ");
    System.out.println(num + "/" + den);
    System.out.println();
  }

  public void getGCF() {

    GCF = Math.abs(num) + 1;

    while (remn != 0 || remd != 0) {
      GCF--;
      remn = Math.IEEEremainder(num , GCF);
      remd = Math.IEEEremainder(den , GCF);
    }

  }

  public void stateSimple() {

    if (GCF == 1 && den != 1){
      System.out.println("Fraction is Already Simple");
      }

    else if(den == 1 || num == 0){
        System.out.println("Simplified Fraction:");
        System.out.println(Math.abs(num));
      
    }
    else{
        System.out.println("Simplified Fraction:");
        System.out.println(num / GCF + "/" + den / GCF);
      }

    System.out.println();
  }

  public void getDecimal(){
    dec = num;
    dec = dec / den;
  }

  public void stateDecimal(){
    System.out.println("Decimal Form:");
    System.out.println(dec);
    System.out.println();
  }

  public void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}