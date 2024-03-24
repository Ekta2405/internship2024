import java.util.Scanner;
public class Example3{
public static void main(String[] args)
{   Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int fact=0;
    for (int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            fact++;
        }
    }
    if(fact==1){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not Prime");
    }
    }
}    