// Samith Ganesh
// S05: Basic Input and Output Activity

import java.util.Scanner;

public class Hello3
{
    public static void main(String[]args) 
    {
       Scanner scan = new Scanner(System.in);

       System.out.println("What is your name?");
       String name;
       name = scan.nextLine(); // Scans the user input as an int. next.Line() method

       // If we wanted to collect an integer value instead of a String, we'd use scan.nextInt() instead of scan.nextLine()

       System.out.println("Hello, " + name + "! What is your age?");
       int age = scan.nextInt();
       System.out.println("Your name is " + name + " and you are " + age + " years old!");

    }
}

