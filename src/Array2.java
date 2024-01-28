public class Array2 {
    public static void main(String[] args) {
        int[] myArr =new int[] {5, 4, 6, 8};
        int min = myArr[0];
        for (int i=1; i<myArr.length; i++) {
            if (myArr[i] < min) {
                min = myArr[i];
            }

            }
        System.out.println("Min element is  in  " + min +" with Index no" );
    }
}