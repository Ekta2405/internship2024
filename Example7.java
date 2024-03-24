import java.util.Scanner;

public class Example7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
    int count=0;
    for(int n=20;n<=40;n++)
    {
        int fact=0;
    for (int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            
            fact++;
            
        }
       
    }
    if(fact==2){
        System.out.println(n);
        count++;
    }
    
    }
    System.out.println("count is:"+count);
}
}
