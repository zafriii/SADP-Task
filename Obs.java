//Observer pattern

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String username, String snap);
}

class Snapfollowers implements Observer{

     private String snapfollowersname;
      
     public Snapfollowers(String snapfollowersname){
        this.snapfollowersname = snapfollowersname;
}

public void update(String username, String snap){
    System.out.println(snapfollowersname + " "+ "sent a snap" + " " +username);
    System.out.println(snap);
}
}


interface Subject{

    void addFriend(Observer observer);
    void removeFriend(Observer observer);
    void notifyFriend(String snap);
}

class Snapuser implements Subject{

    private String snapusername;
    private List <Observer> snapchat;
    private String latestsnap;

    public Snapuser(String snapusername){
        this.snapusername = snapusername;
         snapchat = new ArrayList<>();
    }

    public void newUpdate(String snap){
        latestsnap = snap;
        notifyFriend(snap);
    }

    public void addFriend(Observer observer){
        snapchat.add(observer);
    }

    public void removeFriend(Observer observer){
        snapchat.remove(observer);
    }

    public void notifyFriend(String snap){
        for(Observer ob : snapchat){
            ob.update(snapusername, snap);
        }
    }


}

public class Obs{

    public static void main(String[] args) {
        
       Snapuser s1 = new Snapuser("Alice");
       Snapuser s2 = new Snapuser("Bob");

       Snapfollowers sf1 = new Snapfollowers("New friend 1");
       Snapfollowers sf2 = new Snapfollowers("New friend 2");

       s1.addFriend(sf1);
       s2.addFriend(sf1);
       s2.addFriend(sf2);

       s1.newUpdate("Streaks of 45 days");
       s2.newUpdate("Streaks of 85 days");

       


    }
}
