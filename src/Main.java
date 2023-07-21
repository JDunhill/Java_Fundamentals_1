import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /* String firstName = "Jack";
    String lastName = "Dunhill";

    String name = firstName + lastName;
    System.out.println(name); */

    /* int num1, num2;
    num1 = 3;
    num2 = 4;

    System.out.println(num1 + num2);

    float result = num1 / num2;
    int num3 = 8;
    System.out.println(num3++);
    System.out.println(num3);
    System.out.println(++num3); */

     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter your first and last name: ");
     String name = scanner.nextLine();
     System.out.println("Hello " + name + "!");
     System.out.println("Please provide two numbers: ");
     int userNumber = scanner.nextInt();
     int userNumber2 = scanner.nextInt();
     System.out.println(userNumber + userNumber2);
     scanner.close();





    }

}

