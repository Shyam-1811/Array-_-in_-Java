public class secondMax {
    public static void main(String[] args) {
   int[] arr = {-1, 0,-55, -99};
int max = Integer.MIN_VALUE;
int i;
int count = 0;
for(  i = 0; i <arr.length; i++){
    max = Math.max(max,arr[i]);
   }
   for(  i = 0; i <arr.length; i++){
    if (max == arr[i]) {
    count = i;
     System.out.println(" index of max element is : " +count);
     break;
    }
    }
int secondMax = Integer.MIN_VALUE;
for(  int j = 0; j <arr.length; j++){
    if (count != j) {
        secondMax = Math.max(secondMax,arr[j]);
    } 
}
System.out.println(" maximum value is : " +max);
System.out.println("  second maximum value is : " +secondMax);   

}
}


