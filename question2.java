import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of ARRAY is : ");
        int n = sc.nextInt();
        int [] myArray = new int[n];
        System.out.print("Input is : ");
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = sc.nextInt();
        }
    
    System.out.println("Array is : ");
    for(int i = 0; i< myArray.length; i++ ){
      System.out.print(myArray[i]+ " ");
    }
    System.out.println();
    int sum = 0;
    for(int i = 0; i< myArray.length; i++ ){
       sum = sum + myArray[i];
      }
      System.out.print(" sum is : " +sum);
    }
}
