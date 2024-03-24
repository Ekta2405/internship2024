import java.util.Scanner;
public class Example{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    if(a==33){
        System.out.println("untouched");
    }
    else if(a<33){
        System.out.println("inflata");
    }
    else{
        System.out.println("Deflata");
    }
}    
}
