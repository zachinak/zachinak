import java.util.Scanner;

public class Main {
  // This is the main class.
    
  public static void main(String[] args) {
    // This is the main function that prints our text.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int num = input.nextInt();
    String newString = "I'm a string yo!";
    System.out.println("You entered: " + num);
    System.out.println("Hi");
    System.out.println(newString);
    input.close();
  }
}