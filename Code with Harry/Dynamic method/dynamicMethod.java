class a {

    public void on(){

        System.out.println("Method of parent ");
    }

    public void off(){

        System.out.println("Override method of parent ");
    }
}

class b extends a {

    @Override
    
    public void off() {

        System.out.println("override method of child ");
        
    }

    public void good(){

        System.out.println("Method of child ");
    }





}

public class dynamicMethod {

    public static void main(String[] args) {

        a objOfB =new b(); // it's dynamic 

        objOfB.on();
        objOfB.off();
       // objOfB.good(); //not allowed

       // b objofA = new a();
       b objofBB = new b();

       objofBB.on();
       objofBB.off();
       objofBB.good();


       

       


        
    }
    
}
