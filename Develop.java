//Composite Pattern

import java.util.ArrayList;
import java.util.List;

interface Developerdetails{
    void displayDetails();
}

class WebDeveloper implements Developerdetails{

    private String name;
    private int age;

    public WebDeveloper(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void displayDetails(){
        System.out.println("Name :" +name +" " +" & age :"+age);
    }
}


class ShowDeveloper implements Developerdetails{

    private String name;
    private List <Developerdetails> show;

    public ShowDeveloper(String name){
        this.name = name;
        show = new ArrayList<>();
    }

    public void addDetails(Developerdetails details){
                show.add(details);
    }

     public void removeDetails(Developerdetails details){
                show.remove(details);
    }

    @Override
    public void displayDetails(){
        System.out.println("Developers :" +name );
        System.out.println("Show Details :");

        for(Developerdetails details: show){
            details.displayDetails();
        }
    }
}


public class devlop {
    public static void main(String[] args) {
        
        WebDeveloper w1 = new WebDeveloper("Alex", 22);
        WebDeveloper w2 = new WebDeveloper("Jack", 24);

        ShowDeveloper s1 = new ShowDeveloper("Details");
        s1.addDetails(w1);
        s1.addDetails(w2);

        ShowDeveloper main  = new  ShowDeveloper("Web");
        main.addDetails(s1);
        main.addDetails(s1);

        main.displayDetails();




    }
    
}
