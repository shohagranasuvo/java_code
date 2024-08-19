

public class Fibonacci {

     static long n ;


     



    public static void fib(long a ){

        long result=0 ;

       n=a-1;

       System.out.print("0, ");
       System.out.print("1, ");


       sum(0,1);


    

       

        
    }




        


    public static void sum ( long x , long y)
    {

        long result1 ;

       
        result1 = x + y ;

        long pre =y;

        n--;

       

        if(n!=0)
        {


            System.out.print(result1 + " , ");  

        sum(pre ,result1);


        }

        





        
        




    }

    

    





  

    public static void main(String[] args) {
         
        long n =50 ;
        

      System.out.print("Fibonacci series of " +n + " number is = ");

      fib(n);



     






    }
    

}