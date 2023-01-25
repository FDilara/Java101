//Program that prints "B" to the screen with "stars" using multidimensional arrays
public class MultidimensionalArray {
    public static void main(String[] args) {
        String[][] stars = new String[7][4];

        for (int i=0; i<stars.length; i++) {
            for (int j=0; j<stars[i].length; j++) {
                if (i==0 || i==3 || i==6) {
                    stars[i][j] = " * ";
                } else if (j==0 || j==3) {
                    stars[i][j] = " * ";
                } else {
                    stars[i][j] = "   ";
                }
                System.out.print(stars[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
