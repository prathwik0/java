/* Write a java program to implement method overriding. */

class ModOve {
    int i, j;

    ModOve(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}


class Another extends ModOve {
    int k;

    Another(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k – this overrides show() in A
    @Override
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}


public class MethodOverriding {
    public static void main(String args[]) {

        Another obj = new Another(1, 2, 3);

        // this calls show() method in Another
        obj.show();
    }
}
