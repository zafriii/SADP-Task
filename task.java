//SADP Task 2

class Person
{
    public String name;
    int age;
    protected String email;
    

    public void displayinfo()
    {
        System.out.println("Name =" +name);
        System.out.println("Age =" +age);
    }
}

class Teacher extends Person
{
    private String password;

    public void displayinfo()
    {
        System.out.println("Name =" +name);
        System.out.println("Age =" +age);
        System.out.println("Email =" +email);
        
    }

    public String getPassword()
    {
        return this.password;
    }

    public void setPassword(String pass)
    {
        this.password = pass;
    }

}

public class task {
public static void main(String[] args) {

    Teacher t1 = new Teacher();
    t1.name = "Niha";
    t1.age = 23;
    t1.email  = "nihazafar@gmail.com";
    t1.setPassword("678ar");
    System.out.println("Password="+t1.getPassword());

    t1.displayinfo();

}   

}
