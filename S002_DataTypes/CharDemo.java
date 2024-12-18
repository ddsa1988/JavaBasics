package S002_DataTypes;

public class CharDemo {
    public static void main(String[] args) {
        char myChar = 'A';

        System.out.print(myChar);
        System.out.print(' ');
        System.out.println((int) myChar);

        for (int i = 0; i < 5; i++) {
            System.out.print(++myChar);
            System.out.print(' ');
            System.out.println((int) myChar);
        }
    }
}
