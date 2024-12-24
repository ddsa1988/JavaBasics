package S003_ControlStatements;

import java.io.IOException;

public class ReadKeyboard {
    public static void main(String[] args) {
        final char ANSWER = '.';
        final char SPACE = ' ';

        char ch = ' ';
        char ignore = ' ';
        int countSpaces = 0;

        do {
            System.out.print("Type a keyboard letter: ");
            countSpaces = 0;

            try {
                ch = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();

                    if (ignore == SPACE) {
                        countSpaces++;
                    }
                } while (ignore != '\n');

            } catch (IOException e) {
                System.out.println("Invalid input! Try again!");
            }

        } while (ch != ANSWER);

        System.out.println("You've typed the right answer!");
        System.out.printf("You've typed %d spaces.\n", countSpaces);
    }
}
