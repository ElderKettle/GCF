import java.util.Scanner;
import java.lang.Math;

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
    
    System.out.println("Enter a Numerator:");
    num = scl.nextInt();
    setNumerator(num);


    System.out.println("Enter a Denominator:");
    den = scl.nextInt();
    while (den == 0) {
      System.out.println("Invalid, try again");
      den = scl.nextInt();
    }
    setDenominator(den);
    Clean.newline(2);
  }

  public void setNumerator(int num) {
    this.num = num;
  }

  public int getNumerator() {
    return num;
  }  

  public void setDenominator(int den) {
    this.den = den;
  }

  public int getDenominator() {
    return den;
  }

  public void stateFraction() {
    System.out.println("Inputed Fraction: ");
    System.out.println(num + "/" + den);
    Clean.newline(1);
  }

  public void getGCF() {

    GCF = Math.abs(num) + 1;

    while (remn != 0 || remd != 0) {
      GCF--;
      remn = Math.IEEEremainder(num, GCF);
      remd = Math.IEEEremainder(den, GCF);
    }

  }

  public void stateSimple() {

    if (GCF == 1 && den != 1) {
      System.out.println("Fraction is Already Simple");
    }

    else if (den == 1 || num == 0) {
      System.out.println("Simplified Fraction:");
      System.out.println(Math.abs(num));

    } else {
      System.out.println("Simplified Fraction:");
      System.out.println(num / GCF + "/" + den / GCF);
    }

    Clean.newline(1);
  }

  public double getDecimal() {
    dec = num;
    dec = dec / den;
    return dec;
  }
}