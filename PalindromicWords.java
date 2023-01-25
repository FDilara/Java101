import java.util.Scanner;
//Program that finds whether the word entered by the user is "palindromic"
public class PalindromicWords {

    public static void main(String[] args) {
        //For Example : abba , asa , kayak
        String word;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word = input.nextLine();
        if(isPalindromic(word)) {
            System.out.println("Palindromic Word!");
        } else {
            System.out.println("Not Palindromic Word!");
        }
    }

    public static boolean isPalindromic(String word) {
        String reverseWord="";

        for(int i=word.length()-1; i>=0; i--) {
            reverseWord += word.charAt(i);
        }

        if(word.equals(reverseWord))
            return true;
        return false;
    }

}
