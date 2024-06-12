import java.util.Scanner;

public class linearSearch {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Size of array is : ");
    int n = sc.nextInt();
    int [] Array = new int[n];
    System.out.print("Input  is : ");
    for(int i = 0; i< Array.length; i++ ){
    Array[i] = sc.nextInt();
    }
    System.out.println("Array is : ");
    for(int i = 0; i< Array.length; i++ ){
      System.out.print(Array[i]+ " ");
    }
    System.out.println();
    System.out.print("enter the elements to be searched :");
    int x = sc.nextInt();
    for(int i = 0; i < Array.length; i++){
        if (x == Array[i]) {
            System.out.print("element found at index " +i);
        }
    }
   } 
}
