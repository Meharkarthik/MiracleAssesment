import java.util.*;
class Mehar5 {
    public static void main(String[] args){

        System.out.println("Enter the Sentence below");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("The first 3 characters of the given string are " + str.substring(0, 3));
    }
}
