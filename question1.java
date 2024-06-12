public class question1 {
    public static void main(String[] args) {
        int[] Marks = {77,26,99,10,43};
        System.out.println("Roll no of failed students :");
        for(int i = 0; i < Marks.length; i++){
            if (Marks[i] < 35) {
                System.out.println(i);
            }
        }
    }
}
