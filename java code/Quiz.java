public class Quiz {
    private static int x = 10;
    private int y;

    public Quiz() {
        System.out.println("Don't worry!");
    }

    public Quiz(int y) {
        this.y = y;
        y++;
        System.out.println("Programming is fun");
    }

    public void setX(int x) {
        Quiz.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + " y = " + y);
    }

    public static void main(String[] args) {
        Quiz obj = new Quiz();
        Quiz obj1 = new Quiz(7);

        String s1 = "Don't lose hope!";
        String s2 = new String("Keep");
        String s3 = new String("practicing ");
        String s4 = "Stay";
        String s5 = new String("Stay focused");

        System.out.println(s5.isEmpty());
        System.out.println(s2.concat(" " + s3));
        System.out.println(s4);
        System.out.println(s1.substring(0, 5) + s3);

        if (s2 == s4) {
            obj1.setX(--Quiz.x);
            obj1.display();
        } else {
            obj1.setX(++Quiz.x);
            obj1.display();
        }

        if (s2.equals(s5)) {
            obj1.setX(--Quiz.x);
            obj1.display();
        } else {
            obj1.setX(++Quiz.x);
            obj1.display();
        }

        s5 = s1.substring(6, 16);
        System.out.println(s5);
        System.out.println((int) s3.charAt(0));

        

        if (s1.compareTo(s4) < 0) {
            obj1.setY(--obj.y);
            System.out.println("smaller");
        } else {
            obj1.setY(obj.y--);
            System.out.println("greater or equal");
        }

        obj1.display();
        obj.display();
    }
}
