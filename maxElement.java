public class maxElement {
    public static void main(String[] args) {
        int [] myArray = {99, 22,999 -55, 44, 676};
        int length = myArray.length;
        int max = Integer.MIN_VALUE;
        int c;
        int i;
        for( i = 0; i < length; i++){
                if (max < myArray[i]) {
                    max = myArray[i];
                    // c = i;
                }      
            }
            for( i = 0; i < length; i++){
            if (max == myArray[i]) {
                System.out.println("index iof max element is  : " +i);
            }
        }
       
        System.out.print("max element is : " 
        +max);
        System.out.println();
     
    }
}

