public class Demo {

    public static void main(String[] args) {
       print();
    }

    private static void print() {
        System.out.println("");
        print(3);
    }

    private static void print(int i) {
        System.out.println("First employee " + i);
    }

    private static void print(String text) {

    }
}
