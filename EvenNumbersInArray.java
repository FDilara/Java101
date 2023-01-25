//Program to find repeating even numbers in a array of numbers
public class EvenNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {56, 34, 1, 8, 101, -2, -33, -2, 8, 0, 5, 8, 5};
        int[] repeatingNumbers = new int[numbers.length];
        int k=0;

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                boolean status=false;
                if(numbers[i]==numbers[j] && numbers[i]%2==0) {
                    for(int value : repeatingNumbers) {
                        if(value==numbers[i]){
                            status=true;
                        }
                    }
                    if(!status) {
                        repeatingNumbers[k++] = numbers[i];
                    }
                    break;
                }
            }
        }

        for(int t=0; t<repeatingNumbers.length; t++) {
            System.out.print(repeatingNumbers[t]+" ");
        }
    }
}
