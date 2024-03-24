public class Example15 {
    public static void main(String args[]){
        try{
            System.out.println(8/0);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(8/1);
        }
        int[] a={2,3,4,5,6};
        try{
            System.out.println(a[6]);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println(a[4]);
        }

        try{
            String b="Abc";
            int c=Integer.parseInt(b);
            System.out.println(c);

        }

        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is exceptional");
        }
    }
}
