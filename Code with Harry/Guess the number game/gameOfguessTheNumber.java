import java.util.*;

public class gameOfguessTheNumber {

    private int ran;
    private int userinput;
    static int count=0 ;

    public gameOfguessTheNumber ()
    {
        Random rn =new Random();

        this.ran =rn.nextInt(100)+1;



    }

    public void setUserInput(int a)
    {
        

        this.userinput =a;
    }

    public int getUserInput()
    {
        return this.userinput;
    }

    public boolean isCorrectNumber()
    {

        if (this.ran==getUserInput()){

            System.out.println("Your guess number is correct ");




            return true ;
        }

        else {

            if (this.ran>this.userinput){

                System.out.println("Your guess number is small \nGuess the number Again");

                
            }

            else 
            {
                System.out.println("Your guess number is large \nGuess the number Again");

            }

            return false;

           
        }

    }


    public static void main(String[] args) {


        System.out.print("Enter a number from 1 to 100 ");



        gameOfguessTheNumber Game = new gameOfguessTheNumber();

        Scanner sc =new Scanner(System.in);

        boolean check=false ;



       

        while (!check){

            System.out.print("Enter the number = ");

            int userin =sc.nextInt();

            

            Game.setUserInput(userin);

             check=Game.isCorrectNumber();

             count ++;
            
        }


        if (count==1)
        {

            System.out.println("You are the BEST , BEST ,BEST !!!");

            System.out.println("Your total try "+count);



        }

        else if  (count>1 && count <=10)
        {

            System.out.println("You are very Good in guessing number !!!");

            System.out.println("Your total try "+count);

        }

        else {

            System.out.println("Your guess power is too low .");

            System.out.println("Your total try "+count);


            
        }


    }



    
    
}
