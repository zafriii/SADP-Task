//Task 9
//Memento Pattern

import java.util.ArrayList;
import java.util.List;

class Memento

{
    private String game;

    Memento(String game)
    {
        this.game = game;
    }

    public String getGame()
    {
        return game;
    }
}

class Gameplay 

{
    private String game;

    Gameplay (String game)
    {
        this.game = game;
    }

    public void setGame(String game)
    {
        this.game = game;
    }

    public String getGame()
    {
        return game;
    }

    public Memento save()
    {
        return new Memento(game);
    }

    public void restore(Memento memento)
    {
        game = memento.getGame();
    } 
}

class Playstation 
{
     private List <Memento> mementos = new ArrayList<>();

     public void addMemento(Memento memento)
     {
        mementos.add(memento);
     }

     public Memento getMemento(int index)
     {
        return mementos.get(index);
     }
}

public class gamer {
    public static void main(String[] args) {
        
        Gameplay gameplay = new Gameplay("House of the dead");
        Playstation playstation = new Playstation();

        playstation.addMemento(gameplay.save());
       
        gameplay.setGame("Virtual cop");
        playstation.addMemento(gameplay.save());

        gameplay.setGame("Road Rush");
        playstation.addMemento(gameplay.save());

        gameplay.restore(playstation.getMemento(0));
        System.out.println(gameplay.getGame());

        gameplay.restore(playstation.getMemento(1));
        System.out.println(gameplay.getGame());
        
        gameplay.restore(playstation.getMemento(2));
        System.out.println(gameplay.getGame());

    }
}
