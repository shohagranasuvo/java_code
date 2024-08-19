import java.lang.*;
import java.util.Scanner;



public class Start {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int [] arrInt=new int[2];

        for (int i =0 ; i<arrInt.length ; i++)
        {
            System.out.println((i+1)+" number element of the integer array:");

            arrInt[i]=sc.nextInt();


        }

        for (int element : arrInt)
          {

            System.out.println(element);
        }

        float []arrFloat =new float[] {12.f,33.4f,444.333f};

        int j=0;
        for(float element : arrFloat)
        { 

            System.out.print((j+1)+" number element of the float array:");
            System.out.println(element + "\n");

            j++;


        }
        j=0;

        double [] arrDouble=new double[2];

        for (int i =0 ; i<arrDouble.length ; i++)
        {
            System.out.println((i+1)+" number element of the double array:");

            arrDouble[i]=sc.nextDouble();


        }

        

        for(double element : arrDouble)
        { 

            System.out.println((j+1)+" number element of the double array:");
            System.out.println(element);

            j++;


        }
        j=0;

        boolean arrbool [] ;

        arrbool =new boolean[]{true,false,true};

        for (boolean element : arrbool)
        { 

            System.out.println((j+1)+" number element of the boolean array:");
            System.out.println(element);

            j++;


        }
        j=0;

        String arrString [] ;

        arrString =new String[]{"Shohag ","Rana ","Shuvo "};

        System.out.print("it's a string type array :");



        for (String element : arrString)
        { 

            
            System.out.print(element);

        


        }


        char arrChar [] ;

        arrChar =new char[]{'S','h','u','v','o'};

        System.out.print("\nIt's a Character type array :");



        for (char element : arrChar)
        { 

            
            System.out.print(element);

        


        }


        


      



        

        
    }

    
}
