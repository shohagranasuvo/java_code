
import java.lang.*;
public class Human  {
        
    private String name ;
    private String gender;
    private float height ;
    private int age ;
    private float weight ;

    public void setName(String name)
    {

        this.name =name ;

    }

    public void setGender(String gender)
    {

        this.gender =gender ;

    }

    public void setHeight(float height)
    {
        this.height=height;

    }

    public void setWeight(float weight)
    {
        this.weight =weight ;
    }
    
    public void setAge(int age)
    {
        this.age = age ;
    }


    public String getName ()
    {

        return this.name;

    }

    public String getgender()
    {

        return this.gender;
    }


    public int getAge()
    {


        return this.age;


    }

    public float getHeight()
    {

        return this.height;
    }

    public float getWeight()
    {
        return this.weight;

    }

    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Gender: "+gender);
        System.out.println("Weight: "+weight);

    }



    public static void main(String[] args) {
        
        Human h1 =new Human();

        h1.setName("Shohag ");
        h1.setAge((21));
        h1.setGender("Male");
        h1.setHeight(1.70f);
        h1.setWeight(53);
        System.out.println(h1.getName() + " Rana");

        h1.display();

    }





    }


    

