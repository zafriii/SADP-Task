//Adapter pattern

interface Light{
    void on();
}

class Bulb implements Light{
    public void on(){
        System.out.println("Light is on");
    }
}

interface Fan{
    void rotate();
}

class CelingFan implements Fan{

   public void rotate(){
       System.out.println("Fan is on");
}
}

class Remoteadapter implements Fan{

     Light light;

     public Remoteadapter(Light light){
        this.light = light;
     }

      public void rotate(){
        light.on();
      }

}
   

public class Adapter {
    public static void main(String[] args) {
        
        Bulb b1 = new Bulb();
        Fan f1 = new CelingFan();

        Fan remoteadapter = new Remoteadapter(b1);

        System.out.println("Bulb");
        b1.on();

        System.out.println("Celing fan");
        f1.rotate();

        System.out.println("Remote adapter");
        remoteadapter.rotate();
    }
}
