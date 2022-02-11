import java.util.Scanner;
import java.lang.Math;

class MathFrac{

  private int num1;
  private int den1;
  private int num2;
  private int den2;
  private double remn = 1;
  private double remd = 1;

  MathFrac() {

    Fraction first = new Fraction();
    Fraction second = new Fraction();

    num1 = first.getNumerator();
    den1 = first.getDenominator();
    num2 = second.getNumerator();
    den2 = second.getDenominator();

    printAdd();

    Clean.newline(1);

    printSub();
    
    Clean.newline(1);

    printMult();

    Clean.newline(1);

    printDiv();

  }
  
  public String Add(){

    remn = 1;
    remd = 1;

    int GCF = Math.abs((num1 * den2) + (num2 * den1)) + 1;

    while (remn != 0 || remd != 0) {
      GCF--;
      remn = Math.IEEEremainder((num1 * den2) + (num2 * den1), GCF);
      remd = Math.IEEEremainder((den1 * den2), GCF);
    }

    return (((num1 * den2) + (num2 * den1))/GCF + "/" + (den1 * den2)/GCF);

  }

  public void printAdd(){
    
    System.out.print(num1);
    System.out.print("/");
    System.out.print(den1);
    System.out.print(" + ");
    System.out.print(num2);
    System.out.print("/");
    System.out.print(den2);
    System.out.print(" = ");
    System.out.println(Add());

  }

  public String Sub(){

  remn = 1;
  remd = 1;

  int GCF = Math.abs((num1 * den2) - (num2 * den1)) + 1;

  while (remn != 0 || remd != 0) {
    GCF--;
    remn = Math.IEEEremainder((num1 * den2) - (num2 * den1), GCF);
    remd = Math.IEEEremainder((den1 * den2), GCF);
  }

  return (((num1 * den2) - (num2 * den1))/GCF + "/" + (den1 * den2)/GCF);

}

  public String SubAlt(){

  remn = 1;
  remd = 1;

  int GCF = Math.abs((num1 * den2) - (num2 * den1)) + 1;

  while (remn != 0 || remd != 0) {
    GCF--;
    remn = Math.IEEEremainder((num1 * den2) - (num2 * den1), GCF);
    remd = Math.IEEEremainder((den1 * den2), GCF);
  }

  return (((num2 * den1) - (num1 * den2))/GCF + "/" + (den1 * den2)/GCF);

}

public void printSub(){
  
  System.out.print(num1);
  System.out.print("/");
  System.out.print(den1);
  System.out.print(" - ");
  System.out.print(num2);
  System.out.print("/");
  System.out.print(den2);
  System.out.print(" = ");
  System.out.println(Sub());

  Clean.newline(1);

  System.out.print(num2);
  System.out.print("/");
  System.out.print(den2);
  System.out.print(" - ");
  System.out.print(num1);
  System.out.print("/");
  System.out.print(den1);
  System.out.print(" = ");
  System.out.println(SubAlt());
}

  public String Mult(){

    remn = 1;
    remd = 1;

    int GCF = Math.abs(num1 * num2) + 1;

    while (remn != 0 || remd != 0) {
      GCF--;
      remn = Math.IEEEremainder((num1 * num2), GCF);
      remd = Math.IEEEremainder((den1 * den2), GCF);
    }

    return ((num1 * num2)/GCF + "/" + (den1 * den2)/GCF);

  }

  public void printMult(){
    
    System.out.print(num1);
    System.out.print("/");
    System.out.print(den1);
    System.out.print(" * ");
    System.out.print(num2);
    System.out.print("/");
    System.out.print(den2);
    System.out.print(" = ");
    System.out.println(Mult());

  }

  public String Div(){

  remn = 1;
  remd = 1;

  int GCF = Math.abs(num1 * den2) + 1;

  while (remn != 0 || remd != 0) {
    GCF--;
    remn = Math.IEEEremainder((num1 * den2), GCF);
    remd = Math.IEEEremainder((den1 * num2), GCF);
  }

  return ((num1 * den2)/GCF + "/" + (num2 * den1)/GCF);

  }

  public String DivAlt(){

  remn = 1;
  remd = 1;

  int GCF = Math.abs(num2 * den1) + 1;

  while (remn != 0 || remd != 0) {
    GCF--;
    remn = Math.IEEEremainder((num2 * den1), GCF);
    remd = Math.IEEEremainder((den2 * num1), GCF);
  }

  return ((num2 * den1)/GCF + "/" + (den2 * num1)/GCF);

  }

public void printDiv(){
  
  System.out.print(num1);
  System.out.print("/");
  System.out.print(den1);
  System.out.print(" / ");
  System.out.print(num2);
  System.out.print("/");
  System.out.print(den2);
  System.out.print(" = ");
  System.out.println(Div());

  Clean.newline(1);

  System.out.print(num2);
  System.out.print("/");
  System.out.print(den2);
  System.out.print(" / ");
  System.out.print(num1);
  System.out.print("/");
  System.out.print(den1);
  System.out.print(" = ");
  System.out.println(DivAlt());
  }
}