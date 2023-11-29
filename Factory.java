//Factory pattern

interface Pizza
{
   public void prepare();
}

class CheezePizza implements Pizza
{
    @Override
   public void prepare()
    {
        System.out.println("Cheeze Pizza prepared");
    }

}


class VegPizza implements Pizza
{
    @Override
   public void prepare()
    {
        System.out.println("Veg Pizza prepared");
    }

}

class PizzaFactory
{
     Pizza createPizza(String type)
    {
         Pizza pizza = null;

         if(type.equals("Cheeze"))
         {
            pizza = new CheezePizza();
         }

        else if(type.equals("Veg"))
         {
            pizza = new VegPizza();
         }

         return pizza;
    }
    
}
public class Factory{
    public static void main(String[] args) {
        
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("Cheeze");
        pizza.prepare();
        pizzaFactory.createPizza("Veg").prepare();
    }
}

