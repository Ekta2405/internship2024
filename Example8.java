import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a ={12,7,10,15,0};
        int max=a[0];
        int min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }

        System.out.println("Max value"+max);
        System.out.println("Min value"+min);
    }
}
