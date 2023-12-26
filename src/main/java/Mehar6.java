import java.util.*;
class Mehar{
    public static void main(String[] Args){

        System.out.println("Enter the sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String newSentence = sentence.replaceAll("[Ss]", "");
        System.out.println("The New Sentence is " + newSentence);
    }
}
 