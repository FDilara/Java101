import java.util.Scanner;
//Program to find the closest number smaller than the entered number of the elements in the array and the closest number larger than the entered number.
public class MaxAndMinWithArray {
    public static void main(String[] args) {
        int[] array = {56, 34, 1, 8, 101, -2, -33};
        int number, maxNumber=array[0], minNumber=array[0], nearMax=0, nearMin=0, nearMinNumber=0, nearMaxNumber=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        for(int i=0; i<array.length; i++) {
            if(maxNumber<array[i]){
                maxNumber = array[i];
                nearMax = maxNumber-number;
            }
            if(minNumber>array[i]) {
                minNumber = array[i];
                nearMin = number-minNumber;
            }
        }

        for(int i=0; i<array.length; i++) {
            if(number>array[i] && number>minNumber){
                if(nearMin>=(number-array[i])) {
                    nearMin = number-array[i];
                    nearMinNumber = array[i];
                }
            }
            if(number<array[i] && number<maxNumber){
                if(nearMax>=(array[i]-number)) {
                    nearMax = array[i]-number;
                    nearMaxNumber = array[i];
                }
            }
        }

        System.out.println("Near min number: "+nearMinNumber);
        System.out.println("Near max number: "+nearMaxNumber);
    }
}
