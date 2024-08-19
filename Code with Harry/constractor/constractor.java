class base{

    int x;

    public base()
    {

        System.out.println("Base class empty constractor");
    }

    public base( int a)
    {

        System.out.println("Base class perametarized constractor");
    }


}

class derived extends base {
    int y ;
    public derived ()
    {

        System.out.println(" Derived class empty constractor");
    }

    public derived(int a , int b)
    {
        //super(a);


        System.out.println("Derived class perametarized constractor");
    }

}




public class constractor {

    public static void main(String[] args) {
        derived d1 = new derived(2,2);
    }
    
}
