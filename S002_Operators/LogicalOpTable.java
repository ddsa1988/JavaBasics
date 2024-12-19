package S002_Operators;

public class LogicalOpTable {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = q = false;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p && q) + "\t" + (p || q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\n");

        p = false;
        q = true;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p && q) + "\t" + (p || q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\n");

        p = true;
        q = false;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p && q) + "\t" + (p || q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\n");

        p = q = true;

        System.out.print(p + "\t" + q + "\t");
        System.out.print((p && q) + "\t" + (p || q) + "\t");
        System.out.print((p ^ q) + "\t" + (!p) + "\n");
    }
}
