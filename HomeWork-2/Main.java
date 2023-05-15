import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Question 1

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = s.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = s.nextInt();

        // sum
        int sum = num1 + num2;
        System.out.println(num1+ " + " +num2+ " = " +sum);

        //subtract
        int sub = num1 - num2;
        System.out.println(num1+ " - " +num2+ " = " +sub);

        //multiply
        int multiply = num1 * num2;
        System.out.println(num1+ " * " +num2+ " = " +multiply);

        //divide
        int div = num1 / num2;
        System.out.println(num1+ " / " +num2+ " = " +div);

        //remainder
        int remainder = num1 % num2;
        System.out.println(num1+ " mod " +num2+ " = " +remainder);


        // Question 2

        String str = "I AM HAPPY TO JOIN JAVA BOOTCAMP";
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);


        //Question 3

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Enter number: ");
        int indx= sc.nextInt();

        System.out.println(str.charAt(indx));




        // Question 4

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = s.nextInt();

        if (num % 2 == 0){
            System.out.println("1"); // even
        }
        else {
            System.out.println("0"); // odd
        }

        //Question 5

        Scanner data = new Scanner(System.in);
        System.out.println("Enter your role: ");
        String role = data.nextLine();

        if (role.equals("admin")){
            System.out.println("Welcome admin");
        }
        else if (role.equals("superuser")){
            System.out.println("Welcome superuser");
        }else{
            System.out.println("Welcome user");
        }


        //Question 6

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2;

        if (sum == num3){
            System.out.println("The result is: " +true);
        }else {
            System.out.println("the result is: "+false);
        }

        //Question 7

        Scanner data = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = data.nextInt();
        System.out.println("Enter second number: ");
        int num2 = data.nextInt();
        System.out.println("Enter third number: ");
        int num3 = data.nextInt();


        if (num1 > num2 && num1 > num3 ){
            System.out.println("The greatest is: " +num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest is: " +num2);
        }else {
            System.out.println("The greatest is: " +num3);
        }


        //Question 8

        Scanner s = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int day = s.nextInt();

        if (day==1){
            System.out.println("Sunday");
        }else if (day==2){
            System.out.println("Monday");
        }else if (day==3){
            System.out.println("Tuesday");
        }else if (day==4){
            System.out.println("Wednday");
        } else if (day==5) {
            System.out.println("Thursday");
        }else if(day==6){
            System.out.println("Friday");
        }else if(day==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Wrong day");
        }


    }
    }
