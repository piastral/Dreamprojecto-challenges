public class Armstorngnumber {
    public static void main(String[] args) {
        int len = 0;
        int num = 123; // this is original
        int t1 = num; // this is copy
        while (t1 != 0) {
            len = len + 1;// first we have to find th length of number
            t1 = t1 / 10;
            System.out.println(len);
        }




           int mul;
              int arm=0;
              int rem ;
            int t2 = num;
            while(t2!=0){

                 mul=1;
                rem =t2%10;
                for(int i =1;i<=len;i++) {
                    mul = mul * rem;
                }
                    arm = arm + mul;
                t2 = t2/10;

                }if(arm==num) {
                System.out.println(num + " The number is Armstrong ");

            }else{
            System.out.println("The number is not Armstrong");
            }

        }
    }
    // armstrong number is when you have remainder is same as number //

