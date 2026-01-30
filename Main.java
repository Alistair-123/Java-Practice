public class Main{
public static void main(String[] args) {

        // 🟢 PROBLEM 1 — Java Basics (Output)
        System.out.println("Java Fundamentals");


        // 🟢 PROBLEM 2 — Variables & Data Types
        String name = "AJ";
        int age = 20;
        boolean student = true;

        System.out.println("My name is: " + name + ", " + "I am: " + age + " years of age, " + "I am a Student: " + student);

        // 🟢 PROBLEM 3 — Operators
        int a = 15;
        int b = 10;

        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Reminder: " + (a % b));

        // 🟢 PROBLEM 4 — Conditional Statements (if–else)
        
        int number = 5;

        if(number > 0){
            System.out.println("Positive");
        }

        if(number < 0){
            System.out.println("Negative");
        }

        if(number == 0){
            System.out.println("Zero");
        }

        // 🟢 PROBLEM 5 — Switch Statement

        char grade = 'A';

        switch (grade){
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
            default:
            System.out.println("Invalid Grade");

        }

        //🟢 PROBLEM 6 — Loops
        
        // Part A
            for(int i = 0; i < 50; i++){
                System.out.println(i + 1);
            }
        
        //  Part B
            for(int i = 0; i < 50; i++){
                if(i % 5 == 0)
                System.out.println( i);
            }

        //🟢 PROBLEM 7 — Methods

        int num1 = 5;
        int num2 = 5;
        
        int result = add(num1, num2);
        System.out.println(result);

        int result2 = subtract(num1, num2);
        System.out.println(result2);
        
        int result3 = multiply(num1, num2);
        System.out.println(result3);

        // 
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