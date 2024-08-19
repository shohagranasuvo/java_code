import java.lang.*;


public class Mobile{


   


        private String mobileOwnerName ;

        private String mobileNumber;
        private  double mobileBalance ;
        private String mobileOSName;
        private boolean lock ;

        public void setMobileOwnerName (String mobileOwnerName)
        {
            this.mobileOwnerName=mobileOwnerName;

            
        }

        public void setMobileNumber(String mobileNumber){
            this.mobileNumber=mobileNumber;
        }

        public void setMobileOSName(String mobileOSName)
        {
            this.mobileOSName=mobileOSName;

        }

        public void setMobileBalance(double mobileBalance)
        {
            this.mobileBalance=mobileBalance;


        }

        public void setLock(boolean lock)
        {
            this.lock=lock;


        }

        public String getMobileOwnerName()
        {
            return  this.mobileOwnerName;
        }

        public String getMobileNumber ()
        {
            return this.mobileNumber;
        }

        public double getMobileBalance()
        {
            return this.mobileBalance;
        }

        public String getMobileOSName()
        {

            return this.mobileOSName;
    
        } 

        public boolean getLock()
        {

            return this.lock;


        }


        

        


        public Mobile (){};

        public Mobile (String mobileOwnerName ,String mobileNumber,double mobileBalance , String mobileOSName ,boolean lock ){

            this.mobileOwnerName=mobileOwnerName;
            this.mobileNumber=mobileNumber;
            this.mobileBalance=mobileBalance;
            this.mobileOSName=mobileOSName;
            this.lock=lock;    

        }

        public void showDetails() {

            if(lock == false)
            {


            System.out.println("Mobile Owner Name :"+mobileOwnerName+"\nNumber :"+mobileNumber+"\nBalance :"+mobileBalance+"\nOS Name :"+mobileOSName+"\nLOCK :"+lock);
        }

        else {
            System.out.println("Phone need to unlock to Show Details ");
        }}



    

        public void recharge(int amount)
        {

            if(lock == false)
            {

            

            this.mobileBalance+=amount;

            System.out.println("After Recharge Balance = "+mobileBalance);


            }

            else {
                System.out.println("Phone need to unlock to recharge ");
            }
        }

        public float adjustAfterCall (float timeDuration, float costPerMinute) {

            if(lock == false){

            float totalCost=timeDuration*costPerMinute ;

            this.mobileBalance-=totalCost ;

            return totalCost;
        }

        else {
            System.out.println("Phone need to unlock for call ");

            return 0;
        }
    
    }

    








        
    }
