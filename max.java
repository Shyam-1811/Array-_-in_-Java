public class max {
    public static void main(String[] args) {
        int [] myArray = {99, 22, -55, 44, 676};
        int length = myArray.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++){
               max = Math.max(max, myArray[i]);
        }
        System.out.print("max element is : " 
        +max);
    }
}
