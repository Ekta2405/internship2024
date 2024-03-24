public class Example12 {
    public static void main(String args[]){
        int num=18,sum=0;int product=1;int temp=num;
        while (num!=0){
           int num1=num%10;
           sum=sum+num1;
           
           product=product*num1;
           num=num/10;

        }
        
        System.out.println(sum+" "+product);
        if(sum+product==temp){
            System.out.println("special number");
        }
        else {
            System.out.println("not");
        }
    }
}
