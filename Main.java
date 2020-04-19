import java.util.Scanner;
 
public class Main
{
    public static void main(String args[])
  {
    int first, second, add,  multiply;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    multiply = first * second;
   
    System.out.println("Sum = " + add);
    System.out.println("Multiplication = " + multiply);
  }
}