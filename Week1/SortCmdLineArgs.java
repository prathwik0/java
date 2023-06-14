/* Read array of numbers through command line and sort in ascending order. */

public class SortCmdLineArgs {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        System.out.println("array before sorting: ");
        for (int i = 0; i < args.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        for (int i = 0; i < args.length; i++) {
            for (int k = i + 1; k < args.length; k++) {
                if (a[i] > a[k]) {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }

        System.out.println("array after sorting: ");
        for (int i = 0; i < args.length; i++)
            System.out.print(a[i] + " ");
    }
}
