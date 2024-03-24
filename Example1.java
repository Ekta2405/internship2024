import java.util.Scanner;
public class Example1{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    float speed=sc.nextInt();
    float distance=sc.nextInt();
    float time1=sc.nextInt();
    float time2=sc.nextInt();
    float time=distance/speed;

   float timetostart=time1-time2;
   if(time<timetostart){
    System.out.println("Yes");
   }
   else{
    System.out.println("No");
   }
}    
}