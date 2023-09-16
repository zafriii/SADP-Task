//Task 5

interface Notification
{
    public void Notify();
}

class MsgNotifcation implements  Notification
{
    @Override
    public void Notify()
    {
        System.out.println("New Messege");
    }
}

class CallNotifcation implements  Notification
{
    @Override
    public void Notify()
    
    {
        System.out.println("1 missed call");
    }
    
}

class Tune

{
    private Notification tune;

    Tune(Notification tune)
    {
        this.tune = tune;
    }

    public void Notify()
    {
        tune.Notify();
    }

}


public class dependency {
    public static void main(String[] args) 
     {
            MsgNotifcation m1 = new MsgNotifcation();
            CallNotifcation c1 = new CallNotifcation();

            Tune t1 = new Tune(m1);
            Tune t2 = new Tune(c1);

            t1.Notify();
            t2.Notify();
     }
     }