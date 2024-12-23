package S003_ControlStatements;

import java.io.IOException;

public class DoWhileDemo {
    public static void main(String[] args) {
        char ch = ' ';
        char ignore;

        System.out.print("Type a keyboard letter: ");

        try {
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(ch);
    }
}
