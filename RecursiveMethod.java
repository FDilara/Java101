import java.util.Scanner;
/*
* Example 1:
* Input : 16
* Output : 16 11 6 1 -4 1 6 11 16
* Example 2:
* Input : 5
* Output : 5 0 5
* */
public class RecursiveMethod {
    static int print(int a, int temp, boolean status) {
        System.out.print(a+" ");
        if((a==0 || a<0) || status) {
            status = true;
            a += 5;
            if(a==temp){
                System.out.print(a+" ");
                return 0;
            }
        }else {
            a -= 5;
        }
        print(a, temp, status);
        return 0;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        n = input.nextInt();

        print(n,n,false);

    }
}
