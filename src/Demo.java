public class Demo {

    public static void main(String[] args) {
       print();
    }

    private static void print() {
        System.out.println("First employee changes");
    }

    private static void print(int i) {
        System.out.println("First employee " + i);
    }

    private static void print(String text) {
        System.out.println("Second employee " + text);
    }
}
