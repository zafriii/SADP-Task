//Single responsibilty 
//SADP task 1

class Cloth
{
    public void stitch(String color, int size)
    {
        System.out.println("Stitching a" +" "+color +" "+ "Kurta" +" " +"of size" +" " +size);
    }
}

class Food

{
    public void cook(String name)
    {
        System.out.println("Cooking"+" "+name);
    }
}

public class sr2 {
     public static void main(String[] args) {

        Cloth c1 = new Cloth();
        c1.stitch("Red",36);

        Food f1 = new Food();
        f1.cook("Pasta");


     }
    }
