import java.util.Scanner;
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myArray[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value to search for: ");

        int targetValue = scanner.nextInt();
        int result = linearSearch(myArray, targetValue);
        if (result != -1) {
            System.out.println("Target value " + targetValue + " found at index " + result + ".");
        } else {
            System.out.println("Target value " + targetValue + " not found in the array.");
        }
        scanner.close();
    }
}