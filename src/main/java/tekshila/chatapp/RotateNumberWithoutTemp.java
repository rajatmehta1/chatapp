package tekshila.chatapp;

public class RotateNumberWithoutTemp {

    public static void main(String[] args) {
        int a = 7;
        int b = 5;

        //swap numbers
        a = a + b;
        b = a - b; // i.e -> (a + b) - b
        a = a - b; // i.e b is now a so (a + b) - a

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

}
