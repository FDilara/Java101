//Program to find how many times elements in array are repeated.
public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        int[] numbers = {56, 34, 1, 8, 101, -2, -33, -2, 8, 0, 5, 8, 5};

        for(int i=0; i<numbers.length; i++) {
            int count=0;
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i]==numbers[j]) {
                    count++;
                }
            }
            if(count!=0){
                System.out.println(numbers[i]+" repeated "+count+" times.");
            }
        }

    }
}
