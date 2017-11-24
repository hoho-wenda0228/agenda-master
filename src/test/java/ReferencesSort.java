import java.util.*;

public class ReferencesSort {
    private static void print(String msg, Object[] a) {
        System.out.print(msg);
        System.out.print(msg);
        for (int i = 0; i < a.length; i++) {
            System.out.print("[" + (i + 1) + "]" + a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] data = {new Integer(85), new Integer(77), new Integer(92), new Integer(86), new Integer(88)};
        print("Before sorting = ", data);
        Arrays.sort(data);
        print("After sorting = ", data);
        int pos1 = Arrays.binarySearch(data, new Integer(88));
        System.out.println("position is " + pos1);
        Arrays.sort(data, Collections.reverseOrder());
        print("After reverse sorting = ", data);
        int pos2 = Arrays.binarySearch(data, new Integer(88), Collections.reverseOrder());
        System.out.println("position is " + pos2);
    }
}