//Java Fundamentals – Integrated Mini Exam

//  PART A — Mini Exam

        //     🎯 Exam Objective
        // Validate mastery of Java fundamentals by building a single cohesive console program that demonstrates:
        // Program structure
        // Variables & data types
        // Operators
        // Conditionals
        // Switch statements
        // Loops
        // Methods
        // Clean logic flow
import java.util.Scanner;  
public class MiniAssessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1 
        // Create a valid Java program named:
        System.out.println("Alistair Jan Loberternos");


        // Question 2 — Variables & Output
        String studentName = "Alistair";
        int age = 22;
        boolean enrolled = true;

        System.out.println("Name: " + studentName);
        System.out.println("Age: " + age);
        System.out.println("Enrolled: " + enrolled);

        // Question 3 — Operators
        int a = 15;
        int b = 4;

            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Divition: " + (a / b));
            System.out.println("Modulo: " + (a % b));

        // Question 4 — Conditional Logic
        int score = 85;

            if(score >= 75){
                System.out.println("PASSED");
            }else{
                System.out.println("FAILED");
            }
        
        // Question 5 — Switch Statement

        char grade = 'B';

        switch(grade){
            case 'A':
                  System.out.println("Excellent");
                  break;
            case 'B':
                  System.out.println("Good");
                  break;
            case 'C':
                  System.out.println("Fair");
                  break;
            case 'D':
                  System.out.println("Poor");
                  break;
            case 'F':
                  System.out.println("Failed");
                  break;
            default: 
                System.out.println("Invalid Grade");
        }

        // Question 6 — Loops
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                System.out.println(i + " - " + "Even");
            }else{
                System.out.println(i + " - " + "Odd");
            }   
        }

        //  Question 7 Methods
        int num1 = 15;
        int num2 = 10;

        int result1 = add(num1, num2);
        int result2 = subtract(num1, num2);
        int result3 = multiply(num1, num2);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        
        // 🛠 PART B — Mini Project (30 pts)
        //  Project Title
        // Console Calculator & Student Evaluator

        // int test = sc.nextInt();
        System.out.println("Choose Console Calculator & Student Evaluator: ");
        System.out.println("1 - Calculator: ");
        System.out.println("2 - Student Evaluation: ");
        System.out.println("3 - Exit: ");

        System.out.println("Choose: ");
        int test = sc.nextInt();

        switch (test) {

            case 1:

                System.out.println("Calcualtor:  Choose 1 - Add, 2 - Subtract, and 3 - multiply: ");
              
                
                System.out.println("");
              
                System.out.println("Choose: ");
                int choose = sc.nextInt();

                switch (choose) {
                    case 1:

                        System.out.println("Addition: ");
                         System.out.print("Enter first number: ");
                         int add1 = sc.nextInt();
                            sc.nextLine();
                         System.out.print("Enter second number: ");
                         int  add2 = sc.nextInt();

                         int addResult = add(add1, add2);
                         System.out.println(addResult);

                        break;
                
                    case 2:
                        System.out.println("Subtraction: ");
                        sc.nextLine();
                        System.out.print("Enter first number: ");
                         int sub1 = sc.nextInt();

                         System.out.print("Enter second number: ");
                         int sub2 = sc.nextInt();

                         int subtract2 = subtract(sub1, sub2);
                         System.out.println(subtract2);
                        break;

                    case 3: 
                        System.out.println("Subtraction: ");
                        sc.nextLine();
                        System.out.print("Enter first number: ");
                         int mul1 = sc.nextInt();

                         System.out.print("Enter second number: ");
                         int mul2 = sc.nextInt();

                         int multiply3 = multiply(mul1, mul2);
                         System.out.println(multiply3);
                        break;

                    default:
                        break;
                }

                break;


            case 2: 

                System.out.println("Student Evaluation: ");

                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Grade: ");
                int studentGrade = sc.nextInt();
                
                if(studentGrade >= 75){
                    System.out.println("Student: " + name + " " + "Passed With a Grade of: " + studentGrade);
                }else{
                     System.out.println("Student: " + name + " " + "Failed With a Grade of: " + studentGrade);
                }
                break;

            case 3:

                break;
            default:
                break;
        }
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
}
