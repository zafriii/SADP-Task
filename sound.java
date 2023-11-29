//Command pattern

import java.util.ArrayList;
import java.util.List;

class Speaker{

    public void speakerOn(int volume){
        System.out.println("Speaker is on & volume is :" +" " +volume);
    }

     public void speakerOff(){
        System.out.println("Speaker is off");
    }
}

interface Command{
    void execute();
}

class onCommand implements Command{
    private Speaker speaker;
    private int volume;

    public onCommand (Speaker speaker){
        this.speaker = speaker;
    }

    public onCommand (int volume){
        this.volume = volume;
    }

    @Override
    public void execute(){
        speaker.speakerOn(11);
    }

}

class offCommand implements Command{
    private Speaker speaker;

    public offCommand (Speaker speaker){
        this.speaker = speaker;
    }

    @Override
    public void execute(){
        speaker.speakerOff();
    }

}

class Button{
     private List<Command> tap = new ArrayList<>();

     public void tapButton(Command command){
        tap.add(command);
     }

     public void speakerState(){
        for(Command command :tap){
            command.execute();
        }

        tap.clear();
     }
}

public class sound {
    
    public static void main(String[] args) {
        
        Speaker speaker = new Speaker();
        
        onCommand on = new onCommand(speaker);
        offCommand off = new offCommand(speaker);

        Button b1 = new Button();
        b1.tapButton(on);
        b1.tapButton(off);
        b1.speakerState();

    }
}
