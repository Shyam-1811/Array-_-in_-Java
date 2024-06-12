import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arrayName = new int[n];
        System.out.print("input is : ");
        for(int i = 0; i < n; i++){
           arrayName[i] = sc.nextInt();
        }
        System.out.print("output is : ");
        for(int i = 0; i < n; i++){
            System.out.print(arrayName[i]+ " ");
        }

    }
}
