// interface Shape 
// {
//     public void draw();
// }

// class Circle implements Shape
// {
//     public void draw(){
//         System.out.println("Circle");
//     }

// }

// class Triangle implements Shape
// {
//     public void draw(){
//         System.out.println("Triangle");
//     }

// }

// class Rectangle implements Shape
// {
//     public void draw(){
//         System.out.println("Rectangle");
//     }

// }

// class Shapemaker
// {
//     private Shape circle; 
//     private Shape triangle;
//     private Shape rectangle;

//     public Shapemaker(){
//         circle = new Circle();
//         triangle = new Triangle();
//         rectangle = new Rectangle();
//     }

//     public void circleDraw(){
//        circle.draw();
//     }

//     public void triangleDraw(){
//         triangle.draw();
//     }

//     public void rectangleDraw(){
//         rectangle.draw();
//     }

// }

// public class Facade {
//     public static void main(String[] args) {

//         Shapemaker shapemaker = new Shapemaker();
//          shapemaker.circleDraw();
//          shapemaker.triangleDraw();
//          shapemaker.rectangleDraw();

        
//     }
// }


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