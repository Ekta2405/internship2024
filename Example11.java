import java.util.Scanner;
public class Example11{
    public void hi(){
        System.out.println("Hi everyone");

    }
    public static void mul(int a, int b){
        System.out.println(a*b);
    }

    public static double square (double a){
        return a*a;
    }

    public static double div(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a/b;

    }
    public static void main(String args[]){
        mul(6,7);
        mul(2,9);
        double num=square(5.67);
        System.out.println(num);
        System.out.println(div());

    }
}