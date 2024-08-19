

   interface phone {

    public int number = 1985446107 ;
     public void model();
     public void price(int p);
     public void releasedate();
     default public void country()
     {
        System.out.println("International Phone");
     }

}

interface GPS{

   public  void getlocation(String location);

   public void distance(String distance ,int s);
}

abstract  class cellPhone {

   public void call(long number){

      System.out.println("Calling... 0"+ number);

   }

   

      public void receiveCall (long number ){

         System.out.println("Call receive from ...0" + number);



      }

      abstract  void useTime();


   }


   class smartPhone extends cellPhone implements phone ,GPS {

    @Override
    public void model() {
        

        System.out.println("MODEL : OPPO A5 2020");
    }

    @Override
    public void price(int o) {

      System.out.println("Phone price is " + o);
      
    }

    @Override
    public void releasedate() {
       // throw new UnsupportedOperationException("Not supported yet.");

       System.out.println("It's release date is 2020 . ");
    }

    @Override
       public void getlocation(String location) {
          System.out.println("Your location is "+ location);
       }


       @Override
       public void distance(String distance,int a) {
           System.out.println("Distance of "+distance+" from your location " +a +" KM. ");
       }

       public void ownerName(String s) {

         System.out.println("Owner name is"+s);



       }

    @Override
    void useTime() {
        //throw new UnsupportedOperationException("Not supported yet.");

        System.out.println("This phone has been use from 1 year ");
    }

    public void AI(){

      System.out.println("It's Has AI feature . ");
    }
       
    



   }










public class Interface {

   public static void main(String[] args) {
      

      smartPhone s1 =new smartPhone();

      GPS obj = new smartPhone();
      

      obj.distance("Ulipur", 500);
      obj.getlocation("Bosundhora");

      s1.getlocation("Dhaka");
      s1.call(1793990460 );

      s1.model();
      s1.country();
      s1.distance("Rangpur",450);
      s1.price(20000);
      s1.receiveCall(1910460975);
      s1.ownerName(" Shohag");

      s1.AI();
      s1.country();

      cellPhone s2 =new smartPhone();

      s2.call(1999999999);
      s2.receiveCall(1985446107);

      s2.useTime();


      


   }




    
}
