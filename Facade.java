//Facade Pattern
//Task 8

interface Song
{
   public void sing();
}

class Classical implements Song
{
     public void sing()
     {
        System.out.println("Ore piya");
     }
}

class Pop implements Song
{
     public void sing()
     {
        System.out.println("Badal barsa bijuli");
     }
}

class Item implements Song
{
     public void sing()
     {
        System.out.println("Coca cola");
     }
}

class Songmaker
{
    private Song classical;
    private Song pop;
    private Song item;


    public Songmaker()

    {
        classical = new Classical();
        pop = new Pop();
        item = new Item();
        
    }

    public void singClassical()
    {
        classical.sing();
    }

     public void singPop() 
    {
        pop.sing();
    }

    public void singItem()
    {
        item.sing();
    }

}

public class Facade {
     public static void main(String[] args) {

        Songmaker songmaker = new Songmaker();
        songmaker.singClassical();
        songmaker.singPop();
        songmaker.singItem();

     }
    }
