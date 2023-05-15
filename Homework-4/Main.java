import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        Question 1

//        int [] numbers = {50, -20, 0, 30, 40, 60, 30};
//
//        if(numbers[0]==numbers[6]){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }

//        Question 2


//            Integer arr[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
//            int k = 3;
//            System.out.println("Original Array: ");
////            System.out.println(Arrays.toString(arr));
//            System.out.println(k +" largest elements of the said array are:");
//            Arrays.sort(arr, Collections.reverseOrder());
//            for (int i = 0; i < k; i++)
//                System.out.print(arr[i] + " ");
//        }
//    }


//        Question 3

//        int [] numbers = {1, 4, 17, 7, 25, 3, 100};
//        int sum =0;
//        for (int i = 0; i <numbers.length-1 ; i++) {
//            sum += numbers[i];
//        }
//        int avg = sum / numbers.length;
//        System.out.println("the average is: " +avg);
//
//        System.out.println("The numbers greater than avg are: ");
//        for (int i = 0; i < numbers.length; i++) {
//            if(numbers[i]>avg){
//                System.out.println(numbers[i]);
//            }
//        }


//        Question 4

//        int [] numbers = {20, 30, 40};
//        int first = numbers[0];
//        if (numbers[0]>=numbers.length-1){
//            first = numbers[2];
//        }
//
//        System.out.println("The lager value is: " +first);

//        Question 5

//        int [] arr = {20, 30, 40};
//        System.out.println("The original array is: "+ Arrays.toString(arr));
//
//        int n = arr[0];
//
//        arr[0]=arr[arr.length-1];
//
//        arr[arr.length-1]=n;
//
//        System.out.println("New array after swapping is: "+Arrays.toString(arr));


//        Question 6

//        String[] dictionary = {"cat", "dog", "red", "is", "am"};
//        ArrayList<String> longestWords = new ArrayList<String>();
//
//        int maxLength = 0;
//        for (String word : dictionary) {
//            if (word.length() > maxLength) {
//                maxLength = word.length();
//                longestWords = new ArrayList<String>();
//                longestWords.add(word);
//            }
//            else if (word.length() == maxLength) {
//                longestWords.add(word);
//            }
//        }
//
//        System.out.println("The longest words are:");
//        for (String word : longestWords) {
//            System.out.println(word);
//        }

//        Question 7
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
//        int arr[] = new int[size];
//
//        boolean repeat = true;
//
//        while (repeat) {
//
//            System.out.println("\nChoose an option: ");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. To Stop");
//
//        }
//
//        int choice = input.nextInt();
//
//        switch (choice) {
//
//            case 1:
//                System.out.println("Enter the elements of the array: ");
//                for (int i = 0; i < size; i++) {
//                    arr[i] = input.nextInt();
//                }
//                System.out.println("Elements added successfully.");
//                break;
//
//            case 2:
//                System.out.println("Elements in the array: ");
//                for (int i = 0; i < size; i++) {
//                    System.out.print(arr[i] + " ");
//                }
//                System.out.println();
//                break;
//
//            case 3:
//                System.out.println("Enter the element to be searched: ");
//                int searchElement = input.nextInt();
//                boolean found = false;
//                for (int i = 0; i < size; i++) {
//                    if (arr[i] == searchElement) {
//                        found = true;
//                        System.out.println("Element found at index " + i);
//                    }
//                }
//                if (!found) {
//                    System.out.println("Element not found in the array.");
//                }
//                break;
//
//            case 4: // sorting using bubble sort
//                for (int i = 0; i < size - 1; i++) {
//                    for (int j = 0; j < size - i - 1; j++) {
//                        if (arr[j] > arr[j + 1]) {
//                            int temp = arr[j];
//                            arr[j] = arr[j + 1];
//                            arr[j] = temp;
//
//
//                        }
//                    }
//                }
//        }

//        Question 8

        int[] arr = {1, 1, 1, 3, 3, 5};
        int elementToCount=1; // The element we want to count

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToCount) {
                count++;
            }
        }
        System.out.println("The element " + elementToCount + " appears " + count + " times in the array.");
    }
}

//        Question 9
//
//        int [] numbers = {1,2,5,6,3,2};
//        System.out.println("odd numbers:");
//        for (int i = 0; i<numbers.length ; i++) {
//            if(numbers[i]% 2 != 0){
//                System.out.println(numbers[i]);
//            }
//        }
//        System.out.println("even numbers:");
//        for (int i = 0; i<numbers.length ; i++) {
//            if(numbers[i]% 2 == 0){
//                System.out.println(numbers[i]);
//            }
//        }

//        Question 10

//
//
//        int [] my_array1={2,3,6,6,4};
//        int [] my_array2={2,3,6,6,4};
//        boolean  equalOrNot = true;
//
//            if(my_array1.length == my_array2.length) {
//                for (int i = 0; i < my_array1.length; i++) {
//                    if (my_array1[i] != my_array2[i]) {
//                        equalOrNot = false;
//                    }
//                }
//            }
//        if  (equalOrNot) {
//            System.out.println("Two arrays are equal.");
//        } else {
//            System.out.println("Two  arrays are not equal.");
//        }








