public class DataStructurepart1 {
    public static void main(String[] args) {
        // very important fundamentals for developing big website abd huge application data structure is very much needed
        // Basically data structure is the  way how we manage our data in computer memory in organized manner

       /* int myArray = 5;
        int myArray1 =6;
        int result = myArray + myArray1;
        System.out.println(result);
      */
        int[] myArray = new int[]{1,2,4,8,};// it means that i have 3 element in my array which i can retrieve with indexing
        myArray[0] = 10;// initilize 100 value on 2nd element on 2nd index so starrting from 0 traversing till length of array
        for (int i = 0; i < 4; i++) { // traversing with for loop with indexing 0
            System.out.println(myArray[i]); // printing the value of i after 3 iteration complete

        }
    }
}