package S003_ControlStatements;

public class ForLoopDemo {
    public static void main(String[] args) {
        BasicForLoop1();
        System.out.println();

        BasicForLoop2();
    }

    public static void BasicForLoop1() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void BasicForLoop2() {
        int i, j;

        for (i = 0, j = 10; i < j; i++, j--) {
            System.out.printf("i and j = %d %d", i, j);
            System.out.println();
        }
    }
}
