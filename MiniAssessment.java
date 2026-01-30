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

public class MiniAssessment {
    public static void main(String[] args) {
        
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

        
    }

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
}
