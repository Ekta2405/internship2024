abstract class Work
{
    public abstract void Location();
    public abstract void infrastructure();
    public abstract void studies();
}
class Bitm extends Work{
    public void Location(){
        System.out.println("Ballari");
    }

    public void infrastructure(){
        System.out.println("five story building");
    }

    public void studies(){
        System.out.println("4 years of study");
    }

}

public class Example14{
    public static void main(String args[]){
        Bitm b=new Bitm();
        b.Location();
        b.infrastructure();
        b.studies();
    }
}