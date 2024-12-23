package S003_ControlStatements;

public class GoToWithLabel {
    public static void main(String[] args) {
        outerFor: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                if (i == 2)
                    break outerFor;

                System.out.printf("i = %s, j = %s\n", i, j);
            }
        }
    }
}
