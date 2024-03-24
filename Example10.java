import java.util.Scanner;

public class Example10 {
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
    int num=1234;
    int temp=num;
    int rev=0;
    int sum=0,rem=0;
    while(num!=0){
        rem=num%10;
        //sum=sum+rem;
        
        rev=rev*10+rem;
        num=num/10;
    }
      System.out.println(rev);

    }
}
