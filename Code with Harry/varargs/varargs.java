

public class varargs {


    public static double multiply (double ...arr )
    {

        double result = 1 ;
        for (double element : arr)
        {

            result*=element;


        }

        if(arr.length == )

        return result;


    }

    public static void main(String[] args) {
        
        System.out.println("All number multiply is = "+ multiply(334.4 ,44,78873,444));

        System.out.println("All number multiply is = "+ multiply(334.4 ,44,78873,444,64783,3443));

        System.out.println("All number multiply is = "+ multiply());


    }
    
}
