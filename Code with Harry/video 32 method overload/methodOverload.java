

public class methodOverload {

    static void joke (){


        System.out.println("It's time for you buddy !!! no perameter ");


    }


    static void joke (double a){


        System.out.println("It's time for you buddy !!! double "+ a );


    }

    

    

    

    

   /*  static void joke (float a ){


        System.out.println("It's time for you buddy !!! float   "+a);


    }

    static void joke (long a ){


        System.out.println("It's time for you buddy !!!  long  "+a);


    }
    static void joke (double a , int c ){


        System.out.println("It's time for you buddy !!!  double + int "+a);


    }

    static void joke (short  a ){


        System.out.println("It's time for you buddy !!! short  "+a);


    } */

    public static void main(String[] args) {

        joke();
        joke(5777778567546.77); //it's will run
        //joke(5777778567546); //it does not run


       
        
    }
    
}
