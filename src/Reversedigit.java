public class Reversedigit {
    public static void main(String[] args) {
      int number = 123;
      int t1 = number;
      int add =0;
      int rem ;
      while(t1!=0){
          rem =t1%10;

          t1 =t1/10;
          for(int i =1; i<2;i++){
               int reverse = add + rem;

               System.out.print(reverse);

          }
      }

    }

}