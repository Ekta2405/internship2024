import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] a ={1,2,3,1,2,3,3,4,5,3};
        int maxcount=0,maxelement=0;
       
        for(int i=0;i<a.length;i++){
            int count=0;
            
            for(int j=0;j<a.length;j++){
                     if(a[i]==a[j])
                     count++;
                     
            }
            if(maxcount<count)
            {
                maxcount=count;
                maxelement=a[i];
            }
            System.out.println("count of"+a[i]+"is"+count);
        }
        System.out.println("maxcount:"+maxcount);
        System.out.println("maxelement:"+maxelement);
        
        
    }
}

