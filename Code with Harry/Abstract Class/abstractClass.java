abstract class parent{

    public void method1(){


        System.out.println("Call method 1 of parents class .");
    }

    abstract public void absttractMethod1() ;

    abstract public void absttractMethod2() ;

  




}

 class child extends parent {

    public void notAbstractMethod(){

        System.out.println("Child class but not abstract method .");
    }

    @Override

     public void absttractMethod1(){


        System.out.println("Abstract method call from child class .");




    }

    @Override

    public void absttractMethod2(){


        System.out.println("It's a abstract method call from child .");
    }



    
}

class child2 extends child {



    public void methodOfChild2(){


        System.out.println("It's a method of child2 ");
    }

    @Override



    public void absttractMethod2(){


        System.out.println("Abstract method call  from child 2 ");
    }




   





}




public class abstractClass {

    public static void main(String[] args) {
        
        parent p1 = new child();

        child c1 = new child();

        parent c2 = new child2();

        child c22 = new child2();

        child2 c222 = new child2();


       p1.method1();
        c1.method1();

        p1.absttractMethod1();
        c1.absttractMethod1();

        p1.absttractMethod2();

        c1.absttractMethod2();
        c1.notAbstractMethod();
       // p1.notAbstractMethod();
       c2.absttractMethod1();
       c2.absttractMethod2();
       c22.absttractMethod1();
       c22.absttractMethod2();
       c22.method1();
       c22.notAbstractMethod();
       c222.method1();;
       c222.absttractMethod1();
       c222.absttractMethod2();
       c222.notAbstractMethod();
       c222.methodOfChild2();


      
       


    }









}