public class Main {
    public static void main(String[] args) {
        // Create the first SmartPhone object
        SmartPhone phone1 = new SmartPhone("Samsung", "Galaxy S21", 4000, 64, 8, 128, "Android 11");
        
        // Create the second SmartPhone object
        SmartPhone phone2 = new SmartPhone("Apple", "iPhone 13", 3500, 12, 6, 256, "iOS 15");

        // Display the details of the first SmartPhone
        System.out.println("Details of Phone 1:");
        phone1.showDetails();

        // Display the details of the second SmartPhone
        System.out.println("\nDetails of Phone 2:");
        phone2.showDetails();
    }
}
