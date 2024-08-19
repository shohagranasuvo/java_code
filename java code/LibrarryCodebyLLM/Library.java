public class Library {
    private String[] books;
    private int numberOfBooks;

    public Library() {
        this.books = new String[100];
        this.numberOfBooks = 0;
    }

    public void addBook(String book) {
        if (this.numberOfBooks < this.books.length) {
            this.books[this.numberOfBooks] = book;
            this.numberOfBooks++;
        } else {
            System.out.println("Library is full.");
        }
    }

    public void issueBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                this.books[i] = null;
                System.out.println("Book " + book + " has been issued.");
                this.numberOfBooks--;
                break;
            }
        }
    }

    public void returnBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                System.out.println("Book " + book + " has been returned.");
                this.numberOfBooks++;
                break;
            }
        }
    }

    public void showBooks()
    {

        int k=1;

        System.out.println("Number of Total Book "+ this.numberOfBooks);

        if (this.numberOfBooks != 0){

        for (int i = 0 ; i< this.books.length ; i++ )
        {
            if (this.books[i]!= null)
            {
                
            

            System.out.println(k + ". "+ this.books[i]);
            k++;
            }


            


        }}



    }




    public static void main(String[] args) {
        Library obj = new Library();

        
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