import java.lang.*;

import java.util.*;

public class Start {

    public static void main(String[] args) {

        Mobile m1 =new Mobile("Ratul","+8801879711424",20.5 , "Android",false);

        m1.showDetails();
        m1.recharge(50);
        System.out.println("After call total Charge :" + m1.adjustAfterCall(15f, 1f)+" tk.\nNew balance "+m1.getMobileBalance()+" tk.\n\n");


        Mobile m2 =new Mobile("Shohag","+8801985446107",200 , "Android",false);

        m2.showDetails();
        m2.recharge(40);
        System.out.println("After call total Charge :" + m2.adjustAfterCall(15f, 0.35f)+" tk.\nNew balance "+m2.getMobileBalance()+" tk.\n\n");



        Mobile m3 =new Mobile("tamim","+8801857964218",500 , "Android",true);

        m3.showDetails();
        m3.recharge(120);
        m3.adjustAfterCall(150f, 1.35f);


        System.out.println("Tamim phone Now Unlock\n\n");

        m3.setLock(false);
        m3.showDetails();




        Mobile m4 =new Mobile("Payel","+8801883488876",244 , "Android",false);

        m4.showDetails();
        m4.recharge(400);
        System.out.println("After call total Charge :" + m4.adjustAfterCall(34f, 1.2f)+" tk.\nNew balance "+m2.getMobileBalance()+" tk.\n\n");

        m4.setLock(true);


        System.out.println("After Locking payel phone \n\n");

        m4.showDetails();
        m4.recharge(488);

        Scanner sc=new Scanner(System.in);

        Mobile m5 = new Mobile();

        System.out.print("Enter Mobile Owner name :");

        m5.setMobileOwnerName(sc.nextLine());

        System.out.print("Enter Mobile  Number :");

        m5.setMobileNumber(sc.nextLine());

        System.out.print("Enter Mobile  Balance :");

        

        m5.setMobileBalance(sc.nextDouble());

        System.out.print("Enter Mobile  OS Name :");

        sc.nextLine();

        m5.setMobileOSName(sc.nextLine());


      

        System.out.print("Enter Mobile  Lock(true/false) :");

        

        m5.setLock(sc.nextBoolean());

        m5.showDetails();



    }
    
}
