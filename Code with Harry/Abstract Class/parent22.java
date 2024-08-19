public abstract class parent22{

    public void method1(){


        System.out.println("Call method 1 of parents class .");
    }

    abstract public void absttractMethod1() ;

    abstract public void absttractMethod2() ;




}

 class child22 extends parent {

    public void notAbstractMethod(){

        System.out.println("Child class but not abstract method .");
    }}

   




    

  

    






   










public class test {

    public static void main(String[] args) {
        
        parent22 p1 = new child();

        child c1 = new child();

        
      
       


    }









} 
