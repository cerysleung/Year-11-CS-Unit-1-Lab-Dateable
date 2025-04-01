import java.util.Scanner;

public class Dateable {

  public static void main(String[] args) {
    // Write your code below, inside the main method.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    int age = scanner.nextInt();
    int youngestAge = 7 + (age / 2);
    System.out.println(age + "-year olds should date someone who is at least " + youngestAge + " years old.");
  }
}