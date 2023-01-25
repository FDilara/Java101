import java.util.Scanner;
//Program that sorts the elements in an array from smallest to largest.
public class SortingArrayElements {
    public static void main(String[] args) {
        int size;
        int[] array, sortingArray;

        Scanner input = new Scanner(System.in);

        System.out.println("Size of array: ");
        size = input.nextInt();

        array = new int[size];

        for(int i=0; i<array.length; i++) {
            System.out.println((i+1)+". Element: ");
            array[i] = input.nextInt();
        }

        for(int i=0; i<array.length; i++) {
            int temp=0;
            for(int j=i+1; j<array.length; j++) {
                if(array[i]>array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for(int k=0; k<array.length; k++) {
          System.out.println(array[k]+" ");
        }


    }
}
