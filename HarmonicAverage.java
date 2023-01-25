//Harmonic average: n (elements number) / harmonic series of elements
public class HarmonicAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum=0, harmonicAverage=0;

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]!=0){ //There is no 0 in the entered array, but we have to check it because it is a division operation.
                harmonicSum += 1/numbers[i];
            }
        }
        harmonicAverage = numbers.length / harmonicSum;

        System.out.println("Harmonic average: "+harmonicAverage);
    }
}
