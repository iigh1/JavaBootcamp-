import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Question 1


//        for (int i=0; i<=100; i++ ){
//
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            }else if(i%3 == 0){
//                System.out.println("Fizz");
//            }else if (i % 5== 0){
//                System.out.println("Buzz");
//            } else{
//                System.out.println(i);
//            }
//        }


//        2.Write a Java program to reverse a string.

//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = s.nextLine();
//        String revStr = "";
//
//        for (int i=str.length()-1; i>=0; i--){
//            revStr += str.charAt(i);
//        }
//        System.out.println("Reversed String: "+ revStr);

//        3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.

//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter a positive integer:");
//        int num = s.nextInt();
//
//        for(int i =1; i<=10; i++){
//            System.out.println(num+"x" +i+"="+(num*i));
//        }

//        4.Write a program to find the factorial value of any number entered through the keyboard.


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int fact = sc.nextInt();


        for(int i=fact; i>0; i--){
            if(i==fact){
                continue;
            }
            fact=fact*i;
        }
        System.out.println("The factorial is: "+fact);


//        Question 5

//        Scanner s =new Scanner(System.in);
//        System.out.println("Enter the base: ");
//        int base = s.nextInt();
//
//        System.out.println("Enter the power");
//        int num2 = s.nextInt();
//
//        int power=1;
//
//        for(int i=1; i<=num2; i++){
//
//            power *= base;
//        }
//
//        System.out.println(base + " raised to power of: " + num2 + " is: " +power);

//        Question 6

//        Scanner s = new Scanner(System.in);
//        System.out.println("enter the number of integers: ");
//        int n = s.nextInt();
//
//        int sumEven =0;
//        int sumOdd =0;
//
//        for(int i=0; i<n; i++) {
//            System.out.println("Enter integer" + (i + 1) + ":");
//
//            int num = s.nextInt();
//
//            if (num % 2 == 0) {
//                sumEven += num;
//
//            } else {
//                sumOdd += num;
//            }
//        }
//        System.out.println("Sum of even integers: " +sumEven);
//        System.out.println("Sum of odd integers: " +sumOdd);


//        Question 7

//        Scanner s = new Scanner(System.in);
//        int num;
//
//        do {
//            System.out.print("Enter a positive integer: ");
//            num = s.nextInt();
//        } while (num <= 0);
//
//        boolean isPrime = true;
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//
//        }

//        Question 8
//
//        int countPositive = 0;
//        int countNegative = 0;
//        int countZero = 0;
//        char choice;
//        Scanner s = new Scanner(System.in);
//        do {
//            System.out.print("Enter a number: ");
//            int num = s.nextInt();
//
//            if (num > 0) {
//                countPositive++;
//            } else if (num < 0) {
//                countNegative++;
//            } else {
//                countZero++;
//            }
//            System.out.print("Do you want to continue y/n? ");
//            choice = s.next().charAt(0);
//
//        }while(choice=='y' || choice == 'Y');
//
//        System.out.println("Total Positive Numbers: " + countPositive);
//        System.out.println("Total Negative Numbers: " + countNegative);
//        System.out.println("Total Zero Numbers: " + countZero);


//        Question 9

//        for (int week = 1; week <= 4; week++) {
//            System.out.printf("Week %d%n", week); // %d%n new line
//
//            // Print days for each week
//            for (int day = 1; day <= 7; day++) {
//                System.out.printf("Day %d ", day);
//            }
//            System.out.println(); }

//        Question 10

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a word: ");
//        String word = s.next();
//
//        boolean isPalindrome = true;
//        int length = word.length();
//
//        for (int i=0; i < length/2; i++) {
//            if (word.charAt(i) != word.charAt(length - i - 1)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome) {
//            System.out.println(word + " is a palindrome.");
//        } else {
//            System.out.println(word + " is not a palindrome.");
//        }

        }
    }












