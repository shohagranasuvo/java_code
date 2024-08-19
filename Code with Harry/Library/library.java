






public class library {

    private String [] book = new String[100];

    private int numberofBook;

    public library()
    {
        

        this.numberofBook=0;
    }

    public void addBook(String b)
    {
        for (int i = 0 ;i <this.book.length; i++)  
            {
                if (this.book[i] == null){

            this.book[i]=b;
            this.numberofBook++;
            System.out.println("Book adding is successfull .");
            break;

            }

        }
    }

    public void issueBook(String issue){

        int j=0;



        for(int i=0 ; i<this.book.length ; i++ )
        { 

            if (issue.equals(this.book[i]))
            {

                this.book[i]=null;

                System.out.println( issue +" book has been issued .");
                this.numberofBook--;
                j=1;
                break ;  
            }

        }
        if(j!=1)
        {
            System.out.println("Does Not Find the Book "+ issue );
        }
    }


        public void returnBook (String add )
        {

            for (int i = 0 ;i <book.length; i++)  
            {
                if (this.book[i] == null){

            this.book[i]=add;
            this.numberofBook++;
            System.out.println("Return book is successfull . ");
            break;

            }

        }}


        public void showBooks()
        {

            int k=1;

            System.out.println("Number of Total Book "+ this.numberofBook);

            if (this.numberofBook != 0){

            for (int i = 0 ; i< this.book.length ; i++ )
            {
                if (this.book[i]!= null)
                {
                    
                

                System.out.println(k + ". "+ this.book[i]);
                k++;
                }


                


            }}



        }




    public static void main(String[] args) {

        library obj = new library();

        obj.addBook("C++");
        obj.addBook("Physics 1");
        obj.addBook("Java");
        obj.addBook("Python");


        obj.showBooks();

        obj.issueBook("C++");

        obj.issueBook("C+++");

        obj.showBooks();
        obj.returnBook("C++");

        obj.showBooks();



        



    }


        
   





    
}
