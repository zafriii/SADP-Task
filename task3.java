//SADP Task 3

abstract class Footballer

{
  public abstract String printName();
  public abstract int printAge();
    
}

class Player1 extends Footballer

{
    String name;
    int age;

   public Player1( String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override

    public String printName()
    {
        return this.name ;
    }
      
     public int printAge()
    {
      
        return this.age ;
    }
        
    
}

class Player2 extends Footballer

{
    String name;
    int age;

   public Player2(String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

@Override

        public String printName()
    {
        return this.name ;
    }
        public int printAge()
    {
         return this.age;

     }    
       
}

class Player3 extends Footballer

{
    String name;
    int age;

   public Player3(String name, int age)
    {
        this.name = name;
        this.age = age ;
    }

@Override

        public String printName()
    {
        return this.name ;
    }
        public int printAge()
    {
         return this.age;

     }    
       
}


public class task3 {
    
    public static void main(String[] args) {
        
           Player1 f1 = new Player1("Lionel Messi", 36);
           System.out.println( f1.printName());
           System.out.println( f1.printAge());
           System.out.println("GOAT");
         

           Player2 f2 = new Player2("Rodrego D Paul", 29);
           System.out.println( f2.printName());
           System.out.println( f2.printAge());

           Player3 f3 = new Player3("Emi Martinez", 30);
           System.out.println( f3.printName());
           System.out.println( f3.printAge());


}

}

     
